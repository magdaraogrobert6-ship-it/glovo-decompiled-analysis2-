package o;

import android.net.Uri;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.compose.TakePictureKt;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.TagOverlayKt;
import com.roadrunner.delivery.stacked.delivery.details.ui.compose.StackedDeliveryDetailsContentKt;
import com.roadrunner.face.verification.presentation.selfie.review.ReviewSelfieContentKt;
import com.roadrunner.freelancing.presentation.bonusinfo.BonusInformationDialogKt;
import com.roadrunner.freelancing.presentation.info.WorkNowInformationDialogKt;
import com.roadrunner.freelancing.presentation.outsideactivearea.OutsideActiveAreaKt;
import com.roadrunner.freelancing.presentation.stopworking.ConfirmStopWorkingDialogKt;
import com.roadrunner.heatmap.presentation.info.HeatmapInformationDialogKt;
import com.roadrunner.home.nest.NestScreenKt;
import com.roadrunner.home.nest.nestnavbar.NestNavBarContainerKt;
import com.roadrunner.home.nest.onboarding.booksession.BookSessionContentKt;
import com.roadrunner.home.nest.onboarding.tutorial.StartTutorialContentKt;
import com.roadrunner.home.nest.profile.RiderProfileContentKt;
import com.roadrunner.home.nest.riderstatistics.RiderStatisticsContentKt;
import com.roadrunner.home.nest.suspendedstate.SuspendedStateContentKt;
import com.roadrunner.inappnotifications.presentation.InAppNotificationButtonKt;
import com.roadrunner.instant.shifts.presentation.BookableShiftColumnKt;
import com.roadrunner.liveness.cancel.CancelLivenessDetectionDialogKt;
import com.roadrunner.liveness.review.presentation.compose.ReviewScreenKt;
import com.roadrunner.location.toggle.presentation.bottomsheet.EnableLocationKt;
import com.roadrunner.login.presentation.forgotpassword.ForgotPasswordContentKt;
import com.roadrunner.login.presentation.welcome.WelcomeContentKt;
import com.roadrunner.map.navigateview.NavigationInformationKt;
import com.roadrunner.map.navigateview.api.NavigateViewUiModel;
import com.roadrunner.opportunities.calendar.BonusCalendarScreenKt;
import com.roadrunner.opportunities.calendar.info.CalendarInformationScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class internalPathIteratorPeek implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ internalPathIteratorPeek(int i, int i2, androidx.compose.ui.Modifier modifier, Object obj, Object obj2) {
        this.serializer = i2;
        this.read = obj;
        this.write = modifier;
        this.IconCompatParcelizer = obj2;
        this.RemoteActionCompatParcelizer = i;
    }

    public /* synthetic */ internalPathIteratorPeek(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.serializer = i2;
        this.read = obj;
        this.IconCompatParcelizer = obj2;
        this.write = obj3;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 93;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.write;
        Object obj5 = this.IconCompatParcelizer;
        Object obj6 = this.read;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                NestScreenKt.write((getSources) obj6, (execSessionSuccessCallbackCommand) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 1:
                ((Integer) obj2).getClass();
                TakePictureKt.AddPhotoItem((getHasBoundedWidthimpl) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 2:
                ((Integer) obj2).getClass();
                TagOverlayKt.TagOverlay((LayoutDirection) obj6, (androidx.compose.ui.Modifier) obj4, (androidx.compose.animation.core.Animatable) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 3:
                ((Integer) obj2).intValue();
                StackedDeliveryDetailsContentKt.IconCompatParcelizer((getUnspecifiedUIouoOA) obj6, (SignInDataStore) obj5, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 4:
                ((Integer) obj2).getClass();
                ReviewSelfieContentKt.read((Uri) obj6, (String) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 5:
                ((Integer) obj2).getClass();
                BonusInformationDialogKt.read((createIconWithBackground) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 6:
                ((Integer) obj2).getClass();
                WorkNowInformationDialogKt.write((NotificationCompatBuilder) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 7:
                ((Integer) obj2).getClass();
                OutsideActiveAreaKt.OutsideActiveAreaContent((restoreFromCompatExtras) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 8:
                ((Integer) obj2).getClass();
                ConfirmStopWorkingDialogKt.ConfirmStopWorkingDialog((WindowInsetsCompatImpl28) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 9:
                ((Integer) obj2).getClass();
                HeatmapInformationDialogKt.IconCompatParcelizer((setOnScrollChangeListener) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 10:
                ((Integer) obj2).getClass();
                NestNavBarContainerKt.NestNavBarContent((invokeSuspendcomroadrunnermapintegrationmapboxnavigationMapNavigationImplprocessFlows21) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 11:
                ((Integer) obj2).getClass();
                BookSessionContentKt.RemoteActionCompatParcelizer((findChildView) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 12:
                ((Integer) obj2).getClass();
                BookSessionContentKt.BookSessionContent((CheckBoxPreference) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 13:
                ((Integer) obj2).getClass();
                StartTutorialContentKt.read((makeFlag) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 14:
                ((Integer) obj2).getClass();
                StartTutorialContentKt.StartTutorialContent((ListPreferenceSavedState) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 15:
                ((Integer) obj2).getClass();
                RiderProfileContentKt.StatusTag((String) obj6, (MultiSelectListPreferenceSavedState) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 16:
                ((Integer) obj2).getClass();
                RiderStatisticsContentKt.read((LinearLayoutManager) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 17:
                ((Integer) obj2).getClass();
                RiderStatisticsContentKt.RiderStatistic((Preference) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 18:
                ((Integer) obj2).getClass();
                SuspendedStateContentKt.read((onAnimation) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 19:
                ((Integer) obj2).getClass();
                SuspendedStateContentKt.IconCompatParcelizer((PreferenceGroupSavedState) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 20:
                ((Integer) obj2).getClass();
                InAppNotificationButtonKt.read((getItemViewType) obj6, (androidx.compose.ui.Modifier) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 21:
                ((Integer) obj2).getClass();
                BookableShiftColumnKt.BookableShiftColumn((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (shouldIgnore) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 22:
                ((Integer) obj2).getClass();
                CancelLivenessDetectionDialogKt.CancelLivenessDetectionDialog((onPostMigrate) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 23:
                ((Integer) obj2).getClass();
                ReviewScreenKt.IconCompatParcelizer((setCurrentItem) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                int i5 = MediaSessionCompatQueueItem + 39;
                RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return createfromparcel2;
                }
                obj3.hashCode();
                throw null;
            case 24:
                ((Integer) obj2).getClass();
                EnableLocationKt.EnableLocationContent((UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 25:
                ((Integer) obj2).getClass();
                ForgotPasswordContentKt.InputField((getBoolean) obj6, (String) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 26:
                ((Integer) obj2).getClass();
                WelcomeContentKt.WelcomeContent((da) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 27:
                ((Integer) obj2).getClass();
                NavigationInformationKt.NavigationInformation((NavigateViewUiModel) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            case 28:
                ((Integer) obj2).getClass();
                BonusCalendarScreenKt.RemoteActionCompatParcelizer((wdefault) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
            default:
                ((Integer) obj2).getClass();
                CalendarInformationScreenKt.CalendarInformationScreen((v1) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                return createfromparcel2;
        }
    }
}
