package o;

import android.view.Surface;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getContentInsetLeft {
    public final Surface IconCompatParcelizer;
    public final int serializer;

    public getContentInsetLeft(int i, Surface surface) {
        this.serializer = i;
        if (surface != null) {
            this.IconCompatParcelizer = surface;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null surface");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getContentInsetLeft)) {
            return false;
        }
        getContentInsetLeft getcontentinsetleft = (getContentInsetLeft) obj;
        return this.serializer == getcontentinsetleft.serializer && this.IconCompatParcelizer.equals(getcontentinsetleft.IconCompatParcelizer);
    }

    public final String toString() {
        return "Result{resultCode=" + this.serializer + ", surface=" + this.IconCompatParcelizer + "}";
    }

    public final int hashCode() {
        return ((this.serializer ^ 1000003) * 1000003) ^ this.IconCompatParcelizer.hashCode();
    }
}
