package com.mapbox.search.record;

import androidx.activity.EdgeToEdge$$ExternalSyntheticLambda0;
import androidx.room.RoomDatabase$createConnectionManager$2;
import com.mapbox.search.IndexableDataProvidersRegistryImpl$resolve$2;
import com.mapbox.search.SearchEngineImpl$$ExternalSyntheticLambda0;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.mapbox.search.base.task.AsyncOperationTaskImpl;
import com.mapbox.search.base.task.CancelableWrapperImpl;
import com.mapbox.search.common.CompletionCallback;
import com.mapbox.search.internal.bindgen.UserRecordsLayer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setMergingSemanticsOfDescendants;

/* JADX INFO: loaded from: classes3.dex */
public final class DataProviderEngineRegistrationServiceImpl {
    public static final setMergingSemanticsOfDescendants Companion = new setMergingSemanticsOfDescendants();
    public static final ExecutorService DEFAULT_EXECUTOR;
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 coreLayerProvider;
    public final LinkedHashMap processedProvider;
    public final LinkedHashMap processingProviders;
    public final Executor registryExecutor;

    public final class RegistrationProcessMetadata {
        public final AsyncOperationTaskImpl processTask;
        public final Map subscribers;

        public RegistrationProcessMetadata(AsyncOperationTaskImpl asyncOperationTaskImpl) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.processTask = asyncOperationTaskImpl;
            this.subscribers = linkedHashMap;
        }

