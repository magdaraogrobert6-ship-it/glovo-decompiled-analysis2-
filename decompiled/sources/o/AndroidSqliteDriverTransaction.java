package o;

import com.roadrunner.login.presentation.LoginActivity;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidSqliteDriverTransaction extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ LoginActivity serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidSqliteDriverTransaction(LoginActivity loginActivity, int i) {
        super(0);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = loginActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        LoginActivity loginActivity = this.serializer;
        if (i4 == 0) {
            return loginActivity.getViewModelStore();
        }
        if (i4 == 1) {
            return loginActivity.getDefaultViewModelCreationExtras();
        }
        if (i4 != 2) {
            return loginActivity.getDefaultViewModelCreationExtras();
        }
        getFilterQualityfv9h1I viewModelStore = loginActivity.getViewModelStore();
        int i5 = IconCompatParcelizer + 71;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return viewModelStore;
    }
}
