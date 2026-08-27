package o;

import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.core.ImageCapture$Metadata;
import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda5;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nativeGetSurfaceInfo extends isNavigationActive {
    public final ImageCapture$Metadata MediaSessionCompatToken = new ImageCapture$Metadata(5);
    public boolean PlaybackStateCompatCustomAction = true;
    public final StringBuilder ParcelableVolumeInfo = new StringBuilder();
    public boolean PlaybackStateCompat = false;
    public final ArrayList MediaBrowserCompatMediaItem = new ArrayList();

    public final void read(mapToBase maptobase) {
        nativeGetYUVImageVUOff nativegetyuvimagevuoff = maptobase.MediaDescriptionCompat;
        int i = nativegetyuvimagevuoff.MediaSessionCompatQueueItem;
        abandonFocus abandonfocus = this.serializer;
        if (i != -1) {
            this.PlaybackStateCompat = true;
            int i2 = abandonfocus.MediaMetadataCompat;
            List list = mapToBase.serializer;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            abandonfocus.MediaMetadataCompat = i;
        }
        Range rangeIconCompatParcelizer = nativegetyuvimagevuoff.IconCompatParcelizer();
        Range range = SmallDisplaySizeQuirk.RemoteActionCompatParcelizer;
        boolean zEquals = rangeIconCompatParcelizer.equals(range);
        StringBuilder sb = this.ParcelableVolumeInfo;
        if (!zEquals) {
            CameraProviderInitRetryPolicy cameraProviderInitRetryPolicy = (CameraProviderInitRetryPolicy) abandonfocus.RemoteActionCompatParcelizer;
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = nativeGetYUVImageVUOff.write;
            boolean zEquals2 = ((Range) cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk, range)).equals(range);
            CameraProviderInitRetryPolicy cameraProviderInitRetryPolicy2 = (CameraProviderInitRetryPolicy) abandonfocus.RemoteActionCompatParcelizer;
            if (zEquals2) {
                cameraProviderInitRetryPolicy2.IconCompatParcelizer(jpegCaptureDownsizingQuirk, rangeIconCompatParcelizer);
            } else if (!((Range) cameraProviderInitRetryPolicy2.read(jpegCaptureDownsizingQuirk, range)).equals(rangeIconCompatParcelizer)) {
                this.PlaybackStateCompatCustomAction = false;
                String str = "Different ExpectedFrameRateRange values; current = " + ((Range) ((CameraProviderInitRetryPolicy) abandonfocus.RemoteActionCompatParcelizer).read(jpegCaptureDownsizingQuirk, range)) + ", new = " + rangeIconCompatParcelizer;
                setInflatedId.serializer("ValidatingBuilder", str);
                sb.append(str);
            }
        }
        int i3 = nativegetyuvimagevuoff.read();
        if (i3 != 0) {
            abandonfocus.getClass();
            if (i3 != 0) {
                ((CameraProviderInitRetryPolicy) abandonfocus.RemoteActionCompatParcelizer).IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, Integer.valueOf(i3));
            }
        }
        int iRemoteActionCompatParcelizer = nativegetyuvimagevuoff.RemoteActionCompatParcelizer();
        if (iRemoteActionCompatParcelizer != 0) {
            abandonfocus.getClass();
            if (iRemoteActionCompatParcelizer != 0) {
                ((CameraProviderInitRetryPolicy) abandonfocus.RemoteActionCompatParcelizer).IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, Integer.valueOf(iRemoteActionCompatParcelizer));
            }
        }
        OnePixelShiftQuirk onePixelShiftQuirk = nativegetyuvimagevuoff.RatingCompat;
        CameraControlInternalCameraControlException cameraControlInternalCameraControlException = (CameraControlInternalCameraControlException) abandonfocus.IconCompatParcelizer;
        HashSet hashSet = (HashSet) abandonfocus.MediaSessionCompatQueueItem;
        cameraControlInternalCameraControlException.IconCompatParcelizer.putAll((Map) onePixelShiftQuirk.IconCompatParcelizer);
        this.read.addAll(maptobase.read);
        this.RatingCompat.addAll(maptobase.MediaMetadataCompat);
        abandonfocus.serializer(nativegetyuvimagevuoff.IconCompatParcelizer);
        this.MediaDescriptionCompat.addAll(maptobase.MediaSessionCompatQueueItem);
        awaitNavigationRoutes awaitnavigationroutes = maptobase.RemoteActionCompatParcelizer;
        if (awaitnavigationroutes != null) {
            this.MediaBrowserCompatMediaItem.add(awaitnavigationroutes);
        }
        InputConfiguration inputConfiguration = maptobase.write;
        if (inputConfiguration != null) {
            this.IconCompatParcelizer = inputConfiguration;
        }
        ArrayList arrayList = maptobase.IconCompatParcelizer;
        LinkedHashSet<Preview3AThreadCrashQuirk> linkedHashSet = this.write;
        linkedHashSet.addAll(arrayList);
        hashSet.addAll(Collections.unmodifiableList(nativegetyuvimagevuoff.MediaBrowserCompatMediaItem));
        ArrayList arrayList2 = new ArrayList();
        for (Preview3AThreadCrashQuirk preview3AThreadCrashQuirk : linkedHashSet) {
            arrayList2.add(preview3AThreadCrashQuirk.serializer);
            Iterator it = preview3AThreadCrashQuirk.read.iterator();
            while (it.hasNext()) {
                arrayList2.add((PreviewExternalSyntheticLambda0) it.next());
            }
        }
        if (!arrayList2.containsAll(hashSet)) {
            setInflatedId.IconCompatParcelizer(3, "ValidatingBuilder");
            this.PlaybackStateCompatCustomAction = false;
            sb.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
        }
        int i4 = maptobase.RatingCompat;
        int i5 = this.MediaSessionCompatQueueItem;
        if (i4 != i5 && i4 != 0 && i5 != 0) {
            setInflatedId.IconCompatParcelizer(3, "ValidatingBuilder");
            this.PlaybackStateCompatCustomAction = false;
            sb.append("Invalid configuration due to that two non-default session types are set");
        } else if (i4 != 0) {
            this.MediaSessionCompatQueueItem = i4;
        }
        Preview3AThreadCrashQuirk preview3AThreadCrashQuirk2 = maptobase.MediaBrowserCompatMediaItem;
        if (preview3AThreadCrashQuirk2 != null) {
            Preview3AThreadCrashQuirk preview3AThreadCrashQuirk3 = this.MediaMetadataCompat;
            if (preview3AThreadCrashQuirk3 == preview3AThreadCrashQuirk2 || preview3AThreadCrashQuirk3 == null) {
                this.MediaMetadataCompat = preview3AThreadCrashQuirk2;
            } else {
                setInflatedId.IconCompatParcelizer(3, "ValidatingBuilder");
                this.PlaybackStateCompatCustomAction = false;
                sb.append("Invalid configuration due to that two different postview output configs are set");
            }
        }
        abandonfocus.RemoteActionCompatParcelizer(nativegetyuvimagevuoff.MediaDescriptionCompat);
    }

    public final boolean write() {
        return this.PlaybackStateCompat && this.PlaybackStateCompatCustomAction;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:36:0x010d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0110 A[EDGE_INSN: B:38:0x0110->B:39:0x0131 BREAK  A[LOOP:0: B:16:0x003b->B:48:?]] */
    public final mapToBase RemoteActionCompatParcelizer() {
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk;
        Range range;
        if (!this.PlaybackStateCompatCustomAction) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unsupported session configuration combination");
            return null;
        }
        ArrayList arrayList = new ArrayList(this.write);
        ImageCapture$Metadata imageCapture$Metadata = this.MediaSessionCompatToken;
        int i = 1;
        if (imageCapture$Metadata.IconCompatParcelizer) {
            Collections.sort(arrayList, new VideoCapture$$ExternalSyntheticLambda5(i, imageCapture$Metadata));
        }
        int i2 = this.MediaSessionCompatQueueItem;
        abandonFocus abandonfocus = this.serializer;
        int i3 = 3;
        if (i2 == 1) {
            abandonfocus.getClass();
            if (arrayList.size() == 2 && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0 = ((Preview3AThreadCrashQuirk) it.next()).serializer;
                    previewExternalSyntheticLambda0.getClass();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{previewExternalSyntheticLambda0.MediaDescriptionCompat, MediaCodec.class}, getCieXyz.write())).booleanValue()) {
                        HashSet hashSet = (HashSet) abandonfocus.MediaSessionCompatQueueItem;
                        hashSet.getClass();
                        if (!hashSet.isEmpty()) {
                            Iterator it2 = hashSet.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    CameraProviderInitRetryPolicy cameraProviderInitRetryPolicy = (CameraProviderInitRetryPolicy) abandonfocus.RemoteActionCompatParcelizer;
                                    jpegCaptureDownsizingQuirk = nativeGetYUVImageVUOff.write;
                                    range = (Range) cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk, SmallDisplaySizeQuirk.RemoteActionCompatParcelizer);
                                    if (range != null) {
                                        break;
                                    }
                                    if (((Number) range.getUpper()).intValue() >= 120) {
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{range.getLower(), range.getUpper()}, getCieXyz.write())).booleanValue()) {
                                            range = null;
                                        }
                                    } else {
                                        range = null;
                                    }
                                    if (range != null) {
                                        break;
                                    }
                                    Range range2 = new Range(30, range.getUpper());
                                    range.toString();
                                    range2.toString();
                                    setInflatedId.IconCompatParcelizer(3, "HighSpeedFpsModifier");
                                    ((CameraProviderInitRetryPolicy) abandonfocus.RemoteActionCompatParcelizer).IconCompatParcelizer(jpegCaptureDownsizingQuirk, range2);
                                    break;
                                }
                                PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda1 = (PreviewExternalSyntheticLambda0) it2.next();
                                previewExternalSyntheticLambda1.getClass();
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{previewExternalSyntheticLambda1.MediaDescriptionCompat, MediaCodec.class}, getCieXyz.write())).booleanValue()) {
                                    break;
                                }
                            }
                        } else {
                            CameraProviderInitRetryPolicy cameraProviderInitRetryPolicy2 = (CameraProviderInitRetryPolicy) abandonfocus.RemoteActionCompatParcelizer;
                            jpegCaptureDownsizingQuirk = nativeGetYUVImageVUOff.write;
                            range = (Range) cameraProviderInitRetryPolicy2.read(jpegCaptureDownsizingQuirk, SmallDisplaySizeQuirk.RemoteActionCompatParcelizer);
                            if (range != null) {
                                break;
                            }
                            if (((Number) range.getUpper()).intValue() >= 120) {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{range.getLower(), range.getUpper()}, getCieXyz.write())).booleanValue()) {
                                    range = null;
                                }
                            } else {
                                range = null;
                            }
                            if (range != null) {
                                break;
                            }
                            Range range3 = new Range(30, range.getUpper());
                            range.toString();
                            range3.toString();
                            setInflatedId.IconCompatParcelizer(3, "HighSpeedFpsModifier");
                            ((CameraProviderInitRetryPolicy) abandonfocus.RemoteActionCompatParcelizer).IconCompatParcelizer(jpegCaptureDownsizingQuirk, range3);
                            break;
                        }
                    }
                }
            }
        }
        return new mapToBase(arrayList, new ArrayList(this.read), new ArrayList(this.RatingCompat), new ArrayList(this.MediaDescriptionCompat), abandonfocus.IconCompatParcelizer(), this.MediaBrowserCompatMediaItem.isEmpty() ? null : new BiometricFragmentExternalSyntheticLambda1(i3, this), this.IconCompatParcelizer, this.MediaSessionCompatQueueItem, this.MediaMetadataCompat);
    }
}
