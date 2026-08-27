package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFDataQueriesselectItem2 extends ICache {
    public final MemoryCache IconCompatParcelizer;
    public final byte[] RemoteActionCompatParcelizer;
    public final FwFDataQueriesinsertItem2 serializer;
    public final byte[] write;

    public FwFDataQueriesselectItem2(MemoryCache memoryCache, FwFDataQueriesinsertItem2 fwFDataQueriesinsertItem2, byte[] bArr, byte[] bArr2) {
        super(false);
        this.IconCompatParcelizer = memoryCache;
        this.serializer = fwFDataQueriesinsertItem2;
        this.write = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr2);
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
    }

    @Override // o.metricProvider
    public final byte[] MediaMetadataCompat() {
        UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt = new UserAgentHeaderInterceptorKt();
        userAgentHeaderInterceptorKt.IconCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer);
        userAgentHeaderInterceptorKt.IconCompatParcelizer(this.serializer.read);
        userAgentHeaderInterceptorKt.IconCompatParcelizer(this.write);
        userAgentHeaderInterceptorKt.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        return userAgentHeaderInterceptorKt.write.toByteArray();
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        return accessbootstrapIfNeeded.read(this.RemoteActionCompatParcelizer) + ((accessbootstrapIfNeeded.read(this.write) + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
    }

    public static FwFDataQueriesselectItem2 write(Object obj) throws Throwable {
        if (obj instanceof FwFDataQueriesselectItem2) {
            return (FwFDataQueriesselectItem2) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            MemoryCache memoryCache = (MemoryCache) MemoryCache.serializer.get(Integer.valueOf(dataInputStream.readInt()));
            FwFDataQueriesinsertItem2 fwFDataQueriesinsertItem2 = (FwFDataQueriesinsertItem2) FwFDataQueriesinsertItem2.write.get(Integer.valueOf(dataInputStream.readInt()));
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[memoryCache.write];
            dataInputStream.readFully(bArr2);
            return new FwFDataQueriesselectItem2(memoryCache, fwFDataQueriesinsertItem2, bArr2, bArr);
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
                FwFDataQueriesselectItem2 fwFDataQueriesselectItem2Write = write(dataInputStream3);
                dataInputStream3.close();
                return fwFDataQueriesselectItem2Write;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FwFDataQueriesselectItem2.class != obj.getClass()) {
            return false;
        }
        FwFDataQueriesselectItem2 fwFDataQueriesselectItem2 = (FwFDataQueriesselectItem2) obj;
        if (this.IconCompatParcelizer.equals(fwFDataQueriesselectItem2.IconCompatParcelizer) && this.serializer.equals(fwFDataQueriesselectItem2.serializer) && Arrays.equals(this.write, fwFDataQueriesselectItem2.write)) {
            return Arrays.equals(this.RemoteActionCompatParcelizer, fwFDataQueriesselectItem2.RemoteActionCompatParcelizer);
        }
        return false;
    }
}
