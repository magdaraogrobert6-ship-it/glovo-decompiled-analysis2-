package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.setGraphicModalMaxWidthDp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class StateV3$ScreenType {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ StateV3$ScreenType[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public static final StateV3$ScreenType Accept = new StateV3$ScreenType("Accept", 0);
    public static final StateV3$ScreenType AutoAccept = new StateV3$ScreenType("AutoAccept", 1);
    public static final StateV3$ScreenType DeliveriesDetail = new StateV3$ScreenType("DeliveriesDetail", 2);
    public static final StateV3$ScreenType Unknown = new StateV3$ScreenType("Unknown", 3);

    private StateV3$ScreenType(String str, int i) {
        super(str, i);
    }

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 85;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i5 = i2 + 23;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return onviewdetachedfromwindowlambda1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 101;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$uPuq8UOwdJCFoS0J-dLYFMHf0QE, reason: not valid java name */
    public static /* synthetic */ setGraphicModalMaxWidthDp m4949$r8$lambda$uPuq8UOwdJCFoS0JdLYFMHf0QE() {
        int i = 2 % 2;
        int i2 = read + 71;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = read + 7;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setgraphicmodalmaxwidthdp_init_$_anonymous_;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.roadrunner.delivery.state.StateV3$ScreenType$Companion] */
    static {
        StateV3$ScreenType[] stateV3$ScreenTypeArr$values = $values();
        $VALUES = stateV3$ScreenTypeArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) stateV3$ScreenTypeArr$values);
        Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$ScreenType.Companion
            private static int RemoteActionCompatParcelizer = 1;
            private static int read;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = RemoteActionCompatParcelizer + 93;
                read = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) StateV3$ScreenType.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
                int i4 = RemoteActionCompatParcelizer + 85;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return setgraphicmodalmaxwidthdp;
            }
        };
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3$$ExternalSyntheticLambda0(26));
        int i = IconCompatParcelizer + 77;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static StateV3$ScreenType valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 1;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StateV3$ScreenType stateV3$ScreenType = (StateV3$ScreenType) Enum.valueOf(StateV3$ScreenType.class, str);
        int i4 = write + 123;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return stateV3$ScreenType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static StateV3$ScreenType[] values() {
        StateV3$ScreenType[] stateV3$ScreenTypeArr;
        int i = 2 % 2;
        int i2 = read + 45;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            stateV3$ScreenTypeArr = (StateV3$ScreenType[]) $VALUES.clone();
            int i3 = 14 / 0;
        } else {
            stateV3$ScreenTypeArr = (StateV3$ScreenType[]) $VALUES.clone();
        }
        int i4 = read + 21;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return stateV3$ScreenTypeArr;
    }

    private static final /* synthetic */ StateV3$ScreenType[] $values() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 35;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateV3$ScreenType[] stateV3$ScreenTypeArr = {Accept, AutoAccept, DeliveriesDetail, Unknown};
        int i5 = i2 + 37;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateV3$ScreenTypeArr;
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        StateV3$ScreenType[] stateV3$ScreenTypeArrValues = values();
        stateV3$ScreenTypeArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.delivery.state.StateV3.ScreenType", (Enum[]) stateV3$ScreenTypeArrValues);
        int i2 = read + 65;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return enumSerializer;
    }
}
