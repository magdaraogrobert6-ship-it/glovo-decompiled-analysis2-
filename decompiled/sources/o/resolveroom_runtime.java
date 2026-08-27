package o;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class resolveroom_runtime {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Type inference failed for: r3v2, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.time.ZonedDateTime] */
    public static String RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str.getClass();
            ZonedDateTime.parse(str).withZoneSameInstant(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("HH:mm").withLocale(java.util.Locale.getDefault())).getClass();
            throw null;
        }
        str.getClass();
        String str2 = ZonedDateTime.parse(str).withZoneSameInstant(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("HH:mm").withLocale(java.util.Locale.getDefault()));
        str2.getClass();
        int i3 = RemoteActionCompatParcelizer + 47;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return str2;
    }
}
