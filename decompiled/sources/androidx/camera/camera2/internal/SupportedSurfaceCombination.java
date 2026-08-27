package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.ImageCapture$1;
import androidx.compose.ui.graphics.Fields;
import androidx.navigation.NavArgsLazy;
import androidx.transition.Transition$1;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.adjust.sdk.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzgh;
import com.huawei.location.ut;
import com.mapbox.search.base.utils.extension.StringKt;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.AeFpsRangeQuirk;
import o.AfRegionFlipHorizontallyQuirk;
import o.AudioEncoderIgnoresInputTimestampQuirk;
import o.AudioTimestampFramePositionIncorrectQuirk;
import o.CameraManagerCompatApi30Impl;
import o.CameraProviderInitRetryPolicy;
import o.CaptureFailedRetryQuirk;
import o.FocusMeteringControl2;
import o.ImageCaptureFailedForSpecificCombinationQuirk;
import o.ImageCaptureRotationOptionQuirk;
import o.ImageUtilCodecFailedException;
import o.IncorrectJpegMetadataQuirk;
import o.InitializationException;
import o.JpegCaptureDownsizingQuirk;
import o.LargeJpegImageQuirk;
import o.LegacyCameraOutputConfigNullPointerQuirk;
import o.LowMemoryQuirk;
import o.MediaSessionCompatQueueItem;
import o.PreviewExternalSyntheticLambda0;
import o.RepeatingStreamConstraintForVideoRecordingQuirk;
import o.SmallDisplaySizeQuirk;
import o.SoftwareJpegEncodingPreferredQuirk;
import o.TemporalNoiseQuirk;
import o.UseCase;
import o.UseCaseAdditionSimulator;
import o.VideoCapture;
import o.abandonFocus;
import o.access701;
import o.accessgetInstancedelegatecp;
import o.getBitmapFromCache;
import o.getFeatureGroupUseCaseType;
import o.getFirstBaselineToTopHeight;
import o.getNavigationIcon;
import o.getPreviewStreamState;
import o.getTargetCheckedState;
import o.getTextMetricsParamsCompat;
import o.getThumbTintList;
import o.getTrackTintList;
import o.hasPointerId;
import o.instance_delegatelambda0;
import o.isEmojiCompatEnabled;
import o.mapToBase;
import o.nativeGetSurfaceInfo;
import o.nativeGetYUVImageVUOff;
import o.onContentCardDismissed;
import o.onMove;
import o.onReadoutStarted;
import o.put;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setController;
import o.setGravity;
import o.setInflatedId;
import o.setSplitTrack;
import o.setThreshold;
import o.setThumbTintList;
import o.setTrackTintList;
import o.setWeightSum;

/* JADX INFO: loaded from: classes.dex */
public final class SupportedSurfaceCombination {
    public final boolean ComponentActivity;
    public final getFirstBaselineToTopHeight IconCompatParcelizer;
    public final onReadoutStarted MediaBrowserCompatMediaItem;
    public final ut MediaDescriptionCompat;
    public final int MediaSessionCompatResultReceiverWrapper;
    public final boolean MediaSessionCompatToken;
    public final setWeightSum PlaybackStateCompat;
    public final boolean PlaybackStateCompatCustomAction;
    public final ImageCapture$1 RatingCompat;
    public final DisplayInfoManager RemoteActionCompatParcelizer;
    public final boolean ResultReceiver;
    public final boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public TemporalNoiseQuirk r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final String read;
    public final getThumbTintList serializer;
    public final ArrayList r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new ArrayList();
    public final ArrayList r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new ArrayList();
    public final ArrayList write = new ArrayList();
    public final ArrayList r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new ArrayList();
    public final ArrayList ParcelableVolumeInfo = new ArrayList();
    public final ArrayList MediaMetadataCompat = new ArrayList();
    public final HashMap MediaSessionCompatQueueItem = new HashMap();
    public final ArrayList r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new ArrayList();
    public final ArrayList r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new ArrayList();
    public final ArrayList r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new ArrayList();
    public final ArrayList r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = new ArrayList();
    public final Transition$1 r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new Transition$1(3);
    public final setTrackTintList r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new setTrackTintList(1);

