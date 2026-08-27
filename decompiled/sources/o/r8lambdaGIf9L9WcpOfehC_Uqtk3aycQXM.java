package o;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaGIf9L9WcpOfehC_Uqtk3aycQXM implements Closeable {
    public final Closeable IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Object read;
    public final boolean serializer;
    public final RegistryMissingComponentException write;

    public r8lambdaGIf9L9WcpOfehC_Uqtk3aycQXM(boolean z, int i) {
        this.RemoteActionCompatParcelizer = i;
        if (i != 1) {
            this.serializer = z;
            RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
            this.write = registryMissingComponentException;
            Deflater deflater = new Deflater(-1, true);
            this.read = deflater;
            this.IconCompatParcelizer = new RequestManager(registryMissingComponentException, deflater);
            return;
        }
        this.serializer = z;
        RegistryMissingComponentException registryMissingComponentException2 = new RegistryMissingComponentException();
        this.write = registryMissingComponentException2;
        Inflater inflater = new Inflater(true);
        this.read = inflater;
        this.IconCompatParcelizer = new MultiModelLoaderFactory(new GifDrawableTransformation(registryMissingComponentException2), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.RemoteActionCompatParcelizer != 0) {
            ((MultiModelLoaderFactory) this.IconCompatParcelizer).close();
        } else {
            ((RequestManager) this.IconCompatParcelizer).close();
        }
    }
}
