package com.roadrunner.opportunities.calendar.data;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import java.lang.annotation.Annotation;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.getAppropriateFullView;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.setGraphicModalMaxWidthDp;
import o.wa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class BonusLevel {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ BonusLevel[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;

    @getAppropriateFullView(serializer = "NONE")
    public static final BonusLevel NONE = new BonusLevel("NONE", 0);

    @getAppropriateFullView(serializer = "VERY_LOW")
    public static final BonusLevel VERY_LOW = new BonusLevel("VERY_LOW", 1);

    @getAppropriateFullView(serializer = "LOW")
    public static final BonusLevel LOW = new BonusLevel("LOW", 2);

    @getAppropriateFullView(serializer = "MID")
    public static final BonusLevel MID = new BonusLevel("MID", 3);

    @getAppropriateFullView(serializer = "HIGH")
    public static final BonusLevel HIGH = new BonusLevel("HIGH", 4);

    @getAppropriateFullView(serializer = "VERY_HIGH")
    public static final BonusLevel VERY_HIGH = new BonusLevel("VERY_HIGH", 5);

    private BonusLevel(String str, int i) {
        super(str, i);
    }

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 21;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
            int i4 = 40 / 0;
        } else {
            onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        }
        int i5 = i2 + 47;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return onviewdetachedfromwindowlambda1;
        }
        throw null;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 19;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$zjm4AtjGAHHWTVNdIqkvBjQDWKo() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = serializer + 31;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    static {
        BonusLevel[] bonusLevelArr$values = $values();
        $VALUES = bonusLevelArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) bonusLevelArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new wa(9));
        int i = IconCompatParcelizer + 101;
        write = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 62 / 0;
        }
    }

    public static BonusLevel valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 53;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        BonusLevel bonusLevel = (BonusLevel) Enum.valueOf(BonusLevel.class, str);
        int i4 = RemoteActionCompatParcelizer + 83;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return bonusLevel;
    }

    public static BonusLevel[] values() {
        BonusLevel[] bonusLevelArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            bonusLevelArr = (BonusLevel[]) $VALUES.clone();
            int i3 = 20 / 0;
        } else {
            bonusLevelArr = (BonusLevel[]) $VALUES.clone();
        }
        int i4 = RemoteActionCompatParcelizer + 15;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return bonusLevelArr;
        }
        throw null;
    }

    public static final class Companion {
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 55;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) BonusLevel.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            int i4 = IconCompatParcelizer + 99;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    }

    private static final /* synthetic */ BonusLevel[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        BonusLevel[] bonusLevelArr = {NONE, VERY_LOW, LOW, MID, HIGH, VERY_HIGH};
        int i5 = i3 + 69;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return bonusLevelArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = serializer + 17;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        EnumSerializer enumSerializerSerializer = r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.serializer("com.roadrunner.opportunities.calendar.data.BonusLevel", values(), new String[]{"NONE", "VERY_LOW", "LOW", "MID", "HIGH", "VERY_HIGH"}, new Annotation[][]{null, null, null, null, null, null});
        int i4 = serializer + 85;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return enumSerializerSerializer;
    }
}
