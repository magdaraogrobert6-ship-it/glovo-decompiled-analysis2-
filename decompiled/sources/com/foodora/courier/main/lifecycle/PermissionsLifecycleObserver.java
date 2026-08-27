package com.foodora.courier.main.lifecycle;

import androidx.activity.result.ActivityResultRegistry;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.DefaultLifecycleObserver;
import coil3.ComponentRegistry$Builder;
import com.foodora.courier.main.presentation.MainActivity;
import com.roadrunner.appreview.AppReviewLifecycleObserverImpl;
import com.roadrunner.delivery.ontheway.observer.OnTheWayLifecycleObserverImpl;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.nafath.VerificationStatusLifecycleObserverImpl;
import com.roadrunner.permission.api.model.PermissionModel;
import com.roadrunner.permission.location.permission.LocationPermissionLifecycleHandler;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.roadrunner.rider.state.polling.RiderStatusOfflineStateRefreshLifecycleObserver$onCreate$1;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import io.sentry.CombinedScopeView;
import io.sentry.util.MediaBrowserCompatMediaItem;
import kotlinx.coroutines.BuildersKt;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.BrazeExternalSyntheticLambda206;
import o.ShortNewsContentCardView;
import o.UtilsKt;
import o.accessisRenderNodeCompatiblecp;
import o.createQuery;
import o.displayInAppMessagelambda1;
import o.getFireTrackingEnabled;
import o.getSessionInterval;
import o.isSystemLifecycleBootstrapIgnored;
import o.isTrackingEnabled;
import o.mergeJsonObjects;
import o.newTransaction;
import o.onContentCardClicked;
import o.r8lambda5KZolJ_OR7ArWBprLRarbYqZEEA;
import o.r8lambda5YIXqjQinFDsIS50wZsDjw0Xjv4;
import o.r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08;
import o.r8lambda6cOFqnFCSVnq6uI5jphSUi9HNJU;
import o.r8lambda80jY8yCJXe50LHel8QKZq07he9s;
import o.r8lambda93nPh_UiO6LLly5QJWhviIL_k;
import o.r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA;
import o.r8lambdaJfSwS2PRWMpHRIytRV9qwrOw8s;
import o.r8lambdaUofYenlmWtpWX2ga1uehmSCK4A;
import o.r8lambdaWoCj75gxmwaDkeS1pbJi3djFY;
import o.r8lambda_DFitVNGGDuLNvZ_AZfzdRTp1Ik;
import o.r8lambdadiHCtAejt895m8HzbAibmUGZMKo;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY;
import o.setActivityHandler;
import o.supportsColorMatrixQuery;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes2.dex */
public final class PermissionsLifecycleObserver implements DefaultLifecycleObserver {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public Object IconCompatParcelizer;
    public final Object MediaBrowserCompatMediaItem;
    public final Object MediaDescriptionCompat;
    public final Object RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Object read;
    public final Object serializer;
    public final Object write;

    public PermissionsLifecycleObserver(r8lambdaWoCj75gxmwaDkeS1pbJi3djFY r8lambdawocj75gxmwadkes1pbji3djfy, r8lambdaUofYenlmWtpWX2ga1uehmSCK4A r8lambdauofyenlmwtpwx2ga1uehmsck4a, r8lambda5YIXqjQinFDsIS50wZsDjw0Xjv4 r8lambda5yixqjqinfdsis50wzsdjw0xjv4, UtilsKt utilsKt, r8lambda5KZolJ_OR7ArWBprLRarbYqZEEA r8lambda5kzolj_or7arwbprlrarbyqzeea, r8lambda80jY8yCJXe50LHel8QKZq07he9s r8lambda80jy8ycjxe50lhel8qkzq07he9s, MainActivity mainActivity) {
        this.RemoteActionCompatParcelizer = 0;
        r8lambdawocj75gxmwadkes1pbji3djfy.getClass();
        r8lambdauofyenlmwtpwx2ga1uehmsck4a.getClass();
        r8lambda5yixqjqinfdsis50wzsdjw0xjv4.getClass();
        utilsKt.getClass();
        r8lambda5kzolj_or7arwbprlrarbyqzeea.getClass();
        r8lambda80jy8ycjxe50lhel8qkzq07he9s.getClass();
        this.RatingCompat = r8lambdawocj75gxmwadkes1pbji3djfy;
        this.write = r8lambdauofyenlmwtpwx2ga1uehmsck4a;
        this.MediaDescriptionCompat = r8lambda5yixqjqinfdsis50wzsdjw0xjv4;
        this.MediaBrowserCompatMediaItem = utilsKt;
        this.read = r8lambda5kzolj_or7arwbprlrarbyqzeea;
        this.serializer = r8lambda80jy8ycjxe50lhel8qkzq07he9s;
        this.IconCompatParcelizer = mainActivity;
    }

