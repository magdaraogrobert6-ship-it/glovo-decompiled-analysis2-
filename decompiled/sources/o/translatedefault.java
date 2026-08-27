package o;

import io.sentry.util.UrlUtils;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class translatedefault implements eotfFunclambda0 {
    public final Object serializer;

    @Override // o.eotfFunclambda0
    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // o.eotfFunclambda0
    public final void serializer(MessageDigest messageDigest) {
        messageDigest.update(this.serializer.toString().getBytes(eotfFunclambda0.read));
    }

    @Override // o.eotfFunclambda0
    public final boolean equals(Object obj) {
        if (obj instanceof translatedefault) {
            return this.serializer.equals(((translatedefault) obj).serializer);
        }
        return false;
    }

    public final String toString() {
        return IconCompatParcelizer.RemoteActionCompatParcelizer(new StringBuilder("ObjectKey{object="), this.serializer, '}');
    }

    public translatedefault(Object obj) {
        UrlUtils.serializer(obj, "Argument must not be null");
        this.serializer = obj;
    }
}
