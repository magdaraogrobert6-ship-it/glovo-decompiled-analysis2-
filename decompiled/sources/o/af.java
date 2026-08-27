package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class af implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ relativeMoveTo IconCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ af(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, relativeMoveTo relativemoveto) {
        this.read = 0;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = relativemoveto;
    }

    public /* synthetic */ af(relativeMoveTo relativemoveto, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        this.read = i;
        this.IconCompatParcelizer = relativemoveto;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.RemoteActionCompatParcelizer;
        relativeMoveTo relativemoveto = this.IconCompatParcelizer;
        if (i2 == 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            relativemoveto.write();
            return createfromparcel;
        }
        if (i2 != 1) {
            if (!relativemoveto.write()) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }
            return createfromparcel;
        }
        if (!relativemoveto.write()) {
            int i3 = serializer + 13;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                int i4 = 73 / 0;
            } else {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }
        }
        int i5 = write + 15;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return createfromparcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
