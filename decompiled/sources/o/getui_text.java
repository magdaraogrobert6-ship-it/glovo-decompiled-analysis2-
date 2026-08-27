package o;

import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.ControlWithClickOptionKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getui_text implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaDescriptionCompat;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaMetadataCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ boolean write;

    public /* synthetic */ getui_text(boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.write = z;
        this.read = z2;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.MediaMetadataCompat = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 41;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.MediaBrowserCompatMediaItem;
        if (i3 != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            ControlWithClickOptionKt.ControlWithClickOption(this.write, this.read, this.RemoteActionCompatParcelizer, this.serializer, this.MediaDescriptionCompat, this.MediaMetadataCompat, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
        com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.ControlWithClickOptionKt.ControlWithClickOption(this.write, this.read, this.RemoteActionCompatParcelizer, this.serializer, this.MediaDescriptionCompat, this.MediaMetadataCompat, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
        int i5 = MediaSessionCompatQueueItem + 103;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel2;
    }
}
