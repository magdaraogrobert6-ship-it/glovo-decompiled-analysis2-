package o;

import java.nio.charset.Charset;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaG0SDL9ycwlKKHKCla31fHjGYFE implements getConfigurationValue {
    public final Deflater IconCompatParcelizer;
    public final readResourceValuelambda2 serializer;
    public boolean write;

    @Override // o.getConfigurationValue, java.io.Flushable
    public final void flush() {
        read(true);
        this.serializer.flush();
    }

    @Override // o.getConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return this.serializer.serializer.IconCompatParcelizer();
    }

    @Override // o.getConfigurationValue, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.IconCompatParcelizer;
        if (this.write) {
            return;
        }
        deflater.finish();
        read(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.serializer.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.write = true;
        if (th == null) {
            return;
        }
        Charset charset = isInAppMessageAccessibilityExclusiveModeEnabled.RemoteActionCompatParcelizer;
        throw th;
    }

    public final void read(boolean z) {
        resetCachelambda0 resetcachelambda0IconCompatParcelizer;
        readResourceValuelambda2 readresourcevaluelambda2 = this.serializer;
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = readresourcevaluelambda2.read;
        while (true) {
            resetcachelambda0IconCompatParcelizer = r8lambdabeyrnr8p6809bwlboro_stans.IconCompatParcelizer(1);
            byte[] bArr = resetcachelambda0IconCompatParcelizer.serializer;
            int i = resetcachelambda0IconCompatParcelizer.read;
            Deflater deflater = this.IconCompatParcelizer;
            int iDeflate = z ? deflater.deflate(bArr, i, 8192 - i, 2) : deflater.deflate(bArr, i, 8192 - i);
            if (iDeflate > 0) {
                resetcachelambda0IconCompatParcelizer.read += iDeflate;
                r8lambdabeyrnr8p6809bwlboro_stans.serializer += (long) iDeflate;
                readresourcevaluelambda2.serializer();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (resetcachelambda0IconCompatParcelizer.IconCompatParcelizer == resetcachelambda0IconCompatParcelizer.read) {
            r8lambdabeyrnr8p6809bwlboro_stans.read = resetcachelambda0IconCompatParcelizer.IconCompatParcelizer();
            getColorValue.IconCompatParcelizer(resetcachelambda0IconCompatParcelizer);
        }
    }

    public r8lambdaG0SDL9ycwlKKHKCla31fHjGYFE(readResourceValuelambda2 readresourcevaluelambda2, Deflater deflater) {
        this.serializer = readresourcevaluelambda2;
        this.IconCompatParcelizer = deflater;
    }

    public final String toString() {
        return "DeflaterSink(" + this.serializer + ")";
    }

    @Override // o.getConfigurationValue
    public final void serializer(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) {
        isInAppMessageAccessibilityExclusiveModeEnabled.IconCompatParcelizer(r8lambdabeyrnr8p6809bwlboro_stans.serializer, 0L, j);
        while (j > 0) {
            resetCachelambda0 resetcachelambda0 = r8lambdabeyrnr8p6809bwlboro_stans.read;
            int iMin = (int) Math.min(j, resetcachelambda0.read - resetcachelambda0.IconCompatParcelizer);
            this.IconCompatParcelizer.setInput(resetcachelambda0.serializer, resetcachelambda0.IconCompatParcelizer, iMin);
            read(false);
            long j2 = iMin;
            r8lambdabeyrnr8p6809bwlboro_stans.serializer -= j2;
            int i = resetcachelambda0.IconCompatParcelizer + iMin;
            resetcachelambda0.IconCompatParcelizer = i;
            if (i == resetcachelambda0.read) {
                r8lambdabeyrnr8p6809bwlboro_stans.read = resetcachelambda0.IconCompatParcelizer();
                getColorValue.IconCompatParcelizer(resetcachelambda0);
            }
            j -= j2;
        }
    }
}
