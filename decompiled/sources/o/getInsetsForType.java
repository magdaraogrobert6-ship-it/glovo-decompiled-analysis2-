package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getInsetsForType implements androidx.compose.ui.text.LinkInteractionListener {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;

    public /* synthetic */ getInsetsForType(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.IconCompatParcelizer = i;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // androidx.compose.ui.text.LinkInteractionListener
    public final void onClick(androidx.compose.ui.text.LinkAnnotation linkAnnotation) {
        int i = 2 % 2;
        int i2 = serializer + 47;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.read;
        if (i3 != 0) {
            linkAnnotation.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return;
        }
        linkAnnotation.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        int i4 = write + 95;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
