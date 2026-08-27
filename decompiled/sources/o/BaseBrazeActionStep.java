package o;

import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.concurrent.ConcurrentHashMap;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public interface BaseBrazeActionStep {
    OkHttpCall$1 read(BufferedInputStream bufferedInputStream);

    String serializer(ConcurrentHashMap concurrentHashMap);

    void serializer(Writer writer, Object obj);

    Object write(Reader reader, Class cls);

    void write(OkHttpCall$1 okHttpCall$1, OutputStream outputStream);
}
