import java.util.Scanner;

public class Read_words_from_keyboard_until_word_done_is_entered_using_while_loop {
    public static void main(String args[]) {
        Scanner d=new Scanner(System.in);
        int test=1;
        while(test!=0){
            System.out.println("Enter the String");
            String str=d.nextLine();
            if(str.equals("done")){
                test--;
                System.out.println("Word DONE is found!");
            }else{
                char ch[]=new char[str.length()];
            for(int i=0; i<str.length();i++){
                ch[i]=str.charAt(i);
            }
            for(int j=0; j<str.length();j++){
                if(ch[0]==ch[str.length()-1]){
                    System.out.println("Yes, first and last character are same.");
                    break;
                }else{
                    System.out.println("No, first and last character are not same.");
                    break;
                }
            }
                System.out.println("Enter the string again.");
            }

        }
    }
}
