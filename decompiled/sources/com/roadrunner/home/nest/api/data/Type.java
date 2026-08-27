package com.roadrunner.home.nest.api.data;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.RoomDatabaseExternalSyntheticLambda4;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.setGraphicModalMaxWidthDp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class Type {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ Type[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    private final String value;
    public static final Type TIER = new Type("TIER", 0, "tier");
    public static final Type POINTS = new Type("POINTS", 1, "points");
    public static final Type SAFETY = new Type("SAFETY", 2, "safety");
    public static final Type ACCEPTANCE_RATE = new Type("ACCEPTANCE_RATE", 3, "acceptance_rate");
    public static final Type BATCH = new Type("BATCH", 4, "batch");
    public static final Type UNKNOWN = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5, SystemUtils.UNKNOWN);

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i4 = i3 + 43;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onviewdetachedfromwindowlambda1;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 67;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 67;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 109;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private Type(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$gyRHiRkcTIiLns7ZzS_UuDrCU24() {
        int i = 2 % 2;
        int i2 = read + 35;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = IconCompatParcelizer + 51;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.roadrunner.home.nest.api.data.Type$Companion] */
    static {
        Type[] typeArr$values = $values();
        $VALUES = typeArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) typeArr$values);
        Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.Type.Companion
            private static int RemoteActionCompatParcelizer = 0;
            private static int serializer = 1;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = RemoteActionCompatParcelizer + 101;
                serializer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return (setGraphicModalMaxWidthDp) Type.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
                }
                int i3 = 10 / 0;
                return (setGraphicModalMaxWidthDp) Type.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            }
        };
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(19));
        int i = write + 47;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 90 / 0;
        }
    }

    public static Type valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Type type = (Type) Enum.valueOf(Type.class, str);
        int i4 = IconCompatParcelizer + 55;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return type;
    }

    public static Type[] values() {
        int i = 2 % 2;
        int i2 = read + 81;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Type[] typeArr = (Type[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 97;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return typeArr;
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        Type[] typeArrValues = values();
        typeArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.home.nest.api.data.Type", (Enum[]) typeArrValues);
        int i2 = IconCompatParcelizer + 123;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return enumSerializer;
        }
        throw null;
    }

    private static final /* synthetic */ Type[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 63;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        Type[] typeArr = {TIER, POINTS, SAFETY, ACCEPTANCE_RATE, BATCH, UNKNOWN};
        int i5 = i3 + 99;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return typeArr;
    }
}
