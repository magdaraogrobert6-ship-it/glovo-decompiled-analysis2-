package com.deliveryhero.fwf_client.model;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_evaluator.model.Rollout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultInAppMessageSlideupViewFactory;
import o.getCieXyz;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class ProtoRolloutMsg {
    public static final Companion Companion = new Companion(null);
    private final boolean isParticipating;
    private final ProtoValue variation;
    private final ProtoValue variationName;
    private final int weight;

    public final ProtoValue component1() {
        return this.variation;
    }

    public final ProtoValue component2() {
        return this.variationName;
    }

    public final int component3() {
        return this.weight;
    }

    public final boolean component4() {
        return this.isParticipating;
    }

    public final ProtoValue getVariation() {
        return this.variation;
    }

    public final ProtoValue getVariationName() {
        return this.variationName;
    }

    public final int getWeight() {
        return this.weight;
    }

    public final boolean isParticipating() {
        return this.isParticipating;
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(ProtoRolloutMsg protoRolloutMsg, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        ProtoValue$$serializer protoValue$$serializer = ProtoValue$$serializer.INSTANCE;
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, protoValue$$serializer, protoRolloutMsg.variation);
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, protoValue$$serializer, protoRolloutMsg.variationName);
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoRolloutMsg.weight != 0) {
            defaultInAppMessageSlideupViewFactory.write(2, protoRolloutMsg.weight, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoRolloutMsg.isParticipating) {
            defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, protoRolloutMsg.isParticipating);
        }
    }

    public final ProtoRolloutMsg copy(ProtoValue protoValue, ProtoValue protoValue2, int i, boolean z) {
        return new ProtoRolloutMsg(protoValue, protoValue2, i, z);
    }

    public final Rollout getAsRollout() {
        ProtoValue protoValue = this.variation;
        Object asAny = protoValue != null ? protoValue.getAsAny() : null;
        ProtoValue protoValue2 = this.variationName;
        return new Rollout(asAny, protoValue2 != null ? protoValue2.getAsAny() : null, this.weight, Boolean.valueOf(this.isParticipating));
    }

    public String toString() {
        return "ProtoRolloutMsg(variation=" + this.variation + ", variationName=" + this.variationName + ", weight=" + this.weight + ", isParticipating=" + this.isParticipating + ")";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return ProtoRolloutMsg$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ ProtoRolloutMsg copy$default(ProtoRolloutMsg protoRolloutMsg, ProtoValue protoValue, ProtoValue protoValue2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            protoValue = protoRolloutMsg.variation;
        }
        if ((i2 & 2) != 0) {
            protoValue2 = protoRolloutMsg.variationName;
        }
        if ((i2 & 4) != 0) {
            i = protoRolloutMsg.weight;
        }
        if ((i2 & 8) != 0) {
            z = protoRolloutMsg.isParticipating;
        }
        return protoRolloutMsg.copy(protoValue, protoValue2, i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoRolloutMsg)) {
            return false;
        }
        ProtoRolloutMsg protoRolloutMsg = (ProtoRolloutMsg) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variation, protoRolloutMsg.variation}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variationName, protoRolloutMsg.variationName}, getCieXyz.write())).booleanValue() && this.weight == protoRolloutMsg.weight && this.isParticipating == protoRolloutMsg.isParticipating;
    }

    @onItemDismisslambda0
    public /* synthetic */ ProtoRolloutMsg(int i, ProtoValue protoValue, ProtoValue protoValue2, int i2, boolean z, onCloseClicked oncloseclicked) {
        if (3 == (i & 3)) {
            this.variation = protoValue;
            this.variationName = protoValue2;
            if ((i & 4) == 0) {
                this.weight = 0;
            } else {
                this.weight = i2;
            }
            if ((i & 8) == 0) {
                this.isParticipating = false;
                return;
            } else {
                this.isParticipating = z;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, ProtoRolloutMsg$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public int hashCode() {
        ProtoValue protoValue = this.variation;
        int iHashCode = protoValue == null ? 0 : protoValue.hashCode();
        ProtoValue protoValue2 = this.variationName;
        return Boolean.hashCode(this.isParticipating) + af$$ExternalSyntheticOutline0.m(this.weight, ((iHashCode * 31) + (protoValue2 != null ? protoValue2.hashCode() : 0)) * 31, 31);
    }

    public ProtoRolloutMsg(ProtoValue protoValue, ProtoValue protoValue2, int i, boolean z) {
        this.variation = protoValue;
        this.variationName = protoValue2;
        this.weight = i;
        this.isParticipating = z;
    }

    public /* synthetic */ ProtoRolloutMsg(ProtoValue protoValue, ProtoValue protoValue2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(protoValue, protoValue2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }
}
