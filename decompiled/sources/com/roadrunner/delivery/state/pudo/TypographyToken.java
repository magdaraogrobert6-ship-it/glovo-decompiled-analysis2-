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
public final class TypographyToken {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ TypographyToken[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    private final String token;
    public static final TypographyToken HeadlineBig = new TypographyToken("HeadlineBig", 0, "headline.big");
    public static final TypographyToken HeadlineMedium = new TypographyToken("HeadlineMedium", 1, "headline.medium");
    public static final TypographyToken HeadlineSmall = new TypographyToken("HeadlineSmall", 2, "headline.small");
    public static final TypographyToken SubtitleMedium = new TypographyToken("SubtitleMedium", 3, "subtitle.medium");
    public static final TypographyToken SubtitleSmall = new TypographyToken("SubtitleSmall", 4, "subtitle.small");
    public static final TypographyToken BodyBig = new TypographyToken("BodyBig", 5, "body.big");
    public static final TypographyToken BodyMedium = new TypographyToken("BodyMedium", 6, "body.medium");
    public static final TypographyToken BodySmall = new TypographyToken("BodySmall", 7, "body.small");
    public static final TypographyToken Unknown = new TypographyToken("Unknown", 8, "");

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = write + 117;
        int i3 = i2 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i5 = i3 + 35;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return onviewdetachedfromwindowlambda1;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 91;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 53;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getToken() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.token;
        }
        throw null;
    }

    private TypographyToken(String str, int i, String str2) {
        super(str, i);
        this.token = str2;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$Ve1VjMmbujOkBrihK5nMPJL8LsQ() {
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
            int i3 = 5 / 0;
        } else {
            setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        }
        int i4 = write + 49;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.roadrunner.delivery.state.pudo.TypographyToken$Companion] */
    static {
        TypographyToken[] typographyTokenArr$values = $values();
        $VALUES = typographyTokenArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) typographyTokenArr$values);
        Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.TypographyToken.Companion
            private static int read = 0;
            private static int serializer = 1;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = read + 17;
                serializer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) TypographyToken.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
                int i4 = read + 51;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 86 / 0;
                }
                return setgraphicmodalmaxwidthdp;
            }
        };
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(23));
        int i = read + 125;
        serializer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 56 / 0;
        }
    }

    public static TypographyToken valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (TypographyToken) Enum.valueOf(TypographyToken.class, str);
        }
        int i3 = 77 / 0;
        return (TypographyToken) Enum.valueOf(TypographyToken.class, str);
    }

    public static TypographyToken[] values() {
        int i = 2 % 2;
        int i2 = write + 91;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TypographyToken[] typographyTokenArr = (TypographyToken[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 29;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return typographyTokenArr;
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        TypographyToken[] typographyTokenArrValues = values();
        typographyTokenArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.delivery.state.pudo.TypographyToken", (Enum[]) typographyTokenArrValues);
        int i2 = write + 107;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return enumSerializer;
    }

    private static final /* synthetic */ TypographyToken[] $values() {
        int i = 2 % 2;
        int i2 = write + 39;
        int i3 = i2 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        TypographyToken[] typographyTokenArr = {HeadlineBig, HeadlineMedium, HeadlineSmall, SubtitleMedium, SubtitleSmall, BodyBig, BodyMedium, BodySmall, Unknown};
        int i5 = i3 + 45;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return typographyTokenArr;
    }
}
