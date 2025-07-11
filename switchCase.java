public class switchCase {
  public static void dayOftheWeek (int dayNumber) {
    String dayName;

    switch(dayNumber){
        case 1:
           dayName = "Sunday";
           break;
        case 2:
            dayName = "Monday";
            break;
        case 3:
            dayName = "Tuesday";
            break;
        case 4:
            dayName = "Wednesday";
            break;
        case 5:
            dayName = "Thursday";
            break;
        case 6:
            dayName = "Friday";
            break;
        case 7:
            dayName = "Saturday";
        default:
            dayName = "invalid day number";
            break;

    }

    System.out.println("The day is:" +  dayName);
  }

  public static void main(String[] args) {
    System.out.println("Displaying day for 1");
    dayOftheWeek(1);
  }
    
}
