package com.deliveryhero.fwf_client.model;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_evaluator.model.Rule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultInAppMessageSlideupViewFactory;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class ProtoRuleMsg {
    private final List<ProtoClauseMsg> clauses;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private final boolean f4default;
    private final boolean isABTest;
    private final List<ProtoRolloutMsg> rollouts;
    private final ProtoValue variation;
    private final ProtoValue variationName;
    public static final Companion Companion = new Companion(null);
    private static final setGraphicModalMaxWidthDp[] $childSerializers = {new setWasCloseMessageCalled(ProtoClauseMsg$$serializer.INSTANCE, 0), null, null, null, new setWasCloseMessageCalled(ProtoRolloutMsg$$serializer.INSTANCE, 0), null};

    public final List<ProtoClauseMsg> component1() {
        return this.clauses;
    }

    public final boolean component2() {
        return this.f4default;
    }

    public final ProtoValue component3() {
        return this.variation;
    }

    public final ProtoValue component4() {
        return this.variationName;
    }

    public final List<ProtoRolloutMsg> component5() {
        return this.rollouts;
    }

    public final boolean component6() {
        return this.isABTest;
    }

    public final List<ProtoClauseMsg> getClauses() {
        return this.clauses;
    }

    public final boolean getDefault() {
        return this.f4default;
    }

    public final List<ProtoRolloutMsg> getRollouts() {
        return this.rollouts;
    }

    public final ProtoValue getVariation() {
        return this.variation;
    }

    public final ProtoValue getVariationName() {
        return this.variationName;
    }

    public final boolean isABTest() {
        return this.isABTest;
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(ProtoRuleMsg protoRuleMsg, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = $childSerializers;
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoRuleMsg.clauses != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, setgraphicmodalmaxwidthdpArr[0], protoRuleMsg.clauses);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoRuleMsg.f4default) {
            defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, protoRuleMsg.f4default);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoRuleMsg.variation != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, ProtoValue$$serializer.INSTANCE, protoRuleMsg.variation);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoRuleMsg.variationName != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, ProtoValue$$serializer.INSTANCE, protoRuleMsg.variationName);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoRuleMsg.rollouts != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, setgraphicmodalmaxwidthdpArr[4], protoRuleMsg.rollouts);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoRuleMsg.isABTest) {
            defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, protoRuleMsg.isABTest);
        }
    }

    public final ProtoRuleMsg copy(List<ProtoClauseMsg> list, boolean z, ProtoValue protoValue, ProtoValue protoValue2, List<ProtoRolloutMsg> list2, boolean z2) {
        return new ProtoRuleMsg(list, z, protoValue, protoValue2, list2, z2);
    }

    public String toString() {
        return "ProtoRuleMsg(clauses=" + this.clauses + ", default=" + this.f4default + ", variation=" + this.variation + ", variationName=" + this.variationName + ", rollouts=" + this.rollouts + ", isABTest=" + this.isABTest + ")";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return ProtoRuleMsg$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtoRuleMsg copy$default(ProtoRuleMsg protoRuleMsg, List list, boolean z, ProtoValue protoValue, ProtoValue protoValue2, List list2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = protoRuleMsg.clauses;
        }
        if ((i & 2) != 0) {
            z = protoRuleMsg.f4default;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            protoValue = protoRuleMsg.variation;
        }
        ProtoValue protoValue3 = protoValue;
        if ((i & 8) != 0) {
            protoValue2 = protoRuleMsg.variationName;
        }
        ProtoValue protoValue4 = protoValue2;
        if ((i & 16) != 0) {
            list2 = protoRuleMsg.rollouts;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            z2 = protoRuleMsg.isABTest;
        }
        return protoRuleMsg.copy(list, z3, protoValue3, protoValue4, list3, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoRuleMsg)) {
            return false;
        }
        ProtoRuleMsg protoRuleMsg = (ProtoRuleMsg) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.clauses, protoRuleMsg.clauses}, getCieXyz.write())).booleanValue() || this.f4default != protoRuleMsg.f4default) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variation, protoRuleMsg.variation}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variationName, protoRuleMsg.variationName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.rollouts, protoRuleMsg.rollouts}, getCieXyz.write())).booleanValue() && this.isABTest == protoRuleMsg.isABTest;
    }

    public final Rule getAsRule() {
        ArrayList arrayList;
        List<ProtoClauseMsg> list = this.clauses;
        ArrayList arrayList2 = null;
        if (list != null) {
            List<ProtoClauseMsg> list2 = list;
            ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((ProtoClauseMsg) it.next()).getAsClause());
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        boolean z = this.f4default;
        ProtoValue protoValue = this.variation;
        Object asAny = protoValue != null ? protoValue.getAsAny() : null;
        ProtoValue protoValue2 = this.variationName;
        Object asAny2 = protoValue2 != null ? protoValue2.getAsAny() : null;
        List<ProtoRolloutMsg> list3 = this.rollouts;
        if (list3 != null) {
            List<ProtoRolloutMsg> list4 = list3;
            arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ProtoRolloutMsg) it2.next()).getAsRollout());
            }
        }
        return new Rule(arrayList, z, asAny, asAny2, arrayList2);
    }

    public int hashCode() {
        List<ProtoClauseMsg> list = this.clauses;
        int iM = d$$ExternalSyntheticOutline0.m((list == null ? 0 : list.hashCode()) * 31, 31, this.f4default);
        ProtoValue protoValue = this.variation;
        int iHashCode = protoValue == null ? 0 : protoValue.hashCode();
        ProtoValue protoValue2 = this.variationName;
        int iHashCode2 = protoValue2 == null ? 0 : protoValue2.hashCode();
        List<ProtoRolloutMsg> list2 = this.rollouts;
        return Boolean.hashCode(this.isABTest) + ((((((iM + iHashCode) * 31) + iHashCode2) * 31) + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    @onItemDismisslambda0
    public /* synthetic */ ProtoRuleMsg(int i, List list, boolean z, ProtoValue protoValue, ProtoValue protoValue2, List list2, boolean z2, onCloseClicked oncloseclicked) {
        if ((i & 1) == 0) {
            this.clauses = null;
        } else {
            this.clauses = list;
        }
        if ((i & 2) == 0) {
            this.f4default = false;
        } else {
            this.f4default = z;
        }
        if ((i & 4) == 0) {
            this.variation = null;
        } else {
            this.variation = protoValue;
        }
        if ((i & 8) == 0) {
            this.variationName = null;
        } else {
            this.variationName = protoValue2;
        }
        if ((i & 16) == 0) {
            this.rollouts = null;
        } else {
            this.rollouts = list2;
        }
        if ((i & 32) == 0) {
            this.isABTest = false;
        } else {
            this.isABTest = z2;
        }
    }

    public ProtoRuleMsg() {
        this((List) null, false, (ProtoValue) null, (ProtoValue) null, (List) null, false, 63, (DefaultConstructorMarker) null);
    }

    public ProtoRuleMsg(List<ProtoClauseMsg> list, boolean z, ProtoValue protoValue, ProtoValue protoValue2, List<ProtoRolloutMsg> list2, boolean z2) {
        this.clauses = list;
        this.f4default = z;
        this.variation = protoValue;
        this.variationName = protoValue2;
        this.rollouts = list2;
        this.isABTest = z2;
    }

    public /* synthetic */ ProtoRuleMsg(List list, boolean z, ProtoValue protoValue, ProtoValue protoValue2, List list2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : protoValue, (i & 8) != 0 ? null : protoValue2, (i & 16) == 0 ? list2 : null, (i & 32) != 0 ? false : z2);
    }
}
