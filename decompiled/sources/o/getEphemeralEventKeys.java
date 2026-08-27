package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes3.dex */
public final class getEphemeralEventKeys extends getShouldAddStatusBarPaddingToInAppMessages {
    public final Object RemoteActionCompatParcelizer;
    public final Method read;

    public final boolean equals(Object obj) {
        return obj instanceof getEphemeralEventKeys;
    }

    public final int hashCode() {
        return 0;
    }

    public getEphemeralEventKeys(Method method, Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.read = method;
    }

    @Override // o.getShouldAddStatusBarPaddingToInAppMessages
    public final List RemoteActionCompatParcelizer(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return (List) this.read.invoke(this.RemoteActionCompatParcelizer, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
        } catch (IllegalAccessException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            return null;
        } catch (InvocationTargetException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }
}
