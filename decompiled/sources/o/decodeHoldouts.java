package o;

import java.security.SecureRandom;
import org.bouncycastle.crypto.engines.AESEngine;

/* JADX INFO: loaded from: classes4.dex */
public final class decodeHoldouts extends SecureRandom {
    public final byte[] IconCompatParcelizer;
    public final byte[] read;

    public static void read(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        try {
            AESEngine aESEngine = new AESEngine();
            aESEngine.IconCompatParcelizer(new com.huawei.wisesecurity.ucs_credential.m0(bArr));
            for (int i2 = 0; i2 != bArr2.length; i2 += 16) {
                aESEngine.serializer(bArr2, i2, bArr3, i + i2);
            }
        } catch (Throwable th) {
            throw new IllegalStateException("drbg failure: " + th.getMessage(), th);
        }
    }

    public static void write(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        for (int i = 0; i < 3; i++) {
            for (int i2 = 15; i2 >= 0; i2--) {
                byte b = bArr3[i2];
                if ((b & 255) != 255) {
                    bArr3[i2] = (byte) (b + 1);
                    break;
                }
                bArr3[i2] = 0;
            }
            read(bArr2, bArr3, bArr4, i * 16);
        }
        if (bArr != null) {
            for (int i3 = 0; i3 < 48; i3++) {
                bArr4[i3] = (byte) (bArr4[i3] ^ bArr[i3]);
            }
        }
        System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
        System.arraycopy(bArr4, 32, bArr3, 0, bArr3.length);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int length = bArr.length;
        int i = 0;
        while (true) {
            byte[] bArr3 = this.IconCompatParcelizer;
            byte[] bArr4 = this.read;
            if (length <= 0) {
                write(null, bArr3, bArr4);
                return;
            }
            for (int i2 = 15; i2 >= 0; i2--) {
                byte b = bArr4[i2];
                if ((b & 255) != 255) {
                    bArr4[i2] = (byte) (b + 1);
                    break;
                }
                bArr4[i2] = 0;
            }
            read(bArr3, bArr4, bArr2, 0);
            if (length > 15) {
                System.arraycopy(bArr2, 0, bArr, i, 16);
                i += 16;
                length -= 16;
            } else {
                System.arraycopy(bArr2, 0, bArr, i, length);
                length = 0;
            }
        }
    }

    public decodeHoldouts(byte[] bArr, getEvent getevent) {
        if (bArr.length >= 48) {
            byte[] bArr2 = new byte[48];
            System.arraycopy(bArr, 0, bArr2, 0, 48);
            byte[] bArr3 = new byte[32];
            this.IconCompatParcelizer = bArr3;
            byte[] bArr4 = new byte[16];
            this.read = bArr4;
            write(bArr2, bArr3, bArr4);
            return;
        }
        int length = 48 - bArr.length;
        int iRemoteActionCompatParcelizer = getevent.RemoteActionCompatParcelizer();
        getevent.IconCompatParcelizer(bArr, 0, bArr.length);
        byte[] bArr5 = new byte[iRemoteActionCompatParcelizer];
        getevent.serializer(0, bArr5);
        if (length != iRemoteActionCompatParcelizer) {
            if (length < iRemoteActionCompatParcelizer) {
                byte[] bArr6 = new byte[length];
                System.arraycopy(bArr5, 0, bArr6, 0, Math.min(iRemoteActionCompatParcelizer, length));
                bArr5 = bArr6;
            } else {
                byte[] bArr7 = new byte[iRemoteActionCompatParcelizer];
                System.arraycopy(bArr5, 0, bArr7, 0, Math.min(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer));
                while (true) {
                    length -= iRemoteActionCompatParcelizer;
                    if (length < iRemoteActionCompatParcelizer) {
                        break;
                    }
                    getevent.IconCompatParcelizer(bArr5, 0, iRemoteActionCompatParcelizer);
                    bArr5 = new byte[iRemoteActionCompatParcelizer];
                    getevent.serializer(0, bArr5);
                    bArr7 = accessbootstrapIfNeeded.read(bArr7, bArr5);
                }
                if (length > 0) {
                    getevent.IconCompatParcelizer(bArr5, 0, iRemoteActionCompatParcelizer);
                    byte[] bArr8 = new byte[iRemoteActionCompatParcelizer];
                    getevent.serializer(0, bArr8);
                    int length2 = bArr7.length;
                    int i = length2 + length;
                    byte[] bArr9 = new byte[i];
                    System.arraycopy(bArr7, 0, bArr9, 0, Math.min(bArr7.length, i));
                    System.arraycopy(bArr8, 0, bArr9, length2, length);
                    bArr5 = bArr9;
                } else {
                    bArr5 = bArr7;
                }
            }
        }
        byte[] bArr10 = new byte[48];
        System.arraycopy(accessbootstrapIfNeeded.read(bArr, bArr5), 0, bArr10, 0, 48);
        byte[] bArr11 = new byte[32];
        this.IconCompatParcelizer = bArr11;
        byte[] bArr12 = new byte[16];
        this.read = bArr12;
        write(bArr10, bArr11, bArr12);
    }
}
