package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.huawei.hms.location.ActivityIdentificationData;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$PaymentStatus;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$PaymentType;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.accessgetDisplayNamejd;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: renamed from: o.provider, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class C0195provider implements uiMode {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final QrPaymentTaskUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            accessgetDisplayNamejd accessgetdisplaynamejd;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 39;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                accessgetdisplaynamejd = accessgetDisplayNamejd.read;
                int i3 = 37 / 0;
            } else {
                accessgetdisplaynamejd = accessgetDisplayNamejd.read;
            }
            int i4 = IconCompatParcelizer + 1;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return accessgetdisplaynamejd;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final CashPaymentTaskUiItem cashPaymentTaskUiItem;
    public final String currency;
    public final QrPaymentTaskUiItem$PaymentType defaultPaymentType;
    public final boolean isOptional;
    public final getDisplayName qrCode;
    public final Wallpaper status;
    public final ComposeAnimationState switchToCashButton;
    public final ComposeAnimationState switchToQrCodeButton;
    public final String taskId;
    public final List trackingEvents;

    public static /* synthetic */ Object read(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i5)) | i3;
        int i9 = ~i3;
        int i10 = ~(i7 | i9);
        int i11 = ~i5;
        int i12 = i10 | (~(i9 | i11));
        int i13 = (~(i5 | i9)) | (~(i7 | i11));
        int i14 = i2 + i3 + i6 + (417615942 * i) + (566850886 * i4);
        int i15 = i14 * i14;
        int i16 = ((-370608051) * i2) + 147849216 + ((-2147356519) * i3) + (i8 * 1776748468) + (i12 * 1776748468) + (1776748468 * i13) + (1406140416 * i6) + ((-354418688) * i) + ((-85983232) * i4) + ((-608960512) * i15);
        int i17 = (i2 * (-1357469509)) + 140661806 + (i3 * (-1357469617)) + (i8 * ActivityIdentificationData.RUNNING) + (i12 * ActivityIdentificationData.RUNNING) + (i13 * ActivityIdentificationData.RUNNING) + (i6 * (-1357469401)) + (i * 1137340586) + (i4 * 304092074) + (i15 * 1282146304);
        return i16 + ((i17 * i17) * 1158414336) != 1 ? read(objArr) : write(objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fontScale(9)), null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fontScale(10))};
        int i = read + 41;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        C0195provider c0195provider = (C0195provider) objArr[0];
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 75;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = c0195provider.taskId;
        int i5 = i2 + 13;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final QrPaymentTaskUiItem$PaymentType MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = write + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.defaultPaymentType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CashPaymentTaskUiItem RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        CashPaymentTaskUiItem cashPaymentTaskUiItem = this.cashPaymentTaskUiItem;
        int i4 = i3 + 93;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return cashPaymentTaskUiItem;
    }

    @Override // o.uiMode
    public final boolean read() {
        int i = 2 % 2;
        int i2 = write + 81;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        boolean z = this.isOptional;
        int i5 = i3 + 31;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ C0195provider(int i, String str, boolean z, QrPaymentTaskUiItem$PaymentType qrPaymentTaskUiItem$PaymentType, ComposeAnimationState composeAnimationState, ComposeAnimationState composeAnimationState2, getDisplayName getdisplayname, CashPaymentTaskUiItem cashPaymentTaskUiItem, String str2, Wallpaper wallpaper, List list) {
        if (1023 == (i & 1023)) {
            this.taskId = str;
            this.isOptional = z;
            this.defaultPaymentType = qrPaymentTaskUiItem$PaymentType;
            this.switchToCashButton = composeAnimationState;
            this.switchToQrCodeButton = composeAnimationState2;
            this.qrCode = getdisplayname;
            this.cashPaymentTaskUiItem = cashPaymentTaskUiItem;
            this.currency = str2;
            this.status = wallpaper;
            this.trackingEvents = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1023, accessgetDisplayNamejd.read.getDescriptor());
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        QrPaymentTaskUiItem$PaymentStatus qrPaymentTaskUiItem$PaymentStatus;
        C0195provider c0195provider = (C0195provider) objArr[0];
        int i = 2 % 2;
        int i2 = serializer + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        Wallpaper wallpaper = c0195provider.status;
        if (wallpaper != null) {
            qrPaymentTaskUiItem$PaymentStatus = wallpaper.value;
        } else {
            int i5 = i3 + 123;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 5 / 2;
            }
            qrPaymentTaskUiItem$PaymentStatus = null;
        }
        if (qrPaymentTaskUiItem$PaymentStatus != QrPaymentTaskUiItem$PaymentStatus.SUCCESS) {
            return false;
        }
        int i7 = serializer + 11;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }

    public final boolean MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = serializer + 37;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        QrPaymentTaskUiItem$PaymentStatus qrPaymentTaskUiItem$PaymentStatus = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        Wallpaper wallpaper = this.status;
        if (wallpaper != null) {
            int i4 = i3 + 113;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            qrPaymentTaskUiItem$PaymentStatus = wallpaper.value;
        }
        if (qrPaymentTaskUiItem$PaymentStatus != QrPaymentTaskUiItem$PaymentStatus.FAILURE) {
            return false;
        }
        int i6 = write + 113;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }

    public final QrPaymentTaskUiItem$PaymentType serializer() {
        int i = 2 % 2;
        int i2 = write + 27;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            MediaSessionCompatQueueItem();
            obj.hashCode();
            throw null;
        }
        if (MediaSessionCompatQueueItem() || this.qrCode == null) {
            QrPaymentTaskUiItem$PaymentType qrPaymentTaskUiItem$PaymentType = QrPaymentTaskUiItem$PaymentType.CASH;
            int i3 = serializer + 15;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return qrPaymentTaskUiItem$PaymentType;
        }
        if (!(!((Boolean) read(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -9058359, 9058359, new Object[]{this}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read())).booleanValue())) {
            int i5 = write + 107;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return QrPaymentTaskUiItem$PaymentType.QR_CODE;
            }
            QrPaymentTaskUiItem$PaymentType qrPaymentTaskUiItem$PaymentType2 = QrPaymentTaskUiItem$PaymentType.QR_CODE;
            obj.hashCode();
            throw null;
        }
        QrPaymentTaskUiItem$PaymentType qrPaymentTaskUiItem$PaymentType3 = this.defaultPaymentType;
        int i6 = serializer + 71;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return qrPaymentTaskUiItem$PaymentType3;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.uiMode
    public final boolean write() {
        int i = 2 % 2;
        if (this.isOptional) {
            return true;
        }
        int i2 = serializer + 103;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            serializer();
            QrPaymentTaskUiItem$PaymentType qrPaymentTaskUiItem$PaymentType = QrPaymentTaskUiItem$PaymentType.CASH;
            throw null;
        }
        if (serializer() == QrPaymentTaskUiItem$PaymentType.CASH && this.cashPaymentTaskUiItem.write()) {
            return true;
        }
        int i3 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        int i4 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        if (((Boolean) read(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -9058359, 9058359, new Object[]{this}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), i3, i4)).booleanValue()) {
            return true;
        }
        int i5 = serializer + 15;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public C0195provider(String str, boolean z, QrPaymentTaskUiItem$PaymentType qrPaymentTaskUiItem$PaymentType, ComposeAnimationState composeAnimationState, ComposeAnimationState composeAnimationState2, getDisplayName getdisplayname, CashPaymentTaskUiItem cashPaymentTaskUiItem, String str2, Wallpaper wallpaper, List list) {
        str.getClass();
        qrPaymentTaskUiItem$PaymentType.getClass();
        list.getClass();
        this.taskId = str;
        this.isOptional = z;
        this.defaultPaymentType = qrPaymentTaskUiItem$PaymentType;
        this.switchToCashButton = composeAnimationState;
        this.switchToQrCodeButton = composeAnimationState2;
        this.qrCode = getdisplayname;
        this.cashPaymentTaskUiItem = cashPaymentTaskUiItem;
        this.currency = str2;
        this.status = wallpaper;
        this.trackingEvents = list;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[PHI: r2 r3
  0x0026: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v12 java.lang.String) binds: [B:9:0x0024, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r3v2 boolean) = (r3v1 boolean), (r3v5 boolean) binds: [B:9:0x0024, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019 A[PHI: r2 r3
  0x0019: PHI (r2v11 java.lang.String) = (r2v4 java.lang.String), (r2v12 java.lang.String) binds: [B:9:0x0024, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0019: PHI (r3v4 boolean) = (r3v1 boolean), (r3v5 boolean) binds: [B:9:0x0024, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    public static C0195provider read(C0195provider c0195provider, QrPaymentTaskUiItem$PaymentType qrPaymentTaskUiItem$PaymentType, CashPaymentTaskUiItem cashPaymentTaskUiItem, int i) {
        String str;
        boolean z;
        String str2;
        boolean z2;
        QrPaymentTaskUiItem$PaymentType qrPaymentTaskUiItem$PaymentType2;
        int i2 = 2 % 2;
        int i3 = write + 81;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = c0195provider.taskId;
            z = c0195provider.isOptional;
            if ((i & 4) != 0) {
                str2 = str;
                z2 = z;
                qrPaymentTaskUiItem$PaymentType2 = c0195provider.defaultPaymentType;
            } else {
                qrPaymentTaskUiItem$PaymentType2 = qrPaymentTaskUiItem$PaymentType;
                str2 = str;
                z2 = z;
            }
        } else {
            str = c0195provider.taskId;
            z = c0195provider.isOptional;
            if ((i & 4) != 0) {
                str2 = str;
                z2 = z;
                qrPaymentTaskUiItem$PaymentType2 = c0195provider.defaultPaymentType;
            } else {
                qrPaymentTaskUiItem$PaymentType2 = qrPaymentTaskUiItem$PaymentType;
                str2 = str;
                z2 = z;
            }
        }
        ComposeAnimationState composeAnimationState = c0195provider.switchToCashButton;
        ComposeAnimationState composeAnimationState2 = c0195provider.switchToQrCodeButton;
        getDisplayName getdisplayname = c0195provider.qrCode;
        CashPaymentTaskUiItem cashPaymentTaskUiItem2 = (i & 64) != 0 ? c0195provider.cashPaymentTaskUiItem : cashPaymentTaskUiItem;
        String str3 = c0195provider.currency;
        Wallpaper wallpaper = c0195provider.status;
        List list = c0195provider.trackingEvents;
        c0195provider.getClass();
        str2.getClass();
        qrPaymentTaskUiItem$PaymentType2.getClass();
        cashPaymentTaskUiItem2.getClass();
        list.getClass();
        C0195provider c0195provider2 = new C0195provider(str2, z2, qrPaymentTaskUiItem$PaymentType2, composeAnimationState, composeAnimationState2, getdisplayname, cashPaymentTaskUiItem2, str3, wallpaper, list);
        int i4 = serializer + 119;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return c0195provider2;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = serializer + 97;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(this.taskId.hashCode() * 31, 31, this.isOptional);
        int iHashCode4 = this.defaultPaymentType.hashCode();
        ComposeAnimationState composeAnimationState = this.switchToCashButton;
        int iHashCode5 = composeAnimationState == null ? 0 : composeAnimationState.hashCode();
        ComposeAnimationState composeAnimationState2 = this.switchToQrCodeButton;
        if (composeAnimationState2 == null) {
            int i4 = write + 107;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = composeAnimationState2.hashCode();
            int i6 = serializer + 87;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        getDisplayName getdisplayname = this.qrCode;
        if (getdisplayname == null) {
            int i8 = serializer + 125;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = getdisplayname.hashCode();
        }
        int iHashCode6 = this.cashPaymentTaskUiItem.hashCode();
        String str = this.currency;
        if (str == null) {
            int i10 = serializer + 101;
            write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str.hashCode();
        }
        Wallpaper wallpaper = this.status;
        return this.trackingEvents.hashCode() + ((((((iHashCode6 + ((((((((iHashCode4 + iM) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31)) * 31) + iHashCode3) * 31) + (wallpaper != null ? wallpaper.hashCode() : 0)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 81;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("QrPaymentTaskUiItem(taskId=", this.taskId, ", isOptional=", ", defaultPaymentType=", this.isOptional);
        sbM.append(this.defaultPaymentType);
        sbM.append(", switchToCashButton=");
        sbM.append(this.switchToCashButton);
        sbM.append(", switchToQrCodeButton=");
        sbM.append(this.switchToQrCodeButton);
        sbM.append(", qrCode=");
        sbM.append(this.qrCode);
        sbM.append(", cashPaymentTaskUiItem=");
        sbM.append(this.cashPaymentTaskUiItem);
        sbM.append(", currency=");
        sbM.append(this.currency);
        sbM.append(", status=");
        sbM.append(this.status);
        sbM.append(", trackingEvents=");
        sbM.append(this.trackingEvents);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 93;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0195provider) {
            C0195provider c0195provider = (C0195provider) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.taskId, c0195provider.taskId}, getCieXyz.write())).booleanValue()) {
                if (this.isOptional == c0195provider.isOptional) {
                    if (this.defaultPaymentType != c0195provider.defaultPaymentType) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.switchToCashButton, c0195provider.switchToCashButton}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.switchToQrCodeButton, c0195provider.switchToQrCodeButton}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.qrCode, c0195provider.qrCode}, getCieXyz.write())).booleanValue()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cashPaymentTaskUiItem, c0195provider.cashPaymentTaskUiItem}, getCieXyz.write())).booleanValue()) {
                                return false;
                            }
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.currency, c0195provider.currency}, getCieXyz.write())).booleanValue()) {
                                int i2 = write + 25;
                                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i3 = i2 % 2;
                                return false;
                            }
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.status, c0195provider.status}, getCieXyz.write())).booleanValue()) {
                                return false;
                            }
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, c0195provider.trackingEvents}, getCieXyz.write())).booleanValue()) {
                                return true;
                            }
                            int i4 = write + 93;
                            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i5 = i4 % 2;
                            return false;
                        }
                        int i6 = write + 83;
                        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i6 % 2 != 0) {
                            return false;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    int i7 = serializer + 95;
                    write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return false;
                }
                int i9 = serializer + 103;
                write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i9 % 2 != 0;
            }
            int i10 = serializer + 83;
            write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = write + 15;
        serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return false;
    }

    public final boolean RatingCompat() {
        int i = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        int i2 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        return ((Boolean) read(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -9058359, 9058359, new Object[]{this}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), i, i2)).booleanValue();
    }

    @Override // o.uiMode
    public final String IconCompatParcelizer() {
        int i = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        int i2 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        return (String) read(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 555183992, -555183991, new Object[]{this}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), i, i2);
    }
}
