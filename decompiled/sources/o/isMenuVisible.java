package o;

import android.app.Application;
import coil3.ComponentRegistry$Builder;
import com.foodora.courier.push.tokenregistery.data.GMSPushTokenProvider;
import com.foodora.courier.push.tokenregistery.data.HMSPushTokenProvider;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.domain.AuthenticateUseCase;
import com.roadrunner.auth.domain.AuthenticateWith2FaUseCase;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.customerchat.legacy.core.usecases.ChatRegisterUseCase;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.domain.ConfirmButtonV1MapperImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.diagnostics.data.NotificationsDiagnosticsRepository;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.experience_tools.qualtrics.QualtricsManagerImpl;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.rider.state.provider.domain.GetShiftInfoImpl;
import com.roadrunner.sidemenu.data.SideMenuApiRequest;
import com.roadrunner.sidemenu.data.SideMenuRepository;
import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl;
import io.grpc.internal.CallTracer;

/* JADX INFO: loaded from: classes3.dex */
public final class isMenuVisible implements getColorIntegerOrNulllambda0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final mergeJsonObjects IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final mergeJsonObjects serializer;
    public final mergeJsonObjects write;

    public isMenuVisible(mergeJsonObjects mergejsonobjects, transactiondefault transactiondefaultVar, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, hasNestedScrollingParent hasnestedscrollingparent, setStateDescription setstatedescription) {
        this.RemoteActionCompatParcelizer = 7;
        this.serializer = mergejsonobjects;
        this.read = convertstringjsonarraytolistlambda0;
        this.IconCompatParcelizer = hasnestedscrollingparent;
        this.write = setstatedescription;
    }

    public /* synthetic */ isMenuVisible(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = mergejsonobjects;
        this.read = mergejsonobjects2;
        this.IconCompatParcelizer = mergejsonobjects3;
        this.write = mergejsonobjects4;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.write;
        mergeJsonObjects mergejsonobjects2 = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects3 = this.read;
        mergeJsonObjects mergejsonobjects4 = this.serializer;
        switch (i2) {
            case 0:
                return new CallTracer((decode) mergejsonobjects4.write(), (QualtricsManagerImpl) mergejsonobjects3.write(), (getContentViewGroupParentLayout) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 1:
                Application application = (Application) mergejsonobjects4.write();
                setVerticalStyle setverticalstyle = (setVerticalStyle) mergejsonobjects3.write();
                handleThirdPartySharingCallbackI handlethirdpartysharingcallbacki = (handleThirdPartySharingCallbackI) mergejsonobjects2.write();
                r8lambdazY6FrfYmpvd_923yIbo0dPcgKo r8lambdazy6frfympvd_923yibo0dpcgko = (r8lambdazY6FrfYmpvd_923yIbo0dPcgKo) mergejsonobjects.write();
                application.getClass();
                setverticalstyle.getClass();
                handlethirdpartysharingcallbacki.getClass();
                r8lambdazy6frfympvd_923yibo0dpcgko.getClass();
                Object hMSPushTokenProvider = getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA.serializer[setverticalstyle.write().ordinal()] == 1 ? new HMSPushTokenProvider(application, handlethirdpartysharingcallbacki, r8lambdazy6frfympvd_923yibo0dpcgko) : new GMSPushTokenProvider(handlethirdpartysharingcallbacki, r8lambdazy6frfympvd_923yibo0dpcgko);
                int i3 = MediaBrowserCompatMediaItem + 87;
                MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return hMSPushTokenProvider;
                }
                throw null;
            case 2:
                return new AuthenticateUseCase((boundingRectInRoot) mergejsonobjects4.write(), (AuthRepository) mergejsonobjects3.write(), (com.huawei.wisesecurity.ucs_credential.n0) isTraversalGroupdelegate.serializer.write(), (setDefaultEventToken) mergejsonobjects2.write(), (IncogniaManagerImpl) mergejsonobjects.write());
            case 3:
                return new AuthenticateWith2FaUseCase((boundingRectInRoot) mergejsonobjects4.write(), (AuthRepository) mergejsonobjects3.write(), (setDefaultEventToken) mergejsonobjects2.write(), (IncogniaManagerImpl) mergejsonobjects.write());
            case 4:
                return new scrollByOffset((AuthRepository) mergejsonobjects4.write(), (IsFixableByRetry) isShowingTextSubstitution.serializer.write(), (getDisabled) mergejsonobjects3.write(), (getContentViewGroupParentLayout) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 5:
                return new ChatRegisterUseCase((getPivotOffsetF1C5BW0) mergejsonobjects4.write(), (transferSessionPackageI) mergejsonobjects3.write(), (TextUnitType) mergejsonobjects2.write(), (forEachNewCallbackNeverInvoked) mergejsonobjects.write());
            case 6:
                return new ignorableWhitespace((TextUnitType) mergejsonobjects4.write(), (AnnotatedStringExhaustiveAnnotation) mergejsonobjects3.write(), (requireIndexInRange) mergejsonobjects2.write(), (r8lambdaVSwqKAPZUGoM32l5XH3Xl8tsgCE) mergejsonobjects.write());
            case 7:
                getInfoListui_text getinfolistui_text = new getInfoListui_text((SemanticsOwner) mergejsonobjects4.write(), new SuspendingTransactionWrapper(), (AppEventInfoChangeHandler) mergejsonobjects3.write(), (Application) mergejsonobjects2.write(), (registerOnChangedCallback) mergejsonobjects.write());
                int i4 = MediaBrowserCompatMediaItem + 89;
                MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return getinfolistui_text;
            case 8:
                return new ConfirmButtonV1MapperImpl((setInitialStateToCurrentAnimationValue) mergejsonobjects4.write(), (EnumColumnAdapter) mergejsonobjects3.write(), (ConfirmationRepository) mergejsonobjects2.write(), (setTransactionSuccessful) mergejsonobjects.write());
            case 9:
                return new NotificationsDiagnosticsRepository((Application) mergejsonobjects4.write(), (com.huawei.wisesecurity.ucs_credential.p0) getAllowsGoneWidget.serializer.write(), (setDpMargin) mergejsonobjects3.write(), (setWrapMode) mergejsonobjects2.write(), (ExecuteApiRequest) mergejsonobjects.write());
            case 10:
                return new doesTransientStatePreventRecycling((IncogniaManagerImpl) mergejsonobjects4.write(), (getContentViewGroupParentLayout) mergejsonobjects3.write(), (removeRearDisplayPresentationStatusListener) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
            case 11:
                return new CallTracer((OpportunitiesRepository) mergejsonobjects4.write(), (vd) mergejsonobjects3.write(), (setLastHorizontalStyle) mergejsonobjects2.write(), (CanRequestLocationUpdatesImpl) mergejsonobjects.write());
            case 12:
                return new SideMenuRepository((SideMenuApiRequest) mergejsonobjects4.write(), (SideMenuCacheImpl) mergejsonobjects3.write(), (r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            default:
                return new ComponentRegistry$Builder((GetShiftInfoImpl) mergejsonobjects4.write(), (getActionList) mergejsonobjects3.write(), (OpportunitiesRepository) mergejsonobjects2.write(), new AndroidUiFrameClock(), (isOpenInternalroom_runtime) mergejsonobjects.write());
        }
    }
}
