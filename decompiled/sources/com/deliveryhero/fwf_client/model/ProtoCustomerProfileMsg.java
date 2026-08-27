package com.deliveryhero.fwf_client.model;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultInAppMessageSlideupViewFactory;
import o.SimpleItemTouchHelperCallback;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.getCieXyz;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ProtoCustomerProfileMsg {
    private final Map<String, ProtoValue> profileAttributes;
    public static final Companion Companion = new Companion(null);
    private static final setGraphicModalMaxWidthDp[] $childSerializers = {new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, ProtoValue$$serializer.INSTANCE)};

    public final Map<String, ProtoValue> component1() {
        return this.profileAttributes;
    }

    public final Map<String, ProtoValue> getProfileAttributes() {
        return this.profileAttributes;
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(ProtoCustomerProfileMsg protoCustomerProfileMsg, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = $childSerializers;
        if (!defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            Object[] objArr = {protoCustomerProfileMsg.profileAttributes, SimpleItemTouchHelperCallback.serializer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return;
            }
        }
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, setgraphicmodalmaxwidthdpArr[0], protoCustomerProfileMsg.profileAttributes);
    }

    public int hashCode() {
        return this.profileAttributes.hashCode();
    }

    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ProtoValue> entry : this.profileAttributes.entrySet()) {
            String key = entry.getKey();
            Object asAny = entry.getValue().getAsAny();
            if (asAny != null) {
                linkedHashMap.put(key, asAny);
            }
        }
        return linkedHashMap;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return ProtoCustomerProfileMsg$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtoCustomerProfileMsg copy$default(ProtoCustomerProfileMsg protoCustomerProfileMsg, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = protoCustomerProfileMsg.profileAttributes;
        }
        return protoCustomerProfileMsg.copy(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoCustomerProfileMsg)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.profileAttributes, ((ProtoCustomerProfileMsg) obj).profileAttributes}, getCieXyz.write())).booleanValue();
    }

    public final ProtoCustomerProfileMsg copy(Map<String, ProtoValue> map) {
        map.getClass();
        return new ProtoCustomerProfileMsg(map);
    }

    public String toString() {
        return "ProtoCustomerProfileMsg(profileAttributes=" + this.profileAttributes + ")";
    }

    @onItemDismisslambda0
    public /* synthetic */ ProtoCustomerProfileMsg(int i, Map map, onCloseClicked oncloseclicked) {
        if ((i & 1) == 0) {
            this.profileAttributes = SimpleItemTouchHelperCallback.serializer;
        } else {
            this.profileAttributes = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoCustomerProfileMsg() {
        this((Map) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public ProtoCustomerProfileMsg(Map<String, ProtoValue> map) {
        map.getClass();
        this.profileAttributes = map;
    }

    public /* synthetic */ ProtoCustomerProfileMsg(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SimpleItemTouchHelperCallback.serializer : map);
    }
}
