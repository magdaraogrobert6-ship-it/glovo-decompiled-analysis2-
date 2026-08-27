package o;

import android.net.Uri;
import android.os.Bundle;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPaint_androidKtWhenMappings extends asAndroidPathEffect {
    public final /* synthetic */ int IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidPaint_androidKtWhenMappings(boolean z, int i) {
        super(z);
        this.IconCompatParcelizer = i;
    }

    @Override // o.asAndroidPathEffect
    public final void read(String str, Bundle bundle, Object obj) {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            int iIntValue = ((Number) obj).intValue();
            str.getClass();
            bundle.putInt(str, iIntValue);
            return;
        }
        if (i == 1) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            str.getClass();
            bundle.putBoolean(str, zBooleanValue);
            return;
        }
        if (i == 2) {
            float fFloatValue = ((Number) obj).floatValue();
            str.getClass();
            bundle.putFloat(str, fFloatValue);
            return;
        }
        if (i == 3) {
            long jLongValue = ((Number) obj).longValue();
            str.getClass();
            bundle.putLong(str, jLongValue);
        } else if (i == 4) {
            int iIntValue2 = ((Number) obj).intValue();
            str.getClass();
            bundle.putInt(str, iIntValue2);
        } else {
            String str2 = (String) obj;
            str.getClass();
            if (str2 != null) {
                bundle.putString(str, str2);
            } else {
                bundle.putString(str, null);
            }
        }
    }

    @Override // o.asAndroidPathEffect
    public String write(Object obj) {
        if (this.IconCompatParcelizer != 5) {
            return super.write(obj);
        }
        String str = (String) obj;
        if (str == null) {
            return "null";
        }
        String strEncode = Uri.encode(str, null);
        strEncode.getClass();
        return strEncode;
    }

    @Override // o.asAndroidPathEffect
    public final Object serializer(Bundle bundle, String str) {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            bundle.getClass();
            return Integer.valueOf(getCyan0d7_KjU.write(bundle, str));
        }
        if (i == 1) {
            bundle.getClass();
            if (!bundle.containsKey(str) || getCyan0d7_KjU.RemoteActionCompatParcelizer(bundle, str)) {
                return null;
            }
            boolean z = bundle.getBoolean(str, false);
            if (z || !bundle.getBoolean(str, true)) {
                return Boolean.valueOf(z);
            }
            accessbootstrapIfNeeded.write(str);
            throw null;
        }
        if (i == 2) {
            bundle.getClass();
            float f = bundle.getFloat(str, Float.MIN_VALUE);
            if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                return Float.valueOf(f);
            }
            accessbootstrapIfNeeded.write(str);
            throw null;
        }
        if (i == 3) {
            bundle.getClass();
            long j = bundle.getLong(str, Long.MIN_VALUE);
            if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                return Long.valueOf(j);
            }
            accessbootstrapIfNeeded.write(str);
            throw null;
        }
        if (i == 4) {
            bundle.getClass();
            return Integer.valueOf(getCyan0d7_KjU.write(bundle, str));
        }
        bundle.getClass();
        if (!bundle.containsKey(str) || getCyan0d7_KjU.RemoteActionCompatParcelizer(bundle, str)) {
            return null;
        }
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        accessbootstrapIfNeeded.write(str);
        throw null;
    }

    @Override // o.asAndroidPathEffect
    public final String serializer() {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            return "integer";
        }
        if (i == 1) {
            return "boolean";
        }
        if (i == 2) {
            return "float";
        }
        if (i != 3) {
            return i != 4 ? "string" : "reference";
        }
        return com.adjust.sdk.Constants.LONG;
    }

    @Override // o.asAndroidPathEffect
    public final Object IconCompatParcelizer(String str) {
        int i;
        long j;
        int i2;
        int i3 = this.IconCompatParcelizer;
        boolean z = false;
        if (i3 == 0) {
            str.getClass();
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "0x", false)) {
                String strSubstring = str.substring(2);
                TuplesKt.RemoteActionCompatParcelizer(16);
                i = Integer.parseInt(strSubstring, 16);
            } else {
                i = Integer.parseInt(str);
            }
            return Integer.valueOf(i);
        }
        if (i3 == 1) {
            str.getClass();
            if (str.equals("true")) {
                z = true;
            } else if (!str.equals("false")) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("A boolean NavType only accepts \"true\" or \"false\" values.");
                return null;
            }
            return Boolean.valueOf(z);
        }
        if (i3 == 2) {
            str.getClass();
            return Float.valueOf(Float.parseFloat(str));
        }
        if (i3 == 3) {
            str.getClass();
            String strSerializer = setCarryoverInAppMessage.read(str, "L", false) ? r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(1, 0, str) : str;
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "0x", false)) {
                String strSubstring2 = strSerializer.substring(2);
                TuplesKt.RemoteActionCompatParcelizer(16);
                j = Long.parseLong(strSubstring2, 16);
            } else {
                j = Long.parseLong(strSerializer);
            }
            return Long.valueOf(j);
        }
        if (i3 != 4) {
            str.getClass();
            if (str.equals("null")) {
                return null;
            }
            return str;
        }
        str.getClass();
        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "0x", false)) {
            String strSubstring3 = str.substring(2);
            TuplesKt.RemoteActionCompatParcelizer(16);
            i2 = Integer.parseInt(strSubstring3, 16);
        } else {
            i2 = Integer.parseInt(str);
        }
        return Integer.valueOf(i2);
    }
}
