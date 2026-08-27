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
public final class QrPaymentTaskUiItem$QrPaymentType {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ QrPaymentTaskUiItem$QrPaymentType[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    private final String[] id;
    public static final QrPaymentTaskUiItem$QrPaymentType CODE = new QrPaymentTaskUiItem$QrPaymentType("CODE", 0, "CODE");
    public static final QrPaymentTaskUiItem$QrPaymentType IMAGE = new QrPaymentTaskUiItem$QrPaymentType("IMAGE", 1, "IMAGE");

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1;
        int i = 2 % 2;
        int i2 = read + 33;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
            int i4 = 15 / 0;
        } else {
            onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        }
        int i5 = i3 + 17;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return onviewdetachedfromwindowlambda1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 123;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String[] getId() {
        int i = 2 % 2;
        int i2 = read + 37;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.id;
        }
        throw null;
    }

    private QrPaymentTaskUiItem$QrPaymentType(String str, int i, String... strArr) {
        super(str, i);
        this.id = strArr;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$kV5mSl2FUNIh6KG43WQeLhmPhN0() {
        int i = 2 % 2;
        int i2 = write + 15;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = read + 9;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    static {
        QrPaymentTaskUiItem$QrPaymentType[] qrPaymentTaskUiItem$QrPaymentTypeArr$values = $values();
        $VALUES = qrPaymentTaskUiItem$QrPaymentTypeArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) qrPaymentTaskUiItem$QrPaymentTypeArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(16));
        int i = RemoteActionCompatParcelizer + 27;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ QrPaymentTaskUiItem$QrPaymentType[] $values() {
        int i = 2 % 2;
        int i2 = write + 115;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new QrPaymentTaskUiItem$QrPaymentType[]{CODE, IMAGE};
        }
        QrPaymentTaskUiItem$QrPaymentType qrPaymentTaskUiItem$QrPaymentType = CODE;
        QrPaymentTaskUiItem$QrPaymentType qrPaymentTaskUiItem$QrPaymentType2 = IMAGE;
        QrPaymentTaskUiItem$QrPaymentType[] qrPaymentTaskUiItem$QrPaymentTypeArr = new QrPaymentTaskUiItem$QrPaymentType[3];
        qrPaymentTaskUiItem$QrPaymentTypeArr[0] = qrPaymentTaskUiItem$QrPaymentType;
        qrPaymentTaskUiItem$QrPaymentTypeArr[0] = qrPaymentTaskUiItem$QrPaymentType2;
        return qrPaymentTaskUiItem$QrPaymentTypeArr;
    }

    public static QrPaymentTaskUiItem$QrPaymentType valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 51;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        QrPaymentTaskUiItem$QrPaymentType qrPaymentTaskUiItem$QrPaymentType = (QrPaymentTaskUiItem$QrPaymentType) Enum.valueOf(QrPaymentTaskUiItem$QrPaymentType.class, str);
        int i4 = read + 5;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return qrPaymentTaskUiItem$QrPaymentType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static QrPaymentTaskUiItem$QrPaymentType[] values() {
        int i = 2 % 2;
        int i2 = read + 91;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        QrPaymentTaskUiItem$QrPaymentType[] qrPaymentTaskUiItem$QrPaymentTypeArr = (QrPaymentTaskUiItem$QrPaymentType[]) $VALUES.clone();
        int i4 = write + 47;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return qrPaymentTaskUiItem$QrPaymentTypeArr;
    }

    public static final class Companion {
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 35;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) QrPaymentTaskUiItem$QrPaymentType.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            int i3 = read + 85;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return setgraphicmodalmaxwidthdp;
            }
            obj.hashCode();
            throw null;
        }
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        QrPaymentTaskUiItem$QrPaymentType[] qrPaymentTaskUiItem$QrPaymentTypeArrValues = values();
        qrPaymentTaskUiItem$QrPaymentTypeArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem.QrPaymentType", (Enum[]) qrPaymentTaskUiItem$QrPaymentTypeArrValues);
        int i2 = write + 45;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return enumSerializer;
    }
}
