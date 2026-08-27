package bo.app;

import com.braze.support.BrazeLogger;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class wf extends SSLSocketFactory {
    public final SSLSocketFactory a;

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.a.getDefaultCipherSuites();
        defaultCipherSuites.getClass();
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.a.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        return supportedCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        socket.getClass();
        str.getClass();
        Socket socketCreateSocket = this.a.createSocket(socket, str, i, z);
        socketCreateSocket.getClass();
        return a(socketCreateSocket);
    }

    public wf() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        socketFactory.getClass();
        this.a = socketFactory;
    }

    public final Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ArrayList arrayList = new ArrayList();
            SSLSocket sSLSocket = (SSLSocket) socket;
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            supportedProtocols.getClass();
            for (String str : supportedProtocols) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "SSLv3"}, getCieXyz.write())).booleanValue()) {
                    str.getClass();
                    arrayList.add(str);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g0$$ExternalSyntheticLambda8(3, arrayList), 6, (Object) null);
            sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.a.createSocket();
        socketCreateSocket.getClass();
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        str.getClass();
        Socket socketCreateSocket = this.a.createSocket(str, i);
        socketCreateSocket.getClass();
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        str.getClass();
        inetAddress.getClass();
        Socket socketCreateSocket = this.a.createSocket(str, i, inetAddress, i2);
        socketCreateSocket.getClass();
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        inetAddress.getClass();
        Socket socketCreateSocket = this.a.createSocket(inetAddress, i);
        socketCreateSocket.getClass();
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        inetAddress.getClass();
        inetAddress2.getClass();
        Socket socketCreateSocket = this.a.createSocket(inetAddress, i, inetAddress2, i2);
        socketCreateSocket.getClass();
        return a(socketCreateSocket);
    }

    public static final String a(List list) {
        return c8$$ExternalSyntheticOutline0.m("Enabling SSL protocols: ", list);
    }
}
