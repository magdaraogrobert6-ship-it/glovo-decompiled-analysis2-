package o;

import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class onLayoutChild implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ onLayoutChild(DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, int i) {
        this.serializer = i;
        this.read = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 = this.read;
        if (i3 == 0) {
            darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1.invoke();
            return createfromparcel2;
        }
        darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1.invoke();
        int i4 = RemoteActionCompatParcelizer + 27;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel2;
    }
}
