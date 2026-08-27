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
public final class ButtonTypeToken {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ ButtonTypeToken[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    private final String token;
    public static final ButtonTypeToken PrimaryButton = new ButtonTypeToken("PrimaryButton", 0, "primary_button");
    public static final ButtonTypeToken SecondaryButton = new ButtonTypeToken("SecondaryButton", 1, "secondary_button");
    public static final ButtonTypeToken SecondaryButtonInverted = new ButtonTypeToken("SecondaryButtonInverted", 2, "secondary_button_inverted");
    public static final ButtonTypeToken TertiaryButton = new ButtonTypeToken("TertiaryButton", 3, "tertiary_button");
    public static final ButtonTypeToken WarningButton = new ButtonTypeToken("WarningButton", 4, "warning_button");
    public static final ButtonTypeToken Unknown = new ButtonTypeToken("Unknown", 5, "");

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = serializer + 43;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i5 = i3 + 103;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return onviewdetachedfromwindowlambda1;
        }
        throw null;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 39;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 77;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getToken() {
        int i = 2 % 2;
        int i2 = serializer + 107;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.token;
        }
        int i3 = 72 / 0;
        return this.token;
    }

    private ButtonTypeToken(String str, int i, String str2) {
        super(str, i);
        this.token = str2;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$d4mLPL_hM31O8QEuJKl63xGutAI() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 43;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = IconCompatParcelizer + 15;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    static {
        ButtonTypeToken[] buttonTypeTokenArr$values = $values();
        $VALUES = buttonTypeTokenArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) buttonTypeTokenArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(5));
        int i = write + 35;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static ButtonTypeToken valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ButtonTypeToken buttonTypeToken = (ButtonTypeToken) Enum.valueOf(ButtonTypeToken.class, str);
        int i3 = IconCompatParcelizer + 37;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 79 / 0;
        }
        return buttonTypeToken;
    }

    public static ButtonTypeToken[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ButtonTypeToken[] buttonTypeTokenArr = (ButtonTypeToken[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 7;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return buttonTypeTokenArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 113;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) ButtonTypeToken.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            int i3 = read + 85;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        ButtonTypeToken[] buttonTypeTokenArrValues = values();
        buttonTypeTokenArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.delivery.state.pudo.ButtonTypeToken", (Enum[]) buttonTypeTokenArrValues);
        int i2 = IconCompatParcelizer + 87;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return enumSerializer;
    }

    private static final /* synthetic */ ButtonTypeToken[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 33;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ButtonTypeToken[] buttonTypeTokenArr = {PrimaryButton, SecondaryButton, SecondaryButtonInverted, TertiaryButton, WarningButton, Unknown};
        int i5 = i2 + 61;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return buttonTypeTokenArr;
    }
}
