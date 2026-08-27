package o;

import com.roadrunner.customerchat.selfservice.presentation.screen.CustomerChatErrorScreenKt;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class copyykzQM6k implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ copyykzQM6k(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.write = i2;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.read = modifier;
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 41;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.IconCompatParcelizer;
        androidx.compose.ui.Modifier modifier = this.read;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.RemoteActionCompatParcelizer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            CustomerChatErrorScreenKt.CustomerChatErrorScreen(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            return createfromparcel;
        }
        if (i4 == 1) {
            InAppCameraWithTagsKt.ControlWithConfirmOption(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            return createfromparcel;
        }
        com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsKt.ControlWithConfirmOption(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
        int i6 = MediaMetadataCompat + 55;
        MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
