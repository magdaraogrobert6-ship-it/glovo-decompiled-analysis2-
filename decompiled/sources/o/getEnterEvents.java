package o;

import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getEnterEvents implements r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ getEnterEvents(Object obj, int i, Object obj2) {
        this.read = i;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
    public final Object serializer(SQLiteDatabase sQLiteDatabase) {
        int i = this.read;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = this.serializer;
        if (i == 0) {
            return getCooldownEnterSeconds.IconCompatParcelizer((getCooldownEnterSeconds) obj2, (List) obj, sQLiteDatabase);
        }
        if (i == 1) {
            return getCooldownEnterSeconds.RemoteActionCompatParcelizer((getCooldownEnterSeconds) obj2, (WhereClause) obj, sQLiteDatabase);
        }
        if (i != 2) {
            return i != 3 ? r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI.write((r8lambda8fzE8wecOd2wkcWBNYCFXmVefxw) obj2, (r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI) obj, sQLiteDatabase) : setHeaderTextColor.serializer((setHeaderTextColor) obj2, (List) obj, sQLiteDatabase);
        }
        return setHeaderTextColor.RemoteActionCompatParcelizer((setHeaderTextColor) obj2, (isPushPrimer) obj, sQLiteDatabase);
    }
}
