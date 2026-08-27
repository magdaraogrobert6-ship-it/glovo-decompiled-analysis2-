package com.deliveryhero.fwf_cache.sql;

import app.cash.sqldelight.Transacter;
import app.cash.sqldelight.TransactionWithoutReturn;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.FwFClientDB;
import com.deliveryhero.database.FwFCacheItem;
import com.deliveryhero.database.FwFDataQueries;
import com.deliveryhero.fwf_cache.ICache;
import com.deliveryhero.fwf_cache.UtilKt;
import com.deliveryhero.fwf_logger.ILogger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.createFromParcel;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFCacheSQL implements ICache {
    private final FwFClientDB db;
    private final FwFDataQueries fwfDataQueries;
    private final ILogger logger;

    public FwFCacheSQL(CacheDriverFactory cacheDriverFactory, ILogger iLogger) {
        cacheDriverFactory.getClass();
        iLogger.getClass();
        this.logger = iLogger;
        FwFClientDB fwFClientDBCreateDatabase = FwFCacheDriverFactoryKt.createDatabase(cacheDriverFactory);
        this.db = fwFClientDBCreateDatabase;
        this.fwfDataQueries = fwFClientDBCreateDatabase.getFwFDataQueries();
    }

    @Override // com.deliveryhero.fwf_cache.ICache
    public void delete(String str) {
        str.getClass();
        this.logger.logD(UtilKt.MODULE_NAME, "Deleting item from storage with key: ".concat(str));
        this.fwfDataQueries.deleteItem(str);
    }

    @Override // com.deliveryhero.fwf_cache.ICache
    public byte[] get(String str) {
        isItemDismissable isitemdismissable;
        byte[] structure;
        str.getClass();
        this.logger.logD(UtilKt.MODULE_NAME, "Getting item from storage with key: ".concat(str));
        try {
            FwFCacheItem fwFCacheItemExecuteAsOneOrNull = this.fwfDataQueries.selectItem(str).executeAsOneOrNull();
            if (fwFCacheItemExecuteAsOneOrNull != null && (structure = fwFCacheItemExecuteAsOneOrNull.getStructure()) != null) {
                return structure;
            }
            isitemdismissable = null;
            Throwable thSerializer = onItemDismiss.serializer(isitemdismissable);
            if (thSerializer != null) {
                this.logger.logE(UtilKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Multiple rows found for key ", str, ", error: ", thSerializer.getMessage()));
            }
            return null;
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
    }

    @Override // com.deliveryhero.fwf_cache.ICache
    public Map<String, byte[]> getAll(Set<String> set) {
        set.getClass();
        this.logger.logD(UtilKt.MODULE_NAME, "Getting items from storage with keys: " + set);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FwFCacheItem fwFCacheItem : this.fwfDataQueries.selectItems(set).executeAsList()) {
            byte[] structure = fwFCacheItem.getStructure();
            if (structure != null) {
                linkedHashMap.put(fwFCacheItem.getKey(), structure);
            }
        }
        return linkedHashMap;
    }

    @Override // com.deliveryhero.fwf_cache.ICache
    public void set(String str, byte[] bArr) {
        str.getClass();
        bArr.getClass();
        this.logger.logD(UtilKt.MODULE_NAME, "Inserting item in storage with key: ".concat(str));
        this.fwfDataQueries.insertItem(str, bArr);
    }

    @Override // com.deliveryhero.fwf_cache.ICache
    public void setAll(final Map<String, byte[]> map) {
        Object isitemdismissable;
        map.getClass();
        if (map.isEmpty()) {
            return;
        }
        this.logger.logD(UtilKt.MODULE_NAME, "Inserting items in storage with keys: " + map.keySet());
        try {
            Transacter.DefaultImpls.transaction$default(this.fwfDataQueries, false, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.deliveryhero.fwf_cache.sql.FwFCacheSQL$setAll$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(TransactionWithoutReturn transactionWithoutReturn) {
                    transactionWithoutReturn.getClass();
                    Map<String, byte[]> map2 = map;
                    FwFCacheSQL fwFCacheSQL = this;
                    for (Map.Entry<String, byte[]> entry : map2.entrySet()) {
                        fwFCacheSQL.fwfDataQueries.insertItem(entry.getKey(), entry.getValue());
                    }
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((TransactionWithoutReturn) obj);
                    return createFromParcel.INSTANCE;
                }
            }, 1, null);
            isitemdismissable = createFromParcel.INSTANCE;
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Throwable thSerializer = onItemDismiss.serializer(isitemdismissable);
        if (thSerializer != null) {
            this.logger.logE(UtilKt.MODULE_NAME, "Error inserting items in storage with keys: " + map.keySet() + ", error: " + thSerializer.getMessage());
        }
    }
}
