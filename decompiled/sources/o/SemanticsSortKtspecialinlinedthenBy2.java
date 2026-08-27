package o;

import com.roadrunner.biometrics.presentation.BiometricsActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsSortKtspecialinlinedthenBy2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ BiometricsActivity RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ SemanticsSortKtspecialinlinedthenBy2(BiometricsActivity biometricsActivity, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = biometricsActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = write + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        BiometricsActivity biometricsActivity = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            return biometricsActivity.getViewModelStore();
        }
        setStrokeCapBeK7IIE defaultViewModelCreationExtras = biometricsActivity.getDefaultViewModelCreationExtras();
        int i5 = read + 93;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return defaultViewModelCreationExtras;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
