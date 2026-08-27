package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda8wlcaTG4WSLSeoWnhVT_DMKDe7Y extends onCreateWindowlambda1 {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda8wlcaTG4WSLSeoWnhVT_DMKDe7Y(ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda1) {
        super(ff$$ExternalSyntheticOutline0.m(new StringBuilder(), viewUtilsExternalSyntheticLambda1.MediaSessionCompatToken, " writer"), true);
        this.RemoteActionCompatParcelizer = viewUtilsExternalSyntheticLambda1;
    }

    @Override // o.onCreateWindowlambda1
    public final long read() {
        int i = this.serializer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            return ((Number) ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj).invoke()).longValue();
        }
        ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda1 = (ViewUtilsExternalSyntheticLambda1) obj;
        try {
            return viewUtilsExternalSyntheticLambda1.read() ? 0L : -1L;
        } catch (IOException e) {
            ViewUtilsExternalSyntheticLambda1.RemoteActionCompatParcelizer(viewUtilsExternalSyntheticLambda1, e, null, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda8wlcaTG4WSLSeoWnhVT_DMKDe7Y(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        super(str, true);
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }
}
