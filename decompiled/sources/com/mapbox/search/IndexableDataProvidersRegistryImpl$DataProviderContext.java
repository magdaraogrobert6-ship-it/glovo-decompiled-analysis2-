package com.mapbox.search;

import com.mapbox.search.record.IndexableDataProviderEngineImpl;
import com.mapbox.search.record.LocalDataProviderImpl;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class IndexableDataProvidersRegistryImpl$DataProviderContext {
    public final IndexableDataProviderEngineImpl engine;
    public final LocalDataProviderImpl provider;

    public final int hashCode() {
        return this.provider.hashCode() + (this.engine.hashCode() * 31);
    }

    public IndexableDataProvidersRegistryImpl$DataProviderContext(IndexableDataProviderEngineImpl indexableDataProviderEngineImpl, LocalDataProviderImpl localDataProviderImpl) {
        indexableDataProviderEngineImpl.getClass();
        localDataProviderImpl.getClass();
        this.engine = indexableDataProviderEngineImpl;
        this.provider = localDataProviderImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexableDataProvidersRegistryImpl$DataProviderContext)) {
            return false;
        }
        IndexableDataProvidersRegistryImpl$DataProviderContext indexableDataProvidersRegistryImpl$DataProviderContext = (IndexableDataProvidersRegistryImpl$DataProviderContext) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.engine, indexableDataProvidersRegistryImpl$DataProviderContext.engine}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.provider, indexableDataProvidersRegistryImpl$DataProviderContext.provider}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "DataProviderContext(engine=" + this.engine + ", provider=" + this.provider + ')';
    }
}
