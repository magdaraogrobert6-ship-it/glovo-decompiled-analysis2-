package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import java.util.Iterator;
import o.accessgetApiAvailablecp;
import o.filterTreedefault;
import o.filterTreelambda0;
import o.r8lambdahKqWkK2sqJkz9lmLXp4YuqHwTU;
import o.toDebugString;
import o.toDebugStringdefault;
import o.toDebugStringlambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class CameraIdUtil {
    private static int read = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[RETURN] */
    public static boolean read(CameraManagerCompat cameraManagerCompat, String str) throws InitializationException {
        int i;
        int i2 = 2 % 2;
        int i3 = write + 63;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            if ("robolectric".equals(Build.FINGERPRINT)) {
                return true;
            }
            try {
                int[] iArr = (int[]) cameraManagerCompat.serializer(str).write(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                if (iArr != null) {
                    int length = iArr.length;
                    int i4 = read + 27;
                    write = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    for (int i6 = 0; i6 < length; i6++) {
                        int i7 = read;
                        int i8 = i7 + 89;
                        write = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 == 0) {
                            if (iArr[i6] == 0) {
                                i = i7 + 107;
                                write = i % Fields.SpotShadowColor;
                                if (i % 2 != 0) {
                                    return false;
                                }
                                return true;
                            }
                        } else {
                            int i9 = 9 / 0;
                            if (iArr[i6] == 0) {
                                i = i7 + 107;
                                write = i % Fields.SpotShadowColor;
                                if (i % 2 != 0) {
                                    return false;
                                }
                                return true;
                            }
                        }
                    }
                }
                return false;
            } catch (CameraAccessExceptionCompat e) {
                throw new InitializationException(new CameraUnavailableException(e));
            }
        }
        "robolectric".equals(Build.FINGERPRINT);
        throw null;
    }

    public static r8lambdahKqWkK2sqJkz9lmLXp4YuqHwTU RemoteActionCompatParcelizer(int i) {
        Object next;
        int i2 = 2 % 2;
        int i3 = write + 81;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Iterator it = SQLite.read(toDebugStringdefault.IconCompatParcelizer, filterTreelambda0.serializer, toDebugStringlambda0.write, filterTreedefault.serializer, toDebugString.serializer).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((r8lambdahKqWkK2sqJkz9lmLXp4YuqHwTU) next).read() == i) {
                int i5 = read + 111;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                break;
            }
        }
        r8lambdahKqWkK2sqJkz9lmLXp4YuqHwTU r8lambdahkqwkk2sqjkz9lmlxp4yuqhwtu = (r8lambdahKqWkK2sqJkz9lmLXp4YuqHwTU) next;
        if (r8lambdahkqwkk2sqjkz9lmlxp4yuqhwtu == null) {
            return new accessgetApiAvailablecp(i);
        }
        int i7 = read + 27;
        write = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return r8lambdahkqwkk2sqjkz9lmlxp4yuqhwtu;
        }
        throw null;
    }
}
