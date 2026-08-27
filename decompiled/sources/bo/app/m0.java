package bo.app;

import android.graphics.Bitmap;
import java.util.Map;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public final Bitmap a;
    public final Map b;

    public final String toString() {
        return "BitmapAndHeaders(bitmap=" + this.a + ", headers=" + this.b + ")";
    }

    public m0() {
        this.a = null;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, m0Var.a}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, m0Var.b}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        int iHashCode = bitmap == null ? 0 : bitmap.hashCode();
        Map map = this.b;
        return (iHashCode * 31) + (map != null ? map.hashCode() : 0);
    }

    public m0(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.b = map;
    }
}
