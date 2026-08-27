package o;

import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Range;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class calculateTotalDurationNanos implements Runnable {
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.camera.video.internal.encoder.EncoderImpl read;

    public /* synthetic */ calculateTotalDurationNanos(androidx.camera.video.internal.encoder.EncoderImpl encoderImpl, long j, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = encoderImpl;
        this.IconCompatParcelizer = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = this.read;
            long j = this.IconCompatParcelizer;
            switch (encoderImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
                case CONFIGURED:
                case PAUSED:
                case STOPPING:
                case PENDING_START_PAUSED:
                case ERROR:
                    break;
                case STARTED:
                    String str = encoderImpl._init_lambda1;
                    SeekableTransitionState.RemoteActionCompatParcelizer(j);
                    setInflatedId.IconCompatParcelizer(3, str);
                    encoderImpl.read.addLast(Range.create(Long.valueOf(j), Long.MAX_VALUE));
                    encoderImpl.IconCompatParcelizer(clearInitialAnimationsanimation_core.PAUSED);
                    break;
                case PENDING_START:
                    encoderImpl.IconCompatParcelizer(clearInitialAnimationsanimation_core.PENDING_START_PAUSED);
                    break;
                case PENDING_RELEASE:
                case RELEASED:
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Encoder is released");
                    break;
                default:
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(encoderImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, "Unknown state: ");
                    break;
            }
        }
        if (i != 1) {
            androidx.camera.video.internal.encoder.EncoderImpl encoderImpl2 = this.read;
            long j2 = this.IconCompatParcelizer;
            String str2 = encoderImpl2._init_lambda1;
            switch (encoderImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
                case CONFIGURED:
                case STOPPING:
                case ERROR:
                    break;
                case STARTED:
                case PAUSED:
                    clearInitialAnimationsanimation_core clearinitialanimationsanimation_core = encoderImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                    encoderImpl2.IconCompatParcelizer(clearInitialAnimationsanimation_core.STOPPING);
                    Long l = (Long) encoderImpl2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.getLower();
                    long jLongValue = l.longValue();
                    if (jLongValue == Long.MAX_VALUE) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "There should be a \"start\" before \"stop\"");
                    } else if (j2 < jLongValue) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "The start time should be before the stop time.");
                    } else {
                        encoderImpl2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = Range.create(l, Long.valueOf(j2));
                        SeekableTransitionState.RemoteActionCompatParcelizer(j2);
                        setInflatedId.IconCompatParcelizer(3, str2);
                        if (clearinitialanimationsanimation_core == clearInitialAnimationsanimation_core.PAUSED && encoderImpl2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null) {
                            encoderImpl2.MediaMetadataCompat();
                        } else {
                            encoderImpl2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = true;
                            encoderImpl2._init_lambda2 = removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().schedule(new CrossfadeKt(encoderImpl2, 5), 1000L, TimeUnit.MILLISECONDS);
                        }
                    }
                    break;
                case PENDING_START:
                case PENDING_START_PAUSED:
                    encoderImpl2.IconCompatParcelizer(clearInitialAnimationsanimation_core.CONFIGURED);
                    break;
                case PENDING_RELEASE:
                case RELEASED:
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Encoder is released");
                    break;
                default:
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(encoderImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, "Unknown state: ");
                    break;
            }
        }
        androidx.camera.video.internal.encoder.EncoderImpl encoderImpl3 = this.read;
        long j3 = this.IconCompatParcelizer;
        switch (encoderImpl3.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
            case CONFIGURED:
                encoderImpl3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                String str3 = encoderImpl3._init_lambda1;
                SeekableTransitionState.RemoteActionCompatParcelizer(j3);
                setInflatedId.IconCompatParcelizer(3, str3);
                try {
                    if (encoderImpl3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                        encoderImpl3.IconCompatParcelizer();
                    }
                    encoderImpl3.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = Range.create(Long.valueOf(j3), Long.MAX_VALUE);
                    setInflatedId.IconCompatParcelizer(3, encoderImpl3._init_lambda1);
                    encoderImpl3.ComponentActivity.start();
                    SuspendAnimationKt suspendAnimationKt = encoderImpl3.PlaybackStateCompatCustomAction;
                    if (suspendAnimationKt instanceof Transition) {
                        ((Transition) suspendAnimationKt).serializer(true);
                    }
                    encoderImpl3.IconCompatParcelizer(clearInitialAnimationsanimation_core.STARTED);
                } catch (MediaCodec.CodecException e) {
                    encoderImpl3.read(1, e.getMessage(), e);
                    return;
                }
                break;
            case STARTED:
            case PENDING_START:
            case ERROR:
                break;
            case PAUSED:
                encoderImpl3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                Range range = (Range) encoderImpl3.read.removeLast();
                coil3.util.UtilsKt.RemoteActionCompatParcelizer("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE);
                Long l2 = (Long) range.getLower();
                long jLongValue2 = l2.longValue();
                encoderImpl3.read.addLast(Range.create(l2, Long.valueOf(j3)));
                String str4 = encoderImpl3._init_lambda1;
                SeekableTransitionState.RemoteActionCompatParcelizer(j3);
                SeekableTransitionState.RemoteActionCompatParcelizer(j3 - jLongValue2);
                setInflatedId.IconCompatParcelizer(3, str4);
                if ((encoderImpl3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY || accesswaitForCompositionAfterTargetStateChange.read.read(androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!encoderImpl3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY || accesswaitForCompositionAfterTargetStateChange.read.read(androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("drop-input-frames", 0);
                    setInflatedId.IconCompatParcelizer(3, encoderImpl3._init_lambda1);
                    encoderImpl3.ComponentActivity.setParameters(bundle);
                    SuspendAnimationKt suspendAnimationKt2 = encoderImpl3.PlaybackStateCompatCustomAction;
                    if (suspendAnimationKt2 instanceof Transition) {
                        ((Transition) suspendAnimationKt2).serializer(true);
                    }
                }
                if (encoderImpl3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                    encoderImpl3.RemoteActionCompatParcelizer();
                }
                encoderImpl3.IconCompatParcelizer(clearInitialAnimationsanimation_core.STARTED);
                break;
            case STOPPING:
            case PENDING_START_PAUSED:
                encoderImpl3.IconCompatParcelizer(clearInitialAnimationsanimation_core.PENDING_START);
                break;
            case PENDING_RELEASE:
            case RELEASED:
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Encoder is released");
                break;
            default:
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(encoderImpl3.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, "Unknown state: ");
                break;
        }
    }
}
