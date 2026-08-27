package org.koin.android.ext.koin;

import android.app.Application;
import android.content.Context;
import android.graphics.PointF;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.android.gestures.MoveGestureDetector;
import com.mapbox.maps.ClickInteraction;
import com.mapbox.maps.DragInteraction;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.LongClickInteraction;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.PlatformEventInfo;
import com.mapbox.maps.PlatformEventType;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.mapbox.maps.plugin.annotation.AnnotationManagerImpl;
import com.mapbox.maps.plugin.annotation.ClusterAnnotationManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.getTrackingServicefwf_client_release;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes4.dex */
public final class KoinExtKt$androidContext$1$1 extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KoinExtKt$androidContext$1$1(int i, Object obj) {
        super(2);
        this.read = i;
        this.serializer = obj;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        ArrayList clusterClickListeners;
        ArrayList clusterLongClickListeners;
        int i = this.read;
        Object obj3 = this.serializer;
        if (i == 0) {
            ((Scope) obj).getClass();
            ((getTrackingServicefwf_client_release) obj2).getClass();
            return (Application) ((Context) obj3);
        }
        final int i2 = 1;
        final int i3 = 0;
        if (i == 1) {
            Boolean bool = Boolean.FALSE;
            FeaturesetFeature featuresetFeature = (FeaturesetFeature) obj;
            featuresetFeature.getClass();
            ((InteractionContext) obj2).getClass();
            Object obj4 = (AnnotationManagerImpl) obj3;
            if (featuresetFeature.getProperties().optBoolean("cluster", false) && (obj4 instanceof ClusterAnnotationManager) && ((clusterClickListeners = ((ClusterAnnotationManager) obj4).getClusterClickListeners()) == null || !clusterClickListeners.isEmpty())) {
                Iterator it = clusterClickListeners.iterator();
                if (it.hasNext()) {
                    m1$$ExternalSyntheticOutline0.m(it.next());
                    featuresetFeature.getOriginalFeature();
                    featuresetFeature.getProperties().optString("cluster_id", "").getClass();
                    featuresetFeature.getProperties().optLong("point_count", 0L);
                    featuresetFeature.getProperties().optString("point_count_abbreviated", "").getClass();
                    throw null;
                }
            }
            return bool;
        }
        final int i4 = 2;
        if (i == 2) {
            Boolean bool2 = Boolean.FALSE;
            FeaturesetFeature featuresetFeature2 = (FeaturesetFeature) obj;
            featuresetFeature2.getClass();
            ((InteractionContext) obj2).getClass();
            Object obj5 = (AnnotationManagerImpl) obj3;
            if (featuresetFeature2.getProperties().optBoolean("cluster", false) && (obj5 instanceof ClusterAnnotationManager) && ((clusterLongClickListeners = ((ClusterAnnotationManager) obj5).getClusterLongClickListeners()) == null || !clusterLongClickListeners.isEmpty())) {
                Iterator it2 = clusterLongClickListeners.iterator();
                if (it2.hasNext()) {
                    m1$$ExternalSyntheticOutline0.m(it2.next());
                    featuresetFeature2.getOriginalFeature();
                    featuresetFeature2.getProperties().optString("cluster_id", "").getClass();
                    featuresetFeature2.getProperties().optLong("point_count", 0L);
                    featuresetFeature2.getProperties().optString("point_count_abbreviated", "").getClass();
                    throw null;
                }
            }
            return bool2;
        }
        if (i == 3) {
            String str = (String) obj;
            final Map map = (Map) obj2;
            str.getClass();
            map.getClass();
            final AnnotationManagerImpl annotationManagerImpl = (AnnotationManagerImpl) obj3;
            return ClickInteraction.Companion.layer$default(ClickInteraction.Companion, str, null, null, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$1
                private static int read = 0;
                private static int serializer = 1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Code restructure failed: missing block: B:65:0x0184, code lost:
                
                    if (r3.hasNext() != false) goto L69;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x0197, code lost:
                
                    if (r3.hasNext() != false) goto L69;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:69:0x0199, code lost:
                
                    bo.app.m1$$ExternalSyntheticOutline0.m(r3.next());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x01a2, code lost:
                
                    if (r2.isSelected == false) goto L75;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:71:0x01a4, code lost:
                
                    r2 = com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$1.serializer + 9;
                    com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$1.read = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x01ad, code lost:
                
                    if ((r2 % 2) == 0) goto L74;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x01af, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:74:0x01b0, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:75:0x01b1, code lost:
                
                    throw null;
                 */
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r17, java.lang.Object r18) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 561
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, 6, null);
        }
        if (i != 4) {
            String str2 = (String) obj;
            final Map map2 = (Map) obj2;
            str2.getClass();
            map2.getClass();
            final AnnotationManagerImpl annotationManagerImpl2 = (AnnotationManagerImpl) obj3;
            return LongClickInteraction.Companion.layer$default(LongClickInteraction.Companion, str2, null, null, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$1
                private static int read = 0;
                private static int serializer = 1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Code restructure failed: missing block: B:65:0x0184, code lost:
                
                    if (r3.hasNext() != false) goto L69;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x0197, code lost:
                
                    if (r3.hasNext() != false) goto L69;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:69:0x0199, code lost:
                
                    bo.app.m1$$ExternalSyntheticOutline0.m(r3.next());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x01a2, code lost:
                
                    if (r2.isSelected == false) goto L75;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:71:0x01a4, code lost:
                
                    r2 = com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$1.serializer + 9;
                    com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$1.read = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x01ad, code lost:
                
                    if ((r2 % 2) == 0) goto L74;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x01af, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:74:0x01b0, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:75:0x01b1, code lost:
                
                    throw null;
                 */
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r17, java.lang.Object r18) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 561
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, 6, null);
        }
        String str3 = (String) obj;
        final Map map3 = (Map) obj2;
        str3.getClass();
        map3.getClass();
        final AnnotationManagerImpl annotationManagerImpl3 = (AnnotationManagerImpl) obj3;
        return DragInteraction.Companion.layer$default(DragInteraction.Companion, str3, null, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$1
            private static int read = 0;
            private static int serializer = 1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Code restructure failed: missing block: B:65:0x0184, code lost:
            
                if (r3.hasNext() != false) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x0197, code lost:
            
                if (r3.hasNext() != false) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x0199, code lost:
            
                bo.app.m1$$ExternalSyntheticOutline0.m(r3.next());
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x01a2, code lost:
            
                if (r2.isSelected == false) goto L75;
             */
            /* JADX WARN: Code restructure failed: missing block: B:71:0x01a4, code lost:
            
                r2 = com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$1.serializer + 9;
                com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$1.read = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x01ad, code lost:
            
                if ((r2 % 2) == 0) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x01af, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01b0, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x01b1, code lost:
            
                throw null;
             */
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r17, java.lang.Object r18) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 561
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj6) {
                int i5 = i3;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                AnnotationManagerImpl annotationManagerImpl4 = annotationManagerImpl3;
                if (i5 != 0) {
                    ((InteractionContext) obj6).getClass();
                    Expression expression = AnnotationManagerImpl.DEFAULT_TEXT_FIELD;
                    annotationManagerImpl4.stopDragging();
                    return createfromparcel;
                }
                ((InteractionContext) obj6).getClass();
                MapboxMap mapboxMap = annotationManagerImpl4.mapInteractionDelegate;
                MoveGestureDetector moveGestureDetector = annotationManagerImpl4.mapMoveDetector;
                if (annotationManagerImpl4.draggingAnnotation != null) {
                    PointF pointF = moveGestureDetector.focalPoint;
                    ScreenCoordinate screenCoordinate = new ScreenCoordinate(pointF.x, pointF.y);
                    moveGestureDetector.pointerIdList.size();
                    annotationManagerImpl4.stopDragging();
                    mapboxMap.dispatch(new PlatformEventInfo(PlatformEventType.DRAG_END, screenCoordinate));
                }
                return createfromparcel;
            }
        }, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$registerInteractions$dragInteraction$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj6) {
                int i5 = i2;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                AnnotationManagerImpl annotationManagerImpl4 = annotationManagerImpl3;
                if (i5 != 0) {
                    ((InteractionContext) obj6).getClass();
                    Expression expression = AnnotationManagerImpl.DEFAULT_TEXT_FIELD;
                    annotationManagerImpl4.stopDragging();
                    return createfromparcel;
                }
                ((InteractionContext) obj6).getClass();
                MapboxMap mapboxMap = annotationManagerImpl4.mapInteractionDelegate;
                MoveGestureDetector moveGestureDetector = annotationManagerImpl4.mapMoveDetector;
                if (annotationManagerImpl4.draggingAnnotation != null) {
                    PointF pointF = moveGestureDetector.focalPoint;
                    ScreenCoordinate screenCoordinate = new ScreenCoordinate(pointF.x, pointF.y);
                    moveGestureDetector.pointerIdList.size();
                    annotationManagerImpl4.stopDragging();
                    mapboxMap.dispatch(new PlatformEventInfo(PlatformEventType.DRAG_END, screenCoordinate));
                }
                return createfromparcel;
            }
        }, 2, null);
    }
}
