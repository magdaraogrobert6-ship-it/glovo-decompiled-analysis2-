package o;

import android.net.Uri;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsKt;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.presentation.EmailAndPhoneScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class applyTo implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ isInvalidIndex MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaMetadataCompat;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ int MediaSessionCompatResultReceiverWrapper;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ boolean write;

    public /* synthetic */ applyTo(getBoolean getboolean, String str, androidx.compose.ui.Modifier modifier, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z2, String str2, String str3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        this.IconCompatParcelizer = 2;
        this.RemoteActionCompatParcelizer = getboolean;
        this.MediaDescriptionCompat = str;
        this.MediaMetadataCompat = modifier;
        this.write = z;
        this.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = z2;
        this.RatingCompat = str2;
        this.MediaSessionCompatQueueItem = str3;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaSessionCompatResultReceiverWrapper = i;
    }

    public /* synthetic */ applyTo(Uri uri, boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = uri;
        this.write = z;
        this.serializer = z2;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaBrowserCompatMediaItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.RatingCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k4;
        this.MediaMetadataCompat = modifier;
        this.MediaSessionCompatResultReceiverWrapper = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 73;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaSessionCompatResultReceiverWrapper;
        Object obj3 = this.MediaSessionCompatQueueItem;
        Object obj4 = this.RatingCompat;
        isInvalidIndex isinvalidindex = this.MediaBrowserCompatMediaItem;
        Object obj5 = this.MediaDescriptionCompat;
        Object obj6 = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            InAppCameraWithTagsKt.read((Uri) obj6, this.write, this.serializer, this.read, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, this.MediaMetadataCompat, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel;
        }
        if (i4 != 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            EmailAndPhoneScreenKt.IconCompatParcelizer((getBoolean) obj6, (String) obj5, this.MediaMetadataCompat, this.write, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex, this.serializer, (String) obj4, (String) obj3, this.read, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsKt.IconCompatParcelizer((Uri) obj6, this.write, this.serializer, this.read, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, this.MediaMetadataCompat, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3);
        int i6 = ParcelableVolumeInfo + 67;
        PlaybackStateCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 82 / 0;
        }
        return createfromparcel;
    }
}
