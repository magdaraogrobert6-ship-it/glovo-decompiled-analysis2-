package com.deliveryhero.fwf_client.model;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultInAppMessageSlideupViewFactory;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.getCieXyz;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.onMove;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class ProtoStructValue {
    private final Map<String, ProtoValue> value;
    public static final Companion Companion = new Companion(null);
    private static final setGraphicModalMaxWidthDp[] $childSerializers = {new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read(ProtoValue$$serializer.INSTANCE))};

    public final Map<String, ProtoValue> component1() {
        return this.value;
    }

    public final Map<String, ProtoValue> getValue() {
        return this.value;
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(ProtoStructValue protoStructValue, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = $childSerializers;
        if (!defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) && protoStructValue.value == null) {
            return;
        }
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, setgraphicmodalmaxwidthdpArr[0], protoStructValue.value);
    }

    public final ProtoStructValue copy(Map<String, ProtoValue> map) {
        return new ProtoStructValue(map);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return ProtoStructValue$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtoStructValue copy$default(ProtoStructValue protoStructValue, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = protoStructValue.value;
        }
        return protoStructValue.copy(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoStructValue)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, ((ProtoStructValue) obj).value}, getCieXyz.write())).booleanValue();
    }

    public int hashCode() {
        Map<String, ProtoValue> map = this.value;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return "ProtoStructValue(value=" + this.value + ")";
    }

    public final Map<String, Object> toMap() {
        Map<String, ProtoValue> map = this.value;
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ProtoValue protoValue = (ProtoValue) entry.getValue();
            linkedHashMap.put(key, protoValue != null ? protoValue.getAsAny() : null);
        }
        return linkedHashMap;
    }

    @onItemDismisslambda0
    public /* synthetic */ ProtoStructValue(int i, Map map, onCloseClicked oncloseclicked) {
        if ((i & 1) == 0) {
            this.value = null;
        } else {
            this.value = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoStructValue() {
        this((Map) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public ProtoStructValue(Map<String, ProtoValue> map) {
        this.value = map;
    }

    public /* synthetic */ ProtoStructValue(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }
}
