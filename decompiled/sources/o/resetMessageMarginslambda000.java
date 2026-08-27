package o;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class resetMessageMarginslambda000 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ resetMessageMarginslambda000(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.RemoteActionCompatParcelizer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.IconCompatParcelizer;
        if (i == 0) {
            try {
                return (List) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return instance_delegatelambda0.write;
            }
        }
        if (i != 1) {
            return com.braze.support.BrazeLogger.brazelog$lambda$0(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        return createFromParcel.INSTANCE;
    }
}