    public PermissionsLifecycleObserver(GetRiderStatusImpl getRiderStatusImpl, getSessionInterval getsessioninterval, UpdateStateUseCaseImpl updateStateUseCaseImpl, getFireTrackingEnabled getfiretrackingenabled, createQuery createquery) {
        this.RemoteActionCompatParcelizer = 1;
        this.RatingCompat = getRiderStatusImpl;
        this.write = getsessioninterval;
        this.MediaDescriptionCompat = updateStateUseCaseImpl;
        this.MediaBrowserCompatMediaItem = getfiretrackingenabled;
        this.read = createquery;
        this.serializer = onContentCardClicked.MediaSessionCompatQueueItem(new isTrackingEnabled[]{isTrackingEnabled.NOT_WORKING, isTrackingEnabled.STARTING, isTrackingEnabled.LATE});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        if (r14 == r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$refreshStatusContinuously(com.foodora.courier.main.lifecycle.PermissionsLifecycleObserver r11, long r12, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foodora.courier.main.lifecycle.PermissionsLifecycleObserver.access$refreshStatusContinuously(com.foodora.courier.main.lifecycle.PermissionsLifecycleObserver, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = 21;
        int i3 = MediaSessionCompatQueueItem + 21;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            accessisrendernodecompatiblecp.getClass();
            throw null;
        }
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.write;
        accessisrendernodecompatiblecp.getClass();
        if (i4 != 0) {
            getSessionInterval getsessioninterval = (getSessionInterval) obj2;
            if (((FirebaseRemoteConfigImpl) getsessioninterval.IconCompatParcelizer).IconCompatParcelizer(updateAdidI.IS_SMART_POLLING_IN_OFFLINE_STATE_ENABLED)) {
                if (((Gen2FunWithFlagsConfigRepository) getsessioninterval.read).serializer(setActivityHandler.read, displayInAppMessagelambda1.serializer(isSystemLifecycleBootstrapIgnored.class)) == isSystemLifecycleBootstrapIgnored.VARIATION1) {
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new RiderStatusOfflineStateRefreshLifecycleObserver$onCreate$1(accessisrendernodecompatiblecp, this, (ShortNewsContentCardView) null), 3);
                    return;
                }
                return;
            }
            return;
        }
        supportsColorMatrixQuery lifecycle = accessisrendernodecompatiblecp.getLifecycle();
        r8lambdaWoCj75gxmwaDkeS1pbJi3djFY r8lambdawocj75gxmwadkes1pbji3djfy = (r8lambdaWoCj75gxmwaDkeS1pbJi3djFY) this.RatingCompat;
        MainActivity mainActivity = (MainActivity) this.IconCompatParcelizer;
        ActivityResultRegistry activityResultRegistry = mainActivity.getActivityResultRegistry();
        activityResultRegistry.getClass();
        ComponentRegistry$Builder componentRegistry$Builder = r8lambdawocj75gxmwadkes1pbji3djfy.read;
        lifecycle.IconCompatParcelizer(new LocationPermissionLifecycleHandler((r8lambda93nPh_UiO6LLly5QJWhviIL_k) ((mergeJsonObjects) componentRegistry$Builder.write).write(), (r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA) ((mergeJsonObjects) componentRegistry$Builder.read).write(), (r8lambdadiHCtAejt895m8HzbAibmUGZMKo) ((mergeJsonObjects) componentRegistry$Builder.RemoteActionCompatParcelizer).write(), (r8lambda_DFitVNGGDuLNvZ_AZfzdRTp1Ik) ((mergeJsonObjects) componentRegistry$Builder.IconCompatParcelizer).write(), (transferSessionPackageI) ((mergeJsonObjects) componentRegistry$Builder.serializer).write(), mainActivity, activityResultRegistry));
        RouterLogger routerLogger = ((r8lambdaUofYenlmWtpWX2ga1uehmSCK4A) obj2).RemoteActionCompatParcelizer;
        lifecycle.IconCompatParcelizer(new VerificationStatusLifecycleObserverImpl(mainActivity, (r8lambdaJfSwS2PRWMpHRIytRV9qwrOw8s) ((mergeJsonObjects) routerLogger.read).write(), (RouterLogger) ((newTransaction) routerLogger.serializer).write(), new MediaBrowserCompatMediaItem(i2)));
        PermissionModel permissionModel = new PermissionModel(r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.NOTIFICATION, true);
        r8lambda5YIXqjQinFDsIS50wZsDjw0Xjv4 r8lambda5yixqjqinfdsis50wzsdjw0xjv4 = (r8lambda5YIXqjQinFDsIS50wZsDjw0Xjv4) this.MediaDescriptionCompat;
        ActivityResultRegistry activityResultRegistry2 = mainActivity.getActivityResultRegistry();
        activityResultRegistry2.getClass();
        lifecycle.IconCompatParcelizer(r8lambda5yixqjqinfdsis50wzsdjw0xjv4.serializer(mainActivity, activityResultRegistry2, permissionModel));
        lifecycle.IconCompatParcelizer(new AppReviewLifecycleObserverImpl(mainActivity, (RouterLogger) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) ((UtilsKt) this.MediaBrowserCompatMediaItem).write.IconCompatParcelizer).write()));
        r8lambda5KZolJ_OR7ArWBprLRarbYqZEEA r8lambda5kzolj_or7arwbprlrarbyqzeea = (r8lambda5KZolJ_OR7ArWBprLRarbYqZEEA) this.read;
        r8lambda5kzolj_or7arwbprlrarbyqzeea.getClass();
        r8lambda6cOFqnFCSVnq6uI5jphSUi9HNJU r8lambda6cofqnfcsvnq6ui5jphsui9hnju = r8lambda5kzolj_or7arwbprlrarbyqzeea.serializer;
        Object objWrite = r8lambda6cofqnfcsvnq6ui5jphsui9hnju.read.write();
        objWrite.getClass();
        Object objWrite2 = r8lambda6cofqnfcsvnq6ui5jphsui9hnju.RemoteActionCompatParcelizer.write();
        objWrite2.getClass();
        lifecycle.IconCompatParcelizer(new VerificationStatusLifecycleObserverImpl((r8lambda93nPh_UiO6LLly5QJWhviIL_k) objWrite, (r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA) objWrite2, new AndroidUiDispatcherCompanioncurrentThread1(20), mainActivity));
        r8lambda80jY8yCJXe50LHel8QKZq07he9s r8lambda80jy8ycjxe50lhel8qkzq07he9s = (r8lambda80jY8yCJXe50LHel8QKZq07he9s) this.serializer;
        r8lambda80jy8ycjxe50lhel8qkzq07he9s.getClass();
        CombinedScopeView combinedScopeView = r8lambda80jy8ycjxe50lhel8qkzq07he9s.read;
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.RemoteActionCompatParcelizer).write();
        objWrite3.getClass();
        Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.read).write();
        objWrite4.getClass();
        lifecycle.IconCompatParcelizer(new OnTheWayLifecycleObserverImpl((r8lambda93nPh_UiO6LLly5QJWhviIL_k) objWrite3, (r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA) objWrite4, (BrazeExternalSyntheticLambda206) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) combinedScopeView.write).write(), mainActivity));
        int i5 = MediaSessionCompatQueueItem + 123;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
