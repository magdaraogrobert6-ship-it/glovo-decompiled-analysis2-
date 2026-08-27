package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class accessisImeVisible implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;

    public /* synthetic */ accessisImeVisible(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.RemoteActionCompatParcelizer = i;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.RemoteActionCompatParcelizer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.read;
        if (i == 0 || i == 1) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return Boolean.TRUE;
        }
        float fFloatValue = ((Number) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).floatValue();
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        if (fFloatValue > 1.0f) {
            fFloatValue = 1.0f;
        }
        return Float.valueOf(fFloatValue);
    }
}
