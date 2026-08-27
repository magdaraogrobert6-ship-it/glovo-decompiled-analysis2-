package o;

import android.content.Context;
import com.mapbox.search.base.MetadataExtKt;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class RelativeScroller extends SSLSocketFactory {
    public static volatile RelativeScroller serializer;
    public String[] RemoteActionCompatParcelizer;
    public SSLContext read;
    public Context write;

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        scrollTo.write("SSLFNew");
        Socket socketCreateSocket = this.read.getSocketFactory().createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            scrollTo.write("SSLFNew");
            launchWithCancellationSignal.write(sSLSocket);
            scrollTo.write("SSLFNew");
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            ArrayList arrayList = new ArrayList();
            List listAsList = Arrays.asList(launchWithCancellationSignal.RemoteActionCompatParcelizer);
            for (String str2 : enabledCipherSuites) {
                if (listAsList.contains(str2.toUpperCase(java.util.Locale.ENGLISH))) {
                    arrayList.add(str2);
                }
            }
            if (arrayList.isEmpty()) {
                String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList2 = new ArrayList();
                for (String str3 : enabledCipherSuites2) {
                    String upperCase = str3.toUpperCase(java.util.Locale.ENGLISH);
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 16) {
                            arrayList2.add(str3);
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
            this.RemoteActionCompatParcelizer = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    public RelativeScroller(getScrollAmount getscrollamount, SecureRandom secureRandom) throws KeyManagementException {
        this.read = null;
        SSLContext sSLContext = launchWithCancellationSignal.read();
        this.read = sSLContext;
        sSLContext.init(null, new X509TrustManager[]{getscrollamount}, secureRandom);
    }

    public static RelativeScroller serializer(Context context, SecureRandom secureRandom) {
        System.currentTimeMillis();
        if (context != null && RelativeScrollerscrollBy1.write == null) {
            RelativeScrollerscrollBy1.write = context.getApplicationContext();
        }
        if (serializer == null) {
            synchronized (RelativeScroller.class) {
                if (serializer == null) {
                    RelativeScroller relativeScroller = new RelativeScroller();
                    relativeScroller.read = null;
                    relativeScroller.write = context.getApplicationContext();
                    relativeScroller.read = launchWithCancellationSignal.read();
                    relativeScroller.read.init(null, new X509TrustManager[]{MetadataExtKt.read(context)}, secureRandom);
                    serializer = relativeScroller;
                }
            }
        }
        if (serializer.write == null && context != null) {
            RelativeScroller relativeScroller2 = serializer;
            relativeScroller2.getClass();
            relativeScroller2.write = context.getApplicationContext();
        }
        System.currentTimeMillis();
        return serializer;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.RemoteActionCompatParcelizer;
        return strArr != null ? strArr : new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        scrollTo.write("SSLFNew");
        Socket socketCreateSocket = this.read.getSocketFactory().createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            scrollTo.write("SSLFNew");
            launchWithCancellationSignal.write(sSLSocket);
            scrollTo.write("SSLFNew");
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            ArrayList arrayList = new ArrayList();
            List listAsList = Arrays.asList(launchWithCancellationSignal.RemoteActionCompatParcelizer);
            for (String str2 : enabledCipherSuites) {
                if (listAsList.contains(str2.toUpperCase(java.util.Locale.ENGLISH))) {
                    arrayList.add(str2);
                }
            }
            if (!arrayList.isEmpty()) {
                sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
            } else {
                String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList2 = new ArrayList();
                for (String str3 : enabledCipherSuites2) {
                    String upperCase = str3.toUpperCase(java.util.Locale.ENGLISH);
                    int i2 = 0;
                    while (true) {
                        if (i2 < 16) {
                            if (upperCase.contains(launchWithCancellationSignal.IconCompatParcelizer[i2].toUpperCase(java.util.Locale.ENGLISH))) {
                                break;
                            }
                            i2++;
                        } else {
                            arrayList2.add(str3);
                            break;
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                }
            }
            this.RemoteActionCompatParcelizer = (String[]) sSLSocket.getEnabledCipherSuites().clone();
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

    public RelativeScroller() {
    }
}
