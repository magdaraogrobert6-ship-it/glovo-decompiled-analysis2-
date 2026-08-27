package o;

import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.util.database.WhereClause;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setFrameColor implements r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk {
    public final /* synthetic */ WhereClause RemoteActionCompatParcelizer;
    public final /* synthetic */ isPushPrimer read;
    public final /* synthetic */ setHeaderTextColor serializer;

    @Override // o.r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk
    public final Object write(SQLiteDatabase sQLiteDatabase) {
        return setHeaderTextColor.read(this.serializer, this.read, this.RemoteActionCompatParcelizer, sQLiteDatabase);
    }

    public /* synthetic */ setFrameColor(setHeaderTextColor setheadertextcolor, isPushPrimer ispushprimer, WhereClause whereClause) {
        this.serializer = setheadertextcolor;
        this.read = ispushprimer;
        this.RemoteActionCompatParcelizer = whereClause;
    }
}
