package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a7 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ a6 IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ a7(a6 a6Var, int i) {
        this.read = i;
        this.IconCompatParcelizer = a6Var;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = serializer + 67;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj.hashCode();
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        a6 a6Var = this.IconCompatParcelizer;
        if (i3 == 0) {
            if (a6Var.RemoteActionCompatParcelizer) {
                int i4 = RemoteActionCompatParcelizer + 77;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                a6Var.IconCompatParcelizer.invoke();
            }
            return createfromparcel2;
        }
        a6Var.read.write.invoke();
        a6Var.IconCompatParcelizer.invoke();
        int i6 = RemoteActionCompatParcelizer + 47;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return createfromparcel2;
        }
        throw null;
    }
}
