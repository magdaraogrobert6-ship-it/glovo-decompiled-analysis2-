package o;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class copyOHQCggkdefault {
    public static final divBz7bX_o IconCompatParcelizer = new divBz7bX_o(0);
    public final Object read;

    public void IconCompatParcelizer(float f, int i) throws IOException {
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) this.read;
        requestChildFocusKt.getClass();
        requestChildFocusKt.write(i, Float.floatToRawIntBits(f));
    }

    public void IconCompatParcelizer(int i, int i2) {
        ((RequestChildFocusKt) this.read).write(i, i2);
    }

    public void IconCompatParcelizer(int i, long j) {
        ((RequestChildFocusKt) this.read).RemoteActionCompatParcelizer(i, j);
    }

    public void MediaSessionCompatQueueItem(int i, int i2) throws IOException {
        ((RequestChildFocusKt) this.read).serializer(i, i2);
    }

    public void RemoteActionCompatParcelizer(int i, int i2) throws IOException {
        ((RequestChildFocusKt) this.read).read(i, i2);
    }

    public void RemoteActionCompatParcelizer(int i, long j) {
        ((RequestChildFocusKt) this.read).read(i, j);
    }

    public void RemoteActionCompatParcelizer(int i, Object obj, toStringAsFixed tostringasfixed) {
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) this.read;
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 3);
        tostringasfixed.IconCompatParcelizer((PlatformFocusOwner) obj, requestChildFocusKt.MediaMetadataCompat);
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 4);
    }

    public void read(double d, int i) throws IOException {
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) this.read;
        requestChildFocusKt.getClass();
        requestChildFocusKt.RemoteActionCompatParcelizer(i, Double.doubleToRawLongBits(d));
    }

    public void read(int i, int i2) throws IOException {
        ((RequestChildFocusKt) this.read).read(i, i2);
    }

    public void read(int i, long j) throws IOException {
        ((RequestChildFocusKt) this.read).RemoteActionCompatParcelizer(i, j);
    }

    public void read(int i, moveFocusInChildren3ESFkO8 movefocusinchildren3esfko8) {
        ((RequestChildFocusKt) this.read).serializer(i, movefocusinchildren3esfko8);
    }

    public void serializer(int i, int i2) throws IOException {
        ((RequestChildFocusKt) this.read).write(i, i2);
    }

    public void serializer(int i, long j) throws IOException {
        ((RequestChildFocusKt) this.read).read(i, j);
    }

    public void serializer(int i, Object obj, toStringAsFixed tostringasfixed) throws IOException {
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) this.read;
        PlatformFocusOwner platformFocusOwner = (PlatformFocusOwner) obj;
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 2);
        requestChildFocusKt.ParcelableVolumeInfo(platformFocusOwner.RemoteActionCompatParcelizer(tostringasfixed));
        tostringasfixed.IconCompatParcelizer(platformFocusOwner, requestChildFocusKt.MediaMetadataCompat);
    }

    public void write(int i, int i2) throws IOException {
        ((RequestChildFocusKt) this.read).serializer(i, (i2 << 1) ^ (i2 >> 31));
    }

    public void write(int i, long j) throws IOException {
        ((RequestChildFocusKt) this.read).read(i, (j << 1) ^ (j >> 63));
    }

    public void write(int i, boolean z) throws IOException {
        ((RequestChildFocusKt) this.read).IconCompatParcelizer(i, z);
    }

    public copyOHQCggkdefault() {
        timesBz7bX_o timesbz7bx_o;
        try {
            timesbz7bx_o = (timesBz7bX_o) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            timesbz7bx_o = IconCompatParcelizer;
        }
        timesBz7bX_o[] timesbz7bx_oArr = {divBz7bX_o.write, timesbz7bx_o};
        getXannotations getxannotations = new getXannotations();
        getxannotations.serializer = timesbz7bx_oArr;
        Charset charset = topLeft.serializer;
        this.read = getxannotations;
    }

    public copyOHQCggkdefault(RequestChildFocusKt requestChildFocusKt) {
        topLeft.RemoteActionCompatParcelizer(requestChildFocusKt, "output");
        this.read = requestChildFocusKt;
        requestChildFocusKt.MediaMetadataCompat = this;
    }
}
