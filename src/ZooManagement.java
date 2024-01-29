import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args){
        int nbrCage=20;
        String zooName="my Zoo";
        Scanner sc= new Scanner(System.in);
        System.out.println("give me zoo name");
        zooName=sc.nextLine();
        System.out.println("give me number cages");
        nbrCage =sc.nextInt();


        System.out.println(zooName+ " comporte " +nbrCage+ " cages");

    }
}
