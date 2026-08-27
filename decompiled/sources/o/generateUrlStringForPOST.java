package o;

import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsKt;
import com.roadrunner.rrds.compose.component.feedback.communicator.MessageBarKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class generateUrlStringForPOST implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int PlaybackStateCompatCustomAction = 0;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 1;
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaDescriptionCompat;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ boolean MediaSessionCompatResultReceiverWrapper;
    public final /* synthetic */ Object MediaSessionCompatToken;
    public final /* synthetic */ Object ParcelableVolumeInfo;
    public final /* synthetic */ boolean PlaybackStateCompat;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    public /* synthetic */ generateUrlStringForPOST(isEmimpl isemimpl, toIntRectozmzZPI tointrectozmzzpi, setNavigationOnClickListener setnavigationonclicklistener, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, boolean z, boolean z2, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.RemoteActionCompatParcelizer = isemimpl;
        this.serializer = tointrectozmzzpi;
        this.MediaSessionCompatQueueItem = setnavigationonclicklistener;
        this.RatingCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.ParcelableVolumeInfo = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaSessionCompatToken = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        this.MediaSessionCompatResultReceiverWrapper = z;
        this.PlaybackStateCompat = z2;
        this.MediaDescriptionCompat = modifier;
        this.MediaBrowserCompatMediaItem = i;
        this.MediaMetadataCompat = i2;
    }

    public /* synthetic */ generateUrlStringForPOST(shouldRetryToSendWithUrlStrategy shouldretrytosendwithurlstrategy, coil3.compose.AsyncImagePainter asyncImagePainter, String str, androidx.compose.ui.Modifier modifier, String str2, boolean z, boolean z2, String str3, String str4, TooltipDefaults tooltipDefaults, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, int i2) {
        this.RemoteActionCompatParcelizer = shouldretrytosendwithurlstrategy;
        this.serializer = asyncImagePainter;
        this.MediaSessionCompatQueueItem = str;
        this.MediaDescriptionCompat = modifier;
        this.RatingCompat = str2;
        this.MediaSessionCompatResultReceiverWrapper = z;
        this.PlaybackStateCompat = z2;
        this.ParcelableVolumeInfo = str3;
        this.MediaSessionCompatToken = str4;
        this.read = tooltipDefaults;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaBrowserCompatMediaItem = i;
        this.MediaMetadataCompat = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 69;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaMetadataCompat;
        int i6 = this.MediaBrowserCompatMediaItem;
        Object obj3 = this.read;
        Object obj4 = this.MediaSessionCompatToken;
        Object obj5 = this.ParcelableVolumeInfo;
        Object obj6 = this.RatingCompat;
        Object obj7 = this.MediaSessionCompatQueueItem;
        Object obj8 = this.serializer;
        Object obj9 = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i6 | 1);
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5);
            MessageBarKt.MessageBar((shouldRetryToSendWithUrlStrategy) obj9, (coil3.compose.AsyncImagePainter) obj8, (String) obj7, this.MediaDescriptionCompat, (String) obj6, this.MediaSessionCompatResultReceiverWrapper, this.PlaybackStateCompat, (String) obj5, (String) obj4, (TooltipDefaults) obj3, this.write, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i6 | 1);
        int iRemoteActionCompatParcelizer4 = ContentType_androidKt.RemoteActionCompatParcelizer(i5);
        InAppCameraWithTagsKt.RemoteActionCompatParcelizer((isEmimpl) obj9, (toIntRectozmzZPI) obj8, (setNavigationOnClickListener) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, this.write, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, this.MediaSessionCompatResultReceiverWrapper, this.PlaybackStateCompat, this.MediaDescriptionCompat, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer4);
        int i7 = PlaybackStateCompatCustomAction + 83;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return createfromparcel;
    }
}
