package androidx.compose.ui.draganddrop;

import android.view.DragEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class DragAndDropEvent {
    public static final int $stable = 8;
    private final DragEvent dragEvent;

    public final DragEvent getDragEvent$ui() {
        return this.dragEvent;
    }

    public DragAndDropEvent(DragEvent dragEvent) {
        this.dragEvent = dragEvent;
    }
}
