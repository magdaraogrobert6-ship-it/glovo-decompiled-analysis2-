package o;

import com.roadrunner.permission.location.gps.presentation.GPSActivity;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaT4v5FDQjCyVCqF4Q_RBnbXLvo extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ GPSActivity read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8lambdaT4v5FDQjCyVCqF4Q_RBnbXLvo(GPSActivity gPSActivity, int i) {
        super(0);
        this.IconCompatParcelizer = i;
        this.read = gPSActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        GPSActivity gPSActivity = this.read;
        if (i4 == 0) {
            return gPSActivity.getViewModelStore();
        }
        if (i4 == 1) {
            return gPSActivity.getDefaultViewModelCreationExtras();
        }
        if (i4 != 2) {
            return gPSActivity.getDefaultViewModelCreationExtras();
        }
        getFilterQualityfv9h1I viewModelStore = gPSActivity.getViewModelStore();
        int i5 = serializer + 9;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
        return viewModelStore;
    }
}
