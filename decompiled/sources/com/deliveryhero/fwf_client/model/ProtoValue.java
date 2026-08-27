package com.deliveryhero.fwf_client.model;

import coil3.util.UtilsKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultInAppMessageSlideupViewFactory;
import o.SimpleItemTouchHelperCallback;
import o.afterClosed;
import o.beforeInAppMessageViewClosed;
import o.getCieXyz;
import o.getWasCloseMessageCalled;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class ProtoValue {
    public static final Companion Companion = new Companion(null);
    private final Boolean boolValue;
    private final ProtoListValue listValue;
    private final Integer nullValue;
    private final Double numberValue;
    private final String stringValue;
    private final ProtoStructValue structValue;

    public enum PropertyKey {
        NULL_KEY,
        NUMBER_KEY,
        STRING_KEY,
        BOOL_KEY,
        STRUCT_KEY,
        LIST_KEY;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    public final Integer component1() {
        return this.nullValue;
    }

    public final Double component2() {
        return this.numberValue;
    }

    public final String component3() {
        return this.stringValue;
    }

    public final Boolean component4() {
        return this.boolValue;
    }

    public final ProtoStructValue component5() {
        return this.structValue;
    }

    public final ProtoListValue component6() {
        return this.listValue;
    }

    public final Boolean getBoolValue() {
        return this.boolValue;
    }

    public final Integer getNullValue() {
        return this.nullValue;
    }

    public final String getStringValue() {
        return this.stringValue;
    }

    private final Map<PropertyKey, Object> asMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PropertyKey.NULL_KEY, this.nullValue);
        linkedHashMap.put(PropertyKey.NUMBER_KEY, this.numberValue);
        linkedHashMap.put(PropertyKey.STRING_KEY, this.stringValue);
        linkedHashMap.put(PropertyKey.BOOL_KEY, this.boolValue);
        linkedHashMap.put(PropertyKey.STRUCT_KEY, this.structValue);
        linkedHashMap.put(PropertyKey.LIST_KEY, this.listValue);
        return linkedHashMap;
    }

    public final ProtoValue copy(Integer num, Double d, String str, Boolean bool, ProtoStructValue protoStructValue, ProtoListValue protoListValue) {
        return new ProtoValue(num, d, str, bool, protoStructValue, protoListValue);
    }

    public String toString() {
        return "ProtoValue(nullValue=" + this.nullValue + ", numberValue=" + this.numberValue + ", stringValue=" + this.stringValue + ", boolValue=" + this.boolValue + ", structValue=" + this.structValue + ", listValue=" + this.listValue + ")";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return ProtoValue$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PropertyKey.values().length];
            try {
                iArr[PropertyKey.NULL_KEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PropertyKey.NUMBER_KEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PropertyKey.STRING_KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PropertyKey.BOOL_KEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PropertyKey.STRUCT_KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PropertyKey.LIST_KEY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ ProtoValue copy$default(ProtoValue protoValue, Integer num, Double d, String str, Boolean bool, ProtoStructValue protoStructValue, ProtoListValue protoListValue, int i, Object obj) {
        if ((i & 1) != 0) {
            num = protoValue.nullValue;
        }
        if ((i & 2) != 0) {
            d = protoValue.numberValue;
        }
        Double d2 = d;
        if ((i & 4) != 0) {
            str = protoValue.stringValue;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            bool = protoValue.boolValue;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            protoStructValue = protoValue.structValue;
        }
        ProtoStructValue protoStructValue2 = protoStructValue;
        if ((i & 32) != 0) {
            protoListValue = protoValue.listValue;
        }
        return protoValue.copy(num, d2, str2, bool2, protoStructValue2, protoListValue);
    }

    private final List<Object> getListValue() {
        ProtoListValue protoListValue = this.listValue;
        if (protoListValue != null) {
            return protoListValue.toList();
        }
        return null;
    }

    private final Number getNumberValue() {
        Double d = this.numberValue;
        if (d == null) {
            return d;
        }
        double dDoubleValue = d.doubleValue();
        int i = (int) dDoubleValue;
        return ((double) i) == dDoubleValue ? Integer.valueOf(i) : Double.valueOf(dDoubleValue);
    }

    private final Map<String, Object> getStructValue() {
        Map<String, Object> map;
        ProtoStructValue protoStructValue = this.structValue;
        return (protoStructValue == null || (map = protoStructValue.toMap()) == null) ? SimpleItemTouchHelperCallback.serializer : map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoValue)) {
            return false;
        }
        ProtoValue protoValue = (ProtoValue) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.nullValue, protoValue.nullValue}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.numberValue, protoValue.numberValue}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stringValue, protoValue.stringValue}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.boolValue, protoValue.boolValue}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.structValue, protoValue.structValue}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.listValue, protoValue.listValue}, getCieXyz.write())).booleanValue();
    }

    public final Object getAsAny() {
        for (Map.Entry<PropertyKey, Object> entry : asMap().entrySet()) {
            PropertyKey key = entry.getKey();
            Object value = entry.getValue();
            switch (WhenMappings.$EnumSwitchMapping$0[key.ordinal()]) {
                case 1:
                    if (value != null) {
                        return null;
                    }
                    break;
                    break;
                case 2:
                    if (value != null) {
                        return getNumberValue();
                    }
                    break;
                    break;
                case 3:
                    if (value != null) {
                        return value;
                    }
                    break;
                    break;
                case 4:
                    if (value != null) {
                        return value;
                    }
                    break;
                    break;
                case 5:
                    if (value != null) {
                        return getStructValue();
                    }
                    break;
                    break;
                case 6:
                    if (value != null) {
                        return getListValue();
                    }
                    break;
                    break;
            }
        }
        return null;
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(ProtoValue protoValue, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoValue.nullValue != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, afterClosed.IconCompatParcelizer, protoValue.nullValue);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoValue.numberValue != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, protoValue.numberValue);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoValue.stringValue != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, protoValue.stringValue);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoValue.boolValue != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getWasCloseMessageCalled.write, protoValue.boolValue);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || protoValue.structValue != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, ProtoStructValue$$serializer.INSTANCE, protoValue.structValue);
        }
        if (!defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) && protoValue.listValue == null) {
            return;
        }
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, ProtoListValue$$serializer.INSTANCE, protoValue.listValue);
    }

    public int hashCode() {
        Integer num = this.nullValue;
        int iHashCode = num == null ? 0 : num.hashCode();
        Double d = this.numberValue;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        String str = this.stringValue;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Boolean bool = this.boolValue;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        ProtoStructValue protoStructValue = this.structValue;
        int iHashCode5 = protoStructValue == null ? 0 : protoStructValue.hashCode();
        ProtoListValue protoListValue = this.listValue;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (protoListValue != null ? protoListValue.hashCode() : 0);
    }

    @onItemDismisslambda0
    public /* synthetic */ ProtoValue(int i, Integer num, Double d, String str, Boolean bool, ProtoStructValue protoStructValue, ProtoListValue protoListValue, onCloseClicked oncloseclicked) {
        if ((i & 1) == 0) {
            this.nullValue = null;
        } else {
            this.nullValue = num;
        }
        if ((i & 2) == 0) {
            this.numberValue = null;
        } else {
            this.numberValue = d;
        }
        if ((i & 4) == 0) {
            this.stringValue = null;
        } else {
            this.stringValue = str;
        }
        if ((i & 8) == 0) {
            this.boolValue = null;
        } else {
            this.boolValue = bool;
        }
        if ((i & 16) == 0) {
            this.structValue = null;
        } else {
            this.structValue = protoStructValue;
        }
        if ((i & 32) == 0) {
            this.listValue = null;
        } else {
            this.listValue = protoListValue;
        }
    }

    /* JADX INFO: renamed from: getListValue, reason: collision with other method in class */
    public final ProtoListValue m4466getListValue() {
        return this.listValue;
    }

    /* JADX INFO: renamed from: getStructValue, reason: collision with other method in class */
    public final ProtoStructValue m4468getStructValue() {
        return this.structValue;
    }

    /* JADX INFO: renamed from: getNumberValue, reason: collision with other method in class */
    public final Double m4467getNumberValue() {
        return this.numberValue;
    }

    public ProtoValue() {
        this((Integer) null, (Double) null, (String) null, (Boolean) null, (ProtoStructValue) null, (ProtoListValue) null, 63, (DefaultConstructorMarker) null);
    }

    public ProtoValue(Integer num, Double d, String str, Boolean bool, ProtoStructValue protoStructValue, ProtoListValue protoListValue) {
        this.nullValue = num;
        this.numberValue = d;
        this.stringValue = str;
        this.boolValue = bool;
        this.structValue = protoStructValue;
        this.listValue = protoListValue;
    }

    public /* synthetic */ ProtoValue(Integer num, Double d, String str, Boolean bool, ProtoStructValue protoStructValue, ProtoListValue protoListValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : protoStructValue, (i & 32) != 0 ? null : protoListValue);
    }
}
