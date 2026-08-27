package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hasAlpha implements DateTimeConverter {
    public final DateTimeConverter MediaMetadataCompat;

    @Override // o.DateTimeConverter
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat.RemoteActionCompatParcelizer();
    }

    @Override // o.DateTimeConverter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.MediaMetadataCompat.close();
    }

    @Override // o.DateTimeConverter, java.io.Flushable
    public void flush() {
        this.MediaMetadataCompat.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.MediaMetadataCompat + ')';
    }

    public hasAlpha(DateTimeConverter dateTimeConverter) {
        dateTimeConverter.getClass();
        this.MediaMetadataCompat = dateTimeConverter;
    }

    @Override // o.DateTimeConverter
    public void write(RegistryMissingComponentException registryMissingComponentException, long j) {
        registryMissingComponentException.getClass();
        this.MediaMetadataCompat.write(registryMissingComponentException, j);
    }
}
