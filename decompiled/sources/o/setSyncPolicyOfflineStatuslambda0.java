package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setSyncPolicyOfflineStatuslambda0 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ addOnPictureInPictureUiStateChangedListener serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ setSyncPolicyOfflineStatuslambda0(addOnPictureInPictureUiStateChangedListener addonpictureinpictureuistatechangedlistener, int i, int i2) {
        this.write = i2;
        this.serializer = addonpictureinpictureuistatechangedlistener;
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.IconCompatParcelizer;
        addOnPictureInPictureUiStateChangedListener addonpictureinpictureuistatechangedlistener = this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).intValue();
        if (i2 != 0) {
            fastForEachIndexedWithFilter.serializer(addonpictureinpictureuistatechangedlistener, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            int i4 = RemoteActionCompatParcelizer + 9;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel;
        }
        getTopEndannotations.write(addonpictureinpictureuistatechangedlistener, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
        int i6 = RemoteActionCompatParcelizer + 113;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 72 / 0;
        }
        return createfromparcel;
    }
}
