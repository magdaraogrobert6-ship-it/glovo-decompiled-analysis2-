package o;

import android.os.Process;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.compose.MultipleCodeScanKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class compareTo0680j_4 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public static int MediaDescriptionCompat = 0;
    public static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final /* synthetic */ accessgetInfinitycp RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ androidx.compose.ui.Modifier write;

    public /* synthetic */ compareTo0680j_4(accessgetInfinitycp accessgetinfinitycp, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.read = i2;
        this.RemoteActionCompatParcelizer = accessgetinfinitycp;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = modifier;
        this.serializer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 13;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.serializer;
        androidx.compose.ui.Modifier modifier = this.write;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.IconCompatParcelizer;
        accessgetInfinitycp accessgetinfinitycp = this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            MultipleCodeScanKt.IconCompatParcelizer(accessgetinfinitycp, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        MultipleCodeScanKt.IconCompatParcelizer(accessgetinfinitycp, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = MediaSessionCompatQueueItem + 57;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }

    public static int serializer() {
        int i = MediaDescriptionCompat;
        int i2 = i % 9415358;
        MediaDescriptionCompat = i + 1;
        if (i2 != 0) {
            return MediaMetadataCompat;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        MediaMetadataCompat = startUptimeMillis;
        return startUptimeMillis;
    }
}
