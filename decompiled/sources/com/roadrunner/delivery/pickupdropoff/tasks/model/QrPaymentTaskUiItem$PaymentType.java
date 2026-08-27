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
public final class QrPaymentTaskUiItem$PaymentType {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ QrPaymentTaskUiItem$PaymentType[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    private final String id;
    public static final QrPaymentTaskUiItem$PaymentType CASH = new QrPaymentTaskUiItem$PaymentType("CASH", 0, "cash");
    public static final QrPaymentTaskUiItem$PaymentType QR_CODE = new QrPaymentTaskUiItem$PaymentType("QR_CODE", 1, "qr_code");

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 55;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i5 = i2 + 3;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return onviewdetachedfromwindowlambda1;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 103;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = serializer + 119;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 39;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private QrPaymentTaskUiItem$PaymentType(String str, int i, String str2) {
        super(str, i);
        this.id = str2;
    }

    /* JADX INFO: renamed from: $r8$lambda$Z3oCcI0IRb1hYAOQ-nFQV5mtIBU, reason: not valid java name */
    public static /* synthetic */ setGraphicModalMaxWidthDp m4944$r8$lambda$Z3oCcI0IRb1hYAOQnFQV5mtIBU() {
        int i = 2 % 2;
        int i2 = write + 61;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = write + 109;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    static {
        QrPaymentTaskUiItem$PaymentType[] qrPaymentTaskUiItem$PaymentTypeArr$values = $values();
        $VALUES = qrPaymentTaskUiItem$PaymentTypeArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) qrPaymentTaskUiItem$PaymentTypeArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(12));
        int i = RemoteActionCompatParcelizer + 107;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ QrPaymentTaskUiItem$PaymentType[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 17;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        QrPaymentTaskUiItem$PaymentType[] qrPaymentTaskUiItem$PaymentTypeArr = {CASH, QR_CODE};
        int i5 = i3 + 97;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return qrPaymentTaskUiItem$PaymentTypeArr;
    }

    public static QrPaymentTaskUiItem$PaymentType valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 91;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (QrPaymentTaskUiItem$PaymentType) Enum.valueOf(QrPaymentTaskUiItem$PaymentType.class, str);
        }
        throw null;
    }

    public static QrPaymentTaskUiItem$PaymentType[] values() {
        int i = 2 % 2;
        int i2 = serializer + 65;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (QrPaymentTaskUiItem$PaymentType[]) $VALUES.clone();
        }
        throw null;
    }

    public static final class Companion {
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 21;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                throw null;
            }
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) QrPaymentTaskUiItem$PaymentType.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            int i3 = serializer + 23;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        QrPaymentTaskUiItem$PaymentType[] qrPaymentTaskUiItem$PaymentTypeArrValues = values();
        qrPaymentTaskUiItem$PaymentTypeArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem.PaymentType", (Enum[]) qrPaymentTaskUiItem$PaymentTypeArrValues);
        int i2 = serializer + 43;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return enumSerializer;
    }
}
