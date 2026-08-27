package com.huawei.wisesecurity.ucs_credential;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import androidx.core.app.NotificationCompat$BigPictureStyle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.BlockRunner;
import androidx.sqlite.SQLite;
import androidx.transition.TransitionValuesMaps;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.w4$$ExternalSyntheticLambda0;
import coil3.ExtrasKt;
import coil3.disk.DiskLruCache$Editor;
import coil3.disk.DiskLruCache$launchCleanup$1;
import coil3.network.okhttp.internal.CallsKt$await$2$2;
import com.adjust.sdk.Constants;
import com.bumptech.glide.RequestBuilder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zznd;
import com.google.android.gms.internal.mlkit_vision_face.zznl;
import com.google.android.gms.tasks.zzw;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firestore.v1.Write;
import com.google.mlkit.vision.face.internal.zzm;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.re2j.Parser;
import com.google.zxing.qrcode.encoder.Encoder;
import com.huawei.agconnect.config.impl.m;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.location.lite.common.chain.TaskTimeOutException;
import com.huawei.location.lite.common.util.filedownload.DownLoadFileBean;
import com.huawei.location.lite.common.util.filedownload.DownloadFileParam;
import com.huawei.location.logic.E5;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.common.utils.SpUtil;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkRequest;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkResponse;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.api.directions.v5.models.BannerText;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.IntersectionLanes;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.api.directions.v5.models.StepIntersection;
import com.mapbox.api.directions.v5.models.StepManeuver;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.BillingService;
import com.mapbox.common.BillingSessionStatus;
import com.mapbox.common.HttpHeaders;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.MapboxOptions;
import com.mapbox.common.MemoryMonitorFactory;
import com.mapbox.common.MemoryMonitorInterface;
import com.mapbox.common.NetworkRestriction;
import com.mapbox.common.ResourceLoadFlags;
import com.mapbox.common.SessionSKUIdentifier;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Snapshotter$$ExternalSyntheticLambda0;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.CameraAnimatorsFactory;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import com.mapbox.navigation.base.internal.CongestionNumericOverride;
import com.mapbox.navigation.base.internal.route.parsing.models.DirectionsParsedRouteData;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import com.mapbox.navigation.base.trip.model.RouteStepProgress;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.internal.LowMemoryManager$Observer;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$AccumulatingLowSpeed;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$DecreaseTraffic;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$IncreaseTraffic;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$NoAction;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$RestoreTraffic;
import com.mapbox.navigation.core.internal.congestions.processor.IncreaseTrafficUpdateActionHandler;
import com.mapbox.navigation.core.internal.congestions.processor.TrafficUpdateActionHandler;
import com.mapbox.navigation.core.internal.congestions.speed.PredictedTimeAheadDistanceCalculator;
import com.mapbox.navigation.core.internal.router.NavigationRouterRefreshError;
import com.mapbox.navigation.core.reroute.RouteRequestResult$Failure;
import com.mapbox.navigation.core.routerefresh.MapboxHistoryRecorderWrapper;
import com.mapbox.navigation.core.routerefresh.RouteRefreshStateResult;
import com.mapbox.navigation.core.trip.session.MapboxTripSession$$ExternalSyntheticLambda2;
import com.mapbox.navigation.navigator.internal.MapboxNativeNavigatorImpl;
import com.mapbox.navigation.ui.base.util.internal.resource.ResourceLoaderFactory;
import com.mapbox.navigation.ui.maps.camera.transition.DefaultSimplifiedUpdateFrameTransitionProvider;
import com.mapbox.navigation.ui.maps.camera.transition.NavigationCameraTransitionOptions;
import com.mapbox.navigation.ui.utils.internal.resource.DefaultResourceLoader;
import com.mapbox.navigation.ui.utils.internal.resource.ResourceLoaderExtensionsKt;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigation.utils.internal.UrlUtils;
import com.mapbox.navigation.voice.api.MapboxSpeechApi$mainJobController$2;
import com.mapbox.navigation.voice.api.MapboxSpeechApi$retrieveVoiceFile$1;
import com.mapbox.navigation.voice.api.MapboxSpeechProvider$load$1;
import com.mapbox.navigation.voice.api.VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes;
import com.mapbox.navigation.voice.model.AudioFocusOwner;
import com.mapbox.navigation.voice.model.SpeechAnnouncement;
import com.mapbox.navigation.voice.model.SpeechError;
import com.mapbox.navigation.voice.model.SpeechValue;
import com.mapbox.navigation.voice.model.TypeAndAnnouncement;
import com.mapbox.navigation.voice.model.VoiceState$VoiceError;
import com.mapbox.navigation.voice.model.VoiceState$VoiceFile;
import com.mapbox.navigation.voice.options.MapboxSpeechApiOptions;
import com.mapbox.search.IndexableDataProvidersRegistryImpl$DataProviderContext;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.mapbox.search.base.logger.LogKt;
import com.mapbox.search.base.utils.extension.MapKt;
import com.mapbox.search.internal.bindgen.SearchEngine;
import com.mapbox.search.record.LocalDataProviderImpl;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.math.MathKt;
import kotlin.sequences.SequenceBuilderIterator;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import o.AndroidAccessibilityManagerCompanion;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.DataStoreProviderc;
import o.NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1;
import o.ParentDataModifierDefaultImpls;
import o.RegistryMissingComponentException;
import o.WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1;
import o.WrappedCompositionsetContent1211;
import o.accessgetDropdownListcp;
import o.accessgetModulatecp;
import o.accessgetSwitchcp;
import o.accessgetSystemNavigationDowncp;
import o.accessupdateUnsafe;
import o.addOrRemoveMenuItem;
import o.calculateRecommendedTimeoutMillis;
import o.collapsePeerui;
import o.createLayerdefault;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getBaselineShift5SSeXJ0;
import o.getCieXyz;
import o.getClipEntry;
import o.getContentChild;
import o.getEnterdhqQ8s;
import o.getExitdhqQ8s;
import o.getFontSynthesisZQGJjVo;
import o.getForceMeasureWithLookaheadConstraintsui;
import o.getImageo7Vup1c;
import o.getOnActionModeDestroy;
import o.getOnCopyRequested;
import o.getOnPasteRequested;
import o.getRectManager;
import o.getScrollCaptureInProgress;
import o.getShouldAttachOnInsert;
import o.getSteps;
import o.getTextGeometricTransform;
import o.getTextInputService;
import o.getUseMinimumTouchTarget;
import o.headH91voCI;
import o.hideCurrentlyDisplayingInAppMessage;
import o.ignoreRemeasureRequests;
import o.instance_delegatelambda0;
import o.invalidateRootLayer;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.l2;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onPostAttach;
import o.onTouchEnded;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setAfter;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setBackground8_81llA;
import o.setBaselineShift_isdbwI;
import o.setCollectionInfo;
import o.setFontFamily;
import o.setFontFeatureSettings;
import o.setOffset;
import o.setUnregisteredInAppMessage;
import o.shareWithSiblings;
import o.takeOrElseDxMtmZc;
import o.unregisterInAppMessageManager;
import o.updateLayerParameters;
import o.verifyOrientationStatuslambda2;
import o.visitNodes;
import o.visitScrollCaptureCandidatesdefault;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1, TrafficUpdateActionHandler {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat = 0;
    private static byte serializer = -112;
    public Object IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public final /* synthetic */ int write;

    public void write() {
        synchronized (this) {
            if (((accessupdateUnsafe) this.RemoteActionCompatParcelizer) == null) {
                this.RemoteActionCompatParcelizer = (accessupdateUnsafe) ((DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5) this.read).apply((getTextInputService) this.IconCompatParcelizer);
            }
        }
    }

    public void RemoteActionCompatParcelizer() {
        Set hashSet;
        if (((FirebaseInAppMessagingDisplay.AnonymousClass4) this.read) == null || TextUtils.isEmpty((String) this.RemoteActionCompatParcelizer)) {
            return;
        }
        synchronized (((getUseMinimumTouchTarget) this.IconCompatParcelizer).RemoteActionCompatParcelizer) {
            if (((getUseMinimumTouchTarget) this.IconCompatParcelizer).RemoteActionCompatParcelizer.containsKey((String) this.RemoteActionCompatParcelizer)) {
                hashSet = (Set) ((getUseMinimumTouchTarget) this.IconCompatParcelizer).RemoteActionCompatParcelizer.get((String) this.RemoteActionCompatParcelizer);
            } else {
                hashSet = new HashSet();
                ((getUseMinimumTouchTarget) this.IconCompatParcelizer).RemoteActionCompatParcelizer.put((String) this.RemoteActionCompatParcelizer, hashSet);
            }
            if (!hashSet.contains((FirebaseInAppMessagingDisplay.AnonymousClass4) this.read)) {
                hashSet.add((FirebaseInAppMessagingDisplay.AnonymousClass4) this.read);
            }
        }
    }

    public void addObserver(LowMemoryManager$Observer lowMemoryManager$Observer) {
        lowMemoryManager$Observer.getClass();
        synchronized (((CopyOnWriteArrayList) this.RemoteActionCompatParcelizer)) {
            ((CopyOnWriteArrayList) this.RemoteActionCompatParcelizer).add(lowMemoryManager$Observer);
            if (((CopyOnWriteArrayList) this.RemoteActionCompatParcelizer).size() == 1) {
                ((MemoryMonitorInterface) this.read).registerObserver((MapboxNavigation$$ExternalSyntheticLambda4) this.IconCompatParcelizer);
            }
        }
    }

    public void removeObserver(LowMemoryManager$Observer lowMemoryManager$Observer) {
        lowMemoryManager$Observer.getClass();
        synchronized (((CopyOnWriteArrayList) this.RemoteActionCompatParcelizer)) {
            ((CopyOnWriteArrayList) this.RemoteActionCompatParcelizer).remove(lowMemoryManager$Observer);
            if (((CopyOnWriteArrayList) this.RemoteActionCompatParcelizer).isEmpty()) {
                ((MemoryMonitorInterface) this.read).unregisterObserver((MapboxNavigation$$ExternalSyntheticLambda4) this.IconCompatParcelizer);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045 A[DONT_INVERT, PHI: r0 r2 r3 r4
  0x0045: PHI (r0v44 int) = (r0v43 int), (r0v62 int) binds: [B:11:0x0043, B:8:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r2v15 int) = (r2v14 int), (r2v21 int) binds: [B:11:0x0043, B:8:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r3v17 o.setFontFeatureSettings) = (r3v16 o.setFontFeatureSettings), (r3v23 o.setFontFeatureSettings) binds: [B:11:0x0043, B:8:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r4v3 o.getFontSynthesisZQGJjVo) = (r4v2 o.getFontSynthesisZQGJjVo), (r4v9 o.getFontSynthesisZQGJjVo) binds: [B:11:0x0043, B:8:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b A[PHI: r0 r2 r3 r4
  0x006b: PHI (r0v60 int) = (r0v44 int), (r0v61 int), (r0v61 int) binds: [B:14:0x0050, B:22:0x0069, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x006b: PHI (r2v19 int) = (r2v15 int), (r2v20 int), (r2v20 int) binds: [B:14:0x0050, B:22:0x0069, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x006b: PHI (r3v20 o.setFontFeatureSettings) = (r3v17 o.setFontFeatureSettings), (r3v21 o.setFontFeatureSettings), (r3v21 o.setFontFeatureSettings) binds: [B:14:0x0050, B:22:0x0069, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x006b: PHI (r4v7 o.getFontSynthesisZQGJjVo) = (r4v3 o.getFontSynthesisZQGJjVo), (r4v8 o.getFontSynthesisZQGJjVo), (r4v8 o.getFontSynthesisZQGJjVo) binds: [B:14:0x0050, B:22:0x0069, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:93:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00ce A[SYNTHETIC] */
    public x(DiskLruCache$Editor diskLruCache$Editor, getTextGeometricTransform gettextgeometrictransform, setFontFeatureSettings setfontfeaturesettings) {
        setBackground8_81llA setbackground8_81lla;
        int i;
        int i2;
        setFontFeatureSettings setfontfeaturesettings2;
        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo;
        boolean z;
        setFontFeatureSettings setfontfeaturesettings3;
        int i3;
        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo2;
        int i4;
        int i5;
        int i6;
        this.write = 8;
        this.IconCompatParcelizer = diskLruCache$Editor;
        this.read = new ArrayList();
        int i7 = 0;
        setFontFeatureSettings setfontfeaturesettings4 = setfontfeaturesettings;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = 1;
            if (setfontfeaturesettings4 == null) {
                boolean z2 = diskLruCache$Editor.read;
                getBaselineShift5SSeXJ0 getbaselineshift5ssexj0 = (getBaselineShift5SSeXJ0) diskLruCache$Editor.serializer;
                if (z2) {
                    int i11 = MediaBrowserCompatMediaItem + 31;
                    RatingCompat = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 == 0 ? (setbackground8_81lla = (setBackground8_81llA) ((ArrayList) this.read).get(0)) != null : (setbackground8_81lla = (setBackground8_81llA) ((ArrayList) this.read).get(0)) != null) {
                        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo3 = setbackground8_81lla.write;
                        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo4 = getFontSynthesisZQGJjVo.ECI;
                        if (getfontsynthesiszqgjjvo3 != getfontsynthesiszqgjjvo4) {
                            int i12 = RatingCompat + 45;
                            MediaBrowserCompatMediaItem = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            if (i9 != 0) {
                                ((ArrayList) this.read).add(0, new setBackground8_81llA(this, getfontsynthesiszqgjjvo4, 0, 0, 0));
                            }
                        }
                    }
                    setBackground8_81llA setbackground8_81lla2 = (setBackground8_81llA) ((ArrayList) this.read).get(0);
                    ArrayList arrayList = (ArrayList) this.read;
                    if (setbackground8_81lla2.write != getFontSynthesisZQGJjVo.ECI) {
                        int i14 = MediaBrowserCompatMediaItem + 93;
                        RatingCompat = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                    } else {
                        int i16 = MediaBrowserCompatMediaItem + 11;
                        RatingCompat = i16 % Fields.SpotShadowColor;
                        if (i16 % 2 != 0) {
                            int i17 = 3 / 5;
                        } else {
                            int i18 = 2 % 2;
                        }
                        i7 = 1;
                    }
                    arrayList.add(i7, new setBackground8_81llA(this, getFontSynthesisZQGJjVo.FNC1_FIRST_POSITION, 0, 0, 0));
                }
                int i19 = gettextgeometrictransform.serializer;
                int i20 = 9;
                int iOrdinal = (i19 <= 9 ? setFontFamily.SMALL : i19 <= 26 ? setFontFamily.MEDIUM : setFontFamily.LARGE).ordinal();
                if (iOrdinal == 0) {
                    int i21 = RatingCompat + 3;
                    MediaBrowserCompatMediaItem = i21 % Fields.SpotShadowColor;
                    if (i21 % 2 == 0) {
                        int i22 = 2 % 3;
                    } else {
                        int i23 = 2 % 2;
                    }
                } else if (iOrdinal != 1) {
                    i10 = 27;
                    i20 = 40;
                } else {
                    i10 = 10;
                    i20 = 26;
                }
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(gettextgeometrictransform);
                while (i19 < i20 && !Encoder.serializer(iRemoteActionCompatParcelizer, getTextGeometricTransform.write(i19), getbaselineshift5ssexj0)) {
                    i19++;
                    int i24 = 2 % 2;
                }
                while (i19 > i10 && Encoder.serializer(iRemoteActionCompatParcelizer, getTextGeometricTransform.write(i19 - 1), getbaselineshift5ssexj0)) {
                    i19--;
                }
                this.RemoteActionCompatParcelizer = getTextGeometricTransform.write(i19);
                return;
            }
            int i25 = MediaBrowserCompatMediaItem + 21;
            RatingCompat = i25 % Fields.SpotShadowColor;
            if (i25 % 2 != 0) {
                i = setfontfeaturesettings4.IconCompatParcelizer;
                i2 = i8 - setfontfeaturesettings4.read;
                setfontfeaturesettings2 = setfontfeaturesettings4.MediaMetadataCompat;
                getfontsynthesiszqgjjvo = setfontfeaturesettings4.RemoteActionCompatParcelizer;
                if (getfontsynthesiszqgjjvo == getFontSynthesisZQGJjVo.BYTE) {
                    if (setfontfeaturesettings2 == null) {
                        int i26 = RatingCompat + 69;
                        MediaBrowserCompatMediaItem = i26 % Fields.SpotShadowColor;
                        int i27 = i26 % 2;
                        if (i == 0) {
                            i3 = i2;
                            setfontfeaturesettings3 = setfontfeaturesettings2;
                            z = true;
                        }
                    }
                }
                getfontsynthesiszqgjjvo2 = getfontsynthesiszqgjjvo;
                i4 = i;
                i10 = z ? 1 : i9;
                if (setfontfeaturesettings3 != null) {
                    i6 = RatingCompat + 65;
                    MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo5 = setfontfeaturesettings3.RemoteActionCompatParcelizer;
                        throw null;
                    }
                    if (setfontfeaturesettings3.RemoteActionCompatParcelizer == getfontsynthesiszqgjjvo2 || z) {
                        ((ArrayList) this.read).add(0, new setBackground8_81llA(this, getfontsynthesiszqgjjvo2, setfontfeaturesettings4.serializer, i4, i3));
                        i5 = 0;
                    } else {
                        i5 = i3;
                    }
                } else {
                    ((ArrayList) this.read).add(0, new setBackground8_81llA(this, getfontsynthesiszqgjjvo2, setfontfeaturesettings4.serializer, i4, i3));
                    i5 = 0;
                }
                if (z) {
                    ((ArrayList) this.read).add(0, new setBackground8_81llA(this, getFontSynthesisZQGJjVo.ECI, setfontfeaturesettings4.serializer, setfontfeaturesettings4.IconCompatParcelizer, 0));
                    int i28 = MediaBrowserCompatMediaItem + 63;
                    RatingCompat = i28 % Fields.SpotShadowColor;
                    int i29 = i28 % 2;
                    int i30 = 2 % 2;
                }
                i9 = i10;
                i8 = i5;
                setfontfeaturesettings4 = setfontfeaturesettings3;
            } else {
                i = setfontfeaturesettings4.IconCompatParcelizer;
                i2 = i8 + setfontfeaturesettings4.read;
                setfontfeaturesettings2 = setfontfeaturesettings4.MediaMetadataCompat;
                getfontsynthesiszqgjjvo = setfontfeaturesettings4.RemoteActionCompatParcelizer;
                if (getfontsynthesiszqgjjvo == getFontSynthesisZQGJjVo.BYTE) {
                    if (setfontfeaturesettings2 == null) {
                        int i210 = RatingCompat + 69;
                        MediaBrowserCompatMediaItem = i210 % Fields.SpotShadowColor;
                        int i211 = i210 % 2;
                        if (i == 0) {
                            i3 = i2;
                            setfontfeaturesettings3 = setfontfeaturesettings2;
                            z = true;
                        }
                    }
                }
                getfontsynthesiszqgjjvo2 = getfontsynthesiszqgjjvo;
                i4 = i;
                if (z) {
                }
                if (setfontfeaturesettings3 != null) {
                    i6 = RatingCompat + 65;
                    MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo6 = setfontfeaturesettings3.RemoteActionCompatParcelizer;
                        throw null;
                    }
                    if (setfontfeaturesettings3.RemoteActionCompatParcelizer == getfontsynthesiszqgjjvo2) {
                        ((ArrayList) this.read).add(0, new setBackground8_81llA(this, getfontsynthesiszqgjjvo2, setfontfeaturesettings4.serializer, i4, i3));
                        i5 = 0;
                    } else {
                        ((ArrayList) this.read).add(0, new setBackground8_81llA(this, getfontsynthesiszqgjjvo2, setfontfeaturesettings4.serializer, i4, i3));
                        i5 = 0;
                    }
                } else {
                    ((ArrayList) this.read).add(0, new setBackground8_81llA(this, getfontsynthesiszqgjjvo2, setfontfeaturesettings4.serializer, i4, i3));
                    i5 = 0;
                }
                if (z) {
                    ((ArrayList) this.read).add(0, new setBackground8_81llA(this, getFontSynthesisZQGJjVo.ECI, setfontfeaturesettings4.serializer, setfontfeaturesettings4.IconCompatParcelizer, 0));
                    int i212 = MediaBrowserCompatMediaItem + 63;
                    RatingCompat = i212 % Fields.SpotShadowColor;
                    int i213 = i212 % 2;
                    int i31 = 2 % 2;
                }
                i9 = i10;
                i8 = i5;
                setfontfeaturesettings4 = setfontfeaturesettings3;
            }
            if (setfontfeaturesettings2 != null) {
                int i32 = MediaBrowserCompatMediaItem + 123;
                RatingCompat = i32 % Fields.SpotShadowColor;
                if (i32 % 2 != 0) {
                    int i33 = 14 / 0;
                    if (i != setfontfeaturesettings2.IconCompatParcelizer) {
                        i3 = i2;
                        setfontfeaturesettings3 = setfontfeaturesettings2;
                        z = true;
                    }
                } else if (i != setfontfeaturesettings2.IconCompatParcelizer) {
                    i3 = i2;
                    setfontfeaturesettings3 = setfontfeaturesettings2;
                    z = true;
                }
                getfontsynthesiszqgjjvo2 = getfontsynthesiszqgjjvo;
                i4 = i;
                if (z) {
                }
                if (setfontfeaturesettings3 != null) {
                    i6 = RatingCompat + 65;
                    MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo7 = setfontfeaturesettings3.RemoteActionCompatParcelizer;
                        throw null;
                    }
                    if (setfontfeaturesettings3.RemoteActionCompatParcelizer == getfontsynthesiszqgjjvo2) {
                        ((ArrayList) this.read).add(0, new setBackground8_81llA(this, getfontsynthesiszqgjjvo2, setfontfeaturesettings4.serializer, i4, i3));
                        i5 = 0;
                    } else {
                        ((ArrayList) this.read).add(0, new setBackground8_81llA(this, getfontsynthesiszqgjjvo2, setfontfeaturesettings4.serializer, i4, i3));
                        i5 = 0;
                    }
                } else {
                    ((ArrayList) this.read).add(0, new setBackground8_81llA(this, getfontsynthesiszqgjjvo2, setfontfeaturesettings4.serializer, i4, i3));
                    i5 = 0;
                }
                if (z) {
                    ((ArrayList) this.read).add(0, new setBackground8_81llA(this, getFontSynthesisZQGJjVo.ECI, setfontfeaturesettings4.serializer, setfontfeaturesettings4.IconCompatParcelizer, 0));
                    int i214 = MediaBrowserCompatMediaItem + 63;
                    RatingCompat = i214 % Fields.SpotShadowColor;
                    int i215 = i214 % 2;
                    int i34 = 2 % 2;
                }
                i9 = i10;
                i8 = i5;
                setfontfeaturesettings4 = setfontfeaturesettings3;
            }
            i3 = i2;
            setfontfeaturesettings3 = setfontfeaturesettings2;
            z = false;
            getfontsynthesiszqgjjvo2 = getfontsynthesiszqgjjvo;
            i4 = i;
            if (z) {
            }
            if (setfontfeaturesettings3 != null) {
                i6 = RatingCompat + 65;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo8 = setfontfeaturesettings3.RemoteActionCompatParcelizer;
                    throw null;
                }
                if (setfontfeaturesettings3.RemoteActionCompatParcelizer == getfontsynthesiszqgjjvo2) {
                    ((ArrayList) this.read).add(0, new setBackground8_81llA(this, getfontsynthesiszqgjjvo2, setfontfeaturesettings4.serializer, i4, i3));
                    i5 = 0;
                } else {
                    ((ArrayList) this.read).add(0, new setBackground8_81llA(this, getfontsynthesiszqgjjvo2, setfontfeaturesettings4.serializer, i4, i3));
                    i5 = 0;
                }
            } else {
                ((ArrayList) this.read).add(0, new setBackground8_81llA(this, getfontsynthesiszqgjjvo2, setfontfeaturesettings4.serializer, i4, i3));
                i5 = 0;
            }
            if (z) {
                ((ArrayList) this.read).add(0, new setBackground8_81llA(this, getFontSynthesisZQGJjVo.ECI, setfontfeaturesettings4.serializer, setfontfeaturesettings4.IconCompatParcelizer, 0));
                int i216 = MediaBrowserCompatMediaItem + 63;
                RatingCompat = i216 % Fields.SpotShadowColor;
                int i217 = i216 % 2;
                int i35 = 2 % 2;
            }
            i9 = i10;
            i8 = i5;
            setfontfeaturesettings4 = setfontfeaturesettings3;
        }
    }

    public void IconCompatParcelizer(Object... objArr) {
        int i = 2 % 2;
        this.IconCompatParcelizer = new takeOrElseDxMtmZc(1, objArr);
        int i2 = RatingCompat + 113;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public static Expected createError(String str) {
        int i = 2 % 2;
        Expected expectedCreateError = ExpectedFactory.createError(new Error(str));
        expectedCreateError.getClass();
        int i2 = RatingCompat + 37;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return expectedCreateError;
        }
        throw null;
    }

    public void register(LocalDataProviderImpl localDataProviderImpl, SearchEngine searchEngine) {
        int i = 2 % 2;
        int i2 = RatingCompat + 75;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            localDataProviderImpl.getClass();
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.read;
            String str = localDataProviderImpl.dataProviderName;
            MapKt.addValue$default(linkedHashMap, searchEngine, str);
            MapKt.addValue$default((LinkedHashMap) this.RemoteActionCompatParcelizer, str, searchEngine);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        localDataProviderImpl.getClass();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.read;
        String str2 = localDataProviderImpl.dataProviderName;
        MapKt.addValue$default(linkedHashMap2, searchEngine, str2);
        MapKt.addValue$default((LinkedHashMap) this.RemoteActionCompatParcelizer, str2, searchEngine);
        int i3 = MediaBrowserCompatMediaItem + 91;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public void RemoteActionCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = RatingCompat + 23;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ((headH91voCI) this.read).IconCompatParcelizer("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", (String) this.IconCompatParcelizer, Integer.valueOf(i));
        int i5 = RatingCompat + 79;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public Cursor IconCompatParcelizer() {
        int i = 2 % 2;
        String str = (String) this.RemoteActionCompatParcelizer;
        takeOrElseDxMtmZc takeorelsedxmtmzc = (takeOrElseDxMtmZc) this.IconCompatParcelizer;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.read;
        Object obj = null;
        if (takeorelsedxmtmzc == null) {
            return sQLiteDatabase.rawQuery(str, null);
        }
        int i2 = MediaBrowserCompatMediaItem + 73;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            sQLiteDatabase.rawQueryWithFactory(takeorelsedxmtmzc, str, null, null);
            obj.hashCode();
            throw null;
        }
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(takeorelsedxmtmzc, str, null, null);
        int i3 = MediaBrowserCompatMediaItem + 59;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return cursorRawQueryWithFactory;
    }

    private void b(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ serializer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 write(int i, byte[] bArr) {
        int i2 = 2 % 2;
        try {
            NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 = new NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1(i, ((getForceMeasureWithLookaheadConstraintsui) this.RemoteActionCompatParcelizer).IconCompatParcelizer.RemoteActionCompatParcelizer(Write.parseFrom(bArr)));
            int i3 = MediaBrowserCompatMediaItem + 35;
            RatingCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1;
        } catch (InvalidProtocolBufferException e) {
            getRectManager.write("Overlay failed to parse: %s", e);
            throw null;
        }
    }

    public int RemoteActionCompatParcelizer(onPostAttach onpostattach) {
        Cursor cursorIconCompatParcelizer;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 65;
        RatingCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            cursorIconCompatParcelizer = IconCompatParcelizer();
            i = 1;
        } else {
            cursorIconCompatParcelizer = IconCompatParcelizer();
            i = 0;
        }
        while (cursorIconCompatParcelizer.moveToNext()) {
            try {
                int i4 = MediaBrowserCompatMediaItem + 49;
                RatingCompat = i4 % Fields.SpotShadowColor;
                i = i4 % 2 != 0 ? i + 85 : i + 1;
                onpostattach.IconCompatParcelizer(cursorIconCompatParcelizer);
            } catch (Throwable th) {
                if (cursorIconCompatParcelizer != null) {
                    try {
                        cursorIconCompatParcelizer.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorIconCompatParcelizer.close();
        return i;
    }

    public void RemoteActionCompatParcelizer(invalidateRootLayer invalidaterootlayer, Map map, Cursor cursor) {
        int i = 2 % 2;
        DataStoreProviderc dataStoreProviderc = new DataStoreProviderc(cursor.getInt(1), 3, this, cursor.getBlob(0), map);
        if (cursor.isFirst()) {
            int i2 = MediaBrowserCompatMediaItem + 11;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (cursor.isLast()) {
                int i4 = RatingCompat + 15;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    dataStoreProviderc.run();
                    return;
                } else {
                    dataStoreProviderc.run();
                    int i5 = 41 / 0;
                    return;
                }
            }
        }
        invalidaterootlayer.RemoteActionCompatParcelizer(dataStoreProviderc);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    public void registerDataProviderContext(LocalDataProviderImpl localDataProviderImpl, IndexableDataProvidersRegistryImpl$DataProviderContext indexableDataProvidersRegistryImpl$DataProviderContext) {
        boolean z;
        int i = 2 % 2;
        localDataProviderImpl.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.IconCompatParcelizer;
        String str = localDataProviderImpl.dataProviderName;
        IndexableDataProvidersRegistryImpl$DataProviderContext indexableDataProvidersRegistryImpl$DataProviderContext2 = (IndexableDataProvidersRegistryImpl$DataProviderContext) linkedHashMap.get(str);
        if (indexableDataProvidersRegistryImpl$DataProviderContext2 != null) {
            int i2 = RatingCompat + 31;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (indexableDataProvidersRegistryImpl$DataProviderContext.equals(indexableDataProvidersRegistryImpl$DataProviderContext2)) {
                int i4 = RatingCompat + 5;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            int i6 = RatingCompat + 5;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = true;
        }
        if (!z) {
            int i8 = MediaBrowserCompatMediaItem + 99;
            RatingCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            LogKt.logw$default("Registered data provider contexts are not the same");
        }
        linkedHashMap.put(str, indexableDataProvidersRegistryImpl$DataProviderContext);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    public void serializer() {
        boolean z;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 99;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (((ScheduledFuture) this.RemoteActionCompatParcelizer) != null) {
            int i4 = i3 + 57;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        getRectManager.RemoteActionCompatParcelizer(z, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
        this.RemoteActionCompatParcelizer = null;
        getRectManager.RemoteActionCompatParcelizer(((getTextInputService) this.IconCompatParcelizer).write.remove(this), "Delayed task not found.", new Object[0]);
    }

    @Override // o.WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1
    public void write(getContentChild getcontentchild) {
        String str;
        int i = 2 % 2;
        getOnCopyRequested getoncopyrequested = (getOnCopyRequested) this.IconCompatParcelizer;
        if (getoncopyrequested != null) {
            int i2 = MediaBrowserCompatMediaItem + 15;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Object obj = getcontentchild.IconCompatParcelizer.get("download_result_code_key");
            int iIntValue = 0;
            if (obj instanceof Integer) {
                int i4 = RatingCompat + 45;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 97 / 0;
                    iIntValue = ((Integer) obj).intValue();
                } else {
                    iIntValue = ((Integer) obj).intValue();
                }
            } else {
                int i6 = MediaBrowserCompatMediaItem + 67;
                RatingCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
            Object obj2 = getcontentchild.IconCompatParcelizer.get("download_result_desc_key");
            if (obj2 instanceof String) {
                str = (String) obj2;
                int i8 = MediaBrowserCompatMediaItem + 77;
                RatingCompat = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else {
                str = "";
            }
            getoncopyrequested.onFail(iIntValue, str);
        }
    }

    public String toString() {
        int i = 2 % 2;
        if (this.write != 8) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        setBackground8_81llA setbackground8_81lla = null;
        for (setBackground8_81llA setbackground8_81lla2 : (ArrayList) this.read) {
            if (setbackground8_81lla != null) {
                sb.append(",");
                int i2 = MediaBrowserCompatMediaItem + 5;
                RatingCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
            }
            sb.append(setbackground8_81lla2.toString());
            setbackground8_81lla = setbackground8_81lla2;
        }
        String string = sb.toString();
        int i4 = RatingCompat + 77;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public void onFailure(List list, RouteOptions routeOptions) {
        int i = 2 % 2;
        routeOptions.getClass();
        if (((LinkedHashMap) ((BlockRunner) this.IconCompatParcelizer).RatingCompat).remove((Long) this.read) != null) {
            int i2 = RatingCompat + 75;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            CallsKt$await$2$2 callsKt$await$2$2 = (CallsKt$await$2$2) ((AnalyticsServiceImpl) this.RemoteActionCompatParcelizer).locationProvider;
            int i4 = callsKt$await$2$2.write;
            routeOptions.getClass();
            if (i4 != 1) {
                callsKt$await$2$2.serializer.resumeWith(new l2(list, routeOptions));
                int i5 = RatingCompat + 13;
                MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return;
            }
            CancellableContinuationImpl cancellableContinuationImpl = callsKt$await$2$2.serializer;
            if (cancellableContinuationImpl.RemoteActionCompatParcelizer() instanceof onTouchEnded) {
                cancellableContinuationImpl.resumeWith(new RouteRequestResult$Failure(list));
            }
        }
    }

    @Override // o.WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1
    public void serializer(getContentChild getcontentchild) {
        int i = 2 % 2;
        int i2 = RatingCompat + 31;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("DownLoadFileManager", "download file Success.");
        if (((getOnCopyRequested) this.IconCompatParcelizer) == null) {
            int i4 = RatingCompat + 19;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            WrappedCompositionsetContent1211.read("DownLoadFileManager", "iDownloadResult is empty.please setting");
            return;
        }
        Parcelable parcelableWrite = getcontentchild.write("download_entity");
        HashMap map = getcontentchild.IconCompatParcelizer;
        if (!(parcelableWrite instanceof DownLoadFileBean)) {
            WrappedCompositionsetContent1211.read("DownLoadFileManager", "return data exception");
            int i6 = RatingCompat + 93;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                throw null;
            }
            return;
        }
        DownLoadFileBean downLoadFileBean = (DownLoadFileBean) parcelableWrite;
        if (Collections.unmodifiableMap(map).get("download_file") instanceof File) {
            int i7 = RatingCompat + 79;
            MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                ((getOnCopyRequested) this.IconCompatParcelizer).onSuccess(downLoadFileBean, (File) Collections.unmodifiableMap(map).get("download_file"));
            } else {
                ((getOnCopyRequested) this.IconCompatParcelizer).onSuccess(downLoadFileBean, (File) Collections.unmodifiableMap(map).get("download_file"));
                throw null;
            }
        }
    }

    public void onFailure(NavigationRouterRefreshError navigationRouterRefreshError) {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 53;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Long l = (Long) this.read;
        if (l != null) {
            if (((LinkedHashMap) ((BlockRunner) this.IconCompatParcelizer).write).remove(l) == null) {
                return;
            }
        } else {
            int i5 = i2 + 83;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        ((CallsKt$await$2$2) this.RemoteActionCompatParcelizer).onFailure(navigationRouterRefreshError);
    }

    public void onNewState(String str, String str2) {
        String str3;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 125;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        RouteRefreshStateResult routeRefreshStateResult = (RouteRefreshStateResult) this.IconCompatParcelizer;
        if (routeRefreshStateResult != null) {
            int i5 = i2 + 119;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            str3 = routeRefreshStateResult.state;
        } else {
            str3 = null;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, str}, getCieXyz.write())).booleanValue()) {
            return;
        }
        int i7 = MediaBrowserCompatMediaItem + 9;
        RatingCompat = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        RouteRefreshStateResult routeRefreshStateResult2 = str != null ? new RouteRefreshStateResult(str, str2) : null;
        this.IconCompatParcelizer = routeRefreshStateResult2;
        if (routeRefreshStateResult2 != null) {
            MapboxHistoryRecorderWrapper mapboxHistoryRecorderWrapper = (MapboxHistoryRecorderWrapper) this.read;
            str.getClass();
            mapboxHistoryRecorderWrapper.historyRecorder.pushHistory("android_route_refresh_events", "{\"type\":\"RouteRefreshStateUpdated\",\"state\":\"" + str + "\"}");
            Iterator it = ((CopyOnWriteArraySet) this.RemoteActionCompatParcelizer).iterator();
            if (it.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it);
            }
        }
    }

    public void IconCompatParcelizer(HashMap map, invalidateRootLayer invalidaterootlayer, shareWithSiblings sharewithsiblings, ArrayList arrayList) {
        int i = 2 % 2;
        int i2 = RatingCompat + 37;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (arrayList.isEmpty()) {
            return;
        }
        accessgetModulatecp accessgetmodulatecp = new accessgetModulatecp((headH91voCI) this.read, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList((String) this.IconCompatParcelizer, updateLayerParameters.write(sharewithsiblings)), arrayList, ")");
        while (((Iterator) accessgetmodulatecp.serializer).hasNext()) {
            Cursor cursorIconCompatParcelizer = accessgetmodulatecp.IconCompatParcelizer().IconCompatParcelizer();
            while (cursorIconCompatParcelizer.moveToNext()) {
                try {
                    RemoteActionCompatParcelizer(invalidaterootlayer, map, cursorIconCompatParcelizer);
                } catch (Throwable th) {
                    if (cursorIconCompatParcelizer != null) {
                        int i4 = MediaBrowserCompatMediaItem + 77;
                        RatingCompat = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        try {
                            cursorIconCompatParcelizer.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorIconCompatParcelizer.close();
        }
    }

    public HashMap IconCompatParcelizer(TreeSet treeSet) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 123;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getRectManager.RemoteActionCompatParcelizer(treeSet.comparator() == null, "getOverlays() requires natural order", new Object[0]);
        HashMap map = new HashMap();
        invalidateRootLayer invalidaterootlayer = new invalidateRootLayer();
        shareWithSiblings sharewithsiblings = shareWithSiblings.serializer;
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            visitNodes visitnodes = (visitNodes) it.next();
            shareWithSiblings sharewithsiblings2 = visitnodes.RemoteActionCompatParcelizer;
            shareWithSiblings sharewithsiblings3 = visitnodes.RemoteActionCompatParcelizer;
            if (!sharewithsiblings.equals((shareWithSiblings) sharewithsiblings2.RemoteActionCompatParcelizer())) {
                IconCompatParcelizer(map, invalidaterootlayer, sharewithsiblings, arrayList);
                sharewithsiblings = (shareWithSiblings) sharewithsiblings3.RemoteActionCompatParcelizer();
                arrayList.clear();
            }
            arrayList.add(sharewithsiblings3.serializer());
        }
        IconCompatParcelizer(map, invalidaterootlayer, sharewithsiblings, arrayList);
        invalidaterootlayer.write();
        int i4 = RatingCompat + 57;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return map;
    }

    public void cancel() {
        int i = 2 % 2;
        if (this.write != 5) {
            SequenceBuilderIterator sequenceBuilderIterator = LazyKt__LazyJVMKt.read((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((verifyOrientationStatuslambda2) ((JobControl) ((isAdapterPositionOnScreen) this.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).job.H_()).write);
            int i2 = MediaBrowserCompatMediaItem + 1;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            while (sequenceBuilderIterator.hasNext()) {
                ((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) sequenceBuilderIterator.next()).write(null);
            }
            JobKt.IconCompatParcelizer((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) ((JobControl) ((isAdapterPositionOnScreen) ((Parser.Pair) ((m) this.IconCompatParcelizer).read).write).MediaSessionCompatResultReceiverWrapper()).job);
            return;
        }
        ((getTextInputService) this.IconCompatParcelizer).IconCompatParcelizer();
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.RemoteActionCompatParcelizer;
        if (scheduledFuture != null) {
            int i4 = RatingCompat + 51;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            scheduledFuture.cancel(false);
            serializer();
        }
    }

    public HashMap serializer(shareWithSiblings sharewithsiblings, int i) {
        int i2 = 2 % 2;
        HashMap map = new HashMap();
        invalidateRootLayer invalidaterootlayer = new invalidateRootLayer();
        x xVar = ((headH91voCI) this.read).read("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?");
        xVar.IconCompatParcelizer((String) this.IconCompatParcelizer, updateLayerParameters.write(sharewithsiblings), Integer.valueOf(i));
        Cursor cursorIconCompatParcelizer = xVar.IconCompatParcelizer();
        while (!(!cursorIconCompatParcelizer.moveToNext())) {
            try {
                int i3 = RatingCompat + 23;
                MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                RemoteActionCompatParcelizer(invalidaterootlayer, map, cursorIconCompatParcelizer);
            } catch (Throwable th) {
                if (cursorIconCompatParcelizer != null) {
                    int i5 = RatingCompat + 19;
                    MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
                    try {
                        if (i5 % 2 == 0) {
                            cursorIconCompatParcelizer.close();
                            int i6 = 96 / 0;
                        } else {
                            cursorIconCompatParcelizer.close();
                        }
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorIconCompatParcelizer.close();
        invalidaterootlayer.write();
        return map;
    }

    public int RemoteActionCompatParcelizer(getTextGeometricTransform gettextgeometrictransform) {
        int i = 2 % 2;
        int i2 = RatingCompat + 47;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        Iterator it = (i2 % 2 == 0 ? (ArrayList) this.read : (ArrayList) this.read).iterator();
        int i3 = 0;
        while (!(!it.hasNext())) {
            int i4 = MediaBrowserCompatMediaItem + 105;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            setBackground8_81llA setbackground8_81lla = (setBackground8_81llA) it.next();
            int i6 = setbackground8_81lla.RemoteActionCompatParcelizer;
            getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo = setbackground8_81lla.write;
            int characterCountBits = getfontsynthesiszqgjjvo.getCharacterCountBits(gettextgeometrictransform);
            int iM = characterCountBits + 4;
            int i7 = setBaselineShift_isdbwI.serializer[getfontsynthesiszqgjjvo.ordinal()];
            if (i7 != 1) {
                int i8 = MediaBrowserCompatMediaItem;
                int i9 = i8 + 121;
                RatingCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (i7 != 2) {
                    int i11 = i8 + 51;
                    RatingCompat = i11 % Fields.SpotShadowColor;
                    int i12 = 4;
                    if (i11 % 2 == 0 ? i7 == 3 : i7 == 2) {
                        int iM2 = ff$$ExternalSyntheticOutline0.m(i6, 3, 10, iM);
                        int i13 = i6 % 3;
                        if (i13 == 1) {
                            int i14 = RatingCompat + 51;
                            MediaBrowserCompatMediaItem = i14 % Fields.SpotShadowColor;
                            if (i14 % 2 == 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                        } else if (i13 == 2) {
                            int i15 = RatingCompat + 111;
                            MediaBrowserCompatMediaItem = i15 % Fields.SpotShadowColor;
                            int i16 = i15 % 2;
                            i12 = 7;
                        } else {
                            i12 = 0;
                        }
                        iM = iM2 + i12;
                    } else if (i7 == 4) {
                        iM += setbackground8_81lla.serializer() * 8;
                    } else if (i7 != 5) {
                        int i17 = i8 + 17;
                        RatingCompat = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                    } else {
                        iM = characterCountBits + 12;
                    }
                } else {
                    iM = ff$$ExternalSyntheticOutline0.m(i6, 2, 11, iM) + (i6 % 2 == 1 ? 6 : 0);
                    int i19 = RatingCompat + 75;
                    MediaBrowserCompatMediaItem = i19 % Fields.SpotShadowColor;
                    if (i19 % 2 == 0) {
                        int i20 = 2 % 5;
                    }
                }
            } else {
                iM += i6 * 13;
            }
            i3 += iM;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    /* JADX WARN: Code duplicated, block: B:16:0x006d  */
    public void clean(SpeechAnnouncement speechAnnouncement) {
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        Expected expectedCreateError;
        int i = 2 % 2;
        speechAnnouncement.getClass();
        m mVar = (m) this.IconCompatParcelizer;
        mVar.getClass();
        File file = speechAnnouncement.file;
        int i2 = 10;
        if (file != null) {
            BuildersKt.RemoteActionCompatParcelizer(((JobControl) ((isAdapterPositionOnScreen) ((Parser.Pair) mVar.read).write).MediaSessionCompatResultReceiverWrapper()).scope, null, null, new DiskLruCache$launchCleanup$1(file, null, i2), 3);
            int i3 = MediaBrowserCompatMediaItem + 95;
            RatingCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 4 % 4;
            }
        }
        String str = speechAnnouncement.announcement;
        String str2 = speechAnnouncement.ssmlAnnouncement;
        if (str2 != null) {
            int i5 = MediaBrowserCompatMediaItem + 75;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("ssml", str2);
            } else if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                expectedCreateError = ExpectedFactory.createError(new Error("VoiceInstructions ssmlAnnouncement / announcement can't be null or blank"));
                expectedCreateError.getClass();
            } else {
                onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("text", str);
            }
            expectedCreateError = ExpectedFactory.createValue(new TypeAndAnnouncement((String) onviewattachedtowindowlambda0.serializer, (String) onviewattachedtowindowlambda0.write));
            expectedCreateError.getClass();
        } else if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            expectedCreateError = ExpectedFactory.createError(new Error("VoiceInstructions ssmlAnnouncement / announcement can't be null or blank"));
            expectedCreateError.getClass();
        } else {
            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("text", str);
            expectedCreateError = ExpectedFactory.createValue(new TypeAndAnnouncement((String) onviewattachedtowindowlambda0.serializer, (String) onviewattachedtowindowlambda0.write));
            expectedCreateError.getClass();
        }
        expectedCreateError.onValue(new ArrivalProgressObserver$$ExternalSyntheticLambda0(this, i2, speechAnnouncement));
    }

    public void IconCompatParcelizer(getOnCopyRequested getoncopyrequested) {
        int i = 2 % 2;
        this.IconCompatParcelizer = getoncopyrequested;
        zzm zzmVar = new zzm();
        zzmVar.write = 120000;
        zzmVar.RemoteActionCompatParcelizer = false;
        zzmVar.RatingCompat = UUID.randomUUID().toString();
        zzmVar.write = 300000;
        HashMap map = new HashMap();
        map.put("download_file_param", (DownloadFileParam) this.read);
        getContentChild getcontentchild = new getContentChild();
        getcontentchild.IconCompatParcelizer = new HashMap(map);
        zzmVar.IconCompatParcelizer = getcontentchild;
        zzmVar.serializer = this;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new addOrRemoveMenuItem());
        getOnActionModeDestroy getonactionmodedestroy = new getOnActionModeDestroy();
        getonactionmodedestroy.write = (getOnPasteRequested) this.RemoteActionCompatParcelizer;
        arrayList.add(getonactionmodedestroy);
        try {
            E5 e5 = new E5();
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            e5.IconCompatParcelizer = listUnmodifiableList;
            e5.write = zzmVar;
            WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1 windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1 = (WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1) zzmVar.serializer;
            zzmVar.serializer = e5;
            e5.serializer = new CountDownLatch(1);
            if (listUnmodifiableList.isEmpty()) {
                int i2 = RatingCompat + 31;
                MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            e5.MediaMetadataCompat();
            boolean z = e5.read;
            getContentChild getcontentchild2 = (getContentChild) e5.RemoteActionCompatParcelizer;
            if (z) {
                windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1.serializer(getcontentchild2);
                return;
            }
            windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1.write(getcontentchild2);
            int i4 = RatingCompat + 123;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } catch (TaskTimeOutException unused) {
            WrappedCompositionsetContent1211.read("DownLoadFileManager", "download file timeout");
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x00a1  */
    public AnimatorSet transitionFromLowZoomToHighZoom(CameraOptions cameraOptions, NavigationCameraTransitionOptions navigationCameraTransitionOptions) {
        long jLog;
        int i = 2 % 2;
        int i2 = RatingCompat + 21;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        cameraOptions.getClass();
        CameraAnimationsPlugin cameraAnimationsPlugin = (CameraAnimationsPlugin) this.RemoteActionCompatParcelizer;
        cameraAnimationsPlugin.getClass();
        CameraAnimatorsFactory cameraAnimationsFactory = ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).getCameraAnimationsFactory();
        MapboxMap mapboxMap = (MapboxMap) this.read;
        CameraState cameraState = mapboxMap.getCameraState();
        Point center = cameraState.getCenter();
        center.getClass();
        double zoom = cameraState.getZoom();
        Point center2 = cameraOptions.getCenter();
        Double zoom2 = cameraOptions.getZoom();
        CameraAnimator[] flyTo = cameraAnimationsFactory.getFlyTo(cameraOptions, "NAVIGATION_CAMERA_OWNER");
        if (center2 != null) {
            int i4 = MediaBrowserCompatMediaItem + 7;
            int i5 = i4 % Fields.SpotShadowColor;
            RatingCompat = i5;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (zoom2 != null) {
                int i6 = i5 + 25;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                double dDoubleValue = zoom2.doubleValue();
                jLog = (long) ((Math.log((((Math.abs(zoom - dDoubleValue) * 80.0d) + Math.hypot(mapboxMap.project(center, dDoubleValue).getX() - mapboxMap.project(center2, dDoubleValue).getX(), mapboxMap.project(center2, dDoubleValue).getY() - mapboxMap.project(center2, dDoubleValue).getY())) / 1000.0d) + 0.24d) + 2.1d) * 1000.0d);
            } else {
                jLog = 0;
            }
        } else {
            jLog = 0;
        }
        long jMin = Math.min(jLog, navigationCameraTransitionOptions.maxDuration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether((Animator[]) Arrays.copyOf(flyTo, flyTo.length));
        AnimatorSet duration = animatorSet.setDuration(jMin);
        duration.getClass();
        return duration;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public Object load(VoiceInstructions voiceInstructions, ContinuationImpl continuationImpl) {
        MapboxSpeechProvider$load$1 mapboxSpeechProvider$load$1;
        Expected expectedCreateError;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        x xVar;
        int i = 2 % 2;
        if (continuationImpl instanceof MapboxSpeechProvider$load$1) {
            mapboxSpeechProvider$load$1 = (MapboxSpeechProvider$load$1) continuationImpl;
            int i2 = mapboxSpeechProvider$load$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapboxSpeechProvider$load$1.label = i2 - Integer.MIN_VALUE;
            } else {
                mapboxSpeechProvider$load$1 = new MapboxSpeechProvider$load$1(this, continuationImpl);
            }
        } else {
            mapboxSpeechProvider$load$1 = new MapboxSpeechProvider$load$1(this, continuationImpl);
        }
        Object objLoad = mapboxSpeechProvider$load$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = mapboxSpeechProvider$load$1.label;
        try {
            if (i3 != 0) {
                int i4 = RatingCompat + 97;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xVar = mapboxSpeechProvider$load$1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(objLoad);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(objLoad);
                voiceInstructions.getClass();
                String strAnnouncement = voiceInstructions.announcement();
                String strSsmlAnnouncement = voiceInstructions.ssmlAnnouncement();
                if (strSsmlAnnouncement != null) {
                    if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strSsmlAnnouncement)) {
                        int i6 = MediaBrowserCompatMediaItem + 35;
                        RatingCompat = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        if (strAnnouncement != null) {
                        }
                        expectedCreateError = ExpectedFactory.createError(new Error("VoiceInstructions ssmlAnnouncement / announcement can't be null or blank"));
                        expectedCreateError.getClass();
                        int i8 = RatingCompat + 91;
                        MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                    } else {
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("ssml", strSsmlAnnouncement);
                    }
                    expectedCreateError = ExpectedFactory.createValue(new TypeAndAnnouncement((String) onviewattachedtowindowlambda0.serializer, (String) onviewattachedtowindowlambda0.write));
                    expectedCreateError.getClass();
                } else if (strAnnouncement != null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strAnnouncement)) {
                    expectedCreateError = ExpectedFactory.createError(new Error("VoiceInstructions ssmlAnnouncement / announcement can't be null or blank"));
                    expectedCreateError.getClass();
                    int i10 = RatingCompat + 91;
                    MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                } else {
                    onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("text", strAnnouncement);
                    expectedCreateError = ExpectedFactory.createValue(new TypeAndAnnouncement((String) onviewattachedtowindowlambda0.serializer, (String) onviewattachedtowindowlambda0.write));
                    expectedCreateError.getClass();
                }
                Object valueOrElse = expectedCreateError.getValueOrElse(new Snapshotter$$ExternalSyntheticLambda0(27));
                valueOrElse.getClass();
                x xVarCreateRequest = createRequest((TypeAndAnnouncement) valueOrElse);
                DefaultResourceLoader defaultResourceLoader = (DefaultResourceLoader) this.IconCompatParcelizer;
                mapboxSpeechProvider$load$1.L$0 = this;
                mapboxSpeechProvider$load$1.label = 1;
                objLoad = ResourceLoaderExtensionsKt.load(defaultResourceLoader, xVarCreateRequest, mapboxSpeechProvider$load$1);
                if (objLoad == coroutineSingletons) {
                    int i12 = RatingCompat + 63;
                    MediaBrowserCompatMediaItem = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    return coroutineSingletons;
                }
                xVar = this;
            }
            xVar.getClass();
            Object objFold = ((Expected) objLoad).fold(new Snapshotter$$ExternalSyntheticLambda0(28, xVar), new Snapshotter$$ExternalSyntheticLambda0(29, xVar));
            objFold.getClass();
            return (Expected) objFold;
        } catch (Throwable th) {
            Object isitemdismissable = new isItemDismissable(th);
            Throwable thSerializer = onItemDismiss.serializer(isitemdismissable);
            if (thSerializer == null) {
                int i14 = MediaBrowserCompatMediaItem + 87;
                RatingCompat = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
            } else {
                isitemdismissable = ExpectedFactory.createError(thSerializer);
            }
            isitemdismissable.getClass();
            return isitemdismissable;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$retrieveVoiceFile(x xVar, VoiceInstructions voiceInstructions, ContinuationImpl continuationImpl) {
        MapboxSpeechApi$retrieveVoiceFile$1 mapboxSpeechApi$retrieveVoiceFile$1;
        Expected expectedCreateError;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        int i = 2 % 2;
        if (continuationImpl instanceof MapboxSpeechApi$retrieveVoiceFile$1) {
            mapboxSpeechApi$retrieveVoiceFile$1 = (MapboxSpeechApi$retrieveVoiceFile$1) continuationImpl;
            int i2 = mapboxSpeechApi$retrieveVoiceFile$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapboxSpeechApi$retrieveVoiceFile$1.label = i2 - Integer.MIN_VALUE;
            } else {
                mapboxSpeechApi$retrieveVoiceFile$1 = new MapboxSpeechApi$retrieveVoiceFile$1(xVar, continuationImpl);
            }
        } else {
            mapboxSpeechApi$retrieveVoiceFile$1 = new MapboxSpeechApi$retrieveVoiceFile$1(xVar, continuationImpl);
        }
        Object objRetrieveVoiceFile = mapboxSpeechApi$retrieveVoiceFile$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = mapboxSpeechApi$retrieveVoiceFile$1.label;
        Object obj = null;
        if (i3 != 0) {
            int i4 = RatingCompat + 27;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0 ? i3 != 1 : i3 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            voiceInstructions = mapboxSpeechApi$retrieveVoiceFile$1.L$1;
            xVar = mapboxSpeechApi$retrieveVoiceFile$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(objRetrieveVoiceFile);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objRetrieveVoiceFile);
            m mVar = (m) xVar.IconCompatParcelizer;
            mapboxSpeechApi$retrieveVoiceFile$1.L$0 = xVar;
            mapboxSpeechApi$retrieveVoiceFile$1.L$1 = voiceInstructions;
            mapboxSpeechApi$retrieveVoiceFile$1.label = 1;
            objRetrieveVoiceFile = mVar.retrieveVoiceFile(voiceInstructions, mapboxSpeechApi$retrieveVoiceFile$1);
            if (objRetrieveVoiceFile == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        collapsePeerui collapsepeerui = (collapsePeerui) objRetrieveVoiceFile;
        if (collapsepeerui instanceof VoiceState$VoiceFile) {
            String strAnnouncement = voiceInstructions.announcement();
            String strSsmlAnnouncement = voiceInstructions.ssmlAnnouncement();
            strAnnouncement.getClass();
            Expected expectedCreateValue = ExpectedFactory.createValue(new SpeechValue(new SpeechAnnouncement(((VoiceState$VoiceFile) collapsepeerui).instructionFile, strAnnouncement, strSsmlAnnouncement)));
            expectedCreateValue.getClass();
            int i5 = RatingCompat + 71;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return expectedCreateValue;
        }
        if (!(collapsepeerui instanceof VoiceState$VoiceError)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        int i7 = RatingCompat + 85;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        xVar.getClass();
        voiceInstructions.getClass();
        String strAnnouncement2 = voiceInstructions.announcement();
        String strSsmlAnnouncement2 = voiceInstructions.ssmlAnnouncement();
        if (strSsmlAnnouncement2 != null) {
            int i9 = MediaBrowserCompatMediaItem + 99;
            RatingCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strSsmlAnnouncement2);
                obj.hashCode();
                throw null;
            }
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strSsmlAnnouncement2)) {
                onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("ssml", strSsmlAnnouncement2);
                int i10 = RatingCompat + 31;
                MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            } else if (strAnnouncement2 != null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strAnnouncement2)) {
                expectedCreateError = ExpectedFactory.createError(new Error("VoiceInstructions ssmlAnnouncement / announcement can't be null or blank"));
                expectedCreateError.getClass();
                int i12 = RatingCompat + 51;
                MediaBrowserCompatMediaItem = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            } else {
                onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("text", strAnnouncement2);
            }
            expectedCreateError = ExpectedFactory.createValue(new TypeAndAnnouncement((String) onviewattachedtowindowlambda0.serializer, (String) onviewattachedtowindowlambda0.write));
            expectedCreateError.getClass();
        } else {
            if (strAnnouncement2 != null) {
            }
            expectedCreateError = ExpectedFactory.createError(new Error("VoiceInstructions ssmlAnnouncement / announcement can't be null or blank"));
            expectedCreateError.getClass();
            int i14 = RatingCompat + 51;
            MediaBrowserCompatMediaItem = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        }
        Throwable th = (Throwable) expectedCreateError.getError();
        if (th != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(th.getMessage());
            return null;
        }
        String strAnnouncement3 = voiceInstructions.announcement();
        String strSsmlAnnouncement3 = voiceInstructions.ssmlAnnouncement();
        strAnnouncement3.getClass();
        Expected expectedCreateError2 = ExpectedFactory.createError(new SpeechError(((VoiceState$VoiceError) collapsepeerui).exception, new SpeechAnnouncement(null, strAnnouncement3, strSsmlAnnouncement3)));
        expectedCreateError2.getClass();
        return expectedCreateError2;
    }

    public /* synthetic */ x(int i, boolean z) {
        this.write = i;
    }

    public /* synthetic */ x(BlockRunner blockRunner, Long l, Object obj, int i) {
        this.write = i;
        this.IconCompatParcelizer = blockRunner;
        this.read = l;
        this.RemoteActionCompatParcelizer = obj;
    }

    public /* synthetic */ x(Object obj, int i, Object obj2) {
        this.write = i;
        this.read = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    public x(MapboxHistoryRecorderWrapper mapboxHistoryRecorderWrapper) {
        this.write = 21;
        this.read = mapboxHistoryRecorderWrapper;
        this.RemoteActionCompatParcelizer = new CopyOnWriteArraySet();
    }

    public x(m mVar, CameraAnimationsPlugin cameraAnimationsPlugin, MapboxMap mapboxMap) {
        this.write = 23;
        this.read = mVar;
        this.RemoteActionCompatParcelizer = cameraAnimationsPlugin;
        this.IconCompatParcelizer = mapboxMap;
    }

    public x(AudioManager audioManager, VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes voiceInstructionsPlayerAttributes$OreoAndLaterAttributes) {
        this.write = 28;
        this.read = audioManager;
        this.RemoteActionCompatParcelizer = voiceInstructionsPlayerAttributes$OreoAndLaterAttributes;
        this.IconCompatParcelizer = AudioFocusOwner.MediaPlayer;
    }

    public void a(NetworkResponse networkResponse, g0 g0Var) throws UcsException {
        int i = 2 % 2;
        Context context = (Context) this.RemoteActionCompatParcelizer;
        if (!networkResponse.isSuccessful()) {
            if (networkResponse.getCode() != 304) {
                getSteps.read("KeyComponentManger", "file data update failed And statusCode = {0}", Integer.valueOf(networkResponse.getCode()));
                return;
            }
            getSteps.read("KeyComponentManger", "file data has not modified!", new Object[0]);
            SpUtil.getInstance(context).edit().putLong("Last-Query-Time_ucscomponent_ucscomponent.jws", System.currentTimeMillis()).apply();
            w.a(context);
            return;
        }
        int i2 = MediaBrowserCompatMediaItem + 97;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        w.a(context, networkResponse.getBody());
        Map<String, List<String>> headers = networkResponse.getHeaders();
        getSteps.IconCompatParcelizer("LocalCDNFile", "Update local meta data : ucscomponent", new Object[0]);
        if (headers.containsKey(HttpHeaders.ETAG)) {
            int i4 = RatingCompat + 47;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            getSteps.IconCompatParcelizer("LocalCDNFile", "Update local meta data -etag: ucscomponent", new Object[0]);
            SpUtil.putString(context, "ETag_ucscomponent", headers.get(HttpHeaders.ETAG).get(0));
        }
        if (headers.containsKey(HttpHeaders.LAST_MODIFIED)) {
            getSteps.IconCompatParcelizer("LocalCDNFile", "Update local meta data -last-modified: ucscomponent", new Object[0]);
            SpUtil.putString(context, "Last-Modified_ucscomponent", headers.get(HttpHeaders.LAST_MODIFIED).get(0));
        }
        SpUtil.getInstance(context).edit().putLong("Last-Query-Time_ucscomponent_ucscomponent.jws", System.currentTimeMillis()).apply();
        String str = context.createDeviceProtectedStorageContext().getFilesDir() + "/ucscomponent.jws";
        SpUtil.putString(context, "ucscomponent.jws", str);
        String body = networkResponse.getBody();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            try {
                fileOutputStream.write(body.getBytes(StandardCharsets.UTF_8));
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("Write file data failed : ");
            sbIconCompatParcelizer.append(e.getMessage());
            getSteps.serializer("KeyComponentLocalHandler", sbIconCompatParcelizer.toString(), new Object[0]);
            StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("Write file data failed : ");
            sbIconCompatParcelizer2.append(e.getMessage());
            throw new UcsException(1011L, sbIconCompatParcelizer2.toString());
        }
    }

    public x(String str) {
        this.write = 25;
        this.read = str;
        this.RemoteActionCompatParcelizer = ResourceLoadFlags.NONE;
        this.IconCompatParcelizer = NetworkRestriction.NONE;
    }

    public void write(boolean z, g0 g0Var) {
        synchronized (this) {
            getSteps.read("KeyComponentManger", "start download C1 file from Service", new Object[0]);
            try {
                HashMap map = new HashMap();
                if (!z) {
                    map = g0.a((Context) this.RemoteActionCompatParcelizer);
                }
                String strWrite = ((getImageo7Vup1c) this.IconCompatParcelizer).write();
                getSteps.read("KeyComponentManger", "updateFileFromCDN domain is {0}", strWrite);
                a(((NetworkCapability) this.read).get(new NetworkRequest(strWrite, map)), g0Var);
                getSteps.read("KeyComponentManger", "updateFileFromCDN OK", new Object[0]);
            } catch (IOException e) {
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("Update file data get IOException，exception: ");
                sbIconCompatParcelizer.append(e.getMessage());
                String string = sbIconCompatParcelizer.toString();
                throw accessgetDropdownListcp.IconCompatParcelizer("KeyComponentManger", string, new Object[0], 1010L, string);
            }
        }
    }

    public x(TransitionValuesMaps transitionValuesMaps, int i) {
        this.write = i;
        if (i != 18) {
            IncreaseTrafficUpdateActionHandler increaseTrafficUpdateActionHandler = new IncreaseTrafficUpdateActionHandler(transitionValuesMaps);
            x xVar = new x(transitionValuesMaps, 18);
            n0 n0Var = new n0(0);
            this.read = increaseTrafficUpdateActionHandler;
            this.RemoteActionCompatParcelizer = xVar;
            this.IconCompatParcelizer = n0Var;
            return;
        }
        PredictedTimeAheadDistanceCalculator predictedTimeAheadDistanceCalculator = new PredictedTimeAheadDistanceCalculator();
        this.read = transitionValuesMaps;
        this.RemoteActionCompatParcelizer = predictedTimeAheadDistanceCalculator;
        this.IconCompatParcelizer = new MapboxNavigation.AnonymousClass11(2, this);
    }

    public x(MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl) {
        this.write = 22;
        this.read = mapboxNativeNavigatorImpl;
        this.RemoteActionCompatParcelizer = new CopyOnWriteArraySet();
        mapboxNativeNavigatorImpl.addNativeNavigatorRecreationObserver(new MapboxTripSession$$ExternalSyntheticLambda2(3, this));
        this.IconCompatParcelizer = new AnalyticsServiceImpl(12, this);
    }

    public x(String str, m mVar, MapboxSpeechApiOptions mapboxSpeechApiOptions, DefaultResourceLoader defaultResourceLoader) {
        this.write = 27;
        defaultResourceLoader.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = mVar;
        this.IconCompatParcelizer = defaultResourceLoader;
    }

    public x(MapboxMap mapboxMap, CameraAnimationsPlugin cameraAnimationsPlugin) {
        this.write = 24;
        DefaultSimplifiedUpdateFrameTransitionProvider defaultSimplifiedUpdateFrameTransitionProvider = new DefaultSimplifiedUpdateFrameTransitionProvider(cameraAnimationsPlugin);
        this.read = mapboxMap;
        this.RemoteActionCompatParcelizer = cameraAnimationsPlugin;
        this.IconCompatParcelizer = defaultSimplifiedUpdateFrameTransitionProvider;
    }

    public x(headH91voCI headh91voci, getForceMeasureWithLookaheadConstraintsui getforcemeasurewithlookaheadconstraintsui, setOffset setoffset) {
        this.write = 3;
        this.read = headh91voci;
        this.RemoteActionCompatParcelizer = getforcemeasurewithlookaheadconstraintsui;
        String str = setoffset.IconCompatParcelizer;
        if (str != null) {
            int i = MediaBrowserCompatMediaItem + 39;
            RatingCompat = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } else {
            int i3 = RatingCompat + 11;
            MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            str = "";
        }
        this.IconCompatParcelizer = str;
        int i5 = MediaBrowserCompatMediaItem + 85;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public x(FirebaseMessagingService firebaseMessagingService, getClipEntry getclipentry, ExecutorService executorService) {
        this.write = 7;
        this.read = executorService;
        this.RemoteActionCompatParcelizer = firebaseMessagingService;
        this.IconCompatParcelizer = getclipentry;
    }

    public x(DirectionsParsedRouteData directionsParsedRouteData, CongestionNumericOverride congestionNumericOverride) {
        this.write = 15;
        this.read = directionsParsedRouteData;
        this.RemoteActionCompatParcelizer = congestionNumericOverride;
        StringBuilder sb = new StringBuilder();
        DirectionsRoute directionsRoute = directionsParsedRouteData.route;
        sb.append(directionsRoute.requestUuid());
        sb.append('#');
        sb.append(directionsRoute.routeIndex());
        this.IconCompatParcelizer = sb.toString();
    }

    public x(DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5) {
        this.write = 1;
        this.read = dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
        this.IconCompatParcelizer = new getTextInputService();
    }

    public x(Context context, String str) {
        this.write = 26;
        MapboxSpeechApiOptions mapboxSpeechApiOptions = new MapboxSpeechApiOptions();
        this.read = new LinkedHashMap();
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(MapboxSpeechApi$mainJobController$2.INSTANCE);
        new isAdapterPositionOnScreen(MapboxSpeechApi$mainJobController$2.INSTANCE$1);
        this.IconCompatParcelizer = new m(new x(str, new m(8), mapboxSpeechApiOptions, (DefaultResourceLoader) ResourceLoaderFactory.sharedLoader$delegate.MediaSessionCompatResultReceiverWrapper()), 13, new Parser.Pair(new File(context.getApplicationContext().getCacheDir(), "mapbox_instructions_cache")));
    }

    public x(Context context, getTextInputService gettextinputservice, m mVar, setOffset setoffset, setAfter setafter, getShouldAttachOnInsert getshouldattachoninsert, createLayerdefault createlayerdefault) {
        this.write = 2;
        this.RemoteActionCompatParcelizer = context;
        this.read = gettextinputservice;
        this.IconCompatParcelizer = mVar;
    }

    public x(getUseMinimumTouchTarget getuseminimumtouchtarget, RequestBuilder requestBuilder) {
        this.write = 6;
        this.IconCompatParcelizer = getuseminimumtouchtarget;
    }

    public x(getTextInputService gettextinputservice, Runnable runnable) {
        this.write = 5;
        this.IconCompatParcelizer = gettextinputservice;
        this.read = runnable;
    }

    public x(int i) {
        this.write = i;
        if (i == 11) {
            this.IconCompatParcelizer = getScrollCaptureInProgress.UNKNOWN;
            return;
        }
        if (i == 12) {
            this.IconCompatParcelizer = visitScrollCaptureCandidatesdefault.UNKNOWN;
            return;
        }
        if (i == 16) {
            MemoryMonitorInterface orCreate = MemoryMonitorFactory.getOrCreate();
            orCreate.getClass();
            this.read = orCreate;
            this.RemoteActionCompatParcelizer = new CopyOnWriteArrayList();
            this.IconCompatParcelizer = new MapboxNavigation$$ExternalSyntheticLambda4(7, this);
            return;
        }
        if (i != 29) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.RemoteActionCompatParcelizer = linkedHashMap;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            this.IconCompatParcelizer = linkedHashMap2;
            this.read = setCollectionInfo.class;
            linkedHashMap.clear();
            linkedHashMap2.clear();
            return;
        }
        this.read = new LinkedHashMap();
        this.RemoteActionCompatParcelizer = new LinkedHashMap();
        this.IconCompatParcelizer = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e4 A[LOOP:2: B:53:0x00de->B:55:0x00e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b3 A[PHI: r1
  0x01b3: PHI (r1v15 java.lang.String) = (r1v14 java.lang.String), (r1v24 java.lang.String) binds: [B:65:0x019f, B:69:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    public x createRequest(TypeAndAnnouncement typeAndAnnouncement) throws MalformedURLException {
        String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        String sessionSKUTokenIfValid;
        int i = 2 % 2;
        String str = typeAndAnnouncement.announcement;
        String str2 = typeAndAnnouncement.type;
        String str3 = (String) onContentCardDismissed.MediaBrowserCompatMediaItem(hideCurrentlyDisplayingInAppMessage.serializer("https://api.mapbox.com", new String[]{"//"}, 6));
        if (str3 == null) {
            throw new MalformedURLException("Invalid base url");
        }
        str.getClass();
        int length = str.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount < length) {
                int i2 = RatingCompat + 121;
                MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int iCodePointAt = str.codePointAt(iCharCount);
                int i4 = 32;
                if (iCodePointAt >= 32 && iCodePointAt != 127 && iCodePointAt < 128 && !hideCurrentlyDisplayingInAppMessage.read(" \"<>^`{}|/\\?#", (char) iCodePointAt)) {
                    int i5 = RatingCompat + 47;
                    MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        if (iCodePointAt != 97) {
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    } else if (iCodePointAt != 37) {
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
                registryMissingComponentException.IconCompatParcelizer(0, iCharCount, str);
                RegistryMissingComponentException registryMissingComponentException2 = null;
                while (iCharCount < length) {
                    int i6 = RatingCompat + 93;
                    MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (iCodePointAt2 == i4) {
                        int i8 = MediaBrowserCompatMediaItem;
                        int i9 = i8 + 43;
                        RatingCompat = i9 % Fields.SpotShadowColor;
                        if (i9 % 2 != 0) {
                            int i10 = 55 / 0;
                            if (" \"<>^`{}|/\\?#" == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                                int i11 = i8 + 111;
                                RatingCompat = i11 % Fields.SpotShadowColor;
                                int i12 = i11 % 2;
                                registryMissingComponentException.IconCompatParcelizer("+");
                            } else {
                                if (iCodePointAt2 < i4 && iCodePointAt2 != 127) {
                                    if (iCodePointAt2 < 128 && !hideCurrentlyDisplayingInAppMessage.read(" \"<>^`{}|/\\?#", (char) iCodePointAt2)) {
                                        int i13 = MediaBrowserCompatMediaItem + 85;
                                        RatingCompat = i13 % Fields.SpotShadowColor;
                                        if (i13 % 2 == 0 ? iCodePointAt2 != 37 : iCodePointAt2 != 118) {
                                            registryMissingComponentException.RatingCompat(iCodePointAt2);
                                        }
                                    }
                                }
                                if (registryMissingComponentException2 == null) {
                                    registryMissingComponentException2 = new RegistryMissingComponentException();
                                }
                                registryMissingComponentException2.RatingCompat(iCodePointAt2);
                                while (!registryMissingComponentException2.RatingCompat()) {
                                    int i14 = RatingCompat + 41;
                                    MediaBrowserCompatMediaItem = i14 % Fields.SpotShadowColor;
                                    int i15 = i14 % 2;
                                    byte bMediaBrowserCompatMediaItem = registryMissingComponentException2.MediaBrowserCompatMediaItem();
                                    registryMissingComponentException.read(37);
                                    char[] cArr = UrlUtils.HEX_DIGITS;
                                    registryMissingComponentException.read((int) cArr[((bMediaBrowserCompatMediaItem & 255) >> 4) & 15]);
                                    registryMissingComponentException.read((int) cArr[bMediaBrowserCompatMediaItem & 15]);
                                }
                            }
                        } else if (" \"<>^`{}|/\\?#" == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            int i16 = i8 + 111;
                            RatingCompat = i16 % Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            registryMissingComponentException.IconCompatParcelizer("+");
                        } else if (iCodePointAt2 < i4) {
                            if (registryMissingComponentException2 == null) {
                                registryMissingComponentException2 = new RegistryMissingComponentException();
                            }
                            registryMissingComponentException2.RatingCompat(iCodePointAt2);
                            while (!registryMissingComponentException2.RatingCompat()) {
                                int i18 = RatingCompat + 41;
                                MediaBrowserCompatMediaItem = i18 % Fields.SpotShadowColor;
                                int i19 = i18 % 2;
                                byte bMediaBrowserCompatMediaItem2 = registryMissingComponentException2.MediaBrowserCompatMediaItem();
                                registryMissingComponentException.read(37);
                                char[] cArr2 = UrlUtils.HEX_DIGITS;
                                registryMissingComponentException.read((int) cArr2[((bMediaBrowserCompatMediaItem2 & 255) >> 4) & 15]);
                                registryMissingComponentException.read((int) cArr2[bMediaBrowserCompatMediaItem2 & 15]);
                            }
                        } else {
                            if (registryMissingComponentException2 == null) {
                                registryMissingComponentException2 = new RegistryMissingComponentException();
                            }
                            registryMissingComponentException2.RatingCompat(iCodePointAt2);
                            while (!registryMissingComponentException2.RatingCompat()) {
                                int i110 = RatingCompat + 41;
                                MediaBrowserCompatMediaItem = i110 % Fields.SpotShadowColor;
                                int i111 = i110 % 2;
                                byte bMediaBrowserCompatMediaItem3 = registryMissingComponentException2.MediaBrowserCompatMediaItem();
                                registryMissingComponentException.read(37);
                                char[] cArr3 = UrlUtils.HEX_DIGITS;
                                registryMissingComponentException.read((int) cArr3[((bMediaBrowserCompatMediaItem3 & 255) >> 4) & 15]);
                                registryMissingComponentException.read((int) cArr3[bMediaBrowserCompatMediaItem3 & 15]);
                            }
                        }
                    } else if (iCodePointAt2 < i4) {
                        if (registryMissingComponentException2 == null) {
                            registryMissingComponentException2 = new RegistryMissingComponentException();
                        }
                        registryMissingComponentException2.RatingCompat(iCodePointAt2);
                        while (!registryMissingComponentException2.RatingCompat()) {
                            int i112 = RatingCompat + 41;
                            MediaBrowserCompatMediaItem = i112 % Fields.SpotShadowColor;
                            int i113 = i112 % 2;
                            byte bMediaBrowserCompatMediaItem4 = registryMissingComponentException2.MediaBrowserCompatMediaItem();
                            registryMissingComponentException.read(37);
                            char[] cArr4 = UrlUtils.HEX_DIGITS;
                            registryMissingComponentException.read((int) cArr4[((bMediaBrowserCompatMediaItem4 & 255) >> 4) & 15]);
                            registryMissingComponentException.read((int) cArr4[bMediaBrowserCompatMediaItem4 & 15]);
                        }
                    } else {
                        if (registryMissingComponentException2 == null) {
                            registryMissingComponentException2 = new RegistryMissingComponentException();
                        }
                        registryMissingComponentException2.RatingCompat(iCodePointAt2);
                        while (!registryMissingComponentException2.RatingCompat()) {
                            int i114 = RatingCompat + 41;
                            MediaBrowserCompatMediaItem = i114 % Fields.SpotShadowColor;
                            int i115 = i114 % 2;
                            byte bMediaBrowserCompatMediaItem5 = registryMissingComponentException2.MediaBrowserCompatMediaItem();
                            registryMissingComponentException.read(37);
                            char[] cArr5 = UrlUtils.HEX_DIGITS;
                            registryMissingComponentException.read((int) cArr5[((bMediaBrowserCompatMediaItem5 & 255) >> 4) & 15]);
                            registryMissingComponentException.read((int) cArr5[bMediaBrowserCompatMediaItem5 & 15]);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i4 = 32;
                }
                strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = registryMissingComponentException.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            } else {
                String strSubstring = str.substring(0, length);
                int i20 = RatingCompat + 3;
                MediaBrowserCompatMediaItem = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = strSubstring;
            }
            URL url = new URL(new Uri.Builder().scheme(Constants.SCHEME).authority(str3).appendEncodedPath("voice/v1/speak/".concat(strR8lambda54BeH8ZsBru0CXI2CCSP2syNys)).appendQueryParameter("textType", str2).appendQueryParameter("language", (String) this.read).appendQueryParameter("access_token", MapboxOptions.getAccessToken()).build().toString());
            m mVar = (m) this.RemoteActionCompatParcelizer;
            AnalyticsServiceImpl analyticsServiceImpl = (AnalyticsServiceImpl) mVar.read;
            ((n0) mVar.RemoteActionCompatParcelizer).getClass();
            SessionSKUIdentifier sessionSKUIdentifier = SessionSKUIdentifier.NAV3_SES_CORE_AGTRIP;
            BillingService billingService = (BillingService) analyticsServiceImpl.locationProvider;
            BillingService billingService2 = (BillingService) analyticsServiceImpl.locationProvider;
            BillingSessionStatus sessionStatus = billingService.getSessionStatus(sessionSKUIdentifier);
            sessionStatus.getClass();
            BillingSessionStatus billingSessionStatus = BillingSessionStatus.SESSION_ACTIVE;
            String str4 = "";
            if (sessionStatus != billingSessionStatus || (sessionSKUTokenIfValid = billingService2.getSessionSKUTokenIfValid(sessionSKUIdentifier)) == null) {
                sessionSKUTokenIfValid = "";
            }
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) sessionSKUTokenIfValid)) {
                SessionSKUIdentifier sessionSKUIdentifier2 = SessionSKUIdentifier.NAV3_SES_CORE_FDTRIP;
                BillingSessionStatus sessionStatus2 = billingService2.getSessionStatus(sessionSKUIdentifier2);
                sessionStatus2.getClass();
                if (sessionStatus2 == billingSessionStatus && (sessionSKUTokenIfValid = billingService2.getSessionSKUTokenIfValid(sessionSKUIdentifier2)) != null) {
                    str4 = sessionSKUTokenIfValid;
                }
            } else {
                str4 = sessionSKUTokenIfValid;
            }
            Uri.Builder builderBuildUpon = Uri.parse(url.toString()).buildUpon();
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4)) {
                builderBuildUpon.appendQueryParameter("sku", str4);
            }
            String string = new URL(builderBuildUpon.build().toString()).toString();
            string.getClass();
            x xVar = new x(string);
            ResourceLoadFlags resourceLoadFlags = ResourceLoadFlags.ACCEPT_EXPIRED;
            resourceLoadFlags.getClass();
            xVar.RemoteActionCompatParcelizer = resourceLoadFlags;
            return xVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0366  */
    /* JADX WARN: Code duplicated, block: B:125:0x0399  */
    /* JADX WARN: Code duplicated, block: B:128:0x039e  */
    /* JADX WARN: Code duplicated, block: B:132:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:134:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:136:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:139:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:141:0x03d9 A[PHI: r9
  0x03d9: PHI (r9v21 com.mapbox.api.directions.v5.models.IntersectionLanes) = 
  (r9v20 com.mapbox.api.directions.v5.models.IntersectionLanes)
  (r9v26 com.mapbox.api.directions.v5.models.IntersectionLanes)
 binds: [B:140:0x03d7, B:137:0x03ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:143:0x03df  */
    /* JADX WARN: Code duplicated, block: B:145:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:148:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:151:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:154:0x0426 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x0491  */
    /* JADX WARN: Code duplicated, block: B:179:0x049e  */
    /* JADX WARN: Code duplicated, block: B:183:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:188:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:190:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:191:0x04bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:192:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:193:0x04c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:194:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:195:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:198:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:205:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:208:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:212:0x0504 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:219:0x0517  */
    /* JADX WARN: Code duplicated, block: B:224:0x0552  */
    /* JADX WARN: Code duplicated, block: B:255:0x048c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x048d A[EDGE_INSN: B:256:0x048d->B:172:0x048d BREAK  A[LOOP:2: B:130:0x03a5->B:263:0x03a5, LOOP_LABEL: LOOP:2: B:130:0x03a5->B:263:0x03a5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x0428 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x03a5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:? A[LOOP:3: B:149:0x03f3->B:270:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x052f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:? A[LOOP:4: B:217:0x0511->B:273:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0103  */
    /* JADX WARN: Code duplicated, block: B:60:0x0108  */
    /* JADX WARN: Code duplicated, block: B:62:0x010b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0110  */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0174  */
    /* JADX WARN: Code duplicated, block: B:70:0x019b  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x0210  */
    /* JADX WARN: Code duplicated, block: B:78:0x0242  */
    /* JADX WARN: Code duplicated, block: B:80:0x0269  */
    /* JADX WARN: Code duplicated, block: B:82:0x0290  */
    /* JADX WARN: Code duplicated, block: B:84:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:86:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:89:0x030a  */
    /* JADX WARN: Code duplicated, block: B:90:0x030c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // com.mapbox.navigation.core.internal.congestions.processor.TrafficUpdateActionHandler
    public NavigationRoute handleAction(ignoreRemeasureRequests ignoreremeasurerequests) {
        List<Double> listDistance;
        int i;
        TrafficUpdateAction$DecreaseTraffic trafficUpdateAction$DecreaseTraffic;
        RouteLeg routeLeg;
        Integer numGeometryIndex;
        LegStep legStep;
        ArrayList arrayList;
        List<Integer> listSubList;
        Iterable iterable;
        Iterator it;
        Object next;
        StepIntersection stepIntersection;
        Integer numGeometryIndex2;
        LegStep legStep2;
        Integer numGeometryIndex3;
        int iIntValue;
        int iMin;
        ArrayList arrayListRemoteActionCompatParcelizer;
        Iterator it2;
        LegAnnotation legAnnotationAnnotation;
        List<Integer> listCongestionNumeric;
        int size;
        List<StepIntersection> listIntersections;
        StepIntersection stepIntersection2;
        List<IntersectionLanes> listLanes;
        IntersectionLanes intersectionLanes;
        List<String> listIndications;
        int i2;
        IntersectionLanes intersectionLanes2;
        List<String> listIndications2;
        List<String> list;
        Iterator<T> it3;
        List<StepIntersection> listIntersections2;
        String str;
        String strModifier;
        String strType;
        String strModifier2;
        boolean z;
        List<RouteLeg> listLegs;
        RouteLeg routeLeg2;
        List<LegStep> listSteps;
        LegStep legStep3;
        StepIntersection stepIntersection3;
        StepManeuver stepManeuverManeuver;
        List<BannerInstructions> listBannerInstructions;
        BannerInstructions bannerInstructions;
        RouteLeg routeLeg3;
        List<LegStep> listSteps2;
        int i3 = 2 % 2;
        if (this.write == 17) {
            ignoreremeasurerequests.getClass();
            if (ignoreremeasurerequests instanceof TrafficUpdateAction$DecreaseTraffic) {
                int i4 = RatingCompat + 101;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return ((TrafficUpdateActionHandler) this.RemoteActionCompatParcelizer).handleAction(ignoreremeasurerequests);
                }
                int i5 = 20 / 0;
                return ((TrafficUpdateActionHandler) this.RemoteActionCompatParcelizer).handleAction(ignoreremeasurerequests);
            }
            if (ignoreremeasurerequests instanceof TrafficUpdateAction$IncreaseTraffic) {
                return ((TrafficUpdateActionHandler) this.read).handleAction(ignoreremeasurerequests);
            }
            if (ignoreremeasurerequests instanceof TrafficUpdateAction$RestoreTraffic) {
                return ((TrafficUpdateActionHandler) this.IconCompatParcelizer).handleAction(ignoreremeasurerequests);
            }
            if (!(ignoreremeasurerequests instanceof TrafficUpdateAction$AccumulatingLowSpeed) && !ignoreremeasurerequests.equals(TrafficUpdateAction$NoAction.INSTANCE)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            }
            int i6 = RatingCompat + 41;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return null;
        }
        TrafficUpdateAction$DecreaseTraffic trafficUpdateAction$DecreaseTraffic2 = (TrafficUpdateAction$DecreaseTraffic) ignoreremeasurerequests;
        trafficUpdateAction$DecreaseTraffic2.getClass();
        NavigationRoute navigationRoute = trafficUpdateAction$DecreaseTraffic2.navigationRoute;
        float f = trafficUpdateAction$DecreaseTraffic2.currentSpeed;
        RouteLegProgress routeLegProgress = trafficUpdateAction$DecreaseTraffic2.legProgress;
        RouteLeg routeLeg4 = routeLegProgress.routeLeg;
        RouteStepProgress routeStepProgress = routeLegProgress.currentStepProgress;
        int i8 = routeStepProgress.stepIndex;
        int i9 = routeLegProgress.geometryIndex;
        if (routeLeg4 != null) {
            int i10 = MediaBrowserCompatMediaItem + 25;
            RatingCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            LegAnnotation legAnnotationAnnotation2 = routeLeg4.annotation();
            if (legAnnotationAnnotation2 != null) {
                listDistance = legAnnotationAnnotation2.distance();
            } else {
                listDistance = null;
            }
        } else {
            listDistance = null;
        }
        long j = ((PredictedTimeAheadDistanceCalculator) this.RemoteActionCompatParcelizer).aheadTime;
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        int iMin2 = Math.min(MathKt.write(f * BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(j, setUnregisteredInAppMessage.SECONDS)), 6000);
        List<Double> list2 = listDistance;
        if (list2 == null || list2.isEmpty()) {
            i = i9;
        } else {
            double dDoubleValue = 0.0d;
            i = i9;
            while (dDoubleValue < iMin2 && i <= SQLite.write((List) listDistance)) {
                Double d = listDistance.get(i);
                d.getClass();
                dDoubleValue += d.doubleValue();
                i++;
            }
        }
        int i12 = i - i9;
        int i13 = routeLegProgress.legIndex;
        int i14 = i8 - 1;
        Integer numValueOf = Integer.valueOf(i14);
        if (i14 < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            List<RouteLeg> listLegs2 = navigationRoute.directionsRoute.legs();
            LegStep legStep4 = (listLegs2 == null || (routeLeg3 = listLegs2.get(i13)) == null || (listSteps2 = routeLeg3.steps()) == null) ? null : listSteps2.get(iIntValue2);
            BannerText bannerTextPrimary = (legStep4 == null || (listBannerInstructions = legStep4.bannerInstructions()) == null || (bannerInstructions = (BannerInstructions) onContentCardDismissed.MediaBrowserCompatMediaItem((List) listBannerInstructions)) == null) ? null : bannerInstructions.primary();
            String strType2 = (legStep4 == null || (stepManeuverManeuver = legStep4.maneuver()) == null) ? null : stepManeuverManeuver.type();
            if (legStep4 != null) {
                int i15 = RatingCompat + 61;
                trafficUpdateAction$DecreaseTraffic = trafficUpdateAction$DecreaseTraffic2;
                MediaBrowserCompatMediaItem = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    legStep4.maneuver();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                StepManeuver stepManeuverManeuver2 = legStep4.maneuver();
                if (stepManeuverManeuver2 != null) {
                    strModifier = stepManeuverManeuver2.modifier();
                    str = null;
                }
                if (bannerTextPrimary != null) {
                    strType = bannerTextPrimary.type();
                } else {
                    strType = str;
                }
                if (bannerTextPrimary != null) {
                    strModifier2 = bannerTextPrimary.modifier();
                } else {
                    strModifier2 = str;
                }
                int i16 = MediaBrowserCompatMediaItem + 41;
                RatingCompat = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                routeLeg = routeLeg4;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "fork"}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier, "left"}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier, "slight left"}, getCieXyz.write())).booleanValue()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier, "slight right"}, getCieXyz.write())).booleanValue()) {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier, "right"}, getCieXyz.write())).booleanValue()) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType, "fork"}, getCieXyz.write())).booleanValue()) {
                                        int i18 = MediaBrowserCompatMediaItem + 35;
                                        RatingCompat = i18 % Fields.SpotShadowColor;
                                        int i19 = i18 % 2;
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier2, "left"}, getCieXyz.write())).booleanValue()) {
                                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier2, "slight left"}, getCieXyz.write())).booleanValue()) {
                                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier2, "slight right"}, getCieXyz.write())).booleanValue()) {
                                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier2, "right"}, getCieXyz.write())).booleanValue()) {
                                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "off ramp"}, getCieXyz.write())).booleanValue()) {
                                                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "on ramp"}, getCieXyz.write())).booleanValue()) {
                                                                z = false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "off ramp"}, getCieXyz.write())).booleanValue()) {
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "on ramp"}, getCieXyz.write())).booleanValue()) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = true;
                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType, "fork"}, getCieXyz.write())).booleanValue()) {
                    int i110 = MediaBrowserCompatMediaItem + 35;
                    RatingCompat = i110 % Fields.SpotShadowColor;
                    int i111 = i110 % 2;
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier2, "left"}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier2, "slight left"}, getCieXyz.write())).booleanValue()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier2, "slight right"}, getCieXyz.write())).booleanValue()) {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier2, "right"}, getCieXyz.write())).booleanValue()) {
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "off ramp"}, getCieXyz.write())).booleanValue()) {
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "on ramp"}, getCieXyz.write())).booleanValue()) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = true;
                } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "off ramp"}, getCieXyz.write())).booleanValue()) {
                    z = true;
                } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "on ramp"}, getCieXyz.write())).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                listLegs = navigationRoute.directionsRoute.legs();
                if (listLegs == null && (routeLeg2 = listLegs.get(i13)) != null && (listSteps = routeLeg2.steps()) != null && (legStep3 = listSteps.get(i8)) != null) {
                    int i20 = MediaBrowserCompatMediaItem + 45;
                    RatingCompat = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    List<StepIntersection> listIntersections3 = legStep3.intersections();
                    if (listIntersections3 != null && (stepIntersection3 = (StepIntersection) onContentCardDismissed.read(1, listIntersections3)) != null && (numGeometryIndex = stepIntersection3.geometryIndex()) != null) {
                        int i22 = RatingCompat + 31;
                        MediaBrowserCompatMediaItem = i22 % Fields.SpotShadowColor;
                        int i23 = i22 % 2;
                        if (!z || i9 >= numGeometryIndex.intValue()) {
                        }
                    }
                }
                legStep = routeStepProgress.step;
                if (legStep != null || (listIntersections2 = legStep.intersections()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (Object obj2 : listIntersections2) {
                        Integer numGeometryIndex4 = ((StepIntersection) obj2).geometryIndex();
                        if (numGeometryIndex4 == null) {
                            numGeometryIndex4 = 0;
                        }
                        if (i9 < numGeometryIndex4.intValue()) {
                            arrayList.add(obj2);
                        }
                    }
                }
                listSubList = instance_delegatelambda0.write;
                iterable = arrayList;
                if (arrayList == null) {
                    iterable = listSubList;
                }
                it = iterable.iterator();
                loop2: while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    listLanes = ((StepIntersection) next).lanes();
                    if (listLanes != null) {
                        i2 = MediaBrowserCompatMediaItem + 63;
                        RatingCompat = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 == 0) {
                            intersectionLanes2 = (IntersectionLanes) onContentCardDismissed.MediaBrowserCompatMediaItem((List) listLanes);
                            if (intersectionLanes2 != null) {
                                listIndications2 = intersectionLanes2.indications();
                                if (listIndications2 != null) {
                                    list = listIndications2;
                                    if (!(list instanceof Collection)) {
                                        it3 = list.iterator();
                                        while (it3.hasNext()) {
                                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) it3.next(), "slight right"}, getCieXyz.write())).booleanValue()) {
                                                break loop2;
                                                break loop2;
                                            }
                                        }
                                    } else {
                                        it3 = list.iterator();
                                        while (it3.hasNext()) {
                                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) it3.next(), "slight right"}, getCieXyz.write())).booleanValue()) {
                                                break loop2;
                                                break loop2;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            intersectionLanes2 = (IntersectionLanes) onContentCardDismissed.MediaBrowserCompatMediaItem((List) listLanes);
                            int i24 = 52 / 0;
                            if (intersectionLanes2 != null) {
                                listIndications2 = intersectionLanes2.indications();
                                if (listIndications2 != null) {
                                    list = listIndications2;
                                    if (!(list instanceof Collection) || !list.isEmpty()) {
                                        it3 = list.iterator();
                                        while (it3.hasNext()) {
                                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) it3.next(), "slight right"}, getCieXyz.write())).booleanValue()) {
                                                break loop2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (listLanes == null && (intersectionLanes = (IntersectionLanes) onContentCardDismissed.MediaMetadataCompat((List) listLanes)) != null && (listIndications = intersectionLanes.indications()) != null) {
                            int i25 = RatingCompat + 1;
                            MediaBrowserCompatMediaItem = i25 % Fields.SpotShadowColor;
                            int i26 = i25 % 2;
                            List<String> list3 = listIndications;
                            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                Iterator<T> it4 = list3.iterator();
                                while (!(!it4.hasNext())) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) it4.next(), "slight left"}, getCieXyz.write())).booleanValue()) {
                                        break loop2;
                                    }
                                }
                            }
                        }
                    } else if (listLanes == null) {
                    }
                }
                stepIntersection = (StepIntersection) next;
                if (stepIntersection != null || (numGeometryIndex2 = stepIntersection.geometryIndex()) == null || i9 > numGeometryIndex2.intValue()) {
                    numGeometryIndex2 = null;
                }
                legStep2 = routeLegProgress.upcomingStep;
                if (legStep2 != null || (listIntersections = legStep2.intersections()) == null || (stepIntersection2 = (StepIntersection) onContentCardDismissed.MediaMetadataCompat((List) listIntersections)) == null) {
                    numGeometryIndex3 = null;
                } else {
                    numGeometryIndex3 = stepIntersection2.geometryIndex();
                }
                if (numGeometryIndex != null) {
                    iIntValue = numGeometryIndex.intValue();
                } else if (numGeometryIndex2 != null) {
                    iIntValue = numGeometryIndex2.intValue();
                } else if (numGeometryIndex3 != null) {
                    iIntValue = numGeometryIndex3.intValue();
                } else {
                    iIntValue = Integer.MAX_VALUE;
                }
                iMin = Math.min(iIntValue, i12 + i9);
                if (routeLeg != null && (legAnnotationAnnotation = routeLeg.annotation()) != null && (listCongestionNumeric = legAnnotationAnnotation.congestionNumeric()) != null) {
                    size = listCongestionNumeric.size() - 1;
                    if (iMin <= size) {
                        size = iMin;
                    }
                    if (i9 <= size) {
                        listSubList = listCongestionNumeric.subList(i9, size);
                    }
                }
                arrayListRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) listSubList);
                if (zznl.getOverriddenTrafficForProgress(navigationRoute, routeLegProgress) == null && iMin > 0 && !arrayListRemoteActionCompatParcelizer.isEmpty()) {
                    it2 = arrayListRemoteActionCompatParcelizer.iterator();
                    while (it2.hasNext()) {
                        if (((Number) it2.next()).intValue() > ((ensureSubscribedToInAppMessageEventslambda7) ((TransitionValuesMaps) this.read).MediaBrowserCompatMediaItem).read) {
                            NavigationRoute navigationRoute2 = trafficUpdateAction$DecreaseTraffic.navigationRoute;
                            MapboxNavigation.AnonymousClass11 anonymousClass11 = (MapboxNavigation.AnonymousClass11) this.IconCompatParcelizer;
                            return zznd.updateTraffic(navigationRoute2, routeLegProgress, 0, i12, 0, Integer.valueOf(iMin), true, anonymousClass11, anonymousClass11);
                        }
                    }
                }
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                    LoggerProviderKt.logD("Upcoming traffic is low - skipping reducing", "DecreaseTraffic");
                }
                return null;
            }
            trafficUpdateAction$DecreaseTraffic = trafficUpdateAction$DecreaseTraffic2;
            str = null;
            strModifier = null;
            if (bannerTextPrimary != null) {
                strType = bannerTextPrimary.type();
            } else {
                strType = str;
            }
            if (bannerTextPrimary != null) {
                strModifier2 = bannerTextPrimary.modifier();
            } else {
                strModifier2 = str;
            }
            int i112 = MediaBrowserCompatMediaItem + 41;
            RatingCompat = i112 % Fields.SpotShadowColor;
            int i113 = i112 % 2;
            routeLeg = routeLeg4;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "fork"}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier, "left"}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier, "slight left"}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier, "slight right"}, getCieXyz.write())).booleanValue()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier, "right"}, getCieXyz.write())).booleanValue()) {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType, "fork"}, getCieXyz.write())).booleanValue()) {
                                    int i114 = MediaBrowserCompatMediaItem + 35;
                                    RatingCompat = i114 % Fields.SpotShadowColor;
                                    int i115 = i114 % 2;
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier2, "left"}, getCieXyz.write())).booleanValue()) {
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier2, "slight left"}, getCieXyz.write())).booleanValue()) {
                                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier2, "slight right"}, getCieXyz.write())).booleanValue()) {
                                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier2, "right"}, getCieXyz.write())).booleanValue()) {
                                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "off ramp"}, getCieXyz.write())).booleanValue()) {
                                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "on ramp"}, getCieXyz.write())).booleanValue()) {
                                                            z = false;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "off ramp"}, getCieXyz.write())).booleanValue()) {
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "on ramp"}, getCieXyz.write())).booleanValue()) {
                                        z = false;
                                    }
                                }
                            }
                        }
                    }
                }
                z = true;
            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType, "fork"}, getCieXyz.write())).booleanValue()) {
                int i116 = MediaBrowserCompatMediaItem + 35;
                RatingCompat = i116 % Fields.SpotShadowColor;
                int i117 = i116 % 2;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier2, "left"}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier2, "slight left"}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier2, "slight right"}, getCieXyz.write())).booleanValue()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strModifier2, "right"}, getCieXyz.write())).booleanValue()) {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "off ramp"}, getCieXyz.write())).booleanValue()) {
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "on ramp"}, getCieXyz.write())).booleanValue()) {
                                        z = false;
                                    }
                                }
                            }
                        }
                    }
                }
                z = true;
            } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "off ramp"}, getCieXyz.write())).booleanValue()) {
                z = true;
            } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strType2, "on ramp"}, getCieXyz.write())).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            listLegs = navigationRoute.directionsRoute.legs();
            if (listLegs == null) {
            }
            legStep = routeStepProgress.step;
            if (legStep != null) {
                arrayList = null;
            } else {
                arrayList = null;
            }
            listSubList = instance_delegatelambda0.write;
            iterable = arrayList;
            if (arrayList == null) {
                iterable = listSubList;
            }
            it = iterable.iterator();
            loop2: while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                listLanes = ((StepIntersection) next).lanes();
                if (listLanes != null) {
                    i2 = MediaBrowserCompatMediaItem + 63;
                    RatingCompat = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        intersectionLanes2 = (IntersectionLanes) onContentCardDismissed.MediaBrowserCompatMediaItem((List) listLanes);
                        if (intersectionLanes2 != null) {
                            listIndications2 = intersectionLanes2.indications();
                            if (listIndications2 != null) {
                                list = listIndications2;
                                if (!(list instanceof Collection)) {
                                    it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) it3.next(), "slight right"}, getCieXyz.write())).booleanValue()) {
                                            break loop2;
                                            break loop2;
                                        }
                                    }
                                } else {
                                    it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) it3.next(), "slight right"}, getCieXyz.write())).booleanValue()) {
                                            break loop2;
                                            break loop2;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        intersectionLanes2 = (IntersectionLanes) onContentCardDismissed.MediaBrowserCompatMediaItem((List) listLanes);
                        int i27 = 52 / 0;
                        if (intersectionLanes2 != null) {
                            listIndications2 = intersectionLanes2.indications();
                            if (listIndications2 != null) {
                                list = listIndications2;
                                if (!(list instanceof Collection)) {
                                    it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) it3.next(), "slight right"}, getCieXyz.write())).booleanValue()) {
                                            break loop2;
                                            break loop2;
                                        }
                                    }
                                } else {
                                    it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) it3.next(), "slight right"}, getCieXyz.write())).booleanValue()) {
                                            break loop2;
                                            break loop2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (listLanes == null) {
                    }
                } else if (listLanes == null) {
                }
            }
            stepIntersection = (StepIntersection) next;
            if (stepIntersection != null) {
                numGeometryIndex2 = null;
            } else {
                numGeometryIndex2 = null;
            }
            legStep2 = routeLegProgress.upcomingStep;
            if (legStep2 != null) {
                numGeometryIndex3 = null;
            } else {
                numGeometryIndex3 = stepIntersection2.geometryIndex();
            }
            if (numGeometryIndex != null) {
                iIntValue = numGeometryIndex.intValue();
            } else if (numGeometryIndex2 != null) {
                iIntValue = numGeometryIndex2.intValue();
            } else if (numGeometryIndex3 != null) {
                iIntValue = numGeometryIndex3.intValue();
            } else {
                iIntValue = Integer.MAX_VALUE;
            }
            iMin = Math.min(iIntValue, i12 + i9);
            if (routeLeg != null) {
                size = listCongestionNumeric.size() - 1;
                if (iMin <= size) {
                    size = iMin;
                }
                if (i9 <= size) {
                    listSubList = listCongestionNumeric.subList(i9, size);
                }
            }
            arrayListRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) listSubList);
            if (zznl.getOverriddenTrafficForProgress(navigationRoute, routeLegProgress) == null) {
                it2 = arrayListRemoteActionCompatParcelizer.iterator();
                while (it2.hasNext()) {
                    if (((Number) it2.next()).intValue() > ((ensureSubscribedToInAppMessageEventslambda7) ((TransitionValuesMaps) this.read).MediaBrowserCompatMediaItem).read) {
                        NavigationRoute navigationRoute3 = trafficUpdateAction$DecreaseTraffic.navigationRoute;
                        MapboxNavigation.AnonymousClass11 anonymousClass12 = (MapboxNavigation.AnonymousClass11) this.IconCompatParcelizer;
                        return zznd.updateTraffic(navigationRoute3, routeLegProgress, 0, i12, 0, Integer.valueOf(iMin), true, anonymousClass12, anonymousClass12);
                    }
                }
            }
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                LoggerProviderKt.logD("Upcoming traffic is low - skipping reducing", "DecreaseTraffic");
            }
            return null;
        }
        trafficUpdateAction$DecreaseTraffic = trafficUpdateAction$DecreaseTraffic2;
        routeLeg = routeLeg4;
        numGeometryIndex = null;
        legStep = routeStepProgress.step;
        if (legStep != null) {
            arrayList = null;
        } else {
            arrayList = null;
        }
        listSubList = instance_delegatelambda0.write;
        iterable = arrayList;
        if (arrayList == null) {
            iterable = listSubList;
        }
        it = iterable.iterator();
        loop2: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            listLanes = ((StepIntersection) next).lanes();
            if (listLanes != null) {
                i2 = MediaBrowserCompatMediaItem + 63;
                RatingCompat = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    intersectionLanes2 = (IntersectionLanes) onContentCardDismissed.MediaBrowserCompatMediaItem((List) listLanes);
                    if (intersectionLanes2 != null) {
                        listIndications2 = intersectionLanes2.indications();
                        if (listIndications2 != null) {
                            list = listIndications2;
                            if (!(list instanceof Collection)) {
                                it3 = list.iterator();
                                while (it3.hasNext()) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) it3.next(), "slight right"}, getCieXyz.write())).booleanValue()) {
                                        break loop2;
                                        break loop2;
                                    }
                                }
                            } else {
                                it3 = list.iterator();
                                while (it3.hasNext()) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) it3.next(), "slight right"}, getCieXyz.write())).booleanValue()) {
                                        break loop2;
                                        break loop2;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    intersectionLanes2 = (IntersectionLanes) onContentCardDismissed.MediaBrowserCompatMediaItem((List) listLanes);
                    int i28 = 52 / 0;
                    if (intersectionLanes2 != null) {
                        listIndications2 = intersectionLanes2.indications();
                        if (listIndications2 != null) {
                            list = listIndications2;
                            if (!(list instanceof Collection)) {
                                it3 = list.iterator();
                                while (it3.hasNext()) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) it3.next(), "slight right"}, getCieXyz.write())).booleanValue()) {
                                        break loop2;
                                        break loop2;
                                    }
                                }
                            } else {
                                it3 = list.iterator();
                                while (it3.hasNext()) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) it3.next(), "slight right"}, getCieXyz.write())).booleanValue()) {
                                        break loop2;
                                        break loop2;
                                    }
                                }
                            }
                        }
                    }
                }
                if (listLanes == null) {
                }
            } else if (listLanes == null) {
            }
        }
        stepIntersection = (StepIntersection) next;
        if (stepIntersection != null) {
            numGeometryIndex2 = null;
        } else {
            numGeometryIndex2 = null;
        }
        legStep2 = routeLegProgress.upcomingStep;
        if (legStep2 != null) {
            numGeometryIndex3 = null;
        } else {
            numGeometryIndex3 = stepIntersection2.geometryIndex();
        }
        if (numGeometryIndex != null) {
            iIntValue = numGeometryIndex.intValue();
        } else if (numGeometryIndex2 != null) {
            iIntValue = numGeometryIndex2.intValue();
        } else if (numGeometryIndex3 != null) {
            iIntValue = numGeometryIndex3.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        iMin = Math.min(iIntValue, i12 + i9);
        if (routeLeg != null) {
            size = listCongestionNumeric.size() - 1;
            if (iMin <= size) {
                size = iMin;
            }
            if (i9 <= size) {
                listSubList = listCongestionNumeric.subList(i9, size);
            }
        }
        arrayListRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) listSubList);
        if (zznl.getOverriddenTrafficForProgress(navigationRoute, routeLegProgress) == null) {
            it2 = arrayListRemoteActionCompatParcelizer.iterator();
            while (it2.hasNext()) {
                if (((Number) it2.next()).intValue() > ((ensureSubscribedToInAppMessageEventslambda7) ((TransitionValuesMaps) this.read).MediaBrowserCompatMediaItem).read) {
                    NavigationRoute navigationRoute4 = trafficUpdateAction$DecreaseTraffic.navigationRoute;
                    MapboxNavigation.AnonymousClass11 anonymousClass13 = (MapboxNavigation.AnonymousClass11) this.IconCompatParcelizer;
                    return zznd.updateTraffic(navigationRoute4, routeLegProgress, 0, i12, 0, Integer.valueOf(iMin), true, anonymousClass13, anonymousClass13);
                }
            }
        }
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
            LoggerProviderKt.logD("Upcoming traffic is low - skipping reducing", "DecreaseTraffic");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:286:0x03e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x022b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x012b  */
    /* JADX WARN: Code duplicated, block: B:51:0x013b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0141  */
    /* JADX WARN: Code duplicated, block: B:55:0x014e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0160  */
    /* JADX WARN: Code duplicated, block: B:59:0x016d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0174  */
    /* JADX WARN: Code duplicated, block: B:63:0x0179  */
    /* JADX WARN: Code duplicated, block: B:65:0x0185  */
    /* JADX WARN: Code duplicated, block: B:90:0x0243  */
    /* JADX WARN: Code duplicated, block: B:93:0x0247  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108, types: [int] */
    /* JADX WARN: Type inference failed for: r0v200 */
    /* JADX WARN: Type inference failed for: r0v201 */
    /* JADX WARN: Type inference failed for: r0v202 */
    /* JADX WARN: Type inference failed for: r0v203 */
    public boolean read() {
        AndroidAccessibilityManagerCompanion androidAccessibilityManagerCompanion;
        Bundle bundle;
        int i;
        int identifier;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        Integer numValueOf;
        Long lValueOf;
        long[] jArr;
        int[] iArr;
        IconCompat iconCompat;
        IconCompat iconCompat2;
        boolean z;
        int i2;
        int identifier2;
        String string;
        int i3;
        int i4;
        int i5 = 2 % 2;
        if (((getClipEntry) this.IconCompatParcelizer).write("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.RemoteActionCompatParcelizer;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strRatingCompat = ((getClipEntry) this.IconCompatParcelizer).RatingCompat("gcm.n.image");
        if (TextUtils.isEmpty(strRatingCompat)) {
            androidAccessibilityManagerCompanion = null;
        } else {
            try {
                androidAccessibilityManagerCompanion = new AndroidAccessibilityManagerCompanion(new URL(strRatingCompat));
            } catch (MalformedURLException unused) {
                SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Not downloading image, bad URL: " + strRatingCompat);
                androidAccessibilityManagerCompanion = null;
            }
        }
        if (androidAccessibilityManagerCompanion != null) {
            ExecutorService executorService = (ExecutorService) this.read;
            ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
            androidAccessibilityManagerCompanion.write = executorService.submit(new w4$$ExternalSyntheticLambda0(androidAccessibilityManagerCompanion, 27, parentDataModifierDefaultImpls));
            androidAccessibilityManagerCompanion.read = parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.RemoteActionCompatParcelizer;
        getClipEntry getclipentry = (getClipEntry) this.IconCompatParcelizer;
        AtomicInteger atomicInteger = calculateRecommendedTimeoutMillis.serializer;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), Fields.SpotShadowColor);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        Bundle bundle2 = bundle;
        String strRatingCompat2 = getclipentry.RatingCompat("gcm.n.android_channel_id");
        try {
            if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
                strRatingCompat2 = null;
            } else {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(strRatingCompat2)) {
                    strRatingCompat2 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (TextUtils.isEmpty(strRatingCompat2)) {
                        SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else {
                        int i6 = RatingCompat + 113;
                        MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        if (notificationManager.getNotificationChannel(strRatingCompat2) == null) {
                            SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                    }
                    strRatingCompat2 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            i4 = RatingCompat + 41;
                            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                SentryLogcatAdapter.serializer("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                throw null;
                            }
                            SentryLogcatAdapter.serializer("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                            if (string.startsWith("%('")) {
                                i3 = 3;
                                Object[] objArr = new Object[1];
                                b(string.substring(3), objArr);
                                string = ((String) objArr[0]).intern();
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, i3));
                        }
                        i3 = 3;
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, i3));
                    }
                } else if (notificationManager.getNotificationChannel(strRatingCompat2) == null) {
                    SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Notification Channel requested (" + strRatingCompat2 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    strRatingCompat2 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (TextUtils.isEmpty(strRatingCompat2)) {
                        int i8 = RatingCompat + 113;
                        MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        if (notificationManager.getNotificationChannel(strRatingCompat2) == null) {
                            SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                    } else {
                        SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    }
                    strRatingCompat2 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            i4 = RatingCompat + 41;
                            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                SentryLogcatAdapter.serializer("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                throw null;
                            }
                            SentryLogcatAdapter.serializer("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                            if (string.startsWith("%('")) {
                                i3 = 3;
                                Object[] objArr2 = new Object[1];
                                b(string.substring(3), objArr2);
                                string = ((String) objArr2[0]).intern();
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, i3));
                        }
                        i3 = 3;
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, i3));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        AtomicInteger atomicInteger2 = calculateRecommendedTimeoutMillis.serializer;
        String packageName = firebaseMessagingService2.getPackageName();
        Resources resources = firebaseMessagingService2.getResources();
        PackageManager packageManager = firebaseMessagingService2.getPackageManager();
        getEnterdhqQ8s getenterdhqq8s = new getEnterdhqQ8s(firebaseMessagingService2, strRatingCompat2);
        String strRemoteActionCompatParcelizer = getclipentry.RemoteActionCompatParcelizer(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
            int i10 = MediaBrowserCompatMediaItem + 37;
            RatingCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            getenterdhqq8s.read(strRemoteActionCompatParcelizer);
        }
        String strRemoteActionCompatParcelizer2 = getclipentry.RemoteActionCompatParcelizer(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strRemoteActionCompatParcelizer2)) {
            getenterdhqq8s.RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer2);
            getExitdhqQ8s getexitdhqq8s = new getExitdhqQ8s(0);
            getexitdhqq8s.IconCompatParcelizer = getEnterdhqQ8s.serializer((CharSequence) strRemoteActionCompatParcelizer2);
            getenterdhqq8s.RemoteActionCompatParcelizer(getexitdhqq8s);
        }
        String strRatingCompat3 = getclipentry.RatingCompat("gcm.n.icon");
        if (TextUtils.isEmpty(strRatingCompat3)) {
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i != 0) {
                identifier = i;
            } else {
                try {
                    identifier = packageManager.getApplicationInfo(packageName, 0).icon;
                } catch (PackageManager.NameNotFoundException e2) {
                    SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Couldn't get own application info: " + e2);
                    identifier = i;
                }
            }
            if (identifier == 0) {
                identifier = R.drawable.sym_def_app_icon;
            }
        } else {
            identifier = resources.getIdentifier(strRatingCompat3, "drawable", packageName);
            if (identifier == 0 && (identifier = resources.getIdentifier(strRatingCompat3, "mipmap", packageName)) == 0) {
                SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Icon resource " + strRatingCompat3 + " not found. Notification will use default icon.");
                i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i != 0) {
                    identifier = i;
                } else {
                    identifier = packageManager.getApplicationInfo(packageName, 0).icon;
                }
                if (identifier == 0) {
                    identifier = R.drawable.sym_def_app_icon;
                }
            }
        }
        getenterdhqq8s.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.icon = identifier;
        String strRatingCompat4 = getclipentry.RatingCompat("gcm.n.sound2");
        if (TextUtils.isEmpty(strRatingCompat4)) {
            strRatingCompat4 = getclipentry.RatingCompat("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strRatingCompat4)) {
            defaultUri = null;
        } else if ("default".equals(strRatingCompat4) || resources.getIdentifier(strRatingCompat4, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strRatingCompat4);
        }
        if (defaultUri != null) {
            getenterdhqq8s.write(defaultUri);
        }
        String strRatingCompat5 = getclipentry.RatingCompat("gcm.n.click_action");
        if (TextUtils.isEmpty(strRatingCompat5)) {
            String strRatingCompat6 = getclipentry.RatingCompat("gcm.n.link_android");
            if (TextUtils.isEmpty(strRatingCompat6)) {
                strRatingCompat6 = getclipentry.RatingCompat("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strRatingCompat6) ? Uri.parse(strRatingCompat6) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            launchIntentForPackage = new Intent(strRatingCompat5);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        if (launchIntentForPackage == null) {
            int i12 = RatingCompat + 15;
            MediaBrowserCompatMediaItem = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = getclipentry.serializer;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                if (!str.startsWith("google.c.") && !str.startsWith("gcm.n.")) {
                    int i14 = RatingCompat + 105;
                    MediaBrowserCompatMediaItem = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    if (str.startsWith("gcm.notification.")) {
                    }
                }
                bundle4.remove(str);
            }
            launchIntentForPackage.putExtras(bundle4);
            if (getclipentry.write("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", getclipentry.IconCompatParcelizer());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        getenterdhqq8s.MediaMetadataCompat = activity;
        if (getclipentry.write("google.c.a.e")) {
            broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(getclipentry.IconCompatParcelizer())), 1140850688);
        } else {
            int i16 = MediaBrowserCompatMediaItem + 83;
            RatingCompat = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            broadcast = null;
        }
        if (broadcast != null) {
            getenterdhqq8s.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.deleteIntent = broadcast;
        }
        String strRatingCompat7 = getclipentry.RatingCompat("gcm.n.color");
        if (TextUtils.isEmpty(strRatingCompat7)) {
            i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i2 != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i2));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strRatingCompat7));
            } catch (IllegalArgumentException unused3) {
                SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Color is invalid: " + strRatingCompat7 + ". Notification will use default color.");
                i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i2 != 0) {
                    try {
                        numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i2));
                    } catch (Resources.NotFoundException unused4) {
                        SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            getenterdhqq8s.MediaSessionCompatQueueItem = numValueOf.intValue();
        }
        getenterdhqq8s.write(!getclipentry.write("gcm.n.sticky"));
        getenterdhqq8s.ResultReceiver = getclipentry.write("gcm.n.local_only");
        String strRatingCompat8 = getclipentry.RatingCompat("gcm.n.ticker");
        if (strRatingCompat8 != null) {
            getenterdhqq8s.serializer(strRatingCompat8);
        }
        Integer numRemoteActionCompatParcelizer = getclipentry.RemoteActionCompatParcelizer("gcm.n.notification_priority");
        if (numRemoteActionCompatParcelizer == null) {
            numRemoteActionCompatParcelizer = null;
        } else if (numRemoteActionCompatParcelizer.intValue() < -2 || numRemoteActionCompatParcelizer.intValue() > 2) {
            SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "notificationPriority is invalid " + numRemoteActionCompatParcelizer + ". Skipping setting notificationPriority.");
            numRemoteActionCompatParcelizer = null;
        }
        if (numRemoteActionCompatParcelizer != null) {
            getenterdhqq8s.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = numRemoteActionCompatParcelizer.intValue();
        }
        Integer numRemoteActionCompatParcelizer2 = getclipentry.RemoteActionCompatParcelizer("gcm.n.visibility");
        if (numRemoteActionCompatParcelizer2 == null) {
            numRemoteActionCompatParcelizer2 = null;
        } else if (numRemoteActionCompatParcelizer2.intValue() < -1 || numRemoteActionCompatParcelizer2.intValue() > 1) {
            SentryLogcatAdapter.IconCompatParcelizer("NotificationParams", "visibility is invalid: " + numRemoteActionCompatParcelizer2 + ". Skipping setting visibility.");
            numRemoteActionCompatParcelizer2 = null;
        }
        if (numRemoteActionCompatParcelizer2 != null) {
            int i18 = MediaBrowserCompatMediaItem + 57;
            RatingCompat = i18 % Fields.SpotShadowColor;
            if (i18 % 2 != 0) {
                getenterdhqq8s.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = numRemoteActionCompatParcelizer2.intValue();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getenterdhqq8s.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = numRemoteActionCompatParcelizer2.intValue();
        }
        Integer numRemoteActionCompatParcelizer3 = getclipentry.RemoteActionCompatParcelizer("gcm.n.notification_count");
        if (numRemoteActionCompatParcelizer3 == null) {
            numRemoteActionCompatParcelizer3 = null;
        } else if (numRemoteActionCompatParcelizer3.intValue() < 0) {
            SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "notificationCount is invalid: " + numRemoteActionCompatParcelizer3 + ". Skipping setting notificationCount.");
            numRemoteActionCompatParcelizer3 = null;
        }
        if (numRemoteActionCompatParcelizer3 != null) {
            getenterdhqq8s.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = numRemoteActionCompatParcelizer3.intValue();
        }
        String strRatingCompat9 = getclipentry.RatingCompat("gcm.n.event_time");
        if (TextUtils.isEmpty(strRatingCompat9)) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(strRatingCompat9));
            } catch (NumberFormatException unused5) {
                SentryLogcatAdapter.IconCompatParcelizer("NotificationParams", "Couldn't parse value of " + getClipEntry.serializer("gcm.n.event_time") + "(" + strRatingCompat9 + ") into a long");
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            int i19 = RatingCompat + 43;
            MediaBrowserCompatMediaItem = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            getenterdhqq8s.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = true;
            getenterdhqq8s.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.when = lValueOf.longValue();
        }
        JSONArray jSONArray = getclipentry.read("gcm.n.vibrate_timings");
        if (jSONArray == null) {
            jArr = null;
        } else {
            try {
                if (jSONArray.length() <= 1) {
                    throw new JSONException("vibrateTimings have invalid length");
                }
                int length = jSONArray.length();
                jArr = new long[length];
                for (int i21 = 0; i21 < length; i21++) {
                    jArr[i21] = jSONArray.optLong(i21);
                }
            } catch (NumberFormatException | JSONException unused6) {
                SentryLogcatAdapter.IconCompatParcelizer("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArray + ". Skipping setting vibrateTimings.");
                jArr = null;
            }
        }
        if (jArr != null) {
            getenterdhqq8s.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.vibrate = jArr;
        }
        JSONArray jSONArray2 = getclipentry.read("gcm.n.light_settings");
        if (jSONArray2 == null) {
            iArr = null;
        } else {
            int[] iArr2 = new int[3];
            try {
                if (jSONArray2.length() != 3) {
                    throw new JSONException("lightSettings don't have all three fields");
                }
                int color = Color.parseColor(jSONArray2.optString(0));
                if (color == -16777216) {
                    throw new IllegalArgumentException("Transparent color is invalid");
                }
                iArr2[0] = color;
                iArr2[1] = jSONArray2.optInt(1);
                iArr2[2] = jSONArray2.optInt(2);
                iArr = iArr2;
            } catch (IllegalArgumentException e3) {
                SentryLogcatAdapter.IconCompatParcelizer("NotificationParams", "LightSettings is invalid: " + jSONArray2 + ". " + e3.getMessage() + ". Skipping setting LightSettings");
                iArr = null;
            } catch (JSONException unused7) {
                SentryLogcatAdapter.IconCompatParcelizer("NotificationParams", "LightSettings is invalid: " + jSONArray2 + ". Skipping setting LightSettings");
                iArr = null;
            }
        }
        if (iArr != null) {
            int i22 = iArr[0];
            int i23 = iArr[1];
            int i24 = iArr[2];
            Notification notification = getenterdhqq8s.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            notification.ledARGB = i22;
            notification.ledOnMS = i23;
            notification.ledOffMS = i24;
            notification.flags = ((i23 == 0 || i24 == 0) ? 0 : 1) | ((-2) & notification.flags);
        }
        boolean zWrite = getclipentry.write("gcm.n.default_sound");
        ?? r0 = zWrite;
        if (getclipentry.write("gcm.n.default_vibrate_timings")) {
            int i25 = MediaBrowserCompatMediaItem + 67;
            RatingCompat = i25 % Fields.SpotShadowColor;
            int i26 = i25 % 2;
            r0 = (zWrite ? 1 : 0) | 2;
        }
        ?? r1 = r0;
        if (getclipentry.write("gcm.n.default_light_settings")) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        Notification notification2 = getenterdhqq8s.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        notification2.defaults = r1;
        if ((r1 & 4) != 0) {
            notification2.flags |= 1;
        }
        String strRatingCompat10 = getclipentry.RatingCompat("gcm.n.tag");
        if (TextUtils.isEmpty(strRatingCompat10)) {
            strRatingCompat10 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str2 = strRatingCompat10;
        if (androidAccessibilityManagerCompanion != null) {
            try {
                zzw zzwVar = androidAccessibilityManagerCompanion.read;
                accessgetSystemNavigationDowncp.IconCompatParcelizer(zzwVar);
                Bitmap bitmap = (Bitmap) LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(zzwVar, 5L, TimeUnit.SECONDS);
                if (bitmap == null) {
                    iconCompat = null;
                } else {
                    iconCompat = new IconCompat(1);
                    iconCompat.IconCompatParcelizer = bitmap;
                }
                getenterdhqq8s.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = iconCompat;
                NotificationCompat$BigPictureStyle notificationCompat$BigPictureStyle = new NotificationCompat$BigPictureStyle();
                if (bitmap == null) {
                    iconCompat2 = null;
                    z = true;
                } else {
                    z = true;
                    iconCompat2 = new IconCompat(1);
                    iconCompat2.IconCompatParcelizer = bitmap;
                }
                notificationCompat$BigPictureStyle.IconCompatParcelizer = iconCompat2;
                notificationCompat$BigPictureStyle.serializer = null;
                notificationCompat$BigPictureStyle.read = z;
                getenterdhqq8s.RemoteActionCompatParcelizer(notificationCompat$BigPictureStyle);
            } catch (InterruptedException unused8) {
                SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                androidAccessibilityManagerCompanion.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e4) {
                SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Failed to download image: " + e4.getCause());
            } catch (TimeoutException unused9) {
                SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                androidAccessibilityManagerCompanion.close();
            }
        }
        int i27 = RatingCompat + 23;
        MediaBrowserCompatMediaItem = i27 % Fields.SpotShadowColor;
        int i28 = i27 % 2;
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) ((FirebaseMessagingService) this.RemoteActionCompatParcelizer).getSystemService(RemoteMessageConst.NOTIFICATION)).notify(str2, 0, getenterdhqq8s.write());
        return true;
    }
}
