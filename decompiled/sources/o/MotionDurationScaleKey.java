package o;

/* JADX INFO: loaded from: classes.dex */
public final class MotionDurationScaleKey implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ sensitiveContentdefault IconCompatParcelizer;
    public final /* synthetic */ float MediaBrowserCompatMediaItem;
    public final /* synthetic */ float MediaDescriptionCompat;
    public final /* synthetic */ boolean MediaMetadataCompat;
    public final /* synthetic */ float MediaSessionCompatQueueItem;
    public final /* synthetic */ float PlaybackStateCompat;
    public final /* synthetic */ androidx.compose.ui.graphics.Shape RatingCompat;
    public final /* synthetic */ DragAndDropTargetModifierNode RemoteActionCompatParcelizer;
    public final /* synthetic */ DragAndDropTargetModifierNode read;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ long write;

    public MotionDurationScaleKey(sensitiveContentdefault sensitivecontentdefault, float f, float f2, boolean z, androidx.compose.ui.graphics.Shape shape, long j, long j2, float f3, float f4, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, DragAndDropTargetModifierNode dragAndDropTargetModifierNode2) {
        this.IconCompatParcelizer = sensitivecontentdefault;
        this.MediaDescriptionCompat = f;
        this.MediaSessionCompatQueueItem = f2;
        this.MediaMetadataCompat = z;
        this.RatingCompat = shape;
        this.write = j;
        this.serializer = j2;
        this.PlaybackStateCompat = f3;
        this.MediaBrowserCompatMediaItem = f4;
        this.RemoteActionCompatParcelizer = dragAndDropTargetModifierNode;
        this.read = dragAndDropTargetModifierNode2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Number) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.material3.BottomSheetScaffoldKt.write(this.IconCompatParcelizer.write, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem, this.MediaMetadataCompat, this.RatingCompat, this.write, this.serializer, this.PlaybackStateCompat, this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer, this.read, getpostalcode, 0, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }
}
