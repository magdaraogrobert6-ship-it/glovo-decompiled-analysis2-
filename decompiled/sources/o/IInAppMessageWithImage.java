package o;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class IInAppMessageWithImage implements r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk {
    public final /* synthetic */ setHeaderTextColor IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ IInAppMessageWithImage(setHeaderTextColor setheadertextcolor, int i) {
        this.write = i;
        this.IconCompatParcelizer = setheadertextcolor;
    }

    @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
    public final Object serializer(SQLiteDatabase sQLiteDatabase) {
        int i = this.write;
        setHeaderTextColor setheadertextcolor = this.IconCompatParcelizer;
        if (i != 0) {
            return i != 1 ? setHeaderTextColor.serializer(setheadertextcolor, sQLiteDatabase) : setHeaderTextColor.write(setheadertextcolor, sQLiteDatabase);
        }
        return setHeaderTextColor.read(setheadertextcolor, sQLiteDatabase);
    }
}
