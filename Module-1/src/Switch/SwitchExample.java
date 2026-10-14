package Switch;

public class SwitchExample {
    public static void main(String[] args) {
        String dayOfWeek = "WEDNESDAY";
        String typeOfDay;

        switch (dayOfWeek) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                typeOfDay = "Weekday";
                break;
            case "SATURDAY":
            case "SUNDAY":
                typeOfDay = "Weekend";
                break;
            default:
                typeOfDay = "Invalid day";
        }

        System.out.println(typeOfDay);
    }
}