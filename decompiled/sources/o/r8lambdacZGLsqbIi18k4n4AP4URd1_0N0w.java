package o;

import com.roadrunner.settings.ui.screens.NavigationSettingsScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdacZGLsqbIi18k4n4AP4URd1_0N0w implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 1;
    public final /* synthetic */ r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI serializer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public /* synthetic */ r8lambdacZGLsqbIi18k4n4AP4URd1_0N0w(r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI r8lambdav9hvubmv32qeolrxalsjens1hri, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        this.serializer = r8lambdav9hvubmv32qeolrxalsjens1hri;
        this.RemoteActionCompatParcelizer = modifier;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = i;
    }

    public /* synthetic */ r8lambdacZGLsqbIi18k4n4AP4URd1_0N0w(r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI r8lambdav9hvubmv32qeolrxalsjens1hri, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i) {
        this.serializer = r8lambdav9hvubmv32qeolrxalsjens1hri;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = modifier;
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 89;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.IconCompatParcelizer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.write;
        androidx.compose.ui.Modifier modifier = this.RemoteActionCompatParcelizer;
        r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI r8lambdav9hvubmv32qeolrxalsjens1hri = this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            NavigationSettingsScreenKt.serializer(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, r8lambdav9hvubmv32qeolrxalsjens1hri, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            return createfromparcel;
        }
        NavigationSettingsScreenKt.NaverDescriptionContent(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, r8lambdav9hvubmv32qeolrxalsjens1hri, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        int i6 = MediaBrowserCompatMediaItem + 121;
        MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
