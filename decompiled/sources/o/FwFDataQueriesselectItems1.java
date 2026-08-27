package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFDataQueriesselectItems1 implements metricProvider {
    public final byte[] RemoteActionCompatParcelizer;
    public final byte[] read;
    public final FwFDataQueriesinsertItem2 write;

    @Override // o.metricProvider
    public final byte[] MediaMetadataCompat() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.write.read;
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.RemoteActionCompatParcelizer);
            byteArrayOutputStream.write(this.read);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e.getMessage(), e);
            return null;
        }
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        return Arrays.hashCode(this.read) + ((Arrays.hashCode(this.RemoteActionCompatParcelizer) + (iHashCode * 31)) * 31);
    }

    public FwFDataQueriesselectItems1(FwFDataQueriesinsertItem2 fwFDataQueriesinsertItem2, byte[] bArr, byte[] bArr2) {
        this.write = fwFDataQueriesinsertItem2;
        this.RemoteActionCompatParcelizer = bArr;
        this.read = bArr2;
    }

    public static FwFDataQueriesselectItems1 serializer(Object obj) throws Throwable {
        if (obj instanceof FwFDataQueriesselectItems1) {
            return (FwFDataQueriesselectItems1) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            FwFDataQueriesinsertItem2 fwFDataQueriesinsertItem2 = (FwFDataQueriesinsertItem2) FwFDataQueriesinsertItem2.write.get(Integer.valueOf(dataInputStream.readInt()));
            byte[] bArr = new byte[fwFDataQueriesinsertItem2.IconCompatParcelizer];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[fwFDataQueriesinsertItem2.RemoteActionCompatParcelizer * fwFDataQueriesinsertItem2.IconCompatParcelizer];
            dataInputStream.readFully(bArr2);
            return new FwFDataQueriesselectItems1(fwFDataQueriesinsertItem2, bArr, bArr2);
        }
        DataInputStream dataInputStream2 = null;
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return serializer(getEvaluationsfwf_client_releasedefault.read((InputStream) obj));
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(obj, "cannot parse "));
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                FwFDataQueriesselectItems1 fwFDataQueriesselectItems1Serializer = serializer(dataInputStream3);
                dataInputStream3.close();
                return fwFDataQueriesselectItems1Serializer;
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
        if (obj != null && FwFDataQueriesselectItems1.class == obj.getClass()) {
            FwFDataQueriesselectItems1 fwFDataQueriesselectItems1 = (FwFDataQueriesselectItems1) obj;
            if (this.write == fwFDataQueriesselectItems1.write && Arrays.equals(this.RemoteActionCompatParcelizer, fwFDataQueriesselectItems1.RemoteActionCompatParcelizer)) {
                return Arrays.equals(this.read, fwFDataQueriesselectItems1.read);
            }
        }
        return false;
    }
}
