package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class markOnScreenCardsAsReadlambda2 implements onViewDetachedFromWindowlambda1, Serializable {
    public final Object RemoteActionCompatParcelizer;

    @Override // o.onViewDetachedFromWindowlambda1
    public final Object MediaSessionCompatResultReceiverWrapper() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.onViewDetachedFromWindowlambda1
    public final boolean MediaSessionCompatToken() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.RemoteActionCompatParcelizer);
    }

    public markOnScreenCardsAsReadlambda2(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
    }
}
