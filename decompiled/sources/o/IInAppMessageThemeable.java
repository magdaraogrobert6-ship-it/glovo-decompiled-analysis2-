package o;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class IInAppMessageThemeable implements r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk {
    public final /* synthetic */ setHeaderTextColor IconCompatParcelizer;
    public final /* synthetic */ isPushPrimer read;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ Integer write;

    @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
    public final Object serializer(SQLiteDatabase sQLiteDatabase) {
        return setHeaderTextColor.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.write, this.serializer, this.read, sQLiteDatabase);
    }

    public /* synthetic */ IInAppMessageThemeable(setHeaderTextColor setheadertextcolor, Integer num, long j, isPushPrimer ispushprimer) {
        this.IconCompatParcelizer = setheadertextcolor;
        this.write = num;
        this.serializer = j;
        this.read = ispushprimer;
    }
}
