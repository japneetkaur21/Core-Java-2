import java.util.Arrays;
public class Sorting_string_without_using_string_methods {
    public static void main(String[] args) {
        System.out.println("The string sorted in Alphabetical order is:");
        String original = "thisisastring";
        int j=0;
        char temp=0;

        char[] chars = original.toCharArray();

        for (int i = 0; i <chars.length; i++) {

            for ( j = 0; j < chars.length; j++) {

                if(chars[j]>chars[i]){
                    temp=chars[i];
                    chars[i]=chars[j];
                    chars[j]=temp;
                }

            }
        }
        System.out.print(chars);
    }
}
