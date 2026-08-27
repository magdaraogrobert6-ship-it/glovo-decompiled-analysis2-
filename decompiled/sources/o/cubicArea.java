package o;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public abstract class cubicArea extends computeCubicVerticalBounds {
    public final OnBackInvokedCallback IconCompatParcelizer;
    public final OnBackInvokedDispatcher RatingCompat;
    public final int read;
    public boolean write;

    public cubicArea(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.RatingCompat = onBackInvokedDispatcher;
        this.read = i;
        this.IconCompatParcelizer = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: o.cubicWinding
            public final void onBackInvoked() {
                this.IconCompatParcelizer.read();
            }
        } : new evaluateY(this);
    }

    @Override // o.computeCubicVerticalBounds
    public final void serializer(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.IconCompatParcelizer;
        if (z && !this.write) {
            this.RatingCompat.registerOnBackInvokedCallback(this.read, onBackInvokedCallback);
            this.write = true;
        } else {
            if (z || !this.write) {
                return;
            }
            this.RatingCompat.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.write = false;
        }
    }
}
