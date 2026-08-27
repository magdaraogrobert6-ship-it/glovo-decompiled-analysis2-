package com.roadrunner.nafath;

import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.DefaultLifecycleObserver;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.foodora.courier.main.presentation.MainActivity;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.nafath.data.VerificationStatusRepository;
import com.roadrunner.permission.api.model.PermissionModel;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.roadrunner.rider.state.provider.domain.SaveShiftInfo$invoke$2;
import io.sentry.util.MediaBrowserCompatMediaItem;
import java.time.Clock;
import kotlinx.coroutines.BuildersKt;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.ImageHeaderParserImageType;
import o.ShortNewsContentCardView;
import o.TextMotion;
import o.accessisRenderNodeCompatiblecp;
import o.onBackPressed;
import o.r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08;
import o.r8lambda93nPh_UiO6LLly5QJWhviIL_k;
import o.r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA;
import o.r8lambdaJfSwS2PRWMpHRIytRV9qwrOw8s;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class VerificationStatusLifecycleObserverImpl implements DefaultLifecycleObserver {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final Object IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final Object serializer;
    public final Object write;

    public VerificationStatusLifecycleObserverImpl(MainActivity mainActivity, r8lambdaJfSwS2PRWMpHRIytRV9qwrOw8s r8lambdajfsws2prwmphriytrv9qwrow8s, RouterLogger routerLogger, MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        this.read = 3;
        r8lambdajfsws2prwmphriytrv9qwrow8s.getClass();
        routerLogger.getClass();
        mediaBrowserCompatMediaItem.getClass();
        this.serializer = mainActivity;
        this.RemoteActionCompatParcelizer = r8lambdajfsws2prwmphriytrv9qwrow8s;
        this.IconCompatParcelizer = routerLogger;
        this.write = mediaBrowserCompatMediaItem;
    }

    public VerificationStatusLifecycleObserverImpl(VerificationStatusRepository verificationStatusRepository, Clock clock, transferSessionPackageI transfersessionpackagei, ImageHeaderParserImageType imageHeaderParserImageType, MainActivity mainActivity) {
        this.read = 0;
        verificationStatusRepository.getClass();
        transfersessionpackagei.getClass();
        this.RemoteActionCompatParcelizer = verificationStatusRepository;
        this.IconCompatParcelizer = clock;
        this.write = transfersessionpackagei;
        this.serializer = mainActivity;
    }

    public VerificationStatusLifecycleObserverImpl(TextMotion textMotion, ImageHeaderParserImageType imageHeaderParserImageType, GetRiderStatusImpl getRiderStatusImpl, AppCompatActivity appCompatActivity, RouterLogger routerLogger) {
        this.read = 1;
        this.RemoteActionCompatParcelizer = textMotion;
        this.IconCompatParcelizer = getRiderStatusImpl;
        this.write = appCompatActivity;
        this.serializer = routerLogger;
    }

    public VerificationStatusLifecycleObserverImpl(r8lambda93nPh_UiO6LLly5QJWhviIL_k r8lambda93nph_uio6llly5qjwhviil_k, r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA r8lambdaekymoxv_2c6wlkkhzt5tho0_ya, AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1, MainActivity mainActivity) {
        this.read = 2;
        this.RemoteActionCompatParcelizer = r8lambda93nph_uio6llly5qjwhviil_k;
        this.IconCompatParcelizer = r8lambdaekymoxv_2c6wlkkhzt5tho0_ya;
        this.serializer = mainActivity;
        this.write = new PermissionModel(r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.ACTIVITY_RECOGNITION, true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = this.read;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = this.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 == 0) {
            accessisrendernodecompatiblecp.getClass();
            super.onCreate(accessisrendernodecompatiblecp);
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) obj2);
            firebaseRemoteConfigImpl.getClass();
            if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_NAFATH_VERIFICATION_ENABLED)) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Nafath verification enabled — starting observation", new Object[0]);
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new PushEventPublisherImpl$emit$1(accessisrendernodecompatiblecp, this, shortNewsContentCardView, 24), 3);
                return;
            } else {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Nafath verification disabled by remote config", new Object[0]);
                int i3 = RatingCompat + 23;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return;
            }
        }
        if (i2 == 1) {
            accessisrendernodecompatiblecp.getClass();
            super.onCreate(accessisrendernodecompatiblecp);
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) ((TextMotion) obj).serializer;
            String strSerializer = firebaseRemoteConfigImpl2.RemoteActionCompatParcelizer.serializer();
            if (strSerializer != null) {
                if (m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_TRUSTED_TIME_BLOCKING_UI_ENABLED, firebaseRemoteConfigImpl2.IconCompatParcelizer, strSerializer, firebaseRemoteConfigImpl2)) {
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new HeatmapMapLayerUiModelImpl$1(accessisrendernodecompatiblecp, this, shortNewsContentCardView, 14), 3);
                    return;
                }
            }
            int i5 = RatingCompat + 117;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        if (i2 != 2) {
            accessisrendernodecompatiblecp.getClass();
            super.onCreate(accessisrendernodecompatiblecp);
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new SaveShiftInfo$invoke$2(accessisrendernodecompatiblecp, this, shortNewsContentCardView, 7), 3);
            return;
        }
        MainActivity mainActivity = (MainActivity) this.serializer;
        PermissionModel permissionModel = (PermissionModel) obj2;
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        if (Build.VERSION.SDK_INT < 29 || ((r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA) this.IconCompatParcelizer).read(permissionModel.IconCompatParcelizer, mainActivity)) {
            return;
        }
        onBackPressed onbackpressedRegister = mainActivity.getActivityResultRegistry().register("activity_recognition_launch_activity", accessisrendernodecompatiblecp, ((r8lambda93nPh_UiO6LLly5QJWhviIL_k) obj).write, new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(10));
        onbackpressedRegister.getClass();
        onbackpressedRegister.write(permissionModel);
    }
}
