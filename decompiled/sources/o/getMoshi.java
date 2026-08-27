package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.logic.zp;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class getMoshi extends InputStream {
    public final zp IconCompatParcelizer;
    public logError RemoteActionCompatParcelizer;
    public InputStream serializer;
    public boolean read = true;
    public int write = 0;

    public final logError write() throws IOException {
        zp zpVar = this.IconCompatParcelizer;
        int i = ((getcachedSerializer) zpVar.serializer).read();
        logErrordefault logerrordefaultWrite = i < 0 ? null : zpVar.write(i);
        if (logerrordefaultWrite == null) {
            return null;
        }
        if (!(logerrordefaultWrite instanceof logError)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(logerrordefaultWrite.getClass(), "unknown object encountered: ");
            return null;
        }
        if (this.write == 0) {
            return (logError) logerrordefaultWrite;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("only the last nested bitstring can have padding");
        return null;
    }

    public getMoshi(zp zpVar) {
        this.IconCompatParcelizer = zpVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (this.serializer == null) {
            if (!this.read) {
                return -1;
            }
            logError logerrorWrite = write();
            this.RemoteActionCompatParcelizer = logerrorWrite;
            if (logerrorWrite == null) {
                return -1;
            }
            this.read = false;
            this.serializer = logerrorWrite.RemoteActionCompatParcelizer();
        }
        while (true) {
            int i4 = this.serializer.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.write = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
                logError logerrorWrite2 = write();
                this.RemoteActionCompatParcelizer = logerrorWrite2;
                if (logerrorWrite2 == null) {
                    this.serializer = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.serializer = logerrorWrite2.RemoteActionCompatParcelizer();
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.serializer == null) {
            if (this.read) {
                logError logerrorWrite = write();
                this.RemoteActionCompatParcelizer = logerrorWrite;
                if (logerrorWrite != null) {
                    this.read = false;
                    this.serializer = logerrorWrite.RemoteActionCompatParcelizer();
                }
            }
            return -1;
        }
        while (true) {
            int i = this.serializer.read();
            if (i >= 0) {
                return i;
            }
            this.write = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            logError logerrorWrite2 = write();
            this.RemoteActionCompatParcelizer = logerrorWrite2;
            if (logerrorWrite2 == null) {
                this.serializer = null;
                return -1;
            }
            this.serializer = logerrorWrite2.RemoteActionCompatParcelizer();
        }
    }
}
