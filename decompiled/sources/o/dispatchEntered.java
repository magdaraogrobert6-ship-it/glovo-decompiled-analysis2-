package o;

/* JADX INFO: loaded from: classes.dex */
public final class dispatchEntered extends onEntered {
    public DragAndDropNodestartDragAndDropTransfer1 MediaMetadataCompat;

    @Override // o.onEntered
    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final DragAndDropNodestartDragAndDropTransfer1 serializer() {
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m = this.serializer;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1 = this.MediaMetadataCompat;
        if (requestdraganddroptransferk4lq0m != dragAndDropNodestartDragAndDropTransfer1.RemoteActionCompatParcelizer) {
            this.IconCompatParcelizer = new DragAndDropNodeonEnded1();
            dragAndDropNodestartDragAndDropTransfer1 = new DragAndDropNodestartDragAndDropTransfer1(this.serializer, read());
        }
        this.MediaMetadataCompat = dragAndDropNodestartDragAndDropTransfer1;
        return dragAndDropNodestartDragAndDropTransfer1;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof getNewPassword) ? obj2 : (setContentCaptureSessionui) super.getOrDefault((getNewPassword) obj, (setContentCaptureSessionui) obj2);
    }

    @Override // o.onEntered, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof getNewPassword) {
            return super.containsKey((getNewPassword) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof setContentCaptureSessionui) {
            return super.containsValue((setContentCaptureSessionui) obj);
        }
        return false;
    }

    @Override // o.onEntered, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof getNewPassword) {
            return (setContentCaptureSessionui) super.get((getNewPassword) obj);
        }
        return null;
    }

    @Override // o.onEntered, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof getNewPassword) {
            return (setContentCaptureSessionui) super.remove((getNewPassword) obj);
        }
        return null;
    }

    public dispatchEntered(getSizeYbymL2gui getsizeybyml2gui) {
        super(getsizeybyml2gui);
    }
}
