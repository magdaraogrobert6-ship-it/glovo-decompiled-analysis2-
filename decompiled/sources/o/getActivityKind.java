package o;

import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.compose.DoubleConfirmationBottomSheetKt;
import com.roadrunner.rider.recruitment.passverification.pass_error.PassErrorScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getActivityKind implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaDescriptionCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaSessionCompatQueueItem;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ androidx.compose.ui.Modifier serializer;
    public final /* synthetic */ String write;

    public /* synthetic */ getActivityKind(String str, String str2, String str3, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, int i) {
        this.write = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.serializer = modifier;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ getActivityKind(String str, String str2, String str3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i) {
        this.write = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.serializer = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 91;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaBrowserCompatMediaItem;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            PassErrorScreenKt.PassErrorContent(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), (getBirthDateFull) obj, this.serializer, this.write, this.read, this.RemoteActionCompatParcelizer, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        DoubleConfirmationBottomSheetKt.DoubleConfirmationBottomSheet(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), (getBirthDateFull) obj, this.serializer, this.write, this.read, this.RemoteActionCompatParcelizer, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem);
        int i6 = MediaMetadataCompat + 13;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
