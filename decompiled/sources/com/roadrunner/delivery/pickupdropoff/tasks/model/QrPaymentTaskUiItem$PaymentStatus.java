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
public final class QrPaymentTaskUiItem$PaymentStatus {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ QrPaymentTaskUiItem$PaymentStatus[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    private final String[] id;
    public static final QrPaymentTaskUiItem$PaymentStatus SUCCESS = new QrPaymentTaskUiItem$PaymentStatus("SUCCESS", 0, "Success");
    public static final QrPaymentTaskUiItem$PaymentStatus FAILURE = new QrPaymentTaskUiItem$PaymentStatus("FAILURE", 1, "Failed");

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 41;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
            int i4 = 43 / 0;
        } else {
            onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        }
        int i5 = i2 + 89;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return onviewdetachedfromwindowlambda1;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 45;
        serializer = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 63;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        obj.hashCode();
        throw null;
    }

    public final String[] getId() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String[] strArr = this.id;
        int i5 = i3 + 41;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return strArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private QrPaymentTaskUiItem$PaymentStatus(String str, int i, String... strArr) {
        super(str, i);
        this.id = strArr;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$D0bMVBx2D9aXxObh7xIXuCD2wCk() {
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_;
        int i = 2 % 2;
        int i2 = serializer + 89;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
            int i3 = 81 / 0;
        } else {
            setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        }
        int i4 = serializer + 47;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    static {
        QrPaymentTaskUiItem$PaymentStatus[] qrPaymentTaskUiItem$PaymentStatusArr$values = $values();
        $VALUES = qrPaymentTaskUiItem$PaymentStatusArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) qrPaymentTaskUiItem$PaymentStatusArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(11));
        int i = IconCompatParcelizer + 7;
        write = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ QrPaymentTaskUiItem$PaymentStatus[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 35;
        int i3 = i2 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        QrPaymentTaskUiItem$PaymentStatus[] qrPaymentTaskUiItem$PaymentStatusArr = {SUCCESS, FAILURE};
        int i5 = i3 + 91;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return qrPaymentTaskUiItem$PaymentStatusArr;
    }

    public static QrPaymentTaskUiItem$PaymentStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 89;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (QrPaymentTaskUiItem$PaymentStatus) Enum.valueOf(QrPaymentTaskUiItem$PaymentStatus.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static QrPaymentTaskUiItem$PaymentStatus[] values() {
        QrPaymentTaskUiItem$PaymentStatus[] qrPaymentTaskUiItem$PaymentStatusArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            qrPaymentTaskUiItem$PaymentStatusArr = (QrPaymentTaskUiItem$PaymentStatus[]) $VALUES.clone();
            int i3 = 83 / 0;
        } else {
            qrPaymentTaskUiItem$PaymentStatusArr = (QrPaymentTaskUiItem$PaymentStatus[]) $VALUES.clone();
        }
        int i4 = RemoteActionCompatParcelizer + 83;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return qrPaymentTaskUiItem$PaymentStatusArr;
    }

    public static final class Companion {
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 125;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return (setGraphicModalMaxWidthDp) QrPaymentTaskUiItem$PaymentStatus.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        QrPaymentTaskUiItem$PaymentStatus[] qrPaymentTaskUiItem$PaymentStatusArrValues = values();
        qrPaymentTaskUiItem$PaymentStatusArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem.PaymentStatus", (Enum[]) qrPaymentTaskUiItem$PaymentStatusArrValues);
        int i2 = RemoteActionCompatParcelizer + 79;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return enumSerializer;
    }
}
