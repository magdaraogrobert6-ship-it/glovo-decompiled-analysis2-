package com.incognia.internal;

import java.io.ByteArrayOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jj {
    public static byte[] BGx(byte[] bArr) {
        Inflater inflater = new Inflater(true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream, inflater);
        try {
            try {
                inflaterOutputStream.write(bArr);
                inflaterOutputStream.close();
                inflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    int i = sourceInformationContextOfdefault.read();
                    int i2 = sourceInformationContextOfdefault.read();
                    int i3 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{inflaterOutputStream, th}, i3);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            inflater.end();
            throw th3;
        }
    }
}
