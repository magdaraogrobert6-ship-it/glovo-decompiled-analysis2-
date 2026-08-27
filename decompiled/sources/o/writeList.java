package o;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class writeList extends migrateTriggersReeligibilityToJsonlambda1<List<DataStoreProviderExternalSyntheticLambda7.RemoteActionCompatParcelizer>> {
    final /* synthetic */ DataStoreProviderExternalSyntheticLambda7 RemoteActionCompatParcelizer;

    public writeList(DataStoreProviderExternalSyntheticLambda7 dataStoreProviderExternalSyntheticLambda7) {
        this.RemoteActionCompatParcelizer = dataStoreProviderExternalSyntheticLambda7;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final List<DataStoreProviderExternalSyntheticLambda7.RemoteActionCompatParcelizer> RemoteActionCompatParcelizer() {
        return DataStoreProviderExternalSyntheticLambda7.write(this.RemoteActionCompatParcelizer);
    }
}
