package com.deliveryhero.fwf_client.model;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_evaluator.model.Clause;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultInAppMessageSlideupViewFactory;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class ProtoClauseMsg {
    private final String attribute;
    private final boolean negate;
    private final String operator;
    private final List<ProtoValue> values;
    public static final Companion Companion = new Companion(null);
    private static final setGraphicModalMaxWidthDp[] $childSerializers = {null, null, new setWasCloseMessageCalled(ProtoValue$$serializer.INSTANCE, 0), null};

    public final String component1() {
        return this.attribute;
    }

    public final String component2() {
        return this.operator;
    }

    public final List<ProtoValue> component3() {
        return this.values;
    }

    public final boolean component4() {
        return this.negate;
    }

    public final String getAttribute() {
        return this.attribute;
    }

    public final boolean getNegate() {
        return this.negate;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final List<ProtoValue> getValues() {
        return this.values;
    }

    public final Clause getAsClause() {
        List arrayList;
        String str = this.attribute;
        String str2 = this.operator;
        boolean z = this.negate;
        List<ProtoValue> list = this.values;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Object asAny = ((ProtoValue) it.next()).getAsAny();
                if (asAny != null) {
                    arrayList.add(asAny);
                }
            }
        } else {
            arrayList = instance_delegatelambda0.write;
        }
        return new Clause(str, str2, z, arrayList);
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.attribute.hashCode() * 31, 31, this.operator);
        List<ProtoValue> list = this.values;
        return Boolean.hashCode(this.negate) + ((iM + (list == null ? 0 : list.hashCode())) * 31);
    }

    public String toString() {
        String str = this.attribute;
        String str2 = this.operator;
        List<ProtoValue> list = this.values;
        boolean z = this.negate;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ProtoClauseMsg(attribute=", str, ", operator=", str2, ", values=");
        sbM.append(list);
        sbM.append(", negate=");
        sbM.append(z);
        sbM.append(")");
        return sbM.toString();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return ProtoClauseMsg$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(ProtoClauseMsg protoClauseMsg, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = $childSerializers;
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, protoClauseMsg.attribute);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, protoClauseMsg.operator);
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoClauseMsg.values != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setgraphicmodalmaxwidthdpArr[2], protoClauseMsg.values);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoClauseMsg.negate) {
            defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, protoClauseMsg.negate);
        }
    }

    public final ProtoClauseMsg copy(String str, String str2, List<ProtoValue> list, boolean z) {
        str.getClass();
        str2.getClass();
        return new ProtoClauseMsg(str, str2, list, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtoClauseMsg copy$default(ProtoClauseMsg protoClauseMsg, String str, String str2, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = protoClauseMsg.attribute;
        }
        if ((i & 2) != 0) {
            str2 = protoClauseMsg.operator;
        }
        if ((i & 4) != 0) {
            list = protoClauseMsg.values;
        }
        if ((i & 8) != 0) {
            z = protoClauseMsg.negate;
        }
        return protoClauseMsg.copy(str, str2, list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoClauseMsg)) {
            return false;
        }
        ProtoClauseMsg protoClauseMsg = (ProtoClauseMsg) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.attribute, protoClauseMsg.attribute}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.operator, protoClauseMsg.operator}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.values, protoClauseMsg.values}, getCieXyz.write())).booleanValue() && this.negate == protoClauseMsg.negate;
    }

    @onItemDismisslambda0
    public /* synthetic */ ProtoClauseMsg(int i, String str, String str2, List list, boolean z, onCloseClicked oncloseclicked) {
        if (3 == (i & 3)) {
            this.attribute = str;
            this.operator = str2;
            if ((i & 4) == 0) {
                this.values = null;
            } else {
                this.values = list;
            }
            if ((i & 8) == 0) {
                this.negate = false;
                return;
            } else {
                this.negate = z;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, ProtoClauseMsg$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public ProtoClauseMsg(String str, String str2, List<ProtoValue> list, boolean z) {
        str.getClass();
        str2.getClass();
        this.attribute = str;
        this.operator = str2;
        this.values = list;
        this.negate = z;
    }

    public /* synthetic */ ProtoClauseMsg(String str, String str2, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? false : z);
    }
}
