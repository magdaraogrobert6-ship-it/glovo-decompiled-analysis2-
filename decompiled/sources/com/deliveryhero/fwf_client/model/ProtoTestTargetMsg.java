package com.deliveryhero.fwf_client.model;

import com.deliveryhero.fwf_evaluator.model.TestTarget;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultInAppMessageSlideupViewFactory;
import o.MediaSessionCompatQueueItem;
import o.beforeInAppMessageViewClosed;
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
public final class ProtoTestTargetMsg {
    private final List<String> values;
    private final ProtoValue variation;
    private final ProtoValue variationName;
    public static final Companion Companion = new Companion(null);
    private static final setGraphicModalMaxWidthDp[] $childSerializers = {null, null, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0)};

    public final ProtoValue component1() {
        return this.variation;
    }

    public final ProtoValue component2() {
        return this.variationName;
    }

    public final List<String> component3() {
        return this.values;
    }

    public final List<String> getValues() {
        return this.values;
    }

    public final ProtoValue getVariation() {
        return this.variation;
    }

    public final ProtoValue getVariationName() {
        return this.variationName;
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(ProtoTestTargetMsg protoTestTargetMsg, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = $childSerializers;
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoTestTargetMsg.variation != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, ProtoValue$$serializer.INSTANCE, protoTestTargetMsg.variation);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoTestTargetMsg.variationName != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, ProtoValue$$serializer.INSTANCE, protoTestTargetMsg.variationName);
        }
        if (!defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) && protoTestTargetMsg.values == null) {
            return;
        }
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setgraphicmodalmaxwidthdpArr[2], protoTestTargetMsg.values);
    }

    public final ProtoTestTargetMsg copy(ProtoValue protoValue, ProtoValue protoValue2, List<String> list) {
        return new ProtoTestTargetMsg(protoValue, protoValue2, list);
    }

    public final TestTarget getAsTestTarget() {
        ProtoValue protoValue = this.variation;
        Object asAny = protoValue != null ? protoValue.getAsAny() : null;
        ProtoValue protoValue2 = this.variationName;
        Object asAny2 = protoValue2 != null ? protoValue2.getAsAny() : null;
        List list = this.values;
        if (list == null) {
            list = instance_delegatelambda0.write;
        }
        return new TestTarget(asAny, asAny2, list);
    }

    public String toString() {
        ProtoValue protoValue = this.variation;
        ProtoValue protoValue2 = this.variationName;
        List<String> list = this.values;
        StringBuilder sb = new StringBuilder("ProtoTestTargetMsg(variation=");
        sb.append(protoValue);
        sb.append(", variationName=");
        sb.append(protoValue2);
        sb.append(", values=");
        return MediaSessionCompatQueueItem.read(sb, list, ")");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return ProtoTestTargetMsg$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtoTestTargetMsg copy$default(ProtoTestTargetMsg protoTestTargetMsg, ProtoValue protoValue, ProtoValue protoValue2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            protoValue = protoTestTargetMsg.variation;
        }
        if ((i & 2) != 0) {
            protoValue2 = protoTestTargetMsg.variationName;
        }
        if ((i & 4) != 0) {
            list = protoTestTargetMsg.values;
        }
        return protoTestTargetMsg.copy(protoValue, protoValue2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoTestTargetMsg)) {
            return false;
        }
        ProtoTestTargetMsg protoTestTargetMsg = (ProtoTestTargetMsg) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variation, protoTestTargetMsg.variation}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variationName, protoTestTargetMsg.variationName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.values, protoTestTargetMsg.values}, getCieXyz.write())).booleanValue();
    }

    public int hashCode() {
        ProtoValue protoValue = this.variation;
        int iHashCode = protoValue == null ? 0 : protoValue.hashCode();
        ProtoValue protoValue2 = this.variationName;
        int iHashCode2 = protoValue2 == null ? 0 : protoValue2.hashCode();
        List<String> list = this.values;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    @onItemDismisslambda0
    public /* synthetic */ ProtoTestTargetMsg(int i, ProtoValue protoValue, ProtoValue protoValue2, List list, onCloseClicked oncloseclicked) {
        if ((i & 1) == 0) {
            this.variation = null;
        } else {
            this.variation = protoValue;
        }
        if ((i & 2) == 0) {
            this.variationName = null;
        } else {
            this.variationName = protoValue2;
        }
        if ((i & 4) == 0) {
            this.values = null;
        } else {
            this.values = list;
        }
    }

    public ProtoTestTargetMsg() {
        this((ProtoValue) null, (ProtoValue) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public ProtoTestTargetMsg(ProtoValue protoValue, ProtoValue protoValue2, List<String> list) {
        this.variation = protoValue;
        this.variationName = protoValue2;
        this.values = list;
    }

    public /* synthetic */ ProtoTestTargetMsg(ProtoValue protoValue, ProtoValue protoValue2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : protoValue, (i & 2) != 0 ? null : protoValue2, (i & 4) != 0 ? null : list);
    }
}
