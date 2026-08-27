package o;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.view.Surface;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getTrackDrawable implements setTextClassifier, BiometricFragmentExternalSyntheticLambda7, Camera2CameraImpl {
    public final /* synthetic */ int IconCompatParcelizer;

    @Override // o.Camera2CameraImpl
    public void write(getCollapseContentDescription getcollapsecontentdescription) {
    }

    public /* synthetic */ getTrackDrawable(int i) {
        this.IconCompatParcelizer = i;
    }

    public static /* synthetic */ void IconCompatParcelizer(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // o.BiometricFragmentExternalSyntheticLambda7
    public void RemoteActionCompatParcelizer(androidx.camera.core.SurfaceRequest surfaceRequest) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(surfaceRequest.MediaSessionCompatQueueItem.getWidth(), surfaceRequest.MediaSessionCompatQueueItem.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        surfaceRequest.write(surface, removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read(), new updateWko1d7g(surface, 0, surfaceTexture));
    }

    public /* synthetic */ getTrackDrawable(int i, Object obj) {
        this.IconCompatParcelizer = i;
    }

    @Override // o.setTextClassifier
    public Object read(Object obj) {
        int i = this.IconCompatParcelizer;
        if (i == 8) {
            return Boolean.TRUE;
        }
        if (i == 9) {
            return null;
        }
        if (i == 11) {
            return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
        }
        if (i == 12) {
            return Boolean.FALSE;
        }
        if (i == 21) {
            return null;
        }
        if (i == 22) {
            setTitleMarginEnd settitlemarginend = setNavigationOnClickListener.read;
            return null;
        }
        if (i == 24) {
            return obj;
        }
        return minIntrinsicWidth.IconCompatParcelizer;
    }

    public static /* bridge */ /* synthetic */ DynamicRangeProfiles aj_(Object obj) {
        return (DynamicRangeProfiles) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback ak_(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher al_(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }
}
