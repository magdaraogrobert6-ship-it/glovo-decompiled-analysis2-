package o;

/* JADX INFO: loaded from: classes.dex */
public final class CoreTextFieldKtTextFieldCursorHandle21 implements PlatformSelectionBehaviorsImpl {
    public final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableNode serializer;
    public final /* synthetic */ HeightInLinesNode write;

    @Override // o.PlatformSelectionBehaviorsImpl
    public final float read(float f) {
        androidx.compose.foundation.gestures.AnchoredDraggableNode anchoredDraggableNode = this.serializer;
        float fIconCompatParcelizer = anchoredDraggableNode.RemoteActionCompatParcelizer.IconCompatParcelizer(f);
        float fRemoteActionCompatParcelizer = anchoredDraggableNode.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        this.write.read(fIconCompatParcelizer, 0.0f);
        return fIconCompatParcelizer - fRemoteActionCompatParcelizer;
    }

    public CoreTextFieldKtTextFieldCursorHandle21(androidx.compose.foundation.gestures.AnchoredDraggableNode anchoredDraggableNode, HeightInLinesNode heightInLinesNode) {
        this.serializer = anchoredDraggableNode;
        this.write = heightInLinesNode;
    }
}
