package com.deliveryhero.perseus.repository;

import android.os.Trace;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.PerseusParamsConfig;
import com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider;
import com.deliveryhero.perseus.core.session.AppSessionManagerImpl;
import com.deliveryhero.perseus.core.session.ClientIdProviderImpl;
import com.deliveryhero.perseus.data.local.db.TrackingDatabase;
import com.deliveryhero.perseus.data.local.db.entity.HitEventFactory;
import com.deliveryhero.perseus.data.remote.PerseusHitsRemoteDataStoreImpl;
import com.deliveryhero.perseus.logger.PerseusLogger;
import com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy$$ExternalSyntheticLambda4;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createFromParcel;
import o.lineToRelative;
import o.quadTo;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setStrokeLineCapBeK7IIE;
import o.setStrokeLineJoinWw9F2mQ;
import o.updateRenderPath;

/* JADX INFO: loaded from: classes2.dex */
public final class PerseusHitsRepositoryImpl {
    public final ClientIdProviderImpl IconCompatParcelizer;
    public final PerseusHitsRemoteDataStoreImpl MediaBrowserCompatMediaItem;
    public final PerseusLogger RemoteActionCompatParcelizer;
    public final Extras$Key read;
    public final HitEventFactory serializer;
    public final AppSessionManagerImpl write;

