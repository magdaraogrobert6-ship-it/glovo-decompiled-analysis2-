package o;

import android.content.Context;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class getExtendedTouchPaddinghWWAJMo extends TransitionState {
    public accessisRenderNodeCompatiblecp accessensureViewModelStore;

    @Override // o.TransitionState
    public final maxIntrinsicHeight MediaBrowserCompatMediaItem() {
        androidx.camera.core.UseCaseGroup useCaseGroup;
        if (this.accessensureViewModelStore != null && this.serializer != null) {
            if (!serializer() || this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null || this._init_lambda4 == null) {
                setInflatedId.IconCompatParcelizer(3, "CameraController");
                useCaseGroup = null;
            } else {
                if (serializer()) {
                    this.serializer.write(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.PlaybackStateCompat, this.PlaybackStateCompatCustomAction, this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
                }
                Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda1 camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda1 = new Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda1();
                AuthenticatorUtils authenticatorUtils = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                ArrayList arrayList = camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda1.read;
                arrayList.add(authenticatorUtils);
                PrematureEndOfStreamVideoQuirk.write();
                if ((this.MediaSessionCompatQueueItem & 1) != 0) {
                    arrayList.add(this.PlaybackStateCompat);
                }
                PrematureEndOfStreamVideoQuirk.write();
                if ((2 & this.MediaSessionCompatQueueItem) != 0) {
                    arrayList.add(this.PlaybackStateCompatCustomAction);
                }
                PrematureEndOfStreamVideoQuirk.write();
                camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda1.serializer = this._init_lambda4;
                Iterator it = this.RatingCompat.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    ArrayList arrayList2 = camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda1.RemoteActionCompatParcelizer;
                    if (!zHasNext) {
                        coil3.util.UtilsKt.IconCompatParcelizer("UseCase must not be empty.", !arrayList.isEmpty());
                        Iterator it2 = arrayList2.iterator();
                        if (!it2.hasNext()) {
                            useCaseGroup = new androidx.camera.core.UseCaseGroup(camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda1.serializer, arrayList, arrayList2);
                            break;
                        }
                        throw ff$$ExternalSyntheticOutline0.m(it2);
                    }
                    if (it.next() != null) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                        return null;
                    }
                    arrayList2.add(null);
                }
            }
            if (useCaseGroup != null) {
                try {
                    return this.serializer.read(this.accessensureViewModelStore, this.MediaBrowserCompatMediaItem, useCaseGroup);
                } catch (IllegalArgumentException e) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e);
                    return null;
                }
            }
        }
        return null;
    }

    public getExtendedTouchPaddinghWWAJMo(Context context) {
        super(context);
    }
}
