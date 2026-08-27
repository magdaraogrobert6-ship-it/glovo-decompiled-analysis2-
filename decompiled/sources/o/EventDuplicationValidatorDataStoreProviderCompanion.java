package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class EventDuplicationValidatorDataStoreProviderCompanion implements migrateBlocklistedListslambda0, io.sentry.instrumentation.file.RemoteActionCompatParcelizer {
    public final /* synthetic */ AutoCloseable read;
    public final /* synthetic */ long serializer;

    public /* synthetic */ EventDuplicationValidatorDataStoreProviderCompanion(AutoCloseable autoCloseable, long j) {
        this.read = autoCloseable;
        this.serializer = j;
    }

    @Override // o.migrateBlocklistedListslambda0
    public Object A_() {
        return DustDataStoreProviderCompanion.read((DustDataStoreProviderCompanion) this.read, this.serializer);
    }

    @Override // io.sentry.instrumentation.file.RemoteActionCompatParcelizer
    public Object RemoteActionCompatParcelizer() {
        io.sentry.instrumentation.file.write writeVar = (io.sentry.instrumentation.file.write) this.read;
        return Long.valueOf(writeVar.write.skip(this.serializer));
    }
}
