package o;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class getRootState {
    public static /* synthetic */ int RemoteActionCompatParcelizer() {
        int i = Build.VERSION.SDK_INT;
        return i < 36 ? i * androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength : Build.VERSION.SDK_INT_FULL;
    }
}
