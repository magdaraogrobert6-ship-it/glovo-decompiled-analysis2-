package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class readResourceValuelambda0 implements getResourceConfigurationValue {
    public final readResourceValuelambda1 IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public int serializer;
    public final Inflater write;

    @Override // o.getResourceConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return this.IconCompatParcelizer.write.IconCompatParcelizer();
    }

    public readResourceValuelambda0(readResourceValuelambda1 readresourcevaluelambda1, Inflater inflater) {
        this.IconCompatParcelizer = readresourcevaluelambda1;
        this.write = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        this.write.end();
        this.RemoteActionCompatParcelizer = true;
        this.IconCompatParcelizer.close();
    }

    @Override // o.getResourceConfigurationValue
    public final long read(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) {
        boolean z;
        if (this.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return 0L;
        }
        do {
            Inflater inflater = this.write;
            boolean zNeedsInput = inflater.needsInput();
            readResourceValuelambda1 readresourcevaluelambda1 = this.IconCompatParcelizer;
            if (zNeedsInput) {
                int i = this.serializer;
                if (i != 0) {
                    int remaining = i - inflater.getRemaining();
                    this.serializer -= remaining;
                    readresourcevaluelambda1.IconCompatParcelizer(remaining);
                }
                if (inflater.getRemaining() != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("?");
                    return 0L;
                }
                if (readresourcevaluelambda1.RemoteActionCompatParcelizer()) {
                    z = true;
                } else {
                    resetCachelambda0 resetcachelambda0 = readresourcevaluelambda1.IconCompatParcelizer.read;
                    int i2 = resetcachelambda0.read;
                    int i3 = resetcachelambda0.IconCompatParcelizer;
                    int i4 = i2 - i3;
                    this.serializer = i4;
                    inflater.setInput(resetcachelambda0.serializer, i3, i4);
                    z = false;
                }
            } else {
                z = false;
            }
            try {
                resetCachelambda0 resetcachelambda0IconCompatParcelizer = r8lambdabeyrnr8p6809bwlboro_stans.IconCompatParcelizer(1);
                int iInflate = inflater.inflate(resetcachelambda0IconCompatParcelizer.serializer, resetcachelambda0IconCompatParcelizer.read, (int) Math.min(8192L, 8192 - resetcachelambda0IconCompatParcelizer.read));
                if (iInflate > 0) {
                    resetcachelambda0IconCompatParcelizer.read += iInflate;
                    long j2 = iInflate;
                    r8lambdabeyrnr8p6809bwlboro_stans.serializer += j2;
                    return j2;
                }
                if (!inflater.finished() && !inflater.needsDictionary()) {
                }
                int i5 = this.serializer;
                if (i5 != 0) {
                    int remaining2 = i5 - inflater.getRemaining();
                    this.serializer -= remaining2;
                    readresourcevaluelambda1.IconCompatParcelizer(remaining2);
                }
                if (resetcachelambda0IconCompatParcelizer.IconCompatParcelizer != resetcachelambda0IconCompatParcelizer.read) {
                    return -1L;
                }
                r8lambdabeyrnr8p6809bwlboro_stans.read = resetcachelambda0IconCompatParcelizer.IconCompatParcelizer();
                getColorValue.IconCompatParcelizer(resetcachelambda0IconCompatParcelizer);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!z);
        throw new EOFException("source exhausted prematurely");
    }
}
