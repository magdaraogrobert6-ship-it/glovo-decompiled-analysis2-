package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes4.dex */
public final class EventJsonAdapter {
    public static final byte[] read = Hex.read("000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F");
    public AESEngine IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public int MediaSessionCompatQueueItem;
    public long RatingCompat;
    public byte[] RemoteActionCompatParcelizer;
    public setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release serializer;
    public byte[] write;

    public final void serializer(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr.length;
        byte[] bArr4 = new byte[length];
        AESEngine aESEngine = this.IconCompatParcelizer;
        byte[] bArr5 = new byte[16];
        aESEngine.IconCompatParcelizer(new com.huawei.wisesecurity.ucs_credential.m0(read(bArr2)));
        int i = 0;
        while (true) {
            int i2 = i * 16;
            if (i2 >= bArr.length) {
                break;
            }
            write(bArr3);
            aESEngine.serializer(bArr3, 0, bArr5, 0);
            int i3 = length - i2;
            if (i3 > 16) {
                i3 = 16;
            }
            System.arraycopy(bArr5, 0, bArr4, i2, i3);
            i++;
        }
        int length2 = bArr.length;
        for (int i4 = 0; i4 < length2; i4++) {
            bArr4[i4] = (byte) (bArr4[i4] ^ bArr[i4]);
        }
        System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
        System.arraycopy(bArr4, bArr2.length, bArr3, 0, bArr3.length);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077 A[SYNTHETIC] */
    public final int IconCompatParcelizer(byte[] bArr) {
        String str;
        int length;
        byte[] bArr2;
        int i;
        int i2;
        int length2;
        AESEngine aESEngine = this.IconCompatParcelizer;
        boolean z = this.MediaBrowserCompatMediaItem;
        long j = this.RatingCompat;
        if (z) {
            if (j > 2147483648L) {
                return -1;
            }
            int i3 = EventCreationRequestJsonAdapter.write;
            if (bArr != null && bArr.length > 512) {
                str = "Number of bits per request limited to 4096";
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str);
                return 0;
            }
            byte[] bArr3 = new byte[this.MediaSessionCompatQueueItem / 8];
            length = this.write.length;
            bArr2 = new byte[length];
            aESEngine.IconCompatParcelizer(new com.huawei.wisesecurity.ucs_credential.m0(read(this.RemoteActionCompatParcelizer)));
            for (i = 0; i <= bArr.length / length; i++) {
                i2 = i * length;
                if (bArr.length - i2 > length) {
                    length2 = length;
                } else {
                    length2 = bArr.length - (this.write.length * i);
                }
                if (length2 != 0) {
                    write(this.write);
                    aESEngine.serializer(this.write, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i2, length2);
                }
            }
            serializer(bArr3, this.RemoteActionCompatParcelizer, this.write);
            this.RatingCompat++;
            return bArr.length * 8;
        }
        if (j > 140737488355328L) {
            return -1;
        }
        int i4 = EventCreationRequestJsonAdapter.write;
        if (bArr != null && bArr.length > 32768) {
            str = "Number of bits per request limited to 262144";
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str);
            return 0;
        }
        byte[] bArr4 = new byte[this.MediaSessionCompatQueueItem / 8];
        length = this.write.length;
        bArr2 = new byte[length];
        aESEngine.IconCompatParcelizer(new com.huawei.wisesecurity.ucs_credential.m0(read(this.RemoteActionCompatParcelizer)));
        while (i <= bArr.length / length) {
            i2 = i * length;
            if (bArr.length - i2 > length) {
                length2 = length;
            } else {
                length2 = bArr.length - (this.write.length * i);
            }
            if (length2 != 0) {
                write(this.write);
                aESEngine.serializer(this.write, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i2, length2);
            }
        }
        serializer(bArr4, this.RemoteActionCompatParcelizer, this.write);
        this.RatingCompat++;
        return bArr.length * 8;
    }

    public static void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void write(byte[] bArr) {
        int i = 1;
        for (int i2 = 1; i2 <= bArr.length; i2++) {
            int i3 = (bArr[bArr.length - i2] & 255) + i;
            i = i3 > 255 ? 1 : 0;
            bArr[bArr.length - i2] = (byte) i3;
        }
    }

    public final byte[] write(int i, byte[] bArr) {
        AESEngine aESEngine = this.IconCompatParcelizer;
        int length = bArr.length;
        int i2 = i / 8;
        int i3 = 16;
        int i4 = ((length + 24) / 16) * 16;
        byte[] bArr2 = new byte[i4];
        int i5 = 0;
        RemoteActionCompatParcelizer(bArr2, length, 0);
        RemoteActionCompatParcelizer(bArr2, i2, 4);
        System.arraycopy(bArr, 0, bArr2, 8, length);
        bArr2[length + 8] = -128;
        byte[] bArr3 = new byte[48];
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[16];
        byte[] bArr6 = new byte[32];
        System.arraycopy(read, 0, bArr6, 0, 32);
        int i6 = 0;
        while (true) {
            int i7 = i6 * 16;
            if (i6 * androidx.compose.ui.graphics.Fields.SpotShadowColor >= 384) {
                break;
            }
            RemoteActionCompatParcelizer(bArr5, i6, i5);
            byte[] bArr7 = new byte[i3];
            int i8 = i4 / 16;
            byte[] bArr8 = new byte[i3];
            aESEngine.IconCompatParcelizer(new com.huawei.wisesecurity.ucs_credential.m0(read(bArr6)));
            aESEngine.serializer(bArr5, 0, bArr7, 0);
            int i9 = 0;
            while (i9 < i8) {
                byte[] bArr9 = bArr5;
                int i10 = 0;
                for (int i11 = 16; i10 < i11; i11 = 16) {
                    bArr8[i10] = (byte) (bArr7[i10] ^ bArr2[(i9 * 16) + i10]);
                    i10++;
                }
                aESEngine.serializer(bArr8, 0, bArr7, 0);
                i9++;
                bArr5 = bArr9;
            }
            byte[] bArr10 = bArr5;
            i3 = 16;
            System.arraycopy(bArr7, 0, bArr4, 0, 16);
            int i12 = 48 - i7;
            if (i12 > 16) {
                i12 = 16;
            }
            System.arraycopy(bArr4, 0, bArr3, i7, i12);
            i6++;
            i5 = 0;
            bArr5 = bArr10;
        }
        int i13 = i5;
        byte[] bArr11 = new byte[i3];
        System.arraycopy(bArr3, i13, bArr6, i13, 32);
        System.arraycopy(bArr3, 32, bArr11, i13, i3);
        byte[] bArr12 = new byte[i2];
        aESEngine.IconCompatParcelizer(new com.huawei.wisesecurity.ucs_credential.m0(read(bArr6)));
        int i14 = i13;
        while (true) {
            int i15 = i14 * 16;
            if (i15 >= i2) {
                return bArr12;
            }
            aESEngine.serializer(bArr11, i13, bArr11, i13);
            int i16 = i2 - i15;
            if (i16 > 16) {
                i16 = 16;
            }
            System.arraycopy(bArr11, i13, bArr12, i15, i16);
            i14++;
        }
    }

    public static void RemoteActionCompatParcelizer(byte[] bArr, int i, byte[] bArr2, int i2) {
        bArr2[i2] = (byte) (bArr[i] & 254);
        int i3 = i + 1;
        bArr2[i2 + 1] = (byte) ((bArr[i] << 7) | ((bArr[i3] & 252) >>> 1));
        byte b = bArr[i3];
        int i4 = i + 2;
        bArr2[i2 + 2] = (byte) ((b << 6) | ((bArr[i4] & 248) >>> 2));
        byte b2 = bArr[i4];
        int i5 = i + 3;
        bArr2[i2 + 3] = (byte) ((b2 << 5) | ((bArr[i5] & 240) >>> 3));
        byte b3 = bArr[i5];
        int i6 = i + 4;
        bArr2[i2 + 4] = (byte) ((b3 << 4) | ((bArr[i6] & 224) >>> 4));
        byte b4 = bArr[i6];
        int i7 = i + 5;
        bArr2[i2 + 5] = (byte) ((b4 << 3) | ((bArr[i7] & 192) >>> 5));
        int i8 = i + 6;
        bArr2[i2 + 6] = (byte) ((bArr[i7] << 2) | ((bArr[i8] & 128) >>> 6));
        int i9 = i2 + 7;
        bArr2[i9] = (byte) (bArr[i8] << 1);
        while (i2 <= i9) {
            byte b5 = bArr2[i2];
            bArr2[i2] = (byte) ((b5 & 254) | ((((b5 >> 7) ^ ((((((b5 >> 1) ^ (b5 >> 2)) ^ (b5 >> 3)) ^ (b5 >> 4)) ^ (b5 >> 5)) ^ (b5 >> 6))) ^ 1) & 1));
            i2++;
        }
    }

    public final byte[] read(byte[] bArr) {
        if (!this.MediaBrowserCompatMediaItem) {
            return bArr;
        }
        byte[] bArr2 = new byte[24];
        RemoteActionCompatParcelizer(bArr, 0, bArr2, 0);
        RemoteActionCompatParcelizer(bArr, 7, bArr2, 8);
        RemoteActionCompatParcelizer(bArr, 14, bArr2, 16);
        return bArr2;
    }
}
