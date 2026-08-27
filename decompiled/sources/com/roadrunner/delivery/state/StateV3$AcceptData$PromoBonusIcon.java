package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import java.lang.annotation.Annotation;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.ComposableSingletonsAndroidDialog_androidKt;
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
public final class StateV3$AcceptData$PromoBonusIcon {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ StateV3$AcceptData$PromoBonusIcon[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    @getAppropriateFullView(serializer = "holiday")
    public static final StateV3$AcceptData$PromoBonusIcon HOLIDAY = new StateV3$AcceptData$PromoBonusIcon("HOLIDAY", 0);

    @getAppropriateFullView(serializer = "night")
    public static final StateV3$AcceptData$PromoBonusIcon NIGHT = new StateV3$AcceptData$PromoBonusIcon("NIGHT", 1);

    @getAppropriateFullView(serializer = "rain")
    public static final StateV3$AcceptData$PromoBonusIcon RAIN = new StateV3$AcceptData$PromoBonusIcon("RAIN", 2);

    @getAppropriateFullView(serializer = "rush_hour")
    public static final StateV3$AcceptData$PromoBonusIcon RUSH_HOUR = new StateV3$AcceptData$PromoBonusIcon("RUSH_HOUR", 3);

    @getAppropriateFullView(serializer = "snow")
    public static final StateV3$AcceptData$PromoBonusIcon SNOW = new StateV3$AcceptData$PromoBonusIcon("SNOW", 4);

    private StateV3$AcceptData$PromoBonusIcon(String str, int i) {
        super(str, i);
    }

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 5;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i5 = i2 + 111;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return onviewdetachedfromwindowlambda1;
        }
        throw null;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 121;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 71;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$kAETiubEe9sABHzZsoYeIqsxRZY() {
        int i = 2 % 2;
        int i2 = write + 121;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            _init_$_anonymous_();
            throw null;
        }
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i3 = write + 55;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    static {
        StateV3$AcceptData$PromoBonusIcon[] stateV3$AcceptData$PromoBonusIconArr$values = $values();
        $VALUES = stateV3$AcceptData$PromoBonusIconArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) stateV3$AcceptData$PromoBonusIconArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(20));
        int i = IconCompatParcelizer + 43;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static StateV3$AcceptData$PromoBonusIcon valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 47;
        read = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        StateV3$AcceptData$PromoBonusIcon stateV3$AcceptData$PromoBonusIcon = (StateV3$AcceptData$PromoBonusIcon) Enum.valueOf(StateV3$AcceptData$PromoBonusIcon.class, str);
        int i3 = read + 71;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return stateV3$AcceptData$PromoBonusIcon;
        }
        obj.hashCode();
        throw null;
    }

    public static StateV3$AcceptData$PromoBonusIcon[] values() {
        StateV3$AcceptData$PromoBonusIcon[] stateV3$AcceptData$PromoBonusIconArr;
        int i = 2 % 2;
        int i2 = read + 59;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            stateV3$AcceptData$PromoBonusIconArr = (StateV3$AcceptData$PromoBonusIcon[]) $VALUES.clone();
            int i3 = 79 / 0;
        } else {
            stateV3$AcceptData$PromoBonusIconArr = (StateV3$AcceptData$PromoBonusIcon[]) $VALUES.clone();
        }
        int i4 = read + 69;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return stateV3$AcceptData$PromoBonusIconArr;
    }

    public static final class Companion {
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 27;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) StateV3$AcceptData$PromoBonusIcon.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            int i4 = IconCompatParcelizer + 107;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    }

    private static final /* synthetic */ StateV3$AcceptData$PromoBonusIcon[] $values() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 89;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateV3$AcceptData$PromoBonusIcon[] stateV3$AcceptData$PromoBonusIconArr = {HOLIDAY, NIGHT, RAIN, RUSH_HOUR, SNOW};
        int i5 = i2 + 111;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return stateV3$AcceptData$PromoBonusIconArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = read + 11;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        EnumSerializer enumSerializerSerializer = r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.serializer("com.roadrunner.delivery.state.StateV3.AcceptData.PromoBonusIcon", values(), new String[]{"holiday", "night", "rain", "rush_hour", "snow"}, new Annotation[][]{null, null, null, null, null});
        int i4 = write + 83;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return enumSerializerSerializer;
    }
}
