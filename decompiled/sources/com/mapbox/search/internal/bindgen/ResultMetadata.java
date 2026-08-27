package com.mapbox.search.internal.bindgen;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;
import o.getBitmapFromCache;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes3.dex */
public class ResultMetadata implements Serializable {
    private final Double avRating;
    private final List<ResultChildMetadata> children;
    private final String cpsJson;
    private final List<String> cuisines;
    private final HashMap<String, String> data;
    private final Boolean delivery;
    private final String description;
    private final List<DisplayText> directions;
    private final Boolean driveThrough;
    private final String email;
    private final EvMetadata evMetadata;
    private final String facebookId;
    private final List<Facility> facilities;
    private final String fax;
    private final String instagram;
    private final String lastUpdated;
    private final OpenHours openHours;
    private final List<ImageInfo> otherPhoto;
    private final ParkingData parking;
    private final Boolean parkingAvailable;
    private final ParkingInfo parkingInfo;
    private final ParkingType parkingType;
    private final String phone;
    private final Float popularity;
    private final String priceLevel;
    private final List<ImageInfo> primaryPhoto;
    private final Float rating;
    private final Boolean reservable;
    private final Integer reviewCount;
    private final Boolean servesBeer;
    private final Boolean servesBreakfast;
    private final Boolean servesBrunch;
    private final Boolean servesDinner;
    private final Boolean servesLunch;
    private final Boolean servesVegan;
    private final Boolean servesVegetarian;
    private final Boolean servesWine;
    private final Boolean streetParking;
    private final Boolean takeout;
    private final String timezone;
    private final String twitter;
    private final Boolean valetParking;
    private final String website;
    private final Boolean wheelchairAccessible;

    public Double getAvRating() {
        return this.avRating;
    }

    public List<ResultChildMetadata> getChildren() {
        return this.children;
    }

    public String getCpsJson() {
        return this.cpsJson;
    }

    public List<String> getCuisines() {
        return this.cuisines;
    }

    public HashMap<String, String> getData() {
        return this.data;
    }

    public Boolean getDelivery() {
        return this.delivery;
    }

    public String getDescription() {
        return this.description;
    }

    public List<DisplayText> getDirections() {
        return this.directions;
    }

    public Boolean getDriveThrough() {
        return this.driveThrough;
    }

    public String getEmail() {
        return this.email;
    }

    public EvMetadata getEvMetadata() {
        return this.evMetadata;
    }

    public String getFacebookId() {
        return this.facebookId;
    }

    public List<Facility> getFacilities() {
        return this.facilities;
    }

    public String getFax() {
        return this.fax;
    }

    public String getInstagram() {
        return this.instagram;
    }

    public String getLastUpdated() {
        return this.lastUpdated;
    }

    public OpenHours getOpenHours() {
        return this.openHours;
    }

    public List<ImageInfo> getOtherPhoto() {
        return this.otherPhoto;
    }

    public ParkingData getParking() {
        return this.parking;
    }

    public Boolean getParkingAvailable() {
        return this.parkingAvailable;
    }

    public ParkingInfo getParkingInfo() {
        return this.parkingInfo;
    }

    public ParkingType getParkingType() {
        return this.parkingType;
    }

    public String getPhone() {
        return this.phone;
    }

    public Float getPopularity() {
        return this.popularity;
    }

    public String getPriceLevel() {
        return this.priceLevel;
    }

    public List<ImageInfo> getPrimaryPhoto() {
        return this.primaryPhoto;
    }

    public Float getRating() {
        return this.rating;
    }

    public Boolean getReservable() {
        return this.reservable;
    }

    public Integer getReviewCount() {
        return this.reviewCount;
    }

    public Boolean getServesBeer() {
        return this.servesBeer;
    }

    public Boolean getServesBreakfast() {
        return this.servesBreakfast;
    }

    public Boolean getServesBrunch() {
        return this.servesBrunch;
    }

    public Boolean getServesDinner() {
        return this.servesDinner;
    }

    public Boolean getServesLunch() {
        return this.servesLunch;
    }

    public Boolean getServesVegan() {
        return this.servesVegan;
    }

    public Boolean getServesVegetarian() {
        return this.servesVegetarian;
    }

    public Boolean getServesWine() {
        return this.servesWine;
    }

    public Boolean getStreetParking() {
        return this.streetParking;
    }

