package com.mapbox.search.record;

import androidx.activity.EdgeToEdge$$ExternalSyntheticLambda0;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.wisesecurity.ucs.common.utils.SpUtil;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.mapbox.common.CommonSdkLog;
import com.mapbox.search.IndexableDataProvidersRegistryImpl$resolve$2;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.mapbox.search.base.perf.PerformanceTracker;
import com.mapbox.search.base.task.AsyncOperationTaskImpl;
import com.mapbox.search.base.task.CancelableWrapperImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Lambda;
import o.DrawableTransformation;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LocalDataProviderImpl {
    public final ExecutorService backgroundTaskExecutorService;
    public final Object dataProviderEngineLock;
    public final CopyOnWriteArrayList dataProviderEngines;
    public final String dataProviderName;
    public volatile SpUtil dataState;
    public final ConcurrentHashMap engineRegisterListeners;
    public final Object initializingLock;
    public final int maxRecordsAmount;
    public final int priority;
    public final RecordsFileStorage recordsStorage;

    /* JADX INFO: renamed from: com.mapbox.search.record.LocalDataProviderImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ LocalDataProviderImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(LocalDataProviderImpl localDataProviderImpl, int i) {
            super(0);
            this.$r8$classId = i;
            this.this$0 = localDataProviderImpl;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Object invoke() {
            Object obj;
            if (this.$r8$classId == 0) {
                LocalDataProviderImpl localDataProviderImpl = this.this$0;
                int i = localDataProviderImpl.maxRecordsAmount;
                if (i <= 0) {
                    DrawableTransformation.serializer((Object) m1$$ExternalSyntheticOutline0.m("Provided 'maxRecordsAmount' should be greater than 0 (provided value: ", i, ')'));
                    return null;
                }
                localDataProviderImpl.logD("initialRead()");
                localDataProviderImpl.backgroundTaskExecutorService.submit(new ZM$$ExternalSyntheticLambda2(13, localDataProviderImpl));
                return createFromParcel.INSTANCE;
            }
            try {
                try {
                    List listLoad = this.this$0.recordsStorage.load();
                    Map mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
                    mapSynchronizedMap.getClass();
                    this.this$0.addAndTrimRecords(listLoad, mapSynchronizedMap);
                    this.this$0.dataState = new LocalDataProviderImpl$DataState$Data(mapSynchronizedMap);
                    List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(mapSynchronizedMap.values());
                    Iterator it = this.this$0.dataProviderEngines.iterator();
                    while (it.hasNext()) {
                        ((IndexableDataProviderEngineImpl) it.next()).upsertAll(listPlaybackStateCompat);
                    }
                    this.this$0.logD("initialRead() completed. Loaded " + listPlaybackStateCompat.size() + " records");
                    LocalDataProviderImpl localDataProviderImpl2 = this.this$0;
                    obj = localDataProviderImpl2.initializingLock;
                    synchronized (obj) {
                        localDataProviderImpl2.initializingLock.notifyAll();
                        return createFromParcel.INSTANCE;
                    }
                } catch (Exception e) {
                    LocalDataProviderImpl localDataProviderImpl3 = this.this$0;
                    CommonSdkLog.INSTANCE.loge("LocalDataProvider", localDataProviderImpl3.dataProviderName + ". " + ("Error during initialRead(): " + e.getMessage()));
                    this.this$0.dataState = new LocalDataProviderImpl$DataState$Error(e);
                    LocalDataProviderImpl localDataProviderImpl4 = this.this$0;
                    obj = localDataProviderImpl4.initializingLock;
                    synchronized (obj) {
                        localDataProviderImpl4.initializingLock.notifyAll();
                    }
                }
            } catch (Throwable th) {
                LocalDataProviderImpl localDataProviderImpl5 = this.this$0;
                synchronized (localDataProviderImpl5.initializingLock) {
                    localDataProviderImpl5.initializingLock.notifyAll();
                    throw th;
                }
            }
        }
    }

    public LocalDataProviderImpl(String str, int i, RecordsFileStorage recordsFileStorage, ExecutorService executorService, int i2) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        int i3 = (i2 & 32) != 0 ? Integer.MAX_VALUE : 100;
        this.dataProviderName = str;
        this.priority = i;
        this.recordsStorage = recordsFileStorage;
        this.dataProviderEngines = copyOnWriteArrayList;
        this.backgroundTaskExecutorService = executorService;
        this.maxRecordsAmount = i3;
        new ConcurrentHashMap();
        this.engineRegisterListeners = new ConcurrentHashMap();
        this.dataProviderEngineLock = new Object();
        this.initializingLock = new Object();
        PerformanceTracker.trackPerformanceSync("LocalDataProviderImpl#init", new AnonymousClass1(this, 0));
    }

    public final void logD(String str) {
        CommonSdkLog.INSTANCE.logd("LocalDataProvider", d$$ExternalSyntheticOutline0.m(new StringBuilder(), this.dataProviderName, ". ", str));
    }

    public final void logSkippedOperation(String str, LocalDataProviderImpl$DataState$Error localDataProviderImpl$DataState$Error) {
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str, " skipped: data unavailable (load error: ");
        sbM.append(localDataProviderImpl$DataState$Error.error.getMessage());
        sbM.append(')');
        logD(sbM.toString());
    }

    public final AsyncOperationTaskImpl get(String str, Executor executor, IndexableDataProvidersRegistryImpl$resolve$2 indexableDataProvidersRegistryImpl$resolve$2) {
        logD("get(id=" + str + ") called");
        AsyncOperationTaskImpl asyncOperationTaskImpl = new AsyncOperationTaskImpl();
        Future<?> futureSubmit = this.backgroundTaskExecutorService.submit(new EdgeToEdge$$ExternalSyntheticLambda0(this, str, asyncOperationTaskImpl, executor, indexableDataProvidersRegistryImpl$resolve$2, 3));
        futureSubmit.getClass();
        asyncOperationTaskImpl.addInnerTask(new CancelableWrapperImpl(new SearchOptionsKt$validateLimit$1(18, futureSubmit)));
        return asyncOperationTaskImpl;
    }

    public void addAndTrimRecords(List list, Map map) {
        List<IndexableRecord> list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        for (IndexableRecord indexableRecord : list2) {
            arrayList.add(new onViewAttachedToWindowlambda0(((HistoryRecord) indexableRecord).id, indexableRecord));
        }
        onMove.RemoteActionCompatParcelizer(map, arrayList);
    }

    public final SpUtil getLocalData() {
        SpUtil spUtil;
        SpUtil spUtil2 = this.dataState;
        if (spUtil2 != null) {
            return spUtil2;
        }
        logD("getLocalData(): initialRead() not yet completed, waiting...");
        synchronized (this.initializingLock) {
            spUtil = this.dataState;
            while (spUtil == null) {
                this.initializingLock.wait();
                spUtil = this.dataState;
            }
        }
        logD("getLocalData(): wait completed");
        return spUtil;
    }
}
