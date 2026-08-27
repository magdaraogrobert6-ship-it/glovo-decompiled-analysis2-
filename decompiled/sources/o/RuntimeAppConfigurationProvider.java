package o;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.CodedOutputStream$OutOfSpaceException;
import com.sentiance.protobuf.Utf8$UnpairedSurrogateException;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes3.dex */
public final class RuntimeAppConfigurationProvider extends setRuntimeAppConfigurationProvider {
    public int RatingCompat;
    public final byte[] read;
    public final int serializer;

    @Override // o.setRuntimeAppConfigurationProvider
    public final void IconCompatParcelizer(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        write(i, 0);
        write(i2);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void IconCompatParcelizer(int i, accessgetDiskCacheLockp accessgetdiskcachelockp, fromStringlambda1 fromstringlambda1) throws CodedOutputStream$OutOfSpaceException {
        write(i, 2);
        RatingCompat(((com.sentiance.protobuf.a) accessgetdiskcachelockp).getSerializedSize(fromstringlambda1));
        fromstringlambda1.read(accessgetdiskcachelockp, this.IconCompatParcelizer);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void read(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        write(i, 5);
        IconCompatParcelizer(i2);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void IconCompatParcelizer(int i) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.read;
            int i2 = this.RatingCompat;
            bArr[i2] = (byte) (i & 255);
            bArr[i2 + 1] = (byte) ((i >> 8) & 255);
            bArr[i2 + 2] = (byte) ((i >> 16) & 255);
            this.RatingCompat = i2 + 4;
            bArr[i2 + 3] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RatingCompat), Integer.valueOf(this.serializer), 1), e);
        }
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void IconCompatParcelizer(int i, accessgetDiskCacheLockp accessgetdiskcachelockp) throws CodedOutputStream$OutOfSpaceException {
        write(1, 3);
        serializer(2, i);
        write(3, 2);
        serializer(accessgetdiskcachelockp);
        write(1, 4);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void RatingCompat(int i) throws CodedOutputStream$OutOfSpaceException {
        while (true) {
            int i2 = this.RatingCompat;
            byte[] bArr = this.read;
            if ((i & (-128)) == 0) {
                this.RatingCompat = i2 + 1;
                bArr[i2] = (byte) i;
                return;
            }
            try {
                this.RatingCompat = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RatingCompat), Integer.valueOf(this.serializer), 1), e);
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RatingCompat), Integer.valueOf(this.serializer), 1), e);
        }
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void RemoteActionCompatParcelizer(String str) throws CodedOutputStream$OutOfSpaceException {
        int i = this.RatingCompat;
        try {
            int i2 = setRuntimeAppConfigurationProvider.read(str.length() * 3);
            int i3 = setRuntimeAppConfigurationProvider.read(str.length());
            byte[] bArr = this.read;
            if (i3 != i2) {
                RatingCompat(getErrorReason.serializer(str));
                this.RatingCompat = getErrorReason.read.read(str, bArr, this.RatingCompat, read());
                return;
            }
            int i4 = i + i3;
            this.RatingCompat = i4;
            int i5 = getErrorReason.read.read(str, bArr, i4, read());
            this.RatingCompat = i;
            RatingCompat((i5 - i) - i3);
            this.RatingCompat = i5;
        } catch (Utf8$UnpairedSurrogateException e) {
            this.RatingCompat = i;
            IconCompatParcelizer(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(e2);
        }
    }

    public final int read() {
        return this.serializer - this.RatingCompat;
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void serializer(long j) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.read;
            int i = this.RatingCompat;
            bArr[i] = (byte) (((int) j) & 255);
            bArr[i + 1] = (byte) (((int) (j >> 8)) & 255);
            bArr[i + 2] = (byte) (((int) (j >> 16)) & 255);
            bArr[i + 3] = (byte) (((int) (j >> 24)) & 255);
            bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
            bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
            bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
            this.RatingCompat = i + 8;
            bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RatingCompat), Integer.valueOf(this.serializer), 1), e);
        }
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void write(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            RatingCompat(i);
        } else {
            RemoteActionCompatParcelizer(i);
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.read, this.RatingCompat, i2);
            this.RatingCompat += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RatingCompat), Integer.valueOf(this.serializer), Integer.valueOf(i2)), e);
        }
    }

    public RuntimeAppConfigurationProvider(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
            throw null;
        }
        this.read = bArr;
        this.RatingCompat = 0;
        this.serializer = i;
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void RemoteActionCompatParcelizer(long j) throws CodedOutputStream$OutOfSpaceException {
        boolean z = setRuntimeAppConfigurationProvider.write;
        byte[] bArr = this.read;
        if (!z || read() < 10) {
            while (true) {
                int i = this.RatingCompat;
                if ((j & (-128)) == 0) {
                    this.RatingCompat = i + 1;
                    bArr[i] = (byte) j;
                    return;
                }
                try {
                    this.RatingCompat = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RatingCompat), Integer.valueOf(this.serializer), 1), e);
                }
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RatingCompat), Integer.valueOf(this.serializer), 1), e);
            }
        }
        while (true) {
            int i2 = this.RatingCompat;
            if ((j & (-128)) == 0) {
                this.RatingCompat = i2 + 1;
                SimpleValueCallback.RemoteActionCompatParcelizer(bArr, i2, (byte) j);
                return;
            } else {
                this.RatingCompat = i2 + 1;
                SimpleValueCallback.RemoteActionCompatParcelizer(bArr, i2, (byte) ((((int) j) & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                j >>>= 7;
            }
        }
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void write(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        RatingCompat((i << 3) | i2);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void write(int i, byte[] bArr) throws CodedOutputStream$OutOfSpaceException {
        RatingCompat(i);
        write(bArr, 0, i);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void write(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        write(i, 0);
        RemoteActionCompatParcelizer(j);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void write(int i, ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        write(1, 3);
        serializer(2, i);
        serializer(3, byteString);
        write(1, 4);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void serializer(accessgetDiskCacheLockp accessgetdiskcachelockp) throws CodedOutputStream$OutOfSpaceException {
        RatingCompat(accessgetdiskcachelockp.getSerializedSize());
        accessgetdiskcachelockp.writeTo(this);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void read(int i, boolean z) throws CodedOutputStream$OutOfSpaceException {
        write(i, 0);
        write(z ? (byte) 1 : (byte) 0);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void IconCompatParcelizer(int i, String str) throws CodedOutputStream$OutOfSpaceException {
        write(i, 2);
        RemoteActionCompatParcelizer(str);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void serializer(int i, ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        write(i, 2);
        IconCompatParcelizer(byteString);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void write(byte b) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.read;
            int i = this.RatingCompat;
            this.RatingCompat = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RatingCompat), Integer.valueOf(this.serializer), 1), e);
        }
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void serializer(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        write(i, 0);
        RatingCompat(i2);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void IconCompatParcelizer(ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        RatingCompat(byteString.serializer());
        byteString.serializer(this);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        write(bArr, i, i2);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void RemoteActionCompatParcelizer(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        write(i, 1);
        serializer(j);
    }
}
