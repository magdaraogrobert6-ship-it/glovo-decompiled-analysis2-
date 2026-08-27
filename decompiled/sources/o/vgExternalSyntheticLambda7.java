package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vgExternalSyntheticLambda7 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getActionList read;

    public /* synthetic */ vgExternalSyntheticLambda7(getActionList getactionlist, int i) {
        this.IconCompatParcelizer = i;
        this.read = getactionlist;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = this.IconCompatParcelizer;
        getActionList getactionlist = this.read;
        if (i3 != 0) {
            if (i3 != 1) {
                z = getactionlist.read();
                i = serializer + 67;
                write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            } else {
                z = getactionlist.read();
            }
            return Boolean.valueOf(z);
        }
        z = getactionlist.read();
        i = write + 51;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i % 2;
        return Boolean.valueOf(z);
    }
}
