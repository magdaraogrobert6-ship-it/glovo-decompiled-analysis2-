package o;

import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getFrameRate extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ KeepScreenOnNode write;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        float[] fArrM992unboximpl = ((androidx.compose.ui.graphics.Matrix) obj).m992unboximpl();
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = (androidx.compose.ui.layout.LayoutCoordinates) ((onShowTranslationui) ((setFrameRate) this.write).RemoteActionCompatParcelizer).getValue();
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                layoutCoordinates.mo2225transformToScreen58bKbWc(fArrM992unboximpl);
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getFrameRate(KeepScreenOnNode keepScreenOnNode) {
        super(1, TextStreamsKt.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.write = keepScreenOnNode;
    }
}
