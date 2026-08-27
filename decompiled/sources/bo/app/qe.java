package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class qe {
    public final pe a;

    public final boolean a() {
        Object[] objArr = {this.a.readBoolean(DataStoreKey.SDK_ENABLEMENT, Boolean.FALSE), Boolean.TRUE};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public final void b(boolean z) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda4(z, 1), 6, (Object) null);
        this.a.writeData(DataStoreKey.SDK_ENABLEMENT, Boolean.valueOf(z));
    }

    public qe(Context context) {
        context.getClass();
        this.a = new pe(context);
    }

    public static final String a(boolean z) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Setting Braze SDK disabled to: ", z);
    }
}
