package com.deliveryhero.fwf_client.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultInAppMessageSlideupViewFactory;
import o.MediaSessionCompatQueueItem;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class ProtoListValue {
    private final List<ProtoValue> value;
    public static final Companion Companion = new Companion(null);
    private static final setGraphicModalMaxWidthDp[] $childSerializers = {new setWasCloseMessageCalled(LazyKt__LazyJVMKt.read(ProtoValue$$serializer.INSTANCE), 0)};

    public final List<ProtoValue> component1() {
        return this.value;
    }

    public final List<ProtoValue> getValue() {
        return this.value;
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(ProtoListValue protoListValue, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = $childSerializers;
        if (!defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) && protoListValue.value == null) {
            return;
        }
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, setgraphicmodalmaxwidthdpArr[0], protoListValue.value);
    }

    public final ProtoListValue copy(List<ProtoValue> list) {
        return new ProtoListValue(list);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return ProtoListValue$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtoListValue copy$default(ProtoListValue protoListValue, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = protoListValue.value;
        }
        return protoListValue.copy(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoListValue)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, ((ProtoListValue) obj).value}, getCieXyz.write())).booleanValue();
    }

    public final List<Object> toList() {
        List<ProtoValue> list = this.value;
        if (list == null) {
            return null;
        }
        List<ProtoValue> list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        for (ProtoValue protoValue : list2) {
            arrayList.add(protoValue != null ? protoValue.getAsAny() : null);
        }
        return arrayList;
    }

    public int hashCode() {
        List<ProtoValue> list = this.value;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return MediaSessionCompatQueueItem.read("ProtoListValue(value=", ")", this.value);
    }

    @onItemDismisslambda0
    public /* synthetic */ ProtoListValue(int i, List list, onCloseClicked oncloseclicked) {
        if ((i & 1) == 0) {
            this.value = null;
        } else {
            this.value = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoListValue() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public ProtoListValue(List<ProtoValue> list) {
        this.value = list;
    }

    public /* synthetic */ ProtoListValue(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
