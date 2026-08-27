package o;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class updateLayerParametersdefault {
    public static final byte[][] IconCompatParcelizer = {new byte[]{0, 0}, new byte[]{-128, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, -128}, new byte[]{-1, -64}};
    public byte[] read;
    public int write;

    public final void IconCompatParcelizer(byte b) {
        write(1);
        byte[] bArr = this.read;
        int i = this.write;
        this.write = i + 1;
        bArr[i] = b;
    }

    public final void serializer(byte b) {
        write(1);
        byte[] bArr = this.read;
        int i = this.write;
        this.write = i + 1;
        bArr[i] = (byte) (~b);
    }

    public final void write(int i) {
        int i2 = i + this.write;
        byte[] bArr = this.read;
        if (i2 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i2) {
            i2 = length;
        }
        this.read = Arrays.copyOf(bArr, i2);
    }

    public final void read(byte b) {
        if (b == 0) {
            serializer((byte) 0);
            serializer((byte) -1);
        } else if (b == -1) {
            serializer((byte) -1);
            serializer((byte) 0);
        } else {
            serializer(b);
        }
    }

    public final void write(byte b) {
        if (b == 0) {
            IconCompatParcelizer((byte) 0);
            IconCompatParcelizer((byte) -1);
        } else if (b == -1) {
            IconCompatParcelizer((byte) -1);
            IconCompatParcelizer((byte) 0);
        } else {
            IconCompatParcelizer(b);
        }
    }

    public final void RemoteActionCompatParcelizer(long j) {
        int i;
        long j2 = j < 0 ? ~j : j;
        byte[][] bArr = IconCompatParcelizer;
        if (j2 < 64) {
            write(1);
            byte[] bArr2 = this.read;
            int i2 = this.write;
            this.write = i2 + 1;
            bArr2[i2] = (byte) (j ^ ((long) bArr[1][0]));
            return;
        }
        if (j2 < 0) {
            j2 = ~j2;
        }
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
        RoundingMode roundingMode = RoundingMode.UP;
        int iSerializer = transformToAncestorEL8BTi8.serializer(65 - iNumberOfLeadingZeros, 7);
        write(iSerializer);
        if (iSerializer >= 2) {
            byte b = j < 0 ? (byte) -1 : (byte) 0;
            int i3 = this.write;
            if (iSerializer == 10) {
                i = i3 + 2;
                byte[] bArr3 = this.read;
                bArr3[i3] = b;
                bArr3[i3 + 1] = b;
            } else if (iSerializer == 9) {
                i = i3 + 1;
                this.read[i3] = b;
            } else {
                i = i3;
            }
            int i4 = (iSerializer - 1) + i3;
            while (true) {
                byte[] bArr4 = this.read;
                if (i4 >= i) {
                    bArr4[i4] = (byte) (255 & j);
                    j >>= 8;
                    i4--;
                } else {
                    int i5 = this.write;
                    byte b2 = bArr4[i5];
                    byte[] bArr5 = bArr[iSerializer];
                    bArr4[i5] = (byte) (b2 ^ bArr5[0]);
                    int i6 = i5 + 1;
                    bArr4[i6] = (byte) (bArr5[1] ^ bArr4[i6]);
                    this.write = i5 + iSerializer;
                    return;
                }
            }
        } else {
            throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(iSerializer)));
        }
    }
}
