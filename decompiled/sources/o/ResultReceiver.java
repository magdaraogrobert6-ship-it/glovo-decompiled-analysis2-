package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ResultReceiver implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int read;
    public final /* synthetic */ androidx.activity.ComponentActivity write;

    public /* synthetic */ ResultReceiver(androidx.activity.ComponentActivity componentActivity, int i) {
        this.read = i;
        this.write = componentActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.read;
        androidx.activity.ComponentActivity componentActivity = this.write;
        if (i == 0) {
            return androidx.activity.ComponentActivity.fullyDrawnReporter_delegate$lambda$0(componentActivity);
        }
        if (i == 1) {
            return androidx.activity.ComponentActivity.fullyDrawnReporter_delegate$lambda$0$0(componentActivity);
        }
        if (i != 2) {
            return i != 3 ? androidx.activity.ComponentActivity.onBackPressedDispatcher_delegate$lambda$0(componentActivity) : androidx.activity.ComponentActivity.defaultViewModelProviderFactory_delegate$lambda$0(componentActivity);
        }
        return androidx.activity.ComponentActivity.onBackPressedInput_delegate$lambda$0(componentActivity);
    }
}
