package o;

import com.roadrunner.auth.logout.presentation.LogoutActivity;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class selectableGroup extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ LogoutActivity RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ selectableGroup(LogoutActivity logoutActivity, int i) {
        super(0);
        this.read = i;
        this.RemoteActionCompatParcelizer = logoutActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = serializer + 23;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        LogoutActivity logoutActivity = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            return logoutActivity.getDefaultViewModelCreationExtras();
        }
        getFilterQualityfv9h1I viewModelStore = logoutActivity.getViewModelStore();
        int i5 = serializer + 61;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return viewModelStore;
        }
        throw null;
    }
}
