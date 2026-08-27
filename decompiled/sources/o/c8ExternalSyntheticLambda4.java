package o;

import com.roadrunner.login.presentation.router.RouterActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class c8ExternalSyntheticLambda4 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ RouterActivity write;

    public /* synthetic */ c8ExternalSyntheticLambda4(RouterActivity routerActivity, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = routerActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        RouterActivity routerActivity = this.write;
        if (i2 == 0) {
            return routerActivity.getViewModelStore();
        }
        if (i2 == 1) {
            setStrokeCapBeK7IIE defaultViewModelCreationExtras = routerActivity.getDefaultViewModelCreationExtras();
            int i3 = serializer + 23;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return defaultViewModelCreationExtras;
        }
        if (i2 != 2) {
            return routerActivity.getDefaultViewModelCreationExtras();
        }
        getFilterQualityfv9h1I viewModelStore = routerActivity.getViewModelStore();
        int i5 = serializer + 95;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return viewModelStore;
        }
        throw null;
    }
}
