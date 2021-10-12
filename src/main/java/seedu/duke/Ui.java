package seedu.duke;

public class Ui {

    public static void printPendingCommand() {
        System.out.print("Enter your command: ");
    }

    public static void printWelcome() {
        System.out.println("Hello!");
    }

    public static void goodBye() {
        System.out.println("Goodbye!");
    }

    /**
     * Prints a line for each person who owes the user money.
     *
     * @param person a person in the given trip
     */
    public static void printWhoOwesMe(Person person) {
        System.out.println(person.getName() + " | " + person.getAmtOwedToUser());
    }


    public static void printExpenseDetails(Expense e) {
        System.out.println(e);
    }

    public static void printExpensesSummary(Trip t) {
        System.out.println("This is the summary for your " + t.getLocation() + " trip " + t.getDateOfTripString());
        System.out.println("Total budget for this trip: " + t.getBudget());
        System.out.println("Total expenditure so far: " + t.getTotalExpenses());
        System.out.println("Current budget left for this trip: " + t.getBudgetLeft());
    }

    public static void printExpenseAddedSuccess() {
        System.out.println("Your expense has been added successfully");
    }

    public static void printBudgetFormatError() {
        System.out.print("Please re-enter your budget as a decimal number (e.g. 1.32): ");
    }

    public static void printExchangeRateFormatError() {
        System.out.print("Please re-enter your exchange rate as a decimal number (e.g. 1.32): ");
    }

    public static void printDateTimeFormatError() {
        System.out.print("Please check that your date-time format is dd-MM-yyyy. "
                + "Please enter the date again: ");
    }

    public static void printUnknownCommandError() {
        System.out.println("Sorry, we didn't recognize your entry. Please try again, or enter -help "
                + "to learn more.");
    }

    public static void printSingleUnknownTripIndexError() {
        System.out.println("Please re-enter your trip number. You should only enter a single trip number at a time");
    }

    public static void printUnknownTripIndexError() {
        System.out.println("Sorry, no such trip number exists. Please check your trip number and try again.");
    }

    public static void printDeleteTripSuccessful(Trip tripToRemove) {
        System.out.println("Your trip to " + tripToRemove.getLocation() + " on "
                + tripToRemove.getDateOfTripString() + " has been successfully removed");
    }

    public static void printNoOpenTripError() {
        System.out.println("You have not opened any trip yet. Please open a trip to edit expenses within the trip.");
        System.out.print("Please enter the trip you would like to open: ");
    }

}
