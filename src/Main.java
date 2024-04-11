import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Memory memory = new Memory();
        Heightmain heightmain = new Heightmain();
        weightmain weightmain = new weightmain();

        boolean exit = false;

        while (!exit) {

            System.out.println("Unit Conversion Menu:");
            System.out.println("1. Distance");
            System.out.println("2. Weight");
            System.out.println("3. Handle Memory Functions");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int mChoice = scanner.nextInt();

            switch (mChoice) {
                case 1:
                    System.out.println("Continue with Distanca ");
                    heightmain.heightConverterMain();
                    break;

                case 2:
                    System.out.println("Continue with Weight");
                    weightmain.WeightConverterMain();
                    break;
                case 3:
                    System.out.println("Continue with Handle Memory Functions ");
                    handleMemoryFunksions(scanner, memory);
                    break;
                case 4:
                    System.out.println("Exit");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option, please choose a number between 1 and 4.");
                    break;
            }
        }
    }

        private static void handleMemoryFunksions (Scanner scanner, Memory memory ){

            System.out.println("Meomory Funksions");
            System.out.println("1.Add to Memory (M+)");
            System.out.println("2.Clear Memory (MC)");
            System.out.println("3.Recall Memory (MR)");
            System.out.println("Select a memory funksion (1/2/3)");
            int memoryChoice = scanner.nextInt();
            switch (memoryChoice) {
                case 1:
                    System.out.println("Enter value to add to memory: ");
                    double Value = scanner.nextDouble();
                    memory.addToMemory(Value);
                    System.out.println("Value added to memory");
                    break;
                case 2:
                    memory.clearMemory();
                    System.out.println("Memory cleared");
                    break;
                case 3:
                    double reCalledValue = memory.recallMemory();
                    System.out.println("Value recalled from memory" + reCalledValue);
                    break;
                default:
                    System.out.println("Invalid choice");



            }
        }
    }

