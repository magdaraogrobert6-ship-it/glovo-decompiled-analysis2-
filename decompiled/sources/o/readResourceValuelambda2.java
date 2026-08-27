package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class readResourceValuelambda2 implements r8lambdaMIqXXOzLMUUicX7GG348aw6pQE {
    public boolean RemoteActionCompatParcelizer;
    public final r8lambdaBEyrNr8p6809BwlBoRO_sTaNs read = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
    public final getConfigurationValue serializer;

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.RemoteActionCompatParcelizer;
    }

    @Override // o.getConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return this.serializer.IconCompatParcelizer();
    }

    @Override // o.getConfigurationValue, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        getConfigurationValue getconfigurationvalue = this.serializer;
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = this.read;
        long j = r8lambdabeyrnr8p6809bwlboro_stans.serializer;
        if (j > 0) {
            getconfigurationvalue.serializer(r8lambdabeyrnr8p6809bwlboro_stans, j);
        }
        th = null;
        try {
            getconfigurationvalue.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.RemoteActionCompatParcelizer = true;
        if (th == null) {
            return;
        }
        Charset charset = isInAppMessageAccessibilityExclusiveModeEnabled.RemoteActionCompatParcelizer;
        throw th;
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final OutputStream PlaybackStateCompat() {
        return new r8lambdaYgnAHvVqxbe1bV82PponR7zRwo(this, 1);
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final r8lambdaMIqXXOzLMUUicX7GG348aw6pQE MediaMetadataCompat(int i) {
        if (this.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        this.read.read(i);
        serializer();
        return this;
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final r8lambdaMIqXXOzLMUUicX7GG348aw6pQE MediaSessionCompatQueueItem(int i) {
        if (this.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        this.read.write(i);
        serializer();
        return this;
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final r8lambdaMIqXXOzLMUUicX7GG348aw6pQE RatingCompat(int i) {
        if (this.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        this.read.RemoteActionCompatParcelizer(i);
        serializer();
        return this;
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final r8lambdaMIqXXOzLMUUicX7GG348aw6pQE RemoteActionCompatParcelizer(int i, byte[] bArr) {
        if (this.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        this.read.write(bArr, 0, i);
        serializer();
        return this;
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE, o.getConfigurationValue, java.io.Flushable
    public final void flush() {
        if (this.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return;
        }
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = this.read;
        long j = r8lambdabeyrnr8p6809bwlboro_stans.serializer;
        getConfigurationValue getconfigurationvalue = this.serializer;
        if (j > 0) {
            getconfigurationvalue.serializer(r8lambdabeyrnr8p6809bwlboro_stans, j);
        }
        getconfigurationvalue.flush();
    }

    public final r8lambdaMIqXXOzLMUUicX7GG348aw6pQE serializer() {
        if (this.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = this.read;
        long j = r8lambdabeyrnr8p6809bwlboro_stans.read();
        if (j > 0) {
            this.serializer.serializer(r8lambdabeyrnr8p6809bwlboro_stans, j);
        }
        return this;
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final r8lambdaMIqXXOzLMUUicX7GG348aw6pQE serializer(String str) {
        if (this.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        this.read.RemoteActionCompatParcelizer(0, str.length(), str);
        serializer();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.serializer + ")";
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final r8lambdaMIqXXOzLMUUicX7GG348aw6pQE write(long j) {
        if (this.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        this.read.MediaMetadataCompat(j);
        serializer();
        return this;
    }

    public readResourceValuelambda2(getConfigurationValue getconfigurationvalue) {
        this.serializer = getconfigurationvalue;
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final r8lambdaMIqXXOzLMUUicX7GG348aw6pQE write(byte[] bArr) {
        if (!this.RemoteActionCompatParcelizer) {
            this.read.IconCompatParcelizer(bArr);
            serializer();
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
        return null;
    }

    @Override // o.getConfigurationValue
    public final void serializer(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) {
        if (!this.RemoteActionCompatParcelizer) {
            this.read.serializer(r8lambdabeyrnr8p6809bwlboro_stans, j);
            serializer();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (!this.RemoteActionCompatParcelizer) {
            int iWrite = this.read.write(byteBuffer);
            serializer();
            return iWrite;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
        return 0;
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final r8lambdaMIqXXOzLMUUicX7GG348aw6pQE IconCompatParcelizer(String str, Charset charset) {
        if (!this.RemoteActionCompatParcelizer) {
            this.read.read(str, 0, str.length(), charset);
            serializer();
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
        return null;
    }
}
