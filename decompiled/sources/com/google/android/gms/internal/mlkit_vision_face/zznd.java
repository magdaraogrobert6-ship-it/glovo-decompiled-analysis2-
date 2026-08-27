package com.google.android.gms.internal.mlkit_vision_face;

import androidx.sqlite.SQLite;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.navigation.base.internal.CongestionNumericOverride;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import com.mapbox.navigation.core.internal.congestions.speed.SpeedAnalyzeUtilsKt$restoreTraffic$2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ranges.RangesKt;
import o.DrawableTransformation;
import o.accessgetInstancedelegatecp;
import o.ensureSubscribedToInAppMessageEventslambda5;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.instance_delegatelambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zznd {
    /* JADX WARN: Multi-variable type inference failed */
    public static final NavigationRoute updateTraffic(NavigationRoute navigationRoute, final RouteLegProgress routeLegProgress, final int i, final int i2, final int i3, final Integer num, boolean z, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) {
        List<Integer> listSubList;
        LegAnnotation legAnnotationAnnotation;
        List<Integer> listCongestionNumeric;
        navigationRoute.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.getClass();
        int i4 = routeLegProgress.geometryIndex;
        int iMin = Math.min(i4 + i2 + i3, num != null ? num.intValue() : Integer.MAX_VALUE);
        RouteLeg routeLeg = routeLegProgress.routeLeg;
        if (routeLeg == null || (legAnnotationAnnotation = routeLeg.annotation()) == null || (listCongestionNumeric = legAnnotationAnnotation.congestionNumeric()) == null) {
            listSubList = null;
        } else {
            ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = new ensureSubscribedToInAppMessageEventslambda7(i4, listCongestionNumeric.size(), 1);
            if (ensuresubscribedtoinappmessageeventslambda7 instanceof ensureSubscribedToInAppMessageEventslambda5) {
                iMin = ((Number) RangesKt.IconCompatParcelizer(Integer.valueOf(iMin), (ensureSubscribedToInAppMessageEventslambda5) ensuresubscribedtoinappmessageeventslambda7)).intValue();
            } else {
                if (ensuresubscribedtoinappmessageeventslambda7.write()) {
                    DrawableTransformation.write(ensuresubscribedtoinappmessageeventslambda7, "Cannot coerce value to an empty range: ");
                    return null;
                }
                if (iMin < Integer.valueOf(i4).intValue()) {
                    iMin = Integer.valueOf(i4).intValue();
                } else {
                    int i5 = ensuresubscribedtoinappmessageeventslambda7.read;
                    if (iMin > Integer.valueOf(i5).intValue()) {
                        iMin = Integer.valueOf(i5).intValue();
                    }
                }
            }
            listSubList = listCongestionNumeric.subList(i4, iMin);
        }
        if (listSubList == null) {
            listSubList = instance_delegatelambda0.write;
        }
        return zzmk.update$default(navigationRoute, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.core.internal.congestions.speed.SpeedAnalyzeUtilsKt$updateTraffic$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                ArrayList arrayList;
                Iterator it;
                LegAnnotation legAnnotationBuild;
                ArrayList arrayList2;
                Iterator it2;
                DirectionsRoute directionsRoute = (DirectionsRoute) obj;
                directionsRoute.getClass();
                DirectionsRoute.Builder builder = directionsRoute.toBuilder();
                List<RouteLeg> listLegs = directionsRoute.legs();
                if (listLegs != null) {
                    List<RouteLeg> list = listLegs;
                    ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                    Iterator it3 = list.iterator();
                    int i6 = 0;
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        if (i6 >= 0) {
                            RouteLeg routeLegBuild = (RouteLeg) next;
                            RouteLegProgress routeLegProgress2 = routeLegProgress;
                            int i7 = routeLegProgress2.legIndex;
                            int i8 = routeLegProgress2.geometryIndex;
                            if (i6 == i7) {
                                RouteLeg.Builder builder2 = routeLegBuild.toBuilder();
                                LegAnnotation legAnnotationAnnotation2 = routeLegBuild.annotation();
                                if (legAnnotationAnnotation2 != null) {
                                    int i9 = i2 + i8;
                                    int i10 = i3;
                                    LegAnnotation.Builder builder3 = legAnnotationAnnotation2.toBuilder();
                                    Integer num2 = num;
                                    int iIntValue = num2 != null ? num2.intValue() : Integer.MAX_VALUE;
                                    List<Integer> listCongestionNumeric2 = legAnnotationAnnotation2.congestionNumeric();
                                    if (listCongestionNumeric2 == null) {
                                        it = it3;
                                        arrayList2 = null;
                                    } else {
                                        arrayList2 = new ArrayList(listCongestionNumeric2);
                                        int iMin2 = Math.min(arrayList2.size(), iIntValue);
                                        int i11 = 0;
                                        int iIntValue2 = 0;
                                        while (i11 < iMin2) {
                                            Integer numValueOf = listCongestionNumeric2.get(i11);
                                            if (i8 > i11 || i11 >= i9) {
                                                it2 = it3;
                                                if (i9 <= i11 && i11 < i10 + i9) {
                                                    numValueOf = (Integer) r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(numValueOf, Integer.valueOf(iIntValue2));
                                                }
                                            } else {
                                                it2 = it3;
                                                iIntValue2 = ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(numValueOf, Integer.valueOf(i))).intValue();
                                                numValueOf = Integer.valueOf(iIntValue2);
                                            }
                                            arrayList2.set(i11, numValueOf);
                                            i11++;
                                            it3 = it2;
                                        }
                                        it = it3;
                                    }
                                    legAnnotationBuild = builder3.congestionNumeric(arrayList2).build();
                                } else {
                                    it = it3;
                                    legAnnotationBuild = null;
                                }
                                routeLegBuild = builder2.annotation(legAnnotationBuild).build();
                            } else {
                                it = it3;
                            }
                            arrayList3.add(routeLegBuild);
                            i6++;
                            it3 = it;
                        } else {
                            SQLite.serializer();
                            throw null;
                        }
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                DirectionsRoute directionsRouteBuild = builder.legs(arrayList).build();
                directionsRouteBuild.getClass();
                return directionsRouteBuild;
            }
        }, SpeedAnalyzeUtilsKt$restoreTraffic$2.INSTANCE$1, new CongestionNumericOverride(z ? listSubList : null, routeLegProgress.legIndex, i4, listSubList.size()), null, 8);
    }
}
