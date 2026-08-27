package o;

import com.roadrunner.liveness.presentation.LivenessDetectionActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class onConfigure implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ LivenessDetectionActivity write;

    public /* synthetic */ onConfigure(LivenessDetectionActivity livenessDetectionActivity, int i) {
        this.serializer = i;
        this.write = livenessDetectionActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.serializer;
        LivenessDetectionActivity livenessDetectionActivity = this.write;
        if (i3 != 0) {
            return livenessDetectionActivity.getDefaultViewModelCreationExtras();
        }
        getFilterQualityfv9h1I viewModelStore = livenessDetectionActivity.getViewModelStore();
        int i4 = IconCompatParcelizer + 91;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return viewModelStore;
        }
        obj.hashCode();
        throw null;
    }
}
