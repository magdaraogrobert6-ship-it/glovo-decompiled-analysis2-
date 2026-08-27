package o;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.google.firebase.messaging.EnhancedIntentService;

/* JADX INFO: loaded from: classes2.dex */
public final class accessaddExtraDataToAccessibilityNodeInfoHelper extends Binder {
    public final PinnableContainerKtLocalPinnableContainer1 serializer;

    public accessaddExtraDataToAccessibilityNodeInfoHelper(PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1) {
        this.serializer = pinnableContainerKtLocalPinnableContainer1;
    }

    public final void write(accessdispatchGenericMotionEvents408734394 accessdispatchgenericmotionevents408734394) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseMessaging", 3);
        EnhancedIntentService.access$000((EnhancedIntentService) this.serializer.serializer, accessdispatchgenericmotionevents408734394.read).addOnCompleteListener(new setSupportButtonTintList(1), new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(21, accessdispatchgenericmotionevents408734394));
    }
}
