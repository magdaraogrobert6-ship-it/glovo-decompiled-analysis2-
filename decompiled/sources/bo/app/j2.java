package bo.app;

import com.braze.support.BrazeLogger;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public final class j2 {
    public static final String b() {
        return "The leading character in the key string may not be '$'. Not adding property.";
    }

    public final boolean a(String str) {
        str.getClass();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(6), 6, (Object) null);
            return false;
        }
        if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "$", false)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(7), 6, (Object) null);
        return false;
    }

    public static final String a() {
        return "The BrazeProperties key cannot be null or contain only whitespaces. Not adding property.";
    }
}
