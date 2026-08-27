package o;

import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class TextIndentKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final setVerticalStyle read;

    public TextIndentKt(setVerticalStyle setverticalstyle) {
        setverticalstyle.getClass();
        this.read = setverticalstyle;
    }

    public final boolean serializer() {
        int i = 2 % 2;
        setVerticalStyle setverticalstyle = this.read;
        if (Settings.Global.getInt(setverticalstyle.read.getContentResolver(), "auto_time", 0) == 1) {
            int i2 = serializer + 55;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (Settings.Global.getInt(setverticalstyle.read.getContentResolver(), "auto_time_zone", 0) == 1) {
                int i4 = serializer + 71;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i4 % 2 != 0;
            }
        }
        int i5 = RemoteActionCompatParcelizer + 47;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
