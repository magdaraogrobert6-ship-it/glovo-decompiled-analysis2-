package o;

import com.roadrunner.overlay.bubble.banner.presentation.OverlayVisibilityBannerUiModelImpl;
import com.sentiance.core.model.events.C$b;
import io.grpc.internal.CallTracer;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class drawPainter {
    private static int read = 0;
    private static int serializer = 1;
    public final CallTracer write;

    public drawPainter(CallTracer callTracer) {
        this.write = callTracer;
    }

    public final OverlayVisibilityBannerUiModelImpl IconCompatParcelizer(ContextScope contextScope) {
        int i = 2 % 2;
        BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5 = new BrazeExternalSyntheticLambda5(4);
        CallTracer callTracer = this.write;
        OverlayVisibilityBannerUiModelImpl overlayVisibilityBannerUiModelImpl = new OverlayVisibilityBannerUiModelImpl(brazeExternalSyntheticLambda5, contextScope, (C$b) ((r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I) callTracer.RemoteActionCompatParcelizer).write(), (CrossfadePainter) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) callTracer.write).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) callTracer.serializer).write(), (setTransactionSuccessful) ((mergeJsonObjects) callTracer.IconCompatParcelizer).write());
        int i2 = read + 27;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return overlayVisibilityBannerUiModelImpl;
        }
        throw null;
    }
}
