package com.sentiance.sdk.util.database;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.migrateBlocklistedListlambda0;

/* JADX INFO: loaded from: classes4.dex */
public class WhereClause {
    private final ArrayList IconCompatParcelizer;
    private String write;

    public final String IconCompatParcelizer() {
        return this.write;
    }

    public enum Operator {
        NONE(""),
        AND(" AND "),
        OR(" OR ");

        String mValue;

        Operator(String str) {
            this.mValue = str;
        }
    }

    public static migrateBlocklistedListlambda0 serializer(String str) {
        return new migrateBlocklistedListlambda0(str, Operator.NONE, new WhereClause("", Collections.EMPTY_LIST));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serializer(Operator operator, String str, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.write);
        sb.append(this.write.length() > 0 ? operator.mValue : "");
        this.write = sb.toString();
        this.write = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), this.write, "(", str, ")");
        this.IconCompatParcelizer.addAll(list);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + (this.write.hashCode() * 31);
    }

    public <T> WhereClause(String str, List<T> list) {
        this.write = str.trim().length() > 0 ? ff$$ExternalSyntheticOutline0.m("(", str, ")") : "";
        this.IconCompatParcelizer = new ArrayList(list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhereClause{mCondition='");
        sb.append(this.write);
        sb.append("', mArgs=");
        return af$$ExternalSyntheticOutline1.m(sb, this.IconCompatParcelizer, '}');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WhereClause whereClause = (WhereClause) obj;
        if (this.write.equals(whereClause.write)) {
            return this.IconCompatParcelizer.equals(whereClause.IconCompatParcelizer);
        }
        return false;
    }

    public WhereClause() {
        this.write = "(1 == 1)";
        this.IconCompatParcelizer = new ArrayList();
    }

    public final String[] RemoteActionCompatParcelizer() {
        ArrayList arrayList = this.IconCompatParcelizer;
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList.get(i).toString();
        }
        return strArr;
    }

    public final migrateBlocklistedListlambda0 IconCompatParcelizer(String str) {
        return new migrateBlocklistedListlambda0(str, Operator.AND, this);
    }

    public final void RemoteActionCompatParcelizer(String str) {
        serializer(Operator.AND, str, Collections.EMPTY_LIST);
    }

    public final void write(WhereClause whereClause) {
        serializer(Operator.AND, whereClause.write, whereClause.IconCompatParcelizer);
    }
}
