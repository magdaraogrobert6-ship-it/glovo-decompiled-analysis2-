package bo.app;

import android.content.Context;
import androidx.sqlite.SQLite;
import com.braze.enums.DataStoreKey;
import com.braze.storage.DataStoreProvider;
import java.util.List;
import kotlin.ranges.RangesKt;
import o.forEachItemAfter;
import o.getQueryParameterslambda2;
import o.performCustomExitMxy_nc0;

/* JADX INFO: loaded from: classes.dex */
public final class pe extends DataStoreProvider {
    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.sdk_enablement";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        Context applicationContext = getContext().getApplicationContext();
        applicationContext.getClass();
        Object[] objArr = {forEachItemAfter.IconCompatParcelizer(applicationContext, "persistent.com.appboy.storage.sdk_enabled_cache", RangesKt.write((Object) DataStoreKey.SDK_ENABLEMENT.getKey()))};
        int iSerializer = getQueryParameterslambda2.serializer();
        return createOrGetDataStore((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }
}
