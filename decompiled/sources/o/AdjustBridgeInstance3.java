package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AdjustBridgeInstance3 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ AdjustBridgeInstance3(int i, int i2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.serializer = i2;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = write + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.IconCompatParcelizer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.read;
        if (i4 == 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf(i5));
            return createfromparcel;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf(i5));
        int i6 = write + 101;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return createfromparcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
