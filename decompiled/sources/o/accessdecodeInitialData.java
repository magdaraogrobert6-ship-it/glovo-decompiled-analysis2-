package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class accessdecodeInitialData implements metricProvider {
    public final byte[][] IconCompatParcelizer;
    public final MemoryCache RemoteActionCompatParcelizer;
    public final FwFDataQueriesselectItems1 read;
    public final int write;

    @Override // o.metricProvider
    public final byte[] MediaMetadataCompat() {
        UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt = new UserAgentHeaderInterceptorKt();
        userAgentHeaderInterceptorKt.IconCompatParcelizer(this.write);
        userAgentHeaderInterceptorKt.IconCompatParcelizer(this.read.MediaMetadataCompat());
        userAgentHeaderInterceptorKt.IconCompatParcelizer(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
        byte[][] bArr = this.IconCompatParcelizer;
        try {
            int length = bArr.length;
            int i = 0;
            while (true) {
                ByteArrayOutputStream byteArrayOutputStream = userAgentHeaderInterceptorKt.write;
                if (i >= length) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr[i]);
                i++;
            }
        } catch (Exception e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e.getMessage(), e);
            return null;
        }
    }

    public accessdecodeInitialData(int i, FwFDataQueriesselectItems1 fwFDataQueriesselectItems1, MemoryCache memoryCache, byte[][] bArr) {
        this.write = i;
        this.read = fwFDataQueriesselectItems1;
        this.RemoteActionCompatParcelizer = memoryCache;
        this.IconCompatParcelizer = bArr;
    }

    public static accessdecodeInitialData write(Object obj) throws Throwable {
        if (obj instanceof accessdecodeInitialData) {
            return (accessdecodeInitialData) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int i = dataInputStream.readInt();
            FwFDataQueriesselectItems1 fwFDataQueriesselectItems1Serializer = FwFDataQueriesselectItems1.serializer(obj);
            MemoryCache memoryCache = (MemoryCache) MemoryCache.serializer.get(Integer.valueOf(dataInputStream.readInt()));
            int i2 = memoryCache.read;
            byte[][] bArr = new byte[i2][];
            for (int i3 = 0; i3 < i2; i3++) {
                byte[] bArr2 = new byte[memoryCache.write];
                bArr[i3] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new accessdecodeInitialData(i, fwFDataQueriesselectItems1Serializer, memoryCache, bArr);
        }
        DataInputStream dataInputStream2 = null;
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return write(getEvaluationsfwf_client_releasedefault.read((InputStream) obj));
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(obj, "cannot parse "));
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                accessdecodeInitialData accessdecodeinitialdataWrite = write(dataInputStream3);
                dataInputStream3.close();
                return accessdecodeinitialdataWrite;
            } catch (Throwable th) {
                th = th;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final int hashCode() {
        int i = this.write;
        FwFDataQueriesselectItems1 fwFDataQueriesselectItems1 = this.read;
        return Arrays.deepHashCode(this.IconCompatParcelizer) + ((this.RemoteActionCompatParcelizer.hashCode() + (((i * 31) + (fwFDataQueriesselectItems1 != null ? fwFDataQueriesselectItems1.hashCode() : 0)) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && accessdecodeInitialData.class == obj.getClass()) {
            accessdecodeInitialData accessdecodeinitialdata = (accessdecodeInitialData) obj;
            if (this.write == accessdecodeinitialdata.write) {
                FwFDataQueriesselectItems1 fwFDataQueriesselectItems1 = accessdecodeinitialdata.read;
                FwFDataQueriesselectItems1 fwFDataQueriesselectItems2 = this.read;
                if (fwFDataQueriesselectItems2 == null ? fwFDataQueriesselectItems1 == null : fwFDataQueriesselectItems2.equals(fwFDataQueriesselectItems1)) {
                    if (this.RemoteActionCompatParcelizer != accessdecodeinitialdata.RemoteActionCompatParcelizer) {
                        return false;
                    }
                    return Arrays.deepEquals(this.IconCompatParcelizer, accessdecodeinitialdata.IconCompatParcelizer);
                }
            }
        }
        return false;
    }
}
