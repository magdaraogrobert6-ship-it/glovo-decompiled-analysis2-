package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getScaleFromKey implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ int write;

    public /* synthetic */ getScaleFromKey(r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E r8lambdaqx04yjm8bydcf53rsookfgpin2e, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.write = i2;
        this.RemoteActionCompatParcelizer = r8lambdaqx04yjm8bydcf53rsookfgpin2e;
        this.read = modifier;
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.IconCompatParcelizer;
        androidx.compose.ui.Modifier modifier = this.read;
        r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E r8lambdaqx04yjm8bydcf53rsookfgpin2e = this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 != 0) {
            toViewInfoFactory.RemoteActionCompatParcelizer(r8lambdaqx04yjm8bydcf53rsookfgpin2e, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        getSLookupTablesannotations.RemoteActionCompatParcelizer(r8lambdaqx04yjm8bydcf53rsookfgpin2e, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = serializer + 117;
        MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 40 / 0;
        }
        return createfromparcel;
    }
}
