package o;

/* JADX INFO: loaded from: classes.dex */
public final class HeightInLinesNode {
    public Object IconCompatParcelizer;
    public float RemoteActionCompatParcelizer = Float.NaN;
    public final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState read;
    public Object write;

    public final void read(float f, float f2) {
        androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState = this.read;
        float fRemoteActionCompatParcelizer = anchoredDraggableState.RemoteActionCompatParcelizer();
        ((getContentCaptureSessionui) anchoredDraggableState.RatingCompat).IconCompatParcelizer(f);
        ((getContentCaptureSessionui) anchoredDraggableState.MediaBrowserCompatMediaItem).IconCompatParcelizer(f2);
        if (Float.isNaN(fRemoteActionCompatParcelizer)) {
            return;
        }
        boolean z = f >= fRemoteActionCompatParcelizer;
        TextFieldCursor_androidKt textFieldCursor_androidKtIconCompatParcelizer = anchoredDraggableState.IconCompatParcelizer();
        onShowTranslationui onshowtranslationui = (onShowTranslationui) anchoredDraggableState.IconCompatParcelizer;
        if (anchoredDraggableState.RemoteActionCompatParcelizer() == textFieldCursor_androidKtIconCompatParcelizer.serializer(onshowtranslationui.getValue())) {
            Object objSerializer = anchoredDraggableState.IconCompatParcelizer().serializer(anchoredDraggableState.RemoteActionCompatParcelizer() + (z ? 1.0f : -1.0f), z);
            if (objSerializer == null) {
                objSerializer = onshowtranslationui.getValue();
            }
            if (z) {
                this.write = onshowtranslationui.getValue();
                this.IconCompatParcelizer = objSerializer;
            } else {
                this.write = objSerializer;
                this.IconCompatParcelizer = onshowtranslationui.getValue();
            }
        } else {
            Object objSerializer2 = anchoredDraggableState.IconCompatParcelizer().serializer(anchoredDraggableState.RemoteActionCompatParcelizer(), false);
            if (objSerializer2 == null) {
                objSerializer2 = onshowtranslationui.getValue();
            }
            Object objSerializer3 = anchoredDraggableState.IconCompatParcelizer().serializer(anchoredDraggableState.RemoteActionCompatParcelizer(), true);
            if (objSerializer3 == null) {
                objSerializer3 = onshowtranslationui.getValue();
            }
            this.write = objSerializer2;
            this.IconCompatParcelizer = objSerializer3;
        }
        TextFieldCursor_androidKt textFieldCursor_androidKtIconCompatParcelizer2 = anchoredDraggableState.IconCompatParcelizer();
        Object obj = this.write;
        obj.getClass();
        float fSerializer = textFieldCursor_androidKtIconCompatParcelizer2.serializer(obj);
        TextFieldCursor_androidKt textFieldCursor_androidKtIconCompatParcelizer3 = anchoredDraggableState.IconCompatParcelizer();
        Object obj2 = this.IconCompatParcelizer;
        obj2.getClass();
        this.RemoteActionCompatParcelizer = Math.abs(fSerializer - textFieldCursor_androidKtIconCompatParcelizer3.serializer(obj2));
        if (Math.abs(anchoredDraggableState.RemoteActionCompatParcelizer() - anchoredDraggableState.IconCompatParcelizer().serializer(onshowtranslationui.getValue())) >= this.RemoteActionCompatParcelizer / 2.0f) {
            Object value = z ? this.IconCompatParcelizer : this.write;
            if (value == null) {
                value = onshowtranslationui.getValue();
            }
            if (((Boolean) anchoredDraggableState.serializer.invoke(value)).booleanValue()) {
                anchoredDraggableState.RemoteActionCompatParcelizer(value);
            }
        }
    }

    public HeightInLinesNode(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState) {
        this.read = anchoredDraggableState;
    }
}
