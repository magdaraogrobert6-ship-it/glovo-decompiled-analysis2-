package o;

/* JADX INFO: loaded from: classes.dex */
public final class get_windowInfo implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 IconCompatParcelizer;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 MediaBrowserCompatMediaItem;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 MediaSessionCompatQueueItem;
    public final /* synthetic */ DragAndDropTargetModifierNode RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 serializer;
    public final /* synthetic */ setChildCount write;

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Number) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.material3.ScaffoldKt.write(this.read, this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem, this.serializer, this.write, this.IconCompatParcelizer, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    public get_windowInfo(int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, setChildCount setchildcount, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3) {
        this.read = i;
        this.MediaBrowserCompatMediaItem = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.RemoteActionCompatParcelizer = dragAndDropTargetModifierNode;
        this.MediaSessionCompatQueueItem = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        this.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde2;
        this.write = setchildcount;
        this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
    }
}
