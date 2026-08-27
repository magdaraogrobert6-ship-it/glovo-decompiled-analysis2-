package o;

import android.content.res.Configuration;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getCacheKey {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    public static void read(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = configuration.colorMode;
        int i5 = configuration2.colorMode & 3;
        if ((i4 & 3) != i5) {
            int i6 = read + 11;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            configuration3.colorMode |= i5;
            int i8 = RemoteActionCompatParcelizer + 49;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        int i10 = configuration.colorMode;
        int i11 = configuration2.colorMode & 12;
        if ((i10 & 12) != i11) {
            configuration3.colorMode |= i11;
        }
    }

    public static final doLoadui_text write(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        try {
            String upperCase = str.toUpperCase(java.util.Locale.ROOT);
            upperCase.getClass();
            doLoadui_text doloadui_textValueOf = doLoadui_text.valueOf(upperCase);
            int i4 = read + 23;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return doloadui_textValueOf;
            }
            throw null;
        } catch (Throwable th) {
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            String str2 = (String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            str2.getClass();
            forest.write(new accessstartTrackingTable("Illegal style: " + str + " triggered by " + str2, th, 6));
            return doLoadui_text.NEUTRAL_PALE;
        }
    }
}
