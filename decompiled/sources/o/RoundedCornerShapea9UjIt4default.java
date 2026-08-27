package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RoundedCornerShapea9UjIt4default implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ androidx.compose.foundation.ScrollState IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ RoundedCornerShapea9UjIt4default(androidx.compose.foundation.ScrollState scrollState, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = scrollState;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        androidx.compose.foundation.ScrollState scrollState = this.IconCompatParcelizer;
        boolean z = false;
        if (i2 == 0) {
            if (scrollState.serializer() < scrollState.read()) {
                int i3 = write + 57;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            return Integer.valueOf(scrollState.serializer());
        }
        if (scrollState.serializer() > 0) {
            int i5 = serializer + 103;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
