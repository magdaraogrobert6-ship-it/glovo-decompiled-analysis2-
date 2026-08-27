package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaN7z0Ea2bnxePLVipqp_gDhWww implements resumeWebviewIfNecessarylambda0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Object read;

    public /* synthetic */ r8lambdaN7z0Ea2bnxePLVipqp_gDhWww(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
    }

    @Override // o.resumeWebviewIfNecessarylambda0
    public final Iterator iterator() {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            return i != 1 ? (Iterator) this.read : ((Iterable) this.read).iterator();
        }
        return new r8lambdaMGAKE7zaEoWpm8clCqiIvMfRFAg(this);
    }
}
