package o;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class getReusedNjRlDlw {
    public OnBackInvokedCallback read;

    public void write(getSlotToReusedFromOnReuseNjRlDlw getslottoreusedfromonreusenjrldlw, View view, boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.read == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            OnBackInvokedCallback onBackInvokedCallbackCf_ = cf_(getslottoreusedfromonreusenjrldlw);
            this.read = onBackInvokedCallbackCf_;
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? 1000000 : 0, onBackInvokedCallbackCf_);
        }
    }

    public OnBackInvokedCallback cf_(getSlotToReusedFromOnReuseNjRlDlw getslottoreusedfromonreusenjrldlw) {
        Objects.requireNonNull(getslottoreusedfromonreusenjrldlw);
        return new getAutoSizeTextAvailableSizes(2, getslottoreusedfromonreusenjrldlw);
    }

    public void RemoteActionCompatParcelizer(View view) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
        if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.read);
        this.read = null;
    }
}
