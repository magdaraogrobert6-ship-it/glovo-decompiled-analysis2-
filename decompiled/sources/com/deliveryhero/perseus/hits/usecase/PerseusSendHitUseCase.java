package com.deliveryhero.perseus.hits.usecase;

import androidx.datastore.core.SimpleActor$offer$2;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.data.remote.api.model.HitsRequest;
import com.deliveryhero.perseus.logger.PerseusLogger;
import com.deliveryhero.perseus.repository.PerseusHitsRepositoryImpl;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.PathComponentpathMeasure2;
import o.PathNode;
import o.ShortNewsContentCardView;
import o.getAnyMovementConsumedimpl;
import o.getArcStartX;
import o.getHorizontalEllipseRadius;
import o.isCurve;
import o.quadTo;
import o.setPathFillTypeoQ8Xj4U;
import o.updateRenderPath;

/* JADX INFO: loaded from: classes2.dex */
public final class PerseusSendHitUseCase {
    public final ComponentRegistry$Builder IconCompatParcelizer;
    public final CoroutineDispatcher RemoteActionCompatParcelizer;
    public final PerseusHitsRepositoryImpl write;

    public PerseusSendHitUseCase(PerseusHitsRepositoryImpl perseusHitsRepositoryImpl, ComponentRegistry$Builder componentRegistry$Builder, CoroutineDispatcher coroutineDispatcher) {
        perseusHitsRepositoryImpl.getClass();
        coroutineDispatcher.getClass();
        this.write = perseusHitsRepositoryImpl;
        this.IconCompatParcelizer = componentRegistry$Builder;
        this.RemoteActionCompatParcelizer = coroutineDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object run(List list, ContinuationImpl continuationImpl) throws Throwable {
        setPathFillTypeoQ8Xj4U setpathfilltypeoq8xj4u;
        List list2;
        String str;
        PerseusLogger perseusLogger;
        List list3;
        if (continuationImpl instanceof setPathFillTypeoQ8Xj4U) {
            setpathfilltypeoq8xj4u = (setPathFillTypeoQ8Xj4U) continuationImpl;
            int i = setpathfilltypeoq8xj4u.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                setpathfilltypeoq8xj4u.write = i - Integer.MIN_VALUE;
            } else {
                setpathfilltypeoq8xj4u = new setPathFillTypeoQ8Xj4U(this, continuationImpl);
            }
        } else {
            setpathfilltypeoq8xj4u = new setPathFillTypeoQ8Xj4U(this, continuationImpl);
        }
        Object obj = setpathfilltypeoq8xj4u.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = setpathfilltypeoq8xj4u.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setpathfilltypeoq8xj4u.write = 1;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                quadTo quadto = (quadTo) it.next();
                PerseusLogger perseusLogger2 = getArcStartX.read;
                Map mapSerializer = getArcStartX.serializer(quadto.PlaybackStateCompatCustomAction);
                PerseusLogger perseusLogger3 = PathComponentpathMeasure2.IconCompatParcelizer;
                String str2 = quadto.ParcelableVolumeInfo;
                PerseusLogger perseusLogger4 = PathComponentpathMeasure2.IconCompatParcelizer;
                if (str2 == null || str2.length() == 0) {
                    perseusLogger4.write("JSON string is null or empty", null);
                } else {
                    try {
                        list2 = (List) updateRenderPath.serializer().fromJson(str2, new getHorizontalEllipseRadius().getType());
                    } catch (JsonSyntaxException e) {
                        getAnyMovementConsumedimpl.RemoteActionCompatParcelizer(perseusLogger4, "Failed to parse JSON for EcommerceItems", str2, e);
                        list2 = null;
                    }
                    PerseusLogger perseusLogger5 = PathNode.IconCompatParcelizer;
                    str = quadto.RatingCompat;
                    perseusLogger = PathNode.IconCompatParcelizer;
                    if (str != null || str.length() == 0) {
                        perseusLogger.write("JSON string is null or empty", null);
                    } else {
                        try {
                            list3 = (List) updateRenderPath.serializer().fromJson(str, new isCurve().getType());
                        } catch (JsonSyntaxException e2) {
                            getAnyMovementConsumedimpl.RemoteActionCompatParcelizer(perseusLogger, "Failed to parse JSON for EcommerceComponents", str, e2);
                            list3 = null;
                        }
                        arrayList.add(this.IconCompatParcelizer.read(quadto, mapSerializer, list2, list3));
                    }
                    list3 = null;
                    arrayList.add(this.IconCompatParcelizer.read(quadto, mapSerializer, list2, list3));
                }
                list2 = null;
                PerseusLogger perseusLogger6 = PathNode.IconCompatParcelizer;
                str = quadto.RatingCompat;
                perseusLogger = PathNode.IconCompatParcelizer;
                if (str != null) {
                    perseusLogger.write("JSON string is null or empty", null);
                    list3 = null;
                } else {
                    perseusLogger.write("JSON string is null or empty", null);
                    list3 = null;
                }
                arrayList.add(this.IconCompatParcelizer.read(quadto, mapSerializer, list2, list3));
            }
            HitsRequest hitsRequest = new HitsRequest(arrayList);
            if (hitsRequest != coroutineSingletons) {
                obj = hitsRequest;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        SimpleActor$offer$2 simpleActor$offer$2 = new SimpleActor$offer$2(this, (HitsRequest) obj, shortNewsContentCardView, 14);
        setpathfilltypeoq8xj4u.write = 2;
        Object objWithContext = BuildersKt.withContext(this.RemoteActionCompatParcelizer, simpleActor$offer$2, setpathfilltypeoq8xj4u);
        return objWithContext == coroutineSingletons ? coroutineSingletons : objWithContext;
    }
}
