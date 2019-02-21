public class Object_cloning_using_cloneable_and_copyConstructor implements Cloneable {

    //USING CLONEABLE METHOD

    int rollno;
        String name;

        Object_cloning_using_cloneable_and_copyConstructor(int rollno, String name){
            this.rollno=rollno;
            this.name=name;
        }

        public Object clone()throws CloneNotSupportedException{
            return super.clone();
        }

        public static void main(String args[]){
            try{
                Object_cloning_using_cloneable_and_copyConstructor s1=new Object_cloning_using_cloneable_and_copyConstructor(110,"Japneet");

                Object_cloning_using_cloneable_and_copyConstructor s2=(Object_cloning_using_cloneable_and_copyConstructor) s1.clone();

                System.out.println(s1.rollno+" "+s1.name);
                System.out.println(s2.rollno+" "+s2.name);

            }catch(CloneNotSupportedException c){}

        }

        //USING COPY CONSTRUCTOR
    
public Object_cloning_using_cloneable_and_copyConstructor(Object_cloning_using_cloneable_and_copyConstructor Object){
            this.rollno=Object.rollno;
            this.name=Object.name;
}
}
