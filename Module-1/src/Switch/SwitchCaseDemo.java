package Switch;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        int day = 6;
        String type;

        switch (day) {
            case 1:
            case 2:
                case 3:
            case 4:
            case 5:
                type = "Weekday";
                break;          // without break, execution falls through to the next case
            case 6:
            case 7:
                type = "Weekend";
                break;
            default:
                type = "Invalid day";
        }

        System.out.println(type);   // Weekend
    }
}