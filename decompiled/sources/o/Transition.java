package o;

import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class Transition implements SuspendAnimationKt, DeferrableSurfaceSurfaceUnavailableException {
    public final /* synthetic */ androidx.camera.video.internal.encoder.EncoderImpl read;
    public final LinkedHashMap IconCompatParcelizer = new LinkedHashMap();
    public FloatTweenSpec serializer = FloatTweenSpec.INACTIVE;
    public final ArrayList write = new ArrayList();

    @Override // o.DeferrableSurfaceSurfaceUnavailableException
    public final void serializer(Executor executor, CameraValidatorCameraIdListIncorrectException cameraValidatorCameraIdListIncorrectException) {
        this.read.RatingCompat.execute(new WorkerKt$$ExternalSyntheticLambda2(this, cameraValidatorCameraIdListIncorrectException, executor, 16));
    }

    public final void serializer(boolean z) {
        FloatTweenSpec floatTweenSpec = z ? FloatTweenSpec.ACTIVE : FloatTweenSpec.INACTIVE;
        if (this.serializer == floatTweenSpec) {
            return;
        }
        this.serializer = floatTweenSpec;
        if (floatTweenSpec == FloatTweenSpec.INACTIVE) {
            ArrayList arrayList = this.write;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((DrawModifierNodeKt) it.next()).cancel(true);
            }
            arrayList.clear();
        }
        for (Map.Entry entry : this.IconCompatParcelizer.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new Crossfade(entry, 20, floatTweenSpec));
            } catch (RejectedExecutionException e) {
                setInflatedId.read(this.read._init_lambda1, "Unable to post to the supplied executor.", e);
            }
        }
    }

    @Override // o.DeferrableSurfaceSurfaceUnavailableException
    public final void write(CameraValidatorCameraIdListIncorrectException cameraValidatorCameraIdListIncorrectException) {
        this.read.RatingCompat.execute(new Crossfade(this, 21, cameraValidatorCameraIdListIncorrectException));
    }

    public Transition(androidx.camera.video.internal.encoder.EncoderImpl encoderImpl) {
        this.read = encoderImpl;
    }

    @Override // o.DeferrableSurfaceSurfaceUnavailableException
    public final DrawModifierNodeKt RemoteActionCompatParcelizer() {
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            this.read.RatingCompat.execute(new Crossfade(this, 22, ondrawwithcontent));
            ondrawwithcontent.RemoteActionCompatParcelizer = "fetchData";
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        return ondrawbehind;
    }
}
