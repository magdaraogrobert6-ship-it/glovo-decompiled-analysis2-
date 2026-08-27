package o;

import com.roadrunner.freelancing.presentation.bonusinfo.BonusInformationDialogKt;
import com.roadrunner.freelancing.presentation.empty.OpportunityInfoContentKt;
import com.roadrunner.freelancing.presentation.goandstartinfo.GoAndStartInformationDialogKt;
import com.roadrunner.freelancing.presentation.goandstartinfo.GoAndStartInformationUiModelImpl;
import com.roadrunner.freelancing.presentation.info.WorkNowInformationDialogKt;
import com.roadrunner.heatmap.presentation.description.HeatmapDescriptionKt;
import com.roadrunner.heatmap.presentation.info.HeatmapInformationDialogKt;
import com.roadrunner.home.nest.laststopdisclaimer.LastStopDisclaimerContentKt;
import com.roadrunner.home.nest.profile.RiderProfileContentKt;
import com.roadrunner.location.toggle.api.bottomsheet.EnableLocationUiModel;
import com.roadrunner.location.toggle.presentation.LocationToggleFloatingContentKt;
import com.roadrunner.location.toggle.presentation.bottomsheet.EnableLocationKt;
import com.roadrunner.login.presentation.countryselection.compose.CountryItemKt;
import com.roadrunner.login.presentation.router.RouterScreenKt;
import com.roadrunner.map.integration.mapbox.ui.maneuver.compose.ManeuverKt;
import com.roadrunner.nafath.NafathModalContentKt;
import com.roadrunner.opportunities.calendar.BonusCalendarEmptyScreenKt;
import com.roadrunner.opportunities.multiplier.BonusMultiplierRowKt;
import com.roadrunner.recentdeliveries.presentation.components.DeliveryItemKt;
import com.roadrunner.rider.safety.permission.presentation.missingpermission.MissingPermissionsContentKt;
import com.roadrunner.rider.safety.report.presentation.RecommendationItemKt;
import com.roadrunner.rider.state.finishedshift.api.presentation.FinishedShiftUiModel;
import com.roadrunner.rider.state.finishedshift.presentation.FinishedShiftKt;
import com.roadrunner.rider.state.finishedshift.presentation.FinishedShiftV2Kt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p2 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ p2(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.Modifier modifier, int i) {
        this.IconCompatParcelizer = 18;
        this.serializer = annotatedString;
        this.read = modifier;
        this.write = i;
    }

    public /* synthetic */ p2(int i, int i2, Object obj, Object obj2) {
        this.IconCompatParcelizer = i2;
        this.read = obj;
        this.serializer = obj2;
        this.write = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.write;
        Object obj3 = this.serializer;
        Object obj4 = this.read;
        switch (i4) {
            case 0:
                ((Integer) obj2).getClass();
                NafathModalContentKt.NafathRestrictionBanner((String) obj4, (androidx.compose.ui.text.AnnotatedString) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                BonusInformationDialogKt.BonusInformationContent((constructCompatStyleByName) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                OpportunityInfoContentKt.serializer((getExtraData) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                OpportunityInfoContentKt.OpportunityInfoAvailableColumn((putExtraData) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i6 = MediaDescriptionCompat + 83;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                break;
            case 4:
                ((Integer) obj2).getClass();
                GoAndStartInformationDialogKt.GoAndStartInformationDialog((GoAndStartInformationUiModelImpl) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                WorkNowInformationDialogKt.WorkNowInformationDialog((setDisplayShape) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                HeatmapDescriptionKt.HeatmapDescription((updateData) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                HeatmapInformationDialogKt.HeatmapInformationDialog((readDataOrHandleCorruption) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                lambdainit3.RemoteActionCompatParcelizer((androidx.compose.ui.graphics.ColorFilter) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                LastStopDisclaimerContentKt.read((ChildHelper) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                LastStopDisclaimerContentKt.IconCompatParcelizer((invokeSuspendcomroadrunnerdeliveryonthewaycrowdsourcinggallerypresentationGalleryViewModelonVotePressed1) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                RiderProfileContentKt.RiderProfileContainer((getSwipeThreshold) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                unregisterAdapterDataObserver.serializer((getItemId) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                addViewInt.RemoteActionCompatParcelizer((androidx.compose.ui.Modifier) obj4, (notifyItemInserted) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                LocationToggleFloatingContentKt.LocationToggleFloatingContent((WorkerWrapperKt) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                EnableLocationKt.EnableLocation((EnableLocationUiModel) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                CountryItemKt.CountryItem((bExternalSyntheticLambda1) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                RouterScreenKt.write((cdExternalSyntheticLambda0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i8 = MediaDescriptionCompat + 15;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                break;
            case 18:
                ((Integer) obj2).getClass();
                dd.RemoteActionCompatParcelizer((androidx.compose.ui.text.AnnotatedString) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ManeuverKt.IconCompatParcelizer((getTrimEVpEnUU) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ManeuverKt.RemoteActionCompatParcelizer((LineHeightStyleAlignmentCompanion) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                NafathModalContentKt.NafathModal((pb) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                BonusCalendarEmptyScreenKt.BonusCalendarEmptyScreen((tf) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                BonusMultiplierRowKt.BonusMultiplierRow((t3) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                DeliveryItemKt.DeliveryItem((startBackgroundTimerI) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                MissingPermissionsContentKt.MissingPermissionRow((getSdkVersion) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                RecommendationItemKt.RecommendationItem((disableAppSetIdReading) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                FinishedShiftKt.serializer((FinishedShiftUiModel) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                FinishedShiftKt.FinishedShiftColumn((r8lambdayLzRZVFM4MK2pbhBUcln0OaOVsk) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                FinishedShiftV2Kt.IconCompatParcelizer((AdjustInstanceExternalSyntheticLambda1) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
        }
        return createfromparcel;
    }
}
