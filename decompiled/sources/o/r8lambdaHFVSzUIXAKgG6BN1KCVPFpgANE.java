package o;

import android.database.Cursor;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaHFVSzUIXAKgG6BN1KCVPFpgANE<T> {

    public static class read<T extends read<T>> extends WhereClause {
    }

    public abstract T IconCompatParcelizer(Cursor cursor) throws IllegalStateException;

    public abstract Class<T> read();

    public final ArrayList read(Cursor cursor, parseLonglambda0 parselonglambda0) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            try {
                arrayList.add(IconCompatParcelizer(cursor));
            } catch (Exception e) {
                parselonglambda0.IconCompatParcelizer(false, e, "Failed to build %s from cursor", read().getName());
            }
        }
        cursor.close();
        return arrayList;
    }
}
