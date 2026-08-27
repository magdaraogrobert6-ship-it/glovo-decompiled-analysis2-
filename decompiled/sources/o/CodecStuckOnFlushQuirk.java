package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CodecStuckOnFlushQuirk {
    public static final HashSet RemoteActionCompatParcelizer;
    public static final ExtraSupportedResolutionQuirk[] read;
    public static final ExtraSupportedResolutionQuirk[][] serializer;
    public static final String write;
    public final ArrayList IconCompatParcelizer;
    public final ByteOrder MediaBrowserCompatMediaItem;

    public CodecStuckOnFlushQuirk(ByteOrder byteOrder, ArrayList arrayList) {
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.MediaBrowserCompatMediaItem = byteOrder;
        this.IconCompatParcelizer = arrayList;
    }

    public final Map RemoteActionCompatParcelizer(int i) {
        coil3.util.UtilsKt.serializer(d$$ExternalSyntheticOutline0.m(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "), i, 0, 4);
        return (Map) this.IconCompatParcelizer.get(i);
    }

    static {
        ExtraSupportedResolutionQuirk[] extraSupportedResolutionQuirkArr = {new ExtraSupportedResolutionQuirk("ImageWidth", androidx.compose.ui.graphics.Fields.RotationX, 3, 4), new ExtraSupportedResolutionQuirk("ImageLength", 257, 3, 4), new ExtraSupportedResolutionQuirk("Make", 271, 2), new ExtraSupportedResolutionQuirk("Model", 272, 2), new ExtraSupportedResolutionQuirk("Orientation", 274, 3), new ExtraSupportedResolutionQuirk("XResolution", 282, 5), new ExtraSupportedResolutionQuirk("YResolution", 283, 5), new ExtraSupportedResolutionQuirk("ResolutionUnit", 296, 3), new ExtraSupportedResolutionQuirk("Software", 305, 2), new ExtraSupportedResolutionQuirk("DateTime", 306, 2), new ExtraSupportedResolutionQuirk("YCbCrPositioning", 531, 3), new ExtraSupportedResolutionQuirk("SubIFDPointer", 330, 4), new ExtraSupportedResolutionQuirk("ExifIFDPointer", 34665, 4), new ExtraSupportedResolutionQuirk("GPSInfoIFDPointer", 34853, 4)};
        ExtraSupportedResolutionQuirk[] extraSupportedResolutionQuirkArr2 = {new ExtraSupportedResolutionQuirk("ExposureTime", 33434, 5), new ExtraSupportedResolutionQuirk("FNumber", 33437, 5), new ExtraSupportedResolutionQuirk("ExposureProgram", 34850, 3), new ExtraSupportedResolutionQuirk("PhotographicSensitivity", 34855, 3), new ExtraSupportedResolutionQuirk("SensitivityType", 34864, 3), new ExtraSupportedResolutionQuirk("ExifVersion", 36864, 2), new ExtraSupportedResolutionQuirk("DateTimeOriginal", 36867, 2), new ExtraSupportedResolutionQuirk("DateTimeDigitized", 36868, 2), new ExtraSupportedResolutionQuirk("ComponentsConfiguration", 37121, 7), new ExtraSupportedResolutionQuirk("ShutterSpeedValue", 37377, 10), new ExtraSupportedResolutionQuirk("ApertureValue", 37378, 5), new ExtraSupportedResolutionQuirk("BrightnessValue", 37379, 10), new ExtraSupportedResolutionQuirk("ExposureBiasValue", 37380, 10), new ExtraSupportedResolutionQuirk("MaxApertureValue", 37381, 5), new ExtraSupportedResolutionQuirk("MeteringMode", 37383, 3), new ExtraSupportedResolutionQuirk("LightSource", 37384, 3), new ExtraSupportedResolutionQuirk("Flash", 37385, 3), new ExtraSupportedResolutionQuirk("FocalLength", 37386, 5), new ExtraSupportedResolutionQuirk("SubSecTime", 37520, 2), new ExtraSupportedResolutionQuirk("SubSecTimeOriginal", 37521, 2), new ExtraSupportedResolutionQuirk("SubSecTimeDigitized", 37522, 2), new ExtraSupportedResolutionQuirk("FlashpixVersion", 40960, 7), new ExtraSupportedResolutionQuirk("ColorSpace", 40961, 3), new ExtraSupportedResolutionQuirk("PixelXDimension", 40962, 3, 4), new ExtraSupportedResolutionQuirk("PixelYDimension", 40963, 3, 4), new ExtraSupportedResolutionQuirk("InteroperabilityIFDPointer", 40965, 4), new ExtraSupportedResolutionQuirk("FocalPlaneResolutionUnit", 41488, 3), new ExtraSupportedResolutionQuirk("SensingMethod", 41495, 3), new ExtraSupportedResolutionQuirk("FileSource", 41728, 7), new ExtraSupportedResolutionQuirk("SceneType", 41729, 7), new ExtraSupportedResolutionQuirk("CustomRendered", 41985, 3), new ExtraSupportedResolutionQuirk("ExposureMode", 41986, 3), new ExtraSupportedResolutionQuirk("WhiteBalance", 41987, 3), new ExtraSupportedResolutionQuirk("SceneCaptureType", 41990, 3), new ExtraSupportedResolutionQuirk("Contrast", 41992, 3), new ExtraSupportedResolutionQuirk("Saturation", 41993, 3), new ExtraSupportedResolutionQuirk("Sharpness", 41994, 3)};
        ExtraSupportedResolutionQuirk[] extraSupportedResolutionQuirkArr3 = {new ExtraSupportedResolutionQuirk("GPSVersionID", 0, 1), new ExtraSupportedResolutionQuirk("GPSLatitudeRef", 1, 2), new ExtraSupportedResolutionQuirk("GPSLatitude", 2, 5, 10), new ExtraSupportedResolutionQuirk("GPSLongitudeRef", 3, 2), new ExtraSupportedResolutionQuirk("GPSLongitude", 4, 5, 10), new ExtraSupportedResolutionQuirk("GPSAltitudeRef", 5, 1), new ExtraSupportedResolutionQuirk("GPSAltitude", 6, 5), new ExtraSupportedResolutionQuirk("GPSTimeStamp", 7, 5), new ExtraSupportedResolutionQuirk("GPSSpeedRef", 12, 2), new ExtraSupportedResolutionQuirk("GPSTrackRef", 14, 2), new ExtraSupportedResolutionQuirk("GPSImgDirectionRef", 16, 2), new ExtraSupportedResolutionQuirk("GPSDestBearingRef", 23, 2), new ExtraSupportedResolutionQuirk("GPSDestDistanceRef", 25, 2)};
        read = new ExtraSupportedResolutionQuirk[]{new ExtraSupportedResolutionQuirk("SubIFDPointer", 330, 4), new ExtraSupportedResolutionQuirk("ExifIFDPointer", 34665, 4), new ExtraSupportedResolutionQuirk("GPSInfoIFDPointer", 34853, 4), new ExtraSupportedResolutionQuirk("InteroperabilityIFDPointer", 40965, 4)};
        serializer = new ExtraSupportedResolutionQuirk[][]{extraSupportedResolutionQuirkArr, extraSupportedResolutionQuirkArr2, extraSupportedResolutionQuirkArr3, new ExtraSupportedResolutionQuirk[]{new ExtraSupportedResolutionQuirk("InteroperabilityIndex", 1, 2)}};
        RemoteActionCompatParcelizer = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        write = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }
}
