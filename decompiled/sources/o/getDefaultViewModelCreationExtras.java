package o;

import bo.app.ah$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.android.SystemUtils;
import com.roadrunner.logger.api.critical.CriticalObservabilityException;
import java.util.Collections;
import java.util.Map;
import kotlin.ranges.RangesKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public abstract class getDefaultViewModelCreationExtras {
    public static volatile ReportedVideoQualityNotSupportedQuirk IconCompatParcelizer = null;
    private static int read = 0;
    private static int serializer = 1;

    public static /* synthetic */ void RemoteActionCompatParcelizer(SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection, Exception exc, executeAsList executeaslist) {
        int i = 2 % 2;
        int i2 = read + 45;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        RemoteActionCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection, exc, null, executeaslist);
        int i4 = read + 47;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static final void RemoteActionCompatParcelizer(SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection, Exception exc, String str, executeAsList executeaslist) {
        int i = 2 % 2;
        executeaslist.getClass();
        String str2 = "Delivery flow state external component parsing error: " + swipeDismissTouchListenerVerticalDismissDirection;
        if (str == null) {
            int i2 = serializer + 125;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                throw null;
            }
            str = SystemUtils.UNKNOWN;
        }
        Map mapSingletonMap = Collections.singletonMap("type", str);
        mapSingletonMap.getClass();
        Timber.RemoteActionCompatParcelizer.write(new CriticalObservabilityException("external_component_error", executeaslist, mapSingletonMap, str2, exc));
        int i3 = serializer + 121;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    public static final void IconCompatParcelizer(boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-642000585);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.write(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                i3 = 32;
            } else {
                int i5 = read + 77;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        int i7 = 1;
        int i8 = 0;
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            Object objRemoteActionCompatParcelizer = evaluateX.RemoteActionCompatParcelizer(getpostalcode);
            if (objRemoteActionCompatParcelizer == null) {
                getpostalcode.serializer(1512740606);
                objRemoteActionCompatParcelizer = addOnUserLeaveHintListener.read(getpostalcode);
            } else {
                getpostalcode.serializer(1512737723);
            }
            getpostalcode.IconCompatParcelizer(false);
            if (objRemoteActionCompatParcelizer == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            int i9 = serializer + 47;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            boolean z2 = getpostalcode.read(objRemoteActionCompatParcelizer);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2 || objComponentActivity == androidContentCaptureManager) {
                defaultViewModelProviderFactory_delegatelambda0 onBackPressedDispatcher = null;
                accesswriteValidRootInUnitRange accesswritevalidrootinunitrange = objRemoteActionCompatParcelizer instanceof accesswriteValidRootInUnitRange ? (accesswriteValidRootInUnitRange) objRemoteActionCompatParcelizer : null;
                clampValidRootInUnitRange navigationEventDispatcher = accesswritevalidrootinunitrange != null ? accesswritevalidrootinunitrange.getNavigationEventDispatcher() : null;
                fullyDrawnReporter_delegatelambda0 fullydrawnreporter_delegatelambda0 = objRemoteActionCompatParcelizer instanceof fullyDrawnReporter_delegatelambda0 ? (fullyDrawnReporter_delegatelambda0) objRemoteActionCompatParcelizer : null;
                if (fullydrawnreporter_delegatelambda0 != null) {
                    int i11 = read + 105;
                    serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    onBackPressedDispatcher = fullydrawnreporter_delegatelambda0.getOnBackPressedDispatcher();
                    int i13 = read + 7;
                    serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                }
                getLifecycle getlifecycle = new getLifecycle(navigationEventDispatcher, onBackPressedDispatcher);
                getpostalcode.write(getlifecycle);
                objComponentActivity = getlifecycle;
            }
            getLifecycle getlifecycle2 = (getLifecycle) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode);
                getpostalcode.write(objComponentActivity2);
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity2;
            long j = getpostalcode.RatingCompat;
            boolean z3 = getpostalcode.read(getlifecycle2);
            boolean zSerializer = getpostalcode.serializer(j);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if ((z3 | zSerializer) || objComponentActivity3 == androidContentCaptureManager) {
                addOnPictureInPictureModeChangedListener addonpictureinpicturemodechangedlistener = new addOnPictureInPictureModeChangedListener(getcontentviewgroupparentlayout, new enterPictureInPictureMode(j, objRemoteActionCompatParcelizer));
                getpostalcode.write(addonpictureinpicturemodechangedlistener);
                objComponentActivity3 = addonpictureinpicturemodechangedlistener;
            }
            addOnPictureInPictureModeChangedListener addonpictureinpicturemodechangedlistener2 = (addOnPictureInPictureModeChangedListener) objComponentActivity3;
            getpostalcode.serializer(-348514256);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(addonpictureinpicturemodechangedlistener2);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new ah$$ExternalSyntheticLambda0(addonpictureinpicturemodechangedlistener2, i7, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                getpostalcode.write(objComponentActivity4);
            }
            getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, getpostalcode);
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(addonpictureinpicturemodechangedlistener2);
            int i15 = i2 & 14;
            boolean z4 = i15 == 4;
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if ((z4 | zIconCompatParcelizer3) || objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new getLastCustomNonConfigurationInstance(addonpictureinpicturemodechangedlistener2, z, i8);
                getpostalcode.write(objComponentActivity5);
            }
            RangesKt.write(Boolean.valueOf(z), addonpictureinpicturemodechangedlistener2, (accessisRenderNodeCompatiblecp) null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, getpostalcode, i15);
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(getlifecycle2);
            boolean zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(addonpictureinpicturemodechangedlistener2);
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer4 && !zIconCompatParcelizer5) {
                int i16 = read + 13;
                serializer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i17 = i16 % 2;
                if (objComponentActivity6 == androidContentCaptureManager) {
                    objComponentActivity6 = new waitForFirstLayout(getlifecycle2, i7, addonpictureinpicturemodechangedlistener2);
                    getpostalcode.write(objComponentActivity6);
                }
            } else {
                objComponentActivity6 = new waitForFirstLayout(getlifecycle2, i7, addonpictureinpicturemodechangedlistener2);
                getpostalcode.write(objComponentActivity6);
            }
            getPhoneNumberNational.IconCompatParcelizer(getlifecycle2, addonpictureinpicturemodechangedlistener2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6, getpostalcode);
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getActivityResultRegistry(z, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i, i8);
        }
    }
}
