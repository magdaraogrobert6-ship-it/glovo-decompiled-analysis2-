package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class resumeSendingI implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ resumeSendingI(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = populateViewStructure_androidKtpopulate7;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = read + 115;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.IconCompatParcelizer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            populateViewStructure_androidKtpopulate7.setValue(Boolean.TRUE);
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return createfromparcel2;
        }
        if (i3 == 1) {
            populateViewStructure_androidKtpopulate7.setValue(Boolean.FALSE);
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            int i4 = read + 111;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return createfromparcel2;
            }
            obj.hashCode();
            throw null;
        }
        if (i3 == 2) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            populateViewStructure_androidKtpopulate7.setValue(null);
            return createfromparcel2;
        }
        if (i3 == 3) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            populateViewStructure_androidKtpopulate7.setValue(Boolean.FALSE);
            return createfromparcel2;
        }
        if (i3 != 4) {
            populateViewStructure_androidKtpopulate7.setValue(Boolean.FALSE);
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return createfromparcel2;
        }
        populateViewStructure_androidKtpopulate7.setValue(Boolean.FALSE);
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        return createfromparcel2;
    }
}
