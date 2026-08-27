package o;

import com.roadrunner.delivery.ontheway.address.presentation.compose.DestinationSecondaryAddressKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class GapBuffer_jvmAndAndroidKt implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ s9 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ androidx.compose.ui.Modifier write;

    public /* synthetic */ GapBuffer_jvmAndAndroidKt(s9 s9Var, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        this.read = 0;
        this.RemoteActionCompatParcelizer = s9Var;
        this.write = modifier;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = i;
    }

    public /* synthetic */ GapBuffer_jvmAndAndroidKt(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, s9 s9Var, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.read = i2;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = s9Var;
        this.write = modifier;
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 125;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.IconCompatParcelizer;
        androidx.compose.ui.Modifier modifier = this.write;
        s9 s9Var = this.RemoteActionCompatParcelizer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            DestinationSecondaryAddressKt.RemoteActionCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5), getbirthdatefull, modifier, s9Var, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            return createfromparcel;
        }
        if (i4 != 1) {
            DestinationSecondaryAddressKt.DestinationSecondaryAddressWithBadgeContent(ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5), getbirthdatefull, modifier, s9Var, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            return createfromparcel;
        }
        DestinationSecondaryAddressKt.DestinationSecondaryAddressWithBadge(ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5), getbirthdatefull, modifier, s9Var, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        int i6 = MediaDescriptionCompat + 49;
        MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
