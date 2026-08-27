package o;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes3.dex */
public interface getConfigurationValue extends Closeable, Flushable {
    isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void serializer(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j);
}
