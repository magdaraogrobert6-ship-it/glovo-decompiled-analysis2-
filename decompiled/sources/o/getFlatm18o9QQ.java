package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getFlatm18o9QQ implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ androidx.compose.ui.graphics.Shape IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ position MediaDescriptionCompat;
    public final /* synthetic */ androidx.compose.material3.IconButtonColors MediaMetadataCompat;
    public final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSourceImpl MediaSessionCompatQueueItem;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ androidx.compose.ui.Modifier write;

    public /* synthetic */ getFlatm18o9QQ(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.ui.graphics.Shape shape, androidx.compose.material3.IconButtonColors iconButtonColors, position positionVar, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, int i, int i2) {
        this.serializer = i2;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = modifier;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = shape;
        this.MediaMetadataCompat = iconButtonColors;
        this.MediaDescriptionCompat = positionVar;
        this.MediaSessionCompatQueueItem = mutableInteractionSourceImpl;
        this.MediaBrowserCompatMediaItem = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = this.MediaBrowserCompatMediaItem;
        if (i != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1);
            androidx.compose.material3.IconButtonKt.read(this.read, this.write, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1);
        androidx.compose.material3.IconButtonKt.serializer(this.read, this.write, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
        return createfromparcel;
    }
}
