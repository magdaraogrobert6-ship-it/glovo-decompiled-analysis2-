package o;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class isDeviceNotInTouchMode implements isRunningOnTablet {
    public final removeViewFromParentlambda1 read;
    public isRunningOnTablet serializer;

    public final isRunningOnTablet IconCompatParcelizer(SSLSocket sSLSocket) {
        isRunningOnTablet isrunningontablet;
        synchronized (this) {
            if (this.serializer == null && this.read.read(sSLSocket)) {
                this.serializer = this.read.write(sSLSocket);
            }
            isrunningontablet = this.serializer;
        }
        return isrunningontablet;
    }

    @Override // o.isRunningOnTablet
    public final boolean write() {
        return true;
    }

    @Override // o.isRunningOnTablet
    public final boolean RemoteActionCompatParcelizer(SSLSocket sSLSocket) {
        return this.read.read(sSLSocket);
    }

    public isDeviceNotInTouchMode(removeViewFromParentlambda1 removeviewfromparentlambda1) {
        this.read = removeviewfromparentlambda1;
    }

    @Override // o.isRunningOnTablet
    public final void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        isRunningOnTablet isrunningontabletIconCompatParcelizer = IconCompatParcelizer(sSLSocket);
        if (isrunningontabletIconCompatParcelizer != null) {
            isrunningontabletIconCompatParcelizer.RemoteActionCompatParcelizer(sSLSocket, str, list);
        }
    }

    @Override // o.isRunningOnTablet
    public final String write(SSLSocket sSLSocket) {
        isRunningOnTablet isrunningontabletIconCompatParcelizer = IconCompatParcelizer(sSLSocket);
        if (isrunningontabletIconCompatParcelizer != null) {
            return isrunningontabletIconCompatParcelizer.write(sSLSocket);
        }
        return null;
    }
}
