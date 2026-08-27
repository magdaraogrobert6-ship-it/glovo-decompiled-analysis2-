package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class finishWebViewDisplaylambda0 extends Reader {
    public final Charset charset;
    public boolean closed;
    public InputStreamReader delegate;
    public final RegistryNoSourceEncoderAvailableException source;

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.closed = true;
        InputStreamReader inputStreamReader = this.delegate;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.source.close();
        }
    }

    public finishWebViewDisplaylambda0(RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException, Charset charset) {
        registryNoSourceEncoderAvailableException.getClass();
        charset.getClass();
        this.source = registryNoSourceEncoderAvailableException;
        this.charset = charset;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        cArr.getClass();
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Stream closed");
            return 0;
        }
        InputStreamReader inputStreamReader = this.delegate;
        if (inputStreamReader == null) {
            RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = this.source;
            InputStreamReader inputStreamReader2 = new InputStreamReader(registryNoSourceEncoderAvailableException.MediaMetadataCompat(), setWebViewContent.serializer(registryNoSourceEncoderAvailableException, this.charset));
            this.delegate = inputStreamReader2;
            inputStreamReader = inputStreamReader2;
        }
        return inputStreamReader.read(cArr, i, i2);
    }
}
