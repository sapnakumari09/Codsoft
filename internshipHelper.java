import java.util.Scanner;
public class internshipHelper {

    //public class InternshipHelper {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("ASK US FOR HELP!");
            System.out.println("THE PURPOSE OF THIS INTERNSHIP IS TO LEARN AND GROW.");
            System.out.println("We have no desire to dictate to you. It is entirely up to you whether you seek guidance or not.");
            System.out.println("The given tasks may seem very easy or very difficult. Approach them with professional diligence and give them the attention they deserve.");
            System.out.println();

            System.out.println("Would you like to ask for help or proceed independently?");
            System.out.print("Type 'help' to ask for guidance or 'proceed' to move forward on your own: ");
            String choice = scanner.nextLine().trim().toLowerCase();

            switch (choice) {
                case "help":
                    System.out.println("\nGreat! Asking for help is a sign of strength and willingness to learn.");
                    System.out.println("What specific area do you need guidance on?");
                    System.out.print("Enter your query: ");
                    String query = scanner.nextLine();
                    System.out.println("\nThank you for reaching out. We will assist you with: " + query);
                    System.out.println("Remember, learning is a collaborative process!");
                    break;

                case "proceed":
                    System.out.println("\nGood luck with your task! Remember, you can always ask for help if you get stuck.");
                    System.out.println("Stay diligent, and give the task your best effort.");
                    break;

                default:
                    System.out.println("\nInvalid input. Please type 'help' or 'proceed' to indicate your choice.");
                    break;
            }
            System.out.println("\nThank you for your hard work. Keep learning and growing!");
            scanner.close();
        }
    }


