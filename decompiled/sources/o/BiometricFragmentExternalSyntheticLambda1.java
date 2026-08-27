package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BiometricFragmentExternalSyntheticLambda1 implements awaitNavigationRoutes {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ BiometricFragmentExternalSyntheticLambda1(int i, Object obj) {
        this.serializer = i;
        this.write = obj;
    }

    @Override // o.awaitNavigationRoutes
    public final void IconCompatParcelizer(mapToBase maptobase, CameraUseCaseAdapter cameraUseCaseAdapter) {
        int i = this.serializer;
        Object obj = this.write;
        if (i == 0) {
            AuthenticatorUtils authenticatorUtils = (AuthenticatorUtils) obj;
            if (authenticatorUtils.RatingCompat() == null) {
                return;
            }
            authenticatorUtils.write((DeferrableSurfaceSurfaceClosedException) authenticatorUtils.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, authenticatorUtils.MediaSessionCompatToken);
            authenticatorUtils.ParcelableVolumeInfo();
            return;
        }
        int i2 = 3;
        if (i == 1) {
            androidx.lifecycle.BlockRunner blockRunner = (androidx.lifecycle.BlockRunner) obj;
            blockRunner.serializer = blockRunner.RemoteActionCompatParcelizer();
            setLastBaselineToBottomHeight setlastbaselinetobottomheight = (setLastBaselineToBottomHeight) blockRunner.RemoteActionCompatParcelizer;
            if (setlastbaselinetobottomheight != null) {
                androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = setlastbaselinetobottomheight.IconCompatParcelizer;
                try {
                    if (((Boolean) coil3.util.UtilsKt.RemoteActionCompatParcelizer(new setLastBaselineToBottomHeight(camera2CameraImpl, i2)).serializer.get()).booleanValue()) {
                        androidx.lifecycle.BlockRunner blockRunner2 = camera2CameraImpl.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        mapToBase maptobase2 = (mapToBase) blockRunner2.serializer;
                        getSearchViewTextMinWidthDp getsearchviewtextminwidthdp = (getSearchViewTextMinWidthDp) blockRunner2.RatingCompat;
                        camera2CameraImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.execute(new setAutoSizeTextTypeUniformWithPresetSizes(camera2CameraImpl, androidx.camera.camera2.internal.Camera2CameraImpl.read(blockRunner2), maptobase2, getsearchviewtextminwidthdp, null, Collections.singletonList(VideoCapture.METERING_REPEATING), 2));
                        return;
                    }
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Unable to check if MeteringRepeating is attached.", e);
                    return;
                }
            }
            return;
        }
        if (i != 2) {
            if (i != 3) {
                ((androidx.camera.video.VideoCapture) obj).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                return;
            }
            Iterator it = ((nativeGetSurfaceInfo) obj).MediaBrowserCompatMediaItem.iterator();
            while (it.hasNext()) {
                ((awaitNavigationRoutes) it.next()).IconCompatParcelizer(maptobase, cameraUseCaseAdapter);
            }
            return;
        }
        setNavigationOnClickListener setnavigationonclicklistener = (setNavigationOnClickListener) obj;
        if (setnavigationonclicklistener.RatingCompat() == null) {
            return;
        }
        IncorrectCaptureStateQuirk incorrectCaptureStateQuirk = setnavigationonclicklistener.ParcelableVolumeInfo;
        incorrectCaptureStateQuirk.getClass();
        PrematureEndOfStreamVideoQuirk.write();
        incorrectCaptureStateQuirk.MediaMetadataCompat = true;
        ImageCaptureFailWithAutoFlashQuirk imageCaptureFailWithAutoFlashQuirk = incorrectCaptureStateQuirk.serializer;
        if (imageCaptureFailWithAutoFlashQuirk != null) {
            PrematureEndOfStreamVideoQuirk.write();
            if (!imageCaptureFailWithAutoFlashQuirk.serializer.serializer.isDone()) {
                androidx.camera.core.ImageCaptureException imageCaptureException = new androidx.camera.core.ImageCaptureException(3, "The request is aborted silently and retried.", null);
                PrematureEndOfStreamVideoQuirk.write();
                imageCaptureFailWithAutoFlashQuirk.MediaMetadataCompat = true;
                StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk = imageCaptureFailWithAutoFlashQuirk.read;
                Objects.requireNonNull(stretchedVideoResolutionQuirk);
                stretchedVideoResolutionQuirk.cancel(true);
                imageCaptureFailWithAutoFlashQuirk.RemoteActionCompatParcelizer.serializer(imageCaptureException);
                imageCaptureFailWithAutoFlashQuirk.write.RemoteActionCompatParcelizer(null);
                imageCaptureFailWithAutoFlashQuirk.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(imageCaptureFailWithAutoFlashQuirk.MediaDescriptionCompat);
            }
        }
        setnavigationonclicklistener.read(true);
        String strPlaybackStateCompatCustomAction = setnavigationonclicklistener.PlaybackStateCompatCustomAction();
        UseCase useCase = (UseCase) setnavigationonclicklistener.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = setnavigationonclicklistener.MediaSessionCompatToken;
        smallDisplaySizeQuirk.getClass();
        UseCaseAdditionSimulator useCaseAdditionSimulatorSerializer = setnavigationonclicklistener.serializer(strPlaybackStateCompatCustomAction, useCase, smallDisplaySizeQuirk);
        setnavigationonclicklistener.PlaybackStateCompat = useCaseAdditionSimulatorSerializer;
        Object[] objArr = {useCaseAdditionSimulatorSerializer.RemoteActionCompatParcelizer()};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        arrayList.add(obj2);
        setnavigationonclicklistener.RemoteActionCompatParcelizer(Collections.unmodifiableList(arrayList));
        setnavigationonclicklistener.ParcelableVolumeInfo();
        IncorrectCaptureStateQuirk incorrectCaptureStateQuirk2 = setnavigationonclicklistener.ParcelableVolumeInfo;
        incorrectCaptureStateQuirk2.getClass();
        PrematureEndOfStreamVideoQuirk.write();
        incorrectCaptureStateQuirk2.MediaMetadataCompat = false;
        incorrectCaptureStateQuirk2.IconCompatParcelizer();
    }
}
