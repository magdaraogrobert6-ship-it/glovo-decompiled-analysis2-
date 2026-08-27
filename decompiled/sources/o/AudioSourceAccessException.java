package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class AudioSourceAccessException extends FilterOutputStream {
    public final OutputStream IconCompatParcelizer;
    public ByteOrder RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer = 0;

    public AudioSourceAccessException(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.IconCompatParcelizer = new DataOutputStream(outputStream);
        this.RemoteActionCompatParcelizer = byteOrder;
    }

    public final void IconCompatParcelizer(int i) throws IOException {
        int i2 = this.serializer;
        OutputStream outputStream = this.IconCompatParcelizer;
        if (i2 == 0) {
            ByteOrder byteOrder = this.RemoteActionCompatParcelizer;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                outputStream.write(i & 255);
                outputStream.write((i >>> 8) & 255);
                outputStream.write((i >>> 16) & 255);
                outputStream.write((i >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((i >>> 24) & 255);
                outputStream.write((i >>> 16) & 255);
                outputStream.write((i >>> 8) & 255);
                outputStream.write(i & 255);
                return;
            }
            return;
        }
        DataOutputStream dataOutputStream = (DataOutputStream) outputStream;
        ByteOrder byteOrder2 = this.RemoteActionCompatParcelizer;
        if (byteOrder2 == ByteOrder.LITTLE_ENDIAN) {
            dataOutputStream.write(i & 255);
            dataOutputStream.write((i >>> 8) & 255);
            dataOutputStream.write((i >>> 16) & 255);
            dataOutputStream.write((i >>> 24) & 255);
            return;
        }
        if (byteOrder2 == ByteOrder.BIG_ENDIAN) {
            dataOutputStream.write((i >>> 24) & 255);
            dataOutputStream.write((i >>> 16) & 255);
            dataOutputStream.write((i >>> 8) & 255);
            dataOutputStream.write(i & 255);
        }
    }

    public void serializer(int i) throws IOException {
        ((DataOutputStream) this.IconCompatParcelizer).write(i);
    }

    public final void serializer(short s) throws IOException {
        int i = this.serializer;
        OutputStream outputStream = this.IconCompatParcelizer;
        if (i == 0) {
            ByteOrder byteOrder = this.RemoteActionCompatParcelizer;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                outputStream.write(s & 255);
                outputStream.write((s >>> 8) & 255);
                return;
            } else {
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    outputStream.write((s >>> 8) & 255);
                    outputStream.write(s & 255);
                    return;
                }
                return;
            }
        }
        DataOutputStream dataOutputStream = (DataOutputStream) outputStream;
        ByteOrder byteOrder2 = this.RemoteActionCompatParcelizer;
        if (byteOrder2 == ByteOrder.LITTLE_ENDIAN) {
            dataOutputStream.write(s & 255);
            dataOutputStream.write((s >>> 8) & 255);
        } else if (byteOrder2 == ByteOrder.BIG_ENDIAN) {
            dataOutputStream.write((s >>> 8) & 255);
            dataOutputStream.write(s & 255);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        if (this.serializer != 0) {
            ((DataOutputStream) this.IconCompatParcelizer).write(bArr);
        } else {
            this.IconCompatParcelizer.write(bArr);
        }
    }

    public void read(int i) throws IOException {
        if (i <= 65535) {
            serializer((short) i);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("val is larger than the maximum value of a 16-bit unsigned integer");
        }
    }

    public void write(long j) throws IOException {
        if (j <= 4294967295L) {
            IconCompatParcelizer((int) j);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("val is larger than the maximum value of a 32-bit unsigned integer");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioSourceAccessException(OutputStream outputStream) {
        super(outputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.IconCompatParcelizer = outputStream;
        this.RemoteActionCompatParcelizer = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.serializer != 0) {
            ((DataOutputStream) this.IconCompatParcelizer).write(bArr, i, i2);
        } else {
            this.IconCompatParcelizer.write(bArr, i, i2);
        }
    }
}
