package androidx.compose.ui.draganddrop;

import androidx.compose.ui.Modifier;

/* JADX INFO: loaded from: classes.dex */
public interface DragAndDropManager {
    Modifier getModifier();

    boolean isInterestedTarget(DragAndDropTarget dragAndDropTarget);

    boolean isRequestDragAndDropTransferRequired();

    void registerTargetInterest(DragAndDropTarget dragAndDropTarget);

    /* JADX INFO: renamed from: requestDragAndDropTransfer-Uv8p0NA */
    void mo220requestDragAndDropTransferUv8p0NA(DragAndDropNode dragAndDropNode, long j);
}
