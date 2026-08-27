package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class nativeShiftPixel {
    public static final getLogoDescription serializer;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new toFlashState(2));
        serializer = new getLogoDescription(linkedHashSet);
    }

    public static void write(Context context, androidx.camera.core.impl.CameraRepository cameraRepository, getLogoDescription getlogodescription) throws CameraValidator$CameraIdListIncorrectException {
        Integer num;
        if (Build.VERSION.SDK_INT >= 34 && nativeRotateYUV.write(context) != 0) {
            LinkedHashSet linkedHashSetSerializer = cameraRepository.serializer();
            nativeRotateYUV.write(context);
            linkedHashSetSerializer.size();
            setInflatedId.IconCompatParcelizer(3, "CameraValidator");
            return;
        }
        IllegalArgumentException e = null;
        if (getlogodescription != null) {
            try {
                num = getlogodescription.read();
                if (num == null) {
                    setInflatedId.read("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e2) {
                setInflatedId.read("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e2);
                return;
            }
        } else {
            num = null;
        }
        String str = Build.DEVICE;
        setInflatedId.IconCompatParcelizer(3, "CameraValidator");
        PackageManager packageManager = context.getPackageManager();
        int i = 0;
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (getlogodescription == null || num.intValue() == 1)) {
                getLogoDescription.serializer.IconCompatParcelizer(cameraRepository.serializer());
                i = 1;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            setInflatedId.RemoteActionCompatParcelizer("CameraValidator", "Camera LENS_FACING_BACK verification failed", e);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (getlogodescription == null || num.intValue() == 0)) {
                getLogoDescription.write.IconCompatParcelizer(cameraRepository.serializer());
                i++;
            }
        } catch (IllegalArgumentException e4) {
            e = e4;
            setInflatedId.RemoteActionCompatParcelizer("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e);
        }
        try {
            serializer.IconCompatParcelizer(cameraRepository.serializer());
            setInflatedId.IconCompatParcelizer(3, "CameraValidator");
            i++;
        } catch (IllegalArgumentException unused) {
        }
        if (e == null) {
            return;
        }
        setInflatedId.serializer("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + cameraRepository.serializer());
        throw new CameraValidator$CameraIdListIncorrectException(i, e);
    }
}
