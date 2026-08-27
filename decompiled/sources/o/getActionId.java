package o;

import android.view.View;
import android.widget.Toast;

/* JADX INFO: loaded from: classes3.dex */
final class getActionId implements Runnable {
    final /* synthetic */ BrazeNotificationPayloadActionButton IconCompatParcelizer;
    final /* synthetic */ boolean serializer;

    @Override // java.lang.Runnable
    public final void run() {
        BrazeNotificationPayloadActionButton brazeNotificationPayloadActionButton = this.IconCompatParcelizer;
        Toast toast = new Toast(brazeNotificationPayloadActionButton.RemoteActionCompatParcelizer);
        toast.setDuration(0);
        toast.setView(new View(brazeNotificationPayloadActionButton.RemoteActionCompatParcelizer));
        toast.show();
        if (this.serializer) {
            brazeNotificationPayloadActionButton.serializer(false);
        }
    }

    public getActionId(BrazeNotificationPayloadActionButton brazeNotificationPayloadActionButton, boolean z) {
        this.IconCompatParcelizer = brazeNotificationPayloadActionButton;
        this.serializer = z;
    }
}
