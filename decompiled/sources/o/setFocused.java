package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class setFocused implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ long read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ setFocused(long j, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i) {
        this.read = j;
        this.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.write = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = this.write;
        long j = this.read;
        Object obj3 = this.serializer;
        if (i != 0) {
            ((Integer) obj2).intValue();
            androidx.compose.material3.pulltorefresh.PullToRefreshKt.IconCompatParcelizer((isText) obj3, j, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1));
            return createfromparcel;
        }
        ((Integer) obj2).intValue();
        androidx.compose.material3.internal.TextFieldImplKt.IconCompatParcelizer(j, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1));
        return createfromparcel;
    }

    public /* synthetic */ setFocused(isText istext, long j, int i) {
        this.serializer = istext;
        this.read = j;
        this.write = i;
    }
}
