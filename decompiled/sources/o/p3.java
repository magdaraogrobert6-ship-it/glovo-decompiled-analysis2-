package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p3 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public /* synthetic */ p3(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.write;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = this.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            if (i3 == 1) {
                ComposedModifierKt composedModifierKt = (ComposedModifierKt) obj;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
                if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 == null || ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).booleanValue()) {
                    composedModifierKt.read();
                }
                return createfromparcel2;
            }
            if (i3 != 2) {
                ((getPersonNamePrefix) obj).getClass();
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
                return new getRawReferrerIndex(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            }
            ((getPersonNamePrefix) obj).getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
            return new getRawReferrerIndex(2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
        p1 p1Var = (p1) obj;
        p1Var.getClass();
        if (p1Var.equals(of.read)) {
            int i4 = IconCompatParcelizer + 67;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
                throw null;
            }
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
        } else {
            if (!p1Var.equals(p0.IconCompatParcelizer)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
        return createfromparcel2;
    }
}
