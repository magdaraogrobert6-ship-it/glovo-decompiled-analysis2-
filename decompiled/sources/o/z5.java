package o;

import android.annotation.SuppressLint;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint
public final class z5 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    @SerializedName("cash_collection")
    private final serializer cashCollection;

    @SerializedName("completed_at")
    private final String completedAt;

    @SerializedName("confirmation_number")
    private final String confirmationNumber;

    @SerializedName("courier_commission")
    private final int courierCommission;

    @SerializedName("customer_chat")
    private final read customerChat;

    @SerializedName("delivery_expires_at")
    private final String deliveryExpiresAt;

    @SerializedName("distance")
    private final double distance;

    @SerializedName("distance_to_pickup")
    private final double distanceToPickup;

    @SerializedName("dropoff_full_address")
    private final z4 dropoffAddress;

    @SerializedName("estimated_total_lower")
    private final Integer estimatedTotalLower;

    @SerializedName("estimated_total_upper")
    private final Integer estimatedTotalUpper;

    @SerializedName("fee")
    private final Double fee;

    @SerializedName("id")
    private final long id;

    @SerializedName("is_returning")
    private final Boolean isReturning;

    @SerializedName("issues")
    private final RemoteActionCompatParcelizer issues;

    @SerializedName("items")
    private final List<IconCompatParcelizer> items;

    @SerializedName("linked_deliveries")
    private final List<Object> linkedDeliveries;

    @SerializedName("name")
    private final String name;

    @SerializedName("online_tip")
    private final Double onlineTip;

    @SerializedName("order_id")
    private final long orderId;

    @SerializedName("payment_confirmation")
    private final RatingCompat paymentConfirmation;

    @SerializedName("payment_estimate_id")
    private final String paymentEstimationId;

    @SerializedName("pickup_payment_type")
    private final String paymentType;

    @SerializedName("phone_number")
    private final String phoneNumber;

    @SerializedName("pickup_full_address")
    private final z4 pickupAddress;

    @SerializedName("primary")
    private final boolean primary;

    @SerializedName("scheduled_dropoff_at")
    private final String scheduledDropOffAt;

    @SerializedName("scheduled_pickup_at")
    private final String scheduledPickupAt;

    @SerializedName("status")
    private final String status;

    @SerializedName("tags")
    private final List<String> tags;

    @SerializedName("total")
    private final long total;

    @SerializedName("vendor")
    private final MediaMetadataCompat vendor;

    @SerializedName("vendor_order_number")
    private final int vendorOrderNumber;

    @SerializedName("vertical_type")
    private final String verticalType;

    public static final class IconCompatParcelizer {
        private static int IconCompatParcelizer = 1;
        private static int write;

        @SerializedName("available")
        private final boolean available;

        @SerializedName("id")
        private final long id;

        @SerializedName("name")
        private final String name;

        @SerializedName("price")
        private final double price;

        @SerializedName("quantity")
        private final float quantity;

        public final double IconCompatParcelizer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 15;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i3;
            int i4 = i2 % 2;
            double d = this.price;
            int i5 = i3 + 75;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
            }
            return d;
        }

        public final boolean RemoteActionCompatParcelizer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = i2 + 109;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z = this.available;
            int i4 = i2 + 25;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return z;
        }

        public final String read() {
            String str;
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 + 73;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                str = this.name;
                int i4 = 53 / 0;
            } else {
                str = this.name;
            }
            int i5 = i2 + 53;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return str;
        }

        public final long serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = i2 + 27;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            long j = this.id;
            int i5 = i2 + 71;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return j;
            }
            throw null;
        }

        public final float write() {
            int i = 2 % 2;
            int i2 = write + 113;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i3;
            int i4 = i2 % 2;
            float f = this.quantity;
            int i5 = i3 + 53;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = write + 33;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = Boolean.hashCode(this.available) + af$$ExternalSyntheticOutline1.m(this.quantity, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.price, af$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.name), 31), 31);
            int i4 = write + 65;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = write + 105;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            long j = this.id;
            String str = this.name;
            double d = this.price;
            float f = this.quantity;
            boolean z = this.available;
            StringBuilder sb = getBitmapFromCache.read("Item(id=", ", name=", j, str);
            sb.append(", price=");
            sb.append(d);
            sb.append(", quantity=");
            sb.append(f);
            sb.append(", available=");
            sb.append(z);
            sb.append(")");
            String string = sb.toString();
            int i4 = IconCompatParcelizer + 19;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return string;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IconCompatParcelizer + 125;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            if (this.id != iconCompatParcelizer.id) {
                return false;
            }
            Object obj2 = null;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, iconCompatParcelizer.name}, getCieXyz.write())).booleanValue()) {
                int i3 = write + 53;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (Double.compare(this.price, iconCompatParcelizer.price) != 0) {
                int i4 = write + 109;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (Float.compare(this.quantity, iconCompatParcelizer.quantity) != 0) {
                return false;
            }
            if (this.available == iconCompatParcelizer.available) {
                return true;
            }
            int i6 = write + 31;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
    }

    public static final class MediaMetadataCompat {
        private static int serializer = 1;
        private static int write;

        @SerializedName("id")
        private final long id;

        @SerializedName("name")
        private final String name;

        @SerializedName("phone_number")
        private final String phoneNumber;

        public final String IconCompatParcelizer() {
            String str;
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 + 113;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                str = this.name;
                int i4 = 91 / 0;
            } else {
                str = this.name;
            }
            int i5 = i2 + 99;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String RemoteActionCompatParcelizer() {
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 + 113;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            String str = this.phoneNumber;
            int i5 = i2 + 61;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return str;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = write + 17;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            long j = this.id;
            String str = this.name;
            String strM = d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("Vendor(id=", ", name=", j, str), ", phoneNumber=", this.phoneNumber, ")");
            int i4 = serializer + 125;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return strM;
        }

        public final int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = serializer + 41;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iM = af$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.name);
            String str = this.phoneNumber;
            if (str == null) {
                int i4 = write + 75;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            return iM + iHashCode;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        
            if ((r22 instanceof o.z5.MediaMetadataCompat) != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        
            r1 = (o.z5.MediaMetadataCompat) r22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        
            if (r21.id == r1.id) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        
            r5 = r5 + 125;
            o.z5.MediaMetadataCompat.write = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        
            if ((r5 % 2) == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        
            if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.name, r1.name}, o.getCieXyz.write())).booleanValue() != false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
        
            if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.phoneNumber, r1.phoneNumber}, o.getCieXyz.write())).booleanValue()) == true) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
        
            r1 = o.z5.MediaMetadataCompat.write + 87;
            o.z5.MediaMetadataCompat.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
        
            if ((r1 % 2) != 0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
        
            r1 = 73 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
        
            if (r21 == r22) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
        
            if (r21 == r22) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                r2 = 2
                int r3 = r2 % r2
                int r3 = o.z5.MediaMetadataCompat.write
                r4 = 1
                int r3 = r3 + r4
                int r5 = r3 % 128
                o.z5.MediaMetadataCompat.serializer = r5
                int r3 = r3 % r2
                r6 = 0
                if (r3 != 0) goto L19
                r3 = 19
                int r3 = r3 / r6
                if (r0 != r1) goto L1c
                goto L1b
            L19:
                if (r0 != r1) goto L1c
            L1b:
                return r4
            L1c:
                boolean r3 = r1 instanceof o.z5.MediaMetadataCompat
                if (r3 != 0) goto L21
                return r6
            L21:
                o.z5$MediaMetadataCompat r1 = (o.z5.MediaMetadataCompat) r1
                long r7 = r0.id
                long r9 = r1.id
                int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r3 == 0) goto L36
                int r5 = r5 + 125
                int r1 = r5 % 128
                o.z5.MediaMetadataCompat.write = r1
                int r5 = r5 % r2
                if (r5 == 0) goto L35
                return r4
            L35:
                return r6
            L36:
                java.lang.String r3 = r0.name
                java.lang.String r5 = r1.name
                java.lang.Object[] r12 = new java.lang.Object[]{r3, r5}
                int r7 = o.getCieXyz.write()
                int r11 = o.getCieXyz.write()
                int r13 = o.getCieXyz.write()
                int r10 = o.getCieXyz.write()
                r15 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
                r16 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
                r8 = r15
                r9 = r16
                java.lang.Object r3 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 != 0) goto L64
                return r6
            L64:
                java.lang.String r3 = r0.phoneNumber
                java.lang.String r1 = r1.phoneNumber
                java.lang.Object[] r19 = new java.lang.Object[]{r3, r1}
                int r14 = o.getCieXyz.write()
                int r18 = o.getCieXyz.write()
                int r20 = o.getCieXyz.write()
                int r17 = o.getCieXyz.write()
                java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r1 = r1 ^ r4
                if (r1 == r4) goto L98
                int r1 = o.z5.MediaMetadataCompat.write
                int r1 = r1 + 87
                int r3 = r1 % 128
                o.z5.MediaMetadataCompat.serializer = r3
                int r1 = r1 % r2
                if (r1 != 0) goto L97
                r1 = 73
                int r1 = r1 / r6
            L97:
                return r4
            L98:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.z5.MediaMetadataCompat.equals(java.lang.Object):boolean");
        }
    }

    public static final class serializer {
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        @SerializedName("change_for")
        private final long changeFor;

        @SerializedName("collect_at_dropoff")
        private final long collectAtDropOff;

        @SerializedName("pay_at_pickup")
        private final long payAtPickup;

        @SerializedName("pay_by_wallet_option_enabled")
        private final boolean paymentOptionsEnabled;

        public final long IconCompatParcelizer() {
            int i = 2 % 2;
            int i2 = serializer + 67;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i3;
            int i4 = i2 % 2;
            long j = this.payAtPickup;
            int i5 = i3 + 11;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return j;
            }
            throw null;
        }

        public final long write() {
            int i = 2 % 2;
            int i2 = serializer + 101;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i3;
            int i4 = i2 % 2;
            long j = this.collectAtDropOff;
            int i5 = i3 + 31;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return j;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 83;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = Boolean.hashCode(this.paymentOptionsEnabled) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(Long.hashCode(this.changeFor) * 31, 31, this.collectAtDropOff), 31, this.payAtPickup);
            int i4 = IconCompatParcelizer + 83;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = serializer + 51;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            long j = this.changeFor;
            long j2 = this.collectAtDropOff;
            long j3 = this.payAtPickup;
            boolean z = this.paymentOptionsEnabled;
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "CashCollection(changeFor=", ", collectAtDropOff=");
            sbM.append(j2);
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", payAtPickup=", j3, ", paymentOptionsEnabled=");
            String strM = ff$$ExternalSyntheticOutline0.m(sbM, z, ")");
            int i4 = serializer + 95;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return strM;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof serializer)) {
                return false;
            }
            serializer serializerVar = (serializer) obj;
            if (this.changeFor != serializerVar.changeFor) {
                int i2 = serializer + 103;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (this.collectAtDropOff != serializerVar.collectAtDropOff || this.payAtPickup != serializerVar.payAtPickup) {
                return false;
            }
            if (this.paymentOptionsEnabled == serializerVar.paymentOptionsEnabled) {
                return true;
            }
            int i4 = serializer + 13;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
    }

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i2 | i5);
        int i9 = (~((~i5) | i2)) | (~(i2 | i3));
        int i10 = i2 + i3 + i + (32217706 * i6) + (238734613 * i4);
        int i11 = i10 * i10;
        int i12 = (((-3446596) * i2) - 528416768) + (677943110 * i3) + (i8 * 1806788795) + ((-1806788795) * i7) + (1806788795 * i9) + ((-1810235392) * i) + ((-154927104) * i6) + ((-131989504) * i4) + ((-1876361216) * i11);
        int i13 = ((i2 * 1127137324) - 440746823) + (i3 * 1127135646) + (i8 * 839) + (i7 * (-839)) + (i9 * 839) + (i * 1127136485) + (i6 * 976419026) + (i4 * 1106960329) + (i11 * 279773184);
        int i14 = i12 + (i13 * i13 * (-1943076864));
        if (i14 != 1) {
            return i14 != 2 ? serializer(objArr) : RemoteActionCompatParcelizer(objArr);
        }
        return IconCompatParcelizer(objArr);
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        z5 z5Var = (z5) objArr[0];
        int i = 2 % 2;
        int i2 = read + 111;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return z5Var.dropoffAddress;
        }
        int i3 = 62 / 0;
        return z5Var.dropoffAddress;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        z5 z5Var = (z5) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return z5Var.items;
        }
        List<IconCompatParcelizer> list = z5Var.items;
        throw null;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        z5 z5Var = (z5) objArr[0];
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 61;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = z5Var.confirmationNumber;
        int i5 = i2 + 27;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return str;
    }

    public final double IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.distance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long MediaDescriptionCompat() {
        long j;
        int i = 2 % 2;
        int i2 = read + 103;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            j = this.id;
            int i4 = 57 / 0;
        } else {
            j = this.id;
        }
        int i5 = i3 + 1;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return j;
    }

    public final String MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = read + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 61;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    public final Integer MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        Integer num = this.estimatedTotalUpper;
        int i5 = i3 + 125;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.vendorOrderNumber;
        }
        int i3 = 33 / 0;
        return this.vendorOrderNumber;
    }

    public final MediaMetadataCompat MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 5;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        MediaMetadataCompat mediaMetadataCompat = this.vendor;
        int i5 = i2 + 125;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return mediaMetadataCompat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Double ParcelableVolumeInfo() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        Double d = this.onlineTip;
        int i5 = i3 + 85;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String PlaybackStateCompat() {
        int i = 2 % 2;
        int i2 = read + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.phoneNumber;
        }
        int i3 = 5 / 0;
        return this.phoneNumber;
    }

    public final z4 PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 113;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        z4 z4Var = this.pickupAddress;
        int i5 = i2 + 87;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z4Var;
    }

    public final Integer RatingCompat() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 27;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.estimatedTotalLower;
        }
        throw null;
    }

    public final serializer RemoteActionCompatParcelizer() {
        serializer serializerVar;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            serializerVar = this.cashCollection;
            int i4 = 97 / 0;
        } else {
            serializerVar = this.cashCollection;
        }
        int i5 = i3 + 107;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return serializerVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.completedAt;
        int i5 = i3 + 59;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    public static final class read {
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        @SerializedName("channel")
        private final String channel;

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = serializer;
            int i3 = i2 + 61;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.channel;
            if (str != null) {
                return str.hashCode();
            }
            int i4 = i2 + 29;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return 0;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = serializer + 11;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            String strM = ff$$ExternalSyntheticOutline0.m("DeliveryChatResponse(channel=", this.channel, ")");
            int i4 = serializer + 123;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 92 / 0;
            }
            return strM;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 39;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 71;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i5 % 2 == 0;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.channel, ((read) obj).channel}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i6 = serializer + 43;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final class RemoteActionCompatParcelizer {
        private static int read = 0;
        private static int write = 1;

        @SerializedName("cash_collection")
        private final write cashCollection;

        @SerializedName("pickup_payment_type")
        private final String paymentType;

        public final int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = write + 71;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode2 = this.cashCollection.hashCode();
            String str = this.paymentType;
            if (str == null) {
                int i4 = read + 51;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public final String toString() {
            int i = 2 % 2;
            String str = "IssueCollection(cashCollection=" + this.cashCollection + ", paymentType=" + this.paymentType + ")";
            int i2 = write + 47;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 17 / 0;
            }
            return str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        
            if ((!(r22 instanceof o.z5.RemoteActionCompatParcelizer)) == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            r3 = r3 + 69;
            o.z5.RemoteActionCompatParcelizer.write = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        
            r1 = (o.z5.RemoteActionCompatParcelizer) r22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
        
            if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.cashCollection, r1.cashCollection}, o.getCieXyz.write())).booleanValue()) == false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
        
            if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.paymentType, r1.paymentType}, o.getCieXyz.write())).booleanValue() != false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
        
            r1 = o.z5.RemoteActionCompatParcelizer.write + 3;
            o.z5.RemoteActionCompatParcelizer.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
        
            if ((r1 % 2) == 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
        
            r1 = 73 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (r21 == r22) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        
            if (r21 == r22) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                r2 = 2
                int r3 = r2 % r2
                int r3 = o.z5.RemoteActionCompatParcelizer.read
                int r4 = r3 + 97
                int r5 = r4 % 128
                o.z5.RemoteActionCompatParcelizer.write = r5
                int r4 = r4 % r2
                r5 = 1
                r6 = 0
                if (r4 != 0) goto L1a
                r4 = 84
                int r4 = r4 / r6
                if (r0 != r1) goto L1d
                goto L1c
            L1a:
                if (r0 != r1) goto L1d
            L1c:
                return r5
            L1d:
                boolean r4 = r1 instanceof o.z5.RemoteActionCompatParcelizer
                r4 = r4 ^ r5
                if (r4 == 0) goto L2a
                int r3 = r3 + 69
                int r1 = r3 % 128
                o.z5.RemoteActionCompatParcelizer.write = r1
                int r3 = r3 % r2
                return r6
            L2a:
                o.z5$RemoteActionCompatParcelizer r1 = (o.z5.RemoteActionCompatParcelizer) r1
                o.z5$write r3 = r0.cashCollection
                o.z5$write r4 = r1.cashCollection
                java.lang.Object[] r12 = new java.lang.Object[]{r3, r4}
                int r7 = o.getCieXyz.write()
                int r11 = o.getCieXyz.write()
                int r13 = o.getCieXyz.write()
                int r10 = o.getCieXyz.write()
                r15 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
                r16 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
                r8 = r15
                r9 = r16
                java.lang.Object r3 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                r3 = r3 ^ r5
                if (r3 == 0) goto L5b
                return r6
            L5b:
                java.lang.String r3 = r0.paymentType
                java.lang.String r1 = r1.paymentType
                java.lang.Object[] r19 = new java.lang.Object[]{r3, r1}
                int r14 = o.getCieXyz.write()
                int r18 = o.getCieXyz.write()
                int r20 = o.getCieXyz.write()
                int r17 = o.getCieXyz.write()
                java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L8e
                int r1 = o.z5.RemoteActionCompatParcelizer.write
                int r1 = r1 + 3
                int r3 = r1 % 128
                o.z5.RemoteActionCompatParcelizer.read = r3
                int r1 = r1 % r2
                if (r1 == 0) goto L8d
                r1 = 73
                int r1 = r1 / r6
            L8d:
                return r6
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.z5.RemoteActionCompatParcelizer.equals(java.lang.Object):boolean");
        }
    }

    public static final class RatingCompat {
        private static int serializer = 1;
        private static int write;

        @SerializedName("is_paid")
        private final boolean isPaid;

        @SerializedName("backup_code")
        private final String paymentConfirmationBackupCode;

        @SerializedName("code")
        private final String paymentConfirmationCode;

        public final int hashCode() {
            String str;
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = serializer + 79;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int iHashCode = Boolean.hashCode(this.isPaid);
                str = this.paymentConfirmationCode;
                i2 = iHashCode << 81;
                i = 68;
            } else {
                int iHashCode2 = Boolean.hashCode(this.isPaid);
                str = this.paymentConfirmationCode;
                i = 31;
                i2 = iHashCode2 * 31;
            }
            return this.paymentConfirmationBackupCode.hashCode() + af$$ExternalSyntheticOutline0.m(i2, i, str);
        }

        public final String toString() {
            int i = 2 % 2;
            boolean z = this.isPaid;
            String str = this.paymentConfirmationCode;
            String str2 = this.paymentConfirmationBackupCode;
            StringBuilder sb = new StringBuilder("PaymentConfirmation(isPaid=");
            sb.append(z);
            sb.append(", paymentConfirmationCode=");
            sb.append(str);
            sb.append(", paymentConfirmationBackupCode=");
            String strM = ff$$ExternalSyntheticOutline0.m(sb, str2, ")");
            int i2 = write + 69;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 56 / 0;
            }
            return strM;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = serializer + 83;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof RatingCompat)) {
                return false;
            }
            RatingCompat ratingCompat = (RatingCompat) obj;
            if (this.isPaid != ratingCompat.isPaid) {
                int i3 = write + 83;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentConfirmationCode, ratingCompat.paymentConfirmationCode}, getCieXyz.write())).booleanValue()) {
                int i5 = serializer + 31;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentConfirmationBackupCode, ratingCompat.paymentConfirmationBackupCode}, getCieXyz.write())).booleanValue())) {
                return true;
            }
            int i7 = serializer + 35;
            int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 89;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 77 / 0;
            }
            return false;
        }
    }

    public static final class write {
        private static int serializer = 0;
        private static int write = 1;

        @SerializedName("pay_at_pickup")
        private final long payAtPickup = 0;

        @SerializedName("collect_at_dropoff")
        private final long collectAtDropOff = 0;

        @SerializedName("change_for")
        private final int changeFor = 0;

        @SerializedName("amount")
        private final long amount = 0;

        @SerializedName("reason")
        private final String reason = null;

        @SerializedName("pay_by_wallet_option_enabled")
        private final boolean paymentOptionsEnabled = false;

        public final int hashCode() {
            int i;
            int i2 = 2 % 2;
            int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.changeFor, d$$ExternalSyntheticOutline0.m(Long.hashCode(this.payAtPickup) * 31, 31, this.collectAtDropOff), 31), 31, this.amount);
            String str = this.reason;
            if (str == null) {
                int i3 = write + 121;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                i = 0;
            } else {
                int iHashCode = str.hashCode();
                int i5 = serializer + 21;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 3 % 4;
                }
                i = iHashCode;
            }
            return Boolean.hashCode(this.paymentOptionsEnabled) + ((iM + i) * 31);
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = write + 99;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            long j = this.payAtPickup;
            long j2 = this.collectAtDropOff;
            int i4 = this.changeFor;
            long j3 = this.amount;
            String str = this.reason;
            boolean z = this.paymentOptionsEnabled;
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "Cod(payAtPickup=", ", collectAtDropOff=");
            sbM.append(j2);
            sbM.append(", changeFor=");
            sbM.append(i4);
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", amount=", j3, ", reason=");
            sbM.append(str);
            sbM.append(", paymentOptionsEnabled=");
            sbM.append(z);
            sbM.append(")");
            String string = sbM.toString();
            int i5 = serializer + 111;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return string;
            }
            throw null;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            if (this.payAtPickup != writeVar.payAtPickup) {
                int i2 = serializer + 95;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (this.collectAtDropOff != writeVar.collectAtDropOff) {
                int i4 = write + 67;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (this.changeFor != writeVar.changeFor) {
                int i6 = write + 125;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            if (this.amount != writeVar.amount) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.reason, writeVar.reason}, getCieXyz.write())).booleanValue()) {
                return this.paymentOptionsEnabled == writeVar.paymentOptionsEnabled;
            }
            int i8 = write;
            int i9 = i8 + 71;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            int i11 = i8 + 63;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                int i12 = 68 / 0;
            }
            return false;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int iHashCode8;
        int iHashCode9;
        int iHashCode10;
        int i = 2 % 2;
        int iHashCode11 = Long.hashCode(this.id);
        String str = this.status;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(((iHashCode11 * 31) + (str == null ? 0 : str.hashCode())) * 31, 31, this.primary), 31, this.orderId), 31, this.confirmationNumber), 31, this.total);
        Double d = this.onlineTip;
        if (d == null) {
            int i2 = read + 15;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = d.hashCode();
        }
        int iM2 = af$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.name);
        String str2 = this.phoneNumber;
        int iHashCode12 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.scheduledPickupAt;
        int iHashCode13 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.scheduledDropOffAt;
        if (str4 == null) {
            int i4 = RemoteActionCompatParcelizer + 57;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        Double d2 = this.fee;
        int iM3 = af$$ExternalSyntheticOutline0.m(this.vendorOrderNumber, af$$ExternalSyntheticOutline0.m(this.courierCommission, c8$$ExternalSyntheticOutline0.m(this.items, (((((((iM2 + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode2) * 31) + (d2 == null ? 0 : d2.hashCode())) * 31, 31), 31), 31);
        List<String> list = this.tags;
        int iHashCode14 = list == null ? 0 : list.hashCode();
        MediaMetadataCompat mediaMetadataCompat = this.vendor;
        int iHashCode15 = mediaMetadataCompat == null ? 0 : mediaMetadataCompat.hashCode();
        serializer serializerVar = this.cashCollection;
        int iHashCode16 = serializerVar == null ? 0 : serializerVar.hashCode();
        List<Object> list2 = this.linkedDeliveries;
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.distanceToPickup, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.distance, (((((((iM3 + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (list2 == null ? 0 : list2.hashCode())) * 31, 31), 31);
        z4 z4Var = this.pickupAddress;
        if (z4Var == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = z4Var.hashCode();
            int i6 = read + 13;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 5 / 4;
            }
        }
        z4 z4Var2 = this.dropoffAddress;
        if (z4Var2 == null) {
            int i8 = RemoteActionCompatParcelizer + 101;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = z4Var2.hashCode();
        }
        read readVar = this.customerChat;
        int iHashCode17 = readVar == null ? 0 : readVar.hashCode();
        RatingCompat ratingCompat = this.paymentConfirmation;
        int iHashCode18 = ratingCompat == null ? 0 : ratingCompat.hashCode();
        String str5 = this.verticalType;
        if (str5 == null) {
            int i10 = RemoteActionCompatParcelizer + 33;
            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str5.hashCode();
        }
        Integer num = this.estimatedTotalLower;
        if (num == null) {
            int i12 = RemoteActionCompatParcelizer + 77;
            read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode6 = i12 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode6 = num.hashCode();
        }
        Integer num2 = this.estimatedTotalUpper;
        if (num2 == null) {
            int i13 = RemoteActionCompatParcelizer + 115;
            read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            iHashCode7 = 0;
        } else {
            iHashCode7 = num2.hashCode();
        }
        String str6 = this.deliveryExpiresAt;
        if (str6 == null) {
            int i15 = read + 25;
            RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
            iHashCode8 = 0;
        } else {
            iHashCode8 = str6.hashCode();
        }
        String str7 = this.completedAt;
        int iHashCode19 = str7 == null ? 0 : str7.hashCode();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.issues;
        if (remoteActionCompatParcelizer == null) {
            int i17 = read + 87;
            RemoteActionCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i18 = i17 % 2;
            iHashCode9 = 0;
        } else {
            iHashCode9 = remoteActionCompatParcelizer.hashCode();
        }
        String str8 = this.paymentType;
        if (str8 == null) {
            int i19 = RemoteActionCompatParcelizer + 25;
            read = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode10 = i19 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode10 = str8.hashCode();
        }
        Boolean bool = this.isReturning;
        int iHashCode20 = bool == null ? 0 : bool.hashCode();
        String str9 = this.paymentEstimationId;
        return ((((((((((((((((((((((((iRemoteActionCompatParcelizer + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode19) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode20) * 31) + (str9 == null ? 0 : str9.hashCode());
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof z5)) {
                return false;
            }
            z5 z5Var = (z5) obj;
            if (this.id != z5Var.id) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.status, z5Var.status}, getCieXyz.write())).booleanValue() || this.primary != z5Var.primary) {
                return false;
            }
            if (this.orderId == z5Var.orderId) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.confirmationNumber, z5Var.confirmationNumber}, getCieXyz.write())).booleanValue() || this.total != z5Var.total) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.onlineTip, z5Var.onlineTip}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, z5Var.name}, getCieXyz.write())).booleanValue()) {
                        int i2 = read + 17;
                        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneNumber, z5Var.phoneNumber}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.scheduledPickupAt, z5Var.scheduledPickupAt}, getCieXyz.write())).booleanValue()) {
                            int i4 = read + 75;
                            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i5 = i4 % 2;
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.scheduledDropOffAt, z5Var.scheduledDropOffAt}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fee, z5Var.fee}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.items, z5Var.items}, getCieXyz.write())).booleanValue() || this.courierCommission != z5Var.courierCommission || this.vendorOrderNumber != z5Var.vendorOrderNumber) {
                            return false;
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tags, z5Var.tags}, getCieXyz.write())).booleanValue()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.vendor, z5Var.vendor}, getCieXyz.write())).booleanValue()) {
                                return false;
                            }
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cashCollection, z5Var.cashCollection}, getCieXyz.write())).booleanValue()) {
                                return false;
                            }
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.linkedDeliveries, z5Var.linkedDeliveries}, getCieXyz.write())).booleanValue() || Double.compare(this.distance, z5Var.distance) != 0 || Double.compare(this.distanceToPickup, z5Var.distanceToPickup) != 0) {
                                return false;
                            }
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pickupAddress, z5Var.pickupAddress}, getCieXyz.write())).booleanValue()) {
                                return false;
                            }
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dropoffAddress, z5Var.dropoffAddress}, getCieXyz.write())).booleanValue()) {
                                return false;
                            }
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customerChat, z5Var.customerChat}, getCieXyz.write())).booleanValue()) {
                                return false;
                            }
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentConfirmation, z5Var.paymentConfirmation}, getCieXyz.write())).booleanValue()) {
                                return false;
                            }
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.verticalType, z5Var.verticalType}, getCieXyz.write())).booleanValue()) {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.estimatedTotalLower, z5Var.estimatedTotalLower}, getCieXyz.write())).booleanValue()) {
                                    return false;
                                }
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.estimatedTotalUpper, z5Var.estimatedTotalUpper}, getCieXyz.write())).booleanValue()) {
                                    return false;
                                }
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deliveryExpiresAt, z5Var.deliveryExpiresAt}, getCieXyz.write())).booleanValue()) {
                                    return false;
                                }
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.completedAt, z5Var.completedAt}, getCieXyz.write())).booleanValue()) {
                                    return false;
                                }
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.issues, z5Var.issues}, getCieXyz.write())).booleanValue()) {
                                    int i6 = RemoteActionCompatParcelizer + 25;
                                    read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i7 = i6 % 2;
                                    return false;
                                }
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentType, z5Var.paymentType}, getCieXyz.write())).booleanValue()) {
                                    return false;
                                }
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isReturning, z5Var.isReturning}, getCieXyz.write())).booleanValue()) {
                                    return false;
                                }
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentEstimationId, z5Var.paymentEstimationId}, getCieXyz.write())).booleanValue()) {
                                    return true;
                                }
                                int i8 = read + 97;
                                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                return i8 % 2 == 0;
                            }
                            int i9 = read + 59;
                            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            return false;
                        }
                        int i11 = read + 125;
                        RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        return false;
                    }
                    int i13 = RemoteActionCompatParcelizer + 43;
                    read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    return false;
                }
                int i15 = RemoteActionCompatParcelizer + 11;
                read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                return false;
            }
            int i17 = read + 39;
            RemoteActionCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i17 % 2 == 0;
        }
        int i18 = read + 79;
        RemoteActionCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i18 % 2 != 0;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j = this.id;
        String str = this.status;
        boolean z = this.primary;
        long j2 = this.orderId;
        String str2 = this.confirmationNumber;
        long j3 = this.total;
        Double d = this.onlineTip;
        String str3 = this.name;
        String str4 = this.phoneNumber;
        String str5 = this.scheduledPickupAt;
        String str6 = this.scheduledDropOffAt;
        Double d2 = this.fee;
        List<IconCompatParcelizer> list = this.items;
        int i4 = this.courierCommission;
        int i5 = this.vendorOrderNumber;
        List<String> list2 = this.tags;
        MediaMetadataCompat mediaMetadataCompat = this.vendor;
        serializer serializerVar = this.cashCollection;
        List<Object> list3 = this.linkedDeliveries;
        double d3 = this.distance;
        double d4 = this.distanceToPickup;
        z4 z4Var = this.pickupAddress;
        z4 z4Var2 = this.dropoffAddress;
        read readVar = this.customerChat;
        RatingCompat ratingCompat = this.paymentConfirmation;
        String str7 = this.verticalType;
        Integer num = this.estimatedTotalLower;
        Integer num2 = this.estimatedTotalUpper;
        String str8 = this.deliveryExpiresAt;
        String str9 = this.completedAt;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.issues;
        String str10 = this.paymentType;
        Boolean bool = this.isReturning;
        String str11 = this.paymentEstimationId;
        StringBuilder sb = getBitmapFromCache.read("DeliveryResponse(id=", ", status=", j, str);
        sb.append(", primary=");
        sb.append(z);
        sb.append(", orderId=");
        sb.append(j2);
        sb.append(", confirmationNumber=");
        sb.append(str2);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, ", total=", j3, ", onlineTip=");
        sb.append(d);
        sb.append(", name=");
        sb.append(str3);
        sb.append(", phoneNumber=");
        c8$$ExternalSyntheticOutline0.m(sb, str4, ", scheduledPickupAt=", str5, ", scheduledDropOffAt=");
        sb.append(str6);
        sb.append(", fee=");
        sb.append(d2);
        sb.append(", items=");
        sb.append(list);
        sb.append(", courierCommission=");
        sb.append(i4);
        sb.append(", vendorOrderNumber=");
        sb.append(i5);
        sb.append(", tags=");
        sb.append(list2);
        sb.append(", vendor=");
        sb.append(mediaMetadataCompat);
        sb.append(", cashCollection=");
        sb.append(serializerVar);
        sb.append(", linkedDeliveries=");
        sb.append(list3);
        sb.append(", distance=");
        sb.append(d3);
        sb.append(", distanceToPickup=");
        sb.append(d4);
        sb.append(", pickupAddress=");
        sb.append(z4Var);
        sb.append(", dropoffAddress=");
        sb.append(z4Var2);
        sb.append(", customerChat=");
        sb.append(readVar);
        sb.append(", paymentConfirmation=");
        sb.append(ratingCompat);
        sb.append(", verticalType=");
        sb.append(str7);
        sb.append(", estimatedTotalLower=");
        sb.append(num);
        sb.append(", estimatedTotalUpper=");
        sb.append(num2);
        sb.append(", deliveryExpiresAt=");
        sb.append(str8);
        sb.append(", completedAt=");
        sb.append(str9);
        sb.append(", issues=");
        sb.append(remoteActionCompatParcelizer);
        sb.append(", paymentType=");
        sb.append(str10);
        sb.append(", isReturning=");
        sb.append(bool);
        sb.append(", paymentEstimationId=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, str11, ")");
        int i6 = RemoteActionCompatParcelizer + 15;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List MediaBrowserCompatMediaItem() {
        int iRemoteActionCompatParcelizer = getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer();
        return (List) IconCompatParcelizer(iRemoteActionCompatParcelizer2, 57134549, -57134547, getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, new Object[]{this}, iRemoteActionCompatParcelizer3);
    }

    public final z4 read() {
        int iRemoteActionCompatParcelizer = getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer();
        return (z4) IconCompatParcelizer(iRemoteActionCompatParcelizer2, -79708075, 79708076, getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, new Object[]{this}, iRemoteActionCompatParcelizer3);
    }

    public final String serializer() {
        int iRemoteActionCompatParcelizer = getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer();
        return (String) IconCompatParcelizer(iRemoteActionCompatParcelizer2, 1360911588, -1360911588, getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, new Object[]{this}, iRemoteActionCompatParcelizer3);
    }
}
