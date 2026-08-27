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
public final class h5 extends DataStoreProvider {
    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.device_data";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        Object[] objArr = {forEachItemAfter.IconCompatParcelizer(getContext(), "com.appboy.managers.device_data_provider", onContentCardClicked.MediaSessionCompatQueueItem(new String[]{DataStoreKey.GOOGLE_ADVERTISING_ID.getKey(), DataStoreKey.AD_TRACKING_ENABLED.getKey()}))};
        int iSerializer = getQueryParameterslambda2.serializer();
        return createOrGetDataStore((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }
}
