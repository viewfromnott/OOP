import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] member = {"Silver", "Gold", "Platinum","NoType"};
        System.out.print("What ur name? : ");
        String name = scanner.nextLine();

        System.out.println("Select type:");
        for (int i = 0; i < member.length; i++) {
            System.out.println((i) + ": " + member[i]);
        }
        
        
        System.out.print("number of your type: ");
        int choice = scanner.nextInt();
       System.out.println("how much ur price");
        int price = scanner.nextInt();
        scanner.close();

        switch (choice) {
            case 3:  
            MemberCard noCard = new MemberCard(name, price);
            System.out.println("NoType info");
            noCard.display();
                break;
            case 2:
            MemberCard platinuCard = new Platinum(name, price);
            System.out.println("Platinum info");
            platinuCard.display();
                break;
        
            case 1 :
            MemberCard gCard = new GoldCrad(name, price);
            System.out.println("Gold info");
            gCard.display();
          
                break;
            case 0 : 
            MemberCard sCard = new SilverCard(name, price);
            System.out.println("Silver info");
            sCard.display();
            
            break;

        }
    }
}


