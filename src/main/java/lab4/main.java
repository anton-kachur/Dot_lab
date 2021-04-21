package lab4;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

class main {
    ControllerOfPatterns m;
    main(int choice) {
        m = new ControllerOfPatterns(choice);
    }

    public static void main(String []args) {
        List<main> mains = new ArrayList<>();

        for (int i=1; i<6; i++)
            mains.add(new main(i));
    }
}
