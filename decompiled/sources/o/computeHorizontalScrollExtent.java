package o;

import com.roadrunner.delivery.accept.orderitems.presentation.compose.OrderItemsNavigationKt;
import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageCardComponentsKt;
import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageSentCardKt;
import com.roadrunner.delivery.ontheway.chatfloating.presentation.CustomerChatBottomSheetButtonContainerKt;
import com.roadrunner.delivery.ontheway.chatfloating.presentation.CustomerChatFloatingButtonContainerKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.DeliveryDetailsKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.compose.ContentSharingContentKt;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.compose.EntrancePictureScreenKt;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.compose.DestinationHeaderWithAddressKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.recenter.compose.NavigationRecenterKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.tripinformation.compose.TripInformationKt;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.CustomerUnavailableHeaderKt;
import com.roadrunner.freelancing.presentation.WorkNowRowKt;
import com.roadrunner.freelancing.presentation.bonus.WorkNowWithBonusKt;
import com.roadrunner.freelancing.presentation.infraboost.WorkNowWithInfraBoostKt;
import com.roadrunner.opportunities.calendar.entrypoint.SeeAllButtonKt;
import com.roadrunner.rider.safety.report.presentation.RiderSafetyReportScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class computeHorizontalScrollExtent implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ androidx.compose.ui.Modifier IconCompatParcelizer;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ computeHorizontalScrollExtent(String str, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, int i2) {
        this.write = i2;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = modifier;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = i;
    }

    public /* synthetic */ computeHorizontalScrollExtent(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.write = i2;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = modifier;
        this.read = i;
    }

    public /* synthetic */ computeHorizontalScrollExtent(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, String str, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.write = i2;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = modifier;
        this.read = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.read;
        androidx.compose.ui.Modifier modifier = this.IconCompatParcelizer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.serializer;
        String str = this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        switch (i2) {
            case 0:
                WorkNowRowKt.WorkNowDescriptionRow(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 1:
                OrderItemsNavigationKt.OrderItemsNavigation(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                int i4 = MediaSessionCompatQueueItem + 7;
                RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 51 / 0;
                }
                return createfromparcel;
            case 2:
                ActionableMessageCardComponentsKt.DispatcherHeaderRow(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 3:
                ActionableMessageSentCardKt.MessageSentCardContent(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 4:
                CustomerChatBottomSheetButtonContainerKt.serializer(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 5:
                CustomerChatFloatingButtonContainerKt.write(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 6:
                DeliveryDetailsKt.write(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 7:
                ContentSharingContentKt.CapturedImageThumbnail(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                int i6 = RatingCompat + 91;
                MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return createfromparcel;
            case 8:
                EntrancePictureScreenKt.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 9:
                DestinationHeaderWithAddressKt.serializer(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 10:
                NavigationRecenterKt.write(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 11:
                TripInformationKt.serializer(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 12:
                TripInformationKt.ExitButton(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 13:
                CustomerUnavailableHeaderKt.CustomerUnavailableHeader(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 14:
                WorkNowWithBonusKt.WorkNowDescriptionRow(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 15:
                WorkNowWithInfraBoostKt.InfraBoostDescriptionRow(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 16:
                SeeAllButtonKt.SeeAllButton(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            default:
                RiderSafetyReportScreenKt.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), getbirthdatefull, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                int i8 = MediaSessionCompatQueueItem + 27;
                RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return createfromparcel;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
        }
    }
}
