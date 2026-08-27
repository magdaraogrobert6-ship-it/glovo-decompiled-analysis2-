package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Q implements Runnable {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;

    public /* synthetic */ Q(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.serializer;
        if (i3 == 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            int i4 = IconCompatParcelizer + 69;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        if (i3 == 1) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        } else if (i3 != 2) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
    }
}
