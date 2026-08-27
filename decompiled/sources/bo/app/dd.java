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
public final class dd extends DataStoreProvider {
    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.push_storage";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        Object[] objArr = {forEachItemAfter.IconCompatParcelizer(getContext(), "com.braze.push_registration", onContentCardClicked.MediaSessionCompatQueueItem(new String[]{DataStoreKey.PUSH_REGISTRATION_VERSION_CODE.getKey(), DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID.getKey(), DataStoreKey.PUSH_REGISTRATION_ID_KEY.getKey()}))};
        int iSerializer = getQueryParameterslambda2.serializer();
        return createOrGetDataStore((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }
}
