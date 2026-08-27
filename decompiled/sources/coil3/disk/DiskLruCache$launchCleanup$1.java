package coil3.disk;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.BatteryManager;
import android.os.PowerManager;
import android.os.StatFs;
import android.speech.tts.TextToSpeech;
import android.telephony.TelephonyManager;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.chatui.data.datasource.ImageCacheResolverImpl;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.delivery.service.DeliveryService;
import com.google.android.gms.internal.mlkit_vision_face.zzki;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.gson.GsonBuilder;
import com.huawei.location.nlp.scan.FB;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directionsrefresh.v1.DirectionsRefreshAdapterFactory;
import com.mapbox.api.directionsrefresh.v1.models.AutoValue_DirectionsRefreshResponse;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.PointAsCoordinatesTypeAdapter;
import com.mapbox.navigation.base.internal.route.Waypoint;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewCancelValue;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewEvent;
import com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingViewSender;
import com.mapbox.navigation.ui.maps.route.line.model.RouteFeatureData;
import com.mapbox.navigation.voice.api.VoiceInstructionsTextPlayer;
import com.mapbox.navigator.RouteInterface;
import com.mapbox.navigator.RouteParser;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.domain.RefreshAccessTokenUseCaseImpl;
import com.roadrunner.biometrics.presentation.BiometricsActivity;
import com.roadrunner.country.config.implementation.data.CountryConfigFallbackDataSource;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheManager;
import com.roadrunner.customerchat.selfservice.domain.logging.SelfServiceChatLoggerImpl$WebChatTokenError;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptUiModelImpl;
import com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl;
import com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.common.data.model.TrackingEventExtensionsKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageButtonUiModelImpl;
import com.roadrunner.delivery.ontheway.destinationdetails.presentation.DestinationDetailsUiModelImpl;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.events.N$b;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt;
import kotlinx.coroutines.CompletableDeferredImpl;
import o.AnnotationType;
import o.EmptyFillMeasurePolicymeasure1;
import o.FontEj4NQ78default;
import o.ModifierElement;
import o.NullableInputConnectionWrapperApi21;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SaversKtColorSaver2;
import o.SemanticsProperties;
import o.ShortNewsContentCardView;
import o.SingleRequest;
import o.TextAnnouncementContentCardView;
import o.TextFieldValueCompanion;
import o.TextRangeKt;
import o.TextUnitType;
import o.TextUnitTypeCompanion;
import o.accessgetCompositingStrategyNrFUSIjd;
import o.accessgetInstancedelegatecp;
import o.accessscheduleScrollEventIfNeeded;
import o.createFromParcel;
import o.decode;
import o.defaultCardHandlinglambda0;
import o.ensureSubscribedToInAppMessageEvents;
import o.getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode;
import o.getCache;
import o.getContentViewGroupParentLayout;
import o.getHasNonTranslationComponents;
import o.getIsContainerannotations;
import o.getNode;
import o.getReverseDifferenceannotations;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.isVerticalSwipeInAllowedDirection;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.onViewCreated;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.rectIntersectsRect;
import o.resetTransientState;
import o.safeSetClipToOutline;
import o.setCarryoverInAppMessage;
import o.setImageViewToUrl;
import o.setPaddingTop;
import o.set_measureResult;
import o.sortByGeometryGroupingslambda1;
import o.sourceInformationContextOfdefault;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache$launchCleanup$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiskLruCache$launchCleanup$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x024f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        long availableBytes;
        int dataNetworkType;
        int intExtra;
        int intProperty;
        Network activeNetwork;
        List list;
        int i = 20;
        int i2 = 0;
        str = null;
        str = null;
        str = null;
        String str3 = null;
        switch (this.read) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getReverseDifferenceannotations getreversedifferenceannotations = (getReverseDifferenceannotations) this.RemoteActionCompatParcelizer;
                synchronized (getreversedifferenceannotations.PlaybackStateCompat) {
                    try {
                        if (!getreversedifferenceannotations.MediaBrowserCompatMediaItem || getreversedifferenceannotations.serializer) {
                            return createFromParcel.INSTANCE;
                        }
                        try {
                            getreversedifferenceannotations.serializer();
                            break;
                        } catch (IOException unused) {
                            getreversedifferenceannotations.ResultReceiver = true;
                        }
                        try {
                            if (getreversedifferenceannotations.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus >= 2000) {
                                getreversedifferenceannotations.MediaBrowserCompatMediaItem();
                            }
                            break;
                        } catch (IOException unused2) {
                            getreversedifferenceannotations.MediaSessionCompatToken = true;
                            getreversedifferenceannotations.ParcelableVolumeInfo = new SingleRequest(new setImageViewToUrl(0));
                        }
                        return createFromParcel.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) this.RemoteActionCompatParcelizer;
                Context context = platformSelectionBehaviorsImpl.read;
                ModifierElement modifierElement = platformSelectionBehaviorsImpl.MediaBrowserCompatMediaItem;
                TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
                int i3 = getNode.write[modifierElement.ordinal()];
                if (i3 == 1) {
                    str = "edittext";
                } else {
                    if (i3 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    str = "textview";
                }
                TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
                platformSelectionBehaviorsImpl.MediaSessionCompatQueueItem = textClassifierCreateTextClassificationSession;
                return textClassifierCreateTextClassificationSession;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((TooltipStateImpl) this.RemoteActionCompatParcelizer).IconCompatParcelizer();
                return createFromParcel.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                File[] fileArrListFiles = ((ImageCacheResolverImpl) this.RemoteActionCompatParcelizer).read.getCacheDir().listFiles();
                if (fileArrListFiles == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    name.getClass();
                    if (setCarryoverInAppMessage.read(name, ".jpg", false)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = onContentCardDismissed.serializer(arrayList, new FB(7)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                return createFromParcel.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                DeliveryService deliveryService = (DeliveryService) this.RemoteActionCompatParcelizer;
                int i4 = DeliveryService.serializer;
                deliveryService.read("User not authenticated");
                return createFromParcel.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return (accessscheduleScrollEventIfNeeded) this.RemoteActionCompatParcelizer;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                List list2 = (List) this.RemoteActionCompatParcelizer;
                NavigationRoute navigationRoute = (NavigationRoute) onContentCardDismissed.read(list2);
                navigationRoute.getClass();
                RouteInterface routeInterface = navigationRoute.nativeRoute;
                List<NavigationRoute> listSerializer = onContentCardDismissed.serializer(list2, 1);
                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(listSerializer, 10));
                for (NavigationRoute navigationRoute2 : listSerializer) {
                    navigationRoute2.getClass();
                    arrayList2.add(navigationRoute2.nativeRoute);
                }
                return RouteParser.createRoutesData(routeInterface, arrayList2);
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                AutoValue_DirectionsRefreshResponse autoValue_DirectionsRefreshResponse = (AutoValue_DirectionsRefreshResponse) this.RemoteActionCompatParcelizer;
                autoValue_DirectionsRefreshResponse.getClass();
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.create());
                gsonBuilder.registerTypeAdapter(Point.class, new PointAsCoordinatesTypeAdapter());
                gsonBuilder.registerTypeAdapterFactory(DirectionsRefreshAdapterFactory.create());
                return gsonBuilder.create().toJson(autoValue_DirectionsRefreshResponse);
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return new RouteLineViewEvent((String) ((RouteLineHistoryRecordingViewSender) this.RemoteActionCompatParcelizer).gson, new RouteLineViewCancelValue());
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                NavigationRoute navigationRoute3 = ((RouteFeatureData) this.RemoteActionCompatParcelizer).route;
                MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                navigationRoute3.getClass();
                ArrayList arrayList3 = navigationRoute3.nativeWaypoints;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (zzki.isLegWaypoint((Waypoint) obj2)) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(arrayList4, 10));
                for (Object obj3 : arrayList4) {
                    if (i2 < 0) {
                        SQLite.serializer();
                        throw null;
                    }
                    Feature featureFromGeometry = Feature.fromGeometry(((Waypoint) obj3).location);
                    featureFromGeometry.addStringProperty("wayPoint", i2 == 0 ? "origin" : "destination");
                    arrayList5.add(featureFromGeometry);
                    i2++;
                }
                FeatureCollection featureCollectionFromFeatures = FeatureCollection.fromFeatures(arrayList5);
                featureCollectionFromFeatures.getClass();
                return featureCollectionFromFeatures;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((File) this.RemoteActionCompatParcelizer).delete();
                return createFromParcel.INSTANCE;
            case 11:
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                CompletableDeferredImpl completableDeferredImpl = ((VoiceInstructionsTextPlayer) this.RemoteActionCompatParcelizer).textToSpeech;
                TextToSpeech textToSpeech = completableDeferredImpl.PlaybackStateCompat() ? (TextToSpeech) completableDeferredImpl.RatingCompat() : null;
                if (textToSpeech != null && textToSpeech.isSpeaking()) {
                    textToSpeech.stop();
                }
                return createfromparcel;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode) this.RemoteActionCompatParcelizer).serializer.write(defaultCardHandlinglambda0.CANCELLED);
                return createFromParcel.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                N$b n$b = (N$b) this.RemoteActionCompatParcelizer;
                SemanticsProperties semanticsProperties = (SemanticsProperties) n$b.write;
                if (semanticsProperties.write.write() != setPaddingTop.GOOGLE || !((FirebaseRemoteConfigImpl) semanticsProperties.IconCompatParcelizer).RemoteActionCompatParcelizer(updateAdidI.IS_APP_REVIEW_TRIGGER_ENABLED) || set_measureResult.read().serializer.MediaSessionCompatQueueItem) {
                    return null;
                }
                ReviewManager reviewManagerCreate = ReviewManagerFactory.create(((getIsContainerannotations) n$b.read).serializer);
                reviewManagerCreate.getClass();
                return reviewManagerCreate;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                LocalAuthDataSource localAuthDataSource = (LocalAuthDataSource) this.RemoteActionCompatParcelizer;
                ReentrantLock reentrantLock = LocalAuthDataSource.read(localAuthDataSource);
                reentrantLock.lock();
                try {
                    LocalAuthDataSource.write(localAuthDataSource).IconCompatParcelizer(null);
                    Object objWrite = LocalAuthDataSource.IconCompatParcelizer(localAuthDataSource).write();
                    objWrite.getClass();
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) objWrite).edit();
                    editorEdit.remove("LOCAL_AUTH_SHARED_PREF_AUTH_DATA");
                    editorEdit.apply();
                    return createFromParcel.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                BiometricsActivity.RemoteActionCompatParcelizer((BiometricsActivity) this.RemoteActionCompatParcelizer).write.serializer(sortByGeometryGroupingslambda1.LAUNCH_DECRYPTION_FLOW);
                return createFromParcel.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((EmptyFillMeasurePolicymeasure1) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer.logEvent("bubble_section_clicked", null);
                return createFromParcel.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                CountryConfigFallbackDataSource countryConfigFallbackDataSource = (CountryConfigFallbackDataSource) this.RemoteActionCompatParcelizer;
                InputStream inputStreamOpen = countryConfigFallbackDataSource.write.getAssets().open("country_list_fallback.json");
                inputStreamOpen.getClass();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, ensureSubscribedToInAppMessageEvents.write), 8192);
                try {
                    String strIconCompatParcelizer = TextStreamsKt.IconCompatParcelizer(bufferedReader);
                    bufferedReader.close();
                    return new onItemDismiss((rectIntersectsRect) countryConfigFallbackDataSource.serializer.serializer(strIconCompatParcelizer, rectIntersectsRect.Companion.serializer()));
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{bufferedReader, th2}, sourceInformationContextOfdefault.read());
                        throw th3;
                    }
                }
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getHasNonTranslationComponents gethasnontranslationcomponents = (getHasNonTranslationComponents) this.RemoteActionCompatParcelizer;
                decode decodeVar = gethasnontranslationcomponents.RemoteActionCompatParcelizer;
                safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
                TextUnitTypeCompanion textUnitTypeCompanion = (TextUnitTypeCompanion) onContentCardDismissed.MediaMetadataCompat(((ChatDeliveryRepositoryImpl) gethasnontranslationcomponents.serializer).read());
                safesetcliptooutline.put("delivery_id", String.valueOf(textUnitTypeCompanion != null ? new Long(textUnitTypeCompanion.MediaDescriptionCompat) : null).toString());
                safesetcliptooutline.putAll(gethasnontranslationcomponents.IconCompatParcelizer.write());
                decodeVar.logEvent("customer_chat_list_screen", safesetcliptooutline.IconCompatParcelizer());
                return createFromParcel.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                File[] fileArrListFiles2 = new File(((ChatAssetCacheManager) this.RemoteActionCompatParcelizer).write.getFilesDir(), "customer-chat-assets").listFiles();
                if (fileArrListFiles2 == null) {
                    return instance_delegatelambda0.write;
                }
                ArrayList arrayList6 = new ArrayList();
                int length = fileArrListFiles2.length;
                while (i2 < length) {
                    File file2 = fileArrListFiles2[i2];
                    if (file2.isDirectory()) {
                        arrayList6.add(file2);
                    }
                    i2++;
                }
                ArrayList arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(arrayList6, 10));
                Iterator it2 = arrayList6.iterator();
                while (it2.hasNext()) {
                    arrayList7.add(((File) it2.next()).getName());
                }
                return arrayList7;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                File[] fileArrListFiles3 = ((Application) ((SignInDataStore) this.RemoteActionCompatParcelizer).serializer).getCacheDir().listFiles();
                if (fileArrListFiles3 == null) {
                    return null;
                }
                ArrayList arrayList8 = new ArrayList();
                for (File file3 : fileArrListFiles3) {
                    String name2 = file3.getName();
                    name2.getClass();
                    if (setCarryoverInAppMessage.read(name2, ".jpg", false)) {
                        arrayList8.add(file3);
                    }
                }
                Iterator it3 = onContentCardDismissed.serializer(arrayList8, new FB(i)).iterator();
                while (it3.hasNext()) {
                    ((File) it3.next()).delete();
                }
                return createFromParcel.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getCache getcache = (getCache) this.RemoteActionCompatParcelizer;
                Application application = getcache.write;
                isAdapterPositionOnScreen isadapterpositiononscreen = getcache.serializer;
                ConnectivityManager connectivityManager = (ConnectivityManager) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                NetworkCapabilities networkCapabilities = (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) ? null : connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    str2 = "NONE";
                } else if (networkCapabilities.hasTransport(1)) {
                    str2 = "WIFI";
                } else {
                    str2 = networkCapabilities.hasTransport(0) ? "CELLULAR" : "OTHER";
                }
                String str4 = str2;
                try {
                    availableBytes = new StatFs(application.getFilesDir().getPath()).getAvailableBytes();
                    break;
                } catch (Exception e) {
                    Timber.RemoteActionCompatParcelizer.read(e);
                    availableBytes = -1;
                }
                long j = availableBytes;
                BatteryManager batteryManager = (BatteryManager) getcache.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                int i5 = (batteryManager == null || (intProperty = batteryManager.getIntProperty(4)) == Integer.MIN_VALUE) ? -1 : intProperty;
                Intent intentRegisterReceiver = application.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                boolean z = intentRegisterReceiver != null && ((intExtra = intentRegisterReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5);
                PowerManager powerManager = (PowerManager) getcache.read.MediaSessionCompatResultReceiverWrapper();
                boolean z2 = powerManager != null && powerManager.isPowerSaveMode();
                ConnectivityManager connectivityManager2 = (ConnectivityManager) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                boolean z3 = connectivityManager2 != null && connectivityManager2.getRestrictBackgroundStatus() == 3;
                if (str4.equals("CELLULAR")) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) getcache.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
                        if (telephonyManager != null && (dataNetworkType = telephonyManager.getDataNetworkType()) != 0) {
                            if (dataNetworkType == 1 || dataNetworkType == 2) {
                                str3 = "2G";
                            } else if (dataNetworkType == 3) {
                                str3 = "3G";
                            } else if (dataNetworkType == 13) {
                                str3 = "4G";
                            } else if (dataNetworkType == 15) {
                                str3 = "3G";
                            } else if (dataNetworkType != 20) {
                                switch (dataNetworkType) {
                                    case 8:
                                    case 9:
                                    case 10:
                                        str3 = "3G";
                                        break;
                                    default:
                                        str3 = "OTHER";
                                        break;
                                }
                            } else {
                                str3 = "5G";
                            }
                        }
                    } catch (Exception unused3) {
                    }
                }
                return new AnnotationType(j, i5, z, z2, z3, str4, str3);
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                forest.IconCompatParcelizer("ChatTokenProvider requestAuthTokenRefresh from Web Layer called", new Object[0]);
                Object objRemoteActionCompatParcelizer = ((RefreshAccessTokenUseCaseImpl) ((H$b) this.RemoteActionCompatParcelizer).serializer).RemoteActionCompatParcelizer("ChatTokenProvider");
                if (objRemoteActionCompatParcelizer instanceof isItemDismissable) {
                    forest.write(new SelfServiceChatLoggerImpl$WebChatTokenError("Token refresh failed for Web Layer", onItemDismiss.serializer(objRemoteActionCompatParcelizer), 0));
                }
                return createFromParcel.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                DeliveryAutoAcceptUiModelImpl deliveryAutoAcceptUiModelImpl = (DeliveryAutoAcceptUiModelImpl) this.RemoteActionCompatParcelizer;
                SaversKtColorSaver2 saversKtColorSaver2 = (SaversKtColorSaver2) deliveryAutoAcceptUiModelImpl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read();
                if (saversKtColorSaver2 != null && (list = saversKtColorSaver2.MediaMetadataCompat) != null) {
                    ArrayList arrayListRemoteActionCompatParcelizer = TrackingEventExtensionsKt.RemoteActionCompatParcelizer(list);
                    DeliveryAcceptanceLogger deliveryAcceptanceLogger = deliveryAutoAcceptUiModelImpl.MediaSessionCompatResultReceiverWrapper;
                    Iterator it4 = arrayListRemoteActionCompatParcelizer.iterator();
                    while (it4.hasNext()) {
                        deliveryAcceptanceLogger.write((TrackingEvent) it4.next());
                    }
                }
                return createFromParcel.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((PopulateViewStructure_androidKtpopulate7) this.RemoteActionCompatParcelizer).setValue(Boolean.TRUE);
                return createFromParcel.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return Boolean.valueOf(((FirebaseRemoteConfigImpl) ((TextRangeKt) this.RemoteActionCompatParcelizer).read).MediaDescriptionCompat());
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ProtobufEncoder protobufEncoder = (ProtobufEncoder) this.RemoteActionCompatParcelizer;
                FontEj4NQ78default fontEj4NQ78default = (FontEj4NQ78default) protobufEncoder.RemoteActionCompatParcelizer;
                TextUnitTypeCompanion textUnitTypeCompanion2 = (TextUnitTypeCompanion) onContentCardDismissed.MediaMetadataCompat(((ChatDeliveryRepositoryImpl) ((TextUnitType) protobufEncoder.serializer)).read());
                Map mapSerializer = onMove.serializer(fontEj4NQ78default.write(), new onViewAttachedToWindowlambda0("currentDeliveryId", String.valueOf(textUnitTypeCompanion2 != null ? new Long(textUnitTypeCompanion2.MediaDescriptionCompat) : null)));
                String str5 = (String) ((StateV3AnalyticsProviderImpl) fontEj4NQ78default.read).write().get("screenName");
                if (str5 == null) {
                    str5 = "";
                }
                ((decode) protobufEncoder.write).logEvent("customer_chat_button", onMove.serializer(mapSerializer, new onViewAttachedToWindowlambda0("screenName", str5)));
                return createFromParcel.INSTANCE;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((CrowdSourcingFloatingImageButtonUiModelImpl) this.RemoteActionCompatParcelizer).write.IconCompatParcelizer(NullableInputConnectionWrapperApi21.RemoteActionCompatParcelizer);
                return createFromParcel.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                TextFieldValueCompanion textFieldValueCompanion = (TextFieldValueCompanion) this.RemoteActionCompatParcelizer;
                textFieldValueCompanion.getClass();
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("image", isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(TextFieldValueCompanion.Companion.serializer(), textFieldValueCompanion))};
                accessgetCompositingStrategyNrFUSIjd accessgetcompositingstrategynrfusijd = new accessgetCompositingStrategyNrFUSIjd(0);
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = onviewattachedtowindowlambda0Arr[0];
                accessgetcompositingstrategynrfusijd.IconCompatParcelizer(onviewattachedtowindowlambda0.write, (String) onviewattachedtowindowlambda0.serializer);
                return accessgetcompositingstrategynrfusijd.IconCompatParcelizer();
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                DestinationDetailsUiModelImpl destinationDetailsUiModelImpl = (DestinationDetailsUiModelImpl) this.RemoteActionCompatParcelizer;
                List list3 = destinationDetailsUiModelImpl.MediaMetadataCompat;
                ArrayList arrayList9 = new ArrayList();
                for (Object obj4 : list3) {
                    if (((Boolean) ((onViewCreated) obj4).IconCompatParcelizer().read()).booleanValue()) {
                        arrayList9.add(obj4);
                    }
                }
                destinationDetailsUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(!arrayList9.isEmpty()));
                destinationDetailsUiModelImpl.serializer.IconCompatParcelizer(arrayList9);
                return createFromParcel.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.read;
        Object obj2 = this.RemoteActionCompatParcelizer;
        switch (i3) {
            case 0:
                DiskLruCache$launchCleanup$1 diskLruCache$launchCleanup$1 = new DiskLruCache$launchCleanup$1((getReverseDifferenceannotations) obj2, shortNewsContentCardView, 0);
                int i4 = serializer + 55;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 45 / 0;
                }
                return diskLruCache$launchCleanup$1;
            case 1:
                return new DiskLruCache$launchCleanup$1((PlatformSelectionBehaviorsImpl) obj2, shortNewsContentCardView, 1);
            case 2:
                return new DiskLruCache$launchCleanup$1((TooltipStateImpl) obj2, shortNewsContentCardView, i);
            case 3:
                return new DiskLruCache$launchCleanup$1((ImageCacheResolverImpl) obj2, shortNewsContentCardView, 3);
            case 4:
                return new DiskLruCache$launchCleanup$1((DeliveryService) obj2, shortNewsContentCardView, 4);
            case 5:
                return new DiskLruCache$launchCleanup$1((accessscheduleScrollEventIfNeeded) obj2, shortNewsContentCardView, 5);
            case 6:
                return new DiskLruCache$launchCleanup$1((List) obj2, shortNewsContentCardView, 6);
            case 7:
                return new DiskLruCache$launchCleanup$1((AutoValue_DirectionsRefreshResponse) obj2, shortNewsContentCardView, 7);
            case 8:
                return new DiskLruCache$launchCleanup$1((RouteLineHistoryRecordingViewSender) obj2, shortNewsContentCardView, 8);
            case 9:
                return new DiskLruCache$launchCleanup$1((RouteFeatureData) obj2, shortNewsContentCardView, 9);
            case 10:
                DiskLruCache$launchCleanup$1 diskLruCache$launchCleanup$2 = new DiskLruCache$launchCleanup$1((File) obj2, shortNewsContentCardView, 10);
                int i6 = serializer + 75;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return diskLruCache$launchCleanup$2;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            case 11:
                return new DiskLruCache$launchCleanup$1((VoiceInstructionsTextPlayer) obj2, shortNewsContentCardView, 11);
            case 12:
                return new DiskLruCache$launchCleanup$1((getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode) obj2, shortNewsContentCardView, 12);
            case 13:
                return new DiskLruCache$launchCleanup$1((N$b) obj2, shortNewsContentCardView, 13);
            case 14:
                return new DiskLruCache$launchCleanup$1((LocalAuthDataSource) obj2, shortNewsContentCardView, 14);
            case 15:
                return new DiskLruCache$launchCleanup$1((BiometricsActivity) obj2, shortNewsContentCardView, 15);
            case 16:
                return new DiskLruCache$launchCleanup$1((EmptyFillMeasurePolicymeasure1) obj2, shortNewsContentCardView, 16);
            case 17:
                return new DiskLruCache$launchCleanup$1((CountryConfigFallbackDataSource) obj2, shortNewsContentCardView, 17);
            case 18:
                return new DiskLruCache$launchCleanup$1((getHasNonTranslationComponents) obj2, shortNewsContentCardView, 18);
            case 19:
                return new DiskLruCache$launchCleanup$1((ChatAssetCacheManager) obj2, shortNewsContentCardView, 19);
            case 20:
                return new DiskLruCache$launchCleanup$1((SignInDataStore) obj2, shortNewsContentCardView, 20);
            case 21:
                return new DiskLruCache$launchCleanup$1((getCache) obj2, shortNewsContentCardView, 21);
            case 22:
                return new DiskLruCache$launchCleanup$1((H$b) obj2, shortNewsContentCardView, 22);
            case 23:
                return new DiskLruCache$launchCleanup$1((DeliveryAutoAcceptUiModelImpl) obj2, shortNewsContentCardView, 23);
            case 24:
                return new DiskLruCache$launchCleanup$1((PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 24);
            case 25:
                return new DiskLruCache$launchCleanup$1((TextRangeKt) obj2, shortNewsContentCardView, 25);
            case 26:
                return new DiskLruCache$launchCleanup$1((ProtobufEncoder) obj2, shortNewsContentCardView, 26);
            case 27:
                return new DiskLruCache$launchCleanup$1((CrowdSourcingFloatingImageButtonUiModelImpl) obj2, shortNewsContentCardView, 27);
            case 28:
                return new DiskLruCache$launchCleanup$1((TextFieldValueCompanion) obj2, shortNewsContentCardView, 28);
            default:
                return new DiskLruCache$launchCleanup$1((DestinationDetailsUiModelImpl) obj2, shortNewsContentCardView, 29);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i2) {
            case 0:
                return ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 1:
                return ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 3:
                return ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 4:
                ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 5:
                return ((DiskLruCache$launchCleanup$1) create((accessscheduleScrollEventIfNeeded) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 6:
                return ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                return ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 8:
                return ((DiskLruCache$launchCleanup$1) create((TextAnnouncementContentCardView) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 9:
                return ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 10:
                ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 11:
                ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 12:
                ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 13:
                return ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 14:
                ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 15:
                ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 16:
                ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 17:
                Object objInvokeSuspend = ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i3 = write + 19;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return objInvokeSuspend;
            case 18:
                ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = write + 81;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 10 / 0;
                }
                return createfromparcel;
            case 19:
                return ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 20:
                return ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 21:
                return ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 22:
                ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 23:
                ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 24:
                ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 25:
                return ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 26:
                ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 27:
                ((DiskLruCache$launchCleanup$1) create((String) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 28:
                Object objInvokeSuspend2 = ((DiskLruCache$launchCleanup$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i7 = serializer + 119;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return objInvokeSuspend2;
                }
                throw null;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((DiskLruCache$launchCleanup$1) create(bool, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
        }
    }
}
