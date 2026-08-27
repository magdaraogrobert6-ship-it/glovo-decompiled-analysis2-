package com.sentiance.okio;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.isInAppMessageAccessibilityExclusiveModeEnabled;
import o.r8lambdaBEyrNr8p6809BwlBoRO_sTaNs;
import o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k;
import o.readResourceValuelambda1;

/* JADX INFO: loaded from: classes3.dex */
public final class c$b extends InputStream {
    public final Object serializer;
    public final /* synthetic */ int write;

    public c$b(ByteBuffer byteBuffer) {
        this.write = 1;
        this.serializer = byteBuffer;
        byteBuffer.position(0);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.write;
        Object obj = this.serializer;
        if (i3 == 0) {
            return ((r8lambdaBEyrNr8p6809BwlBoRO_sTaNs) obj).IconCompatParcelizer(bArr, i, i2);
        }
        if (i3 == 1) {
            bArr.getClass();
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            int iRemaining = byteBuffer.remaining();
            if (i2 > iRemaining) {
                i2 = iRemaining;
            }
            byteBuffer.get(bArr, i, i2);
            return i2;
        }
        readResourceValuelambda1 readresourcevaluelambda1 = (readResourceValuelambda1) obj;
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = readresourcevaluelambda1.IconCompatParcelizer;
        if (readresourcevaluelambda1.read) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
            return 0;
        }
        isInAppMessageAccessibilityExclusiveModeEnabled.IconCompatParcelizer(bArr.length, i, i2);
        if (r8lambdabeyrnr8p6809bwlboro_stans.serializer == 0 && readresourcevaluelambda1.write.read(r8lambdabeyrnr8p6809bwlboro_stans, 8192L) == -1) {
            return -1;
        }
        return r8lambdabeyrnr8p6809bwlboro_stans.IconCompatParcelizer(bArr, i, i2);
    }

    public String toString() {
        int i = this.write;
        Object obj = this.serializer;
        if (i == 0) {
            return ((r8lambdaBEyrNr8p6809BwlBoRO_sTaNs) obj) + ".inputStream()";
        }
        if (i != 2) {
            return super.toString();
        }
        return ((readResourceValuelambda1) obj) + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = this.write;
        Object obj = this.serializer;
        if (i == 0) {
            return (int) Math.min(((r8lambdaBEyrNr8p6809BwlBoRO_sTaNs) obj).serializer, 2147483647L);
        }
        if (i == 1) {
            return ((ByteBuffer) obj).remaining();
        }
        readResourceValuelambda1 readresourcevaluelambda1 = (readResourceValuelambda1) obj;
        if (!readresourcevaluelambda1.read) {
            return (int) Math.min(readresourcevaluelambda1.IconCompatParcelizer.serializer, 2147483647L);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = this.write;
        if (i != 0) {
            if (i != 2) {
                super.close();
            } else {
                ((readResourceValuelambda1) this.serializer).close();
            }
        }
    }

    public /* synthetic */ c$b(r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k r8lambdaoorzolqoybc_uxebbkbnmvlvm7k, int i) {
        this.write = i;
        this.serializer = r8lambdaoorzolqoybc_uxebbkbnmvlvm7k;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.write;
        Object obj = this.serializer;
        if (i == 0) {
            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = (r8lambdaBEyrNr8p6809BwlBoRO_sTaNs) obj;
            if (r8lambdabeyrnr8p6809bwlboro_stans.serializer > 0) {
                return r8lambdabeyrnr8p6809bwlboro_stans.MediaBrowserCompatMediaItem() & 255;
            }
            return -1;
        }
        if (i != 1) {
            readResourceValuelambda1 readresourcevaluelambda1 = (readResourceValuelambda1) obj;
            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans2 = readresourcevaluelambda1.IconCompatParcelizer;
            if (readresourcevaluelambda1.read) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
                return 0;
            }
            if (r8lambdabeyrnr8p6809bwlboro_stans2.serializer == 0 && readresourcevaluelambda1.write.read(r8lambdabeyrnr8p6809bwlboro_stans2, 8192L) == -1) {
                return -1;
            }
            return r8lambdabeyrnr8p6809bwlboro_stans2.MediaBrowserCompatMediaItem() & 255;
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get();
        }
        return -1;
    }
}
