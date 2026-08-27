package o;

import android.system.Os;
import android.system.OsConstants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DeactivateEncoderSurfaceBeforeStopEncoderQuirk {
    public final takeOrElse3MmeM6k MediaDescriptionCompat;
    public static final getE serializer = new getE(1);
    public static final getE write = new getE(2);
    public static final getE IconCompatParcelizer = new getE(3);
    public static final List read = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    public static final List RemoteActionCompatParcelizer = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    public DeactivateEncoderSurfaceBeforeStopEncoderQuirk(takeOrElse3MmeM6k takeorelse3mmem6k) {
        this.MediaDescriptionCompat = takeorelse3mmem6k;
    }

    public final void IconCompatParcelizer(DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk) {
        takeOrElse3MmeM6k takeorelse3mmem6k = deactivateEncoderSurfaceBeforeStopEncoderQuirk.MediaDescriptionCompat;
        ArrayList<String> arrayList = new ArrayList(read);
        arrayList.removeAll(RemoteActionCompatParcelizer);
        for (String str : arrayList) {
            String strSerializer = this.MediaDescriptionCompat.serializer(str);
            String strSerializer2 = takeorelse3mmem6k.serializer(str);
            if (strSerializer != null && !strSerializer.equals(strSerializer2)) {
                takeorelse3mmem6k.write(str, strSerializer);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0136 A[Catch: all -> 0x0165, Exception -> 0x0167, TryCatch #14 {Exception -> 0x0167, blocks: (B:74:0x0129, B:76:0x0136, B:78:0x0154, B:77:0x0142), top: B:116:0x0129, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0142 A[Catch: all -> 0x0165, Exception -> 0x0167, TryCatch #14 {Exception -> 0x0167, blocks: (B:74:0x0129, B:76:0x0136, B:78:0x0154, B:77:0x0142), top: B:116:0x0129, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0192  */
    public final void RemoteActionCompatParcelizer() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStreamSerializer;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStreamRemoteActionCompatParcelizer;
        FileOutputStream fileOutputStreamRemoteActionCompatParcelizer2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        getE gete = IconCompatParcelizer;
        String str = ((SimpleDateFormat) gete.get()).format(new Date(jCurrentTimeMillis));
        takeOrElse3MmeM6k takeorelse3mmem6k = this.MediaDescriptionCompat;
        takeorelse3mmem6k.write("DateTime", str);
        try {
            takeorelse3mmem6k.write("SubSecTime", Long.toString(jCurrentTimeMillis - ((SimpleDateFormat) gete.get()).parse(str).getTime()));
        } catch (java.text.ParseException unused) {
        }
        int i = takeorelse3mmem6k.onBackPressedDispatcher_delegatelambda00;
        if (i != 4 && i != 13 && i != 14) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
            return;
        }
        if (takeorelse3mmem6k.addOnContextAvailableListener == null && takeorelse3mmem6k.getOnBackPressedInput == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("ExifInterface does not support saving attributes for the current input.");
            return;
        }
        if (takeorelse3mmem6k.onBackPressedInput_delegatelambda0 && takeorelse3mmem6k.addContentView && !takeorelse3mmem6k.ensureViewModelStore) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
            return;
        }
        int i2 = takeorelse3mmem6k.addOnTrimMemoryListener;
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream2 = null;
        FileInputStream fileInputStreamWrite = null;
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        fileInputStream = null;
        takeorelse3mmem6k.addMenuProvider = (i2 == 6 || i2 == 7) ? takeorelse3mmem6k.read() : null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (takeorelse3mmem6k.getOnBackPressedInput != null) {
                String str2 = takeorelse3mmem6k.getOnBackPressedInput;
                fileInputStreamSerializer = getActiveFocusTargetNode.RemoteActionCompatParcelizer(new FileInputStream(str2), str2);
            } else {
                Os.lseek(takeorelse3mmem6k.addOnContextAvailableListener, 0L, OsConstants.SEEK_SET);
                FileDescriptor fileDescriptor = takeorelse3mmem6k.addOnContextAvailableListener;
                fileInputStreamSerializer = getActiveFocusTargetNode.serializer(new FileInputStream(fileDescriptor), fileDescriptor);
            }
            try {
                FileOutputStream fileOutputStreamWrite = getPositionInRoot.write(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
                try {
                    r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileInputStreamSerializer, fileOutputStreamWrite);
                    r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileInputStreamSerializer);
                    r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileOutputStreamWrite);
                    try {
                        try {
                            try {
                                FileInputStream fileInputStreamWrite2 = getActiveFocusTargetNode.write(fileCreateTempFile, new FileInputStream(fileCreateTempFile));
                                try {
                                    if (takeorelse3mmem6k.getOnBackPressedInput != null) {
                                        String str3 = takeorelse3mmem6k.getOnBackPressedInput;
                                        fileOutputStreamRemoteActionCompatParcelizer2 = getPositionInRoot.serializer(new FileOutputStream(str3), str3);
                                    } else {
                                        Os.lseek(takeorelse3mmem6k.addOnContextAvailableListener, 0L, OsConstants.SEEK_SET);
                                        FileDescriptor fileDescriptor2 = takeorelse3mmem6k.addOnContextAvailableListener;
                                        fileOutputStreamRemoteActionCompatParcelizer2 = getPositionInRoot.RemoteActionCompatParcelizer(new FileOutputStream(fileDescriptor2), fileDescriptor2);
                                    }
                                    try {
                                        bufferedInputStream = new BufferedInputStream(fileInputStreamWrite2);
                                        try {
                                            bufferedOutputStream = new BufferedOutputStream(fileOutputStreamRemoteActionCompatParcelizer2);
                                            try {
                                                int i3 = takeorelse3mmem6k.onBackPressedDispatcher_delegatelambda00;
                                                if (i3 == 4) {
                                                    takeorelse3mmem6k.IconCompatParcelizer(bufferedInputStream, bufferedOutputStream);
                                                } else if (i3 == 13) {
                                                    takeorelse3mmem6k.serializer(bufferedInputStream, bufferedOutputStream);
                                                } else if (i3 == 14) {
                                                    takeorelse3mmem6k.write(bufferedInputStream, bufferedOutputStream);
                                                }
                                                r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(bufferedInputStream);
                                                r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                takeorelse3mmem6k.addMenuProvider = null;
                                            } catch (Exception e) {
                                                e = e;
                                                fileOutputStreamRemoteActionCompatParcelizer = fileOutputStreamRemoteActionCompatParcelizer2;
                                                fileInputStreamWrite = fileInputStreamWrite2;
                                                try {
                                                    try {
                                                        fileInputStreamWrite = getActiveFocusTargetNode.write(fileCreateTempFile, new FileInputStream(fileCreateTempFile));
                                                        if (takeorelse3mmem6k.getOnBackPressedInput != null) {
                                                            String str4 = takeorelse3mmem6k.getOnBackPressedInput;
                                                            fileOutputStreamRemoteActionCompatParcelizer = getPositionInRoot.serializer(new FileOutputStream(str4), str4);
                                                        } else {
                                                            Os.lseek(takeorelse3mmem6k.addOnContextAvailableListener, 0L, OsConstants.SEEK_SET);
                                                            FileDescriptor fileDescriptor3 = takeorelse3mmem6k.addOnContextAvailableListener;
                                                            fileOutputStreamRemoteActionCompatParcelizer = getPositionInRoot.RemoteActionCompatParcelizer(new FileOutputStream(fileDescriptor3), fileDescriptor3);
                                                        }
                                                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileInputStreamWrite, fileOutputStreamRemoteActionCompatParcelizer);
                                                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileInputStreamWrite);
                                                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileOutputStreamRemoteActionCompatParcelizer);
                                                        throw new IOException("Failed to save new file", e);
                                                    } catch (Throwable th) {
                                                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileInputStreamWrite);
                                                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileOutputStreamRemoteActionCompatParcelizer);
                                                        throw th;
                                                    }
                                                } catch (Exception e2) {
                                                    throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e2);
                                                }
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            bufferedOutputStream = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bufferedOutputStream = null;
                                            bufferedInputStream2 = bufferedInputStream;
                                            r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(bufferedInputStream2);
                                            r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(bufferedOutputStream);
                                            if (0 == 0) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        bufferedInputStream = null;
                                        bufferedOutputStream = null;
                                        fileOutputStreamRemoteActionCompatParcelizer = fileOutputStreamRemoteActionCompatParcelizer2;
                                        fileInputStreamWrite = fileInputStreamWrite2;
                                        fileInputStreamWrite = getActiveFocusTargetNode.write(fileCreateTempFile, new FileInputStream(fileCreateTempFile));
                                        if (takeorelse3mmem6k.getOnBackPressedInput != null) {
                                            String str5 = takeorelse3mmem6k.getOnBackPressedInput;
                                            fileOutputStreamRemoteActionCompatParcelizer = getPositionInRoot.serializer(new FileOutputStream(str5), str5);
                                        } else {
                                            Os.lseek(takeorelse3mmem6k.addOnContextAvailableListener, 0L, OsConstants.SEEK_SET);
                                            FileDescriptor fileDescriptor4 = takeorelse3mmem6k.addOnContextAvailableListener;
                                            fileOutputStreamRemoteActionCompatParcelizer = getPositionInRoot.RemoteActionCompatParcelizer(new FileOutputStream(fileDescriptor4), fileDescriptor4);
                                        }
                                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileInputStreamWrite, fileOutputStreamRemoteActionCompatParcelizer);
                                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileInputStreamWrite);
                                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileOutputStreamRemoteActionCompatParcelizer);
                                        throw new IOException("Failed to save new file", e);
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    fileOutputStreamRemoteActionCompatParcelizer2 = null;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream = null;
                                r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(bufferedInputStream2);
                                r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(bufferedOutputStream);
                                if (0 == 0) {
                                    fileCreateTempFile.delete();
                                }
                                throw th;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            fileOutputStreamRemoteActionCompatParcelizer = null;
                            bufferedInputStream = null;
                            bufferedOutputStream = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedInputStream2 = bufferedInputStream;
                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(bufferedInputStream2);
                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(bufferedOutputStream);
                        if (0 == 0) {
                            fileCreateTempFile.delete();
                        }
                        throw th;
                    }
                } catch (Exception e7) {
                    e = e7;
                    fileOutputStream2 = fileOutputStreamWrite;
                    fileOutputStream = fileOutputStream2;
                    fileInputStream = fileInputStreamSerializer;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th5) {
                        th = th5;
                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileInputStream);
                        r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    fileOutputStream3 = fileOutputStreamWrite;
                    fileOutputStream = fileOutputStream3;
                    fileInputStream = fileInputStreamSerializer;
                    r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileInputStream);
                    r8lambdagkrDDkERifauZUmtkJOYYCCYn0.read(fileOutputStream);
                    throw th;
                }
            } catch (Exception e8) {
                e = e8;
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e9) {
            e = e9;
            fileOutputStream = null;
        } catch (Throwable th8) {
            th = th8;
            fileOutputStream = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0190, code lost:
    
        if (r4.equals("M") != false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk.toString():java.lang.String");
    }

    public final void IconCompatParcelizer(int i) {
        takeOrElse3MmeM6k takeorelse3mmem6k = this.MediaDescriptionCompat;
        if (i % 90 != 0) {
            java.util.Locale locale = java.util.Locale.US;
            setInflatedId.read("Exif", "Can only rotate in right angles (eg. 0, 90, 180, 270). " + i + " is unsupported.");
            takeorelse3mmem6k.write("Orientation", String.valueOf(0));
            return;
        }
        int i2 = i % 360;
        int iSerializer = takeorelse3mmem6k.serializer(0, "Orientation");
        while (i2 < 0) {
            i2 += 90;
            switch (iSerializer) {
                case 2:
                    iSerializer = 5;
                    break;
                case 3:
                case 8:
                    iSerializer = 6;
                    break;
                case 4:
                    iSerializer = 7;
                    break;
                case 5:
                    iSerializer = 4;
                    break;
                case 6:
                    iSerializer = 1;
                    break;
                case 7:
                    iSerializer = 2;
                    break;
                default:
                    iSerializer = 8;
                    break;
            }
        }
        while (i2 > 0) {
            i2 -= 90;
            switch (iSerializer) {
                case 2:
                    iSerializer = 7;
                    break;
                case 3:
                    iSerializer = 8;
                    break;
                case 4:
                    iSerializer = 5;
                    break;
                case 5:
                    iSerializer = 2;
                    break;
                case 6:
                    iSerializer = 3;
                    break;
                case 7:
                    iSerializer = 4;
                    break;
                case 8:
                    iSerializer = 1;
                    break;
                default:
                    iSerializer = 6;
                    break;
            }
        }
        takeorelse3mmem6k.write("Orientation", String.valueOf(iSerializer));
    }

    public final int write() {
        switch (this.MediaDescriptionCompat.serializer(0, "Orientation")) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }
}
