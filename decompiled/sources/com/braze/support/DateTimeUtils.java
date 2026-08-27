package com.braze.support;

import android.os.Build;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.braze.enums.BrazeDateFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import o.DrawableTransformation;
import o.isAdapterPositionOnScreen;
import o.onContentCardClicked;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class DateTimeUtils {
    private static final int MAX_HOUR = 23;
    private static final int MAX_MINUTE = 59;
    private static final int MAX_MONTH = 11;
    private static final int MAX_SECOND = 59;
    private static final long MINIMUM_NETWORK_TIME = 1691768838316L;
    private static final int MIN_DAY = 1;
    private static final int MIN_HOUR = 0;
    private static final int MIN_MINUTE = 0;
    private static final int MIN_MONTH = 0;
    private static final int MIN_SECOND = 0;
    private static final long MSECS_IN_SEC = 1000;
    private static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("DateTimeUtils");
    private static boolean shouldUseNetworkTimeClock = true;
    private static final onViewDetachedFromWindowlambda1 networkTimeClock$delegate = new isAdapterPositionOnScreen(new c$$ExternalSyntheticLambda7(21));

    private static /* synthetic */ void getNetworkTimeClock$annotations() {
    }

    public static final long nowInMillisecondsSystemClock() {
        return System.currentTimeMillis();
    }

    public static final double nowInSecondsPrecise() {
        return nowInMilliseconds() / 1000.0d;
    }

    private static final Clock getNetworkTimeClock() {
        return (Clock) networkTimeClock$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nowInMilliseconds$lambda$0() {
        return "Error reading date and time from network. Using system time instead.";
    }

    public static final String formatDate(Date date, BrazeDateFormat brazeDateFormat, TimeZone timeZone) {
        date.getClass();
        brazeDateFormat.getClass();
        timeZone.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(brazeDateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(date);
        str.getClass();
        return str;
    }

    public static final String formatDateFromMillis(long j, BrazeDateFormat brazeDateFormat, TimeZone timeZone) {
        brazeDateFormat.getClass();
        timeZone.getClass();
        return formatDate(new Date(j), brazeDateFormat, timeZone);
    }

    public static final String formatDateNow(BrazeDateFormat brazeDateFormat) {
        brazeDateFormat.getClass();
        Date dateCreateDate = createDate(nowInSeconds());
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        return formatDate(dateCreateDate, brazeDateFormat, timeZone);
    }

    public static final long getTimeFromEpochInSeconds(Date date) {
        date.getClass();
        return date.getTime() / 1000;
    }

    public static final boolean isValidTimeZone(String str) {
        str.getClass();
        String[] availableIDs = TimeZone.getAvailableIDs();
        availableIDs.getClass();
        return onContentCardClicked.IconCompatParcelizer(availableIDs, str);
    }

    public static final Date parseDate(String str, BrazeDateFormat brazeDateFormat) throws Exception {
        str.getClass();
        brazeDateFormat.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(brazeDateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(UTC_TIME_ZONE);
        try {
            Date date = simpleDateFormat.parse(str);
            date.getClass();
            return date;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str, 17), 8, (Object) null);
            throw e;
        }
    }

    public static /* synthetic */ String formatDate$default(Date date, BrazeDateFormat brazeDateFormat, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = UTC_TIME_ZONE;
            timeZone.getClass();
        }
        return formatDate(date, brazeDateFormat, timeZone);
    }

    public static /* synthetic */ String formatDateFromMillis$default(long j, BrazeDateFormat brazeDateFormat, TimeZone timeZone, int i, Object obj) {
        if ((i & 1) != 0) {
            brazeDateFormat = BrazeDateFormat.ANDROID_LOGCAT;
        }
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
            timeZone.getClass();
        }
        return formatDateFromMillis(j, brazeDateFormat, timeZone);
    }

    public static final long nowInMilliseconds() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (Build.VERSION.SDK_INT >= 33 && shouldUseNetworkTimeClock) {
                long jMillis = getNetworkTimeClock().millis();
                if (jMillis >= MINIMUM_NETWORK_TIME) {
                    return jMillis;
                }
            }
            return jCurrentTimeMillis;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(20), 8, (Object) null);
            shouldUseNetworkTimeClock = false;
            return jCurrentTimeMillis;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseDate$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("Exception parsing date ", str, ". Returning null");
    }

    public static final long nowInSeconds() {
        return nowInMilliseconds() / 1000;
    }

    public static final Date createDate(int i, int i2, int i3, int i4, int i5, int i6) {
        validateDateComponents(i, i2, i3, i4, i5, i6);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
        gregorianCalendar.setTimeZone(UTC_TIME_ZONE);
        Date time = gregorianCalendar.getTime();
        time.getClass();
        return time;
    }

    public static /* synthetic */ Date createDate$default(int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        return createDate(i, i2, i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6);
    }

    public static final Date createDate(int i, int i2, int i3, int i4) {
        return createDate$default(i, i2, i3, i4, 0, 0, 48, null);
    }

    public static final Date createDate(int i, int i2, int i3, int i4, int i5) {
        return createDate$default(i, i2, i3, i4, i5, 0, 32, null);
    }

    public static final Date createDate(int i, int i2, int i3) {
        return createDate$default(i, i2, i3, 0, 0, 0, 56, null);
    }

    private static final void validateDateComponents(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i <= 0) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "Year must be positive, was "));
            return;
        }
        if (i2 < 0 || i2 >= 12) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i2, "Month must be between 0 and 11, was "));
            return;
        }
        if (i4 < 0 || i4 >= 24) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i4, "Hours must be between 0 and 23, was "));
            return;
        }
        if (i5 < 0 || i5 >= 60) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i5, "Minutes must be between 0 and 59, was "));
            return;
        }
        if (i6 < 0 || i6 >= 60) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i6, "Seconds must be between 0 and 59, was "));
            return;
        }
        if (i3 >= 1) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, 1);
            gregorianCalendar.setTimeZone(UTC_TIME_ZONE);
            int actualMaximum = gregorianCalendar.getActualMaximum(5);
            if (i3 <= actualMaximum) {
                return;
            }
            StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(actualMaximum, i2, "Day must not exceed ", " for month ", " of year ");
            sbM.append(i);
            sbM.append(", was ");
            sbM.append(i3);
            throw new IllegalArgumentException(sbM.toString().toString());
        }
        DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i3, "Day must be at least 1, was "));
    }

    public static final Date createDate(long j) {
        return new Date(j * 1000);
    }

    public static final String formatDate(Date date, BrazeDateFormat brazeDateFormat) {
        date.getClass();
        brazeDateFormat.getClass();
        return formatDate$default(date, brazeDateFormat, null, 2, null);
    }
}
