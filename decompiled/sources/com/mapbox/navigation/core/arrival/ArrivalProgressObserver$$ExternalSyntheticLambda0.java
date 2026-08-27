package com.mapbox.navigation.core.arrival;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.RealImageLoader$execute$2$job$1;
import com.data.util.exception.FoodoraNullException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.huawei.wisesecurity.ucs_credential.x;
import com.incognia.internal.EK9;
import com.incognia.internal.LHl;
import com.incognia.internal.X6a;
import com.incognia.internal.ZBu;
import com.incognia.internal.zB6;
import com.logistics.rider.glovo.R;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.SessionSKUIdentifier;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.maps.Style;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.accounts.BillingController$arrivalObserver$1;
import com.mapbox.navigation.core.trip.session.BannerInstructionEvent$LatestInstructionWrapper;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.ui.maps.route.arrow.api.MapboxRouteArrowView;
import com.mapbox.navigation.ui.maps.route.arrow.model.UpdateManeuverArrowValue;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.model.SpeechAnnouncement;
import com.mapbox.navigation.voice.model.SpeechValue;
import com.mapbox.navigation.voice.model.TypeAndAnnouncement;
import com.mapbox.navigator.SetRoutesResult;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.ContentSharingFragment;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.RetryCountTrackerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenFragment$onCreateView$1$1$1$1;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import com.roadrunner.map.integration.mapbox.maneuver.ManeuverApi;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.H$b;
import com.ui.common.widget.message_dialog.MessageDialogFragment;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.single.SingleJust;
import io.sentry.android.core.internal.gestures.serializer;
import io.sentry.android.navigation.SentryNavigationListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AndroidComposeViewCompanion;
import o.BrazeActionUtils;
import o.DrawableTransformation;
import o.LineHeightStyleAlignmentCompanion;
import o.OuterPlacementScope;
import o.PinnableContainer;
import o.ShortNewsContentCardView;
import o.TextFieldValueCompanion;
import o.accessgetBaseInputConnection;
import o.accessisRenderNodeCompatiblecp;
import o.backwardFocusSearch;
import o.cancelPendingWebViewPause;
import o.copywBHncE4default;
import o.createFromParcel;
import o.ddefault;
import o.formatQueryBundleForLoglambda0;
import o.generatePOSTBodyString;
import o.getBaseInputConnection;
import o.getChildStepIteratorandroid_sdk_ui_release;
import o.getCieXyz;
import o.getNavigationEventDispatcher;
import o.getNoActiveChildannotations;
import o.getOffsetFromRectListForBjo55l4;
import o.getQueryParameterslambda2;
import o.getTextBeforeSelection;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isCurrentlyDisplayingInAppMessage;
import o.isEditorFocused;
import o.isUnspecifieduvyYCjk;
import o.processInputCommands;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdan7tsCDbGkNcn7OAdLCxuK9AaF4;
import o.r8lambdazNpvCQLl1ENH3QB4YtK5xCBYq3w;
import o.removeNodeAtDepth;
import o.restoreChildFragmentState;
import o.setClipEntry;
import o.setOnRequestDisallowInterceptTouchEventui;
import o.setOnSessionTrackingFailedListener;
import o.setOnThirdPartySharingSettingsChangedListener;
import o.setTransactionSuccessful;
import o.toBitmapConfig1JJdX4A;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ArrivalProgressObserver$$ExternalSyntheticLambda0 implements PinnableContainer, OuterPlacementScope, EK9, zB6, Expected.Action, Expected.Transformer, getNavigationEventDispatcher, isUnspecifieduvyYCjk, Function, CompletableOnSubscribe, r8lambdan7tsCDbGkNcn7OAdLCxuK9AaF4, r8lambdaaCm2JcMru73kJeywi54SW2Mni8U {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ ArrivalProgressObserver$$ExternalSyntheticLambda0(Object obj, int i, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
    }

    @Override // o.OuterPlacementScope
    public Object then(Task task) {
        int i = this.$r8$classId;
        if (i == 2) {
            setClipEntry setclipentry = (setClipEntry) this.f$0;
            String str = (String) this.f$2;
            synchronized (setclipentry) {
                setclipentry.write.remove(str);
            }
            return task;
        }
        if (i != 3) {
            return ((ConfigFetchHandler) this.f$0).RemoteActionCompatParcelizer(task, 0L, (HashMap) this.f$2);
        }
        ConfigFetchHandler configFetchHandler = (ConfigFetchHandler) this.f$0;
        Date date = (Date) this.f$2;
        if (task.isSuccessful()) {
            AndroidComposeViewCompanion androidComposeViewCompanion = configFetchHandler.MediaDescriptionCompat;
            synchronized (androidComposeViewCompanion.RemoteActionCompatParcelizer) {
                androidComposeViewCompanion.read.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception exception = task.getException();
            if (exception != null) {
                boolean z = exception instanceof FirebaseRemoteConfigFetchThrottledException;
                AndroidComposeViewCompanion androidComposeViewCompanion2 = configFetchHandler.MediaDescriptionCompat;
                Object obj = androidComposeViewCompanion2.RemoteActionCompatParcelizer;
                if (z) {
                    synchronized (obj) {
                        androidComposeViewCompanion2.read.edit().putInt("last_fetch_status", 2).apply();
                    }
                } else {
                    synchronized (obj) {
                        androidComposeViewCompanion2.read.edit().putInt("last_fetch_status", 1).apply();
                    }
                }
            }
        }
        return task;
    }

    @Override // com.incognia.internal.EK9
    public void BGx(String str) {
        int i = 2 % 2;
        int i2 = serializer + 77;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        LHl.BGx((LHl) this.f$0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.f$2, str);
        int i4 = read + 117;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.incognia.internal.zB6
    public void BGx(boolean z) {
        int i = 2 % 2;
        int i2 = read + 15;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        X6a x6a = (X6a) this.f$0;
        if (i3 == 0) {
            X6a.BGx(x6a, (ZBu) this.f$2, z);
        } else {
            X6a.BGx(x6a, (ZBu) this.f$2, z);
            int i4 = 4 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c A[PHI: r1 r3 r7
  0x002c: PHI (r1v6 o.getOffsetFromRectListForBjo55l4) = (r1v5 o.getOffsetFromRectListForBjo55l4), (r1v9 o.getOffsetFromRectListForBjo55l4) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x002c: PHI (r3v2 o.accessisRenderNodeCompatiblecp) = (r3v1 o.accessisRenderNodeCompatiblecp), (r3v6 o.accessisRenderNodeCompatiblecp) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x002c: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v7 java.lang.String) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.getNavigationEventDispatcher
    public void onActivityResult(Object obj) {
        getOffsetFromRectListForBjo55l4 getoffsetfromrectlistforbjo55l4;
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp;
        String str;
        int i = 2 % 2;
        int i2 = serializer + 69;
        read = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            getoffsetfromrectlistforbjo55l4 = (getOffsetFromRectListForBjo55l4) this.f$0;
            accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) this.f$2;
            str = (String) obj;
            int i3 = 82 / 0;
            if (str != null) {
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new RealImageLoader$execute$2$job$1(getoffsetfromrectlistforbjo55l4, str, shortNewsContentCardView, 27), 3);
            }
        } else {
            getoffsetfromrectlistforbjo55l4 = (getOffsetFromRectListForBjo55l4) this.f$0;
            accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) this.f$2;
            str = (String) obj;
            if (str != null) {
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new RealImageLoader$execute$2$job$1(getoffsetfromrectlistforbjo55l4, str, shortNewsContentCardView, 27), 3);
            }
        }
        int i4 = serializer + 33;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }

    @Override // io.reactivex.CompletableOnSubscribe
    public void subscribe(CompletableEmitter completableEmitter) {
        int i = 2 % 2;
        UpdateStateUseCaseImpl updateStateUseCaseImpl = (UpdateStateUseCaseImpl) this.f$0;
        setOnThirdPartySharingSettingsChangedListener setonthirdpartysharingsettingschangedlistener = (setOnThirdPartySharingSettingsChangedListener) this.f$2;
        completableEmitter.getClass();
        updateStateUseCaseImpl.serializer.read(null, setonthirdpartysharingsettingschangedlistener.read, setonthirdpartysharingsettingschangedlistener.IconCompatParcelizer, new RealWebSocket$$ExternalSyntheticLambda0(1, completableEmitter), new TncContentKt$$ExternalSyntheticLambda2(15, completableEmitter));
        int i2 = read + 5;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.r8lambdan7tsCDbGkNcn7OAdLCxuK9AaF4
    public void accept(getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release) {
        int i = 2 % 2;
        int i2 = this.$r8$classId;
        Object obj = this.f$2;
        Object obj2 = this.f$0;
        if (i2 == 24) {
            BrazeActionUtils brazeActionUtils = (BrazeActionUtils) obj;
            if (getchildstepiteratorandroid_sdk_ui_release == ((formatQueryBundleForLoglambda0) obj2)) {
                brazeActionUtils.write();
            }
            int i3 = read + 31;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        if (i2 == 27) {
            BrazeActionUtils brazeActionUtils2 = (BrazeActionUtils) obj;
            if (getchildstepiteratorandroid_sdk_ui_release == ((serializer) obj2).write) {
                brazeActionUtils2.write();
            }
            int i5 = serializer + 7;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        if (i2 != 28) {
            BrazeActionUtils brazeActionUtils3 = (BrazeActionUtils) obj;
            Object[] objArr = {getchildstepiteratorandroid_sdk_ui_release, ((SentryNavigationListener) obj2).RemoteActionCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                brazeActionUtils3.write();
                return;
            }
            return;
        }
        BrazeActionUtils brazeActionUtils4 = (BrazeActionUtils) obj2;
        getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release2 = (getChildStepIteratorandroid_sdk_ui_release) obj;
        int i6 = SentryNavigationListener.serializer;
        if (getchildstepiteratorandroid_sdk_ui_release == null) {
            int i7 = serializer + 21;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                brazeActionUtils4.IconCompatParcelizer(getchildstepiteratorandroid_sdk_ui_release2);
            } else {
                brazeActionUtils4.IconCompatParcelizer(getchildstepiteratorandroid_sdk_ui_release2);
                int i8 = 74 / 0;
            }
        }
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        int iIntValue;
        int i = 2 % 2;
        RetryCountTrackerImpl retryCountTrackerImpl = (RetryCountTrackerImpl) this.f$0;
        String str = (String) this.f$2;
        getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) obj;
        getnoactivechildannotations.getClass();
        backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
        retryCountTrackerImpl.getClass();
        Integer num = (Integer) ((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer.get(RetryCountTrackerImpl.serializer(str));
        if (num != null) {
            int i2 = read + 29;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                num.intValue();
                throw null;
            }
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        backwardfocussearchIconCompatParcelizer.serializer(RetryCountTrackerImpl.serializer(str), Integer.valueOf(iIntValue + 1));
        SingleJust singleJustSerializer = Single.serializer(backwardfocussearchIconCompatParcelizer);
        int i3 = read + 69;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return singleJustSerializer;
    }

    @Override // o.PinnableContainer
    public void onComplete(Task task) {
        int i = 2 % 2;
        int i2 = read + 43;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.$r8$classId;
        Object obj = this.f$2;
        Object obj2 = this.f$0;
        if (i4 == 1) {
            ((EnhancedIntentService) obj2).finishTask((Intent) obj);
            int i5 = serializer + 39;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        ReviewManager reviewManager = (ReviewManager) obj2;
        Activity activity = (Activity) obj;
        task.getClass();
        if (!task.isSuccessful()) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(task.getException(), "App review flow request is failed", new Object[0]);
            return;
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("App review flow request is successful", new Object[0]);
        Task taskLaunchReviewFlow = reviewManager.launchReviewFlow(activity, (ReviewInfo) task.getResult());
        taskLaunchReviewFlow.getClass();
        taskLaunchReviewFlow.addOnCompleteListener(new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(1));
    }

    public void onLegIndexUpdatedCallback(boolean z) {
        int i = 2 % 2;
        ArrivalProgressObserver arrivalProgressObserver = (ArrivalProgressObserver) this.f$0;
        if (z) {
            for (BillingController$arrivalObserver$1 billingController$arrivalObserver$1 : arrivalProgressObserver.arrivalObservers) {
                if (billingController$arrivalObserver$1.$r8$classId == 0) {
                    E$b e$b = (E$b) billingController$arrivalObserver$1.this$0;
                    SessionSKUIdentifier runningOrPausedSessionSkuId = e$b.getRunningOrPausedSessionSkuId();
                    SessionSKUIdentifier sessionSKUIdentifier = SessionSKUIdentifier.NAV3_SES_CORE_AGTRIP;
                    if (runningOrPausedSessionSkuId == sessionSKUIdentifier) {
                        int i2 = serializer + 5;
                        read = i2 % Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        e$b.beginBillingSession(sessionSKUIdentifier, 0L, "Nav SDK switched to the next route leg");
                    } else {
                        DrawableTransformation.read((Object) isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                    |Next route leg started while an active guidance session is not running.\n                    |Actual active SKU: " + runningOrPausedSessionSkuId + "\n                "));
                        int i4 = serializer + 13;
                        read = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                    }
                }
            }
        }
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 81;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.$r8$classId;
        Object obj2 = this.f$2;
        Object obj3 = this.f$0;
        if (i3 != 8) {
            ((List) obj).getClass();
            ((ManeuverApi) obj3).RemoteActionCompatParcelizer.write(new LineHeightStyleAlignmentCompanion((Expected) obj2));
            Boolean bool = Boolean.TRUE;
            int i4 = read + 55;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return bool;
        }
        NavigationRoute navigationRoute = (NavigationRoute) obj3;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        String str = (String) obj;
        navigationRoute.getClass();
        shortNewsContentCardView.getClass();
        str.getClass();
        LoggerProviderKt.logE("Annotations update failed for route with ID '" + navigationRoute.id + "'. Reason: " + str, "MapboxNativeNavigatorImpl");
        shortNewsContentCardView.resumeWith(ExpectedFactory.createError(str));
        return createFromParcel.INSTANCE;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        List list;
        int i = 2 % 2;
        int i2 = read + 93;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.$r8$classId;
        Object obj2 = this.f$2;
        Object obj3 = this.f$0;
        FeatureCollection featureCollectionFromFeature = null;
        if (i4 == 7) {
            MapboxTripSession mapboxTripSession = (MapboxTripSession) obj3;
            NavigationRoute navigationRoute = (NavigationRoute) obj2;
            mapboxTripSession.getClass();
            ((SetRoutesResult) obj).getClass();
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = mapboxTripSession.updateLegIndexJob;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                int i5 = serializer + 115;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
            mapboxTripSession.primaryRoute = navigationRoute;
            if (navigationRoute == null || (list = navigationRoute.upcomingRoadObjects) == null) {
                list = instance_delegatelambda0.write;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mapboxTripSession.roadObjects, list}, getCieXyz.write())).booleanValue()) {
                mapboxTripSession.roadObjects = list;
            }
            mapboxTripSession.setOffRoute(false);
            H$b h$b = mapboxTripSession.bannerInstructionEvent;
            BannerInstructionEvent$LatestInstructionWrapper bannerInstructionEvent$LatestInstructionWrapper = (BannerInstructionEvent$LatestInstructionWrapper) h$b.serializer;
            VoiceInstructions voiceInstructions = mapboxTripSession.lastVoiceInstruction;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bannerInstructionEvent$LatestInstructionWrapper, bannerInstructionEvent$LatestInstructionWrapper}, getCieXyz.write())).booleanValue()) {
                h$b.serializer = null;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mapboxTripSession.lastVoiceInstruction, voiceInstructions}, getCieXyz.write())).booleanValue()) {
                mapboxTripSession.lastVoiceInstruction = null;
            }
            mapboxTripSession.routeProgress = null;
            return;
        }
        if (i4 != 9) {
            SpeechAnnouncement speechAnnouncement = (SpeechAnnouncement) obj2;
            TypeAndAnnouncement typeAndAnnouncement = (TypeAndAnnouncement) obj;
            speechAnnouncement.getClass();
            typeAndAnnouncement.getClass();
            LinkedHashMap linkedHashMap = (LinkedHashMap) ((x) obj3).read;
            SpeechValue speechValue = (SpeechValue) linkedHashMap.get(typeAndAnnouncement);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{speechValue != null ? speechValue.announcement : null, speechAnnouncement}, getCieXyz.write())).booleanValue()) {
                int i7 = read + 37;
                serializer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    linkedHashMap.remove(typeAndAnnouncement);
                    return;
                } else {
                    linkedHashMap.remove(typeAndAnnouncement);
                    throw null;
                }
            }
            return;
        }
        MapboxRouteArrowView mapboxRouteArrowView = (MapboxRouteArrowView) obj3;
        Style style = (Style) obj2;
        UpdateManeuverArrowValue updateManeuverArrowValue = (UpdateManeuverArrowValue) obj;
        style.getClass();
        updateManeuverArrowValue.getClass();
        List list2 = updateManeuverArrowValue.layerVisibilityModifications;
        Feature feature = updateManeuverArrowValue.arrowShaftFeature;
        FeatureCollection featureCollectionFromFeature2 = feature != null ? FeatureCollection.fromFeature(feature) : null;
        Feature feature2 = updateManeuverArrowValue.arrowHeadFeature;
        if (feature2 != null) {
            int i8 = serializer + 29;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                FeatureCollection.fromFeature(feature2);
                throw null;
            }
            featureCollectionFromFeature = FeatureCollection.fromFeature(feature2);
        }
        mapboxRouteArrowView.renderInternal(style, list2, featureCollectionFromFeature2, featureCollectionFromFeature);
    }

    @Override // o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U
    public void write(BrazeActionUtils brazeActionUtils) {
        int i = 2 % 2;
        brazeActionUtils.RemoteActionCompatParcelizer(new PreviewView$1$$ExternalSyntheticLambda2((serializer) this.f$0, brazeActionUtils, (getChildStepIteratorandroid_sdk_ui_release) this.f$2, 27));
        int i2 = read + 35;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    @Override // o.isUnspecifieduvyYCjk
    public void onFragmentResult(Bundle bundle, String str) throws FoodoraNullException {
        int i;
        getBaseInputConnection getbaseinputconnection;
        int i2 = 2 % 2;
        int i3 = serializer + 89;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.$r8$classId;
        Object obj = this.f$2;
        Object obj2 = this.f$0;
        switch (i5) {
            case 13:
                copywBHncE4default copywbhnce4default = (copywBHncE4default) obj2;
                bundle.getClass();
                copywbhnce4default.MediaBrowserCompatMediaItem();
                copywbhnce4default.IconCompatParcelizer((FragmentActivity) obj);
                return;
            case 14:
                ContentSharingFragment contentSharingFragment = (ContentSharingFragment) obj;
                bundle.getClass();
                ((cancelPendingWebViewPause) obj2).IconCompatParcelizer = true;
                String string = bundle.getString("InAppCameraWithTagsFragment_screen_data");
                if (string == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string)) {
                    isEditorFocused iseditorfocusedSerializer = contentSharingFragment.serializer();
                    if (iseditorfocusedSerializer.read.isEmpty()) {
                        iseditorfocusedSerializer.MediaDescriptionCompat.serializer(getTextBeforeSelection.read);
                        return;
                    }
                    return;
                }
                isEditorFocused iseditorfocusedSerializer2 = contentSharingFragment.serializer();
                ArrayList arrayList = iseditorfocusedSerializer2.read;
                MutableStateFlow mutableStateFlow = iseditorfocusedSerializer2.IconCompatParcelizer;
                accessgetBaseInputConnection accessgetbaseinputconnection = (accessgetBaseInputConnection) mutableStateFlow.read();
                boolean z = accessgetbaseinputconnection instanceof processInputCommands;
                if (z) {
                    i = ((processInputCommands) accessgetbaseinputconnection).IconCompatParcelizer;
                } else if (!(accessgetbaseinputconnection instanceof getBaseInputConnection)) {
                    if (accessgetbaseinputconnection instanceof r8lambdazNpvCQLl1ENH3QB4YtK5xCBYq3w) {
                        return;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                } else {
                    int i6 = serializer + 121;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    i = ((getBaseInputConnection) accessgetbaseinputconnection).IconCompatParcelizer;
                }
                int i8 = serializer + 35;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    arrayList.size();
                    throw null;
                }
                if (arrayList.size() >= i) {
                    return;
                }
                String strM = d$$ExternalSyntheticOutline0.m();
                arrayList.add(new TextFieldValueCompanion(strM, string, iseditorfocusedSerializer2.write.instant().getEpochSecond(), null, null));
                if (accessgetbaseinputconnection instanceof getBaseInputConnection) {
                    getbaseinputconnection = getBaseInputConnection.serializer((getBaseInputConnection) accessgetbaseinputconnection, iseditorfocusedSerializer2.write(i), false, 510);
                } else {
                    if (!z) {
                        if (accessgetbaseinputconnection instanceof r8lambdazNpvCQLl1ENH3QB4YtK5xCBYq3w) {
                            return;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                    processInputCommands processinputcommands = (processInputCommands) accessgetbaseinputconnection;
                    r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkWrite = iseditorfocusedSerializer2.write(processinputcommands.IconCompatParcelizer);
                    int i9 = processinputcommands.IconCompatParcelizer;
                    String str2 = processinputcommands.RatingCompat;
                    String str3 = processinputcommands.serializer;
                    String str4 = processinputcommands.read;
                    setOnRequestDisallowInterceptTouchEventui setonrequestdisallowintercepttoucheventui = processinputcommands.RemoteActionCompatParcelizer;
                    InAppCameraOverlay.Tags tags = processinputcommands.write;
                    setTransactionSuccessful settransactionsuccessful = iseditorfocusedSerializer2.PlaybackStateCompat;
                    getbaseinputconnection = new getBaseInputConnection(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkWrite, i9, str2, str3, str4, tags, new generatePOSTBodyString(settransactionsuccessful.IconCompatParcelizer(R.string.df_crowdsourcing_sharing_cancel_title), false, settransactionsuccessful.IconCompatParcelizer(R.string.df_crowdsourcing_sharing_cancel_description), settransactionsuccessful.IconCompatParcelizer(R.string.df_crowdsourcing_sharing_cancel_action_button), null, settransactionsuccessful.IconCompatParcelizer(R.string.df_crowdsourcing_sharing_cancel_skip_button), 104, null), false, setonrequestdisallowintercepttoucheventui);
                    int i10 = serializer + 121;
                    read = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                }
                mutableStateFlow.IconCompatParcelizer(getbaseinputconnection);
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(iseditorfocusedSerializer2), null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(iseditorfocusedSerializer2, strM, null, 5), 3);
                return;
            case 15:
                GoAndStartDataStoreFactory$$ExternalSyntheticLambda1 goAndStartDataStoreFactory$$ExternalSyntheticLambda1 = (GoAndStartDataStoreFactory$$ExternalSyntheticLambda1) obj2;
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                bundle.getClass();
                if (!(!bundle.getBoolean("KEY_CONFIRMED"))) {
                    goAndStartDataStoreFactory$$ExternalSyntheticLambda1.invoke();
                    int i12 = read + 117;
                    serializer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                }
                fragmentActivity.getSupportFragmentManager().write("com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.DoubleConfirmationFragment");
                return;
            case 16:
                BarcodeAnalyzer$$ExternalSyntheticLambda0 barcodeAnalyzer$$ExternalSyntheticLambda0 = (BarcodeAnalyzer$$ExternalSyntheticLambda0) obj2;
                FragmentActivity fragmentActivity2 = (FragmentActivity) obj;
                bundle.getClass();
                int iSerializer = getQueryParameterslambda2.serializer();
                MessageDialogFragment.read readVar = (MessageDialogFragment.read) ((Serializable) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 839340738, new Object[]{bundle, "TAG_CLICKED_BUTTON_RESULT", MessageDialogFragment.read.class}, getQueryParameterslambda2.serializer(), -839340732, iSerializer));
                if (readVar != null) {
                    barcodeAnalyzer$$ExternalSyntheticLambda0.invoke(readVar);
                }
                fragmentActivity2.getSupportFragmentManager().write("MESSAGE_DIALOG_FRAGMENT_TAG");
                return;
            case 17:
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
                FragmentActivity fragmentActivity3 = (FragmentActivity) obj;
                bundle.getClass();
                CashPaymentTaskUiItem.ReasonItem reasonItem = (CashPaymentTaskUiItem.ReasonItem) ((Parcelable) SQLite.read(bundle, "TAG_SELECTED_REASON", CashPaymentTaskUiItem.ReasonItem.class));
                if (reasonItem != null) {
                    int i14 = serializer + 65;
                    read = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(reasonItem);
                }
                fragmentActivity3.getSupportFragmentManager().write("TAG_AMOUNT_CHANGING_REASONS");
                return;
            case 18:
            default:
                H$b h$b = (H$b) obj;
                bundle.getClass();
                ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2).invoke(((setTransactionSuccessful) h$b.serializer).IconCompatParcelizer(R.string.request_break_success), ddefault.read, -2);
                ((restoreChildFragmentState) h$b.write).serializer(setOnSessionTrackingFailedListener.OTHER);
                return;
            case 19:
                PinScreenFragment$onCreateView$1$1$1$1 pinScreenFragment$onCreateView$1$1$1$1 = (PinScreenFragment$onCreateView$1$1$1$1) obj2;
                FragmentActivity fragmentActivity4 = (FragmentActivity) obj;
                bundle.getClass();
                String string2 = bundle.getString("CustomerSignatureFragment_uid");
                if (string2 != null) {
                    int i16 = serializer + 71;
                    read = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 == 0) {
                        int i17 = 91 / 0;
                        if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string2)) {
                            pinScreenFragment$onCreateView$1$1$1$1.invoke(string2);
                        }
                    } else if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string2)) {
                        pinScreenFragment$onCreateView$1$1$1$1.invoke(string2);
                    }
                }
                fragmentActivity4.getSupportFragmentManager().write("CustomerSignatureFragment");
                return;
            case 20:
                TakePictureTaskUiModelImpl takePictureTaskUiModelImpl = (TakePictureTaskUiModelImpl) obj2;
                FragmentActivity fragmentActivity5 = (FragmentActivity) obj;
                bundle.getClass();
                String string3 = bundle.getString("InAppCameraWithTagsFragment_screen_data");
                if (string3 == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string3)) {
                    takePictureTaskUiModelImpl.write();
                } else {
                    takePictureTaskUiModelImpl.RemoteActionCompatParcelizer();
                }
                fragmentActivity5.getSupportFragmentManager().write("InAppCameraWithTagsFragment");
                return;
        }
    }
}
