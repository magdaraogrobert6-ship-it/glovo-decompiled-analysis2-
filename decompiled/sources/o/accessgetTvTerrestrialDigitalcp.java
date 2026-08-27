package o;

import android.content.pm.PackageManager;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class accessgetTvTerrestrialDigitalcp {
    public static final accessgetTvTerrestrialDigitalcp serializer = new accessgetTvTerrestrialDigitalcp(null, null, true);
    public final boolean RemoteActionCompatParcelizer;
    public final Throwable write;

    public void IconCompatParcelizer() {
    }

    public accessgetTvTerrestrialDigitalcp(String str, Throwable th, boolean z) {
        this.RemoteActionCompatParcelizer = z;
        this.write = th;
    }

    public static accessgetTvTerrestrialDigitalcp RemoteActionCompatParcelizer(String str, PackageManager.NameNotFoundException nameNotFoundException) {
        return new accessgetTvTerrestrialDigitalcp(str, nameNotFoundException, false);
    }

    public static accessgetTvTerrestrialDigitalcp read(String str, Exception exc) {
        return new accessgetTvTerrestrialDigitalcp(str, exc, false);
    }

    public static accessgetTvTerrestrialDigitalcp read() {
        return new accessgetTvTerrestrialDigitalcp(null, null, true);
    }

    public static accessgetTvTerrestrialDigitalcp serializer(String str) {
        return new accessgetTvTerrestrialDigitalcp(str, null, false);
    }

    public final void serializer() {
        if (this.RemoteActionCompatParcelizer || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.write != null) {
            IconCompatParcelizer();
        } else {
            IconCompatParcelizer();
        }
    }
}