    /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object insertEvent(Map map, List list, List list2, ContinuationImpl continuationImpl) {
        setStrokeLineJoinWw9F2mQ setstrokelinejoinww9f2mq;
        List list3;
        Map map2;
        HitEventFactory hitEventFactory;
        quadTo quadto;
        Object objRefreshSessionTimeStamp;
        quadTo quadto2;
        List list4 = list2;
        if (continuationImpl instanceof setStrokeLineJoinWw9F2mQ) {
            setstrokelinejoinww9f2mq = (setStrokeLineJoinWw9F2mQ) continuationImpl;
            int i = setstrokelinejoinww9f2mq.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                setstrokelinejoinww9f2mq.serializer = i - Integer.MIN_VALUE;
            } else {
                setstrokelinejoinww9f2mq = new setStrokeLineJoinWw9F2mQ(this, continuationImpl);
            }
        } else {
            setstrokelinejoinww9f2mq = new setStrokeLineJoinWw9F2mQ(this, continuationImpl);
        }
        Object config = setstrokelinejoinww9f2mq.MediaMetadataCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = setstrokelinejoinww9f2mq.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        boolean z = true;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(config);
            DefaultPerseusConfigProvider defaultPerseusConfigProvider = updateRenderPath.MediaSessionCompatQueueItem;
            setstrokelinejoinww9f2mq.write = map;
            setstrokelinejoinww9f2mq.IconCompatParcelizer = list;
            setstrokelinejoinww9f2mq.RemoteActionCompatParcelizer = list4;
            HitEventFactory hitEventFactory2 = this.serializer;
            setstrokelinejoinww9f2mq.read = hitEventFactory2;
            setstrokelinejoinww9f2mq.serializer = 1;
            config = defaultPerseusConfigProvider.getConfig(setstrokelinejoinww9f2mq);
            if (config != coroutineSingletons) {
                list3 = list;
                map2 = map;
                hitEventFactory = hitEventFactory2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            HitEventFactory hitEventFactory3 = (HitEventFactory) setstrokelinejoinww9f2mq.read;
            list4 = setstrokelinejoinww9f2mq.RemoteActionCompatParcelizer;
            List list5 = setstrokelinejoinww9f2mq.IconCompatParcelizer;
            Map map3 = setstrokelinejoinww9f2mq.write;
            ExtrasKt.RemoteActionCompatParcelizer(config);
            list3 = list5;
            map2 = map3;
            hitEventFactory = hitEventFactory3;
        } else {
            if (i2 == 2) {
                List list6 = setstrokelinejoinww9f2mq.RemoteActionCompatParcelizer;
                List list7 = setstrokelinejoinww9f2mq.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(config);
                quadto = (quadTo) config;
                setstrokelinejoinww9f2mq.write = r11;
                setstrokelinejoinww9f2mq.IconCompatParcelizer = r11;
                setstrokelinejoinww9f2mq.RemoteActionCompatParcelizer = 0;
                setstrokelinejoinww9f2mq.read = quadto;
                setstrokelinejoinww9f2mq.serializer = 3;
                objRefreshSessionTimeStamp = this.write.read.refreshSessionTimeStamp(setstrokelinejoinww9f2mq);
                if (objRefreshSessionTimeStamp != coroutineSingletons) {
                    objRefreshSessionTimeStamp = createfromparcel;
                }
                if (objRefreshSessionTimeStamp != coroutineSingletons) {
                    quadto2 = quadto;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            quadto2 = (quadTo) setstrokelinejoinww9f2mq.read;
            List list8 = setstrokelinejoinww9f2mq.RemoteActionCompatParcelizer;
            List list9 = setstrokelinejoinww9f2mq.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(config);
            z = true;
        }
        Extras$Key extras$Key = this.read;
        extras$Key.getClass();
        quadto2.getClass();
        setStrokeLineCapBeK7IIE.write("Perseus.hits.insertHitEvent");
        Trace.beginSection("Perseus.hits.insertHitEvent");
        try {
            lineToRelative linetorelative = (lineToRelative) ((TrackingDatabase) extras$Key.IconCompatParcelizer).serializer();
            linetorelative.getClass();
            ((Number) TuplesKt.write(linetorelative.read, false, z, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(linetorelative, 21, quadto2))).longValue();
            return createfromparcel;
        } finally {
            Trace.endSection();
        }
        setstrokelinejoinww9f2mq.write = null;
        setstrokelinejoinww9f2mq.IconCompatParcelizer = null;
        setstrokelinejoinww9f2mq.RemoteActionCompatParcelizer = null;
        setstrokelinejoinww9f2mq.read = null;
        setstrokelinejoinww9f2mq.serializer = 2;
        config = hitEventFactory.createEventHit((PerseusParamsConfig) config, this.write, this.IconCompatParcelizer, map2, list3, list4, setstrokelinejoinww9f2mq);
        if (config != coroutineSingletons) {
            quadto = (quadTo) config;
            setstrokelinejoinww9f2mq.write = r11;
            setstrokelinejoinww9f2mq.IconCompatParcelizer = r11;
            setstrokelinejoinww9f2mq.RemoteActionCompatParcelizer = 0;
            setstrokelinejoinww9f2mq.read = quadto;
            setstrokelinejoinww9f2mq.serializer = 3;
            objRefreshSessionTimeStamp = this.write.read.refreshSessionTimeStamp(setstrokelinejoinww9f2mq);
            if (objRefreshSessionTimeStamp != coroutineSingletons) {
                objRefreshSessionTimeStamp = createfromparcel;
            }
            if (objRefreshSessionTimeStamp != coroutineSingletons) {
                quadto2 = quadto;
                Extras$Key extras$Key2 = this.read;
                extras$Key2.getClass();
                quadto2.getClass();
                setStrokeLineCapBeK7IIE.write("Perseus.hits.insertHitEvent");
                Trace.beginSection("Perseus.hits.insertHitEvent");
                lineToRelative linetorelative2 = (lineToRelative) ((TrackingDatabase) extras$Key2.IconCompatParcelizer).serializer();
                linetorelative2.getClass();
                ((Number) TuplesKt.write(linetorelative2.read, false, z, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(linetorelative2, 21, quadto2))).longValue();
                return createfromparcel;
            }
        }
        return coroutineSingletons;
    }

    public PerseusHitsRepositoryImpl(PerseusHitsRemoteDataStoreImpl perseusHitsRemoteDataStoreImpl, Extras$Key extras$Key, AppSessionManagerImpl appSessionManagerImpl, ClientIdProviderImpl clientIdProviderImpl, HitEventFactory hitEventFactory, PerseusLogger perseusLogger) {
        perseusHitsRemoteDataStoreImpl.getClass();
        extras$Key.getClass();
        appSessionManagerImpl.getClass();
        clientIdProviderImpl.getClass();
        hitEventFactory.getClass();
        perseusLogger.getClass();
        this.MediaBrowserCompatMediaItem = perseusHitsRemoteDataStoreImpl;
        this.read = extras$Key;
        this.write = appSessionManagerImpl;
        this.IconCompatParcelizer = clientIdProviderImpl;
        this.serializer = hitEventFactory;
        this.RemoteActionCompatParcelizer = perseusLogger;
    }

    public final void serializer(List list) {
        list.getClass();
        Extras$Key extras$Key = this.read;
        extras$Key.getClass();
        setStrokeLineCapBeK7IIE.write("Perseus.hits.deleteHitEvents");
        Trace.beginSection("Perseus.hits.deleteHitEvents");
        try {
            lineToRelative linetorelative = (lineToRelative) ((TrackingDatabase) extras$Key.IconCompatParcelizer).serializer();
            linetorelative.getClass();
            TuplesKt.write(linetorelative.read, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new MapboxViewProxy$$ExternalSyntheticLambda4(1, linetorelative, list));
            Trace.endSection();
            PerseusLogger.IconCompatParcelizer(this.RemoteActionCompatParcelizer, "Deleting " + list.size() + " events");
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
