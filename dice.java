package newpackage;
import java.util.Random;
import java.util.Scanner;
public class dice {

    int Size;
    String[] selection={"One","Two","Three","Four","Five","Six"};
	private static Scanner in;
    public dice(int Size){
        this.Size=Size;
    }
    public String rollDice(){
        return selection[new Random().nextInt(Size)];      
    }
    public static void main(String[] args) {
        System.out.print("Enter Size of Dice 2,4 and 6 :");
        in = new Scanner(System.in);
        int size=in.nextInt();
        System.out.println();
        if(size==2 || size==4 || size==6 ){
            dice d=new dice(size);
            System.out.println(d.rollDice());
        }
        else{
            System.out.println("Invalid Input"); 
        }  
    } 
}