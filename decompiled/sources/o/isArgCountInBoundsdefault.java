package o;

import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.concurrent.ConcurrentHashMap;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class isArgCountInBoundsdefault implements BaseBrazeActionStep {
    public static final isArgCountInBoundsdefault read = new isArgCountInBoundsdefault();

    @Override // o.BaseBrazeActionStep
    public final OkHttpCall$1 read(BufferedInputStream bufferedInputStream) {
        return null;
    }

    @Override // o.BaseBrazeActionStep
    public final void serializer(Writer writer, Object obj) {
    }

    @Override // o.BaseBrazeActionStep
    public final Object write(Reader reader, Class cls) {
        return null;
    }

    @Override // o.BaseBrazeActionStep
    public final void write(OkHttpCall$1 okHttpCall$1, OutputStream outputStream) {
    }

    @Override // o.BaseBrazeActionStep
    public final String serializer(ConcurrentHashMap concurrentHashMap) {
        return "";
    }
}
