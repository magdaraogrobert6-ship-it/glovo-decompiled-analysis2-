package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import o.CameraUpdateException;
import o.ImageCaptureFailedForSpecificCombinationQuirk;
import o.ImageCaptureRotationOptionQuirk;
import o.IncorrectJpegMetadataQuirk;
import o.SoftwareJpegEncodingPreferredQuirk;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements CameraUpdateException {
    public static final IncorrectJpegMetadataQuirk IconCompatParcelizer;
    public static final HashSet RemoteActionCompatParcelizer;
    public static final IncorrectJpegMetadataQuirk read;
    public static final HashSet write;

    static {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = new IncorrectJpegMetadataQuirk();
        SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk = SoftwareJpegEncodingPreferredQuirk.YUV;
        ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk = ImageCaptureFailedForSpecificCombinationQuirk.VGA;
        incorrectJpegMetadataQuirk.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk));
        SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk2 = SoftwareJpegEncodingPreferredQuirk.PRIV;
        ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk2 = ImageCaptureFailedForSpecificCombinationQuirk.PREVIEW;
        incorrectJpegMetadataQuirk.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk2));
        ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk3 = ImageCaptureFailedForSpecificCombinationQuirk.MAXIMUM;
        incorrectJpegMetadataQuirk.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk3));
        IconCompatParcelizer = incorrectJpegMetadataQuirk;
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk2 = new IncorrectJpegMetadataQuirk();
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirk2, softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk);
        incorrectJpegMetadataQuirk2.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk3));
        read = incorrectJpegMetadataQuirk2;
        RemoteActionCompatParcelizer = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"));
        write = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"));
    }

    public static boolean read() {
        if (!Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = write.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
