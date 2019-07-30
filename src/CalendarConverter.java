public class CalendarConverter {
    private static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDNESDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;

    public static String convertDayToString(int dayNumber){
        String dayName;
        switch(dayNumber){
            case CalendarConverter.MONDAY:
                dayName = "poniedziałek";
                break;
            case CalendarConverter.TUESDAY:
                dayName = "wtorek";
                break;
            case CalendarConverter.WEDNESDAY:
                dayName = "środa";
                break;
            case CalendarConverter.THURSDAY:
                dayName = "czwartek";
                break;
            case CalendarConverter.FRIDAY:
                dayName = "piątek";
                break;
            case CalendarConverter.SATURDAY:
                dayName = "sobota";
                break;
            case CalendarConverter.SUNDAY:
                dayName = "niedziela";
                break;
            default:
                dayName = "niepoprawny numer dnia tygodnia";
        }
        return dayName;
    }
}
