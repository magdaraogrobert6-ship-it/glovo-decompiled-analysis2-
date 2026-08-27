package kotlin.coroutines.jvm.internal;

import o.ShortNewsContentCardView;
import o.displayInAppMessagelambda1;
import o.displayInAppMessagelambda10;
import o.r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0 {
    private final int serializer;

    @Override // o.r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0
    public int getArity() {
        return this.serializer;
    }

    public RestrictedSuspendLambda(int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = i;
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
