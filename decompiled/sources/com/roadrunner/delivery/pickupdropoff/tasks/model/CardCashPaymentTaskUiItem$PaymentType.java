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
public final class CardCashPaymentTaskUiItem$PaymentType {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ CardCashPaymentTaskUiItem$PaymentType[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    private final String id;
    public static final CardCashPaymentTaskUiItem$PaymentType CASH = new CardCashPaymentTaskUiItem$PaymentType("CASH", 0, "cash");
    public static final CardCashPaymentTaskUiItem$PaymentType CARD = new CardCashPaymentTaskUiItem$PaymentType("CARD", 1, "card");

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 19;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i5 = i2 + 125;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return onviewdetachedfromwindowlambda1;
        }
        throw null;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 105;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = write + 9;
        int i3 = i2 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 81;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private CardCashPaymentTaskUiItem$PaymentType(String str, int i, String str2) {
        super(str, i);
        this.id = str2;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$zVI3yKQMP80lSkvnQkB6zbo9f2c() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return _init_$_anonymous_();
        }
        int i3 = 29 / 0;
        return _init_$_anonymous_();
    }

    static {
        CardCashPaymentTaskUiItem$PaymentType[] cardCashPaymentTaskUiItem$PaymentTypeArr$values = $values();
        $VALUES = cardCashPaymentTaskUiItem$PaymentTypeArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) cardCashPaymentTaskUiItem$PaymentTypeArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new AnimatedVisibilityState(21));
        int i = serializer + 99;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 70 / 0;
        }
    }

    private static final /* synthetic */ CardCashPaymentTaskUiItem$PaymentType[] $values() {
        int i = 2 % 2;
        int i2 = write + 89;
        int i3 = i2 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        CardCashPaymentTaskUiItem$PaymentType[] cardCashPaymentTaskUiItem$PaymentTypeArr = {CASH, CARD};
        int i5 = i3 + 43;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return cardCashPaymentTaskUiItem$PaymentTypeArr;
    }

    public static CardCashPaymentTaskUiItem$PaymentType valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 31;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (CardCashPaymentTaskUiItem$PaymentType) Enum.valueOf(CardCashPaymentTaskUiItem$PaymentType.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CardCashPaymentTaskUiItem$PaymentType[] values() {
        int i = 2 % 2;
        int i2 = write + 101;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CardCashPaymentTaskUiItem$PaymentType[] cardCashPaymentTaskUiItem$PaymentTypeArr = (CardCashPaymentTaskUiItem$PaymentType[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 27;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return cardCashPaymentTaskUiItem$PaymentTypeArr;
    }

    public static final class Companion {
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp;
            int i = 2 % 2;
            int i2 = read + 71;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) CardCashPaymentTaskUiItem$PaymentType.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
                int i3 = 46 / 0;
            } else {
                setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) CardCashPaymentTaskUiItem$PaymentType.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            }
            int i4 = read + 121;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        CardCashPaymentTaskUiItem$PaymentType[] cardCashPaymentTaskUiItem$PaymentTypeArrValues = values();
        cardCashPaymentTaskUiItem$PaymentTypeArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem.PaymentType", (Enum[]) cardCashPaymentTaskUiItem$PaymentTypeArrValues);
        int i2 = RemoteActionCompatParcelizer + 97;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return enumSerializer;
        }
        throw null;
    }
}
