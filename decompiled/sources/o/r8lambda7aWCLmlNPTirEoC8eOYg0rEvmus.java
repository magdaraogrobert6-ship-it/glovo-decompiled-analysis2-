package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus implements Runnable {
    public final /* synthetic */ androidx.activity.ComponentActivity RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(androidx.activity.ComponentActivity componentActivity, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        androidx.activity.ComponentActivity componentActivity = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            androidx.activity.ComponentActivity.onBackPressedDispatcher_delegate$lambda$0$0(componentActivity);
        } else {
            componentActivity.invalidateMenu();
        }
    }
}
