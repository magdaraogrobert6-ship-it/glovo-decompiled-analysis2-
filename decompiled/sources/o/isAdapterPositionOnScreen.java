package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class isAdapterPositionOnScreen implements onViewDetachedFromWindowlambda1, Serializable {
    public volatile Object _value;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 initializer;
    public final Object lock;

    @Override // o.onViewDetachedFromWindowlambda1
    public final Object MediaSessionCompatResultReceiverWrapper() {
        Object objInvoke;
        Object obj = this._value;
        doItemsShareIds doitemsshareids = doItemsShareIds.write;
        if (obj != doitemsshareids) {
            return obj;
        }
        synchronized (this.lock) {
            objInvoke = this._value;
            if (objInvoke == doitemsshareids) {
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.initializer;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
                objInvoke = r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                this._value = objInvoke;
                this.initializer = null;
            }
        }
        return objInvoke;
    }

    @Override // o.onViewDetachedFromWindowlambda1
    public final boolean MediaSessionCompatToken() {
        return this._value != doItemsShareIds.write;
    }

    public isAdapterPositionOnScreen(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        this.initializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this._value = doItemsShareIds.write;
        this.lock = this;
    }

    public final String toString() {
        return MediaSessionCompatToken() ? String.valueOf(MediaSessionCompatResultReceiverWrapper()) : "Lazy value not initialized yet.";
    }
}
