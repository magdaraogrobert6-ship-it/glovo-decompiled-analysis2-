package o;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes4.dex */
public interface DateTimeConverter extends Closeable, Flushable {
    ApiErrorResponseCompanion RemoteActionCompatParcelizer();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();

    void write(RegistryMissingComponentException registryMissingComponentException, long j);
}
