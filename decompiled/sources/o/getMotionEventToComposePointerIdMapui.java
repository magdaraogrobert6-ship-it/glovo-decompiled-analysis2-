package o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import com.roadrunner.lib.compose.permission.PermissionContentKt;
import java.nio.BufferUnderflowException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getMotionEventToComposePointerIdMapui {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    public static boolean serializer(setStacked setstacked) {
        Boolean bool;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        try {
            if (i2 % 2 == 0) {
                CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
                int i3 = setstacked.read;
                throw null;
            }
            CameraCharacteristics.Key key2 = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            Object objWrite = setstacked.IconCompatParcelizer.write(setstacked.read != 0 ? CameraCharacteristics.FLASH_INFO_AVAILABLE : CameraCharacteristics.FLASH_INFO_AVAILABLE);
            int i4 = read + 57;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                try {
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            bool = (Boolean) objWrite;
            if (bool == null) {
                setInflatedId.read("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
            }
            if (bool == null) {
                return false;
            }
            int i5 = RemoteActionCompatParcelizer + 53;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return bool.booleanValue();
        } catch (BufferUnderflowException e) {
            if (setThumbTintList.RemoteActionCompatParcelizer.read(androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT));
                setInflatedId.IconCompatParcelizer(3, "FlashAvailability");
            } else {
                setInflatedId.read("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e);
            }
            bool = Boolean.FALSE;
        }
    }

    public static final void IconCompatParcelizer(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1435388479);
        boolean z3 = true;
        if ((i & 6) == 0) {
            if (!(!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0))) {
                int i6 = RemoteActionCompatParcelizer + 17;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i8 = i2 | 48;
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i9 = RemoteActionCompatParcelizer + 119;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    int i10 = 3 / 2;
                }
                i3 = androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i3 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i8 |= i3;
        }
        if ((i8 & 147) != 146) {
            int i11 = read + 97;
            RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i8 & 1, z2)) {
            PermissionContentKt.PermissionDialogCard(new getTypeConverter(com.logistics.rider.glovo.R.string.df_pudo_bluetooth_enable_dialog_title, com.logistics.rider.glovo.R.string.df_pudo_bluetooth_enable_dialog_description, com.logistics.rider.glovo.R.string.df_pudo_bluetooth_enable_dialog_button_text, com.logistics.rider.glovo.R.string.df_pudo_bluetooth_enable_dialog_skip_button_text), true, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode, (i8 & 112) | ((i8 << 6) & 896) | ((i8 << 3) & 7168), 16);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            z3 = z;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdanw7AWrZT1ZtNTucsvl4gTUEQRqg(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, i, 5);
        }
    }
}
