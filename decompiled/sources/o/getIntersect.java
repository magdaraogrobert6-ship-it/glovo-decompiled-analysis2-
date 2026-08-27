package o;

/* JADX INFO: loaded from: classes.dex */
public final class getIntersect implements getReverseDifferenceb3I0S0c {
    public boolean IconCompatParcelizer;
    public final RegistryNoSourceEncoderAvailableException RemoteActionCompatParcelizer;
    public final Object read = new Object();
    public final getIntersectb3I0S0c serializer;
    public final HttpUrlFetcher write;

    @Override // o.getReverseDifferenceb3I0S0c
    public final HttpUrlFetcher read() {
        return this.write;
    }

    @Override // o.getReverseDifferenceb3I0S0c
    public final getIntersectb3I0S0c write() {
        return this.serializer;
    }

    @Override // o.getReverseDifferenceb3I0S0c
    public final RegistryNoSourceEncoderAvailableException IconCompatParcelizer() {
        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException;
        synchronized (this.read) {
            if (this.IconCompatParcelizer) {
                throw new IllegalStateException("closed");
            }
            registryNoSourceEncoderAvailableException = this.RemoteActionCompatParcelizer;
            registryNoSourceEncoderAvailableException.getClass();
        }
        return registryNoSourceEncoderAvailableException;
    }

    @Override // o.getReverseDifferenceb3I0S0c
    public final RecyclableBufferedInputStream RemoteActionCompatParcelizer() {
        synchronized (this.read) {
            if (this.IconCompatParcelizer) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.read) {
            this.IconCompatParcelizer = true;
            RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = this.RemoteActionCompatParcelizer;
            if (registryNoSourceEncoderAvailableException != null) {
                try {
                    registryNoSourceEncoderAvailableException.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    public getIntersect(RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException, HttpUrlFetcher httpUrlFetcher, getIntersectb3I0S0c getintersectb3i0s0c) {
        this.write = httpUrlFetcher;
        this.serializer = getintersectb3i0s0c;
        this.RemoteActionCompatParcelizer = registryNoSourceEncoderAvailableException;
    }
}
