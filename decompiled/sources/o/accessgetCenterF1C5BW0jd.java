package o;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetCenterF1C5BW0jd implements accessgetMaxp {
    @Override // o.accessgetMaxp
    public final ImageHeaderParser$ImageType IconCompatParcelizer(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // o.accessgetMaxp
    public final boolean read(InputStream inputStream, getF getf) {
        return false;
    }

    @Override // o.accessgetMaxp
    public final boolean read(ByteBuffer byteBuffer, getF getf) {
        return false;
    }

    @Override // o.accessgetMaxp
    public final int RemoteActionCompatParcelizer(InputStream inputStream, getF getf) {
        int iSerializer = new takeOrElse3MmeM6k(inputStream).serializer(1, "Orientation");
        if (iSerializer == 0) {
            return -1;
        }
        return iSerializer;
    }

    @Override // o.accessgetMaxp
    public final ImageHeaderParser$ImageType read(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // o.accessgetMaxp
    public final int write(ByteBuffer byteBuffer, getF getf) {
        AtomicReference atomicReference = DrawScopeMarker.read;
        return RemoteActionCompatParcelizer(new PathOperationCompanion(byteBuffer), getf);
    }
}
