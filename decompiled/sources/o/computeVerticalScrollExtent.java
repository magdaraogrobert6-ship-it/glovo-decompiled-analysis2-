package o;

import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.custom.password.presentation.compose.CustomPasswordContentKt;
import com.roadrunner.delivery.accept.bottomsheet.overlay.presentation.AcceptBottomSheetKt;
import com.roadrunner.delivery.accept.footer.implementation.presentation.DeliveryAcceptFooterContentKt;
import com.roadrunner.delivery.accept.orderitems.presentation.compose.OrderItemsBottomSheetKt;
import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageModalBottomSheetKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.compose.ContentSharingContentKt;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.compose.EntrancePictureScreenKt;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewState;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.compose.TransferChangeScreenKt;
import com.roadrunner.freelancing.presentation.bonus.WorkNowWithBonusKt;
import com.roadrunner.inappnotifications.presentation.InAppNotificationsScreenKt;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.compose.PasswordCreationScreenKt;
import com.roadrunner.rider.state.ondemand.api.bonus.OnDemandWithBonusUiModel;
import com.roadrunner.rider.state.ondemand.bonus.compose.OnDemandWithBonusKt;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingScreenKt;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingViewModel;
import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.N$b;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class computeVerticalScrollExtent implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int ParcelableVolumeInfo;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ computeVerticalScrollExtent(TransferChangeViewState transferChangeViewState, r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, com.huawei.wisesecurity.ucs_credential.p0 p0Var, androidx.compose.ui.Modifier modifier, int i) {
        this.read = 8;
        this.RemoteActionCompatParcelizer = transferChangeViewState;
        this.serializer = r8lambdacmvjstjhw3hzog60vfqxbrs6hs8;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaMetadataCompat = p0Var;
        this.RatingCompat = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ computeVerticalScrollExtent(invalidateCallbacksFor invalidatecallbacksfor, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, String str, String str2, String str3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, int i) {
        this.read = 1;
        this.RemoteActionCompatParcelizer = invalidatecallbacksfor;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RatingCompat = modifier;
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.MediaMetadataCompat = str3;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ computeVerticalScrollExtent(accessgetStripNonMetricAffectingCharSpansp accessgetstripnonmetricaffectingcharspansp, isMainThread ismainthread, accessisMainThread accessismainthread, io.sentry.util.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i) {
        this.read = 3;
        this.RemoteActionCompatParcelizer = accessgetstripnonmetricaffectingcharspansp;
        this.serializer = ismainthread;
        this.IconCompatParcelizer = accessismainthread;
        this.write = mediaBrowserCompatMediaItem;
        this.MediaDescriptionCompat = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RatingCompat = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ computeVerticalScrollExtent(Api34SegmentFindertoAndroidSegmentFinder1 api34SegmentFindertoAndroidSegmentFinder1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, accessgetStripNonMetricAffectingCharSpansp accessgetstripnonmetricaffectingcharspansp, accessstripNonMetricAffectingCharacterStyleSpans accessstripnonmetricaffectingcharacterstylespans, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i) {
        this.read = 4;
        this.RemoteActionCompatParcelizer = api34SegmentFindertoAndroidSegmentFinder1;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = accessgetstripnonmetricaffectingcharspansp;
        this.IconCompatParcelizer = accessstripnonmetricaffectingcharacterstylespans;
        this.write = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.RatingCompat = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ computeVerticalScrollExtent(getTopLeftnOccac gettopleftnoccac, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, androidx.compose.ui.Modifier modifier, int i) {
        this.read = 5;
        this.RemoteActionCompatParcelizer = gettopleftnoccac;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.MediaMetadataCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        this.RatingCompat = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ computeVerticalScrollExtent(RecyclerViewLayoutManager recyclerViewLayoutManager, stopScroll stopscroll, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, androidx.compose.ui.Modifier modifier, int i) {
        this.read = 9;
        this.RemoteActionCompatParcelizer = recyclerViewLayoutManager;
        this.serializer = stopscroll;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaMetadataCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.RatingCompat = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ computeVerticalScrollExtent(ActivityHandler39 activityHandler39, androidx.compose.ui.focus.FocusRequester focusRequester, String str, String str2, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, int i) {
        this.read = 11;
        this.RemoteActionCompatParcelizer = activityHandler39;
        this.serializer = focusRequester;
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.RatingCompat = modifier;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaDescriptionCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ computeVerticalScrollExtent(OnDemandWithBonusUiModel onDemandWithBonusUiModel, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, logPushStoryPageClickedlambda11 logpushstorypageclickedlambda11, xb xbVar, accessisMainThread accessismainthread, getStoreIdFromSystem getstoreidfromsystem, androidx.compose.ui.Modifier modifier, int i) {
        this.read = 13;
        this.RemoteActionCompatParcelizer = onDemandWithBonusUiModel;
        this.MediaSessionCompatQueueItem = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.MediaDescriptionCompat = logpushstorypageclickedlambda11;
        this.serializer = xbVar;
        this.IconCompatParcelizer = accessismainthread;
        this.MediaMetadataCompat = getstoreidfromsystem;
        this.RatingCompat = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ computeVerticalScrollExtent(OneClickStartWorkingViewModel oneClickStartWorkingViewModel, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, androidx.compose.ui.Modifier modifier, int i) {
        this.read = 14;
        this.RemoteActionCompatParcelizer = oneClickStartWorkingViewModel;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.RatingCompat = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ computeVerticalScrollExtent(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.read = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = obj2;
        this.IconCompatParcelizer = obj3;
        this.write = obj4;
        this.MediaSessionCompatQueueItem = obj5;
        this.MediaDescriptionCompat = obj6;
        this.MediaMetadataCompat = obj7;
        this.RatingCompat = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ computeVerticalScrollExtent(Object obj, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, isInvalidIndex isinvalidindex, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.read = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaMetadataCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.IconCompatParcelizer = isinvalidindex;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        this.RatingCompat = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ computeVerticalScrollExtent(String str, String str2, String str3, int i, E$b e$b, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2) {
        this.read = 12;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompatMediaItem = i;
        this.write = e$b;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaMetadataCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.read;
        int i3 = this.MediaBrowserCompatMediaItem;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.RatingCompat;
        Object obj4 = this.MediaMetadataCompat;
        Object obj5 = this.IconCompatParcelizer;
        Object obj6 = this.write;
        Object obj7 = this.serializer;
        Object obj8 = this.MediaDescriptionCompat;
        Object obj9 = this.MediaSessionCompatQueueItem;
        Object obj10 = this.RemoteActionCompatParcelizer;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                WorkNowWithBonusKt.WorkNowRowWithBonus((NotificationCompatAction) obj10, (xb) obj7, (accessisMainThread) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                CustomPasswordContentKt.ScrollableContentWithFixedButton((invalidateCallbacksFor) obj10, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9, (androidx.compose.ui.Modifier) obj3, (String) obj5, (String) obj6, (String) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AcceptBottomSheetKt.SheetContent((getPlatformAndroidManager) obj10, (getPlatformAndroidManager) obj7, (getPlatformAndroidManager) obj5, (N$b) obj6, (TextPainterKt) obj9, (SignInDataStore) obj8, (com.huawei.wisesecurity.ucs_credential.p0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                DeliveryAcceptFooterContentKt.DeliveryAcceptFooterContent((accessgetStripNonMetricAffectingCharSpansp) obj10, (isMainThread) obj7, (accessisMainThread) obj5, (io.sentry.util.MediaBrowserCompatMediaItem) obj6, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                OrderItemsBottomSheetKt.OrderItemsContent((Api34SegmentFindertoAndroidSegmentFinder1) obj10, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9, (accessgetStripNonMetricAffectingCharSpansp) obj7, (accessstripNonMetricAffectingCharacterStyleSpans) obj5, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ActionableMessageModalBottomSheetKt.ModalBottomSheetContent((getTopLeftnOccac) obj10, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                int i4 = MediaSessionCompatResultReceiverWrapper + 31;
                ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                break;
            case 6:
                ((Integer) obj2).getClass();
                ContentSharingContentKt.ContentSharingContent((getBaseInputConnection) obj10, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                EntrancePictureScreenKt.EntrancePictureScreen((getPlatformLocaleDelegate) obj10, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                TransferChangeScreenKt.TransferChangeScreen((TransferChangeViewState) obj10, (r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (com.huawei.wisesecurity.ucs_credential.p0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                InAppNotificationsScreenKt.InAppNotificationsScreen((RecyclerViewLayoutManager) obj10, (stopScroll) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                stopBackgroundTimerI.write((trackNewSessionI) obj10, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj9, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                int i6 = ParcelableVolumeInfo + 45;
                MediaSessionCompatResultReceiverWrapper = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                break;
            case 11:
                ((Integer) obj2).getClass();
                PasswordCreationScreenKt.Body((ActivityHandler39) obj10, (androidx.compose.ui.focus.FocusRequester) obj7, (String) obj5, (String) obj6, (androidx.compose.ui.Modifier) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            case 12:
                String str = (String) obj10;
                String str2 = (String) obj7;
                String str3 = (String) obj5;
                E$b e$b = (E$b) obj6;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                int iIntValue = ((Integer) obj2).intValue();
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (!getpostalcode.write(iIntValue & 1, !((iIntValue & 3) == 2))) {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    PointerInteropFilter_androidKtmotionEventSpy11.write(str, str2, str3, this.MediaBrowserCompatMediaItem, (transferSessionPackageI) e$b.read, (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) e$b.RemoteActionCompatParcelizer, (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) e$b.IconCompatParcelizer, (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) e$b.MediaDescriptionCompat, (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) e$b.MediaBrowserCompatMediaItem, (FormBody.Builder) e$b.write, (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) e$b.MediaMetadataCompat, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, null, getpostalcode, 0, 0);
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                OnDemandWithBonusKt.OnDemandWithBonus((OnDemandWithBonusUiModel) obj10, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj9, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (logPushStoryPageClickedlambda11) obj8, (xb) obj7, (accessisMainThread) obj5, (getStoreIdFromSystem) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                OneClickStartWorkingScreenKt.read((OneClickStartWorkingViewModel) obj10, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                break;
        }
        return createfromparcel;
    }
}
