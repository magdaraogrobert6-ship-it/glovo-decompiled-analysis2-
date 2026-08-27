package com.deliveryhero.fwf_client.model;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultInAppMessageSlideupViewFactory;
import o.ItemTouchHelperAdapter;
import o.SimpleItemTouchHelperCallback;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.getCieXyz;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class ProtoFeaturesMsg {
    private static final setGraphicModalMaxWidthDp[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final String account;
    private final String environment;
    private final Map<String, ProtoFeatureOrErrorMsg> features;
    private final Map<String, ProtoHoldoutMsg> holdouts;
    private final Set<String> profileAttributes;
    private final String project;

    public final Map<String, ProtoFeatureOrErrorMsg> component1() {
        return this.features;
    }

    public final Map<String, ProtoHoldoutMsg> component2() {
        return this.holdouts;
    }

    public final Set<String> component3() {
        return this.profileAttributes;
    }

    public final String component4() {
        return this.account;
    }

    public final String component5() {
        return this.project;
    }

    public final String component6() {
        return this.environment;
    }

    public final String getAccount() {
        return this.account;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final Map<String, ProtoFeatureOrErrorMsg> getFeatures() {
        return this.features;
    }

    public final Map<String, ProtoHoldoutMsg> getHoldouts() {
        return this.holdouts;
    }

    public final Set<String> getProfileAttributes() {
        return this.profileAttributes;
    }

    public final String getProject() {
        return this.project;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006d  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:31:0x011a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    public static final /* synthetic */ void write$Self$fwf_client_release(ProtoFeaturesMsg protoFeaturesMsg, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = $childSerializers;
        boolean z = defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
        if (z) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, setgraphicmodalmaxwidthdpArr[0], protoFeaturesMsg.features);
        } else {
            Object[] objArr = {protoFeaturesMsg.features, simpleItemTouchHelperCallback};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, setgraphicmodalmaxwidthdpArr[0], protoFeaturesMsg.features);
            }
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, setgraphicmodalmaxwidthdpArr[1], protoFeaturesMsg.holdouts);
        } else {
            Object[] objArr2 = {protoFeaturesMsg.holdouts, simpleItemTouchHelperCallback};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, setgraphicmodalmaxwidthdpArr[1], protoFeaturesMsg.holdouts);
            }
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setgraphicmodalmaxwidthdpArr[2], protoFeaturesMsg.profileAttributes);
        } else {
            Object[] objArr3 = {protoFeaturesMsg.profileAttributes, ItemTouchHelperAdapter.serializer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setgraphicmodalmaxwidthdpArr[2], protoFeaturesMsg.profileAttributes);
            }
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, protoFeaturesMsg.account);
        } else {
            Object[] objArr4 = {protoFeaturesMsg.account, ""};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, protoFeaturesMsg.account);
            }
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, protoFeaturesMsg.project);
        } else {
            Object[] objArr5 = {protoFeaturesMsg.project, ""};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, protoFeaturesMsg.project);
            }
        }
        if (!defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            Object[] objArr6 = {protoFeaturesMsg.environment, ""};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
                return;
            }
        }
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, protoFeaturesMsg.environment);
    }

    public String toString() {
        Map<String, ProtoFeatureOrErrorMsg> map = this.features;
        Map<String, ProtoHoldoutMsg> map2 = this.holdouts;
        Set<String> set = this.profileAttributes;
        String str = this.account;
        String str2 = this.project;
        String str3 = this.environment;
        StringBuilder sb = new StringBuilder("ProtoFeaturesMsg(features=");
        sb.append(map);
        sb.append(", holdouts=");
        sb.append(map2);
        sb.append(", profileAttributes=");
        sb.append(set);
        sb.append(", account=");
        sb.append(str);
        sb.append(", project=");
        return ff$$ExternalSyntheticOutline0.m(sb, str2, ", environment=", str3, ")");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return ProtoFeaturesMsg$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        $childSerializers = new setGraphicModalMaxWidthDp[]{new beforeOpened(beforeinappmessageviewclosed, ProtoFeatureOrErrorMsg$$serializer.INSTANCE), new beforeOpened(beforeinappmessageviewclosed, ProtoHoldoutMsg$$serializer.INSTANCE), new setWasCloseMessageCalled(beforeinappmessageviewclosed, 1), null, null, null};
    }

    public final ProtoFeaturesMsg copy(Map<String, ProtoFeatureOrErrorMsg> map, Map<String, ProtoHoldoutMsg> map2, Set<String> set, String str, String str2, String str3) {
        set.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new ProtoFeaturesMsg(map, map2, set, str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtoFeaturesMsg copy$default(ProtoFeaturesMsg protoFeaturesMsg, Map map, Map map2, Set set, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            map = protoFeaturesMsg.features;
        }
        if ((i & 2) != 0) {
            map2 = protoFeaturesMsg.holdouts;
        }
        Map map3 = map2;
        if ((i & 4) != 0) {
            set = protoFeaturesMsg.profileAttributes;
        }
        Set set2 = set;
        if ((i & 8) != 0) {
            str = protoFeaturesMsg.account;
        }
        String str4 = str;
        if ((i & 16) != 0) {
            str2 = protoFeaturesMsg.project;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = protoFeaturesMsg.environment;
        }
        return protoFeaturesMsg.copy(map, map3, set2, str4, str5, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoFeaturesMsg)) {
            return false;
        }
        ProtoFeaturesMsg protoFeaturesMsg = (ProtoFeaturesMsg) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.features, protoFeaturesMsg.features}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.holdouts, protoFeaturesMsg.holdouts}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.profileAttributes, protoFeaturesMsg.profileAttributes}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.account, protoFeaturesMsg.account}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.project, protoFeaturesMsg.project}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.environment, protoFeaturesMsg.environment}, getCieXyz.write())).booleanValue();
    }

    @onItemDismisslambda0
    public /* synthetic */ ProtoFeaturesMsg(int i, Map map, Map map2, Set set, String str, String str2, String str3, onCloseClicked oncloseclicked) {
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
        if ((i & 1) == 0) {
            this.features = simpleItemTouchHelperCallback;
        } else {
            this.features = map;
        }
        if ((i & 2) == 0) {
            this.holdouts = simpleItemTouchHelperCallback;
        } else {
            this.holdouts = map2;
        }
        if ((i & 4) == 0) {
            this.profileAttributes = ItemTouchHelperAdapter.serializer;
        } else {
            this.profileAttributes = set;
        }
        if ((i & 8) == 0) {
            this.account = "";
        } else {
            this.account = str;
        }
        if ((i & 16) == 0) {
            this.project = "";
        } else {
            this.project = str2;
        }
        if ((i & 32) == 0) {
            this.environment = "";
        } else {
            this.environment = str3;
        }
    }

    public int hashCode() {
        Map<String, ProtoFeatureOrErrorMsg> map = this.features;
        int iHashCode = map == null ? 0 : map.hashCode();
        Map<String, ProtoHoldoutMsg> map2 = this.holdouts;
        return this.environment.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((this.profileAttributes.hashCode() + (((iHashCode * 31) + (map2 != null ? map2.hashCode() : 0)) * 31)) * 31, 31, this.account), 31, this.project);
    }

    public ProtoFeaturesMsg() {
        this((Map) null, (Map) null, (Set) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public ProtoFeaturesMsg(Map<String, ProtoFeatureOrErrorMsg> map, Map<String, ProtoHoldoutMsg> map2, Set<String> set, String str, String str2, String str3) {
        set.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.features = map;
        this.holdouts = map2;
        this.profileAttributes = set;
        this.account = str;
        this.project = str2;
        this.environment = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProtoFeaturesMsg(Map map, Map map2, Set set, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Map map3 = SimpleItemTouchHelperCallback.serializer;
        this((i & 1) != 0 ? map3 : map, (i & 2) == 0 ? map2 : map3, (i & 4) != 0 ? ItemTouchHelperAdapter.serializer : set, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3);
    }
}
