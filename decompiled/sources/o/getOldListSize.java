package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getOldListSize implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;

    public /* synthetic */ getOldListSize(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.read = i;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.IconCompatParcelizer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.serializer;
        if (i3 != 0) {
            getInternalState getinternalstate = (getInternalState) obj;
            getinternalstate.getClass();
            if (getinternalstate.equals(getFirstSessionDelayManager.serializer)) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            } else {
                if (!(getinternalstate instanceof launchPurchaseVerificationResponseTasks)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((launchPurchaseVerificationResponseTasks) getinternalstate).read);
            }
            return createfromparcel2;
        }
        NavHostKtNavHost29111 navHostKtNavHost29111 = (NavHostKtNavHost29111) obj;
        navHostKtNavHost29111.getClass();
        if (navHostKtNavHost29111.equals(FragmentKt.serializer)) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        } else {
            if (!(navHostKtNavHost29111 instanceof NavHostKtNavHost331)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((NavHostKtNavHost331) navHostKtNavHost29111).IconCompatParcelizer);
            int i4 = write + 59;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 3;
            }
        }
        return createfromparcel2;
    }
}
