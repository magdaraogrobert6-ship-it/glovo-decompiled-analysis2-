package o;

import android.view.Surface;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class onFrameanimation_core implements SuspendAnimationKt {
    public PreviewView$1$$ExternalSyntheticLambda2 IconCompatParcelizer;
    public final /* synthetic */ androidx.camera.video.internal.encoder.EncoderImpl MediaDescriptionCompat;
    public Surface read;
    public Executor serializer;
    public final Object write = new Object();
    public final HashSet RemoteActionCompatParcelizer = new HashSet();

    public onFrameanimation_core(androidx.camera.video.internal.encoder.EncoderImpl encoderImpl) {
        this.MediaDescriptionCompat = encoderImpl;
    }
}
