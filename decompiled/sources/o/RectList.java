package o;

import com.roadrunner.biometrics.presentation.compose.BiometricContentKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.presentation.ImageFromUrlKt;
import com.roadrunner.liveness.failure.presentation.compose.FooterComponentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RectList implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaSessionCompatQueueItem;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ String write;

    public /* synthetic */ RectList(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i) {
        this.RemoteActionCompatParcelizer = 0;
        this.IconCompatParcelizer = str;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = str2;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaSessionCompatQueueItem = modifier;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ RectList(int i, String str, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaSessionCompatQueueItem = modifier;
        this.MediaMetadataCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 17;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.MediaMetadataCompat;
        if (i3 == 0) {
            ((Integer) obj2).getClass();
            BiometricContentKt.BiometricAction(ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), (getBirthDateFull) obj, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, this.write, this.serializer, this.read);
            int i5 = MediaBrowserCompatMediaItem + 85;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel2;
        }
        if (i3 != 1) {
            ((Integer) obj2).getClass();
            FooterComponentKt.FooterComponent(ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), (getBirthDateFull) obj, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, this.write, this.serializer, this.read);
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        ImageFromUrlKt.serializer(ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), (getBirthDateFull) obj, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, this.write, this.serializer, this.read);
        return createfromparcel2;
    }
}
