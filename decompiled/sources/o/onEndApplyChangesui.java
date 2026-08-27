package o;

/* JADX INFO: loaded from: classes.dex */
public final class onEndApplyChangesui implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ DragAndDropTargetModifierNode IconCompatParcelizer;
    public final /* synthetic */ long MediaSessionCompatQueueItem;
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.text.TextStyle read;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 serializer;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 write;

    public onEndApplyChangesui(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, androidx.compose.ui.text.TextStyle textStyle, long j, long j2) {
        this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.IconCompatParcelizer = dragAndDropTargetModifierNode;
        this.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        this.read = textStyle;
        this.RemoteActionCompatParcelizer = j;
        this.MediaSessionCompatQueueItem = j2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Number) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            getpostalcode.serializer(-168976609);
            androidx.compose.material3.SnackbarKt.m124OneRowSnackbarkKq0p4A(this.IconCompatParcelizer, this.write, this.serializer, this.read, this.RemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem, getpostalcode, 0);
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }
}
