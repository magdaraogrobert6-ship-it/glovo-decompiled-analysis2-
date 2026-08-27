package com.roadrunner.rider.state.quests.data;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import java.lang.annotation.Annotation;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.getAppropriateFullView;
import o.getSessionParameters;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.setGraphicModalMaxWidthDp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class QuestStatus {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ QuestStatus[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    @getAppropriateFullView(serializer = "FAILING")
    public static final QuestStatus FAILING = new QuestStatus("FAILING", 0);

    @getAppropriateFullView(serializer = "ONGOING")
    public static final QuestStatus ONGOING = new QuestStatus("ONGOING", 1);

    @getAppropriateFullView(serializer = "NONE")
    public static final QuestStatus NONE = new QuestStatus("NONE", 2);

    private QuestStatus(String str, int i) {
        super(str, i);
    }

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 13;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i5 = i2 + 45;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return onviewdetachedfromwindowlambda1;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 41;
        serializer = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 95;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$eIah_mRsCeS60Wa4Ziihug8TFUU() {
        int i = 2 % 2;
        int i2 = serializer + 17;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = serializer + 95;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdp_init_$_anonymous_;
        }
        throw null;
    }

    static {
        QuestStatus[] questStatusArr$values = $values();
        $VALUES = questStatusArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) questStatusArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new getSessionParameters(0));
        int i = IconCompatParcelizer + 31;
        read = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 40 / 0;
        }
    }

    public static QuestStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 25;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (QuestStatus) Enum.valueOf(QuestStatus.class, str);
        }
        throw null;
    }

    public static QuestStatus[] values() {
        int i = 2 % 2;
        int i2 = serializer + 119;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        QuestStatus[] questStatusArr = (QuestStatus[]) $VALUES.clone();
        int i4 = serializer + 71;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return questStatusArr;
    }

    public static final class Companion {
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 31;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) QuestStatus.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            int i4 = IconCompatParcelizer + 99;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    }

    private static final /* synthetic */ QuestStatus[] $values() {
        QuestStatus[] questStatusArr;
        int i = 2 % 2;
        int i2 = serializer + 57;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            QuestStatus questStatus = FAILING;
            QuestStatus questStatus2 = ONGOING;
            QuestStatus questStatus3 = NONE;
            questStatusArr = new QuestStatus[3];
            questStatusArr[0] = questStatus;
            questStatusArr[1] = questStatus2;
            questStatusArr[3] = questStatus3;
        } else {
            questStatusArr = new QuestStatus[]{FAILING, ONGOING, NONE};
        }
        int i4 = i3 + 21;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return questStatusArr;
    }

    private static final /* synthetic */ setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = serializer + 57;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = null;
        EnumSerializer enumSerializerSerializer = r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.serializer("com.roadrunner.rider.state.quests.data.QuestStatus", values(), new String[]{"FAILING", "ONGOING", "NONE"}, new Annotation[][]{null, null, null});
        int i4 = write + 1;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return enumSerializerSerializer;
        }
        obj.hashCode();
        throw null;
    }
}
