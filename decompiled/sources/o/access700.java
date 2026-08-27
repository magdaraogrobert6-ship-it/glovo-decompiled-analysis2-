package o;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.navigation.CodeScanTaskArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.navigation.QrPaymentScreenArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation.PinScreenArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation.QrScanTaskArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.model.InAppCameraWithTagsArgs;
import com.roadrunner.delivery.state.DestinationLocation;
import com.roadrunner.delivery.state.VehicleType;
import com.roadrunner.face.verification.api.navigation.IdentityVerificationParams;
import com.roadrunner.face.verification.api.selfie.CameraImage;
import com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationParams;
import com.roadrunner.opportunities.api.navigation.BonusCalendarParams;
import com.roadrunner.push.event.PushDeepLink;
import com.roadrunner.push.presentation.viewentity.MessageDialogData;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import com.roadrunner.startworking.equipment.navigation.EquipmentBottomSheetParams;
import com.roadrunner.vendor.review.api.navigation.VendorReviewArgs;
import com.ui.common.widget.chooseoption.entity.ChooseOptionFragmentArguments;
import com.ui.common.widget.chooseoption.entity.SelectionMode;
import com.ui.common.widget.chooseoption.entity.SelectionOptionViewEntity;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class access700 implements Parcelable.Creator {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ access700(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = serializer;
        int i4 = i3 + 43;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                return new PushDeepLink[i];
            case 1:
                return new CodeScanTaskArgs[i];
            case 2:
                return new QrPaymentScreenArgs[i];
            case 3:
                return new PinScreenArgs[i];
            case 4:
                return new QrScanTaskArgs[i];
            case 5:
                return new InAppCameraWithTagsArgs[i];
            case 6:
                return new DestinationLocation[i];
            case 7:
                return new IdentityVerificationParams[i];
            case 8:
                return new CameraImage[i];
            case 9:
                return new BookShiftConfirmationParams[i];
            case 10:
                return new com.roadrunner.liveness.api.recording.CameraImage[i];
            case 11:
                return new BonusCalendarParams[i];
            case 12:
                return new MessageDialogData[i];
            case 13:
                EquipmentBottomSheetParams[] equipmentBottomSheetParamsArr = new EquipmentBottomSheetParams[i];
                int i6 = i3 + 119;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return equipmentBottomSheetParamsArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 14:
                return new VendorReviewArgs[i];
            case 15:
                return new ChooseOptionFragmentArguments[i];
            default:
                return new SelectionOptionViewEntity[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        PushDeepLink pushDeepLinkCreateFromParcel;
        boolean z2;
        int i = 2 % 2;
        boolean z3 = false;
        int i2 = 0;
        boolean z4 = false;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                parcel.getClass();
                return new PushDeepLink(parcel.readString(), parcel.readString());
            case 1:
                parcel.getClass();
                return new CodeScanTaskArgs(parcel.readLong(), parcel.readString(), parcel.readString());
            case 2:
                parcel.getClass();
                return new QrPaymentScreenArgs(parcel.readLong(), parcel.readString(), parcel.readString());
            case 3:
                parcel.getClass();
                return new PinScreenArgs(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 4:
                parcel.getClass();
                return new QrScanTaskArgs(parcel.readLong(), parcel.readString(), parcel.readString());
            case 5:
                parcel.getClass();
                return new InAppCameraWithTagsArgs(parcel.readLong(), parcel.readString(), parcel.readString());
            case 6:
                parcel.getClass();
                return new DestinationLocation(parcel.readDouble(), parcel.readDouble(), parcel.readString(), VehicleType.valueOf(parcel.readString()));
            case 7:
                parcel.getClass();
                return new IdentityVerificationParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                parcel.getClass();
                return new CameraImage(parcel.readString(), (Uri) parcel.readParcelable(CameraImage.class.getClassLoader()), parcel.readString());
            case 9:
                parcel.getClass();
                return new BookShiftConfirmationParams(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                parcel.getClass();
                String string = parcel.readString();
                Uri uri = (Uri) parcel.readParcelable(com.roadrunner.liveness.api.recording.CameraImage.class.getClassLoader());
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i3 = read + 99;
                    serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    z3 = true;
                }
                return new com.roadrunner.liveness.api.recording.CameraImage(string, uri, string2, z3);
            case 11:
                parcel.getClass();
                return new BonusCalendarParams(parcel.readString(), parcel.readInt());
            case 12:
                parcel.getClass();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z5 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    int i5 = serializer + 41;
                    read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    z = true;
                } else {
                    int i7 = serializer + 121;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    int i9 = read + 55;
                    serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    pushDeepLinkCreateFromParcel = null;
                } else {
                    pushDeepLinkCreateFromParcel = PushDeepLink.CREATOR.createFromParcel(parcel);
                }
                PushDeepLink pushDeepLink = pushDeepLinkCreateFromParcel;
                String string5 = parcel.readString();
                PushAnalyticsData pushAnalyticsData = (PushAnalyticsData) parcel.readParcelable(MessageDialogData.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    int i11 = read + 37;
                    serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new MessageDialogData(string3, string4, z5, z, pushDeepLink, string5, pushAnalyticsData, z2, parcel.readString());
            case 13:
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    int i13 = serializer + 73;
                    read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    z4 = true;
                }
                return new EquipmentBottomSheetParams(z4, (StartWorkingNavAction) parcel.readParcelable(EquipmentBottomSheetParams.class.getClassLoader()));
            case 14:
                parcel.getClass();
                return new VendorReviewArgs(subscribeToPushNotificationEventslambda0.valueOf(parcel.readString()), parcel.readLong(), parcel.readInt());
            case 15:
                parcel.getClass();
                String string6 = parcel.readString();
                int i15 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList.add(SelectionOptionViewEntity.CREATOR.createFromParcel(parcel));
                }
                SelectionMode selectionModeValueOf = SelectionMode.valueOf(parcel.readString());
                int i17 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i17);
                while (i2 != i17) {
                    int i18 = serializer + 55;
                    read = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i18 % 2 == 0) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                        i2 += 111;
                    } else {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                        i2++;
                    }
                }
                return new ChooseOptionFragmentArguments(string6, arrayList, selectionModeValueOf, linkedHashMap);
            default:
                parcel.getClass();
                return new SelectionOptionViewEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }
    }
}
