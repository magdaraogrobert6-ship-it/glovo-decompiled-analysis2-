package o;

import com.roadrunner.delivery.pickupdropoff.tasks.api.mapper.ButtonTypeTokenMapperKt;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.CustomerContactSectionKt;
import com.roadrunner.delivery.state.pudo.ButtonTypeToken;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class logWarningui_toolingdefault implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int ParcelableVolumeInfo = 1;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final /* synthetic */ boolean MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ int MediaSessionCompatQueueItem;
    public final /* synthetic */ boolean RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write = 0;

    public /* synthetic */ logWarningui_toolingdefault(r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc, boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, int i, androidx.compose.ui.Modifier modifier, int i2) {
        this.RemoteActionCompatParcelizer = r8lambdakx1augmjk4nknxfqvyytyqzkc;
        this.RatingCompat = z;
        this.MediaBrowserCompatMediaItem = z2;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.MediaSessionCompatQueueItem = i;
        this.read = modifier;
        this.MediaMetadataCompat = i2;
    }

    public /* synthetic */ logWarningui_toolingdefault(ButtonTypeToken buttonTypeToken, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, Integer num, int i, int i2) {
        this.RemoteActionCompatParcelizer = buttonTypeToken;
        this.serializer = str;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = modifier;
        this.RatingCompat = z;
        this.MediaBrowserCompatMediaItem = z2;
        this.MediaDescriptionCompat = num;
        this.MediaSessionCompatQueueItem = i;
        this.MediaMetadataCompat = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 39;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj3 = this.MediaDescriptionCompat;
        Object obj4 = this.serializer;
        Object obj5 = this.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(this.MediaMetadataCompat | 1);
            CustomerContactSectionKt.CustomerContactSection((r8lambdakX1auGmjk4nKnxFqVYyTYqzkc) obj5, this.RatingCompat, this.MediaBrowserCompatMediaItem, this.IconCompatParcelizer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, this.MediaSessionCompatQueueItem, this.read, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem | 1);
        ButtonTypeTokenMapperKt.IconCompatParcelizer((ButtonTypeToken) obj5, (String) obj4, this.IconCompatParcelizer, this.read, this.RatingCompat, this.MediaBrowserCompatMediaItem, (Integer) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2, this.MediaMetadataCompat);
        int i4 = ParcelableVolumeInfo + 99;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return createfromparcel2;
    }
}
