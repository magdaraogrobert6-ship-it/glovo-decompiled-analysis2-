package o;

import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class get implements Camera2CapturePipelineScreenFlashTask {
    public final HashSet IconCompatParcelizer;
    public final ImageCapture1 MediaBrowserCompatMediaItem;
    public final store MediaDescriptionCompat;
    public final Recorder3 MediaSessionCompatToken;
    public final store PlaybackStateCompatCustomAction;
    public final ImageCapture1 RatingCompat;
    public final HashMap RemoteActionCompatParcelizer;
    public final HashSet serializer;
    public final HashMap write = new HashMap();
    public final HashMap MediaSessionCompatQueueItem = new HashMap();
    public final HashMap read = new HashMap();
    public final setOnInflateListener MediaMetadataCompat = new setOnInflateListener(this);

    public final boolean MediaSessionCompatQueueItem(androidx.camera.core.UseCase useCase) {
        Boolean bool = (Boolean) this.read.get(useCase);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final setBrightness RatingCompat(androidx.camera.core.UseCase useCase) {
        setBrightness setbrightness = (setBrightness) this.write.get(useCase);
        Objects.requireNonNull(setbrightness);
        return setbrightness;
    }

    public final HashMap RemoteActionCompatParcelizer(setBrightness setbrightness, boolean z) {
        HashMap map = new HashMap();
        for (androidx.camera.core.UseCase useCase : this.IconCompatParcelizer) {
            ImageUtilCodecFailedException imageUtilCodecFailedException = (ImageUtilCodecFailedException) this.RemoteActionCompatParcelizer.get(useCase);
            Objects.requireNonNull(imageUtilCodecFailedException);
            android.util.Size size = this.MediaDescriptionCompat.read(imageUtilCodecFailedException, setbrightness.write, MediaStoreVideoCannotWrite.write(setbrightness.MediaSessionCompatQueueItem), z).serializer;
            map.put(useCase, size);
            Objects.toString(size);
            Objects.toString(useCase);
            setInflatedId.IconCompatParcelizer(3, "VirtualCameraAdapter");
        }
        return map;
    }

    public final void serializer(HashMap map, HashMap map2) {
        HashMap map3 = this.write;
        map3.clear();
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            androidx.camera.core.UseCase useCase = (androidx.camera.core.UseCase) entry.getKey();
            setBrightness setbrightness = (setBrightness) entry.getValue();
            useCase.write(setbrightness.write);
            useCase.IconCompatParcelizer(setbrightness.MediaSessionCompatQueueItem);
            RepeatingStreamConstraintForVideoRecordingQuirk repeatingStreamConstraintForVideoRecordingQuirk = setbrightness.MediaSessionCompatResultReceiverWrapper.read();
            android.util.Size size = (android.util.Size) map2.get(useCase);
            if (size != null) {
                repeatingStreamConstraintForVideoRecordingQuirk.read = size;
            }
            useCase.MediaSessionCompatToken = useCase.write(repeatingStreamConstraintForVideoRecordingQuirk.read(), null);
            useCase.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        }
    }

    public static void serializer(setBrightness setbrightness, PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0, mapToBase maptobase) {
        setbrightness.serializer();
        try {
            PrematureEndOfStreamVideoQuirk.write();
            setbrightness.write();
            SurfaceViewStretchedQuirk surfaceViewStretchedQuirk = setbrightness.MediaSessionCompatToken;
            Objects.requireNonNull(surfaceViewStretchedQuirk);
            surfaceViewStretchedQuirk.IconCompatParcelizer(previewExternalSyntheticLambda0, new onAnimationEnd(surfaceViewStretchedQuirk, 1));
        } catch (DeferrableSurface$SurfaceClosedException unused) {
            awaitNavigationRoutes awaitnavigationroutes = maptobase.RemoteActionCompatParcelizer;
            if (awaitnavigationroutes != null) {
                awaitnavigationroutes.IconCompatParcelizer(maptobase, CameraUseCaseAdapter.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    @Override // o.Camera2CapturePipelineScreenFlashTask
    public final void IconCompatParcelizer(androidx.camera.core.UseCase useCase) {
        PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0Write;
        PrematureEndOfStreamVideoQuirk.write();
        setBrightness setbrightnessRatingCompat = RatingCompat(useCase);
        if (MediaSessionCompatQueueItem(useCase) && (previewExternalSyntheticLambda0Write = write(useCase)) != null) {
            serializer(setbrightnessRatingCompat, previewExternalSyntheticLambda0Write, useCase.MediaSessionCompatResultReceiverWrapper);
        }
    }

    @Override // o.Camera2CapturePipelineScreenFlashTask
    public final void RemoteActionCompatParcelizer(androidx.camera.core.UseCase useCase) {
        PrematureEndOfStreamVideoQuirk.write();
        if (MediaSessionCompatQueueItem(useCase)) {
            this.read.put(useCase, Boolean.FALSE);
            setBrightness setbrightnessRatingCompat = RatingCompat(useCase);
            PrematureEndOfStreamVideoQuirk.write();
            setbrightnessRatingCompat.write();
            setbrightnessRatingCompat.MediaSessionCompatToken.write();
        }
    }

    @Override // o.Camera2CapturePipelineScreenFlashTask
    public final void read(androidx.camera.core.UseCase useCase) {
        PrematureEndOfStreamVideoQuirk.write();
        if (MediaSessionCompatQueueItem(useCase)) {
            setBrightness setbrightnessRatingCompat = RatingCompat(useCase);
            PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0Write = write(useCase);
            if (previewExternalSyntheticLambda0Write != null) {
                serializer(setbrightnessRatingCompat, previewExternalSyntheticLambda0Write, useCase.MediaSessionCompatResultReceiverWrapper);
                return;
            }
            PrematureEndOfStreamVideoQuirk.write();
            setbrightnessRatingCompat.write();
            setbrightnessRatingCompat.MediaSessionCompatToken.write();
        }
    }

    @Override // o.Camera2CapturePipelineScreenFlashTask
    public final void serializer(androidx.camera.core.UseCase useCase) {
        PrematureEndOfStreamVideoQuirk.write();
        if (MediaSessionCompatQueueItem(useCase)) {
            return;
        }
        this.read.put(useCase, Boolean.TRUE);
        PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0Write = write(useCase);
        if (previewExternalSyntheticLambda0Write != null) {
            serializer(RatingCompat(useCase), previewExternalSyntheticLambda0Write, useCase.MediaSessionCompatResultReceiverWrapper);
        }
    }

    public static PreviewExternalSyntheticLambda0 write(androidx.camera.core.UseCase useCase) {
        List listRemoteActionCompatParcelizer = useCase instanceof setNavigationOnClickListener ? useCase.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer() : Collections.unmodifiableList(useCase.MediaSessionCompatResultReceiverWrapper.MediaDescriptionCompat.MediaBrowserCompatMediaItem);
        coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, listRemoteActionCompatParcelizer.size() <= 1);
        if (listRemoteActionCompatParcelizer.size() == 1) {
            return (PreviewExternalSyntheticLambda0) listRemoteActionCompatParcelizer.get(0);
        }
        return null;
    }

    public final setMaxCardElevation RemoteActionCompatParcelizer(androidx.camera.core.UseCase useCase, store storeVar, ImageCapture1 imageCapture1, setBrightness setbrightness, int i, boolean z) {
        int i2;
        int iRemoteActionCompatParcelizer = imageCapture1.ResultReceiver().RemoteActionCompatParcelizer(i);
        boolean z2 = MediaStoreVideoCannotWrite.read(setbrightness.MediaSessionCompatQueueItem);
        ImageUtilCodecFailedException imageUtilCodecFailedException = (ImageUtilCodecFailedException) this.RemoteActionCompatParcelizer.get(useCase);
        Objects.requireNonNull(imageUtilCodecFailedException);
        updatePushToken updatepushtoken = storeVar.read(imageUtilCodecFailedException, setbrightness.write, MediaStoreVideoCannotWrite.write(setbrightness.MediaSessionCompatQueueItem), z);
        android.graphics.Rect rect = updatepushtoken.write;
        android.util.Size size = updatepushtoken.IconCompatParcelizer;
        int iRemoteActionCompatParcelizer2 = MediaStoreVideoCannotWrite.RemoteActionCompatParcelizer((setbrightness.MediaDescriptionCompat + imageCapture1.ResultReceiver().RemoteActionCompatParcelizer(((getImageFormatdefault) useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).write(0))) - iRemoteActionCompatParcelizer);
        boolean zWrite = useCase.write(imageCapture1);
        if (useCase instanceof AuthenticatorUtils) {
            i2 = 1;
        } else {
            i2 = useCase instanceof setNavigationOnClickListener ? 4 : 2;
        }
        return new setMaxCardElevation(UUID.randomUUID(), i2, useCase instanceof setNavigationOnClickListener ? androidx.compose.ui.graphics.Fields.RotationX : 34, rect, MediaStoreVideoCannotWrite.read(size, iRemoteActionCompatParcelizer2), iRemoteActionCompatParcelizer2, zWrite ^ z2);
    }

    public get(ImageCapture1 imageCapture1, ImageCapture1 imageCapture2, HashSet hashSet, Recorder3 recorder3, StreamSharing$$ExternalSyntheticLambda0 streamSharing$$ExternalSyntheticLambda0) {
        this.RatingCompat = imageCapture1;
        this.MediaBrowserCompatMediaItem = imageCapture2;
        this.MediaSessionCompatToken = recorder3;
        this.IconCompatParcelizer = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            androidx.camera.core.UseCase useCase = (androidx.camera.core.UseCase) it.next();
            map.put(useCase, useCase.read(imageCapture1.MediaMetadataCompat(), null, useCase.IconCompatParcelizer(true, recorder3)));
        }
        this.RemoteActionCompatParcelizer = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.serializer = hashSet2;
        this.MediaDescriptionCompat = new store(imageCapture1, hashSet2);
        ImageCapture1 imageCapture3 = this.MediaBrowserCompatMediaItem;
        if (imageCapture3 != null) {
            this.PlaybackStateCompatCustomAction = new store(imageCapture3, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            androidx.camera.core.UseCase useCase2 = (androidx.camera.core.UseCase) it2.next();
            this.read.put(useCase2, Boolean.FALSE);
            this.MediaSessionCompatQueueItem.put(useCase2, new create(imageCapture1, this, streamSharing$$ExternalSyntheticLambda0));
        }
    }
}
