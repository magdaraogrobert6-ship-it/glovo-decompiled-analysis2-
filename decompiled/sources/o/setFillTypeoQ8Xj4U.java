package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class setFillTypeoQ8Xj4U {
    public static final transform58bKbWc RemoteActionCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        AndroidPathEffect androidPathEffect = new AndroidPathEffect();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(androidPathEffect);
        AndroidPathEffect_androidKt androidPathEffect_androidKt = androidPathEffect.IconCompatParcelizer;
        androidPathEffect_androidKt.MediaDescriptionCompat = false;
        androidPathEffect_androidKt.MediaBrowserCompatMediaItem = false;
        String str = androidPathEffect.serializer;
        if (str != null) {
            boolean z = androidPathEffect.write;
            boolean z2 = androidPathEffect.RemoteActionCompatParcelizer;
            androidPathEffect_androidKt.RemoteActionCompatParcelizer = str;
            androidPathEffect_androidKt.serializer = -1;
            androidPathEffect_androidKt.write = z;
            androidPathEffect_androidKt.RatingCompat = z2;
        } else {
            int i = androidPathEffect.read;
            boolean z3 = androidPathEffect.write;
            boolean z4 = androidPathEffect.RemoteActionCompatParcelizer;
            androidPathEffect_androidKt.serializer = i;
            androidPathEffect_androidKt.RemoteActionCompatParcelizer = null;
            androidPathEffect_androidKt.write = z3;
            androidPathEffect_androidKt.RatingCompat = z4;
        }
        return androidPathEffect_androidKt.IconCompatParcelizer();
    }

    public static final boolean RemoteActionCompatParcelizer(IOException iOException) {
        if ((iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }
}
