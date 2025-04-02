public class Enumeration {
    public enum DayofWeek{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        public boolean isWorkday(){
            return (this != SATURDAY && this != SUNDAY);
        }
    }
    public static void main(String[] args){
        System.out.println("Is Monday a workday?"+DayofWeek.MONDAY.isWorkday());
        System.out.println("Is Saturday a Workday?"+DayofWeek.SATURDAY.isWorkday());
    }
}
