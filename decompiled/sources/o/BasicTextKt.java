package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BasicTextKt implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ BasicTextKt(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z) {
        this.write = i;
        this.serializer = z;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj.hashCode();
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.read;
        boolean z = this.serializer;
        if (i3 != 0) {
            if (z) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                int i4 = IconCompatParcelizer + 83;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 4 % 3;
                }
            }
            return createfromparcel2;
        }
        if (!(!z)) {
            int i6 = RemoteActionCompatParcelizer + 87;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                obj.hashCode();
                throw null;
            }
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
        return createfromparcel2;
    }
}
