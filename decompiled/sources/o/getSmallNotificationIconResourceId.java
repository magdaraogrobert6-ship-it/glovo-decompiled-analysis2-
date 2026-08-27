package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.TlsVersion;

/* JADX INFO: loaded from: classes3.dex */
public final class getSmallNotificationIconResourceId {
    public String[] RemoteActionCompatParcelizer;
    public String[] read;
    public boolean serializer;
    public boolean write;

    public getSmallNotificationIconResourceId(boolean z) {
        this.write = z;
    }

    public final void IconCompatParcelizer(BrazeConfigurationProvider... brazeConfigurationProviderArr) {
        if (!this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("no cipher suites for cleartext connections");
            return;
        }
        String[] strArr = new String[brazeConfigurationProviderArr.length];
        for (int i = 0; i < brazeConfigurationProviderArr.length; i++) {
            strArr[i] = brazeConfigurationProviderArr[i].r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        }
        read(strArr);
    }

    public final void write(String... strArr) {
        if (!this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.RemoteActionCompatParcelizer = (String[]) strArr.clone();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("At least one TLS version is required");
        }
    }

    public final void read(String... strArr) {
        if (this.write) {
            if (strArr.length != 0) {
                this.read = (String[]) strArr.clone();
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("At least one cipher suite is required");
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("no cipher suites for cleartext connections");
    }

    public final void serializer(TlsVersion... tlsVersionArr) {
        if (this.write) {
            String[] strArr = new String[tlsVersionArr.length];
            for (int i = 0; i < tlsVersionArr.length; i++) {
                strArr[i] = tlsVersionArr[i].javaName;
            }
            write(strArr);
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("no TLS versions for cleartext connections");
    }

    public getSmallNotificationIconResourceId() {
    }
}
