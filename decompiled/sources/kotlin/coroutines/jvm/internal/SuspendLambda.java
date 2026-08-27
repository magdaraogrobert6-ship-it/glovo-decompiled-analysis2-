package kotlin.coroutines.jvm.internal;

import o.ShortNewsContentCardView;
import o.displayInAppMessagelambda1;
import o.displayInAppMessagelambda10;
import o.r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SuspendLambda extends ContinuationImpl implements r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0 {
    private final int read;

    @Override // o.r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0
    public int getArity() {
        return this.read;
    }

    public SuspendLambda(int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        return displayInAppMessagelambda10.serializer(this);
    }
}
