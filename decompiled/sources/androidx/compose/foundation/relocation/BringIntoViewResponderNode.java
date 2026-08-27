package androidx.compose.foundation.relocation;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import bo.app.n$$ExternalSyntheticLambda3;
import com.mapbox.navigation.core.reroute.MapboxRerouteController$rerouteInternal$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.YieldKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class BringIntoViewResponderNode extends Modifier.Node implements BringIntoViewModifierNode, LayoutAwareModifierNode {
    public ContentInViewNode IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // androidx.compose.ui.relocation.BringIntoViewModifierNode
    public final Object bringIntoView(LayoutCoordinates layoutCoordinates, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCoroutineScope = YieldKt.coroutineScope(new MapboxRerouteController$rerouteInternal$2(this, layoutCoordinates, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, new n$$ExternalSyntheticLambda3(this, layoutCoordinates, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 4), (ShortNewsContentCardView) null, 1), shortNewsContentCardView);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : createFromParcel.INSTANCE;
    }

    public static final Rect IconCompatParcelizer(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        Rect rect;
        if (bringIntoViewResponderNode.isAttached() && bringIntoViewResponderNode.RemoteActionCompatParcelizer) {
            LayoutCoordinates layoutCoordinatesRequireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(bringIntoViewResponderNode);
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null && (rect = (Rect) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()) != null) {
                return rect.m514translatek4lQ0M(layoutCoordinatesRequireLayoutCoordinates.localBoundingBoxOf(layoutCoordinates, false).m512getTopLeftF1C5BW0());
            }
        }
        return null;
    }
}
