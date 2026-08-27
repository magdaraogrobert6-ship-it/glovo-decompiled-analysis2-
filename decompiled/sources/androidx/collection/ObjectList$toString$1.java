package androidx.collection;

import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.sqlite.SQLite;
import com.adjust.sdk.Constants;
import com.braze.models.FeatureFlag;
import com.deliveryhero.selfServiceChat.ui.WebChatFragment;
import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel;
import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$1;
import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel$startTimerForTimeout$1$1;
import com.google.android.gms.internal.mlkit_vision_face.zzmb;
import com.huawei.hms.android.SystemUtils;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.utils.FlatbuffersListWrapper;
import com.mapbox.directions.generated.Coordinate;
import com.mapbox.directions.generated.route_request.IntersectionDistances;
import com.mapbox.directions.generated.route_request.Leg;
import com.mapbox.directions.generated.route_request.Route;
import com.mapbox.directions.generated.route_request.Step;
import com.mapbox.directions.generated.route_request.StepsContainer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.plugin.gestures.GesturesPlugin;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl;
import com.mapbox.navigation.base.internal.CongestionNumericOverride;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.base.utils.DecodeUtils;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils$getPrimaryRouteLineDynamicData$trafficExpressionProvider$1;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.mapbox.navigation.voice.api.VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes;
import com.mapbox.navigation.voice.model.AudioFocusOwner;
import com.mapbox.search.adapter.BaseSearchCallbackAdapter;
import com.mapbox.search.common.SearchCancellationException;
import com.mapbox.search.internal.bindgen.Error;
import com.sentiance.core.model.events.N$b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.ContentInViewNode;
import o.FocusPropertiesNode;
import o.GraphicsLayerV29;
import o.ModalBottomSheet_androidKtModalBottomSheetDialogdialog111;
import o.ShortNewsContentCardView;
import o.TooltipDefaults;
import o.accessgetInstancedelegatecp;
import o.accessgetMayRenderInSoftwarecp;
import o.applyCompositingStrategyZ1X6vPc;
import o.asComposePaint;
import o.awaitTouchSlopOrCancellationjO51t88;
import o.calculateApproachOffset;
import o.createFromParcel;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getCieXyz;
import o.getConfig;
import o.getPerformImeAction;
import o.hgExternalSyntheticLambda1;
import o.hgExternalSyntheticLambda9;
import o.instance_delegatelambda0;
import o.isMaxVisibleEQwtKwdefault;
import o.isPlacementApproachInProgress;
import o.onContentCardDismissed;
import o.onDrawBehind;
import o.onViewAttachedToWindow;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.requiresLayerPaint;
import o.setTestFailCreateRenderNodeui_graphics;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectList$toString$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ObjectList$toString$1(int i, Object obj) {
        super(1);
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o.instance_delegatelambda0] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.util.ArrayList] */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        LegAnnotation.Builder builder;
        LegAnnotation.Builder builderCongestionNumeric;
        Integer num;
        List<Integer> listCongestionNumeric;
        String str;
        int i = this.RemoteActionCompatParcelizer;
        Object arrayList = instance_delegatelambda0.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.write;
        boolean z = true;
        z = true;
        ArrayList arrayList2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        int i2 = 0;
        switch (i) {
            case 0:
                return obj == ((ContentInViewNode) obj2) ? "(this)" : String.valueOf(obj);
            case 1:
                return obj == ((isMaxVisibleEQwtKwdefault) obj2) ? "(this)" : String.valueOf(obj);
            case 2:
                return obj == ((awaitTouchSlopOrCancellationjO51t88) obj2) ? "(this)" : String.valueOf(obj);
            case 3:
                return Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, obj2}, getCieXyz.write())).booleanValue());
            case 4:
                calculateApproachOffset calculateapproachoffset = (calculateApproachOffset) obj;
                float f = calculateapproachoffset.write;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = calculateapproachoffset.IconCompatParcelizer;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = calculateapproachoffset.serializer;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = calculateapproachoffset.read;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return Color.m712boximpl(Color.m719convertvNxB06k(ColorKt.Color(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, ColorSpaces.INSTANCE.getOklab()), (ColorSpace) obj2));
            case 5:
                ((GraphicsLayerScope) obj).setAlpha(((Number) ((onViewAttachedToWindow) obj2).getValue()).floatValue());
                return createfromparcel;
            case 6:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("clickable");
                inspectorInfo.getProperties().set(FeatureFlag.ENABLED, Boolean.TRUE);
                inspectorInfo.getProperties().set("onClickLabel", null);
                inspectorInfo.getProperties().set("role", null);
                inspectorInfo.getProperties().set("onClick", (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2);
                return createfromparcel;
            case 7:
                InspectorInfo inspectorInfo2 = (InspectorInfo) obj;
                inspectorInfo2.setName("align");
                inspectorInfo2.setValue((Alignment) obj2);
                return createfromparcel;
            case 8:
                InspectorInfo inspectorInfo3 = (InspectorInfo) obj;
                inspectorInfo3.setName("consumeWindowInsets");
                inspectorInfo3.getProperties().set("insets", (ModalBottomSheet_androidKtModalBottomSheetDialogdialog111) obj2);
                return createfromparcel;
            case 9:
                InspectorInfo inspectorInfo4 = (InspectorInfo) obj;
                inspectorInfo4.setName("windowInsetsPadding");
                inspectorInfo4.getProperties().set("insets", (TooltipDefaults) obj2);
                return createfromparcel;
            case 10:
                ((onDrawBehind) obj2).cancel(false);
                return createfromparcel;
            case 11:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                View view = (View) entry.getValue();
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                return Boolean.valueOf(onContentCardDismissed.write((Collection) obj2, view.getTransitionName()));
            case 12:
                applyCompositingStrategyZ1X6vPc applycompositingstrategyz1x6vpc = (applyCompositingStrategyZ1X6vPc) obj;
                WebChatFragment webChatFragment = (WebChatFragment) obj2;
                applycompositingstrategyz1x6vpc.getClass();
                int i3 = 6;
                if (applycompositingstrategyz1x6vpc instanceof setTestFailCreateRenderNodeui_graphics) {
                    Uri uri = ((setTestFailCreateRenderNodeui_graphics) applycompositingstrategyz1x6vpc).read;
                    if (uri != null) {
                        WebChatViewmodel webChatViewmodelIconCompatParcelizer = webChatFragment.IconCompatParcelizer();
                        webChatViewmodelIconCompatParcelizer.getClass();
                        asComposePaint ascomposepaintIconCompatParcelizer = toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewmodelIconCompatParcelizer);
                        BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer, new getConfig(ascomposepaintIconCompatParcelizer, webChatViewmodelIconCompatParcelizer, 2), null, new WebChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$1(objArr5 == true ? 1 : 0, webChatViewmodelIconCompatParcelizer, uri, z ? 1 : 0), 2);
                    } else {
                        isPlacementApproachInProgress isplacementapproachinprogress = webChatFragment.IconCompatParcelizer().MediaSessionCompatToken;
                        if (isplacementapproachinprogress instanceof GraphicsLayerV29) {
                            WebChatViewmodel webChatViewmodelIconCompatParcelizer2 = webChatFragment.IconCompatParcelizer();
                            Uri uri2 = ((GraphicsLayerV29) isplacementapproachinprogress).serializer;
                            webChatViewmodelIconCompatParcelizer2.getClass();
                            asComposePaint ascomposepaintIconCompatParcelizer2 = toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewmodelIconCompatParcelizer2);
                            BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer2, new getConfig(ascomposepaintIconCompatParcelizer2, webChatViewmodelIconCompatParcelizer2, 2), null, new WebChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$1(objArr4 == true ? 1 : 0, webChatViewmodelIconCompatParcelizer2, uri2, i2), 2);
                        } else if (isplacementapproachinprogress instanceof accessgetMayRenderInSoftwarecp) {
                            WebChatViewmodel webChatViewmodelIconCompatParcelizer3 = webChatFragment.IconCompatParcelizer();
                            Uri uri3 = ((accessgetMayRenderInSoftwarecp) isplacementapproachinprogress).serializer;
                            webChatViewmodelIconCompatParcelizer3.getClass();
                            asComposePaint ascomposepaintIconCompatParcelizer3 = toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewmodelIconCompatParcelizer3);
                            BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer3, new getConfig(ascomposepaintIconCompatParcelizer3, webChatViewmodelIconCompatParcelizer3, 2), null, new WebChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$1(objArr3 == true ? 1 : 0, webChatViewmodelIconCompatParcelizer3, uri3, i2), 2);
                        } else {
                            WebChatViewmodel webChatViewmodelIconCompatParcelizer4 = webChatFragment.IconCompatParcelizer();
                            webChatViewmodelIconCompatParcelizer4.getClass();
                            asComposePaint ascomposepaintIconCompatParcelizer4 = toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewmodelIconCompatParcelizer4);
                            BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer4, new getConfig(ascomposepaintIconCompatParcelizer4, webChatViewmodelIconCompatParcelizer4, 2), null, new WebChatViewmodel$startTimerForTimeout$1$1((ShortNewsContentCardView) (objArr2 == true ? 1 : 0), webChatViewmodelIconCompatParcelizer4, i3), 2);
                        }
                    }
                } else if (applycompositingstrategyz1x6vpc.equals(requiresLayerPaint.write)) {
                    WebChatViewmodel webChatViewmodelIconCompatParcelizer5 = webChatFragment.IconCompatParcelizer();
                    webChatViewmodelIconCompatParcelizer5.getClass();
                    asComposePaint ascomposepaintIconCompatParcelizer5 = toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewmodelIconCompatParcelizer5);
                    BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer5, new getConfig(ascomposepaintIconCompatParcelizer5, webChatViewmodelIconCompatParcelizer5, 2), null, new WebChatViewmodel$startTimerForTimeout$1$1((ShortNewsContentCardView) (objArr == true ? 1 : 0), webChatViewmodelIconCompatParcelizer5, i3), 2);
                }
                return createfromparcel;
            case 13:
                GesturesPlugin gesturesPlugin = (GesturesPlugin) obj;
                gesturesPlugin.getClass();
                ((GesturesPluginImpl) gesturesPlugin).onMapClickListeners.remove((hgExternalSyntheticLambda9) obj2);
                return createfromparcel;
            case 14:
                GesturesPlugin gesturesPlugin2 = (GesturesPlugin) obj;
                gesturesPlugin2.getClass();
                ((GesturesPluginImpl) gesturesPlugin2).onMoveListeners.remove((hgExternalSyntheticLambda1) obj2);
                return createfromparcel;
            case 15:
                return Double.valueOf(((StepsContainer) obj2).steps(((Number) obj).intValue()));
            case 16:
                StepsContainer stepsContainerLegs = ((IntersectionDistances) obj2).legs(((Number) obj).intValue());
                stepsContainerLegs.getClass();
                List list = FlatbuffersListWrapper.INSTANCE.get(stepsContainerLegs.getStepsLength(), new ObjectList$toString$1(15, stepsContainerLegs));
                return list == null ? arrayList : list;
            case 17:
                Coordinate coordinateGeometry = ((Step) obj2).geometry(((Number) obj).intValue());
                coordinateGeometry.getClass();
                Point pointFromLngLat = Point.fromLngLat(coordinateGeometry.getLongitude(), coordinateGeometry.getLatitude());
                pointFromLngLat.getClass();
                return pointFromLngLat;
            case 18:
                Step stepSteps = ((Leg) obj2).steps(((Number) obj).intValue());
                stepSteps.getClass();
                List list2 = FlatbuffersListWrapper.INSTANCE.get(stepSteps.getGeometryLength(), new ObjectList$toString$1(17, stepSteps));
                return list2 == null ? arrayList : list2;
            case 19:
                Leg legLegs = ((Route) obj2).legs(((Number) obj).intValue());
                legLegs.getClass();
                List list3 = FlatbuffersListWrapper.INSTANCE.get(legLegs.getStepsLength(), new ObjectList$toString$1(18, legLegs));
                return list3 == null ? arrayList : list3;
            case 20:
                DecodeUtils.CachedRouteInfo cachedRouteInfo = (DecodeUtils.CachedRouteInfo) obj;
                cachedRouteInfo.getClass();
                ArrayList arrayList3 = (ArrayList) obj2;
                if (!arrayList3.isEmpty()) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        if (zzmb.isSameRoute(cachedRouteInfo.route, (DirectionsRoute) it.next())) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 21:
                List list4 = (List) obj;
                list4.getClass();
                int size = list4.size() - ((RouteProgress) obj2).remainingWaypoints;
                return Integer.valueOf(size >= 1 ? size : 1);
            case 22:
                DirectionsRoute directionsRoute = (DirectionsRoute) obj;
                directionsRoute.getClass();
                DirectionsRoute.Builder builder2 = directionsRoute.toBuilder();
                List<RouteLeg> listLegs = directionsRoute.legs();
                if (listLegs != null) {
                    List<RouteLeg> list5 = listLegs;
                    CongestionNumericOverride congestionNumericOverride = (CongestionNumericOverride) obj2;
                    ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(list5, 10));
                    for (Object obj3 : list5) {
                        if (i2 < 0) {
                            SQLite.serializer();
                            throw null;
                        }
                        RouteLeg routeLegBuild = (RouteLeg) obj3;
                        int i4 = congestionNumericOverride.legIndex;
                        int i5 = congestionNumericOverride.startIndex;
                        if (i2 == i4) {
                            LegAnnotation legAnnotationAnnotation = routeLegBuild.annotation();
                            List<Integer> listCongestionNumeric2 = legAnnotationAnnotation != null ? legAnnotationAnnotation.congestionNumeric() : null;
                            ArrayList arrayList5 = listCongestionNumeric2 != null ? new ArrayList(listCongestionNumeric2) : new ArrayList();
                            if (listCongestionNumeric2 != null) {
                                int i6 = congestionNumericOverride.length;
                                for (int i7 = i5; i7 < i6 + i5; i7++) {
                                    List list6 = congestionNumericOverride.originalCongestionNumeric;
                                    if (list6 == null || (num = (Integer) list6.get(i7 - i5)) == null) {
                                        num = arrayList5.get(i7);
                                    }
                                    arrayList5.set(i7, num);
                                }
                            }
                            RouteLeg.Builder builder3 = routeLegBuild.toBuilder();
                            LegAnnotation legAnnotationAnnotation2 = routeLegBuild.annotation();
                            routeLegBuild = builder3.annotation((legAnnotationAnnotation2 == null || (builder = legAnnotationAnnotation2.toBuilder()) == null || (builderCongestionNumeric = builder.congestionNumeric(arrayList5)) == null) ? null : builderCongestionNumeric.build()).build();
                        }
                        arrayList4.add(routeLegBuild);
                        i2++;
                    }
                    arrayList2 = arrayList4;
                }
                DirectionsRoute directionsRouteBuild = builder2.legs(arrayList2).build();
                directionsRouteBuild.getClass();
                return directionsRouteBuild;
            case 23:
                N$b n$b = (N$b) obj2;
                n$b.IconCompatParcelizer = null;
                n$b.serializer = null;
                return createfromparcel;
            case 24:
                getPerformImeAction getperformimeaction = (getPerformImeAction) obj;
                getperformimeaction.getClass();
                ((CancellableContinuationImpl) obj2).resumeWith(getperformimeaction);
                return createfromparcel;
            case 25:
                RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
                routeLineViewOptionsData.getClass();
                return (StylePropertyValue) ((MapboxRouteLineUtils$getPrimaryRouteLineDynamicData$trafficExpressionProvider$1) obj2).invoke(routeLineViewOptionsData);
            case 26:
                RouteLeg routeLeg = (RouteLeg) obj;
                routeLeg.getClass();
                LegAnnotation legAnnotationAnnotation3 = routeLeg.annotation();
                if (legAnnotationAnnotation3 != null && (listCongestionNumeric = legAnnotationAnnotation3.congestionNumeric()) != null) {
                    List<Integer> list7 = listCongestionNumeric;
                    MapboxRouteLineApiOptions mapboxRouteLineApiOptions = (MapboxRouteLineApiOptions) obj2;
                    arrayList = new ArrayList(accessgetInstancedelegatecp.write(list7, 10));
                    for (Integer num2 : list7) {
                        MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                        mapboxRouteLineApiOptions.getClass();
                        ensureSubscribedToInAppMessageEventslambda7 lowCongestionRange = mapboxRouteLineApiOptions.getLowCongestionRange();
                        if (num2 == null || !lowCongestionRange.serializer(num2.intValue())) {
                            ensureSubscribedToInAppMessageEventslambda7 heavyCongestionRange = mapboxRouteLineApiOptions.getHeavyCongestionRange();
                            if (num2 == null || !heavyCongestionRange.serializer(num2.intValue())) {
                                str = (num2 == null || !mapboxRouteLineApiOptions.getSevereCongestionRange().serializer(num2.intValue())) ? (num2 == null || !mapboxRouteLineApiOptions.getModerateCongestionRange().serializer(num2.intValue())) ? SystemUtils.UNKNOWN : "moderate" : "severe";
                            } else {
                                str = "heavy";
                            }
                        } else {
                            str = Constants.LOW;
                        }
                        arrayList.add(str);
                    }
                }
                return arrayList;
            case 27:
                MediaPlayer mediaPlayer = (MediaPlayer) obj;
                mediaPlayer.getClass();
                mediaPlayer.setAudioAttributes(((VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes) obj2).audioAttributes$voice_release(AudioFocusOwner.MediaPlayer));
                return createfromparcel;
            case 28:
                BaseSearchCallbackAdapter baseSearchCallbackAdapter = (BaseSearchCallbackAdapter) obj;
                baseSearchCallbackAdapter.getClass();
                String reason = ((Error) obj2).getRequestCancelled().getReason();
                reason.getClass();
                baseSearchCallbackAdapter.onError(new SearchCancellationException(reason));
                return createfromparcel;
            default:
                BaseSearchCallbackAdapter baseSearchCallbackAdapter2 = (BaseSearchCallbackAdapter) obj;
                baseSearchCallbackAdapter2.getClass();
                baseSearchCallbackAdapter2.onError((IllegalStateException) obj2);
                return createfromparcel;
        }
    }
}
