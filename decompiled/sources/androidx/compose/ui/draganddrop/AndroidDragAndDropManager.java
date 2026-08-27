package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.accessemitExit;
import o.cancelPendingWebViewPause;
import o.createnHHXs2Y;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidDragAndDropManager implements View.OnDragListener, DragAndDropManager {
    public static final int $stable = 8;
    private final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY startDrag;
    private final DragAndDropNode rootDragAndDropNode = new DragAndDropNode(null, null, 3, null);
    private final createnHHXs2Y interestedTargets = new createnHHXs2Y(0);
    private final Modifier modifier = new ModifierNodeElement<DragAndDropNode>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(DragAndDropNode dragAndDropNode) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public DragAndDropNode create() {
            return this.this$0.rootDragAndDropNode;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return this.this$0.rootDragAndDropNode.hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootDragAndDropNode");
        }
    };

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public boolean isRequestDragAndDropTransferRequired() {
        return true;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public boolean isInterestedTarget(DragAndDropTarget dragAndDropTarget) {
        return this.interestedTargets.contains(dragAndDropTarget);
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent dragEvent) {
        DragAndDropEvent dragAndDropEvent = new DragAndDropEvent(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean zAcceptDragAndDropTransfer = this.rootDragAndDropNode.acceptDragAndDropTransfer(dragAndDropEvent);
                createnHHXs2Y createnhhxs2y = this.interestedTargets;
                createnhhxs2y.getClass();
                accessemitExit accessemitexit = new accessemitExit(createnhhxs2y);
                while (accessemitexit.hasNext()) {
                    ((DragAndDropTarget) accessemitexit.next()).onStarted(dragAndDropEvent);
                }
                return zAcceptDragAndDropTransfer;
            case 2:
                this.rootDragAndDropNode.onMoved(dragAndDropEvent);
                return false;
            case 3:
                return this.rootDragAndDropNode.onDrop(dragAndDropEvent);
            case 4:
                this.rootDragAndDropNode.onEnded(dragAndDropEvent);
                this.interestedTargets.clear();
                return false;
            case 5:
                this.rootDragAndDropNode.onEntered(dragAndDropEvent);
                return false;
            case 6:
                this.rootDragAndDropNode.onExited(dragAndDropEvent);
                return false;
            default:
                return false;
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public void registerTargetInterest(DragAndDropTarget dragAndDropTarget) {
        this.interestedTargets.add(dragAndDropTarget);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    /* JADX INFO: renamed from: requestDragAndDropTransfer-Uv8p0NA, reason: not valid java name */
    public void mo220requestDragAndDropTransferUv8p0NA(DragAndDropNode dragAndDropNode, long j) {
        final cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
        dragAndDropNode.m226startDragAndDropTransferd4ec7I(new DragAndDropStartTransferScope() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$requestDragAndDropTransfer$dragAndDropSourceScope$1
            @Override // androidx.compose.ui.draganddrop.DragAndDropStartTransferScope
            /* JADX INFO: renamed from: startDragAndDropTransfer-12SF9DM, reason: not valid java name */
            public boolean mo221startDragAndDropTransfer12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
                cancelpendingwebviewpause.IconCompatParcelizer = ((Boolean) this.startDrag.invoke(dragAndDropTransferData, Size.m534boximpl(j2), r8lambdaunavo3sxub_pc9xroryotnrlvsm)).booleanValue();
                return cancelpendingwebviewpause.IconCompatParcelizer;
            }
        }, j, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$requestDragAndDropTransfer$1$1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Boolean invoke() {
                return Boolean.valueOf(cancelpendingwebviewpause.IconCompatParcelizer);
            }

            {
                super(0);
            }
        });
    }

    public AndroidDragAndDropManager(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        this.startDrag = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }
}
