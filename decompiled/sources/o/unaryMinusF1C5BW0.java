package o;

import coil3.ImageLoader$Builder;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class unaryMinusF1C5BW0 {
    public static final ThreadLocal IconCompatParcelizer = new ThreadLocal();
    public volatile int RemoteActionCompatParcelizer = 0;
    public final ImageLoader$Builder read;
    public final int write;

    public final OffsetCompanion read() {
        ThreadLocal threadLocal = IconCompatParcelizer;
        OffsetCompanion offsetCompanion = (OffsetCompanion) threadLocal.get();
        if (offsetCompanion == null) {
            offsetCompanion = new OffsetCompanion();
            threadLocal.set(offsetCompanion);
        }
        getInfiniteF1C5BW0annotations getinfinitef1c5bw0annotations = (getInfiniteF1C5BW0annotations) this.read.RemoteActionCompatParcelizer;
        int iRemoteActionCompatParcelizer = getinfinitef1c5bw0annotations.RemoteActionCompatParcelizer(6);
        if (iRemoteActionCompatParcelizer != 0) {
            int i = iRemoteActionCompatParcelizer + getinfinitef1c5bw0annotations.read;
            int i2 = (this.write * 4) + getinfinitef1c5bw0annotations.write.getInt(i) + i + 4;
            int i3 = getinfinitef1c5bw0annotations.write.getInt(i2) + i2;
            ByteBuffer byteBuffer = getinfinitef1c5bw0annotations.write;
            offsetCompanion.write = byteBuffer;
            if (byteBuffer != null) {
                offsetCompanion.read = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                offsetCompanion.RemoteActionCompatParcelizer = i4;
                offsetCompanion.IconCompatParcelizer = offsetCompanion.write.getShort(i4);
                return offsetCompanion;
            }
            offsetCompanion.read = 0;
            offsetCompanion.RemoteActionCompatParcelizer = 0;
            offsetCompanion.IconCompatParcelizer = 0;
        }
        return offsetCompanion;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        OffsetCompanion offsetCompanion = read();
        int iRemoteActionCompatParcelizer = offsetCompanion.RemoteActionCompatParcelizer(4);
        sb.append(Integer.toHexString(iRemoteActionCompatParcelizer != 0 ? offsetCompanion.write.getInt(iRemoteActionCompatParcelizer + offsetCompanion.read) : 0));
        sb.append(", codepoints:");
        OffsetCompanion offsetCompanion2 = read();
        int iRemoteActionCompatParcelizer2 = offsetCompanion2.RemoteActionCompatParcelizer(16);
        if (iRemoteActionCompatParcelizer2 != 0) {
            int i2 = iRemoteActionCompatParcelizer2 + offsetCompanion2.read;
            i = offsetCompanion2.write.getInt(offsetCompanion2.write.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(write(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }

    public unaryMinusF1C5BW0(ImageLoader$Builder imageLoader$Builder, int i) {
        this.read = imageLoader$Builder;
        this.write = i;
    }

    public final int write(int i) {
        OffsetCompanion offsetCompanion = read();
        int iRemoteActionCompatParcelizer = offsetCompanion.RemoteActionCompatParcelizer(16);
        if (iRemoteActionCompatParcelizer == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = offsetCompanion.write;
        int i2 = iRemoteActionCompatParcelizer + offsetCompanion.read;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }
}
