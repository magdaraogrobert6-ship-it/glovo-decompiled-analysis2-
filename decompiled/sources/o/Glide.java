package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class Glide extends InputStream {
    public final /* synthetic */ RegistryNoSourceEncoderAvailableException IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ Glide(RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = registryNoSourceEncoderAvailableException;
    }

    public final String toString() {
        int i = this.RemoteActionCompatParcelizer;
        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = this.IconCompatParcelizer;
        if (i != 0) {
            return ((GifDrawableTransformation) registryNoSourceEncoderAvailableException) + ".inputStream()";
        }
        return ((RegistryMissingComponentException) registryNoSourceEncoderAvailableException) + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = this.RemoteActionCompatParcelizer;
        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = this.IconCompatParcelizer;
        if (i == 0) {
            return (int) Math.min(((RegistryMissingComponentException) registryNoSourceEncoderAvailableException).size, 2147483647L);
        }
        GifDrawableTransformation gifDrawableTransformation = (GifDrawableTransformation) registryNoSourceEncoderAvailableException;
        if (!gifDrawableTransformation.closed) {
            return (int) Math.min(gifDrawableTransformation.bufferField.size, 2147483647L);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.RemoteActionCompatParcelizer != 0) {
            ((GifDrawableTransformation) this.IconCompatParcelizer).close();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.RemoteActionCompatParcelizer;
        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = this.IconCompatParcelizer;
        if (i == 0) {
            RegistryMissingComponentException registryMissingComponentException = (RegistryMissingComponentException) registryNoSourceEncoderAvailableException;
            if (registryMissingComponentException.size > 0) {
                return registryMissingComponentException.MediaBrowserCompatMediaItem() & 255;
            }
            return -1;
        }
        GifDrawableTransformation gifDrawableTransformation = (GifDrawableTransformation) registryNoSourceEncoderAvailableException;
        RegistryMissingComponentException registryMissingComponentException2 = gifDrawableTransformation.bufferField;
        if (gifDrawableTransformation.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
            return 0;
        }
        if (registryMissingComponentException2.size == 0 && gifDrawableTransformation.source.RemoteActionCompatParcelizer(registryMissingComponentException2, 8192L) == -1) {
            return -1;
        }
        return registryMissingComponentException2.MediaBrowserCompatMediaItem() & 255;
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        if (this.RemoteActionCompatParcelizer != 1) {
            return super.transferTo(outputStream);
        }
        outputStream.getClass();
        GifDrawableTransformation gifDrawableTransformation = (GifDrawableTransformation) this.IconCompatParcelizer;
        RegistryMissingComponentException registryMissingComponentException = gifDrawableTransformation.bufferField;
        if (gifDrawableTransformation.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
            return 0L;
        }
        long j = 0;
        while (true) {
            if (registryMissingComponentException.size == 0 && gifDrawableTransformation.source.RemoteActionCompatParcelizer(registryMissingComponentException, 8192L) == -1) {
                return j;
            }
            long j2 = registryMissingComponentException.size;
            j += j2;
            registryMissingComponentException.write(outputStream, j2);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.RemoteActionCompatParcelizer;
        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = this.IconCompatParcelizer;
        bArr.getClass();
        if (i3 != 0) {
            GifDrawableTransformation gifDrawableTransformation = (GifDrawableTransformation) registryNoSourceEncoderAvailableException;
            RegistryMissingComponentException registryMissingComponentException = gifDrawableTransformation.bufferField;
            if (!gifDrawableTransformation.closed) {
                setOptionalTextView.RemoteActionCompatParcelizer(bArr.length, i, i2);
                if (registryMissingComponentException.size == 0 && gifDrawableTransformation.source.RemoteActionCompatParcelizer(registryMissingComponentException, 8192L) == -1) {
                    return -1;
                }
                return registryMissingComponentException.serializer(bArr, i, i2);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
            return 0;
        }
        return ((RegistryMissingComponentException) registryNoSourceEncoderAvailableException).serializer(bArr, i, i2);
    }
}
