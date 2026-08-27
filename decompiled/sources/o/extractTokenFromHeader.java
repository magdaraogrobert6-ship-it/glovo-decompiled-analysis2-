package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class extractTokenFromHeader {
    public static final logErrordefault[] read = new logErrordefault[0];
    public int RemoteActionCompatParcelizer;
    public logErrordefault[] serializer;
    public boolean write;

    public final void write(logErrordefault logerrordefault) {
        if (logerrordefault == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("'element' cannot be null");
            return;
        }
        logErrordefault[] logerrordefaultArr = this.serializer;
        int length = logerrordefaultArr.length;
        int i = this.RemoteActionCompatParcelizer + 1;
        if (this.write | (i > length)) {
            logErrordefault[] logerrordefaultArr2 = new logErrordefault[Math.max(logerrordefaultArr.length, (i >> 1) + i)];
            System.arraycopy(this.serializer, 0, logerrordefaultArr2, 0, this.RemoteActionCompatParcelizer);
            this.serializer = logerrordefaultArr2;
            this.write = false;
        }
        this.serializer[this.RemoteActionCompatParcelizer] = logerrordefault;
        this.RemoteActionCompatParcelizer = i;
    }

    public final logErrordefault[] IconCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return read;
        }
        logErrordefault[] logerrordefaultArr = this.serializer;
        if (logerrordefaultArr.length == i) {
            this.write = true;
            return logerrordefaultArr;
        }
        logErrordefault[] logerrordefaultArr2 = new logErrordefault[i];
        System.arraycopy(logerrordefaultArr, 0, logerrordefaultArr2, 0, i);
        return logerrordefaultArr2;
    }

    public final logErrordefault read(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        if (i < i2) {
            return this.serializer[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + i2);
    }

    public extractTokenFromHeader(int i) {
        if (i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("'initialCapacity' must not be negative");
            throw null;
        }
        this.serializer = i == 0 ? read : new logErrordefault[i];
        this.RemoteActionCompatParcelizer = 0;
        this.write = false;
    }

    public extractTokenFromHeader() {
        this(10);
    }
}
