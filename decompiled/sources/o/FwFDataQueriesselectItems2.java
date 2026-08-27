package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFDataQueriesselectItems2 extends ICache {
    public static final getAll[] serializer;
    public static final getAll write;
    public final byte[] IconCompatParcelizer;
    public final FwFDataQueriesinsertItem2 MediaBrowserCompatMediaItem;
    public final MemoryCache MediaDescriptionCompat;
    public FwFDataQueriesselectItem2 MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final int MediaSessionCompatToken;
    public final WeakHashMap PlaybackStateCompat;
    public final CustomerChatModulestartChat2 PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public final byte[] RemoteActionCompatParcelizer;

    public FwFDataQueriesselectItems2(MemoryCache memoryCache, FwFDataQueriesinsertItem2 fwFDataQueriesinsertItem2, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.MediaDescriptionCompat = memoryCache;
        this.MediaBrowserCompatMediaItem = fwFDataQueriesinsertItem2;
        this.MediaSessionCompatToken = i;
        this.IconCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        this.MediaSessionCompatQueueItem = i2;
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr2);
        this.RatingCompat = 1 << (memoryCache.read + 1);
        this.PlaybackStateCompat = new WeakHashMap();
        this.PlaybackStateCompatCustomAction = FwFDataQueriesdeleteItem1.read(memoryCache.write, memoryCache.IconCompatParcelizer);
    }

    public final FwFDataQueriesselectItem2 read() {
        FwFDataQueriesselectItem2 fwFDataQueriesselectItem2;
        synchronized (this) {
            if (this.MediaMetadataCompat == null) {
                this.MediaMetadataCompat = new FwFDataQueriesselectItem2(this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem, RemoteActionCompatParcelizer(write), this.IconCompatParcelizer);
            }
            fwFDataQueriesselectItem2 = this.MediaMetadataCompat;
        }
        return fwFDataQueriesselectItem2;
    }

    @Override // o.metricProvider
    public final byte[] MediaMetadataCompat() {
        UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt = new UserAgentHeaderInterceptorKt();
        userAgentHeaderInterceptorKt.IconCompatParcelizer(0);
        userAgentHeaderInterceptorKt.IconCompatParcelizer(this.MediaDescriptionCompat.RemoteActionCompatParcelizer);
        userAgentHeaderInterceptorKt.IconCompatParcelizer(this.MediaBrowserCompatMediaItem.read);
        userAgentHeaderInterceptorKt.IconCompatParcelizer(this.IconCompatParcelizer);
        userAgentHeaderInterceptorKt.IconCompatParcelizer(this.MediaSessionCompatToken);
        userAgentHeaderInterceptorKt.IconCompatParcelizer(this.MediaSessionCompatQueueItem);
        byte[] bArr = this.RemoteActionCompatParcelizer;
        userAgentHeaderInterceptorKt.IconCompatParcelizer(bArr.length);
        userAgentHeaderInterceptorKt.IconCompatParcelizer(bArr);
        return userAgentHeaderInterceptorKt.write.toByteArray();
    }

    public final byte[] RemoteActionCompatParcelizer(getAll getall) {
        synchronized (this.PlaybackStateCompat) {
            byte[] bArr = (byte[]) this.PlaybackStateCompat.get(getall);
            if (bArr != null) {
                return bArr;
            }
            byte[] bArrWrite = write(getall.RemoteActionCompatParcelizer);
            this.PlaybackStateCompat.put(getall, bArrWrite);
            return bArrWrite;
        }
    }

    static {
        getAll getall = new getAll(1);
        write = getall;
        getAll[] getallArr = new getAll[129];
        serializer = getallArr;
        getallArr[1] = getall;
        int i = 2;
        while (true) {
            getAll[] getallArr2 = serializer;
            if (i >= getallArr2.length) {
                return;
            }
            getallArr2[i] = new getAll(i);
            i++;
        }
    }

    public static FwFDataQueriesselectItems2 IconCompatParcelizer(Object obj) {
        if (obj instanceof FwFDataQueriesselectItems2) {
            return (FwFDataQueriesselectItems2) obj;
        }
        DataInputStream dataInputStream = null;
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("expected version 0 lms private key");
                return null;
            }
            MemoryCache memoryCache = (MemoryCache) MemoryCache.serializer.get(Integer.valueOf(dataInputStream2.readInt()));
            FwFDataQueriesinsertItem2 fwFDataQueriesinsertItem2 = (FwFDataQueriesinsertItem2) FwFDataQueriesinsertItem2.write.get(Integer.valueOf(dataInputStream2.readInt()));
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            int i = dataInputStream2.readInt();
            int i2 = dataInputStream2.readInt();
            int i3 = dataInputStream2.readInt();
            if (i3 < 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("secret length less than zero");
                return null;
            }
            if (i3 > dataInputStream2.available()) {
                DrawableTransformation.RemoteActionCompatParcelizer(dataInputStream2.available(), "secret length exceeded ");
                return null;
            }
            byte[] bArr2 = new byte[i3];
            dataInputStream2.readFully(bArr2);
            return new FwFDataQueriesselectItems2(memoryCache, fwFDataQueriesinsertItem2, i, bArr, i2, bArr2);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return IconCompatParcelizer(getEvaluationsfwf_client_releasedefault.read((InputStream) obj));
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(obj, "cannot parse "));
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                FwFDataQueriesselectItems2 fwFDataQueriesselectItems2IconCompatParcelizer = IconCompatParcelizer(dataInputStream3);
                dataInputStream3.close();
                return fwFDataQueriesselectItems2IconCompatParcelizer;
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

    public final int hashCode() {
        int i = this.MediaSessionCompatToken;
        int i2 = accessbootstrapIfNeeded.read(this.IconCompatParcelizer);
        MemoryCache memoryCache = this.MediaDescriptionCompat;
        int iHashCode = memoryCache != null ? memoryCache.hashCode() : 0;
        FwFDataQueriesinsertItem2 fwFDataQueriesinsertItem2 = this.MediaBrowserCompatMediaItem;
        return accessbootstrapIfNeeded.read(this.RemoteActionCompatParcelizer) + ((((((((i2 + (i * 31)) * 31) + iHashCode) * 31) + (fwFDataQueriesinsertItem2 != null ? fwFDataQueriesinsertItem2.hashCode() : 0)) * 31) + this.MediaSessionCompatQueueItem) * 31);
    }

    public final byte[] write(int i) {
        byte[] bArrWrite;
        byte[] bArrWrite2;
        getAll getall;
        getAll getall2;
        int i2 = 1 << this.MediaDescriptionCompat.read;
        byte[] bArr = this.IconCompatParcelizer;
        CustomerChatModulestartChat2 customerChatModulestartChat2 = this.PlaybackStateCompatCustomAction;
        if (i >= i2) {
            byte[] bArrRemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
            customerChatModulestartChat2.IconCompatParcelizer(bArrRemoteActionCompatParcelizer, 0, bArrRemoteActionCompatParcelizer.length);
            androidx.navigation.fragment.FragmentKt.write(i, customerChatModulestartChat2);
            customerChatModulestartChat2.RemoteActionCompatParcelizer((byte) -126);
            customerChatModulestartChat2.RemoteActionCompatParcelizer((byte) -126);
            byte[] bArrRemoteActionCompatParcelizer2 = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
            int i3 = i - i2;
            byte[] bArrRemoteActionCompatParcelizer3 = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            FwFDataQueriesinsertItem2 fwFDataQueriesinsertItem2 = this.MediaBrowserCompatMediaItem;
            getNetworkModule getnetworkmodule = fwFDataQueriesinsertItem2.serializer;
            int i4 = fwFDataQueriesinsertItem2.IconCompatParcelizer;
            CustomerChatModulestartChat2 customerChatModulestartChat3 = FwFDataQueriesdeleteItem1.read(i4, getnetworkmodule);
            getNetworkModule getnetworkmodule2 = fwFDataQueriesinsertItem2.serializer;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(bArrRemoteActionCompatParcelizer2);
                byte b = (byte) (i3 >>> 24);
                byteArrayOutputStream.write(b);
                byte b2 = (byte) (i3 >>> 16);
                byteArrayOutputStream.write(b2);
                byte b3 = (byte) (i3 >>> 8);
                byteArrayOutputStream.write(b3);
                byte b4 = (byte) i3;
                byteArrayOutputStream.write(b4);
                byteArrayOutputStream.write(-128);
                byteArrayOutputStream.write(-128);
                while (byteArrayOutputStream.size() < 22) {
                    byteArrayOutputStream.write(0);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                customerChatModulestartChat3.IconCompatParcelizer(byteArray, 0, byteArray.length);
                CustomerChatModulestartChat2 customerChatModulestartChat4 = FwFDataQueriesdeleteItem1.read(i4, getnetworkmodule2);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    byteArrayOutputStream2.write(bArrRemoteActionCompatParcelizer2);
                    byteArrayOutputStream2.write(b);
                    byteArrayOutputStream2.write(b2);
                    byteArrayOutputStream2.write(b3);
                    byteArrayOutputStream2.write(b4);
                    int iRemoteActionCompatParcelizer = customerChatModulestartChat4.RemoteActionCompatParcelizer();
                    while (byteArrayOutputStream2.size() < iRemoteActionCompatParcelizer + 23) {
                        byteArrayOutputStream2.write(0);
                    }
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    CustomerChatModulestartChat2 customerChatModulestartChat5 = FwFDataQueriesdeleteItem1.read(i4, getnetworkmodule2);
                    int i5 = fwFDataQueriesinsertItem2.RemoteActionCompatParcelizer;
                    int i6 = (1 << fwFDataQueriesinsertItem2.MediaMetadataCompat) - 1;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < i5) {
                        boolean z = i7 < i5 + (-1);
                        CustomerChatModulestartChat2 customerChatModulestartChat6 = customerChatModulestartChat2;
                        if (byteArray2.length - 23 >= customerChatModulestartChat5.RemoteActionCompatParcelizer()) {
                            customerChatModulestartChat5.IconCompatParcelizer(bArrRemoteActionCompatParcelizer2, 0, bArrRemoteActionCompatParcelizer2.length);
                            customerChatModulestartChat5.RemoteActionCompatParcelizer(b);
                            customerChatModulestartChat5.RemoteActionCompatParcelizer(b2);
                            customerChatModulestartChat5.RemoteActionCompatParcelizer(b3);
                            customerChatModulestartChat5.RemoteActionCompatParcelizer(b4);
                            int i9 = i8;
                            customerChatModulestartChat5.RemoteActionCompatParcelizer((byte) (i9 >>> 8));
                            customerChatModulestartChat5.RemoteActionCompatParcelizer((byte) i9);
                            customerChatModulestartChat5.RemoteActionCompatParcelizer((byte) -1);
                            byte b5 = b4;
                            customerChatModulestartChat5.IconCompatParcelizer(bArrRemoteActionCompatParcelizer3, 0, bArrRemoteActionCompatParcelizer3.length);
                            customerChatModulestartChat5.serializer(23, byteArray2);
                            int i10 = z ? i9 + 1 : i9;
                            short s = (short) i7;
                            byteArray2[20] = (byte) (s >>> 8);
                            byteArray2[21] = (byte) s;
                            for (int i11 = 0; i11 < i6; i11++) {
                                byteArray2[22] = (byte) i11;
                                customerChatModulestartChat4.IconCompatParcelizer(byteArray2, 0, byteArray2.length);
                                customerChatModulestartChat4.serializer(23, byteArray2);
                            }
                            customerChatModulestartChat3.IconCompatParcelizer(byteArray2, 23, i4);
                            i7++;
                            i5 = i5;
                            customerChatModulestartChat2 = customerChatModulestartChat6;
                            i8 = i10;
                            b4 = b5;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("target length is less than digest size.");
                            return null;
                        }
                    }
                    CustomerChatModulestartChat2 customerChatModulestartChat7 = customerChatModulestartChat2;
                    int iRemoteActionCompatParcelizer2 = customerChatModulestartChat3.RemoteActionCompatParcelizer();
                    byte[] bArr2 = new byte[iRemoteActionCompatParcelizer2];
                    customerChatModulestartChat3.serializer(0, bArr2);
                    customerChatModulestartChat7.IconCompatParcelizer(bArr2, 0, iRemoteActionCompatParcelizer2);
                    byte[] bArr3 = new byte[customerChatModulestartChat7.RemoteActionCompatParcelizer()];
                    customerChatModulestartChat7.serializer(0, bArr3);
                    return bArr3;
                } catch (Exception e) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e.getMessage(), e);
                    return null;
                }
            } catch (Exception e2) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e2.getMessage(), e2);
                return null;
            }
        }
        int i12 = i * 2;
        getAll[] getallArr = serializer;
        int i13 = this.RatingCompat;
        if (i12 < i13) {
            if (i12 < 129) {
                getall2 = getallArr[i12];
            } else {
                getall2 = new getAll(i12);
            }
            bArrWrite = RemoteActionCompatParcelizer(getall2);
        } else {
            bArrWrite = write(i12);
        }
        int i14 = i12 + 1;
        if (i14 < i13) {
            if (i14 < 129) {
                getall = getallArr[i14];
            } else {
                getall = new getAll(i14);
            }
            bArrWrite2 = RemoteActionCompatParcelizer(getall);
        } else {
            bArrWrite2 = write(i14);
        }
        byte[] bArrRemoteActionCompatParcelizer4 = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        customerChatModulestartChat2.IconCompatParcelizer(bArrRemoteActionCompatParcelizer4, 0, bArrRemoteActionCompatParcelizer4.length);
        androidx.navigation.fragment.FragmentKt.write(i, customerChatModulestartChat2);
        customerChatModulestartChat2.RemoteActionCompatParcelizer((byte) -125);
        customerChatModulestartChat2.RemoteActionCompatParcelizer((byte) -125);
        customerChatModulestartChat2.IconCompatParcelizer(bArrWrite, 0, bArrWrite.length);
        customerChatModulestartChat2.IconCompatParcelizer(bArrWrite2, 0, bArrWrite2.length);
        byte[] bArr4 = new byte[customerChatModulestartChat2.RemoteActionCompatParcelizer()];
        customerChatModulestartChat2.serializer(0, bArr4);
        return bArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FwFDataQueriesselectItems2.class != obj.getClass()) {
            return false;
        }
        FwFDataQueriesselectItems2 fwFDataQueriesselectItems2 = (FwFDataQueriesselectItems2) obj;
        if (this.MediaSessionCompatToken != fwFDataQueriesselectItems2.MediaSessionCompatToken || this.MediaSessionCompatQueueItem != fwFDataQueriesselectItems2.MediaSessionCompatQueueItem || !Arrays.equals(this.IconCompatParcelizer, fwFDataQueriesselectItems2.IconCompatParcelizer)) {
            return false;
        }
        MemoryCache memoryCache = fwFDataQueriesselectItems2.MediaDescriptionCompat;
        MemoryCache memoryCache2 = this.MediaDescriptionCompat;
        if (memoryCache2 == null ? memoryCache != null : !memoryCache2.equals(memoryCache)) {
            return false;
        }
        FwFDataQueriesinsertItem2 fwFDataQueriesinsertItem2 = fwFDataQueriesselectItems2.MediaBrowserCompatMediaItem;
        FwFDataQueriesinsertItem2 fwFDataQueriesinsertItem3 = this.MediaBrowserCompatMediaItem;
        if (fwFDataQueriesinsertItem3 == null ? fwFDataQueriesinsertItem2 == null : fwFDataQueriesinsertItem3.equals(fwFDataQueriesinsertItem2)) {
            return Arrays.equals(this.RemoteActionCompatParcelizer, fwFDataQueriesselectItems2.RemoteActionCompatParcelizer);
        }
        return false;
    }
}
