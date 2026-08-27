package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public final class notifyChildrenUsingLookaheadCoordinatesWhilePlacing extends InputStream {
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ onAttachedToNullParent read;
    public int write;

    public notifyChildrenUsingLookaheadCoordinatesWhilePlacing(onAttachedToNullParent onattachedtonullparent, onNodeDetached onnodedetached) {
        this.read = onattachedtonullparent;
        this.RemoteActionCompatParcelizer = onattachedtonullparent.write(onnodedetached.IconCompatParcelizer + 4);
        this.write = onnodedetached.serializer;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                int i3 = this.write;
                if (i3 <= 0) {
                    return -1;
                }
                if (i2 > i3) {
                    i2 = i3;
                }
                int i4 = this.RemoteActionCompatParcelizer;
                onAttachedToNullParent onattachedtonullparent = this.read;
                onattachedtonullparent.RemoteActionCompatParcelizer(bArr, i4, i, i2);
                this.RemoteActionCompatParcelizer = onattachedtonullparent.write(this.RemoteActionCompatParcelizer + i2);
                this.write -= i2;
                return i2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("buffer");
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        onAttachedToNullParent onattachedtonullparent = this.read;
        RandomAccessFile randomAccessFile = onattachedtonullparent.RatingCompat;
        if (this.write == 0) {
            return -1;
        }
        randomAccessFile.seek(this.RemoteActionCompatParcelizer);
        int i = randomAccessFile.read();
        this.RemoteActionCompatParcelizer = onattachedtonullparent.write(this.RemoteActionCompatParcelizer + 1);
        this.write--;
        return i;
    }
}
