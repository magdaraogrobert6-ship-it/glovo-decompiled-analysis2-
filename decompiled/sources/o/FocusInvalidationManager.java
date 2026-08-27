package o;

import android.app.PictureInPictureUiState;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FocusInvalidationManager {
    public static toContentCaptureSession br_(PictureInPictureUiState pictureInPictureUiState) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            return new toContentCaptureSession(8);
        }
        if (i < 31) {
            return new toContentCaptureSession(8);
        }
        pictureInPictureUiState.isStashed();
        return new toContentCaptureSession(8);
    }
}