    /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
    public static Range IconCompatParcelizer(Range range, int i, Range[] rangeArr) {
        Range range2 = SmallDisplaySizeQuirk.RemoteActionCompatParcelizer;
        if (range2.equals(range) || rangeArr == null) {
            return range2;
        }
        Range range3 = new Range(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i)));
        int i2 = 0;
        for (Range range4 : rangeArr) {
            Objects.requireNonNull(range4);
            if (i >= ((Integer) range4.getLower()).intValue()) {
                if (range2.equals(SmallDisplaySizeQuirk.RemoteActionCompatParcelizer)) {
                    range2 = range4;
                }
                if (range4.equals(range3)) {
                    return range4;
                }
                try {
                    int i3 = read(range4.intersect(range3));
                    if (i2 == 0) {
                        i2 = i3;
                    } else {
                        if (i3 >= i2) {
                            double d = read(range2.intersect(range3));
                            double d2 = read(range4.intersect(range3));
                            double d3 = d2 / ((double) read(range4));
                            double d4 = d / ((double) read(range2));
                            if (d2 > d) {
                                if (d3 >= 0.5d || d3 >= d4) {
                                    range2 = range4;
                                }
                            } else if (d2 == d) {
                                if (d3 > d4 || (d3 == d4 && ((Integer) range4.getLower()).intValue() > ((Integer) range2.getLower()).intValue())) {
                                    range2 = range4;
                                }
                            } else if (d4 < 0.5d && d3 > d4) {
                                range2 = range4;
                            }
                            i2 = read(range3.intersect(range2));
                        }
                        range4 = range2;
                    }
                } catch (IllegalArgumentException unused) {
                    if (i2 != 0 || (RemoteActionCompatParcelizer(range4, range3) >= RemoteActionCompatParcelizer(range2, range3) && (RemoteActionCompatParcelizer(range4, range3) != RemoteActionCompatParcelizer(range2, range3) || (((Integer) range4.getLower()).intValue() <= ((Integer) range2.getUpper()).intValue() && read(range4) >= read(range2))))) {
                    }
                }
                range2 = range4;
            }
        }
        return range2;
    }

    public static Range read(Range range, Range range2, boolean z) {
        Range range3 = SmallDisplaySizeQuirk.RemoteActionCompatParcelizer;
        if (range3.equals(range2) && range3.equals(range)) {
            return range3;
        }
        if (range3.equals(range2)) {
            return range;
        }
        if (range3.equals(range)) {
            return range2;
        }
        if (z) {
            UtilsKt.RemoteActionCompatParcelizer("All targetFrameRate should be the same if strict fps is required", range == range2);
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    public final List read(getTextMetricsParamsCompat gettextmetricsparamscompat, List list, HashMap map, HashMap map2) {
        List list2;
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = getTargetCheckedState.write;
        if (gettextmetricsparamscompat.RemoteActionCompatParcelizer == 0 && gettextmetricsparamscompat.read == 8 && !gettextmetricsparamscompat.MediaMetadataCompat) {
            Iterator it = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.iterator();
            while (it.hasNext()) {
                List list3 = ((IncorrectJpegMetadataQuirk) it.next()).read(list);
                if (list3 != null) {
                    JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk2 = getTargetCheckedState.write;
                    int size = list3.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            if (!getTargetCheckedState.read(this.serializer, list3)) {
                                break;
                            }
                            return list3;
                        }
                        long value = ((ImageCaptureRotationOptionQuirk) list3.get(i)).MediaDescriptionCompat.getValue();
                        if (map.containsKey(Integer.valueOf(i))) {
                            LegacyCameraOutputConfigNullPointerQuirk legacyCameraOutputConfigNullPointerQuirk = (LegacyCameraOutputConfigNullPointerQuirk) map.get(Integer.valueOf(i));
                            legacyCameraOutputConfigNullPointerQuirk.getClass();
                            List list4 = legacyCameraOutputConfigNullPointerQuirk.read;
                            VideoCapture videoCapture = list4.size() == 1 ? (VideoCapture) list4.get(0) : VideoCapture.STREAM_SHARING;
                            videoCapture.getClass();
                            if (!getTargetCheckedState.IconCompatParcelizer(videoCapture, value, list4)) {
                                break;
                            }
                            i++;
                        } else {
                            if (!map2.containsKey(Integer.valueOf(i))) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "SurfaceConfig does not map to any use case");
                                return null;
                            }
                            Object obj = map2.get(Integer.valueOf(i));
                            obj.getClass();
                            ImageUtilCodecFailedException imageUtilCodecFailedException = (ImageUtilCodecFailedException) obj;
                            VideoCapture videoCaptureWrite = imageUtilCodecFailedException.write();
                            videoCaptureWrite.getClass();
                            if (imageUtilCodecFailedException.write() == VideoCapture.STREAM_SHARING) {
                                list2 = (List) ((put) imageUtilCodecFailedException).write(put.RemoteActionCompatParcelizer);
                                list2.getClass();
                            } else {
                                list2 = instance_delegatelambda0.write;
                            }
                            if (!getTargetCheckedState.IconCompatParcelizer(videoCaptureWrite, value, list2)) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0383  */
    /* JADX WARN: Code duplicated, block: B:137:0x038d  */
    /* JADX WARN: Code duplicated, block: B:278:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean, int] */
    public final LargeJpegImageQuirk serializer(int i, ArrayList arrayList, HashMap map, boolean z, boolean z2, boolean z3) {
        boolean z4;
        Map map2;
        boolean z5;
        int i2;
        int i3;
        setThreshold setthreshold;
        Iterator it;
        ArrayList arrayList2;
        getNavigationIcon getnavigationiconIconCompatParcelizer;
        ArrayList arrayList3;
        Iterator it2;
        ut utVar;
        getNavigationIcon getnavigationiconIconCompatParcelizer2;
        getNavigationIcon getnavigationicon = getNavigationIcon.read;
        DisplayInfoManager displayInfoManager = this.RemoteActionCompatParcelizer;
        displayInfoManager.RatingCompat = displayInfoManager.serializer();
        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == null) {
            write();
        } else {
            Size sizeRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            TemporalNoiseQuirk temporalNoiseQuirk = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new TemporalNoiseQuirk(temporalNoiseQuirk.write, temporalNoiseQuirk.MediaMetadataCompat, sizeRemoteActionCompatParcelizer, temporalNoiseQuirk.MediaBrowserCompatMediaItem, temporalNoiseQuirk.RatingCompat, temporalNoiseQuirk.IconCompatParcelizer, temporalNoiseQuirk.RemoteActionCompatParcelizer, temporalNoiseQuirk.serializer, temporalNoiseQuirk.MediaSessionCompatQueueItem);
        }
        Set setKeySet = map.keySet();
        Range range = setWeightSum.read;
        setKeySet.getClass();
        ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Integer.valueOf(((LegacyCameraOutputConfigNullPointerQuirk) it3.next()).IconCompatParcelizer));
        }
        Set set = setKeySet;
        ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(set, 10));
        Iterator it4 = set.iterator();
        while (it4.hasNext()) {
            Integer num = (Integer) ((ImageUtilCodecFailedException) it4.next()).read(ImageUtilCodecFailedException.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, 0);
            num.intValue();
            arrayList5.add(num);
        }
        ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList5, arrayList4);
        if (arrayListIconCompatParcelizer.isEmpty()) {
            z4 = false;
            break;
        }
        Iterator it5 = arrayListIconCompatParcelizer.iterator();
        while (true) {
            if (!it5.hasNext()) {
                z4 = false;
                break;
            }
            if (((Number) it5.next()).intValue() == 1) {
                z4 = true;
                break;
            }
        }
        if (z4 && !arrayListIconCompatParcelizer.isEmpty()) {
            Iterator it6 = arrayListIconCompatParcelizer.iterator();
            while (it6.hasNext()) {
                if (((Number) it6.next()).intValue() != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("All sessionTypes should be high-speed when any of them is high-speed");
                    return null;
                }
            }
        }
        if (z4) {
            setWeightSum setweightsum = this.PlaybackStateCompat;
            setweightsum.getClass();
            List listIconCompatParcelizer = setWeightSum.IconCompatParcelizer(onContentCardDismissed.PlaybackStateCompat(map.values()));
            ArrayList arrayList6 = new ArrayList();
            for (Object obj : listIconCompatParcelizer) {
                if (((List) setweightsum.serializer.MediaSessionCompatResultReceiverWrapper()).contains((Size) obj)) {
                    arrayList6.add(obj);
                }
            }
            Map linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                List list = (List) entry.getValue();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj2 : list) {
                    if (arrayList6.contains((Size) obj2)) {
                        arrayList7.add(obj2);
                    }
                }
                linkedHashMap.put(key, arrayList7);
            }
            map2 = linkedHashMap;
        } else {
            map2 = map;
        }
        ArrayList<ImageUtilCodecFailedException> arrayList8 = new ArrayList(map2.keySet());
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        Iterator it7 = arrayList8.iterator();
        while (it7.hasNext()) {
            Integer num2 = (Integer) ((ImageUtilCodecFailedException) it7.next()).read(ImageUtilCodecFailedException.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, 0);
            num2.intValue();
            if (!arrayList10.contains(num2)) {
                arrayList10.add(num2);
            }
        }
        Collections.sort(arrayList10);
        Collections.reverse(arrayList10);
        Iterator it8 = arrayList10.iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Integer) it8.next()).intValue();
            for (ImageUtilCodecFailedException imageUtilCodecFailedException : arrayList8) {
                if (iIntValue == ((Integer) imageUtilCodecFailedException.read(ImageUtilCodecFailedException.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, 0)).intValue()) {
                    arrayList9.add(Integer.valueOf(arrayList8.indexOf(imageUtilCodecFailedException)));
                }
            }
        }
        ut utVar2 = this.MediaDescriptionCompat;
        getTrackTintList gettracktintlist = (getTrackTintList) utVar2.MediaBrowserCompatMediaItem;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            linkedHashSet.add(((LegacyCameraOutputConfigNullPointerQuirk) it9.next()).RemoteActionCompatParcelizer);
        }
        Set setSerializer = ((setSplitTrack) gettracktintlist.serializer).serializer();
        HashSet hashSet = new HashSet(setSerializer);
        Iterator it10 = linkedHashSet.iterator();
        while (it10.hasNext()) {
            ut.write(hashSet, (getNavigationIcon) it10.next(), gettracktintlist);
        }
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        Iterator it11 = arrayList9.iterator();
        while (it11.hasNext()) {
            ImageUtilCodecFailedException imageUtilCodecFailedException2 = (ImageUtilCodecFailedException) arrayList8.get(((Integer) it11.next()).intValue());
            getNavigationIcon getnavigationiconIconCompatParcelizer3 = imageUtilCodecFailedException2.IconCompatParcelizer();
            boolean z6 = z4;
            if (getnavigationiconIconCompatParcelizer3.equals(getNavigationIcon.MediaMetadataCompat)) {
                arrayList13.add(imageUtilCodecFailedException2);
            } else {
                int i4 = getnavigationiconIconCompatParcelizer3.MediaSessionCompatQueueItem;
                int i5 = getnavigationiconIconCompatParcelizer3.MediaBrowserCompatMediaItem;
                if (i4 == 2 || ((i4 != 0 && i5 == 0) || (i4 == 0 && i5 != 0))) {
                    arrayList12.add(imageUtilCodecFailedException2);
                } else {
                    arrayList11.add(imageUtilCodecFailedException2);
                }
            }
            z4 = z6;
        }
        boolean z7 = z4;
        HashMap map3 = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList14 = new ArrayList();
        arrayList14.addAll(arrayList11);
        arrayList14.addAll(arrayList12);
        arrayList14.addAll(arrayList13);
        Iterator it12 = arrayList14.iterator();
        while (it12.hasNext()) {
            ImageUtilCodecFailedException imageUtilCodecFailedException3 = (ImageUtilCodecFailedException) it12.next();
            getNavigationIcon getnavigationiconIconCompatParcelizer4 = imageUtilCodecFailedException3.IconCompatParcelizer();
            getNavigationIcon getnavigationicon2 = getNavigationIcon.MediaDescriptionCompat;
            if (!getnavigationiconIconCompatParcelizer4.serializer()) {
                int i6 = getnavigationiconIconCompatParcelizer4.MediaSessionCompatQueueItem;
                it = it12;
                int i7 = getnavigationiconIconCompatParcelizer4.MediaBrowserCompatMediaItem;
                arrayList2 = arrayList9;
                if (i6 == 1 && i7 == 0) {
                    if (!hashSet.contains(getnavigationicon2)) {
                        utVar = utVar2;
                        arrayList3 = arrayList8;
                        getnavigationiconIconCompatParcelizer = null;
                        break;
                    }
                    arrayList3 = arrayList8;
                    utVar = utVar2;
                    getnavigationiconIconCompatParcelizer = getnavigationicon2;
                } else {
                    getnavigationiconIconCompatParcelizer = ut.IconCompatParcelizer(getnavigationiconIconCompatParcelizer4, linkedHashSet, hashSet);
                    arrayList3 = arrayList8;
                    if (getnavigationiconIconCompatParcelizer == null) {
                        getNavigationIcon getnavigationiconIconCompatParcelizer5 = ut.IconCompatParcelizer(getnavigationiconIconCompatParcelizer4, linkedHashSet2, hashSet);
                        if (getnavigationiconIconCompatParcelizer5 != null) {
                            getnavigationiconIconCompatParcelizer4.toString();
                            getnavigationiconIconCompatParcelizer5.toString();
                            setInflatedId.IconCompatParcelizer(3, "DynamicRangeResolver");
                            utVar = utVar2;
                            getnavigationiconIconCompatParcelizer = getnavigationiconIconCompatParcelizer5;
                        } else if (ut.IconCompatParcelizer(getnavigationiconIconCompatParcelizer4, getnavigationicon2, hashSet)) {
                            getnavigationiconIconCompatParcelizer4.toString();
                            getnavigationicon2.toString();
                            setInflatedId.IconCompatParcelizer(3, "DynamicRangeResolver");
                            utVar = utVar2;
                            getnavigationiconIconCompatParcelizer = getnavigationicon2;
                        } else if (i6 == 2 && (i7 == 10 || i7 == 0)) {
                            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                            if (Build.VERSION.SDK_INT >= 33 && (getnavigationiconIconCompatParcelizer2 = setGravity.IconCompatParcelizer((getThumbTintList) utVar2.RatingCompat)) != null) {
                                linkedHashSet3.add(getnavigationiconIconCompatParcelizer2);
                            }
                            linkedHashSet3.add(getnavigationicon);
                            getNavigationIcon getnavigationiconIconCompatParcelizer6 = ut.IconCompatParcelizer(getnavigationiconIconCompatParcelizer4, linkedHashSet3, hashSet);
                            if (getnavigationiconIconCompatParcelizer6 == null) {
                                it2 = hashSet.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        utVar = utVar2;
                                        getnavigationiconIconCompatParcelizer = null;
                                        break;
                                    }
                                    getnavigationiconIconCompatParcelizer = (getNavigationIcon) it2.next();
                                    utVar = utVar2;
                                    UtilsKt.RemoteActionCompatParcelizer("Candidate dynamic range must be fully specified.", getnavigationiconIconCompatParcelizer.serializer());
                                    if (!getnavigationiconIconCompatParcelizer.equals(getnavigationicon2)) {
                                        getnavigationiconIconCompatParcelizer4.toString();
                                        getnavigationiconIconCompatParcelizer.toString();
                                        setInflatedId.IconCompatParcelizer(3, "DynamicRangeResolver");
                                        break;
                                    }
                                    utVar2 = utVar;
                                }
                            } else {
                                getnavigationiconIconCompatParcelizer4.toString();
                                getnavigationiconIconCompatParcelizer6.toString();
                                setInflatedId.IconCompatParcelizer(3, "DynamicRangeResolver");
                                utVar = utVar2;
                                getnavigationiconIconCompatParcelizer = getnavigationiconIconCompatParcelizer6;
                            }
                        } else {
                            it2 = hashSet.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    utVar = utVar2;
                                    getnavigationiconIconCompatParcelizer = null;
                                    break;
                                }
                                getnavigationiconIconCompatParcelizer = (getNavigationIcon) it2.next();
                                utVar = utVar2;
                                UtilsKt.RemoteActionCompatParcelizer("Candidate dynamic range must be fully specified.", getnavigationiconIconCompatParcelizer.serializer());
                                if (!getnavigationiconIconCompatParcelizer.equals(getnavigationicon2) && ut.IconCompatParcelizer(getnavigationiconIconCompatParcelizer4, getnavigationiconIconCompatParcelizer)) {
                                    getnavigationiconIconCompatParcelizer4.toString();
                                    getnavigationiconIconCompatParcelizer.toString();
                                    setInflatedId.IconCompatParcelizer(3, "DynamicRangeResolver");
                                    break;
                                }
                                utVar2 = utVar;
                            }
                        }
                    } else {
                        getnavigationiconIconCompatParcelizer4.toString();
                        getnavigationiconIconCompatParcelizer.toString();
                        setInflatedId.IconCompatParcelizer(3, "DynamicRangeResolver");
                        utVar = utVar2;
                    }
                }
            } else {
                utVar = utVar2;
                it = it12;
                arrayList2 = arrayList9;
                arrayList3 = arrayList8;
                if (!hashSet.contains(getnavigationiconIconCompatParcelizer4)) {
                    getnavigationiconIconCompatParcelizer = null;
                    break;
                }
                getnavigationiconIconCompatParcelizer = getnavigationiconIconCompatParcelizer4;
            }
            if (getnavigationiconIconCompatParcelizer == null) {
                String str = (String) imageUtilCodecFailedException3.write(getPreviewStreamState.PlaybackStateCompat);
                String strJoin = TextUtils.join("\n  ", setSerializer);
                String strJoin2 = TextUtils.join("\n  ", hashSet);
                StringBuilder sb = new StringBuilder("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  ");
                sb.append(str);
                sb.append("\nRequested dynamic range:\n  ");
                sb.append(getnavigationiconIconCompatParcelizer4);
                sb.append("\nSupported dynamic ranges:\n  ");
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(sb, strJoin, "\nConstrained set of concurrent dynamic ranges:\n  ", strJoin2));
                return null;
            }
            ut.write(hashSet, getnavigationiconIconCompatParcelizer, gettracktintlist);
            map3.put(imageUtilCodecFailedException3, getnavigationiconIconCompatParcelizer);
            if (!linkedHashSet.contains(getnavigationiconIconCompatParcelizer)) {
                linkedHashSet2.add(getnavigationiconIconCompatParcelizer);
            }
            it12 = it;
            arrayList9 = arrayList2;
            arrayList8 = arrayList3;
            utVar2 = utVar;
        }
        ArrayList arrayList15 = arrayList9;
        ArrayList arrayList16 = arrayList8;
        map3.toString();
        setInflatedId.IconCompatParcelizer(3, "SupportedSurfaceCombination");
        Iterator it13 = arrayList.iterator();
        while (true) {
            if (!it13.hasNext()) {
                Iterator it14 = map2.keySet().iterator();
                while (true) {
                    if (!it14.hasNext()) {
                        z5 = false;
                        break;
                    }
                    if (((ImageUtilCodecFailedException) it14.next()).RemoteActionCompatParcelizer() == 4101) {
                    }
                }
            } else if (((LegacyCameraOutputConfigNullPointerQuirk) it13.next()).serializer == 4101) {
            }
            z5 = true;
            break;
        }
        Iterator it15 = arrayList.iterator();
        Boolean boolValueOf = null;
        while (it15.hasNext()) {
            boolean z8 = ((LegacyCameraOutputConfigNullPointerQuirk) it15.next()).MediaDescriptionCompat;
            if (boolValueOf != null && boolValueOf.booleanValue() != z8) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("All isStrictFpsRequired should be the same");
                return null;
            }
            boolValueOf = Boolean.valueOf(z8);
        }
        Iterator it16 = arrayList16.iterator();
        while (it16.hasNext()) {
            Boolean bool = (Boolean) ((ImageUtilCodecFailedException) it16.next()).read(ImageUtilCodecFailedException.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, Boolean.FALSE);
            Objects.requireNonNull(bool);
            boolean zBooleanValue = bool.booleanValue();
            if (boolValueOf != null && boolValueOf.booleanValue() != zBooleanValue) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("All isStrictFpsRequired should be the same");
                return null;
            }
            boolValueOf = bool;
        }
        boolean zBooleanValue2 = boolValueOf != null ? boolValueOf.booleanValue() : false;
        Range range2 = SmallDisplaySizeQuirk.RemoteActionCompatParcelizer;
        Iterator it17 = arrayList.iterator();
        while (it17.hasNext()) {
            range2 = read(((LegacyCameraOutputConfigNullPointerQuirk) it17.next()).MediaSessionCompatQueueItem, range2, zBooleanValue2);
        }
        Iterator it18 = arrayList15.iterator();
        Range range3 = range2;
        while (it18.hasNext()) {
            Range range4 = (Range) ((ImageUtilCodecFailedException) arrayList16.get(((Integer) it18.next()).intValue())).read(ImageUtilCodecFailedException.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, SmallDisplaySizeQuirk.RemoteActionCompatParcelizer);
            Objects.requireNonNull(range4);
            range3 = read(range4, range3, zBooleanValue2);
        }
        setInflatedId.IconCompatParcelizer(3, "SupportedSurfaceCombination");
        if (z && !this.ComponentActivity && z3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Preview stabilization is not supported by the camera.");
            return null;
        }
        Range range5 = range3;
        getTextMetricsParamsCompat gettextmetricsparamscompatIconCompatParcelizer = IconCompatParcelizer(i, z2, map3, z, z5, z7, z3, false, range3, zBooleanValue2);
        Collection collectionValues = map3.values();
        if (z3) {
            ?? Contains = collectionValues.contains(getnavigationicon);
            if (range5 != null && ((Integer) range5.getUpper()).intValue() == 60) {
                i2 = Contains;
                i2 = Contains;
                i2 = Contains + 1;
            }
            if (z) {
                i2++;
            }
            if (z5) {
                i2++;
            }
            i3 = 1;
            setthreshold = i2 > 1 ? setThreshold.WITH_FEATURE_COMBO : i2 == 1 ? setThreshold.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT : setThreshold.WITHOUT_FEATURE_COMBO;
        } else {
            setthreshold = setThreshold.WITHOUT_FEATURE_COMBO;
            i3 = 1;
        }
        Objects.toString(setthreshold);
        setInflatedId.IconCompatParcelizer(3, "SupportedSurfaceCombination");
        int iOrdinal = setthreshold.ordinal();
        if (iOrdinal == i3) {
            return RemoteActionCompatParcelizer(IconCompatParcelizer(gettextmetricsparamscompatIconCompatParcelizer.RemoteActionCompatParcelizer, gettextmetricsparamscompatIconCompatParcelizer.write, map3, gettextmetricsparamscompatIconCompatParcelizer.MediaDescriptionCompat, gettextmetricsparamscompatIconCompatParcelizer.RatingCompat, gettextmetricsparamscompatIconCompatParcelizer.MediaMetadataCompat, gettextmetricsparamscompatIconCompatParcelizer.IconCompatParcelizer, true, gettextmetricsparamscompatIconCompatParcelizer.serializer, gettextmetricsparamscompatIconCompatParcelizer.MediaBrowserCompatMediaItem), arrayList, map2, arrayList16, arrayList15, map3);
        }
        if (iOrdinal != 2) {
            return RemoteActionCompatParcelizer(gettextmetricsparamscompatIconCompatParcelizer, arrayList, map2, arrayList16, arrayList15, map3);
        }
        try {
            return RemoteActionCompatParcelizer(gettextmetricsparamscompatIconCompatParcelizer, arrayList, map2, arrayList16, arrayList15, map3);
        } catch (IllegalArgumentException unused) {
            setInflatedId.IconCompatParcelizer(3, "SupportedSurfaceCombination");
            return RemoteActionCompatParcelizer(IconCompatParcelizer(gettextmetricsparamscompatIconCompatParcelizer.RemoteActionCompatParcelizer, gettextmetricsparamscompatIconCompatParcelizer.write, map3, gettextmetricsparamscompatIconCompatParcelizer.MediaDescriptionCompat, gettextmetricsparamscompatIconCompatParcelizer.RatingCompat, gettextmetricsparamscompatIconCompatParcelizer.MediaMetadataCompat, gettextmetricsparamscompatIconCompatParcelizer.IconCompatParcelizer, true, gettextmetricsparamscompatIconCompatParcelizer.serializer, gettextmetricsparamscompatIconCompatParcelizer.MediaBrowserCompatMediaItem), arrayList, map2, arrayList16, arrayList15, map3);
        }
    }

    public final void write() {
        Size size;
        Size size2;
        Size[] outputSizes;
        CamcorderProfile camcorderProfileRemoteActionCompatParcelizer;
        Size sizeRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        Size size3 = null;
        try {
            int i = Integer.parseInt(this.read);
            getFirstBaselineToTopHeight getfirstbaselinetotopheight = this.IconCompatParcelizer;
            int[] iArr = {1, 13, 10, 8, 12, 6, 5, 4};
            int i2 = 0;
            while (true) {
                if (i2 >= 8) {
                    size = null;
                    break;
                }
                int i3 = iArr[i2];
                if (getfirstbaselinetotopheight.write(i, i3) && (camcorderProfileRemoteActionCompatParcelizer = getfirstbaselinetotopheight.RemoteActionCompatParcelizer(i, i3)) != null) {
                    size = new Size(camcorderProfileRemoteActionCompatParcelizer.videoFrameWidth, camcorderProfileRemoteActionCompatParcelizer.videoFrameHeight);
                    break;
                }
                i2++;
            }
            if (size != null) {
                size2 = size;
            } else {
                try {
                    outputSizes = ((StreamConfigurationMap) ((ImageCapture$1) this.serializer.serializer().MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).getOutputSizes(MediaRecorder.class);
                } catch (Throwable unused) {
                    outputSizes = null;
                }
                if (outputSizes != null) {
                    Arrays.sort(outputSizes, new AudioEncoderIgnoresInputTimestampQuirk(true));
                    for (Size size4 : outputSizes) {
                        int width = size4.getWidth();
                        Size size5 = setController.read;
                        if (width <= size5.getWidth() && size4.getHeight() <= size5.getHeight()) {
                            size3 = size4;
                            break;
                        }
                    }
                }
                if (size3 != null) {
                    size2 = size3;
                } else {
                    size = setController.IconCompatParcelizer;
                    size2 = size;
                }
            }
        } catch (NumberFormatException unused2) {
        }
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new TemporalNoiseQuirk(setController.MediaMetadataCompat, new HashMap(), sizeRemoteActionCompatParcelizer, new HashMap(), size2, new HashMap(), new HashMap(), new HashMap(), new HashMap());
    }

    public final void write(HashMap map, int i, Rational rational) {
        Size sizeSerializer = serializer((StreamConfigurationMap) ((ImageCapture$1) this.serializer.serializer().MediaSessionCompatQueueItem).MediaSessionCompatQueueItem, i, true, rational);
        if (sizeSerializer != null) {
            map.put(Integer.valueOf(i), sizeSerializer);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x02b6  */
    public SupportedSurfaceCombination(Context context, String str, CameraManagerCompat cameraManagerCompat, getFirstBaselineToTopHeight getfirstbaselinetotopheight, onReadoutStarted onreadoutstarted) throws CameraUnavailableException {
        List listSingletonList;
        boolean z;
        int[] iArr;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
        this.MediaSessionCompatToken = false;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = false;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = false;
        str.getClass();
        this.read = str;
        getfirstbaselinetotopheight.getClass();
        this.IconCompatParcelizer = getfirstbaselinetotopheight;
        this.RatingCompat = new ImageCapture$1(18);
        this.RemoteActionCompatParcelizer = DisplayInfoManager.IconCompatParcelizer(context);
        try {
            getThumbTintList getthumbtintlistSerializer = cameraManagerCompat.serializer(str);
            this.serializer = getthumbtintlistSerializer;
            Integer num = (Integer) getthumbtintlistSerializer.write(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.MediaSessionCompatResultReceiverWrapper = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) getthumbtintlistSerializer.write(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i : iArr2) {
                    if (i == 3) {
                        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
                    } else if (i == 6) {
                        this.MediaSessionCompatToken = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i == 16) {
                        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = true;
                    } else if (i == 1) {
                        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = true;
                    }
                }
            }
            ut utVar = new ut(this.serializer);
            this.MediaDescriptionCompat = utVar;
            this.PlaybackStateCompat = new setWeightSum(this.serializer);
            ArrayList arrayList = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            int i2 = this.MediaSessionCompatResultReceiverWrapper;
            boolean z2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            boolean z3 = this.MediaSessionCompatToken;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = new IncorrectJpegMetadataQuirk();
            SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk = SoftwareJpegEncodingPreferredQuirk.PRIV;
            ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk = ImageCaptureFailedForSpecificCombinationQuirk.MAXIMUM;
            IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirk, arrayList3, incorrectJpegMetadataQuirk);
            SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk2 = SoftwareJpegEncodingPreferredQuirk.JPEG;
            IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite2 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkWrite, arrayList3, incorrectJpegMetadataQuirkWrite);
            SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk3 = SoftwareJpegEncodingPreferredQuirk.YUV;
            IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite3 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkWrite2, arrayList3, incorrectJpegMetadataQuirkWrite2);
            ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk2 = ImageCaptureFailedForSpecificCombinationQuirk.PREVIEW;
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkWrite3, softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk);
            IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM = af$$ExternalSyntheticOutline1.m(arrayList3, incorrectJpegMetadataQuirkWrite3);
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkM, softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk);
            IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM2 = af$$ExternalSyntheticOutline1.m(arrayList3, incorrectJpegMetadataQuirkM);
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkM2, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2);
            IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM3 = af$$ExternalSyntheticOutline1.m(arrayList3, incorrectJpegMetadataQuirkM2);
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkM3, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2);
            IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM4 = af$$ExternalSyntheticOutline1.m(arrayList3, incorrectJpegMetadataQuirkM3);
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkM4, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2);
            incorrectJpegMetadataQuirkM4.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk));
            arrayList3.add(incorrectJpegMetadataQuirkM4);
            arrayList2.addAll(arrayList3);
            if (i2 == 0 || i2 == 4 || i2 == 1 || i2 == 3) {
                ArrayList arrayList4 = new ArrayList();
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk2 = new IncorrectJpegMetadataQuirk();
                incorrectJpegMetadataQuirk2.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2));
                ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk3 = ImageCaptureFailedForSpecificCombinationQuirk.RECORD;
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite4 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk3, incorrectJpegMetadataQuirk2, arrayList4, incorrectJpegMetadataQuirk2);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkWrite4, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk3);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM5 = af$$ExternalSyntheticOutline1.m(arrayList4, incorrectJpegMetadataQuirkWrite4);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkM5, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk3);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM6 = af$$ExternalSyntheticOutline1.m(arrayList4, incorrectJpegMetadataQuirkM5);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkM6, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk3);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite5 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk3, incorrectJpegMetadataQuirkM6, arrayList4, incorrectJpegMetadataQuirkM6);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkWrite5, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk3);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite6 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk3, incorrectJpegMetadataQuirkWrite5, arrayList4, incorrectJpegMetadataQuirkWrite5);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkWrite6, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2);
                incorrectJpegMetadataQuirkWrite6.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk));
                arrayList4.add(incorrectJpegMetadataQuirkWrite6);
                arrayList2.addAll(arrayList4);
            }
            if (i2 == 1 || i2 == 3) {
                ArrayList arrayList5 = new ArrayList();
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk3 = new IncorrectJpegMetadataQuirk();
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirk3, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM7 = af$$ExternalSyntheticOutline1.m(arrayList5, incorrectJpegMetadataQuirk3);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkM7, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM8 = af$$ExternalSyntheticOutline1.m(arrayList5, incorrectJpegMetadataQuirkM7);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkM8, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM9 = af$$ExternalSyntheticOutline1.m(arrayList5, incorrectJpegMetadataQuirkM8);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkM9, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite7 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkM9, arrayList5, incorrectJpegMetadataQuirkM9);
                ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk4 = ImageCaptureFailedForSpecificCombinationQuirk.VGA;
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk4, incorrectJpegMetadataQuirkWrite7, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite8 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkWrite7, arrayList5, incorrectJpegMetadataQuirkWrite7);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk4, incorrectJpegMetadataQuirkWrite8, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2);
                incorrectJpegMetadataQuirkWrite8.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk));
                arrayList5.add(incorrectJpegMetadataQuirkWrite8);
                arrayList2.addAll(arrayList5);
            }
            if (z2) {
                ArrayList arrayList6 = new ArrayList();
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk4 = new IncorrectJpegMetadataQuirk();
                SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk4 = SoftwareJpegEncodingPreferredQuirk.RAW;
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite9 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk4, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirk4, arrayList6, incorrectJpegMetadataQuirk4);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkWrite9, softwareJpegEncodingPreferredQuirk4, imageCaptureFailedForSpecificCombinationQuirk);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM10 = af$$ExternalSyntheticOutline1.m(arrayList6, incorrectJpegMetadataQuirkWrite9);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkM10, softwareJpegEncodingPreferredQuirk4, imageCaptureFailedForSpecificCombinationQuirk);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM11 = af$$ExternalSyntheticOutline1.m(arrayList6, incorrectJpegMetadataQuirkM10);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkM11, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite10 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk4, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkM11, arrayList6, incorrectJpegMetadataQuirkM11);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkWrite10, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite11 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk4, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkWrite10, arrayList6, incorrectJpegMetadataQuirkWrite10);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkWrite11, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite12 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk4, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkWrite11, arrayList6, incorrectJpegMetadataQuirkWrite11);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkWrite12, softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite13 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk4, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkWrite12, arrayList6, incorrectJpegMetadataQuirkWrite12);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkWrite13, softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk);
                incorrectJpegMetadataQuirkWrite13.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk4, imageCaptureFailedForSpecificCombinationQuirk));
                arrayList6.add(incorrectJpegMetadataQuirkWrite13);
                arrayList2.addAll(arrayList6);
            }
            if (z3 && i2 == 0) {
                ArrayList arrayList7 = new ArrayList();
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk5 = new IncorrectJpegMetadataQuirk();
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirk5, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM12 = af$$ExternalSyntheticOutline1.m(arrayList7, incorrectJpegMetadataQuirk5);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkM12, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM13 = af$$ExternalSyntheticOutline1.m(arrayList7, incorrectJpegMetadataQuirkM12);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkM13, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk);
                arrayList7.add(incorrectJpegMetadataQuirkM13);
                arrayList2.addAll(arrayList7);
            }
            if (i2 == 3) {
                ArrayList arrayList8 = new ArrayList();
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk6 = new IncorrectJpegMetadataQuirk();
                incorrectJpegMetadataQuirk6.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2));
                ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk5 = ImageCaptureFailedForSpecificCombinationQuirk.VGA;
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk5, incorrectJpegMetadataQuirk6, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk);
                SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk5 = SoftwareJpegEncodingPreferredQuirk.RAW;
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite14 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk5, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirk6, arrayList8, incorrectJpegMetadataQuirk6);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkWrite14, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk5);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkWrite14, softwareJpegEncodingPreferredQuirk5, imageCaptureFailedForSpecificCombinationQuirk);
                arrayList8.add(incorrectJpegMetadataQuirkWrite14);
                arrayList2.addAll(arrayList8);
            }
            arrayList.addAll(arrayList2);
            ImageCapture$1 imageCapture$1 = this.RatingCompat;
            String str2 = this.read;
            if (((ExtraSupportedSurfaceCombinationsQuirk) imageCapture$1.MediaSessionCompatQueueItem) == null) {
                listSingletonList = new ArrayList();
            } else {
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk7 = ExtraSupportedSurfaceCombinationsQuirk.IconCompatParcelizer;
                String str3 = Build.DEVICE;
                if (!"heroqltevzw".equalsIgnoreCase(str3) && !"heroqltetmo".equalsIgnoreCase(str3)) {
                    if (Constants.REFERRER_API_GOOGLE.equalsIgnoreCase(Build.BRAND)) {
                        if (!ExtraSupportedSurfaceCombinationsQuirk.RemoteActionCompatParcelizer.contains(Build.MODEL.toUpperCase(Locale.US))) {
                            if (ExtraSupportedSurfaceCombinationsQuirk.read()) {
                                listSingletonList = Collections.EMPTY_LIST;
                            } else {
                                listSingletonList = Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.read);
                            }
                        } else {
                            listSingletonList = Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.read);
                        }
                    } else if (ExtraSupportedSurfaceCombinationsQuirk.read()) {
                        listSingletonList = Collections.EMPTY_LIST;
                    } else {
                        listSingletonList = Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.read);
                    }
                } else {
                    ArrayList arrayList9 = new ArrayList();
                    listSingletonList = arrayList9;
                    if (str2.equals("1")) {
                        arrayList9.add(ExtraSupportedSurfaceCombinationsQuirk.IconCompatParcelizer);
                        listSingletonList = arrayList9;
                    }
                }
            }
            arrayList.addAll(listSingletonList);
            if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                ArrayList arrayList10 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                ArrayList arrayList11 = new ArrayList();
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk8 = new IncorrectJpegMetadataQuirk();
                ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk6 = ImageCaptureFailedForSpecificCombinationQuirk.ULTRA_MAXIMUM;
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk6, incorrectJpegMetadataQuirk8, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2);
                ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk7 = ImageCaptureFailedForSpecificCombinationQuirk.RECORD;
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite15 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk7, incorrectJpegMetadataQuirk8, arrayList11, incorrectJpegMetadataQuirk8);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk6, incorrectJpegMetadataQuirkWrite15, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite16 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk7, incorrectJpegMetadataQuirkWrite15, arrayList11, incorrectJpegMetadataQuirkWrite15);
                SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk6 = SoftwareJpegEncodingPreferredQuirk.RAW;
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk6, imageCaptureFailedForSpecificCombinationQuirk6, incorrectJpegMetadataQuirkWrite16, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite17 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk7, incorrectJpegMetadataQuirkWrite16, arrayList11, incorrectJpegMetadataQuirkWrite16);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk6, incorrectJpegMetadataQuirkWrite17, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite18 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkWrite17, arrayList11, incorrectJpegMetadataQuirkWrite17);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk6, incorrectJpegMetadataQuirkWrite18, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite19 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkWrite18, arrayList11, incorrectJpegMetadataQuirkWrite18);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk6, imageCaptureFailedForSpecificCombinationQuirk6, incorrectJpegMetadataQuirkWrite19, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite20 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkWrite19, arrayList11, incorrectJpegMetadataQuirkWrite19);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk6, incorrectJpegMetadataQuirkWrite20, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite21 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkWrite20, arrayList11, incorrectJpegMetadataQuirkWrite20);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk6, incorrectJpegMetadataQuirkWrite21, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite22 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkWrite21, arrayList11, incorrectJpegMetadataQuirkWrite21);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk6, imageCaptureFailedForSpecificCombinationQuirk6, incorrectJpegMetadataQuirkWrite22, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite23 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkWrite22, arrayList11, incorrectJpegMetadataQuirkWrite22);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk6, incorrectJpegMetadataQuirkWrite23, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite24 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk6, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkWrite23, arrayList11, incorrectJpegMetadataQuirkWrite23);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk6, incorrectJpegMetadataQuirkWrite24, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite25 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk6, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkWrite24, arrayList11, incorrectJpegMetadataQuirkWrite24);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk6, imageCaptureFailedForSpecificCombinationQuirk6, incorrectJpegMetadataQuirkWrite25, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2);
                incorrectJpegMetadataQuirkWrite25.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk6, imageCaptureFailedForSpecificCombinationQuirk));
                arrayList11.add(incorrectJpegMetadataQuirkWrite25);
                arrayList10.addAll(arrayList11);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.PlaybackStateCompatCustomAction = zHasSystemFeature;
            if (zHasSystemFeature) {
                ArrayList arrayList12 = this.write;
                ArrayList arrayList13 = new ArrayList();
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk9 = new IncorrectJpegMetadataQuirk();
                ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk8 = ImageCaptureFailedForSpecificCombinationQuirk.S1440P_4_3;
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite26 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk8, incorrectJpegMetadataQuirk9, arrayList13, incorrectJpegMetadataQuirk9);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite27 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk8, incorrectJpegMetadataQuirkWrite26, arrayList13, incorrectJpegMetadataQuirkWrite26);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite28 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk8, incorrectJpegMetadataQuirkWrite27, arrayList13, incorrectJpegMetadataQuirkWrite27);
                ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk9 = ImageCaptureFailedForSpecificCombinationQuirk.S720P_16_9;
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk9, incorrectJpegMetadataQuirkWrite28, softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk8);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM14 = af$$ExternalSyntheticOutline1.m(arrayList13, incorrectJpegMetadataQuirkWrite28);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk9, incorrectJpegMetadataQuirkM14, softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk8);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM15 = af$$ExternalSyntheticOutline1.m(arrayList13, incorrectJpegMetadataQuirkM14);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk9, incorrectJpegMetadataQuirkM15, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk8);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM16 = af$$ExternalSyntheticOutline1.m(arrayList13, incorrectJpegMetadataQuirkM15);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk9, incorrectJpegMetadataQuirkM16, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk8);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM17 = af$$ExternalSyntheticOutline1.m(arrayList13, incorrectJpegMetadataQuirkM16);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk9, incorrectJpegMetadataQuirkM17, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk8);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM18 = af$$ExternalSyntheticOutline1.m(arrayList13, incorrectJpegMetadataQuirkM17);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk9, incorrectJpegMetadataQuirkM18, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk8);
                arrayList13.add(incorrectJpegMetadataQuirkM18);
                arrayList12.addAll(arrayList13);
            }
            if (utVar.write) {
                ArrayList arrayList14 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                ArrayList arrayList15 = new ArrayList();
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk10 = new IncorrectJpegMetadataQuirk();
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite29 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirk10, arrayList15, incorrectJpegMetadataQuirk10);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite30 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk, incorrectJpegMetadataQuirkWrite29, arrayList15, incorrectJpegMetadataQuirkWrite29);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkWrite30, softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM19 = af$$ExternalSyntheticOutline1.m(arrayList15, incorrectJpegMetadataQuirkWrite30);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkM19, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM20 = af$$ExternalSyntheticOutline1.m(arrayList15, incorrectJpegMetadataQuirkM19);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkM20, softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM21 = af$$ExternalSyntheticOutline1.m(arrayList15, incorrectJpegMetadataQuirkM20);
                incorrectJpegMetadataQuirkM21.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2));
                ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk10 = ImageCaptureFailedForSpecificCombinationQuirk.RECORD;
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite31 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk10, incorrectJpegMetadataQuirkM21, arrayList15, incorrectJpegMetadataQuirkM21);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkWrite31, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk10);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite32 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk10, incorrectJpegMetadataQuirkWrite31, arrayList15, incorrectJpegMetadataQuirkWrite31);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, incorrectJpegMetadataQuirkWrite32, softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk10);
                incorrectJpegMetadataQuirkWrite32.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk10));
                arrayList15.add(incorrectJpegMetadataQuirkWrite32);
                arrayList14.addAll(arrayList15);
            }
            boolean zSerializer = getTargetCheckedState.serializer(this.serializer);
            this.ResultReceiver = zSerializer;
            if (zSerializer && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList16 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                ArrayList arrayList17 = new ArrayList();
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk11 = new IncorrectJpegMetadataQuirk();
                ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk11 = ImageCaptureFailedForSpecificCombinationQuirk.S1440P_4_3;
                AeFpsRangeQuirk aeFpsRangeQuirk = AeFpsRangeQuirk.PREVIEW_VIDEO_STILL;
                incorrectJpegMetadataQuirk11.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk11, aeFpsRangeQuirk));
                arrayList17.add(incorrectJpegMetadataQuirk11);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk12 = new IncorrectJpegMetadataQuirk();
                incorrectJpegMetadataQuirk12.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk11, aeFpsRangeQuirk));
                arrayList17.add(incorrectJpegMetadataQuirk12);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk13 = new IncorrectJpegMetadataQuirk();
                ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk12 = ImageCaptureFailedForSpecificCombinationQuirk.RECORD;
                AeFpsRangeQuirk aeFpsRangeQuirk2 = AeFpsRangeQuirk.VIDEO_RECORD;
                incorrectJpegMetadataQuirk13.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk12, aeFpsRangeQuirk2));
                arrayList17.add(incorrectJpegMetadataQuirk13);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk14 = new IncorrectJpegMetadataQuirk();
                incorrectJpegMetadataQuirk14.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk12, aeFpsRangeQuirk2));
                arrayList17.add(incorrectJpegMetadataQuirk14);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk15 = new IncorrectJpegMetadataQuirk();
                AeFpsRangeQuirk aeFpsRangeQuirk3 = AeFpsRangeQuirk.STILL_CAPTURE;
                incorrectJpegMetadataQuirk15.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk, aeFpsRangeQuirk3));
                arrayList17.add(incorrectJpegMetadataQuirk15);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk16 = new IncorrectJpegMetadataQuirk();
                incorrectJpegMetadataQuirk16.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk, aeFpsRangeQuirk3));
                arrayList17.add(incorrectJpegMetadataQuirk16);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk17 = new IncorrectJpegMetadataQuirk();
                AeFpsRangeQuirk aeFpsRangeQuirk4 = AeFpsRangeQuirk.PREVIEW;
                incorrectJpegMetadataQuirk17.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, aeFpsRangeQuirk4));
                incorrectJpegMetadataQuirk17.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk, aeFpsRangeQuirk3));
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM22 = af$$ExternalSyntheticOutline1.m(arrayList17, incorrectJpegMetadataQuirk17);
                incorrectJpegMetadataQuirkM22.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, aeFpsRangeQuirk4));
                incorrectJpegMetadataQuirkM22.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk, aeFpsRangeQuirk3));
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM23 = af$$ExternalSyntheticOutline1.m(arrayList17, incorrectJpegMetadataQuirkM22);
                incorrectJpegMetadataQuirkM23.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, aeFpsRangeQuirk4));
                incorrectJpegMetadataQuirkM23.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk12, aeFpsRangeQuirk2));
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM24 = af$$ExternalSyntheticOutline1.m(arrayList17, incorrectJpegMetadataQuirkM23);
                incorrectJpegMetadataQuirkM24.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, aeFpsRangeQuirk4));
                incorrectJpegMetadataQuirkM24.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk12, aeFpsRangeQuirk2));
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM25 = af$$ExternalSyntheticOutline1.m(arrayList17, incorrectJpegMetadataQuirkM24);
                incorrectJpegMetadataQuirkM25.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, aeFpsRangeQuirk4));
                incorrectJpegMetadataQuirkM25.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2, aeFpsRangeQuirk4));
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM26 = af$$ExternalSyntheticOutline1.m(arrayList17, incorrectJpegMetadataQuirkM25);
                incorrectJpegMetadataQuirkM26.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, aeFpsRangeQuirk4));
                incorrectJpegMetadataQuirkM26.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk12, aeFpsRangeQuirk2));
                incorrectJpegMetadataQuirkM26.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk12, aeFpsRangeQuirk3));
                arrayList17.add(incorrectJpegMetadataQuirkM26);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk18 = new IncorrectJpegMetadataQuirk();
                incorrectJpegMetadataQuirk18.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, aeFpsRangeQuirk4));
                incorrectJpegMetadataQuirk18.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk12, aeFpsRangeQuirk2));
                incorrectJpegMetadataQuirk18.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk12, aeFpsRangeQuirk3));
                arrayList17.add(incorrectJpegMetadataQuirk18);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk19 = new IncorrectJpegMetadataQuirk();
                incorrectJpegMetadataQuirk19.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2, aeFpsRangeQuirk4));
                incorrectJpegMetadataQuirk19.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk3, imageCaptureFailedForSpecificCombinationQuirk2, aeFpsRangeQuirk4));
                incorrectJpegMetadataQuirk19.read(StringKt.serializer(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk, aeFpsRangeQuirk3));
                arrayList17.add(incorrectJpegMetadataQuirk19);
                arrayList16.addAll(arrayList17);
            }
            getThumbTintList getthumbtintlist = this.serializer;
            if (Build.VERSION.SDK_INT < 33 || (iArr = (int[]) getthumbtintlist.write(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length == 0) {
                z = false;
                break;
            }
            int length = iArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z = false;
                    break;
                } else {
                    if (iArr[i3] == 2) {
                        z = true;
                        break;
                    }
                    i3++;
                }
            }
            this.ComponentActivity = z;
            if (z && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList18 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                ArrayList arrayList19 = new ArrayList();
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk20 = new IncorrectJpegMetadataQuirk();
                SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk7 = SoftwareJpegEncodingPreferredQuirk.PRIV;
                ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk13 = ImageCaptureFailedForSpecificCombinationQuirk.S1440P_4_3;
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite33 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk7, imageCaptureFailedForSpecificCombinationQuirk13, incorrectJpegMetadataQuirk20, arrayList19, incorrectJpegMetadataQuirk20);
                SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk8 = SoftwareJpegEncodingPreferredQuirk.YUV;
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite34 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk8, imageCaptureFailedForSpecificCombinationQuirk13, incorrectJpegMetadataQuirkWrite33, arrayList19, incorrectJpegMetadataQuirkWrite33);
                incorrectJpegMetadataQuirkWrite34.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk7, imageCaptureFailedForSpecificCombinationQuirk13));
                SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk9 = SoftwareJpegEncodingPreferredQuirk.JPEG;
                ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk14 = ImageCaptureFailedForSpecificCombinationQuirk.MAXIMUM;
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite35 = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk9, imageCaptureFailedForSpecificCombinationQuirk14, incorrectJpegMetadataQuirkWrite34, arrayList19, incorrectJpegMetadataQuirkWrite34);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk8, imageCaptureFailedForSpecificCombinationQuirk13, incorrectJpegMetadataQuirkWrite35, softwareJpegEncodingPreferredQuirk9, imageCaptureFailedForSpecificCombinationQuirk14);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM27 = af$$ExternalSyntheticOutline1.m(arrayList19, incorrectJpegMetadataQuirkWrite35);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk7, imageCaptureFailedForSpecificCombinationQuirk13, incorrectJpegMetadataQuirkM27, softwareJpegEncodingPreferredQuirk8, imageCaptureFailedForSpecificCombinationQuirk14);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM28 = af$$ExternalSyntheticOutline1.m(arrayList19, incorrectJpegMetadataQuirkM27);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk8, imageCaptureFailedForSpecificCombinationQuirk13, incorrectJpegMetadataQuirkM28, softwareJpegEncodingPreferredQuirk8, imageCaptureFailedForSpecificCombinationQuirk14);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM29 = af$$ExternalSyntheticOutline1.m(arrayList19, incorrectJpegMetadataQuirkM28);
                ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk15 = ImageCaptureFailedForSpecificCombinationQuirk.PREVIEW;
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk7, imageCaptureFailedForSpecificCombinationQuirk15, incorrectJpegMetadataQuirkM29, softwareJpegEncodingPreferredQuirk7, imageCaptureFailedForSpecificCombinationQuirk13);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM30 = af$$ExternalSyntheticOutline1.m(arrayList19, incorrectJpegMetadataQuirkM29);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk8, imageCaptureFailedForSpecificCombinationQuirk15, incorrectJpegMetadataQuirkM30, softwareJpegEncodingPreferredQuirk7, imageCaptureFailedForSpecificCombinationQuirk13);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM31 = af$$ExternalSyntheticOutline1.m(arrayList19, incorrectJpegMetadataQuirkM30);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk7, imageCaptureFailedForSpecificCombinationQuirk15, incorrectJpegMetadataQuirkM31, softwareJpegEncodingPreferredQuirk8, imageCaptureFailedForSpecificCombinationQuirk13);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkM32 = af$$ExternalSyntheticOutline1.m(arrayList19, incorrectJpegMetadataQuirkM31);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(softwareJpegEncodingPreferredQuirk8, imageCaptureFailedForSpecificCombinationQuirk15, incorrectJpegMetadataQuirkM32, softwareJpegEncodingPreferredQuirk8, imageCaptureFailedForSpecificCombinationQuirk13);
                arrayList19.add(incorrectJpegMetadataQuirkM32);
                arrayList18.addAll(arrayList19);
            }
            write();
            this.MediaBrowserCompatMediaItem = onreadoutstarted;
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }

    public static int RemoteActionCompatParcelizer(Range range, Range range2) {
        UtilsKt.RemoteActionCompatParcelizer("Ranges must not intersect", (range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true);
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int read(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public final getTextMetricsParamsCompat IconCompatParcelizer(int i, boolean z, HashMap map, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Range range, boolean z7) {
        int i2;
        Range range2;
        Range range3;
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = 8;
                break;
            }
            if (((getNavigationIcon) it.next()).MediaBrowserCompatMediaItem == 10) {
                i2 = 10;
                break;
            }
        }
        String str = this.read;
        String str2 = "DEFAULT";
        if (i != 0 && z3) {
            if (i == 1) {
                str2 = "CONCURRENT_CAMERA";
            } else if (i == 2) {
                str2 = "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            throw new IllegalArgumentException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Camera device id is ", str, ". Ultra HDR is not currently supported in ", str2, " camera mode."));
        }
        if (i != 0 && i2 == 10) {
            if (i == 1) {
                str2 = "CONCURRENT_CAMERA";
            } else if (i == 2) {
                str2 = "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            throw new IllegalArgumentException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Camera device id is ", str, ". 10 bit dynamic range is not currently supported in ", str2, " camera mode."));
        }
        if (i != 0 && z5) {
            if (i == 1) {
                str2 = "CONCURRENT_CAMERA";
            } else if (i == 2) {
                str2 = "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            throw new IllegalArgumentException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Camera device id is ", str, ". Feature combination query is not currently supported in ", str2, " camera mode."));
        }
        if (z4 && z5) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("High-speed session is not supported with feature combination");
            return null;
        }
        if (z4 && !((Boolean) this.PlaybackStateCompat.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("High-speed session is not supported on this device.");
            return null;
        }
        if (z5) {
            range2 = range;
            if (range2 == SmallDisplaySizeQuirk.RemoteActionCompatParcelizer && z6) {
                range3 = AfRegionFlipHorizontallyQuirk.RemoteActionCompatParcelizer;
            }
            return new getTextMetricsParamsCompat(i, z, i2, z2, z3, z4, z5, z6, range3, z7);
        }
        range2 = range;
        range3 = range2;
        return new getTextMetricsParamsCompat(i, z, i2, z2, z3, z4, z5, z6, range3, z7);
    }

    public final TemporalNoiseQuirk serializer(int i) {
        StreamConfigurationMap streamConfigurationMap;
        ArrayList arrayList = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (!arrayList.contains(Integer.valueOf(i))) {
            serializer(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.MediaMetadataCompat, setController.write, i);
            serializer(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.MediaBrowserCompatMediaItem, setController.RemoteActionCompatParcelizer, i);
            write(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer, i, null);
            write(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.RemoteActionCompatParcelizer, i, AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer);
            write(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.serializer, i, AudioTimestampFramePositionIncorrectQuirk.write);
            HashMap map = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.MediaSessionCompatQueueItem;
            if (Build.VERSION.SDK_INT >= 31 && this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys && (streamConfigurationMap = (StreamConfigurationMap) this.serializer.write(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map.put(Integer.valueOf(i), serializer(streamConfigurationMap, i, true, null));
            }
            arrayList.add(Integer.valueOf(i));
        }
        return this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    }

    public final void serializer(HashMap map, Size size, int i) {
        if (this.PlaybackStateCompatCustomAction) {
            Size sizeSerializer = serializer((StreamConfigurationMap) ((ImageCapture$1) this.serializer.serializer().MediaSessionCompatQueueItem).MediaSessionCompatQueueItem, i, false, null);
            if (sizeSerializer != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeSerializer), new AudioEncoderIgnoresInputTimestampQuirk(false));
            }
            map.put(Integer.valueOf(i), size);
        }
    }

    public final Pair write(getTextMetricsParamsCompat gettextmetricsparamscompat, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i, HashMap map, HashMap map2) {
        CaptureFailedRetryQuirk captureFailedRetryQuirk;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LegacyCameraOutputConfigNullPointerQuirk legacyCameraOutputConfigNullPointerQuirk = (LegacyCameraOutputConfigNullPointerQuirk) it.next();
            arrayList4.add(legacyCameraOutputConfigNullPointerQuirk.MediaBrowserCompatMediaItem);
            map.put(Integer.valueOf(arrayList4.size() - 1), legacyCameraOutputConfigNullPointerQuirk);
        }
        int iMin = i;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Size size = (Size) list.get(i2);
            ImageUtilCodecFailedException imageUtilCodecFailedException = (ImageUtilCodecFailedException) arrayList2.get(((Integer) arrayList3.get(i2)).intValue());
            int iRemoteActionCompatParcelizer = imageUtilCodecFailedException.RemoteActionCompatParcelizer();
            AeFpsRangeQuirk aeFpsRangeQuirkRatingCompat = imageUtilCodecFailedException.RatingCompat();
            if (gettextmetricsparamscompat.MediaSessionCompatQueueItem) {
                captureFailedRetryQuirk = CaptureFailedRetryQuirk.FEATURE_COMBINATION_TABLE;
            } else {
                captureFailedRetryQuirk = CaptureFailedRetryQuirk.CAPTURE_SESSION_TABLES;
            }
            CaptureFailedRetryQuirk captureFailedRetryQuirk2 = captureFailedRetryQuirk;
            TemporalNoiseQuirk temporalNoiseQuirkSerializer = serializer(iRemoteActionCompatParcelizer);
            int i3 = gettextmetricsparamscompat.RemoteActionCompatParcelizer;
            AeFpsRangeQuirk aeFpsRangeQuirk = ImageCaptureRotationOptionQuirk.IconCompatParcelizer;
            arrayList4.add(StringKt.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, size, temporalNoiseQuirkSerializer, i3, captureFailedRetryQuirk2, aeFpsRangeQuirkRatingCompat));
            map2.put(Integer.valueOf(arrayList4.size() - 1), imageUtilCodecFailedException);
            iMin = Math.min(iMin, read(imageUtilCodecFailedException.RemoteActionCompatParcelizer(), size, gettextmetricsparamscompat.MediaMetadataCompat));
        }
        return new Pair(arrayList4, Integer.valueOf(iMin));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    public static Size serializer(StreamConfigurationMap streamConfigurationMap, int i, boolean z, Rational rational) {
        Size[] outputSizes;
        Size[] highResolutionOutputSizes;
        try {
            if (i == 34) {
                outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            } else {
                outputSizes = streamConfigurationMap.getOutputSizes(i);
            }
        } catch (Throwable unused) {
            outputSizes = null;
        }
        if (outputSizes == null || outputSizes.length == 0) {
            outputSizes = null;
        } else if (rational != null) {
            ArrayList arrayList = new ArrayList();
            for (Size size : outputSizes) {
                Rational rational2 = AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer;
                if (AudioTimestampFramePositionIncorrectQuirk.serializer(size, rational, setController.MediaMetadataCompat)) {
                    arrayList.add(size);
                }
            }
            if (arrayList.isEmpty()) {
                outputSizes = null;
            } else {
                outputSizes = (Size[]) arrayList.toArray(new Size[0]);
            }
        }
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        AudioEncoderIgnoresInputTimestampQuirk audioEncoderIgnoresInputTimestampQuirk = new AudioEncoderIgnoresInputTimestampQuirk(false);
        Size size2 = (Size) Collections.max(Arrays.asList(outputSizes), audioEncoderIgnoresInputTimestampQuirk);
        Size size3 = setController.MediaDescriptionCompat;
        if (z && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i)) != null && highResolutionOutputSizes.length > 0) {
            size3 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), audioEncoderIgnoresInputTimestampQuirk);
        }
        return (Size) Collections.max(Arrays.asList(size2, size3), audioEncoderIgnoresInputTimestampQuirk);
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0382  */
    /* JADX WARN: Code duplicated, block: B:145:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:152:0x03d4 A[LOOP:8: B:150:0x03ce->B:152:0x03d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x0462  */
    /* JADX WARN: Code duplicated, block: B:169:0x0487  */
    /* JADX WARN: Code duplicated, block: B:175:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:179:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:181:0x0509  */
    /* JADX WARN: Code duplicated, block: B:182:0x051d  */
    /* JADX WARN: Code duplicated, block: B:184:0x052b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0552  */
    /* JADX WARN: Code duplicated, block: B:190:0x0562  */
    /* JADX WARN: Code duplicated, block: B:194:0x056a  */
    /* JADX WARN: Code duplicated, block: B:197:0x0571 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:199:0x057c  */
    /* JADX WARN: Code duplicated, block: B:200:0x0582  */
    /* JADX WARN: Code duplicated, block: B:203:0x0586 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:216:0x05af  */
    /* JADX WARN: Code duplicated, block: B:228:0x0600  */
    /* JADX WARN: Code duplicated, block: B:231:0x061f  */
    /* JADX WARN: Code duplicated, block: B:233:0x062b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:234:0x062d  */
    /* JADX WARN: Code duplicated, block: B:235:0x0634  */
    /* JADX WARN: Code duplicated, block: B:240:0x064c  */
    /* JADX WARN: Code duplicated, block: B:242:0x0683 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:243:0x0685  */
    /* JADX WARN: Code duplicated, block: B:247:0x069b  */
    /* JADX WARN: Code duplicated, block: B:249:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:252:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:255:0x0700  */
    /* JADX WARN: Code duplicated, block: B:258:0x070f  */
    /* JADX WARN: Code duplicated, block: B:261:0x072f  */
    /* JADX WARN: Code duplicated, block: B:293:0x080f A[EDGE_INSN: B:345:0x080f->B:293:0x080f BREAK  A[LOOP:13: B:269:0x0752->B:274:0x076a]] */
    /* JADX WARN: Code duplicated, block: B:296:0x0818  */
    /* JADX WARN: Code duplicated, block: B:316:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x03c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:? A[LOOP:7: B:137:0x037c->B:328:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x0573 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x05c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x053e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x0731 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x03c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x03c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:? A[LOOP:15: B:143:0x03a8->B:354:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x021f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0233  */
    /* JADX WARN: Code duplicated, block: B:89:0x0260  */
    /* JADX WARN: Code duplicated, block: B:99:0x0280  */
    /* JADX WARN: Instruction removed from duplicated block: B:240:0x064c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:296:0x0818, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v65, types: [o.instance_delegatelambda0] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r39v0, types: [androidx.camera.camera2.internal.SupportedSurfaceCombination] */
    /* JADX WARN: Type inference failed for: r43v0, types: [java.lang.Object, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r45v0, types: [java.util.HashMap] */
    public final LargeJpegImageQuirk RemoteActionCompatParcelizer(getTextMetricsParamsCompat gettextmetricsparamscompat, ArrayList arrayList, Map map, ArrayList arrayList2, ArrayList arrayList3, HashMap map2) {
        ?? arrayList4;
        ?? r14;
        HashMap map3;
        HashMap map4;
        HashMap map5;
        HashMap map6;
        Iterator it;
        Iterator it2;
        boolean z;
        ImageUtilCodecFailedException imageUtilCodecFailedException;
        VideoCapture videoCaptureWrite;
        boolean z2;
        Iterator it3;
        int iMin;
        int i;
        HashMap map7;
        HashMap map8;
        int i2;
        int i3;
        HashMap map9;
        HashMap map10;
        List list;
        Range range;
        Iterator it4;
        int i4;
        int i5;
        List list2;
        List list3;
        int i6;
        int i7;
        int i8;
        Range range2;
        List list4;
        HashMap map11;
        HashMap map12;
        int i9;
        List list5;
        List list6;
        isEmojiCompatEnabled isemojicompatenabled;
        List list7;
        int i10;
        int i11;
        Range rangeIconCompatParcelizer;
        boolean zEquals;
        boolean z3;
        Iterator it5;
        List list8;
        HashMap map13;
        HashMap map14;
        HashMap map15;
        HashMap map16;
        ImageUtilCodecFailedException imageUtilCodecFailedException2;
        RepeatingStreamConstraintForVideoRecordingQuirk repeatingStreamConstraintForVideoRecordingQuirk;
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer;
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk;
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk2;
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk3;
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk4;
        Range[] rangeArrSerializer;
        Range rangeIconCompatParcelizer2;
        List list9;
        HashMap map17;
        HashMap map18;
        int i12;
        int i13;
        List list10;
        int iIntValue;
        int i14;
        int i15;
        HashMap map19;
        int i16;
        HashMap map20;
        HashMap map21;
        getNavigationIcon getnavigationicon;
        HashMap map22;
        int i17;
        HashMap map23;
        VideoCapture videoCapture;
        InitializationException initializationException;
        Rational rational;
        setTrackTintList settracktintlist;
        SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk;
        Size sizeIconCompatParcelizer;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        CaptureFailedRetryQuirk captureFailedRetryQuirk;
        Map map24 = map;
        Objects.toString(gettextmetricsparamscompat);
        setInflatedId.IconCompatParcelizer(3, "SupportedSurfaceCombination");
        boolean z4 = false;
        if (!gettextmetricsparamscompat.MediaSessionCompatQueueItem) {
            ArrayList arrayList8 = new ArrayList();
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList8.add(((LegacyCameraOutputConfigNullPointerQuirk) it6.next()).MediaBrowserCompatMediaItem);
            }
            AudioEncoderIgnoresInputTimestampQuirk audioEncoderIgnoresInputTimestampQuirk = new AudioEncoderIgnoresInputTimestampQuirk(false);
            for (ImageUtilCodecFailedException imageUtilCodecFailedException3 : map.keySet()) {
                List list11 = (List) map24.get(imageUtilCodecFailedException3);
                UtilsKt.IconCompatParcelizer("No available output size is found for " + imageUtilCodecFailedException3 + ".", (list11 == null || list11.isEmpty()) ? z4 : true);
                Size size = (Size) Collections.min(list11, audioEncoderIgnoresInputTimestampQuirk);
                int iRemoteActionCompatParcelizer = imageUtilCodecFailedException3.RemoteActionCompatParcelizer();
                TemporalNoiseQuirk temporalNoiseQuirkSerializer = serializer(iRemoteActionCompatParcelizer);
                int i18 = gettextmetricsparamscompat.RemoteActionCompatParcelizer;
                CaptureFailedRetryQuirk captureFailedRetryQuirk2 = CaptureFailedRetryQuirk.CAPTURE_SESSION_TABLES;
                AeFpsRangeQuirk aeFpsRangeQuirkRatingCompat = imageUtilCodecFailedException3.RatingCompat();
                AeFpsRangeQuirk aeFpsRangeQuirk = ImageCaptureRotationOptionQuirk.IconCompatParcelizer;
                arrayList8.add(StringKt.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, size, temporalNoiseQuirkSerializer, i18, captureFailedRetryQuirk2, aeFpsRangeQuirkRatingCompat));
                z4 = false;
            }
            Map map25 = Collections.EMPTY_MAP;
            List list12 = Collections.EMPTY_LIST;
            if (!read(gettextmetricsparamscompat, arrayList8, map25, list12, list12)) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("No supported surface combination is found for camera device - Id : ", this.read, ".  May be attempting to bind too many use cases. Existing surfaces: ", arrayList, ". New configs: ", arrayList2, ". GroupableFeature settings: ", gettextmetricsparamscompat);
                return null;
            }
        }
        HashMap map26 = new HashMap();
        Iterator it7 = map.keySet().iterator();
        Map map27 = map24;
        while (it7.hasNext()) {
            ImageUtilCodecFailedException imageUtilCodecFailedException4 = (ImageUtilCodecFailedException) it7.next();
            ArrayList arrayList9 = new ArrayList();
            HashMap map28 = new HashMap();
            List list13 = (List) map27.get(imageUtilCodecFailedException4);
            Objects.requireNonNull(list13);
            Iterator it8 = list13.iterator();
            while (it8.hasNext()) {
                Size size2 = (Size) it8.next();
                int iRemoteActionCompatParcelizer2 = imageUtilCodecFailedException4.RemoteActionCompatParcelizer();
                AeFpsRangeQuirk aeFpsRangeQuirkRatingCompat2 = imageUtilCodecFailedException4.RatingCompat();
                Range range3 = gettextmetricsparamscompat.serializer;
                TemporalNoiseQuirk temporalNoiseQuirkSerializer2 = serializer(iRemoteActionCompatParcelizer2);
                Iterator it9 = it7;
                int i19 = gettextmetricsparamscompat.RemoteActionCompatParcelizer;
                Iterator it10 = it8;
                if (gettextmetricsparamscompat.MediaSessionCompatQueueItem) {
                    captureFailedRetryQuirk = CaptureFailedRetryQuirk.FEATURE_COMBINATION_TABLE;
                } else {
                    captureFailedRetryQuirk = CaptureFailedRetryQuirk.CAPTURE_SESSION_TABLES;
                }
                CaptureFailedRetryQuirk captureFailedRetryQuirk3 = captureFailedRetryQuirk;
                AeFpsRangeQuirk aeFpsRangeQuirk2 = ImageCaptureRotationOptionQuirk.IconCompatParcelizer;
                ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk = StringKt.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer2, size2, temporalNoiseQuirkSerializer2, i19, captureFailedRetryQuirk3, aeFpsRangeQuirkRatingCompat2).read;
                Range range4 = SmallDisplaySizeQuirk.RemoteActionCompatParcelizer;
                int i20 = range4.equals(range3) ? Integer.MAX_VALUE : read(iRemoteActionCompatParcelizer2, size2, gettextmetricsparamscompat.MediaMetadataCompat);
                if (!gettextmetricsparamscompat.IconCompatParcelizer || (imageCaptureFailedForSpecificCombinationQuirk != ImageCaptureFailedForSpecificCombinationQuirk.NOT_SUPPORT && (range4.equals(range3) || i20 >= ((Integer) range3.getUpper()).intValue()))) {
                    Set hashSet = (Set) map28.get(imageCaptureFailedForSpecificCombinationQuirk);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map28.put(imageCaptureFailedForSpecificCombinationQuirk, hashSet);
                    }
                    if (!hashSet.contains(Integer.valueOf(i20))) {
                        arrayList9.add(size2);
                        hashSet.add(Integer.valueOf(i20));
                    }
                }
                it7 = it9;
                it8 = it10;
            }
            map26.put(imageUtilCodecFailedException4, arrayList9);
            map27 = map;
        }
        ArrayList arrayList10 = new ArrayList();
        Iterator it11 = arrayList3.iterator();
        while (it11.hasNext()) {
            ImageUtilCodecFailedException imageUtilCodecFailedException5 = (ImageUtilCodecFailedException) arrayList2.get(((Integer) it11.next()).intValue());
            List<Size> list14 = (List) map26.get(imageUtilCodecFailedException5);
            if (list14 == null) {
                list14 = Collections.EMPTY_LIST;
            }
            int iRemoteActionCompatParcelizer3 = imageUtilCodecFailedException5.RemoteActionCompatParcelizer();
            Transition$1 transition$1 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            getThumbTintList getthumbtintlist = this.serializer;
            transition$1.getClass();
            int i21 = (((Nexus4AndroidLTargetAspectRatioQuirk) setThumbTintList.RemoteActionCompatParcelizer.read(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) zzgh.read(getthumbtintlist).read(AspectRatioLegacyApi21Quirk.class)) == null) ? 3 : 2;
            if (i21 == 2) {
                Size size3 = (Size) serializer(Fields.RotationX).IconCompatParcelizer.get(Integer.valueOf(Fields.RotationX));
                if (size3 != null) {
                    rational = new Rational(size3.getWidth(), size3.getHeight());
                }
                if (rational != null) {
                    arrayList6 = new ArrayList();
                    arrayList7 = new ArrayList();
                    for (Size size4 : list14) {
                        Rational rational2 = AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer;
                        if (AudioTimestampFramePositionIncorrectQuirk.serializer(size4, rational, setController.MediaMetadataCompat)) {
                            arrayList6.add(size4);
                        } else {
                            arrayList7.add(size4);
                        }
                    }
                    arrayList7.addAll(0, arrayList6);
                    list14 = arrayList7;
                }
                settracktintlist = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                softwareJpegEncodingPreferredQuirk = (SoftwareJpegEncodingPreferredQuirk) ImageCaptureRotationOptionQuirk.write.get(Integer.valueOf(iRemoteActionCompatParcelizer3));
                if (softwareJpegEncodingPreferredQuirk == null) {
                    softwareJpegEncodingPreferredQuirk = SoftwareJpegEncodingPreferredQuirk.PRIV;
                }
                if (settracktintlist.RemoteActionCompatParcelizer != null && (sizeIconCompatParcelizer = ExtraCroppingQuirk.IconCompatParcelizer(softwareJpegEncodingPreferredQuirk)) != null) {
                    arrayList5 = new ArrayList();
                    arrayList5.add(sizeIconCompatParcelizer);
                    for (Size size5 : list14) {
                        if (!size5.equals(sizeIconCompatParcelizer)) {
                            arrayList5.add(size5);
                        }
                    }
                    list14 = arrayList5;
                }
                arrayList10.add(list14);
            } else if (i21 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) c8$$ExternalSyntheticOutline0.m(i21, "Undefined targetAspectRatio: "));
                return null;
            }
            rational = null;
            if (rational != null) {
                arrayList6 = new ArrayList();
                arrayList7 = new ArrayList();
                while (r4.hasNext()) {
                    Rational rational3 = AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer;
                    if (AudioTimestampFramePositionIncorrectQuirk.serializer(size4, rational, setController.MediaMetadataCompat)) {
                        arrayList6.add(size4);
                    } else {
                        arrayList7.add(size4);
                    }
                }
                arrayList7.addAll(0, arrayList6);
                list14 = arrayList7;
            }
            settracktintlist = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            softwareJpegEncodingPreferredQuirk = (SoftwareJpegEncodingPreferredQuirk) ImageCaptureRotationOptionQuirk.write.get(Integer.valueOf(iRemoteActionCompatParcelizer3));
            if (softwareJpegEncodingPreferredQuirk == null) {
                softwareJpegEncodingPreferredQuirk = SoftwareJpegEncodingPreferredQuirk.PRIV;
            }
            if (settracktintlist.RemoteActionCompatParcelizer != null) {
                arrayList5 = new ArrayList();
                arrayList5.add(sizeIconCompatParcelizer);
                while (r4.hasNext()) {
                    if (!size5.equals(sizeIconCompatParcelizer)) {
                        arrayList5.add(size5);
                    }
                }
                list14 = arrayList5;
            }
            arrayList10.add(list14);
        }
        if (gettextmetricsparamscompat.MediaMetadataCompat) {
            this.PlaybackStateCompat.getClass();
            if (arrayList10.isEmpty()) {
                arrayList4 = instance_delegatelambda0.write;
            } else {
                List<Size> listIconCompatParcelizer = setWeightSum.IconCompatParcelizer(arrayList10);
                ArrayList arrayList11 = new ArrayList(accessgetInstancedelegatecp.write(listIconCompatParcelizer, 10));
                for (Size size6 : listIconCompatParcelizer) {
                    int size7 = arrayList10.size();
                    ArrayList arrayList12 = new ArrayList(size7);
                    for (int i22 = 0; i22 < size7; i22++) {
                        arrayList12.add(size6);
                    }
                    arrayList11.add(arrayList12);
                }
                r14 = arrayList11;
            }
            map3 = new HashMap();
            map4 = new HashMap();
            map5 = new HashMap();
            map6 = new HashMap();
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk5 = getTargetCheckedState.write;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    LegacyCameraOutputConfigNullPointerQuirk legacyCameraOutputConfigNullPointerQuirk = (LegacyCameraOutputConfigNullPointerQuirk) it.next();
                    List list15 = legacyCameraOutputConfigNullPointerQuirk.read;
                    list15.getClass();
                    videoCapture = (VideoCapture) list15.get(0);
                    initializationException = legacyCameraOutputConfigNullPointerQuirk.write;
                    initializationException.getClass();
                    videoCapture.getClass();
                    if (getTargetCheckedState.write(initializationException, videoCapture)) {
                    }
                } else {
                    it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            z = false;
                            break;
                        }
                        imageUtilCodecFailedException = (ImageUtilCodecFailedException) it2.next();
                        videoCaptureWrite = imageUtilCodecFailedException.write();
                        videoCaptureWrite.getClass();
                        if (getTargetCheckedState.write(imageUtilCodecFailedException, videoCaptureWrite)) {
                        }
                    }
                }
                z = true;
                break;
            }
            z2 = gettextmetricsparamscompat.MediaMetadataCompat;
            iMin = Integer.MAX_VALUE;
            for (it3 = arrayList.iterator(); it3.hasNext(); it3 = it3) {
                LegacyCameraOutputConfigNullPointerQuirk legacyCameraOutputConfigNullPointerQuirk2 = (LegacyCameraOutputConfigNullPointerQuirk) it3.next();
                iMin = Math.min(iMin, read(legacyCameraOutputConfigNullPointerQuirk2.serializer, legacyCameraOutputConfigNullPointerQuirk2.MediaMetadataCompat, z2));
            }
            if (this.ResultReceiver || z) {
                i = iMin;
                map7 = map4;
                map8 = map3;
                i2 = Integer.MAX_VALUE;
                i3 = 0;
                map9 = map6;
                map10 = map5;
                list = null;
            } else {
                Iterator it12 = r14.iterator();
                List list16 = null;
                while (true) {
                    if (!it12.hasNext()) {
                        i = iMin;
                        map7 = map4;
                        map8 = map3;
                        i2 = Integer.MAX_VALUE;
                        i3 = 0;
                        map9 = map6;
                        map10 = map5;
                        break;
                    }
                    i = iMin;
                    i3 = 0;
                    HashMap map29 = map6;
                    HashMap map30 = map5;
                    map8 = map3;
                    map7 = map4;
                    i2 = Integer.MAX_VALUE;
                    map9 = map29;
                    map10 = map30;
                    list16 = read(gettextmetricsparamscompat, (List) write(gettextmetricsparamscompat, arrayList, (List) it12.next(), arrayList2, arrayList3, i, map30, map29).first, map10, map9);
                    if (list16 != null) {
                        break;
                    }
                    map10.clear();
                    map9.clear();
                    iMin = i;
                    map6 = map9;
                    map5 = map10;
                    map4 = map7;
                    map3 = map8;
                }
                Objects.toString(list16);
                setInflatedId.IconCompatParcelizer(3, "SupportedSurfaceCombination");
                list = list16;
            }
            range = gettextmetricsparamscompat.serializer;
            it4 = r14.iterator();
            i4 = i2;
            i5 = i4;
            list2 = null;
            list3 = null;
            i6 = i3;
            i7 = i6;
            while (true) {
                if (it4.hasNext()) {
                    i8 = i4;
                    range2 = range;
                    list4 = list;
                    map11 = map9;
                    map12 = map10;
                    i9 = i5;
                    list5 = list2;
                    list6 = list3;
                    break;
                }
                list9 = (List) it4.next();
                HashMap map31 = new HashMap();
                map17 = new HashMap();
                map18 = map31;
                Iterator it13 = it4;
                i12 = i4;
                i13 = i5;
                range2 = range;
                list4 = list;
                map11 = map9;
                map12 = map10;
                Pair pairWrite = write(gettextmetricsparamscompat, arrayList, list9, arrayList2, arrayList3, i, map18, map17);
                list10 = (List) pairWrite.first;
                iIntValue = ((Integer) pairWrite.second).intValue();
                i14 = i;
                if (!SmallDisplaySizeQuirk.RemoteActionCompatParcelizer.equals(range2) || iIntValue >= i14 || iIntValue >= ((Integer) range2.getUpper()).intValue()) {
                    i15 = 1;
                } else {
                    i15 = i3;
                }
                map19 = new HashMap();
                i16 = i3;
                while (i16 < list10.size()) {
                    ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (ImageCaptureRotationOptionQuirk) list10.get(i16);
                    getnavigationicon = getNavigationIcon.MediaMetadataCompat;
                    map22 = map18;
                    if (map22.containsKey(Integer.valueOf(i16))) {
                        LegacyCameraOutputConfigNullPointerQuirk legacyCameraOutputConfigNullPointerQuirk3 = (LegacyCameraOutputConfigNullPointerQuirk) map22.get(Integer.valueOf(i16));
                        Objects.requireNonNull(legacyCameraOutputConfigNullPointerQuirk3);
                        getnavigationicon = legacyCameraOutputConfigNullPointerQuirk3.RemoteActionCompatParcelizer;
                        i17 = i14;
                        map23 = map17;
                    } else {
                        i17 = i14;
                        map23 = map17;
                        if (map23.containsKey(Integer.valueOf(i16))) {
                            ImageUtilCodecFailedException imageUtilCodecFailedException6 = (ImageUtilCodecFailedException) map23.get(Integer.valueOf(i16));
                            Objects.requireNonNull(imageUtilCodecFailedException6);
                            getnavigationicon = (getNavigationIcon) map2.get(imageUtilCodecFailedException6);
                        }
                    }
                    map19.put(imageCaptureRotationOptionQuirk, getnavigationicon);
                    i16++;
                    map18 = map22;
                    map17 = map23;
                    i14 = i17;
                }
                i = i14;
                HashMap map32 = map17;
                map20 = map18;
                if (i6 == 0) {
                    map21 = map20;
                    if (read(gettextmetricsparamscompat, list10, map19, arrayList2, arrayList3)) {
                        if (i12 == Integer.MAX_VALUE && i12 >= iIntValue) {
                            i4 = i12;
                        } else {
                            i4 = iIntValue;
                            list2 = list9;
                        }
                        if (i15 == 0) {
                            if (i7 != 0) {
                                i8 = iIntValue;
                                list6 = list3;
                                list5 = list9;
                                i9 = i13;
                                break;
                            }
                            i4 = iIntValue;
                            i6 = 1;
                            list2 = list9;
                        }
                    }
                    if (list4 == null && i7 == 0 && read(gettextmetricsparamscompat, list10, map21, map32) != null) {
                        if (i13 != Integer.MAX_VALUE && i13 >= iIntValue) {
                            i5 = i13;
                        } else {
                            i5 = iIntValue;
                            list3 = list9;
                        }
                        if (i15 == 0) {
                            continue;
                        } else {
                            if (i6 != 0) {
                                i8 = i4;
                                i9 = iIntValue;
                                list5 = list2;
                                list6 = list9;
                                break;
                            }
                            i5 = iIntValue;
                            i7 = 1;
                            list3 = list9;
                        }
                    } else {
                        i5 = i13;
                    }
                    range = range2;
                    list = list4;
                    it4 = it13;
                    map9 = map11;
                    map10 = map12;
                } else {
                    map21 = map20;
                }
                i4 = i12;
                if (list4 == null) {
                    i5 = i13;
                } else {
                    i5 = i13;
                }
                range = range2;
                list = list4;
                it4 = it13;
                map9 = map11;
                map10 = map12;
            }
            if (!gettextmetricsparamscompat.IconCompatParcelizer && !SmallDisplaySizeQuirk.RemoteActionCompatParcelizer.equals(range2) && (i8 == Integer.MAX_VALUE || i8 < ((Integer) range2.getUpper()).intValue())) {
                isemojicompatenabled = new isEmojiCompatEnabled(null, null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            } else {
                isemojicompatenabled = new isEmojiCompatEnabled(list5, list6, i8, i9, Integer.MAX_VALUE);
            }
            isemojicompatenabled.toString();
            setInflatedId.IconCompatParcelizer(3, "SupportedSurfaceCombination");
            list7 = isemojicompatenabled.serializer;
            i10 = isemojicompatenabled.IconCompatParcelizer;
            List list17 = isemojicompatenabled.read;
            int i23 = isemojicompatenabled.RemoteActionCompatParcelizer;
            i11 = isemojicompatenabled.write;
            if (list7 != null) {
                rangeIconCompatParcelizer = SmallDisplaySizeQuirk.RemoteActionCompatParcelizer;
                zEquals = rangeIconCompatParcelizer.equals(gettextmetricsparamscompat.serializer);
                z3 = gettextmetricsparamscompat.MediaMetadataCompat;
                if (!zEquals) {
                    if (z3) {
                        rangeArrSerializer = this.PlaybackStateCompat.serializer(list7);
                    } else {
                        rangeArrSerializer = (Range[]) this.serializer.write(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                    }
                    rangeIconCompatParcelizer2 = IconCompatParcelizer(gettextmetricsparamscompat.serializer, i10, rangeArrSerializer);
                    if (!gettextmetricsparamscompat.IconCompatParcelizer || gettextmetricsparamscompat.MediaBrowserCompatMediaItem) {
                        UtilsKt.IconCompatParcelizer("Target FPS range " + gettextmetricsparamscompat.serializer + " is not supported. Max FPS supported by the calculated best combination: " + i10 + ". Calculated best FPS range for device: " + rangeIconCompatParcelizer2 + ". Device supported FPS ranges: " + Arrays.toString(rangeArrSerializer), rangeIconCompatParcelizer2.equals(gettextmetricsparamscompat.serializer));
                    }
                    rangeIconCompatParcelizer = rangeIconCompatParcelizer2;
                } else if (z3) {
                    rangeIconCompatParcelizer = IconCompatParcelizer(setWeightSum.read, i10, this.PlaybackStateCompat.serializer(list7));
                }
                it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    imageUtilCodecFailedException2 = (ImageUtilCodecFailedException) it5.next();
                    List list18 = list4;
                    repeatingStreamConstraintForVideoRecordingQuirk = SmallDisplaySizeQuirk.read((Size) list7.get(arrayList3.indexOf(Integer.valueOf(arrayList2.indexOf(imageUtilCodecFailedException2)))));
                    repeatingStreamConstraintForVideoRecordingQuirk.MediaMetadataCompat = Integer.valueOf(gettextmetricsparamscompat.MediaMetadataCompat ? 1 : 0);
                    getNavigationIcon getnavigationicon2 = (getNavigationIcon) map2.get(imageUtilCodecFailedException2);
                    getnavigationicon2.getClass();
                    repeatingStreamConstraintForVideoRecordingQuirk.write = getnavigationicon2;
                    imageUtilCodecFailedException2.getClass();
                    cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
                    Iterator it14 = it5;
                    jpegCaptureDownsizingQuirk = access701.IconCompatParcelizer;
                    if (imageUtilCodecFailedException2.read(jpegCaptureDownsizingQuirk)) {
                        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(jpegCaptureDownsizingQuirk, imageUtilCodecFailedException2.write(jpegCaptureDownsizingQuirk));
                    }
                    jpegCaptureDownsizingQuirk2 = ImageUtilCodecFailedException.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                    if (imageUtilCodecFailedException2.read(jpegCaptureDownsizingQuirk2)) {
                        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(jpegCaptureDownsizingQuirk2, imageUtilCodecFailedException2.write(jpegCaptureDownsizingQuirk2));
                    }
                    jpegCaptureDownsizingQuirk3 = UseCase.RemoteActionCompatParcelizer;
                    if (imageUtilCodecFailedException2.read(jpegCaptureDownsizingQuirk3)) {
                        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(jpegCaptureDownsizingQuirk3, imageUtilCodecFailedException2.write(jpegCaptureDownsizingQuirk3));
                    }
                    jpegCaptureDownsizingQuirk4 = getFeatureGroupUseCaseType.b_;
                    if (imageUtilCodecFailedException2.read(jpegCaptureDownsizingQuirk4)) {
                        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(jpegCaptureDownsizingQuirk4, imageUtilCodecFailedException2.write(jpegCaptureDownsizingQuirk4));
                    }
                    repeatingStreamConstraintForVideoRecordingQuirk.IconCompatParcelizer = new access701(23, cameraProviderInitRetryPolicyRemoteActionCompatParcelizer);
                    repeatingStreamConstraintForVideoRecordingQuirk.MediaSessionCompatQueueItem = Boolean.valueOf(gettextmetricsparamscompat.write);
                    if (!SmallDisplaySizeQuirk.RemoteActionCompatParcelizer.equals(rangeIconCompatParcelizer)) {
                        repeatingStreamConstraintForVideoRecordingQuirk.RemoteActionCompatParcelizer = rangeIconCompatParcelizer;
                    }
                    map7.put(imageUtilCodecFailedException2, repeatingStreamConstraintForVideoRecordingQuirk.read());
                    it5 = it14;
                    list4 = list18;
                }
                list8 = list4;
                map13 = map7;
                if (list8 == null && i10 == i23 && list7.size() == list17.size()) {
                    int i24 = i3;
                    while (true) {
                        if (i24 < list7.size()) {
                            if (!((Size) list7.get(i24)).equals(list17.get(i24))) {
                                break;
                            }
                            i24++;
                        } else {
                            map14 = map13;
                            map15 = map8;
                            if (!getTargetCheckedState.write(this.serializer, arrayList, map14, map15)) {
                                int size8 = list8.size();
                                int i25 = i3;
                                while (i25 < size8) {
                                    long value = ((ImageCaptureRotationOptionQuirk) list8.get(i25)).MediaDescriptionCompat.getValue();
                                    HashMap map33 = map12;
                                    if (map33.containsKey(Integer.valueOf(i25))) {
                                        LegacyCameraOutputConfigNullPointerQuirk legacyCameraOutputConfigNullPointerQuirk4 = (LegacyCameraOutputConfigNullPointerQuirk) map33.get(Integer.valueOf(i25));
                                        legacyCameraOutputConfigNullPointerQuirk4.getClass();
                                        InitializationException initializationException2 = legacyCameraOutputConfigNullPointerQuirk4.write;
                                        initializationException2.getClass();
                                        access701 access701Var = getTargetCheckedState.read(initializationException2, Long.valueOf(value));
                                        if (access701Var != null) {
                                            map15.put(legacyCameraOutputConfigNullPointerQuirk4, legacyCameraOutputConfigNullPointerQuirk4.serializer(access701Var));
                                        }
                                        map16 = map11;
                                    } else {
                                        map16 = map11;
                                        if (map16.containsKey(Integer.valueOf(i25))) {
                                            Object obj = map16.get(Integer.valueOf(i25));
                                            obj.getClass();
                                            ImageUtilCodecFailedException imageUtilCodecFailedException7 = (ImageUtilCodecFailedException) obj;
                                            SmallDisplaySizeQuirk smallDisplaySizeQuirk = (SmallDisplaySizeQuirk) map14.get(imageUtilCodecFailedException7);
                                            smallDisplaySizeQuirk.getClass();
                                            InitializationException initializationException3 = smallDisplaySizeQuirk.serializer;
                                            initializationException3.getClass();
                                            access701 access701Var2 = getTargetCheckedState.read(initializationException3, Long.valueOf(value));
                                            if (access701Var2 != null) {
                                                RepeatingStreamConstraintForVideoRecordingQuirk repeatingStreamConstraintForVideoRecordingQuirk2 = smallDisplaySizeQuirk.read();
                                                repeatingStreamConstraintForVideoRecordingQuirk2.IconCompatParcelizer = access701Var2;
                                                map14.put(imageUtilCodecFailedException7, repeatingStreamConstraintForVideoRecordingQuirk2.read());
                                            }
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "SurfaceConfig does not map to any use case");
                                            return null;
                                        }
                                    }
                                    i25++;
                                    map12 = map33;
                                    map11 = map16;
                                }
                            }
                        }
                    }
                    map14 = map13;
                    map15 = map8;
                } else {
                    map14 = map13;
                    map15 = map8;
                }
                return new LargeJpegImageQuirk(map14, map15, i11);
            }
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.read + " and Hardware level: " + this.MediaSessionCompatResultReceiverWrapper + ". May be the specified resolution is too large and not supported. Existing surfaces: " + arrayList + " New configs: " + ((Object) arrayList2));
        }
        Iterator it15 = arrayList10.iterator();
        int size9 = 1;
        while (it15.hasNext()) {
            size9 *= ((List) it15.next()).size();
        }
        if (size9 != 0) {
            arrayList4 = new ArrayList();
            for (int i26 = 0; i26 < size9; i26++) {
                arrayList4.add(new ArrayList());
            }
            int size10 = size9 / ((List) arrayList10.get(0)).size();
            int i27 = size9;
            for (int i28 = 0; i28 < arrayList10.size(); i28++) {
                List list19 = (List) arrayList10.get(i28);
                for (int i29 = 0; i29 < size9; i29++) {
                    ((List) arrayList4.get(i29)).add((Size) list19.get((i29 % i27) / size10));
                }
                if (i28 < arrayList10.size() - 1) {
                    i27 = size10;
                    size10 /= ((List) arrayList10.get(i28 + 1)).size();
                }
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed to find supported resolutions.");
            return null;
        }
        r14 = arrayList4;
        map3 = new HashMap();
        map4 = new HashMap();
        map5 = new HashMap();
        map6 = new HashMap();
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk6 = getTargetCheckedState.write;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                LegacyCameraOutputConfigNullPointerQuirk legacyCameraOutputConfigNullPointerQuirk5 = (LegacyCameraOutputConfigNullPointerQuirk) it.next();
                List list110 = legacyCameraOutputConfigNullPointerQuirk5.read;
                list110.getClass();
                videoCapture = (VideoCapture) list110.get(0);
                initializationException = legacyCameraOutputConfigNullPointerQuirk5.write;
                initializationException.getClass();
                videoCapture.getClass();
                if (getTargetCheckedState.write(initializationException, videoCapture)) {
                }
            } else {
                it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        z = false;
                        break;
                    }
                    imageUtilCodecFailedException = (ImageUtilCodecFailedException) it2.next();
                    videoCaptureWrite = imageUtilCodecFailedException.write();
                    videoCaptureWrite.getClass();
                    if (getTargetCheckedState.write(imageUtilCodecFailedException, videoCaptureWrite)) {
                    }
                }
            }
            z = true;
            break;
        }
        z2 = gettextmetricsparamscompat.MediaMetadataCompat;
        iMin = Integer.MAX_VALUE;
        while (it3.hasNext()) {
            LegacyCameraOutputConfigNullPointerQuirk legacyCameraOutputConfigNullPointerQuirk6 = (LegacyCameraOutputConfigNullPointerQuirk) it3.next();
            iMin = Math.min(iMin, read(legacyCameraOutputConfigNullPointerQuirk6.serializer, legacyCameraOutputConfigNullPointerQuirk6.MediaMetadataCompat, z2));
        }
        if (this.ResultReceiver) {
            i = iMin;
            map7 = map4;
            map8 = map3;
            i2 = Integer.MAX_VALUE;
            i3 = 0;
            map9 = map6;
            map10 = map5;
            list = null;
        } else {
            i = iMin;
            map7 = map4;
            map8 = map3;
            i2 = Integer.MAX_VALUE;
            i3 = 0;
            map9 = map6;
            map10 = map5;
            list = null;
        }
        range = gettextmetricsparamscompat.serializer;
        it4 = r14.iterator();
        i4 = i2;
        i5 = i4;
        list2 = null;
        list3 = null;
        i6 = i3;
        i7 = i6;
        while (true) {
            if (it4.hasNext()) {
                i8 = i4;
                range2 = range;
                list4 = list;
                map11 = map9;
                map12 = map10;
                i9 = i5;
                list5 = list2;
                list6 = list3;
                break;
            }
            list9 = (List) it4.next();
            HashMap map34 = new HashMap();
            map17 = new HashMap();
            map18 = map34;
            Iterator it16 = it4;
            i12 = i4;
            i13 = i5;
            range2 = range;
            list4 = list;
            map11 = map9;
            map12 = map10;
            Pair pairWrite2 = write(gettextmetricsparamscompat, arrayList, list9, arrayList2, arrayList3, i, map18, map17);
            list10 = (List) pairWrite2.first;
            iIntValue = ((Integer) pairWrite2.second).intValue();
            i14 = i;
            if (SmallDisplaySizeQuirk.RemoteActionCompatParcelizer.equals(range2)) {
                i15 = 1;
            } else {
                i15 = 1;
            }
            map19 = new HashMap();
            i16 = i3;
            while (i16 < list10.size()) {
                ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk2 = (ImageCaptureRotationOptionQuirk) list10.get(i16);
                getnavigationicon = getNavigationIcon.MediaMetadataCompat;
                map22 = map18;
                if (map22.containsKey(Integer.valueOf(i16))) {
                    LegacyCameraOutputConfigNullPointerQuirk legacyCameraOutputConfigNullPointerQuirk7 = (LegacyCameraOutputConfigNullPointerQuirk) map22.get(Integer.valueOf(i16));
                    Objects.requireNonNull(legacyCameraOutputConfigNullPointerQuirk7);
                    getnavigationicon = legacyCameraOutputConfigNullPointerQuirk7.RemoteActionCompatParcelizer;
                    i17 = i14;
                    map23 = map17;
                } else {
                    i17 = i14;
                    map23 = map17;
                    if (map23.containsKey(Integer.valueOf(i16))) {
                        ImageUtilCodecFailedException imageUtilCodecFailedException8 = (ImageUtilCodecFailedException) map23.get(Integer.valueOf(i16));
                        Objects.requireNonNull(imageUtilCodecFailedException8);
                        getnavigationicon = (getNavigationIcon) map2.get(imageUtilCodecFailedException8);
                    }
                }
                map19.put(imageCaptureRotationOptionQuirk2, getnavigationicon);
                i16++;
                map18 = map22;
                map17 = map23;
                i14 = i17;
            }
            i = i14;
            HashMap map35 = map17;
            map20 = map18;
            if (i6 == 0) {
                map21 = map20;
                if (read(gettextmetricsparamscompat, list10, map19, arrayList2, arrayList3)) {
                    if (i12 == Integer.MAX_VALUE) {
                        i4 = iIntValue;
                        list2 = list9;
                    } else {
                        i4 = i12;
                    }
                    if (i15 == 0) {
                        if (i7 != 0) {
                            i8 = iIntValue;
                            list6 = list3;
                            list5 = list9;
                            i9 = i13;
                            break;
                        }
                        i4 = iIntValue;
                        i6 = 1;
                        list2 = list9;
                    }
                }
                if (list4 == null) {
                    i5 = i13;
                } else {
                    i5 = i13;
                }
                range = range2;
                list = list4;
                it4 = it16;
                map9 = map11;
                map10 = map12;
            } else {
                map21 = map20;
            }
            i4 = i12;
            if (list4 == null) {
                i5 = i13;
            } else {
                i5 = i13;
            }
            range = range2;
            list = list4;
            it4 = it16;
            map9 = map11;
            map10 = map12;
        }
        if (!gettextmetricsparamscompat.IconCompatParcelizer) {
            isemojicompatenabled = new isEmojiCompatEnabled(list5, list6, i8, i9, Integer.MAX_VALUE);
        } else {
            isemojicompatenabled = new isEmojiCompatEnabled(list5, list6, i8, i9, Integer.MAX_VALUE);
        }
        isemojicompatenabled.toString();
        setInflatedId.IconCompatParcelizer(3, "SupportedSurfaceCombination");
        list7 = isemojicompatenabled.serializer;
        i10 = isemojicompatenabled.IconCompatParcelizer;
        List list111 = isemojicompatenabled.read;
        int i210 = isemojicompatenabled.RemoteActionCompatParcelizer;
        i11 = isemojicompatenabled.write;
        if (list7 != null) {
            rangeIconCompatParcelizer = SmallDisplaySizeQuirk.RemoteActionCompatParcelizer;
            zEquals = rangeIconCompatParcelizer.equals(gettextmetricsparamscompat.serializer);
            z3 = gettextmetricsparamscompat.MediaMetadataCompat;
            if (!zEquals) {
                if (z3) {
                    rangeArrSerializer = this.PlaybackStateCompat.serializer(list7);
                } else {
                    rangeArrSerializer = (Range[]) this.serializer.write(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                }
                rangeIconCompatParcelizer2 = IconCompatParcelizer(gettextmetricsparamscompat.serializer, i10, rangeArrSerializer);
                if (!gettextmetricsparamscompat.IconCompatParcelizer) {
                    UtilsKt.IconCompatParcelizer("Target FPS range " + gettextmetricsparamscompat.serializer + " is not supported. Max FPS supported by the calculated best combination: " + i10 + ". Calculated best FPS range for device: " + rangeIconCompatParcelizer2 + ". Device supported FPS ranges: " + Arrays.toString(rangeArrSerializer), rangeIconCompatParcelizer2.equals(gettextmetricsparamscompat.serializer));
                } else {
                    UtilsKt.IconCompatParcelizer("Target FPS range " + gettextmetricsparamscompat.serializer + " is not supported. Max FPS supported by the calculated best combination: " + i10 + ". Calculated best FPS range for device: " + rangeIconCompatParcelizer2 + ". Device supported FPS ranges: " + Arrays.toString(rangeArrSerializer), rangeIconCompatParcelizer2.equals(gettextmetricsparamscompat.serializer));
                }
                rangeIconCompatParcelizer = rangeIconCompatParcelizer2;
            } else if (z3) {
                rangeIconCompatParcelizer = IconCompatParcelizer(setWeightSum.read, i10, this.PlaybackStateCompat.serializer(list7));
            }
            it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                imageUtilCodecFailedException2 = (ImageUtilCodecFailedException) it5.next();
                List list112 = list4;
                repeatingStreamConstraintForVideoRecordingQuirk = SmallDisplaySizeQuirk.read((Size) list7.get(arrayList3.indexOf(Integer.valueOf(arrayList2.indexOf(imageUtilCodecFailedException2)))));
                repeatingStreamConstraintForVideoRecordingQuirk.MediaMetadataCompat = Integer.valueOf(gettextmetricsparamscompat.MediaMetadataCompat ? 1 : 0);
                getNavigationIcon getnavigationicon3 = (getNavigationIcon) map2.get(imageUtilCodecFailedException2);
                getnavigationicon3.getClass();
                repeatingStreamConstraintForVideoRecordingQuirk.write = getnavigationicon3;
                imageUtilCodecFailedException2.getClass();
                cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
                Iterator it17 = it5;
                jpegCaptureDownsizingQuirk = access701.IconCompatParcelizer;
                if (imageUtilCodecFailedException2.read(jpegCaptureDownsizingQuirk)) {
                    cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(jpegCaptureDownsizingQuirk, imageUtilCodecFailedException2.write(jpegCaptureDownsizingQuirk));
                }
                jpegCaptureDownsizingQuirk2 = ImageUtilCodecFailedException.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                if (imageUtilCodecFailedException2.read(jpegCaptureDownsizingQuirk2)) {
                    cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(jpegCaptureDownsizingQuirk2, imageUtilCodecFailedException2.write(jpegCaptureDownsizingQuirk2));
                }
                jpegCaptureDownsizingQuirk3 = UseCase.RemoteActionCompatParcelizer;
                if (imageUtilCodecFailedException2.read(jpegCaptureDownsizingQuirk3)) {
                    cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(jpegCaptureDownsizingQuirk3, imageUtilCodecFailedException2.write(jpegCaptureDownsizingQuirk3));
                }
                jpegCaptureDownsizingQuirk4 = getFeatureGroupUseCaseType.b_;
                if (imageUtilCodecFailedException2.read(jpegCaptureDownsizingQuirk4)) {
                    cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(jpegCaptureDownsizingQuirk4, imageUtilCodecFailedException2.write(jpegCaptureDownsizingQuirk4));
                }
                repeatingStreamConstraintForVideoRecordingQuirk.IconCompatParcelizer = new access701(23, cameraProviderInitRetryPolicyRemoteActionCompatParcelizer);
                repeatingStreamConstraintForVideoRecordingQuirk.MediaSessionCompatQueueItem = Boolean.valueOf(gettextmetricsparamscompat.write);
                if (!SmallDisplaySizeQuirk.RemoteActionCompatParcelizer.equals(rangeIconCompatParcelizer)) {
                    repeatingStreamConstraintForVideoRecordingQuirk.RemoteActionCompatParcelizer = rangeIconCompatParcelizer;
                }
                map7.put(imageUtilCodecFailedException2, repeatingStreamConstraintForVideoRecordingQuirk.read());
                it5 = it17;
                list4 = list112;
            }
            list8 = list4;
            map13 = map7;
            if (list8 == null) {
                map14 = map13;
                map15 = map8;
            } else {
                map14 = map13;
                map15 = map8;
            }
            return new LargeJpegImageQuirk(map14, map15, i11);
        }
        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.read + " and Hardware level: " + this.MediaSessionCompatResultReceiverWrapper + ". May be the specified resolution is too large and not supported. Existing surfaces: " + arrayList + " New configs: " + ((Object) arrayList2));
    }

    public final boolean read(getTextMetricsParamsCompat gettextmetricsparamscompat, List list, Map map, List list2, List list3) {
        boolean z;
        List list4;
        Size relatedFixedSize;
        String string;
        boolean z2 = gettextmetricsparamscompat.MediaDescriptionCompat;
        boolean z3 = gettextmetricsparamscompat.MediaSessionCompatQueueItem;
        HashMap map2 = this.MediaSessionCompatQueueItem;
        if (map2.containsKey(gettextmetricsparamscompat)) {
            list4 = (List) map2.get(gettextmetricsparamscompat);
            z = true;
        } else {
            ArrayList arrayList = new ArrayList();
            int i = gettextmetricsparamscompat.RemoteActionCompatParcelizer;
            if (z3) {
                ArrayList arrayList2 = this.MediaMetadataCompat;
                if (arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk = SoftwareJpegEncodingPreferredQuirk.PRIV;
                    ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk = ImageCaptureFailedForSpecificCombinationQuirk.S1080P_16_9;
                    arrayList3.add(new IncorrectJpegMetadataQuirk(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk)));
                    ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk2 = ImageCaptureFailedForSpecificCombinationQuirk.S720P_16_9;
                    arrayList3.add(new IncorrectJpegMetadataQuirk(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk2)));
                    ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk3 = ImageCaptureFailedForSpecificCombinationQuirk.MAXIMUM_16_9;
                    arrayList3.addAll(hasPointerId.IconCompatParcelizer(imageCaptureFailedForSpecificCombinationQuirk, imageCaptureFailedForSpecificCombinationQuirk3));
                    ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk4 = ImageCaptureFailedForSpecificCombinationQuirk.UHD;
                    arrayList3.addAll(hasPointerId.IconCompatParcelizer(imageCaptureFailedForSpecificCombinationQuirk, imageCaptureFailedForSpecificCombinationQuirk4));
                    arrayList3.addAll(hasPointerId.IconCompatParcelizer(imageCaptureFailedForSpecificCombinationQuirk, ImageCaptureFailedForSpecificCombinationQuirk.S1440P_16_9));
                    arrayList3.addAll(hasPointerId.IconCompatParcelizer(imageCaptureFailedForSpecificCombinationQuirk, imageCaptureFailedForSpecificCombinationQuirk));
                    arrayList3.addAll(hasPointerId.IconCompatParcelizer(imageCaptureFailedForSpecificCombinationQuirk2, imageCaptureFailedForSpecificCombinationQuirk3));
                    arrayList3.addAll(hasPointerId.IconCompatParcelizer(imageCaptureFailedForSpecificCombinationQuirk2, imageCaptureFailedForSpecificCombinationQuirk4));
                    arrayList3.addAll(hasPointerId.IconCompatParcelizer(imageCaptureFailedForSpecificCombinationQuirk2, imageCaptureFailedForSpecificCombinationQuirk));
                    ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk5 = ImageCaptureFailedForSpecificCombinationQuirk.X_VGA;
                    ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk6 = ImageCaptureFailedForSpecificCombinationQuirk.MAXIMUM_4_3;
                    arrayList3.addAll(hasPointerId.IconCompatParcelizer(imageCaptureFailedForSpecificCombinationQuirk5, imageCaptureFailedForSpecificCombinationQuirk6));
                    arrayList3.addAll(hasPointerId.IconCompatParcelizer(ImageCaptureFailedForSpecificCombinationQuirk.S1080P_4_3, imageCaptureFailedForSpecificCombinationQuirk6));
                    arrayList2.addAll(arrayList3);
                }
                arrayList.addAll(arrayList2);
            } else if (gettextmetricsparamscompat.RatingCompat) {
                ArrayList arrayList4 = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                if (arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = new IncorrectJpegMetadataQuirk();
                    SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk2 = SoftwareJpegEncodingPreferredQuirk.JPEG_R;
                    ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk7 = ImageCaptureFailedForSpecificCombinationQuirk.MAXIMUM;
                    IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirkWrite = getBitmapFromCache.write(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk7, incorrectJpegMetadataQuirk, arrayList5, incorrectJpegMetadataQuirk);
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(SoftwareJpegEncodingPreferredQuirk.PRIV, ImageCaptureFailedForSpecificCombinationQuirk.PREVIEW, incorrectJpegMetadataQuirkWrite, softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk7);
                    arrayList5.add(incorrectJpegMetadataQuirkWrite);
                    arrayList4.addAll(arrayList5);
                }
                if (i == 0) {
                    arrayList.addAll(arrayList4);
                }
            } else {
                if (gettextmetricsparamscompat.MediaMetadataCompat) {
                    ArrayList arrayList6 = this.ParcelableVolumeInfo;
                    if (arrayList6.isEmpty()) {
                        setWeightSum setweightsum = this.PlaybackStateCompat;
                        if (((Boolean) setweightsum.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                            arrayList6.clear();
                            Size size = (Size) setweightsum.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                            if (size != null) {
                                TemporalNoiseQuirk temporalNoiseQuirkSerializer = serializer(34);
                                ArrayList arrayList7 = new ArrayList();
                                AeFpsRangeQuirk aeFpsRangeQuirk = ImageCaptureRotationOptionQuirk.IconCompatParcelizer;
                                temporalNoiseQuirkSerializer.getClass();
                                ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirkRemoteActionCompatParcelizer = StringKt.RemoteActionCompatParcelizer(34, size, temporalNoiseQuirkSerializer, 0, CaptureFailedRetryQuirk.CAPTURE_SESSION_TABLES, ImageCaptureRotationOptionQuirk.IconCompatParcelizer);
                                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk2 = new IncorrectJpegMetadataQuirk();
                                incorrectJpegMetadataQuirk2.read(imageCaptureRotationOptionQuirkRemoteActionCompatParcelizer);
                                arrayList7.add(incorrectJpegMetadataQuirk2);
                                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk3 = new IncorrectJpegMetadataQuirk();
                                incorrectJpegMetadataQuirk3.read(imageCaptureRotationOptionQuirkRemoteActionCompatParcelizer);
                                incorrectJpegMetadataQuirk3.read(imageCaptureRotationOptionQuirkRemoteActionCompatParcelizer);
                                arrayList7.add(incorrectJpegMetadataQuirk3);
                                arrayList6.addAll(arrayList7);
                            }
                        }
                    }
                    arrayList.addAll(arrayList6);
                } else {
                    int i2 = gettextmetricsparamscompat.read;
                    if (i2 == 8) {
                        z = true;
                        if (i != 1) {
                            ArrayList arrayList8 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                            if (i != 2) {
                                if (z2) {
                                    arrayList8 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                                }
                                arrayList.addAll(arrayList8);
                            } else {
                                arrayList.addAll(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
                                arrayList.addAll(arrayList8);
                            }
                        } else {
                            arrayList = this.write;
                        }
                    } else {
                        z = true;
                        if (i2 == 10 && i == 0) {
                            arrayList.addAll(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                        }
                    }
                }
                map2.put(gettextmetricsparamscompat, arrayList);
                list4 = arrayList;
            }
            z = true;
            map2.put(gettextmetricsparamscompat, arrayList);
            list4 = arrayList;
        }
        Iterator it = list4.iterator();
        boolean z4 = false;
        boolean z5 = false;
        while (it.hasNext()) {
            z5 = ((IncorrectJpegMetadataQuirk) it.next()).read(list) != null ? z : false;
            if (z5) {
                break;
            }
        }
        if (!z5 || !z3) {
            return z5;
        }
        Range range = gettextmetricsparamscompat.serializer;
        nativeGetSurfaceInfo nativegetsurfaceinfo = new nativeGetSurfaceInfo();
        int i3 = 0;
        while (i3 < list.size()) {
            ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (ImageCaptureRotationOptionQuirk) list.get(i3);
            TemporalNoiseQuirk temporalNoiseQuirkSerializer2 = serializer(imageCaptureRotationOptionQuirk.MediaBrowserCompatMediaItem);
            int i4 = imageCaptureRotationOptionQuirk.MediaBrowserCompatMediaItem;
            temporalNoiseQuirkSerializer2.getClass();
            HashMap map3 = temporalNoiseQuirkSerializer2.IconCompatParcelizer;
            ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk8 = imageCaptureRotationOptionQuirk.read;
            switch (LowMemoryQuirk.read[imageCaptureFailedForSpecificCombinationQuirk8.ordinal()]) {
                case 1:
                    relatedFixedSize = temporalNoiseQuirkSerializer2.read;
                    break;
                case 2:
                    relatedFixedSize = temporalNoiseQuirkSerializer2.RatingCompat;
                    break;
                case 3:
                    relatedFixedSize = (Size) map3.get(Integer.valueOf(i4));
                    break;
                case 4:
                    relatedFixedSize = (Size) map3.get(Integer.valueOf(i4));
                    break;
                case 5:
                    relatedFixedSize = (Size) map3.get(Integer.valueOf(i4));
                    break;
                case 6:
                    relatedFixedSize = (Size) temporalNoiseQuirkSerializer2.MediaSessionCompatQueueItem.get(Integer.valueOf(i4));
                    break;
                case 7:
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Not supported config size");
                    return z4;
                default:
                    relatedFixedSize = imageCaptureFailedForSpecificCombinationQuirk8.getRelatedFixedSize();
                    break;
            }
            relatedFixedSize.getClass();
            ImageUtilCodecFailedException imageUtilCodecFailedException = (ImageUtilCodecFailedException) list2.get(((Integer) list3.get(i3)).intValue());
            getNavigationIcon getnavigationicon = (getNavigationIcon) map.get(imageCaptureRotationOptionQuirk);
            Objects.requireNonNull(getnavigationicon);
            imageUtilCodecFailedException.getClass();
            FocusMeteringControl2 focusMeteringControl2 = new FocusMeteringControl2(relatedFixedSize, imageUtilCodecFailedException.RemoteActionCompatParcelizer());
            o.TorchControl.Companion.getClass();
            Class<?> surfaceClass = CameraManagerCompatApi30Impl.read(imageUtilCodecFailedException).getSurfaceClass();
            if (surfaceClass != null) {
                focusMeteringControl2.MediaDescriptionCompat = surfaceClass;
            }
            UseCaseAdditionSimulator useCaseAdditionSimulatorIconCompatParcelizer = UseCaseAdditionSimulator.IconCompatParcelizer(imageUtilCodecFailedException, relatedFixedSize);
            abandonFocus abandonfocus = useCaseAdditionSimulatorIconCompatParcelizer.serializer;
            useCaseAdditionSimulatorIconCompatParcelizer.serializer(focusMeteringControl2, getnavigationicon, -1);
            Range range2 = SmallDisplaySizeQuirk.RemoteActionCompatParcelizer.equals(range) ? AfRegionFlipHorizontallyQuirk.RemoteActionCompatParcelizer : range;
            abandonfocus.getClass();
            ((CameraProviderInitRetryPolicy) abandonfocus.RemoteActionCompatParcelizer).IconCompatParcelizer(nativeGetYUVImageVUOff.write, range2);
            if (z2) {
                abandonfocus.getClass();
                ((CameraProviderInitRetryPolicy) abandonfocus.RemoteActionCompatParcelizer).IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, 2);
            }
            nativegetsurfaceinfo.read(useCaseAdditionSimulatorIconCompatParcelizer.RemoteActionCompatParcelizer());
            boolean zWrite = nativegetsurfaceinfo.write();
            StringBuilder sb = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
            sb.append(imageUtilCodecFailedException);
            sb.append(" with ");
            sb.append(imageCaptureRotationOptionQuirk);
            sb.append(" due to [");
            if (!nativegetsurfaceinfo.PlaybackStateCompat) {
                string = "Template is not set";
            } else {
                string = nativegetsurfaceinfo.ParcelableVolumeInfo.toString();
            }
            MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, string, "]; surfaceConfigList = ", list, ", featureSettings = ");
            sb.append(gettextmetricsparamscompat);
            sb.append(", newUseCaseConfigs = ");
            sb.append(list2);
            UtilsKt.RemoteActionCompatParcelizer(sb.toString(), zWrite);
            i3++;
            z4 = false;
        }
        mapToBase maptobaseRemoteActionCompatParcelizer = nativegetsurfaceinfo.RemoteActionCompatParcelizer();
        boolean zIconCompatParcelizer = this.MediaBrowserCompatMediaItem.IconCompatParcelizer(maptobaseRemoteActionCompatParcelizer);
        Iterator it2 = maptobaseRemoteActionCompatParcelizer.RemoteActionCompatParcelizer().iterator();
        while (it2.hasNext()) {
            ((PreviewExternalSyntheticLambda0) it2.next()).write();
        }
        return zIconCompatParcelizer;
    }

    public final int read(int i, Size size, boolean z) {
        long outputMinFrameDuration;
        UtilsKt.RemoteActionCompatParcelizer((String) null, !z || i == 34);
        if (z) {
            setWeightSum setweightsum = this.PlaybackStateCompat;
            setweightsum.getClass();
            size.getClass();
            List listSerializer = setweightsum.serializer(size);
            List list = listSerializer.isEmpty() ? null : listSerializer;
            if (list == null) {
                setInflatedId.read("HighSpeedResolver", "No supported high speed  fps for " + size);
                return 0;
            }
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Integer num = (Integer) ((Range) it.next()).getUpper();
                while (it.hasNext()) {
                    Integer num2 = (Integer) ((Range) it.next()).getUpper();
                    if (num.compareTo(num2) < 0) {
                        num = num2;
                    }
                }
                num.getClass();
                return num.intValue();
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return 0;
        }
        NavArgsLazy navArgsLazySerializer = this.serializer.serializer();
        Objects.requireNonNull(navArgsLazySerializer);
        try {
            outputMinFrameDuration = ((StreamConfigurationMap) ((ImageCapture$1) navArgsLazySerializer.MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).getOutputMinFrameDuration(i, size);
        } catch (RuntimeException e) {
            setInflatedId.RemoteActionCompatParcelizer("StreamConfigurationMapCompat", "Failed to get min frame duration for format = " + i + " and size = " + size, e);
            outputMinFrameDuration = 0L;
        }
        if (outputMinFrameDuration > 0) {
            return (int) (1.0E9d / outputMinFrameDuration);
        }
        if (!this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            return Integer.MAX_VALUE;
        }
        setInflatedId.read("SupportedSurfaceCombination", "minFrameDuration: " + outputMinFrameDuration + " is invalid for imageFormat = " + i + ", size = " + size);
        return 0;
    }
}
