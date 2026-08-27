package o;

import android.app.Application;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.navigation.core.directions.session.DirectionsSessionKt;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.data.UtccTaskStateRepositoryImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore;
import com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.home.CreateHomeScope;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class getIterationDuration implements getColorIntegerOrNulllambda0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final mergeJsonObjects serializer;
    public final /* synthetic */ int write;

    public getIterationDuration(getActionViewIntentlambda0 getactionviewintentlambda0, r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi) {
        this.write = 26;
        this.serializer = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
    }

    public /* synthetic */ getIterationDuration(mergeJsonObjects mergejsonobjects, int i) {
        this.write = i;
        this.serializer = mergejsonobjects;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = read + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        mergeJsonObjects mergejsonobjects = this.serializer;
        Object obj = null;
        switch (i4) {
            case 0:
                return new setStateParametersdefault((resetOutlineParams) mergejsonobjects.write());
            case 1:
                return new DeliveryConfirmationLoggerImpl((decode) mergejsonobjects.write());
            case 2:
                Object objWrite = mergejsonobjects.write();
                objWrite.getClass();
                return new SendTestPushUseCase((toDebugStringlambda2) objWrite);
            case 3:
                return new parseAnimatedVisibility((decode) mergejsonobjects.write());
            case 4:
                return new UtccTaskStateRepositoryImpl((AnimationSearchTargetBasedSearch) mergejsonobjects.write());
            case 5:
                return new getMaxDurationPerIterationMillis((transferSessionPackageI) mergejsonobjects.write());
            case 6:
                return new setTimeNanos((transferSessionPackageI) mergejsonobjects.write());
            case 7:
                return new BrazeExternalSyntheticLambda206((transferSessionPackageI) mergejsonobjects.write(), 3);
            case 8:
                return new r8lambdaCDGnLpXSlCStkEf_lDjAOZ3VoI((transferSessionPackageI) mergejsonobjects.write());
            case 9:
                Application application = (Application) mergejsonobjects.write();
                accessgetRequestLayoutp.serializer.getClass();
                return accessgetRequestLayoutp.read(application);
            case 10:
                setGuidelineBegin setguidelinebegin = new setGuidelineBegin((resetOutlineParams) mergejsonobjects.write(), 1);
                int i5 = RemoteActionCompatParcelizer + 77;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return setguidelinebegin;
                }
                obj.hashCode();
                throw null;
            case 11:
                return new AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1((DeliveryTasksStateDataStore) mergejsonobjects.write());
            case 12:
                return new NoopClock((DeliveryTasksStateDataStore) mergejsonobjects.write());
            case 13:
                return new TransitionClock((io.sentry.util.MediaBrowserCompatMediaItem) getCenterozmzZPI.IconCompatParcelizer.write(), (Inspectable) r8lambdamgGE83ZLcdOXm7i39uTuGvlS7zU.IconCompatParcelizer.write(), (getTopRightnOccac) getTopCenternOccac.serializer.write(), (getIGNORE_TRANSITIONS) createTransitionInfolambda4.RemoteActionCompatParcelizer.write(), (r8lambdafOVA0AQDaRf3sWQDuw0C7YJs4bY) mergejsonobjects.write(), new io.sentry.util.MediaBrowserCompatMediaItem(9), (AndroidUiDispatcherCompanioncurrentThread1) DensityKt.serializer.write(), (AndroidUiFrameClock) timesBjo55l4.serializer.write(), (getUnspecifiedXSAIIZEannotations) TextUnitCompanion.read.write(), (accessisMainThread) track.read.write(), (Path$Companion) getRightD9Ej5fMannotations.write.write(), (isUnspecified0680j_4) isSpecifiedEaSLcWcannotations.serializer.write());
            case 14:
                return new SendTestPushUseCase((AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1) mergejsonobjects.write());
            case 15:
                return new SendTestPushUseCase((NoopClock) mergejsonobjects.write());
            case 16:
                return new parseParametersToValueparametersHasTheSameType((NoopClock) mergejsonobjects.write());
            case 17:
                return new GetDeliveryAnalyticsUseCaseImpl((TasksRepository) mergejsonobjects.write());
            case 18:
                return new CreateHomeScope((TasksRepository) mergejsonobjects.write());
            case 19:
                return new GetTaskByTypeAndIdUseCaseImpl((TasksRepository) mergejsonobjects.write());
            case 20:
                return new AnimateXAsStateSearchInfo((transferSessionPackageI) mergejsonobjects.write());
            case 21:
                return new attach((TasksRepository) mergejsonobjects.write());
            case 22:
                return new getAnimatable((TasksRepository) mergejsonobjects.write());
            case 23:
                ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl = new ObserveTaskByTypeAndIdUseCaseImpl((TasksRepository) mergejsonobjects.write());
                int i6 = RemoteActionCompatParcelizer + 93;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return observeTaskByTypeAndIdUseCaseImpl;
                }
                throw null;
            case 24:
                return new getTransition((transferSessionPackageI) mergejsonobjects.write(), new getActionViewIntentlambda0());
            case 25:
                return new UpdateTaskUseCaseImpl((TasksRepository) mergejsonobjects.write());
            case 26:
                return (r8lambdaO8CxgYAEJdvf6QoO3mkJZSui8c) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", r8lambdaO8CxgYAEJdvf6QoO3mkJZSui8c.class);
            case 27:
                return DirectionsSessionKt.write((Application) mergejsonobjects.write());
            case 28:
                Application application2 = (Application) mergejsonobjects.write();
                AnimatedContentSearchInfo.read.getClass();
                application2.getClass();
                return new DeliveryTasksStateDataStore((performCustomExitMxy_nc0) AnimatedContentSearchInfo.RemoteActionCompatParcelizer.getValue(application2, AnimatedContentSearchInfo.IconCompatParcelizer[0]));
            default:
                Application application3 = (Application) mergejsonobjects.write();
                setTargetStateToCurrentAnimationValue.write.getClass();
                application3.getClass();
                return new DeliveryTasksStateDataStore((performCustomExitMxy_nc0) setTargetStateToCurrentAnimationValue.IconCompatParcelizer.getValue(application3, setTargetStateToCurrentAnimationValue.RemoteActionCompatParcelizer[0]));
        }
    }
}
