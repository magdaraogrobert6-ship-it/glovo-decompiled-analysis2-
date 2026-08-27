package o;

import android.app.Application;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes4.dex */
public final class notifyChanged implements onUncaughtException {
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final /* synthetic */ int write = 1;

    public notifyChanged(onUncaughtException onuncaughtexception) {
        this.IconCompatParcelizer = onuncaughtexception;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        if (this.write == 0) {
            return new RulerTrackingMap((Application) this.IconCompatParcelizer.write());
        }
        Application application = (Application) this.IconCompatParcelizer.write();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) application.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public notifyChanged(accessgetWcp accessgetwcp, onUncaughtException onuncaughtexception) {
        this.IconCompatParcelizer = onuncaughtexception;
    }
}
