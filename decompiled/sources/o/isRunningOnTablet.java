package o;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public interface isRunningOnTablet {
    void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list);

    boolean RemoteActionCompatParcelizer(SSLSocket sSLSocket);

    String write(SSLSocket sSLSocket);

    boolean write();
}
