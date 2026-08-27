package o;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class setRectf implements Closeable {
    public final RegistryNoSourceEncoderAvailableException IconCompatParcelizer;
    public final /* synthetic */ r8lambda0088L0EiZH2mqIpRPuXhwYCr8 read;
    public final RegistryNoImageHeaderParserException write;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.read.write(-1L, true, true, null);
    }

    public setRectf(r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8, RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException, RegistryNoImageHeaderParserException registryNoImageHeaderParserException) {
        this.read = r8lambda0088l0eizh2mqiprpuxhwycr8;
        registryNoSourceEncoderAvailableException.getClass();
        registryNoImageHeaderParserException.getClass();
        this.IconCompatParcelizer = registryNoSourceEncoderAvailableException;
        this.write = registryNoImageHeaderParserException;
    }
}
