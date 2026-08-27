package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class CrashWhenTakingPhotoWithAutoFlashAEModeQuirk {
    public final getViewPort IconCompatParcelizer;
    public final int serializer;

    public final int hashCode() {
        return ((this.IconCompatParcelizer.hashCode() ^ 1000003) * 1000003) ^ this.serializer;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashWhenTakingPhotoWithAutoFlashAEModeQuirk)) {
            return false;
        }
        CrashWhenTakingPhotoWithAutoFlashAEModeQuirk crashWhenTakingPhotoWithAutoFlashAEModeQuirk = (CrashWhenTakingPhotoWithAutoFlashAEModeQuirk) obj;
        return this.IconCompatParcelizer.equals(crashWhenTakingPhotoWithAutoFlashAEModeQuirk.IconCompatParcelizer) && this.serializer == crashWhenTakingPhotoWithAutoFlashAEModeQuirk.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", jpegQuality=");
        return af$$ExternalSyntheticOutline0.m(this.serializer, "}", sb);
    }

    public CrashWhenTakingPhotoWithAutoFlashAEModeQuirk(getViewPort getviewport, int i) {
        if (getviewport == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null packet");
            throw null;
        }
        this.IconCompatParcelizer = getviewport;
        this.serializer = i;
    }
}
