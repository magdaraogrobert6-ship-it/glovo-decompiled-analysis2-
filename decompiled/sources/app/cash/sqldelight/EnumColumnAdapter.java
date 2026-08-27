package app.cash.sqldelight;

import java.lang.Enum;
import o.DrawableTransformation;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class EnumColumnAdapter<T extends Enum<T>> implements ColumnAdapter<T, String> {
    private final T[] enumValues;

    public EnumColumnAdapter(T[] tArr) {
        tArr.getClass();
        this.enumValues = tArr;
    }

    @Override // app.cash.sqldelight.ColumnAdapter
    public T decode(String str) {
        str.getClass();
        for (T t : this.enumValues) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{t.name(), str}, getCieXyz.write())).booleanValue()) {
                return t;
            }
        }
        DrawableTransformation.write("Array contains no element matching the predicate.");
        return null;
    }

    @Override // app.cash.sqldelight.ColumnAdapter
    public String encode(T t) {
        t.getClass();
        return t.name();
    }
}
