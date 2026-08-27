package o;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdapOm3IvskJ527_ZMLkeDghOZbfzs implements r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk {
    public final /* synthetic */ DustDataStoreProviderCompanion IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ r8lambdapOm3IvskJ527_ZMLkeDghOZbfzs(DustDataStoreProviderCompanion dustDataStoreProviderCompanion, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = dustDataStoreProviderCompanion;
    }

    @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
    public final Object serializer(SQLiteDatabase sQLiteDatabase) {
        int i = this.serializer;
        DustDataStoreProviderCompanion dustDataStoreProviderCompanion = this.IconCompatParcelizer;
        return i != 0 ? DustDataStoreProviderCompanion.IconCompatParcelizer(dustDataStoreProviderCompanion, sQLiteDatabase) : dustDataStoreProviderCompanion.IconCompatParcelizer(sQLiteDatabase);
    }
}
