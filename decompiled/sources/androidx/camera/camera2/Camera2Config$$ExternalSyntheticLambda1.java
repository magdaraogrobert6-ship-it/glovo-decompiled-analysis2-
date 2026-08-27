package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.internal.Camera2DeviceSurfaceManager;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Camera2Config$$ExternalSyntheticLambda1 {
    public static Camera2DeviceSurfaceManager IconCompatParcelizer(Context context, Object obj, LinkedHashSet linkedHashSet) throws InitializationException {
        try {
            return new Camera2DeviceSurfaceManager(context, obj, linkedHashSet);
        } catch (CameraUnavailableException e) {
            throw new InitializationException(e);
        }
    }
}
