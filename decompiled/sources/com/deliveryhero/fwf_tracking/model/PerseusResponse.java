package com.deliveryhero.fwf_tracking.model;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultInAppMessageSlideupViewFactory;
import o.SweepGradientShader9KIMszodefault;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.getCieXyz;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class PerseusResponse {
    private final List<PerseusError> errors;
    private final String message;
    private final String status;
    private final String timestamp;
    public static final Companion Companion = new Companion(null);
    private static final setGraphicModalMaxWidthDp[] $childSerializers = {null, null, null, new setWasCloseMessageCalled(PerseusResponse$PerseusError$$serializer.INSTANCE, 0)};

    @Serializable
    public static final class PerseusError {
        private static final setGraphicModalMaxWidthDp[] $childSerializers;
        public static final Companion Companion = new Companion(null);
        private final String detail;
        private final Map<String, String> source;
        private final String title;

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.detail;
        }

        public final Map<String, String> component3() {
            return this.source;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final Map<String, String> getSource() {
            return this.source;
        }

        public final String getTitle() {
            return this.title;
        }

        public static final /* synthetic */ void write$Self$fwf_client_release(PerseusError perseusError, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
            setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = $childSerializers;
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeinappmessageviewclosed, perseusError.title);
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeinappmessageviewclosed, perseusError.detail);
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setgraphicmodalmaxwidthdpArr[2], perseusError.source);
        }

        public final PerseusError copy(String str, String str2, Map<String, String> map) {
            return new PerseusError(str, str2, map);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.detail;
            return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m("PerseusError(title=", str, ", detail=", str2, ", source="), this.source, ")");
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final setGraphicModalMaxWidthDp serializer() {
                return PerseusResponse$PerseusError$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        static {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            $childSerializers = new setGraphicModalMaxWidthDp[]{null, null, new beforeOpened(beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed))};
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PerseusError copy$default(PerseusError perseusError, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = perseusError.title;
            }
            if ((i & 2) != 0) {
                str2 = perseusError.detail;
            }
            if ((i & 4) != 0) {
                map = perseusError.source;
            }
            return perseusError.copy(str, str2, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PerseusError)) {
                return false;
            }
            PerseusError perseusError = (PerseusError) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, perseusError.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.detail, perseusError.detail}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.source, perseusError.source}, getCieXyz.write())).booleanValue();
        }

        @onItemDismisslambda0
        public /* synthetic */ PerseusError(int i, String str, String str2, Map map, onCloseClicked oncloseclicked) {
            if (7 == (i & 7)) {
                this.title = str;
                this.detail = str2;
                this.source = map;
                return;
            }
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, PerseusResponse$PerseusError$$serializer.INSTANCE.getDescriptor());
            throw null;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.detail;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            Map<String, String> map = this.source;
            return (((iHashCode * 31) + iHashCode2) * 31) + (map != null ? map.hashCode() : 0);
        }

        public PerseusError(String str, String str2, Map<String, String> map) {
            this.title = str;
            this.detail = str2;
            this.source = map;
        }
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.timestamp;
    }

    public final String component3() {
        return this.message;
    }

    public final List<PerseusError> component4() {
        return this.errors;
    }

    public final List<PerseusError> getErrors() {
        return this.errors;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(PerseusResponse perseusResponse, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = $childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeinappmessageviewclosed, perseusResponse.status);
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeinappmessageviewclosed, perseusResponse.timestamp);
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeinappmessageviewclosed, perseusResponse.message);
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, setgraphicmodalmaxwidthdpArr[3], perseusResponse.errors);
    }

    public final PerseusResponse copy(String str, String str2, String str3, List<PerseusError> list) {
        return new PerseusResponse(str, str2, str3, list);
    }

    public String toString() {
        String str = this.status;
        String str2 = this.timestamp;
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(c8$$ExternalSyntheticOutline0.m("PerseusResponse(status=", str, ", timestamp=", str2, ", message="), this.message, ", errors=", this.errors, ")");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return PerseusResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerseusResponse copy$default(PerseusResponse perseusResponse, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = perseusResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = perseusResponse.timestamp;
        }
        if ((i & 4) != 0) {
            str3 = perseusResponse.message;
        }
        if ((i & 8) != 0) {
            list = perseusResponse.errors;
        }
        return perseusResponse.copy(str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerseusResponse)) {
            return false;
        }
        PerseusResponse perseusResponse = (PerseusResponse) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.status, perseusResponse.status}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timestamp, perseusResponse.timestamp}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, perseusResponse.message}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.errors, perseusResponse.errors}, getCieXyz.write())).booleanValue();
    }

    @onItemDismisslambda0
    public /* synthetic */ PerseusResponse(int i, String str, String str2, String str3, List list, onCloseClicked oncloseclicked) {
        if (15 == (i & 15)) {
            this.status = str;
            this.timestamp = str2;
            this.message = str3;
            this.errors = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, PerseusResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public int hashCode() {
        String str = this.status;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.timestamp;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.message;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        List<PerseusError> list = this.errors;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public PerseusResponse(String str, String str2, String str3, List<PerseusError> list) {
        this.status = str;
        this.timestamp = str2;
        this.message = str3;
        this.errors = list;
    }
}
