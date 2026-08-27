package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFDataQueriesdeleteItem2 extends ICache {
    public final FwFDataQueriesselectItem2 RemoteActionCompatParcelizer;
    public final int serializer;

    public FwFDataQueriesdeleteItem2(int i, FwFDataQueriesselectItem2 fwFDataQueriesselectItem2) {
        super(false);
        if (fwFDataQueriesselectItem2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("lmsPublicKey");
            throw null;
        }
        this.serializer = i;
        this.RemoteActionCompatParcelizer = fwFDataQueriesselectItem2;
    }

    @Override // o.metricProvider
    public final byte[] MediaMetadataCompat() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.serializer;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.RemoteActionCompatParcelizer.MediaMetadataCompat());
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e.getMessage(), e);
            return null;
        }
    }

    public static FwFDataQueriesdeleteItem2 IconCompatParcelizer(Object obj) {
        if (obj instanceof FwFDataQueriesdeleteItem2) {
            return (FwFDataQueriesdeleteItem2) obj;
        }
        if (obj instanceof DataInputStream) {
            return new FwFDataQueriesdeleteItem2(((DataInputStream) obj).readInt(), FwFDataQueriesselectItem2.write(obj));
        }
        DataInputStream dataInputStream = null;
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return IconCompatParcelizer(getEvaluationsfwf_client_releasedefault.read((InputStream) obj));
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(obj, "cannot parse "));
            return null;
        }
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                FwFDataQueriesdeleteItem2 fwFDataQueriesdeleteItem2IconCompatParcelizer = IconCompatParcelizer(dataInputStream2);
                dataInputStream2.close();
                return fwFDataQueriesdeleteItem2IconCompatParcelizer;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + (this.serializer * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FwFDataQueriesdeleteItem2.class != obj.getClass()) {
            return false;
        }
        FwFDataQueriesdeleteItem2 fwFDataQueriesdeleteItem2 = (FwFDataQueriesdeleteItem2) obj;
        if (this.serializer != fwFDataQueriesdeleteItem2.serializer) {
            return false;
        }
        return this.RemoteActionCompatParcelizer.equals(fwFDataQueriesdeleteItem2.RemoteActionCompatParcelizer);
    }
}
