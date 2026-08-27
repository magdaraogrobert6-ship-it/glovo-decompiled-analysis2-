package com.deliveryhero.fwf_client.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultInAppMessageSlideupViewFactory;
import o.getCieXyz;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class ProtoFeatureOrErrorMsg {
    public static final Companion Companion = new Companion(null);
    private final ProtoErrorMsg error;
    private final ProtoFeatureMsg feature;

    public final ProtoFeatureMsg component1() {
        return this.feature;
    }

    public final ProtoErrorMsg component2() {
        return this.error;
    }

    public final ProtoErrorMsg getError() {
        return this.error;
    }

    public final ProtoFeatureMsg getFeature() {
        return this.feature;
    }

    public final ProtoFeatureOrErrorMsg copy(ProtoFeatureMsg protoFeatureMsg, ProtoErrorMsg protoErrorMsg) {
        return new ProtoFeatureOrErrorMsg(protoFeatureMsg, protoErrorMsg);
    }

    public String toString() {
        return "ProtoFeatureOrErrorMsg(feature=" + this.feature + ", error=" + this.error + ")";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return ProtoFeatureOrErrorMsg$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ ProtoFeatureOrErrorMsg copy$default(ProtoFeatureOrErrorMsg protoFeatureOrErrorMsg, ProtoFeatureMsg protoFeatureMsg, ProtoErrorMsg protoErrorMsg, int i, Object obj) {
        if ((i & 1) != 0) {
            protoFeatureMsg = protoFeatureOrErrorMsg.feature;
        }
        if ((i & 2) != 0) {
            protoErrorMsg = protoFeatureOrErrorMsg.error;
        }
        return protoFeatureOrErrorMsg.copy(protoFeatureMsg, protoErrorMsg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoFeatureOrErrorMsg)) {
            return false;
        }
        ProtoFeatureOrErrorMsg protoFeatureOrErrorMsg = (ProtoFeatureOrErrorMsg) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.feature, protoFeatureOrErrorMsg.feature}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.error, protoFeatureOrErrorMsg.error}, getCieXyz.write())).booleanValue();
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(ProtoFeatureOrErrorMsg protoFeatureOrErrorMsg, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoFeatureOrErrorMsg.feature != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, ProtoFeatureMsg$$serializer.INSTANCE, protoFeatureOrErrorMsg.feature);
        }
        if (!defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) && protoFeatureOrErrorMsg.error == null) {
            return;
        }
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, ProtoErrorMsg$$serializer.INSTANCE, protoFeatureOrErrorMsg.error);
    }

    public int hashCode() {
        ProtoFeatureMsg protoFeatureMsg = this.feature;
        int iHashCode = protoFeatureMsg == null ? 0 : protoFeatureMsg.hashCode();
        ProtoErrorMsg protoErrorMsg = this.error;
        return (iHashCode * 31) + (protoErrorMsg != null ? protoErrorMsg.hashCode() : 0);
    }

    @onItemDismisslambda0
    public /* synthetic */ ProtoFeatureOrErrorMsg(int i, ProtoFeatureMsg protoFeatureMsg, ProtoErrorMsg protoErrorMsg, onCloseClicked oncloseclicked) {
        if ((i & 1) == 0) {
            this.feature = null;
        } else {
            this.feature = protoFeatureMsg;
        }
        if ((i & 2) == 0) {
            this.error = null;
        } else {
            this.error = protoErrorMsg;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoFeatureOrErrorMsg() {
        this((ProtoFeatureMsg) null, (ProtoErrorMsg) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public ProtoFeatureOrErrorMsg(ProtoFeatureMsg protoFeatureMsg, ProtoErrorMsg protoErrorMsg) {
        this.feature = protoFeatureMsg;
        this.error = protoErrorMsg;
    }

    public /* synthetic */ ProtoFeatureOrErrorMsg(ProtoFeatureMsg protoFeatureMsg, ProtoErrorMsg protoErrorMsg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : protoFeatureMsg, (i & 2) != 0 ? null : protoErrorMsg);
    }
}
