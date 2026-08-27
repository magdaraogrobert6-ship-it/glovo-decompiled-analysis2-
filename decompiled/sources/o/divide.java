package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class divide implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaBrowserCompatMediaItem;
    public final /* synthetic */ androidx.compose.ui.Alignment MediaDescriptionCompat;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaSessionCompatQueueItem;
    public final /* synthetic */ Object MediaSessionCompatResultReceiverWrapper;
    public final /* synthetic */ Object ParcelableVolumeInfo;
    public final /* synthetic */ int PlaybackStateCompatCustomAction;
    public final /* synthetic */ androidx.compose.ui.Modifier RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ isInvalidIndex serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ divide(relativeMoveTo relativemoveto, String str, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5, int i, int i2, int i3) {
        this.RemoteActionCompatParcelizer = relativemoveto;
        this.read = str;
        this.RatingCompat = modifier;
        this.MediaDescriptionCompat = alignment;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.ParcelableVolumeInfo = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        this.MediaSessionCompatResultReceiverWrapper = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm5;
        this.PlaybackStateCompatCustomAction = i;
        this.write = i2;
        this.MediaMetadataCompat = i3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = this.write;
        isInvalidIndex isinvalidindex = this.serializer;
        Object obj3 = this.MediaSessionCompatResultReceiverWrapper;
        Object obj4 = this.ParcelableVolumeInfo;
        Object obj5 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(this.PlaybackStateCompatCustomAction | 1);
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
            throwIllegalStateException.read((relativeMoveTo) obj5, this.read, this.RatingCompat, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem, this.MediaBrowserCompatMediaItem, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, this.MediaMetadataCompat);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1);
        int iRemoteActionCompatParcelizer4 = ContentType_androidKt.RemoteActionCompatParcelizer(this.MediaMetadataCompat);
        coil3.compose.SubcomposeAsyncImageKt.m3982SubcomposeAsyncImagegl8XCv8((updatePathdefault) obj5, this.read, this.RatingCompat, this.MediaSessionCompatQueueItem, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat, (androidx.compose.ui.layout.ContentScale) obj4, (androidx.compose.ui.graphics.ColorFilter) obj3, this.PlaybackStateCompatCustomAction, (DragAndDropTargetModifierNode) isinvalidindex, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer4);
        return createfromparcel;
    }

    public /* synthetic */ divide(updatePathdefault updatepathdefault, String str, androidx.compose.ui.Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i2, int i3) {
        this.RemoteActionCompatParcelizer = updatepathdefault;
        this.read = str;
        this.RatingCompat = modifier;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.MediaDescriptionCompat = alignment;
        this.ParcelableVolumeInfo = contentScale;
        this.MediaSessionCompatResultReceiverWrapper = colorFilter;
        this.PlaybackStateCompatCustomAction = i;
        this.serializer = dragAndDropTargetModifierNode;
        this.write = i2;
        this.MediaMetadataCompat = i3;
    }
}
