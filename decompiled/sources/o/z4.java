package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes3.dex */
public final class z4 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    @SerializedName("address_line_1")
    private final String addressLine1;

    @SerializedName("address_line_2")
    private final String addressLine2;

    @SerializedName("address_line_3")
    private final String addressLine3;

    @SerializedName("address_other")
    private final String addressOther;

    @SerializedName("apartment_number")
    private final String apartmentNumber;

    @SerializedName("building")
    private final String building;

    @SerializedName("city_name")
    private final String city;

    @SerializedName("city_id")
    private final Long cityId;

    @SerializedName("company")
    private final String company;

    @SerializedName(com.deliveryhero.chatsdk.util.PushNotificationParserObj.COUNTRY_KEY)
    private final String country;

    @SerializedName("country_code")
    private final String countryCode;

    @SerializedName("district")
    private final String district;

    @SerializedName("entrance")
    private final String entrance;

    @SerializedName("floor")
    private final String floor;

    @SerializedName("intercom")
    private final String intercom;

    @SerializedName("latitude")
    private final double latitude;

    @SerializedName("longitude")
    private final double longitude;

    @SerializedName("neighborhood")
    private final String neighborhood;

    @SerializedName("place_id")
    private final String placeId;

    @SerializedName("primary")
    private final String primary;

    @SerializedName("province")
    private final String province;

    @SerializedName("room")
    private final String room;

    @SerializedName("secondary")
    private final String secondary;

    @SerializedName("special_instructions")
    private final String specialInstructions;

    @SerializedName("special_instructions_link")
    private final String specialInstructionsLink;

    @SerializedName("state")
    private final String state;

    @SerializedName("street_address")
    private final String streetAddress;

    @SerializedName("structure")
    private final String structure;

    @SerializedName("zip")
    private final String zip;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~(i5 | i);
        int i8 = ~(i | i2);
        int i9 = i7 | i8;
        int i10 = ~i5;
        int i11 = ~i;
        int i12 = (~(i10 | i2)) | (~(i10 | i11)) | (~(i11 | i2));
        int i13 = ~i2;
        int i14 = i12 | (~(i13 | i5 | i));
        int i15 = (~(i13 | i11)) | i5 | i8;
        int i16 = i5 + i + i6 + (1962400304 * i3) + (1167700406 * i4);
        int i17 = i16 * i16;
        int i18 = ((i5 * (-1019457937)) - 559939584) + ((-1019457937) * i) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i6) + ((-1660944384) * i3) + ((-325058560) * i4) + (867827712 * i17);
        int i19 = ((i5 * (-1629562239)) - 1134582380) + (i * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + (i6 * (-1629561329)) + (i3 * (-1621399344)) + (i4 * (-873382486)) + (i17 * 1407582208);
        int i20 = i18 + (i19 * i19 * (-1895432192));
        if (i20 == 1) {
            return IconCompatParcelizer(objArr);
        }
        if (i20 == 2) {
            return write(objArr);
        }
        if (i20 == 3) {
            return serializer(objArr);
        }
        if (i20 != 4) {
            return i20 != 5 ? read(objArr) : MediaMetadataCompat(objArr);
        }
        return RemoteActionCompatParcelizer(objArr);
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        z4 z4Var = (z4) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = z4Var.addressLine1;
        int i5 = i3 + 41;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object MediaMetadataCompat(Object[] objArr) {
        z4 z4Var = (z4) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return z4Var.specialInstructionsLink;
        }
        String str = z4Var.specialInstructionsLink;
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        z4 z4Var = (z4) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 67;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = z4Var.placeId;
        int i5 = i2 + 17;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        double d;
        z4 z4Var = (z4) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            d = z4Var.latitude;
            int i3 = 51 / 0;
        } else {
            d = z4Var.latitude;
        }
        return Double.valueOf(d);
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        z4 z4Var = (z4) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return z4Var.neighborhood;
        }
        int i3 = 56 / 0;
        return z4Var.neighborhood;
    }

    public final double ComponentActivity() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 43;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        double d = this.longitude;
        int i5 = i2 + 117;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return d;
        }
        throw null;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 89;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.apartmentNumber;
        int i5 = i2 + 51;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.company;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Long MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 75;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Long l = this.cityId;
        int i5 = i2 + 59;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return l;
    }

    public final String MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 85;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.country;
        int i5 = i2 + 11;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.building;
        int i5 = i3 + 53;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.intercom;
        int i5 = i3 + 37;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String MediaSessionCompatToken() {
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 27;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = this.floor;
            int i4 = 97 / 0;
        } else {
            str = this.floor;
        }
        int i5 = i2 + 111;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return str;
    }

    public final String ParcelableVolumeInfo() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.entrance;
        }
        int i3 = 79 / 0;
        return this.entrance;
    }

    public final String PlaybackStateCompat() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 87;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.countryCode;
        int i5 = i2 + 111;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.district;
        int i4 = i3 + 3;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String RatingCompat() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 27;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.city;
        int i5 = i2 + 81;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String ResultReceiver() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.primary;
        int i5 = i3 + 95;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.secondary;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.room;
        int i5 = i3 + 11;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            str = this.province;
            int i4 = 59 / 0;
        } else {
            str = this.province;
        }
        int i5 = i3 + 13;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.specialInstructions;
        }
        throw null;
    }

    public final String r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 77;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            str = this.streetAddress;
            int i4 = 28 / 0;
        } else {
            str = this.streetAddress;
        }
        int i5 = i2 + 99;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.zip;
        }
        throw null;
    }

    public final String r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 119;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.state;
        int i5 = i2 + 67;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 27;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.structure;
        int i5 = i2 + 9;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.addressOther;
        }
        int i3 = 78 / 0;
        return this.addressOther;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.addressLine3;
        int i5 = i3 + 77;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 83;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.addressLine2;
        int i5 = i2 + 35;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        z4 z4Var = (z4) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (z4Var == obj) {
            return true;
        }
        if (!(obj instanceof z4)) {
            return false;
        }
        z4 z4Var2 = (z4) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.primary, z4Var2.primary}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.secondary, z4Var2.secondary}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.addressLine1, z4Var2.addressLine1}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.addressLine2, z4Var2.addressLine2}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.addressLine3, z4Var2.addressLine3}, getCieXyz.write())).booleanValue()) {
            int i4 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.addressOther, z4Var2.addressOther}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.apartmentNumber, z4Var2.apartmentNumber}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.building, z4Var2.building}, getCieXyz.write())).booleanValue()) {
            int i6 = IconCompatParcelizer + 73;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.city, z4Var2.city}, getCieXyz.write())).booleanValue()) {
            int i8 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.cityId, z4Var2.cityId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.company, z4Var2.company}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.country, z4Var2.country}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.countryCode, z4Var2.countryCode}, getCieXyz.write())).booleanValue()) {
            int i10 = RemoteActionCompatParcelizer + 31;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.district, z4Var2.district}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.entrance, z4Var2.entrance}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.floor, z4Var2.floor}, getCieXyz.write())).booleanValue()) {
            int i12 = IconCompatParcelizer + 51;
            RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.intercom, z4Var2.intercom}, getCieXyz.write())).booleanValue()) {
            int i14 = IconCompatParcelizer + 1;
            RemoteActionCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return Boolean.valueOf(i14 % 2 != 0);
        }
        if (Double.compare(z4Var.latitude, z4Var2.latitude) != 0 || Double.compare(z4Var.longitude, z4Var2.longitude) != 0) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.neighborhood, z4Var2.neighborhood}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.placeId, z4Var2.placeId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.province, z4Var2.province}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.room, z4Var2.room}, getCieXyz.write())).booleanValue()) {
            int i15 = IconCompatParcelizer + 101;
            RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.specialInstructions, z4Var2.specialInstructions}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.specialInstructionsLink, z4Var2.specialInstructionsLink}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.state, z4Var2.state}, getCieXyz.write())).booleanValue()) {
            int i17 = IconCompatParcelizer + 9;
            RemoteActionCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i18 = i17 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.streetAddress, z4Var2.streetAddress}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.structure, z4Var2.structure}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{z4Var.zip, z4Var2.zip}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i19 = IconCompatParcelizer + 99;
        RemoteActionCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i20 = i19 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.primary;
        String str2 = this.secondary;
        String str3 = this.addressLine1;
        String str4 = this.addressLine2;
        String str5 = this.addressLine3;
        String str6 = this.addressOther;
        String str7 = this.apartmentNumber;
        String str8 = this.building;
        String str9 = this.city;
        Long l = this.cityId;
        String str10 = this.company;
        String str11 = this.country;
        String str12 = this.countryCode;
        String str13 = this.district;
        String str14 = this.entrance;
        String str15 = this.floor;
        String str16 = this.intercom;
        double d = this.latitude;
        double d2 = this.longitude;
        String str17 = this.neighborhood;
        String str18 = this.placeId;
        String str19 = this.province;
        String str20 = this.room;
        String str21 = this.specialInstructions;
        String str22 = this.specialInstructionsLink;
        String str23 = this.state;
        String str24 = this.streetAddress;
        String str25 = this.structure;
        String str26 = this.zip;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("AddressResponse(primary=", str, ", secondary=", str2, ", addressLine1=");
        c8$$ExternalSyntheticOutline0.m(sbM, str3, ", addressLine2=", str4, ", addressLine3=");
        c8$$ExternalSyntheticOutline0.m(sbM, str5, ", addressOther=", str6, ", apartmentNumber=");
        c8$$ExternalSyntheticOutline0.m(sbM, str7, ", building=", str8, ", city=");
        sbM.append(str9);
        sbM.append(", cityId=");
        sbM.append(l);
        sbM.append(", company=");
        c8$$ExternalSyntheticOutline0.m(sbM, str10, ", country=", str11, ", countryCode=");
        c8$$ExternalSyntheticOutline0.m(sbM, str12, ", district=", str13, ", entrance=");
        c8$$ExternalSyntheticOutline0.m(sbM, str14, ", floor=", str15, ", intercom=");
        sbM.append(str16);
        sbM.append(", latitude=");
        sbM.append(d);
        sbM.append(", longitude=");
        sbM.append(d2);
        sbM.append(", neighborhood=");
        c8$$ExternalSyntheticOutline0.m(sbM, str17, ", placeId=", str18, ", province=");
        c8$$ExternalSyntheticOutline0.m(sbM, str19, ", room=", str20, ", specialInstructions=");
        c8$$ExternalSyntheticOutline0.m(sbM, str21, ", specialInstructionsLink=", str22, ", state=");
        c8$$ExternalSyntheticOutline0.m(sbM, str23, ", streetAddress=", str24, ", structure=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, str25, ", zip=", str26, ")");
        int i4 = IconCompatParcelizer + 69;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i = 2 % 2;
        String str = this.primary;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.secondary;
        if (str2 == null) {
            int i2 = IconCompatParcelizer + 113;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.addressLine1;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.addressLine2;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.addressLine3;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.addressOther;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.apartmentNumber;
        int iHashCode12 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.building;
        int iHashCode13 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.city;
        int iHashCode14 = str9 == null ? 0 : str9.hashCode();
        Long l = this.cityId;
        int iHashCode15 = l == null ? 0 : l.hashCode();
        String str10 = this.company;
        int iHashCode16 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.country;
        if (str11 == null) {
            int i4 = RemoteActionCompatParcelizer + 69;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str11.hashCode();
        }
        String str12 = this.countryCode;
        int iHashCode17 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.district;
        int iHashCode18 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.entrance;
        int iHashCode19 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.floor;
        int iHashCode20 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.intercom;
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.longitude, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.latitude, ((((((((((((((((((((((((((((((((iHashCode7 * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode2) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (str16 == null ? 0 : str16.hashCode())) * 31, 31), 31);
        String str17 = this.neighborhood;
        if (str17 == null) {
            int i6 = IconCompatParcelizer + 25;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str17.hashCode();
        }
        String str18 = this.placeId;
        if (str18 == null) {
            int i8 = RemoteActionCompatParcelizer + 35;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str18.hashCode();
        }
        String str19 = this.province;
        int iHashCode21 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.room;
        int iHashCode22 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.specialInstructions;
        int iHashCode23 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.specialInstructionsLink;
        int iHashCode24 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.state;
        int iHashCode25 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.streetAddress;
        if (str24 == null) {
            int i10 = IconCompatParcelizer + 91;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str24.hashCode();
        }
        String str25 = this.structure;
        if (str25 == null) {
            int i12 = RemoteActionCompatParcelizer + 21;
            int i13 = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i13;
            int i14 = i12 % 2;
            int i15 = i13 + 7;
            RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = str25.hashCode();
        }
        String str26 = this.zip;
        return ((((((((((((((((((iRemoteActionCompatParcelizer + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str26 == null ? 0 : str26.hashCode());
    }

    public final String r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
        int iIconCompatParcelizer = getSelectionEndui_text.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getSelectionEndui_text.IconCompatParcelizer();
        return (String) RemoteActionCompatParcelizer(-2141467333, iIconCompatParcelizer, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{this}, getSelectionEndui_text.IconCompatParcelizer(), 2141467338, iIconCompatParcelizer2);
    }

    public final String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        int iIconCompatParcelizer = getSelectionEndui_text.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getSelectionEndui_text.IconCompatParcelizer();
        return (String) RemoteActionCompatParcelizer(-346440710, iIconCompatParcelizer, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{this}, getSelectionEndui_text.IconCompatParcelizer(), 346440714, iIconCompatParcelizer2);
    }

    public final String r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        int iIconCompatParcelizer = getSelectionEndui_text.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getSelectionEndui_text.IconCompatParcelizer();
        return (String) RemoteActionCompatParcelizer(1638258750, iIconCompatParcelizer, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{this}, getSelectionEndui_text.IconCompatParcelizer(), -1638258748, iIconCompatParcelizer2);
    }

    public final double r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        int iIconCompatParcelizer = getSelectionEndui_text.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getSelectionEndui_text.IconCompatParcelizer();
        return ((Double) RemoteActionCompatParcelizer(-1947605971, iIconCompatParcelizer, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{this}, getSelectionEndui_text.IconCompatParcelizer(), 1947605971, iIconCompatParcelizer2)).doubleValue();
    }

    public final String RemoteActionCompatParcelizer() {
        int iIconCompatParcelizer = getSelectionEndui_text.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getSelectionEndui_text.IconCompatParcelizer();
        return (String) RemoteActionCompatParcelizer(-1936854517, iIconCompatParcelizer, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{this}, getSelectionEndui_text.IconCompatParcelizer(), 1936854518, iIconCompatParcelizer2);
    }

    public final boolean equals(Object obj) {
        int iIconCompatParcelizer = getSelectionEndui_text.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getSelectionEndui_text.IconCompatParcelizer();
        return ((Boolean) RemoteActionCompatParcelizer(-1515466945, iIconCompatParcelizer, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{this, obj}, getSelectionEndui_text.IconCompatParcelizer(), 1515466948, iIconCompatParcelizer2)).booleanValue();
    }
}
