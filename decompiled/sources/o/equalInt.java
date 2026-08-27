package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class equalInt implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatToken = 1;
    private static int RatingCompat;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ extractAuthorizationHeader MediaDescriptionCompat;
    public final /* synthetic */ float MediaMetadataCompat;
    public final /* synthetic */ float MediaSessionCompatQueueItem;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ androidx.compose.ui.Modifier serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ equalInt(Object obj, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, boolean z, extractAuthorizationHeader extractauthorizationheader, float f, float f2, int i, int i2) {
        this.write = i2;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = modifier;
        this.read = z;
        this.MediaDescriptionCompat = extractauthorizationheader;
        this.MediaMetadataCompat = f;
        this.MediaSessionCompatQueueItem = f2;
        this.MediaBrowserCompatMediaItem = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 87;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.MediaBrowserCompatMediaItem;
        Object obj3 = this.IconCompatParcelizer;
        if (i3 != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            equalEnum.RemoteActionCompatParcelizer((String) obj3, this.RemoteActionCompatParcelizer, this.serializer, this.read, this.MediaDescriptionCompat, this.MediaMetadataCompat, this.MediaSessionCompatQueueItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
        equalEnum.IconCompatParcelizer((ShaderKt) obj3, this.RemoteActionCompatParcelizer, this.serializer, this.read, this.MediaDescriptionCompat, this.MediaMetadataCompat, this.MediaSessionCompatQueueItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
        int i5 = MediaSessionCompatToken + 97;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return createfromparcel2;
    }
}
