package bo.app;

import android.content.Context;
import androidx.sqlite.SQLite;
import com.braze.storage.DataStoreProvider;
import java.util.List;
import o.forEachItemAfter;
import o.getQueryParameterslambda2;
import o.performCustomExitMxy_nc0;

/* JADX INFO: loaded from: classes.dex */
public final class mb extends DataStoreProvider {
    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.offline.user_storage";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        Context applicationContext = getContext().getApplicationContext();
        applicationContext.getClass();
        Object[] objArr = {forEachItemAfter.IconCompatParcelizer(applicationContext, "com.appboy.offline.storagemap", forEachItemAfter.IconCompatParcelizer)};
        int iSerializer = getQueryParameterslambda2.serializer();
        return createOrGetDataStore((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }
}