        public final int hashCode() {
            return this.subscribers.hashCode() + (this.processTask.hashCode() * 31);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationProcessMetadata)) {
                return false;
            }
            RegistrationProcessMetadata registrationProcessMetadata = (RegistrationProcessMetadata) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.processTask, registrationProcessMetadata.processTask}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subscribers, registrationProcessMetadata.subscribers}, getCieXyz.write())).booleanValue();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RegistrationProcessMetadata(processTask=");
            sb.append(this.processTask);
            sb.append(", subscribers=");
            return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, this.subscribers, ')');
        }
    }

    public final AsyncOperationTaskImpl register(final LocalDataProviderImpl localDataProviderImpl, final CompletionCallback completionCallback) {
        synchronized (this) {
            localDataProviderImpl.getClass();
            IndexableDataProviderEngineImpl indexableDataProviderEngineImpl = (IndexableDataProviderEngineImpl) this.processedProvider.get(localDataProviderImpl.dataProviderName);
            if (indexableDataProviderEngineImpl != null) {
                completionCallback.onComplete(indexableDataProviderEngineImpl);
                return AsyncOperationTaskImpl.COMPLETED;
            }
            final RegistrationProcessMetadata registrationProcessMetadata = (RegistrationProcessMetadata) this.processingProviders.get(localDataProviderImpl.dataProviderName);
            if (registrationProcessMetadata != null) {
                AsyncOperationTaskImpl asyncOperationTaskImpl = new AsyncOperationTaskImpl();
                asyncOperationTaskImpl.addOnCancelledCallback(new AsyncOperationTaskImpl.OnCancelledCallback() { // from class: com.mapbox.search.record.DataProviderEngineRegistrationServiceImpl$$ExternalSyntheticLambda2
                    @Override // com.mapbox.search.base.task.AsyncOperationTaskImpl.OnCancelledCallback
                    public final void onCancelled() {
                        DataProviderEngineRegistrationServiceImpl dataProviderEngineRegistrationServiceImpl = this.f$0;
                        LocalDataProviderImpl localDataProviderImpl2 = localDataProviderImpl;
                        CompletionCallback completionCallback2 = completionCallback;
                        DataProviderEngineRegistrationServiceImpl.RegistrationProcessMetadata registrationProcessMetadata2 = registrationProcessMetadata;
                        dataProviderEngineRegistrationServiceImpl.getClass();
                        localDataProviderImpl2.getClass();
                        String str = localDataProviderImpl2.dataProviderName;
                        synchronized (dataProviderEngineRegistrationServiceImpl) {
                            registrationProcessMetadata2.subscribers.remove(completionCallback2);
                            if (registrationProcessMetadata2.subscribers.isEmpty()) {
                                registrationProcessMetadata2.processTask.cancel();
                                dataProviderEngineRegistrationServiceImpl.processingProviders.remove(str);
                            }
                        }
                    }
                });
                Map map = registrationProcessMetadata.subscribers;
                if (!map.containsKey(completionCallback)) {
                    map.put(completionCallback, asyncOperationTaskImpl);
                }
                return asyncOperationTaskImpl;
            }
            IndexableDataProviderEngineImpl indexableDataProviderEngineImpl2 = new IndexableDataProviderEngineImpl((UserRecordsLayer) this.coreLayerProvider.invoke(localDataProviderImpl.dataProviderName, Integer.valueOf(localDataProviderImpl.priority)));
            Executor executor = this.registryExecutor;
            IndexableDataProvidersRegistryImpl$resolve$2 indexableDataProvidersRegistryImpl$resolve$2 = new IndexableDataProvidersRegistryImpl$resolve$2(this, localDataProviderImpl, indexableDataProviderEngineImpl2, 1);
            executor.getClass();
            localDataProviderImpl.logD("registerIndexableDataProviderEngine() called");
            AsyncOperationTaskImpl asyncOperationTaskImpl2 = new AsyncOperationTaskImpl();
            Future<?> futureSubmit = localDataProviderImpl.backgroundTaskExecutorService.submit(new EdgeToEdge$$ExternalSyntheticLambda0(localDataProviderImpl, indexableDataProviderEngineImpl2, asyncOperationTaskImpl2, executor, indexableDataProvidersRegistryImpl$resolve$2, 4));
            futureSubmit.getClass();
            asyncOperationTaskImpl2.addInnerTask(new CancelableWrapperImpl(new SearchOptionsKt$validateLimit$1(18, futureSubmit)));
            final RegistrationProcessMetadata registrationProcessMetadata2 = new RegistrationProcessMetadata(asyncOperationTaskImpl2);
            AsyncOperationTaskImpl asyncOperationTaskImpl3 = new AsyncOperationTaskImpl();
            asyncOperationTaskImpl3.addOnCancelledCallback(new AsyncOperationTaskImpl.OnCancelledCallback() { // from class: com.mapbox.search.record.DataProviderEngineRegistrationServiceImpl$$ExternalSyntheticLambda2
                @Override // com.mapbox.search.base.task.AsyncOperationTaskImpl.OnCancelledCallback
                public final void onCancelled() {
                    DataProviderEngineRegistrationServiceImpl dataProviderEngineRegistrationServiceImpl = this.f$0;
                    LocalDataProviderImpl localDataProviderImpl2 = localDataProviderImpl;
                    CompletionCallback completionCallback2 = completionCallback;
                    DataProviderEngineRegistrationServiceImpl.RegistrationProcessMetadata registrationProcessMetadata3 = registrationProcessMetadata2;
                    dataProviderEngineRegistrationServiceImpl.getClass();
                    localDataProviderImpl2.getClass();
                    String str = localDataProviderImpl2.dataProviderName;
                    synchronized (dataProviderEngineRegistrationServiceImpl) {
                        registrationProcessMetadata3.subscribers.remove(completionCallback2);
                        if (registrationProcessMetadata3.subscribers.isEmpty()) {
                            registrationProcessMetadata3.processTask.cancel();
                            dataProviderEngineRegistrationServiceImpl.processingProviders.remove(str);
                        }
                    }
                }
            });
            Map map2 = registrationProcessMetadata2.subscribers;
            if (!map2.containsKey(completionCallback)) {
                map2.put(completionCallback, asyncOperationTaskImpl3);
            }
            this.processingProviders.put(localDataProviderImpl.dataProviderName, registrationProcessMetadata2);
            return asyncOperationTaskImpl3;
        }
    }

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new SearchEngineImpl$$ExternalSyntheticLambda0(1));
        executorServiceNewSingleThreadExecutor.getClass();
        DEFAULT_EXECUTOR = executorServiceNewSingleThreadExecutor;
    }

    public DataProviderEngineRegistrationServiceImpl() {
        RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = new RoomDatabase$createConnectionManager$2(2, Companion, setMergingSemanticsOfDescendants.class, "createCoreLayer", "createCoreLayer(Ljava/lang/String;I)Lcom/mapbox/search/internal/bindgen/UserRecordsLayer;", 0, 5);
        ExecutorService executorService = DEFAULT_EXECUTOR;
        executorService.getClass();
        this.registryExecutor = executorService;
        this.coreLayerProvider = roomDatabase$createConnectionManager$2;
        this.processingProviders = new LinkedHashMap();
        this.processedProvider = new LinkedHashMap();
    }
}
