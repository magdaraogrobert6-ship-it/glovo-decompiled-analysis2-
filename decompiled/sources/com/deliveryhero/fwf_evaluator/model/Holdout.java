package com.deliveryhero.fwf_evaluator.model;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ItemTouchHelperAdapter;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;
import o.setShouldNextUnregisterBeSkipped;

/* JADX INFO: loaded from: classes2.dex */
public final class Holdout {
    private final String account;
    private final long allocation;
    private final Long changeVersionControl;
    private final List<Clause> clauses;
    private final setShouldNextUnregisterBeSkipped endDate;
    private final boolean evalNonAuth;
    private final String key;

    public final String component1() {
        return this.key;
    }

    public final long component2() {
        return this.allocation;
    }

    public final List<Clause> component3() {
        return this.clauses;
    }

    public final setShouldNextUnregisterBeSkipped component4() {
        return this.endDate;
    }

    public final String component5() {
        return this.account;
    }

    public final boolean component6() {
        return this.evalNonAuth;
    }

    public final Long component7() {
        return this.changeVersionControl;
    }

    public final String getAccount() {
        return this.account;
    }

    public final long getAllocation() {
        return this.allocation;
    }

    public final Long getChangeVersionControl() {
        return this.changeVersionControl;
    }

    public final List<Clause> getClauses() {
        return this.clauses;
    }

    public final setShouldNextUnregisterBeSkipped getEndDate() {
        return this.endDate;
    }

    public final boolean getEvalNonAuth() {
        return this.evalNonAuth;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(this.key.hashCode() * 31, 31, this.allocation);
        List<Clause> list = this.clauses;
        int iM2 = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((this.endDate.value.hashCode() + ((iM + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.account), 31, this.evalNonAuth);
        Long l = this.changeVersionControl;
        return iM2 + (l != null ? l.hashCode() : 0);
    }

    public final boolean isRunning() {
        setShouldNextUnregisterBeSkipped.Companion.getClass();
        Instant instant = Clock.systemUTC().instant();
        instant.getClass();
        return new setShouldNextUnregisterBeSkipped(instant).compareTo(this.endDate) < 0;
    }

    public String toString() {
        String str = this.key;
        long j = this.allocation;
        List<Clause> list = this.clauses;
        setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskipped = this.endDate;
        String str2 = this.account;
        boolean z = this.evalNonAuth;
        Long l = this.changeVersionControl;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Holdout(key=", str, j, ", allocation=");
        sbM.append(", clauses=");
        sbM.append(list);
        sbM.append(", endDate=");
        sbM.append(setshouldnextunregisterbeskipped);
        sbM.append(", account=");
        sbM.append(str2);
        sbM.append(", evalNonAuth=");
        sbM.append(z);
        sbM.append(", changeVersionControl=");
        sbM.append(l);
        sbM.append(")");
        return sbM.toString();
    }

    public final Holdout copy(String str, long j, List<Clause> list, setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskipped, String str2, boolean z, Long l) {
        str.getClass();
        setshouldnextunregisterbeskipped.getClass();
        str2.getClass();
        return new Holdout(str, j, list, setshouldnextunregisterbeskipped, str2, z, l);
    }

    public final boolean evaluateHoldout(Map<String, ? extends Object> map) {
        map.getClass();
        List<Clause> list = this.clauses;
        if (list == null) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((Clause) it.next()).evaluateClause(map)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isUserHoldout(String str) {
        str.getClass();
        return BucketAllocationKt.bucketUser(this.key, this.account, str) < ((float) this.allocation) / 100000.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Holdout)) {
            return false;
        }
        Holdout holdout = (Holdout) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, holdout.key}, getCieXyz.write())).booleanValue() || this.allocation != holdout.allocation) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.clauses, holdout.clauses}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.endDate, holdout.endDate}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.account, holdout.account}, getCieXyz.write())).booleanValue() || this.evalNonAuth != holdout.evalNonAuth) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.changeVersionControl, holdout.changeVersionControl}, getCieXyz.write())).booleanValue();
    }

    public final Set<String> getClauseAttributes() {
        List<Clause> list = this.clauses;
        if (list == null) {
            return ItemTouchHelperAdapter.serializer;
        }
        List<Clause> list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Clause) it.next()).getAttribute());
        }
        return onContentCardDismissed.write(arrayList);
    }

    public /* synthetic */ Holdout(String str, long j, List list, setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskipped, String str2, boolean z, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, list, setshouldnextunregisterbeskipped, str2, z, (i & 64) != 0 ? 0L : l);
    }

    public Holdout(String str, long j, List<Clause> list, setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskipped, String str2, boolean z, Long l) {
        str.getClass();
        setshouldnextunregisterbeskipped.getClass();
        str2.getClass();
        this.key = str;
        this.allocation = j;
        this.clauses = list;
        this.endDate = setshouldnextunregisterbeskipped;
        this.account = str2;
        this.evalNonAuth = z;
        this.changeVersionControl = l;
    }
}
