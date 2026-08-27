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
public final class TierType {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ TierType[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    private final String value;
    public static final TierType BRONZE = new TierType("BRONZE", 0, "bronze");
    public static final TierType SILVER = new TierType("SILVER", 1, "silver");
    public static final TierType GOLD = new TierType("GOLD", 2, "gold");
    public static final TierType DIAMOND = new TierType("DIAMOND", 3, "diamond");
    public static final TierType UNKNOWN = new TierType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4, SystemUtils.UNKNOWN);

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 17;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i5 = i2 + 33;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return onviewdetachedfromwindowlambda1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 45;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 9 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i2 + 33;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 105;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private TierType(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$dG6hF9qiF45IVs1KKRAtIx6dErY() {
        int i = 2 % 2;
        int i2 = write + 53;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            _init_$_anonymous_();
            throw null;
        }
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i3 = write + 7;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.roadrunner.home.nest.api.data.TierType$Companion] */
    static {
        TierType[] tierTypeArr$values = $values();
        $VALUES = tierTypeArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) tierTypeArr$values);
        Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.TierType.Companion
            private static int IconCompatParcelizer = 0;
            private static int RemoteActionCompatParcelizer = 1;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer + 81;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return (setGraphicModalMaxWidthDp) TierType.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
                }
                throw null;
            }
        };
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(16));
        int i = serializer + 17;
        read = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static TierType valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (TierType) Enum.valueOf(TierType.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TierType[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 43;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (TierType[]) $VALUES.clone();
        }
        int i3 = 56 / 0;
        return (TierType[]) $VALUES.clone();
    }

    private static final /* synthetic */ TierType[] $values() {
        int i = 2 % 2;
        int i2 = write + 1;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        TierType[] tierTypeArr = {BRONZE, SILVER, GOLD, DIAMOND, UNKNOWN};
        int i5 = i3 + 3;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return tierTypeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        TierType[] tierTypeArrValues = values();
        tierTypeArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.home.nest.api.data.TierType", (Enum[]) tierTypeArrValues);
        int i2 = write + 117;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return enumSerializer;
    }
}
