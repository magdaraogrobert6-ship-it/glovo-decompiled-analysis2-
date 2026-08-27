package com.qualtrics.digital.resolvers;

import io.sentry.android.core.SentryLogcatAdapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class DateTimeTypeResolvers {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static SimpleDateFormat dayFormat = new SimpleDateFormat("EEE");

    public static boolean evaluateDateTime_Day(String str, String str2, String str3) {
        boolean zEquals = str2.equals(dayFormat.format(getCalendarTimeZone(str3 != null ? getValidTimeZone(str3) : null).getTime()));
        str.getClass();
        if (str.equals("EQ")) {
            return zEquals;
        }
        if (str.equals("NEQ")) {
            return !zEquals;
        }
        SentryLogcatAdapter.serializer("Qualtrics", "Error, unexpected date operator: ".concat(str));
        return false;
    }

    private static Calendar getCalendarTimeZone(TimeZone timeZone) {
        return timeZone != null ? Calendar.getInstance(timeZone) : Calendar.getInstance();
    }

    private static TimeZone getValidTimeZone(String str) {
        if (str.equals("Pacific/Samoa")) {
            str = "Pacific/Apia";
        }
        return TimeZone.getTimeZone(str);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    public static boolean evaluateDateTime(String str, String str2, String str3, String str4) {
        byte b;
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 773825033) {
            if (iHashCode != 774309160) {
                if (iHashCode == 1548982753 && str.equals("DateTimeDay")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("DateTimeTime")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("DateTimeDate")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return evaluateDateTime_Date(str2, str3, str4);
        }
        if (b == 1) {
            return evaluateDateTime_Time(str2, str3, str4);
        }
        if (b != 2) {
            return false;
        }
        return evaluateDateTime_Day(str2, str3, str4);
    }

    public static boolean evaluateDateTime_Date(String str, String str2, String str3) {
        TimeZone validTimeZone;
        if (str3 != null) {
            try {
                validTimeZone = getValidTimeZone(str3);
            } catch (ParseException e) {
                SentryLogcatAdapter.read("Qualtrics", "Unexpected date format", e);
            }
        } else {
            validTimeZone = null;
        }
        Calendar calendarTimeZone = getCalendarTimeZone(validTimeZone);
        Calendar calendarTimeZone2 = getCalendarTimeZone(validTimeZone);
        calendarTimeZone2.setTime(dateFormat.parse(str2));
        int i = calendarTimeZone2.get(1) - calendarTimeZone.get(1);
        int i2 = calendarTimeZone2.get(6) - calendarTimeZone.get(6);
        int iHashCode = str.hashCode();
        if (iHashCode != 2220) {
            if (iHashCode != 2285) {
                if (iHashCode != 2440) {
                    if (iHashCode != 70904) {
                        if (iHashCode != 75709) {
                            if (iHashCode == 77178 && str.equals("NEQ")) {
                                return (i == 0 && i2 == 0) ? false : true;
                            }
                        } else if (str.equals("LTE")) {
                            return i > 0 || (i == 0 && i2 >= 0);
                        }
                    } else if (str.equals("GTE")) {
                        return i < 0 || (i == 0 && i2 <= 0);
                    }
                } else if (str.equals("LT")) {
                    return i > 0 || (i == 0 && i2 > 0);
                }
            } else if (str.equals("GT")) {
                return i < 0 || (i == 0 && i2 < 0);
            }
        } else if (str.equals("EQ")) {
            return i == 0 && i2 == 0;
        }
        SentryLogcatAdapter.serializer("Qualtrics", "Error, unexpected date operator: ".concat(str));
        return false;
    }

    public static boolean evaluateDateTime_Time(String str, String str2, String str3) {
        TimeZone validTimeZone;
        if (str3 != null) {
            try {
                validTimeZone = getValidTimeZone(str3);
            } catch (NumberFormatException unused) {
                SentryLogcatAdapter.serializer("Qualtrics", "Unexpected time number format: " + str2);
            }
        } else {
            validTimeZone = null;
        }
        String[] strArrSplit = str2.split(":");
        Calendar calendarTimeZone = getCalendarTimeZone(validTimeZone);
        Calendar calendarTimeZone2 = getCalendarTimeZone(validTimeZone);
        calendarTimeZone.set(11, Integer.parseInt(strArrSplit[0]));
        calendarTimeZone.set(12, Integer.parseInt(strArrSplit[1]));
        long timeInMillis = calendarTimeZone.getTimeInMillis() - calendarTimeZone2.getTimeInMillis();
        int iHashCode = str.hashCode();
        if (iHashCode != 2285) {
            if (iHashCode == 2440 && str.equals("LT")) {
                return timeInMillis > 1000;
            }
        } else if (str.equals("GT")) {
            return timeInMillis < -1000;
        }
        SentryLogcatAdapter.serializer("Qualtrics", "Error, unexpected date operator: ".concat(str));
        return false;
    }
}
