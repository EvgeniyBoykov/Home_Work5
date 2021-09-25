package HomWork_5;

import java.util.Arrays;

public class main {
        public static void main(String[] args) {
            AppData appData = new AppData();
            appData.load("HomWork5.txt");
            System.out.println(Arrays.toString(appData.getHeader()));
            System.out.println(Arrays.deepToString(appData.getData()));
            appData.save("HomWork5-1.txt");
        }
    }
