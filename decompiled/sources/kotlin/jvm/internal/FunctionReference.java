package kotlin.jvm.internal;

import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.pauseWebviewIfNecessarylambda11;
import o.r8lambdaRW1_n_nU4xArBI_btXJxixXwtrI;
import o.r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FunctionReference extends CallableReference implements r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0, registerInAppMessageManagerlambda0 {
    private final int serializer;

    @Override // o.r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0
    public int getArity() {
        return this.serializer;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public pauseWebviewIfNecessarylambda11 computeReflected() {
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            if (getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature())) {
                Object[] objArr = {getBoundReceiver(), functionReference.getBoundReceiver()};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    Object[] objArr2 = {getOwner(), functionReference.getOwner()};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (obj instanceof registerInAppMessageManagerlambda0) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // o.registerInAppMessageManagerlambda0
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // o.registerInAppMessageManagerlambda0
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // o.registerInAppMessageManagerlambda0
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // o.registerInAppMessageManagerlambda0
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, o.pauseWebviewIfNecessarylambda11
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    @Override // kotlin.jvm.internal.CallableReference
    public registerInAppMessageManagerlambda0 getReflected() {
        pauseWebviewIfNecessarylambda11 pausewebviewifnecessarylambda11Compute = compute();
        if (pausewebviewifnecessarylambda11Compute != this) {
            return (registerInAppMessageManagerlambda0) pausewebviewifnecessarylambda11Compute;
        }
        throw new r8lambdaRW1_n_nU4xArBI_btXJxixXwtrI();
    }

    public String toString() {
        pauseWebviewIfNecessarylambda11 pausewebviewifnecessarylambda11Compute = compute();
        if (pausewebviewifnecessarylambda11Compute != this) {
            return pausewebviewifnecessarylambda11Compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    public FunctionReference(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.serializer = i;
    }
}
