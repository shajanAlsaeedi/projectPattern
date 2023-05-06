package palntworldstage2;



import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class main {

    public static void printBanner() {
        System.out.println(" ----------------------------------------------------------------");
        System.out.println(" ----------------------------------------------------------------");
        System.out.println("\n\t      ❃ ❃  W E L C O M E TO PLANT WORLD  ❃ ❃ \t\n");
        System.out.println(" ----------------------------------------------------------------");
        System.out.println(" ----------------------------------------------------------------");
    }

    public static void getCustomerInfo(account user) {
        Scanner keyboard = new Scanner(System.in);
        try {
            String line;
            // ask user ..
            System.out.println("Enter your name:");
            user.setName(keyboard.next());
            line = keyboard.nextLine();
            // ask user ..
            System.out.println("Enter your number:");
            user.setNumber(keyboard.next());
            // next line
            line = keyboard.nextLine();
            // ask user ..
            System.out.println("Enter your gender:");
            String gender = keyboard.next();
            // input Validation gender ..
            while (!(gender.equalsIgnoreCase("female")
                    || gender.equalsIgnoreCase("male"))) {
                System.out.println("please enter your gender"
                        + " (female or male)");
                gender = keyboard.next();
            }
            user.setGender(gender);
            // ask user ..
            System.out.println("Enter your age:");
            int age = keyboard.nextInt();
            // input Validation age ..
            while (age <= 10 || age >= 90) {
                System.out.println("please .. Enter your age correct :");
                age = keyboard.nextInt();
            }
            user.setAge(age);
        } catch (InputMismatchException e) {
            System.out.println("try again,input mismatch");
        }
    }

    /*This method take a choice from user and display Nusery Owner */
    public static void chooseNursery(int choice, ArrayList<nurseryOwner> allOwner) {

        switch (choice) {
            case 1:
                System.out.println(allOwner.get(0));
                break;
            case 2:
                System.out.println(allOwner.get(1));
                break;
            case 3:
                System.out.println(allOwner.get(2));
                break;
        }
     
    }

    /* This method search for plant choice from user and
     return null if the user didn't choose a plant */
    public static plant getPlantChoice(String planetName, ArrayList<plant> allPlant) {

        for (plant plantItem : allPlant) {
            if (planetName.equalsIgnoreCase(plantItem.getNamePlant())) {
                return plantItem;
            }
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
       
        Scanner keyboard = new Scanner(System.in);

        // input user information ..
        account customer = new account();

        // Objects of class "nurseryOwner" .. 
        nurseryOwner sara = new nurseryOwner("sara ahmad", "0545644233", "female",
                22, "Sara Nursery", "jeddah");
        nurseryOwner ali = new nurseryOwner(" Ali ahmad", "05422244233", "male",
                27, "Ali Nursery", "jeddah");
        nurseryOwner fatemah = new nurseryOwner("fatemah", "05456443213", "female",
                33, "Fatemah Nursery", "makkah");
        ArrayList<nurseryOwner> allOwner = new ArrayList<>();
        allOwner.add(sara);
        allOwner.add(ali);
        allOwner.add(fatemah);
        // creating instance object for plants 
//        plant yucca = new plant("Yucca", Size.small, 21.2);
        plant yucca = plant.builder()
                  .namePlant("Yucca")
                  .sizePlant(Size.small)
                  .pricePlant(30)
                  .build();
 //    plant sunFlower = new plant("SunFlower", Size.medium, 13.2);
           plant sunFlower = plant.builder()
                  .namePlant("sunFlower")
                  .sizePlant(Size.medium)
                  .pricePlant(13.2)
                  .build();
//       plant rose = new plant("Rose", Size.small, 22.2);
           plant rose = plant.builder()
                  .namePlant("rose")
                  .sizePlant(Size.small)
                  .pricePlant(22.2)
                  .build();

        sara.addPlant(yucca);
        sara.addPlant(sunFlower);
        sara.addPlant(rose);

        // creating instance object for plants 
//        plant lemone = new plant("Lemone", Size.medium, 3.2);
           plant lemone = plant.builder()
                  .namePlant("lemone")
                  .sizePlant(Size.medium)
                  .pricePlant(3.2)
                  .build();
//        plant bamboo = new plant("Bamboo", Size.large, 11.3);
            plant bamboo = plant.builder()
                  .namePlant("bamboo")
                  .sizePlant(Size.large)
                  .pricePlant(11.3)
                  .build();                                                
//        plant pothos = new plant("Pothos", Size.small, 4.3);
            plant pothos = plant.builder()
                  .namePlant("pothos")
                  .sizePlant(Size.small)
                  .pricePlant(4.3)
                  .build();  


        // Add to Arraylist "plant" of class "nurseryOwner" 
        ali.addPlant(lemone);
        ali.addPlant(bamboo);
        ali.addPlant(pothos);

        // creating instance object for plants 
//        plant lavender = new plant("lavender", Size.large, 4.3);
            plant lavender = plant.builder()
                  .namePlant("lavender")
                  .sizePlant(Size.large)
                  .pricePlant(4.3)
                  .build(); 
//        plant alovera = new plant("Alovera", Size.small, 5.5);
            plant alovera = plant.builder()
                  .namePlant("alovera")
                  .sizePlant(Size.small)
                  .pricePlant(5.5)
                  .build(); 
//        plant violet = new plant("violet", Size.small, 10.22);
            plant violet = plant.builder()
                  .namePlant("violet")
                  .sizePlant(Size.small)
                  .pricePlant(10.22)
                  .build(); 

        fatemah.addPlant(lavender);
        fatemah.addPlant(alovera);
        fatemah.addPlant(violet);

        ArrayList<plant> allPlant = new ArrayList<>();

       
        allPlant.add(yucca);
        allPlant.add(sunFlower);
        allPlant.add(rose);
        
        allPlant.add(lemone);
        allPlant.add(bamboo);
        allPlant.add(pothos);

        allPlant.add(lavender);
        allPlant.add(alovera);
        allPlant.add(violet);

        int count = 0;
        ArrayList<OrderItem> items = new ArrayList<>();
        int nurseryChoice = 0;
        char returnMain = 'Y';
        String enter;
        while (returnMain != 'N') {

            int choice;
            //calling mehtod to print welcome to user ..
            printBanner();

            System.out.println("\nWe are provide a service for buying and selling"
                    + " plants\n\tEnter (1) for buy plants.\n\tEnter (2) To only communicate "
                    + "with the owners of the nurseries\n");
            choice = keyboard.nextInt();
            // input Validation

            while (choice != 1 && choice != 2) {
                System.out.println("PLEASE TRY AGAIN .. ENTER ONLY 1 OR 2");
                choice = keyboard.nextInt();
            }

            char again = 'y';
            String input;
            String plantName;
            
            
            switch (choice) {
                case 1:

                    getCustomerInfo(customer);
                    while (again != 'n') {

                        System.out.println("please enter number nursery:"
                                + "\n\t1: ** SARA **\n\t2: ** ALI **"
                                + "\n\t3: ** FATEMAH **");
                        nurseryChoice = keyboard.nextInt();
                        chooseNursery(nurseryChoice, allOwner);

                        System.out.println("Enter name PLANT want choose it");
                        plantName = keyboard.next();

                        items.add(new OrderItem(getPlantChoice(plantName, allPlant)));

                        System.out.println("\t\tDo you need add more plants?\t\t\n\t\t\t(enter Y / N)\t");
                        input = keyboard.next().toLowerCase();
                        again = input.charAt(0);
                        count++;

                    }
                    
                    //create order
                    facadePlant facadeorder = new facadePlant(customer,items);
                    facadeorder.getOrder();
                    //order Order = new order(customer, items);
                    //Order.PrintDetails();
                    break;
                case 2:
                    // create obj of facade 
                    facadePlant facade = new facadePlant();
         
                    facade.getInfo(sara);
                    facade.getInfo(fatemah);
                    facade.getInfo(ali);
                    break;

            }

            System.out.println("\n\t\tRETURN TO THE MAIN ( enter Y / N )\t\t");
            enter = keyboard.next().toUpperCase();
            returnMain = enter.charAt(0);
        }

    }

}
