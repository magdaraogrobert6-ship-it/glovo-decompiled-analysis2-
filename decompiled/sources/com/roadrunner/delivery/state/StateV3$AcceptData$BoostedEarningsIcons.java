package com.roadrunner.delivery.state;

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

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class StateV3$AcceptData$BoostedEarningsIcons {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ StateV3$AcceptData$BoostedEarningsIcons[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;

    @getAppropriateFullView(serializer = "tip")
    public static final StateV3$AcceptData$BoostedEarningsIcons TIP = new StateV3$AcceptData$BoostedEarningsIcons("TIP", 0);

    @getAppropriateFullView(serializer = "boost")
    public static final StateV3$AcceptData$BoostedEarningsIcons BOOST = new StateV3$AcceptData$BoostedEarningsIcons("BOOST", 1);

    @getAppropriateFullView(serializer = "big_order")
    public static final StateV3$AcceptData$BoostedEarningsIcons BIG_ORDER = new StateV3$AcceptData$BoostedEarningsIcons("BIG_ORDER", 2);

    @getAppropriateFullView(serializer = "bad_weather")
    public static final StateV3$AcceptData$BoostedEarningsIcons BAD_WEATHER = new StateV3$AcceptData$BoostedEarningsIcons("BAD_WEATHER", 3);

    private StateV3$AcceptData$BoostedEarningsIcons(String str, int i) {
        super(str, i);
    }

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i5 = i3 + 59;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 6 / 0;
        }
        return onviewdetachedfromwindowlambda1;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 93;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 73;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    /* JADX INFO: renamed from: $r8$lambda$5z43-BCmF4lVdJIhYXqd5QW5Zq0, reason: not valid java name */
    public static /* synthetic */ setGraphicModalMaxWidthDp m4948$r8$lambda$5z43BCmF4lVdJIhYXqd5QW5Zq0() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return _init_$_anonymous_();
        }
        int i3 = 79 / 0;
        return _init_$_anonymous_();
    }

    static {
        StateV3$AcceptData$BoostedEarningsIcons[] stateV3$AcceptData$BoostedEarningsIconsArr$values = $values();
        $VALUES = stateV3$AcceptData$BoostedEarningsIconsArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) stateV3$AcceptData$BoostedEarningsIconsArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new MapComponent$$ExternalSyntheticLambda0(26));
        int i = serializer + 89;
        write = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static StateV3$AcceptData$BoostedEarningsIcons valueOf(String str) {
        StateV3$AcceptData$BoostedEarningsIcons stateV3$AcceptData$BoostedEarningsIcons;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            stateV3$AcceptData$BoostedEarningsIcons = (StateV3$AcceptData$BoostedEarningsIcons) Enum.valueOf(StateV3$AcceptData$BoostedEarningsIcons.class, str);
            int i3 = 23 / 0;
        } else {
            stateV3$AcceptData$BoostedEarningsIcons = (StateV3$AcceptData$BoostedEarningsIcons) Enum.valueOf(StateV3$AcceptData$BoostedEarningsIcons.class, str);
        }
        int i4 = RemoteActionCompatParcelizer + 109;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return stateV3$AcceptData$BoostedEarningsIcons;
    }

    public static StateV3$AcceptData$BoostedEarningsIcons[] values() {
        StateV3$AcceptData$BoostedEarningsIcons[] stateV3$AcceptData$BoostedEarningsIconsArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            stateV3$AcceptData$BoostedEarningsIconsArr = (StateV3$AcceptData$BoostedEarningsIcons[]) $VALUES.clone();
            int i3 = 84 / 0;
        } else {
            stateV3$AcceptData$BoostedEarningsIconsArr = (StateV3$AcceptData$BoostedEarningsIcons[]) $VALUES.clone();
        }
        int i4 = RemoteActionCompatParcelizer + 123;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return stateV3$AcceptData$BoostedEarningsIconsArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 25;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) StateV3$AcceptData$BoostedEarningsIcons.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            int i4 = write + 87;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    }

    private static final /* synthetic */ StateV3$AcceptData$BoostedEarningsIcons[] $values() {
        StateV3$AcceptData$BoostedEarningsIcons[] stateV3$AcceptData$BoostedEarningsIconsArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 85;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            StateV3$AcceptData$BoostedEarningsIcons stateV3$AcceptData$BoostedEarningsIcons = TIP;
            StateV3$AcceptData$BoostedEarningsIcons stateV3$AcceptData$BoostedEarningsIcons2 = BOOST;
            StateV3$AcceptData$BoostedEarningsIcons stateV3$AcceptData$BoostedEarningsIcons3 = BIG_ORDER;
            StateV3$AcceptData$BoostedEarningsIcons stateV3$AcceptData$BoostedEarningsIcons4 = BAD_WEATHER;
            stateV3$AcceptData$BoostedEarningsIconsArr = new StateV3$AcceptData$BoostedEarningsIcons[4];
            stateV3$AcceptData$BoostedEarningsIconsArr[0] = stateV3$AcceptData$BoostedEarningsIcons;
            stateV3$AcceptData$BoostedEarningsIconsArr[0] = stateV3$AcceptData$BoostedEarningsIcons2;
            stateV3$AcceptData$BoostedEarningsIconsArr[3] = stateV3$AcceptData$BoostedEarningsIcons3;
            stateV3$AcceptData$BoostedEarningsIconsArr[3] = stateV3$AcceptData$BoostedEarningsIcons4;
        } else {
            stateV3$AcceptData$BoostedEarningsIconsArr = new StateV3$AcceptData$BoostedEarningsIcons[]{TIP, BOOST, BIG_ORDER, BAD_WEATHER};
        }
        int i4 = i3 + 25;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return stateV3$AcceptData$BoostedEarningsIconsArr;
    }

    private static final /* synthetic */ setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 69;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = null;
        EnumSerializer enumSerializerSerializer = r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.serializer("com.roadrunner.delivery.state.StateV3.AcceptData.BoostedEarningsIcons", values(), new String[]{"tip", "boost", "big_order", "bad_weather"}, new Annotation[][]{null, null, null, null});
        int i4 = RemoteActionCompatParcelizer + 107;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return enumSerializerSerializer;
        }
        obj.hashCode();
        throw null;
    }
}
