package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$AcceptData$Pin$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidDialog_androidKtDialogLayout11;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AndroidDialog_androidKtDialogLayout111 {
    public static final StateV3$AcceptData$Pin$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$Pin$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 121;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AndroidDialog_androidKtDialogLayout11 androidDialog_androidKtDialogLayout11 = AndroidDialog_androidKtDialogLayout11.RemoteActionCompatParcelizer;
            int i4 = read + 95;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return androidDialog_androidKtDialogLayout11;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final BringIntoViewNoderequester1 address;
    public final String addressId;
    public final boolean highlighted;
    public final boolean isCustomer;
    public final boolean isNewCustomer;
    public final boolean isNewVendor;
    public final boolean isPickedUp;
    public final boolean isVendor;
    public final int order;
    public final boolean small;
    public final String style;
    public final String type;

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = (~(i7 | i)) | i6;
        int i9 = (~(i7 | (~i))) | (~((~i6) | i7)) | (~(i6 | i2 | i));
        int i10 = ~(i | i6);
        int i11 = i6 + i2 + i3 + ((-813770285) * i4) + (135932771 * i5);
        int i12 = i11 * i11;
        int i13 = (526900465 * i6) + 74317824 + ((-1745228167) * i2) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i3) + (1331953664 * i4) + ((-366739456) * i5) + ((-1308753920) * i12);
        int i14 = (i6 * 1149714451) + 247108311 + (i2 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i3 * 1149713731) + (i4 * 1918847289) + (i5 * (-2006650391)) + (i12 * 460980224);
        return i13 + ((i14 * i14) * (-1418592256)) != 1 ? serializer(objArr) : read(objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$Pin$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 63;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        AndroidDialog_androidKtDialogLayout111 androidDialog_androidKtDialogLayout111 = (AndroidDialog_androidKtDialogLayout111) objArr[0];
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 97;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean z = androidDialog_androidKtDialogLayout111.isNewCustomer;
        int i5 = i2 + 65;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return Boolean.valueOf(z);
        }
        int i6 = 24 / 0;
        return Boolean.valueOf(z);
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        AndroidDialog_androidKtDialogLayout111 androidDialog_androidKtDialogLayout111 = (AndroidDialog_androidKtDialogLayout111) objArr[0];
        int i = 2 % 2;
        int i2 = read + 103;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = androidDialog_androidKtDialogLayout111.small;
            obj.hashCode();
            throw null;
        }
        boolean z2 = androidDialog_androidKtDialogLayout111.small;
        int i4 = i3 + 27;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(z2);
        }
        throw null;
    }

    public final BringIntoViewNoderequester1 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 115;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        BringIntoViewNoderequester1 bringIntoViewNoderequester1 = this.address;
        int i5 = i2 + 13;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return bringIntoViewNoderequester1;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = read + 93;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.isNewVendor;
        }
        int i3 = 21 / 0;
        return this.isNewVendor;
    }

    public final boolean MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = read + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        boolean z = this.isPickedUp;
        int i5 = i3 + 31;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean RatingCompat() {
        int i = 2 % 2;
        int i2 = read + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.isVendor;
        }
        throw null;
    }

    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.isCustomer;
        int i4 = i3 + 101;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return z;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.style;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean write() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 17;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean z = this.highlighted;
        int i5 = i2 + 89;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00df  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:40:0x012c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0161  */
    /* JADX WARN: Code duplicated, block: B:44:0x0169  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x0221  */
    /* JADX WARN: Code duplicated, block: B:56:0x0230  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public /* synthetic */ AndroidDialog_androidKtDialogLayout111(int i, String str, BringIntoViewNoderequester1 bringIntoViewNoderequester1, String str2, boolean z, int i2, String str3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        boolean zBooleanValue;
        int i3;
        int i4;
        int i5;
        if (3 != (i & 3)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, AndroidDialog_androidKtDialogLayout11.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        this.type = str;
        this.address = bringIntoViewNoderequester1;
        if ((i & 4) == 0) {
            this.addressId = null;
            int i6 = 2 % 2;
        } else {
            this.addressId = str2;
        }
        if ((i & 8) == 0) {
            this.highlighted = false;
            int i7 = read + 35;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
            }
            if ((i & 16) == 0) {
                this.order = 0;
            } else {
                this.order = i2;
            }
            if ((i & 32) == 0) {
                int i8 = serializer + 73;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                this.style = "";
            } else {
                this.style = str3;
            }
            if ((i & 64) == 0) {
                this.small = false;
            } else {
                this.small = z2;
            }
            if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
                int iWrite = getCieXyz.write();
                int iWrite2 = getCieXyz.write();
                int iWrite3 = getCieXyz.write();
                this.isVendor = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, "vendor"}, iWrite3)).booleanValue();
            } else {
                this.isVendor = z3;
            }
            if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
                int iWrite4 = getCieXyz.write();
                int iWrite5 = getCieXyz.write();
                int iWrite6 = getCieXyz.write();
                this.isCustomer = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{str, "customer"}, iWrite6)).booleanValue();
            } else {
                this.isCustomer = z4;
            }
            if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
                i5 = read + 59;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int iWrite7 = getCieXyz.write();
                    int iWrite8 = getCieXyz.write();
                    int iWrite9 = getCieXyz.write();
                    this.isNewVendor = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite7, 1803334089, -1803334089, getCieXyz.write(), iWrite8, new Object[]{str, "new_vendor"}, iWrite9)).booleanValue();
                    int i10 = 31 / 0;
                } else {
                    int iWrite10 = getCieXyz.write();
                    int iWrite11 = getCieXyz.write();
                    int iWrite12 = getCieXyz.write();
                    this.isNewVendor = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite10, 1803334089, -1803334089, getCieXyz.write(), iWrite11, new Object[]{str, "new_vendor"}, iWrite12)).booleanValue();
                }
            } else {
                this.isNewVendor = z5;
            }
            if ((i & androidx.compose.ui.graphics.Fields.RotationZ) == 0) {
                int i11 = serializer + 55;
                read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                int iWrite13 = getCieXyz.write();
                int iWrite14 = getCieXyz.write();
                int iWrite15 = getCieXyz.write();
                this.isNewCustomer = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite13, 1803334089, -1803334089, getCieXyz.write(), iWrite14, new Object[]{str, "new_customer"}, iWrite15)).booleanValue();
                int i13 = 2 % 2;
            } else {
                this.isNewCustomer = z6;
            }
            if ((i & androidx.compose.ui.graphics.Fields.CameraDistance) == 0) {
                i4 = serializer + 79;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int iWrite16 = getCieXyz.write();
                    int iWrite17 = getCieXyz.write();
                    int iWrite18 = getCieXyz.write();
                    ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite16, 1803334089, -1803334089, getCieXyz.write(), iWrite17, new Object[]{str, "picked_up"}, iWrite18)).booleanValue();
                    throw null;
                }
                int iWrite19 = getCieXyz.write();
                int iWrite20 = getCieXyz.write();
                int iWrite21 = getCieXyz.write();
                zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite19, 1803334089, -1803334089, getCieXyz.write(), iWrite20, new Object[]{str, "picked_up"}, iWrite21)).booleanValue();
            } else {
                zBooleanValue = z7;
            }
            this.isPickedUp = zBooleanValue;
            i3 = serializer + 9;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i14 = 23 / 0;
            }
        }
        this.highlighted = z;
        int i15 = 2 % 2;
        if ((i & 16) == 0) {
            this.order = 0;
        } else {
            this.order = i2;
        }
        if ((i & 32) == 0) {
            int i16 = serializer + 73;
            read = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i17 = i16 % 2;
            this.style = "";
        } else {
            this.style = str3;
        }
        if ((i & 64) == 0) {
            this.small = false;
        } else {
            this.small = z2;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            int iWrite22 = getCieXyz.write();
            int iWrite23 = getCieXyz.write();
            int iWrite24 = getCieXyz.write();
            this.isVendor = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite22, 1803334089, -1803334089, getCieXyz.write(), iWrite23, new Object[]{str, "vendor"}, iWrite24)).booleanValue();
        } else {
            this.isVendor = z3;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            int iWrite25 = getCieXyz.write();
            int iWrite26 = getCieXyz.write();
            int iWrite27 = getCieXyz.write();
            this.isCustomer = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite25, 1803334089, -1803334089, getCieXyz.write(), iWrite26, new Object[]{str, "customer"}, iWrite27)).booleanValue();
        } else {
            this.isCustomer = z4;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            i5 = read + 59;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int iWrite28 = getCieXyz.write();
                int iWrite29 = getCieXyz.write();
                int iWrite30 = getCieXyz.write();
                this.isNewVendor = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite28, 1803334089, -1803334089, getCieXyz.write(), iWrite29, new Object[]{str, "new_vendor"}, iWrite30)).booleanValue();
                int i18 = 31 / 0;
            } else {
                int iWrite110 = getCieXyz.write();
                int iWrite111 = getCieXyz.write();
                int iWrite112 = getCieXyz.write();
                this.isNewVendor = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite110, 1803334089, -1803334089, getCieXyz.write(), iWrite111, new Object[]{str, "new_vendor"}, iWrite112)).booleanValue();
            }
        } else {
            this.isNewVendor = z5;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationZ) == 0) {
            int i19 = serializer + 55;
            read = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i110 = i19 % 2;
            int iWrite113 = getCieXyz.write();
            int iWrite114 = getCieXyz.write();
            int iWrite115 = getCieXyz.write();
            this.isNewCustomer = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite113, 1803334089, -1803334089, getCieXyz.write(), iWrite114, new Object[]{str, "new_customer"}, iWrite115)).booleanValue();
            int i111 = 2 % 2;
        } else {
            this.isNewCustomer = z6;
        }
        if ((i & androidx.compose.ui.graphics.Fields.CameraDistance) == 0) {
            i4 = serializer + 79;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int iWrite116 = getCieXyz.write();
                int iWrite117 = getCieXyz.write();
                int iWrite118 = getCieXyz.write();
                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite116, 1803334089, -1803334089, getCieXyz.write(), iWrite117, new Object[]{str, "picked_up"}, iWrite118)).booleanValue();
                throw null;
            }
            int iWrite119 = getCieXyz.write();
            int iWrite210 = getCieXyz.write();
            int iWrite211 = getCieXyz.write();
            zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite119, 1803334089, -1803334089, getCieXyz.write(), iWrite210, new Object[]{str, "picked_up"}, iWrite211)).booleanValue();
        } else {
            zBooleanValue = z7;
        }
        this.isPickedUp = zBooleanValue;
        i3 = serializer + 9;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i112 = 23 / 0;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 55;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.type.hashCode();
        int iHashCode3 = this.address.hashCode();
        String str = this.addressId;
        if (str == null) {
            int i4 = read + 91;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return Boolean.hashCode(this.small) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.order, d$$ExternalSyntheticOutline0.m((((iHashCode3 + (iHashCode2 * 31)) * 31) + iHashCode) * 31, 31, this.highlighted), 31), 31, this.style);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Pin(type=");
        sb.append(this.type);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", addressId=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.addressId, ", highlighted=", ", order=", sb, this.highlighted);
        sb.append(this.order);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", small=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.small, ")");
        int i2 = read + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 83;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 43;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof AndroidDialog_androidKtDialogLayout111)) {
            return false;
        }
        AndroidDialog_androidKtDialogLayout111 androidDialog_androidKtDialogLayout111 = (AndroidDialog_androidKtDialogLayout111) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, androidDialog_androidKtDialogLayout111.type}, getCieXyz.write())).booleanValue()) {
            int i7 = read + 103;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, androidDialog_androidKtDialogLayout111.address}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.addressId, androidDialog_androidKtDialogLayout111.addressId}, getCieXyz.write())).booleanValue()) {
            int i9 = serializer + 113;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (this.highlighted != androidDialog_androidKtDialogLayout111.highlighted) {
            int i11 = serializer + 115;
            read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return false;
        }
        if (this.order == androidDialog_androidKtDialogLayout111.order) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, androidDialog_androidKtDialogLayout111.style}, getCieXyz.write())).booleanValue() && this.small == androidDialog_androidKtDialogLayout111.small;
        }
        int i13 = serializer + 79;
        read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i13 % 2 == 0;
    }

    public final boolean MediaMetadataCompat() {
        return ((Boolean) write(getQueryParameterslambda2.serializer(), -1360330102, getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 1360330103, new Object[]{this})).booleanValue();
    }

    public final boolean serializer() {
        return ((Boolean) write(getQueryParameterslambda2.serializer(), 814904739, getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -814904739, new Object[]{this})).booleanValue();
    }
}
