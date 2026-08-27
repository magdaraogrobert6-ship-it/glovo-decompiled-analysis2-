package o;

import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class LruCache extends androidx.camera.core.UseCase {
    public final valueOf IconCompatParcelizer;
    public UseCaseAdditionSimulator MediaBrowserCompatMediaItem;
    public UseCaseAdditionSimulator MediaDescriptionCompat;
    public setBrightness MediaMetadataCompat;
    public setBrightness MediaSessionCompatQueueItem;
    public androidx.navigation.NavArgsLazy ParcelableVolumeInfo;
    public setBrightness PlaybackStateCompat;
    public final valueOf RatingCompat;
    public com.airbnb.lottie.parser.DropShadowEffect RemoteActionCompatParcelizer;
    public final get r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public setBrightness read;
    public InterruptedRuntimeException serializer;
    public final put write;

    @Override // androidx.camera.core.UseCase
    public final void MediaBrowserCompatMediaItem() {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = false;
        Iterator it = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((androidx.camera.core.UseCase) it.next()).MediaBrowserCompatMediaItem();
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void ResultReceiver() {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
        Iterator it = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((androidx.camera.core.UseCase) it.next()).ResultReceiver();
        }
    }

    public static ArrayList IconCompatParcelizer(androidx.camera.core.UseCase useCase) {
        ArrayList arrayList = new ArrayList();
        if (!(useCase instanceof LruCache)) {
            arrayList.add(useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write());
            return arrayList;
        }
        Iterator it = ((LruCache) useCase).r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            arrayList.add(((androidx.camera.core.UseCase) it.next()).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write());
        }
        return arrayList;
    }

    public static put RemoteActionCompatParcelizer(HashSet hashSet) {
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
        new getOuterActionMenuPresenter(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer);
        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(getFeatureGroupUseCaseType.b_, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            androidx.camera.core.UseCase useCase = (androidx.camera.core.UseCase) it.next();
            if (useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(ImageUtilCodecFailedException.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus)) {
                arrayList.add(useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write());
            } else {
                SentryLogcatAdapter.serializer("StreamSharing", "A child does not have capture type.");
            }
        }
        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(put.RemoteActionCompatParcelizer, arrayList);
        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(getImageFormatdefault.g_, 2);
        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, AeFpsRangeQuirk.PREVIEW_VIDEO_STILL);
        return new put(CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer));
    }

    @Override // androidx.camera.core.UseCase
    public final StreamSharingExternalSyntheticLambda0 IconCompatParcelizer(InitializationException initializationException) {
        return new getOuterActionMenuPresenter(CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(initializationException));
    }

    public final UseCaseAdditionSimulator IconCompatParcelizer(setBrightness setbrightness, ImageUtilCodecFailedException imageUtilCodecFailedException, SmallDisplaySizeQuirk smallDisplaySizeQuirk) {
        UseCaseAdditionSimulator useCaseAdditionSimulatorIconCompatParcelizer = UseCaseAdditionSimulator.IconCompatParcelizer(imageUtilCodecFailedException, smallDisplaySizeQuirk.MediaMetadataCompat);
        abandonFocus abandonfocus = useCaseAdditionSimulatorIconCompatParcelizer.serializer;
        get getVar = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        Iterator it = getVar.IconCompatParcelizer.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((mapToBase) ((androidx.camera.core.UseCase) it.next()).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write(ImageUtilCodecFailedException.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY)).MediaDescriptionCompat.MediaSessionCompatQueueItem;
            List list = mapToBase.serializer;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            abandonfocus.MediaMetadataCompat = i;
        }
        android.util.Size size = smallDisplaySizeQuirk.MediaMetadataCompat;
        Iterator it2 = getVar.IconCompatParcelizer.iterator();
        while (it2.hasNext()) {
            mapToBase maptobaseRemoteActionCompatParcelizer = UseCaseAdditionSimulator.IconCompatParcelizer(((androidx.camera.core.UseCase) it2.next()).r8lambda54BeH8ZsBru0CXI2CCSP2syNys, size).RemoteActionCompatParcelizer();
            nativeGetYUVImageVUOff nativegetyuvimagevuoff = maptobaseRemoteActionCompatParcelizer.MediaDescriptionCompat;
            abandonfocus.serializer(nativegetyuvimagevuoff.IconCompatParcelizer);
            List<StillCaptureFlashStopRepeatingQuirk> list2 = maptobaseRemoteActionCompatParcelizer.MediaSessionCompatQueueItem;
            ArrayList arrayList = useCaseAdditionSimulatorIconCompatParcelizer.MediaDescriptionCompat;
            for (StillCaptureFlashStopRepeatingQuirk stillCaptureFlashStopRepeatingQuirk : list2) {
                abandonfocus.read(stillCaptureFlashStopRepeatingQuirk);
                if (!arrayList.contains(stillCaptureFlashStopRepeatingQuirk)) {
                    arrayList.add(stillCaptureFlashStopRepeatingQuirk);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : maptobaseRemoteActionCompatParcelizer.MediaMetadataCompat) {
                ArrayList arrayList2 = useCaseAdditionSimulatorIconCompatParcelizer.RatingCompat;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : maptobaseRemoteActionCompatParcelizer.read) {
                ArrayList arrayList3 = useCaseAdditionSimulatorIconCompatParcelizer.read;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            abandonfocus.RemoteActionCompatParcelizer(nativegetyuvimagevuoff.MediaDescriptionCompat);
        }
        setbrightness.getClass();
        PrematureEndOfStreamVideoQuirk.write();
        setbrightness.write();
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("Consumer can only be linked once.", !setbrightness.IconCompatParcelizer);
        setbrightness.IconCompatParcelizer = true;
        useCaseAdditionSimulatorIconCompatParcelizer.serializer(setbrightness.MediaSessionCompatToken, smallDisplaySizeQuirk.read, -1);
        abandonfocus.read(getVar.MediaMetadataCompat);
        InitializationException initializationException = smallDisplaySizeQuirk.serializer;
        if (initializationException != null) {
            abandonfocus.RemoteActionCompatParcelizer(initializationException);
        }
        useCaseAdditionSimulatorIconCompatParcelizer.MediaSessionCompatQueueItem = smallDisplaySizeQuirk.MediaDescriptionCompat;
        serializer(useCaseAdditionSimulatorIconCompatParcelizer, smallDisplaySizeQuirk);
        return useCaseAdditionSimulatorIconCompatParcelizer;
    }

    @Override // androidx.camera.core.UseCase
    public final SmallDisplaySizeQuirk RemoteActionCompatParcelizer(InitializationException initializationException) {
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(initializationException);
        Object[] objArr = {this.MediaDescriptionCompat.RemoteActionCompatParcelizer()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        RemoteActionCompatParcelizer(Collections.unmodifiableList(arrayList));
        RepeatingStreamConstraintForVideoRecordingQuirk repeatingStreamConstraintForVideoRecordingQuirk = this.MediaSessionCompatToken.read();
        repeatingStreamConstraintForVideoRecordingQuirk.IconCompatParcelizer = initializationException;
        return repeatingStreamConstraintForVideoRecordingQuirk.read();
    }

    @Override // androidx.camera.core.UseCase
    public final Set e_() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    public final void f_() {
        get getVar = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        for (androidx.camera.core.UseCase useCase : getVar.IconCompatParcelizer) {
            create createVar = (create) getVar.MediaSessionCompatQueueItem.get(useCase);
            Objects.requireNonNull(createVar);
            useCase.RemoteActionCompatParcelizer(createVar, null, null, useCase.IconCompatParcelizer(true, getVar.MediaSessionCompatToken));
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void g_() {
        Iterator it = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((androidx.camera.core.UseCase) it.next()).g_();
        }
    }

    @Override // androidx.camera.core.UseCase
    public final Set read(FocusMeteringAction focusMeteringAction) {
        HashSet hashSet = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer;
        HashSet hashSet2 = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Set set = ((androidx.camera.core.UseCase) it.next()).read(focusMeteringAction);
            if (set != null) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(set);
                } else {
                    hashSet2.retainAll(set);
                }
            }
        }
        return hashSet2;
    }

    public final setBrightness read(String str, String str2, ImageUtilCodecFailedException imageUtilCodecFailedException, SmallDisplaySizeQuirk smallDisplaySizeQuirk, SmallDisplaySizeQuirk smallDisplaySizeQuirk2) {
        android.graphics.Matrix matrix = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        ImageCapture1 imageCapture1RatingCompat = RatingCompat();
        Objects.requireNonNull(imageCapture1RatingCompat);
        boolean zC_ = imageCapture1RatingCompat.c_();
        android.util.Size size = smallDisplaySizeQuirk.MediaMetadataCompat;
        android.graphics.Rect rect = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        android.graphics.Rect rect2 = rect != null ? rect : new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
        ImageCapture1 imageCapture1RatingCompat2 = RatingCompat();
        Objects.requireNonNull(imageCapture1RatingCompat2);
        int iSerializer = serializer(imageCapture1RatingCompat2, false);
        ImageCapture1 imageCapture1RatingCompat3 = RatingCompat();
        Objects.requireNonNull(imageCapture1RatingCompat3);
        setBrightness setbrightness = new setBrightness(3, 34, smallDisplaySizeQuirk, matrix, zC_, rect2, iSerializer, -1, write(imageCapture1RatingCompat3));
        this.read = setbrightness;
        Objects.requireNonNull(RatingCompat());
        this.PlaybackStateCompat = setbrightness;
        UseCaseAdditionSimulator useCaseAdditionSimulatorIconCompatParcelizer = IconCompatParcelizer(this.read, imageUtilCodecFailedException, smallDisplaySizeQuirk);
        this.MediaDescriptionCompat = useCaseAdditionSimulatorIconCompatParcelizer;
        InterruptedRuntimeException interruptedRuntimeException = this.serializer;
        if (interruptedRuntimeException != null) {
            interruptedRuntimeException.write();
        }
        InterruptedRuntimeException interruptedRuntimeException2 = new InterruptedRuntimeException(new entryRemoved(this, str, str2, imageUtilCodecFailedException, smallDisplaySizeQuirk, smallDisplaySizeQuirk2));
        this.serializer = interruptedRuntimeException2;
        useCaseAdditionSimulatorIconCompatParcelizer.RemoteActionCompatParcelizer = interruptedRuntimeException2;
        return this.PlaybackStateCompat;
    }

    @Override // androidx.camera.core.UseCase
    public final void serializer() {
        read();
        get getVar = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        for (androidx.camera.core.UseCase useCase : getVar.IconCompatParcelizer) {
            create createVar = (create) getVar.MediaSessionCompatQueueItem.get(useCase);
            Objects.requireNonNull(createVar);
            useCase.RemoteActionCompatParcelizer(createVar);
        }
    }

    @Override // androidx.camera.core.UseCase
    public final SmallDisplaySizeQuirk write(SmallDisplaySizeQuirk smallDisplaySizeQuirk, SmallDisplaySizeQuirk smallDisplaySizeQuirk2) {
        Objects.toString(smallDisplaySizeQuirk);
        Objects.toString(smallDisplaySizeQuirk2);
        setInflatedId.IconCompatParcelizer(3, "StreamSharing");
        RemoteActionCompatParcelizer(serializer(PlaybackStateCompatCustomAction(), PlaybackStateCompat() == null ? null : PlaybackStateCompat().MediaMetadataCompat().read(), this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, smallDisplaySizeQuirk, smallDisplaySizeQuirk2));
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = values.ACTIVE;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        return smallDisplaySizeQuirk;
    }

    public LruCache(ImageCapture1 imageCapture1, ImageCapture1 imageCapture2, valueOf valueof, valueOf valueof2, HashSet hashSet, Recorder3 recorder3) {
        super(RemoteActionCompatParcelizer(hashSet));
        this.write = RemoteActionCompatParcelizer(hashSet);
        this.IconCompatParcelizer = valueof;
        this.RatingCompat = valueof2;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new get(imageCapture1, imageCapture2, hashSet, recorder3, new StreamSharing$$ExternalSyntheticLambda0(0, this));
        HashSet hashSet2 = ((androidx.camera.core.UseCase) hashSet.iterator().next()).r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = hashSet2 != null ? new HashSet(hashSet2) : null;
    }

    public final void read() {
        InterruptedRuntimeException interruptedRuntimeException = this.serializer;
        if (interruptedRuntimeException != null) {
            interruptedRuntimeException.write();
            this.serializer = null;
        }
        setBrightness setbrightness = this.read;
        if (setbrightness != null) {
            setbrightness.read();
            this.read = null;
        }
        setBrightness setbrightness2 = this.MediaMetadataCompat;
        if (setbrightness2 != null) {
            setbrightness2.read();
            this.MediaMetadataCompat = null;
        }
        setBrightness setbrightness3 = this.PlaybackStateCompat;
        if (setbrightness3 != null) {
            setbrightness3.read();
            this.PlaybackStateCompat = null;
        }
        setBrightness setbrightness4 = this.MediaSessionCompatQueueItem;
        if (setbrightness4 != null) {
            setbrightness4.read();
            this.MediaSessionCompatQueueItem = null;
        }
        androidx.navigation.NavArgsLazy navArgsLazy = this.ParcelableVolumeInfo;
        if (navArgsLazy != null) {
            navArgsLazy.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            this.ParcelableVolumeInfo = null;
        }
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect = this.RemoteActionCompatParcelizer;
        if (dropShadowEffect != null) {
            ((getCardElevation) dropShadowEffect.read).RemoteActionCompatParcelizer();
            PrematureEndOfStreamVideoQuirk.write(new Preview$$ExternalSyntheticLambda0(21, dropShadowEffect));
            this.RemoteActionCompatParcelizer = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01e3  */
    @Override // androidx.camera.core.UseCase
    public final ImageUtilCodecFailedException RemoteActionCompatParcelizer(FocusMeteringAction focusMeteringAction, StreamSharingExternalSyntheticLambda0 streamSharingExternalSyntheticLambda0) {
        getNavigationIcon getnavigationicon;
        boolean z;
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicySerializer = streamSharingExternalSyntheticLambda0.serializer();
        get getVar = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        HashSet hashSet = getVar.serializer;
        store storeVar = getVar.MediaDescriptionCompat;
        List listSerializer = storeVar.read.serializer(34);
        HashSet<ImageUtilCodecFailedException> hashSet2 = storeVar.IconCompatParcelizer;
        for (ImageUtilCodecFailedException imageUtilCodecFailedException : hashSet2) {
            if (!((Boolean) imageUtilCodecFailedException.read(ImageUtilCodecFailedException.ResultReceiver, Boolean.FALSE)).booleanValue() && (imageUtilCodecFailedException instanceof getImageFormatdefault)) {
            }
        }
        List list = (List) cameraProviderInitRetryPolicySerializer.read(getImageFormatdefault.i_, null);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    listSerializer = new ArrayList();
                    break;
                }
                Pair pair = (Pair) it.next();
                if (((Integer) pair.first).equals(34)) {
                    listSerializer = Arrays.asList((android.util.Size[]) pair.second);
                    break;
                }
            }
        }
        Rational rational = storeVar.write;
        ArrayList arrayList = new ArrayList();
        HashSet<android.util.Size> hashSet3 = new HashSet();
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            hashSet3.addAll(storeVar.write((ImageUtilCodecFailedException) it2.next()));
        }
        for (android.util.Size size : hashSet3) {
            Rational rational2 = AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer;
            if (!AudioTimestampFramePositionIncorrectQuirk.serializer(size, rational, setController.MediaMetadataCompat)) {
                arrayList.addAll(storeVar.write(storeVar.MediaBrowserCompatMediaItem, listSerializer, false));
                break;
            }
        }
        int size2 = arrayList.size();
        if (!hashSet2.isEmpty()) {
            Iterator it3 = hashSet2.iterator();
            loop4: do {
                if (!it3.hasNext()) {
                    size2 = 0;
                    break;
                }
                z = false;
                boolean z2 = false;
                for (android.util.Size size3 : storeVar.write((ImageUtilCodecFailedException) it3.next())) {
                    Rational rational3 = AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer;
                    boolean zSerializer = AudioTimestampFramePositionIncorrectQuirk.serializer(size3, rational, setController.MediaMetadataCompat);
                    if (zSerializer) {
                        z = true;
                    }
                    if (z2 && zSerializer) {
                        break loop4;
                    }
                    if (!zSerializer) {
                        z2 = true;
                    }
                }
            } while (z);
        }
        arrayList.addAll(size2, storeVar.write(rational, listSerializer, false));
        arrayList.addAll(storeVar.RemoteActionCompatParcelizer(listSerializer, false));
        if (arrayList.isEmpty()) {
            setInflatedId.read("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(storeVar.RemoteActionCompatParcelizer(listSerializer, true));
        }
        arrayList.toString();
        setInflatedId.IconCompatParcelizer(3, "ResolutionsMerger");
        cameraProviderInitRetryPolicySerializer.IconCompatParcelizer(getImageFormatdefault.d_, arrayList);
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = ImageUtilCodecFailedException.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        Iterator it4 = hashSet.iterator();
        int iMax = 0;
        while (it4.hasNext()) {
            iMax = Math.max(iMax, ((Integer) ((ImageUtilCodecFailedException) it4.next()).read(ImageUtilCodecFailedException.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, 0)).intValue());
        }
        cameraProviderInitRetryPolicySerializer.IconCompatParcelizer(jpegCaptureDownsizingQuirk, Integer.valueOf(iMax));
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((ImageUtilCodecFailedException) it5.next()).IconCompatParcelizer());
        }
        if (arrayList2.isEmpty()) {
            getnavigationicon = null;
            break;
        }
        getNavigationIcon getnavigationicon2 = (getNavigationIcon) arrayList2.get(0);
        int i = getnavigationicon2.MediaSessionCompatQueueItem;
        int i2 = getnavigationicon2.MediaBrowserCompatMediaItem;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i2);
        int i3 = 1;
        while (true) {
            if (i3 >= arrayList2.size()) {
                getnavigationicon = new getNavigationIcon(numValueOf.intValue(), numValueOf2.intValue());
                break;
            }
            getNavigationIcon getnavigationicon3 = (getNavigationIcon) arrayList2.get(i3);
            Integer numValueOf3 = Integer.valueOf(getnavigationicon3.MediaSessionCompatQueueItem);
            if (numValueOf.equals(0)) {
                numValueOf = numValueOf3;
            } else if (!numValueOf3.equals(0)) {
                if (numValueOf.equals(2) && !numValueOf3.equals(1)) {
                    numValueOf = numValueOf3;
                } else if ((!numValueOf3.equals(2) || numValueOf.equals(1)) && !numValueOf.equals(numValueOf3)) {
                    numValueOf = null;
                }
            }
            Integer numValueOf4 = Integer.valueOf(getnavigationicon3.MediaBrowserCompatMediaItem);
            if (numValueOf2.equals(0)) {
                numValueOf2 = numValueOf4;
            } else if (!numValueOf4.equals(0) && !numValueOf2.equals(numValueOf4)) {
                numValueOf2 = null;
            }
            if (numValueOf == null || numValueOf2 == null) {
                getnavigationicon = null;
                break;
            }
            i3++;
        }
        if (getnavigationicon == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
            return null;
        }
        cameraProviderInitRetryPolicySerializer.IconCompatParcelizer(getFeatureGroupUseCaseType.a_, getnavigationicon);
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk2 = ImageUtilCodecFailedException.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        Range rangeExtend = SmallDisplaySizeQuirk.RemoteActionCompatParcelizer;
        Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            Range range = (Range) ((ImageUtilCodecFailedException) it6.next()).read(ImageUtilCodecFailedException.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, rangeExtend);
            Objects.requireNonNull(range);
            if (SmallDisplaySizeQuirk.RemoteActionCompatParcelizer.equals(rangeExtend)) {
                rangeExtend = range;
            } else {
                try {
                    rangeExtend = rangeExtend.intersect(range);
                } catch (IllegalArgumentException unused) {
                    Objects.toString(rangeExtend);
                    range.toString();
                    setInflatedId.IconCompatParcelizer(3, "VirtualCameraAdapter");
                    rangeExtend = rangeExtend.extend(range);
                }
            }
        }
        cameraProviderInitRetryPolicySerializer.IconCompatParcelizer(jpegCaptureDownsizingQuirk2, rangeExtend);
        Iterator it7 = getVar.IconCompatParcelizer.iterator();
        while (it7.hasNext()) {
            ImageUtilCodecFailedException imageUtilCodecFailedException2 = (ImageUtilCodecFailedException) getVar.RemoteActionCompatParcelizer.get((androidx.camera.core.UseCase) it7.next());
            Objects.requireNonNull(imageUtilCodecFailedException2);
            if (imageUtilCodecFailedException2.MediaSessionCompatQueueItem() != 0) {
                cameraProviderInitRetryPolicySerializer.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, Integer.valueOf(imageUtilCodecFailedException2.MediaSessionCompatQueueItem()));
            }
            if (imageUtilCodecFailedException2.serializer() != 0) {
                cameraProviderInitRetryPolicySerializer.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, Integer.valueOf(imageUtilCodecFailedException2.serializer()));
            }
        }
        return streamSharingExternalSyntheticLambda0.RemoteActionCompatParcelizer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List serializer(String str, String str2, ImageUtilCodecFailedException imageUtilCodecFailedException, SmallDisplaySizeQuirk smallDisplaySizeQuirk, SmallDisplaySizeQuirk smallDisplaySizeQuirk2) {
        getNavigationIcon getnavigationicon = smallDisplaySizeQuirk.read;
        PrematureEndOfStreamVideoQuirk.write();
        get getVar = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (smallDisplaySizeQuirk2 == null) {
            setBrightness setbrightness = read(str, str2, imageUtilCodecFailedException, smallDisplaySizeQuirk, null);
            ImageCapture1 imageCapture1RatingCompat = RatingCompat();
            Objects.requireNonNull(imageCapture1RatingCompat);
            androidx.navigation.NavArgsLazy navArgsLazy = new androidx.navigation.NavArgsLazy(imageCapture1RatingCompat, new PreviewView1ExternalSyntheticLambda2(getnavigationicon));
            this.ParcelableVolumeInfo = navArgsLazy;
            boolean z = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs != null;
            int iMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
            getVar.getClass();
            HashMap map = new HashMap();
            for (androidx.camera.core.UseCase useCase : getVar.IconCompatParcelizer) {
                setMaxCardElevation setmaxcardelevationRemoteActionCompatParcelizer = getVar.RemoteActionCompatParcelizer(useCase, getVar.MediaDescriptionCompat, getVar.RatingCompat, setbrightness, iMediaSessionCompatResultReceiverWrapper, z);
                int iRemoteActionCompatParcelizer = getVar.RatingCompat.ResultReceiver().RemoteActionCompatParcelizer(((getImageFormatdefault) useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).write(0));
                create createVar = (create) getVar.MediaSessionCompatQueueItem.get(useCase);
                Objects.requireNonNull(createVar);
                createVar.RemoteActionCompatParcelizer.read = iRemoteActionCompatParcelizer;
                map.put(useCase, setmaxcardelevationRemoteActionCompatParcelizer);
            }
            ViewRootForInspectorDefaultImpls viewRootForInspectorDefaultImplsRemoteActionCompatParcelizer = navArgsLazy.RemoteActionCompatParcelizer(new setScreenFlashWindow(setbrightness, new ArrayList(map.values())));
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                map2.put((androidx.camera.core.UseCase) entry.getKey(), (setBrightness) viewRootForInspectorDefaultImplsRemoteActionCompatParcelizer.get(entry.getValue()));
            }
            getVar.serializer(map2, getVar.RemoteActionCompatParcelizer(setbrightness, z));
            Object[] objArr = {this.MediaDescriptionCompat.RemoteActionCompatParcelizer()};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        setBrightness setbrightness2 = read(str, str2, imageUtilCodecFailedException, smallDisplaySizeQuirk, smallDisplaySizeQuirk2);
        android.graphics.Matrix matrix = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        ImageCapture1 imageCapture1PlaybackStateCompat = PlaybackStateCompat();
        Objects.requireNonNull(imageCapture1PlaybackStateCompat);
        boolean zC_ = imageCapture1PlaybackStateCompat.c_();
        android.util.Size size = smallDisplaySizeQuirk2.MediaMetadataCompat;
        android.graphics.Rect rect = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (rect == null) {
            rect = new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
        }
        ImageCapture1 imageCapture1PlaybackStateCompat2 = PlaybackStateCompat();
        Objects.requireNonNull(imageCapture1PlaybackStateCompat2);
        int iSerializer = serializer(imageCapture1PlaybackStateCompat2, false);
        ImageCapture1 imageCapture1PlaybackStateCompat3 = PlaybackStateCompat();
        Objects.requireNonNull(imageCapture1PlaybackStateCompat3);
        setBrightness setbrightness3 = new setBrightness(3, 34, smallDisplaySizeQuirk2, matrix, zC_, rect, iSerializer, -1, write(imageCapture1PlaybackStateCompat3));
        this.MediaMetadataCompat = setbrightness3;
        Objects.requireNonNull(PlaybackStateCompat());
        this.MediaSessionCompatQueueItem = setbrightness3;
        UseCaseAdditionSimulator useCaseAdditionSimulatorIconCompatParcelizer = IconCompatParcelizer(this.MediaMetadataCompat, imageUtilCodecFailedException, smallDisplaySizeQuirk2);
        this.MediaBrowserCompatMediaItem = useCaseAdditionSimulatorIconCompatParcelizer;
        InterruptedRuntimeException interruptedRuntimeException = this.serializer;
        if (interruptedRuntimeException != null) {
            interruptedRuntimeException.write();
        }
        setBrightness setbrightness4 = setbrightness2;
        InterruptedRuntimeException interruptedRuntimeException2 = new InterruptedRuntimeException(new entryRemoved(this, str, str2, imageUtilCodecFailedException, smallDisplaySizeQuirk, smallDisplaySizeQuirk2));
        this.serializer = interruptedRuntimeException2;
        useCaseAdditionSimulatorIconCompatParcelizer.RemoteActionCompatParcelizer = interruptedRuntimeException2;
        setBrightness setbrightness5 = this.MediaSessionCompatQueueItem;
        this.RemoteActionCompatParcelizer = new com.airbnb.lottie.parser.DropShadowEffect(RatingCompat(), PlaybackStateCompat(), new getMaxCardElevation(getnavigationicon, this.IconCompatParcelizer, this.RatingCompat));
        boolean z2 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs != null;
        int iMediaSessionCompatResultReceiverWrapper2 = MediaSessionCompatResultReceiverWrapper();
        getVar.getClass();
        HashMap map3 = new HashMap();
        get getVar2 = getVar;
        for (androidx.camera.core.UseCase useCase2 : getVar2.IconCompatParcelizer) {
            setMaxCardElevation setmaxcardelevationRemoteActionCompatParcelizer2 = getVar2.RemoteActionCompatParcelizer(useCase2, getVar2.MediaDescriptionCompat, getVar2.RatingCompat, setbrightness4, iMediaSessionCompatResultReceiverWrapper2, z2);
            store storeVar = getVar2.PlaybackStateCompatCustomAction;
            Objects.requireNonNull(storeVar);
            ImageCapture1 imageCapture1 = getVar2.MediaBrowserCompatMediaItem;
            Objects.requireNonNull(imageCapture1);
            setMaxCardElevation setmaxcardelevationRemoteActionCompatParcelizer3 = getVar2.RemoteActionCompatParcelizer(useCase2, storeVar, imageCapture1, setbrightness5, iMediaSessionCompatResultReceiverWrapper2, z2);
            int iRemoteActionCompatParcelizer2 = getVar2.RatingCompat.ResultReceiver().RemoteActionCompatParcelizer(((getImageFormatdefault) useCase2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).write(0));
            create createVar2 = (create) getVar2.MediaSessionCompatQueueItem.get(useCase2);
            Objects.requireNonNull(createVar2);
            createVar2.RemoteActionCompatParcelizer.read = iRemoteActionCompatParcelizer2;
            map3.put(useCase2, new getCardBackgroundColor(setmaxcardelevationRemoteActionCompatParcelizer2, setmaxcardelevationRemoteActionCompatParcelizer3));
        }
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect = this.RemoteActionCompatParcelizer;
        ArrayList arrayList2 = new ArrayList(map3.values());
        getContentPaddingRight getcontentpaddingright = new getContentPaddingRight(setbrightness4, setbrightness5, arrayList2);
        dropShadowEffect.getClass();
        PrematureEndOfStreamVideoQuirk.write();
        getCardElevation getcardelevation = (getCardElevation) dropShadowEffect.read;
        Objects.toString(getcardelevation);
        Objects.toString(setbrightness4);
        Objects.toString(setbrightness5);
        setInflatedId.IconCompatParcelizer(3, "DualSurfaceProcessorNode");
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Objects.toString((getCardBackgroundColor) it.next());
            setInflatedId.IconCompatParcelizer(3, "SurfaceProcessorNode");
        }
        dropShadowEffect.MediaDescriptionCompat = getcontentpaddingright;
        dropShadowEffect.serializer = new ViewRootForInspectorDefaultImpls();
        getContentPaddingRight getcontentpaddingright2 = (getContentPaddingRight) dropShadowEffect.MediaDescriptionCompat;
        setBrightness setbrightness6 = getcontentpaddingright2.IconCompatParcelizer;
        setBrightness setbrightness7 = getcontentpaddingright2.RemoteActionCompatParcelizer;
        Iterator it2 = getcontentpaddingright2.write.iterator();
        while (it2.hasNext()) {
            getCardBackgroundColor getcardbackgroundcolor = (getCardBackgroundColor) it2.next();
            ViewRootForInspectorDefaultImpls viewRootForInspectorDefaultImpls = (ViewRootForInspectorDefaultImpls) dropShadowEffect.serializer;
            setMaxCardElevation setmaxcardelevation = getcardbackgroundcolor.read;
            android.graphics.Rect rect2 = setmaxcardelevation.RemoteActionCompatParcelizer;
            Iterator it3 = it2;
            int i = setmaxcardelevation.read;
            boolean z3 = setmaxcardelevation.MediaMetadataCompat;
            boolean z4 = z2;
            setBrightness setbrightness8 = setbrightness4;
            android.graphics.Matrix matrix2 = new android.graphics.Matrix(setbrightness6.MediaSessionCompatQueueItem);
            RectF rectF = new RectF(rect2);
            get getVar3 = getVar2;
            android.util.Size size2 = setmaxcardelevation.serializer;
            HashMap map4 = map3;
            matrix2.postConcat(MediaStoreVideoCannotWrite.IconCompatParcelizer(rectF, MediaStoreVideoCannotWrite.read(size2), i, z3));
            coil3.util.UtilsKt.serializer(MediaStoreVideoCannotWrite.IconCompatParcelizer(MediaStoreVideoCannotWrite.read(MediaStoreVideoCannotWrite.write(rect2), i), false, size2));
            setBrightness setbrightness9 = setbrightness7;
            android.graphics.Rect rect3 = new android.graphics.Rect(0, 0, size2.getWidth(), size2.getHeight());
            RepeatingStreamConstraintForVideoRecordingQuirk repeatingStreamConstraintForVideoRecordingQuirk = setbrightness6.MediaSessionCompatResultReceiverWrapper.read();
            repeatingStreamConstraintForVideoRecordingQuirk.serializer = size2;
            viewRootForInspectorDefaultImpls.put(getcardbackgroundcolor, new setBrightness(setmaxcardelevation.write, setmaxcardelevation.IconCompatParcelizer, repeatingStreamConstraintForVideoRecordingQuirk.read(), matrix2, false, rect3, setbrightness6.MediaDescriptionCompat - i, -1, setbrightness6.MediaMetadataCompat != z3));
            it2 = it3;
            z2 = z4;
            getVar2 = getVar3;
            map3 = map4;
            setbrightness7 = setbrightness9;
            setbrightness4 = setbrightness8;
        }
        setBrightness setbrightness10 = setbrightness7;
        boolean z5 = z2;
        HashMap map5 = map3;
        setBrightness setbrightness11 = setbrightness4;
        get getVar4 = getVar2;
        try {
            getcardelevation.IconCompatParcelizer(setbrightness6.RemoteActionCompatParcelizer((ImageCapture1) dropShadowEffect.RatingCompat, true));
        } catch (androidx.camera.core.ProcessingException e) {
            setInflatedId.read("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
        try {
            getcardelevation.IconCompatParcelizer(setbrightness10.RemoteActionCompatParcelizer((ImageCapture1) dropShadowEffect.write, false));
        } catch (androidx.camera.core.ProcessingException e2) {
            setInflatedId.read("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e2);
        }
        ImageCapture1 imageCapture2 = (ImageCapture1) dropShadowEffect.RatingCompat;
        ImageCapture1 imageCapture3 = (ImageCapture1) dropShadowEffect.write;
        for (Map.Entry entry2 : ((ViewRootForInspectorDefaultImpls) dropShadowEffect.serializer).entrySet()) {
            dropShadowEffect.read(imageCapture2, imageCapture3, setbrightness6, setbrightness10, entry2);
            ((setBrightness) entry2.getValue()).read(new setAutoSizeTextTypeUniformWithPresetSizes(dropShadowEffect, imageCapture2, imageCapture3, setbrightness6, setbrightness10, entry2, 3));
        }
        ViewRootForInspectorDefaultImpls viewRootForInspectorDefaultImpls2 = (ViewRootForInspectorDefaultImpls) dropShadowEffect.serializer;
        HashMap map6 = new HashMap();
        for (Map.Entry entry3 : map5.entrySet()) {
            map6.put((androidx.camera.core.UseCase) entry3.getKey(), (setBrightness) viewRootForInspectorDefaultImpls2.get(entry3.getValue()));
        }
        getVar4.serializer(map6, getVar4.RemoteActionCompatParcelizer(setbrightness11, z5));
        Object[] objArr2 = {this.MediaDescriptionCompat.RemoteActionCompatParcelizer(), this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer()};
        ArrayList arrayList3 = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj2 = objArr2[i2];
            Objects.requireNonNull(obj2);
            arrayList3.add(obj2);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    @Override // androidx.camera.core.UseCase
    public final ImageUtilCodecFailedException IconCompatParcelizer(boolean z, Recorder3 recorder3) {
        put putVar = this.write;
        InitializationException initializationExceptionRemoteActionCompatParcelizer = recorder3.RemoteActionCompatParcelizer(putVar.write(), 1);
        if (z) {
            initializationExceptionRemoteActionCompatParcelizer = InitializationException.RemoteActionCompatParcelizer(initializationExceptionRemoteActionCompatParcelizer, putVar.read);
        }
        if (initializationExceptionRemoteActionCompatParcelizer == null) {
            return null;
        }
        return ((getOuterActionMenuPresenter) IconCompatParcelizer(initializationExceptionRemoteActionCompatParcelizer)).RemoteActionCompatParcelizer();
    }
}
