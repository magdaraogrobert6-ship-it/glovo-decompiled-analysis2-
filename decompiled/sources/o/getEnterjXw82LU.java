package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentStatus;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentType;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.NoopState_androidKtNoopState1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getEnterjXw82LU implements uiMode {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final CardCashPaymentTaskUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 61;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                NoopState_androidKtNoopState1 noopState_androidKtNoopState1 = NoopState_androidKtNoopState1.serializer;
                throw null;
            }
            NoopState_androidKtNoopState1 noopState_androidKtNoopState2 = NoopState_androidKtNoopState1.serializer;
            int i3 = RemoteActionCompatParcelizer + 55;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return noopState_androidKtNoopState2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final CallGroup cardItem;
    public final CashPaymentTaskUiItem cashItem;
    public final String description;
    public final boolean isActive;
    public final boolean isOptional;
    public final boolean isRequired;
    public final boolean isSuccess;
    public final CardCashPaymentTaskUiItem$PaymentType paymentType;
    public final String progressText;
    public final CardCashPaymentTaskUiItem$PaymentStatus status;
    public final String successPaidWithText;
    public final String successText;
    public final String taskId;
    public final String title;

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = ~i2;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i3 | i2);
        int i12 = (~(i2 | i3)) | (~(i7 | i9)) | i8;
        int i13 = i3 + i5 + i6 + ((-1422066268) * i) + ((-2108786386) * i4);
        int i14 = i13 * i13;
        int i15 = ((-1583913924) * i3) + 967573504 + (322476998 * i5) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i6) + ((-1298137088) * i) + (1722810368 * i4) + (518782976 * i14);
        int i16 = (i3 * 793895740) + 1353643607 + (i5 * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (i6 * 793896001) + (i * 692483748) + (i4 * (-1016611666)) + (i14 * 166461440);
        if (i15 + (i16 * i16 * 1997799424) == 1) {
            return write(objArr);
        }
        getEnterjXw82LU getenterjxw82lu = (getEnterjXw82LU) objArr[0];
        int i17 = 2 % 2;
        int i18 = write + 23;
        int i19 = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i19;
        int i20 = i18 % 2;
        CardCashPaymentTaskUiItem$PaymentType cardCashPaymentTaskUiItem$PaymentType = getenterjxw82lu.paymentType;
        int i21 = i19 + 67;
        write = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i22 = i21 % 2;
        return cardCashPaymentTaskUiItem$PaymentType;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        Object obj = null;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnimatedVisibilityState(18)), null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnimatedVisibilityState(19)), null, null, null, null};
        int i = serializer + 91;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        getEnterjXw82LU getenterjxw82lu = (getEnterjXw82LU) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return getenterjxw82lu.status;
        }
        CardCashPaymentTaskUiItem$PaymentStatus cardCashPaymentTaskUiItem$PaymentStatus = getenterjxw82lu.status;
        throw null;
    }

    @Override // o.uiMode
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 103;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.taskId;
        int i5 = i2 + 77;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final CallGroup RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.cardItem;
        }
        int i3 = 93 / 0;
        return this.cardItem;
    }

    @Override // o.uiMode
    public final boolean read() {
        int i = 2 % 2;
        int i2 = write + 85;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.isOptional;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CashPaymentTaskUiItem serializer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 47;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        CashPaymentTaskUiItem cashPaymentTaskUiItem = this.cashItem;
        int i5 = i2 + 65;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return cashPaymentTaskUiItem;
        }
        throw null;
    }

    public /* synthetic */ getEnterjXw82LU(int i, String str, String str2, String str3, String str4, CardCashPaymentTaskUiItem$PaymentType cardCashPaymentTaskUiItem$PaymentType, String str5, boolean z, CashPaymentTaskUiItem cashPaymentTaskUiItem, CallGroup callGroup, CardCashPaymentTaskUiItem$PaymentStatus cardCashPaymentTaskUiItem$PaymentStatus, boolean z2, String str6, boolean z3, boolean z4) {
        if (8191 == (i & 8191)) {
            this.title = str;
            this.description = str2;
            this.successText = str3;
            this.successPaidWithText = str4;
            this.paymentType = cardCashPaymentTaskUiItem$PaymentType;
            this.progressText = str5;
            this.isActive = z;
            this.cashItem = cashPaymentTaskUiItem;
            this.cardItem = callGroup;
            this.status = cardCashPaymentTaskUiItem$PaymentStatus;
            this.isRequired = z2;
            this.taskId = str6;
            this.isOptional = z3;
            boolean z5 = true;
            if ((i & 8192) == 0) {
                if (cardCashPaymentTaskUiItem$PaymentStatus == CardCashPaymentTaskUiItem$PaymentStatus.SUCCESS) {
                    int i2 = write;
                    int i3 = i2 + 57;
                    IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    int i5 = i2 + 73;
                    IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        int i6 = 2 % 2;
                    }
                } else {
                    z5 = false;
                }
                this.isSuccess = z5;
                return;
            }
            this.isSuccess = z4;
            int i7 = write + 1;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                throw null;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 8191, NoopState_androidKtNoopState1.serializer.getDescriptor());
        throw null;
    }

    @Override // o.uiMode
    public final boolean write() {
        int i = 2 % 2;
        int i2 = write + 77;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.isOptional) {
            return true;
        }
        if (this.paymentType == CardCashPaymentTaskUiItem$PaymentType.CASH) {
            int i4 = IconCompatParcelizer;
            int i5 = i4 + 103;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i6;
            int i7 = i5 % 2;
            CashPaymentTaskUiItem cashPaymentTaskUiItem = this.cashItem;
            CashPaymentTaskUiItem.UiMode uiMode = null;
            if (cashPaymentTaskUiItem != null) {
                int i8 = i6 + 25;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    CashPaymentTaskUiItem.UiMode uiMode2 = cashPaymentTaskUiItem.uiMode;
                    throw null;
                }
                uiMode = cashPaymentTaskUiItem.uiMode;
            } else {
                int i9 = i4 + 47;
                write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
            }
            if (uiMode == CashPaymentTaskUiItem.UiMode.ViewPayment) {
                return true;
            }
        }
        return this.isSuccess;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((r3 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r1 != 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r1 != 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r1 = r2.currency;
        r2 = o.getEnterjXw82LU.IconCompatParcelizer + 27;
        o.getEnterjXw82LU.write = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if ((r2 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        r0 = 63 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r1 = r5.cashItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        r3 = o.getEnterjXw82LU.IconCompatParcelizer + 115;
        o.getEnterjXw82LU.write = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
        r0 = r1.currency;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        return r2.currency;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r3 = o.getEnterjXw82LU.write + 59;
        o.getEnterjXw82LU.IconCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String MediaSessionCompatQueueItem() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getEnterjXw82LU.write
            int r1 = r1 + 23
            int r2 = r1 % 128
            o.getEnterjXw82LU.IconCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1d
            int[] r1 = o.getParameters.IconCompatParcelizer
            com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentType r2 = r5.paymentType
            int r2 = r2.ordinal()
            r1 = r1[r2]
            o.CallGroup r2 = r5.cardItem
            if (r1 == 0) goto L54
            goto L2c
        L1d:
            int[] r1 = o.getParameters.IconCompatParcelizer
            com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentType r2 = r5.paymentType
            int r2 = r2.ordinal()
            r1 = r1[r2]
            o.CallGroup r2 = r5.cardItem
            r3 = 1
            if (r1 == r3) goto L54
        L2c:
            int r3 = o.getEnterjXw82LU.write
            int r3 = r3 + 59
            int r4 = r3 % 128
            o.getEnterjXw82LU.IconCompatParcelizer = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L3b
            r3 = 3
            if (r1 != r3) goto L4f
            goto L3d
        L3b:
            if (r1 != r0) goto L4f
        L3d:
            java.lang.String r1 = r2.currency
            int r2 = o.getEnterjXw82LU.IconCompatParcelizer
            int r2 = r2 + 27
            int r3 = r2 % 128
            o.getEnterjXw82LU.write = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L4e
            r0 = 63
            int r0 = r0 / 0
        L4e:
            return r1
        L4f:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer()
            r0 = 0
            return r0
        L54:
            com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem r1 = r5.cashItem
            if (r1 == 0) goto L67
            int r3 = o.getEnterjXw82LU.IconCompatParcelizer
            int r3 = r3 + 115
            int r4 = r3 % 128
            o.getEnterjXw82LU.write = r4
            int r3 = r3 % r0
            java.lang.String r0 = r1.currency
            if (r0 != 0) goto L66
            goto L67
        L66:
            return r0
        L67:
            java.lang.String r0 = r2.currency
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getEnterjXw82LU.MediaSessionCompatQueueItem():java.lang.String");
    }

    public final String RatingCompat() {
        String strRemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = write + 9;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = getParameters.IconCompatParcelizer[this.paymentType.ordinal()];
        CallGroup callGroup = this.cardItem;
        if (i4 == 1) {
            CashPaymentTaskUiItem cashPaymentTaskUiItem = this.cashItem;
            if (cashPaymentTaskUiItem == null || (strRemoteActionCompatParcelizer = cashPaymentTaskUiItem.RemoteActionCompatParcelizer()) == null) {
                return callGroup.formattedOriginalAmount;
            }
            int i5 = write + 5;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return strRemoteActionCompatParcelizer;
        }
        Object obj = null;
        if (i4 != 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        int i7 = write + 101;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return callGroup.formattedOriginalAmount;
        }
        String str = callGroup.formattedOriginalAmount;
        obj.hashCode();
        throw null;
    }

    public getEnterjXw82LU(String str, String str2, String str3, String str4, CardCashPaymentTaskUiItem$PaymentType cardCashPaymentTaskUiItem$PaymentType, String str5, boolean z, CashPaymentTaskUiItem cashPaymentTaskUiItem, CallGroup callGroup, CardCashPaymentTaskUiItem$PaymentStatus cardCashPaymentTaskUiItem$PaymentStatus, boolean z2, String str6, boolean z3) {
        boolean z4;
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        this.title = str;
        this.description = str2;
        this.successText = str3;
        this.successPaidWithText = str4;
        this.paymentType = cardCashPaymentTaskUiItem$PaymentType;
        this.progressText = str5;
        this.isActive = z;
        this.cashItem = cashPaymentTaskUiItem;
        this.cardItem = callGroup;
        this.status = cardCashPaymentTaskUiItem$PaymentStatus;
        this.isRequired = z2;
        this.taskId = str6;
        this.isOptional = z3;
        if (cardCashPaymentTaskUiItem$PaymentStatus == CardCashPaymentTaskUiItem$PaymentStatus.SUCCESS) {
            int i = IconCompatParcelizer + 45;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
            z4 = true;
        } else {
            int i4 = IconCompatParcelizer + 15;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z4 = false;
        }
        this.isSuccess = z4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a A[PHI: r3 r5 r6 r7
  0x003a: PHI (r3v11 java.lang.String) = (r3v4 java.lang.String), (r3v12 java.lang.String) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r6v2 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r7v2 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r3 r5 r6 r7
  0x002b: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v12 java.lang.String) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    public static getEnterjXw82LU write(getEnterjXw82LU getenterjxw82lu, CardCashPaymentTaskUiItem$PaymentType cardCashPaymentTaskUiItem$PaymentType, CashPaymentTaskUiItem cashPaymentTaskUiItem, CallGroup callGroup, CardCashPaymentTaskUiItem$PaymentStatus cardCashPaymentTaskUiItem$PaymentStatus, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        CardCashPaymentTaskUiItem$PaymentType cardCashPaymentTaskUiItem$PaymentType2;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 89;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        if (i3 % 2 != 0) {
            str = getenterjxw82lu.title;
            str2 = getenterjxw82lu.description;
            str3 = getenterjxw82lu.successText;
            str4 = getenterjxw82lu.successPaidWithText;
            if ((i & 83) != 0) {
                CardCashPaymentTaskUiItem$PaymentType cardCashPaymentTaskUiItem$PaymentType3 = getenterjxw82lu.paymentType;
                int i5 = i4 + 81;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                str5 = str;
                str6 = str2;
                str7 = str3;
                str8 = str4;
                cardCashPaymentTaskUiItem$PaymentType2 = cardCashPaymentTaskUiItem$PaymentType3;
            } else {
                cardCashPaymentTaskUiItem$PaymentType2 = cardCashPaymentTaskUiItem$PaymentType;
                str5 = str;
                str6 = str2;
                str7 = str3;
                str8 = str4;
            }
        } else {
            str = getenterjxw82lu.title;
            str2 = getenterjxw82lu.description;
            str3 = getenterjxw82lu.successText;
            str4 = getenterjxw82lu.successPaidWithText;
            if ((i & 16) != 0) {
                CardCashPaymentTaskUiItem$PaymentType cardCashPaymentTaskUiItem$PaymentType4 = getenterjxw82lu.paymentType;
                int i7 = i4 + 81;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                str5 = str;
                str6 = str2;
                str7 = str3;
                str8 = str4;
                cardCashPaymentTaskUiItem$PaymentType2 = cardCashPaymentTaskUiItem$PaymentType4;
            } else {
                cardCashPaymentTaskUiItem$PaymentType2 = cardCashPaymentTaskUiItem$PaymentType;
                str5 = str;
                str6 = str2;
                str7 = str3;
                str8 = str4;
            }
        }
        String str9 = getenterjxw82lu.progressText;
        boolean z = getenterjxw82lu.isActive;
        CashPaymentTaskUiItem cashPaymentTaskUiItem2 = (i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? getenterjxw82lu.cashItem : cashPaymentTaskUiItem;
        CallGroup callGroup2 = (i & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? getenterjxw82lu.cardItem : callGroup;
        CardCashPaymentTaskUiItem$PaymentStatus cardCashPaymentTaskUiItem$PaymentStatus2 = (i & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? getenterjxw82lu.status : cardCashPaymentTaskUiItem$PaymentStatus;
        boolean z2 = getenterjxw82lu.isRequired;
        String str10 = getenterjxw82lu.taskId;
        boolean z3 = getenterjxw82lu.isOptional;
        getenterjxw82lu.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        cardCashPaymentTaskUiItem$PaymentType2.getClass();
        str9.getClass();
        callGroup2.getClass();
        cardCashPaymentTaskUiItem$PaymentStatus2.getClass();
        str10.getClass();
        return new getEnterjXw82LU(str5, str6, str7, str8, cardCashPaymentTaskUiItem$PaymentType2, str9, z, cashPaymentTaskUiItem2, callGroup2, cardCashPaymentTaskUiItem$PaymentStatus2, z2, str10, z3);
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = write + 23;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.successText), 31, this.successPaidWithText);
        int iM2 = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((this.paymentType.hashCode() + iM) * 31, 31, this.progressText), 31, this.isActive);
        CashPaymentTaskUiItem cashPaymentTaskUiItem = this.cashItem;
        if (cashPaymentTaskUiItem == null) {
            i = 0;
        } else {
            int iHashCode = cashPaymentTaskUiItem.hashCode();
            int i5 = write + 107;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode;
        }
        int iHashCode2 = this.cardItem.hashCode();
        return Boolean.hashCode(this.isOptional) + af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((this.status.hashCode() + ((iHashCode2 + ((iM2 + i) * 31)) * 31)) * 31, 31, this.isRequired), 31, this.taskId);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CardCashPaymentTaskUiItem(title=", this.title, ", description=", this.description, ", successText=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.successText, ", successPaidWithText=", this.successPaidWithText, ", paymentType=");
        sbM.append(this.paymentType);
        sbM.append(", progressText=");
        sbM.append(this.progressText);
        sbM.append(", isActive=");
        sbM.append(this.isActive);
        sbM.append(", cashItem=");
        sbM.append(this.cashItem);
        sbM.append(", cardItem=");
        sbM.append(this.cardItem);
        sbM.append(", status=");
        sbM.append(this.status);
        sbM.append(", isRequired=");
        IconCompatParcelizer.RemoteActionCompatParcelizer(", taskId=", this.taskId, ", isOptional=", sbM, this.isRequired);
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.isOptional, ")");
        int i4 = IconCompatParcelizer + 91;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getEnterjXw82LU)) {
            return false;
        }
        getEnterjXw82LU getenterjxw82lu = (getEnterjXw82LU) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getenterjxw82lu.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, getenterjxw82lu.description}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.successText, getenterjxw82lu.successText}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.successPaidWithText, getenterjxw82lu.successPaidWithText}, getCieXyz.write())).booleanValue() || this.paymentType != getenterjxw82lu.paymentType) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.progressText, getenterjxw82lu.progressText}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.isActive == getenterjxw82lu.isActive) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cashItem, getenterjxw82lu.cashItem}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cardItem, getenterjxw82lu.cardItem}, getCieXyz.write())).booleanValue() || this.status != getenterjxw82lu.status || this.isRequired != getenterjxw82lu.isRequired) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.taskId, getenterjxw82lu.taskId}, getCieXyz.write())).booleanValue() && this.isOptional == getenterjxw82lu.isOptional;
            }
            int i2 = write + 33;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = write + 39;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final CardCashPaymentTaskUiItem$PaymentStatus MediaBrowserCompatMediaItem() {
        int iIconCompatParcelizer = getCurrentAnimation.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getCurrentAnimation.IconCompatParcelizer();
        return (CardCashPaymentTaskUiItem$PaymentStatus) write(getCurrentAnimation.IconCompatParcelizer(), iIconCompatParcelizer, -117447860, getCurrentAnimation.IconCompatParcelizer(), 117447861, new Object[]{this}, iIconCompatParcelizer2);
    }

    public final CardCashPaymentTaskUiItem$PaymentType MediaMetadataCompat() {
        int iIconCompatParcelizer = getCurrentAnimation.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getCurrentAnimation.IconCompatParcelizer();
        return (CardCashPaymentTaskUiItem$PaymentType) write(getCurrentAnimation.IconCompatParcelizer(), iIconCompatParcelizer, -1083506336, getCurrentAnimation.IconCompatParcelizer(), 1083506336, new Object[]{this}, iIconCompatParcelizer2);
    }
}
