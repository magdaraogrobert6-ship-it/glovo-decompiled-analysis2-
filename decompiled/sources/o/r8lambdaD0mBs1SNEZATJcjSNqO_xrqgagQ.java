package o;

import android.content.Context;
import com.mapbox.search.base.MetadataExtKt;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdaD0mBs1SNEZATJcjSNqO_xrqgagQ extends SSLSocketFactory {
    public static volatile r8lambdaD0mBs1SNEZATJcjSNqO_xrqgagQ RemoteActionCompatParcelizer;
    public static final String serializer;
    public String[] IconCompatParcelizer;
    public Context read;
    public SSLContext write;

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    static {
        new BrowserCompatHostnameVerifier();
        new StrictHostnameVerifier();
        serializer = "SecureSSLSocketFactory";
        RemoteActionCompatParcelizer = null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        String str2 = serializer;
        scrollTo.write(str2);
        Socket socketCreateSocket = this.write.getSocketFactory().createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            scrollTo.write(str2);
            launchWithCancellationSignal.write(sSLSocket);
            scrollTo.write(str2);
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            ArrayList arrayList = new ArrayList();
            List listAsList = Arrays.asList(launchWithCancellationSignal.RemoteActionCompatParcelizer);
            for (String str3 : enabledCipherSuites) {
                if (listAsList.contains(str3.toUpperCase(java.util.Locale.ENGLISH))) {
                    arrayList.add(str3);
                }
            }
            if (arrayList.isEmpty()) {
                String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList2 = new ArrayList();
                for (String str4 : enabledCipherSuites2) {
                    String upperCase = str4.toUpperCase(java.util.Locale.ENGLISH);
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 16) {
                            arrayList2.add(str4);
                            break;
                        }
                        if (upperCase.contains(launchWithCancellationSignal.IconCompatParcelizer[i2].toUpperCase(java.util.Locale.ENGLISH))) {
                            break;
                        }
                        i2++;
                    }
                }
                if (!arrayList2.isEmpty()) {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                }
            } else {
                sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
            }
            this.IconCompatParcelizer = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    public static r8lambdaD0mBs1SNEZATJcjSNqO_xrqgagQ write(Context context) {
        System.currentTimeMillis();
        if (context != null && RelativeScrollerscrollBy1.write == null) {
            RelativeScrollerscrollBy1.write = context.getApplicationContext();
        }
        if (RemoteActionCompatParcelizer == null) {
            synchronized (r8lambdaD0mBs1SNEZATJcjSNqO_xrqgagQ.class) {
                if (RemoteActionCompatParcelizer == null) {
                    r8lambdaD0mBs1SNEZATJcjSNqO_xrqgagQ r8lambdad0mbs1snezatjcjsnqo_xrqgagq = new r8lambdaD0mBs1SNEZATJcjSNqO_xrqgagQ();
                    r8lambdad0mbs1snezatjcjsnqo_xrqgagq.write = null;
                    r8lambdad0mbs1snezatjcjsnqo_xrqgagq.read = context.getApplicationContext();
                    r8lambdad0mbs1snezatjcjsnqo_xrqgagq.write = launchWithCancellationSignal.read();
                    r8lambdad0mbs1snezatjcjsnqo_xrqgagq.write.init(null, new X509TrustManager[]{MetadataExtKt.read(context)}, null);
                    RemoteActionCompatParcelizer = r8lambdad0mbs1snezatjcjsnqo_xrqgagq;
                }
            }
        }
        if (RemoteActionCompatParcelizer.read == null && context != null) {
            r8lambdaD0mBs1SNEZATJcjSNqO_xrqgagQ r8lambdad0mbs1snezatjcjsnqo_xrqgagq2 = RemoteActionCompatParcelizer;
            r8lambdad0mbs1snezatjcjsnqo_xrqgagq2.getClass();
            r8lambdad0mbs1snezatjcjsnqo_xrqgagq2.read = context.getApplicationContext();
        }
        System.currentTimeMillis();
        return RemoteActionCompatParcelizer;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.IconCompatParcelizer;
        return strArr != null ? strArr : new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        String str2 = serializer;
        scrollTo.write(str2);
        Socket socketCreateSocket = this.write.getSocketFactory().createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            scrollTo.write(str2);
            launchWithCancellationSignal.write(sSLSocket);
            scrollTo.write(str2);
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            ArrayList arrayList = new ArrayList();
            List listAsList = Arrays.asList(launchWithCancellationSignal.RemoteActionCompatParcelizer);
            for (String str3 : enabledCipherSuites) {
                if (listAsList.contains(str3.toUpperCase(java.util.Locale.ENGLISH))) {
                    arrayList.add(str3);
                }
            }
            if (!arrayList.isEmpty()) {
                sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
            } else {
                String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList2 = new ArrayList();
                for (String str4 : enabledCipherSuites2) {
                    String upperCase = str4.toUpperCase(java.util.Locale.ENGLISH);
                    int i2 = 0;
                    while (true) {
                        if (i2 < 16) {
                            if (upperCase.contains(launchWithCancellationSignal.IconCompatParcelizer[i2].toUpperCase(java.util.Locale.ENGLISH))) {
                                break;
                            }
                            i2++;
                        } else {
                            arrayList2.add(str4);
                            break;
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                }
            }
            this.IconCompatParcelizer = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return createSocket(inetAddress.getHostAddress(), i);
    }
}
