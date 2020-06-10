package task6;

import java.util.Calendar;
import java.util.Date;

public class DateTimeService {
    public Calendar calculateDateTime(TaskExecutor executor) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, executor.getDays());
        return calendar;
    }
}
