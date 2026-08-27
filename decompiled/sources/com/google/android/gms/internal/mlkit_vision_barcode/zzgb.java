package com.google.android.gms.internal.mlkit_vision_barcode;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.Camera2CameraFactory;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.Iterator;
import o.FocusMeteringAction;
import o.getLogoDescription;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgb {
    public static ArrayList RemoteActionCompatParcelizer(Camera2CameraFactory camera2CameraFactory, getLogoDescription getlogodescription, ArrayList arrayList) throws InitializationException {
        String str;
        try {
            ArrayList arrayList2 = new ArrayList();
            if (getlogodescription == null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((String) it.next());
                }
            } else {
                try {
                    str = read(camera2CameraFactory.read, getlogodescription.read(), arrayList);
                } catch (IllegalStateException unused) {
                    str = null;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (!str2.equals(str)) {
                        arrayList3.add(camera2CameraFactory.write(str2));
                    }
                }
                for (FocusMeteringAction focusMeteringAction : getlogodescription.write(arrayList3)) {
                    arrayList2.add(focusMeteringAction.read());
                }
            }
            return arrayList2;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(new CameraUnavailableException(e));
        } catch (CameraUnavailableException e2) {
            throw new InitializationException(e2);
        }
    }

    public static String read(CameraManagerCompat cameraManagerCompat, Integer num, ArrayList arrayList) {
        if (num == null || !arrayList.contains("0") || !arrayList.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) cameraManagerCompat.serializer("0").write(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) cameraManagerCompat.serializer("1").write(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }
}
