package o;

/* JADX INFO: loaded from: classes.dex */
public final class minusKey implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ float MediaBrowserCompatMediaItem;
    public final /* synthetic */ float MediaDescriptionCompat;
    public final /* synthetic */ float MediaMetadataCompat;
    public final /* synthetic */ androidx.compose.ui.graphics.Shape MediaSessionCompatQueueItem;
    public final /* synthetic */ float MediaSessionCompatResultReceiverWrapper;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY PlaybackStateCompat;
    public final /* synthetic */ boolean RatingCompat;
    public final /* synthetic */ sensitiveContentdefault RemoteActionCompatParcelizer;
    public final /* synthetic */ DragAndDropTargetModifierNode read;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ DragAndDropTargetModifierNode write;

    public minusKey(sensitiveContentdefault sensitivecontentdefault, float f, float f2, boolean z, androidx.compose.ui.graphics.Shape shape, long j, long j2, float f3, float f4, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, DragAndDropTargetModifierNode dragAndDropTargetModifierNode2, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        this.RemoteActionCompatParcelizer = sensitivecontentdefault;
        this.MediaDescriptionCompat = f;
        this.MediaBrowserCompatMediaItem = f2;
        this.RatingCompat = z;
        this.MediaSessionCompatQueueItem = shape;
        this.IconCompatParcelizer = j;
        this.serializer = j2;
        this.MediaSessionCompatResultReceiverWrapper = f3;
        this.MediaMetadataCompat = f4;
        this.read = dragAndDropTargetModifierNode;
        this.write = dragAndDropTargetModifierNode2;
        this.PlaybackStateCompat = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Number) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            sensitiveContentdefault sensitivecontentdefault = this.RemoteActionCompatParcelizer;
            androidx.compose.material3.SheetState sheetState = sensitivecontentdefault.write;
            DragAndDropTargetModifierNode dragAndDropTargetModifierNodeWrite = coil3.ExtrasKt.write(-519581786, new R(this.MediaDescriptionCompat), getpostalcode);
            DragAndDropTargetModifierNode dragAndDropTargetModifierNodeWrite2 = coil3.ExtrasKt.write(-815624571, new MotionDurationScaleKey(this.RemoteActionCompatParcelizer, this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem, this.RatingCompat, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, this.serializer, this.MediaSessionCompatResultReceiverWrapper, this.MediaMetadataCompat, this.read, this.write), getpostalcode);
            DragAndDropTargetModifierNode dragAndDropTargetModifierNodeWrite3 = coil3.ExtrasKt.write(-1111667356, new AndroidPath_androidKtWhenMappings(this.PlaybackStateCompat, 1, sensitivecontentdefault), getpostalcode);
            boolean z = getpostalcode.read(sensitivecontentdefault);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new AndroidAutofillType_androidKt(2, sensitivecontentdefault);
                getpostalcode.write(objComponentActivity);
            }
            androidx.compose.material3.BottomSheetScaffoldKt.BottomSheetScaffoldLayout(dragAndDropTargetModifierNodeWrite, dragAndDropTargetModifierNodeWrite2, dragAndDropTargetModifierNodeWrite3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, sheetState, getpostalcode, 3504);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }
}
