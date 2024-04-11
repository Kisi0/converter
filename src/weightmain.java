import java.util.Scanner;

public class weightmain {

    public static void WeightConverterMain() {

        Scanner scanner = new Scanner(System.in);
        Weight Njesiagjatesise = new Weight();
        while (true) {
            System.out.println("Weight Conversion Menu:");
            System.out.println("1. Gram to Kilograms");
            System.out.println("2. Kilograms to Gram");
            System.out.println("3. Exit");
            System.out.print("Choose a weight conversion option: ");


            int choice = scanner.nextInt();
            if (choice == 3) {
                System.out.println("Exiting Conversion");
                break;
            }

            double weight;
            double result =0.0;

            switch (choice){
                case 1:
                    System.out.println("Enter the value :");
                    weight= scanner.nextDouble();
                    result= Njesiagjatesise.gtokg(weight);
                    break;
                case 2:
                    System.out.println("Enter the value :");
                    weight= scanner.nextDouble();
                    result= Njesiagjatesise.kgtog(weight);
                    break;
                default:
                    System.out.println("Invalid choice of menu :");
                    break;

            }

            System.out.println("The value is : " + result );
            System.out.println(" ");

        }


    }
}

