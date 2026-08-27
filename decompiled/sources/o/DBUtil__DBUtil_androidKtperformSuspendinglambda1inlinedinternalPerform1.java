package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DBUtil__DBUtil_androidKtperformSuspendinglambda1inlinedinternalPerform1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ DBUtil__DBUtil_androidKtperformSuspendinglambda1inlinedinternalPerform1(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.TRUE);
            return createfromparcel;
        }
        if (i4 == 1) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(null);
            return createfromparcel;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.FALSE);
        int i5 = read + 31;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }
}
