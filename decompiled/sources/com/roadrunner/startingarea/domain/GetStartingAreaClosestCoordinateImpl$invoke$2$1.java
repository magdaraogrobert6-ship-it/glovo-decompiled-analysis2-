package com.roadrunner.startingarea.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import com.mapbox.geojson.Point;
import java.util.ArrayList;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.accesssafeCallFlushDelayedInitPushAnalyticsQueue;
import o.accesssetCustomBrazeNotificationFactorycp;
import o.createFromParcel;
import o.getActionViewIntentlambda0;
import o.getContentViewGroupParentLayout;
import o.isMainThread;
import o.o7ExternalSyntheticLambda3;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class GetStartingAreaClosestCoordinateImpl$invoke$2$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    public final /* synthetic */ double IconCompatParcelizer;
    public final /* synthetic */ ComponentRegistry$Builder RemoteActionCompatParcelizer;
    public final /* synthetic */ double serializer;
    public final /* synthetic */ accesssetCustomBrazeNotificationFactorycp write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStartingAreaClosestCoordinateImpl$invoke$2$1(double d, double d2, ComponentRegistry$Builder componentRegistry$Builder, accesssetCustomBrazeNotificationFactorycp accesssetcustombrazenotificationfactorycp, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = d;
        this.IconCompatParcelizer = d2;
        this.RemoteActionCompatParcelizer = componentRegistry$Builder;
        this.write = accesssetcustombrazenotificationfactorycp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        GetStartingAreaClosestCoordinateImpl$invoke$2$1 getStartingAreaClosestCoordinateImpl$invoke$2$1 = new GetStartingAreaClosestCoordinateImpl$invoke$2$1(this.serializer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, shortNewsContentCardView);
        int i2 = MediaBrowserCompatMediaItem + 125;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getStartingAreaClosestCoordinateImpl$invoke$2$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 47;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((GetStartingAreaClosestCoordinateImpl$invoke$2$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            throw null;
        }
        Object objInvokeSuspend = ((GetStartingAreaClosestCoordinateImpl$invoke$2$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i3 = read + 35;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ComponentRegistry$Builder componentRegistry$Builder = this.RemoteActionCompatParcelizer;
        ((AndroidUiDispatcherCompanioncurrentThread1) componentRegistry$Builder.RemoteActionCompatParcelizer).getClass();
        accesssetCustomBrazeNotificationFactorycp accesssetcustombrazenotificationfactorycp = this.write;
        accesssetcustombrazenotificationfactorycp.getClass();
        ArrayList<accesssafeCallFlushDelayedInitPushAnalyticsQueue> arrayList = accesssetcustombrazenotificationfactorycp.RemoteActionCompatParcelizer;
        ArrayList<o7ExternalSyntheticLambda3> arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        for (accesssafeCallFlushDelayedInitPushAnalyticsQueue accesssafecallflushdelayedinitpushanalyticsqueue : arrayList) {
            arrayList2.add(new o7ExternalSyntheticLambda3(accesssafecallflushdelayedinitpushanalyticsqueue.IconCompatParcelizer, accesssafecallflushdelayedinitpushanalyticsqueue.serializer));
        }
        ((getActionViewIntentlambda0) componentRegistry$Builder.read).getClass();
        Point pointFromLngLat = Point.fromLngLat(this.IconCompatParcelizer, this.serializer);
        pointFromLngLat.getClass();
        ArrayList<Point> arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
        int i2 = read + 59;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 4 / 2;
        }
        for (o7ExternalSyntheticLambda3 o7externalsyntheticlambda3 : arrayList2) {
            o7externalsyntheticlambda3.getClass();
            Point pointFromLngLat2 = Point.fromLngLat(o7externalsyntheticlambda3.write, o7externalsyntheticlambda3.read);
            pointFromLngLat2.getClass();
            arrayList3.add(pointFromLngLat2);
        }
        if (!arrayList3.isEmpty()) {
            Point point = (Point) arrayList3.get(0);
            double d = Double.POSITIVE_INFINITY;
            for (Point point2 : arrayList3) {
                double dDistance = TuplesKt.distance(pointFromLngLat, point2, "kilometers");
                if (dDistance < d) {
                    int i4 = read + 5;
                    MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    point = point2;
                    d = dDistance;
                }
            }
            pointFromLngLat = point;
        }
        pointFromLngLat.getClass();
        double dLatitude = pointFromLngLat.latitude();
        double dLongitude = pointFromLngLat.longitude();
        ((isMainThread) componentRegistry$Builder.IconCompatParcelizer).getClass();
        return new accesssafeCallFlushDelayedInitPushAnalyticsQueue(dLatitude, dLongitude);
    }
}
