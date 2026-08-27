package o;

import java.io.FilterInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class FoodoraSwitchDefaultException extends FilterInputStream {
    public final Inflater IconCompatParcelizer;

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Inflater inflater = this.IconCompatParcelizer;
        try {
            super.close();
        } finally {
            inflater.end();
        }
    }

    public FoodoraSwitchDefaultException(InflaterInputStream inflaterInputStream, Inflater inflater) {
        super(inflaterInputStream);
        this.IconCompatParcelizer = inflater;
    }
}
