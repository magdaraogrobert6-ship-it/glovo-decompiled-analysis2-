package o;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface accessgetMaxp {
    ImageHeaderParser$ImageType IconCompatParcelizer(InputStream inputStream);

    int RemoteActionCompatParcelizer(InputStream inputStream, getF getf);

    ImageHeaderParser$ImageType read(ByteBuffer byteBuffer);

    boolean read(InputStream inputStream, getF getf);

    boolean read(ByteBuffer byteBuffer, getF getf);

    int write(ByteBuffer byteBuffer, getF getf);
}
