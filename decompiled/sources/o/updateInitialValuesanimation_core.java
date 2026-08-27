package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class updateInitialValuesanimation_core {
    public static setInitialAnimationsanimation_core serializer(String str) {
        try {
            return androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper.serializer(new TransitionKtrememberTransitionlambda10inlinedonDispose1(androidx.camera.video.internal.utils.CodecUtil.serializer(str), str), (android.util.Size) null);
        } catch (androidx.camera.video.internal.encoder.InvalidConfigException e) {
            setInflatedId.RemoteActionCompatParcelizer("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e);
            return null;
        }
    }
}
