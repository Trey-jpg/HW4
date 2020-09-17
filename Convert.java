import java.util.Scanner;
public class Convert
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter in binary number");
        String numberAsAString = input.nextLine();
        int numberAsAnInt = Integer.parseInt(numberAsAString,2);
        System.out.println(Convert.decimalToHex(numberAsAnInt));
    }

    public static String decimalToHex(int numberAsAnInt)
    {
        String answer = "";
        String map = "0123456789ABCDEF";
        while(numberAsAnInt != 0)
        {
            int temp = (numberAsAnInt % 16);
            answer = map.charAt(temp) + answer;
            numberAsAnInt = numberAsAnInt / 16;
        }
        return answer;
    }
}