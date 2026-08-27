package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nativeWriteJpegToSurface {
    public int IconCompatParcelizer;
    public int MediaMetadataCompat;
    public final StringBuilder RemoteActionCompatParcelizer = new StringBuilder();
    public final androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator read;
    public final HashMap serializer;
    public final Object write;

    public final boolean RemoteActionCompatParcelizer(String str, String str2) {
        synchronized (this.write) {
            boolean z = true;
            if (this.read.IconCompatParcelizer() != 2) {
                return true;
            }
            nativeNewDirectByteBuffer nativenewdirectbytebufferWrite = write(str);
            nativeConvertAndroid420ToABGR nativeconvertandroid420toabgr = nativenewdirectbytebufferWrite != null ? nativenewdirectbytebufferWrite.write : null;
            nativeNewDirectByteBuffer nativenewdirectbytebufferWrite2 = str2 != null ? write(str2) : null;
            nativeConvertAndroid420ToABGR nativeconvertandroid420toabgr2 = nativenewdirectbytebufferWrite2 != null ? nativenewdirectbytebufferWrite2.write : null;
            nativeConvertAndroid420ToABGR nativeconvertandroid420toabgr3 = nativeConvertAndroid420ToABGR.OPEN;
            boolean z2 = nativeconvertandroid420toabgr3.equals(nativeconvertandroid420toabgr) || nativeConvertAndroid420ToABGR.CONFIGURED.equals(nativeconvertandroid420toabgr);
            boolean z3 = nativeconvertandroid420toabgr3.equals(nativeconvertandroid420toabgr2) || nativeConvertAndroid420ToABGR.CONFIGURED.equals(nativeconvertandroid420toabgr2);
            if (!z2 || !z3) {
                z = false;
            }
            return z;
        }
    }

    public final nativeNewDirectByteBuffer write(String str) {
        HashMap map = this.serializer;
        for (getContentInsetStart getcontentinsetstart : map.keySet()) {
            if (str.equals(getcontentinsetstart.ResultReceiver().read())) {
                return (nativeNewDirectByteBuffer) map.get(getcontentinsetstart);
            }
        }
        return null;
    }

    public final void serializer() {
        String string;
        boolean zIconCompatParcelizer = setInflatedId.IconCompatParcelizer(3, "CameraStateRegistry");
        StringBuilder sb = this.RemoteActionCompatParcelizer;
        if (zIconCompatParcelizer) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(java.util.Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.serializer.entrySet()) {
            if (setInflatedId.IconCompatParcelizer(3, "CameraStateRegistry")) {
                if (((nativeNewDirectByteBuffer) entry.getValue()).write != null) {
                    string = ((nativeNewDirectByteBuffer) entry.getValue()).write.toString();
                } else {
                    string = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                }
                sb.append(String.format(java.util.Locale.US, "%-45s%-22s\n", ((getContentInsetStart) entry.getKey()).toString(), string));
            }
            nativeConvertAndroid420ToABGR nativeconvertandroid420toabgr = ((nativeNewDirectByteBuffer) entry.getValue()).write;
            if (nativeconvertandroid420toabgr != null && nativeconvertandroid420toabgr.holdsCameraSlot()) {
                i++;
            }
        }
        if (setInflatedId.IconCompatParcelizer(3, "CameraStateRegistry")) {
            sb.append("-------------------------------------------------------------------\n");
            java.util.Locale locale = java.util.Locale.US;
            sb.append(af$$ExternalSyntheticOutline0.m(i, this.MediaMetadataCompat, "Open count: ", " (Max allowed: ", ")"));
            setInflatedId.IconCompatParcelizer(3, "CameraStateRegistry");
        }
        this.IconCompatParcelizer = Math.max(this.MediaMetadataCompat - i, 0);
    }

    public nativeWriteJpegToSurface(androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator camera2CameraCoordinator) {
        Object obj = new Object();
        this.write = obj;
        this.serializer = new HashMap();
        this.MediaMetadataCompat = 1;
        synchronized (obj) {
            this.read = camera2CameraCoordinator;
            this.IconCompatParcelizer = this.MediaMetadataCompat;
        }
    }

    public final boolean serializer(androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl) {
        boolean z;
        String str;
        nativeConvertAndroid420ToABGR nativeconvertandroid420toabgr;
        synchronized (this.write) {
            nativeNewDirectByteBuffer nativenewdirectbytebuffer = (nativeNewDirectByteBuffer) this.serializer.get(camera2CameraImpl);
            coil3.util.UtilsKt.IconCompatParcelizer(nativenewdirectbytebuffer, "Camera must first be registered with registerCamera()");
            z = true;
            if (setInflatedId.IconCompatParcelizer(3, "CameraStateRegistry")) {
                this.RemoteActionCompatParcelizer.setLength(0);
                StringBuilder sb = this.RemoteActionCompatParcelizer;
                java.util.Locale locale = java.util.Locale.US;
                int i = this.IconCompatParcelizer;
                nativeConvertAndroid420ToABGR nativeconvertandroid420toabgr2 = nativenewdirectbytebuffer.write;
                boolean z2 = nativeconvertandroid420toabgr2 != null && nativeconvertandroid420toabgr2.holdsCameraSlot();
                sb.append("tryOpenCamera(" + camera2CameraImpl + ") [Available Cameras: " + i + ", Already Open: " + z2 + " (Previous state: " + nativenewdirectbytebuffer.write + ")]");
            }
            if (this.IconCompatParcelizer > 0 || ((nativeconvertandroid420toabgr = nativenewdirectbytebuffer.write) != null && nativeconvertandroid420toabgr.holdsCameraSlot())) {
                nativeConvertAndroid420ToABGR nativeconvertandroid420toabgr3 = nativeConvertAndroid420ToABGR.OPENING;
                nativenewdirectbytebuffer.write = nativeconvertandroid420toabgr3;
                read(camera2CameraImpl, nativeconvertandroid420toabgr3);
            } else {
                z = false;
            }
            if (setInflatedId.IconCompatParcelizer(3, "CameraStateRegistry")) {
                StringBuilder sb2 = this.RemoteActionCompatParcelizer;
                java.util.Locale locale2 = java.util.Locale.US;
                if (z) {
                    str = "SUCCESS";
                } else {
                    str = "FAIL";
                }
                sb2.append(" --> ".concat(str));
                setInflatedId.IconCompatParcelizer(3, "CameraStateRegistry");
            }
            if (z) {
                serializer();
            }
        }
        return z;
    }

    public static void read(androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl, nativeConvertAndroid420ToABGR nativeconvertandroid420toabgr) throws Throwable {
        if (((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 1240730100, sourceInformationContextOfdefault.read(), new Object[0], sourceInformationContextOfdefault.read())).booleanValue()) {
            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read(nativeconvertandroid420toabgr.ordinal(), "CX:State[" + camera2CameraImpl + "]");
        }
    }
}
