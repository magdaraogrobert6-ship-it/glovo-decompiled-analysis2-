package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$ExternalComponents$CustomerChat$ChatDelivery$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidPopup_androidKtPopup71;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AndroidPopup_androidKtPopup81 {
    public static final StateV3$ExternalComponents$CustomerChat$ChatDelivery$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$ExternalComponents$CustomerChat$ChatDelivery$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 47;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return AndroidPopup_androidKtPopup71.RemoteActionCompatParcelizer;
            }
            AndroidPopup_androidKtPopup71 androidPopup_androidKtPopup71 = AndroidPopup_androidKtPopup71.RemoteActionCompatParcelizer;
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String action;
    public final String amount;
    public final String channelId;
    public final String comments;
    public final String confirmationNumber;
    public final String customerAddress;
    public final String customerName;
    public final String customerPhoneNumber;
    public final long id;
    public final Integer vendorOrderNumber;

    public static /* synthetic */ Object serializer(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i3);
        int i9 = (~(i7 | (~i3) | i6)) | (~(i6 | i | i3));
        int i10 = ~i6;
        int i11 = (~(i3 | i)) | (~(i10 | i3)) | (~(i10 | i));
        int i12 = i6 + i + i4 + (1698977638 * i5) + (1466394737 * i2);
        int i13 = i12 * i12;
        int i14 = (((-1250291696) * i6) - 490274816) + ((-1116082190) * i) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i4) + (1553727488 * i5) + (1859780608 * i2) + (925827072 * i13);
        int i15 = ((i6 * (-1787956080)) - 1478154965) + (i * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + (i4 * (-1787955639)) + (i5 * 552005654) + (i2 * (-2013897159)) + (i13 * (-429457408));
        return i14 + ((i15 * i15) * (-402587648)) != 1 ? read(objArr) : serializer(objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$ExternalComponents$CustomerChat$ChatDelivery$Companion] */
    static {
        int i = serializer + 43;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.confirmationNumber;
        int i5 = i3 + 35;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = write + 1;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.customerName;
        }
        int i3 = 21 / 0;
        return this.customerName;
    }

    public final Integer MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 77;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Integer num = this.vendorOrderNumber;
        int i5 = i2 + 125;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return num;
    }

    public final String MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = read + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.customerPhoneNumber;
        int i5 = i3 + 33;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 7;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.customerAddress;
        int i5 = i2 + 13;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final long RatingCompat() {
        int i = 2 % 2;
        int i2 = read + 49;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.id;
        }
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.action;
        int i4 = i3 + 81;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return str;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 109;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.channelId;
        int i4 = i2 + 89;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = write + 113;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.amount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = write + 27;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.comments;
        int i4 = i3 + 29;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    public /* synthetic */ AndroidPopup_androidKtPopup81(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8) {
        int i2;
        Object obj = null;
        if (31 != (i & 31)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, AndroidPopup_androidKtPopup71.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        this.id = j;
        this.channelId = str;
        this.confirmationNumber = str2;
        this.action = str3;
        this.customerName = str4;
        if ((i & 32) == 0) {
            this.customerPhoneNumber = null;
        } else {
            this.customerPhoneNumber = str5;
        }
        if ((i & 64) == 0) {
            int i3 = write;
            int i4 = i3 + 25;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            this.customerAddress = null;
            int i6 = i3 + 111;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            this.customerAddress = str6;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            this.vendorOrderNumber = null;
        } else {
            this.vendorOrderNumber = num;
            int i9 = 2 % 2;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.amount = "";
            int i10 = read + 41;
            write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
            }
            if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
                this.comments = str8;
                return;
            }
            i2 = write + 79;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                this.comments = null;
            } else {
                this.comments = null;
                obj.hashCode();
                throw null;
            }
        }
        this.amount = str7;
        int i11 = 2 % 2;
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            this.comments = str8;
            return;
        }
        i2 = write + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.comments = null;
        } else {
            this.comments = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        AndroidPopup_androidKtPopup81 androidPopup_androidKtPopup81 = (AndroidPopup_androidKtPopup81) objArr[0];
        int i = 2 % 2;
        int i2 = read + 33;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("ChatDelivery(id=", ", channelId=", androidPopup_androidKtPopup81.id, androidPopup_androidKtPopup81.channelId);
        c8$$ExternalSyntheticOutline0.m(sb, ", confirmationNumber=", androidPopup_androidKtPopup81.confirmationNumber, ", action=", androidPopup_androidKtPopup81.action);
        c8$$ExternalSyntheticOutline0.m(sb, ", customerName=", androidPopup_androidKtPopup81.customerName, ", customerPhoneNumber=", androidPopup_androidKtPopup81.customerPhoneNumber);
        sb.append(", customerAddress=");
        sb.append(androidPopup_androidKtPopup81.customerAddress);
        sb.append(", vendorOrderNumber=");
        sb.append(androidPopup_androidKtPopup81.vendorOrderNumber);
        c8$$ExternalSyntheticOutline0.m(sb, ", amount=", androidPopup_androidKtPopup81.amount, ", comments=", androidPopup_androidKtPopup81.comments);
        sb.append(")");
        String string = sb.toString();
        int i4 = write + 15;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        int iHashCode;
        int iHashCode2;
        AndroidPopup_androidKtPopup81 androidPopup_androidKtPopup81 = (AndroidPopup_androidKtPopup81) objArr[0];
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Long.hashCode(androidPopup_androidKtPopup81.id) * 31, 31, androidPopup_androidKtPopup81.channelId), 31, androidPopup_androidKtPopup81.confirmationNumber), 31, androidPopup_androidKtPopup81.action), 31, androidPopup_androidKtPopup81.customerName);
        String str = androidPopup_androidKtPopup81.customerPhoneNumber;
        if (str == null) {
            int i2 = write + 27;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = androidPopup_androidKtPopup81.customerAddress;
        if (str2 == null) {
            int i4 = read + 25;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        Integer num = androidPopup_androidKtPopup81.vendorOrderNumber;
        int iM2 = af$$ExternalSyntheticOutline0.m((((((iM + iHashCode) * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode())) * 31, 31, androidPopup_androidKtPopup81.amount);
        String str3 = androidPopup_androidKtPopup81.comments;
        return Integer.valueOf(iM2 + (str3 != null ? str3.hashCode() : 0));
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 119;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (!(!(obj instanceof AndroidPopup_androidKtPopup81))) {
                AndroidPopup_androidKtPopup81 androidPopup_androidKtPopup81 = (AndroidPopup_androidKtPopup81) obj;
                if (this.id == androidPopup_androidKtPopup81.id) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.channelId, androidPopup_androidKtPopup81.channelId}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.confirmationNumber, androidPopup_androidKtPopup81.confirmationNumber}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.action, androidPopup_androidKtPopup81.action}, getCieXyz.write())).booleanValue()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customerName, androidPopup_androidKtPopup81.customerName}, getCieXyz.write())).booleanValue()) {
                                return false;
                            }
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customerPhoneNumber, androidPopup_androidKtPopup81.customerPhoneNumber}, getCieXyz.write())).booleanValue()) {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customerAddress, androidPopup_androidKtPopup81.customerAddress}, getCieXyz.write())).booleanValue()) {
                                    return false;
                                }
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.vendorOrderNumber, androidPopup_androidKtPopup81.vendorOrderNumber}, getCieXyz.write())).booleanValue()) {
                                    return false;
                                }
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.amount, androidPopup_androidKtPopup81.amount}, getCieXyz.write())).booleanValue()) {
                                    int i5 = read + 89;
                                    write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i6 = i5 % 2;
                                    return false;
                                }
                                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.comments, androidPopup_androidKtPopup81.comments}, getCieXyz.write())).booleanValue())) {
                                    return true;
                                }
                                int i7 = read + 23;
                                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i8 = i7 % 2;
                                return false;
                            }
                        } else {
                            int i9 = write + 33;
                            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            return false;
                        }
                    } else {
                        int i11 = read + 43;
                        write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        return false;
                    }
                } else {
                    int i13 = i2 + 69;
                    read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    return false;
                }
            }
            return false;
        }
        int i15 = i2 + 19;
        read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i16 = i15 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008f  */
    public static final /* synthetic */ void RemoteActionCompatParcelizer(AndroidPopup_androidKtPopup81 androidPopup_androidKtPopup81, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        int i = 2 % 2;
        long j = androidPopup_androidKtPopup81.id;
        String str = androidPopup_androidKtPopup81.comments;
        String str2 = androidPopup_androidKtPopup81.amount;
        Integer num = androidPopup_androidKtPopup81.vendorOrderNumber;
        String str3 = androidPopup_androidKtPopup81.customerAddress;
        String str4 = androidPopup_androidKtPopup81.customerPhoneNumber;
        defaultInAppMessageSlideupViewFactory.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, j);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, androidPopup_androidKtPopup81.channelId);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, androidPopup_androidKtPopup81.confirmationNumber);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, androidPopup_androidKtPopup81.action);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, androidPopup_androidKtPopup81.customerName);
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str4 != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str3 != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
            int i2 = read + 37;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || num != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, afterClosed.IconCompatParcelizer, num);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, str2);
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str2, ""}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, str2);
            }
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        }
        int i4 = read + 43;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final String toString() {
        int i = SubcomposeContentPainterElement.read();
        int i2 = SubcomposeContentPainterElement.read();
        int i3 = SubcomposeContentPainterElement.read();
        return (String) serializer(-573406052, SubcomposeContentPainterElement.read(), i, new Object[]{this}, i2, i3, 573406052);
    }

    public final int hashCode() {
        int i = SubcomposeContentPainterElement.read();
        int i2 = SubcomposeContentPainterElement.read();
        int i3 = SubcomposeContentPainterElement.read();
        return ((Integer) serializer(452240565, SubcomposeContentPainterElement.read(), i, new Object[]{this}, i2, i3, -452240564)).intValue();
    }
}
