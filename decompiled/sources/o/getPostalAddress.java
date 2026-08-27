package o;

/* JADX INFO: loaded from: classes.dex */
public final class getPostalAddress implements setContentCaptureSessionui {
    public final PopulateViewStructure_androidKtpopulate7 serializer;

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // o.setContentCaptureSessionui
    public final Object serializer(DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1) {
        return ((onShowTranslationui) this.serializer).getValue();
    }

    public getPostalAddress(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7) {
        this.serializer = populateViewStructure_androidKtpopulate7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getPostalAddress) && this.serializer == ((getPostalAddress) obj).serializer;
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.serializer + ')';
    }
}
