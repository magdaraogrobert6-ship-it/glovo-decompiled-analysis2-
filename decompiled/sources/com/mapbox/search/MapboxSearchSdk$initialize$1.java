package com.mapbox.search;

import com.google.re2j.Parser;
import com.huawei.agconnect.config.impl.m;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.mapbox.search.common.concurrent.AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0;
import com.mapbox.search.common.concurrent.SearchSdkMainThreadWorker;
import com.mapbox.search.record.HistoryDataProviderImpl;
import com.mapbox.search.record.HistoryRecordsSerializer;
import com.mapbox.search.utils.LoggingCompletionCallback;
import com.sentiance.core.model.events.H$b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Lambda;
import o.getOrElseNullable;
import o.isMergingSemanticsOfDescendants;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class MapboxSearchSdk$initialize$1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ m $dataLoader;
    public final /* synthetic */ int $r8$classId = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxSearchSdk$initialize$1(m mVar) {
        super(0);
        this.$dataLoader = mVar;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        m mVar = this.$dataLoader;
        if (i != 0) {
            isMergingSemanticsOfDescendants ismergingsemanticsofdescendants = new isMergingSemanticsOfDescendants("favorites", new HistoryRecordsSerializer(1), mVar);
            final String str = "com.mapbox.search.localProvider.favorite";
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.mapbox.search.record.LocalDataProviderImpl$Companion$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return new Thread(runnable, "LocalDataProvider executor for ".concat(str));
                }
            });
            executorServiceNewSingleThreadExecutor.getClass();
            getOrElseNullable getorelsenullable = new getOrElseNullable("com.mapbox.search.localProvider.favorite", 101, ismergingsemanticsofdescendants, executorServiceNewSingleThreadExecutor, 40);
            MapboxSearchSdk mapboxSearchSdk = MapboxSearchSdk.INSTANCE;
            H$b h$b = MapboxSearchSdk.indexableDataProvidersRegistry;
            if (h$b == null) {
                removeNodeAtDepth.serializer("indexableDataProvidersRegistry");
                throw null;
            }
            Parser.Pair pair = SearchSdkMainThreadWorker.delegate;
            h$b.preregister(getorelsenullable, (AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0) SearchSdkMainThreadWorker.delegate.write, new LoggingCompletionCallback("FavoritesDataProvider register"));
            return getorelsenullable;
        }
        isMergingSemanticsOfDescendants ismergingsemanticsofdescendants2 = new isMergingSemanticsOfDescendants("search_history", new HistoryRecordsSerializer(0), mVar);
        final String str2 = "com.mapbox.search.localProvider.history";
        ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.mapbox.search.record.LocalDataProviderImpl$Companion$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "LocalDataProvider executor for ".concat(str2));
            }
        });
        executorServiceNewSingleThreadExecutor2.getClass();
        HistoryDataProviderImpl historyDataProviderImpl = new HistoryDataProviderImpl("com.mapbox.search.localProvider.history", 100, ismergingsemanticsofdescendants2, executorServiceNewSingleThreadExecutor2, 8);
        MapboxSearchSdk mapboxSearchSdk2 = MapboxSearchSdk.INSTANCE;
        H$b h$b2 = MapboxSearchSdk.indexableDataProvidersRegistry;
        if (h$b2 == null) {
            removeNodeAtDepth.serializer("indexableDataProvidersRegistry");
            throw null;
        }
        Parser.Pair pair2 = SearchSdkMainThreadWorker.delegate;
        h$b2.preregister(historyDataProviderImpl, (AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0) SearchSdkMainThreadWorker.delegate.write, new LoggingCompletionCallback("HistoryDataProvider register"));
        return historyDataProviderImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxSearchSdk$initialize$1(m mVar, p0 p0Var) {
        super(0);
        this.$dataLoader = mVar;
    }
}
