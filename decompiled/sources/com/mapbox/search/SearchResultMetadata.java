package com.mapbox.search;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.mapbox.search.base.MetadataExtKt;
import com.mapbox.search.base.factory.ImageKt;
import com.mapbox.search.base.factory.ParkingTypeKt$WhenMappings;
import com.mapbox.search.base.factory.parking.ParkingAvailabilityLevelKt$WhenMappings;
import com.mapbox.search.base.factory.parking.ParkingPaymentMethodKt$WhenMappings;
import com.mapbox.search.base.factory.parking.ParkingPaymentTypeKt$WhenMappings;
import com.mapbox.search.base.factory.parking.ParkingPriceTypeKt$WhenMappings;
import com.mapbox.search.base.factory.parking.ParkingRateCustomDurationValueKt$WhenMappings;
import com.mapbox.search.base.factory.parking.ParkingTrendKt$WhenMappings;
import com.mapbox.search.base.logger.LogKt;
import com.mapbox.search.common.metadata.ChildMetadata;
import com.mapbox.search.common.metadata.OpenHours;
import com.mapbox.search.common.metadata.ParkingData;
import com.mapbox.search.common.metadata.WeekDay;
import com.mapbox.search.common.metadata.WeekTimestamp;
import com.mapbox.search.common.parking.ParkingInfo;
import com.mapbox.search.common.parking.ParkingRateInfo;
import com.mapbox.search.common.parking.ParkingRateTime;
import com.mapbox.search.common.parking.ParkingRateValue;
import com.mapbox.search.internal.bindgen.ImageInfo;
import com.mapbox.search.internal.bindgen.OpenPeriod;
import com.mapbox.search.internal.bindgen.ParkingAvailabilityLevel;
import com.mapbox.search.internal.bindgen.ParkingPaymentMethod;
import com.mapbox.search.internal.bindgen.ParkingPaymentType;
import com.mapbox.search.internal.bindgen.ParkingPriceType;
import com.mapbox.search.internal.bindgen.ParkingRate;
import com.mapbox.search.internal.bindgen.ParkingRateCustomValue;
import com.mapbox.search.internal.bindgen.ParkingRatePrice;
import com.mapbox.search.internal.bindgen.ParkingRestriction;
import com.mapbox.search.internal.bindgen.ParkingTrend;
import com.mapbox.search.internal.bindgen.ParkingType;
import com.mapbox.search.internal.bindgen.ResultChildMetadata;
import com.mapbox.search.internal.bindgen.ResultMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchResultMetadata implements Parcelable {
    public static final Parcelable.Creator<SearchResultMetadata> CREATOR = new EtaType.Creator(7);
    public final Double averageRating;
    public final ArrayList children;
    public final ResultMetadata coreMetadata;
    public final String countryIso1;
    public final String countryIso2;
    public final String cpsJson;
    public final List cuisines;
    public final Boolean delivery;
    public final String description;
    public final Boolean driveThrough;
    public final String email;
    public final HashMap extraData;
    public final String facebookId;
    public final String fax;
    public final String instagram;
    public final OpenHours openHours;
    public final ArrayList otherPhotos;
    public final ParkingData parking;
    public final Boolean parkingAvailable;
    public final ParkingInfo parkingInfo;
    public final String parkingType;
    public final String phone;
    public final Float popularity;
    public final String priceLevel;
    public final ArrayList primaryPhotos;
    public final Float rating;
    public final Boolean reservable;
    public final Integer reviewCount;
    public final Boolean servesBeer;
    public final Boolean servesBreakfast;
    public final Boolean servesBrunch;
    public final Boolean servesDinner;
    public final Boolean servesLunch;
    public final Boolean servesVegan;
    public final Boolean servesVegetarian;
    public final Boolean servesWine;
    public final Boolean streetParking;
    public final Boolean takeout;
    public final String twitter;
    public final Boolean valetParking;
    public final String website;
    public final Boolean wheelchairAccessible;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:327:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x034a  */
    public SearchResultMetadata(ResultMetadata resultMetadata) {
        ArrayList arrayList;
        ArrayList arrayList2;
        OpenHours scheduled;
        ArrayList arrayList3;
        ParkingInfo parkingInfo;
        String str;
        ParkingRateInfo parkingRateInfo;
        String str2;
        String str3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        String str9;
        ParkingRateValue customDurationValue;
        String str10;
        ArrayList arrayList10;
        ParkingRateTime parkingRateTime;
        WeekTimestamp weekTimestampCreateWeekTimestamp;
        WeekDay weekDayWeekDayFromCore;
        WeekTimestamp weekTimestampCreateWeekTimestamp2;
        resultMetadata.getClass();
        this.coreMetadata = resultMetadata;
        HashMap<String, String> data = resultMetadata.getData();
        data.getClass();
        this.extraData = data;
        this.reviewCount = resultMetadata.getReviewCount();
        this.phone = resultMetadata.getPhone();
        this.website = resultMetadata.getWebsite();
        this.averageRating = resultMetadata.getAvRating();
        this.description = resultMetadata.getDescription();
        List<ImageInfo> primaryPhoto = resultMetadata.getPrimaryPhoto();
        int i = 10;
        if (primaryPhoto != null) {
            List<ImageInfo> list = primaryPhoto;
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            for (ImageInfo imageInfo : list) {
                imageInfo.getClass();
                arrayList.add(ImageKt.mapToPlatform(imageInfo));
            }
        } else {
            arrayList = null;
        }
        this.primaryPhotos = arrayList;
        List<ImageInfo> otherPhoto = this.coreMetadata.getOtherPhoto();
        if (otherPhoto != null) {
            List<ImageInfo> list2 = otherPhoto;
            arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            for (ImageInfo imageInfo2 : list2) {
                imageInfo2.getClass();
                arrayList2.add(ImageKt.mapToPlatform(imageInfo2));
            }
        } else {
            arrayList2 = null;
        }
        this.otherPhotos = arrayList2;
        com.mapbox.search.internal.bindgen.OpenHours openHours = this.coreMetadata.getOpenHours();
        if (openHours != null) {
            int i2 = MetadataExtKt.WhenMappings.$EnumSwitchMapping$0[openHours.getMode().ordinal()];
            if (i2 == 1) {
                scheduled = OpenHours.AlwaysOpen.INSTANCE;
            } else if (i2 == 2) {
                scheduled = OpenHours.TemporaryClosed.INSTANCE;
            } else if (i2 == 3) {
                scheduled = OpenHours.PermanentlyClosed.INSTANCE;
            } else {
                if (i2 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    throw null;
                }
                List<OpenPeriod> periods = openHours.getPeriods();
                periods.getClass();
                ArrayList arrayList11 = new ArrayList();
                for (OpenPeriod openPeriod : periods) {
                    openPeriod.getClass();
                    WeekDay weekDayWeekDayFromCore2 = MetadataExtKt.weekDayFromCore(openPeriod.getOpenD());
                    com.mapbox.search.common.metadata.OpenPeriod openPeriod2 = (weekDayWeekDayFromCore2 == null || (weekTimestampCreateWeekTimestamp = MetadataExtKt.createWeekTimestamp(weekDayWeekDayFromCore2, openPeriod.getOpenH(), openPeriod.getOpenM())) == null || (weekDayWeekDayFromCore = MetadataExtKt.weekDayFromCore(openPeriod.getClosedD())) == null || (weekTimestampCreateWeekTimestamp2 = MetadataExtKt.createWeekTimestamp(weekDayWeekDayFromCore, openPeriod.getClosedH(), openPeriod.getClosedM())) == null) ? null : new com.mapbox.search.common.metadata.OpenPeriod(weekTimestampCreateWeekTimestamp, weekTimestampCreateWeekTimestamp2);
                    if (openPeriod2 != null) {
                        arrayList11.add(openPeriod2);
                    }
                }
                if (arrayList11.isEmpty()) {
                    new IllegalStateException("CoreOpenHours type is SCHEDULED, but periods is empty", null);
                    LogKt.logw$default("CoreOpenHours type is SCHEDULED, but periods is empty");
                    scheduled = null;
                } else {
                    scheduled = new OpenHours.Scheduled(arrayList11, openHours.getWeekdayText(), openHours.getNote());
                }
            }
        } else {
            scheduled = null;
        }
        this.openHours = scheduled;
        com.mapbox.search.internal.bindgen.ParkingData parking = this.coreMetadata.getParking();
        this.parking = parking != null ? new ParkingData(parking.getCapacity(), parking.getForDisabilities()) : null;
        this.cpsJson = this.coreMetadata.getCpsJson();
        this.countryIso1 = this.coreMetadata.getData().get("iso_3166_1");
        this.countryIso2 = this.coreMetadata.getData().get("iso_3166_2");
        List<ResultChildMetadata> children = this.coreMetadata.getChildren();
        if (children != null) {
            List<ResultChildMetadata> list3 = children;
            arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
            for (ResultChildMetadata resultChildMetadata : list3) {
                resultChildMetadata.getClass();
                String mapboxId = resultChildMetadata.getMapboxId();
                mapboxId.getClass();
                arrayList3.add(new ChildMetadata(mapboxId, resultChildMetadata.getCoordinates(), resultChildMetadata.getName(), resultChildMetadata.getCategory()));
            }
        } else {
            arrayList3 = null;
        }
        this.children = arrayList3;
        this.wheelchairAccessible = this.coreMetadata.getWheelchairAccessible();
        this.delivery = this.coreMetadata.getDelivery();
        this.driveThrough = this.coreMetadata.getDriveThrough();
        this.reservable = this.coreMetadata.getReservable();
        this.parkingAvailable = this.coreMetadata.getParkingAvailable();
        this.valetParking = this.coreMetadata.getValetParking();
        this.streetParking = this.coreMetadata.getStreetParking();
        this.servesBreakfast = this.coreMetadata.getServesBreakfast();
        this.servesBrunch = this.coreMetadata.getServesBrunch();
        this.servesDinner = this.coreMetadata.getServesDinner();
        this.servesLunch = this.coreMetadata.getServesLunch();
        this.servesWine = this.coreMetadata.getServesWine();
        this.servesBeer = this.coreMetadata.getServesBeer();
        this.takeout = this.coreMetadata.getTakeout();
        this.facebookId = this.coreMetadata.getFacebookId();
        this.fax = this.coreMetadata.getFax();
        this.email = this.coreMetadata.getEmail();
        this.instagram = this.coreMetadata.getInstagram();
        this.twitter = this.coreMetadata.getTwitter();
        this.priceLevel = this.coreMetadata.getPriceLevel();
        this.servesVegan = this.coreMetadata.getServesVegan();
        this.servesVegetarian = this.coreMetadata.getServesVegetarian();
        this.rating = this.coreMetadata.getRating();
        this.popularity = this.coreMetadata.getPopularity();
        this.cuisines = this.coreMetadata.getCuisines();
        com.mapbox.search.internal.bindgen.ParkingInfo parkingInfo2 = this.coreMetadata.getParkingInfo();
        if (parkingInfo2 != null) {
            Integer capacity = parkingInfo2.getCapacity();
            com.mapbox.search.internal.bindgen.ParkingRateInfo rateInfo = parkingInfo2.getRateInfo();
            if (rateInfo != null) {
                String currencySymbol = rateInfo.getCurrencySymbol();
                String currencyCode = rateInfo.getCurrencyCode();
                List<ParkingRate> rates = rateInfo.getRates();
                if (rates != null) {
                    List<ParkingRate> list4 = rates;
                    arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
                    for (ParkingRate parkingRate : list4) {
                        parkingRate.getClass();
                        String maxStay = parkingRate.getMaxStay();
                        List<com.mapbox.search.internal.bindgen.ParkingRateTime> times = parkingRate.getTimes();
                        if (times != null) {
                            arrayList8 = new ArrayList();
                            for (com.mapbox.search.internal.bindgen.ParkingRateTime parkingRateTime2 : times) {
                                parkingRateTime2.getClass();
                                List<Byte> days = parkingRateTime2.getDays();
                                if (days != null) {
                                    List<Byte> list5 = days;
                                    ArrayList arrayList12 = new ArrayList(accessgetInstancedelegatecp.write(list5, i));
                                    Iterator<T> it = list5.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Byte b = (Byte) it.next();
                                            b.getClass();
                                            WeekDay weekDayWeekDayFromCore3 = MetadataExtKt.weekDayFromCore(b.byteValue());
                                            if (weekDayWeekDayFromCore3 == null) {
                                                parkingRateTime = null;
                                            } else {
                                                arrayList12.add(weekDayWeekDayFromCore3);
                                            }
                                        } else {
                                            arrayList10 = arrayList12;
                                        }
                                    }
                                    if (parkingRateTime != null) {
                                        arrayList8.add(parkingRateTime);
                                    }
                                } else {
                                    arrayList10 = null;
                                }
                                parkingRateTime = new ParkingRateTime(arrayList10, parkingRateTime2.getFromHour(), parkingRateTime2.getFromMinute(), parkingRateTime2.getToHour(), parkingRateTime2.getToMinute());
                                if (parkingRateTime != null) {
                                    arrayList8.add(parkingRateTime);
                                }
                            }
                        } else {
                            arrayList8 = null;
                        }
                        List<ParkingRatePrice> prices = parkingRate.getPrices();
                        if (prices != null) {
                            List<ParkingRatePrice> list6 = prices;
                            arrayList9 = new ArrayList(accessgetInstancedelegatecp.write(list6, i));
                            for (ParkingRatePrice parkingRatePrice : list6) {
                                parkingRatePrice.getClass();
                                ParkingPriceType type = parkingRatePrice.getType();
                                if (type != null) {
                                    int i3 = ParkingPriceTypeKt$WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                                    if (i3 == 1) {
                                        str9 = "DURATION";
                                    } else if (i3 == 2) {
                                        str9 = "DURATION_ADDITIONAL";
                                    } else {
                                        if (i3 != 3) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                            throw null;
                                        }
                                        str9 = "CUSTOM";
                                    }
                                } else {
                                    str9 = null;
                                }
                                Double amount = parkingRatePrice.getAmount();
                                com.mapbox.search.internal.bindgen.ParkingRateValue value = parkingRatePrice.getValue();
                                if (value == null) {
                                    customDurationValue = null;
                                } else if (value.isString()) {
                                    String string = value.getString();
                                    string.getClass();
                                    customDurationValue = new ParkingRateValue.IsoValue(string);
                                } else {
                                    ParkingRateCustomValue parkingRateCustomValue = value.getParkingRateCustomValue();
                                    parkingRateCustomValue.getClass();
                                    switch (ParkingRateCustomDurationValueKt$WhenMappings.$EnumSwitchMapping$0[parkingRateCustomValue.ordinal()]) {
                                        case 1:
                                            str10 = "SIX_MONTHS_MON_FRI";
                                            break;
                                        case 2:
                                            str10 = "BANK_HOLIDAY";
                                            break;
                                        case 3:
                                            str10 = "DAYTIME";
                                            break;
                                        case 4:
                                            str10 = "EARLY_BIRD";
                                            break;
                                        case 5:
                                            str10 = "EVENING";
                                            break;
                                        case 6:
                                            str10 = "FLAT_RATE";
                                            break;
                                        case 7:
                                            str10 = "MAX";
                                            break;
                                        case 8:
                                            str10 = "MAX_ONLY_ONCE";
                                            break;
                                        case 9:
                                            str10 = "MINIMUM";
                                            break;
                                        case 10:
                                            str10 = "MONTH";
                                            break;
                                        case 11:
                                            str10 = "MONTH_MON_FRI";
                                            break;
                                        case 12:
                                            str10 = "MONTH_RESERVED";
                                            break;
                                        case 13:
                                            str10 = "MONTH_UNRESERVED";
                                            break;
                                        case 14:
                                            str10 = "OVERNIGHT";
                                            break;
                                        case 15:
                                            str10 = "QUARTER_MON_FRI";
                                            break;
                                        case 16:
                                            str10 = "UNTIL_CLOSING";
                                            break;
                                        case 17:
                                            str10 = "WEEKEND";
                                            break;
                                        case 18:
                                            str10 = "YEAR_MON_FRI";
                                            break;
                                        default:
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                            throw null;
                                    }
                                    customDurationValue = new ParkingRateValue.CustomDurationValue(str10);
                                }
                                arrayList9.add(new com.mapbox.search.common.parking.ParkingRatePrice(str9, amount, customDurationValue));
                            }
                        } else {
                            arrayList9 = null;
                        }
                        arrayList7.add(new com.mapbox.search.common.parking.ParkingRate(maxStay, arrayList8, arrayList9));
                        i = 10;
                    }
                } else {
                    arrayList7 = null;
                }
                parkingRateInfo = new ParkingRateInfo(currencySymbol, currencyCode, arrayList7);
            } else {
                parkingRateInfo = null;
            }
            Integer availability = parkingInfo2.getAvailability();
            ParkingAvailabilityLevel availabilityLevel = parkingInfo2.getAvailabilityLevel();
            if (availabilityLevel != null) {
                int i4 = ParkingAvailabilityLevelKt$WhenMappings.$EnumSwitchMapping$0[availabilityLevel.ordinal()];
                if (i4 == 1) {
                    str8 = "LOW";
                } else if (i4 == 2) {
                    str8 = "MID";
                } else if (i4 == 3) {
                    str8 = "HIGH";
                } else {
                    if (i4 != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        throw null;
                    }
                    str8 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                }
                str2 = str8;
            } else {
                str2 = null;
            }
            String availabilityAt = parkingInfo2.getAvailabilityAt();
            ParkingTrend trend = parkingInfo2.getTrend();
            if (trend != null) {
                int i5 = ParkingTrendKt$WhenMappings.$EnumSwitchMapping$0[trend.ordinal()];
                if (i5 == 1) {
                    str7 = "NO_CHANGE";
                } else if (i5 == 2) {
                    str7 = "DECREASING";
                } else if (i5 == 3) {
                    str7 = "INCREASING";
                } else {
                    if (i5 != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        throw null;
                    }
                    str7 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                }
                str3 = str7;
            } else {
                str3 = null;
            }
            List<ParkingPaymentMethod> paymentMethods = parkingInfo2.getPaymentMethods();
            if (paymentMethods != null) {
                ArrayList arrayList13 = new ArrayList();
                for (ParkingPaymentMethod parkingPaymentMethod : paymentMethods) {
                    if (parkingPaymentMethod != null) {
                        switch (ParkingPaymentMethodKt$WhenMappings.$EnumSwitchMapping$0[parkingPaymentMethod.ordinal()]) {
                            case 1:
                                str6 = "PAY_ON_FOOT";
                                break;
                            case 2:
                                str6 = "PAY_AND_DISPLAY";
                                break;
                            case 3:
                                str6 = "PAY_ON_EXIT";
                                break;
                            case 4:
                                str6 = "PAY_ON_ENTRY";
                                break;
                            case 5:
                                str6 = "PARKING_METER";
                                break;
                            case 6:
                                str6 = "MULTI_SPACE_METER";
                                break;
                            case 7:
                                str6 = "HONESTY_BOX";
                                break;
                            case 8:
                                str6 = "ATTENDANT";
                                break;
                            case 9:
                                str6 = "PAY_BY_PLATE";
                                break;
                            case 10:
                                str6 = "PAY_AT_RECEPTION";
                                break;
                            case 11:
                                str6 = "PAY_BY_PHONE";
                                break;
                            case 12:
                                str6 = "PAY_BY_COUPON";
                                break;
                            case 13:
                                str6 = "ELECTRONIC_PARKING_SYSTEM";
                                break;
                            case 14:
                                str6 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                                break;
                            default:
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                throw null;
                        }
                    } else {
                        str6 = null;
                    }
                    if (str6 != null) {
                        arrayList13.add(str6);
                    }
                }
                arrayList4 = arrayList13;
            } else {
                arrayList4 = null;
            }
            List<ParkingPaymentType> paymentTypes = parkingInfo2.getPaymentTypes();
            if (paymentTypes != null) {
                ArrayList arrayList14 = new ArrayList();
                for (ParkingPaymentType parkingPaymentType : paymentTypes) {
                    if (parkingPaymentType != null) {
                        switch (ParkingPaymentTypeKt$WhenMappings.$EnumSwitchMapping$0[parkingPaymentType.ordinal()]) {
                            case 1:
                                str5 = "COINS";
                                break;
                            case 2:
                                str5 = "NOTES";
                                break;
                            case 3:
                                str5 = "CONTACTLESS";
                                break;
                            case 4:
                                str5 = "CARDS";
                                break;
                            case 5:
                                str5 = "MOBILE";
                                break;
                            case 6:
                                str5 = "CARDS_VISA";
                                break;
                            case 7:
                                str5 = "CARDS_MASTERCARD";
                                break;
                            case 8:
                                str5 = "CARDS_AMEX";
                                break;
                            case 9:
                                str5 = "CARDS_MAESTRO";
                                break;
                            case 10:
                                str5 = "EFTPOS";
                                break;
                            case 11:
                                str5 = "CARDS_DINERS";
                                break;
                            case 12:
                                str5 = "CARDS_GELDKARTE";
                                break;
                            case 13:
                                str5 = "CARDS_DISCOVER";
                                break;
                            case 14:
                                str5 = "CHEQUE";
                                break;
                            case 15:
                                str5 = "CARDS_ECASH";
                                break;
                            case 16:
                                str5 = "CARDS_JCB";
                                break;
                            case 17:
                                str5 = "CARDS_OPERATORCARD";
                                break;
                            case 18:
                                str5 = "CARDS_SMARTCARD";
                                break;
                            case 19:
                                str5 = "CARDS_TELEPEAGE";
                                break;
                            case 20:
                                str5 = "CARDS_TOTALGR";
                                break;
                            case 21:
                                str5 = "CARDS_MONEO";
                                break;
                            case 22:
                                str5 = "CARDS_FLASHPAY";
                                break;
                            case 23:
                                str5 = "CARDS_CASHCARD";
                                break;
                            case 24:
                                str5 = "CARDS_VCASHCARD";
                                break;
                            case 25:
                                str5 = "CARDS_CEPAS";
                                break;
                            case 26:
                                str5 = "CARDS_OCTOPUS";
                                break;
                            case 27:
                                str5 = "ALIPAY";
                                break;
                            case 28:
                                str5 = "WECHATPAY";
                                break;
                            case 29:
                                str5 = "CARDS_EASYCARD";
                                break;
                            case 30:
                                str5 = "CARDS_CARTEBLEUE";
                                break;
                            case 31:
                                str5 = "CARDS_TOUCHNGO";
                                break;
                            case 32:
                                str5 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                                break;
                            default:
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                throw null;
                        }
                    } else {
                        str5 = null;
                    }
                    if (str5 != null) {
                        arrayList14.add(str5);
                    }
                }
                arrayList5 = arrayList14;
            } else {
                arrayList5 = null;
            }
            List<ParkingRestriction> restrictions = parkingInfo2.getRestrictions();
            if (restrictions != null) {
                ArrayList arrayList15 = new ArrayList();
                for (ParkingRestriction parkingRestriction : restrictions) {
                    if (parkingRestriction != null) {
                        switch (ParkingTypeKt$WhenMappings.$EnumSwitchMapping$1[parkingRestriction.ordinal()]) {
                            case 1:
                                str4 = "EV_ONLY";
                                break;
                            case 2:
                                str4 = "PLUGGED";
                                break;
                            case 3:
                                str4 = "DISABLED";
                                break;
                            case 4:
                                str4 = "CUSTOMERS";
                                break;
                            case 5:
                                str4 = "MOTOR_CYCLES";
                                break;
                            case 6:
                                str4 = "NO_PARKING";
                                break;
                            case 7:
                                str4 = "MAX_STAY";
                                break;
                            case 8:
                                str4 = "MONTHLY_ONLY";
                                break;
                            case 9:
                                str4 = "NO_SUV";
                                break;
                            case 10:
                                str4 = "NO_LPG";
                                break;
                            case 11:
                                str4 = "VALET_ONLY";
                                break;
                            case 12:
                                str4 = "VISITORS_ONLY";
                                break;
                            case 13:
                                str4 = "EVENTS_ONLY";
                                break;
                            case 14:
                                str4 = "NO_RESTRICTIONS_OUTSIDE_HOURS";
                                break;
                            case 15:
                                str4 = "BOOKING_ONLY";
                                break;
                            case 16:
                                str4 = "PARKING_DISK";
                                break;
                            case 17:
                                str4 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                                break;
                            default:
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                throw null;
                        }
                    } else {
                        str4 = null;
                    }
                    if (str4 != null) {
                        arrayList15.add(str4);
                    }
                }
                arrayList6 = arrayList15;
            } else {
                arrayList6 = null;
            }
            parkingInfo = new ParkingInfo(capacity, parkingRateInfo, availability, str2, availabilityAt, str3, arrayList4, arrayList5, arrayList6);
        } else {
            parkingInfo = null;
        }
        this.parkingInfo = parkingInfo;
        ParkingType parkingType = this.coreMetadata.getParkingType();
        if (parkingType != null) {
            switch (ParkingTypeKt$WhenMappings.$EnumSwitchMapping$0[parkingType.ordinal()]) {
                case 1:
                    str = "ALONG_MOTORWAY";
                    break;
                case 2:
                    str = "PARKING_GARAGE";
                    break;
                case 3:
                    str = "PARKING_LOT";
                    break;
                case 4:
                    str = "ON_DRIVEWAY";
                    break;
                case 5:
                    str = "ON_STREET";
                    break;
                case 6:
                    str = "OFF_STREET";
                    break;
                case 7:
                    str = "UNDERGROUND_GARAGE";
                    break;
                case 8:
                    str = "";
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    throw null;
            }
        } else {
            str = null;
        }
        this.parkingType = str;
    }

    public final int hashCode() {
        return this.coreMetadata.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.coreMetadata);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchResultMetadata(extraData=");
        sb.append(this.extraData);
        sb.append(", reviewCount=");
        sb.append(this.reviewCount);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", website=");
        sb.append(this.website);
        sb.append(", averageRating=");
        sb.append(this.averageRating);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", primaryPhotos=");
        sb.append(this.primaryPhotos);
        sb.append(", otherPhotos=");
        sb.append(this.otherPhotos);
        sb.append(", openHours=");
        sb.append(this.openHours);
        sb.append(", parking=");
        sb.append(this.parking);
        sb.append(", cpsJson=");
        sb.append(this.cpsJson);
        sb.append(", countryIso1=");
        sb.append(this.countryIso1);
        sb.append(", countryIso2=");
        sb.append(this.countryIso2);
        sb.append(", children=");
        sb.append(this.children);
        sb.append(", wheelchairAccessible=");
        sb.append(this.wheelchairAccessible);
        sb.append(", delivery=");
        sb.append(this.delivery);
        sb.append(", driveThrough=");
        sb.append(this.driveThrough);
        sb.append(", reservable=");
        sb.append(this.reservable);
        sb.append(", parkingAvailable=");
        sb.append(this.parkingAvailable);
        sb.append(", valetParking=");
        sb.append(this.valetParking);
        sb.append(", streetParking=");
        sb.append(this.streetParking);
        sb.append(", servesBreakfast=");
        sb.append(this.servesBreakfast);
        sb.append(", servesBrunch=");
        sb.append(this.servesBrunch);
        sb.append(", servesDinner=");
        sb.append(this.servesDinner);
        sb.append(", servesLunch=");
        sb.append(this.servesLunch);
        sb.append(", servesWine=");
        sb.append(this.servesWine);
        sb.append(", servesBeer=");
        sb.append(this.servesBeer);
        sb.append(", takeout=");
        sb.append(this.takeout);
        sb.append(", facebookId=");
        sb.append(this.facebookId);
        sb.append(", fax=");
        sb.append(this.fax);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", instagram=");
        sb.append(this.instagram);
        sb.append(", twitter=");
        sb.append(this.twitter);
        sb.append(", priceLevel=");
        sb.append(this.priceLevel);
        sb.append(", servesVegan=");
        sb.append(this.servesVegan);
        sb.append(", servesVegetarian=");
        sb.append(this.servesVegetarian);
        sb.append(", rating=");
        sb.append(this.rating);
        sb.append(", popularity=");
        sb.append(this.popularity);
        sb.append(", cuisines=");
        sb.append(this.cuisines);
        sb.append(", parkingInfo=");
        sb.append(this.parkingInfo);
        sb.append(", parkingType=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.parkingType, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SearchResultMetadata.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.coreMetadata, ((SearchResultMetadata) obj).coreMetadata}, getCieXyz.write())).booleanValue();
    }
}
