package o;

import android.hardware.camera2.CaptureRequest;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class JpegCaptureDownsizingQuirk {
    public final Object IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final Class write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.write.hashCode();
        Object obj = this.IconCompatParcelizer;
        return ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (obj == null ? 0 : obj.hashCode());
    }

    public JpegCaptureDownsizingQuirk(String str, Class cls, CaptureRequest.Key key) {
        this.RemoteActionCompatParcelizer = str;
        if (cls == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null valueClass");
            throw null;
        }
        this.write = cls;
        this.IconCompatParcelizer = key;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JpegCaptureDownsizingQuirk)) {
            return false;
        }
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = (JpegCaptureDownsizingQuirk) obj;
        if (!this.RemoteActionCompatParcelizer.equals(jpegCaptureDownsizingQuirk.RemoteActionCompatParcelizer) || !this.write.equals(jpegCaptureDownsizingQuirk.write)) {
            return false;
        }
        Object obj2 = jpegCaptureDownsizingQuirk.IconCompatParcelizer;
        Object obj3 = this.IconCompatParcelizer;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final String toString() {
        return "Option{id=" + this.RemoteActionCompatParcelizer + ", valueClass=" + this.write + ", token=" + this.IconCompatParcelizer + "}";
    }
}
