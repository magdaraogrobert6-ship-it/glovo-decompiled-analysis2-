package o;

import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class setTransactionSuccessful {
    private static byte IconCompatParcelizer = -112;
    private static int serializer = 1;
    private static int write;
    public final Application RemoteActionCompatParcelizer;

    public setTransactionSuccessful(Application application) {
        this.RemoteActionCompatParcelizer = application;
    }

    public final int write(int i) {
        int integer;
        int i2 = 2 % 2;
        int i3 = serializer + 25;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            integer = this.RemoteActionCompatParcelizer.getResources().getInteger(i);
            int i4 = 13 / 0;
        } else {
            integer = this.RemoteActionCompatParcelizer.getResources().getInteger(i);
        }
        int i5 = serializer + 119;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return integer;
    }

    public final String read(int i, Object... objArr) {
        java.util.Locale locale;
        int i2 = 2 % 2;
        int i3 = write + 35;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Resources resources = this.RemoteActionCompatParcelizer.getResources();
        Configuration configuration = resources.getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            locale = configuration.getLocales().get(0);
            int i5 = write + 5;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            locale = configuration.locale;
        }
        String string = resources.getString(i);
        if (string.startsWith("%('")) {
            Object[] objArr2 = new Object[1];
            a(string.substring(3), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        String str = String.format(locale, string, objArrCopyOf);
        str.getClass();
        int i7 = serializer + 47;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return str;
    }

    public final String IconCompatParcelizer(int i) {
        int i2 = 2 % 2;
        String string = this.RemoteActionCompatParcelizer.getString(i);
        if (string.startsWith("%('")) {
            int i3 = serializer + 111;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            string = ((String) objArr[0]).intern();
        }
        string.getClass();
        int i5 = serializer + 75;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final java.util.Locale read() {
        int i = 2 % 2;
        int i2 = serializer + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        java.util.Locale locale = this.RemoteActionCompatParcelizer.getResources().getConfiguration().getLocales().get(0);
        locale.getClass();
        int i4 = serializer + 29;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return locale;
        }
        throw null;
    }

    public final String RemoteActionCompatParcelizer(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = write + 77;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        String quantityString = this.RemoteActionCompatParcelizer.getResources().getQuantityString(i, i2, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
        quantityString.getClass();
        int i6 = serializer + 115;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return quantityString;
        }
        throw null;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ IconCompatParcelizer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public final String read(String str) {
        int i = 2 % 2;
        int i2 = serializer + 79;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        try {
            if (i2 % 2 != 0) {
                Application application = this.RemoteActionCompatParcelizer;
                str.getClass();
                String packageName = application.getPackageName();
                packageName.getClass();
                IconCompatParcelizer(application.getResources().getIdentifier(str, "string", packageName));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Application application2 = this.RemoteActionCompatParcelizer;
            str.getClass();
            String packageName2 = application2.getPackageName();
            packageName2.getClass();
            String strIconCompatParcelizer = IconCompatParcelizer(application2.getResources().getIdentifier(str, "string", packageName2));
            int i3 = serializer + 107;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 62 / 0;
            }
            return strIconCompatParcelizer;
        } catch (Exception unused) {
            return "";
        }
    }
}
