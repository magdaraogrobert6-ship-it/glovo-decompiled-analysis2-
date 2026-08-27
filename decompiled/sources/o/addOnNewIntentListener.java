package o;

import android.view.View;
import android.view.ViewGroup;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import io.sentry.util.UrlUtils;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class addOnNewIntentListener {
    public static final ViewGroup.LayoutParams RemoteActionCompatParcelizer = new ViewGroup.LayoutParams(-2, -2);

    public static void RemoteActionCompatParcelizer(androidx.activity.ComponentActivity componentActivity, DragAndDropTargetModifierNode dragAndDropTargetModifierNode) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        androidx.compose.ui.platform.ComposeView composeView = childAt instanceof androidx.compose.ui.platform.ComposeView ? (androidx.compose.ui.platform.ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(dragAndDropTargetModifierNode);
            return;
        }
        androidx.compose.ui.platform.ComposeView composeView2 = new androidx.compose.ui.platform.ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(dragAndDropTargetModifierNode);
        View decorView = componentActivity.getWindow().getDecorView();
        if (((accessisRenderNodeCompatiblecp) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1819368283, -1819368281, getCieXyz.write(), getCieXyz.write(), new Object[]{decorView}, getCieXyz.write())) == null) {
            decorView.setTag(com.logistics.rider.glovo.R.id.view_tree_lifecycle_owner, componentActivity);
        }
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        if (((asFrameworkPaint) BuildersKt.IconCompatParcelizer(-1340292176, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), 1340292178, new Object[]{decorView}, iRemoteActionCompatParcelizer)) == null) {
            decorView.setTag(com.logistics.rider.glovo.R.id.view_tree_view_model_store_owner, componentActivity);
        }
        if (UrlUtils.RemoteActionCompatParcelizer(decorView) == null) {
            decorView.setTag(com.logistics.rider.glovo.R.id.view_tree_saved_state_registry_owner, componentActivity);
        }
        componentActivity.setContentView(composeView2, RemoteActionCompatParcelizer);
    }
}
