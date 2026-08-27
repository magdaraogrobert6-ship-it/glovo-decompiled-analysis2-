package o;

import com.roadrunner.startworking.oneclick.OneClickStartWorkingScreenKt;
import com.roadrunner.twofa.presentation.compose.TwoFaContentKt;
import com.roadrunner.vendor.review.presentation.VendorReviewScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setSyncPolicyOfflineStatus implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ isInvalidIndex IconCompatParcelizer;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ isInvalidIndex MediaMetadataCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public /* synthetic */ setSyncPolicyOfflineStatus(setSdkAuthenticationSignaturelambda11 setsdkauthenticationsignaturelambda11, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, int i) {
        this.serializer = 0;
        this.RemoteActionCompatParcelizer = setsdkauthenticationsignaturelambda11;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = modifier;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaMetadataCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaDescriptionCompat = i;
    }

    public /* synthetic */ setSyncPolicyOfflineStatus(Object obj, isInvalidIndex isinvalidindex, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, isInvalidIndex isinvalidindex2, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.serializer = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = isinvalidindex;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaMetadataCompat = isinvalidindex2;
        this.read = modifier;
        this.MediaDescriptionCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaDescriptionCompat;
        isInvalidIndex isinvalidindex = this.MediaMetadataCompat;
        isInvalidIndex isinvalidindex2 = this.IconCompatParcelizer;
        Object obj3 = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            TwoFaContentKt.TwoFaContent((setSdkAuthenticationSignaturelambda11) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex2, this.read, this.write, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            int i6 = MediaBrowserCompatMediaItem + 21;
            MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return createfromparcel;
            }
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
        if (i4 != 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            VendorReviewScreenKt.VendorReviewContent((logPushDeliveryandroid_sdk_base_release) obj3, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) isinvalidindex2, this.write, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, this.read, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        OneClickStartWorkingScreenKt.OneClickStartWorkingComponentsColumn((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex2, this.write, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex, this.read, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3);
        return createfromparcel;
    }
}
