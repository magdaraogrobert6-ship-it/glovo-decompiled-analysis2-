package o;

/* JADX INFO: loaded from: classes.dex */
public final class getSegment extends moveTo {
    public final AndroidPathMeasure MediaMetadataCompat;
    public final DragAndDropTargetModifierNode RatingCompat;

    @Override // o.moveTo
    public final opN5in7k0 RemoteActionCompatParcelizer() {
        return new getPositiontuRUvjQ(this.MediaMetadataCompat, this.RatingCompat);
    }

    public getSegment(AndroidPathMeasure androidPathMeasure, String str, DragAndDropTargetModifierNode dragAndDropTargetModifierNode) {
        super(androidPathMeasure, str);
        this.MediaMetadataCompat = androidPathMeasure;
        this.RatingCompat = dragAndDropTargetModifierNode;
    }

    @Override // o.moveTo
    public final opN5in7k0 IconCompatParcelizer() {
        return (getPositiontuRUvjQ) super.IconCompatParcelizer();
    }
}
