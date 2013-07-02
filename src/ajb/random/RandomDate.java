package ajb.random;

import java.util.Calendar;
import java.util.Date;

public class RandomDate {

    /**
     * Takes the given calendar and randomly sets the time portion
     * 
     * @param cal {@link Calendar}
     */
    public static void scrambleCalendarTime(Calendar cal) {
        cal.set(Calendar.HOUR, RandomInt.anyRandomIntRange(1, 23));
        cal.set(Calendar.MINUTE, RandomInt.anyRandomIntRange(1, 60));
        cal.set(Calendar.SECOND, RandomInt.anyRandomIntRange(1, 60));
        cal.set(Calendar.MILLISECOND, 0);
    }

    /**
     * Returns a random date Between years 2000 and 2020
     * 
     * @return {@link Date}
     */
    public static Date anyRandomDate() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, RandomInt.anyRandomIntRange(2000, 2020));
        cal.set(Calendar.MONTH, RandomInt.anyRandomIntRange(1, 12));
        cal.set(Calendar.DAY_OF_MONTH, RandomInt.anyRandomIntRange(1, 31));
        cal.set(Calendar.HOUR, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        return cal.getTime();
    }

    /**
     * Returns a random date (with random time) Between years 2000 and 2020
     * 
     * @return {@link Date}
     */
    public static Date anyRandomDateTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, RandomInt.anyRandomIntRange(2000, 2020));
        cal.set(Calendar.MONTH, RandomInt.anyRandomIntRange(1, 12));
        cal.set(Calendar.DAY_OF_MONTH, RandomInt.anyRandomIntRange(1, 31));
        scrambleCalendarTime(cal);
        cal.set(Calendar.MILLISECOND, 0);

        return cal.getTime();
    }

    /**
     * Returns a random date between the two passed in values
     * 
     * @param from {@link Date}
     * @param to {@link Date}
     * @return {@link Date}
     */
    public static Date anyRandomDateRange(Date from, Date to) {

        Calendar fromCal = Calendar.getInstance();
        fromCal.setTime(from);

        Calendar toCal = Calendar.getInstance();
        toCal.setTime(to);

        while (fromCal.before(toCal)) {
            // 2% Chance
            if (RandomInt.anyRandomIntRange(1, 100) >= 98) {
                return fromCal.getTime();
            }

            fromCal.add(Calendar.DAY_OF_MONTH, 1);
        }

        // If we have reached here then no date was returned while looping
        // through all the possible dates!
        return toCal.getTime();
    }
}
