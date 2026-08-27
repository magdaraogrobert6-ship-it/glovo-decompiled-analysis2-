package o;

import com.sentiance.sdk.OnInitCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class BrazeActionReceiverActionReceiver implements Runnable {
    final /* synthetic */ OnInitCallback read;

    public BrazeActionReceiverActionReceiver(OnInitCallback onInitCallback) {
        this.read = onInitCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnInitCallback onInitCallback = this.read;
        if (onInitCallback != null) {
            onInitCallback.onInitFailure(OnInitCallback.InitIssue.SDK_RESET_IN_PROGRESS, null);
        }
    }
}
