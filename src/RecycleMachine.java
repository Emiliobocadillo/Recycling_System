import java.util.ArrayList;
import java.util.Scanner;

public class RecycleMachine {

    public ArrayList<Pant> Pant = new ArrayList();
    public double total;
    public boolean hasPower;

    public void MenuLoop (){

        hasPower = true;
        while(hasPower){
            System.out.println("Insert bottle, by typing etiher A, B or C:");
            if (total != 0){
                System.out.println("press 1 to print receipt");
            }
            Scanner userInput = new Scanner(System.in);
            String checkingBottle = userInput.nextLine();
            System.out.println(checkingBottle);

        }
    }
}
