package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFDataQueriesinsertItem1 extends ICache {
    public final long IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final List MediaMetadataCompat;
    public final long RemoteActionCompatParcelizer;
    public final boolean serializer;
    public final List write;

    public FwFDataQueriesinsertItem1(int i, ArrayList arrayList, ArrayList arrayList2, long j, long j2, boolean z) {
        super(true);
        this.RemoteActionCompatParcelizer = 0L;
        this.MediaBrowserCompatMediaItem = i;
        this.write = Collections.unmodifiableList(arrayList);
        this.MediaMetadataCompat = Collections.unmodifiableList(arrayList2);
        this.RemoteActionCompatParcelizer = j;
        this.IconCompatParcelizer = j2;
        this.serializer = z;
    }

    @Override // o.metricProvider
    public final byte[] MediaMetadataCompat() {
        byte[] byteArray;
        synchronized (this) {
            UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt = new UserAgentHeaderInterceptorKt();
            userAgentHeaderInterceptorKt.IconCompatParcelizer(0);
            userAgentHeaderInterceptorKt.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
            long j = this.RemoteActionCompatParcelizer;
            userAgentHeaderInterceptorKt.IconCompatParcelizer((int) (j >>> 32));
            userAgentHeaderInterceptorKt.IconCompatParcelizer((int) j);
            long j2 = this.IconCompatParcelizer;
            userAgentHeaderInterceptorKt.IconCompatParcelizer((int) (j2 >>> 32));
            userAgentHeaderInterceptorKt.IconCompatParcelizer((int) j2);
            userAgentHeaderInterceptorKt.write.write(this.serializer ? 1 : 0);
            Iterator it = this.write.iterator();
            while (it.hasNext()) {
                userAgentHeaderInterceptorKt.IconCompatParcelizer((FwFDataQueriesselectItems2) it.next());
            }
            Iterator it2 = this.MediaMetadataCompat.iterator();
            while (it2.hasNext()) {
                userAgentHeaderInterceptorKt.IconCompatParcelizer((accessdecodeInitialData) it2.next());
            }
            byteArray = userAgentHeaderInterceptorKt.write.toByteArray();
        }
        return byteArray;
    }

    public static FwFDataQueriesinsertItem1 read(Object obj) {
        if (obj instanceof FwFDataQueriesinsertItem1) {
            return (FwFDataQueriesinsertItem1) obj;
        }
        DataInputStream dataInputStream = null;
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("unknown version for hss private key");
                return null;
            }
            int i = dataInputStream2.readInt();
            long j = dataInputStream2.readLong();
            long j2 = dataInputStream2.readLong();
            boolean z = dataInputStream2.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(FwFDataQueriesselectItems2.IconCompatParcelizer(obj));
            }
            for (int i3 = 0; i3 < i - 1; i3++) {
                arrayList2.add(accessdecodeInitialData.write(obj));
            }
            return new FwFDataQueriesinsertItem1(i, arrayList, arrayList2, j, j2, z);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return read(getEvaluationsfwf_client_releasedefault.read((InputStream) obj));
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(obj, "cannot parse "));
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                FwFDataQueriesinsertItem1 fwFDataQueriesinsertItem1 = read(dataInputStream3);
                dataInputStream3.close();
                return fwFDataQueriesinsertItem1;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream3;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final Object clone() {
        try {
            return read(MediaMetadataCompat());
        } catch (Exception e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e.getMessage(), e);
            return null;
        }
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompatMediaItem;
        boolean z = this.serializer;
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.MediaMetadataCompat.hashCode();
        long j = this.IconCompatParcelizer;
        long j2 = this.RemoteActionCompatParcelizer;
        return ((((iHashCode2 + ((iHashCode + (((i * 31) + (z ? 1 : 0)) * 31)) * 31)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FwFDataQueriesinsertItem1.class != obj.getClass()) {
            return false;
        }
        FwFDataQueriesinsertItem1 fwFDataQueriesinsertItem1 = (FwFDataQueriesinsertItem1) obj;
        if (this.MediaBrowserCompatMediaItem == fwFDataQueriesinsertItem1.MediaBrowserCompatMediaItem && this.serializer == fwFDataQueriesinsertItem1.serializer && this.IconCompatParcelizer == fwFDataQueriesinsertItem1.IconCompatParcelizer && this.RemoteActionCompatParcelizer == fwFDataQueriesinsertItem1.RemoteActionCompatParcelizer && this.write.equals(fwFDataQueriesinsertItem1.write)) {
            return this.MediaMetadataCompat.equals(fwFDataQueriesinsertItem1.MediaMetadataCompat);
        }
        return false;
    }
}
