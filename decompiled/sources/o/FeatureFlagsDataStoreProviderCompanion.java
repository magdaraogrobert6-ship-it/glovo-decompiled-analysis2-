package o;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class FeatureFlagsDataStoreProviderCompanion implements r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk {
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ DustDataStoreProviderCompanion read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ FeatureFlagsDataStoreProviderCompanion(DustDataStoreProviderCompanion dustDataStoreProviderCompanion, long j, int i) {
        this.serializer = i;
        this.read = dustDataStoreProviderCompanion;
        this.RemoteActionCompatParcelizer = j;
    }

    @Override // o.r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk
    public final Object write(SQLiteDatabase sQLiteDatabase) {
        int i = this.serializer;
        long j = this.RemoteActionCompatParcelizer;
        DustDataStoreProviderCompanion dustDataStoreProviderCompanion = this.read;
        return i != 0 ? DustDataStoreProviderCompanion.IconCompatParcelizer(dustDataStoreProviderCompanion, j, sQLiteDatabase) : DustDataStoreProviderCompanion.serializer(dustDataStoreProviderCompanion, j, sQLiteDatabase);
    }
}
