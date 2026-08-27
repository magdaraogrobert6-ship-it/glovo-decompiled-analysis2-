package com.braze.storage;

import android.content.Context;
import androidx.sqlite.SQLite;
import com.braze.support.StringUtils;
import java.util.List;
import o.forEachItemAfter;
import o.getQueryParameterslambda2;
import o.performCustomExitMxy_nc0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends DataStoreProvider {
    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return StringUtils.CACHE_SUFFIX_PREFERENCES_FILE;
    }

    static {
        new StringUtilsDataStoreProvider$Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        Object[] objArr = {forEachItemAfter.IconCompatParcelizer(getContext(), StringUtils.CACHE_SUFFIX_PREFERENCES_FILE, forEachItemAfter.IconCompatParcelizer)};
        int iSerializer = getQueryParameterslambda2.serializer();
        return createOrGetDataStore((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }
}
