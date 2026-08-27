package o;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.sentry.android.core.SentryLogcatAdapter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class getClipEntry {
    private static byte IconCompatParcelizer = -112;
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Bundle serializer;

    public static boolean read(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String serializer(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public Bundle IconCompatParcelizer() {
        Bundle bundle = this.serializer;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals(RemoteMessageConst.FROM)) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public boolean IconCompatParcelizer(String str) {
        try {
            return this.serializer.containsKey(str);
        } catch (Throwable unused) {
            ComposeScrollCaptureCallbackonScrollCaptureImageRequest2.IconCompatParcelizer("SafeBundle", "containsKey exception. key:");
            return false;
        }
    }

    public final String RatingCompat(String str) {
        int i = this.RemoteActionCompatParcelizer;
        Bundle bundle = this.serializer;
        if (i != 0) {
            try {
                return bundle.getString(str);
            } catch (Throwable th) {
                SweepGradientShader9KIMszodefault.write("SafeBundle", new StringBuilder("getString exception: "), th);
                return "";
            }
        }
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public int write(String str, int i) {
        try {
            return this.serializer.getInt(str, i);
        } catch (Throwable th) {
            SweepGradientShader9KIMszodefault.write("SafeBundle", new StringBuilder("getInt exception: "), th);
            return i;
        }
    }

    public void write(int i) {
        try {
            this.serializer.putInt("LocationSource", i);
        } catch (Throwable th) {
            SweepGradientShader9KIMszodefault.write("SafeBundle", new StringBuilder("putInt exception: "), th);
        }
    }

    public Integer RemoteActionCompatParcelizer(String str) {
        String strRatingCompat = RatingCompat(str);
        if (TextUtils.isEmpty(strRatingCompat)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strRatingCompat));
        } catch (NumberFormatException unused) {
            SentryLogcatAdapter.IconCompatParcelizer("NotificationParams", "Couldn't parse value of " + serializer(str) + "(" + strRatingCompat + ") into an int");
            return null;
        }
    }

    public JSONArray read(String str) {
        String strRatingCompat = RatingCompat(str);
        if (TextUtils.isEmpty(strRatingCompat)) {
            return null;
        }
        try {
            return new JSONArray(strRatingCompat);
        } catch (JSONException unused) {
            SentryLogcatAdapter.IconCompatParcelizer("NotificationParams", "Malformed JSON for key " + serializer(str) + ": " + strRatingCompat + ", falling back to default");
            return null;
        }
    }

    public getClipEntry(Bundle bundle, int i) {
        this.RemoteActionCompatParcelizer = i;
        if (i != 1) {
            this.serializer = new Bundle(bundle);
        } else {
            this.serializer = bundle == null ? new Bundle() : bundle;
        }
    }

    public String toString() {
        if (this.RemoteActionCompatParcelizer != 1) {
            return super.toString();
        }
        try {
            return this.serializer.toString();
        } catch (Throwable unused) {
            ComposeScrollCaptureCallbackonScrollCaptureImageRequest2.IconCompatParcelizer("SafeBundle", "toString exception.");
            return null;
        }
    }

    public boolean write(String str) {
        String strRatingCompat = RatingCompat(str);
        return "1".equals(strRatingCompat) || Boolean.parseBoolean(strRatingCompat);
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ IconCompatParcelizer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public String RemoteActionCompatParcelizer(Resources resources, String str, String str2) {
        String[] strArr;
        int i = 2 % 2;
        int i2 = read + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strRatingCompat = RatingCompat(str2);
        if (!TextUtils.isEmpty(strRatingCompat)) {
            return strRatingCompat;
        }
        String strRatingCompat2 = RatingCompat(str2.concat("_loc_key"));
        Object obj = null;
        if (TextUtils.isEmpty(strRatingCompat2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strRatingCompat2, "string", str);
        if (identifier == 0) {
            SentryLogcatAdapter.IconCompatParcelizer("NotificationParams", serializer(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArray = read(str2.concat("_loc_args"));
        if (jSONArray == null) {
            int i4 = read + 87;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            strArr = null;
        } else {
            int length = jSONArray.length();
            strArr = new String[length];
            int i5 = 0;
            while (i5 < length) {
                strArr[i5] = jSONArray.optString(i5);
                i5++;
                int i6 = read + 33;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        }
        if (strArr == null) {
            String string = resources.getString(identifier);
            if (!string.startsWith("%('")) {
                return string;
            }
            int i8 = write + 97;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                return ((String) objArr[0]).intern();
            }
            Object[] objArr2 = new Object[1];
            a(string.substring(3), objArr2);
            ((String) objArr2[0]).intern();
            obj.hashCode();
            throw null;
        }
        try {
            Configuration configuration = resources.getConfiguration();
            java.util.Locale locale = Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().get(0) : configuration.locale;
            String string2 = resources.getString(identifier);
            if (string2.startsWith("%('")) {
                int i9 = read + 41;
                write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    a(string2.substring(3), objArr3);
                    string2 = ((String) objArr3[0]).intern();
                    int i10 = 57 / 0;
                } else {
                    Object[] objArr4 = new Object[1];
                    a(string2.substring(3), objArr4);
                    string2 = ((String) objArr4[0]).intern();
                }
            }
            return String.format(locale, string2, strArr);
        } catch (MissingFormatArgumentException e) {
            SentryLogcatAdapter.write("NotificationParams", "Missing format argument for " + serializer(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }
}
