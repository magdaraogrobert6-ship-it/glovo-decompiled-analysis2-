package androidx.compose.ui.draganddrop;

/* JADX INFO: loaded from: classes.dex */
public interface DragAndDropTarget {
    default void onChanged(DragAndDropEvent dragAndDropEvent) {
    }

    boolean onDrop(DragAndDropEvent dragAndDropEvent);

    default void onEnded(DragAndDropEvent dragAndDropEvent) {
    }

    default void onEntered(DragAndDropEvent dragAndDropEvent) {
    }

    default void onExited(DragAndDropEvent dragAndDropEvent) {
    }

    default void onMoved(DragAndDropEvent dragAndDropEvent) {
    }

    default void onStarted(DragAndDropEvent dragAndDropEvent) {
    }
}
