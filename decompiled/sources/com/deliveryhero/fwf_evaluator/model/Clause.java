package com.deliveryhero.fwf_evaluator.model;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Clause {
    private final String attribute;
    private final boolean negate;
    private final String operator;
    private final List<Object> values;

    public final String component1() {
        return this.attribute;
    }

    public final String component2() {
        return this.operator;
    }

    public final boolean component3() {
        return this.negate;
    }

    public final List<Object> component4() {
        return this.values;
    }

    public final String getAttribute() {
        return this.attribute;
    }

    public final boolean getNegate() {
        return this.negate;
    }

    public final List<Object> getValues() {
        return this.values;
    }

    private final Operator getOperator() {
        return new Operator(Operator.OperatorProperty.Companion.fromOperator(this.operator));
    }

    public int hashCode() {
        return this.values.hashCode() + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.attribute.hashCode() * 31, 31, this.operator), 31, this.negate);
    }

    public String toString() {
        String str = this.attribute;
        String str2 = this.operator;
        boolean z = this.negate;
        List<Object> list = this.values;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Clause(attribute=", str, ", operator=", str2, ", negate=");
        sbM.append(z);
        sbM.append(", values=");
        sbM.append(list);
        sbM.append(")");
        return sbM.toString();
    }

    public Clause(String str, String str2, boolean z, List<? extends Object> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.attribute = str;
        this.operator = str2;
        this.negate = z;
        this.values = list;
    }

    public final Clause copy(String str, String str2, boolean z, List<? extends Object> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        return new Clause(str, str2, z, list);
    }

    public final boolean evaluateClause(Map<String, ? extends Object> map) {
        Object obj;
        map.getClass();
        if (this.attribute.length() == 0 || this.operator.length() == 0 || this.values.isEmpty() || map.isEmpty() || (obj = map.get(this.attribute)) == null) {
            return false;
        }
        return this.negate ? !getOperator().operation(obj, this.values) : getOperator().operation(obj, this.values);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Clause copy$default(Clause clause, String str, String str2, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clause.attribute;
        }
        if ((i & 2) != 0) {
            str2 = clause.operator;
        }
        if ((i & 4) != 0) {
            z = clause.negate;
        }
        if ((i & 8) != 0) {
            list = clause.values;
        }
        return clause.copy(str, str2, z, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Clause)) {
            return false;
        }
        Clause clause = (Clause) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.attribute, clause.attribute}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.operator, clause.operator}, getCieXyz.write())).booleanValue() || this.negate != clause.negate) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.values, clause.values}, getCieXyz.write())).booleanValue();
    }

    /* JADX INFO: renamed from: getOperator, reason: collision with other method in class */
    public final String m4469getOperator() {
        return this.operator;
    }
}
