package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getLocale implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int ParcelableVolumeInfo = 1;
    public final /* synthetic */ getPushAlert IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSourceImpl MediaBrowserCompatMediaItem;
    public final /* synthetic */ extractAuthorizationHeader MediaDescriptionCompat;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ boolean MediaSessionCompatQueueItem;
    public final /* synthetic */ int RatingCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ androidx.compose.ui.Modifier serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getLocale(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, getPushAlert getpushalert, boolean z, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, extractAuthorizationHeader extractauthorizationheader, int i2, int i3, int i4) {
        this.write = i4;
        this.read = i;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = modifier;
        this.IconCompatParcelizer = getpushalert;
        this.MediaSessionCompatQueueItem = z;
        this.MediaBrowserCompatMediaItem = mutableInteractionSourceImpl;
        this.MediaDescriptionCompat = extractauthorizationheader;
        this.RatingCompat = i2;
        this.MediaMetadataCompat = i3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 117;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.RatingCompat;
        if (i4 != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            getRootCause.write(this.read, this.RemoteActionCompatParcelizer, this.serializer, this.IconCompatParcelizer, this.MediaSessionCompatQueueItem, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, this.MediaMetadataCompat);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        getRootCause.read(this.read, this.RemoteActionCompatParcelizer, this.serializer, this.IconCompatParcelizer, this.MediaSessionCompatQueueItem, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2, this.MediaMetadataCompat);
        int i6 = ParcelableVolumeInfo + 75;
        MediaSessionCompatResultReceiverWrapper = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
