package o;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class toLinear implements getOetfOrigui_graphics {
    public static final getWhitePoint serializer = new getWhitePoint(0);
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object write;

    public toLinear(InputStream inputStream, getF getf) {
        this.IconCompatParcelizer = 0;
        com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream(inputStream, getf);
        this.write = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    public static boolean write() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // o.getOetfOrigui_graphics
    public Object read() {
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i != 0) {
            return i != 2 ? obj : ((ParcelFileDescriptorRewinder$InternalRewinder) obj).rewind();
        }
        com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream = (com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream) obj;
        recyclableBufferedInputStream.reset();
        return recyclableBufferedInputStream;
    }

    @Override // o.getOetfOrigui_graphics
    public void serializer() {
        if (this.IconCompatParcelizer != 0) {
            return;
        }
        ((com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream) this.write).write();
    }

    public toLinear() {
        this.IconCompatParcelizer = 1;
        this.write = new HashMap();
    }

    public toLinear(ParcelFileDescriptor parcelFileDescriptor) {
        this.IconCompatParcelizer = 2;
        this.write = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public ParcelFileDescriptor IconCompatParcelizer() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.write).rewind();
    }

    public toLinear(Object obj) {
        this.IconCompatParcelizer = 3;
        this.write = obj;
    }
}
