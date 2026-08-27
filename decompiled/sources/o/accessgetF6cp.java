package o;

import android.content.Context;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetF6cp extends accessgetF8cp {
    public final accessgetMediaPlaycp RemoteActionCompatParcelizer;
    public final accessgetMediaPlaycp read;
    public final Context serializer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ this.read.hashCode()) * 1000003) ^ this.write.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetF8cp)) {
            return false;
        }
        accessgetF6cp accessgetf6cp = (accessgetF6cp) ((accessgetF8cp) obj);
        return this.serializer.equals(accessgetf6cp.serializer) && this.RemoteActionCompatParcelizer.equals(accessgetf6cp.RemoteActionCompatParcelizer) && this.read.equals(accessgetf6cp.read) && this.write.equals(accessgetf6cp.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.serializer);
        sb.append(", wallClock=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", monotonicClock=");
        sb.append(this.read);
        sb.append(", backendName=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.write, "}");
    }

    public accessgetF6cp(Context context, accessgetMediaPlaycp accessgetmediaplaycp, accessgetMediaPlaycp accessgetmediaplaycp2, String str) {
        if (context == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null applicationContext");
            throw null;
        }
        this.serializer = context;
        if (accessgetmediaplaycp == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null wallClock");
            throw null;
        }
        this.RemoteActionCompatParcelizer = accessgetmediaplaycp;
        if (accessgetmediaplaycp2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null monotonicClock");
            throw null;
        }
        this.read = accessgetmediaplaycp2;
        if (str != null) {
            this.write = str;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null backendName");
            throw null;
        }
    }
}
