package o;

import android.app.Application;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.re2j.Parser;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import com.roadrunner.home.nest.divider.ObserveDivider;
import com.roadrunner.inappnotifications.data.InAppNotificationsRepository;
import com.roadrunner.inappnotifications.data.database.InAppNotificationsDatabase;
import com.roadrunner.inappnotifications.domain.FetchAndSaveInAppMessageUseCase;
import com.roadrunner.instant.shifts.data.InstantShiftRepository;
import com.roadrunner.liveness.recording.data.ChallengesRepository;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.rider.state.status.GetCourierStatusUseCaseImpl;
import com.sentiance.core.model.events.H$b;

/* JADX INFO: loaded from: classes3.dex */
public final class getSharedElementTargetNames implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int read;
    public final mergeJsonObjects serializer;

    public /* synthetic */ getSharedElementTargetNames(mergeJsonObjects mergejsonobjects, int i) {
        this.read = i;
        this.serializer = mergejsonobjects;
    }

    public /* synthetic */ getSharedElementTargetNames(Object obj, mergeJsonObjects mergejsonobjects, int i) {
        this.read = i;
        this.serializer = mergejsonobjects;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.read;
        mergeJsonObjects mergejsonobjects = this.serializer;
        Object obj = null;
        switch (i2) {
            case 0:
                isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) mergejsonobjects.write();
                isopeninternalroom_runtime.getClass();
                CreateHomeScope createHomeScope = new CreateHomeScope();
                createHomeScope.read = isopeninternalroom_runtime;
                return createHomeScope;
            case 1:
                Object objWrite = mergejsonobjects.write();
                objWrite.getClass();
                return new performCreate((performActivityCreated) objWrite);
            case 2:
                Object objWrite2 = mergejsonobjects.write();
                objWrite2.getClass();
                return new setHasOptionsMenu((setInitialSavedState) objWrite2);
            case 3:
                return new internalPathIteratorSize((decode) mergejsonobjects.write());
            case 4:
                return (SwitchPreference) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", SwitchPreference.class);
            case 5:
                return new ObserveDivider((NestComponentRepositoryImpl) mergejsonobjects.write(), 0);
            case 6:
                return new ProfileInstallerInitializerExternalSyntheticLambda1((NestComponentRepositoryImpl) mergejsonobjects.write(), (com.huawei.wisesecurity.ucs_credential.g0) areContentsTheSame.serializer.write());
            case 7:
                return new Parser.Pair((NestComponentRepositoryImpl) mergejsonobjects.write(), (com.huawei.wisesecurity.ucs_credential.n0) getSwipeVelocityThreshold.read.write());
            case 8:
                return new com.huawei.agconnect.config.impl.m((NestComponentRepositoryImpl) mergejsonobjects.write(), (com.huawei.wisesecurity.ucs_credential.p0) onChildDraw.read.write());
            case 9:
                return new H$b((NestComponentRepositoryImpl) mergejsonobjects.write(), (IsFixableByRetry) PagerSnapHelper.serializer.write());
            case 10:
                return new attachToRecyclerView((SemanticsOwner) mergejsonobjects.write());
            case 11:
                return (hasPendingAdapterUpdates) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", hasPendingAdapterUpdates.class);
            case 12:
                addItemDecoration additemdecoration = (addItemDecoration) mergejsonobjects.write();
                additemdecoration.getClass();
                return new considerReleasingGlowsOnScroll(additemdecoration);
            case 13:
                return new getRecycledViewPool((EnumColumnAdapter) mergejsonobjects.write());
            case 14:
                return new getScrollState((EnumColumnAdapter) mergejsonobjects.write());
            case 15:
                InAppNotificationsDatabase inAppNotificationsDatabase = (InAppNotificationsDatabase) mergejsonobjects.write();
                inAppNotificationsDatabase.getClass();
                startNestedScroll startnestedscrollWrite = inAppNotificationsDatabase.write();
                setNativeShader.IconCompatParcelizer(startnestedscrollWrite);
                return startnestedscrollWrite;
            case 16:
                Application application = (Application) mergejsonobjects.write();
                application.getClass();
                clipRectmtrdDE cliprectmtrddeRemoteActionCompatParcelizer = androidx.room.Room.RemoteActionCompatParcelizer(application, InAppNotificationsDatabase.class, "rr_in_app_notifications.db");
                cliprectmtrddeRemoteActionCompatParcelizer.read();
                return (InAppNotificationsDatabase) cliprectmtrddeRemoteActionCompatParcelizer.write();
            case 17:
                return (setItemAnimator) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", setItemAnimator.class);
            case 18:
                return new FetchAndSaveInAppMessageUseCase((InAppNotificationsRepository) mergejsonobjects.write());
            case 19:
                InAppNotificationsRepository inAppNotificationsRepository = (InAppNotificationsRepository) mergejsonobjects.write();
                inAppNotificationsRepository.getClass();
                CreateHomeScope createHomeScope2 = new CreateHomeScope();
                createHomeScope2.read = inAppNotificationsRepository;
                return createHomeScope2;
            case 20:
                return new SaveHeatmapUrlImpl((GetCourierStatusUseCaseImpl) mergejsonobjects.write());
            case 21:
                Application application2 = (Application) mergejsonobjects.write();
                application2.getClass();
                return new addChangePayload(application2);
            case 22:
                return new getUnmodifiedPayloads((decode) mergejsonobjects.write());
            case 23:
                return new RouterLogger((InstantShiftRepository) mergejsonobjects.write(), (AndroidUiFrameClock) insertAndReturnId.read.write());
            case 24:
                return (isAdapterPositionUnknown) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", isAdapterPositionUnknown.class);
            case 25:
                return new insertAndReturnIdsList((restoreChildFragmentState) mergejsonobjects.write());
            case 26:
                return new createQuery((transferSessionPackageI) mergejsonobjects.write(), 0);
            case 27:
                return emitcomroadrunnerdeliveryonthewayobserverBuildingHighlightObserverImplonCreate11invokeSuspendlambda0inlinedmap12.serializer((getIdentifiersValidationsEnabled) mergejsonobjects.write());
            case 28:
                unpackInt2 unpackint2 = new unpackInt2((transferSessionPackageI) mergejsonobjects.write(), 6);
                int i3 = IconCompatParcelizer + 77;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return unpackint2;
                }
                throw null;
            default:
                SendTestPushUseCase sendTestPushUseCase = new SendTestPushUseCase((ChallengesRepository) mergejsonobjects.write());
                int i4 = RemoteActionCompatParcelizer + 107;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return sendTestPushUseCase;
                }
                obj.hashCode();
                throw null;
        }
    }
}
