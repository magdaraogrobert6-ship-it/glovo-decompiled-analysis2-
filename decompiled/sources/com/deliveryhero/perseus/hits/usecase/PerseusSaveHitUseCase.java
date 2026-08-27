package com.deliveryhero.perseus.hits.usecase;

import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import coil3.memory.MemoryCacheService;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.data.local.PerseusConfigLocalDataStoreImpl;
import com.deliveryhero.perseus.logger.PerseusLogger;
import com.deliveryhero.perseus.logger.PerseusLogger$e$1;
import com.deliveryhero.perseus.repository.PerseusHitsRepositoryImpl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.createFromParcel;
import o.onMove;
import o.setPathData;

/* JADX INFO: loaded from: classes2.dex */
public final class PerseusSaveHitUseCase {
    public final PerseusHitsRepositoryImpl IconCompatParcelizer;
    public final MemoryCacheService RatingCompat;
    public final CoroutineDispatcher RemoteActionCompatParcelizer;
    public final PerseusLogger read;
    public final ComponentRegistry$Builder serializer;
    public final PerseusConfigLocalDataStoreImpl write;

    public final Object run(LinkedHashMap linkedHashMap, List list, List list2, SuspendLambda suspendLambda) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getValue();
            if (str == null) {
                str = "null";
            }
            linkedHashMap2.put(key, str);
        }
        if (!linkedHashMap2.containsKey("hitMatchId")) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
            String str2 = (String) linkedHashMap3.get("perseusHitMatchId");
            if (str2 != null) {
                linkedHashMap3.put("hitMatchId", str2);
            } else {
                this.read.write("perseusHitMatchId is missing from perseusEventPayLoad", null);
            }
            linkedHashMap2 = linkedHashMap3;
        }
        Object objRunWithBatchDispatch = runWithBatchDispatch(linkedHashMap2, list, list2, suspendLambda);
        return objRunWithBatchDispatch == CoroutineSingletons.COROUTINE_SUSPENDED ? objRunWithBatchDispatch : createFromParcel.INSTANCE;
    }

    public PerseusSaveHitUseCase(PerseusHitsRepositoryImpl perseusHitsRepositoryImpl, ComponentRegistry$Builder componentRegistry$Builder, PerseusConfigLocalDataStoreImpl perseusConfigLocalDataStoreImpl, MemoryCacheService memoryCacheService, PerseusLogger perseusLogger, CoroutineDispatcher coroutineDispatcher) {
        perseusHitsRepositoryImpl.getClass();
        perseusConfigLocalDataStoreImpl.getClass();
        memoryCacheService.getClass();
        perseusLogger.getClass();
        coroutineDispatcher.getClass();
        this.IconCompatParcelizer = perseusHitsRepositoryImpl;
        this.serializer = componentRegistry$Builder;
        this.write = perseusConfigLocalDataStoreImpl;
        this.RatingCompat = memoryCacheService;
        this.read = perseusLogger;
        this.RemoteActionCompatParcelizer = coroutineDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00da, code lost:
    
        if (r11 == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.deliveryhero.perseus.hits.usecase.PerseusSaveHitUseCase] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runWithBatchDispatch(java.util.LinkedHashMap r11, java.util.List r12, java.util.List r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.hits.usecase.PerseusSaveHitUseCase.runWithBatchDispatch(java.util.LinkedHashMap, java.util.List, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object runWithImmediateDispatch(Map map, List list, List list2, ContinuationImpl continuationImpl) {
        setPathData setpathdata;
        if (continuationImpl instanceof setPathData) {
            setpathdata = (setPathData) continuationImpl;
            int i = setpathdata.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                setpathdata.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                setpathdata = new setPathData(this, continuationImpl);
            }
        } else {
            setpathdata = new setPathData(this, continuationImpl);
        }
        Object obj = setpathdata.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = setpathdata.RemoteActionCompatParcelizer;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                CoroutineDispatcher coroutineDispatcher = this.RemoteActionCompatParcelizer;
                PerseusLogger$e$1 perseusLogger$e$1 = new PerseusLogger$e$1(this, map, list, list2, null, 8);
                setpathdata.write = map;
                setpathdata.RemoteActionCompatParcelizer = 1;
                Object objWithContext = BuildersKt.withContext(coroutineDispatcher, perseusLogger$e$1, setpathdata);
                map = objWithContext;
                if (objWithContext == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Map map2 = setpathdata.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                map = map2;
            }
        } catch (Throwable th) {
            this.read.RemoteActionCompatParcelizer("Error happened while sending hit to remote from Worker! With the following params:" + map, th);
        }
        return createFromParcel.INSTANCE;
    }
}
