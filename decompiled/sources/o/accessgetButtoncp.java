package o;

import android.util.Base64;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetButtoncp {
    public static byte[] IconCompatParcelizer(int i, String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return Base64.decode(str, i);
        } catch (Exception unused) {
            MapboxMap$$ExternalSyntheticLambda0.m(1005L, "base64 decode error");
            return null;
        }
    }

    public static String write(int i, byte[] bArr) throws UcsException {
        String str;
        if (bArr != null) {
            try {
                return Base64.encodeToString(bArr, i);
            } catch (Exception unused) {
                str = "base64 encodeToString error";
            }
        } else {
            str = "base64 encodeToString error: data is null";
        }
        MapboxMap$$ExternalSyntheticLambda0.m(1005L, str);
        return null;
    }
}
