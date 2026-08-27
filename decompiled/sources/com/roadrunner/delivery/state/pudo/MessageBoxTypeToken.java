package com.roadrunner.delivery.state.pudo;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import fwfd.com.fwfsdk.constant.FWFConstants;
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
public final class MessageBoxTypeToken {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ MessageBoxTypeToken[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    private final String token;
    public static final MessageBoxTypeToken Neutral = new MessageBoxTypeToken("Neutral", 0, "neutral");
    public static final MessageBoxTypeToken Success = new MessageBoxTypeToken("Success", 1, "success");
    public static final MessageBoxTypeToken Alert = new MessageBoxTypeToken("Alert", 2, "alert");
    public static final MessageBoxTypeToken Error = new MessageBoxTypeToken("Error", 3, FWFConstants.EXPLANATION_TYPE_ERROR);
    public static final MessageBoxTypeToken Unknown = new MessageBoxTypeToken("Unknown", 4, "");

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1;
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 71;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
            int i4 = 12 / 0;
        } else {
            onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        }
        int i5 = i2 + 5;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return onviewdetachedfromwindowlambda1;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 107;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public final String getToken() {
        int i = 2 % 2;
        int i2 = read + 115;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.token;
        int i5 = i3 + 83;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private MessageBoxTypeToken(String str, int i, String str2) {
        super(str, i);
        this.token = str2;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$wgQWawUTCI3OVapYWYbjsLPE5Dc() {
        int i = 2 % 2;
        int i2 = write + 65;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = write + 9;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdp_init_$_anonymous_;
        }
        throw null;
    }

    static {
        MessageBoxTypeToken[] messageBoxTypeTokenArr$values = $values();
        $VALUES = messageBoxTypeTokenArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) messageBoxTypeTokenArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(19));
        int i = IconCompatParcelizer + 65;
        serializer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MessageBoxTypeToken valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 7;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (MessageBoxTypeToken) Enum.valueOf(MessageBoxTypeToken.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MessageBoxTypeToken[] values() {
        int i = 2 % 2;
        int i2 = read + 87;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        MessageBoxTypeToken[] messageBoxTypeTokenArr = (MessageBoxTypeToken[]) $VALUES.clone();
        int i4 = write + 71;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return messageBoxTypeTokenArr;
    }

    public static final class Companion {
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 33;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) MessageBoxTypeToken.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            int i4 = IconCompatParcelizer + 81;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    }

    private static final /* synthetic */ MessageBoxTypeToken[] $values() {
        int i = 2 % 2;
        int i2 = write + 57;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        MessageBoxTypeToken[] messageBoxTypeTokenArr = {Neutral, Success, Alert, Error, Unknown};
        int i5 = i3 + 65;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
        return messageBoxTypeTokenArr;
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        MessageBoxTypeToken[] messageBoxTypeTokenArrValues = values();
        messageBoxTypeTokenArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.delivery.state.pudo.MessageBoxTypeToken", (Enum[]) messageBoxTypeTokenArrValues);
        int i2 = write + 33;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return enumSerializer;
    }
}
