package o;

import com.roadrunner.custom.password.presentation.CustomPasswordActivity;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class isTargetDrawnFirstui extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ CustomPasswordActivity write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ isTargetDrawnFirstui(CustomPasswordActivity customPasswordActivity, int i) {
        super(0);
        this.read = i;
        this.write = customPasswordActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        CustomPasswordActivity customPasswordActivity = this.write;
        if (i4 == 0) {
            return customPasswordActivity.getViewModelStore();
        }
        setStrokeCapBeK7IIE defaultViewModelCreationExtras = customPasswordActivity.getDefaultViewModelCreationExtras();
        int i5 = RemoteActionCompatParcelizer + 105;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return defaultViewModelCreationExtras;
    }
}
