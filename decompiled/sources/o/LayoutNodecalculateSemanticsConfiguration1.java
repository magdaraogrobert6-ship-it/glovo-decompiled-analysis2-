package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutNodecalculateSemanticsConfiguration1 implements getCanvasDrawScope {
    public static final LayoutNodecalculateSemanticsConfiguration1 read = new LayoutNodecalculateSemanticsConfiguration1(1);
    public final /* synthetic */ int write;

    public /* synthetic */ LayoutNodecalculateSemanticsConfiguration1(int i) {
        this.write = i;
    }

    @Override // o.getCanvasDrawScope
    public final getDetachedFromParentLookaheadPlacementui IconCompatParcelizer(Class cls) {
        if (this.write == 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            try {
                return (getDetachedFromParentLookaheadPlacementui) GeneratedMessageLite.RemoteActionCompatParcelizer(cls.asSubclass(GeneratedMessageLite.class)).RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1.BUILD_MESSAGE_INFO);
            } catch (Exception e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unsupported message type: ".concat(cls.getName()));
        }
        return null;
    }

    @Override // o.getCanvasDrawScope
    public final boolean serializer(Class cls) {
        if (this.write != 0) {
            return GeneratedMessageLite.class.isAssignableFrom(cls);
        }
        return false;
    }
}
