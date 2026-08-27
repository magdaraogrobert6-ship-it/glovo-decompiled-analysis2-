package o;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes4.dex */
public final class SessionStorageDataStoreProviderCompanion implements r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk<Object> {
    final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;

    public SessionStorageDataStoreProviderCompanion(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
    public final Object serializer(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        return this.read.invoke(sQLiteDatabase);
    }
}
