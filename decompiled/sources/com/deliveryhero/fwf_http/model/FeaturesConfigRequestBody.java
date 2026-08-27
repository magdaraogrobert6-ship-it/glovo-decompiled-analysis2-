package com.deliveryhero.fwf_http.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultInAppMessageSlideupViewFactory;
import o.getCieXyz;
import o.isVerticalSwipeInAllowedDirection;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class FeaturesConfigRequestBody {
    private static final setGraphicModalMaxWidthDp[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final List<FeatureRequest> features;
    private final List<FeatureRequest> holdouts;

    private final List<FeatureRequest> component1() {
        return this.features;
    }

    private final List<FeatureRequest> component2() {
        return this.holdouts;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return FeaturesConfigRequestBody$$serializer.INSTANCE;
        }

        public final String encode(Map<String, Long> map, Map<String, Long> map2) {
            map.getClass();
            map2.getClass();
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                arrayList.add(new FeatureRequest(entry.getKey(), entry.getValue()));
            }
            ArrayList arrayList2 = new ArrayList(map2.size());
            for (Map.Entry<String, Long> entry2 : map2.entrySet()) {
                arrayList2.add(new FeatureRequest(entry2.getKey(), entry2.getValue()));
            }
            FeaturesConfigRequestBody featuresConfigRequestBody = new FeaturesConfigRequestBody(arrayList, arrayList2);
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            isverticalswipeinalloweddirection.getClass();
            return isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(FeaturesConfigRequestBody.Companion.serializer(), featuresConfigRequestBody);
        }

        private Companion() {
        }
    }

    public int hashCode() {
        return this.holdouts.hashCode() + (this.features.hashCode() * 31);
    }

    public String toString() {
        return "FeaturesConfigRequestBody(features=" + this.features + ", holdouts=" + this.holdouts + ")";
    }

    static {
        FeatureRequest$$serializer featureRequest$$serializer = FeatureRequest$$serializer.INSTANCE;
        $childSerializers = new setGraphicModalMaxWidthDp[]{new setWasCloseMessageCalled(featureRequest$$serializer, 0), new setWasCloseMessageCalled(featureRequest$$serializer, 0)};
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(FeaturesConfigRequestBody featuresConfigRequestBody, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = $childSerializers;
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, setgraphicmodalmaxwidthdpArr[0], featuresConfigRequestBody.features);
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, setgraphicmodalmaxwidthdpArr[1], featuresConfigRequestBody.holdouts);
    }

    public final FeaturesConfigRequestBody copy(List<FeatureRequest> list, List<FeatureRequest> list2) {
        list.getClass();
        list2.getClass();
        return new FeaturesConfigRequestBody(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeaturesConfigRequestBody copy$default(FeaturesConfigRequestBody featuresConfigRequestBody, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = featuresConfigRequestBody.features;
        }
        if ((i & 2) != 0) {
            list2 = featuresConfigRequestBody.holdouts;
        }
        return featuresConfigRequestBody.copy(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeaturesConfigRequestBody)) {
            return false;
        }
        FeaturesConfigRequestBody featuresConfigRequestBody = (FeaturesConfigRequestBody) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.features, featuresConfigRequestBody.features}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.holdouts, featuresConfigRequestBody.holdouts}, getCieXyz.write())).booleanValue();
    }

    @onItemDismisslambda0
    public /* synthetic */ FeaturesConfigRequestBody(int i, List list, List list2, onCloseClicked oncloseclicked) {
        if (3 == (i & 3)) {
            this.features = list;
            this.holdouts = list2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, FeaturesConfigRequestBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public FeaturesConfigRequestBody(List<FeatureRequest> list, List<FeatureRequest> list2) {
        list.getClass();
        list2.getClass();
        this.features = list;
        this.holdouts = list2;
    }
}
