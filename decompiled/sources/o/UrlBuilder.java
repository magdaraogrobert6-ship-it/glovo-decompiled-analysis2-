package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.logic.zp;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class UrlBuilder extends InputStream {
    public boolean read = true;
    public final zp serializer;
    public InputStream write;

    public final Provider IconCompatParcelizer() throws IOException {
        zp zpVar = this.serializer;
        int i = ((getcachedSerializer) zpVar.serializer).read();
        logErrordefault logerrordefaultWrite = i < 0 ? null : zpVar.write(i);
        if (logerrordefaultWrite == null) {
            return null;
        }
        if (logerrordefaultWrite instanceof Provider) {
            return (Provider) logerrordefaultWrite;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(logerrordefaultWrite.getClass(), "unknown object encountered: ");
        return null;
    }

    public UrlBuilder(zp zpVar) {
        this.serializer = zpVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Provider providerIconCompatParcelizer;
        int i3 = 0;
        if (this.write == null) {
            if (!this.read || (providerIconCompatParcelizer = IconCompatParcelizer()) == null) {
                return -1;
            }
            this.read = false;
            this.write = providerIconCompatParcelizer.RemoteActionCompatParcelizer();
        }
        while (true) {
            int i4 = this.write.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                Provider providerIconCompatParcelizer2 = IconCompatParcelizer();
                if (providerIconCompatParcelizer2 == null) {
                    this.write = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.write = providerIconCompatParcelizer2.RemoteActionCompatParcelizer();
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        Provider providerIconCompatParcelizer;
        if (this.write == null) {
            if (!this.read || (providerIconCompatParcelizer = IconCompatParcelizer()) == null) {
                return -1;
            }
            this.read = false;
            this.write = providerIconCompatParcelizer.RemoteActionCompatParcelizer();
        }
        while (true) {
            int i = this.write.read();
            if (i >= 0) {
                return i;
            }
            Provider providerIconCompatParcelizer2 = IconCompatParcelizer();
            if (providerIconCompatParcelizer2 == null) {
                this.write = null;
                return -1;
            }
            this.write = providerIconCompatParcelizer2.RemoteActionCompatParcelizer();
        }
    }
}
