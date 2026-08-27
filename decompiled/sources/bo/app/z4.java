package bo.app;

import android.content.Context;
import androidx.sqlite.SQLite;
import com.braze.enums.DataStoreKey;
import com.braze.storage.DataStoreProvider;
import java.util.List;
import o.forEachItemAfter;
import o.getQueryParameterslambda2;
import o.onContentCardClicked;
import o.performCustomExitMxy_nc0;

/* JADX INFO: loaded from: classes.dex */
public final class z4 extends DataStoreProvider {
    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.delayed_initialization";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        Object[] objArr = {forEachItemAfter.IconCompatParcelizer(getContext(), "persistent.com.braze.storage.delayed_initialization_cache", onContentCardClicked.MediaSessionCompatQueueItem(new String[]{DataStoreKey.DELAYED_INIT_ENABLED.getKey(), DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG.getKey(), DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG.getKey()}))};
        int iSerializer = getQueryParameterslambda2.serializer();
        return createOrGetDataStore((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }
}