    public Boolean getTakeout() {
        return this.takeout;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public String getTwitter() {
        return this.twitter;
    }

    public Boolean getValetParking() {
        return this.valetParking;
    }

    public String getWebsite() {
        return this.website;
    }

    public Boolean getWheelchairAccessible() {
        return this.wheelchairAccessible;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.reviewCount, this.phone, this.website, this.avRating, this.description, this.openHours, this.primaryPhoto, this.otherPhoto, this.cpsJson, this.parking, this.children, this.data, this.wheelchairAccessible, this.delivery, this.driveThrough, this.reservable, this.parkingAvailable, this.valetParking, this.streetParking, this.parkingType, this.servesBreakfast, this.servesBrunch, this.servesDinner, this.servesLunch, this.servesWine, this.servesBeer, this.takeout, this.facebookId, this.fax, this.email, this.instagram, this.twitter, this.priceLevel, this.servesVegan, this.servesVegetarian, this.rating, this.popularity, this.evMetadata, this.directions, this.facilities, this.timezone, this.lastUpdated, this.cuisines, this.parkingInfo);
    }

    public ResultMetadata(Integer num, String str, String str2, Double d, String str3, OpenHours openHours, List<ImageInfo> list, List<ImageInfo> list2, String str4, ParkingData parkingData, List<ResultChildMetadata> list3, HashMap<String, String> map, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, ParkingType parkingType, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool15, Boolean bool16, Float f, Float f2, EvMetadata evMetadata, List<DisplayText> list4, List<Facility> list5, String str11, String str12, List<String> list6, ParkingInfo parkingInfo) {
        this.reviewCount = num;
        this.phone = str;
        this.website = str2;
        this.avRating = d;
        this.description = str3;
        this.openHours = openHours;
        this.primaryPhoto = list;
        this.otherPhoto = list2;
        this.cpsJson = str4;
        this.parking = parkingData;
        this.children = list3;
        this.data = map;
        this.wheelchairAccessible = bool;
        this.delivery = bool2;
        this.driveThrough = bool3;
        this.reservable = bool4;
        this.parkingAvailable = bool5;
        this.valetParking = bool6;
        this.streetParking = bool7;
        this.parkingType = parkingType;
        this.servesBreakfast = bool8;
        this.servesBrunch = bool9;
        this.servesDinner = bool10;
        this.servesLunch = bool11;
        this.servesWine = bool12;
        this.servesBeer = bool13;
        this.takeout = bool14;
        this.facebookId = str5;
        this.fax = str6;
        this.email = str7;
        this.instagram = str8;
        this.twitter = str9;
        this.priceLevel = str10;
        this.servesVegan = bool15;
        this.servesVegetarian = bool16;
        this.rating = f;
        this.popularity = f2;
        this.evMetadata = evMetadata;
        this.directions = list4;
        this.facilities = list5;
        this.timezone = str11;
        this.lastUpdated = str12;
        this.cuisines = list6;
        this.parkingInfo = parkingInfo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[reviewCount: ");
        SweepGradientShader9KIMszodefault.read(this.reviewCount, ", phone: ", sb);
        IconCompatParcelizer.read(sb, this.phone, ", website: ");
        IconCompatParcelizer.read(sb, this.website, ", avRating: ");
        af$$ExternalSyntheticOutline1.m(this.avRating, sb, ", description: ");
        IconCompatParcelizer.read(sb, this.description, ", openHours: ");
        sb.append(RecordUtils.fieldToString(this.openHours));
        sb.append(", primaryPhoto: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.primaryPhoto, ", otherPhoto: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.otherPhoto, ", cpsJson: ");
        IconCompatParcelizer.read(sb, this.cpsJson, ", parking: ");
        sb.append(RecordUtils.fieldToString(this.parking));
        sb.append(", children: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.children, ", data: ");
        sb.append(RecordUtils.fieldToString(this.data));
        sb.append(", wheelchairAccessible: ");
        getBitmapFromCache.write(sb, ", delivery: ", this.wheelchairAccessible);
        getBitmapFromCache.write(sb, ", driveThrough: ", this.delivery);
        getBitmapFromCache.write(sb, ", reservable: ", this.driveThrough);
        getBitmapFromCache.write(sb, ", parkingAvailable: ", this.reservable);
        getBitmapFromCache.write(sb, ", valetParking: ", this.parkingAvailable);
        getBitmapFromCache.write(sb, ", streetParking: ", this.valetParking);
        getBitmapFromCache.write(sb, ", parkingType: ", this.streetParking);
        sb.append(RecordUtils.fieldToString(this.parkingType));
        sb.append(", servesBreakfast: ");
        getBitmapFromCache.write(sb, ", servesBrunch: ", this.servesBreakfast);
        getBitmapFromCache.write(sb, ", servesDinner: ", this.servesBrunch);
        getBitmapFromCache.write(sb, ", servesLunch: ", this.servesDinner);
        getBitmapFromCache.write(sb, ", servesWine: ", this.servesLunch);
        getBitmapFromCache.write(sb, ", servesBeer: ", this.servesWine);
        getBitmapFromCache.write(sb, ", takeout: ", this.servesBeer);
        getBitmapFromCache.write(sb, ", facebookId: ", this.takeout);
        IconCompatParcelizer.read(sb, this.facebookId, ", fax: ");
        IconCompatParcelizer.read(sb, this.fax, ", email: ");
        IconCompatParcelizer.read(sb, this.email, ", instagram: ");
        IconCompatParcelizer.read(sb, this.instagram, ", twitter: ");
        IconCompatParcelizer.read(sb, this.twitter, ", priceLevel: ");
        IconCompatParcelizer.read(sb, this.priceLevel, ", servesVegan: ");
        getBitmapFromCache.write(sb, ", servesVegetarian: ", this.servesVegan);
        getBitmapFromCache.write(sb, ", rating: ", this.servesVegetarian);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.rating, sb, ", popularity: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.popularity, sb, ", evMetadata: ");
        sb.append(RecordUtils.fieldToString(this.evMetadata));
        sb.append(", directions: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.directions, ", facilities: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.facilities, ", timezone: ");
        IconCompatParcelizer.read(sb, this.timezone, ", lastUpdated: ");
        IconCompatParcelizer.read(sb, this.lastUpdated, ", cuisines: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.cuisines, ", parkingInfo: ");
        sb.append(RecordUtils.fieldToString(this.parkingInfo));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResultMetadata resultMetadata = (ResultMetadata) obj;
        return Objects.equals(this.reviewCount, resultMetadata.reviewCount) && Objects.equals(this.phone, resultMetadata.phone) && Objects.equals(this.website, resultMetadata.website) && Objects.equals(this.avRating, resultMetadata.avRating) && Objects.equals(this.description, resultMetadata.description) && Objects.equals(this.openHours, resultMetadata.openHours) && Objects.equals(this.primaryPhoto, resultMetadata.primaryPhoto) && Objects.equals(this.otherPhoto, resultMetadata.otherPhoto) && Objects.equals(this.cpsJson, resultMetadata.cpsJson) && Objects.equals(this.parking, resultMetadata.parking) && Objects.equals(this.children, resultMetadata.children) && Objects.equals(this.data, resultMetadata.data) && Objects.equals(this.wheelchairAccessible, resultMetadata.wheelchairAccessible) && Objects.equals(this.delivery, resultMetadata.delivery) && Objects.equals(this.driveThrough, resultMetadata.driveThrough) && Objects.equals(this.reservable, resultMetadata.reservable) && Objects.equals(this.parkingAvailable, resultMetadata.parkingAvailable) && Objects.equals(this.valetParking, resultMetadata.valetParking) && Objects.equals(this.streetParking, resultMetadata.streetParking) && Objects.equals(this.parkingType, resultMetadata.parkingType) && Objects.equals(this.servesBreakfast, resultMetadata.servesBreakfast) && Objects.equals(this.servesBrunch, resultMetadata.servesBrunch) && Objects.equals(this.servesDinner, resultMetadata.servesDinner) && Objects.equals(this.servesLunch, resultMetadata.servesLunch) && Objects.equals(this.servesWine, resultMetadata.servesWine) && Objects.equals(this.servesBeer, resultMetadata.servesBeer) && Objects.equals(this.takeout, resultMetadata.takeout) && Objects.equals(this.facebookId, resultMetadata.facebookId) && Objects.equals(this.fax, resultMetadata.fax) && Objects.equals(this.email, resultMetadata.email) && Objects.equals(this.instagram, resultMetadata.instagram) && Objects.equals(this.twitter, resultMetadata.twitter) && Objects.equals(this.priceLevel, resultMetadata.priceLevel) && Objects.equals(this.servesVegan, resultMetadata.servesVegan) && Objects.equals(this.servesVegetarian, resultMetadata.servesVegetarian) && Objects.equals(this.rating, resultMetadata.rating) && Objects.equals(this.popularity, resultMetadata.popularity) && Objects.equals(this.evMetadata, resultMetadata.evMetadata) && Objects.equals(this.directions, resultMetadata.directions) && Objects.equals(this.facilities, resultMetadata.facilities) && Objects.equals(this.timezone, resultMetadata.timezone) && Objects.equals(this.lastUpdated, resultMetadata.lastUpdated) && Objects.equals(this.cuisines, resultMetadata.cuisines) && Objects.equals(this.parkingInfo, resultMetadata.parkingInfo);
    }
}
