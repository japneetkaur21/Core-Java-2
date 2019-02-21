public class SingletonClass {
    private static SingletonClass myObj;

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        if (myObj == null) {
            myObj = new SingletonClass();
        }
            return myObj;
        }
        public void getSomeThing () {
            System.out.println("This is a singleton class");
        }

    public static void main(String[] args) {

        SingletonClass st = SingletonClass.getInstance();
        st.getSomeThing();
    }

}


