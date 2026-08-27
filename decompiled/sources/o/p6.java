package o;

import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.zoom.ZoomControlKt;
import com.roadrunner.delivery.ontheway.tripplanner.list.presentation.compose.TripPlannerListKt;
import com.roadrunner.delivery.pickupdropoff.tasks.api.presentation.PickUpDropOffTaskWrapperKt;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.compose.QrPaymentKt;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.face.verification.presentation.selfie.review.HumanReviewBottomSheetKt;
import com.roadrunner.face.verification.presentation.selfie.review.ReviewSelfieContentKt;
import com.roadrunner.nafath.NafathModalContentKt;
import com.roadrunner.rider.state.ondemand.offlinebutton.OnDemandOfflineFloatingContentKt;
import com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryColumnKt;
import com.roadrunner.rrds.compose.component.forms.ToggleKt;
import com.roadrunner.settings.ui.screens.NavigationSettingsScreenKt;
import com.roadrunner.vendor.review.api.presentation.VendorReviewOptionKt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p6 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ p6(bitOffsetToIndex bitoffsettoindex, androidx.compose.ui.Modifier modifier, Integer num, boolean z, int i) {
        this.write = 5;
        this.IconCompatParcelizer = bitoffsettoindex;
        this.read = modifier;
        this.RemoteActionCompatParcelizer = num;
        this.serializer = z;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ p6(Object obj, boolean z, Object obj2, Object obj3, int i, int i2) {
        this.write = i2;
        this.IconCompatParcelizer = obj;
        this.serializer = z;
        this.read = obj2;
        this.RemoteActionCompatParcelizer = obj3;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ p6(String str, String str2, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        this.write = 1;
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.serializer = z;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ p6(boolean z, Object obj, Object obj2, Object obj3, int i, int i2) {
        this.write = i2;
        this.serializer = z;
        this.IconCompatParcelizer = obj;
        this.read = obj2;
        this.RemoteActionCompatParcelizer = obj3;
        this.MediaMetadataCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.MediaMetadataCompat;
        Object obj3 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.read;
        Object obj5 = this.IconCompatParcelizer;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                NafathModalContentKt.serializer((String) obj5, this.serializer, (String) obj4, (String) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
                return createfromparcel;
            case 1:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                ZoomControlKt.ZoomChip((String) obj5, (String) obj4, this.serializer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
                return createfromparcel;
            case 2:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                getSubscripty9eOQZs.write(this.serializer, (androidx.compose.ui.Modifier) obj5, (androidx.compose.foundation.interaction.MutableInteractionSourceImpl) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3);
                int i4 = RatingCompat + 13;
                MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 23 / 0;
                }
                return createfromparcel;
            case 3:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer4 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                TripPlannerListKt.RemoteActionCompatParcelizer((findMethod) obj5, this.serializer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer4);
                return createfromparcel;
            case 4:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer5 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                PickUpDropOffTaskWrapperKt.PickUpDropOffTaskWrapper(this.serializer, (Boolean) obj5, (androidx.compose.ui.Modifier) obj4, (DragAndDropTargetModifierNode) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer5);
                return createfromparcel;
            case 5:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer6 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                setStateParameters.IconCompatParcelizer((bitOffsetToIndex) obj5, (androidx.compose.ui.Modifier) obj4, (Integer) obj3, this.serializer, (getBirthDateFull) obj, iRemoteActionCompatParcelizer6);
                int i6 = RatingCompat + 21;
                MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return createfromparcel;
                }
                throw null;
            case 6:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer7 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                QrPaymentKt.QrCodeComposable((getDisplayName) obj5, this.serializer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer7);
                return createfromparcel;
            case 7:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer8 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                HumanReviewBottomSheetKt.write(this.serializer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.material3.SheetState) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer8);
                return createfromparcel;
            case 8:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer9 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                ReviewSelfieContentKt.ButtonsFooter(this.serializer, (DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) obj5, (DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer9);
                return createfromparcel;
            case 9:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer10 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                OnDemandOfflineFloatingContentKt.write(this.serializer, (String) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer10);
                return createfromparcel;
            case 10:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer11 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                NestRiderStateSummaryColumnKt.RemoteActionCompatParcelizer((buildResponseData) obj5, this.serializer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer11);
                return createfromparcel;
            case 11:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer12 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                ToggleKt.ToggleBig((List) obj5, this.serializer, (androidx.compose.ui.Modifier) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer12);
                return createfromparcel;
            case 12:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer13 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                NavigationSettingsScreenKt.NavigationRadioButton((r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ) obj5, this.serializer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer13);
                return createfromparcel;
            default:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer14 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                VendorReviewOptionKt.serializer((subscribeToNoMatchingTriggerForEventlambda0) obj5, this.serializer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer14);
                return createfromparcel;
        }
    }
}
