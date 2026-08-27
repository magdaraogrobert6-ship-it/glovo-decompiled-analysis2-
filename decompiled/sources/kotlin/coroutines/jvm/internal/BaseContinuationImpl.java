package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.StrokeJoin;
import o.createFromParcel;
import o.isItemDismissable;
import o.r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseContinuationImpl implements ShortNewsContentCardView, r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg, Serializable {
    private final ShortNewsContentCardView<Object> IconCompatParcelizer;

    public final ShortNewsContentCardView<Object> getCompletion() {
        return this.IconCompatParcelizer;
    }

    public StackTraceElement getStackTraceElement() {
        return StrokeJoin.serializer(this);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // o.r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg
    public r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg getCallerFrame() {
        ShortNewsContentCardView<Object> shortNewsContentCardView = this.IconCompatParcelizer;
        if (shortNewsContentCardView instanceof r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg) {
            return (r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg) shortNewsContentCardView;
        }
        return null;
    }

    @Override // o.ShortNewsContentCardView
    public final void resumeWith(Object obj) {
        ShortNewsContentCardView<Object> shortNewsContentCardView = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) shortNewsContentCardView;
            ShortNewsContentCardView<Object> shortNewsContentCardView2 = baseContinuationImpl.IconCompatParcelizer;
            shortNewsContentCardView2.getClass();
            try {
                obj = baseContinuationImpl.invokeSuspend(obj);
                if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = new isItemDismissable(th);
            }
            baseContinuationImpl.releaseIntercepted();
            if (!(shortNewsContentCardView2 instanceof BaseContinuationImpl)) {
                shortNewsContentCardView2.resumeWith(obj);
                return;
            }
            shortNewsContentCardView = shortNewsContentCardView2;
        }
    }

    public BaseContinuationImpl(ShortNewsContentCardView shortNewsContentCardView) {
        this.IconCompatParcelizer = shortNewsContentCardView;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public ShortNewsContentCardView<createFromParcel> create(ShortNewsContentCardView<?> shortNewsContentCardView) {
        shortNewsContentCardView.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
        shortNewsContentCardView.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
