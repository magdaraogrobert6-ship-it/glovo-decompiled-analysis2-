package o;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getAutoSizeTextAvailableSizes implements OnBackInvokedCallback {
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write;

    public /* synthetic */ getAutoSizeTextAvailableSizes(int i, Object obj) {
        this.write = i;
        this.read = obj;
    }

    public final void onBackInvoked() {
        int i = this.write;
        Object obj = this.read;
        if (i == 0) {
            ((Runnable) obj).run();
        } else if (i != 1) {
            ((getSlotToReusedFromOnReuseNjRlDlw) obj).handleBackInvoked();
        } else {
            ((startActivityForResult) obj).MediaDescriptionCompat();
        }
    }
}
