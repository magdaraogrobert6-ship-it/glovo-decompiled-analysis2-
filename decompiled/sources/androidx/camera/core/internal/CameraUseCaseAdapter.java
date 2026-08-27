package androidx.camera.core.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.UseCase;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.CameraControlOperationCanceledException;
import o.CameraIdUtil;
import o.CameraInfoUnavailableException;
import o.CameraProviderInitRetryPolicy;
import o.CameraRepository;
import o.FocusMeteringAction;
import o.ImageCapture1;
import o.ImageCaptureMetadata;
import o.ImageCaptureWashedOutImageQuirk;
import o.ImageUtilCodecFailedException;
import o.InitializationException;
import o.InvalidVideoProfilesQuirk;
import o.JpegCaptureDownsizingQuirk;
import o.JpegHalCorruptImageQuirk;
import o.LruCache;
import o.PreviewPixelHDRnetQuirk;
import o.Recorder3;
import o.SmallDisplaySizeQuirk;
import o.SupportedSurfaceCombination;
import o.VideoCapture;
import o.accessgetGreencp;
import o.colorResource;
import o.getCameraProvider;
import o.getContentInsetStart;
import o.getImplementationMode;
import o.getNavButtonView;
import o.getOuterActionMenuPresenter;
import o.getOutputTransform;
import o.getPreviewStreamState;
import o.getQueryParameterslambda2;
import o.getScreenFlashInternal;
import o.mapToBase;
import o.play;
import o.setInflatedId;
import o.setScreenFlashUiInfo;
import o.valueOf;

/* JADX INFO: loaded from: classes.dex */
public final class CameraUseCaseAdapter implements getContentInsetStart {
    public final accessgetGreencp ComponentActivity;
    public final valueOf MediaBrowserCompatMediaItem;
    public final JpegHalCorruptImageQuirk MediaSessionCompatQueueItem;
    public final valueOf MediaSessionCompatToken;
    public UseCase ParcelableVolumeInfo;
    public final JpegHalCorruptImageQuirk PlaybackStateCompatCustomAction;
    public final Recorder3 ResultReceiver;
    public CameraIdUtil r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public LruCache r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final Camera2CameraCoordinator read;
    public final CameraControlOperationCanceledException serializer;
    public final getNavButtonView write;
    public final ArrayList RemoteActionCompatParcelizer = new ArrayList();
    public final ArrayList MediaDescriptionCompat = new ArrayList();
    public List RatingCompat = Collections.EMPTY_LIST;
    public Range MediaMetadataCompat = SmallDisplaySizeQuirk.RemoteActionCompatParcelizer;
    public final Object PlaybackStateCompat = new Object();
    public boolean IconCompatParcelizer = true;
    public InitializationException MediaSessionCompatResultReceiverWrapper = null;
    public final colorResource r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new colorResource(5);

