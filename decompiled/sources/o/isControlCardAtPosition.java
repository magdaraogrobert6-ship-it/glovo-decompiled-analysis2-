package o;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class isControlCardAtPosition implements onViewDetachedFromWindowlambda1, Serializable {
    public static final AtomicReferenceFieldUpdater read = AtomicReferenceFieldUpdater.newUpdater(isControlCardAtPosition.class, Object.class, "serializer");
    public static final /* synthetic */ long write = markOnScreenCardsAsRead.serializer.objectFieldOffset(isControlCardAtPosition.class.getDeclaredField("serializer"));
    public volatile r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public volatile Object serializer;

    @Override // o.onViewDetachedFromWindowlambda1
    public final Object MediaSessionCompatResultReceiverWrapper() {
        Unsafe unsafe;
        long j;
        Object obj = this.serializer;
        doItemsShareIds doitemsshareids = doItemsShareIds.write;
        if (obj != doitemsshareids) {
            return obj;
        }
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.IconCompatParcelizer;
        if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
            Object objInvoke = r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = read;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe = markOnScreenCardsAsRead.serializer;
                j = write;
                if (unsafe.compareAndSwapObject(this, j, doitemsshareids, objInvoke)) {
                    this.IconCompatParcelizer = null;
                    return objInvoke;
                }
            } while (unsafe.getObjectVolatile(this, j) == doitemsshareids);
        }
        return this.serializer;
    }

    @Override // o.onViewDetachedFromWindowlambda1
    public final boolean MediaSessionCompatToken() {
        return this.serializer != doItemsShareIds.write;
    }

    public final String toString() {
        return MediaSessionCompatToken() ? String.valueOf(MediaSessionCompatResultReceiverWrapper()) : "Lazy value not initialized yet.";
    }
}
