package com.mapbox.navigation.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioFocusRequest;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.sqlite.SQLite;
import com.mapbox.annotation.module.MapboxModuleType;
import com.mapbox.bindgen.Value;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.Style;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.navigation.base.formatter.DistanceFormatter;
import com.mapbox.navigation.base.options.NavigationOptions;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.mapbox.navigation.ui.maps.route.line.model.RouteFeatureData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineExpressionData;
import com.mapbox.navigation.ui.maps.route.line.model.SegmentColorType;
import com.mapbox.navigation.voice.api.VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes;
import com.mapbox.navigation.voice.model.AudioFocusOwner;
import com.mapbox.search.adapter.BaseSearchCallbackAdapter;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.mapbox.search.base.BaseResponseInfo;
import com.mapbox.search.base.location.LocationEngineAdapter;
import io.sentry.SentryOptions;
import io.sentry.android.replay.capture.MediaSessionCompatQueueItem;
import io.sentry.android.replay.capture.ParcelableVolumeInfo;
import io.sentry.android.replay.capture.RatingCompat;
import io.sentry.android.replay.capture.write;
import io.sentry.rrweb.IconCompatParcelizer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.DeferredCoroutine;
import o.AddToCustomAttributeArrayStep;
import o.ClipKt;
import o.LayerSnapshotV22toBitmap2image11;
import o.OutlineVerificationHelper;
import o.createFromParcel;
import o.executelambda4;
import o.getCopyText;
import o.getQueryParameterslambda2;
import o.onDrawWithContent;
import o.onViewAttachedToWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigation$notification$1$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Object $distanceFormatter;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxNavigation$notification$1$1(r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg, ArrayList arrayList, Canvas canvas) {
        super(1);
        this.$r8$classId = 14;
        this.this$0 = r8lambdauosl1ojcz1lncaiooglfrbn5pcg;
        this.$distanceFormatter = canvas;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws InterruptedException, IOException {
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        Integer numWrite;
        List list;
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.$distanceFormatter;
        Object obj3 = this.this$0;
        int i2 = 0;
        switch (i) {
            case 0:
                ((MapboxModuleType) obj).getClass();
                MapboxNavigation mapboxNavigation = (MapboxNavigation) obj3;
                NavigationOptions navigationOptions = mapboxNavigation.navigationOptions;
                getCopyText getcopytext = mapboxNavigation.tripNotificationInterceptorOwner;
                navigationOptions.getClass();
                getcopytext.getClass();
                return new ModuleProviderArgument[]{new ModuleProviderArgument(NavigationOptions.class, navigationOptions), new ModuleProviderArgument(getCopyText.class, getcopytext), new ModuleProviderArgument(DistanceFormatter.class, (AnalyticsServiceImpl) obj2)};
            case 1:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("constrainAs");
                inspectorInfo.getProperties().set("ref", (ClipKt) obj3);
                inspectorInfo.getProperties().set("constrainBlock", (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2);
                return createfromparcel;
            case 2:
                Throwable th = (Throwable) obj;
                onDrawWithContent ondrawwithcontent = (onDrawWithContent) obj3;
                if (th == null) {
                    ondrawwithcontent.RemoteActionCompatParcelizer(((DeferredCoroutine) obj2).RatingCompat());
                } else if (th instanceof CancellationException) {
                    ondrawwithcontent.serializer();
                } else {
                    ondrawwithcontent.serializer(th);
                }
                return createfromparcel;
            case 3:
                LayerSnapshotV22toBitmap2image11 layerSnapshotV22toBitmap2image11 = (LayerSnapshotV22toBitmap2image11) obj;
                layerSnapshotV22toBitmap2image11.getClass();
                layerSnapshotV22toBitmap2image11.ParcelableVolumeInfo = (String) obj3;
                layerSnapshotV22toBitmap2image11.write = (OutlineVerificationHelper) obj2;
                return createfromparcel;
            case 4:
                CameraAnimationsPlugin cameraAnimationsPlugin = (CameraAnimationsPlugin) obj;
                cameraAnimationsPlugin.getClass();
                return ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).easeTo((CameraOptions) obj3, (MapAnimationOptions) obj2, null);
            case 5:
                Expression.ExpressionBuilder expressionBuilder = (Expression.ExpressionBuilder) obj;
                expressionBuilder.getClass();
                RouteLineExpressionData routeLineExpressionData = (RouteLineExpressionData) obj3;
                expressionBuilder.literal(routeLineExpressionData.offset);
                expressionBuilder.color(routeLineExpressionData.segmentColorType.getColor((RouteLineViewOptionsData) obj2));
                return createfromparcel;
            case 6:
                RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
                routeLineViewOptionsData.getClass();
                MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                NavigationRoute navigationRoute = (NavigationRoute) obj3;
                MapboxRouteLineApi mapboxRouteLineApi = (MapboxRouteLineApi) obj2;
                MapboxRouteLineApiOptions mapboxRouteLineApiOptions = mapboxRouteLineApi.routeLineOptions;
                CopyOnWriteArrayList copyOnWriteArrayList = mapboxRouteLineApi.trafficBackfillRoadClasses;
                Double d = (Double) mapboxRouteLineApi.alternativesDeviationOffset.get(navigationRoute.id);
                return new StylePropertyValue(MapboxRouteLineUtils.getTrafficLineExpression$ui_maps_release(navigationRoute, mapboxRouteLineApiOptions, routeLineViewOptionsData, copyOnWriteArrayList, d != null ? d.doubleValue() : 0.0d, SegmentColorType.ALTERNATIVE_UNKNOWN_CONGESTION), StylePropertyValueKind.EXPRESSION);
            case 7:
                RouteLineViewOptionsData routeLineViewOptionsData2 = (RouteLineViewOptionsData) obj;
                routeLineViewOptionsData2.getClass();
                MapboxRouteLineUtils mapboxRouteLineUtils2 = MapboxRouteLineUtils.INSTANCE;
                RouteFeatureData routeFeatureData = (RouteFeatureData) obj3;
                routeFeatureData.getClass();
                NavigationRoute navigationRoute2 = routeFeatureData.route;
                MapboxRouteLineApi mapboxRouteLineApi2 = (MapboxRouteLineApi) obj2;
                MapboxRouteLineApiOptions mapboxRouteLineApiOptions2 = mapboxRouteLineApi2.routeLineOptions;
                CopyOnWriteArrayList copyOnWriteArrayList2 = mapboxRouteLineApi2.trafficBackfillRoadClasses;
                Double d2 = (Double) mapboxRouteLineApi2.alternativesDeviationOffset.get(navigationRoute2.id);
                return new StylePropertyValue(MapboxRouteLineUtils.getTrafficLineExpression$ui_maps_release(navigationRoute2, mapboxRouteLineApiOptions2, routeLineViewOptionsData2, copyOnWriteArrayList2, d2 != null ? d2.doubleValue() : 0.0d, SegmentColorType.ALTERNATIVE_UNKNOWN_CONGESTION), StylePropertyValueKind.EXPRESSION);
            case 8:
                Style style = (Style) obj;
                style.getClass();
                Value value = (Value) obj3;
                String str = (String) obj2;
                if (value != null) {
                    style.setStyleLayerProperty(str, "line-trim-offset", value);
                }
                return createfromparcel;
            case 9:
                AudioFocusRequest.Builder builder = (AudioFocusRequest.Builder) obj;
                builder.getClass();
                builder.setAudioAttributes(((VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes) obj3).audioAttributes$voice_release((AudioFocusOwner) obj2));
                return createfromparcel;
            case 10:
                BaseSearchCallbackAdapter baseSearchCallbackAdapter = (BaseSearchCallbackAdapter) obj;
                baseSearchCallbackAdapter.getClass();
                baseSearchCallbackAdapter.onResults((ArrayList) obj3, (BaseResponseInfo) obj2);
                return createfromparcel;
            case 11:
                MediaSessionCompatQueueItem mediaSessionCompatQueueItem = (MediaSessionCompatQueueItem) obj;
                mediaSessionCompatQueueItem.getClass();
                write writeVar = (write) obj3;
                ArrayList arrayList = writeVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                AddToCustomAttributeArrayStep addToCustomAttributeArrayStep = writeVar.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                arrayList.getClass();
                RatingCompat ratingCompat = (RatingCompat) (arrayList.isEmpty() ? null : arrayList.remove(0));
                while (ratingCompat != null) {
                    ratingCompat.RemoteActionCompatParcelizer(addToCustomAttributeArrayStep, new executelambda4());
                    ratingCompat = (RatingCompat) (arrayList.isEmpty() ? null : arrayList.remove(0));
                    Thread.sleep(100L);
                }
                if (mediaSessionCompatQueueItem instanceof RatingCompat) {
                    RatingCompat ratingCompat2 = (RatingCompat) mediaSessionCompatQueueItem;
                    ratingCompat2.RemoteActionCompatParcelizer(addToCustomAttributeArrayStep, new executelambda4());
                    Date date = ratingCompat2.read.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    date.getClass();
                    ((LocationEngineAdapter.AnonymousClass1) obj2).invoke(date);
                }
                return createfromparcel;
            case 12:
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                iconCompatParcelizer.getClass();
                if (iconCompatParcelizer.PlaybackStateCompatCustomAction >= ((Date) obj3).getTime()) {
                    ((ArrayList) obj2).add(iconCompatParcelizer);
                }
                return createfromparcel;
            case 13:
                MediaSessionCompatQueueItem mediaSessionCompatQueueItem2 = (MediaSessionCompatQueueItem) obj;
                ParcelableVolumeInfo parcelableVolumeInfo = (ParcelableVolumeInfo) obj3;
                mediaSessionCompatQueueItem2.getClass();
                if (mediaSessionCompatQueueItem2 instanceof RatingCompat) {
                    ((RatingCompat) mediaSessionCompatQueueItem2).RemoteActionCompatParcelizer(parcelableVolumeInfo.ResultReceiver, new executelambda4());
                }
                parcelableVolumeInfo.IconCompatParcelizer(-1);
                TuplesKt.serializer((File) obj2);
                return createfromparcel;
            default:
                io.sentry.android.replay.viewhierarchy.IconCompatParcelizer iconCompatParcelizer2 = (io.sentry.android.replay.viewhierarchy.IconCompatParcelizer) obj;
                r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg = (r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg) obj3;
                onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = (onViewDetachedFromWindowlambda1) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.PlaybackStateCompat;
                onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda2 = (onViewDetachedFromWindowlambda1) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.RatingCompat;
                iconCompatParcelizer2.getClass();
                Rect rect = iconCompatParcelizer2.RemoteActionCompatParcelizer;
                if (iconCompatParcelizer2.read && iconCompatParcelizer2.RatingCompat > 0 && iconCompatParcelizer2.serializer > 0) {
                    if (rect == null) {
                        return Boolean.FALSE;
                    }
                    int iIntValue = -16777216;
                    int i3 = 1;
                    if (iconCompatParcelizer2 instanceof io.sentry.android.replay.viewhierarchy.write) {
                        List list2 = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{rect}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                        Bitmap bitmap = (Bitmap) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaBrowserCompatMediaItem;
                        if (!((AtomicBoolean) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.ParcelableVolumeInfo).get() && !bitmap.isRecycled() && !((Bitmap) onviewdetachedfromwindowlambda2.MediaSessionCompatResultReceiverWrapper()).isRecycled()) {
                            Rect rect2 = new Rect(rect);
                            RectF rectF = new RectF(rect2);
                            ((Matrix) ((onViewDetachedFromWindowlambda1) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaMetadataCompat).MediaSessionCompatResultReceiverWrapper()).mapRect(rectF);
                            rectF.round(rect2);
                            ((Canvas) ((onViewDetachedFromWindowlambda1) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaDescriptionCompat).MediaSessionCompatResultReceiverWrapper()).drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
                            iIntValue = ((Bitmap) onviewdetachedfromwindowlambda2.MediaSessionCompatResultReceiverWrapper()).getPixel(0, 0);
                        }
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(list2, Integer.valueOf(iIntValue));
                    } else if (iconCompatParcelizer2 instanceof io.sentry.android.replay.viewhierarchy.MediaSessionCompatQueueItem) {
                        io.sentry.android.replay.viewhierarchy.MediaSessionCompatQueueItem mediaSessionCompatQueueItem3 = (io.sentry.android.replay.viewhierarchy.MediaSessionCompatQueueItem) iconCompatParcelizer2;
                        io.sentry.android.replay.util.RatingCompat ratingCompat3 = mediaSessionCompatQueueItem3.MediaBrowserCompatMediaItem;
                        iIntValue = ((ratingCompat3 == null || (numWrite = ratingCompat3.write()) == null) && (numWrite = mediaSessionCompatQueueItem3.MediaSessionCompatQueueItem) == null) ? -16777216 : numWrite.intValue();
                        int i4 = mediaSessionCompatQueueItem3.MediaDescriptionCompat;
                        int i5 = mediaSessionCompatQueueItem3.MediaMetadataCompat;
                        if (ratingCompat3 == null) {
                            list = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{rect}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            int iRatingCompat = ratingCompat3.RatingCompat();
                            int i6 = 0;
                            while (i6 < iRatingCompat) {
                                int iWrite = (int) ratingCompat3.write(i6, ratingCompat3.serializer(i6));
                                int iRemoteActionCompatParcelizer = ratingCompat3.RemoteActionCompatParcelizer(i6);
                                int iIconCompatParcelizer = ratingCompat3.IconCompatParcelizer(i6);
                                int iWrite2 = (int) ratingCompat3.write(i6, (iIconCompatParcelizer - iRemoteActionCompatParcelizer) + (iRemoteActionCompatParcelizer > 0 ? i3 : i2));
                                if (iWrite2 == 0 && iIconCompatParcelizer > 0) {
                                    iWrite2 = ((int) ratingCompat3.write(i6, iIconCompatParcelizer - 1)) + i3;
                                }
                                int iWrite3 = ratingCompat3.write(i6);
                                int i7 = ratingCompat3.read(i6);
                                Rect rect3 = new Rect();
                                int i8 = rect.left + i4 + iWrite;
                                rect3.left = i8;
                                rect3.right = (iWrite2 - iWrite) + i8;
                                int i9 = rect.top + i5 + iWrite3;
                                rect3.top = i9;
                                rect3.bottom = (i7 - iWrite3) + i9;
                                arrayList2.add(rect3);
                                i6++;
                                i2 = 0;
                                i3 = 1;
                            }
                            list = arrayList2;
                        }
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(list, Integer.valueOf(iIntValue));
                    } else {
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{rect}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), -16777216);
                    }
                    List list3 = (List) onviewattachedtowindowlambda0.serializer;
                    ((Paint) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper()).setColor(((Number) onviewattachedtowindowlambda0.write).intValue());
                    Canvas canvas = (Canvas) obj2;
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        canvas.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, (Paint) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper());
                    }
                    ((SentryOptions) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.serializer).getReplayController().getClass();
                }
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxNavigation$notification$1$1(Object obj, int i, Object obj2) {
        super(1);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$distanceFormatter = obj2;
    }
}
