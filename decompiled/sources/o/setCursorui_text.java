package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setCursorui_text implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ getVonKries RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ setCursorui_text(getVonKries getvonkries, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = getvonkries;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        float fFloatValue;
        int i = 2 % 2;
        int i2 = serializer + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        getVonKries getvonkries = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            fFloatValue = ((Number) getvonkries.getValue()).floatValue();
        } else if (i4 != 1) {
            fFloatValue = getvonkries.write();
            int i5 = serializer + 55;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            fFloatValue = getvonkries.write();
        }
        return Float.valueOf(fFloatValue);
    }
}
