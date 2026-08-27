package o;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambda45sMPFaVnatCFSfwbZadDvq5miU implements r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk {
    public final /* synthetic */ r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ r8lambda45sMPFaVnatCFSfwbZadDvq5miU(r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI r8lambda43c3j9_07_y35qq6grmdmadkbhi, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = r8lambda43c3j9_07_y35qq6grmdmadkbhi;
    }

    @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
    public final Object serializer(SQLiteDatabase sQLiteDatabase) {
        int i = this.write;
        r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI r8lambda43c3j9_07_y35qq6grmdmadkbhi = this.RemoteActionCompatParcelizer;
        return i != 0 ? r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI.write(r8lambda43c3j9_07_y35qq6grmdmadkbhi, sQLiteDatabase) : r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI.serializer(r8lambda43c3j9_07_y35qq6grmdmadkbhi, sQLiteDatabase);
    }
}
