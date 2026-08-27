package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setPushTokenI implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final /* synthetic */ teardownAllGlobalParametersS write;

    public /* synthetic */ setPushTokenI(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, teardownAllGlobalParametersS teardownallglobalparameterss, int i) {
        this.read = i;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = teardownallglobalparameterss;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        teardownAllGlobalParametersS teardownallglobalparameterss = this.write;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.serializer;
        if (i4 != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(teardownallglobalparameterss);
            return createfromparcel;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(teardownallglobalparameterss);
        int i5 = IconCompatParcelizer + 95;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return createfromparcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
