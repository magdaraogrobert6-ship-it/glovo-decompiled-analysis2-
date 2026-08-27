package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class getLayoutDirectionui implements AutoCloseable {
    public final RegistryNoSourceEncoderAvailableException serializer;

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.serializer.close();
    }

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.serializer + ")";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof getLayoutDirectionui) {
            return this.serializer.equals(((getLayoutDirectionui) obj).serializer);
        }
        return false;
    }
}
