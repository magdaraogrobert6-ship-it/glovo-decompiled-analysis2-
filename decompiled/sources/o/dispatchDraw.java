package o;

import kotlin.jvm.internal.Lambda;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes2.dex */
public final class dispatchDraw extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Scope read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dispatchDraw(Scope scope, int i) {
        super(0);
        this.IconCompatParcelizer = i;
        this.read = scope;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.IconCompatParcelizer;
        Scope scope = this.read;
        switch (i) {
            case 0:
                return scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(GraphicsLayerImplCompanionDefaultDrawBlock1.class), null);
            case 1:
                return scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineSpotShadowColor.class), null);
            case 2:
                return scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(isHardwareAccelerated.class), null);
            case 3:
                return scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(configureVectorPainterT4PVSW8.class), null);
            case 4:
                return scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(LayerSnapshotV21.class), null);
            case 5:
                return scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(onImageAvailable.class), null);
            case 6:
                return scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(com.deliveryhero.customerchat.fwf.FeatureFlagProvider.class), null);
            case 7:
                return scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(applyLayoutDirection.class), null);
            case 8:
                return scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(accesstoBitmap.class), null);
            default:
                return scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(invalidateChildInParent.class), null);
        }
    }
}
