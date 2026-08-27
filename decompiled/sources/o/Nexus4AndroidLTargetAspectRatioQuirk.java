package o;

import android.os.Handler;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class Nexus4AndroidLTargetAspectRatioQuirk {
    public final Executor IconCompatParcelizer;
    public final Handler RemoteActionCompatParcelizer;

    public final int hashCode() {
        return ((this.IconCompatParcelizer.hashCode() ^ 1000003) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Nexus4AndroidLTargetAspectRatioQuirk)) {
            return false;
        }
        Nexus4AndroidLTargetAspectRatioQuirk nexus4AndroidLTargetAspectRatioQuirk = (Nexus4AndroidLTargetAspectRatioQuirk) obj;
        return this.IconCompatParcelizer.equals(nexus4AndroidLTargetAspectRatioQuirk.IconCompatParcelizer) && this.RemoteActionCompatParcelizer.equals(nexus4AndroidLTargetAspectRatioQuirk.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.IconCompatParcelizer + ", schedulerHandler=" + this.RemoteActionCompatParcelizer + "}";
    }

    public Nexus4AndroidLTargetAspectRatioQuirk(Executor executor, Handler handler) {
        if (executor == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null cameraExecutor");
            throw null;
        }
        this.IconCompatParcelizer = executor;
        if (handler != null) {
            this.RemoteActionCompatParcelizer = handler;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null schedulerHandler");
            throw null;
        }
    }
}
