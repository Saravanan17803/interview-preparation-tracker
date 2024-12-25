import java.util.Scanner;

class date_to_string {
    public String convertDateToBinary(String date) {
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        String binaryYear = Integer.toBinaryString(year);
        String binaryMonth = Integer.toBinaryString(month);
        String binaryDay = Integer.toBinaryString(day);
        return binaryYear + "-" + binaryMonth + "-" + binaryDay;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date in yyyy-mm-dd format: ");
        String date = scanner.nextLine();
        date_to_string solution = new date_to_string();
        String binaryDate = solution.convertDateToBinary(date);
        System.out.println("Binary representation of the date: " + binaryDate);
        scanner.close();
    }
}
