import java.util.Scanner;
interface Furniture {
    String stressTest();

    String fireTest();
}

    abstract class Chair implements Furniture {
        abstract String chairType();

    }

    abstract class Table implements Furniture {
        abstract String tableType();
    }

    class MetalChair extends Chair {
        @Override
        public String stressTest() {
            return "Passed Stress Test";
        }

        @Override
        public String fireTest() {
            return "Passed fire test";
        }

        @Override
        public String chairType() {
            String s = "This is a Metal Chair";
            return s;
        }
    }

    class MetalTable extends Table {
        @Override
        public String stressTest() {

            return "Passed Stress Test";
        }

        @Override
        public String fireTest() {
            return "Passed Fire Test";
        }

        @Override
        public String tableType() {
            String s = "This is a metal Table";
            return s;
        }
    }


    class WoodenTable extends Table {
        @Override
        public String stressTest() {
            return "Failed Stress Test";
        }

        @Override
        public String fireTest() {
            return "Failed Fire Test";
        }

        @Override
        public String tableType() {
            String s = "This is a wooden Table";
            return s;
        }
    }


    class WoodenChair extends Chair {
        @Override
        public String stressTest() {
            return "Failed stress test";
        }

        @Override
        public String fireTest() {
            return "Failed fire test";
        }

        @Override
        public String chairType() {
            String s = "This is a wodden chair.";
            return s;
        }
    }
    public abstract class Design_classes_having_attributes_for_furniture {
    public static void main(String[] args) {
        Table table=null;
        Chair chair=null;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the the material of furniture Wooden or Metal:");
        String str = input.next();
        if (str.equals("wooden")) {
            table = new WoodenTable();
        } else if (str.equals("metal")) {
            table = new MetalTable();
        } else {
            System.out.println("Wrong input. Try again.");
        }
        if (str.equals("wooden")) {
            chair = new WoodenChair();
        } else if (str.equals("metal")) {
            chair = new MetalChair();
        } else {
            System.out.println("Wrong input. Try again.");
        }

        System.out.println(table.tableType());
        System.out.println(table.stressTest());
        System.out.println(table.fireTest());
        System.out.println(chair.chairType());
        System.out.println(chair.stressTest());
        System.out.println(chair.fireTest());

    }

}
