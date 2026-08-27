package com.deliveryhero.fwf_client.model;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_evaluator.model.Holdout;
import java.time.DateTimeException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.datetime.Instant$Companion;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultInAppMessageSlideupViewFactory;
import o.SweepGradientShader9KIMszodefault;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;
import o.setShouldNextUnregisterBeSkipped;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class ProtoHoldoutMsg {
    private final String account;
    private final int allocation;
    private final long changeVersionControl;
    private final List<ProtoClauseMsg> clauses;
    private final ProtoTimestamp endDate;
    private final boolean evalNonAuth;
    private final String key;
    public static final Companion Companion = new Companion(null);
    private static final setGraphicModalMaxWidthDp[] $childSerializers = {null, null, new setWasCloseMessageCalled(ProtoClauseMsg$$serializer.INSTANCE, 0), null, null, null, null};

    public final String component1() {
        return this.key;
    }

    public final int component2() {
        return this.allocation;
    }

    public final List<ProtoClauseMsg> component3() {
        return this.clauses;
    }

    public final ProtoTimestamp component4() {
        return this.endDate;
    }

    public final String component5() {
        return this.account;
    }

    public final boolean component6() {
        return this.evalNonAuth;
    }

    public final long component7() {
        return this.changeVersionControl;
    }

    public final String getAccount() {
        return this.account;
    }

    public final int getAllocation() {
        return this.allocation;
    }

    public final long getChangeVersionControl() {
        return this.changeVersionControl;
    }

    public final List<ProtoClauseMsg> getClauses() {
        return this.clauses;
    }

    public final ProtoTimestamp getEndDate() {
        return this.endDate;
    }

    public final boolean getEvalNonAuth() {
        return this.evalNonAuth;
    }

    public final String getKey() {
        return this.key;
    }

    public final Holdout getAsHoldout() throws Exception {
        ArrayList arrayList;
        setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskipped;
        String str = this.key;
        long j = this.allocation;
        List<ProtoClauseMsg> list = this.clauses;
        if (list != null) {
            List<ProtoClauseMsg> list2 = list;
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ProtoClauseMsg) it.next()).getAsClause());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Instant$Companion instant$Companion = setShouldNextUnregisterBeSkipped.Companion;
        long seconds = this.endDate.getSeconds();
        instant$Companion.getClass();
        try {
            Instant instantOfEpochSecond = Instant.ofEpochSecond(seconds, 0L);
            instantOfEpochSecond.getClass();
            setshouldnextunregisterbeskipped = new setShouldNextUnregisterBeSkipped(instantOfEpochSecond);
        } catch (Exception e) {
            if (!(e instanceof ArithmeticException) && !(e instanceof DateTimeException)) {
                throw e;
            }
            setshouldnextunregisterbeskipped = seconds > 0 ? setShouldNextUnregisterBeSkipped.MAX : setShouldNextUnregisterBeSkipped.MIN;
        }
        return new Holdout(str, j, arrayList, setshouldnextunregisterbeskipped, this.account, this.evalNonAuth, Long.valueOf(this.changeVersionControl));
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.allocation, this.key.hashCode() * 31, 31);
        List<ProtoClauseMsg> list = this.clauses;
        return Long.hashCode(this.changeVersionControl) + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((this.endDate.hashCode() + ((iM + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.account), 31, this.evalNonAuth);
    }

    public String toString() {
        String str = this.key;
        int i = this.allocation;
        List<ProtoClauseMsg> list = this.clauses;
        ProtoTimestamp protoTimestamp = this.endDate;
        String str2 = this.account;
        boolean z = this.evalNonAuth;
        long j = this.changeVersionControl;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("ProtoHoldoutMsg(key=", i, str, ", allocation=", ", clauses=");
        sbM.append(list);
        sbM.append(", endDate=");
        sbM.append(protoTimestamp);
        sbM.append(", account=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(str2, ", evalNonAuth=", ", changeVersionControl=", sbM, z);
        return c8$$ExternalSyntheticOutline0.m(j, ")", sbM);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return ProtoHoldoutMsg$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(ProtoHoldoutMsg protoHoldoutMsg, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = $childSerializers;
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, protoHoldoutMsg.key);
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoHoldoutMsg.allocation != 0) {
            defaultInAppMessageSlideupViewFactory.write(1, protoHoldoutMsg.allocation, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoHoldoutMsg.clauses != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setgraphicmodalmaxwidthdpArr[2], protoHoldoutMsg.clauses);
        }
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, ProtoTimestamp$$serializer.INSTANCE, protoHoldoutMsg.endDate);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, protoHoldoutMsg.account);
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoHoldoutMsg.evalNonAuth) {
            defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, protoHoldoutMsg.evalNonAuth);
        }
        if (!defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) && protoHoldoutMsg.changeVersionControl == 0) {
            return;
        }
        defaultInAppMessageSlideupViewFactory.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, protoHoldoutMsg.changeVersionControl);
    }

    public final ProtoHoldoutMsg copy(String str, int i, List<ProtoClauseMsg> list, ProtoTimestamp protoTimestamp, String str2, boolean z, long j) {
        str.getClass();
        protoTimestamp.getClass();
        str2.getClass();
        return new ProtoHoldoutMsg(str, i, list, protoTimestamp, str2, z, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoHoldoutMsg)) {
            return false;
        }
        ProtoHoldoutMsg protoHoldoutMsg = (ProtoHoldoutMsg) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, protoHoldoutMsg.key}, getCieXyz.write())).booleanValue() || this.allocation != protoHoldoutMsg.allocation) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.clauses, protoHoldoutMsg.clauses}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.endDate, protoHoldoutMsg.endDate}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.account, protoHoldoutMsg.account}, getCieXyz.write())).booleanValue() && this.evalNonAuth == protoHoldoutMsg.evalNonAuth && this.changeVersionControl == protoHoldoutMsg.changeVersionControl;
    }

    @onItemDismisslambda0
    public /* synthetic */ ProtoHoldoutMsg(int i, String str, int i2, List list, ProtoTimestamp protoTimestamp, String str2, boolean z, long j, onCloseClicked oncloseclicked) {
        if (25 == (i & 25)) {
            this.key = str;
            if ((i & 2) == 0) {
                this.allocation = 0;
            } else {
                this.allocation = i2;
            }
            if ((i & 4) == 0) {
                this.clauses = null;
            } else {
                this.clauses = list;
            }
            this.endDate = protoTimestamp;
            this.account = str2;
            if ((i & 32) == 0) {
                this.evalNonAuth = false;
            } else {
                this.evalNonAuth = z;
            }
            if ((i & 64) == 0) {
                this.changeVersionControl = 0L;
                return;
            } else {
                this.changeVersionControl = j;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 25, ProtoHoldoutMsg$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public ProtoHoldoutMsg(String str, int i, List<ProtoClauseMsg> list, ProtoTimestamp protoTimestamp, String str2, boolean z, long j) {
        str.getClass();
        protoTimestamp.getClass();
        str2.getClass();
        this.key = str;
        this.allocation = i;
        this.clauses = list;
        this.endDate = protoTimestamp;
        this.account = str2;
        this.evalNonAuth = z;
        this.changeVersionControl = j;
    }

    public /* synthetic */ ProtoHoldoutMsg(String str, int i, List list, ProtoTimestamp protoTimestamp, String str2, boolean z, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : list, protoTimestamp, str2, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? 0L : j);
    }
}
