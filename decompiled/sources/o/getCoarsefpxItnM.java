package o;

/* JADX INFO: loaded from: classes.dex */
public final class getCoarsefpxItnM {
    public final Object read;
    public final DragAndDropTargetModifierNode write;

    public getCoarsefpxItnM(setRootAutofillId setrootautofillid, DragAndDropTargetModifierNode dragAndDropTargetModifierNode) {
        this.read = setrootautofillid;
        this.write = dragAndDropTargetModifierNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getCoarsefpxItnM) {
            getCoarsefpxItnM getcoarsefpxitnm = (getCoarsefpxItnM) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getcoarsefpxitnm.read}, getCieXyz.write())).booleanValue() && this.write == getcoarsefpxitnm.write;
        }
        return false;
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.read + ", transition=" + this.write + ')';
    }

    public final int hashCode() {
        Object obj = this.read;
        return this.write.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
