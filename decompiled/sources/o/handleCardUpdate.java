package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class handleCardUpdate implements onViewDetachedFromWindowlambda1, Serializable {
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public Object write;

    @Override // o.onViewDetachedFromWindowlambda1
    public final Object MediaSessionCompatResultReceiverWrapper() {
        if (this.write == doItemsShareIds.write) {
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.read;
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            this.read = null;
        }
        return this.write;
    }

    @Override // o.onViewDetachedFromWindowlambda1
    public final boolean MediaSessionCompatToken() {
        return this.write != doItemsShareIds.write;
    }

    public final String toString() {
        return MediaSessionCompatToken() ? String.valueOf(MediaSessionCompatResultReceiverWrapper()) : "Lazy value not initialized yet.";
    }
}
