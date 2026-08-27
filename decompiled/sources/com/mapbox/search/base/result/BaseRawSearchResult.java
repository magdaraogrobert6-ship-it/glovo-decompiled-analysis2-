package com.mapbox.search.base.result;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.location.resp.Vw;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Point;
import com.mapbox.search.base.AssertionsKt;
import com.mapbox.search.internal.bindgen.ResultAccuracy;
import com.mapbox.search.internal.bindgen.ResultMetadata;
import com.mapbox.search.internal.bindgen.ResultType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Lambda;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.onViewDetachedFromWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseRawSearchResult implements Parcelable {
    public static final Parcelable.Creator<BaseRawSearchResult> CREATOR = new Vw.yn(11);
    public final ResultAccuracy accuracy;
    public final BaseSuggestAction action;
    public final List addresses;
    public final BoundingBox bbox;
    public final List brand;
    public final String brandId;
    public final List categories;
    public final List categoryIds;
    public final Point center;
    public final String descriptionAddress;
    public final Double distanceMeters;
    public final Double etaMinutes;
    public final Map externalIDs;
    public final String fullAddress;
    public final String icon;
    public final String id;
    public final List languages;
    public final String layerId;
    public final String mapboxId;
    public final String matchingName;
    public final ResultMetadata metadata;
    public final String namePreferred;
    public final List names;
    public final List routablePoints;
    public final Integer serverIndex;
    public final ResultType type;
    public final List types;
    public final String userRecordId;
    public final int userRecordPriority;

    /* JADX INFO: renamed from: com.mapbox.search.base.result.BaseRawSearchResult$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ BaseRawSearchResult this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(BaseRawSearchResult baseRawSearchResult, int i) {
            super(0);
            this.$r8$classId = i;
            this.this$0 = baseRawSearchResult;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Object invoke() {
            String str;
            Object next;
            String str2;
            int i = this.$r8$classId;
            BaseRawSearchResult baseRawSearchResult = this.this$0;
            if (i == 0) {
                return "Provided types should be valid, but was: " + baseRawSearchResult.types;
            }
            if (i != 1) {
                if (i != 2) {
                    ResultType[] resultTypeArr = SearchResultFactory.NOT_SEARCH_RESULT_TYPES;
                    return "Can't check is search result resolved: ".concat(n0.prepareSearchResultInfo$default(baseRawSearchResult, null, 6));
                }
                String str3 = baseRawSearchResult.brandId;
                if (str3 != null) {
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        return str3;
                    }
                }
                Map map = baseRawSearchResult.externalIDs;
                if (map == null || (str2 = (String) map.get("federated")) == null || !setCarryoverInAppMessage.RemoteActionCompatParcelizer(str2, "brand.", false) || str2.length() <= 6) {
                    return null;
                }
                return hideCurrentlyDisplayingInAppMessage.write(str2, "brand.");
            }
            List list = baseRawSearchResult.categoryIds;
            if (list != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((String) next).length() <= 0);
                String str4 = (String) next;
                if (str4 != null) {
                    return str4;
                }
            }
            Map map2 = baseRawSearchResult.externalIDs;
            if (map2 == null || (str = (String) map2.get("federated")) == null || !setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "category.", false) || str.length() <= 9) {
                return null;
            }
            return hideCurrentlyDisplayingInAppMessage.write(str, "category.");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        String str = this.mapboxId;
        int iM = c8$$ExternalSyntheticOutline0.m(this.names, c8$$ExternalSyntheticOutline0.m(this.types, ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.namePreferred;
        int iM2 = c8$$ExternalSyntheticOutline0.m(this.languages, (iM + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        List list = this.addresses;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str3 = this.descriptionAddress;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.matchingName;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.fullAddress;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        Double d = this.distanceMeters;
        int iHashCode6 = d == null ? 0 : d.hashCode();
        Point point = this.center;
        int iHashCode7 = point == null ? 0 : point.hashCode();
        ResultAccuracy resultAccuracy = this.accuracy;
        int iHashCode8 = resultAccuracy == null ? 0 : resultAccuracy.hashCode();
        List list2 = this.routablePoints;
        int iHashCode9 = list2 == null ? 0 : list2.hashCode();
        BoundingBox boundingBox = this.bbox;
        int iHashCode10 = boundingBox == null ? 0 : boundingBox.hashCode();
        List list3 = this.categories;
        int iHashCode11 = list3 == null ? 0 : list3.hashCode();
        List list4 = this.categoryIds;
        int iHashCode12 = list4 == null ? 0 : list4.hashCode();
        List list5 = this.brand;
        int iHashCode13 = list5 == null ? 0 : list5.hashCode();
        String str6 = this.brandId;
        int iHashCode14 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.icon;
        int iHashCode15 = str7 == null ? 0 : str7.hashCode();
        ResultMetadata resultMetadata = this.metadata;
        int iHashCode16 = resultMetadata == null ? 0 : resultMetadata.hashCode();
        Map map = this.externalIDs;
        int iHashCode17 = map == null ? 0 : map.hashCode();
        String str8 = this.layerId;
        int iHashCode18 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.userRecordId;
        int iM3 = af$$ExternalSyntheticOutline0.m(this.userRecordPriority, (((((((((((((((((((((((((((((((((((iM2 + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (str9 == null ? 0 : str9.hashCode())) * 31, 31);
        BaseSuggestAction baseSuggestAction = this.action;
        int iHashCode19 = baseSuggestAction == null ? 0 : baseSuggestAction.hashCode();
        Integer num = this.serverIndex;
        int iHashCode20 = num == null ? 0 : num.hashCode();
        Double d2 = this.etaMinutes;
        return ((((iM3 + iHashCode19) * 31) + iHashCode20) * 31) + (d2 == null ? 0 : d2.hashCode());
    }

    public BaseRawSearchResult(String str, String str2, List list, List list2, String str3, List list3, List list4, String str4, String str5, String str6, Double d, Point point, ResultAccuracy resultAccuracy, List list5, BoundingBox boundingBox, List list6, List list7, List list8, String str7, String str8, ResultMetadata resultMetadata, HashMap map, String str9, String str10, int i, BaseSuggestAction baseSuggestAction, Integer num, Double d2) {
        str.getClass();
        list2.getClass();
        list3.getClass();
        this.id = str;
        this.mapboxId = str2;
        this.types = list;
        this.names = list2;
        this.namePreferred = str3;
        this.languages = list3;
        this.addresses = list4;
        this.descriptionAddress = str4;
        this.matchingName = str5;
        this.fullAddress = str6;
        this.distanceMeters = d;
        this.center = point;
        this.accuracy = resultAccuracy;
        this.routablePoints = list5;
        this.bbox = boundingBox;
        this.categories = list6;
        this.categoryIds = list7;
        this.brand = list8;
        this.brandId = str7;
        this.icon = str8;
        this.metadata = resultMetadata;
        this.externalIDs = map;
        this.layerId = str9;
        this.userRecordId = str10;
        this.userRecordPriority = i;
        this.action = baseSuggestAction;
        this.serverIndex = num;
        this.etaMinutes = d2;
        AssertionsKt.assertDebug(BaseSearchResultTypeKt.isValidMultiType(list), new AnonymousClass1(this, 0));
        ResultType resultType = (ResultType) onContentCardDismissed.MediaMetadataCompat(list);
        this.type = resultType == null ? ResultType.UNKNOWN : resultType;
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.NONE;
        LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnonymousClass1(this, 1));
        LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnonymousClass1(this, 2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.mapboxId);
        List list = this.types;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(((ResultType) it.next()).name());
        }
        parcel.writeStringList(this.names);
        parcel.writeString(this.namePreferred);
        parcel.writeStringList(this.languages);
        List list2 = this.addresses;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable((Serializable) it2.next());
            }
        }
        parcel.writeString(this.descriptionAddress);
        parcel.writeString(this.matchingName);
        parcel.writeString(this.fullAddress);
        Double d = this.distanceMeters;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeSerializable(this.center);
        ResultAccuracy resultAccuracy = this.accuracy;
        if (resultAccuracy == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(resultAccuracy.name());
        }
        List list3 = this.routablePoints;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                parcel.writeSerializable((Serializable) it3.next());
            }
        }
        parcel.writeSerializable(this.bbox);
        parcel.writeStringList(this.categories);
        parcel.writeStringList(this.categoryIds);
        parcel.writeStringList(this.brand);
        parcel.writeString(this.brandId);
        parcel.writeString(this.icon);
        parcel.writeSerializable(this.metadata);
        Map map = this.externalIDs;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.layerId);
        parcel.writeString(this.userRecordId);
        parcel.writeInt(this.userRecordPriority);
        BaseSuggestAction baseSuggestAction = this.action;
        if (baseSuggestAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseSuggestAction.writeToParcel(parcel, i);
        }
        Integer num = this.serverIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Double d2 = this.etaMinutes;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseRawSearchResult)) {
            return false;
        }
        BaseRawSearchResult baseRawSearchResult = (BaseRawSearchResult) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, baseRawSearchResult.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mapboxId, baseRawSearchResult.mapboxId}, getCieXyz.write())).booleanValue() || !this.types.equals(baseRawSearchResult.types)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.names, baseRawSearchResult.names}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.namePreferred, baseRawSearchResult.namePreferred}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.languages, baseRawSearchResult.languages}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.addresses, baseRawSearchResult.addresses}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.descriptionAddress, baseRawSearchResult.descriptionAddress}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.matchingName, baseRawSearchResult.matchingName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fullAddress, baseRawSearchResult.fullAddress}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.distanceMeters, baseRawSearchResult.distanceMeters}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.center, baseRawSearchResult.center}, getCieXyz.write())).booleanValue() || this.accuracy != baseRawSearchResult.accuracy) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routablePoints, baseRawSearchResult.routablePoints}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bbox, baseRawSearchResult.bbox}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.categories, baseRawSearchResult.categories}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.categoryIds, baseRawSearchResult.categoryIds}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brand, baseRawSearchResult.brand}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brandId, baseRawSearchResult.brandId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.icon, baseRawSearchResult.icon}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.metadata, baseRawSearchResult.metadata}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.externalIDs, baseRawSearchResult.externalIDs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.layerId, baseRawSearchResult.layerId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userRecordId, baseRawSearchResult.userRecordId}, getCieXyz.write())).booleanValue() || this.userRecordPriority != baseRawSearchResult.userRecordPriority) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.action, baseRawSearchResult.action}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serverIndex, baseRawSearchResult.serverIndex}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.etaMinutes, baseRawSearchResult.etaMinutes}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "BaseRawSearchResult(id=" + this.id + ", mapboxId=" + this.mapboxId + ", types=" + this.types + ", names=" + this.names + ", namePreferred=" + this.namePreferred + ", languages=" + this.languages + ", addresses=" + this.addresses + ", descriptionAddress=" + this.descriptionAddress + ", matchingName=" + this.matchingName + ", fullAddress=" + this.fullAddress + ", distanceMeters=" + this.distanceMeters + ", center=" + this.center + ", accuracy=" + this.accuracy + ", routablePoints=" + this.routablePoints + ", bbox=" + this.bbox + ", categories=" + this.categories + ", categoryIds=" + this.categoryIds + ", brand=" + this.brand + ", brandId=" + this.brandId + ", icon=" + this.icon + ", metadata=" + this.metadata + ", externalIDs=" + this.externalIDs + ", layerId=" + this.layerId + ", userRecordId=" + this.userRecordId + ", userRecordPriority=" + this.userRecordPriority + ", action=" + this.action + ", serverIndex=" + this.serverIndex + ", etaMinutes=" + this.etaMinutes + ')';
    }
}
