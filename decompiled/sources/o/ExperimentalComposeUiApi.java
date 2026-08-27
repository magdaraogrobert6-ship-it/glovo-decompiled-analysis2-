package o;

import androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;

/* JADX INFO: loaded from: classes.dex */
public final class ExperimentalComposeUiApi extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.GlobalPositionAwareModifierNode {
    public final PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer = androidx.compose.runtime.CompositionKt.serializer((Object) null, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
    public r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 write;

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        ((onShowTranslationui) this.RemoteActionCompatParcelizer).setValue(layoutCoordinates);
    }

    public ExperimentalComposeUiApi(NafathModalUiModelImpl$1.AnonymousClass2 anonymousClass2) {
        this.write = anonymousClass2;
        delegate(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new LazyLayoutPagerKt$dragDirectionDetector$1(3, this)));
    }
}
