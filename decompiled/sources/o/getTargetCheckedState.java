package o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class getTargetCheckedState {
    public static final safeSetClipToOutline RemoteActionCompatParcelizer;
    public static final safeSetClipToOutline serializer;
    public static final JpegCaptureDownsizingQuirk write;

    static {
        Class cls = Long.TYPE;
        cls.getClass();
        write = new JpegCaptureDownsizingQuirk("camera2.streamSpec.streamUseCase", cls, null);
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            VideoCapture videoCapture = VideoCapture.PREVIEW;
            VideoCapture videoCapture2 = VideoCapture.METERING_REPEATING;
            VideoCapture videoCapture3 = VideoCapture.IMAGE_ANALYSIS;
            safesetcliptooutline.put(4L, onContentCardClicked.MediaSessionCompatQueueItem(new VideoCapture[]{videoCapture, videoCapture2, videoCapture3}));
            safesetcliptooutline.put(1L, onContentCardClicked.MediaSessionCompatQueueItem(new VideoCapture[]{videoCapture, videoCapture2, videoCapture3}));
            safesetcliptooutline.put(2L, RangesKt.write(VideoCapture.IMAGE_CAPTURE));
            safesetcliptooutline.put(3L, RangesKt.write(VideoCapture.VIDEO_CAPTURE));
        }
        serializer = safesetcliptooutline.IconCompatParcelizer();
        safeSetClipToOutline safesetcliptooutline2 = new safeSetClipToOutline();
        if (i >= 33) {
            VideoCapture videoCapture4 = VideoCapture.PREVIEW;
            VideoCapture videoCapture5 = VideoCapture.IMAGE_CAPTURE;
            VideoCapture videoCapture6 = VideoCapture.VIDEO_CAPTURE;
            safesetcliptooutline2.put(4L, onContentCardClicked.MediaSessionCompatQueueItem(new VideoCapture[]{videoCapture4, videoCapture5, videoCapture6}));
            safesetcliptooutline2.put(3L, onContentCardClicked.MediaSessionCompatQueueItem(new VideoCapture[]{videoCapture4, videoCapture6}));
        }
        RemoteActionCompatParcelizer = safesetcliptooutline2.IconCompatParcelizer();
    }

    public static access701 read(InitializationException initializationException, Long l) {
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = write;
        if (initializationException.read(jpegCaptureDownsizingQuirk)) {
            Object[] objArr = {initializationException.write(jpegCaptureDownsizingQuirk), l};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return null;
            }
        }
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(initializationException);
        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(jpegCaptureDownsizingQuirk, l);
        return new access701(23, cameraProviderInitRetryPolicyRemoteActionCompatParcelizer);
    }

    public static boolean write(InitializationException initializationException, VideoCapture videoCapture) {
        Object obj = initializationException.read(ImageUtilCodecFailedException.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, Boolean.FALSE);
        obj.getClass();
        if (((Boolean) obj).booleanValue()) {
            return false;
        }
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = UseCase.RemoteActionCompatParcelizer;
        if (!initializationException.read(jpegCaptureDownsizingQuirk)) {
            return false;
        }
        Object objWrite = initializationException.write(jpegCaptureDownsizingQuirk);
        objWrite.getClass();
        return getSplitTrack.serializer(videoCapture, ((Number) objWrite).intValue()) == 5;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    public static final boolean write(getThumbTintList getthumbtintlist, ArrayList arrayList, HashMap map, HashMap map2) {
        boolean z;
        boolean z2;
        getthumbtintlist.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList<ImageUtilCodecFailedException> arrayList2 = new ArrayList(map.keySet());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((LegacyCameraOutputConfigNullPointerQuirk) it.next()).write.getClass();
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object obj = map.get((ImageUtilCodecFailedException) it2.next());
                obj.getClass();
                ((SmallDisplaySizeQuirk) obj).serializer.getClass();
            }
            long[] jArr = (long[]) getthumbtintlist.write(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j : jArr) {
                    hashSet.add(Long.valueOf(j));
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    LegacyCameraOutputConfigNullPointerQuirk legacyCameraOutputConfigNullPointerQuirk = (LegacyCameraOutputConfigNullPointerQuirk) it3.next();
                    InitializationException initializationException = legacyCameraOutputConfigNullPointerQuirk.write;
                    initializationException.getClass();
                    JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = access701.IconCompatParcelizer;
                    if (initializationException.read(jpegCaptureDownsizingQuirk)) {
                        InitializationException initializationException2 = legacyCameraOutputConfigNullPointerQuirk.write;
                        initializationException2.getClass();
                        Object objWrite = initializationException2.write(jpegCaptureDownsizingQuirk);
                        objWrite.getClass();
                        if (((Number) objWrite).longValue() == 0) {
                            z = false;
                            z2 = true;
                        } else {
                            z2 = false;
                            z = true;
                        }
                    } else {
                        z = false;
                        z2 = true;
                    }
                } else {
                    z = false;
                    z2 = false;
                }
                for (ImageUtilCodecFailedException imageUtilCodecFailedException : arrayList2) {
                    JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk2 = access701.IconCompatParcelizer;
                    if (imageUtilCodecFailedException.read(jpegCaptureDownsizingQuirk2)) {
                        Object objWrite2 = imageUtilCodecFailedException.write(jpegCaptureDownsizingQuirk2);
                        objWrite2.getClass();
                        long jLongValue = ((Number) objWrite2).longValue();
                        if (jLongValue != 0) {
                            if (z2) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Either all use cases must have non-default stream use case assigned or none should have it");
                                return false;
                            }
                            linkedHashSet.add(Long.valueOf(jLongValue));
                            z = true;
                        } else if (z) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Either all use cases must have non-default stream use case assigned or none should have it");
                            return false;
                        }
                    } else if (z) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Either all use cases must have non-default stream use case assigned or none should have it");
                        return false;
                    }
                    z2 = true;
                }
                if (!z2) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        if (!hashSet.contains(Long.valueOf(((Number) it4.next()).longValue()))) {
                        }
                    }
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        LegacyCameraOutputConfigNullPointerQuirk legacyCameraOutputConfigNullPointerQuirk2 = (LegacyCameraOutputConfigNullPointerQuirk) it5.next();
                        InitializationException initializationException3 = legacyCameraOutputConfigNullPointerQuirk2.write;
                        initializationException3.getClass();
                        access701 access701Var = read(initializationException3, (Long) initializationException3.write(access701.IconCompatParcelizer));
                        if (access701Var != null) {
                            map2.put(legacyCameraOutputConfigNullPointerQuirk2, legacyCameraOutputConfigNullPointerQuirk2.serializer(access701Var));
                        }
                    }
                    for (ImageUtilCodecFailedException imageUtilCodecFailedException2 : arrayList2) {
                        SmallDisplaySizeQuirk smallDisplaySizeQuirk = (SmallDisplaySizeQuirk) map.get(imageUtilCodecFailedException2);
                        smallDisplaySizeQuirk.getClass();
                        InitializationException initializationException4 = smallDisplaySizeQuirk.serializer;
                        initializationException4.getClass();
                        access701 access701Var2 = read(initializationException4, (Long) initializationException4.write(access701.IconCompatParcelizer));
                        if (access701Var2 != null) {
                            RepeatingStreamConstraintForVideoRecordingQuirk repeatingStreamConstraintForVideoRecordingQuirk = smallDisplaySizeQuirk.read();
                            repeatingStreamConstraintForVideoRecordingQuirk.IconCompatParcelizer = access701Var2;
                            map.put(imageUtilCodecFailedException2, repeatingStreamConstraintForVideoRecordingQuirk.read());
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean read(getThumbTintList getthumbtintlist, List list) {
        long[] jArr;
        getthumbtintlist.getClass();
        if (Build.VERSION.SDK_INT >= 33 && (jArr = (long[]) getthumbtintlist.write(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j : jArr) {
                hashSet.add(Long.valueOf(j));
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!hashSet.contains(Long.valueOf(((ImageCaptureRotationOptionQuirk) it.next()).MediaDescriptionCompat.getValue()))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean serializer(getThumbTintList getthumbtintlist) {
        long[] jArr;
        getthumbtintlist.getClass();
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) getthumbtintlist.write(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    public static boolean IconCompatParcelizer(VideoCapture videoCapture, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (videoCapture != VideoCapture.STREAM_SHARING) {
            safeSetClipToOutline safesetcliptooutline = serializer;
            if (!safesetcliptooutline.containsKey(Long.valueOf(j))) {
                return false;
            }
            Object obj = safesetcliptooutline.get(Long.valueOf(j));
            obj.getClass();
            return ((Set) obj).contains(videoCapture);
        }
        safeSetClipToOutline safesetcliptooutline2 = RemoteActionCompatParcelizer;
        if (!safesetcliptooutline2.containsKey(Long.valueOf(j))) {
            return false;
        }
        Object obj2 = safesetcliptooutline2.get(Long.valueOf(j));
        obj2.getClass();
        Set set = (Set) obj2;
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((VideoCapture) it.next())) {
                return false;
            }
        }
        return true;
    }
}
