package o;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getRadiusMeters implements r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk {
    public final /* synthetic */ getCooldownEnterSeconds IconCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ getRadiusMeters(getCooldownEnterSeconds getcooldownenterseconds, long j, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = getcooldownenterseconds;
        this.read = j;
    }

    @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
    public final Object serializer(SQLiteDatabase sQLiteDatabase) {
        int i = this.serializer;
        long j = this.read;
        getCooldownEnterSeconds getcooldownenterseconds = this.IconCompatParcelizer;
        if (i == 0) {
            return getCooldownEnterSeconds.read(getcooldownenterseconds, j, sQLiteDatabase);
        }
        if (i != 1) {
            return i != 2 ? getCooldownEnterSeconds.IconCompatParcelizer(getcooldownenterseconds, j, sQLiteDatabase) : getCooldownEnterSeconds.RemoteActionCompatParcelizer(getcooldownenterseconds, j, sQLiteDatabase);
        }
        return getCooldownEnterSeconds.serializer(getcooldownenterseconds, j, sQLiteDatabase);
    }
}
