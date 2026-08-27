package o;

import com.roadrunner.permission.presentation.NonFloatablePermissionActivity;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaetlJ3FaLgD8fV1pdI4DQKacxOk extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ NonFloatablePermissionActivity RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8lambdaetlJ3FaLgD8fV1pdI4DQKacxOk(NonFloatablePermissionActivity nonFloatablePermissionActivity, int i) {
        super(0);
        this.write = i;
        this.RemoteActionCompatParcelizer = nonFloatablePermissionActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.write;
        NonFloatablePermissionActivity nonFloatablePermissionActivity = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            getFilterQualityfv9h1I viewModelStore = nonFloatablePermissionActivity.getViewModelStore();
            int i3 = read + 9;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return viewModelStore;
        }
        setStrokeCapBeK7IIE defaultViewModelCreationExtras = nonFloatablePermissionActivity.getDefaultViewModelCreationExtras();
        int i5 = IconCompatParcelizer + 125;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 6 / 0;
        }
        return defaultViewModelCreationExtras;
    }
}
