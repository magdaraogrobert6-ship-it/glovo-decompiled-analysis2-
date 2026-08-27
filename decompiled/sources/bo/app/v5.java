package bo.app;

import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class v5 {
    public final void a(BrazeConfigurationProvider brazeConfigurationProvider, zd zdVar, l9 l9Var, String str) {
        brazeConfigurationProvider.getClass();
        zdVar.getClass();
        l9Var.getClass();
        str.getClass();
        l2 l2Var = (l2) l9Var;
        l2Var.g = str;
        l2Var.h = brazeConfigurationProvider.getBrazeApiKey().a;
        l2Var.i = Constants.BRAZE_SDK_VERSION;
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        l2Var.f = Long.valueOf(jNowInMilliseconds);
        l2Var.e = Long.valueOf(jNowInMilliseconds / 1000);
        if (!brazeConfigurationProvider.isSdkAuthenticationEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(25), 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda0(23, zdVar), 6, (Object) null);
            l2Var.k = String.valueOf(zdVar.d.readData(DataStoreKey.SDK_AUTH, ""));
        }
    }

    public static final String a(zd zdVar) {
        return ff$$ExternalSyntheticOutline0.m("Adding SDK Auth token to request '", String.valueOf(zdVar.d.readData(DataStoreKey.SDK_AUTH, "")), "'");
    }

    public static final String a() {
        return "SDK Auth is disabled, not adding signature to request";
    }
}
