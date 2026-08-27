package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaSS2NWBeOhWqf1hnOOdz0IKozXQ {
    public static final List read = Collections.unmodifiableList(Arrays.asList(r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E.HTTP_2));

    public static SSLSocket write(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i, r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY r8lambdayjdq0ic3o_lbr72bnjjtmnwny) throws SSLPeerUnverifiedException {
        TextStreamsKt.serializer(sSLSocketFactory, "sslSocketFactory");
        TextStreamsKt.serializer(socket, "socket");
        TextStreamsKt.serializer(r8lambdayjdq0ic3o_lbr72bnjjtmnwny, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        String[] strArr = r8lambdayjdq0ic3o_lbr72bnjjtmnwny.IconCompatParcelizer;
        String[] strArr2 = strArr != null ? (String[]) r8lambdayLhLVWHiWt8zzmWjqiTGBD6PCw0.read(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) r8lambdayLhLVWHiWt8zzmWjqiTGBD6PCw0.read(r8lambdayjdq0ic3o_lbr72bnjjtmnwny.RemoteActionCompatParcelizer, sSLSocket.getEnabledProtocols());
        r8lambdadUB55UAyVsb0X6JHQ2BbHCSccgM r8lambdadub55uayvsb0x6jhq2bbhcsccgm = new r8lambdadUB55UAyVsb0X6JHQ2BbHCSccgM(r8lambdayjdq0ic3o_lbr72bnjjtmnwny);
        boolean z = r8lambdadub55uayvsb0x6jhq2bbhcsccgm.write;
        if (!z) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("no cipher suites for cleartext connections");
            return null;
        }
        if (strArr2 == null) {
            r8lambdadub55uayvsb0x6jhq2bbhcsccgm.RemoteActionCompatParcelizer = null;
        } else {
            r8lambdadub55uayvsb0x6jhq2bbhcsccgm.RemoteActionCompatParcelizer = (String[]) strArr2.clone();
        }
        if (z) {
            if (strArr3 == null) {
                r8lambdadub55uayvsb0x6jhq2bbhcsccgm.serializer = null;
            } else {
                r8lambdadub55uayvsb0x6jhq2bbhcsccgm.serializer = (String[]) strArr3.clone();
            }
            r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY r8lambdayjdq0ic3o_lbr72bnjjtmnwny2 = new r8lambdaYJdQ0IC3o_Lbr72bNJJtMnWnY(r8lambdadub55uayvsb0x6jhq2bbhcsccgm);
            sSLSocket.setEnabledProtocols(r8lambdayjdq0ic3o_lbr72bnjjtmnwny2.RemoteActionCompatParcelizer);
            String[] strArr4 = r8lambdayjdq0ic3o_lbr72bnjjtmnwny2.IconCompatParcelizer;
            if (strArr4 != null) {
                sSLSocket.setEnabledCipherSuites(strArr4);
            }
            r8lambdaChdSTjsE0tA1e46Psywe07pQFQ r8lambdachdstjse0ta1e46psywe07pqfq = r8lambdaChdSTjsE0tA1e46Psywe07pQFQ.write;
            boolean z2 = r8lambdayjdq0ic3o_lbr72bnjjtmnwny.serializer;
            List list = read;
            String str2 = r8lambdachdstjse0ta1e46psywe07pqfq.read(sSLSocket, str, z2 ? list : null);
            TextStreamsKt.IconCompatParcelizer("Only " + list + " are supported, but negotiated protocol is %s", str2, list.contains(r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E.get(str2)));
            if (r8lambdaiqNzlyjL6n6sFRCvgYU2iJf5no.write.verify((str.startsWith("[") && str.endsWith("]")) ? r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(1, 1, str) : str, sSLSocket.getSession())) {
                return sSLSocket;
            }
            throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("no TLS versions for cleartext connections");
        return null;
    }
}
