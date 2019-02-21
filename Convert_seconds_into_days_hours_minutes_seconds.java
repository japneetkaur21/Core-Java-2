import java.util.Scanner;

public class Convert_seconds_into_days_hours_minutes_seconds{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    long seconds;
        System.out.print("Enter the number of seconds : ");
        seconds = input.nextInt();
    long sec = seconds % 60;
        long minutes = seconds % 3600 / 60;
        long hours = seconds % 86400 / 3600;
        long days = seconds / 86400;

        System.out.println("The time converted to days, hours, minutes and seconds is: ");
        System.out.println("Day " + days + ", Hour " + hours + ", Minute " + minutes + ",46759 Seconds " + sec);

    }
}
