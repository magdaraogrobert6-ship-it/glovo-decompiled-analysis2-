package o;

import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.compose.EntrancePictureScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class addEditCommandWithBatch implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int PlaybackStateCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaMetadataCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaSessionCompatQueueItem;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final /* synthetic */ r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk write;

    public /* synthetic */ addEditCommandWithBatch(int i, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i2, int i3) {
        this.RemoteActionCompatParcelizer = i3;
        this.read = i;
        this.write = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.IconCompatParcelizer = z;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaMetadataCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaBrowserCompatMediaItem = modifier;
        this.MediaDescriptionCompat = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 39;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.MediaDescriptionCompat;
        if (i3 != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            EntrancePictureScreenKt.RemoteActionCompatParcelizer(this.read, this.write, this.IconCompatParcelizer, this.serializer, this.MediaMetadataCompat, this.MediaSessionCompatQueueItem, this.MediaBrowserCompatMediaItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
        com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.ImageKt.Pager(this.read, this.write, this.IconCompatParcelizer, this.serializer, this.MediaMetadataCompat, this.MediaSessionCompatQueueItem, this.MediaBrowserCompatMediaItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
        int i5 = PlaybackStateCompat + 119;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return createfromparcel2;
    }
}
