package o;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetDeactivateOutOfFramecp {
    public static final AtomicReference IconCompatParcelizer = new AtomicReference();

    public static long write(long j) {
        Calendar calendarWrite = write((Calendar) null);
        calendarWrite.setTimeInMillis(j);
        return IconCompatParcelizer(calendarWrite).getTimeInMillis();
    }

    public static Calendar write() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar write(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    public static Calendar IconCompatParcelizer(Calendar calendar) {
        Calendar calendarWrite = write(calendar);
        Calendar calendarWrite2 = write((Calendar) null);
        calendarWrite2.set(calendarWrite.get(1), calendarWrite.get(2), calendarWrite.get(5));
        return calendarWrite2;
    }

    public static DateFormat read(String str, java.util.Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(android.icu.util.TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }
}
