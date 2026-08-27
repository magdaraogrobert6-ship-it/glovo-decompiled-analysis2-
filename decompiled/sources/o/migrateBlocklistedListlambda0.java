package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class migrateBlocklistedListlambda0 {
    private final String IconCompatParcelizer;
    private final WhereClause.Operator RemoteActionCompatParcelizer;
    private final WhereClause write;

    public final WhereClause read(Long l) {
        String strM = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), this.IconCompatParcelizer, " < ?");
        List listSingletonList = Collections.singletonList(l);
        WhereClause whereClause = this.write;
        whereClause.serializer(this.RemoteActionCompatParcelizer, strM, listSingletonList);
        return whereClause;
    }

    public final <T> WhereClause read(List<T> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer);
        sb.append(" IN (");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, RemoteActionCompatParcelizer(list), ")");
        WhereClause whereClause = this.write;
        whereClause.serializer(this.RemoteActionCompatParcelizer, strM, list);
        return whereClause;
    }

    public final WhereClause write(Long l) {
        String strM = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), this.IconCompatParcelizer, " <= ?");
        List listSingletonList = Collections.singletonList(l);
        WhereClause whereClause = this.write;
        whereClause.serializer(this.RemoteActionCompatParcelizer, strM, listSingletonList);
        return whereClause;
    }

    public final <T> WhereClause write(List<T> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer);
        sb.append(" NOT IN (");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, RemoteActionCompatParcelizer(list), ")");
        WhereClause whereClause = this.write;
        whereClause.serializer(this.RemoteActionCompatParcelizer, strM, list);
        return whereClause;
    }

    public migrateBlocklistedListlambda0(String str, WhereClause.Operator operator, WhereClause whereClause) {
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = operator;
        this.write = whereClause;
    }

    private static <T> String RemoteActionCompatParcelizer(List<T> list) {
        int size = list.size();
        if (size <= 0) {
            return "";
        }
        int i = size - 1;
        StringBuilder sb = new StringBuilder((i * 2) + size);
        for (int i2 = 0; i2 < size; i2++) {
            sb.append("?");
            if (i2 < i) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public final WhereClause RemoteActionCompatParcelizer(Long l) {
        String strM = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), this.IconCompatParcelizer, " >= ?");
        List listSingletonList = Collections.singletonList(l);
        WhereClause whereClause = this.write;
        whereClause.serializer(this.RemoteActionCompatParcelizer, strM, listSingletonList);
        return whereClause;
    }

    public final <T> WhereClause write(T t) {
        String strM = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), this.IconCompatParcelizer, " = ?");
        List listSingletonList = Collections.singletonList(t);
        WhereClause whereClause = this.write;
        whereClause.serializer(this.RemoteActionCompatParcelizer, strM, listSingletonList);
        return whereClause;
    }

    public final WhereClause IconCompatParcelizer(Long l) {
        String strM = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), this.IconCompatParcelizer, " > ?");
        List listSingletonList = Collections.singletonList(l);
        WhereClause whereClause = this.write;
        whereClause.serializer(this.RemoteActionCompatParcelizer, strM, listSingletonList);
        return whereClause;
    }
}
