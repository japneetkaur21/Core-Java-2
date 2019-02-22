import java.util.Scanner;
interface Furniture {
        public void stressTest();
        public void fireTest();
    }

    abstract class Chair implements Furniture {
        public abstract String chairType();

    }
    abstract class Table implements Furniture {
        public abstract String tableType();
    }

    class MetalChair extends Chair {
        @Override
        public void stressTest() {
            System.out.println("Passed Stress Test");
        }

        @Override
        public void fireTest() {
            System.out.println("Passed fire test");
        }
        @Override
        public String chairType(){
            String s="This is a Metal Chair";
            return s;
        }
    }

    class MetalTable extends Table {
        @Override
        public void stressTest() {

            System.out.println("Passed Stress Test");
        }

        @Override
        public void fireTest() {
            System.out.println("Passed Fire Test");
        }

        @Override
        public String tableType() {
            String s = "This is a metal Table";
            return s;
        }
    }


    class WoodenTable extends Table {
        @Override
        public void stressTest() {
            System.out.println("Failed Stress Test");
        }

        @Override
        public void fireTest() {
            System.out.println("Failed Fire Test");
        }

        @Override
        public String tableType() {
            String s = "This is a wooden Table";
            return s;
        }
    }


    class WoodenChair extends Chair {
        @Override
        public void stressTest() {
            System.out.println("Failed stress test");
        }

        @Override
        public void fireTest() {
            System.out.println("Failed fire test");
        }
        @Override
        public String chairType(){
            String s="This is a wodden chair.";
            return s;
        }
    }
public abstract class Design_classes_having_attributes_for_furniture {
        public static void main(String[] args){
            ;
            Scanner input =  new Scanner(System.in);
            String str = input.next();
           Table table=null;
           Chair chair=null;
            if(str.equals("wooden")){
                table=new WoodenTable();
            }   else if (str.equals("metal")){
                table=new MetalTable();
            }
            if(str.equals("wooden")){
                chair=new WoodenChair();
            }   else if (str.equals("metal")){
                chair=new MetalChair();
            }

            System.out.println(table.tableType());
            table.stressTest();
            table.fireTest();
            System.out.println(chair.chairType());
            chair.stressTest();
            chair.fireTest();

        }
}
