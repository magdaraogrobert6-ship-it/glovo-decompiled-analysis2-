package o;

import bo.app.af$$ExternalSyntheticOutline0;
import j$.time.DesugarDuration;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustLinkResolution {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final setTransactionSuccessful write;

    public AdjustLinkResolution(setTransactionSuccessful settransactionsuccessful) {
        this.write = settransactionsuccessful;
    }

    public static String read(Calendar calendar, Calendar calendar2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            calendar.getClass();
            calendar2.getClass();
            convertToUri converttouri = convertToUri.TIME;
            af$$ExternalSyntheticOutline0.m(IconCompatParcelizer(calendar, converttouri), "  -  ", IconCompatParcelizer(calendar2, converttouri));
            obj.hashCode();
            throw null;
        }
        calendar.getClass();
        calendar2.getClass();
        convertToUri converttouri2 = convertToUri.TIME;
        String strM = af$$ExternalSyntheticOutline0.m(IconCompatParcelizer(calendar, converttouri2), "  -  ", IconCompatParcelizer(calendar2, converttouri2));
        int i3 = RemoteActionCompatParcelizer + 95;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return strM;
        }
        obj.hashCode();
        throw null;
    }

    public static String IconCompatParcelizer(Calendar calendar, convertToUri converttouri) {
        int i = 2 % 2;
        String str = new SimpleDateFormat(converttouri.getValue(), java.util.Locale.getDefault()).format(new Date(calendar.getTimeInMillis()));
        str.getClass();
        int i2 = read + 45;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String write(Calendar calendar, Calendar calendar2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        calendar.set(13, 0);
        calendar.set(14, 0);
        Duration durationOfMillis = Duration.ofMillis(calendar2.getTimeInMillis() - calendar.getTimeInMillis());
        int hoursPart = DesugarDuration.toHoursPart(durationOfMillis);
        int minutesPart = DesugarDuration.toMinutesPart(durationOfMillis);
        setTransactionSuccessful settransactionsuccessful = this.write;
        String strRemoteActionCompatParcelizer = settransactionsuccessful.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.plurals.min_symbol, minutesPart);
        String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.symbol_hour);
        if (hoursPart > 0 && minutesPart > 0) {
            int i4 = RemoteActionCompatParcelizer + 7;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return String.format(java.util.Locale.getDefault(), "%d%s %d %s", Arrays.copyOf(new Object[]{Integer.valueOf(hoursPart), strIconCompatParcelizer, Integer.valueOf(minutesPart), strRemoteActionCompatParcelizer}, 4));
        }
        if (hoursPart <= 0) {
            if (minutesPart > 0) {
                return String.format(java.util.Locale.getDefault(), "%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(minutesPart), strRemoteActionCompatParcelizer}, 2));
            }
            return settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.status_shift_less_than_minute);
        }
        String str = String.format(java.util.Locale.getDefault(), "%d%s", Arrays.copyOf(new Object[]{Integer.valueOf(hoursPart), strIconCompatParcelizer}, 2));
        int i6 = read + 91;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
