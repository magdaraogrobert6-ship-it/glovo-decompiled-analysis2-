package o;

import android.net.Uri;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;
import okio.Path$Companion;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class getLanguage {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final Path$Companion RemoteActionCompatParcelizer;
    public final accessisMainThread serializer;

    public getLanguage(accessisMainThread accessismainthread, Path$Companion path$Companion) {
        accessismainthread.getClass();
        path$Companion.getClass();
        this.serializer = accessismainthread;
        this.RemoteActionCompatParcelizer = path$Companion;
    }

    public static String read(String str, Object... objArr) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        java.util.Locale locale = java.util.Locale.ROOT;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        int i4 = write + 91;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    public final Uri IconCompatParcelizer(createPrecomposedSlotHandle createprecomposedslothandle) {
        String str;
        int i = 2 % 2;
        if (createprecomposedslothandle instanceof createPlatformLocaleDelegate) {
            createPlatformLocaleDelegate createplatformlocaledelegate = (createPlatformLocaleDelegate) createprecomposedslothandle;
            str = read("google.navigation:q=%f,%f&mode=%s", Double.valueOf(createplatformlocaledelegate.serializer().serializer), Double.valueOf(createplatformlocaledelegate.serializer().IconCompatParcelizer), createplatformlocaledelegate.write());
        } else if (!(!(createprecomposedslothandle instanceof AndroidPlatformLocale_androidKt))) {
            int i2 = write + 15;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AndroidPlatformLocale_androidKt androidPlatformLocale_androidKt = (AndroidPlatformLocale_androidKt) createprecomposedslothandle;
            str = read("google.navigation:q=%f,%f", Double.valueOf(androidPlatformLocale_androidKt.read().serializer), Double.valueOf(androidPlatformLocale_androidKt.read().IconCompatParcelizer));
        } else if (createprecomposedslothandle instanceof getPlatformLocale) {
            int i4 = IconCompatParcelizer + 105;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            getPlatformLocale getplatformlocale = (getPlatformLocale) createprecomposedslothandle;
            str = read("geo:0,0?q=%f,%f", Double.valueOf(getplatformlocale.read().serializer), Double.valueOf(getplatformlocale.read().IconCompatParcelizer));
        } else {
            if (!(createprecomposedslothandle instanceof Locale)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            int i6 = write + 53;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            Locale locale = (Locale) createprecomposedslothandle;
            double d = locale.IconCompatParcelizer().serializer;
            double d2 = locale.IconCompatParcelizer().IconCompatParcelizer;
            String str2 = locale.read();
            if (str2.length() == 0) {
                str2 = locale.IconCompatParcelizer().serializer + ", " + locale.IconCompatParcelizer().IconCompatParcelizer;
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Destination label empty for ".concat(str2), new Object[0]);
            }
            this.RemoteActionCompatParcelizer.getClass();
            String strEncode = Uri.encode(str2);
            strEncode.getClass();
            str = read("geo:0,0?q=%f,%f (%s)", Double.valueOf(d), Double.valueOf(d2), strEncode);
        }
        this.serializer.getClass();
        return Uri.parse(str);
    }
}
