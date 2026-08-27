package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class zd {
    public final Context a;
    public final String b;
    public final String c;
    public final com.braze.storage.n d;

    public static final String a(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Setting signature to: ", str);
    }

    public final void b(String str) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w8$$ExternalSyntheticLambda1(str, 10), 6, (Object) null);
        com.braze.storage.n nVar = this.d;
        DataStoreKey dataStoreKey = DataStoreKey.SDK_AUTH;
        if (str == null) {
            str = "";
        }
        nVar.writeData(dataStoreKey, str);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        String str = this.b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.c;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Context context = this.a;
        String str = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder("SdkAuthenticationCache(context=");
        sb.append(context);
        sb.append(", userId=");
        sb.append(str);
        sb.append(", apiKey=");
        return ff$$ExternalSyntheticOutline0.m(sb, str2, ")");
    }

    public zd(Context context, String str, String str2) {
        context.getClass();
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = new com.braze.storage.n(context, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd)) {
            return false;
        }
        zd zdVar = (zd) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, zdVar.a}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, zdVar.b}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, zdVar.c}, getCieXyz.write())).booleanValue();
    }
}
