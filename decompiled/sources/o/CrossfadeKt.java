package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.net.zza;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CrossfadeKt implements Runnable {
    public final /* synthetic */ androidx.camera.video.internal.encoder.EncoderImpl RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ CrossfadeKt(androidx.camera.video.internal.encoder.EncoderImpl encoderImpl, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = encoderImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DrawModifierNodeKt encoderImplMediaCodecCallback;
        int i = this.serializer;
        androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            setInflatedId.IconCompatParcelizer(3, "Recorder");
            if (accesswaitForCompositionAfterTargetStateChange.read.read(androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
                AnimatedVisibilityKtAnimatedVisibilityImpl11.IconCompatParcelizer(encoderImpl);
                return;
            }
            return;
        }
        if (i == 1) {
            PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk = encoderImpl.RatingCompat;
            setInflatedId.IconCompatParcelizer(3, encoderImpl._init_lambda1);
            switch (encoderImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
                case CONFIGURED:
                    encoderImplMediaCodecCallback = new EncoderImplMediaCodecCallback(0, new IllegalStateException("Encoder is not started yet."));
                    break;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    AtomicReference atomicReference = new AtomicReference();
                    onDrawWithContent ondrawwithcontent = new onDrawWithContent();
                    ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
                    onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
                    ondrawwithcontent.read = ondrawbehind;
                    ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
                    try {
                        atomicReference.set(ondrawwithcontent);
                        ondrawwithcontent.RemoteActionCompatParcelizer = "acquireInputBuffer";
                    } catch (Exception e) {
                        ondrawbehind.write(e);
                    }
                    onDrawWithContent ondrawwithcontent2 = (onDrawWithContent) atomicReference.get();
                    ondrawwithcontent2.getClass();
                    encoderImpl.write.offer(ondrawwithcontent2);
                    ondrawwithcontent2.RemoteActionCompatParcelizer(new Crossfade(encoderImpl, 19, ondrawwithcontent2), previewFreezeAfterHighSpeedRecordingQuirk);
                    encoderImpl.serializer();
                    encoderImplMediaCodecCallback = ondrawbehind;
                    break;
                case ERROR:
                    encoderImplMediaCodecCallback = new EncoderImplMediaCodecCallback(0, new IllegalStateException("Encoder is in error state."));
                    break;
                case RELEASED:
                    encoderImplMediaCodecCallback = new EncoderImplMediaCodecCallback(0, new IllegalStateException("Encoder is released."));
                    break;
                default:
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(encoderImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, "Unknown state: ");
                    return;
            }
            encoderImplMediaCodecCallback.RemoteActionCompatParcelizer(new zza(encoderImplMediaCodecCallback, 1, new androidx.camera.view.PendingValue(11, encoderImpl)), previewFreezeAfterHighSpeedRecordingQuirk);
            return;
        }
        int i2 = 6;
        if (i == 2) {
            int iOrdinal = encoderImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.ordinal();
            if (iOrdinal == 1) {
                encoderImpl.RemoteActionCompatParcelizer();
                return;
            } else {
                if (iOrdinal == 6 || iOrdinal == 8) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Encoder is released");
                    return;
                }
                return;
            }
        }
        if (i == 3) {
            switch (encoderImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
                case CONFIGURED:
                case STARTED:
                case PAUSED:
                case ERROR:
                    encoderImpl.read();
                    break;
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                    encoderImpl.IconCompatParcelizer(clearInitialAnimationsanimation_core.PENDING_RELEASE);
                    break;
                case PENDING_RELEASE:
                case RELEASED:
                    break;
                default:
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(encoderImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, "Unknown state: ");
                    break;
            }
        }
        if (i == 4) {
            encoderImpl.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = true;
            if (encoderImpl.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                if (!encoderImpl.IconCompatParcelizer) {
                    setInflatedId.IconCompatParcelizer(3, encoderImpl._init_lambda1);
                    encoderImpl.ComponentActivity.stop();
                }
                encoderImpl.IconCompatParcelizer();
                return;
            }
            return;
        }
        if (i == 5) {
            encoderImpl.RatingCompat.execute(new CrossfadeKt(encoderImpl, i2));
        } else if (encoderImpl.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) {
            setInflatedId.read(encoderImpl._init_lambda1, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            encoderImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
            encoderImpl.MediaMetadataCompat();
            encoderImpl.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = false;
        }
    }
}
