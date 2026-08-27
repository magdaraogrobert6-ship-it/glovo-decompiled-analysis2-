package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class divBz7bX_o implements timesBz7bX_o {
    public static final divBz7bX_o write = new divBz7bX_o(1);
    public final /* synthetic */ int serializer;

    public /* synthetic */ divBz7bX_o(int i) {
        this.serializer = i;
    }

    @Override // o.timesBz7bX_o
    public final lerp3Ry4LBc read(Class cls) {
        if (this.serializer == 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (isBetterCandidate_I7lrPNgminorAxisDistance.class.isAssignableFrom(cls)) {
            try {
                return (lerp3Ry4LBc) isBetterCandidate_I7lrPNgminorAxisDistance.RemoteActionCompatParcelizer(cls.asSubclass(isBetterCandidate_I7lrPNgminorAxisDistance.class)).IconCompatParcelizer(isBetterCandidate_I7lrPNgweightedDistance.BUILD_MESSAGE_INFO);
            } catch (Exception e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unsupported message type: ".concat(cls.getName()));
        }
        return null;
    }

    @Override // o.timesBz7bX_o
    public final boolean serializer(Class cls) {
        if (this.serializer != 0) {
            return isBetterCandidate_I7lrPNgminorAxisDistance.class.isAssignableFrom(cls);
        }
        return false;
    }
}
