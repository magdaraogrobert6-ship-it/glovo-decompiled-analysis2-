package o;

import com.roadrunner.delivery.accept.backToBackOrder.presentation.banner.BackToBackOrderBannerKt;
import com.roadrunner.delivery.accept.backToBackOrder.presentation.banner.BackToBackOrderOverlayBannerKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TextLinkStyles implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RatingCompat;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ int write = 1;

    public /* synthetic */ TextLinkStyles(int i, String str, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i2) {
        this.read = i;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RatingCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaBrowserCompatMediaItem = modifier;
        this.MediaDescriptionCompat = i2;
    }

    public /* synthetic */ TextLinkStyles(String str, String str2, int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i2) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = i;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RatingCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaBrowserCompatMediaItem = modifier;
        this.MediaDescriptionCompat = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 69;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaDescriptionCompat;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            BackToBackOrderBannerKt.BackToBackOrderBanner(this.read, iRemoteActionCompatParcelizer, (getBirthDateFull) obj, this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.serializer, this.RatingCompat);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        BackToBackOrderOverlayBannerKt.BackToBackOrderOverlayBanner(this.read, iRemoteActionCompatParcelizer2, (getBirthDateFull) obj, this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.serializer, this.RatingCompat);
        int i6 = MediaSessionCompatQueueItem + 9;
        MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
