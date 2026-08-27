package androidx.compose.ui.res;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.Base64;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import o.getBirthDateFull;
import o.getNewPassword;
import o.getPostalCode;

/* JADX INFO: loaded from: classes.dex */
public final class StringResources_androidKt {
    private static int IconCompatParcelizer = 0;
    private static byte serializer = -112;
    private static int write = 1;

    public static final String pluralStringResource(int i, int i2, Object[] objArr, getBirthDateFull getbirthdatefull, int i3) {
        return ((Resources) ((getPostalCode) getbirthdatefull).write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalResources())).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String[] stringArrayResource(int i, getBirthDateFull getbirthdatefull, int i2) {
        return ((Resources) ((getPostalCode) getbirthdatefull).write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalResources())).getStringArray(i);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004f A[PHI: r0 r5 r6
  0x004f: PHI (r0v8 android.content.res.Configuration) = (r0v6 android.content.res.Configuration), (r0v12 android.content.res.Configuration) binds: [B:8:0x0044, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r5v4 java.lang.Object[]) = (r5v1 java.lang.Object[]), (r5v5 java.lang.Object[]) binds: [B:8:0x0044, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r6v11 android.content.res.Resources) = (r6v3 android.content.res.Resources), (r6v14 android.content.res.Resources) binds: [B:8:0x0044, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0046 A[PHI: r0 r5 r6
  0x0046: PHI (r0v7 android.content.res.Configuration) = (r0v6 android.content.res.Configuration), (r0v12 android.content.res.Configuration) binds: [B:8:0x0044, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r5v2 java.lang.Object[]) = (r5v1 java.lang.Object[]), (r5v5 java.lang.Object[]) binds: [B:8:0x0044, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r6v4 android.content.res.Resources) = (r6v3 android.content.res.Resources), (r6v14 android.content.res.Resources) binds: [B:8:0x0044, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    public static final String stringResource(int i, Object[] objArr, getBirthDateFull getbirthdatefull, int i2) {
        Resources resources;
        Object[] objArrCopyOf;
        Configuration configuration;
        Locale locale;
        int i3 = 2 % 2;
        int i4 = write + 85;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            resources = (Resources) ((getPostalCode) getbirthdatefull).write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalResources());
            objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            configuration = resources.getConfiguration();
            if (Build.VERSION.SDK_INT >= 98) {
                locale = configuration.getLocales().get(0);
            } else {
                Locale locale2 = configuration.locale;
                int i5 = write + 47;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                locale = locale2;
            }
        } else {
            resources = (Resources) ((getPostalCode) getbirthdatefull).write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalResources());
            objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            configuration = resources.getConfiguration();
            if (Build.VERSION.SDK_INT >= 24) {
                locale = configuration.getLocales().get(0);
            } else {
                Locale locale3 = configuration.locale;
                int i7 = write + 47;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                locale = locale3;
            }
        }
        String string = resources.getString(i);
        if (string.startsWith("%('")) {
            Object[] objArr2 = new Object[1];
            a(string.substring(3), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        return String.format(locale, string, objArrCopyOf);
    }

    public static final String pluralStringResource(int i, int i2, getBirthDateFull getbirthdatefull, int i3) {
        return ((Resources) ((getPostalCode) getbirthdatefull).write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalResources())).getQuantityString(i, i2);
    }

    public static final String stringResource(int i, getBirthDateFull getbirthdatefull, int i2) {
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 39;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        String string = ((Resources) ((getPostalCode) getbirthdatefull).write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalResources())).getString(i);
        if (string.startsWith("%('")) {
            int i6 = IconCompatParcelizer + 121;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            string = ((String) objArr[0]).intern();
        }
        int i8 = write + 99;
        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ serializer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
