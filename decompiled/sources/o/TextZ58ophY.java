package o;

import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class TextZ58ophY extends SheetDefaultsKtConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection1 {
    public TooltipKt RemoteActionCompatParcelizer;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;

    @Override // o.ScaffoldKt, androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        View viewRequireView = androidx.compose.ui.node.DelegatableNode_androidKt.requireView(this);
        WeakHashMap weakHashMap = TooltipKt.serializer;
        TooltipKt tooltipKt = setRoundRectOutlineTNW_H78default.read(viewRequireView);
        tooltipKt.RemoteActionCompatParcelizer(viewRequireView);
        TooltipDefaults tooltipDefaults = (TooltipDefaults) this.read.invoke(tooltipKt);
        Object[] objArr = {tooltipDefaults, this.IconCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            this.IconCompatParcelizer = tooltipDefaults;
            IconCompatParcelizer();
        }
        this.RemoteActionCompatParcelizer = tooltipKt;
        super.onAttach();
    }

    @Override // o.ScaffoldKt, androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        View viewRequireView = androidx.compose.ui.node.DelegatableNode_androidKt.requireView(this);
        TooltipKt tooltipKt = this.RemoteActionCompatParcelizer;
        if (tooltipKt != null) {
            int i = tooltipKt.read - 1;
            tooltipKt.read = i;
            if (i == 0) {
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                accessgetCancelcp.write(viewRequireView, null);
                FocusPropertiesNode.read(viewRequireView, (WindowInsetsAnimationCompat$Callback) null);
                viewRequireView.removeOnAttachStateChangeListener(tooltipKt.MediaSessionCompatToken);
            }
        }
        super.onDetach();
    }

    public TextZ58ophY(TooltipDefaults tooltipDefaults) {
        super(tooltipDefaults);
    }
}
