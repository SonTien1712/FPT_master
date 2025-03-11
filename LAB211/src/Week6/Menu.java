package Week6;

public class Menu
{
    public static int getMainMenu()
    {
        int choice = Validate.inputPositiveInt();
        while(choice>=1&&choice<=5)
        {
            System.out.println("1. Add worker.");
            System.out.println("2. Increase salary for worker.");
            System.out.println("3. Decrease for worker");
            System.out.println("4. Show adjusted salary worker information");
            System.out.println("5. Exist");
            System.out.print("Enter your choice: ");
        }
        return choice;
    }
}
