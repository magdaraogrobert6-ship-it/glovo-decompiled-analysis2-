package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PassthroughConnectionusePrepared2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ PassthroughConnectionusePrepared2(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, String str, int i) {
        this.write = i;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = read + 47;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        String str = this.serializer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.IconCompatParcelizer;
        if (i3 == 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(str);
            return createfromparcel2;
        }
        if (i3 == 1) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(str);
            return createfromparcel2;
        }
        if (i3 == 2) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(str);
            return createfromparcel2;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(str);
        int i4 = RemoteActionCompatParcelizer + 5;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel2;
    }
}
