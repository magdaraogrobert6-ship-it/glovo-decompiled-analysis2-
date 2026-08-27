package kotlin.jvm.internal;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import o.getCieXyz;
import o.pauseWebviewIfNecessarylambda11;
import o.r8lambdaRW1_n_nU4xArBI_btXJxixXwtrI;
import o.registerInAppMessageManagerlambda2;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PropertyReference extends CallableReference implements registerInAppMessageManagerlambda2 {
    private final boolean RemoteActionCompatParcelizer;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            if (getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature())) {
                Object[] objArr = {getBoundReceiver(), propertyReference.getBoundReceiver()};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        if (obj instanceof registerInAppMessageManagerlambda2) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public registerInAppMessageManagerlambda2 getReflected() {
        if (this.RemoteActionCompatParcelizer) {
            IBraze$$ExternalSyntheticBUOutline0.m("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        pauseWebviewIfNecessarylambda11 pausewebviewifnecessarylambda11Compute = compute();
        if (pausewebviewifnecessarylambda11Compute != this) {
            return (registerInAppMessageManagerlambda2) pausewebviewifnecessarylambda11Compute;
        }
        throw new r8lambdaRW1_n_nU4xArBI_btXJxixXwtrI();
    }

    public int hashCode() {
        int iHashCode = getOwner().hashCode();
        return getSignature().hashCode() + ((getName().hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // o.registerInAppMessageManagerlambda2
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // o.registerInAppMessageManagerlambda2
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    @Override // kotlin.jvm.internal.CallableReference
    public pauseWebviewIfNecessarylambda11 compute() {
        return this.RemoteActionCompatParcelizer ? this : super.compute();
    }

    public String toString() {
        pauseWebviewIfNecessarylambda11 pausewebviewifnecessarylambda11Compute = compute();
        if (pausewebviewifnecessarylambda11Compute != this) {
            return pausewebviewifnecessarylambda11Compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.RemoteActionCompatParcelizer = (i & 2) == 2;
    }
}
