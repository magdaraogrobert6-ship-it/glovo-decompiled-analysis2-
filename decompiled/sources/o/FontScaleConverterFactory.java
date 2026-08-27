package o;

import com.roadrunner.delivery.pickupdropoff.details.presentation.compose.v1.ExpandableButtonComponentV1Kt;
import com.roadrunner.delivery.stacked.delivery.list.compose.v1.ExpandableButtonV1Kt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class FontScaleConverterFactory implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ accessgetFakeSavedStateRegistryOwnerp write;

    public /* synthetic */ FontScaleConverterFactory(accessgetFakeSavedStateRegistryOwnerp accessgetfakesavedstateregistryownerp, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.read = i2;
        this.write = accessgetfakesavedstateregistryownerp;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = modifier;
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 33;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.IconCompatParcelizer;
        androidx.compose.ui.Modifier modifier = this.RemoteActionCompatParcelizer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.serializer;
        accessgetFakeSavedStateRegistryOwnerp accessgetfakesavedstateregistryownerp = this.write;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            ExpandableButtonV1Kt.ExpandableButtonV1(accessgetfakesavedstateregistryownerp, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        ExpandableButtonComponentV1Kt.ExpandableButtonComponentV1(accessgetfakesavedstateregistryownerp, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = MediaMetadataCompat + 99;
        MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 75 / 0;
        }
        return createfromparcel;
    }
}
