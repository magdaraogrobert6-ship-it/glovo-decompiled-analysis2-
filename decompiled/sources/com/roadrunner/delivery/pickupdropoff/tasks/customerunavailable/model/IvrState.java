package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.model;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.AnimatedVisibilityState;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.setGraphicModalMaxWidthDp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class IvrState {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ IvrState[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public static final IvrState NOT_INITIATED = new IvrState("NOT_INITIATED", 0);
    public static final IvrState IN_PROGRESS = new IvrState("IN_PROGRESS", 1);
    public static final IvrState SUCCESS = new IvrState("SUCCESS", 2);
    public static final IvrState FAILED = new IvrState("FAILED", 3);

    private IvrState(String str, int i) {
        super(str, i);
    }

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $cachedSerializer$delegate;
        }
        throw null;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 55;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$B-DXDz6bDivQHLhb-xOI8ExiK5M, reason: not valid java name */
    public static /* synthetic */ setGraphicModalMaxWidthDp m4931$r8$lambda$BDXDz6bDivQHLhbxOI8ExiK5M() {
        int i = 2 % 2;
        int i2 = write + 75;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = IconCompatParcelizer + 51;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    static {
        IvrState[] ivrStateArr$values = $values();
        $VALUES = ivrStateArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) ivrStateArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new AnimatedVisibilityState(12));
        int i = read + 17;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static IvrState valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 43;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        IvrState ivrState = (IvrState) Enum.valueOf(IvrState.class, str);
        int i3 = IconCompatParcelizer + 43;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return ivrState;
        }
        obj.hashCode();
        throw null;
    }

    public static IvrState[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (IvrState[]) $VALUES.clone();
        }
        int i3 = 31 / 0;
        return (IvrState[]) $VALUES.clone();
    }

    public static final class Companion {
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 31;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) IvrState.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
                int i3 = 95 / 0;
            } else {
                setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) IvrState.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            }
            int i4 = IconCompatParcelizer + 99;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return setgraphicmodalmaxwidthdp;
            }
            throw null;
        }
    }

    private static final /* synthetic */ IvrState[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        IvrState[] ivrStateArr = {NOT_INITIATED, IN_PROGRESS, SUCCESS, FAILED};
        int i5 = i3 + 77;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return ivrStateArr;
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        IvrState[] ivrStateArrValues = values();
        ivrStateArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.model.IvrState", (Enum[]) ivrStateArrValues);
        int i2 = write + 17;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 54 / 0;
        }
        return enumSerializer;
    }
}
