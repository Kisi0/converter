import java.util.Scanner;

public class Heightmain {
    public static void heightConverterMain() {

        Scanner scanner = new Scanner(System.in);
        Height Njesitagjatesise = new Height();
        while (true) {
            System.out.println("Distance Conversion Menu:");
            System.out.println("1. Meters to Kilometers");
            System.out.println("2. Kilometers to Meters");
            System.out.println("3. Meters to CentiMeters");
            System.out.println("4. CentiMeters to Meters");
            System.out.println("5. Exit");
            System.out.print("Choose a distance conversion option: ");

            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exiting Conversion");
                break;
            }

            double height;
            double result = 0.0;

            switch (choice){
                case 1:
                    System.out.println("Enter the value :");
                    height= scanner.nextDouble();
                    result= Njesitagjatesise.mtokm(height);
                    break;
                case 2:
                    System.out.println("Enter the value  :");
                    height= scanner.nextDouble();
                    result= Njesitagjatesise.kmtom(height);
                    break;
                case 3:
                    System.out.println("Enter the value :");
                    height= scanner.nextDouble();
                    result= Njesitagjatesise.mtocm(height);
                    break;
                case 4:
                    System.out.println("Enter the value :");
                    height= scanner.nextDouble();
                    result= Njesitagjatesise.cmtom(height);
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
