package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class setScreenFlashWindow {
    public final setBrightness IconCompatParcelizer;
    public final List read;

    public final int hashCode() {
        return ((this.IconCompatParcelizer.hashCode() ^ 1000003) * 1000003) ^ this.read.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setScreenFlashWindow)) {
            return false;
        }
        setScreenFlashWindow setscreenflashwindow = (setScreenFlashWindow) obj;
        return this.IconCompatParcelizer.equals(setscreenflashwindow.IconCompatParcelizer) && this.read.equals(setscreenflashwindow.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{surfaceEdge=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", outConfigs=");
        return MediaSessionCompatQueueItem.read(sb, this.read, "}");
    }

    public setScreenFlashWindow(setBrightness setbrightness, List list) {
        if (setbrightness == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null surfaceEdge");
            throw null;
        }
        this.IconCompatParcelizer = setbrightness;
        if (list != null) {
            this.read = list;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null outConfigs");
            throw null;
        }
    }
}
