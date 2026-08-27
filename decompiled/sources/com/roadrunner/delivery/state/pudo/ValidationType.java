package com.roadrunner.delivery.state.pudo;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.ComposableSingletonsAndroidDialog_androidKtlambda2101488961;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.setGraphicModalMaxWidthDp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ValidationType {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ ValidationType[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    private final String value;
    public static final ValidationType IsLessThan = new ValidationType("IsLessThan", 0, "<");
    public static final ValidationType IsGreaterThan = new ValidationType("IsGreaterThan", 1, ">");
    public static final ValidationType Unknown = new ValidationType("Unknown", 2, "");

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = write + 87;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i4 = i3 + 103;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return onviewdetachedfromwindowlambda1;
        }
        obj.hashCode();
        throw null;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 75;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = serializer + 59;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 97;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
        return str;
    }

    private ValidationType(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$1ZRUXz2WQY_n0TEKhdsuIEEYqg0() {
        int i = 2 % 2;
        int i2 = write + 37;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            _init_$_anonymous_();
            throw null;
        }
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i3 = serializer + 55;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.roadrunner.delivery.state.pudo.ValidationType$Companion] */
    static {
        ValidationType[] validationTypeArr$values = $values();
        $VALUES = validationTypeArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) validationTypeArr$values);
        Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.ValidationType.Companion
            private static int IconCompatParcelizer = 1;
            private static int read;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer + 47;
                read = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return (setGraphicModalMaxWidthDp) ValidationType.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
                }
                throw null;
            }
        };
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(24));
        int i = read + 49;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static ValidationType valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 81;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ValidationType validationType = (ValidationType) Enum.valueOf(ValidationType.class, str);
        int i3 = write + 113;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return validationType;
        }
        throw null;
    }

    public static ValidationType[] values() {
        ValidationType[] validationTypeArr;
        int i = 2 % 2;
        int i2 = serializer + 97;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            validationTypeArr = (ValidationType[]) $VALUES.clone();
            int i3 = 13 / 0;
        } else {
            validationTypeArr = (ValidationType[]) $VALUES.clone();
        }
        int i4 = serializer + 69;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return validationTypeArr;
    }

    private static final /* synthetic */ ValidationType[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 65;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ValidationType[] validationTypeArr = {IsLessThan, IsGreaterThan, Unknown};
        int i5 = i2 + 117;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return validationTypeArr;
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        ValidationType[] validationTypeArrValues = values();
        validationTypeArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.delivery.state.pudo.ValidationType", (Enum[]) validationTypeArrValues);
        int i2 = serializer + 11;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return enumSerializer;
    }
}
