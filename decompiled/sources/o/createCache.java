package o;

import java.util.List;
import java.util.ListIterator;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public abstract class createCache {
    public static void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static final void RemoteActionCompatParcelizer(tintxETnrds tintxetnrds) {
        tintxetnrds.getClass();
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, iSerializer);
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer()) {
            try {
                baseContentCardViewExternalSyntheticLambda0.add(uncheckedColordefaultRemoteActionCompatParcelizer.read(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, th);
                    throw th2;
                }
            }
        }
        Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, null);
        ListIterator listIterator = androidx.sqlite.SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0).listIterator(0);
        while (true) {
            setOptionalCardImage setoptionalcardimage = (setOptionalCardImage) listIterator;
            if (!setoptionalcardimage.hasNext()) {
                return;
            }
            String str = (String) setoptionalcardimage.next();
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "room_fts_content_sync_", false)) {
                androidx.sqlite.SQLite.serializer(tintxetnrds, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static void read(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void RemoteActionCompatParcelizer(int i, long j, byte[] bArr) {
        read(bArr, (int) (j >>> 32), i);
        read(bArr, (int) (j & 4294967295L), i + 4);
    }

    public static long IconCompatParcelizer(int i, byte[] bArr) {
        return ((((long) read(i + 4, bArr)) & 4294967295L) << 32) | (((long) read(i, bArr)) & 4294967295L);
    }

    public static int read(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int serializer(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static void read(int i, long j, byte[] bArr) {
        RemoteActionCompatParcelizer(bArr, (int) (4294967295L & j), i);
        RemoteActionCompatParcelizer(bArr, (int) (j >>> 32), i + 4);
    }
}
