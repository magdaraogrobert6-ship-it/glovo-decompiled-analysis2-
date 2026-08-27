package com.deliveryhero.fwf_evaluator.model;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ItemTouchHelperAdapter;
import o.MediaSessionCompatQueueItem;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Rule {
    private final List<Clause> clauses;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private final boolean f5default;
    private final List<Rollout> rollouts;
    private final Object variation;
    private final Object variationName;

    public static final class RuleAllocation {
        private final Float bucket;
        private final boolean participating;
        private final Object variation;
        private final Object variationName;

        public final Object component1() {
            return this.variation;
        }

        public final Object component2() {
            return this.variationName;
        }

        public final boolean component3() {
            return this.participating;
        }

        public final Float component4() {
            return this.bucket;
        }

        public final Float getBucket() {
            return this.bucket;
        }

        public final boolean getParticipating() {
            return this.participating;
        }

        public final Object getVariation() {
            return this.variation;
        }

        public final Object getVariationName() {
            return this.variationName;
        }

        public final RuleAllocation copy(Object obj, Object obj2, boolean z, Float f) {
            return new RuleAllocation(obj, obj2, z, f);
        }

        public String toString() {
            return "RuleAllocation(variation=" + this.variation + ", variationName=" + this.variationName + ", participating=" + this.participating + ", bucket=" + this.bucket + ")";
        }

        public RuleAllocation(Object obj, Object obj2, boolean z, Float f) {
            this.variation = obj;
            this.variationName = obj2;
            this.participating = z;
            this.bucket = f;
        }

        public static /* synthetic */ RuleAllocation copy$default(RuleAllocation ruleAllocation, Object obj, Object obj2, boolean z, Float f, int i, Object obj3) {
            if ((i & 1) != 0) {
                obj = ruleAllocation.variation;
            }
            if ((i & 2) != 0) {
                obj2 = ruleAllocation.variationName;
            }
            if ((i & 4) != 0) {
                z = ruleAllocation.participating;
            }
            if ((i & 8) != 0) {
                f = ruleAllocation.bucket;
            }
            return ruleAllocation.copy(obj, obj2, z, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RuleAllocation)) {
                return false;
            }
            RuleAllocation ruleAllocation = (RuleAllocation) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variation, ruleAllocation.variation}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variationName, ruleAllocation.variationName}, getCieXyz.write())).booleanValue() || this.participating != ruleAllocation.participating) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bucket, ruleAllocation.bucket}, getCieXyz.write())).booleanValue();
        }

        public int hashCode() {
            Object obj = this.variation;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.variationName;
            int iM = d$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31, this.participating);
            Float f = this.bucket;
            return iM + (f != null ? f.hashCode() : 0);
        }

        public /* synthetic */ RuleAllocation(Object obj, Object obj2, boolean z, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, obj2, z, (i & 8) != 0 ? null : f);
        }
    }

    public final List<Clause> component1() {
        return this.clauses;
    }

    public final boolean component2() {
        return this.f5default;
    }

    public final Object component3() {
        return this.variation;
    }

    public final Object component4() {
        return this.variationName;
    }

    public final List<Rollout> component5() {
        return this.rollouts;
    }

    public final List<Clause> getClauses() {
        return this.clauses;
    }

    public final boolean getDefault() {
        return this.f5default;
    }

    public final List<Rollout> getRollouts() {
        return this.rollouts;
    }

    public final Object getVariation() {
        return this.variation;
    }

    public final Object getVariationName() {
        return this.variationName;
    }

    public final Rule copy(List<Clause> list, boolean z, Object obj, Object obj2, List<Rollout> list2) {
        return new Rule(list, z, obj, obj2, list2);
    }

    public final boolean isRunningRollout() {
        List<Rollout> list = this.rollouts;
        return !(list == null || list.isEmpty());
    }

    public String toString() {
        List<Clause> list = this.clauses;
        boolean z = this.f5default;
        Object obj = this.variation;
        Object obj2 = this.variationName;
        List<Rollout> list2 = this.rollouts;
        StringBuilder sb = new StringBuilder("Rule(clauses=");
        sb.append(list);
        sb.append(", default=");
        sb.append(z);
        sb.append(", variation=");
        sb.append(obj);
        sb.append(", variationName=");
        sb.append(obj2);
        sb.append(", rollouts=");
        return MediaSessionCompatQueueItem.read(sb, list2, ")");
    }

    public Rule(List<Clause> list, boolean z, Object obj, Object obj2, List<Rollout> list2) {
        this.clauses = list;
        this.f5default = z;
        this.variation = obj;
        this.variationName = obj2;
        this.rollouts = list2;
    }

    public final boolean evaluateClauses(Map<String, ? extends Object> map) {
        map.getClass();
        List<Clause> list = this.clauses;
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((Clause) it.next()).evaluateClause(map)) {
                return false;
            }
        }
        return true;
    }

    public final RuleAllocation getRuleAllocation(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        if (isRunningRollout()) {
            float fBucketUser = BucketAllocationKt.bucketUser(str, str2, str3);
            List<Rollout> list = this.rollouts;
            if (list != null) {
                float weight = 0.0f;
                for (Rollout rollout : list) {
                    weight += rollout.getWeight() / 100000.0f;
                    if (fBucketUser < weight) {
                        Object variation = rollout.getVariation();
                        Object variationName = rollout.getVariationName();
                        Boolean boolIsParticipating = rollout.isParticipating();
                        return new RuleAllocation(variation, variationName, boolIsParticipating != null ? boolIsParticipating.booleanValue() : false, Float.valueOf(fBucketUser));
                    }
                }
            }
        }
        return new RuleAllocation(this.variation, this.variationName, false, null, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Rule copy$default(Rule rule, List list, boolean z, Object obj, Object obj2, List list2, int i, Object obj3) {
        if ((i & 1) != 0) {
            list = rule.clauses;
        }
        if ((i & 2) != 0) {
            z = rule.f5default;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            obj = rule.variation;
        }
        Object obj4 = obj;
        if ((i & 8) != 0) {
            obj2 = rule.variationName;
        }
        Object obj5 = obj2;
        if ((i & 16) != 0) {
            list2 = rule.rollouts;
        }
        return rule.copy(list, z2, obj4, obj5, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rule)) {
            return false;
        }
        Rule rule = (Rule) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.clauses, rule.clauses}, getCieXyz.write())).booleanValue() || this.f5default != rule.f5default) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variation, rule.variation}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variationName, rule.variationName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.rollouts, rule.rollouts}, getCieXyz.write())).booleanValue();
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

    public int hashCode() {
        List<Clause> list = this.clauses;
        int iM = d$$ExternalSyntheticOutline0.m((list == null ? 0 : list.hashCode()) * 31, 31, this.f5default);
        Object obj = this.variation;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.variationName;
        int iHashCode2 = obj2 == null ? 0 : obj2.hashCode();
        List<Rollout> list2 = this.rollouts;
        return ((((iM + iHashCode) * 31) + iHashCode2) * 31) + (list2 != null ? list2.hashCode() : 0);
    }
}
