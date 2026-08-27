package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getImageLoader implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;

    public /* synthetic */ getImageLoader(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = populateViewStructure_androidKtpopulate7;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.read;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.serializer;
        if (i2 != 0) {
            if (!(!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue())) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                int i3 = write + 29;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
            return createfromparcel;
        }
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        populateViewStructure_androidKtpopulate7.setValue(Boolean.FALSE);
        int i5 = IconCompatParcelizer + 105;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }
}
