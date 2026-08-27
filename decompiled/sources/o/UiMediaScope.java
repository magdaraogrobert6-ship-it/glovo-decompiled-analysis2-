package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UiMediaScope implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ DragAndDropTargetModifierNode MediaSessionCompatQueueItem;
    public final /* synthetic */ int RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ UiMediaScope(int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, TooltipDefaults tooltipDefaults, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, int i2) {
        this.RatingCompat = i;
        this.read = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.MediaSessionCompatQueueItem = dragAndDropTargetModifierNode;
        this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde2;
        this.serializer = tooltipDefaults;
        this.MediaBrowserCompatMediaItem = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
        this.MediaMetadataCompat = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.MediaBrowserCompatMediaItem;
        Object obj4 = this.serializer;
        Object obj5 = this.write;
        Object obj6 = this.IconCompatParcelizer;
        Object obj7 = this.read;
        if (i == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(this.RatingCompat | 1);
            getCurrentSessionimpl.read((androidx.compose.ui.Modifier) obj7, (androidx.compose.ui.graphics.Shape) obj6, (SessionMutex) obj5, (SessionMutexSession) obj4, (position) obj3, this.MediaSessionCompatQueueItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, this.MediaMetadataCompat);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(this.MediaMetadataCompat | 1);
        androidx.compose.material3.ScaffoldKt.write(this.RatingCompat, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj7, this.MediaSessionCompatQueueItem, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj5, (TooltipDefaults) obj4, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
        return createfromparcel;
    }

    public /* synthetic */ UiMediaScope(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Shape shape, SessionMutex sessionMutex, SessionMutexSession sessionMutexSession, position positionVar, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i, int i2) {
        this.read = modifier;
        this.IconCompatParcelizer = shape;
        this.write = sessionMutex;
        this.serializer = sessionMutexSession;
        this.MediaBrowserCompatMediaItem = positionVar;
        this.MediaSessionCompatQueueItem = dragAndDropTargetModifierNode;
        this.RatingCompat = i;
        this.MediaMetadataCompat = i2;
    }
}
