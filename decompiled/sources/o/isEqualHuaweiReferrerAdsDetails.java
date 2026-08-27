package o;

import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.presentation.CountryCodePickerBottomSheetKt;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class isEqualHuaweiReferrerAdsDetails implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ int RatingCompat;
    public final /* synthetic */ androidx.compose.ui.Modifier RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write = 0;

    public /* synthetic */ isEqualHuaweiReferrerAdsDetails(removeGlobalCallbackParameters removeglobalcallbackparameters, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, boolean z, int i, int i2) {
        this.serializer = removeglobalcallbackparameters;
        this.MediaDescriptionCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = modifier;
        this.IconCompatParcelizer = z;
        this.RatingCompat = i;
        this.MediaMetadataCompat = i2;
    }

    public /* synthetic */ isEqualHuaweiReferrerAdsDetails(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, boolean z, extractAuthorizationHeader extractauthorizationheader, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, int i, int i2) {
        this.serializer = str;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = modifier;
        this.IconCompatParcelizer = z;
        this.MediaDescriptionCompat = extractauthorizationheader;
        this.MediaBrowserCompatMediaItem = mutableInteractionSourceImpl;
        this.RatingCompat = i;
        this.MediaMetadataCompat = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 119;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.RatingCompat;
        Object obj3 = this.MediaBrowserCompatMediaItem;
        Object obj4 = this.MediaDescriptionCompat;
        Object obj5 = this.serializer;
        if (i4 != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            CountryCodePickerBottomSheetKt.CountryCodePickerContent((removeGlobalCallbackParameters) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, this.MediaMetadataCompat);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        PrimaryKt.serializer((String) obj5, this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, (extractAuthorizationHeader) obj4, (androidx.compose.foundation.interaction.MutableInteractionSourceImpl) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2, this.MediaMetadataCompat);
        int i6 = PlaybackStateCompatCustomAction + 3;
        MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 61 / 0;
        }
        return createfromparcel;
    }
}
