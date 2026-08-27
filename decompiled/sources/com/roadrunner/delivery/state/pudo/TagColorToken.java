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
public final class TagColorToken {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ TagColorToken[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    private final String token;
    public static final TagColorToken SuccessPale = new TagColorToken("SuccessPale", 0, "success.pale");
    public static final TagColorToken AlertPale = new TagColorToken("AlertPale", 1, "alert.pale");
    public static final TagColorToken NaturalPale = new TagColorToken("NaturalPale", 2, "natural.pale");
    public static final TagColorToken ActivePale = new TagColorToken("ActivePale", 3, "active.pale");
    public static final TagColorToken WhitePale = new TagColorToken("WhitePale", 4, "white.pale");
    public static final TagColorToken ErrorPale = new TagColorToken("ErrorPale", 5, "error.pale");
    public static final TagColorToken Unknown = new TagColorToken("Unknown", 6, "");

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $cachedSerializer$delegate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 31;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 11;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        obj.hashCode();
        throw null;
    }

    public final String getToken() {
        int i = 2 % 2;
        int i2 = write + 17;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.token;
        }
        int i3 = 89 / 0;
        return this.token;
    }

    private TagColorToken(String str, int i, String str2) {
        super(str, i);
        this.token = str2;
    }

    /* JADX INFO: renamed from: $r8$lambda$t50hryx-0z34JHelrsFZL1_Ahvk, reason: not valid java name */
    public static /* synthetic */ setGraphicModalMaxWidthDp m4951$r8$lambda$t50hryx0z34JHelrsFZL1_Ahvk() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            _init_$_anonymous_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i3 = IconCompatParcelizer + 37;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.roadrunner.delivery.state.pudo.TagColorToken$Companion] */
    static {
        TagColorToken[] tagColorTokenArr$values = $values();
        $VALUES = tagColorTokenArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) tagColorTokenArr$values);
        Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.TagColorToken.Companion
            private static int read = 0;
            private static int write = 1;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = read + 81;
                write = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    throw null;
                }
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) TagColorToken.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
                int i3 = write + 9;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return setgraphicmodalmaxwidthdp;
            }
        };
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(20));
        int i = RemoteActionCompatParcelizer + 61;
        read = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static TagColorToken valueOf(String str) {
        TagColorToken tagColorToken;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            tagColorToken = (TagColorToken) Enum.valueOf(TagColorToken.class, str);
            int i3 = 45 / 0;
        } else {
            tagColorToken = (TagColorToken) Enum.valueOf(TagColorToken.class, str);
        }
        int i4 = write + 125;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return tagColorToken;
    }

    public static TagColorToken[] values() {
        int i = 2 % 2;
        int i2 = write + 27;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (TagColorToken[]) $VALUES.clone();
        }
        int i3 = 96 / 0;
        return (TagColorToken[]) $VALUES.clone();
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        TagColorToken[] tagColorTokenArrValues = values();
        tagColorTokenArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.delivery.state.pudo.TagColorToken", (Enum[]) tagColorTokenArrValues);
        int i2 = write + 73;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return enumSerializer;
    }

    private static final /* synthetic */ TagColorToken[] $values() {
        int i = 2 % 2;
        int i2 = write + 65;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        TagColorToken[] tagColorTokenArr = {SuccessPale, AlertPale, NaturalPale, ActivePale, WhitePale, ErrorPale, Unknown};
        int i5 = i3 + 35;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return tagColorTokenArr;
    }
}
