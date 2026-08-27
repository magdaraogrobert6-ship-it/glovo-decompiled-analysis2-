package com.mapbox.search.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.android.SystemUtils;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Point;
import com.mapbox.maps.interactions.standard.generated.StandardPoi;
import com.mapbox.search.RequestOptions;
import com.mapbox.search.RequestOptionsKt;
import com.mapbox.search.SearchResultMetadata;
import com.mapbox.search.base.record.BaseIndexableRecord;
import com.mapbox.search.base.result.BaseSearchResult;
import com.mapbox.search.base.result.BaseSearchResult$Type$IndexableRecordSearchResult;
import com.mapbox.search.base.result.BaseSearchResultType;
import com.mapbox.search.base.utils.extension.DoubleKt;
import com.mapbox.search.base.utils.extension.StringKt;
import com.mapbox.search.common.SearchAddressCountry;
import com.mapbox.search.common.SearchAddressRegion;
import com.mapbox.search.common.metadata.WeekDay;
import com.mapbox.search.common.parking.ParkingRatePrice;
import com.mapbox.search.common.parking.ParkingRateTime;
import com.mapbox.search.common.parking.ParkingRateValue;
import com.mapbox.search.internal.NewSearchResultTypeKt$WhenMappings;
import com.mapbox.search.internal.bindgen.ResultMetadata;
import com.mapbox.search.internal.bindgen.RoutablePoint;
import com.mapbox.search.record.HistoryRecord;
import com.mapbox.search.record.IndexableRecord;
import com.roadrunner.custom.password.api.CustomPasswordLaunchData;
import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import com.roadrunner.delivery.destination.data.models.DestinationComponent$Location;
import com.roadrunner.delivery.destination.data.models.DestinationLocation;
import com.roadrunner.delivery.destination.data.models.Location;
import com.roadrunner.delivery.destination.data.models.NavigationDestination;
import com.roadrunner.delivery.destination.data.models.NavigationType;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$Map;
import com.roadrunner.delivery.destination.data.models.VehicleType;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraArgs;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayItem$Instruction;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayItem$Tag;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayState;
import com.roadrunner.delivery.ontheway.tripplanner.actions.api.navigator.ActionsParams;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.compose.navigator.ContactRiderArgs;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.models.FullscreenDetailUi;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.models.FullscreenItemUi;
import com.roadrunner.delivery.pickupdropoff.tasks.api.navigation.SignatureFragmentNavigator$SignatureFragmentArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.AmountTextInputState;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.CalculatorState;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferButtonState;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewState;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.navigator.CustomerUnavailableArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.IconCompatParcelizer;
import o.SimpleItemTouchHelperCallback;
import o.accessgetInstancedelegatecp;
import o.getAccessibilityExtraKeysui;
import o.getCieXyz;
import o.insertOrUpdateTransformedNodeSubhierarchy;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchResult implements Parcelable {
    public static final Parcelable.Creator<SearchResult> CREATOR = new Creator(0);
    public final ResultAccuracy accuracy;
    public final SearchAddress address;
    public final BaseSearchResult base;
    public final BoundingBox boundingBox;
    public final List categories;
    public final List categoryIds;
    public final Point coordinate;
    public final String descriptionText;
    public final Double distanceMeters;
    public final Double etaMinutes;
    public final Map externalIDs;
    public final String fullAddress;
    public final String id;
    public final IndexableRecord indexableRecord;
    public final String makiIcon;
    public final String matchingName;
    public final SearchResultMetadata metadata;
    public final String name;
    public final ArrayList newTypes;
    public final RequestOptions requestOptions;
    public final ArrayList routablePoints;
    public final Integer serverIndex;
    public final ArrayList types;

    public final class Creator implements Parcelable.Creator {
        private static int IconCompatParcelizer = 1;
        private static int write;
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:12:0x0023  */
        /* JADX WARN: Code duplicated, block: B:14:0x0026  */
        /* JADX WARN: Code duplicated, block: B:16:0x0029  */
        /* JADX WARN: Code duplicated, block: B:18:0x002c  */
        /* JADX WARN: Code duplicated, block: B:20:0x002f  */
        /* JADX WARN: Code duplicated, block: B:22:0x0039  */
        /* JADX WARN: Code duplicated, block: B:24:0x003c  */
        /* JADX WARN: Code duplicated, block: B:26:0x0047 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0048  */
        /* JADX WARN: Code duplicated, block: B:28:0x0049  */
        /* JADX WARN: Code duplicated, block: B:30:0x004c  */
        /* JADX WARN: Code duplicated, block: B:32:0x004f  */
        /* JADX WARN: Code duplicated, block: B:34:0x0052  */
        /* JADX WARN: Code duplicated, block: B:36:0x0055  */
        /* JADX WARN: Code duplicated, block: B:38:0x0058  */
        /* JADX WARN: Code duplicated, block: B:40:0x005b  */
        /* JADX WARN: Code duplicated, block: B:42:0x0066 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x0067  */
        /* JADX WARN: Code duplicated, block: B:44:0x0068  */
        /* JADX WARN: Code duplicated, block: B:46:0x006b  */
        /* JADX WARN: Code duplicated, block: B:48:0x006e  */
        /* JADX WARN: Code duplicated, block: B:50:0x0071  */
        /* JADX WARN: Code duplicated, block: B:52:0x0074  */
        /* JADX WARN: Code duplicated, block: B:54:0x0077  */
        /* JADX WARN: Code duplicated, block: B:56:0x007a  */
        /* JADX WARN: Code duplicated, block: B:58:0x007d  */
        /* JADX WARN: Code duplicated, block: B:60:0x0080  */
        /* JADX WARN: Code duplicated, block: B:62:0x008a  */
        /* JADX WARN: Code duplicated, block: B:64:0x008d  */
        /* JADX WARN: Code duplicated, block: B:66:0x0090  */
        /* JADX WARN: Code duplicated, block: B:68:0x0093  */
        /* JADX WARN: Code duplicated, block: B:70:0x0096  */
        /* JADX WARN: Code duplicated, block: B:72:0x0099  */
        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            InAppCameraOverlayState[] inAppCameraOverlayStateArr;
            int i2;
            FullscreenItemUi[] fullscreenItemUiArr;
            int i3;
            int i4 = 2 % 2;
            int i5 = IconCompatParcelizer;
            int i6 = i5 + 83;
            int i7 = i6 % Fields.SpotShadowColor;
            write = i7;
            if (i6 % 2 == 0) {
                switch (this.$r8$classId) {
                    case 0:
                        return new SearchResult[i];
                    case 1:
                        return new ParkingRatePrice[i];
                    case 2:
                        return new ParkingRateTime[i];
                    case 3:
                        return new HistoryRecord[i];
                    case 4:
                        return new SearchAddress[i];
                    case 5:
                        CustomPasswordLaunchData[] customPasswordLaunchDataArr = new CustomPasswordLaunchData[i];
                        int i8 = i5 + 77;
                        write = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        return customPasswordLaunchDataArr;
                    case 6:
                        return new PushAnalyticsData[i];
                    case 7:
                        return new DestinationComponent$Location[i];
                    case 8:
                        return new DestinationLocation[i];
                    case 9:
                        return new Location[i];
                    case 10:
                        return new NavigationDestination[i];
                    case 11:
                        return new ScrollableComponent$Map[i];
                    case 12:
                        return new InAppCameraArgs[i];
                    case 13:
                        return new InAppCameraOverlayItem$Tag[i];
                    case 14:
                        inAppCameraOverlayStateArr = new InAppCameraOverlayState[i];
                        i2 = i5 + 105;
                        write = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 == 0) {
                            return inAppCameraOverlayStateArr;
                        }
                        throw null;
                    case 15:
                        return new ActionsParams[i];
                    case 16:
                        return new InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet[i];
                    case 17:
                        return new InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData[i];
                    case 18:
                        return new InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider[i];
                    case 19:
                        return new ContactRiderArgs[i];
                    case 20:
                        return new FullscreenDetailUi[i];
                    case 21:
                        fullscreenItemUiArr = new FullscreenItemUi[i];
                        i3 = i7 + 77;
                        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 != 0) {
                            return fullscreenItemUiArr;
                        }
                        throw null;
                    case 22:
                        return new SignatureFragmentNavigator$SignatureFragmentArgs[i];
                    case 23:
                        AmountTextInputState[] amountTextInputStateArr = new AmountTextInputState[i];
                        int i10 = i7 + 115;
                        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        return amountTextInputStateArr;
                    case 24:
                        return new CalculatorState[i];
                    case 25:
                        return new TransferButtonState[i];
                    case 26:
                        return new TransferChangeViewState[i];
                    case 27:
                        return new CustomerUnavailableArgs[i];
                    case 28:
                        return new CashPaymentTaskUiItem.ReasonItem[i];
                    default:
                        return new CashPaymentTaskUiItem.Reasons[i];
                }
            }
            int i12 = 17 / 0;
            switch (this.$r8$classId) {
                case 0:
                    return new SearchResult[i];
                case 1:
                    return new ParkingRatePrice[i];
                case 2:
                    return new ParkingRateTime[i];
                case 3:
                    return new HistoryRecord[i];
                case 4:
                    return new SearchAddress[i];
                case 5:
                    CustomPasswordLaunchData[] customPasswordLaunchDataArr2 = new CustomPasswordLaunchData[i];
                    int i13 = i5 + 77;
                    write = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    return customPasswordLaunchDataArr2;
                case 6:
                    return new PushAnalyticsData[i];
                case 7:
                    return new DestinationComponent$Location[i];
                case 8:
                    return new DestinationLocation[i];
                case 9:
                    return new Location[i];
                case 10:
                    return new NavigationDestination[i];
                case 11:
                    return new ScrollableComponent$Map[i];
                case 12:
                    return new InAppCameraArgs[i];
                case 13:
                    return new InAppCameraOverlayItem$Tag[i];
                case 14:
                    inAppCameraOverlayStateArr = new InAppCameraOverlayState[i];
                    i2 = i5 + 105;
                    write = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        return inAppCameraOverlayStateArr;
                    }
                    throw null;
                case 15:
                    return new ActionsParams[i];
                case 16:
                    return new InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet[i];
                case 17:
                    return new InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData[i];
                case 18:
                    return new InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider[i];
                case 19:
                    return new ContactRiderArgs[i];
                case 20:
                    return new FullscreenDetailUi[i];
                case 21:
                    fullscreenItemUiArr = new FullscreenItemUi[i];
                    i3 = i7 + 77;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        return fullscreenItemUiArr;
                    }
                    throw null;
                case 22:
                    return new SignatureFragmentNavigator$SignatureFragmentArgs[i];
                case 23:
                    AmountTextInputState[] amountTextInputStateArr2 = new AmountTextInputState[i];
                    int i15 = i7 + 115;
                    IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    return amountTextInputStateArr2;
                case 24:
                    return new CalculatorState[i];
                case 25:
                    return new TransferButtonState[i];
                case 26:
                    return new TransferChangeViewState[i];
                case 27:
                    return new CustomerUnavailableArgs[i];
                case 28:
                    return new CashPaymentTaskUiItem.ReasonItem[i];
                default:
                    return new CashPaymentTaskUiItem.Reasons[i];
            }
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Byte bValueOf;
            ArrayList arrayList2;
            ArrayList arrayList3;
            boolean z;
            boolean z2;
            int i = 2 % 2;
            Double dValueOf = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            Byte bValueOf2 = null;
            int i2 = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new SearchResult((BaseSearchResult) parcel.readParcelable(SearchResult.class.getClassLoader()));
                case 1:
                    parcel.getClass();
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        int i3 = IconCompatParcelizer + 23;
                        write = i3 % Fields.SpotShadowColor;
                        int i4 = i3 % 2;
                    } else {
                        dValueOf = Double.valueOf(parcel.readDouble());
                    }
                    return new ParkingRatePrice(string, dValueOf, (ParkingRateValue) parcel.readParcelable(ParkingRatePrice.class.getClassLoader()));
                case 2:
                    parcel.getClass();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i5 = parcel.readInt();
                        ArrayList arrayList6 = new ArrayList(i5);
                        while (i2 != i5) {
                            int i6 = IconCompatParcelizer + 125;
                            write = i6 % Fields.SpotShadowColor;
                            if (i6 % 2 != 0) {
                                arrayList6.add(WeekDay.valueOf(parcel.readString()));
                                i2 += 59;
                            } else {
                                arrayList6.add(WeekDay.valueOf(parcel.readString()));
                                i2++;
                            }
                        }
                        arrayList = arrayList6;
                    }
                    Byte bValueOf3 = parcel.readInt() == 0 ? null : Byte.valueOf(parcel.readByte());
                    if (parcel.readInt() == 0) {
                        int i7 = write + 9;
                        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        bValueOf = null;
                    } else {
                        bValueOf = Byte.valueOf(parcel.readByte());
                    }
                    Byte bValueOf4 = parcel.readInt() == 0 ? null : Byte.valueOf(parcel.readByte());
                    if (parcel.readInt() == 0) {
                        int i9 = write + 43;
                        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                        if (i9 % 2 == 0) {
                            dValueOf.hashCode();
                            throw null;
                        }
                    } else {
                        bValueOf2 = Byte.valueOf(parcel.readByte());
                    }
                    return new ParkingRateTime(arrayList, bValueOf3, bValueOf, bValueOf4, bValueOf2);
                case 3:
                    parcel.getClass();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    SearchAddress searchAddressCreateFromParcel = parcel.readInt() == 0 ? null : SearchAddress.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        arrayList2 = null;
                    } else {
                        int i10 = parcel.readInt();
                        ArrayList arrayList7 = new ArrayList(i10);
                        while (i2 != i10) {
                            arrayList7.add(parcel.readParcelable(HistoryRecord.class.getClassLoader()));
                            i2++;
                        }
                        arrayList2 = arrayList7;
                    }
                    return new HistoryRecord(string2, string3, string4, searchAddressCreateFromParcel, arrayList2, parcel.createStringArrayList(), parcel.readString(), (Point) parcel.readSerializable(), SearchResultType.valueOf(parcel.readString()), parcel.readInt() != 0 ? SearchResultMetadata.CREATOR.createFromParcel(parcel) : null, parcel.readLong(), parcel.readString());
                case 4:
                    parcel.getClass();
                    return new SearchAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (SearchAddressRegion) parcel.readParcelable(SearchAddress.class.getClassLoader()), (SearchAddressCountry) parcel.readParcelable(SearchAddress.class.getClassLoader()));
                case 5:
                    parcel.getClass();
                    return new CustomPasswordLaunchData(parcel.readString(), insertOrUpdateTransformedNodeSubhierarchy.valueOf(parcel.readString()));
                case 6:
                    parcel.getClass();
                    return new PushAnalyticsData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 7:
                    parcel.getClass();
                    return new DestinationComponent$Location(parcel.readString(), parcel.readDouble(), parcel.readDouble());
                case 8:
                    parcel.getClass();
                    return new DestinationLocation(parcel.readDouble(), parcel.readDouble(), parcel.readString(), VehicleType.valueOf(parcel.readString()));
                case 9:
                    parcel.getClass();
                    return new Location(parcel.readDouble(), parcel.readDouble());
                case 10:
                    parcel.getClass();
                    return new NavigationDestination(parcel.readString(), parcel.readString(), NavigationType.valueOf(parcel.readString()), DestinationLocation.CREATOR.createFromParcel(parcel));
                case 11:
                    parcel.getClass();
                    boolean z3 = parcel.readInt() != 0;
                    int i11 = parcel.readInt();
                    ArrayList arrayList8 = new ArrayList(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        arrayList8.add(parcel.readParcelable(ScrollableComponent$Map.class.getClassLoader()));
                    }
                    DestinationLocation destinationLocationCreateFromParcel = DestinationLocation.CREATOR.createFromParcel(parcel);
                    int i13 = parcel.readInt();
                    ArrayList arrayList9 = new ArrayList(i13);
                    for (int i14 = 0; i14 != i13; i14++) {
                        arrayList9.add(parcel.readParcelable(ScrollableComponent$Map.class.getClassLoader()));
                    }
                    return new ScrollableComponent$Map(z3, arrayList8, destinationLocationCreateFromParcel, arrayList9, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                case 12:
                    parcel.getClass();
                    return new InAppCameraArgs(parcel.readString(), (InAppCameraOverlay) parcel.readParcelable(InAppCameraArgs.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
                case 13:
                    parcel.getClass();
                    return new InAppCameraOverlayItem$Tag(parcel.readString(), parcel.createStringArrayList());
                case 14:
                    parcel.getClass();
                    int i15 = parcel.readInt();
                    ArrayList arrayList10 = new ArrayList(i15);
                    for (int i16 = 0; i16 != i15; i16++) {
                        arrayList10.add(InAppCameraOverlayItem$Instruction.CREATOR.createFromParcel(parcel));
                    }
                    int i17 = parcel.readInt();
                    ArrayList arrayList11 = new ArrayList(i17);
                    while (i2 != i17) {
                        int i18 = write + 47;
                        IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                        arrayList11.add(InAppCameraOverlayItem$Tag.CREATOR.createFromParcel(parcel));
                        i2++;
                    }
                    return new InAppCameraOverlayState(arrayList10, arrayList11);
                case 15:
                    parcel.getClass();
                    return new ActionsParams(parcel.readLong(), parcel.readString(), parcel.readString());
                case 16:
                    parcel.getClass();
                    String string5 = parcel.readString();
                    Parcelable.Creator<InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData> creator = InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.CREATOR;
                    InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData instructionsItemUi$Instruction$SplitOrderInstruction$ButtonDataCreateFromParcel = creator.createFromParcel(parcel);
                    InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData instructionsItemUi$Instruction$SplitOrderInstruction$ButtonDataCreateFromParcel2 = creator.createFromParcel(parcel);
                    InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData instructionsItemUi$Instruction$SplitOrderInstruction$ButtonDataCreateFromParcel3 = creator.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        arrayList3 = null;
                    } else {
                        int i20 = parcel.readInt();
                        ArrayList arrayList12 = new ArrayList(i20);
                        while (i2 != i20) {
                            int i21 = IconCompatParcelizer + 19;
                            write = i21 % Fields.SpotShadowColor;
                            int i22 = i21 % 2;
                            arrayList12.add(parcel.readParcelable(InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet.class.getClassLoader()));
                            i2++;
                        }
                        arrayList3 = arrayList12;
                    }
                    return new InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet(string5, instructionsItemUi$Instruction$SplitOrderInstruction$ButtonDataCreateFromParcel, instructionsItemUi$Instruction$SplitOrderInstruction$ButtonDataCreateFromParcel2, instructionsItemUi$Instruction$SplitOrderInstruction$ButtonDataCreateFromParcel3, arrayList3);
                case 17:
                    parcel.getClass();
                    String string6 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        int i23 = parcel.readInt();
                        arrayList5 = new ArrayList(i23);
                        while (i2 != i23) {
                            arrayList5.add(parcel.readParcelable(InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.class.getClassLoader()));
                            i2++;
                        }
                    }
                    return new InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData(string6, arrayList5);
                case 18:
                    parcel.getClass();
                    String string7 = parcel.readString();
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        int i24 = parcel.readInt();
                        ArrayList arrayList13 = new ArrayList(i24);
                        while (i2 != i24) {
                            int i25 = IconCompatParcelizer + 31;
                            write = i25 % Fields.SpotShadowColor;
                            if (i25 % 2 != 0) {
                                arrayList13.add(parcel.readParcelable(InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider.class.getClassLoader()));
                                i2 += 51;
                            } else {
                                arrayList13.add(parcel.readParcelable(InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider.class.getClassLoader()));
                                i2++;
                            }
                        }
                        arrayList4 = arrayList13;
                    }
                    return new InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider(string7, string8, string9, arrayList4);
                case 19:
                    parcel.getClass();
                    return new ContactRiderArgs((InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider) parcel.readParcelable(ContactRiderArgs.class.getClassLoader()), (InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet) parcel.readParcelable(ContactRiderArgs.class.getClassLoader()));
                case 20:
                    parcel.getClass();
                    return new FullscreenDetailUi(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 21:
                    parcel.getClass();
                    int i26 = parcel.readInt();
                    ArrayList arrayList14 = new ArrayList(i26);
                    for (int i27 = 0; i27 != i26; i27++) {
                        arrayList14.add(FullscreenDetailUi.CREATOR.createFromParcel(parcel));
                    }
                    r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq = removeNodeAtDepth.read(arrayList14);
                    int i28 = parcel.readInt();
                    ArrayList arrayList15 = new ArrayList(i28);
                    while (i2 != i28) {
                        arrayList15.add(parcel.readParcelable(FullscreenItemUi.class.getClassLoader()));
                        i2++;
                    }
                    return new FullscreenItemUi(r8lambdaiidsddyirtymdul5lt6pmt2zysq, arrayList15);
                case 22:
                    parcel.getClass();
                    return new SignatureFragmentNavigator$SignatureFragmentArgs(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
                case 23:
                    parcel.getClass();
                    String string10 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        int i29 = write + 101;
                        IconCompatParcelizer = i29 % Fields.SpotShadowColor;
                        if (i29 % 2 == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    return new AmountTextInputState(string10, z, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
                case 24:
                    parcel.getClass();
                    if (parcel.readInt() != 0) {
                        int i30 = write + 61;
                        IconCompatParcelizer = i30 % Fields.SpotShadowColor;
                        int i31 = i30 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    return new CalculatorState(parcel.readString(), z2, parcel.readInt() != 0);
                case 25:
                    parcel.getClass();
                    return new TransferButtonState(parcel.readInt() != 0);
                case 26:
                    parcel.getClass();
                    return new TransferChangeViewState(AmountTextInputState.CREATOR.createFromParcel(parcel), CalculatorState.CREATOR.createFromParcel(parcel), TransferButtonState.CREATOR.createFromParcel(parcel));
                case 27:
                    parcel.getClass();
                    return new CustomerUnavailableArgs(parcel.readLong(), parcel.readString(), parcel.readString());
                case 28:
                    parcel.getClass();
                    return new CashPaymentTaskUiItem.ReasonItem(parcel.readString(), parcel.readString());
                default:
                    parcel.getClass();
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    int i32 = parcel.readInt();
                    ArrayList arrayList16 = new ArrayList(i32);
                    while (i2 != i32) {
                        int i33 = write + 49;
                        IconCompatParcelizer = i33 % Fields.SpotShadowColor;
                        if (i33 % 2 == 0) {
                            arrayList16.add(CashPaymentTaskUiItem.ReasonItem.CREATOR.createFromParcel(parcel));
                            i2 += 7;
                        } else {
                            arrayList16.add(CashPaymentTaskUiItem.ReasonItem.CREATOR.createFromParcel(parcel));
                            i2++;
                        }
                    }
                    return new CashPaymentTaskUiItem.Reasons(string11, string12, parcel.readString(), removeNodeAtDepth.read(arrayList16));
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:169:0x02f4  */
    public SearchResult(BaseSearchResult baseSearchResult) {
        SearchAddress searchAddress;
        ArrayList arrayList;
        ResultAccuracy resultAccuracy;
        SearchResultType searchResultType;
        SearchAddressRegion searchAddressRegion;
        SearchAddressCountry searchAddressCountry;
        SearchAddressCountry searchAddressCountry2;
        String countryCode;
        String countryCodeAlpha3;
        SearchAddressRegion searchAddressRegion2;
        String regionCode;
        String regionCodeFull;
        String name;
        String name2;
        baseSearchResult.getClass();
        this.base = baseSearchResult;
        this.requestOptions = RequestOptionsKt.mapToPlatform(baseSearchResult.getRequestOptions());
        this.id = baseSearchResult.getId();
        this.name = baseSearchResult.getName();
        this.matchingName = baseSearchResult.getRawSearchResult().matchingName;
        this.descriptionText = baseSearchResult.getDescriptionText();
        com.mapbox.search.internal.bindgen.SearchAddress address = baseSearchResult.getAddress();
        if (address != null) {
            String houseNumber = address.getHouseNumber();
            String strNullIfEmpty = houseNumber != null ? StringKt.nullIfEmpty(houseNumber) : null;
            String street = address.getStreet();
            String strNullIfEmpty2 = street != null ? StringKt.nullIfEmpty(street) : null;
            String neighborhood = address.getNeighborhood();
            String strNullIfEmpty3 = neighborhood != null ? StringKt.nullIfEmpty(neighborhood) : null;
            String locality = address.getLocality();
            String strNullIfEmpty4 = locality != null ? StringKt.nullIfEmpty(locality) : null;
            String postcode = address.getPostcode();
            String strNullIfEmpty5 = postcode != null ? StringKt.nullIfEmpty(postcode) : null;
            String place = address.getPlace();
            String strNullIfEmpty6 = place != null ? StringKt.nullIfEmpty(place) : null;
            String district = address.getDistrict();
            String strNullIfEmpty7 = district != null ? StringKt.nullIfEmpty(district) : null;
            com.mapbox.search.internal.bindgen.SearchAddressRegion region = address.getRegion();
            String strNullIfEmpty8 = (region == null || (name2 = region.getName()) == null) ? null : StringKt.nullIfEmpty(name2);
            com.mapbox.search.internal.bindgen.SearchAddressCountry country = address.getCountry();
            String strNullIfEmpty9 = (country == null || (name = country.getName()) == null) ? null : StringKt.nullIfEmpty(name);
            com.mapbox.search.internal.bindgen.SearchAddressRegion region2 = address.getRegion();
            if (region2 != null) {
                String name3 = region2.getName();
                name3.getClass();
                if (name3.length() == 0 && (((regionCode = region2.getRegionCode()) == null || regionCode.length() == 0) && ((regionCodeFull = region2.getRegionCodeFull()) == null || regionCodeFull.length() == 0))) {
                    searchAddressRegion2 = null;
                } else {
                    String name4 = region2.getName();
                    name4.getClass();
                    searchAddressRegion2 = new SearchAddressRegion(name4, region2.getRegionCode(), region2.getRegionCodeFull());
                }
                searchAddressRegion = searchAddressRegion2;
            } else {
                searchAddressRegion = null;
            }
            com.mapbox.search.internal.bindgen.SearchAddressCountry country2 = address.getCountry();
            if (country2 != null) {
                String name5 = country2.getName();
                name5.getClass();
                if (name5.length() == 0 && (((countryCode = country2.getCountryCode()) == null || countryCode.length() == 0) && ((countryCodeAlpha3 = country2.getCountryCodeAlpha3()) == null || countryCodeAlpha3.length() == 0))) {
                    searchAddressCountry2 = null;
                } else {
                    String name6 = country2.getName();
                    name6.getClass();
                    searchAddressCountry2 = new SearchAddressCountry(name6, country2.getCountryCode(), country2.getCountryCodeAlpha3());
                }
                searchAddressCountry = searchAddressCountry2;
            } else {
                searchAddressCountry = null;
            }
            searchAddress = new SearchAddress(strNullIfEmpty, strNullIfEmpty2, strNullIfEmpty3, strNullIfEmpty4, strNullIfEmpty5, strNullIfEmpty6, strNullIfEmpty7, strNullIfEmpty8, strNullIfEmpty9, searchAddressRegion, searchAddressCountry);
        } else {
            searchAddress = null;
        }
        this.address = searchAddress;
        this.fullAddress = baseSearchResult.getRawSearchResult().fullAddress;
        List routablePoints = baseSearchResult.getRoutablePoints();
        if (routablePoints != null) {
            List<RoutablePoint> list = routablePoints;
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            for (RoutablePoint routablePoint : list) {
                routablePoint.getClass();
                Point point = routablePoint.getPoint();
                point.getClass();
                String name7 = routablePoint.getName();
                name7.getClass();
                arrayList.add(new com.mapbox.search.common.RoutablePoint(point, name7));
            }
        } else {
            arrayList = null;
        }
        this.routablePoints = arrayList;
        this.boundingBox = this.base.getRawSearchResult().bbox;
        this.categories = this.base.getCategories();
        this.categoryIds = this.base.getRawSearchResult().categoryIds;
        this.makiIcon = this.base.getMakiIcon();
        this.coordinate = this.base.getCoordinate();
        com.mapbox.search.internal.bindgen.ResultAccuracy resultAccuracy2 = this.base.getRawSearchResult().accuracy;
        if (resultAccuracy2 != null) {
            switch (ResultAccuracyKt$WhenMappings.$EnumSwitchMapping$0[resultAccuracy2.ordinal()]) {
                case 1:
                    resultAccuracy = ResultAccuracy.Point.INSTANCE;
                    break;
                case 2:
                    resultAccuracy = ResultAccuracy.Rooftop.INSTANCE;
                    break;
                case 3:
                    resultAccuracy = ResultAccuracy.Parcel.INSTANCE;
                    break;
                case 4:
                    resultAccuracy = ResultAccuracy.Interpolated.INSTANCE;
                    break;
                case 5:
                    resultAccuracy = ResultAccuracy.Intersection.INSTANCE;
                    break;
                case 6:
                    resultAccuracy = ResultAccuracy.Approximate.INSTANCE;
                    break;
                case 7:
                    resultAccuracy = ResultAccuracy.Street.INSTANCE;
                    break;
                case 8:
                    resultAccuracy = ResultAccuracy.Proximate.INSTANCE;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    throw null;
            }
        } else {
            resultAccuracy = null;
        }
        this.accuracy = resultAccuracy;
        List types = this.base.getTypes();
        ArrayList<String> arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(types, 10));
        Iterator it = types.iterator();
        while (true) {
            String str = "block";
            if (!it.hasNext()) {
                this.newTypes = arrayList2;
                ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
                for (String str2 : arrayList2) {
                    str2.getClass();
                    switch (str2) {
                        case "address":
                            searchResultType = SearchResultType.ADDRESS;
                            break;
                        case "region":
                            searchResultType = SearchResultType.REGION;
                            break;
                        case "street":
                            searchResultType = SearchResultType.STREET;
                            break;
                        case "poi":
                            searchResultType = SearchResultType.POI;
                            break;
                        case "block":
                            searchResultType = SearchResultType.BLOCK;
                            break;
                        case "place":
                            searchResultType = SearchResultType.PLACE;
                            break;
                        case "district":
                            searchResultType = SearchResultType.DISTRICT;
                            break;
                        case "neighborhood":
                            searchResultType = SearchResultType.NEIGHBORHOOD;
                            break;
                        case "postcode":
                            searchResultType = SearchResultType.POSTCODE;
                            break;
                        case "country":
                            searchResultType = SearchResultType.COUNTRY;
                            break;
                        case "locality":
                            searchResultType = SearchResultType.LOCALITY;
                            break;
                        default:
                            SearchResultType.Companion.getClass();
                            searchResultType = SearchResultType.DEFAULT;
                            break;
                    }
                    arrayList3.add(searchResultType);
                }
                this.types = arrayList3;
                this.etaMinutes = this.base.getRawSearchResult().etaMinutes;
                ResultMetadata metadata = this.base.getMetadata();
                this.metadata = metadata != null ? new SearchResultMetadata(metadata) : null;
                Map map = this.base.getRawSearchResult().externalIDs;
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map == null ? SimpleItemTouchHelperCallback.serializer : map);
                mapUnmodifiableMap.getClass();
                this.externalIDs = mapUnmodifiableMap;
                this.distanceMeters = this.base.getRawSearchResult().distanceMeters;
                this.serverIndex = this.base.getRawSearchResult().serverIndex;
                getAccessibilityExtraKeysui baseType = this.base.getBaseType();
                BaseSearchResult$Type$IndexableRecordSearchResult baseSearchResult$Type$IndexableRecordSearchResult = baseType instanceof BaseSearchResult$Type$IndexableRecordSearchResult ? (BaseSearchResult$Type$IndexableRecordSearchResult) baseType : null;
                BaseIndexableRecord baseIndexableRecord = baseSearchResult$Type$IndexableRecordSearchResult != null ? baseSearchResult$Type$IndexableRecordSearchResult.record : null;
                Parcelable parcelable = baseIndexableRecord != null ? baseIndexableRecord.sdkResolvedRecord : null;
                this.indexableRecord = parcelable instanceof IndexableRecord ? (IndexableRecord) parcelable : null;
                return;
            }
            BaseSearchResultType baseSearchResultType = (BaseSearchResultType) it.next();
            baseSearchResultType.getClass();
            switch (NewSearchResultTypeKt$WhenMappings.$EnumSwitchMapping$1[baseSearchResultType.ordinal()]) {
                case 1:
                    str = PushNotificationParserObj.COUNTRY_KEY;
                    break;
                case 2:
                    str = "region";
                    break;
                case 3:
                    str = "postcode";
                    break;
                case 4:
                    str = "district";
                    break;
                case 5:
                    str = "place";
                    break;
                case 6:
                    str = "locality";
                    break;
                case 7:
                    str = "neighborhood";
                    break;
                case 8:
                    str = "street";
                    break;
                case 9:
                    str = "address";
                    break;
                case 10:
                    str = StandardPoi.FEATURESET_ID;
                    break;
                case 11:
                    break;
                case 12:
                    str = SystemUtils.UNKNOWN;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    throw null;
            }
            arrayList2.add(str);
        }
    }

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.requestOptions.hashCode() * 31, 31, this.id);
        String str = this.base.getRawSearchResult().mapboxId;
        int iM2 = af$$ExternalSyntheticOutline0.m((iM + (str != null ? str.hashCode() : 0)) * 31, 31, this.name);
        String str2 = this.matchingName;
        int iHashCode = str2 != null ? str2.hashCode() : 0;
        String str3 = this.descriptionText;
        int iHashCode2 = str3 != null ? str3.hashCode() : 0;
        SearchAddress searchAddress = this.address;
        int iHashCode3 = searchAddress != null ? searchAddress.hashCode() : 0;
        String str4 = this.fullAddress;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        ArrayList arrayList = this.routablePoints;
        int iHashCode5 = arrayList != null ? arrayList.hashCode() : 0;
        BoundingBox boundingBox = this.boundingBox;
        int iHashCode6 = boundingBox != null ? boundingBox.hashCode() : 0;
        List list = this.categories;
        int iHashCode7 = list != null ? list.hashCode() : 0;
        List list2 = this.categoryIds;
        int iHashCode8 = list2 != null ? list2.hashCode() : 0;
        String str5 = this.makiIcon;
        int iHashCode9 = str5 != null ? str5.hashCode() : 0;
        int iHashCode10 = this.coordinate.hashCode();
        ResultAccuracy resultAccuracy = this.accuracy;
        int iWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.types, r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.newTypes, (((iHashCode10 + ((((((((((((((((((iM2 + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31)) * 31) + (resultAccuracy != null ? resultAccuracy.hashCode() : 0)) * 31, 31), 31);
        Double d = this.etaMinutes;
        int iHashCode11 = d != null ? d.hashCode() : 0;
        SearchResultMetadata searchResultMetadata = this.metadata;
        int iRemoteActionCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer((((iWrite + iHashCode11) * 31) + (searchResultMetadata != null ? searchResultMetadata.coreMetadata.hashCode() : 0)) * 31, this.externalIDs, 31);
        Double d2 = this.distanceMeters;
        int iHashCode12 = d2 != null ? d2.hashCode() : 0;
        Integer num = this.serverIndex;
        int iIntValue = num != null ? num.intValue() : 0;
        IndexableRecord indexableRecord = this.indexableRecord;
        return ((((iRemoteActionCompatParcelizer + iHashCode12) * 31) + iIntValue) * 31) + (indexableRecord != null ? indexableRecord.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.base, i);
    }

    public final String toString() {
        return "SearchResult(requestOptions=" + this.requestOptions + ", id='" + this.id + "', mapboxId='" + this.base.getRawSearchResult().mapboxId + "', name='" + this.name + "', matchingName=" + this.matchingName + ", descriptionText=" + this.descriptionText + ", address=" + this.address + ", fullAddress=" + this.fullAddress + ", routablePoints=" + this.routablePoints + ", boundingBox=" + this.boundingBox + ", categories=" + this.categories + ", categoryIds=" + this.categoryIds + ", makiIcon=" + this.makiIcon + ", coordinate=" + this.coordinate + ", accuracy=" + this.accuracy + ", newTypes=" + this.newTypes + ", types=" + this.types + ", etaMinutes=" + this.etaMinutes + ", metadata=" + this.metadata + ", externalIDs=" + this.externalIDs + ", distanceMeters=" + this.distanceMeters + ", serverIndex=" + this.serverIndex + ", indexableRecord=" + this.indexableRecord + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SearchResult.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SearchResult searchResult = (SearchResult) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requestOptions, searchResult.requestOptions}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, searchResult.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.base.getRawSearchResult().mapboxId, searchResult.base.getRawSearchResult().mapboxId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, searchResult.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.matchingName, searchResult.matchingName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.descriptionText, searchResult.descriptionText}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, searchResult.address}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fullAddress, searchResult.fullAddress}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routablePoints, searchResult.routablePoints}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.boundingBox, searchResult.boundingBox}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.categories, searchResult.categories}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.categoryIds, searchResult.categoryIds}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.makiIcon, searchResult.makiIcon}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.coordinate, searchResult.coordinate}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accuracy, searchResult.accuracy}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.newTypes, searchResult.newTypes}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.types, searchResult.types}, getCieXyz.write())).booleanValue() || !DoubleKt.safeCompareTo(this.etaMinutes, searchResult.etaMinutes)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.metadata, searchResult.metadata}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.externalIDs, searchResult.externalIDs}, getCieXyz.write())).booleanValue() || !DoubleKt.safeCompareTo(this.distanceMeters, searchResult.distanceMeters)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serverIndex, searchResult.serverIndex}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.indexableRecord, searchResult.indexableRecord}, getCieXyz.write())).booleanValue();
    }
}
