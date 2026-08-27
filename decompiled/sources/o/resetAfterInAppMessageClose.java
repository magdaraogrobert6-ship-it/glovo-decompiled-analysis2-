package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import fwfd.com.fwfsdk.util.FWFHelper;
import java.util.Objects;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class resetAfterInAppMessageClose {
    public static float serializer(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float write(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static final replaceCards write(String str) {
        int i;
        TuplesKt.RemoteActionCompatParcelizer(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (removeNodeAtDepth.serializer(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i4 = iDigit + i3;
            if (Integer.compareUnsigned(i4, i3) < 0) {
                return null;
            }
            i++;
            i2 = i4;
        }
        return new replaceCards(i2);
    }

    public static final describeContents read(String str) {
        str.getClass();
        TuplesKt.RemoteActionCompatParcelizer(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (removeNodeAtDepth.serializer(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, 10L);
                if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j2 = j * 10;
            long j3 = (((long) iDigit) & 4294967295L) + j2;
            if (Long.compareUnsigned(j3, j2) < 0) {
                return null;
            }
            i++;
            j = j3;
        }
        return new describeContents(j);
    }

    public static int RemoteActionCompatParcelizer(Context context, android.view.ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        int dimensionPixelSize;
        if (Build.VERSION.SDK_INT >= 34) {
            return saveFocusedChild.serializer(viewConfiguration, i, i2, i3);
        }
        InputDevice device = InputDevice.getDevice(i);
        if (device == null || device.getMotionRange(i2, i3) == null) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int identifier = (i3 == 4194304 && i2 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", FWFHelper.fwfDeviceOS) : -1;
        Objects.requireNonNull(viewConfiguration);
        if (identifier == -1) {
            return viewConfiguration.getScaledMinimumFlingVelocity();
        }
        if (identifier == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(identifier)) < 0) {
            return Integer.MAX_VALUE;
        }
        return dimensionPixelSize;
    }

    public static int serializer(Context context, android.view.ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        int dimensionPixelSize;
        if (Build.VERSION.SDK_INT >= 34) {
            return saveFocusedChild.IconCompatParcelizer(viewConfiguration, i, i2, i3);
        }
        InputDevice device = InputDevice.getDevice(i);
        if (device == null || device.getMotionRange(i2, i3) == null) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int identifier = (i3 == 4194304 && i2 == 26) ? resources.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", FWFHelper.fwfDeviceOS) : -1;
        Objects.requireNonNull(viewConfiguration);
        if (identifier == -1) {
            return viewConfiguration.getScaledMaximumFlingVelocity();
        }
        if (identifier == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(identifier)) < 0) {
            return Integer.MIN_VALUE;
        }
        return dimensionPixelSize;
    }
}
