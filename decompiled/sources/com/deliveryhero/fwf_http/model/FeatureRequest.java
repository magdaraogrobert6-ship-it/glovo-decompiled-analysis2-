package com.deliveryhero.fwf_http.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultInAppMessageSlideupViewFactory;
import o.getCieXyz;
import o.onCloseClicked;
import o.onDismissed;
import o.onItemDismisslambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class FeatureRequest {
    public static final Companion Companion = new Companion(null);
    private final String key;
    private final Long version;

    private final String component1() {
        return this.key;
    }

    private final Long component2() {
        return this.version;
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(FeatureRequest featureRequest, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, featureRequest.key);
        if (!defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) && featureRequest.version == null) {
            return;
        }
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, onDismissed.write, featureRequest.version);
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode();
        Long l = this.version;
        return (iHashCode * 31) + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "FeatureRequest(key=" + this.key + ", version=" + this.version + ")";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return FeatureRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ FeatureRequest copy$default(FeatureRequest featureRequest, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = featureRequest.key;
        }
        if ((i & 2) != 0) {
            l = featureRequest.version;
        }
        return featureRequest.copy(str, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureRequest)) {
            return false;
        }
        FeatureRequest featureRequest = (FeatureRequest) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, featureRequest.key}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.version, featureRequest.version}, getCieXyz.write())).booleanValue();
    }

    public final FeatureRequest copy(String str, Long l) {
        str.getClass();
        return new FeatureRequest(str, l);
    }

    @onItemDismisslambda0
    public /* synthetic */ FeatureRequest(int i, String str, Long l, onCloseClicked oncloseclicked) {
        if (1 == (i & 1)) {
            this.key = str;
            if ((i & 2) == 0) {
                this.version = null;
                return;
            } else {
                this.version = l;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, FeatureRequest$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public FeatureRequest(String str, Long l) {
        str.getClass();
        this.key = str;
        this.version = l;
    }

    public /* synthetic */ FeatureRequest(String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l);
    }
}
