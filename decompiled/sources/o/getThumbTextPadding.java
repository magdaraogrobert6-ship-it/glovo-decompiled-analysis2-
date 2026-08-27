package o;

import android.hardware.camera2.CameraCharacteristics;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class getThumbTextPadding {
    public androidx.navigation.NavArgsLazy MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public AuthPromptFailureException MediaMetadataCompat;
    public Camera2CameraFactory MediaSessionCompatQueueItem;
    public final setImplementationMode RemoteActionCompatParcelizer;
    public final PreviewFreezeAfterHighSpeedRecordingQuirk read;
    public final getThumbTintList serializer;
    public final boolean write;
    public boolean RatingCompat = false;
    public boolean IconCompatParcelizer = false;

    public getThumbTextPadding(getThumbTintList getthumbtintlist, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk) {
        boolean z;
        this.write = false;
        this.MediaDescriptionCompat = false;
        this.serializer = getthumbtintlist;
        this.read = previewFreezeAfterHighSpeedRecordingQuirk;
        int[] iArr = (int[]) getthumbtintlist.write(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            z = false;
            break;
        }
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else {
                if (iArr[i] == 4) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.write = z;
        this.MediaDescriptionCompat = setThumbTintList.RemoteActionCompatParcelizer.read(androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.class) != null;
        this.RemoteActionCompatParcelizer = new setImplementationMode(3, new getTrackDrawable(0));
    }

    public final void write() {
        AuthPromptFailureException authPromptFailureException = this.MediaMetadataCompat;
        if (authPromptFailureException != null) {
            authPromptFailureException.read();
            this.MediaMetadataCompat = null;
        }
        androidx.navigation.NavArgsLazy navArgsLazy = this.MediaBrowserCompatMediaItem;
        if (navArgsLazy != null) {
            ((AtomicBoolean) navArgsLazy.read).set(false);
            this.MediaBrowserCompatMediaItem = null;
        }
        while (true) {
            setImplementationMode setimplementationmode = this.RemoteActionCompatParcelizer;
            if (setimplementationmode.serializer()) {
                break;
            } else {
                ((getInflatedId) setimplementationmode.RemoteActionCompatParcelizer()).close();
            }
        }
        Camera2CameraFactory camera2CameraFactory = this.MediaSessionCompatQueueItem;
        if (camera2CameraFactory != null) {
            camera2CameraFactory.write();
            this.MediaSessionCompatQueueItem = null;
        }
    }
}
