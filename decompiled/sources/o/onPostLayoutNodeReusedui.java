package o;

/* JADX INFO: loaded from: classes.dex */
public final class onPostLayoutNodeReusedui implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 IconCompatParcelizer;
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 serializer;
    public final /* synthetic */ DragAndDropTargetModifierNode write;

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Number) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            AndroidContentCaptureManagerCompanion.read(androidx.compose.material3.TextKt.IconCompatParcelizer.write(AndroidContentDataType.serializer(androidx.compose.material3.tokens.SnackbarTokens.RatingCompat, getpostalcode)), coil3.ExtrasKt.write(969655473, new onEndApplyChangesui(this.IconCompatParcelizer, this.write, this.serializer, AndroidContentDataType.serializer(androidx.compose.material3.tokens.SnackbarTokens.serializer, getpostalcode), this.RemoteActionCompatParcelizer, this.read), getpostalcode), getpostalcode, 56);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    public onPostLayoutNodeReusedui(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, long j, long j2) {
        this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.write = dragAndDropTargetModifierNode;
        this.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        this.RemoteActionCompatParcelizer = j;
        this.read = j2;
    }
}
