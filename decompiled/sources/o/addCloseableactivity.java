package o;

import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.huawei.hms.location.ActivityIdentificationData;

/* JADX INFO: loaded from: classes.dex */
public final class addCloseableactivity implements getAutoSizeMinTextSize, IntentSenderRequest {
    public final /* synthetic */ OnBackPressedCallback write;

    @Override // o.IntentSenderRequest
    public boolean read(AlertControllerButtonHandler alertControllerButtonHandler, MenuItem menuItem) {
        return false;
    }

    public /* synthetic */ addCloseableactivity(OnBackPressedCallback onBackPressedCallback) {
        this.write = onBackPressedCallback;
    }

    public void IconCompatParcelizer(int i) {
        if (i == 0) {
            OnBackPressedCallback onBackPressedCallback = this.write;
            if (onBackPressedCallback.MediaMetadataCompat) {
                return;
            }
            onBackPressedCallback.write.MediaSessionCompatQueueItem = true;
            onBackPressedCallback.MediaMetadataCompat = true;
        }
    }

    @Override // o.IntentSenderRequest
    public void write(AlertControllerButtonHandler alertControllerButtonHandler) {
        OnBackPressedCallback onBackPressedCallback = this.write;
        boolean zMediaMetadataCompat = onBackPressedCallback.write.PlaybackStateCompat.MediaMetadataCompat();
        Window.Callback callback = onBackPressedCallback.MediaSessionCompatQueueItem;
        if (zMediaMetadataCompat) {
            callback.onPanelClosed(ActivityIdentificationData.RUNNING, alertControllerButtonHandler);
        } else if (callback.onPreparePanel(0, null, alertControllerButtonHandler)) {
            callback.onMenuOpened(ActivityIdentificationData.RUNNING, alertControllerButtonHandler);
        }
    }

    public View read(int i) {
        if (i == 0) {
            return new View(this.write.write.PlaybackStateCompat.getContext());
        }
        return null;
    }
}
