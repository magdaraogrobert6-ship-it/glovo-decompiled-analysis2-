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
public final class OverlayItems$Instruction$Config$Trim {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ OverlayItems$Instruction$Config$Trim[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public static final OverlayItems$Instruction$Config$Trim START = new OverlayItems$Instruction$Config$Trim("START", 0);
    public static final OverlayItems$Instruction$Config$Trim CENTER = new OverlayItems$Instruction$Config$Trim("CENTER", 1);
    public static final OverlayItems$Instruction$Config$Trim END = new OverlayItems$Instruction$Config$Trim("END", 2);

    private OverlayItems$Instruction$Config$Trim(String str, int i) {
        super(str, i);
    }

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $cachedSerializer$delegate;
        }
        int i3 = 41 / 0;
        return $cachedSerializer$delegate;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 119;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 49;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$96LWhVnleeJPboQfHOrwp0OLl7k() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = serializer + 35;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    static {
        OverlayItems$Instruction$Config$Trim[] overlayItems$Instruction$Config$TrimArr$values = $values();
        $VALUES = overlayItems$Instruction$Config$TrimArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) overlayItems$Instruction$Config$TrimArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(3));
        int i = RemoteActionCompatParcelizer + 65;
        write = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static OverlayItems$Instruction$Config$Trim valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 67;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (OverlayItems$Instruction$Config$Trim) Enum.valueOf(OverlayItems$Instruction$Config$Trim.class, str);
        }
        int i3 = 1 / 0;
        return (OverlayItems$Instruction$Config$Trim) Enum.valueOf(OverlayItems$Instruction$Config$Trim.class, str);
    }

    public static OverlayItems$Instruction$Config$Trim[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        OverlayItems$Instruction$Config$Trim[] overlayItems$Instruction$Config$TrimArr = (OverlayItems$Instruction$Config$Trim[]) $VALUES.clone();
        int i3 = IconCompatParcelizer + 51;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return overlayItems$Instruction$Config$TrimArr;
    }

    public static final class Companion {
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 63;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) OverlayItems$Instruction$Config$Trim.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            int i4 = serializer + 103;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return setgraphicmodalmaxwidthdp;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final /* synthetic */ OverlayItems$Instruction$Config$Trim[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 121;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        OverlayItems$Instruction$Config$Trim[] overlayItems$Instruction$Config$TrimArr = {START, CENTER, END};
        int i5 = i2 + 45;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return overlayItems$Instruction$Config$TrimArr;
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        OverlayItems$Instruction$Config$Trim[] overlayItems$Instruction$Config$TrimArrValues = values();
        overlayItems$Instruction$Config$TrimArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems.Instruction.Config.Trim", (Enum[]) overlayItems$Instruction$Config$TrimArrValues);
        int i2 = IconCompatParcelizer + 3;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return enumSerializer;
        }
        throw null;
    }
}
