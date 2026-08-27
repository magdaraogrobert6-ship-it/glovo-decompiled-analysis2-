package com.huawei.hmf.tasks.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.ProcessingException;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import androidx.emoji2.text.EmojiProcessor;
import androidx.navigation.NavArgsLazy;
import androidx.transition.Transition$1;
import androidx.transition.TransitionValuesMaps;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.gtm.zzkh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.net.zza;
import com.google.firebase.Timestamp;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.gson.Gson;
import com.google.re2j.Parser;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.entity.activity.ActivityRecognitionResult;
import com.huawei.hms.location.entity.activity.DetectedActivity;
import com.huawei.hms.locationSdk.l1;
import com.huawei.hms.locationSdk.l1$$ExternalSyntheticLambda0;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesResponse;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.location.RequestLocationUpdatesTaskCall;
import com.huawei.location.RequestUpdatesExTaskCall;
import com.huawei.location.activity.RiemannSoftArService;
import com.huawei.location.base.activity.callback.ARCallback;
import com.huawei.location.callback.d2;
import com.huawei.location.lite.common.plug.ProductId;
import com.huawei.location.nlp.scan.LW;
import com.huawei.location.router.RouterResponse;
import com.huawei.location.router.entity.StatusInfo;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.credential.outer.GrsCapability;
import com.huawei.wisesecurity.ucs_credential.x;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.mapbox.common.location.LocationProviderRequest;
import com.mapbox.maps.IndoorFloor;
import com.mapbox.maps.IndoorManager;
import com.mapbox.maps.IndoorState;
import com.mapbox.maps.plugin.indoorselector.IndoorSelectorPluginImpl;
import com.mapbox.maps.plugin.indoorselector.IndoorSelectorViewImpl;
import com.mapbox.navigation.base.options.LocationOptions;
import com.roadrunner.diagnostics.presentation.fragment.SettingsNotificationsDiagnosticsFragment;
import com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationDialogFragment;
import com.roadrunner.order.history.presentation.HistoryDialogFragment;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetailsFragment;
import com.roadrunner.rider.state.breakrequest.RequestBreakFragment;
import com.roadrunner.settings.subscreens.appearance.AppearanceFragment;
import com.roadrunner.settings.subscreens.navigation.NavigationSettingsFragment;
import com.sentiance.core.model.events.E$b;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.internal.debugmeta.read;
import io.sentry.util.serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import o.AndroidPlatformTextInputSession;
import o.AnimatablesnapTo2;
import o.AnimatedVisibilityKtAnimatedVisibilityImpl11;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.BringIntoViewModifierNodeKtbringIntoView2;
import o.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import o.ClipScrollableContainerKt;
import o.CollectionInfo_androidKtsetCollectionItemInfoitemInfo1;
import o.CombinedClickableNodehandleDownEvent2;
import o.ConfigureSurfaceToSecondarySessionFailQuirk;
import o.ContentCaptureSessionCompatApi23Impl;
import o.ContentCaptureSessionCompatApi29Impl;
import o.ContentCaptureSessionCompatApi34Impl;
import o.Crossfade;
import o.CrossfadeKtCrossfade51alpha2;
import o.DrawModifierNodeKt;
import o.EnterExitTransitionKtexpandHorizontally2;
import o.EnterExitTransitionKtshrinkHorizontally2;
import o.EnterExitTransitionKtshrinkVertically2;
import o.Fill;
import o.FocusPropertiesImpl;
import o.ImageCaptureFailWithAutoFlashQuirk;
import o.IncorrectCaptureStateQuirk;
import o.InfiniteTransitionrun113;
import o.PendingValue;
import o.PrematureEndOfStreamVideoQuirk;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.SurfaceViewNotCroppedByParentQuirk;
import o.VideoEncoderCrashQuirk;
import o.VideoQualityQuirk;
import o.ViewLayerUniqueDrawingIdApi29;
import o.WindowInfoImplCompanion;
import o.WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2onStateChanged1;
import o.WrappedCompositionsetContent1211;
import o.accessgetButtoncp;
import o.accessgetCoroutineScopep;
import o.accessgetGreencp;
import o.accessgetHasRetrievedMethodcp;
import o.accessgetMaximumFlingVelocityjd;
import o.accessgetMinimumTouchTargetSizeMYxV2XQjd;
import o.accessgetNumPad8cp;
import o.accessgetOutlineProvidercp;
import o.accessgetSevencp;
import o.accessgetShouldUseDispatchDrawcp;
import o.accessgetSlashcp;
import o.accessgetTvTeletextcp;
import o.accessgetViewRootjd;
import o.accessroundToPxR2X_6ojd;
import o.accesstoDpSizekrfVVMjd;
import o.accesstoPxR2X_6ojd;
import o.accesstoRectjd;
import o.acquire;
import o.applyLayoutFeatures;
import o.asList;
import o.calculateMinimumTouchTargetPaddingE7KxVPU;
import o.calculateTotalDurationNanos;
import o.clip;
import o.colorResource;
import o.compareAndSetFactory;
import o.configurePaint2qPWKa0default;
import o.createAndInstallWindowRecomposerui;
import o.d4ExternalSyntheticLambda3;
import o.eotfFunclambda0;
import o.executeQuery;
import o.getActionViewIntentlambda0;
import o.getCameraDistancePx;
import o.getCameraEK5gGoQ;
import o.getCapKaPHkGw;
import o.getCardElevation;
import o.getContentDataType;
import o.getContentInsetLeft;
import o.getDataStoreFileName;
import o.getFailureMessage;
import o.getGlobalKeyboardModifiersui;
import o.getImageo7Vup1c;
import o.getLogLevelfwf_client_release;
import o.getModels;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION;
import o.getShouldUseDispatchDraw;
import o.getSteps;
import o.isHiddenannotations;
import o.isSpecifiedk4lQ0M;
import o.isUnspecifiedk4lQ0Mannotations;
import o.lambdaprocessAndResolveDeeplink15;
import o.mergeJsonObjects;
import o.nativeGetYUVImageVUOff;
import o.newViewStructure;
import o.onCreateActionMode;
import o.r8lambda4ctur6dHthQRF8ridJfgtUMxjY0;
import o.r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdajyieMEPHfDZ0H9VbS9ICj8_yOE;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg;
import o.r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k;
import o.readInstallReferrerHuaweiAppGallery;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;
import o.removeNodeAtDepth;
import o.requestSingleLocationUpdatelambda1;
import o.resetClipBounds;
import o.resizeGraphicFrameIfAppropriatelambda0;
import o.rotateRad0AR0LA0default;
import o.setBrightness;
import o.setContainerSizeozmzZPI;
import o.setInflatedId;
import o.setInitialAnimationsanimation_core;
import o.setOnCopyRequested;
import o.setOrderId;
import o.setSdkAuthenticationSignature;
import o.setShouldUseDispatchDrawui;
import o.setThumbTintList;
import o.updateMenuItemsui;
import o.visitNodes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class i$d implements read, VideoEncoderCrashQuirk, r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34, FocusPropertiesImpl, getCameraDistancePx {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public final /* synthetic */ int write;

    public final class a implements accessgetHasRetrievedMethodcp, getCameraDistancePx, createAndInstallWindowRecomposerui, ARCallback, ContentCaptureSessionCompatApi29Impl, newViewStructure, getImageo7Vup1c, IndoorManager.OnIndoorUpdatedCallback {
        public final /* synthetic */ int RemoteActionCompatParcelizer;
        public Object read;

        public void request(LocationProviderRequest locationProviderRequest) {
            this.read = locationProviderRequest;
        }

        public a(InputStream inputStream, String str) {
            String str2;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            this.RemoteActionCompatParcelizer = 8;
            if (inputStream != null) {
                try {
                    jSONObject = new JSONObject(accessgetMaximumFlingVelocityjd.RemoteActionCompatParcelizer(inputStream));
                } catch (IOException unused) {
                    str2 = "IOException when reading the 'Config' from InputStream.";
                    Log.e("InputStreamReader", str2);
                    jSONObject = new JSONObject();
                } catch (JSONException unused2) {
                    str2 = "JSONException when reading the 'Config' from InputStream.";
                    Log.e("InputStreamReader", str2);
                    jSONObject = new JSONObject();
                }
            } else {
                jSONObject = new JSONObject();
            }
            this.read = jSONObject;
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("appInfos");
                int i = 0;
                while (true) {
                    if (i >= jSONArray.length()) {
                        jSONObject2 = null;
                        break;
                    }
                    jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2.getString("package_name").equals(str)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (jSONObject2 == null) {
                    return;
                }
                String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("/configuration_version", "");
                BigDecimal bigDecimal = new BigDecimal("0.0");
                try {
                    bigDecimal = BigDecimal.valueOf(Double.parseDouble(strRemoteActionCompatParcelizer));
                } catch (NumberFormatException unused3) {
                }
                if (bigDecimal.compareTo(new BigDecimal("2.0")) == 0) {
                    jSONObject.getJSONObject("client").put(HiAnalyticsConstant.BI_KEY_APP_ID, jSONObject2.getString(HiAnalyticsConstant.BI_KEY_APP_ID));
                    return;
                }
                if (bigDecimal.compareTo(new BigDecimal("3.0")) >= 0) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!"package_name".equals(next)) {
                            write(next, jSONObject2.get(next), jSONObject);
                        }
                    }
                }
            } catch (JSONException unused4) {
            }
        }

        public void MediaDescriptionCompat() {
            Class<?> cls;
            StringBuilder sb;
            String str;
            String[] strArrRemoteActionCompatParcelizer;
            x xVar = (x) this.read;
            LinkedHashMap linkedHashMap = (LinkedHashMap) xVar.IconCompatParcelizer;
            if (linkedHashMap.isEmpty()) {
                try {
                    for (Field field : ProductId.class.getDeclaredFields()) {
                        CollectionInfo_androidKtsetCollectionItemInfoitemInfo1 collectionInfo_androidKtsetCollectionItemInfoitemInfo1 = (CollectionInfo_androidKtsetCollectionItemInfoitemInfo1) field.getAnnotation(CollectionInfo_androidKtsetCollectionItemInfoitemInfo1.class);
                        String name = field.getName();
                        if (!(field.get(name) instanceof Integer) || collectionInfo_androidKtsetCollectionItemInfoitemInfo1 == null || (strArrRemoteActionCompatParcelizer = collectionInfo_androidKtsetCollectionItemInfoitemInfo1.RemoteActionCompatParcelizer()) == null || strArrRemoteActionCompatParcelizer.length == 0) {
                            break;
                            break;
                            break;
                            break;
                        }
                        if (field.get(name) instanceof Integer) {
                            linkedHashMap.put((Integer) field.get(name), Arrays.asList(strArrRemoteActionCompatParcelizer));
                        }
                    }
                } catch (IllegalAccessException unused) {
                    WrappedCompositionsetContent1211.read("PluginServiceLoader", "parserProductId");
                }
            }
            ArrayList arrayList = new ArrayList();
            List<String> list = (List) linkedHashMap.get(102);
            if (list != null && !list.isEmpty()) {
                for (String str2 : list) {
                    Class cls2 = (Class) xVar.read;
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) xVar.RemoteActionCompatParcelizer;
                    Object objCast = linkedHashMap2.get(str2);
                    if (objCast == null) {
                        objCast = null;
                        try {
                            cls = Class.forName(str2);
                        } catch (ClassNotFoundException unused2) {
                            WrappedCompositionsetContent1211.read("PluginServiceLoader", "Provider " + str2 + " not found");
                            cls = null;
                        }
                        if (!cls2.isAssignableFrom(cls)) {
                            WrappedCompositionsetContent1211.read("PluginServiceLoader", "Provider " + str2 + " not a subtype");
                        }
                        if (cls != null) {
                            try {
                                objCast = cls2.cast(cls.newInstance());
                            } catch (IllegalAccessException unused3) {
                                sb = new StringBuilder("Provider");
                                sb.append(str2);
                                str = " IllegalAccessException ";
                                sb.append(str);
                                WrappedCompositionsetContent1211.read("PluginServiceLoader", sb.toString());
                            } catch (InstantiationException unused4) {
                                sb = new StringBuilder("Provider");
                                sb.append(str2);
                                str = " InstantiationException ";
                                sb.append(str);
                                WrappedCompositionsetContent1211.read("PluginServiceLoader", sb.toString());
                            }
                        }
                        linkedHashMap2.put(str2, objCast);
                    }
                    arrayList.add(objCast);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it);
            }
        }

        @Override // o.accessgetHasRetrievedMethodcp
        public String RemoteActionCompatParcelizer(String str, String str2) {
            if (!str.endsWith("/")) {
                String[] strArrSplit = str.split("/");
                try {
                    JSONObject jSONObject = (JSONObject) this.read;
                    for (int i = 1; i < strArrSplit.length; i++) {
                        if (i == strArrSplit.length - 1) {
                            str = jSONObject.get(strArrSplit[i]).toString();
                            return str;
                        }
                        jSONObject = jSONObject.getJSONObject(strArrSplit[i]);
                    }
                } catch (JSONException unused) {
                    Log.w("InputStreamReader", "JSONException when reading 'path': ".concat(str));
                    return str2;
                }
            }
            return str2;
        }

        public Pattern RemoteActionCompatParcelizer(String str) {
            Object obj;
            a aVar = (a) this.read;
            synchronized (aVar) {
                obj = ((getLogLevelfwf_client_release) aVar.read).get(str);
            }
            Pattern pattern = (Pattern) obj;
            if (pattern != null) {
                return pattern;
            }
            Pattern patternCompile = Pattern.compile(str);
            a aVar2 = (a) this.read;
            synchronized (aVar2) {
                ((getLogLevelfwf_client_release) aVar2.read).put(str, patternCompile);
            }
            return patternCompile;
        }

        public LocationOptions build() {
            LocationProviderRequest locationProviderRequest = (LocationProviderRequest) this.read;
            locationProviderRequest.getClass();
            return new LocationOptions(locationProviderRequest);
        }

        @Override // o.getImageo7Vup1c
        public String serializer() {
            return this.RemoteActionCompatParcelizer != 24 ? serializer("HA") : serializer("HA");
        }

        @Override // com.mapbox.maps.IndoorManager.OnIndoorUpdatedCallback
        public void onIndoorUpdated(IndoorState indoorState) {
            indoorState.getClass();
            IndoorSelectorPluginImpl indoorSelectorPluginImpl = (IndoorSelectorPluginImpl) this.read;
            if (indoorSelectorPluginImpl.internalSettings.enabled) {
                List<IndoorFloor> floors = indoorState.getFloors();
                String selectedFloorId = indoorState.getSelectedFloorId();
                floors.getClass();
                indoorSelectorPluginImpl.currentFloors = floors;
                indoorSelectorPluginImpl.selectedFloorId = selectedFloorId;
                IndoorSelectorViewImpl indoorSelectorViewImpl = indoorSelectorPluginImpl.indoorSelectorView;
                if (indoorSelectorViewImpl == null) {
                    removeNodeAtDepth.serializer("indoorSelectorView");
                    throw null;
                }
                indoorSelectorViewImpl.updateFloors(selectedFloorId, floors);
                indoorSelectorPluginImpl.updateIndoorVisibility();
            }
        }

        public void RemoteActionCompatParcelizer(d2 d2Var, LocationRequest locationRequest, String str, long j, float f) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, InvocationTargetException {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NativeNetworkProvider", "requestLocationByNative begin: " + locationRequest.toString());
            Class<?> cls = Class.forName("android.location.LocationRequest");
            Object objNewInstance = cls.newInstance();
            Class cls2 = Float.TYPE;
            Class cls3 = Boolean.TYPE;
            Class cls4 = Long.TYPE;
            Method method = cls.getMethod("createFromDeprecatedProvider", String.class, cls4, cls2, cls3);
            Method method2 = cls.getMethod("setFastestInterval", cls4);
            Method method3 = cls.getMethod("setExpireAt", cls4);
            Class cls5 = Integer.TYPE;
            LocationManager.class.getMethod("requestLocationUpdates", cls, LocationListener.class, Looper.class).invoke((LocationManager) this.read, cls.getMethod("setQuality", cls5).invoke(cls.getMethod("setProvider", String.class).invoke(method2.invoke(cls.getMethod("setNumUpdates", cls5).invoke(method3.invoke(method.invoke(objNewInstance, str, Long.valueOf(j), Float.valueOf(f), Boolean.FALSE), Long.valueOf(locationRequest.getExpirationTime())), Integer.valueOf(locationRequest.getNumUpdates())), Long.valueOf(locationRequest.getFastestInterval())), str), Integer.valueOf(locationRequest.getPriority())), d2Var, Looper.getMainLooper());
        }

        public String RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer != 4 ? ((zzu) this.read).RemoteActionCompatParcelizer : ((zzyb) this.read).serializer;
        }

        @Override // com.huawei.location.base.activity.callback.ARCallback
        public void onActivityRecognition(ActivityRecognitionResult activityRecognitionResult) {
            int i = this.RemoteActionCompatParcelizer;
            Object obj = this.read;
            if (i != 12) {
                BringIntoViewModifierNodeKtbringIntoView2 bringIntoViewModifierNodeKtbringIntoView2 = (BringIntoViewModifierNodeKtbringIntoView2) obj;
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SDMSupportManager", "onActivityRecognition");
                if (activityRecognitionResult == null || activityRecognitionResult.getProbableActivities() == null || activityRecognitionResult.getProbableActivities().size() <= 0) {
                    return;
                }
                DetectedActivity detectedActivity = activityRecognitionResult.getProbableActivities().get(0);
                if (detectedActivity != null) {
                    bringIntoViewModifierNodeKtbringIntoView2.MediaSessionCompatToken = detectedActivity.getType();
                }
                if (bringIntoViewModifierNodeKtbringIntoView2.MediaSessionCompatToken != 2 || activityRecognitionResult.getProbableActivities().size() <= 1) {
                    return;
                }
                DetectedActivity detectedActivity2 = activityRecognitionResult.getProbableActivities().get(1);
                if (detectedActivity != null) {
                    bringIntoViewModifierNodeKtbringIntoView2.MediaSessionCompatToken = detectedActivity2.getType();
                    return;
                }
                return;
            }
            setContainerSizeozmzZPI setcontainersizeozmzzpi = (setContainerSizeozmzZPI) obj;
            List<DetectedActivity> probableActivities = activityRecognitionResult.getProbableActivities();
            if (probableActivities == null) {
                WrappedCompositionsetContent1211.read("ATProvider", "detectedActivities is null.");
                return;
            }
            int type = -1;
            int confidence = -1;
            for (int i2 = 0; i2 < probableActivities.size(); i2++) {
                if (probableActivities.get(i2).getType() != 2 && probableActivities.get(i2).getConfidence() > confidence) {
                    type = probableActivities.get(i2).getType();
                    confidence = probableActivities.get(i2).getConfidence();
                }
            }
            WindowInfoImplCompanion.serializer(setcontainersizeozmzzpi.read, "ATProvider", ff$$ExternalSyntheticOutline0.m(type, " GET NEW RESULT : ", " currentStatus is : "));
            setcontainersizeozmzzpi.IconCompatParcelizer = type;
            int i3 = setcontainersizeozmzzpi.read;
            if (i3 == -2) {
                setcontainersizeozmzzpi.read = type;
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ATProvider", "report ！  statu is : " + setcontainersizeozmzzpi.read + " inOrOut is : 1");
                RiemannSoftArService.getInstance().onStatusChanged(type, 1);
                return;
            }
            if (type == i3) {
                if (setcontainersizeozmzzpi.MediaMetadataCompat == 0) {
                    return;
                }
                int i4 = setcontainersizeozmzzpi.RatingCompat + 1;
                setcontainersizeozmzzpi.RatingCompat = i4;
                if (i4 >= 10) {
                    setcontainersizeozmzzpi.MediaMetadataCompat = 0;
                    setcontainersizeozmzzpi.serializer = 0;
                    setcontainersizeozmzzpi.write = 0;
                    setcontainersizeozmzzpi.RatingCompat = 0;
                    return;
                }
                return;
            }
            int i5 = setcontainersizeozmzzpi.serializer + 1;
            setcontainersizeozmzzpi.serializer = i5;
            setcontainersizeozmzzpi.MediaMetadataCompat = 1;
            int i6 = setcontainersizeozmzzpi.RemoteActionCompatParcelizer;
            if (i6 == -2 || i6 == -1) {
                setcontainersizeozmzzpi.RemoteActionCompatParcelizer = type;
                return;
            }
            if (i5 == 10 && i3 != -1) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ATProvider", "report ！  statu is : " + setcontainersizeozmzzpi.read + " inOrOut is : 2");
                RiemannSoftArService.getInstance().onStatusChanged(i3, 2);
                setcontainersizeozmzzpi.read = -1;
            }
            int i7 = setcontainersizeozmzzpi.IconCompatParcelizer;
            if (i7 == setcontainersizeozmzzpi.RemoteActionCompatParcelizer) {
                setcontainersizeozmzzpi.write++;
            } else {
                setcontainersizeozmzzpi.RemoteActionCompatParcelizer = i7;
                setcontainersizeozmzzpi.write = 1;
            }
            if (setcontainersizeozmzzpi.write >= 10) {
                setcontainersizeozmzzpi.MediaMetadataCompat = 0;
                setcontainersizeozmzzpi.serializer = 0;
                setcontainersizeozmzzpi.write = 0;
                setcontainersizeozmzzpi.RatingCompat = 0;
                int i8 = setcontainersizeozmzzpi.RemoteActionCompatParcelizer;
                setcontainersizeozmzzpi.read = i8;
                setcontainersizeozmzzpi.RemoteActionCompatParcelizer = -1;
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ATProvider", "report ！  statu is : " + setcontainersizeozmzzpi.read + " inOrOut is : 1");
                RiemannSoftArService.getInstance().onStatusChanged(i8, 1);
            }
        }

        public String toString() {
            int i = this.RemoteActionCompatParcelizer;
            if (i == 8) {
                return "InputStreamReader{config=" + ((JSONObject) this.read).toString().hashCode() + '}';
            }
            if (i != 25) {
                return super.toString();
            }
            Certificate[] certificateArr = (Certificate[]) this.read;
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("alg", "PS256");
                jSONObject.put("cty", "AndroidKS");
                int length = 3;
                if (certificateArr.length <= 3) {
                    length = certificateArr.length;
                }
                for (int i2 = 0; i2 < length; i2++) {
                    jSONArray.put(accessgetButtoncp.write(2, certificateArr[i2].getEncoded()));
                }
                jSONObject.put("x5c", jSONArray);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("len", 32);
                String string = jSONObject2.toString();
                Charset charset = StandardCharsets.UTF_8;
                jSONObject.put("kid", accessgetButtoncp.write(10, string.getBytes(charset)));
                return accessgetButtoncp.write(10, jSONObject.toString().getBytes(charset));
            } catch (UcsException | CertificateEncodingException | JSONException e) {
                getSteps.serializer("CredentialJws", "generate TAHeader exception: {0}", e.getMessage());
                return "";
            }
        }

        @Override // o.getCameraDistancePx
        public void onComplete(setShouldUseDispatchDrawui setshouldusedispatchdrawui) {
            if (setshouldusedispatchdrawui.serializer()) {
                ((ViewLayerUniqueDrawingIdApi29) ((i$d) this.read).read).read(setshouldusedispatchdrawui.IconCompatParcelizer());
                return;
            }
            boolean z = ((ViewLayerUniqueDrawingIdApi29) setshouldusedispatchdrawui).serializer;
            ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = (ViewLayerUniqueDrawingIdApi29) ((i$d) this.read).read;
            if (z) {
                viewLayerUniqueDrawingIdApi29.write();
            } else {
                viewLayerUniqueDrawingIdApi29.serializer(setshouldusedispatchdrawui.read());
            }
        }

        @Override // o.getImageo7Vup1c
        public String read() {
            if (this.RemoteActionCompatParcelizer != 24) {
                return serializer("ROOT") + "/tsms/v2/credentials";
            }
            return serializer("ROOT") + "/tsms/v2/credentials";
        }

        @Override // o.getImageo7Vup1c
        public String write() {
            if (this.RemoteActionCompatParcelizer != 24) {
                return serializer("CDN") + "tsms/ucscomponent/ucscomponent.jws";
            }
            return serializer("CDN") + "tsms/ucscomponent/ucscomponent.jws";
        }

        public void IconCompatParcelizer(getGlobalKeyboardModifiersui getglobalkeyboardmodifiersui) {
            String str;
            String str2;
            if (getglobalkeyboardmodifiersui.write == null) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPProvider", "locationRequest is invalid");
                return;
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPProvider", "requestLocation, LocationRequest is " + getglobalkeyboardmodifiersui.write.getLocationRequest().toString());
            a aVar = (a) this.read;
            RequestLocationUpdatesRequest requestLocationUpdatesRequest = getglobalkeyboardmodifiersui.write;
            d2 d2Var = getglobalkeyboardmodifiersui.IconCompatParcelizer;
            synchronized (aVar) {
                try {
                    if (requestLocationUpdatesRequest == null || d2Var == null) {
                        WrappedCompositionsetContent1211.read("NativeNetworkProvider", "requestLocationFromNative, illegal argument");
                        return;
                    }
                    LocationRequest locationRequest = requestLocationUpdatesRequest.getLocationRequest();
                    if (locationRequest == null) {
                        WrappedCompositionsetContent1211.read("NativeNetworkProvider", "requestLocationFromNative, illegal argument");
                        return;
                    }
                    int priority = locationRequest.getPriority();
                    String str3 = (priority == 100 || priority == 102 || priority == 104 || priority == 300 || priority == 400) ? "network" : "";
                    if (TextUtils.isEmpty(str3)) {
                        return;
                    }
                    long jMin = Math.min(locationRequest.getInterval(), Long.MAX_VALUE);
                    float fMin = Math.min(locationRequest.getSmallestDisplacement(), Float.MAX_VALUE);
                    try {
                        aVar.RemoteActionCompatParcelizer(d2Var, locationRequest, str3, jMin, fMin);
                    } catch (ClassNotFoundException unused) {
                        str2 = "requestLocationByNative ClassNotFoundException";
                        WrappedCompositionsetContent1211.read("NativeNetworkProvider", str2);
                        aVar.IconCompatParcelizer(str3, jMin, fMin, d2Var);
                    } catch (IllegalAccessException unused2) {
                        str2 = "requestLocationByNative IllegalAccessException";
                        WrappedCompositionsetContent1211.read("NativeNetworkProvider", str2);
                        aVar.IconCompatParcelizer(str3, jMin, fMin, d2Var);
                    } catch (InstantiationException unused3) {
                        str2 = "requestLocationByNative InstantiationException";
                        WrappedCompositionsetContent1211.read("NativeNetworkProvider", str2);
                        aVar.IconCompatParcelizer(str3, jMin, fMin, d2Var);
                    } catch (NoSuchMethodException unused4) {
                        str2 = "requestLocationByNative NoSuchMethodException";
                        WrappedCompositionsetContent1211.read("NativeNetworkProvider", str2);
                        aVar.IconCompatParcelizer(str3, jMin, fMin, d2Var);
                    } catch (SecurityException unused5) {
                        str = "requestLocationByNative SecurityException";
                        WrappedCompositionsetContent1211.read("NativeNetworkProvider", str);
                    } catch (InvocationTargetException unused6) {
                        str2 = "requestLocationByNative InvocationTargetException";
                        WrappedCompositionsetContent1211.read("NativeNetworkProvider", str2);
                        aVar.IconCompatParcelizer(str3, jMin, fMin, d2Var);
                    } catch (Exception unused7) {
                        str = "requestLocationByNative other exception";
                        WrappedCompositionsetContent1211.read("NativeNetworkProvider", str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public String serializer(String str) {
            if (this.RemoteActionCompatParcelizer != 24) {
                String strSynGetGrsUrl = ((GrsClient) this.read).synGetGrsUrl("com.huawei.tsms", str);
                getSteps.read("InnerGrsUrlImpl", "synGetGrsUrl : {0}", strSynGetGrsUrl);
                return strSynGetGrsUrl;
            }
            String strSynGetGrsUrl2 = ((GrsCapability) this.read).synGetGrsUrl("com.huawei.tsms", str);
            getSteps.read("OuterGrsUrlImpl", "synGetGrsUrl : {0}", strSynGetGrsUrl2);
            return strSynGetGrsUrl2;
        }

        public static void write(String str, Object obj, JSONObject jSONObject) throws JSONException {
            if (str == null || obj == null || jSONObject == null) {
                return;
            }
            if (!(obj instanceof JSONObject)) {
                jSONObject.put(str, obj);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                write(next, jSONObject2.get(next), jSONObject.getJSONObject(str));
            }
        }

        public /* synthetic */ a(int i, boolean z) {
            this.RemoteActionCompatParcelizer = i;
        }

        public a(Context context, String str) {
            String str2;
            this.RemoteActionCompatParcelizer = 9;
            String strSerializer = accessgetShouldUseDispatchDrawcp.serializer(context, str, "agc_plugin_", "crypto");
            if (strSerializer != null) {
                try {
                    str2 = new String(accessgetMinimumTouchTargetSizeMYxV2XQjd.IconCompatParcelizer(strSerializer), "utf-8");
                } catch (UnsupportedEncodingException | IllegalArgumentException e) {
                    Log.e("ReaderStrategy", "UnsupportedEncodingException" + e.getMessage());
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            this.read = !TextUtils.isEmpty(str2) ? new accessgetOutlineProvidercp(context, str, 1) : new accessgetOutlineProvidercp(context, str, 0);
        }

        public /* synthetic */ a(int i, Object obj) {
            this.RemoteActionCompatParcelizer = i;
            this.read = obj;
        }

        public a(int i) {
            this.RemoteActionCompatParcelizer = i;
            int i2 = 28;
            if (i == 16) {
                this.read = new Transition$1(i2);
            } else {
                if (i != 28) {
                    a aVar = new a(1, false);
                    aVar.read = new getLogLevelfwf_client_release(aVar, 134);
                    this.read = aVar;
                    return;
                }
                this.read = LocationOptions.DEFAULT_REQUEST;
            }
        }

        @Override // o.createAndInstallWindowRecomposerui, o.newViewStructure
        public void MediaBrowserCompatMediaItem() {
            int i = this.RemoteActionCompatParcelizer;
            if (i == 10) {
                ((RequestLocationUpdatesTaskCall) this.read).onComplete(new RouterResponse(new Gson().toJson(new RequestLocationUpdatesResponse()), new StatusInfo(0, 0, "success")));
                return;
            }
            if (i == 11) {
                ((RequestUpdatesExTaskCall) this.read).onComplete(new RouterResponse(new Gson().toJson(new RequestLocationUpdatesResponse()), new StatusInfo(0, 0, "success")));
                return;
            }
            if (i != 18) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("OnlyWifi", "wifi scan fail, code is 10000");
            } else {
                if (((setOnCopyRequested) this.read).MediaSessionCompatQueueItem) {
                    return;
                }
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPClient", "isCacheAvailable is false, do request");
                onCreateActionMode.write.IconCompatParcelizer(new ZM$$ExternalSyntheticLambda2(1, this));
            }
        }

        public void read(getGlobalKeyboardModifiersui getglobalkeyboardmodifiersui) {
            String str;
            d2 d2Var = getglobalkeyboardmodifiersui.IconCompatParcelizer;
            if (d2Var != null) {
                a aVar = (a) this.read;
                synchronized (aVar) {
                    try {
                        ((LocationManager) aVar.read).removeUpdates(d2Var);
                    } catch (IllegalArgumentException unused) {
                        str = "removeUpdates, IllegalArgumentException";
                        WrappedCompositionsetContent1211.read("NativeNetworkProvider", str);
                    } catch (SecurityException unused2) {
                        str = "removeUpdates, SecurityException";
                        WrappedCompositionsetContent1211.read("NativeNetworkProvider", str);
                    } catch (Exception unused3) {
                        str = "removeUpdates, other exception";
                        WrappedCompositionsetContent1211.read("NativeNetworkProvider", str);
                    }
                }
            }
            if (getglobalkeyboardmodifiersui.write != null) {
                setOnCopyRequested.IconCompatParcelizer().read(getglobalkeyboardmodifiersui.write);
            }
        }

        @Override // o.createAndInstallWindowRecomposerui
        public void IconCompatParcelizer(RouterResponse routerResponse) {
            if (this.RemoteActionCompatParcelizer != 10) {
                ((RequestUpdatesExTaskCall) this.read).doExecute(routerResponse);
            } else {
                ((RequestLocationUpdatesTaskCall) this.read).doExecute(routerResponse);
            }
        }

        public void IconCompatParcelizer(String str, long j, float f, d2 d2Var) {
            String str2;
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m("requestLocationByAPI: provider: ", str, j, ", minTime: ");
            sbM.append(", minDistance: ");
            sbM.append(f);
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NativeNetworkProvider", sbM.toString());
            try {
                ((LocationManager) this.read).requestLocationUpdates(str, j, f, d2Var, Looper.getMainLooper());
            } catch (IllegalArgumentException unused) {
                str2 = "deratedRequest IllegalArgumentException";
                WrappedCompositionsetContent1211.read("LocationManagerAdapter", str2);
            } catch (SecurityException unused2) {
                str2 = "deratedRequest SecurityException";
                WrappedCompositionsetContent1211.read("LocationManagerAdapter", str2);
            } catch (Exception unused3) {
                str2 = "deratedRequest other exception";
                WrappedCompositionsetContent1211.read("LocationManagerAdapter", str2);
            }
        }

        @Override // o.ContentCaptureSessionCompatApi29Impl, o.newViewStructure
        public void RemoteActionCompatParcelizer(List list) {
            String str;
            if (this.RemoteActionCompatParcelizer != 19) {
                if (list.isEmpty()) {
                    WrappedCompositionsetContent1211.read("OnlyWifi", "scan wifi success, scanResultList is empty");
                    return;
                }
                ContentCaptureSessionCompatApi23Impl contentCaptureSessionCompatApi23Impl = (ContentCaptureSessionCompatApi23Impl) this.read;
                Pair pairIconCompatParcelizer = LW.IconCompatParcelizer(list);
                List list2 = (List) pairIconCompatParcelizer.second;
                if (list2.size() < 1) {
                    str = "handlerWifiScanFail, filterResult is empty";
                } else {
                    if (!LW.IconCompatParcelizer(list2, updateMenuItemsui.read().RemoteActionCompatParcelizer)) {
                        updateMenuItemsui updatemenuitemsui = updateMenuItemsui.read();
                        updatemenuitemsui.getClass();
                        updatemenuitemsui.MediaMetadataCompat = ((Long) pairIconCompatParcelizer.first).longValue();
                        updatemenuitemsui.RemoteActionCompatParcelizer = (List) pairIconCompatParcelizer.second;
                        contentCaptureSessionCompatApi23Impl.read = false;
                        contentCaptureSessionCompatApi23Impl.PlaybackStateCompatCustomAction.MediaBrowserCompatMediaItem();
                        return;
                    }
                    str = "The Wi-Fi scanning result is the same as that in the cache.";
                }
                WrappedCompositionsetContent1211.read("OnlyWifi", str);
                return;
            }
            ContentCaptureSessionCompatApi23Impl contentCaptureSessionCompatApi23Impl2 = (ContentCaptureSessionCompatApi23Impl) this.read;
            if (list == null || list.isEmpty()) {
                WrappedCompositionsetContent1211.read("OnlyCell", "scan cell success, cellInfoList is empty");
                return;
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("OnlyCell", "cell scan success, result size is " + list.size());
            updateMenuItemsui.read().IconCompatParcelizer(contentCaptureSessionCompatApi23Impl2.serializer(list));
            contentCaptureSessionCompatApi23Impl2.read = false;
            contentCaptureSessionCompatApi23Impl2.PlaybackStateCompatCustomAction.MediaBrowserCompatMediaItem();
        }

        public static int IconCompatParcelizer() {
            int i;
            String strWrite = WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2onStateChanged1.serializer.write("geo_position_type");
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ScanTask", "getConfig, model is " + strWrite);
            if (TextUtils.isEmpty(strWrite)) {
                i = 0;
            } else {
                try {
                    i = Integer.parseInt(strWrite);
                } catch (NumberFormatException unused) {
                    WrappedCompositionsetContent1211.read("ScanTask", "scan model parse fail, NumberFormatException");
                    i = 0;
                }
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ScanTask", "final model is " + i);
            return i;
        }
    }

    public String read(eotfFunclambda0 eotffunclambda0) {
        String str;
        synchronized (((rotateRad0AR0LA0default) this.serializer)) {
            str = (String) ((rotateRad0AR0LA0default) this.serializer).IconCompatParcelizer(eotffunclambda0);
        }
        if (str == null) {
            configurePaint2qPWKa0default configurepaint2qpwka0default = (configurePaint2qPWKa0default) ((EmojiProcessor) this.read).write();
            try {
                eotffunclambda0.serializer(configurepaint2qpwka0default.RemoteActionCompatParcelizer);
                byte[] bArrDigest = configurepaint2qpwka0default.RemoteActionCompatParcelizer.digest();
                char[] cArr = Fill.IconCompatParcelizer;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = Fill.RemoteActionCompatParcelizer;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
                ((EmojiProcessor) this.read).IconCompatParcelizer(configurepaint2qpwka0default);
            } catch (Throwable th) {
                ((EmojiProcessor) this.read).IconCompatParcelizer(configurepaint2qpwka0default);
                throw th;
            }
        }
        synchronized (((rotateRad0AR0LA0default) this.serializer)) {
            ((rotateRad0AR0LA0default) this.serializer).write(eotffunclambda0, str);
        }
        return str;
    }

    public void read(int i, int i2, long j, long j2) {
        synchronized (this) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (((AtomicLong) this.read).get() != -1 && jElapsedRealtime - ((AtomicLong) this.read).get() <= 1800000) {
                return;
            }
            ((accessgetSlashcp) this.serializer).serializer(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, 0, j, j2, null, null, 0, -1)))).addOnFailureListener(new resizeGraphicFrameIfAppropriatelambda0(jElapsedRealtime, 5, this));
        }
    }

    public i$d(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation, int i) {
        this.write = i;
        if (i == 16) {
            this.serializer = getstyleable_vector_drawable_group_rotation;
            this.read = new readInstallReferrerHuaweiAppGallery(20);
            return;
        }
        if (i == 18) {
            this.serializer = getstyleable_vector_drawable_group_rotation;
            acquire acquireVar = new acquire(getstyleable_vector_drawable_group_rotation.setItemInvoker, getstyleable_vector_drawable_group_rotation.accessprocessDragStart, 21);
            mergeJsonObjects mergejsonobjects = getstyleable_vector_drawable_group_rotation.toClipEntry;
            this.read = new r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4(acquireVar, mergejsonobjects, new acquire(mergejsonobjects, getstyleable_vector_drawable_group_rotation.getEditsText, 24), new getFailureMessage(getstyleable_vector_drawable_group_rotation.AbstractClickableNodeonKeyEvent1, mergejsonobjects, getstyleable_vector_drawable_group_rotation.PreviewPixelHDRnetQuirk, getstyleable_vector_drawable_group_rotation.Contentfoundation, 5), getstyleable_vector_drawable_group_rotation.setContentInsetStartWithNavigation);
            return;
        }
        if (i != 19) {
            this.serializer = getstyleable_vector_drawable_group_rotation;
            this.read = new isHiddenannotations(new executeQuery(getstyleable_vector_drawable_group_rotation.shutdown, 11), getstyleable_vector_drawable_group_rotation.getEntries, getstyleable_vector_drawable_group_rotation.toClipEntry, getstyleable_vector_drawable_group_rotation.trimToSize, 4);
            return;
        }
        this.serializer = getstyleable_vector_drawable_group_rotation;
        mergeJsonObjects mergejsonobjects2 = getstyleable_vector_drawable_group_rotation.toClipEntry;
        lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15 = new lambdaprocessAndResolveDeeplink15(mergejsonobjects2, 28);
        requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1 = new requestSingleLocationUpdatelambda1(getstyleable_vector_drawable_group_rotation.backgroundbw27NRU, 5);
        mergeJsonObjects mergejsonobjects3 = getstyleable_vector_drawable_group_rotation.FlingCancellationException;
        this.read = new getModels(mergejsonobjects3, lambdaprocessandresolvedeeplink15, new setOrderId(mergejsonobjects3, requestsinglelocationupdatelambda1, 1), new setOrderId(mergejsonobjects3, requestsinglelocationupdatelambda1, 0), mergejsonobjects2, getstyleable_vector_drawable_group_rotation.trimToSize, new lambdaprocessAndResolveDeeplink15(getstyleable_vector_drawable_group_rotation.setItemInvoker, 27));
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0127 A[Catch: all -> 0x01d5, TryCatch #0 {, blocks: (B:36:0x00dc, B:37:0x00e2, B:70:0x0170, B:39:0x00e7, B:40:0x00f0, B:43:0x00f6, B:44:0x00fd, B:47:0x0101, B:48:0x0108, B:49:0x011d, B:52:0x0121, B:54:0x0127, B:56:0x0131, B:57:0x0138, B:58:0x014d, B:59:0x014e, B:61:0x0154, B:64:0x0159, B:65:0x0160, B:66:0x0161, B:67:0x0168, B:68:0x0169), top: B:93:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0131 A[Catch: all -> 0x01d5, TryCatch #0 {, blocks: (B:36:0x00dc, B:37:0x00e2, B:70:0x0170, B:39:0x00e7, B:40:0x00f0, B:43:0x00f6, B:44:0x00fd, B:47:0x0101, B:48:0x0108, B:49:0x011d, B:52:0x0121, B:54:0x0127, B:56:0x0131, B:57:0x0138, B:58:0x014d, B:59:0x014e, B:61:0x0154, B:64:0x0159, B:65:0x0160, B:66:0x0161, B:67:0x0168, B:68:0x0169), top: B:93:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0138 A[Catch: all -> 0x01d5, TryCatch #0 {, blocks: (B:36:0x00dc, B:37:0x00e2, B:70:0x0170, B:39:0x00e7, B:40:0x00f0, B:43:0x00f6, B:44:0x00fd, B:47:0x0101, B:48:0x0108, B:49:0x011d, B:52:0x0121, B:54:0x0127, B:56:0x0131, B:57:0x0138, B:58:0x014d, B:59:0x014e, B:61:0x0154, B:64:0x0159, B:65:0x0160, B:66:0x0161, B:67:0x0168, B:68:0x0169), top: B:93:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:59:0x014e A[Catch: all -> 0x01d5, TryCatch #0 {, blocks: (B:36:0x00dc, B:37:0x00e2, B:70:0x0170, B:39:0x00e7, B:40:0x00f0, B:43:0x00f6, B:44:0x00fd, B:47:0x0101, B:48:0x0108, B:49:0x011d, B:52:0x0121, B:54:0x0127, B:56:0x0131, B:57:0x0138, B:58:0x014d, B:59:0x014e, B:61:0x0154, B:64:0x0159, B:65:0x0160, B:66:0x0161, B:67:0x0168, B:68:0x0169), top: B:93:0x00dc }] */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0138, please report this as an issue */
    @Override // o.VideoEncoderCrashQuirk
    public void a_(Object obj) {
        boolean z;
        EnterExitTransitionKtshrinkHorizontally2 enterExitTransitionKtshrinkHorizontally2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.write;
        if (i == 5) {
            ((IncorrectCaptureStateQuirk) this.read).read.MediaMetadataCompat();
            return;
        }
        int i2 = 6;
        if (i == 6) {
            SurfaceViewNotCroppedByParentQuirk surfaceViewNotCroppedByParentQuirk = (SurfaceViewNotCroppedByParentQuirk) obj;
            surfaceViewNotCroppedByParentQuirk.getClass();
            try {
                ((getCardElevation) ((DropShadowEffect) this.read).read).read(surfaceViewNotCroppedByParentQuirk);
                return;
            } catch (ProcessingException e) {
                setInflatedId.read("DualSurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
                return;
            }
        }
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        int i3 = 0;
        if (i != 7) {
            UtilsKt.RemoteActionCompatParcelizer("Unexpected result from SurfaceRequest. Surface was provided twice.", ((getContentInsetLeft) obj).serializer != 3);
            setInflatedId.IconCompatParcelizer(3, "TextureViewImpl");
            ((SurfaceTexture) this.serializer).release();
            CombinedClickableNodehandleDownEvent2 combinedClickableNodehandleDownEvent2 = ((ClipScrollableContainerKt) this.read).IconCompatParcelizer;
            if (combinedClickableNodehandleDownEvent2.write != null) {
                combinedClickableNodehandleDownEvent2.write = null;
                return;
            }
            return;
        }
        EncoderImpl encoderImpl = (EncoderImpl) obj;
        Objects.toString(encoderImpl);
        setInflatedId.IconCompatParcelizer(3, "Recorder");
        if (encoderImpl == null) {
            return;
        }
        UtilsKt.RemoteActionCompatParcelizer((String) null, ((AnimatedVisibilityKtAnimatedVisibilityImpl11) ((EnterExitTransitionKtshrinkVertically2) this.read).RatingCompat).defaultViewModelProviderFactory_delegatelambda0 == ((r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg) this.serializer));
        UtilsKt.RemoteActionCompatParcelizer((String) null, ((AnimatedVisibilityKtAnimatedVisibilityImpl11) ((EnterExitTransitionKtshrinkVertically2) this.read).RatingCompat)._init_lambda1 == null);
        AnimatedVisibilityKtAnimatedVisibilityImpl11 animatedVisibilityKtAnimatedVisibilityImpl11 = (AnimatedVisibilityKtAnimatedVisibilityImpl11) ((EnterExitTransitionKtshrinkVertically2) this.read).RatingCompat;
        r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg = (r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg) this.serializer;
        PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk = animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        EncoderImpl encoderImpl2 = (EncoderImpl) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.RemoteActionCompatParcelizer;
        encoderImpl2.getClass();
        animatedVisibilityKtAnimatedVisibilityImpl11._init_lambda1 = encoderImpl2;
        animatedVisibilityKtAnimatedVisibilityImpl11._init_lambda4.read(((setInitialAnimationsanimation_core) encoderImpl2.PlaybackStateCompat).serializer());
        MediaFormat mediaFormat = animatedVisibilityKtAnimatedVisibilityImpl11._init_lambda1.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (mediaFormat.containsKey("bitrate")) {
            mediaFormat.getInteger("bitrate");
        }
        Surface surface = ((AnimatablesnapTo2) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaMetadataCompat) == AnimatablesnapTo2.READY ? (Surface) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatQueueItem : null;
        animatedVisibilityKtAnimatedVisibilityImpl11.MediaMetadataCompat = surface;
        animatedVisibilityKtAnimatedVisibilityImpl11.IconCompatParcelizer(surface);
        CrossfadeKtCrossfade51alpha2 crossfadeKtCrossfade51alpha2 = new CrossfadeKtCrossfade51alpha2(animatedVisibilityKtAnimatedVisibilityImpl11);
        r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaBrowserCompatMediaItem = previewFreezeAfterHighSpeedRecordingQuirk;
        r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaDescriptionCompat = crossfadeKtCrossfade51alpha2;
        DrawModifierNodeKt drawModifierNodeKtWrite = VideoQualityQuirk.write((DrawModifierNodeKt) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatResultReceiverWrapper);
        drawModifierNodeKtWrite.RemoteActionCompatParcelizer(new zza((Object) drawModifierNodeKtWrite, (int) (z7 ? 1 : 0), (Object) new colorResource(animatedVisibilityKtAnimatedVisibilityImpl11, i2, r8lambdauosl1ojcz1lncaiooglfrbn5pcg)), previewFreezeAfterHighSpeedRecordingQuirk);
        AnimatedVisibilityKtAnimatedVisibilityImpl11 animatedVisibilityKtAnimatedVisibilityImpl12 = (AnimatedVisibilityKtAnimatedVisibilityImpl11) ((EnterExitTransitionKtshrinkVertically2) this.read).RatingCompat;
        synchronized (animatedVisibilityKtAnimatedVisibilityImpl12.ResultReceiver) {
            switch (animatedVisibilityKtAnimatedVisibilityImpl12.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.ordinal()) {
                case 0:
                    animatedVisibilityKtAnimatedVisibilityImpl12.IconCompatParcelizer(EnterExitTransitionKtshrinkHorizontally2.IDLING);
                    z4 = false;
                    z2 = false;
                    break;
                case 1:
                    z = false;
                    if (animatedVisibilityKtAnimatedVisibilityImpl12.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs == InfiniteTransitionrun113.INACTIVE) {
                        enterExitTransitionKtshrinkHorizontally2 = animatedVisibilityKtAnimatedVisibilityImpl12.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                        if (enterExitTransitionKtshrinkHorizontally2 != EnterExitTransitionKtshrinkHorizontally2.PENDING_PAUSED && enterExitTransitionKtshrinkHorizontally2 != EnterExitTransitionKtshrinkHorizontally2.PENDING_RECORDING) {
                            throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
                        }
                        throw new AssertionError("Pending recording should exist when in a PENDING state.");
                    }
                    if (AnimatedVisibilityKtAnimatedVisibilityImpl11.write.contains(animatedVisibilityKtAnimatedVisibilityImpl12.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0)) {
                        throw new AssertionError("Cannot restore non-pending state when in state " + animatedVisibilityKtAnimatedVisibilityImpl12.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                    }
                    animatedVisibilityKtAnimatedVisibilityImpl12.IconCompatParcelizer(animatedVisibilityKtAnimatedVisibilityImpl12.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                    z2 = false;
                    z4 = z;
                    break;
                    break;
                case 2:
                    z = true;
                    if (animatedVisibilityKtAnimatedVisibilityImpl12.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs == InfiniteTransitionrun113.INACTIVE) {
                        enterExitTransitionKtshrinkHorizontally2 = animatedVisibilityKtAnimatedVisibilityImpl12.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                        if (enterExitTransitionKtshrinkHorizontally2 != EnterExitTransitionKtshrinkHorizontally2.PENDING_PAUSED) {
                            throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
                        }
                        throw new AssertionError("Pending recording should exist when in a PENDING state.");
                    }
                    if (AnimatedVisibilityKtAnimatedVisibilityImpl11.write.contains(animatedVisibilityKtAnimatedVisibilityImpl12.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0)) {
                        throw new AssertionError("Cannot restore non-pending state when in state " + animatedVisibilityKtAnimatedVisibilityImpl12.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                    }
                    animatedVisibilityKtAnimatedVisibilityImpl12.IconCompatParcelizer(animatedVisibilityKtAnimatedVisibilityImpl12.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                    z2 = false;
                    z4 = z;
                    break;
                    break;
                case 3:
                case 7:
                    throw new AssertionError("Incorrectly invoke onConfigured() in state " + animatedVisibilityKtAnimatedVisibilityImpl12.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                case 4:
                    z3 = false;
                    UtilsKt.RemoteActionCompatParcelizer("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", false);
                    z2 = true;
                    z4 = z3;
                    break;
                case 5:
                    z3 = true;
                    UtilsKt.RemoteActionCompatParcelizer("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", false);
                    z2 = true;
                    z4 = z3;
                    break;
                case 6:
                    if (!animatedVisibilityKtAnimatedVisibilityImpl12.PlaybackStateCompatCustomAction) {
                        throw new AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                    }
                    z4 = false;
                    z2 = false;
                    break;
                    break;
                case 8:
                    setInflatedId.serializer("Recorder", "onConfigured() was invoked when the Recorder had encountered error");
                    z4 = false;
                    z2 = false;
                    break;
                default:
                    z4 = false;
                    z2 = false;
                    break;
            }
        }
        if (z2) {
            ArrayList arrayList = animatedVisibilityKtAnimatedVisibilityImpl12.MediaSessionCompatResultReceiverWrapper;
            if (!arrayList.isEmpty()) {
                PendingValue pendingValueWrite = VideoQualityQuirk.write(arrayList);
                if (!pendingValueWrite.isDone()) {
                    pendingValueWrite.cancel(true);
                }
                arrayList.clear();
            }
            arrayList.add(UtilsKt.RemoteActionCompatParcelizer(new CrossfadeKtCrossfade51alpha2(animatedVisibilityKtAnimatedVisibilityImpl12)));
            EnterExitTransitionKtexpandHorizontally2 enterExitTransitionKtexpandHorizontally2 = EnterExitTransitionKtexpandHorizontally2.INITIALIZING;
            PendingValue pendingValueWrite2 = VideoQualityQuirk.write(arrayList);
            pendingValueWrite2.RemoteActionCompatParcelizer(new zza((Object) pendingValueWrite2, (int) (z6 ? 1 : 0), (Object) new j(animatedVisibilityKtAnimatedVisibilityImpl12)), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
            EncoderImpl encoderImpl3 = animatedVisibilityKtAnimatedVisibilityImpl12._init_lambda1;
            encoderImpl3.RatingCompat.execute(new calculateTotalDurationNanos(encoderImpl3, encoderImpl3._init_lambda3.MediaSessionCompatQueueItem(), z5 ? 1 : 0));
            if (z4) {
                EncoderImpl encoderImpl4 = animatedVisibilityKtAnimatedVisibilityImpl12._init_lambda1;
                encoderImpl4.RatingCompat.execute(new calculateTotalDurationNanos(encoderImpl4, encoderImpl4._init_lambda3.MediaSessionCompatQueueItem(), i3));
            }
        }
    }

    public void serializer() {
        ContentCaptureSessionCompatApi34Impl contentCaptureSessionCompatApi34Impl;
        Object obj;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 11;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            contentCaptureSessionCompatApi34Impl = (ContentCaptureSessionCompatApi34Impl) this.serializer;
            obj = getCameraEK5gGoQ.IconCompatParcelizer;
            i = 0;
        } else {
            contentCaptureSessionCompatApi34Impl = (ContentCaptureSessionCompatApi34Impl) this.serializer;
            obj = getCameraEK5gGoQ.IconCompatParcelizer;
            i = 1;
        }
        contentCaptureSessionCompatApi34Impl.removeMessages(i, obj);
        int i4 = RemoteActionCompatParcelizer + 99;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void read(i$d i_d, clip clipVar, float f, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 121;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            f = Dp.m3673constructorimpl(0.0f);
        }
        i_d.serializer(clipVar, f, Dp.m3673constructorimpl(0.0f));
        int i4 = RemoteActionCompatParcelizer + 91;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.VideoEncoderCrashQuirk
    public void write(Throwable th) {
        int i = this.write;
        if (i == 5) {
            IncorrectCaptureStateQuirk incorrectCaptureStateQuirk = (IncorrectCaptureStateQuirk) this.read;
            accessgetGreencp accessgetgreencp = (accessgetGreencp) this.serializer;
            if (((ImageCaptureFailWithAutoFlashQuirk) accessgetgreencp.write).MediaMetadataCompat) {
                return;
            }
            int iSerializer = ((nativeGetYUVImageVUOff) ((ArrayList) accessgetgreencp.IconCompatParcelizer).get(0)).serializer();
            boolean z = th instanceof ImageCaptureException;
            DropShadowEffect dropShadowEffect = incorrectCaptureStateQuirk.RemoteActionCompatParcelizer;
            if (z) {
                CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk captureSessionStuckWhenCreatingBeforeClosingCameraQuirk = new CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk(iSerializer, (ImageCaptureException) th);
                dropShadowEffect.getClass();
                PrematureEndOfStreamVideoQuirk.write();
                ((ConfigureSurfaceToSecondarySessionFailQuirk) dropShadowEffect.MediaDescriptionCompat).serializer.accept(captureSessionStuckWhenCreatingBeforeClosingCameraQuirk);
            } else {
                CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk captureSessionStuckWhenCreatingBeforeClosingCameraQuirk2 = new CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk(iSerializer, new ImageCaptureException(2, "Failed to submit capture request", th));
                dropShadowEffect.getClass();
                PrematureEndOfStreamVideoQuirk.write();
                ((ConfigureSurfaceToSecondarySessionFailQuirk) dropShadowEffect.MediaDescriptionCompat).serializer.accept(captureSessionStuckWhenCreatingBeforeClosingCameraQuirk2);
            }
            incorrectCaptureStateQuirk.read.MediaMetadataCompat();
            return;
        }
        if (i == 6) {
            int i2 = ((setBrightness) this.serializer).PlaybackStateCompatCustomAction;
            if (i2 == 2 && (th instanceof CancellationException)) {
                setInflatedId.IconCompatParcelizer(3, "DualSurfaceProcessorNode");
                return;
            }
            setInflatedId.RemoteActionCompatParcelizer("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + r8lambdajyieMEPHfDZ0H9VbS9ICj8_yOE.write(i2), th);
            return;
        }
        if (i != 7) {
            throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }
        setInflatedId.RemoteActionCompatParcelizer("Recorder", "VideoEncoder Setup error: " + th, th);
        EnterExitTransitionKtshrinkVertically2 enterExitTransitionKtshrinkVertically2 = (EnterExitTransitionKtshrinkVertically2) this.read;
        int i3 = enterExitTransitionKtshrinkVertically2.write;
        if (i3 < enterExitTransitionKtshrinkVertically2.serializer) {
            enterExitTransitionKtshrinkVertically2.write = i3 + 1;
            Preview$$ExternalSyntheticLambda0 preview$$ExternalSyntheticLambda0 = new Preview$$ExternalSyntheticLambda0(23, this);
            enterExitTransitionKtshrinkVertically2.IconCompatParcelizer = removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().schedule(new Crossfade(((AnimatedVisibilityKtAnimatedVisibilityImpl11) enterExitTransitionKtshrinkVertically2.RatingCompat).r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, 13, preview$$ExternalSyntheticLambda0), AnimatedVisibilityKtAnimatedVisibilityImpl11.RatingCompat, TimeUnit.MILLISECONDS);
            return;
        }
        AnimatedVisibilityKtAnimatedVisibilityImpl11 animatedVisibilityKtAnimatedVisibilityImpl11 = (AnimatedVisibilityKtAnimatedVisibilityImpl11) enterExitTransitionKtshrinkVertically2.RatingCompat;
        synchronized (animatedVisibilityKtAnimatedVisibilityImpl11.ResultReceiver) {
            switch (animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.ordinal()) {
                case 0:
                case 1:
                case 2:
                    animatedVisibilityKtAnimatedVisibilityImpl11.RemoteActionCompatParcelizer(-1);
                    animatedVisibilityKtAnimatedVisibilityImpl11.IconCompatParcelizer(EnterExitTransitionKtshrinkHorizontally2.ERROR);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    throw new AssertionError("Encountered encoder setup error while in unexpected state " + animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + ": " + th);
            }
        }
    }

    public void read() {
        int i = 2 % 2;
        NavArgsLazy navArgsLazy = (NavArgsLazy) this.serializer;
        if (navArgsLazy != null) {
            int i2 = IconCompatParcelizer + 29;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ((AtomicBoolean) navArgsLazy.read).set(true);
            ((ScheduledFuture) navArgsLazy.MediaSessionCompatQueueItem).cancel(true);
            int i4 = RemoteActionCompatParcelizer + 71;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        this.serializer = null;
    }

    public Boolean IconCompatParcelizer(KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 73;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (keyEvent != null) {
            int i4 = i2 + 95;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0 ? keyEvent.getKeyCode() == 4 : keyEvent.getKeyCode() == 5) {
                if (keyEvent.getAction() == 1) {
                    View.OnClickListener onClickListener = (View.OnClickListener) this.read;
                    if (onClickListener == null) {
                        return Boolean.FALSE;
                    }
                    int i5 = IconCompatParcelizer + 5;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        onClickListener.onClick((ViewGroup) this.serializer);
                        return Boolean.TRUE;
                    }
                    onClickListener.onClick((ViewGroup) this.serializer);
                    Boolean bool = Boolean.TRUE;
                    obj.hashCode();
                    throw null;
                }
            }
        }
        int i6 = IconCompatParcelizer + 51;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return null;
    }

    public boolean IconCompatParcelizer(visitNodes visitnodes) {
        int i = 2 % 2;
        zzkh zzkhVarIconCompatParcelizer = ((asList) this.serializer).IconCompatParcelizer(new calculateMinimumTouchTargetPaddingE7KxVPU(visitnodes, 0));
        if (!((Iterator) zzkhVarIconCompatParcelizer.RemoteActionCompatParcelizer).hasNext()) {
            int i2 = RemoteActionCompatParcelizer + 41;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        boolean zEquals = ((calculateMinimumTouchTargetPaddingE7KxVPU) zzkhVarIconCompatParcelizer.next()).read.equals(visitnodes);
        int i4 = RemoteActionCompatParcelizer + 41;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zEquals;
    }

    public asList write(int i) {
        int i2 = 2 % 2;
        zzkh zzkhVarIconCompatParcelizer = ((asList) this.read).IconCompatParcelizer(new calculateMinimumTouchTargetPaddingE7KxVPU(visitNodes.RemoteActionCompatParcelizer(), i));
        asList aslistIconCompatParcelizer = visitNodes.IconCompatParcelizer;
        int i3 = RemoteActionCompatParcelizer + 75;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        while (((Iterator) zzkhVarIconCompatParcelizer.RemoteActionCompatParcelizer).hasNext()) {
            calculateMinimumTouchTargetPaddingE7KxVPU calculateminimumtouchtargetpaddinge7kxvpu = (calculateMinimumTouchTargetPaddingE7KxVPU) zzkhVarIconCompatParcelizer.next();
            if (calculateminimumtouchtargetpaddinge7kxvpu.IconCompatParcelizer != i) {
                break;
            }
            int i5 = RemoteActionCompatParcelizer + 111;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            aslistIconCompatParcelizer = aslistIconCompatParcelizer.IconCompatParcelizer(calculateminimumtouchtargetpaddinge7kxvpu.read);
            this.serializer = ((asList) this.serializer).read(calculateminimumtouchtargetpaddinge7kxvpu);
            this.read = ((asList) this.read).read(calculateminimumtouchtargetpaddinge7kxvpu);
        }
        return aslistIconCompatParcelizer;
    }

    @Override // o.getCameraDistancePx
    public void onComplete(setShouldUseDispatchDrawui setshouldusedispatchdrawui) {
        setShouldUseDispatchDrawui setshouldusedispatchdrawuiB;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = (ViewLayerUniqueDrawingIdApi29) this.read;
        try {
            l1$$ExternalSyntheticLambda0 l1__externalsyntheticlambda0 = (l1$$ExternalSyntheticLambda0) this.serializer;
            ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi210 = (ViewLayerUniqueDrawingIdApi29) setshouldusedispatchdrawui;
            if (l1__externalsyntheticlambda0.$r8$classId != 0) {
                setshouldusedispatchdrawuiB = l1.a(l1__externalsyntheticlambda0.f$0, l1__externalsyntheticlambda0.f$1, viewLayerUniqueDrawingIdApi210);
            } else {
                setshouldusedispatchdrawuiB = l1.b(l1__externalsyntheticlambda0.f$0, l1__externalsyntheticlambda0.f$1, viewLayerUniqueDrawingIdApi210);
                int i4 = RemoteActionCompatParcelizer + 23;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            if (setshouldusedispatchdrawuiB == null) {
                viewLayerUniqueDrawingIdApi29.serializer(new NullPointerException("Continuation returned null"));
            } else {
                ((ViewLayerUniqueDrawingIdApi29) setshouldusedispatchdrawuiB).read((resetClipBounds) new accessgetViewRootjd(getShouldUseDispatchDraw.write.read, new a(0, this)));
            }
        } catch (Exception e) {
            viewLayerUniqueDrawingIdApi29.serializer(e);
        }
    }

    public void serializer(clip clipVar, float f, float f2) {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 67;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        String str = "start";
        if (i3 % 2 != 0 ? (i = clipVar.RemoteActionCompatParcelizer) != -2 : (i = clipVar.RemoteActionCompatParcelizer) != 94) {
            if (i == -1) {
                str = "end";
            } else if (i != 0) {
                int i4 = IconCompatParcelizer + 125;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0 ? i == 1 : i == 1) {
                    str = "right";
                } else {
                    SentryLogcatAdapter.serializer("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
                }
            } else {
                int i5 = IconCompatParcelizer + 65;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                str = "left";
            }
        }
        accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd = new accessroundToPxR2X_6ojd(new char[0]);
        accessroundtopxr2x_6ojd.serializer(accesstoDpSizekrfVVMjd.serializer(clipVar.write.toString()));
        accessroundtopxr2x_6ojd.serializer(accesstoDpSizekrfVVMjd.serializer(str));
        accessroundtopxr2x_6ojd.serializer(new accesstoRectjd(f));
        accessroundtopxr2x_6ojd.serializer(new accesstoRectjd(f2));
        ((accesstoPxR2X_6ojd) this.serializer).RemoteActionCompatParcelizer((String) this.read, accessroundtopxr2x_6ojd);
    }

    public void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ContentCaptureSessionCompatApi34Impl contentCaptureSessionCompatApi34Impl = (ContentCaptureSessionCompatApi34Impl) this.serializer;
        Object obj = getCameraEK5gGoQ.IconCompatParcelizer;
        contentCaptureSessionCompatApi34Impl.removeMessages(1, obj);
        contentCaptureSessionCompatApi34Impl.sendMessageDelayed(contentCaptureSessionCompatApi34Impl.obtainMessage(1, obj), 1800000L);
        int i4 = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // io.sentry.internal.debugmeta.read
    public List IconCompatParcelizer() {
        int i = 2 % 2;
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = (BrazeActionParserExternalSyntheticLambda0) this.serializer;
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = ((ClassLoader) this.read).getResources("sentry-debug-meta.properties");
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(urlNextElement);
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStreamOpenStream);
                        arrayList.add(properties);
                        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                        if (inputStreamOpenStream != null) {
                            int i2 = RemoteActionCompatParcelizer + 57;
                            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                            if (i2 % 2 == 0) {
                                inputStreamOpenStream.close();
                                throw null;
                            }
                            inputStreamOpenStream.close();
                        } else {
                            continue;
                        }
                    } catch (Throwable th) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (RuntimeException e) {
                    brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, e, "%s file is malformed.", urlNextElement);
                }
            }
        } catch (IOException e2) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, e2, "Failed to load %s", "sentry-debug-meta.properties");
            int i3 = RemoteActionCompatParcelizer + 45;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        int i5 = IconCompatParcelizer + 19;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "No %s file was found.", "sentry-debug-meta.properties");
            return null;
        }
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO;
        Object[] objArr = new Object[0];
        objArr[0] = "sentry-debug-meta.properties";
        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "No %s file was found.", objArr);
        return null;
    }

    public /* synthetic */ i$d(Object obj, int i, Object obj2) {
        this.write = i;
        this.read = obj;
        this.serializer = obj2;
    }

    public /* synthetic */ i$d(Object obj, Object obj2, boolean z, int i) {
        this.write = i;
        this.serializer = obj;
        this.read = obj2;
    }

    public i$d(Context context) {
        this.write = 24;
        this.read = new AtomicLong(-1L);
        this.serializer = new accessgetSlashcp(context, null, accessgetSlashcp.IconCompatParcelizer, new accessgetSevencp("mlkit:vision"), accessgetNumPad8cp.IconCompatParcelizer);
    }

    public i$d(getCameraEK5gGoQ getcameraek5ggoq) {
        this.write = 22;
        this.read = getcameraek5ggoq;
        ContentCaptureSessionCompatApi34Impl contentCaptureSessionCompatApi34Impl = new ContentCaptureSessionCompatApi34Impl(getcameraek5ggoq.RemoteActionCompatParcelizer.getMainLooper(), new compareAndSetFactory(2, this));
        Looper.getMainLooper();
        this.serializer = contentCaptureSessionCompatApi34Impl;
    }

    public i$d(int i) {
        this.write = i;
        if (i == 21) {
            this.serializer = new StringBuilder();
            this.read = null;
        } else if (i != 27) {
            this.serializer = new rotateRad0AR0LA0default(1000L);
            this.read = getCapKaPHkGw.write(10, new Timestamp.Companion(0));
        } else {
            List list = Collections.EMPTY_LIST;
            this.serializer = new asList(list, calculateMinimumTouchTargetPaddingE7KxVPU.serializer);
            this.read = new asList(list, calculateMinimumTouchTargetPaddingE7KxVPU.write);
        }
    }

    public i$d(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        this.write = 1;
        ClassLoader classLoader = i$d.class.getClassLoader();
        this.serializer = brazeActionParserExternalSyntheticLambda0;
        this.read = serializer.read(classLoader);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
    
        if (r8 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f4, code lost:
    
        if (r8 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f7, code lost:
    
        return r20;
     */
    @Override // o.FocusPropertiesImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.FocusRequesterModifierKt onApplyWindowInsets(android.view.View r19, o.FocusRequesterModifierKt r20) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hmf.tasks.a.i$d.onApplyWindowInsets(android.view.View, o.FocusRequesterModifierKt):o.FocusRequesterModifierKt");
    }

    public i$d(r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k, accessgetCoroutineScopep accessgetcoroutinescopep, AndroidPlatformTextInputSession androidPlatformTextInputSession) {
        this.write = 29;
        TransitionValuesMaps transitionValuesMaps = new TransitionValuesMaps(accessgetcoroutinescopep, androidPlatformTextInputSession, new Parser.Pair(2));
        this.serializer = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k;
        this.read = transitionValuesMaps;
    }

    public i$d(String str) {
        this.write = 4;
        this.serializer = (ExtraSupportedOutputSizeQuirk) setThumbTintList.RemoteActionCompatParcelizer.read(ExtraSupportedOutputSizeQuirk.class);
        this.read = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(str, 1);
    }

    public i$d(int i, accesstoPxR2X_6ojd accesstopxr2x_6ojd) {
        String str;
        this.write = 9;
        this.serializer = accesstopxr2x_6ojd;
        if (i == -2) {
            str = "start";
        } else if (i == -1) {
            int i2 = RemoteActionCompatParcelizer + 105;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 5 % 5;
            } else {
                int i4 = 2 % 2;
            }
            str = "end";
        } else if (i != 0) {
            int i5 = IconCompatParcelizer + 69;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (i != 1) {
                SentryLogcatAdapter.serializer("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
                str = "start";
            } else {
                str = "right";
            }
        } else {
            int i7 = IconCompatParcelizer + 5;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
            str = "left";
        }
        this.read = str;
        int i9 = IconCompatParcelizer + 49;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
    }

    @Override // o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34
    public void inject(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        switch (this.write) {
            case 14:
                AppearanceFragment appearanceFragment = (AppearanceFragment) obj;
                appearanceFragment.removeOnUserLeaveHintListener = ((E$b) this.serializer).read();
                appearanceFragment.getOnBackPressedDispatcher = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((isHiddenannotations) this.read);
                break;
            case 15:
                BookShiftConfirmationDialogFragment bookShiftConfirmationDialogFragment = (BookShiftConfirmationDialogFragment) obj;
                bookShiftConfirmationDialogFragment.getSavedStateRegistry = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.serializer).PlaybackStateCompatCustomAction();
                bookShiftConfirmationDialogFragment.onConfigurationChanged = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((isHiddenannotations) this.read);
                break;
            case 16:
                HistoryDialogFragment historyDialogFragment = (HistoryDialogFragment) obj;
                historyDialogFragment.removeOnUserLeaveHintListener = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.serializer).PlaybackStateCompatCustomAction();
                historyDialogFragment.getOnBackPressedDispatcher = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((readInstallReferrerHuaweiAppGallery) this.read);
                break;
            case 17:
                NavigationSettingsFragment navigationSettingsFragment = (NavigationSettingsFragment) obj;
                navigationSettingsFragment.removeOnUserLeaveHintListener = ((E$b) this.serializer).read();
                navigationSettingsFragment.getOnBackPressedDispatcher = new getActionViewIntentlambda0();
                navigationSettingsFragment.getSavedStateRegistry = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((getDataStoreFileName) this.read);
                break;
            case 18:
                OrderDetailsFragment orderDetailsFragment = (OrderDetailsFragment) obj;
                getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.serializer;
                orderDetailsFragment.getNavigationEventDispatcher = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
                orderDetailsFragment.onActivityResult = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4) this.read);
                orderDetailsFragment.getSavedStateRegistry = (ClipboardManager) getstyleable_vector_drawable_group_rotation.clickableXHw0xAIdefault.write();
                orderDetailsFragment.onBackPressed = getstyleable_vector_drawable_group_rotation.getLifecycle();
                break;
            case 19:
                RequestBreakFragment requestBreakFragment = (RequestBreakFragment) obj;
                getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation2 = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.serializer;
                requestBreakFragment.removeOnUserLeaveHintListener = getstyleable_vector_drawable_group_rotation2.PlaybackStateCompatCustomAction();
                requestBreakFragment.getSavedStateRegistry = getstyleable_vector_drawable_group_rotation2.getLifecycle();
                requestBreakFragment.invalidateMenu = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((getModels) this.read);
                int i4 = RemoteActionCompatParcelizer + 115;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                break;
            default:
                SettingsNotificationsDiagnosticsFragment settingsNotificationsDiagnosticsFragment = (SettingsNotificationsDiagnosticsFragment) obj;
                settingsNotificationsDiagnosticsFragment.initializeViewTreeOwners = ((accessgetTvTeletextcp) this.serializer).MediaMetadataCompat();
                settingsNotificationsDiagnosticsFragment.RemoteActionCompatParcelizer = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((d4ExternalSyntheticLambda3) this.read);
                break;
        }
    }

    public i$d(EditText editText) {
        this.write = 10;
        this.serializer = editText;
        isUnspecifiedk4lQ0Mannotations isunspecifiedk4lq0mannotations = new isUnspecifiedk4lQ0Mannotations(editText);
        this.read = isunspecifiedk4lq0mannotations;
        editText.addTextChangedListener(isunspecifiedk4lq0mannotations);
        if (isSpecifiedk4lQ0M.write == null) {
            synchronized (isSpecifiedk4lQ0M.RemoteActionCompatParcelizer) {
                if (isSpecifiedk4lQ0M.write == null) {
                    isSpecifiedk4lQ0M isspecifiedk4lq0m = new isSpecifiedk4lQ0M();
                    try {
                        isSpecifiedk4lQ0M.serializer = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, isSpecifiedk4lQ0M.class.getClassLoader());
                    } catch (Throwable unused) {
                    }
                    isSpecifiedk4lQ0M.write = isspecifiedk4lq0m;
                }
            }
        }
        editText.setEditableFactory(isSpecifiedk4lQ0M.write);
    }

    public i$d(Camera2CameraImpl camera2CameraImpl) {
        this.write = 3;
        this.read = camera2CameraImpl;
        this.serializer = null;
    }

    public i$d(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation, accessgetTvTeletextcp accessgettvteletextcp) {
        this.write = 20;
        this.serializer = accessgettvteletextcp;
        mergeJsonObjects mergejsonobjects = getstyleable_vector_drawable_group_rotation.FlingCancellationException;
        mergeJsonObjects mergejsonobjects2 = getstyleable_vector_drawable_group_rotation.AnimatedContentMeasurePolicy;
        acquire acquireVar = new acquire(mergejsonobjects, mergejsonobjects2, 14);
        mergeJsonObjects mergejsonobjects3 = getstyleable_vector_drawable_group_rotation.MouseWheelScrollingLogicdispatchMouseWheelScroll3;
        applyLayoutFeatures applylayoutfeatures = new applyLayoutFeatures(mergejsonobjects, mergejsonobjects3, mergejsonobjects2, 8);
        applyLayoutFeatures applylayoutfeatures2 = new applyLayoutFeatures(mergejsonobjects, mergejsonobjects3, mergejsonobjects2, 0);
        executeQuery executequery = new executeQuery(mergejsonobjects2, 3);
        mergeJsonObjects mergejsonobjects4 = getstyleable_vector_drawable_group_rotation.toClipEntry;
        this.read = new d4ExternalSyntheticLambda3(mergejsonobjects, acquireVar, applylayoutfeatures, applylayoutfeatures2, executequery, new executeQuery(mergejsonobjects4, 4), getstyleable_vector_drawable_group_rotation.awaitDragOrCancellationrnUCldI, mergejsonobjects4, new acquire(getstyleable_vector_drawable_group_rotation.getSpacingD9Ej5fM, getstyleable_vector_drawable_group_rotation.createnHHXs2Y, 13), new executeQuery(getstyleable_vector_drawable_group_rotation.setItemInvoker, 2), getstyleable_vector_drawable_group_rotation.TextLinkScope, getstyleable_vector_drawable_group_rotation.onConsumedWindowInsetsChanged);
    }

    public i$d(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation, E$b e$b, int i) {
        this.write = i;
        if (i != 17) {
            this.serializer = e$b;
            this.read = new isHiddenannotations(getstyleable_vector_drawable_group_rotation.toClipEntry, getstyleable_vector_drawable_group_rotation.getTabContainer, getstyleable_vector_drawable_group_rotation.accessensureViewModelStore, new r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8(getstyleable_vector_drawable_group_rotation.setItemInvoker, 3), 13);
            return;
        }
        this.serializer = e$b;
        mergeJsonObjects mergejsonobjects = getstyleable_vector_drawable_group_rotation.toClipEntry;
        getContentDataType getcontentdatatype = getstyleable_vector_drawable_group_rotation.ScrollableKt;
        r8lambda4ctur6dHthQRF8ridJfgtUMxjY0 r8lambda4ctur6dhthqrf8ridjfgtumxjy0 = new r8lambda4ctur6dHthQRF8ridJfgtUMxjY0(3, getcontentdatatype, mergejsonobjects, getstyleable_vector_drawable_group_rotation.onMenuItemSelected, getstyleable_vector_drawable_group_rotation.Contentfoundation, getstyleable_vector_drawable_group_rotation.LowMemoryQuirk);
        setSdkAuthenticationSignature setsdkauthenticationsignature = new setSdkAuthenticationSignature(getstyleable_vector_drawable_group_rotation.setItemInvoker, getstyleable_vector_drawable_group_rotation.PlatformDefaultTextContextMenuProviders_androidKt, 6);
        r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 r8lambdahmuf48geqgedwlhl7mczo1q1bv8 = getstyleable_vector_drawable_group_rotation.TransitionState;
        this.read = new getDataStoreFileName(mergejsonobjects, r8lambda4ctur6dhthqrf8ridjfgtumxjy0, r8lambdahmuf48geqgedwlhl7mczo1q1bv8, setsdkauthenticationsignature, new isHiddenannotations(mergejsonobjects, r8lambdahmuf48geqgedwlhl7mczo1q1bv8, getcontentdatatype, setsdkauthenticationsignature, 15), getstyleable_vector_drawable_group_rotation.SurfaceViewStretchedQuirk);
    }

    public /* synthetic */ i$d(int i, boolean z) {
        this.write = i;
    }
}
