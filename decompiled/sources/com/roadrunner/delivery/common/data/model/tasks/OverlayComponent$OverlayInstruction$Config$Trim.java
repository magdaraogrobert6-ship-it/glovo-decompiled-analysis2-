package com.roadrunner.delivery.common.data.model.tasks;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import java.lang.annotation.Annotation;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.DelegatingFontLoaderForDeprecatedUsage;
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
public final class OverlayComponent$OverlayInstruction$Config$Trim {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ OverlayComponent$OverlayInstruction$Config$Trim[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    @getAppropriateFullView(serializer = "start")
    public static final OverlayComponent$OverlayInstruction$Config$Trim START = new OverlayComponent$OverlayInstruction$Config$Trim("START", 0);

    @getAppropriateFullView(serializer = "center")
    public static final OverlayComponent$OverlayInstruction$Config$Trim CENTER = new OverlayComponent$OverlayInstruction$Config$Trim("CENTER", 1);

    @getAppropriateFullView(serializer = "end")
    public static final OverlayComponent$OverlayInstruction$Config$Trim END = new OverlayComponent$OverlayInstruction$Config$Trim("END", 2);

    private OverlayComponent$OverlayInstruction$Config$Trim(String str, int i) {
        super(str, i);
    }

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 31;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i5 = i2 + 55;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return onviewdetachedfromwindowlambda1;
        }
        throw null;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$h145bG5obHYHJcJeteAJ1beDq1A() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            _init_$_anonymous_();
            throw null;
        }
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i3 = read + 115;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    static {
        OverlayComponent$OverlayInstruction$Config$Trim[] overlayComponent$OverlayInstruction$Config$TrimArr$values = $values();
        $VALUES = overlayComponent$OverlayInstruction$Config$TrimArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) overlayComponent$OverlayInstruction$Config$TrimArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new DelegatingFontLoaderForDeprecatedUsage(27));
        int i = write + 53;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static OverlayComponent$OverlayInstruction$Config$Trim valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 27;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        OverlayComponent$OverlayInstruction$Config$Trim overlayComponent$OverlayInstruction$Config$Trim = (OverlayComponent$OverlayInstruction$Config$Trim) Enum.valueOf(OverlayComponent$OverlayInstruction$Config$Trim.class, str);
        int i4 = RemoteActionCompatParcelizer + 35;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return overlayComponent$OverlayInstruction$Config$Trim;
    }

    public static OverlayComponent$OverlayInstruction$Config$Trim[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (OverlayComponent$OverlayInstruction$Config$Trim[]) $VALUES.clone();
        }
        throw null;
    }

    public static final class Companion {
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 19;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) OverlayComponent$OverlayInstruction$Config$Trim.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            int i4 = write + 61;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    }

    private static final /* synthetic */ OverlayComponent$OverlayInstruction$Config$Trim[] $values() {
        OverlayComponent$OverlayInstruction$Config$Trim[] overlayComponent$OverlayInstruction$Config$TrimArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            OverlayComponent$OverlayInstruction$Config$Trim overlayComponent$OverlayInstruction$Config$Trim = START;
            OverlayComponent$OverlayInstruction$Config$Trim overlayComponent$OverlayInstruction$Config$Trim2 = CENTER;
            OverlayComponent$OverlayInstruction$Config$Trim overlayComponent$OverlayInstruction$Config$Trim3 = END;
            overlayComponent$OverlayInstruction$Config$TrimArr = new OverlayComponent$OverlayInstruction$Config$Trim[4];
            overlayComponent$OverlayInstruction$Config$TrimArr[1] = overlayComponent$OverlayInstruction$Config$Trim;
            overlayComponent$OverlayInstruction$Config$TrimArr[0] = overlayComponent$OverlayInstruction$Config$Trim2;
            overlayComponent$OverlayInstruction$Config$TrimArr[5] = overlayComponent$OverlayInstruction$Config$Trim3;
        } else {
            overlayComponent$OverlayInstruction$Config$TrimArr = new OverlayComponent$OverlayInstruction$Config$Trim[]{START, CENTER, END};
        }
        int i4 = i3 + 23;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return overlayComponent$OverlayInstruction$Config$TrimArr;
    }

    private static final /* synthetic */ setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 9;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        EnumSerializer enumSerializerSerializer = r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.serializer("com.roadrunner.delivery.common.data.model.tasks.OverlayComponent.OverlayInstruction.Config.Trim", values(), new String[]{"start", "center", "end"}, new Annotation[][]{null, null, null});
        int i4 = read + 61;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return enumSerializerSerializer;
        }
        throw null;
    }
}
