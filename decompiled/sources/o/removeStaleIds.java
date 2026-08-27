package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapInfo;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class removeStaleIds {
    public static void serializer(CaptureRequest.Builder builder, int i, FlowLayoutBuildingBlocks$WrapInfo flowLayoutBuildingBlocks$WrapInfo) {
        Map mapUnmodifiableMap;
        if (i == 3 && flowLayoutBuildingBlocks$WrapInfo.serializer) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        } else {
            if (i == 4) {
                if (flowLayoutBuildingBlocks$WrapInfo.IconCompatParcelizer) {
                    HashMap map2 = new HashMap();
                    map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                    mapUnmodifiableMap = Collections.unmodifiableMap(map2);
                }
            } else {
                flowLayoutBuildingBlocks$WrapInfo.getClass();
            }
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static CaptureRequest IconCompatParcelizer(nativeGetYUVImageVUOff nativegetyuvimagevuoff, CameraDevice cameraDevice, FlowLayoutBuildingBlocks$WrapInfo flowLayoutBuildingBlocks$WrapInfo) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        int i = nativegetyuvimagevuoff.MediaSessionCompatQueueItem;
        setInflatedId.IconCompatParcelizer(3, "Camera2CaptureRequestBuilder");
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
        serializer(builderCreateCaptureRequest, i, flowLayoutBuildingBlocks$WrapInfo);
        Range rangeIconCompatParcelizer = nativegetyuvimagevuoff.IconCompatParcelizer();
        if (!rangeIconCompatParcelizer.equals(SmallDisplaySizeQuirk.RemoteActionCompatParcelizer)) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeIconCompatParcelizer);
        }
        rangeIconCompatParcelizer.toString();
        setInflatedId.IconCompatParcelizer(3, "Camera2CaptureRequestBuilder");
        serializer(builderCreateCaptureRequest, nativegetyuvimagevuoff.MediaDescriptionCompat);
        return builderCreateCaptureRequest.build();
    }

    public static CaptureRequest RemoteActionCompatParcelizer(nativeGetYUVImageVUOff nativegetyuvimagevuoff, CameraDevice cameraDevice, HashMap map, boolean z, FlowLayoutBuildingBlocks$WrapInfo flowLayoutBuildingBlocks$WrapInfo) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        Integer num = null;
        if (cameraDevice != null) {
            ArrayList arrayList = nativegetyuvimagevuoff.MediaBrowserCompatMediaItem;
            int i = nativegetyuvimagevuoff.MediaSessionCompatQueueItem;
            CameraRepository cameraRepository = nativegetyuvimagevuoff.MediaDescriptionCompat;
            TreeMap treeMap = cameraRepository.RemoteActionCompatParcelizer;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                Surface surface = (Surface) map.get((PreviewExternalSyntheticLambda0) it.next());
                if (surface != null) {
                    arrayList2.add(surface);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("DeferrableSurface not in configuredSurfaceMap");
                    return null;
                }
            }
            if (!arrayList2.isEmpty()) {
                CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0 = nativegetyuvimagevuoff.serializer;
                if (i == 5 && cameraXExternalSyntheticLambda0 != null && (cameraXExternalSyntheticLambda0.IconCompatParcelizer() instanceof TotalCaptureResult)) {
                    setInflatedId.IconCompatParcelizer(3, "Camera2CaptureRequestBuilder");
                    builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) cameraXExternalSyntheticLambda0.IconCompatParcelizer());
                } else {
                    setInflatedId.IconCompatParcelizer(3, "Camera2CaptureRequestBuilder");
                    if (i == 5) {
                        builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z ? 1 : 2);
                    } else {
                        builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
                    }
                }
                serializer(builderCreateCaptureRequest, i, flowLayoutBuildingBlocks$WrapInfo);
                Range rangeIconCompatParcelizer = nativegetyuvimagevuoff.IconCompatParcelizer();
                if (!rangeIconCompatParcelizer.equals(SmallDisplaySizeQuirk.RemoteActionCompatParcelizer)) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeIconCompatParcelizer);
                }
                rangeIconCompatParcelizer.toString();
                setInflatedId.IconCompatParcelizer(3, "Camera2CaptureRequestBuilder");
                if (nativegetyuvimagevuoff.read() != 1 && nativegetyuvimagevuoff.RemoteActionCompatParcelizer() != 1) {
                    if (nativegetyuvimagevuoff.read() == 2) {
                        num = 2;
                    } else if (nativegetyuvimagevuoff.RemoteActionCompatParcelizer() == 2) {
                        num = 1;
                    }
                } else {
                    num = 0;
                }
                if (num != null) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, num);
                }
                setInflatedId.IconCompatParcelizer(3, "Camera2CaptureRequestBuilder");
                JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = nativeGetYUVImageVUOff.RemoteActionCompatParcelizer;
                if (treeMap.containsKey(jpegCaptureDownsizingQuirk)) {
                    builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) cameraRepository.write(jpegCaptureDownsizingQuirk));
                }
                JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk2 = nativeGetYUVImageVUOff.read;
                if (treeMap.containsKey(jpegCaptureDownsizingQuirk2)) {
                    builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) cameraRepository.write(jpegCaptureDownsizingQuirk2)).byteValue()));
                }
                serializer(builderCreateCaptureRequest, cameraRepository);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    builderCreateCaptureRequest.addTarget((Surface) it2.next());
                }
                builderCreateCaptureRequest.setTag(nativegetyuvimagevuoff.RatingCompat);
                return builderCreateCaptureRequest.build();
            }
        }
        return null;
    }

    public static void serializer(CaptureRequest.Builder builder, CameraRepository cameraRepository) {
        CameraRepository cameraRepositorySerializer = CameraRepository.serializer(getOuterActionMenuPresenter.IconCompatParcelizer(cameraRepository).read);
        for (JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk : cameraRepositorySerializer.MediaBrowserCompatMediaItem()) {
            CaptureRequest.Key key = (CaptureRequest.Key) jpegCaptureDownsizingQuirk.IconCompatParcelizer;
            try {
                builder.set(key, cameraRepositorySerializer.write(jpegCaptureDownsizingQuirk));
            } catch (IllegalArgumentException unused) {
                setInflatedId.serializer("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }
}
