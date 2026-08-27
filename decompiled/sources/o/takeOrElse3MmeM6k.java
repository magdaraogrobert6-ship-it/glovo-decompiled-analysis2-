package o;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.huawei.hms.location.LocationRequest;
import com.huawei.riemann.location.common.utils.Constant;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes.dex */
public final class takeOrElse3MmeM6k {
    public static final byte[] ComponentActivity;
    public static final int[] IconCompatParcelizer;
    public static final boolean MediaBrowserCompatMediaItem = Log.isLoggable("ExifInterface", 3);
    public static final Rect[][] MediaDescriptionCompat;
    public static final byte[] MediaMetadataCompat;
    public static final Pattern MediaSessionCompatQueueItem;
    public static final byte[] MediaSessionCompatResultReceiverWrapper;
    public static final byte[] MediaSessionCompatToken;
    public static final byte[] ParcelableVolumeInfo;
    public static final byte[] PlaybackStateCompat;
    public static final byte[] PlaybackStateCompatCustomAction;
    public static final Rect[] RatingCompat;
    public static final Pattern RemoteActionCompatParcelizer;
    public static final String[] ResultReceiver;
    public static final byte[] _init_lambda1;
    public static final byte[] _init_lambda2;
    public static final byte[] _init_lambda3;
    public static final byte[] _init_lambda4;
    public static final byte[] accessensureViewModelStore;
    public static final HashMap[] addObserverForBackInvokerlambda0;
    public static final HashMap createFullyDrawnExecutor;
    public static final HashMap[] defaultViewModelProviderFactory_delegatelambda0;
    public static final int[] r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public static final byte[] r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public static final byte[] r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public static final byte[] r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public static final byte[] r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public static final byte[] r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public static final Set r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public static final byte[] r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public static final byte[] r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public static final byte[] r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public static final Rect r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public static final byte[] r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public static final byte[] r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public static final int[] read;
    public static final Charset serializer;
    public static final Pattern write;
    public boolean addContentView;
    public byte[] addMenuProvider;
    public final AssetManager.AssetInputStream addObserverForBackInvoker;
    public int addOnConfigurationChangedListener;
    public final FileDescriptor addOnContextAvailableListener;
    public int addOnMultiWindowModeChangedListener;
    public int addOnNewIntentListener;
    public int addOnPictureInPictureUiStateChangedListener;
    public int addOnTrimMemoryListener;
    public getWidthannotations addOnUserLeaveHintListener;
    public boolean ensureViewModelStore;
    public int enterPictureInPictureMode;
    public final HashSet fullyDrawnReporter_delegatelambda0;
    public final HashMap[] fullyDrawnReporter_delegatelambda00;
    public final String getOnBackPressedInput;
    public boolean getSavedStateRegistryControllerannotations;
    public ByteOrder menuHostHelperlambda0;
    public final boolean onBackPressedDispatcher_delegatelambda0;
    public int onBackPressedDispatcher_delegatelambda00;
    public int onBackPressedDispatcher_delegatelambda010;
    public boolean onBackPressedInput_delegatelambda0;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        IconCompatParcelizer = new int[]{8, 8, 8};
        read = new int[]{8};
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new byte[]{-1, -40, -1};
        MediaSessionCompatToken = new byte[]{102, 116, 121, 112};
        PlaybackStateCompat = new byte[]{109, 105, 102, 49};
        PlaybackStateCompatCustomAction = new byte[]{104, 101, 105, 99};
        ParcelableVolumeInfo = new byte[]{97, 118, 105, 102};
        MediaSessionCompatResultReceiverWrapper = new byte[]{97, 118, 105, 115};
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new byte[]{79, 76, 89, 77, 80, 0};
        r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        _init_lambda2 = new byte[]{82, 73, 70, 70};
        _init_lambda3 = new byte[]{87, 69, 66, 80};
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new byte[]{69, 88, 73, 70};
        _init_lambda1 = new byte[]{-99, 1, 42};
        _init_lambda4 = "VP8X".getBytes(Charset.defaultCharset());
        accessensureViewModelStore = "VP8L".getBytes(Charset.defaultCharset());
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = "VP8 ".getBytes(Charset.defaultCharset());
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = "ANIM".getBytes(Charset.defaultCharset());
        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = "ANMF".getBytes(Charset.defaultCharset());
        ResultReceiver = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        MediaMetadataCompat = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        Rect[] rectArr = {new Rect("NewSubfileType", Constant.ERROR_ROAD_AREA_INVALID, 4), new Rect("SubfileType", 255, 4), new Rect("ImageWidth", androidx.compose.ui.graphics.Fields.RotationX, 3, 4), new Rect("ImageLength", 257, 3, 4), new Rect("BitsPerSample", 258, 3), new Rect("Compression", 259, 3), new Rect("PhotometricInterpretation", 262, 3), new Rect("ImageDescription", 270, 2), new Rect("Make", 271, 2), new Rect("Model", 272, 2), new Rect("StripOffsets", 273, 3, 4), new Rect("Orientation", 274, 3), new Rect("SamplesPerPixel", 277, 3), new Rect("RowsPerStrip", 278, 3, 4), new Rect("StripByteCounts", 279, 3, 4), new Rect("XResolution", 282, 5), new Rect("YResolution", 283, 5), new Rect("PlanarConfiguration", 284, 3), new Rect("ResolutionUnit", 296, 3), new Rect("TransferFunction", LocationRequest.PRIORITY_MAG_POSITION, 3), new Rect("Software", 305, 2), new Rect("DateTime", 306, 2), new Rect("Artist", 315, 2), new Rect("WhitePoint", 318, 5), new Rect("PrimaryChromaticities", 319, 5), new Rect("SubIFDPointer", 330, 4), new Rect("JPEGInterchangeFormat", 513, 4), new Rect("JPEGInterchangeFormatLength", 514, 4), new Rect("YCbCrCoefficients", 529, 5), new Rect("YCbCrSubSampling", 530, 3), new Rect("YCbCrPositioning", 531, 3), new Rect("ReferenceBlackWhite", 532, 5), new Rect("Copyright", 33432, 2), new Rect("ExifIFDPointer", 34665, 4), new Rect("GPSInfoIFDPointer", 34853, 4), new Rect("SensorTopBorder", 4, 4), new Rect("SensorLeftBorder", 5, 4), new Rect("SensorBottomBorder", 6, 4), new Rect("SensorRightBorder", 7, 4), new Rect("ISO", 23, 3), new Rect("JpgFromRaw", 46, 7), new Rect("Xmp", 700, 1)};
        Rect[] rectArr2 = {new Rect("ExposureTime", 33434, 5), new Rect("FNumber", 33437, 5), new Rect("ExposureProgram", 34850, 3), new Rect("SpectralSensitivity", 34852, 2), new Rect("PhotographicSensitivity", 34855, 3), new Rect("OECF", 34856, 7), new Rect("SensitivityType", 34864, 3), new Rect("StandardOutputSensitivity", 34865, 4), new Rect("RecommendedExposureIndex", 34866, 4), new Rect("ISOSpeed", 34867, 4), new Rect("ISOSpeedLatitudeyyy", 34868, 4), new Rect("ISOSpeedLatitudezzz", 34869, 4), new Rect("ExifVersion", 36864, 2), new Rect("DateTimeOriginal", 36867, 2), new Rect("DateTimeDigitized", 36868, 2), new Rect("OffsetTime", 36880, 2), new Rect("OffsetTimeOriginal", 36881, 2), new Rect("OffsetTimeDigitized", 36882, 2), new Rect("ComponentsConfiguration", 37121, 7), new Rect("CompressedBitsPerPixel", 37122, 5), new Rect("ShutterSpeedValue", 37377, 10), new Rect("ApertureValue", 37378, 5), new Rect("BrightnessValue", 37379, 10), new Rect("ExposureBiasValue", 37380, 10), new Rect("MaxApertureValue", 37381, 5), new Rect("SubjectDistance", 37382, 5), new Rect("MeteringMode", 37383, 3), new Rect("LightSource", 37384, 3), new Rect("Flash", 37385, 3), new Rect("FocalLength", 37386, 5), new Rect("SubjectArea", 37396, 3), new Rect("MakerNote", 37500, 7), new Rect("UserComment", 37510, 7), new Rect("SubSecTime", 37520, 2), new Rect("SubSecTimeOriginal", 37521, 2), new Rect("SubSecTimeDigitized", 37522, 2), new Rect("FlashpixVersion", 40960, 7), new Rect("ColorSpace", 40961, 3), new Rect("PixelXDimension", 40962, 3, 4), new Rect("PixelYDimension", 40963, 3, 4), new Rect("RelatedSoundFile", 40964, 2), new Rect("InteroperabilityIFDPointer", 40965, 4), new Rect("FlashEnergy", 41483, 5), new Rect("SpatialFrequencyResponse", 41484, 7), new Rect("FocalPlaneXResolution", 41486, 5), new Rect("FocalPlaneYResolution", 41487, 5), new Rect("FocalPlaneResolutionUnit", 41488, 3), new Rect("SubjectLocation", 41492, 3), new Rect("ExposureIndex", 41493, 5), new Rect("SensingMethod", 41495, 3), new Rect("FileSource", 41728, 7), new Rect("SceneType", 41729, 7), new Rect("CFAPattern", 41730, 7), new Rect("CustomRendered", 41985, 3), new Rect("ExposureMode", 41986, 3), new Rect("WhiteBalance", 41987, 3), new Rect("DigitalZoomRatio", 41988, 5), new Rect("FocalLengthIn35mmFilm", 41989, 3), new Rect("SceneCaptureType", 41990, 3), new Rect("GainControl", 41991, 3), new Rect("Contrast", 41992, 3), new Rect("Saturation", 41993, 3), new Rect("Sharpness", 41994, 3), new Rect("DeviceSettingDescription", 41995, 7), new Rect("SubjectDistanceRange", 41996, 3), new Rect("ImageUniqueID", 42016, 2), new Rect("CameraOwnerName", 42032, 2), new Rect("BodySerialNumber", 42033, 2), new Rect("LensSpecification", 42034, 5), new Rect("LensMake", 42035, 2), new Rect("LensModel", 42036, 2), new Rect("Gamma", 42240, 5), new Rect("DNGVersion", 50706, 1), new Rect("DefaultCropSize", 50720, 3, 4)};
        Rect[] rectArr3 = {new Rect("GPSVersionID", 0, 1), new Rect("GPSLatitudeRef", 1, 2), new Rect("GPSLatitude", 2, 5, 10), new Rect("GPSLongitudeRef", 3, 2), new Rect("GPSLongitude", 4, 5, 10), new Rect("GPSAltitudeRef", 5, 1), new Rect("GPSAltitude", 6, 5), new Rect("GPSTimeStamp", 7, 5), new Rect("GPSSatellites", 8, 2), new Rect("GPSStatus", 9, 2), new Rect("GPSMeasureMode", 10, 2), new Rect("GPSDOP", 11, 5), new Rect("GPSSpeedRef", 12, 2), new Rect("GPSSpeed", 13, 5), new Rect("GPSTrackRef", 14, 2), new Rect("GPSTrack", 15, 5), new Rect("GPSImgDirectionRef", 16, 2), new Rect("GPSImgDirection", 17, 5), new Rect("GPSMapDatum", 18, 2), new Rect("GPSDestLatitudeRef", 19, 2), new Rect("GPSDestLatitude", 20, 5), new Rect("GPSDestLongitudeRef", 21, 2), new Rect("GPSDestLongitude", 22, 5), new Rect("GPSDestBearingRef", 23, 2), new Rect("GPSDestBearing", 24, 5), new Rect("GPSDestDistanceRef", 25, 2), new Rect("GPSDestDistance", 26, 5), new Rect("GPSProcessingMethod", 27, 7), new Rect("GPSAreaInformation", 28, 7), new Rect("GPSDateStamp", 29, 2), new Rect("GPSDifferential", 30, 3), new Rect("GPSHPositioningError", 31, 5)};
        Rect[] rectArr4 = {new Rect("InteroperabilityIndex", 1, 2)};
        Rect[] rectArr5 = {new Rect("NewSubfileType", Constant.ERROR_ROAD_AREA_INVALID, 4), new Rect("SubfileType", 255, 4), new Rect("ThumbnailImageWidth", androidx.compose.ui.graphics.Fields.RotationX, 3, 4), new Rect("ThumbnailImageLength", 257, 3, 4), new Rect("BitsPerSample", 258, 3), new Rect("Compression", 259, 3), new Rect("PhotometricInterpretation", 262, 3), new Rect("ImageDescription", 270, 2), new Rect("Make", 271, 2), new Rect("Model", 272, 2), new Rect("StripOffsets", 273, 3, 4), new Rect("ThumbnailOrientation", 274, 3), new Rect("SamplesPerPixel", 277, 3), new Rect("RowsPerStrip", 278, 3, 4), new Rect("StripByteCounts", 279, 3, 4), new Rect("XResolution", 282, 5), new Rect("YResolution", 283, 5), new Rect("PlanarConfiguration", 284, 3), new Rect("ResolutionUnit", 296, 3), new Rect("TransferFunction", LocationRequest.PRIORITY_MAG_POSITION, 3), new Rect("Software", 305, 2), new Rect("DateTime", 306, 2), new Rect("Artist", 315, 2), new Rect("WhitePoint", 318, 5), new Rect("PrimaryChromaticities", 319, 5), new Rect("SubIFDPointer", 330, 4), new Rect("JPEGInterchangeFormat", 513, 4), new Rect("JPEGInterchangeFormatLength", 514, 4), new Rect("YCbCrCoefficients", 529, 5), new Rect("YCbCrSubSampling", 530, 3), new Rect("YCbCrPositioning", 531, 3), new Rect("ReferenceBlackWhite", 532, 5), new Rect("Copyright", 33432, 2), new Rect("ExifIFDPointer", 34665, 4), new Rect("GPSInfoIFDPointer", 34853, 4), new Rect("DNGVersion", 50706, 1), new Rect("DefaultCropSize", 50720, 3, 4)};
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new Rect("StripOffsets", 273, 3);
        MediaDescriptionCompat = new Rect[][]{rectArr, rectArr2, rectArr3, rectArr4, rectArr5, rectArr, new Rect[]{new Rect("ThumbnailImage", androidx.compose.ui.graphics.Fields.RotationX, 7), new Rect("CameraSettingsIFDPointer", 8224, 4), new Rect("ImageProcessingIFDPointer", 8256, 4)}, new Rect[]{new Rect("PreviewImageStart", 257, 4), new Rect("PreviewImageLength", 258, 4)}, new Rect[]{new Rect("AspectFrame", 4371, 3)}, new Rect[]{new Rect("ColorSpace", 55, 3)}};
        RatingCompat = new Rect[]{new Rect("SubIFDPointer", 330, 4), new Rect("ExifIFDPointer", 34665, 4), new Rect("GPSInfoIFDPointer", 34853, 4), new Rect("InteroperabilityIFDPointer", 40965, 4), new Rect("CameraSettingsIFDPointer", 8224, 1), new Rect("ImageProcessingIFDPointer", 8256, 1)};
        addObserverForBackInvokerlambda0 = new HashMap[10];
        defaultViewModelProviderFactory_delegatelambda0 = new HashMap[10];
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        createFullyDrawnExecutor = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        serializer = charsetForName;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = "Exif\u0000\u0000".getBytes(charsetForName);
        ComponentActivity = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        java.util.Locale locale = java.util.Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            Rect[][] rectArr6 = MediaDescriptionCompat;
            if (i >= rectArr6.length) {
                HashMap map = createFullyDrawnExecutor;
                Rect[] rectArr7 = RatingCompat;
                map.put(Integer.valueOf(rectArr7[0].write), 5);
                map.put(Integer.valueOf(rectArr7[1].write), 1);
                map.put(Integer.valueOf(rectArr7[2].write), 2);
                map.put(Integer.valueOf(rectArr7[3].write), 3);
                map.put(Integer.valueOf(rectArr7[4].write), 7);
                map.put(Integer.valueOf(rectArr7[5].write), 8);
                Pattern.compile(".*[1-9].*");
                MediaSessionCompatQueueItem = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                RemoteActionCompatParcelizer = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                write = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            addObserverForBackInvokerlambda0[i] = new HashMap();
            defaultViewModelProviderFactory_delegatelambda0[i] = new HashMap();
            for (Rect rect : rectArr6[i]) {
                addObserverForBackInvokerlambda0[i].put(Integer.valueOf(rect.write), rect);
                defaultViewModelProviderFactory_delegatelambda0[i].put(rect.IconCompatParcelizer, rect);
            }
            i++;
        }
    }

    public static Pair IconCompatParcelizer(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairIconCompatParcelizer = IconCompatParcelizer(strArrSplit[0]);
            if (((Integer) pairIconCompatParcelizer.first).intValue() == 2) {
                return pairIconCompatParcelizer;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairIconCompatParcelizer2 = IconCompatParcelizer(strArrSplit[i]);
                int iIntValue = (((Integer) pairIconCompatParcelizer2.first).equals(pairIconCompatParcelizer.first) || ((Integer) pairIconCompatParcelizer2.second).equals(pairIconCompatParcelizer.first)) ? ((Integer) pairIconCompatParcelizer.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairIconCompatParcelizer.second).intValue() == -1 || !(((Integer) pairIconCompatParcelizer2.first).equals(pairIconCompatParcelizer.second) || ((Integer) pairIconCompatParcelizer2.second).equals(pairIconCompatParcelizer.second))) ? -1 : ((Integer) pairIconCompatParcelizer.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairIconCompatParcelizer = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairIconCompatParcelizer = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairIconCompatParcelizer;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    if (j < 0 || j > 65535) {
                        return j < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public final void read(String str) {
        for (int i = 0; i < MediaDescriptionCompat.length; i++) {
            this.fullyDrawnReporter_delegatelambda00[i].remove(str);
        }
    }

    public final void write() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.fullyDrawnReporter_delegatelambda00;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                getWidthannotations getwidthannotations = (getWidthannotations) entry.getValue();
                getwidthannotations.toString();
                getwidthannotations.read(this.menuHostHelperlambda0);
            }
            i++;
        }
    }

    public final void IconCompatParcelizer() {
        write(0, 5);
        write(0, 4);
        write(5, 4);
        HashMap[] mapArr = this.fullyDrawnReporter_delegatelambda00;
        getWidthannotations getwidthannotations = (getWidthannotations) mapArr[1].get("PixelXDimension");
        getWidthannotations getwidthannotations2 = (getWidthannotations) mapArr[1].get("PixelYDimension");
        if (getwidthannotations != null && getwidthannotations2 != null) {
            mapArr[0].put("ImageWidth", getwidthannotations);
            mapArr[0].put("ImageLength", getwidthannotations2);
        }
        if (mapArr[4].isEmpty() && serializer(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        serializer(mapArr[4]);
        IconCompatParcelizer(0, "ThumbnailOrientation", "Orientation");
        IconCompatParcelizer(0, "ThumbnailImageLength", "ImageLength");
        IconCompatParcelizer(0, "ThumbnailImageWidth", "ImageWidth");
        IconCompatParcelizer(5, "ThumbnailOrientation", "Orientation");
        IconCompatParcelizer(5, "ThumbnailImageLength", "ImageLength");
        IconCompatParcelizer(5, "ThumbnailImageWidth", "ImageWidth");
        IconCompatParcelizer(4, "Orientation", "ThumbnailOrientation");
        IconCompatParcelizer(4, "ImageLength", "ThumbnailImageLength");
        IconCompatParcelizer(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void IconCompatParcelizer(int i, String str, String str2) {
        HashMap[] mapArr = this.fullyDrawnReporter_delegatelambda00;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (getWidthannotations) map.get(str));
        mapArr[i].remove(str);
    }

    public final void RemoteActionCompatParcelizer() {
        String strSerializer = serializer("DateTimeOriginal");
        HashMap[] mapArr = this.fullyDrawnReporter_delegatelambda00;
        if (strSerializer != null && serializer("DateTime") == null) {
            mapArr[0].put("DateTime", getWidthannotations.write(strSerializer));
        }
        if (serializer("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", getWidthannotations.RemoteActionCompatParcelizer(0L, this.menuHostHelperlambda0));
        }
        if (serializer("ImageLength") == null) {
            mapArr[0].put("ImageLength", getWidthannotations.RemoteActionCompatParcelizer(0L, this.menuHostHelperlambda0));
        }
        if (serializer("Orientation") == null) {
            mapArr[0].put("Orientation", getWidthannotations.RemoteActionCompatParcelizer(0L, this.menuHostHelperlambda0));
        }
        if (serializer("LightSource") == null) {
            mapArr[1].put("LightSource", getWidthannotations.RemoteActionCompatParcelizer(0L, this.menuHostHelperlambda0));
        }
    }

    public final void serializer(AudioSourceAccessException audioSourceAccessException) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.onBackPressedDispatcher_delegatelambda010 = ((DataOutputStream) audioSourceAccessException.IconCompatParcelizer).size() + read(new AudioSourceAccessException(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        audioSourceAccessException.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        audioSourceAccessException.IconCompatParcelizer((int) crc32.getValue());
    }

    public final void serializer(getSizeNHjbRcannotations getsizenhjbrcannotations, HashMap map) throws IOException {
        getWidthannotations getwidthannotations = (getWidthannotations) map.get("JPEGInterchangeFormat");
        getWidthannotations getwidthannotations2 = (getWidthannotations) map.get("JPEGInterchangeFormatLength");
        if (getwidthannotations == null || getwidthannotations2 == null) {
            return;
        }
        int iIconCompatParcelizer = getwidthannotations.IconCompatParcelizer(this.menuHostHelperlambda0);
        int iIconCompatParcelizer2 = getwidthannotations2.IconCompatParcelizer(this.menuHostHelperlambda0);
        if (this.onBackPressedDispatcher_delegatelambda00 == 7) {
            iIconCompatParcelizer += this.addOnConfigurationChangedListener;
        }
        if (iIconCompatParcelizer <= 0 || iIconCompatParcelizer2 <= 0) {
            return;
        }
        this.onBackPressedInput_delegatelambda0 = true;
        if (this.getOnBackPressedInput == null && this.addObserverForBackInvoker == null && this.addOnContextAvailableListener == null) {
            byte[] bArr = new byte[iIconCompatParcelizer2];
            getsizenhjbrcannotations.IconCompatParcelizer(iIconCompatParcelizer);
            getsizenhjbrcannotations.readFully(bArr);
            this.addMenuProvider = bArr;
        }
        this.enterPictureInPictureMode = iIconCompatParcelizer;
        this.addOnPictureInPictureUiStateChangedListener = iIconCompatParcelizer2;
    }

    public final boolean serializer(HashMap map) {
        getWidthannotations getwidthannotations = (getWidthannotations) map.get("ImageLength");
        getWidthannotations getwidthannotations2 = (getWidthannotations) map.get("ImageWidth");
        if (getwidthannotations == null || getwidthannotations2 == null) {
            return false;
        }
        return getwidthannotations.IconCompatParcelizer(this.menuHostHelperlambda0) <= 512 && getwidthannotations2.IconCompatParcelizer(this.menuHostHelperlambda0) <= 512;
    }

    public final boolean serializer(getHeightannotations getheightannotations) throws IOException {
        byte[] bArr = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        byte[] bArr2 = new byte[bArr.length];
        getheightannotations.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            SentryLogcatAdapter.IconCompatParcelizer("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrCopyOf = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
        int i = 0;
        while (true) {
            if (i == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i2 = getheightannotations.RemoteActionCompatParcelizer.read(bArrCopyOf, i, bArrCopyOf.length - i);
            if (i2 == -1) {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
                this.onBackPressedDispatcher_delegatelambda010 = bArr.length;
                write(0, bArrCopyOf2);
                return true;
            }
            i += i2;
            getheightannotations.write += i2;
        }
    }

    public final void write(int i, int i2) {
        HashMap[] mapArr = this.fullyDrawnReporter_delegatelambda00;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        getWidthannotations getwidthannotations = (getWidthannotations) mapArr[i].get("ImageLength");
        getWidthannotations getwidthannotations2 = (getWidthannotations) mapArr[i].get("ImageWidth");
        getWidthannotations getwidthannotations3 = (getWidthannotations) mapArr[i2].get("ImageLength");
        getWidthannotations getwidthannotations4 = (getWidthannotations) mapArr[i2].get("ImageWidth");
        if (getwidthannotations == null || getwidthannotations2 == null || getwidthannotations3 == null || getwidthannotations4 == null) {
            return;
        }
        int iIconCompatParcelizer = getwidthannotations.IconCompatParcelizer(this.menuHostHelperlambda0);
        int iIconCompatParcelizer2 = getwidthannotations2.IconCompatParcelizer(this.menuHostHelperlambda0);
        int iIconCompatParcelizer3 = getwidthannotations3.IconCompatParcelizer(this.menuHostHelperlambda0);
        int iIconCompatParcelizer4 = getwidthannotations4.IconCompatParcelizer(this.menuHostHelperlambda0);
        if (iIconCompatParcelizer >= iIconCompatParcelizer3 || iIconCompatParcelizer2 >= iIconCompatParcelizer4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void write(int i, byte[] bArr) throws IOException {
        getHeightannotations getheightannotations = new getHeightannotations(bArr);
        write(getheightannotations);
        read(getheightannotations, i);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0255 A[Catch: all -> 0x0261, Exception -> 0x0265, TRY_ENTER, TRY_LEAVE, TryCatch #13 {Exception -> 0x0265, all -> 0x0261, blocks: (B:111:0x0255, B:101:0x021a, B:106:0x022c), top: B:149:0x003c }] */
    public final void write(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        ByteArrayOutputStream byteArrayOutputStream3;
        int i5;
        byte[] bArr;
        AudioSourceAccessException audioSourceAccessException;
        if (MediaBrowserCompatMediaItem) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        getSizeNHjbRcannotations getsizenhjbrcannotations = new getSizeNHjbRcannotations(bufferedInputStream, byteOrder);
        AudioSourceAccessException audioSourceAccessException2 = new AudioSourceAccessException(bufferedOutputStream, byteOrder);
        byte[] bArr2 = _init_lambda2;
        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.serializer(getsizenhjbrcannotations, audioSourceAccessException2, bArr2.length);
        int i6 = getsizenhjbrcannotations.readInt();
        byte[] bArr3 = _init_lambda3;
        getsizenhjbrcannotations.IconCompatParcelizer(bArr3.length);
        ByteArrayOutputStream byteArrayOutputStream4 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    AudioSourceAccessException audioSourceAccessException3 = new AudioSourceAccessException(byteArrayOutputStream, byteOrder);
                    int i7 = this.onBackPressedDispatcher_delegatelambda010;
                    try {
                        try {
                            try {
                                if (i7 != 0) {
                                    r8lambdagkrDDkERifauZUmtkJOYYCCYn0.serializer(getsizenhjbrcannotations, audioSourceAccessException3, (i7 - ((bArr2.length + 4) + bArr3.length)) - 8);
                                    getsizenhjbrcannotations.IconCompatParcelizer(4);
                                    int i8 = getsizenhjbrcannotations.readInt();
                                    if (i8 % 2 != 0) {
                                        i8++;
                                    }
                                    getsizenhjbrcannotations.IconCompatParcelizer(i8);
                                    i5 = read(audioSourceAccessException3);
                                } else {
                                    byte[] bArr4 = new byte[4];
                                    getsizenhjbrcannotations.readFully(bArr4);
                                    byte[] bArr5 = _init_lambda4;
                                    boolean zEquals = Arrays.equals(bArr4, bArr5);
                                    byte[] bArr6 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                                    byte[] bArr7 = accessensureViewModelStore;
                                    if (!zEquals) {
                                        if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                                            int i9 = getsizenhjbrcannotations.readInt();
                                            int i10 = i9 % 2 == 1 ? i9 + 1 : i9;
                                            byte[] bArr8 = new byte[3];
                                            boolean zEquals2 = Arrays.equals(bArr4, bArr6);
                                            byte[] bArr9 = _init_lambda1;
                                            if (zEquals2) {
                                                getsizenhjbrcannotations.readFully(bArr8);
                                                byte[] bArr10 = new byte[3];
                                                getsizenhjbrcannotations.readFully(bArr10);
                                                if (!Arrays.equals(bArr9, bArr10)) {
                                                    throw new IOException("Error checking VP8 signature");
                                                }
                                                i2 = getsizenhjbrcannotations.readInt();
                                                int i11 = i10 - 10;
                                                i3 = i2 & 16383;
                                                i4 = (i2 >> 16) & 16383;
                                                i = i11;
                                                z = false;
                                            } else if (!Arrays.equals(bArr4, bArr7)) {
                                                i = i10;
                                                i2 = 0;
                                                i3 = 0;
                                                z = false;
                                                i4 = 0;
                                            } else {
                                                if (getsizenhjbrcannotations.readByte() != 47) {
                                                    throw new IOException("Error checking VP8L signature");
                                                }
                                                int i12 = getsizenhjbrcannotations.readInt();
                                                z = true;
                                                int i13 = (i12 & 16383) + 1;
                                                i4 = ((i12 & 268419072) >>> 14) + 1;
                                                if ((i12 & 268435456) == 0) {
                                                    z = false;
                                                }
                                                i2 = i12;
                                                i = i10 - 5;
                                                i3 = i13;
                                            }
                                            audioSourceAccessException3.write(bArr5);
                                            audioSourceAccessException3.IconCompatParcelizer(10);
                                            byte[] bArr11 = new byte[10];
                                            if (z) {
                                                bArr11[0] = (byte) (bArr11[0] | 16);
                                            }
                                            bArr11[0] = (byte) (bArr11[0] | 8);
                                            int i14 = i3 - 1;
                                            byteArrayOutputStream3 = byteArrayOutputStream;
                                            int i15 = i4 - 1;
                                            try {
                                                bArr11[4] = (byte) i14;
                                                bArr11[5] = (byte) (i14 >> 8);
                                                bArr11[6] = (byte) (i14 >> 16);
                                                bArr11[7] = (byte) i15;
                                                bArr11[8] = (byte) (i15 >> 8);
                                                bArr11[9] = (byte) (i15 >> 16);
                                                audioSourceAccessException3.write(bArr11);
                                                audioSourceAccessException3.write(bArr4);
                                                audioSourceAccessException3.IconCompatParcelizer(i9);
                                                if (Arrays.equals(bArr4, bArr6)) {
                                                    audioSourceAccessException3.write(bArr8);
                                                    audioSourceAccessException3.write(bArr9);
                                                    audioSourceAccessException3.IconCompatParcelizer(i2);
                                                } else if (Arrays.equals(bArr4, bArr7)) {
                                                    audioSourceAccessException3.write(47);
                                                    audioSourceAccessException3.IconCompatParcelizer(i2);
                                                }
                                                r8lambdagkrDDkERifauZUmtkJOYYCCYn0.serializer(getsizenhjbrcannotations, audioSourceAccessException3, i);
                                                i5 = read(audioSourceAccessException3);
                                                r8lambdagkrDDkERifauZUmtkJOYYCCYn0.serializer(getsizenhjbrcannotations, audioSourceAccessException3, (i6 + 8) - getsizenhjbrcannotations.write);
                                                byte[] bArr12 = bArr3;
                                                audioSourceAccessException = audioSourceAccessException2;
                                                audioSourceAccessException.IconCompatParcelizer(byteArrayOutputStream3.size() + bArr12.length);
                                                audioSourceAccessException.write(bArr12);
                                                if (i5 != -1) {
                                                    this.onBackPressedDispatcher_delegatelambda010 = ((DataOutputStream) audioSourceAccessException.IconCompatParcelizer).size() + i5;
                                                }
                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                                byteArrayOutputStream2.writeTo(audioSourceAccessException);
                                                r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(getsizenhjbrcannotations, audioSourceAccessException);
                                                r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(byteArrayOutputStream2);
                                                return;
                                            } catch (Exception e) {
                                                e = e;
                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                            } catch (Throwable th) {
                                                th = th;
                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                                byteArrayOutputStream = byteArrayOutputStream2;
                                                r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(byteArrayOutputStream);
                                                throw th;
                                            }
                                        } else {
                                            i5 = -1;
                                        }
                                        byteArrayOutputStream4 = byteArrayOutputStream2;
                                        throw new IOException("Failed to save WebP file", e);
                                    }
                                    int i16 = getsizenhjbrcannotations.readInt();
                                    byte[] bArr13 = new byte[i16 % 2 == 1 ? i16 + 1 : i16];
                                    getsizenhjbrcannotations.readFully(bArr13);
                                    byte b = (byte) (bArr13[0] | 8);
                                    bArr13[0] = b;
                                    boolean z2 = ((b >> 1) & 1) == 1;
                                    audioSourceAccessException3.write(bArr5);
                                    audioSourceAccessException3.IconCompatParcelizer(i16);
                                    audioSourceAccessException3.write(bArr13);
                                    if (z2) {
                                        byte[] bArr14 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                                        do {
                                            bArr = new byte[4];
                                            getsizenhjbrcannotations.readFully(bArr);
                                            int i17 = getsizenhjbrcannotations.readInt();
                                            audioSourceAccessException3.write(bArr);
                                            audioSourceAccessException3.IconCompatParcelizer(i17);
                                            if (i17 % 2 == 1) {
                                                i17++;
                                            }
                                            r8lambdagkrDDkERifauZUmtkJOYYCCYn0.serializer(getsizenhjbrcannotations, audioSourceAccessException3, i17);
                                        } while (!Arrays.equals(bArr, bArr14));
                                        while (true) {
                                            byte[] bArr15 = new byte[4];
                                            try {
                                                getsizenhjbrcannotations.readFully(bArr15);
                                                if (!Arrays.equals(bArr15, r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs)) {
                                                    break;
                                                }
                                                int i18 = getsizenhjbrcannotations.readInt();
                                                audioSourceAccessException3.write(bArr15);
                                                audioSourceAccessException3.IconCompatParcelizer(i18);
                                                if (i18 % 2 == 1) {
                                                    i18++;
                                                }
                                                r8lambdagkrDDkERifauZUmtkJOYYCCYn0.serializer(getsizenhjbrcannotations, audioSourceAccessException3, i18);
                                            } catch (EOFException unused) {
                                            }
                                        }
                                        i5 = read(audioSourceAccessException3);
                                    } else {
                                        while (true) {
                                            byte[] bArr16 = new byte[4];
                                            getsizenhjbrcannotations.readFully(bArr16);
                                            int i19 = getsizenhjbrcannotations.readInt();
                                            audioSourceAccessException3.write(bArr16);
                                            audioSourceAccessException3.IconCompatParcelizer(i19);
                                            if (i19 % 2 == 1) {
                                                i19++;
                                            }
                                            r8lambdagkrDDkERifauZUmtkJOYYCCYn0.serializer(getsizenhjbrcannotations, audioSourceAccessException3, i19);
                                            if (Arrays.equals(bArr16, bArr6) || (bArr7 != null && Arrays.equals(bArr16, bArr7))) {
                                                break;
                                            }
                                        }
                                        i5 = read(audioSourceAccessException3);
                                    }
                                }
                                byteArrayOutputStream2.writeTo(audioSourceAccessException);
                                r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(getsizenhjbrcannotations, audioSourceAccessException);
                                r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(byteArrayOutputStream2);
                                return;
                            } catch (Exception e2) {
                                e = e2;
                            } catch (Throwable th2) {
                                th = th2;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(byteArrayOutputStream);
                                throw th;
                            }
                            audioSourceAccessException2 = audioSourceAccessException2;
                            bArr3 = bArr3;
                            byteArrayOutputStream3 = byteArrayOutputStream;
                            r8lambdagkrDDkERifauZUmtkJOYYCCYn0.serializer(getsizenhjbrcannotations, audioSourceAccessException3, (i6 + 8) - getsizenhjbrcannotations.write);
                            byte[] bArr17 = bArr3;
                            audioSourceAccessException = audioSourceAccessException2;
                            audioSourceAccessException.IconCompatParcelizer(byteArrayOutputStream3.size() + bArr17.length);
                            audioSourceAccessException.write(bArr17);
                            if (i5 != -1) {
                                this.onBackPressedDispatcher_delegatelambda010 = ((DataOutputStream) audioSourceAccessException.IconCompatParcelizer).size() + i5;
                            }
                            byteArrayOutputStream2 = byteArrayOutputStream3;
                        } catch (Exception e3) {
                            e = e3;
                            byteArrayOutputStream4 = byteArrayOutputStream3;
                        } catch (Throwable th3) {
                            th = th3;
                            byteArrayOutputStream = byteArrayOutputStream3;
                            r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(byteArrayOutputStream);
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        byteArrayOutputStream4 = byteArrayOutputStream;
                    } catch (Throwable th4) {
                        th = th4;
                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th6) {
            th = th6;
            byteArrayOutputStream = byteArrayOutputStream4;
        }
    }

    public final void write(AudioSourceAccessException audioSourceAccessException) throws IOException {
        audioSourceAccessException.IconCompatParcelizer(this.addOnUserLeaveHintListener.IconCompatParcelizer.length + 22);
        CRC32 crc32 = new CRC32();
        audioSourceAccessException.IconCompatParcelizer(1767135348);
        crc32.update(105);
        crc32.update(26964);
        crc32.update(6902872);
        crc32.update(1767135348);
        byte[] bArr = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        audioSourceAccessException.write(bArr);
        crc32.update(bArr);
        audioSourceAccessException.write(this.addOnUserLeaveHintListener.IconCompatParcelizer);
        crc32.update(this.addOnUserLeaveHintListener.IconCompatParcelizer);
        audioSourceAccessException.IconCompatParcelizer((int) crc32.getValue());
        this.getSavedStateRegistryControllerannotations = true;
    }

    public final void write(getHeightannotations getheightannotations, int i) throws IOException {
        getWidthannotations getwidthannotationsRemoteActionCompatParcelizer;
        getWidthannotations getwidthannotationsRemoteActionCompatParcelizer2;
        HashMap[] mapArr = this.fullyDrawnReporter_delegatelambda00;
        getWidthannotations getwidthannotations = (getWidthannotations) mapArr[i].get("DefaultCropSize");
        getWidthannotations getwidthannotations2 = (getWidthannotations) mapArr[i].get("SensorTopBorder");
        getWidthannotations getwidthannotations3 = (getWidthannotations) mapArr[i].get("SensorLeftBorder");
        getWidthannotations getwidthannotations4 = (getWidthannotations) mapArr[i].get("SensorBottomBorder");
        getWidthannotations getwidthannotations5 = (getWidthannotations) mapArr[i].get("SensorRightBorder");
        if (getwidthannotations != null) {
            int i2 = getwidthannotations.serializer;
            ByteOrder byteOrder = this.menuHostHelperlambda0;
            if (i2 == 5) {
                isEmptyannotations[] isemptyannotationsArr = (isEmptyannotations[]) getwidthannotations.write(byteOrder);
                if (isemptyannotationsArr == null || isemptyannotationsArr.length != 2) {
                    SentryLogcatAdapter.IconCompatParcelizer("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(isemptyannotationsArr));
                    return;
                } else {
                    getwidthannotationsRemoteActionCompatParcelizer = getWidthannotations.write(new isEmptyannotations[]{isemptyannotationsArr[0]}, this.menuHostHelperlambda0);
                    getwidthannotationsRemoteActionCompatParcelizer2 = getWidthannotations.write(new isEmptyannotations[]{isemptyannotationsArr[1]}, this.menuHostHelperlambda0);
                }
            } else {
                int[] iArr = (int[]) getwidthannotations.write(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    SentryLogcatAdapter.IconCompatParcelizer("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                getwidthannotationsRemoteActionCompatParcelizer = getWidthannotations.RemoteActionCompatParcelizer(iArr[0], this.menuHostHelperlambda0);
                getwidthannotationsRemoteActionCompatParcelizer2 = getWidthannotations.RemoteActionCompatParcelizer(iArr[1], this.menuHostHelperlambda0);
            }
            mapArr[i].put("ImageWidth", getwidthannotationsRemoteActionCompatParcelizer);
            mapArr[i].put("ImageLength", getwidthannotationsRemoteActionCompatParcelizer2);
            return;
        }
        if (getwidthannotations2 != null && getwidthannotations3 != null && getwidthannotations4 != null && getwidthannotations5 != null) {
            int iIconCompatParcelizer = getwidthannotations2.IconCompatParcelizer(this.menuHostHelperlambda0);
            int iIconCompatParcelizer2 = getwidthannotations4.IconCompatParcelizer(this.menuHostHelperlambda0);
            int iIconCompatParcelizer3 = getwidthannotations5.IconCompatParcelizer(this.menuHostHelperlambda0);
            int iIconCompatParcelizer4 = getwidthannotations3.IconCompatParcelizer(this.menuHostHelperlambda0);
            if (iIconCompatParcelizer2 <= iIconCompatParcelizer || iIconCompatParcelizer3 <= iIconCompatParcelizer4) {
                return;
            }
            getWidthannotations getwidthannotationsRemoteActionCompatParcelizer3 = getWidthannotations.RemoteActionCompatParcelizer(iIconCompatParcelizer2 - iIconCompatParcelizer, this.menuHostHelperlambda0);
            getWidthannotations getwidthannotationsRemoteActionCompatParcelizer4 = getWidthannotations.RemoteActionCompatParcelizer(iIconCompatParcelizer3 - iIconCompatParcelizer4, this.menuHostHelperlambda0);
            mapArr[i].put("ImageLength", getwidthannotationsRemoteActionCompatParcelizer3);
            mapArr[i].put("ImageWidth", getwidthannotationsRemoteActionCompatParcelizer4);
            return;
        }
        getWidthannotations getwidthannotations6 = (getWidthannotations) mapArr[i].get("ImageLength");
        getWidthannotations getwidthannotations7 = (getWidthannotations) mapArr[i].get("ImageWidth");
        if (getwidthannotations6 == null || getwidthannotations7 == null) {
            getWidthannotations getwidthannotations8 = (getWidthannotations) mapArr[i].get("JPEGInterchangeFormat");
            getWidthannotations getwidthannotations9 = (getWidthannotations) mapArr[i].get("JPEGInterchangeFormatLength");
            if (getwidthannotations8 == null || getwidthannotations9 == null) {
                return;
            }
            int iIconCompatParcelizer5 = getwidthannotations8.IconCompatParcelizer(this.menuHostHelperlambda0);
            int iIconCompatParcelizer6 = getwidthannotations8.IconCompatParcelizer(this.menuHostHelperlambda0);
            getheightannotations.RemoteActionCompatParcelizer(iIconCompatParcelizer5);
            byte[] bArr = new byte[iIconCompatParcelizer6];
            getheightannotations.readFully(bArr);
            IconCompatParcelizer(new getSizeNHjbRcannotations(bArr), iIconCompatParcelizer5, i);
        }
    }

    public takeOrElse3MmeM6k(String str) throws Throwable {
        Rect[][] rectArr = MediaDescriptionCompat;
        this.fullyDrawnReporter_delegatelambda00 = new HashMap[rectArr.length];
        this.fullyDrawnReporter_delegatelambda0 = new HashSet(rectArr.length);
        this.menuHostHelperlambda0 = ByteOrder.BIG_ENDIAN;
        FileInputStream fileInputStream = null;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("filename cannot be null");
            throw null;
        }
        this.addObserverForBackInvoker = null;
        this.getOnBackPressedInput = str;
        try {
            FileInputStream fileInputStreamRemoteActionCompatParcelizer = getActiveFocusTargetNode.RemoteActionCompatParcelizer(new FileInputStream(str), str);
            try {
                try {
                    Os.lseek(fileInputStreamRemoteActionCompatParcelizer.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.addOnContextAvailableListener = fileInputStreamRemoteActionCompatParcelizer.getFD();
                } catch (Exception unused) {
                    this.addOnContextAvailableListener = null;
                }
                write(fileInputStreamRemoteActionCompatParcelizer);
                r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileInputStreamRemoteActionCompatParcelizer);
            } catch (Throwable th) {
                fileInputStream = fileInputStreamRemoteActionCompatParcelizer;
                th = th;
                r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void read(getHeightannotations getheightannotations) throws IOException {
        int i;
        int i2;
        IconCompatParcelizer(getheightannotations);
        HashMap[] mapArr = this.fullyDrawnReporter_delegatelambda00;
        getWidthannotations getwidthannotations = (getWidthannotations) mapArr[1].get("MakerNote");
        if (getwidthannotations != null) {
            getHeightannotations getheightannotations2 = new getHeightannotations(getwidthannotations.IconCompatParcelizer);
            getheightannotations2.IconCompatParcelizer = this.menuHostHelperlambda0;
            byte[] bArr = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            byte[] bArr2 = new byte[bArr.length];
            getheightannotations2.readFully(bArr2);
            getheightannotations2.RemoteActionCompatParcelizer(0L);
            byte[] bArr3 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            byte[] bArr4 = new byte[bArr3.length];
            getheightannotations2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                getheightannotations2.RemoteActionCompatParcelizer(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                getheightannotations2.RemoteActionCompatParcelizer(12L);
            }
            read(getheightannotations2, 6);
            getWidthannotations getwidthannotations2 = (getWidthannotations) mapArr[7].get("PreviewImageStart");
            getWidthannotations getwidthannotations3 = (getWidthannotations) mapArr[7].get("PreviewImageLength");
            if (getwidthannotations2 != null && getwidthannotations3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", getwidthannotations2);
                mapArr[5].put("JPEGInterchangeFormatLength", getwidthannotations3);
            }
            getWidthannotations getwidthannotations4 = (getWidthannotations) mapArr[8].get("AspectFrame");
            if (getwidthannotations4 != null) {
                int[] iArr = (int[]) getwidthannotations4.write(this.menuHostHelperlambda0);
                if (iArr == null || iArr.length != 4) {
                    SentryLogcatAdapter.IconCompatParcelizer("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                getWidthannotations getwidthannotationsRemoteActionCompatParcelizer = getWidthannotations.RemoteActionCompatParcelizer(i5, this.menuHostHelperlambda0);
                getWidthannotations getwidthannotationsRemoteActionCompatParcelizer2 = getWidthannotations.RemoteActionCompatParcelizer(i6, this.menuHostHelperlambda0);
                mapArr[0].put("ImageWidth", getwidthannotationsRemoteActionCompatParcelizer);
                mapArr[0].put("ImageLength", getwidthannotationsRemoteActionCompatParcelizer2);
            }
        }
    }

    public final String serializer(String str) {
        if (str != null) {
            getWidthannotations getwidthannotationsWrite = write(str);
            if (getwidthannotationsWrite != null) {
                int i = getwidthannotationsWrite.serializer;
                if (str.equals("GPSTimeStamp")) {
                    if (i != 5 && i != 10) {
                        SentryLogcatAdapter.IconCompatParcelizer("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                        return null;
                    }
                    isEmptyannotations[] isemptyannotationsArr = (isEmptyannotations[]) getwidthannotationsWrite.write(this.menuHostHelperlambda0);
                    if (isemptyannotationsArr != null && isemptyannotationsArr.length == 3) {
                        isEmptyannotations isemptyannotations = isemptyannotationsArr[0];
                        int i2 = (int) (isemptyannotations.write / isemptyannotations.serializer);
                        isEmptyannotations isemptyannotations2 = isemptyannotationsArr[1];
                        int i3 = (int) (isemptyannotations2.write / isemptyannotations2.serializer);
                        isEmptyannotations isemptyannotations3 = isemptyannotationsArr[2];
                        return String.format("%02d:%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) (isemptyannotations3.write / isemptyannotations3.serializer)));
                    }
                    SentryLogcatAdapter.IconCompatParcelizer("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(isemptyannotationsArr));
                    return null;
                }
                boolean zContains = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.contains(str);
                ByteOrder byteOrder = this.menuHostHelperlambda0;
                if (zContains) {
                    try {
                        return Double.toString(getwidthannotationsWrite.RemoteActionCompatParcelizer(byteOrder));
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    return getwidthannotationsWrite.read(byteOrder);
                }
            }
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("tag shouldn't be null");
        return null;
    }

    public final void IconCompatParcelizer(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        byte b;
        byte[] bArr;
        if (MediaBrowserCompatMediaItem) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        getSizeNHjbRcannotations getsizenhjbrcannotations = new getSizeNHjbRcannotations(bufferedInputStream);
        AudioSourceAccessException audioSourceAccessException = new AudioSourceAccessException(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (getsizenhjbrcannotations.readByte() != -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Invalid marker");
            return;
        }
        audioSourceAccessException.serializer(-1);
        if (getsizenhjbrcannotations.readByte() != -40) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Invalid marker");
            return;
        }
        audioSourceAccessException.serializer(-40);
        audioSourceAccessException.serializer(-1);
        audioSourceAccessException.serializer(-31);
        this.onBackPressedDispatcher_delegatelambda010 = read(audioSourceAccessException);
        getWidthannotations getwidthannotations = this.addOnUserLeaveHintListener;
        byte[] bArr2 = ComponentActivity;
        if (getwidthannotations != null) {
            audioSourceAccessException.write(-1);
            audioSourceAccessException.serializer(-31);
            audioSourceAccessException.read(bArr2.length + 2 + this.addOnUserLeaveHintListener.IconCompatParcelizer.length);
            audioSourceAccessException.write(bArr2);
            audioSourceAccessException.write(this.addOnUserLeaveHintListener.IconCompatParcelizer);
            this.getSavedStateRegistryControllerannotations = true;
        }
        byte[] bArr3 = new byte[androidx.compose.ui.graphics.Fields.TransformOrigin];
        while (getsizenhjbrcannotations.readByte() == -1) {
            do {
                b = getsizenhjbrcannotations.readByte();
            } while (b == -1);
            if (b == -39 || b == -38) {
                audioSourceAccessException.serializer(-1);
                audioSourceAccessException.serializer((int) b);
                r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(getsizenhjbrcannotations, audioSourceAccessException);
                return;
            }
            if (b != -31) {
                audioSourceAccessException.serializer(-1);
                audioSourceAccessException.serializer((int) b);
                int unsignedShort = getsizenhjbrcannotations.readUnsignedShort();
                audioSourceAccessException.read(unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Invalid length");
                    return;
                }
                while (i > 0) {
                    int i2 = getsizenhjbrcannotations.read(bArr3, 0, Math.min(i, androidx.compose.ui.graphics.Fields.TransformOrigin));
                    if (i2 < 0) {
                        break;
                    }
                    audioSourceAccessException.write(bArr3, 0, i2);
                    i -= i2;
                }
            } else {
                int unsignedShort2 = getsizenhjbrcannotations.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Invalid length");
                    return;
                }
                int length2 = bArr2.length;
                byte[] bArr4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (length >= length2) {
                    bArr = new byte[bArr2.length];
                } else {
                    bArr = length >= bArr4.length ? new byte[bArr4.length] : null;
                }
                if (bArr != null) {
                    getsizenhjbrcannotations.readFully(bArr);
                    if (r8lambdagkrDDkERifauZUmtkJOYYCCYn0.RemoteActionCompatParcelizer(bArr, bArr4) || r8lambdagkrDDkERifauZUmtkJOYYCCYn0.RemoteActionCompatParcelizer(bArr, bArr2)) {
                        getsizenhjbrcannotations.IconCompatParcelizer(length - bArr.length);
                    }
                }
                audioSourceAccessException.serializer(-1);
                audioSourceAccessException.serializer((int) b);
                audioSourceAccessException.read(unsignedShort2);
                if (bArr != null) {
                    length -= bArr.length;
                    audioSourceAccessException.write(bArr);
                }
                while (length > 0) {
                    int i3 = getsizenhjbrcannotations.read(bArr3, 0, Math.min(length, androidx.compose.ui.graphics.Fields.TransformOrigin));
                    if (i3 < 0) {
                        break;
                    }
                    audioSourceAccessException.write(bArr3, 0, i3);
                    length -= i3;
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Invalid marker");
    }

    public final void IconCompatParcelizer(getHeightannotations getheightannotations) throws IOException {
        write(getheightannotations);
        read(getheightannotations, 0);
        write(getheightannotations, 0);
        write(getheightannotations, 5);
        write(getheightannotations, 4);
        IconCompatParcelizer();
        if (this.onBackPressedDispatcher_delegatelambda00 == 8) {
            HashMap[] mapArr = this.fullyDrawnReporter_delegatelambda00;
            getWidthannotations getwidthannotations = (getWidthannotations) mapArr[1].get("MakerNote");
            if (getwidthannotations != null) {
                getHeightannotations getheightannotations2 = new getHeightannotations(getwidthannotations.IconCompatParcelizer);
                getheightannotations2.IconCompatParcelizer = this.menuHostHelperlambda0;
                getheightannotations2.IconCompatParcelizer(6);
                read(getheightannotations2, 9);
                getWidthannotations getwidthannotations2 = (getWidthannotations) mapArr[9].get("ColorSpace");
                if (getwidthannotations2 != null) {
                    mapArr[1].put("ColorSpace", getwidthannotations2);
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer(getHeightannotations getheightannotations) throws IOException {
        if (MediaBrowserCompatMediaItem) {
            Objects.toString(getheightannotations);
        }
        IconCompatParcelizer(getheightannotations);
        HashMap[] mapArr = this.fullyDrawnReporter_delegatelambda00;
        getWidthannotations getwidthannotations = (getWidthannotations) mapArr[0].get("JpgFromRaw");
        if (getwidthannotations != null) {
            IconCompatParcelizer(new getSizeNHjbRcannotations(getwidthannotations.IconCompatParcelizer), (int) getwidthannotations.write, 5);
        }
        getWidthannotations getwidthannotations2 = (getWidthannotations) mapArr[0].get("ISO");
        getWidthannotations getwidthannotations3 = (getWidthannotations) mapArr[1].get("PhotographicSensitivity");
        if (getwidthannotations2 == null || getwidthannotations3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", getwidthannotations2);
    }

    public final void RemoteActionCompatParcelizer(getSizeNHjbRcannotations getsizenhjbrcannotations) throws IOException {
        if (MediaBrowserCompatMediaItem) {
            Objects.toString(getsizenhjbrcannotations);
        }
        getsizenhjbrcannotations.IconCompatParcelizer(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        getsizenhjbrcannotations.readFully(bArr);
        getsizenhjbrcannotations.readFully(bArr2);
        getsizenhjbrcannotations.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        getsizenhjbrcannotations.IconCompatParcelizer(i - getsizenhjbrcannotations.write);
        getsizenhjbrcannotations.readFully(bArr4);
        IconCompatParcelizer(new getSizeNHjbRcannotations(bArr4), i, 5);
        getsizenhjbrcannotations.IconCompatParcelizer(i3 - getsizenhjbrcannotations.write);
        getsizenhjbrcannotations.IconCompatParcelizer = ByteOrder.BIG_ENDIAN;
        int i4 = getsizenhjbrcannotations.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = getsizenhjbrcannotations.readUnsignedShort();
            int unsignedShort2 = getsizenhjbrcannotations.readUnsignedShort();
            if (unsignedShort == r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.write) {
                short s = getsizenhjbrcannotations.readShort();
                short s2 = getsizenhjbrcannotations.readShort();
                getWidthannotations getwidthannotationsRemoteActionCompatParcelizer = getWidthannotations.RemoteActionCompatParcelizer((int) s, this.menuHostHelperlambda0);
                getWidthannotations getwidthannotationsRemoteActionCompatParcelizer2 = getWidthannotations.RemoteActionCompatParcelizer((int) s2, this.menuHostHelperlambda0);
                HashMap[] mapArr = this.fullyDrawnReporter_delegatelambda00;
                mapArr[0].put("ImageLength", getwidthannotationsRemoteActionCompatParcelizer);
                mapArr[0].put("ImageWidth", getwidthannotationsRemoteActionCompatParcelizer2);
                return;
            }
            getsizenhjbrcannotations.IconCompatParcelizer(unsignedShort2);
        }
    }

    public final int read(AudioSourceAccessException audioSourceAccessException) throws IOException {
        HashMap[] mapArr;
        int[] iArr;
        int i;
        Rect[][] rectArr = MediaDescriptionCompat;
        int[] iArr2 = new int[rectArr.length];
        int[] iArr3 = new int[rectArr.length];
        Rect[] rectArr2 = RatingCompat;
        for (Rect rect : rectArr2) {
            read(rect.IconCompatParcelizer);
        }
        if (this.onBackPressedInput_delegatelambda0) {
            if (this.addContentView) {
                read("StripOffsets");
                read("StripByteCounts");
            } else {
                read("JPEGInterchangeFormat");
                read("JPEGInterchangeFormatLength");
            }
        }
        int i2 = 0;
        while (true) {
            int length = rectArr.length;
            mapArr = this.fullyDrawnReporter_delegatelambda00;
            if (i2 >= length) {
                break;
            }
            Iterator it = mapArr[i2].entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    it.remove();
                }
            }
            i2++;
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(rectArr2[1].IconCompatParcelizer, getWidthannotations.RemoteActionCompatParcelizer(0L, this.menuHostHelperlambda0));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(rectArr2[2].IconCompatParcelizer, getWidthannotations.RemoteActionCompatParcelizer(0L, this.menuHostHelperlambda0));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(rectArr2[3].IconCompatParcelizer, getWidthannotations.RemoteActionCompatParcelizer(0L, this.menuHostHelperlambda0));
        }
        int i3 = 4;
        if (this.onBackPressedInput_delegatelambda0) {
            if (this.addContentView) {
                mapArr[4].put("StripOffsets", getWidthannotations.RemoteActionCompatParcelizer(0, this.menuHostHelperlambda0));
                mapArr[4].put("StripByteCounts", getWidthannotations.RemoteActionCompatParcelizer(this.addOnPictureInPictureUiStateChangedListener, this.menuHostHelperlambda0));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", getWidthannotations.RemoteActionCompatParcelizer(0L, this.menuHostHelperlambda0));
                mapArr[4].put("JPEGInterchangeFormatLength", getWidthannotations.RemoteActionCompatParcelizer(this.addOnPictureInPictureUiStateChangedListener, this.menuHostHelperlambda0));
            }
        }
        int i4 = 0;
        while (true) {
            int length2 = rectArr.length;
            iArr = r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (i4 >= length2) {
                break;
            }
            Iterator it2 = mapArr[i4].entrySet().iterator();
            int i5 = 0;
            while (it2.hasNext()) {
                getWidthannotations getwidthannotations = (getWidthannotations) ((Map.Entry) it2.next()).getValue();
                getwidthannotations.getClass();
                int i6 = iArr[getwidthannotations.serializer] * getwidthannotations.RemoteActionCompatParcelizer;
                if (i6 > 4) {
                    i5 += i6;
                }
            }
            iArr3[i4] = iArr3[i4] + i5;
            i4++;
        }
        int size = 8;
        for (int i7 = 0; i7 < rectArr.length; i7++) {
            if (!mapArr[i7].isEmpty()) {
                iArr2[i7] = size;
                size = (mapArr[i7].size() * 12) + 6 + iArr3[i7] + size;
            }
        }
        if (this.onBackPressedInput_delegatelambda0) {
            if (this.addContentView) {
                mapArr[4].put("StripOffsets", getWidthannotations.RemoteActionCompatParcelizer(size, this.menuHostHelperlambda0));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", getWidthannotations.RemoteActionCompatParcelizer(size, this.menuHostHelperlambda0));
            }
            this.enterPictureInPictureMode = size;
            size += this.addOnPictureInPictureUiStateChangedListener;
        }
        if (this.onBackPressedDispatcher_delegatelambda00 == 4) {
            size += 8;
        }
        if (MediaBrowserCompatMediaItem) {
            for (int i8 = 0; i8 < rectArr.length; i8++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i8), Integer.valueOf(iArr2[i8]), Integer.valueOf(mapArr[i8].size()), Integer.valueOf(iArr3[i8]), Integer.valueOf(size));
            }
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(rectArr2[1].IconCompatParcelizer, getWidthannotations.RemoteActionCompatParcelizer(iArr2[1], this.menuHostHelperlambda0));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(rectArr2[2].IconCompatParcelizer, getWidthannotations.RemoteActionCompatParcelizer(iArr2[2], this.menuHostHelperlambda0));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(rectArr2[3].IconCompatParcelizer, getWidthannotations.RemoteActionCompatParcelizer(iArr2[3], this.menuHostHelperlambda0));
        }
        int i9 = this.onBackPressedDispatcher_delegatelambda00;
        if (i9 != 4) {
            if (i9 == 13) {
                audioSourceAccessException.IconCompatParcelizer(size);
                audioSourceAccessException.IconCompatParcelizer(1700284774);
            } else if (i9 == 14) {
                audioSourceAccessException.write(r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
                audioSourceAccessException.IconCompatParcelizer(size);
            }
        } else if (size <= 65535) {
            audioSourceAccessException.read(size);
            audioSourceAccessException.write(r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            return 0;
        }
        int size2 = ((DataOutputStream) audioSourceAccessException.IconCompatParcelizer).size();
        audioSourceAccessException.serializer(this.menuHostHelperlambda0 == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        audioSourceAccessException.RemoteActionCompatParcelizer = this.menuHostHelperlambda0;
        audioSourceAccessException.read(42);
        audioSourceAccessException.write(8L);
        int i10 = 0;
        while (i10 < rectArr.length) {
            if (mapArr[i10].isEmpty()) {
                i = i3;
            } else {
                audioSourceAccessException.read(mapArr[i10].size());
                int size3 = (mapArr[i10].size() * 12) + iArr2[i10] + 2 + i3;
                for (Map.Entry entry : mapArr[i10].entrySet()) {
                    int i11 = ((Rect) defaultViewModelProviderFactory_delegatelambda0[i10].get(entry.getKey())).write;
                    getWidthannotations getwidthannotations2 = (getWidthannotations) entry.getValue();
                    getwidthannotations2.getClass();
                    int i12 = getwidthannotations2.RemoteActionCompatParcelizer;
                    int i13 = getwidthannotations2.serializer;
                    int i14 = iArr[i13] * i12;
                    audioSourceAccessException.read(i11);
                    audioSourceAccessException.read(i13);
                    audioSourceAccessException.IconCompatParcelizer(i12);
                    if (i14 > 4) {
                        audioSourceAccessException.write(size3);
                        size3 += i14;
                    } else {
                        audioSourceAccessException.write(getwidthannotations2.IconCompatParcelizer);
                        if (i14 < 4) {
                            while (i14 < 4) {
                                audioSourceAccessException.serializer(0);
                                i14++;
                            }
                        }
                    }
                    i3 = 4;
                }
                int i15 = i3;
                if (i10 == 0 && !mapArr[i15].isEmpty()) {
                    audioSourceAccessException.write(iArr2[i15]);
                } else {
                    audioSourceAccessException.write(0L);
                }
                Iterator it3 = mapArr[i10].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = ((getWidthannotations) ((Map.Entry) it3.next()).getValue()).IconCompatParcelizer;
                    if (bArr.length > 4) {
                        audioSourceAccessException.write(bArr, 0, bArr.length);
                    }
                }
                i = 4;
            }
            i10++;
            i3 = i;
        }
        if (this.onBackPressedInput_delegatelambda0) {
            audioSourceAccessException.write(read());
        }
        if (this.onBackPressedDispatcher_delegatelambda00 == 14 && size % 2 == 1) {
            audioSourceAccessException.serializer(0);
        }
        audioSourceAccessException.RemoteActionCompatParcelizer = ByteOrder.BIG_ENDIAN;
        return size2;
    }

    public final void read(getSizeNHjbRcannotations getsizenhjbrcannotations) throws IOException {
        if (MediaBrowserCompatMediaItem) {
            Objects.toString(getsizenhjbrcannotations);
        }
        getsizenhjbrcannotations.IconCompatParcelizer = ByteOrder.LITTLE_ENDIAN;
        getsizenhjbrcannotations.IconCompatParcelizer(_init_lambda2.length);
        int i = getsizenhjbrcannotations.readInt() + 8;
        byte[] bArr = _init_lambda3;
        getsizenhjbrcannotations.IconCompatParcelizer(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                getsizenhjbrcannotations.readFully(bArr2);
                int i2 = getsizenhjbrcannotations.readInt();
                int i3 = length + 8;
                if (Arrays.equals(r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    getsizenhjbrcannotations.readFully(bArrCopyOfRange);
                    byte[] bArr3 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    if (r8lambdagkrDDkERifauZUmtkJOYYCCYn0.RemoteActionCompatParcelizer(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.onBackPressedDispatcher_delegatelambda010 = i3;
                    write(0, bArrCopyOfRange);
                    write(new getSizeNHjbRcannotations(bArrCopyOfRange));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                getsizenhjbrcannotations.IconCompatParcelizer(i2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final byte[] read() throws Throwable {
        FileDescriptor fileDescriptor;
        InputStream inputStreamSerializer;
        Throwable th;
        byte[] bArr;
        InputStream inputStream = null;
        if (this.onBackPressedInput_delegatelambda0) {
            byte[] bArr2 = this.addMenuProvider;
            if (bArr2 != null) {
                return bArr2;
            }
            try {
                inputStreamSerializer = this.addObserverForBackInvoker;
                if (inputStreamSerializer != null) {
                    try {
                        if (!inputStreamSerializer.markSupported()) {
                            r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(inputStreamSerializer);
                            return null;
                        }
                        inputStreamSerializer.reset();
                        fileDescriptor = null;
                        try {
                            getSizeNHjbRcannotations getsizenhjbrcannotations = new getSizeNHjbRcannotations(inputStreamSerializer);
                            getsizenhjbrcannotations.IconCompatParcelizer(this.enterPictureInPictureMode + this.onBackPressedDispatcher_delegatelambda010);
                            bArr = new byte[this.addOnPictureInPictureUiStateChangedListener];
                            getsizenhjbrcannotations.readFully(bArr);
                            this.addMenuProvider = bArr;
                            r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(inputStreamSerializer);
                            if (fileDescriptor != null) {
                                try {
                                    Os.close(fileDescriptor);
                                    return bArr;
                                } catch (ErrnoException e) {
                                    SentryLogcatAdapter.read("ExifInterfaceUtils", "Error closing fd.", e);
                                }
                            }
                            return bArr;
                        } catch (Exception unused) {
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = inputStreamSerializer;
                            th = th;
                            r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(inputStream);
                            if (fileDescriptor != null) {
                                try {
                                    Os.close(fileDescriptor);
                                } catch (ErrnoException e2) {
                                    SentryLogcatAdapter.read("ExifInterfaceUtils", "Error closing fd.", e2);
                                }
                            }
                            throw th;
                        }
                    } catch (Exception unused2) {
                        fileDescriptor = null;
                    } catch (Throwable th3) {
                        inputStream = inputStreamSerializer;
                        th = th3;
                        fileDescriptor = null;
                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(inputStream);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                        }
                        throw th;
                    }
                    r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(inputStreamSerializer);
                    if (fileDescriptor != null) {
                        try {
                            Os.close(fileDescriptor);
                        } catch (ErrnoException e3) {
                            SentryLogcatAdapter.read("ExifInterfaceUtils", "Error closing fd.", e3);
                        }
                    }
                } else {
                    String str = this.getOnBackPressedInput;
                    if (str != null) {
                        inputStreamSerializer = getActiveFocusTargetNode.RemoteActionCompatParcelizer(new FileInputStream(str), str);
                        fileDescriptor = null;
                        getSizeNHjbRcannotations getsizenhjbrcannotations2 = new getSizeNHjbRcannotations(inputStreamSerializer);
                        getsizenhjbrcannotations2.IconCompatParcelizer(this.enterPictureInPictureMode + this.onBackPressedDispatcher_delegatelambda010);
                        bArr = new byte[this.addOnPictureInPictureUiStateChangedListener];
                        getsizenhjbrcannotations2.readFully(bArr);
                        this.addMenuProvider = bArr;
                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(inputStreamSerializer);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                            return bArr;
                        }
                        return bArr;
                    }
                    FileDescriptor fileDescriptorDup = Os.dup(this.addOnContextAvailableListener);
                    try {
                        Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                        fileDescriptor = fileDescriptorDup;
                        inputStreamSerializer = getActiveFocusTargetNode.serializer(new FileInputStream(fileDescriptorDup), fileDescriptorDup);
                        getSizeNHjbRcannotations getsizenhjbrcannotations3 = new getSizeNHjbRcannotations(inputStreamSerializer);
                        getsizenhjbrcannotations3.IconCompatParcelizer(this.enterPictureInPictureMode + this.onBackPressedDispatcher_delegatelambda010);
                        bArr = new byte[this.addOnPictureInPictureUiStateChangedListener];
                        getsizenhjbrcannotations3.readFully(bArr);
                        this.addMenuProvider = bArr;
                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(inputStreamSerializer);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                            return bArr;
                        }
                        return bArr;
                    } catch (Exception unused3) {
                        fileDescriptor = fileDescriptorDup;
                        inputStreamSerializer = null;
                    } catch (Throwable th4) {
                        th = th4;
                        fileDescriptor = fileDescriptorDup;
                        th = th;
                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(inputStream);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                        }
                        throw th;
                    }
                }
            } catch (Exception unused4) {
                inputStreamSerializer = null;
                fileDescriptor = null;
            } catch (Throwable th5) {
                th = th5;
                fileDescriptor = null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:42:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x003d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x006d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0027 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0091 -> B:10:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void serializer(java.io.BufferedInputStream r9, java.io.BufferedOutputStream r10) {
        /*
            r8 = this;
            boolean r0 = o.takeOrElse3MmeM6k.MediaBrowserCompatMediaItem
            if (r0 == 0) goto La
            java.util.Objects.toString(r9)
            java.util.Objects.toString(r10)
        La:
            o.getSizeNHjbRcannotations r0 = new o.getSizeNHjbRcannotations
            r0.<init>(r9)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.BIG_ENDIAN
            o.AudioSourceAccessException r1 = new o.AudioSourceAccessException
            r1.<init>(r10, r9)
            byte[] r9 = o.takeOrElse3MmeM6k.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg
            int r9 = r9.length
            o.r8lambdagkrDDkERifauZUmtkJOYYCCYn0.serializer(r0, r1, r9)
            o.getWidthannotations r9 = r8.addOnUserLeaveHintListener
            r10 = 0
            r2 = 1
            if (r9 != 0) goto L26
            boolean r9 = r8.getSavedStateRegistryControllerannotations
            if (r9 == 0) goto L91
        L26:
            r9 = r2
        L27:
            if (r2 != 0) goto L30
            if (r9 == 0) goto L2c
            goto L30
        L2c:
            o.r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(r0, r1)
            return
        L30:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L5c
            r1.IconCompatParcelizer(r3)
            r1.IconCompatParcelizer(r4)
            int r3 = r3 + 4
            o.r8lambdagkrDDkERifauZUmtkJOYYCCYn0.serializer(r0, r1, r3)
            int r3 = r8.onBackPressedDispatcher_delegatelambda010
            if (r3 != 0) goto L50
            r8.serializer(r1)
            r2 = r10
        L50:
            o.getWidthannotations r3 = r8.addOnUserLeaveHintListener
            if (r3 == 0) goto L27
            boolean r3 = r8.getSavedStateRegistryControllerannotations
            if (r3 != 0) goto L27
            r8.write(r1)
            goto L91
        L5c:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L6d
            if (r2 == 0) goto L6d
            r8.serializer(r1)
            int r3 = r3 + 4
            r0.IconCompatParcelizer(r3)
            r2 = r10
            goto L27
        L6d:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto La0
            byte[] r5 = o.takeOrElse3MmeM6k.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            int r6 = r5.length
            if (r3 < r6) goto La0
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto L93
            o.getWidthannotations r9 = r8.addOnUserLeaveHintListener
            if (r9 == 0) goto L8e
            r8.write(r1)
        L8e:
            r0.IconCompatParcelizer(r6)
        L91:
            r9 = r10
            goto L27
        L93:
            r1.IconCompatParcelizer(r3)
            r1.IconCompatParcelizer(r4)
            r1.write(r7)
            o.r8lambdagkrDDkERifauZUmtkJOYYCCYn0.serializer(r0, r1, r6)
            goto L27
        La0:
            r1.IconCompatParcelizer(r3)
            r1.IconCompatParcelizer(r4)
            int r3 = r3 + 4
            o.r8lambdagkrDDkERifauZUmtkJOYYCCYn0.serializer(r0, r1, r3)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: o.takeOrElse3MmeM6k.serializer(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    public final void serializer(getSizeNHjbRcannotations getsizenhjbrcannotations) throws IOException {
        if (MediaBrowserCompatMediaItem) {
            Objects.toString(getsizenhjbrcannotations);
        }
        getsizenhjbrcannotations.IconCompatParcelizer = ByteOrder.BIG_ENDIAN;
        int i = getsizenhjbrcannotations.write;
        getsizenhjbrcannotations.IconCompatParcelizer(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.length);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (z && z2) {
                break;
            }
            try {
                int i2 = getsizenhjbrcannotations.readInt();
                int i3 = getsizenhjbrcannotations.readInt();
                int i4 = getsizenhjbrcannotations.write;
                int i5 = i4 - i;
                if (i5 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    break;
                }
                if (i3 == 1700284774 && !z) {
                    this.onBackPressedDispatcher_delegatelambda010 = i5;
                    byte[] bArr = new byte[i2];
                    getsizenhjbrcannotations.readFully(bArr);
                    int i6 = getsizenhjbrcannotations.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) == i6) {
                        write(0, bArr);
                        IconCompatParcelizer();
                        write(new getSizeNHjbRcannotations(bArr));
                        z = true;
                    } else {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i6 + ", calculated CRC value: " + crc32.getValue());
                    }
                } else if (i3 == 1767135348 && !z2) {
                    byte[] bArr2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        getsizenhjbrcannotations.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i7 = getsizenhjbrcannotations.write;
                            int i8 = i2 - length;
                            byte[] bArr4 = new byte[i8];
                            getsizenhjbrcannotations.readFully(bArr4);
                            this.addOnUserLeaveHintListener = new getWidthannotations(i7 - i, bArr4, 1, i8);
                            z2 = true;
                        }
                    }
                }
                getsizenhjbrcannotations.IconCompatParcelizer(((i4 + i2) + 4) - getsizenhjbrcannotations.write);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
        this.getSavedStateRegistryControllerannotations = z2;
    }

    public final void write(InputStream inputStream) {
        boolean z = MediaBrowserCompatMediaItem;
        for (int i = 0; i < MediaDescriptionCompat.length; i++) {
            try {
                try {
                    this.fullyDrawnReporter_delegatelambda00[i] = new HashMap();
                } catch (Throwable th) {
                    RemoteActionCompatParcelizer();
                    if (z) {
                        write();
                    }
                    throw th;
                }
            } catch (IOException | UnsupportedOperationException e) {
                if (z) {
                    SentryLogcatAdapter.write("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                RemoteActionCompatParcelizer();
                if (z) {
                    write();
                    return;
                }
                return;
            }
        }
        boolean z2 = this.onBackPressedDispatcher_delegatelambda0;
        if (!z2) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.onBackPressedDispatcher_delegatelambda00 = RemoteActionCompatParcelizer(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i2 = this.onBackPressedDispatcher_delegatelambda00;
        if (i2 == 4 || i2 == 9 || i2 == 13 || i2 == 14) {
            getSizeNHjbRcannotations getsizenhjbrcannotations = new getSizeNHjbRcannotations(inputStream);
            int i3 = this.onBackPressedDispatcher_delegatelambda00;
            if (i3 == 4) {
                IconCompatParcelizer(getsizenhjbrcannotations, 0, 0);
            } else if (i3 == 13) {
                serializer(getsizenhjbrcannotations);
            } else if (i3 == 9) {
                RemoteActionCompatParcelizer(getsizenhjbrcannotations);
            } else if (i3 == 14) {
                read(getsizenhjbrcannotations);
            }
        } else {
            getHeightannotations getheightannotations = new getHeightannotations(inputStream);
            if (!z2) {
                int i4 = this.onBackPressedDispatcher_delegatelambda00;
                if (i4 == 12 || i4 == 15) {
                    serializer(getheightannotations, i4);
                } else if (i4 == 7) {
                    read(getheightannotations);
                } else if (i4 == 10) {
                    RemoteActionCompatParcelizer(getheightannotations);
                } else {
                    IconCompatParcelizer(getheightannotations);
                }
            } else if (!serializer(getheightannotations)) {
                RemoteActionCompatParcelizer();
                if (z) {
                    write();
                    return;
                }
                return;
            }
            getheightannotations.RemoteActionCompatParcelizer(this.onBackPressedDispatcher_delegatelambda010);
            write((getSizeNHjbRcannotations) getheightannotations);
        }
        RemoteActionCompatParcelizer();
        if (z) {
            write();
        }
    }

    public final void write(getHeightannotations getheightannotations) throws IOException {
        ByteOrder byteOrderIconCompatParcelizer = IconCompatParcelizer((getSizeNHjbRcannotations) getheightannotations);
        this.menuHostHelperlambda0 = byteOrderIconCompatParcelizer;
        getheightannotations.IconCompatParcelizer = byteOrderIconCompatParcelizer;
        int unsignedShort = getheightannotations.readUnsignedShort();
        int i = this.onBackPressedDispatcher_delegatelambda00;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = getheightannotations.readInt();
        if (i2 < 8) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            getheightannotations.IconCompatParcelizer(i3);
        }
    }

    public final void write(getSizeNHjbRcannotations getsizenhjbrcannotations) throws IOException {
        getWidthannotations getwidthannotations;
        HashMap map = this.fullyDrawnReporter_delegatelambda00[4];
        getWidthannotations getwidthannotations2 = (getWidthannotations) map.get("Compression");
        if (getwidthannotations2 != null) {
            int iIconCompatParcelizer = getwidthannotations2.IconCompatParcelizer(this.menuHostHelperlambda0);
            this.addOnTrimMemoryListener = iIconCompatParcelizer;
            if (iIconCompatParcelizer != 1) {
                if (iIconCompatParcelizer == 6) {
                    serializer(getsizenhjbrcannotations, map);
                    return;
                } else if (iIconCompatParcelizer != 7) {
                    return;
                }
            }
            getWidthannotations getwidthannotations3 = (getWidthannotations) map.get("BitsPerSample");
            if (getwidthannotations3 != null) {
                int[] iArr = (int[]) getwidthannotations3.write(this.menuHostHelperlambda0);
                int[] iArr2 = IconCompatParcelizer;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.onBackPressedDispatcher_delegatelambda00 != 3 || (getwidthannotations = (getWidthannotations) map.get("PhotometricInterpretation")) == null) {
                        return;
                    }
                    int iIconCompatParcelizer2 = getwidthannotations.IconCompatParcelizer(this.menuHostHelperlambda0);
                    if ((iIconCompatParcelizer2 != 1 || !Arrays.equals(iArr, read)) && (iIconCompatParcelizer2 != 6 || !Arrays.equals(iArr, iArr2))) {
                        return;
                    }
                }
                getWidthannotations getwidthannotations4 = (getWidthannotations) map.get("StripOffsets");
                getWidthannotations getwidthannotations5 = (getWidthannotations) map.get("StripByteCounts");
                if (getwidthannotations4 == null || getwidthannotations5 == null) {
                    return;
                }
                long[] jArrIconCompatParcelizer = r8lambdagkrDDkERifauZUmtkJOYYCCYn0.IconCompatParcelizer(getwidthannotations4.write(this.menuHostHelperlambda0));
                long[] jArrIconCompatParcelizer2 = r8lambdagkrDDkERifauZUmtkJOYYCCYn0.IconCompatParcelizer(getwidthannotations5.write(this.menuHostHelperlambda0));
                if (jArrIconCompatParcelizer == null || jArrIconCompatParcelizer.length == 0) {
                    SentryLogcatAdapter.IconCompatParcelizer("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrIconCompatParcelizer2 == null || jArrIconCompatParcelizer2.length == 0) {
                    SentryLogcatAdapter.IconCompatParcelizer("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrIconCompatParcelizer.length != jArrIconCompatParcelizer2.length) {
                    SentryLogcatAdapter.IconCompatParcelizer("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrIconCompatParcelizer2) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                this.ensureViewModelStore = true;
                this.addContentView = true;
                this.onBackPressedInput_delegatelambda0 = true;
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < jArrIconCompatParcelizer.length; i4++) {
                    int i5 = (int) jArrIconCompatParcelizer[i4];
                    int i6 = (int) jArrIconCompatParcelizer2[i4];
                    if (i4 < jArrIconCompatParcelizer.length - 1 && i5 + i6 != jArrIconCompatParcelizer[i4 + 1]) {
                        this.ensureViewModelStore = false;
                    }
                    int i7 = i5 - i2;
                    if (i7 < 0) {
                        return;
                    }
                    try {
                        getsizenhjbrcannotations.IconCompatParcelizer(i7);
                        byte[] bArr2 = new byte[i6];
                        getsizenhjbrcannotations.readFully(bArr2);
                        i2 = i2 + i7 + i6;
                        System.arraycopy(bArr2, 0, bArr, i3, i6);
                        i3 += i6;
                    } catch (EOFException unused) {
                        return;
                    }
                }
                this.addMenuProvider = bArr;
                if (this.ensureViewModelStore) {
                    this.enterPictureInPictureMode = (int) jArrIconCompatParcelizer[0];
                    this.addOnPictureInPictureUiStateChangedListener = i;
                    return;
                }
                return;
            }
            return;
        }
        this.addOnTrimMemoryListener = 6;
        serializer(getsizenhjbrcannotations, map);
    }

    public static double read(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d3 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d2 / 60.0d) + d;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d3;
            }
            return -d3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final getWidthannotations write(String str) {
        getWidthannotations getwidthannotations;
        int i;
        getWidthannotations getwidthannotations2;
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                str = "PhotographicSensitivity";
            }
            if ("Xmp".equals(str) && (i = this.onBackPressedDispatcher_delegatelambda00) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (getwidthannotations2 = this.addOnUserLeaveHintListener) != null)) {
                return getwidthannotations2;
            }
            for (int i2 = 0; i2 < MediaDescriptionCompat.length; i2++) {
                getWidthannotations getwidthannotations3 = (getWidthannotations) this.fullyDrawnReporter_delegatelambda00[i2].get(str);
                if (getwidthannotations3 != null) {
                    return getwidthannotations3;
                }
            }
            if (!"Xmp".equals(str) || (getwidthannotations = this.addOnUserLeaveHintListener) == null) {
                return null;
            }
            return getwidthannotations;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("tag shouldn't be null");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0105 A[LOOP:0: B:10:0x0023->B:56:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x010b A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void IconCompatParcelizer(o.getSizeNHjbRcannotations r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.takeOrElse3MmeM6k.IconCompatParcelizer(o.getSizeNHjbRcannotations, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0142  */
    /* JADX WARN: Code duplicated, block: B:119:0x014e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0155 A[LOOP:3: B:117:0x0149->B:122:0x0155, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x015e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0168 A[LOOP:4: B:124:0x0159->B:129:0x0168, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x016e A[LOOP:2: B:112:0x013d->B:132:0x016e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0167 A[EDGE_INSN: B:165:0x0167->B:128:0x0167 BREAK  A[LOOP:3: B:117:0x0149->B:122:0x0155], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0167 A[EDGE_INSN: B:167:0x0167->B:128:0x0167 BREAK  A[LOOP:3: B:117:0x0149->B:122:0x0155], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129 A[RETURN] */
    public final int RemoteActionCompatParcelizer(BufferedInputStream bufferedInputStream) throws Throwable {
        getSizeNHjbRcannotations getsizenhjbrcannotations;
        getSizeNHjbRcannotations getsizenhjbrcannotations2;
        int i;
        getSizeNHjbRcannotations getsizenhjbrcannotations3;
        getSizeNHjbRcannotations getsizenhjbrcannotations4;
        int i2;
        byte[] bArr;
        int i3;
        byte[] bArr2;
        int i4;
        byte[] bArr3;
        boolean z;
        short s;
        boolean z2;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            byte[] bArr5 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (i5 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i5] != bArr5[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr4[i6] != bytes[i6]) {
                        try {
                            getsizenhjbrcannotations2 = new getSizeNHjbRcannotations(bArr4);
                            try {
                                long j2 = getsizenhjbrcannotations2.readInt();
                                byte[] bArr6 = new byte[4];
                                getsizenhjbrcannotations2.readFully(bArr6);
                                if (Arrays.equals(bArr6, MediaSessionCompatToken)) {
                                    if (j2 == 1) {
                                        j2 = getsizenhjbrcannotations2.readLong();
                                        j = 16;
                                        if (j2 >= 16) {
                                        }
                                    } else {
                                        j = 8;
                                    }
                                    if (j2 > DeviceOrientationRequest.OUTPUT_PERIOD_FAST) {
                                        j2 = 5000;
                                    }
                                    long j3 = j2 - j;
                                    if (j3 >= 8) {
                                        byte[] bArr7 = new byte[4];
                                        long j4 = 0;
                                        boolean z3 = false;
                                        boolean z4 = false;
                                        boolean z5 = false;
                                        while (true) {
                                            if (j4 < j3 / 4) {
                                                try {
                                                    getsizenhjbrcannotations2.readFully(bArr7);
                                                    if (j4 != 1) {
                                                        if (Arrays.equals(bArr7, PlaybackStateCompat)) {
                                                            z5 = true;
                                                        } else if (Arrays.equals(bArr7, PlaybackStateCompatCustomAction)) {
                                                            z4 = true;
                                                        } else if (Arrays.equals(bArr7, ParcelableVolumeInfo) || Arrays.equals(bArr7, MediaSessionCompatResultReceiverWrapper)) {
                                                            z3 = true;
                                                        }
                                                        if (!z5) {
                                                            continue;
                                                        } else if (z4) {
                                                            getsizenhjbrcannotations2.close();
                                                            i = 12;
                                                        } else if (z3) {
                                                            getsizenhjbrcannotations2.close();
                                                            i = 15;
                                                        }
                                                    }
                                                    j4++;
                                                } catch (EOFException unused) {
                                                    getsizenhjbrcannotations2.close();
                                                    i = 0;
                                                }
                                            }
                                            getsizenhjbrcannotations2.close();
                                            i = 0;
                                        }
                                    }
                                    if (i != 0) {
                                        return i;
                                    }
                                    try {
                                        try {
                                            try {
                                                getsizenhjbrcannotations3 = new getSizeNHjbRcannotations(bArr4);
                                                try {
                                                    ByteOrder byteOrderIconCompatParcelizer = IconCompatParcelizer(getsizenhjbrcannotations3);
                                                    this.menuHostHelperlambda0 = byteOrderIconCompatParcelizer;
                                                    getsizenhjbrcannotations3.IconCompatParcelizer = byteOrderIconCompatParcelizer;
                                                    s = getsizenhjbrcannotations3.readShort();
                                                    if (s != 20306 || s == 21330) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    getsizenhjbrcannotations3.close();
                                                    if (z2) {
                                                        return 7;
                                                    }
                                                    while (true) {
                                                        bArr = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                                        if (i2 < bArr.length) {
                                                            return 13;
                                                        }
                                                        if (bArr4[i2] != bArr[i2]) {
                                                            i3 = 0;
                                                            while (true) {
                                                                bArr2 = _init_lambda2;
                                                                if (i3 < bArr2.length) {
                                                                    i4 = 0;
                                                                    while (true) {
                                                                        bArr3 = _init_lambda3;
                                                                        if (i4 < bArr3.length) {
                                                                            return 14;
                                                                        }
                                                                        if (bArr4[bArr2.length + i4 + 4] != bArr3[i4]) {
                                                                            break;
                                                                        }
                                                                        i4++;
                                                                    }
                                                                } else {
                                                                    if (bArr4[i3] != bArr2[i3]) {
                                                                        break;
                                                                    }
                                                                    i3++;
                                                                }
                                                            }
                                                            return 0;
                                                        }
                                                        i2++;
                                                    }
                                                } catch (Exception unused2) {
                                                    if (getsizenhjbrcannotations3 != null) {
                                                        getsizenhjbrcannotations3.close();
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    if (getsizenhjbrcannotations3 != null) {
                                                        getsizenhjbrcannotations3.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception unused3) {
                                                getsizenhjbrcannotations3 = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                getsizenhjbrcannotations3 = null;
                                            }
                                            ByteOrder byteOrderIconCompatParcelizer2 = IconCompatParcelizer(getsizenhjbrcannotations4);
                                            this.menuHostHelperlambda0 = byteOrderIconCompatParcelizer2;
                                            getsizenhjbrcannotations4.IconCompatParcelizer = byteOrderIconCompatParcelizer2;
                                            z = getsizenhjbrcannotations4.readShort() == 85;
                                            getsizenhjbrcannotations4.close();
                                            if (z) {
                                                return 10;
                                            }
                                        } catch (Exception unused4) {
                                            if (getsizenhjbrcannotations4 != null) {
                                                getsizenhjbrcannotations4.close();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (getsizenhjbrcannotations4 != null) {
                                                getsizenhjbrcannotations4.close();
                                            }
                                            throw th;
                                        }
                                        getsizenhjbrcannotations4 = new getSizeNHjbRcannotations(bArr4);
                                    } catch (Exception unused5) {
                                        getsizenhjbrcannotations4 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        getsizenhjbrcannotations4 = null;
                                    }
                                    i2 = 0;
                                }
                                getsizenhjbrcannotations2.close();
                            } catch (Exception unused6) {
                                if (getsizenhjbrcannotations2 != null) {
                                    getsizenhjbrcannotations2.close();
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                getsizenhjbrcannotations = getsizenhjbrcannotations2;
                                if (getsizenhjbrcannotations != null) {
                                    getsizenhjbrcannotations.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused7) {
                            getsizenhjbrcannotations2 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            getsizenhjbrcannotations = null;
                        }
                        i = 0;
                        if (i != 0) {
                            return i;
                        }
                        getsizenhjbrcannotations3 = new getSizeNHjbRcannotations(bArr4);
                        ByteOrder byteOrderIconCompatParcelizer3 = IconCompatParcelizer(getsizenhjbrcannotations3);
                        this.menuHostHelperlambda0 = byteOrderIconCompatParcelizer3;
                        getsizenhjbrcannotations3.IconCompatParcelizer = byteOrderIconCompatParcelizer3;
                        s = getsizenhjbrcannotations3.readShort();
                        if (s != 20306) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        getsizenhjbrcannotations3.close();
                        if (z2) {
                            return 7;
                        }
                        getsizenhjbrcannotations4 = new getSizeNHjbRcannotations(bArr4);
                        ByteOrder byteOrderIconCompatParcelizer4 = IconCompatParcelizer(getsizenhjbrcannotations4);
                        this.menuHostHelperlambda0 = byteOrderIconCompatParcelizer4;
                        getsizenhjbrcannotations4.IconCompatParcelizer = byteOrderIconCompatParcelizer4;
                        if (getsizenhjbrcannotations4.readShort() == 85) {
                        }
                        getsizenhjbrcannotations4.close();
                        if (z) {
                            return 10;
                        }
                        i2 = 0;
                        while (true) {
                            bArr = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            if (i2 < bArr.length) {
                                return 13;
                            }
                            if (bArr4[i2] != bArr[i2]) {
                                i3 = 0;
                                while (true) {
                                    bArr2 = _init_lambda2;
                                    if (i3 < bArr2.length) {
                                        i4 = 0;
                                        while (true) {
                                            bArr3 = _init_lambda3;
                                            if (i4 < bArr3.length) {
                                                return 14;
                                            }
                                            if (bArr4[bArr2.length + i4 + 4] != bArr3[i4]) {
                                                break;
                                                break;
                                            }
                                            i4++;
                                        }
                                    } else {
                                        if (bArr4[i3] != bArr2[i3]) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                                return 0;
                            }
                            i2++;
                        }
                    }
                }
                return 9;
            }
            i5++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:96:0x017d  */
    public final void read(getHeightannotations getheightannotations, int i) throws IOException {
        boolean z;
        HashMap[] mapArr;
        long j;
        boolean z2;
        HashSet hashSet;
        int unsignedShort;
        long j2;
        int i2;
        int i3;
        int i4 = getheightannotations.write;
        HashSet hashSet2 = this.fullyDrawnReporter_delegatelambda0;
        hashSet2.add(Integer.valueOf(i4));
        short s = getheightannotations.readShort();
        if (s <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            z = MediaBrowserCompatMediaItem;
            mapArr = this.fullyDrawnReporter_delegatelambda00;
            if (s2 >= s) {
                break;
            }
            int unsignedShort2 = getheightannotations.readUnsignedShort();
            int unsignedShort3 = getheightannotations.readUnsignedShort();
            int i5 = getheightannotations.readInt();
            short s3 = s2;
            long j3 = ((long) getheightannotations.write) + 4;
            Rect rect = (Rect) addObserverForBackInvokerlambda0[i].get(Integer.valueOf(unsignedShort2));
            if (z) {
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), rect != null ? rect.IconCompatParcelizer : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i5));
            }
            if (rect != null && unsignedShort3 > 0) {
                int[] iArr = r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                if (unsignedShort3 < iArr.length) {
                    int i6 = rect.RemoteActionCompatParcelizer;
                    if (i6 == 7 || unsignedShort3 == 7 || i6 == unsignedShort3) {
                        i3 = 7;
                    } else {
                        int i7 = rect.read;
                        if (i7 == unsignedShort3 || (((i6 == 4 || i7 == 4) && unsignedShort3 == 3) || (((i6 == 9 || i7 == 9) && unsignedShort3 == 8) || ((i6 == 12 || i7 == 12) && unsignedShort3 == 11)))) {
                            i3 = 7;
                        } else {
                            if (z) {
                                String str = ResultReceiver[unsignedShort3];
                            }
                            j = 0;
                        }
                    }
                    if (unsignedShort3 == i3) {
                        unsignedShort3 = i6;
                    }
                    j = ((long) i5) * ((long) iArr[unsignedShort3]);
                    z2 = j >= 0 && j <= 2147483647L;
                } else {
                    j = 0;
                }
            } else {
                j = 0;
            }
            if (!z2) {
                getheightannotations.RemoteActionCompatParcelizer(j3);
                hashSet = hashSet2;
            } else {
                if (j > 4) {
                    int i8 = getheightannotations.readInt();
                    if (this.onBackPressedDispatcher_delegatelambda00 == 7) {
                        if ("MakerNote".equals(rect.IconCompatParcelizer)) {
                            this.addOnConfigurationChangedListener = i8;
                        } else if (i == 6 && "ThumbnailImage".equals(rect.IconCompatParcelizer)) {
                            this.addOnMultiWindowModeChangedListener = i8;
                            this.addOnNewIntentListener = i5;
                            getWidthannotations getwidthannotationsRemoteActionCompatParcelizer = getWidthannotations.RemoteActionCompatParcelizer(6, this.menuHostHelperlambda0);
                            getWidthannotations getwidthannotationsRemoteActionCompatParcelizer2 = getWidthannotations.RemoteActionCompatParcelizer(this.addOnMultiWindowModeChangedListener, this.menuHostHelperlambda0);
                            getWidthannotations getwidthannotationsRemoteActionCompatParcelizer3 = getWidthannotations.RemoteActionCompatParcelizer(this.addOnNewIntentListener, this.menuHostHelperlambda0);
                            mapArr[4].put("Compression", getwidthannotationsRemoteActionCompatParcelizer);
                            mapArr[4].put("JPEGInterchangeFormat", getwidthannotationsRemoteActionCompatParcelizer2);
                            mapArr[4].put("JPEGInterchangeFormatLength", getwidthannotationsRemoteActionCompatParcelizer3);
                        }
                    }
                    getheightannotations.RemoteActionCompatParcelizer(i8);
                } else {
                    i5 = i5;
                }
                Integer num = (Integer) createFullyDrawnExecutor.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 == 3) {
                        unsignedShort = getheightannotations.readUnsignedShort();
                    } else {
                        if (unsignedShort3 == 4) {
                            j2 = ((long) getheightannotations.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = getheightannotations.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = getheightannotations.readInt();
                        } else {
                            j2 = -1;
                        }
                        if (z) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j2), rect.IconCompatParcelizer);
                        }
                        if (j2 > 0 || ((i2 = getheightannotations.read) != -1 && j2 >= i2)) {
                            hashSet = hashSet2;
                        } else {
                            hashSet = hashSet2;
                            if (!hashSet.contains(Integer.valueOf((int) j2))) {
                                getheightannotations.RemoteActionCompatParcelizer(j2);
                                read(getheightannotations, num.intValue());
                            }
                        }
                        getheightannotations.RemoteActionCompatParcelizer(j3);
                    }
                    j2 = unsignedShort;
                    if (z) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j2), rect.IconCompatParcelizer);
                    }
                    if (j2 > 0) {
                        hashSet = hashSet2;
                    } else {
                        hashSet = hashSet2;
                    }
                    getheightannotations.RemoteActionCompatParcelizer(j3);
                } else {
                    hashSet = hashSet2;
                    int i9 = getheightannotations.write;
                    int i10 = this.onBackPressedDispatcher_delegatelambda010;
                    byte[] bArr = new byte[(int) j];
                    getheightannotations.readFully(bArr);
                    getWidthannotations getwidthannotations = new getWidthannotations(i9 + i10, bArr, unsignedShort3, i5);
                    HashMap map = mapArr[i];
                    String str2 = rect.IconCompatParcelizer;
                    map.put(str2, getwidthannotations);
                    if ("DNGVersion".equals(str2)) {
                        this.onBackPressedDispatcher_delegatelambda00 = 3;
                    }
                    if ((("Make".equals(str2) || "Model".equals(str2)) && getwidthannotations.read(this.menuHostHelperlambda0).contains("PENTAX")) || ("Compression".equals(str2) && getwidthannotations.IconCompatParcelizer(this.menuHostHelperlambda0) == 65535)) {
                        this.onBackPressedDispatcher_delegatelambda00 = 8;
                    }
                    if (getheightannotations.write != j3) {
                        getheightannotations.RemoteActionCompatParcelizer(j3);
                    }
                }
            }
            s2 = (short) (s3 + 1);
            hashSet2 = hashSet;
            s = s;
        }
        HashSet hashSet3 = hashSet2;
        int i11 = getheightannotations.readInt();
        if (z) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i11));
        }
        long j4 = i11;
        if (j4 <= 0 || hashSet3.contains(Integer.valueOf(i11))) {
            return;
        }
        getheightannotations.RemoteActionCompatParcelizer(j4);
        if (mapArr[4].isEmpty()) {
            read(getheightannotations, 4);
        } else if (mapArr[5].isEmpty()) {
            read(getheightannotations, 5);
        }
    }

    public final int serializer(int i, String str) {
        getWidthannotations getwidthannotationsWrite = write(str);
        if (getwidthannotationsWrite == null) {
            return i;
        }
        try {
            return getwidthannotationsWrite.IconCompatParcelizer(this.menuHostHelperlambda0);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0265  */
    /* JADX WARN: Code duplicated, block: B:138:0x0270  */
    /* JADX WARN: Code duplicated, block: B:141:0x027b A[LOOP:2: B:139:0x0278->B:141:0x027b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x0299 A[LOOP:3: B:143:0x0297->B:144:0x0299, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:149:0x02bf A[LOOP:4: B:147:0x02bc->B:149:0x02bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x02fc A[LOOP:5: B:151:0x02fa->B:152:0x02fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x031f  */
    /* JADX WARN: Code duplicated, block: B:158:0x032c A[LOOP:6: B:156:0x0329->B:158:0x032c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:161:0x034c A[LOOP:7: B:160:0x034a->B:161:0x034c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x0366  */
    /* JADX WARN: Code duplicated, block: B:166:0x0373 A[LOOP:8: B:164:0x0370->B:166:0x0373, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:168:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:171:0x03b8 A[LOOP:9: B:169:0x03b5->B:171:0x03b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:176:0x03df A[LOOP:10: B:174:0x03dc->B:176:0x03df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:179:0x0404  */
    public final void write(String str, String str2) {
        String str3;
        Rect rect;
        int[] iArr;
        String str4;
        String[] strArrSplit;
        int[] iArr2;
        int i;
        String[] strArrSplit2;
        long[] jArr;
        int i2;
        int i3;
        String[] strArrSplit3;
        isEmptyannotations[] isemptyannotationsArr;
        int i4;
        String[] strArrSplit4;
        int length;
        int[] iArr3;
        int i5;
        ByteBuffer byteBufferWrap;
        int i6;
        String[] strArrSplit5;
        int length2;
        isEmptyannotations[] isemptyannotationsArr2;
        int i7;
        ByteBuffer byteBufferWrap2;
        int i8;
        String[] strArrSplit6;
        int length3;
        double[] dArr;
        int i9;
        ByteBuffer byteBufferWrap3;
        int i10;
        String str5;
        isEmptyannotations isemptyannotations;
        long j;
        long j2;
        String strReplaceAll = str2;
        String str6 = "ISOSpeedRatings".equals(str) ? "PhotographicSensitivity" : str;
        if (strReplaceAll == null) {
            str3 = "/";
        } else {
            String str7 = "ExifInterface";
            if (!r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.contains(str6) || strReplaceAll.contains("/")) {
                str3 = "/";
                if (str6.equals("GPSTimeStamp")) {
                    Matcher matcher = MediaSessionCompatQueueItem.matcher(strReplaceAll);
                    if (!matcher.find()) {
                        SentryLogcatAdapter.IconCompatParcelizer("ExifInterface", "Invalid value for " + str6 + " : " + strReplaceAll);
                        return;
                    }
                    strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
                } else if ("DateTime".equals(str6) || "DateTimeOriginal".equals(str6) || "DateTimeDigitized".equals(str6)) {
                    boolean zFind = RemoteActionCompatParcelizer.matcher(strReplaceAll).find();
                    boolean zFind2 = write.matcher(strReplaceAll).find();
                    if (str2.length() != 19 || (!zFind && !zFind2)) {
                        SentryLogcatAdapter.IconCompatParcelizer("ExifInterface", "Invalid value for " + str6 + " : " + strReplaceAll);
                        return;
                    }
                    if (zFind2) {
                        strReplaceAll = strReplaceAll.replaceAll("-", ":");
                    }
                }
            } else {
                try {
                    double d = Double.parseDouble(str2);
                    str3 = "/";
                    long j3 = 1;
                    try {
                        if (d >= 9.223372036854776E18d || d <= -9.223372036854776E18d) {
                            str5 = "ExifInterface";
                            isemptyannotations = new isEmptyannotations(d > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
                        } else {
                            double dAbs = Math.abs(d);
                            long j4 = 0;
                            long j5 = 1;
                            double d2 = dAbs;
                            long j6 = 0;
                            while (true) {
                                double d3 = d2 % 1.0d;
                                long j7 = (long) (d2 - d3);
                                str5 = str7;
                                j = (j7 * j3) + j6;
                                j2 = (j7 * j4) + j5;
                                d2 = 1.0d / d3;
                                j6 = j3;
                                if (Math.abs(dAbs - (j / j2)) <= 1.0E-8d * dAbs) {
                                    break;
                                }
                                j3 = j;
                                j5 = j4;
                                str7 = str5;
                                j4 = j2;
                            }
                            if (d < 0.0d) {
                                j = -j;
                            }
                            isemptyannotations = new isEmptyannotations(j, j2);
                        }
                        strReplaceAll = isemptyannotations.toString();
                    } catch (NumberFormatException unused) {
                        SentryLogcatAdapter.IconCompatParcelizer(str5, "Invalid value for " + str6 + " : " + strReplaceAll);
                        return;
                    }
                } catch (NumberFormatException unused2) {
                    str5 = "ExifInterface";
                }
            }
        }
        boolean zEquals = "Xmp".equals(str6);
        HashMap[] mapArr = this.fullyDrawnReporter_delegatelambda00;
        int i11 = 4;
        int i12 = 12;
        int i13 = 0;
        if (zEquals) {
            boolean z = mapArr[0].containsKey("Xmp") || mapArr[5].containsKey("Xmp");
            int i14 = this.onBackPressedDispatcher_delegatelambda00;
            char c = i14 != 4 ? (i14 == 9 || i14 == 15 || i14 == 12 || i14 == 13) ? (char) 2 : (char) 1 : (char) 3;
            if ((c == 2 && (this.addOnUserLeaveHintListener != null || !z)) || (c == 3 && !z)) {
                this.addOnUserLeaveHintListener = strReplaceAll != null ? getWidthannotations.serializer(strReplaceAll) : null;
                return;
            }
        }
        int i15 = 0;
        while (i15 < MediaDescriptionCompat.length) {
            if ((i15 != i11 || this.onBackPressedInput_delegatelambda0) && (rect = (Rect) defaultViewModelProviderFactory_delegatelambda0[i15].get(str6)) != null) {
                int i16 = rect.read;
                int i17 = rect.RemoteActionCompatParcelizer;
                if (strReplaceAll == null) {
                    mapArr[i15].remove(str6);
                } else {
                    Pair pairIconCompatParcelizer = IconCompatParcelizer(strReplaceAll);
                    int i18 = -1;
                    if (i17 != ((Integer) pairIconCompatParcelizer.first).intValue() && i17 != ((Integer) pairIconCompatParcelizer.second).intValue()) {
                        if (i16 == -1 || (i16 != ((Integer) pairIconCompatParcelizer.first).intValue() && i16 != ((Integer) pairIconCompatParcelizer.second).intValue())) {
                            if (i17 != 1 && i17 != 7) {
                                if (i17 != 2) {
                                    if (MediaBrowserCompatMediaItem) {
                                        String[] strArr = ResultReceiver;
                                        String str8 = strArr[i17];
                                        if (i16 != -1) {
                                            String str9 = strArr[i16];
                                        }
                                        String str10 = strArr[((Integer) pairIconCompatParcelizer.first).intValue()];
                                        if (((Integer) pairIconCompatParcelizer.second).intValue() != -1) {
                                            String str11 = strArr[((Integer) pairIconCompatParcelizer.second).intValue()];
                                        }
                                    }
                                }
                            }
                            i16 = i17;
                            iArr = r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                            switch (i16) {
                                case 1:
                                    mapArr = mapArr;
                                    str4 = str3;
                                    mapArr[i15].put(str6, getWidthannotations.serializer(strReplaceAll));
                                    break;
                                case 2:
                                case 7:
                                    mapArr = mapArr;
                                    str4 = str3;
                                    mapArr[i15].put(str6, getWidthannotations.write(strReplaceAll));
                                    break;
                                case 3:
                                    mapArr = mapArr;
                                    str4 = str3;
                                    strArrSplit = strReplaceAll.split(",", -1);
                                    iArr2 = new int[strArrSplit.length];
                                    for (i = 0; i < strArrSplit.length; i++) {
                                        iArr2[i] = Integer.parseInt(strArrSplit[i]);
                                    }
                                    mapArr[i15].put(str6, getWidthannotations.RemoteActionCompatParcelizer(iArr2, this.menuHostHelperlambda0));
                                    break;
                                case 4:
                                    mapArr = mapArr;
                                    str4 = str3;
                                    strArrSplit2 = strReplaceAll.split(",", -1);
                                    jArr = new long[strArrSplit2.length];
                                    for (i2 = 0; i2 < strArrSplit2.length; i2++) {
                                        jArr[i2] = Long.parseLong(strArrSplit2[i2]);
                                    }
                                    mapArr[i15].put(str6, getWidthannotations.read(jArr, this.menuHostHelperlambda0));
                                    break;
                                case 5:
                                    i3 = -1;
                                    str4 = str3;
                                    strArrSplit3 = strReplaceAll.split(",", -1);
                                    isemptyannotationsArr = new isEmptyannotations[strArrSplit3.length];
                                    i4 = 0;
                                    while (i4 < strArrSplit3.length) {
                                        String[] strArrSplit7 = strArrSplit3[i4].split(str4, i3);
                                        isemptyannotationsArr[i4] = new isEmptyannotations((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[1]));
                                        i4++;
                                        mapArr = mapArr;
                                        i3 = -1;
                                    }
                                    mapArr = mapArr;
                                    mapArr[i15].put(str6, getWidthannotations.write(isemptyannotationsArr, this.menuHostHelperlambda0));
                                    break;
                                case 9:
                                    str4 = str3;
                                    strArrSplit4 = strReplaceAll.split(",", -1);
                                    length = strArrSplit4.length;
                                    iArr3 = new int[length];
                                    for (i5 = 0; i5 < strArrSplit4.length; i5++) {
                                        iArr3[i5] = Integer.parseInt(strArrSplit4[i5]);
                                    }
                                    HashMap map = mapArr[i15];
                                    ByteOrder byteOrder = this.menuHostHelperlambda0;
                                    byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                    byteBufferWrap.order(byteOrder);
                                    for (i6 = 0; i6 < length; i6++) {
                                        byteBufferWrap.putInt(iArr3[i6]);
                                    }
                                    map.put(str6, new getWidthannotations(byteBufferWrap.array(), 9, length));
                                    mapArr = mapArr;
                                    break;
                                case 10:
                                    strArrSplit5 = strReplaceAll.split(",", -1);
                                    length2 = strArrSplit5.length;
                                    isemptyannotationsArr2 = new isEmptyannotations[length2];
                                    i7 = 0;
                                    while (i7 < strArrSplit5.length) {
                                        String str12 = str3;
                                        String[] strArrSplit8 = strArrSplit5[i7].split(str12, i18);
                                        isemptyannotationsArr2[i7] = new isEmptyannotations((long) Double.parseDouble(strArrSplit8[0]), (long) Double.parseDouble(strArrSplit8[1]));
                                        i7++;
                                        str3 = str12;
                                        i18 = -1;
                                    }
                                    str4 = str3;
                                    HashMap map2 = mapArr[i15];
                                    ByteOrder byteOrder2 = this.menuHostHelperlambda0;
                                    byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                    byteBufferWrap2.order(byteOrder2);
                                    for (i8 = 0; i8 < length2; i8++) {
                                        isEmptyannotations isemptyannotations2 = isemptyannotationsArr2[i8];
                                        byteBufferWrap2.putInt((int) isemptyannotations2.write);
                                        byteBufferWrap2.putInt((int) isemptyannotations2.serializer);
                                    }
                                    map2.put(str6, new getWidthannotations(byteBufferWrap2.array(), 10, length2));
                                    break;
                                case 12:
                                    strArrSplit6 = strReplaceAll.split(",", -1);
                                    length3 = strArrSplit6.length;
                                    dArr = new double[length3];
                                    for (i9 = i13; i9 < strArrSplit6.length; i9++) {
                                        dArr[i9] = Double.parseDouble(strArrSplit6[i9]);
                                    }
                                    HashMap map3 = mapArr[i15];
                                    ByteOrder byteOrder3 = this.menuHostHelperlambda0;
                                    byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[i12] * length3]);
                                    byteBufferWrap3.order(byteOrder3);
                                    for (i10 = i13; i10 < length3; i10++) {
                                        byteBufferWrap3.putDouble(dArr[i10]);
                                    }
                                    map3.put(str6, new getWidthannotations(byteBufferWrap3.array(), i12, length3));
                                    str4 = str3;
                                    break;
                            }
                        } else {
                            iArr = r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                            switch (i16) {
                                case 1:
                                    mapArr = mapArr;
                                    str4 = str3;
                                    mapArr[i15].put(str6, getWidthannotations.serializer(strReplaceAll));
                                    break;
                                case 2:
                                case 7:
                                    mapArr = mapArr;
                                    str4 = str3;
                                    mapArr[i15].put(str6, getWidthannotations.write(strReplaceAll));
                                    break;
                                case 3:
                                    mapArr = mapArr;
                                    str4 = str3;
                                    strArrSplit = strReplaceAll.split(",", -1);
                                    iArr2 = new int[strArrSplit.length];
                                    while (i < strArrSplit.length) {
                                        iArr2[i] = Integer.parseInt(strArrSplit[i]);
                                    }
                                    mapArr[i15].put(str6, getWidthannotations.RemoteActionCompatParcelizer(iArr2, this.menuHostHelperlambda0));
                                    break;
                                case 4:
                                    mapArr = mapArr;
                                    str4 = str3;
                                    strArrSplit2 = strReplaceAll.split(",", -1);
                                    jArr = new long[strArrSplit2.length];
                                    while (i2 < strArrSplit2.length) {
                                        jArr[i2] = Long.parseLong(strArrSplit2[i2]);
                                    }
                                    mapArr[i15].put(str6, getWidthannotations.read(jArr, this.menuHostHelperlambda0));
                                    break;
                                case 5:
                                    i3 = -1;
                                    str4 = str3;
                                    strArrSplit3 = strReplaceAll.split(",", -1);
                                    isemptyannotationsArr = new isEmptyannotations[strArrSplit3.length];
                                    i4 = 0;
                                    while (i4 < strArrSplit3.length) {
                                        String[] strArrSplit9 = strArrSplit3[i4].split(str4, i3);
                                        isemptyannotationsArr[i4] = new isEmptyannotations((long) Double.parseDouble(strArrSplit9[0]), (long) Double.parseDouble(strArrSplit9[1]));
                                        i4++;
                                        mapArr = mapArr;
                                        i3 = -1;
                                    }
                                    mapArr = mapArr;
                                    mapArr[i15].put(str6, getWidthannotations.write(isemptyannotationsArr, this.menuHostHelperlambda0));
                                    break;
                                case 9:
                                    str4 = str3;
                                    strArrSplit4 = strReplaceAll.split(",", -1);
                                    length = strArrSplit4.length;
                                    iArr3 = new int[length];
                                    while (i5 < strArrSplit4.length) {
                                        iArr3[i5] = Integer.parseInt(strArrSplit4[i5]);
                                    }
                                    HashMap map4 = mapArr[i15];
                                    ByteOrder byteOrder4 = this.menuHostHelperlambda0;
                                    byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                    byteBufferWrap.order(byteOrder4);
                                    while (i6 < length) {
                                        byteBufferWrap.putInt(iArr3[i6]);
                                    }
                                    map4.put(str6, new getWidthannotations(byteBufferWrap.array(), 9, length));
                                    mapArr = mapArr;
                                    break;
                                case 10:
                                    strArrSplit5 = strReplaceAll.split(",", -1);
                                    length2 = strArrSplit5.length;
                                    isemptyannotationsArr2 = new isEmptyannotations[length2];
                                    i7 = 0;
                                    while (i7 < strArrSplit5.length) {
                                        String str13 = str3;
                                        String[] strArrSplit10 = strArrSplit5[i7].split(str13, i18);
                                        isemptyannotationsArr2[i7] = new isEmptyannotations((long) Double.parseDouble(strArrSplit10[0]), (long) Double.parseDouble(strArrSplit10[1]));
                                        i7++;
                                        str3 = str13;
                                        i18 = -1;
                                    }
                                    str4 = str3;
                                    HashMap map5 = mapArr[i15];
                                    ByteOrder byteOrder5 = this.menuHostHelperlambda0;
                                    byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                    byteBufferWrap2.order(byteOrder5);
                                    while (i8 < length2) {
                                        isEmptyannotations isemptyannotations3 = isemptyannotationsArr2[i8];
                                        byteBufferWrap2.putInt((int) isemptyannotations3.write);
                                        byteBufferWrap2.putInt((int) isemptyannotations3.serializer);
                                    }
                                    map5.put(str6, new getWidthannotations(byteBufferWrap2.array(), 10, length2));
                                    break;
                                case 12:
                                    strArrSplit6 = strReplaceAll.split(",", -1);
                                    length3 = strArrSplit6.length;
                                    dArr = new double[length3];
                                    while (i9 < strArrSplit6.length) {
                                        dArr[i9] = Double.parseDouble(strArrSplit6[i9]);
                                    }
                                    HashMap map6 = mapArr[i15];
                                    ByteOrder byteOrder6 = this.menuHostHelperlambda0;
                                    byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[i12] * length3]);
                                    byteBufferWrap3.order(byteOrder6);
                                    while (i10 < length3) {
                                        byteBufferWrap3.putDouble(dArr[i10]);
                                    }
                                    map6.put(str6, new getWidthannotations(byteBufferWrap3.array(), i12, length3));
                                    str4 = str3;
                                    break;
                            }
                        }
                    } else {
                        i16 = i17;
                        iArr = r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        switch (i16) {
                            case 1:
                                mapArr = mapArr;
                                str4 = str3;
                                mapArr[i15].put(str6, getWidthannotations.serializer(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                mapArr = mapArr;
                                str4 = str3;
                                mapArr[i15].put(str6, getWidthannotations.write(strReplaceAll));
                                break;
                            case 3:
                                mapArr = mapArr;
                                str4 = str3;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i < strArrSplit.length) {
                                    iArr2[i] = Integer.parseInt(strArrSplit[i]);
                                }
                                mapArr[i15].put(str6, getWidthannotations.RemoteActionCompatParcelizer(iArr2, this.menuHostHelperlambda0));
                                break;
                            case 4:
                                mapArr = mapArr;
                                str4 = str3;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i2 < strArrSplit2.length) {
                                    jArr[i2] = Long.parseLong(strArrSplit2[i2]);
                                }
                                mapArr[i15].put(str6, getWidthannotations.read(jArr, this.menuHostHelperlambda0));
                                break;
                            case 5:
                                i3 = -1;
                                str4 = str3;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                isemptyannotationsArr = new isEmptyannotations[strArrSplit3.length];
                                i4 = 0;
                                while (i4 < strArrSplit3.length) {
                                    String[] strArrSplit11 = strArrSplit3[i4].split(str4, i3);
                                    isemptyannotationsArr[i4] = new isEmptyannotations((long) Double.parseDouble(strArrSplit11[0]), (long) Double.parseDouble(strArrSplit11[1]));
                                    i4++;
                                    mapArr = mapArr;
                                    i3 = -1;
                                }
                                mapArr = mapArr;
                                mapArr[i15].put(str6, getWidthannotations.write(isemptyannotationsArr, this.menuHostHelperlambda0));
                                break;
                            case 9:
                                str4 = str3;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i5 < strArrSplit4.length) {
                                    iArr3[i5] = Integer.parseInt(strArrSplit4[i5]);
                                }
                                HashMap map7 = mapArr[i15];
                                ByteOrder byteOrder7 = this.menuHostHelperlambda0;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder7);
                                while (i6 < length) {
                                    byteBufferWrap.putInt(iArr3[i6]);
                                }
                                map7.put(str6, new getWidthannotations(byteBufferWrap.array(), 9, length));
                                mapArr = mapArr;
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                isemptyannotationsArr2 = new isEmptyannotations[length2];
                                i7 = 0;
                                while (i7 < strArrSplit5.length) {
                                    String str14 = str3;
                                    String[] strArrSplit12 = strArrSplit5[i7].split(str14, i18);
                                    isemptyannotationsArr2[i7] = new isEmptyannotations((long) Double.parseDouble(strArrSplit12[0]), (long) Double.parseDouble(strArrSplit12[1]));
                                    i7++;
                                    str3 = str14;
                                    i18 = -1;
                                }
                                str4 = str3;
                                HashMap map8 = mapArr[i15];
                                ByteOrder byteOrder8 = this.menuHostHelperlambda0;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder8);
                                while (i8 < length2) {
                                    isEmptyannotations isemptyannotations4 = isemptyannotationsArr2[i8];
                                    byteBufferWrap2.putInt((int) isemptyannotations4.write);
                                    byteBufferWrap2.putInt((int) isemptyannotations4.serializer);
                                }
                                map8.put(str6, new getWidthannotations(byteBufferWrap2.array(), 10, length2));
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i9 < strArrSplit6.length) {
                                    dArr[i9] = Double.parseDouble(strArrSplit6[i9]);
                                }
                                HashMap map9 = mapArr[i15];
                                ByteOrder byteOrder9 = this.menuHostHelperlambda0;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[i12] * length3]);
                                byteBufferWrap3.order(byteOrder9);
                                while (i10 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i10]);
                                }
                                map9.put(str6, new getWidthannotations(byteBufferWrap3.array(), i12, length3));
                                str4 = str3;
                                break;
                        }
                    }
                }
                mapArr = mapArr;
                str4 = str3;
            } else {
                mapArr = mapArr;
                str4 = str3;
            }
            i15++;
            str3 = str4;
            mapArr = mapArr;
            i11 = 4;
            i12 = 12;
            i13 = 0;
        }
    }

    public final void serializer(getHeightannotations getheightannotations, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2;
        if (i == 15 && Build.VERSION.SDK_INT < 31) {
            IBraze$$ExternalSyntheticBUOutline0.m("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new isSpecifiedk4lQ0Mannotations(getheightannotations));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.fullyDrawnReporter_delegatelambda00;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", getWidthannotations.RemoteActionCompatParcelizer(Integer.parseInt(strExtractMetadata), this.menuHostHelperlambda0));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", getWidthannotations.RemoteActionCompatParcelizer(Integer.parseInt(strExtractMetadata3), this.menuHostHelperlambda0));
                }
                if (strExtractMetadata2 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata2);
                    if (i3 == 90) {
                        i2 = 6;
                    } else if (i3 != 180) {
                        i2 = i3 != 270 ? 1 : 8;
                    } else {
                        i2 = 3;
                    }
                    mapArr[0].put("Orientation", getWidthannotations.RemoteActionCompatParcelizer(i2, this.menuHostHelperlambda0));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata4);
                    int i5 = Integer.parseInt(strExtractMetadata5);
                    if (i5 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    getheightannotations.RemoteActionCompatParcelizer(i4);
                    byte[] bArr = new byte[6];
                    getheightannotations.readFully(bArr);
                    if (!Arrays.equals(bArr, r8lambda7IJBVrN0sHyidCAZufWEJFc7yY)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5 - 6];
                    getheightannotations.readFully(bArr2);
                    this.onBackPressedDispatcher_delegatelambda010 = i4 + 6;
                    write(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i6 = Integer.parseInt(strExtractMetadata8);
                    int i7 = Integer.parseInt(strExtractMetadata9);
                    long j = i6;
                    getheightannotations.RemoteActionCompatParcelizer(j);
                    byte[] bArr3 = new byte[i7];
                    getheightannotations.readFully(bArr3);
                    this.addOnUserLeaveHintListener = new getWidthannotations(j, bArr3, 1, i7);
                    this.getSavedStateRegistryControllerannotations = true;
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public static ByteOrder IconCompatParcelizer(getSizeNHjbRcannotations getsizenhjbrcannotations) throws IOException {
        short s = getsizenhjbrcannotations.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(Integer.toHexString(s), "Invalid byte order: ");
        return null;
    }

    public takeOrElse3MmeM6k(InputStream inputStream) throws IOException {
        Rect[][] rectArr = MediaDescriptionCompat;
        this.fullyDrawnReporter_delegatelambda00 = new HashMap[rectArr.length];
        this.fullyDrawnReporter_delegatelambda0 = new HashSet(rectArr.length);
        this.menuHostHelperlambda0 = ByteOrder.BIG_ENDIAN;
        this.getOnBackPressedInput = null;
        this.onBackPressedDispatcher_delegatelambda0 = false;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.addObserverForBackInvoker = (AssetManager.AssetInputStream) inputStream;
            this.addOnContextAvailableListener = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.addObserverForBackInvoker = null;
                this.addOnContextAvailableListener = fileInputStream.getFD();
            } catch (Exception unused) {
                this.addObserverForBackInvoker = null;
                this.addOnContextAvailableListener = null;
            }
        } else {
            this.addObserverForBackInvoker = null;
            this.addOnContextAvailableListener = null;
        }
        write(inputStream);
    }
}
