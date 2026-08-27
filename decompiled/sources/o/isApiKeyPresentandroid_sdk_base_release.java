package o;

import com.roadrunner.startworking.oneclick.OneClickStartWorkingScreenKt;
import com.roadrunner.vendor.review.presentation.VendorReviewScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class isApiKeyPresentandroid_sdk_base_release implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ isApiKeyPresentandroid_sdk_base_release(logFeatureFlagImpressionlambda1 logfeatureflagimpressionlambda1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i) {
        this.write = logfeatureflagimpressionlambda1;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaDescriptionCompat = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ isApiKeyPresentandroid_sdk_base_release(logPushDeliveryandroid_sdk_base_release logpushdeliveryandroid_sdk_base_release, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, int i) {
        this.write = logpushdeliveryandroid_sdk_base_release;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaDescriptionCompat = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.MediaBrowserCompatMediaItem = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 83;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaBrowserCompatMediaItem;
        Object obj3 = this.MediaDescriptionCompat;
        Object obj4 = this.write;
        if (i4 == 0) {
            ((Integer) obj2).intValue();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            VendorReviewScreenKt.VendorReviewScreenBottomSheetLayout((logPushDeliveryandroid_sdk_base_release) obj4, this.IconCompatParcelizer, this.read, this.serializer, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3, this.RatingCompat, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        OneClickStartWorkingScreenKt.OneClickStartWorkingContent((logFeatureFlagImpressionlambda1) obj4, this.IconCompatParcelizer, this.read, this.RatingCompat, this.serializer, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
        int i6 = MediaSessionCompatQueueItem + 59;
        MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
