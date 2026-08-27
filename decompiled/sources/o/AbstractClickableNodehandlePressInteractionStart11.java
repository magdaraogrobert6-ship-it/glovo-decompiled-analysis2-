package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.android.gms.net.zza;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class AbstractClickableNodehandlePressInteractionStart11 implements CameraValidatorCameraIdListIncorrectException {
    public pullTopk4lQ0M IconCompatParcelizer;
    public final BackgroundKt MediaBrowserCompatMediaItem;
    public boolean RemoteActionCompatParcelizer = false;
    public final FocusMeteringAction read;
    public VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk serializer;
    public final AndroidGraphicsContext2 write;

    public final void write(pullTopk4lQ0M pulltopk4lq0m) {
        synchronized (this) {
            if (this.IconCompatParcelizer.equals(pulltopk4lq0m)) {
                return;
            }
            this.IconCompatParcelizer = pulltopk4lq0m;
            Objects.toString(pulltopk4lq0m);
            setInflatedId.IconCompatParcelizer(3, "StreamStateObserver");
            this.write.serializer(pulltopk4lq0m);
        }
    }

    public AbstractClickableNodehandlePressInteractionStart11(FocusMeteringAction focusMeteringAction, AndroidGraphicsContext2 androidGraphicsContext2, BackgroundKt backgroundKt) {
        this.read = focusMeteringAction;
        this.write = androidGraphicsContext2;
        this.MediaBrowserCompatMediaItem = backgroundKt;
        synchronized (this) {
            this.IconCompatParcelizer = (pullTopk4lQ0M) androidGraphicsContext2.IconCompatParcelizer();
        }
    }

    @Override // o.CameraValidatorCameraIdListIncorrectException
    public final void IconCompatParcelizer(Object obj) {
        nativeConvertAndroid420ToABGR nativeconvertandroid420toabgr = (nativeConvertAndroid420ToABGR) obj;
        if (nativeconvertandroid420toabgr == nativeConvertAndroid420ToABGR.CLOSING || nativeconvertandroid420toabgr == nativeConvertAndroid420ToABGR.CLOSED || nativeconvertandroid420toabgr == nativeConvertAndroid420ToABGR.RELEASING || nativeconvertandroid420toabgr == nativeConvertAndroid420ToABGR.RELEASED) {
            write(pullTopk4lQ0M.IDLE);
            if (this.RemoteActionCompatParcelizer) {
                this.RemoteActionCompatParcelizer = false;
                VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk = this.serializer;
                if (videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk != null) {
                    videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.cancel(false);
                    this.serializer = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((nativeconvertandroid420toabgr == nativeConvertAndroid420ToABGR.OPENING || nativeconvertandroid420toabgr == nativeConvertAndroid420ToABGR.OPEN || nativeconvertandroid420toabgr == nativeConvertAndroid420ToABGR.PENDING_OPEN) && !this.RemoteActionCompatParcelizer) {
            FocusMeteringAction focusMeteringAction = this.read;
            write(pullTopk4lQ0M.IDLE);
            ArrayList arrayList = new ArrayList();
            onDrawWithContent ondrawwithcontent = new onDrawWithContent();
            ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
            onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
            ondrawwithcontent.read = ondrawbehind;
            ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
            try {
                AbstractClickableNodeonPointerEvent1 abstractClickableNodeonPointerEvent1 = new AbstractClickableNodeonPointerEvent1(ondrawwithcontent, focusMeteringAction);
                arrayList.add(abstractClickableNodeonPointerEvent1);
                focusMeteringAction.serializer(removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read(), abstractClickableNodeonPointerEvent1);
                ondrawwithcontent.RemoteActionCompatParcelizer = "waitForCaptureResult";
            } catch (Exception e) {
                ondrawbehind.write(e);
            }
            StretchedVideoResolutionQuirk stretchedVideoResolutionQuirkSerializer = VideoQualityQuirk.serializer(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.IconCompatParcelizer(ondrawbehind), new AbstractClickableNodehandlePressInteractionStart12(this), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
            AbstractClickableNodehandlePressInteractionStart12 abstractClickableNodehandlePressInteractionStart12 = new AbstractClickableNodehandlePressInteractionStart12(this);
            StretchedVideoResolutionQuirk stretchedVideoResolutionQuirkSerializer2 = VideoQualityQuirk.serializer(stretchedVideoResolutionQuirkSerializer, new androidx.camera.view.PendingValue(5, abstractClickableNodehandlePressInteractionStart12), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
            this.serializer = stretchedVideoResolutionQuirkSerializer2;
            androidx.navigation.NavArgsLazy navArgsLazy = new androidx.navigation.NavArgsLazy(14, this, arrayList, focusMeteringAction, false);
            stretchedVideoResolutionQuirkSerializer2.RemoteActionCompatParcelizer(new zza(stretchedVideoResolutionQuirkSerializer2, 1, navArgsLazy), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
            this.RemoteActionCompatParcelizer = true;
        }
    }

    @Override // o.CameraValidatorCameraIdListIncorrectException
    public final void IconCompatParcelizer(Throwable th) {
        VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk = this.serializer;
        if (videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk != null) {
            videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.cancel(false);
            this.serializer = null;
        }
        write(pullTopk4lQ0M.IDLE);
    }
}
