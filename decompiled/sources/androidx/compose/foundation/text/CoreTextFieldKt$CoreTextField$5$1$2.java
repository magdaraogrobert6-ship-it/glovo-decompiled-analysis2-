package androidx.compose.foundation.text;

import androidx.camera.core.impl.UseCaseAdditionSimulator;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.room.RoomDatabase;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl;
import com.roadrunner.map.integration.mapbox.route.preview.SecondaryRouteApi;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.flow.FlowCollector;
import o.Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1;
import o.BottomSheetScaffoldKtStandardBottomSheet3;
import o.Button;
import o.ButtonColors;
import o.ButtonDefaults;
import o.ButtonKt;
import o.ButtonKtButton21;
import o.CheckboxKt;
import o.LazyLayoutItemAnimatorDisplayingDisappearingItemsNode;
import o.LineBreakCompanion;
import o.ShortNewsContentCardView;
import o.accessgetGocp;
import o.copyjRlVdoo;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.fromColorLong;
import o.getCieXyz;
import o.getHeadingrAG3T2kannotations;
import o.getParagraphrAG3T2k;
import o.getParagraphrAG3T2kannotations;
import o.getSimplefcGXIks;
import o.getSimplerAG3T2k;
import o.getSimplerAG3T2kannotations;
import o.getStrictnessusljTpc;
import o.getUnspecifiedrAG3T2kannotations;
import o.getWordBreakjp8hJ3c;
import o.removeNodeAtDepth;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$5$1$2 implements FlowCollector {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ CoreTextFieldKt$CoreTextField$5$1$2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.read = i;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.write = obj3;
        this.IconCompatParcelizer = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0281  */
    /* JADX WARN: Code duplicated, block: B:145:0x031c  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:23:0x00da  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        boolean z;
        boolean z2;
        Object objAccess$requestOrShowRoutePreview;
        Collection collection;
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = this.serializer;
        Object obj4 = this.RemoteActionCompatParcelizer;
        Object obj5 = this.write;
        if (i2 == 0) {
            TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj5;
            LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) obj3;
            if (((Boolean) obj).booleanValue()) {
                int i3 = MediaDescriptionCompat + 29;
                MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    legacyTextFieldState.write();
                    throw null;
                }
                if (legacyTextFieldState.write()) {
                    TextFieldValue textFieldValueMediaDescriptionCompat = textFieldSelectionManager.MediaDescriptionCompat();
                    OffsetMapping offsetMapping = textFieldSelectionManager.PlaybackStateCompatCustomAction;
                    EditProcessor editProcessor = legacyTextFieldState.ComponentActivity;
                    Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1 actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1 = legacyTextFieldState.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1 actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy2 = legacyTextFieldState.ParcelableVolumeInfo;
                    createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                    TextInputSession textInputSessionStartInput = ((TextInputService) obj4).startInput(textFieldValueMediaDescriptionCompat, (ImeOptions) obj2, new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(editProcessor, actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1, createinappmessageeventsubscriber, 7), actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy2);
                    createinappmessageeventsubscriber.IconCompatParcelizer = textInputSessionStartInput;
                    legacyTextFieldState.MediaDescriptionCompat = textInputSessionStartInput;
                    CoreTextFieldKt.read(legacyTextFieldState, textFieldValueMediaDescriptionCompat, offsetMapping);
                } else {
                    CoreTextFieldKt.RemoteActionCompatParcelizer(legacyTextFieldState);
                }
            } else {
                CoreTextFieldKt.RemoteActionCompatParcelizer(legacyTextFieldState);
            }
            return createfromparcel;
        }
        boolean z3 = true;
        if (i2 == 1) {
            ButtonDefaults buttonDefaults = (ButtonDefaults) obj;
            createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = (createBrazeUserChangeEventSubscriberlambda01) obj5;
            createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda02 = (createBrazeUserChangeEventSubscriberlambda01) obj4;
            createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda03 = (createBrazeUserChangeEventSubscriberlambda01) obj3;
            if (buttonDefaults instanceof Button) {
                int i4 = MediaSessionCompatQueueItem + 63;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                createbrazeuserchangeeventsubscriberlambda03.read = i4 % 2 == 0 ? createbrazeuserchangeeventsubscriberlambda03.read % 1 : createbrazeuserchangeeventsubscriberlambda03.read + 1;
            } else if (buttonDefaults instanceof ButtonKtButton21) {
                int i5 = MediaSessionCompatQueueItem + 109;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                createbrazeuserchangeeventsubscriberlambda03.read--;
            } else if (buttonDefaults instanceof CheckboxKt) {
                createbrazeuserchangeeventsubscriberlambda03.read--;
            } else if (buttonDefaults instanceof ButtonKt) {
                createbrazeuserchangeeventsubscriberlambda02.read++;
            } else if (buttonDefaults instanceof copyjRlVdoo) {
                createbrazeuserchangeeventsubscriberlambda02.read--;
            } else if (buttonDefaults instanceof BottomSheetScaffoldKtStandardBottomSheet3) {
                createbrazeuserchangeeventsubscriberlambda01.read++;
            } else if (buttonDefaults instanceof ButtonColors) {
                createbrazeuserchangeeventsubscriberlambda01.read--;
            }
            if (createbrazeuserchangeeventsubscriberlambda03.read > 0) {
                int i7 = MediaSessionCompatQueueItem + 63;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            boolean z4 = createbrazeuserchangeeventsubscriberlambda02.read > 0;
            boolean z5 = createbrazeuserchangeeventsubscriberlambda01.read > 0;
            LazyLayoutItemAnimatorDisplayingDisappearingItemsNode lazyLayoutItemAnimatorDisplayingDisappearingItemsNode = (LazyLayoutItemAnimatorDisplayingDisappearingItemsNode) obj2;
            if (lazyLayoutItemAnimatorDisplayingDisappearingItemsNode.IconCompatParcelizer != z) {
                lazyLayoutItemAnimatorDisplayingDisappearingItemsNode.IconCompatParcelizer = z;
                z2 = true;
            } else {
                z2 = false;
            }
            if (lazyLayoutItemAnimatorDisplayingDisappearingItemsNode.read != z4) {
                lazyLayoutItemAnimatorDisplayingDisappearingItemsNode.read = z4;
            } else {
                z3 = z2;
            }
            if (lazyLayoutItemAnimatorDisplayingDisappearingItemsNode.write == z5) {
                if (z3) {
                }
                return createfromparcel;
            }
            int i8 = MediaDescriptionCompat + 37;
            MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            lazyLayoutItemAnimatorDisplayingDisappearingItemsNode.write = z5;
            int i10 = MediaSessionCompatQueueItem + 113;
            MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            int i12 = MediaDescriptionCompat + 39;
            MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                DrawModifierNodeKt.invalidateDraw(lazyLayoutItemAnimatorDisplayingDisappearingItemsNode);
                int i13 = 71 / 0;
            } else {
                DrawModifierNodeKt.invalidateDraw(lazyLayoutItemAnimatorDisplayingDisappearingItemsNode);
            }
            return createfromparcel;
        }
        getStrictnessusljTpc getstrictnessusljtpc = (getStrictnessusljTpc) obj;
        MapboxNavigation mapboxNavigation = (MapboxNavigation) obj4;
        MapboxMap mapboxMap = (MapboxMap) obj2;
        MapNavigationImpl mapNavigationImpl = (MapNavigationImpl) obj3;
        if (getstrictnessusljtpc instanceof LineBreakCompanion) {
            LocationComponentPluginImpl locationComponentPluginImpl = (LocationComponentPluginImpl) obj5;
            getSimplefcGXIks getsimplefcgxiks = ((LineBreakCompanion) getstrictnessusljtpc).read;
            if (!mapNavigationImpl.PlaybackStateCompat.IconCompatParcelizer() || mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.isEmpty()) {
                objAccess$requestOrShowRoutePreview = mapNavigationImpl.requestRoute(mapboxNavigation, locationComponentPluginImpl, getsimplefcgxiks, false, shortNewsContentCardView);
                if (objAccess$requestOrShowRoutePreview != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objAccess$requestOrShowRoutePreview = createfromparcel;
                }
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mapNavigationImpl.read, getsimplefcgxiks}, getCieXyz.write())).booleanValue()) {
                    List list = mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    mapboxNavigation.getClass();
                    if (!UseCaseAdditionSimulator.isNavigationActive(mapboxNavigation)) {
                        mapboxNavigation.startTripSession();
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mapNavigationImpl.read, getsimplefcgxiks}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, mapboxNavigation.directionsSession.getRoutes()}, getCieXyz.write())).booleanValue()) {
                            mapNavigationImpl.IconCompatParcelizer(locationComponentPluginImpl, getsimplefcgxiks, false);
                            mapNavigationImpl.RemoteActionCompatParcelizer.write(createfromparcel);
                        } else {
                            mapNavigationImpl.write(mapboxNavigation, locationComponentPluginImpl, list, getsimplefcgxiks);
                            mapNavigationImpl.read = getsimplefcgxiks;
                        }
                    } else {
                        mapNavigationImpl.write(mapboxNavigation, locationComponentPluginImpl, list, getsimplefcgxiks);
                        mapNavigationImpl.read = getsimplefcgxiks;
                    }
                } else {
                    objAccess$requestOrShowRoutePreview = mapNavigationImpl.requestRoute(mapboxNavigation, locationComponentPluginImpl, getsimplefcgxiks, false, shortNewsContentCardView);
                    if (objAccess$requestOrShowRoutePreview != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                }
                objAccess$requestOrShowRoutePreview = createfromparcel;
            }
            if (objAccess$requestOrShowRoutePreview != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return createfromparcel;
            }
        } else {
            if (getstrictnessusljtpc instanceof getSimplerAG3T2kannotations) {
                mapNavigationImpl.write.RemoteActionCompatParcelizer(mapboxMap);
                mapNavigationImpl.serializer(mapboxNavigation, (LocationComponentPluginImpl) obj5, mapboxMap, ((getSimplerAG3T2kannotations) getstrictnessusljtpc).RemoteActionCompatParcelizer, false);
                return createfromparcel;
            }
            if (getstrictnessusljtpc instanceof getSimplerAG3T2k) {
                mapNavigationImpl.serializer(mapboxNavigation, (LocationComponentPluginImpl) obj5, mapboxMap, "paused", true);
                return createfromparcel;
            }
            if ((getstrictnessusljtpc instanceof getParagraphrAG3T2kannotations) || (getstrictnessusljtpc instanceof getHeadingrAG3T2kannotations)) {
                return createfromparcel;
            }
            if (getstrictnessusljtpc instanceof getWordBreakjp8hJ3c) {
                if (mapboxMap.getStyleDeprecated() == null) {
                    return createfromparcel;
                }
                accessgetGocp accessgetgocp = ((getWordBreakjp8hJ3c) getstrictnessusljtpc).read;
                if (accessgetgocp == null) {
                    mapNavigationImpl.write.RemoteActionCompatParcelizer(mapboxMap);
                    return createfromparcel;
                }
                int i14 = MediaSessionCompatQueueItem + 71;
                MediaDescriptionCompat = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                mapNavigationImpl.write.RemoteActionCompatParcelizer(accessgetgocp);
                return createfromparcel;
            }
            if (getstrictnessusljtpc instanceof getParagraphrAG3T2k) {
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                getSimplefcGXIks getsimplefcgxiks2 = ((getParagraphrAG3T2k) getstrictnessusljtpc).RemoteActionCompatParcelizer;
                forest.IconCompatParcelizer("navigation state: rerouting, avoidTolls=" + getsimplefcgxiks2.RemoteActionCompatParcelizer + ", avoidHighways=" + getsimplefcgxiks2.serializer, new Object[0]);
                TurnByTurnNavigationLogger turnByTurnNavigationLogger = mapNavigationImpl._init_lambda3.RemoteActionCompatParcelizer;
                BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger.write, null, null, new RoomDatabase.AnonymousClass1.C00051(turnByTurnNavigationLogger, true, null), 3);
                objAccess$requestOrShowRoutePreview = mapNavigationImpl.requestRoute(mapboxNavigation, (LocationComponentPluginImpl) obj5, getsimplefcgxiks2, true, shortNewsContentCardView);
                if (objAccess$requestOrShowRoutePreview != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
            } else {
                if (!(getstrictnessusljtpc instanceof getUnspecifiedrAG3T2kannotations)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                mapNavigationImpl.write.RemoteActionCompatParcelizer(mapboxMap);
                SecondaryRouteApi secondaryRouteApi = mapNavigationImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                getUnspecifiedrAG3T2kannotations getunspecifiedrag3t2kannotations = (getUnspecifiedrAG3T2kannotations) getstrictnessusljtpc;
                mapboxNavigation.getClass();
                if (!getunspecifiedrag3t2kannotations.equals(secondaryRouteApi.RemoteActionCompatParcelizer) || (!getunspecifiedrag3t2kannotations.serializer.isEmpty() && (((collection = (Collection) secondaryRouteApi.MediaBrowserCompatMediaItem.IconCompatParcelizer.read()) == null || collection.isEmpty()) && secondaryRouteApi.write == null))) {
                    DeferredCoroutine deferredCoroutine = secondaryRouteApi.write;
                    if (deferredCoroutine != null) {
                        deferredCoroutine.write((CancellationException) null);
                    }
                    secondaryRouteApi.RemoteActionCompatParcelizer = getunspecifiedrag3t2kannotations;
                    fromColorLong fromcolorlong = secondaryRouteApi.read;
                    secondaryRouteApi.write = fromcolorlong != null ? BuildersKt.IconCompatParcelizer(fromcolorlong, null, null, new ReconnectScheduler$schedule$1(getunspecifiedrag3t2kannotations, secondaryRouteApi, mapboxNavigation, null, 22), 3) : null;
                }
                objAccess$requestOrShowRoutePreview = MapNavigationImpl.access$requestOrShowRoutePreview(mapNavigationImpl, mapboxNavigation, getunspecifiedrag3t2kannotations.read, mapboxMap, shortNewsContentCardView);
                if (objAccess$requestOrShowRoutePreview != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
            }
        }
        return objAccess$requestOrShowRoutePreview;
    }
}
