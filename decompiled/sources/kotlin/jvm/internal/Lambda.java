package kotlin.jvm.internal;

import java.io.Serializable;
import o.displayInAppMessagelambda1;
import o.displayInAppMessagelambda10;
import o.r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Lambda implements r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0, Serializable {
    private final int serializer;

    @Override // o.r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0
    public int getArity() {
        return this.serializer;
    }

    public String toString() {
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        return displayInAppMessagelambda10.serializer(this);
    }

    public Lambda(int i) {
        this.serializer = i;
    }
}
