package bo.app;

import android.content.Context;
import com.braze.storage.DataStoreProvider;
import o.performCustomExitMxy_nc0;

/* JADX INFO: loaded from: classes.dex */
public final class eg extends DataStoreProvider {
    public final String a;

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return this.a;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        return DataStoreProvider.createOrGetDataStore$default(this, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.a = str;
    }
}
