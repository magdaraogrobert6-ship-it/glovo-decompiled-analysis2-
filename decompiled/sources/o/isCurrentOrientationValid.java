package o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes4.dex */
public final class isCurrentOrientationValid implements isRunningOnTablet {
    public static final boolean RemoteActionCompatParcelizer;
    public static final removeViewFromParent serializer = new removeViewFromParent();

    @Override // o.isRunningOnTablet
    public final boolean RemoteActionCompatParcelizer(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // o.isRunningOnTablet
    public final boolean write() {
        return RemoteActionCompatParcelizer;
    }

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, removeViewFromParentlambda0.class.getClassLoader());
            if (Conscrypt.isAvailable() && removeViewFromParentlambda0.read()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        RemoteActionCompatParcelizer = z;
    }

    @Override // o.isRunningOnTablet
    public final void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (RemoteActionCompatParcelizer(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) AndroidUiDispatcherCompanioncurrentThread1.IconCompatParcelizer(list).toArray(new String[0]));
        }
    }

    @Override // o.isRunningOnTablet
    public final String write(SSLSocket sSLSocket) {
        if (RemoteActionCompatParcelizer(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }
}
