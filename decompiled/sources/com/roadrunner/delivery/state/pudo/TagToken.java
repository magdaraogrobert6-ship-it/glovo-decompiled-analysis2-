package com.roadrunner.delivery.state.pudo;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import java.lang.annotation.Annotation;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.ComposableSingletonsAndroidDialog_androidKtlambda2101488961;
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
public final class TagToken {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ TagToken[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    private final String token;

    @getAppropriateFullView(serializer = "success.bold")
    public static final TagToken SuccessBold = new TagToken("SuccessBold", 0, "success.bold");

    @getAppropriateFullView(serializer = "alert.bold")
    public static final TagToken AlertBold = new TagToken("AlertBold", 1, "alert.bold");

    @getAppropriateFullView(serializer = "natural.bold")
    public static final TagToken NaturalBold = new TagToken("NaturalBold", 2, "natural.bold");
    public static final TagToken Unknown = new TagToken("Unknown", 3, "");

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 97;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i5 = i2 + 43;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return onviewdetachedfromwindowlambda1;
        }
        throw null;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 123;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 83;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    public final String getToken() {
        String str;
        int i = 2 % 2;
        int i2 = read + 99;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            str = this.token;
            int i4 = 13 / 0;
        } else {
            str = this.token;
        }
        int i5 = i3 + 67;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private TagToken(String str, int i, String str2) {
        super(str, i);
        this.token = str2;
    }

    /* JADX INFO: renamed from: $r8$lambda$MvMg7oznS0YkH38CPyNk3zl-2Go, reason: not valid java name */
    public static /* synthetic */ setGraphicModalMaxWidthDp m4952$r8$lambda$MvMg7oznS0YkH38CPyNk3zl2Go() {
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_;
        int i = 2 % 2;
        int i2 = read + 107;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
            int i3 = 79 / 0;
        } else {
            setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        }
        int i4 = read + 91;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdp_init_$_anonymous_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TagToken[] tagTokenArr$values = $values();
        $VALUES = tagTokenArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) tagTokenArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(22));
        int i = RemoteActionCompatParcelizer + 91;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static TagToken valueOf(String str) {
        TagToken tagToken;
        int i = 2 % 2;
        int i2 = write + 59;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            tagToken = (TagToken) Enum.valueOf(TagToken.class, str);
            int i3 = 33 / 0;
        } else {
            tagToken = (TagToken) Enum.valueOf(TagToken.class, str);
        }
        int i4 = read + 59;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return tagToken;
    }

    public static TagToken[] values() {
        int i = 2 % 2;
        int i2 = read + 33;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TagToken[] tagTokenArr = (TagToken[]) $VALUES.clone();
        int i4 = read + 83;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return tagTokenArr;
        }
        throw null;
    }

    public static final class Companion {
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 17;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) TagToken.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            int i3 = IconCompatParcelizer + 113;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return setgraphicmodalmaxwidthdp;
            }
            obj.hashCode();
            throw null;
        }
    }

    private static final /* synthetic */ TagToken[] $values() {
        int i = 2 % 2;
        int i2 = write + 111;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new TagToken[]{SuccessBold, AlertBold, NaturalBold, Unknown};
        }
        TagToken tagToken = SuccessBold;
        TagToken tagToken2 = AlertBold;
        TagToken tagToken3 = NaturalBold;
        TagToken tagToken4 = Unknown;
        TagToken[] tagTokenArr = new TagToken[5];
        tagTokenArr[0] = tagToken;
        tagTokenArr[1] = tagToken2;
        tagTokenArr[4] = tagToken3;
        tagTokenArr[5] = tagToken4;
        return tagTokenArr;
    }

    private static final /* synthetic */ setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = read + 7;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        EnumSerializer enumSerializerSerializer = r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.serializer("com.roadrunner.delivery.state.pudo.TagToken", values(), new String[]{"success.bold", "alert.bold", "natural.bold", null}, new Annotation[][]{null, null, null, null});
        int i4 = read + 53;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return enumSerializerSerializer;
    }
}
