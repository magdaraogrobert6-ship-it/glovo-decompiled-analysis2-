package o;

import android.view.Surface;
import androidx.camera.video.Recorder$3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CrossfadeKtCrossfade51alpha2 implements SpringSimulation, obtainShadowContext {
    public final /* synthetic */ AnimatedVisibilityKtAnimatedVisibilityImpl11 serializer;

    public /* synthetic */ CrossfadeKtCrossfade51alpha2(AnimatedVisibilityKtAnimatedVisibilityImpl11 animatedVisibilityKtAnimatedVisibilityImpl11) {
        this.serializer = animatedVisibilityKtAnimatedVisibilityImpl11;
    }

    @Override // o.SpringSimulation
    public void RemoteActionCompatParcelizer(Surface surface) {
        this.serializer.IconCompatParcelizer(surface);
    }

    @Override // o.obtainShadowContext
    public Object serializer(onDrawWithContent ondrawwithcontent) {
        AnimatedVisibilityKtAnimatedVisibilityImpl11 animatedVisibilityKtAnimatedVisibilityImpl11 = this.serializer;
        androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = animatedVisibilityKtAnimatedVisibilityImpl11._init_lambda1;
        Recorder$3 recorder$3 = new Recorder$3(animatedVisibilityKtAnimatedVisibilityImpl11, 0, ondrawwithcontent);
        PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk = animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        synchronized (encoderImpl.ResultReceiver) {
            encoderImpl.MediaSessionCompatQueueItem = recorder$3;
            encoderImpl.MediaDescriptionCompat = previewFreezeAfterHighSpeedRecordingQuirk;
        }
        return "videoEncodingFuture";
    }
}
