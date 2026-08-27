package com.deliveryhero.fwf_client.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultInAppMessageSlideupViewFactory;
import o.beforeInAppMessageViewClosed;
import o.getCieXyz;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class ProtoErrorMsg {
    private final ProtoErrorCode errorCode;
    private final String message;
    public static final Companion Companion = new Companion(null);
    private static final setGraphicModalMaxWidthDp[] $childSerializers = {null, ProtoErrorCode.Companion.serializer()};

    public final String component1() {
        return this.message;
    }

    public final ProtoErrorCode component2() {
        return this.errorCode;
    }

    public final ProtoErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(ProtoErrorMsg protoErrorMsg, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = $childSerializers;
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoErrorMsg.message != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, protoErrorMsg.message);
        }
        if (!defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) && protoErrorMsg.errorCode == null) {
            return;
        }
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, setgraphicmodalmaxwidthdpArr[1], protoErrorMsg.errorCode);
    }

    public final ProtoErrorMsg copy(String str, ProtoErrorCode protoErrorCode) {
        return new ProtoErrorMsg(str, protoErrorCode);
    }

    public String toString() {
        return "ProtoErrorMsg(message=" + this.message + ", errorCode=" + this.errorCode + ")";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return ProtoErrorMsg$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ ProtoErrorMsg copy$default(ProtoErrorMsg protoErrorMsg, String str, ProtoErrorCode protoErrorCode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = protoErrorMsg.message;
        }
        if ((i & 2) != 0) {
            protoErrorCode = protoErrorMsg.errorCode;
        }
        return protoErrorMsg.copy(str, protoErrorCode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoErrorMsg)) {
            return false;
        }
        ProtoErrorMsg protoErrorMsg = (ProtoErrorMsg) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, protoErrorMsg.message}, getCieXyz.write())).booleanValue() && this.errorCode == protoErrorMsg.errorCode;
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = str == null ? 0 : str.hashCode();
        ProtoErrorCode protoErrorCode = this.errorCode;
        return (iHashCode * 31) + (protoErrorCode != null ? protoErrorCode.hashCode() : 0);
    }

    @onItemDismisslambda0
    public /* synthetic */ ProtoErrorMsg(int i, String str, ProtoErrorCode protoErrorCode, onCloseClicked oncloseclicked) {
        if ((i & 1) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
        if ((i & 2) == 0) {
            this.errorCode = null;
        } else {
            this.errorCode = protoErrorCode;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoErrorMsg() {
        this((String) null, (ProtoErrorCode) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public ProtoErrorMsg(String str, ProtoErrorCode protoErrorCode) {
        this.message = str;
        this.errorCode = protoErrorCode;
    }

    public /* synthetic */ ProtoErrorMsg(String str, ProtoErrorCode protoErrorCode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : protoErrorCode);
    }
}
