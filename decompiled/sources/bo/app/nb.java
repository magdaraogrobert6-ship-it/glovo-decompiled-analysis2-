package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class nb {
    public final mb a;

    public static final String c(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Offline user storage provider was given user ID longer than 997. Rejecting. User ID: ", str);
    }

    public final String a() {
        String string = this.a.readString(DataStoreKey.LAST_USER_ID, "");
        String str = string != null ? string : "";
        if (StringUtils.getByteSize(str) <= 997) {
            return str;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(str, 8), 6, (Object) null);
        String strTruncateToByteLength = StringUtils.truncateToByteLength(str, 997);
        b(strTruncateToByteLength);
        return strTruncateToByteLength;
    }

    public final void b(String str) {
        str.getClass();
        if (str.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(4), 6, (Object) null);
        } else if (StringUtils.getByteSize(str) > 997) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str, 15), 6, (Object) null);
        } else {
            this.a.writeData(DataStoreKey.LAST_USER_ID, str);
        }
    }

    public nb(Context context) {
        context.getClass();
        this.a = new mb(context);
    }

    public static final String a(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Stored user ID is longer than 997 bytes. Truncating. Original user ID: ", str);
    }

    public static final String b() {
        return "userId is empty in updateLastUserId. Rejecting.";
    }
}
