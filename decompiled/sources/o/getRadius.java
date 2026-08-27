package o;

import android.opengl.EGLSurface;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getRadius {
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final EGLSurface serializer;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ this.IconCompatParcelizer) * 1000003) ^ this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getRadius)) {
            return false;
        }
        getRadius getradius = (getRadius) obj;
        return this.serializer.equals(getradius.serializer) && this.IconCompatParcelizer == getradius.IconCompatParcelizer && this.RemoteActionCompatParcelizer == getradius.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.serializer);
        sb.append(", width=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", height=");
        return af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, "}", sb);
    }

    public getRadius(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null eglSurface");
            throw null;
        }
        this.serializer = eGLSurface;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
    }
}