    public static HashMap IconCompatParcelizer(ArrayList arrayList, Recorder3 recorder3, Recorder3 recorder4, Range range) {
        ImageUtilCodecFailedException imageUtilCodecFailedExceptionIconCompatParcelizer;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            if (useCase instanceof LruCache) {
                LruCache lruCache = (LruCache) useCase;
                ImageUtilCodecFailedException imageUtilCodecFailedExceptionIconCompatParcelizer2 = new getCameraProvider(0).IconCompatParcelizer().IconCompatParcelizer(false, recorder3);
                if (imageUtilCodecFailedExceptionIconCompatParcelizer2 == null) {
                    imageUtilCodecFailedExceptionIconCompatParcelizer = null;
                } else {
                    CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(imageUtilCodecFailedExceptionIconCompatParcelizer2);
                    cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.remove(getPreviewStreamState.MediaSessionCompatResultReceiverWrapper);
                    imageUtilCodecFailedExceptionIconCompatParcelizer = ((getOuterActionMenuPresenter) lruCache.IconCompatParcelizer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer)).RemoteActionCompatParcelizer();
                }
            } else {
                imageUtilCodecFailedExceptionIconCompatParcelizer = useCase.IconCompatParcelizer(false, recorder3);
            }
            ImageUtilCodecFailedException imageUtilCodecFailedExceptionIconCompatParcelizer3 = useCase.IconCompatParcelizer(true, recorder4);
            CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer2 = imageUtilCodecFailedExceptionIconCompatParcelizer3 != null ? CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(imageUtilCodecFailedExceptionIconCompatParcelizer3) : CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer2.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, 0);
            if (!SmallDisplaySizeQuirk.RemoteActionCompatParcelizer.equals(range)) {
                cameraProviderInitRetryPolicyRemoteActionCompatParcelizer2.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, play.HIGH_PRIORITY_REQUIRED, range);
                cameraProviderInitRetryPolicyRemoteActionCompatParcelizer2.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, Boolean.TRUE);
            }
            ImageUtilCodecFailedException imageUtilCodecFailedExceptionRemoteActionCompatParcelizer = useCase.IconCompatParcelizer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer2).RemoteActionCompatParcelizer();
            getImplementationMode getimplementationmode = new getImplementationMode();
            getimplementationmode.write = imageUtilCodecFailedExceptionIconCompatParcelizer;
            getimplementationmode.IconCompatParcelizer = imageUtilCodecFailedExceptionRemoteActionCompatParcelizer;
            map.put(useCase, getimplementationmode);
        }
        return map;
    }

    public static ArrayList serializer(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((UseCase) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it2);
            }
        }
        return arrayList2;
    }

    public static HashMap serializer(LinkedHashSet linkedHashSet, SupportedSurfaceCombination supportedSurfaceCombination) {
        HashMap map = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            map.put(useCase, useCase.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
            HashSet hashSet = null;
            LinkedHashSet linkedHashSet2 = supportedSurfaceCombination != null ? supportedSurfaceCombination.IconCompatParcelizer : null;
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            useCase.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = hashSet;
        }
        return map;
    }

    public final void IconCompatParcelizer() {
        synchronized (this.PlaybackStateCompat) {
            this.serializer.RemoteActionCompatParcelizer();
        }
    }

    public final void IconCompatParcelizer(ArrayList arrayList) {
        synchronized (this.PlaybackStateCompat) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((UseCase) it.next()).r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.RemoteActionCompatParcelizer);
            linkedHashSet.removeAll(arrayList);
            read(IconCompatParcelizer(linkedHashSet, this.PlaybackStateCompatCustomAction != null));
        }
    }

    public final void IconCompatParcelizer(Collection collection, SupportedSurfaceCombination supportedSurfaceCombination) {
        Objects.toString(collection);
        Objects.toString(supportedSurfaceCombination);
        setInflatedId.IconCompatParcelizer(3, "CameraUseCaseAdapter");
        synchronized (this.PlaybackStateCompat) {
            JpegHalCorruptImageQuirk jpegHalCorruptImageQuirk = this.MediaSessionCompatQueueItem;
            CameraControlOperationCanceledException cameraControlOperationCanceledException = this.serializer;
            jpegHalCorruptImageQuirk.write(cameraControlOperationCanceledException);
            JpegHalCorruptImageQuirk jpegHalCorruptImageQuirk2 = this.PlaybackStateCompatCustomAction;
            if (jpegHalCorruptImageQuirk2 != null) {
                jpegHalCorruptImageQuirk2.write(cameraControlOperationCanceledException);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.RemoteActionCompatParcelizer);
            linkedHashSet.addAll(collection);
            HashMap mapSerializer = serializer(linkedHashSet, supportedSurfaceCombination);
            try {
                read(IconCompatParcelizer(linkedHashSet, this.PlaybackStateCompatCustomAction != null));
            } catch (IllegalArgumentException e) {
                read(mapSerializer);
                throw new CameraException(e);
            }
        }
    }

    public final HashSet RemoteActionCompatParcelizer(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.PlaybackStateCompat) {
            Iterator it = this.RatingCompat.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            i = z ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            UseCase useCase = (UseCase) it2.next();
            UtilsKt.IconCompatParcelizer("Only support one level of sharing for now.", !(useCase instanceof LruCache));
            Iterator it3 = useCase.e_().iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Integer) it3.next()).intValue();
                if ((i & iIntValue) == iIntValue) {
                    hashSet.add(useCase);
                    break;
                }
            }
        }
        return hashSet;
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this.PlaybackStateCompat) {
            if (this.IconCompatParcelizer) {
                this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(new ArrayList(this.MediaDescriptionCompat));
                JpegHalCorruptImageQuirk jpegHalCorruptImageQuirk = this.PlaybackStateCompatCustomAction;
                if (jpegHalCorruptImageQuirk != null) {
                    jpegHalCorruptImageQuirk.RemoteActionCompatParcelizer(new ArrayList(this.MediaDescriptionCompat));
                }
                synchronized (this.PlaybackStateCompat) {
                    ImageCaptureWashedOutImageQuirk imageCaptureWashedOutImageQuirk = this.MediaSessionCompatQueueItem.serializer;
                    this.MediaSessionCompatResultReceiverWrapper = imageCaptureWashedOutImageQuirk.serializer.write();
                    imageCaptureWashedOutImageQuirk.serializer();
                }
                this.IconCompatParcelizer = false;
            }
        }
    }

    @Override // o.getContentInsetStart
    public final FocusMeteringAction ResultReceiver() {
        return this.MediaSessionCompatQueueItem.read;
    }

    @Override // o.getContentInsetStart
    public final ImageCaptureMetadata r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        return this.MediaSessionCompatQueueItem.serializer;
    }

    public final int read() {
        synchronized (this.PlaybackStateCompat) {
            return this.read.IconCompatParcelizer() == 2 ? 1 : 0;
        }
    }

    public final void read(getScreenFlashInternal getscreenflashinternal) {
        Map map = getscreenflashinternal.MediaBrowserCompatMediaItem.write;
        ArrayList<UseCase> arrayList = getscreenflashinternal.IconCompatParcelizer;
        synchronized (this.PlaybackStateCompat) {
            if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null && !arrayList.isEmpty()) {
                boolean z = this.MediaSessionCompatQueueItem.read.write.MediaBrowserCompatMediaItem() == 0;
                Rect rectMediaSessionCompatQueueItem = this.MediaSessionCompatQueueItem.read.write.MediaSessionCompatQueueItem();
                CameraIdUtil cameraIdUtil = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                Rational rational = cameraIdUtil.serializer;
                int iRemoteActionCompatParcelizer = this.MediaSessionCompatQueueItem.read.write.RemoteActionCompatParcelizer(cameraIdUtil.write);
                CameraIdUtil cameraIdUtil2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                HashMap mapRemoteActionCompatParcelizer = getOutputTransform.RemoteActionCompatParcelizer(rectMediaSessionCompatQueueItem, z, rational, iRemoteActionCompatParcelizer, cameraIdUtil2.IconCompatParcelizer, cameraIdUtil2.read, map);
                for (UseCase useCase : arrayList) {
                    Rect rect = (Rect) mapRemoteActionCompatParcelizer.get(useCase);
                    rect.getClass();
                    useCase.write(rect);
                }
            }
            for (UseCase useCase2 : arrayList) {
                Rect rectMediaSessionCompatQueueItem2 = this.MediaSessionCompatQueueItem.read.write.MediaSessionCompatQueueItem();
                SmallDisplaySizeQuirk smallDisplaySizeQuirk = (SmallDisplaySizeQuirk) map.get(useCase2);
                smallDisplaySizeQuirk.getClass();
                useCase2.IconCompatParcelizer(read(rectMediaSessionCompatQueueItem2, smallDisplaySizeQuirk.MediaMetadataCompat));
            }
        }
        List list = this.RatingCompat;
        ArrayList arrayList2 = getscreenflashinternal.IconCompatParcelizer;
        LinkedHashSet linkedHashSet = getscreenflashinternal.RemoteActionCompatParcelizer;
        ArrayList arrayListSerializer = serializer(arrayList2, list);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList arrayListSerializer2 = serializer(arrayList3, arrayListSerializer);
        if (!arrayListSerializer2.isEmpty()) {
            setInflatedId.read("CameraUseCaseAdapter", "Unused effects: " + arrayListSerializer2);
        }
        Iterator it = getscreenflashinternal.read.iterator();
        while (it.hasNext()) {
            ((UseCase) it.next()).RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem);
        }
        this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(getscreenflashinternal.read);
        if (this.PlaybackStateCompatCustomAction != null) {
            for (UseCase useCase3 : getscreenflashinternal.read) {
                JpegHalCorruptImageQuirk jpegHalCorruptImageQuirk = this.PlaybackStateCompatCustomAction;
                Objects.requireNonNull(jpegHalCorruptImageQuirk);
                useCase3.RemoteActionCompatParcelizer(jpegHalCorruptImageQuirk);
            }
            JpegHalCorruptImageQuirk jpegHalCorruptImageQuirk2 = this.PlaybackStateCompatCustomAction;
            Objects.requireNonNull(jpegHalCorruptImageQuirk2);
            jpegHalCorruptImageQuirk2.RemoteActionCompatParcelizer(getscreenflashinternal.read);
        }
        if (getscreenflashinternal.read.isEmpty()) {
            for (UseCase useCase4 : getscreenflashinternal.serializer) {
                Map map2 = getscreenflashinternal.MediaBrowserCompatMediaItem.write;
                if (map2.containsKey(useCase4)) {
                    SmallDisplaySizeQuirk smallDisplaySizeQuirk2 = (SmallDisplaySizeQuirk) map2.get(useCase4);
                    Objects.requireNonNull(smallDisplaySizeQuirk2);
                    InitializationException initializationException = smallDisplaySizeQuirk2.serializer;
                    if (initializationException != null) {
                        mapToBase maptobase = useCase4.MediaSessionCompatResultReceiverWrapper;
                        CameraRepository cameraRepository = maptobase.MediaDescriptionCompat.MediaDescriptionCompat;
                        Objects.requireNonNull(initializationException);
                        if (initializationException.MediaBrowserCompatMediaItem().size() == maptobase.MediaDescriptionCompat.MediaDescriptionCompat.MediaBrowserCompatMediaItem().size()) {
                            Iterator it2 = initializationException.MediaBrowserCompatMediaItem().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = (JpegCaptureDownsizingQuirk) it2.next();
                                    if (!cameraRepository.RemoteActionCompatParcelizer.containsKey(jpegCaptureDownsizingQuirk) || !Objects.equals(cameraRepository.write(jpegCaptureDownsizingQuirk), initializationException.write(jpegCaptureDownsizingQuirk))) {
                                    }
                                }
                            }
                        }
                        useCase4.MediaSessionCompatToken = useCase4.RemoteActionCompatParcelizer(initializationException);
                        if (this.IconCompatParcelizer) {
                            this.MediaSessionCompatQueueItem.read(useCase4);
                            JpegHalCorruptImageQuirk jpegHalCorruptImageQuirk3 = this.PlaybackStateCompatCustomAction;
                            if (jpegHalCorruptImageQuirk3 != null) {
                                jpegHalCorruptImageQuirk3.read(useCase4);
                            }
                        }
                    }
                }
            }
        }
        for (UseCase useCase5 : getscreenflashinternal.write) {
            getImplementationMode getimplementationmode = (getImplementationMode) getscreenflashinternal.MediaSessionCompatQueueItem.get(useCase5);
            Objects.requireNonNull(getimplementationmode);
            JpegHalCorruptImageQuirk jpegHalCorruptImageQuirk4 = this.PlaybackStateCompatCustomAction;
            JpegHalCorruptImageQuirk jpegHalCorruptImageQuirk5 = this.MediaSessionCompatQueueItem;
            ImageUtilCodecFailedException imageUtilCodecFailedException = getimplementationmode.write;
            if (jpegHalCorruptImageQuirk4 != null) {
                useCase5.RemoteActionCompatParcelizer(jpegHalCorruptImageQuirk5, jpegHalCorruptImageQuirk4, imageUtilCodecFailedException, getimplementationmode.IconCompatParcelizer);
                SmallDisplaySizeQuirk smallDisplaySizeQuirk3 = (SmallDisplaySizeQuirk) getscreenflashinternal.MediaBrowserCompatMediaItem.write.get(useCase5);
                smallDisplaySizeQuirk3.getClass();
                setScreenFlashUiInfo setscreenflashuiinfo = getscreenflashinternal.RatingCompat;
                setscreenflashuiinfo.getClass();
                useCase5.MediaSessionCompatToken = useCase5.write(smallDisplaySizeQuirk3, (SmallDisplaySizeQuirk) setscreenflashuiinfo.write.get(useCase5));
            } else {
                useCase5.RemoteActionCompatParcelizer(jpegHalCorruptImageQuirk5, null, imageUtilCodecFailedException, getimplementationmode.IconCompatParcelizer);
                SmallDisplaySizeQuirk smallDisplaySizeQuirk4 = (SmallDisplaySizeQuirk) getscreenflashinternal.MediaBrowserCompatMediaItem.write.get(useCase5);
                smallDisplaySizeQuirk4.getClass();
                useCase5.MediaSessionCompatToken = useCase5.write(smallDisplaySizeQuirk4, null);
            }
        }
        if (this.IconCompatParcelizer) {
            this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer((Collection) getscreenflashinternal.write);
            JpegHalCorruptImageQuirk jpegHalCorruptImageQuirk6 = this.PlaybackStateCompatCustomAction;
            if (jpegHalCorruptImageQuirk6 != null) {
                jpegHalCorruptImageQuirk6.RemoteActionCompatParcelizer((Collection) getscreenflashinternal.write);
            }
        }
        Iterator it3 = getscreenflashinternal.write.iterator();
        while (it3.hasNext()) {
            ((UseCase) it3.next()).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        }
        this.RemoteActionCompatParcelizer.clear();
        this.RemoteActionCompatParcelizer.addAll(getscreenflashinternal.RemoteActionCompatParcelizer);
        this.MediaDescriptionCompat.clear();
        this.MediaDescriptionCompat.addAll(getscreenflashinternal.IconCompatParcelizer);
        this.ParcelableVolumeInfo = getscreenflashinternal.MediaMetadataCompat;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getscreenflashinternal.MediaDescriptionCompat;
    }

    public final List serializer() {
        ArrayList arrayList;
        synchronized (this.PlaybackStateCompat) {
            arrayList = new ArrayList(this.RemoteActionCompatParcelizer);
        }
        return arrayList;
    }

    public final void write() {
        synchronized (this.PlaybackStateCompat) {
            if (!this.IconCompatParcelizer) {
                if (!this.MediaDescriptionCompat.isEmpty()) {
                    this.MediaSessionCompatQueueItem.write(this.serializer);
                    JpegHalCorruptImageQuirk jpegHalCorruptImageQuirk = this.PlaybackStateCompatCustomAction;
                    if (jpegHalCorruptImageQuirk != null) {
                        jpegHalCorruptImageQuirk.write(this.serializer);
                    }
                }
                this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer((Collection) this.MediaDescriptionCompat);
                JpegHalCorruptImageQuirk jpegHalCorruptImageQuirk2 = this.PlaybackStateCompatCustomAction;
                if (jpegHalCorruptImageQuirk2 != null) {
                    jpegHalCorruptImageQuirk2.RemoteActionCompatParcelizer((Collection) this.MediaDescriptionCompat);
                }
                synchronized (this.PlaybackStateCompat) {
                    InitializationException initializationException = this.MediaSessionCompatResultReceiverWrapper;
                    if (initializationException != null) {
                        this.MediaSessionCompatQueueItem.serializer.IconCompatParcelizer(initializationException);
                    }
                }
                Iterator it = this.MediaDescriptionCompat.iterator();
                while (it.hasNext()) {
                    ((UseCase) it.next()).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                }
                this.IconCompatParcelizer = true;
            }
        }
    }

    public static boolean IconCompatParcelizer(UseCase useCase) {
        if (useCase != null) {
            if (useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(ImageUtilCodecFailedException.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus)) {
                return useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write() == VideoCapture.VIDEO_CAPTURE;
            }
            SentryLogcatAdapter.serializer("CameraUseCaseAdapter", useCase + " UseCase does not have capture type.");
        }
        return false;
    }

    public static void read(HashMap map) {
        HashSet hashSet;
        for (Map.Entry entry : map.entrySet()) {
            UseCase useCase = (UseCase) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                useCase.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            useCase.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = hashSet;
        }
    }

    /* JADX WARN: Code duplicated, block: B:177:0x02c7  */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0159, code lost:
    
        if (r6 != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015f, code lost:
    
        return IconCompatParcelizer(r26, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.getScreenFlashInternal IconCompatParcelizer(java.util.LinkedHashSet r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.CameraUseCaseAdapter.IconCompatParcelizer(java.util.LinkedHashSet, boolean):o.getScreenFlashInternal");
    }

    public CameraUseCaseAdapter(ImageCapture1 imageCapture1, ImageCapture1 imageCapture2, InvalidVideoProfilesQuirk invalidVideoProfilesQuirk, InvalidVideoProfilesQuirk invalidVideoProfilesQuirk2, valueOf valueof, valueOf valueof2, Camera2CameraCoordinator camera2CameraCoordinator, accessgetGreencp accessgetgreencp, Recorder3 recorder3) {
        CameraControlOperationCanceledException cameraControlOperationCanceledException = invalidVideoProfilesQuirk.IconCompatParcelizer;
        this.serializer = cameraControlOperationCanceledException;
        this.MediaSessionCompatQueueItem = new JpegHalCorruptImageQuirk(imageCapture1, invalidVideoProfilesQuirk);
        if (imageCapture2 == null || invalidVideoProfilesQuirk2 == null) {
            this.PlaybackStateCompatCustomAction = null;
        } else {
            this.PlaybackStateCompatCustomAction = new JpegHalCorruptImageQuirk(imageCapture2, invalidVideoProfilesQuirk2);
        }
        this.MediaBrowserCompatMediaItem = valueof;
        this.MediaSessionCompatToken = valueof2;
        this.read = camera2CameraCoordinator;
        this.ResultReceiver = recorder3;
        String str = invalidVideoProfilesQuirk2 != null ? invalidVideoProfilesQuirk2.write.read() : null;
        PreviewPixelHDRnetQuirk previewPixelHDRnetQuirk = ((CameraInfoUnavailableException) cameraControlOperationCanceledException).RatingCompat;
        previewPixelHDRnetQuirk.getClass();
        String str2 = invalidVideoProfilesQuirk.write.read();
        str2.getClass();
        int iSerializer = getQueryParameterslambda2.serializer();
        ArrayList arrayList = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new String[]{str2}}, getQueryParameterslambda2.serializer(), 866125100, iSerializer);
        if (str != null) {
            arrayList.add(str);
        }
        this.write = new getNavButtonView(arrayList, previewPixelHDRnetQuirk);
        this.ComponentActivity = accessgetgreencp;
    }

    public static Matrix read(Rect rect, Size size) {
        UtilsKt.IconCompatParcelizer("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public final class CameraException extends Exception {
        public CameraException(Throwable th) {
            super(th);
        }
    }
}
