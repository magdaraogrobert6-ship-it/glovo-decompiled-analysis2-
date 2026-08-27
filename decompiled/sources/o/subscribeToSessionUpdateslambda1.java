package o;

import com.roadrunner.vendor.review.api.presentation.VendorReviewOptionKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class subscribeToSessionUpdateslambda1 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaDescriptionCompat;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ subscribeToNoMatchingTriggerForEventlambda0 write;

    public /* synthetic */ subscribeToSessionUpdateslambda1(subscribeToNoMatchingTriggerForEventlambda0 subscribetonomatchingtriggerforeventlambda0, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.serializer = i2;
        this.write = subscribetonomatchingtriggerforeventlambda0;
        this.RemoteActionCompatParcelizer = z;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaDescriptionCompat = modifier;
        this.MediaMetadataCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.MediaMetadataCompat;
        if (i2 != 0) {
            ((Integer) obj2).getClass();
            VendorReviewOptionKt.BinaryScoresRow(this.write, this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer, this.MediaDescriptionCompat, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            int i4 = MediaBrowserCompatMediaItem + 9;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        VendorReviewOptionKt.BinaryReviewBox(this.write, this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer, this.MediaDescriptionCompat, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
        int i6 = RatingCompat + 109;
        MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
