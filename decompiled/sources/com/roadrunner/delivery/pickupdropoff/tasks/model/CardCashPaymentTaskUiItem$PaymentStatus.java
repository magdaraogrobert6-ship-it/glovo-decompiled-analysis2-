package com.roadrunner.delivery.pickupdropoff.tasks.model;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.AnimatedVisibilityState;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.setGraphicModalMaxWidthDp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class CardCashPaymentTaskUiItem$PaymentStatus {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ CardCashPaymentTaskUiItem$PaymentStatus[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    private final String[] id;
    public static final CardCashPaymentTaskUiItem$PaymentStatus PENDING = new CardCashPaymentTaskUiItem$PaymentStatus("PENDING", 0, "PENDING");
    public static final CardCashPaymentTaskUiItem$PaymentStatus PROGRESS = new CardCashPaymentTaskUiItem$PaymentStatus("PROGRESS", 1, "INITIATED");
    public static final CardCashPaymentTaskUiItem$PaymentStatus SUCCESS = new CardCashPaymentTaskUiItem$PaymentStatus("SUCCESS", 2, "SUCCESS");
    public static final CardCashPaymentTaskUiItem$PaymentStatus FAILED = new CardCashPaymentTaskUiItem$PaymentStatus("FAILED", 3, "FAILED");

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 21;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i5 = i2 + 51;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return onviewdetachedfromwindowlambda1;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 9;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 79;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        obj.hashCode();
        throw null;
    }

    public final String[] getId() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 103;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String[] strArr = this.id;
        int i5 = i2 + 119;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return strArr;
    }

    private CardCashPaymentTaskUiItem$PaymentStatus(String str, int i, String... strArr) {
        super(str, i);
        this.id = strArr;
    }

    /* JADX INFO: renamed from: $r8$lambda$FqHl-InwPf0LohvVxl0C4HxY_Sc, reason: not valid java name */
    public static /* synthetic */ setGraphicModalMaxWidthDp m4942$r8$lambda$FqHlInwPf0LohvVxl0C4HxY_Sc() {
        int i = 2 % 2;
        int i2 = read + 97;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return _init_$_anonymous_();
        }
        int i3 = 5 / 0;
        return _init_$_anonymous_();
    }

    static {
        CardCashPaymentTaskUiItem$PaymentStatus[] cardCashPaymentTaskUiItem$PaymentStatusArr$values = $values();
        $VALUES = cardCashPaymentTaskUiItem$PaymentStatusArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) cardCashPaymentTaskUiItem$PaymentStatusArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new AnimatedVisibilityState(20));
        int i = IconCompatParcelizer + 19;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 66 / 0;
        }
    }

    public static CardCashPaymentTaskUiItem$PaymentStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 23;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CardCashPaymentTaskUiItem$PaymentStatus cardCashPaymentTaskUiItem$PaymentStatus = (CardCashPaymentTaskUiItem$PaymentStatus) Enum.valueOf(CardCashPaymentTaskUiItem$PaymentStatus.class, str);
        int i4 = read + 43;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return cardCashPaymentTaskUiItem$PaymentStatus;
    }

    public static CardCashPaymentTaskUiItem$PaymentStatus[] values() {
        int i = 2 % 2;
        int i2 = write + 9;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (CardCashPaymentTaskUiItem$PaymentStatus[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 111;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) CardCashPaymentTaskUiItem$PaymentStatus.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            int i4 = write + 85;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    }

    private static final /* synthetic */ CardCashPaymentTaskUiItem$PaymentStatus[] $values() {
        int i = 2 % 2;
        int i2 = write + 51;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new CardCashPaymentTaskUiItem$PaymentStatus[]{PENDING, PROGRESS, SUCCESS, FAILED};
        }
        CardCashPaymentTaskUiItem$PaymentStatus cardCashPaymentTaskUiItem$PaymentStatus = PENDING;
        CardCashPaymentTaskUiItem$PaymentStatus cardCashPaymentTaskUiItem$PaymentStatus2 = PROGRESS;
        CardCashPaymentTaskUiItem$PaymentStatus cardCashPaymentTaskUiItem$PaymentStatus3 = SUCCESS;
        CardCashPaymentTaskUiItem$PaymentStatus cardCashPaymentTaskUiItem$PaymentStatus4 = FAILED;
        CardCashPaymentTaskUiItem$PaymentStatus[] cardCashPaymentTaskUiItem$PaymentStatusArr = new CardCashPaymentTaskUiItem$PaymentStatus[5];
        cardCashPaymentTaskUiItem$PaymentStatusArr[1] = cardCashPaymentTaskUiItem$PaymentStatus;
        cardCashPaymentTaskUiItem$PaymentStatusArr[0] = cardCashPaymentTaskUiItem$PaymentStatus2;
        cardCashPaymentTaskUiItem$PaymentStatusArr[4] = cardCashPaymentTaskUiItem$PaymentStatus3;
        cardCashPaymentTaskUiItem$PaymentStatusArr[2] = cardCashPaymentTaskUiItem$PaymentStatus4;
        return cardCashPaymentTaskUiItem$PaymentStatusArr;
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        CardCashPaymentTaskUiItem$PaymentStatus[] cardCashPaymentTaskUiItem$PaymentStatusArrValues = values();
        cardCashPaymentTaskUiItem$PaymentStatusArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem.PaymentStatus", (Enum[]) cardCashPaymentTaskUiItem$PaymentStatusArrValues);
        int i2 = write + 103;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return enumSerializer;
        }
        throw null;
    }
}
