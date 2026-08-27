package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class accessisCameraAvailable implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ androidx.compose.material3.SheetState IconCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ accessisCameraAvailable(androidx.compose.material3.SheetState sheetState, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        this.write = i;
        this.IconCompatParcelizer = sheetState;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.serializer;
        androidx.compose.material3.SheetState sheetState = this.IconCompatParcelizer;
        if (i != 0) {
            if (!sheetState.RemoteActionCompatParcelizer()) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }
            return createfromparcel;
        }
        if (!sheetState.RemoteActionCompatParcelizer()) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
        return createfromparcel;
    }
}
