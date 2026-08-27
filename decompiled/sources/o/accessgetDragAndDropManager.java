package o;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetDragAndDropManager {
    public int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ DragAndDropModifierNode serializer;
    public int write;

    public final int read(int i) {
        return this.serializer.read[this.read + i];
    }

    public final Object serializer(int i) {
        return this.serializer.IconCompatParcelizer[this.write + i];
    }

    public accessgetDragAndDropManager(DragAndDropModifierNode dragAndDropModifierNode) {
        this.serializer = dragAndDropModifierNode;
    }
}
