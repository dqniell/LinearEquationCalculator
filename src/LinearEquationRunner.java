import javax.sound.sampled.Line;
import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //x and y of first coord
        System.out.print("Enter a coordinate please: ");
        String coordinateOne = scan.nextLine();

        int comma = coordinateOne.indexOf(",");
        String xSubstring = coordinateOne.substring(0, comma);
        String xOneString = xSubstring.substring(1, comma);
        int xOne = Integer.parseInt(xOneString);

        String ySubstring = coordinateOne.substring(comma + 1);
        String yOneString = ySubstring.substring(1, ySubstring.length() - 1);
        int yOne = Integer.parseInt(yOneString);

        //x and y of second coord
        System.out.print("Enter a second coordinate please: ");
        String coordinateTwo = scan.nextLine();

        int comma2 = coordinateTwo.indexOf(",");
        String xSubstring2 = coordinateTwo.substring(0, comma2);
        String xOneString2 = xSubstring2.substring(1, comma2);
        int xTwo = Integer.parseInt(xOneString2);

        String ySubstring2 = coordinateTwo.substring(comma2 + 1);
        String yOneString2 = ySubstring2.substring(1, ySubstring2.length() - 1);
        int yTwo = Integer.parseInt(yOneString2);

        LinearEquation oneOne = new LinearEquation(xOne, yOne, xTwo, yTwo);
        System.out.println(oneOne.distance());
        System.out.println(oneOne.yIntercept());
        System.out.println(oneOne.equation());
        System.out.print(oneOne.coordinateForX(1));


    }
}
