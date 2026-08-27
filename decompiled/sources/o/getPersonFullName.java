package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class getPersonFullName {
    public static final populate RemoteActionCompatParcelizer(float f) {
        return new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(f);
    }

    public static final Object write(DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1, getNewPassword getnewpassword) {
        getnewpassword.getClass();
        Object objIconCompatParcelizer = dragAndDropNodestartDragAndDropTransfer1.get(getnewpassword);
        if (objIconCompatParcelizer == null) {
            objIconCompatParcelizer = getnewpassword.IconCompatParcelizer();
        }
        return ((setContentCaptureSessionui) objIconCompatParcelizer).serializer(dragAndDropNodestartDragAndDropTransfer1);
    }

    public static final DragAndDropNodestartDragAndDropTransfer1 RemoteActionCompatParcelizer(hideTranslatedText[] hidetranslatedtextArr, DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1, DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer2) {
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer3 = DragAndDropNodestartDragAndDropTransfer1.IconCompatParcelizer;
        dispatchEntered dispatchentered = new dispatchEntered(dragAndDropNodestartDragAndDropTransfer3);
        dispatchentered.MediaMetadataCompat = dragAndDropNodestartDragAndDropTransfer3;
        for (hideTranslatedText hidetranslatedtext : hidetranslatedtextArr) {
            androidx.compose.runtime.ProvidableCompositionLocal providableCompositionLocal = hidetranslatedtext.read;
            if (hidetranslatedtext.write || !dragAndDropNodestartDragAndDropTransfer1.containsKey(providableCompositionLocal)) {
                dispatchentered.put(providableCompositionLocal, providableCompositionLocal.write(hidetranslatedtext, (setContentCaptureSessionui) dragAndDropNodestartDragAndDropTransfer2.get(providableCompositionLocal)));
            }
        }
        return dispatchentered.IconCompatParcelizer();
    }
}
