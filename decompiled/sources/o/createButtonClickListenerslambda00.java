package o;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobNode;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes4.dex */
public final class createButtonClickListenerslambda00 extends JobNode {
    public final CancellableContinuationImpl IconCompatParcelizer;
    private volatile /* synthetic */ Object _disposer$volatile;
    public setAndStartAnimation serializer;
    public final /* synthetic */ createClickListenerlambda0 write;
    public static final /* synthetic */ AtomicReferenceFieldUpdater read = AtomicReferenceFieldUpdater.newUpdater(createButtonClickListenerslambda00.class, Object.class, "_disposer$volatile");
    public static final /* synthetic */ long RemoteActionCompatParcelizer = markOnScreenCardsAsRead.serializer.objectFieldOffset(createButtonClickListenerslambda00.class.getDeclaredField("_disposer$volatile"));

    @Override // kotlinx.coroutines.JobNode
    public final void write(Throwable th) {
        CancellableContinuationImpl cancellableContinuationImpl = this.IconCompatParcelizer;
        if (th != null) {
            Symbol symbolIconCompatParcelizer = cancellableContinuationImpl.IconCompatParcelizer(new getClosingAnimation(th, false), null);
            if (symbolIconCompatParcelizer != null) {
                cancellableContinuationImpl.serializer(symbolIconCompatParcelizer);
                addInAppMessageViewToViewGroup addinappmessageviewtoviewgroupIconCompatParcelizer = IconCompatParcelizer();
                if (addinappmessageviewtoviewgroupIconCompatParcelizer != null) {
                    addinappmessageviewtoviewgroupIconCompatParcelizer.read();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = createClickListenerlambda0.RemoteActionCompatParcelizer;
        createClickListenerlambda0 createclicklistenerlambda0 = this.write;
        if (atomicIntegerFieldUpdater.decrementAndGet(createclicklistenerlambda0) == 0) {
            getOpeningAnimation[] getopeninganimationArr = createclicklistenerlambda0.IconCompatParcelizer;
            ArrayList arrayList = new ArrayList(getopeninganimationArr.length);
            for (getOpeningAnimation getopeninganimation : getopeninganimationArr) {
                arrayList.add(getopeninganimation.read());
            }
            cancellableContinuationImpl.resumeWith(arrayList);
        }
    }

    @Override // kotlinx.coroutines.JobNode
    public final boolean write() {
        return false;
    }

    public createButtonClickListenerslambda00(createClickListenerlambda0 createclicklistenerlambda0, CancellableContinuationImpl cancellableContinuationImpl) {
        this.write = createclicklistenerlambda0;
        this.IconCompatParcelizer = cancellableContinuationImpl;
    }

    public final addInAppMessageViewToViewGroup IconCompatParcelizer() {
        read.getClass();
        return (addInAppMessageViewToViewGroup) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, RemoteActionCompatParcelizer);
    }

    public final void serializer(addInAppMessageViewToViewGroup addinappmessageviewtoviewgroup) {
        read.getClass();
        markOnScreenCardsAsRead.serializer.putObjectVolatile(this, RemoteActionCompatParcelizer, addinappmessageviewtoviewgroup);
    }
}
