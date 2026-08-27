package com.roadrunner.delivery.pickupdropoff.tasks.model;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.fontScale;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.setGraphicModalMaxWidthDp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class TapToPayTaskUiItem$PaymentType {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ TapToPayTaskUiItem$PaymentType[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    private final String id;
    public static final TapToPayTaskUiItem$PaymentType CASH = new TapToPayTaskUiItem$PaymentType("CASH", 0, "cash");
    public static final TapToPayTaskUiItem$PaymentType CARD = new TapToPayTaskUiItem$PaymentType("CARD", 1, "card");

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = write + 13;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $cachedSerializer$delegate;
        }
        throw null;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 109;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 85;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = write + 95;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.id;
        }
        int i3 = 30 / 0;
        return this.id;
    }

    private TapToPayTaskUiItem$PaymentType(String str, int i, String str2) {
        super(str, i);
        this.id = str2;
    }

    /* JADX INFO: renamed from: $r8$lambda$q-U2DNTMlTwkGUmevNWvD7bbikg, reason: not valid java name */
    public static /* synthetic */ setGraphicModalMaxWidthDp m4945$r8$lambda$qU2DNTMlTwkGUmevNWvD7bbikg() {
        int i = 2 % 2;
        int i2 = write + 113;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = write + 91;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    static {
        TapToPayTaskUiItem$PaymentType[] tapToPayTaskUiItem$PaymentTypeArr$values = $values();
        $VALUES = tapToPayTaskUiItem$PaymentTypeArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) tapToPayTaskUiItem$PaymentTypeArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(25));
        int i = IconCompatParcelizer + 65;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ TapToPayTaskUiItem$PaymentType[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 7;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        TapToPayTaskUiItem$PaymentType[] tapToPayTaskUiItem$PaymentTypeArr = {CASH, CARD};
        int i5 = i2 + 65;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return tapToPayTaskUiItem$PaymentTypeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TapToPayTaskUiItem$PaymentType valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 39;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TapToPayTaskUiItem$PaymentType tapToPayTaskUiItem$PaymentType = (TapToPayTaskUiItem$PaymentType) Enum.valueOf(TapToPayTaskUiItem$PaymentType.class, str);
        int i4 = RemoteActionCompatParcelizer + 7;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return tapToPayTaskUiItem$PaymentType;
    }

    public static TapToPayTaskUiItem$PaymentType[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TapToPayTaskUiItem$PaymentType[] tapToPayTaskUiItem$PaymentTypeArr = (TapToPayTaskUiItem$PaymentType[]) $VALUES.clone();
        int i4 = write + 23;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return tapToPayTaskUiItem$PaymentTypeArr;
    }

    public static final class Companion {
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 7;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return (setGraphicModalMaxWidthDp) TapToPayTaskUiItem$PaymentType.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            }
            int i3 = 35 / 0;
            return (setGraphicModalMaxWidthDp) TapToPayTaskUiItem$PaymentType.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
        }
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        TapToPayTaskUiItem$PaymentType[] tapToPayTaskUiItem$PaymentTypeArrValues = values();
        tapToPayTaskUiItem$PaymentTypeArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem.PaymentType", (Enum[]) tapToPayTaskUiItem$PaymentTypeArrValues);
        int i2 = RemoteActionCompatParcelizer + 39;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return enumSerializer;
    }
}
