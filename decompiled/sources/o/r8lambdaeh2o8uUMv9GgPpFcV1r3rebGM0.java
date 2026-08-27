package o;

import com.roadrunner.permission.presentation.PermissionActivity;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaeh2o8uUMv9GgPpFcV1r3rebGM0 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ PermissionActivity write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8lambdaeh2o8uUMv9GgPpFcV1r3rebGM0(PermissionActivity permissionActivity, int i) {
        super(0);
        this.read = i;
        this.write = permissionActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = serializer + 13;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        PermissionActivity permissionActivity = this.write;
        if (i4 != 0) {
            return permissionActivity.getDefaultViewModelCreationExtras();
        }
        getFilterQualityfv9h1I viewModelStore = permissionActivity.getViewModelStore();
        int i5 = IconCompatParcelizer + 37;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return viewModelStore;
        }
        throw null;
    }
}
