package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.charset.Charset;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes3.dex */
public final class getResourceConfigurationValuelambda0 implements getConfigurationValue {
    public final Deflater IconCompatParcelizer;
    public final readResourceValuelambda2 RemoteActionCompatParcelizer;
    public final r8lambdaG0SDL9ycwlKKHKCla31fHjGYFE read;
    public boolean serializer;
    public final CRC32 write = new CRC32();

    @Override // o.getConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.serializer.IconCompatParcelizer();
    }

    @Override // o.getConfigurationValue, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.IconCompatParcelizer;
        readResourceValuelambda2 readresourcevaluelambda2 = this.RemoteActionCompatParcelizer;
        if (this.serializer) {
            return;
        }
        r8lambdaG0SDL9ycwlKKHKCla31fHjGYFE r8lambdag0sdl9ycwlkkhkcla31fhjgyfe = this.read;
        r8lambdag0sdl9ycwlkkhkcla31fhjgyfe.IconCompatParcelizer.finish();
        r8lambdag0sdl9ycwlkkhkcla31fhjgyfe.read(false);
        int value = (int) this.write.getValue();
        if (readresourcevaluelambda2.RemoteActionCompatParcelizer) {
            throw new IllegalStateException("closed");
        }
        readresourcevaluelambda2.read.read(isInAppMessageAccessibilityExclusiveModeEnabled.write(value));
        readresourcevaluelambda2.serializer();
        int bytesRead = (int) deflater.getBytesRead();
        if (readresourcevaluelambda2.RemoteActionCompatParcelizer) {
            throw new IllegalStateException("closed");
        }
        readresourcevaluelambda2.read.read(isInAppMessageAccessibilityExclusiveModeEnabled.write(bytesRead));
        readresourcevaluelambda2.serializer();
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            readresourcevaluelambda2.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.serializer = true;
        if (th == null) {
            return;
        }
        Charset charset = isInAppMessageAccessibilityExclusiveModeEnabled.RemoteActionCompatParcelizer;
        throw th;
    }

    @Override // o.getConfigurationValue, java.io.Flushable
    public final void flush() {
        this.read.flush();
    }

    public getResourceConfigurationValuelambda0(r8lambdaMIqXXOzLMUUicX7GG348aw6pQE r8lambdamiqxxozlmuuicx7gg348aw6pqe) {
        Deflater deflater = new Deflater(-1, true);
        this.IconCompatParcelizer = deflater;
        java.util.logging.Logger logger = getResourceIdentifier.read;
        readResourceValuelambda2 readresourcevaluelambda2 = new readResourceValuelambda2(r8lambdamiqxxozlmuuicx7gg348aw6pqe);
        this.RemoteActionCompatParcelizer = readresourcevaluelambda2;
        this.read = new r8lambdaG0SDL9ycwlKKHKCla31fHjGYFE(readresourcevaluelambda2, deflater);
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = readresourcevaluelambda2.read;
        r8lambdabeyrnr8p6809bwlboro_stans.RemoteActionCompatParcelizer(8075);
        r8lambdabeyrnr8p6809bwlboro_stans.write(8);
        r8lambdabeyrnr8p6809bwlboro_stans.write(0);
        r8lambdabeyrnr8p6809bwlboro_stans.read(0);
        r8lambdabeyrnr8p6809bwlboro_stans.write(0);
        r8lambdabeyrnr8p6809bwlboro_stans.write(0);
    }

    @Override // o.getConfigurationValue
    public final void serializer(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) {
        if (j < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(j, "byteCount < 0: "));
            return;
        }
        if (j == 0) {
            return;
        }
        resetCachelambda0 resetcachelambda0 = r8lambdabeyrnr8p6809bwlboro_stans.read;
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, resetcachelambda0.read - resetcachelambda0.IconCompatParcelizer);
            this.write.update(resetcachelambda0.serializer, resetcachelambda0.IconCompatParcelizer, iMin);
            j2 -= (long) iMin;
            resetcachelambda0 = resetcachelambda0.RatingCompat;
        }
        this.read.serializer(r8lambdabeyrnr8p6809bwlboro_stans, j);
    }
}
