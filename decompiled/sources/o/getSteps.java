package o;

import android.util.Log;
import java.text.MessageFormat;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getSteps {
    public static LtrBoundsComparator write = new com.huawei.wisesecurity.ucs_credential.p0(0);

    public static String IconCompatParcelizer(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("UCS-", str);
    }

    public static void IconCompatParcelizer(String str, String str2, Object... objArr) {
        write.RemoteActionCompatParcelizer(IconCompatParcelizer(str), RemoteActionCompatParcelizer(str, str2, objArr));
    }

    public static void read(String str, String str2, Object... objArr) {
        write.read(IconCompatParcelizer(str), RemoteActionCompatParcelizer(str, str2, objArr));
    }

    public static void serializer(String str, String str2, Object... objArr) {
        write.IconCompatParcelizer(IconCompatParcelizer(str), RemoteActionCompatParcelizer(str, str2, objArr));
    }

    public static String RemoteActionCompatParcelizer(String str, String str2, Object... objArr) {
        try {
            return MessageFormat.format(str2, objArr);
        } catch (Throwable th) {
            Log.e(str, "log error : " + th.getMessage());
            return "return default";
        }
    }
}
