package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class resizeToBitmapDimensionslambda3 {
    public static ImageHeaderParser$ImageType IconCompatParcelizer(List list, InputStream inputStream, getF getf) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream(inputStream, getf);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeIconCompatParcelizer = ((accessgetMaxp) list.get(i)).IconCompatParcelizer(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeIconCompatParcelizer != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeIconCompatParcelizer;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static final Drawable write(Context context, int i) {
        context.getClass();
        return context.getDrawable(i);
    }

    public static int serializer(List list, InputStream inputStream, getF getf) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream(inputStream, getf);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iRemoteActionCompatParcelizer = ((accessgetMaxp) list.get(i)).RemoteActionCompatParcelizer(inputStream, getf);
                inputStream.reset();
                if (iRemoteActionCompatParcelizer != -1) {
                    return iRemoteActionCompatParcelizer;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType write(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageType = ((accessgetMaxp) list.get(i)).read(byteBuffer);
                AtomicReference atomicReference = DrawScopeMarker.read;
                if (imageHeaderParser$ImageType != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageType;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = DrawScopeMarker.read;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
