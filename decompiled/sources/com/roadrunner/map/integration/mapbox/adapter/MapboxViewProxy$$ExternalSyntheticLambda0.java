package com.roadrunner.map.integration.mapbox.adapter;

import androidx.compose.ui.graphics.Fields;
import com.mapbox.geojson.Point;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.roadrunner.map.container.centermap.RecenterButtonVisibilityDelegate$onMapZoomChanged$1;
import com.roadrunner.map.container.enabled.presentation.MapboxFragment;
import com.roadrunner.rider.state.provider.domain.SaveShiftInfo$invoke$2;
import dagger.Lazy;
import io.grpc.internal.SharedResourcePool;
import kotlinx.coroutines.BuildersKt;
import o.C;
import o.ShortNewsContentCardView;
import o.T;
import o.createFromParcel;
import o.f5ExternalSyntheticLambda4;
import o.f8;
import o.i2ExternalSyntheticLambda2;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class MapboxViewProxy$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ MapboxViewProxy serializer;

    public /* synthetic */ MapboxViewProxy$$ExternalSyntheticLambda0(MapboxViewProxy mapboxViewProxy, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = mapboxViewProxy;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        MapboxViewProxy mapboxViewProxy = this.serializer;
        int i5 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i4 == 0) {
            Point point = (Point) obj;
            point.getClass();
            SharedResourcePool sharedResourcePool = mapboxViewProxy.MediaSessionCompatQueueItem;
            f8 f8Var = new f8(point.latitude(), point.longitude());
            MapboxFragment mapboxFragment = (MapboxFragment) sharedResourcePool.IconCompatParcelizer;
            T t = (T) mapboxFragment.serializer().write();
            t.getClass();
            t.IconCompatParcelizer = f5ExternalSyntheticLambda4.RemoteActionCompatParcelizer(t.IconCompatParcelizer, 0.0d, f8Var, null, 5);
            t.MediaDescriptionCompat.write(createfromparcel);
            Lazy lazy = mapboxFragment.MediaSessionCompatToken;
            if (lazy == null) {
                removeNodeAtDepth.serializer("recenterButtonVisibilityDelegate");
                throw null;
            }
            int i6 = write + 89;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            C c = (C) lazy.write();
            c.getClass();
            if (System.currentTimeMillis() - c.read > 350) {
                int i8 = write + 91;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                c.serializer = f5ExternalSyntheticLambda4.RemoteActionCompatParcelizer(c.serializer, 0.0d, f8Var, null, 5);
                c.RatingCompat.write(createfromparcel);
            } else {
                BuildersKt.RemoteActionCompatParcelizer(c.MediaSessionCompatQueueItem, null, null, new SaveShiftInfo$invoke$2(c, f8Var, shortNewsContentCardView, i5), 3);
            }
            return createfromparcel;
        }
        if (i4 != 1) {
            CameraAnimationsPlugin cameraAnimationsPlugin = (CameraAnimationsPlugin) obj;
            cameraAnimationsPlugin.getClass();
            CameraAnimationsPluginImpl cameraAnimationsPluginImpl = (CameraAnimationsPluginImpl) cameraAnimationsPlugin;
            cameraAnimationsPluginImpl.zoomListeners.add(new i2ExternalSyntheticLambda2(mapboxViewProxy.ParcelableVolumeInfo));
            cameraAnimationsPluginImpl.centerListeners.add(new i2ExternalSyntheticLambda2(mapboxViewProxy.MediaSessionCompatResultReceiverWrapper));
            return createfromparcel;
        }
        Double d = (Double) obj;
        double dDoubleValue = d.doubleValue();
        MapboxFragment mapboxFragment2 = (MapboxFragment) mapboxViewProxy.MediaSessionCompatQueueItem.IconCompatParcelizer;
        mapboxFragment2.write().write.MediaDescriptionCompat.IconCompatParcelizer(d);
        T t2 = (T) mapboxFragment2.serializer().write();
        t2.IconCompatParcelizer = f5ExternalSyntheticLambda4.RemoteActionCompatParcelizer(t2.IconCompatParcelizer, dDoubleValue, null, null, 6);
        t2.MediaDescriptionCompat.write(createfromparcel);
        Lazy lazy2 = mapboxFragment2.MediaSessionCompatToken;
        if (lazy2 == null) {
            removeNodeAtDepth.serializer("recenterButtonVisibilityDelegate");
            throw null;
        }
        C c2 = (C) lazy2.write();
        c2.getClass();
        if (System.currentTimeMillis() - c2.read > 350) {
            int i10 = write + 123;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            c2.serializer = f5ExternalSyntheticLambda4.RemoteActionCompatParcelizer(c2.serializer, dDoubleValue, null, null, 6);
            c2.RatingCompat.write(createfromparcel);
        } else {
            BuildersKt.RemoteActionCompatParcelizer(c2.MediaSessionCompatQueueItem, null, null, new RecenterButtonVisibilityDelegate$onMapZoomChanged$1(c2, dDoubleValue, null), 3);
        }
        return createfromparcel;
    }
}
