package o;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class getDefaultDensity implements setGraphicsLayer, _init_lambda5, getOetfOrigui_graphics {
    public final /* synthetic */ int serializer;
    public final ByteBuffer write;

    @Override // o.getOetfOrigui_graphics
    public Object read() {
        ByteBuffer byteBuffer = this.write;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // o.getOetfOrigui_graphics
    public void serializer() {
    }

    @Override // o.setGraphicsLayer
    public short IconCompatParcelizer() throws DefaultImageHeaderParser$Reader$EndOfFileException {
        ByteBuffer byteBuffer = this.write;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // o.setGraphicsLayer
    public int RemoteActionCompatParcelizer(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.write;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // o.setGraphicsLayer
    public long serializer(long j) {
        ByteBuffer byteBuffer = this.write;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public getDefaultDensity(int i) {
        this.serializer = i;
        if (i != 2) {
            this.write = ByteBuffer.allocate(8);
        } else {
            this.write = ByteBuffer.allocate(4);
        }
    }

    @Override // o._init_lambda5
    public void RemoteActionCompatParcelizer(byte[] bArr, Object obj, MessageDigest messageDigest) {
        if (this.serializer == 0) {
            Long l = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.write) {
                this.write.position(0);
                messageDigest.update(this.write.putLong(l.longValue()).array());
            }
            return;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (this.write) {
            this.write.position(0);
            messageDigest.update(this.write.putInt(num.intValue()).array());
        }
    }

    @Override // o.setGraphicsLayer
    public int write() throws DefaultImageHeaderParser$Reader$EndOfFileException {
        return (IconCompatParcelizer() << 8) | IconCompatParcelizer();
    }

    public getDefaultDensity(ByteBuffer byteBuffer, int i) {
        this.serializer = i;
        if (i != 3) {
            this.write = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        } else {
            this.write = byteBuffer;
        }
    }
}
