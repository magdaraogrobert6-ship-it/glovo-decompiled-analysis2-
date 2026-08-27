package com.incognia.internal;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Tl {
    public static final byte[] HQ = new byte[0];
    public final ByteArrayOutputStream BGx = new ByteArrayOutputStream(4);
    public final InputStream mbG;

    public final byte[] BGx(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        int i = this.mbG.read();
        while ((i & (-128)) != 0) {
            byteArrayOutputStream.write(i ^ (-128));
            i = this.mbG.read();
        }
        byteArrayOutputStream.write(i);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        return byteArray;
    }

    public final Yc mbG() throws IOException {
        Object next;
        byte[] bArrCopyOf;
        byte[] bArr;
        int i;
        byte[] bArrBGx = BGx(this.BGx);
        int length = bArrBGx.length;
        long j = 0;
        for (int i2 = 0; i2 < length; i2++) {
            j += (((long) bArrBGx[i2]) & 255) << (i2 * 7);
        }
        int i3 = (int) (j >> 3);
        byte b = (byte) (7 & j);
        Iterator it = ((List) PF.mbG.MediaSessionCompatResultReceiverWrapper()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((PF) next).BGx != b);
        Object obj = (PF) next;
        if (obj == null) {
            obj = Qjd.HQ;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, Qjd.HQ}, getCieXyz.write())).booleanValue()) {
            bArrCopyOf = BGx(this.BGx);
        } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, tcl.HQ}, getCieXyz.write())).booleanValue()) {
            byte[] bArr2 = new byte[8];
            int i4 = this.mbG.read(bArr2);
            bArrCopyOf = i4 == -1 ? HQ : Arrays.copyOf(bArr2, i4);
        } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, f7u.HQ}, getCieXyz.write())).booleanValue()) {
            byte[] bArr3 = new byte[4];
            int i5 = this.mbG.read(bArr3);
            bArrCopyOf = i5 == -1 ? HQ : Arrays.copyOf(bArr3, i5);
        } else {
            bArrCopyOf = (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, fIO.HQ}, getCieXyz.write())).booleanValue() || (i = this.mbG.read((bArr = new byte[nQ.mbG(BGx(this.BGx)).intValue()]))) == -1) ? HQ : Arrays.copyOf(bArr, i);
        }
        return new Yc(i3, bArrCopyOf);
    }

    public Tl(InputStream inputStream) {
        this.mbG = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream);
    }

    public final boolean BGx() {
        return this.mbG.available() > 0;
    }
}
