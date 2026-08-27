package o;

import android.app.KeyguardManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatTextView {
    public static boolean read(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }

    public static KeyguardManager read(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }
}
