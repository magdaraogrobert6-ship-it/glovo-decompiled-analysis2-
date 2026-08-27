package o;

import com.roadrunner.biometrics.presentation.BiometricsActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class subtreeSortedByGeometryGrouping implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ BiometricsActivity RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ subtreeSortedByGeometryGrouping(BiometricsActivity biometricsActivity, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = biometricsActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = serializer + 19;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        BiometricsActivity biometricsActivity = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            int iIconCompatParcelizer = ff.IconCompatParcelizer();
            int iIconCompatParcelizer2 = ff.IconCompatParcelizer();
            return (createFromParcel) BiometricsActivity.read(iIconCompatParcelizer, 1147637191, -1147637189, ff.IconCompatParcelizer(), iIconCompatParcelizer2, ff.IconCompatParcelizer(), new Object[]{biometricsActivity});
        }
        createImageBitmap createimagebitmapIconCompatParcelizer = BiometricsActivity.IconCompatParcelizer(biometricsActivity);
        int i5 = serializer + 19;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return createimagebitmapIconCompatParcelizer;
    }
}
