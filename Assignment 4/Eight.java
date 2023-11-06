class Eight{
	 public static void main(String[] args) {
        int year = 2024; // Replace this with the year you want to check.

        // Check if the year is a leap year based on the conditions.
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}