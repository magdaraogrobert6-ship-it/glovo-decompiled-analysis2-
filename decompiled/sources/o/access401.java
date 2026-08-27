package o;

import android.hardware.camera2.params.OutputConfiguration;
import android.media.ImageReader;

/* JADX INFO: loaded from: classes.dex */
public final class access401 implements AutoCloseable {
    public final OutputConfiguration read;
    public final ImageReader serializer;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        ImageReader imageReader = this.serializer;
        return (iHashCode * 31) + (imageReader == null ? 0 : imageReader.hashCode());
    }

    public access401(OutputConfiguration outputConfiguration, ImageReader imageReader) {
        this.read = outputConfiguration;
        this.serializer = imageReader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access401)) {
            return false;
        }
        access401 access401Var = (access401) obj;
        if (!this.read.equals(access401Var.read)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, access401Var.serializer}, getCieXyz.write())).booleanValue();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ImageReader imageReader = this.serializer;
        if (imageReader != null) {
            imageReader.close();
        }
    }

    public final String toString() {
        return "CloseableOutputConfiguration(value=" + this.read + ", backingImageReader=" + this.serializer + ')';
    }
}
