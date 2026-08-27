package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.database.entity.Address$Companion;
import kotlinx.serialization.Serializable;
import o.accessgetTopcp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class accessgetTextTopcp {
    public static final Address$Companion Companion = new Object() { // from class: com.roadrunner.database.entity.Address$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 85;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return accessgetTopcp.serializer;
            }
            accessgetTopcp accessgettopcp = accessgetTopcp.serializer;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String addressLine1;
    public final String addressLine2;
    public final String addressLine3;
    public final String addressOther;
    public final String apartmentNumber;
    public final String building;
    public final String city;
    public final Long cityId;
    public final String company;
    public final String country;
    public final String countryCode;
    public final String district;
    public final String entrance;
    public final String floor;
    public final String intercom;
    public final double latitude;
    public final double longitude;
    public final String neighborhood;
    public final String placeId;
    public final String primary;
    public final String province;
    public final String room;
    public final String secondary;
    public final String specialInstructions;
    public final String specialInstructionsLink;
    public final String state;
    public final String streetAddress;
    public final String structure;
    public final String zip;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.database.entity.Address$Companion] */
    static {
        int i = serializer + 109;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    public /* synthetic */ accessgetTextTopcp(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, String str10, String str11, String str12, String str13, String str14, String str15, String str16, double d, double d2, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26) {
        if (393216 != (i & 393216)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 393216, accessgetTopcp.serializer.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.primary = null;
        } else {
            this.primary = str;
        }
        if ((i & 2) == 0) {
            this.secondary = null;
        } else {
            this.secondary = str2;
        }
        if ((i & 4) == 0) {
            this.addressLine1 = null;
        } else {
            this.addressLine1 = str3;
        }
        if ((i & 8) == 0) {
            this.addressLine2 = null;
            int i2 = RemoteActionCompatParcelizer + 67;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 4 / 4;
            } else {
                int i4 = 2 % 2;
            }
        } else {
            this.addressLine2 = str4;
            int i5 = RemoteActionCompatParcelizer + 89;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        if ((i & 16) == 0) {
            this.addressLine3 = null;
        } else {
            this.addressLine3 = str5;
        }
        if ((i & 32) == 0) {
            this.addressOther = null;
        } else {
            this.addressOther = str6;
        }
        if ((i & 64) == 0) {
            this.apartmentNumber = null;
        } else {
            this.apartmentNumber = str7;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            int i7 = IconCompatParcelizer + 119;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                this.building = null;
                throw null;
            }
            this.building = null;
        } else {
            this.building = str8;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.city = null;
        } else {
            this.city = str9;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            int i8 = RemoteActionCompatParcelizer + 67;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            this.cityId = null;
        } else {
            this.cityId = l;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationZ) == 0) {
            this.company = null;
        } else {
            this.company = str10;
        }
        if ((i & androidx.compose.ui.graphics.Fields.CameraDistance) == 0) {
            this.country = null;
            int i10 = IconCompatParcelizer + 67;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                int i11 = 2 % 2;
            }
        } else {
            this.country = str11;
        }
        if ((i & androidx.compose.ui.graphics.Fields.TransformOrigin) == 0) {
            this.countryCode = null;
        } else {
            this.countryCode = str12;
        }
        if ((i & 8192) == 0) {
            this.district = null;
        } else {
            this.district = str13;
        }
        if ((i & androidx.compose.ui.graphics.Fields.Clip) == 0) {
            int i12 = IconCompatParcelizer + 81;
            RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            this.entrance = null;
        } else {
            this.entrance = str14;
        }
        if ((32768 & i) == 0) {
            this.floor = null;
        } else {
            this.floor = str15;
        }
        if ((65536 & i) == 0) {
            this.intercom = null;
        } else {
            this.intercom = str16;
            int i14 = 2 % 2;
        }
        this.latitude = d;
        this.longitude = d2;
        if ((524288 & i) == 0) {
            this.neighborhood = null;
        } else {
            this.neighborhood = str17;
        }
        if ((1048576 & i) == 0) {
            this.placeId = null;
        } else {
            this.placeId = str18;
        }
        if ((2097152 & i) == 0) {
            this.province = null;
        } else {
            this.province = str19;
        }
        if ((4194304 & i) == 0) {
            int i15 = IconCompatParcelizer + 99;
            RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                this.room = null;
                int i16 = 34 / 0;
            } else {
                this.room = null;
            }
        } else {
            this.room = str20;
        }
        if ((8388608 & i) == 0) {
            int i17 = IconCompatParcelizer + 21;
            RemoteActionCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                this.specialInstructions = null;
                int i18 = 21 / 0;
            } else {
                this.specialInstructions = null;
            }
        } else {
            this.specialInstructions = str21;
        }
        if ((16777216 & i) == 0) {
            this.specialInstructionsLink = null;
        } else {
            this.specialInstructionsLink = str22;
        }
        if ((33554432 & i) == 0) {
            this.state = null;
        } else {
            this.state = str23;
        }
        if ((67108864 & i) == 0) {
            this.streetAddress = null;
        } else {
            this.streetAddress = str24;
        }
        if ((134217728 & i) == 0) {
            this.structure = null;
            int i19 = 2 % 2;
        } else {
            this.structure = str25;
        }
        if ((i & 268435456) == 0) {
            this.zip = null;
        } else {
            this.zip = str26;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Address(primary=", this.primary, ", secondary=", this.secondary, ", addressLine1=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.addressLine1, ", addressLine2=", this.addressLine2, ", addressLine3=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.addressLine3, ", addressOther=", this.addressOther, ", apartmentNumber=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.apartmentNumber, ", building=", this.building, ", city=");
        sbM.append(this.city);
        sbM.append(", cityId=");
        sbM.append(this.cityId);
        sbM.append(", company=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.company, ", country=", this.country, ", countryCode=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.countryCode, ", district=", this.district, ", entrance=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.entrance, ", floor=", this.floor, ", intercom=");
        sbM.append(this.intercom);
        sbM.append(", latitude=");
        sbM.append(this.latitude);
        sbM.append(", longitude=");
        sbM.append(this.longitude);
        sbM.append(", neighborhood=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.neighborhood, ", placeId=", this.placeId, ", province=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.province, ", room=", this.room, ", specialInstructions=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.specialInstructions, ", specialInstructionsLink=", this.specialInstructionsLink, ", state=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.state, ", streetAddress=", this.streetAddress, ", structure=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.structure, ", zip=", this.zip, ")");
        int i4 = RemoteActionCompatParcelizer + 41;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public accessgetTextTopcp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, String str10, String str11, String str12, String str13, String str14, String str15, String str16, double d, double d2, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26) {
        this.primary = str;
        this.secondary = str2;
        this.addressLine1 = str3;
        this.addressLine2 = str4;
        this.addressLine3 = str5;
        this.addressOther = str6;
        this.apartmentNumber = str7;
        this.building = str8;
        this.city = str9;
        this.cityId = l;
        this.company = str10;
        this.country = str11;
        this.countryCode = str12;
        this.district = str13;
        this.entrance = str14;
        this.floor = str15;
        this.intercom = str16;
        this.latitude = d;
        this.longitude = d2;
        this.neighborhood = str17;
        this.placeId = str18;
        this.province = str19;
        this.room = str20;
        this.specialInstructions = str21;
        this.specialInstructionsLink = str22;
        this.state = str23;
        this.streetAddress = str24;
        this.structure = str25;
        this.zip = str26;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetTextTopcp)) {
            return false;
        }
        accessgetTextTopcp accessgettexttopcp = (accessgetTextTopcp) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.primary, accessgettexttopcp.primary}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.secondary, accessgettexttopcp.secondary}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.addressLine1, accessgettexttopcp.addressLine1}, getCieXyz.write())).booleanValue())) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.addressLine2, accessgettexttopcp.addressLine2}, getCieXyz.write())).booleanValue()) {
                int i2 = IconCompatParcelizer + 121;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.addressLine3, accessgettexttopcp.addressLine3}, getCieXyz.write())).booleanValue()) {
                int i4 = RemoteActionCompatParcelizer + 85;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.addressOther, accessgettexttopcp.addressOther}, getCieXyz.write())).booleanValue()) {
                int i6 = IconCompatParcelizer + 117;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.apartmentNumber, accessgettexttopcp.apartmentNumber}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.building, accessgettexttopcp.building}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.city, accessgettexttopcp.city}, getCieXyz.write())).booleanValue())) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cityId, accessgettexttopcp.cityId}, getCieXyz.write())).booleanValue()) {
                    int i8 = IconCompatParcelizer + 3;
                    RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        return false;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.company, accessgettexttopcp.company}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.country, accessgettexttopcp.country}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryCode, accessgettexttopcp.countryCode}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.district, accessgettexttopcp.district}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.entrance, accessgettexttopcp.entrance}, getCieXyz.write())).booleanValue()) {
                    int i9 = IconCompatParcelizer + 67;
                    RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.floor, accessgettexttopcp.floor}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.intercom, accessgettexttopcp.intercom}, getCieXyz.write())).booleanValue()) {
                    int i11 = IconCompatParcelizer + 123;
                    RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    return false;
                }
                if (Double.compare(this.latitude, accessgettexttopcp.latitude) != 0 || Double.compare(this.longitude, accessgettexttopcp.longitude) != 0) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.neighborhood, accessgettexttopcp.neighborhood}, getCieXyz.write())).booleanValue()) {
                    int i13 = RemoteActionCompatParcelizer + 31;
                    IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.placeId, accessgettexttopcp.placeId}, getCieXyz.write())).booleanValue()) {
                    int i15 = IconCompatParcelizer + 91;
                    RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    return false;
                }
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.province, accessgettexttopcp.province}, getCieXyz.write())).booleanValue())) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.room, accessgettexttopcp.room}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.specialInstructions, accessgettexttopcp.specialInstructions}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.specialInstructionsLink, accessgettexttopcp.specialInstructionsLink}, getCieXyz.write())).booleanValue()) {
                        int i17 = IconCompatParcelizer + 99;
                        RemoteActionCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.state, accessgettexttopcp.state}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.streetAddress, accessgettexttopcp.streetAddress}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.structure, accessgettexttopcp.structure}, getCieXyz.write())).booleanValue()) {
                        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.zip, accessgettexttopcp.zip}, getCieXyz.write())).booleanValue();
                    }
                    int i19 = RemoteActionCompatParcelizer + 61;
                    IconCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int i;
        int iHashCode2;
        int i2;
        int i3;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 75;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode7 = (i5 % 2 != 0 ? (str = this.primary) != null : (str = this.primary) != null) ? str.hashCode() : 0;
        String str2 = this.secondary;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.addressLine1;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.addressLine2;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.addressLine3;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.addressOther;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.apartmentNumber;
        int iHashCode13 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.building;
        if (str8 == null) {
            int i6 = RemoteActionCompatParcelizer + 21;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str8.hashCode();
        }
        String str9 = this.city;
        int iHashCode14 = str9 == null ? 0 : str9.hashCode();
        Long l = this.cityId;
        int iHashCode15 = l == null ? 0 : l.hashCode();
        String str10 = this.company;
        int iHashCode16 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.country;
        int iHashCode17 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.countryCode;
        int iHashCode18 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.district;
        int iHashCode19 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.entrance;
        int iHashCode20 = 1;
        if (str14 == null) {
            int i8 = IconCompatParcelizer + 87;
            i = iHashCode19;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode2 = i8 % 2 == 0 ? 1 : 0;
        } else {
            i = iHashCode19;
            iHashCode2 = str14.hashCode();
        }
        String str15 = this.floor;
        int iHashCode21 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.intercom;
        if (str16 == null) {
            int i9 = IconCompatParcelizer + 107;
            i2 = iHashCode2;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i3 = i9 % 2 == 0 ? 1 : 0;
        } else {
            i2 = iHashCode2;
            int iHashCode22 = str16.hashCode();
            int i10 = RemoteActionCompatParcelizer + 119;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i3 = iHashCode22;
        }
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.longitude, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.latitude, ((((((((((((((((((((((((((((((((iHashCode7 * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + i) * 31) + i2) * 31) + iHashCode21) * 31) + i3) * 31, 31), 31);
        String str17 = this.neighborhood;
        int iHashCode23 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.placeId;
        if (str18 == null) {
            int i12 = IconCompatParcelizer + 73;
            RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str18.hashCode();
        }
        String str19 = this.province;
        int iHashCode24 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.room;
        int iHashCode25 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.specialInstructions;
        if (str21 == null) {
            int i14 = IconCompatParcelizer + 5;
            RemoteActionCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode4 = i14 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode4 = str21.hashCode();
        }
        String str22 = this.specialInstructionsLink;
        int iHashCode26 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.state;
        if (str23 == null) {
            int i15 = RemoteActionCompatParcelizer + 29;
            IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                iHashCode20 = 0;
            }
        } else {
            iHashCode20 = str23.hashCode();
        }
        String str24 = this.streetAddress;
        if (str24 == null) {
            int i16 = IconCompatParcelizer + 31;
            RemoteActionCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i17 = i16 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str24.hashCode();
        }
        String str25 = this.structure;
        if (str25 == null) {
            int i18 = RemoteActionCompatParcelizer + 115;
            IconCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i19 = i18 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = str25.hashCode();
        }
        String str26 = this.zip;
        return ((((((((((((((((((iRemoteActionCompatParcelizer + iHashCode23) * 31) + iHashCode3) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode4) * 31) + iHashCode26) * 31) + iHashCode20) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str26 == null ? 0 : str26.hashCode());
    }
}
