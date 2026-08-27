package bo.app;

import android.content.Context;
import androidx.sqlite.SQLite;
import com.braze.storage.DataStoreProvider;
import com.braze.support.StringUtils;
import java.util.LinkedHashSet;
import o.forEachItemAfter;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.performCustomExitMxy_nc0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class jh extends DataStoreProvider {
    public final String a;
    public final String b;
    public final onViewDetachedFromWindowlambda1 c;

    public static final String a(Context context, jh jhVar) {
        return StringUtils.getCacheFileSuffix(context, jhVar.a, jhVar.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.user_cache", (String) this.c.MediaSessionCompatResultReceiverWrapper());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh(Context context, String str, String str2) {
        super(context);
        context.getClass();
        this.a = str;
        this.b = str2;
        this.c = new isAdapterPositionOnScreen(new d4$$ExternalSyntheticLambda2(context, 9, this));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        Context context = getContext();
        String strSerializer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.appboy.storage.user_cache.v3", (String) this.c.MediaSessionCompatResultReceiverWrapper());
        LinkedHashSet linkedHashSet = forEachItemAfter.IconCompatParcelizer;
        return createOrGetDataStore(SQLite.read(forEachItemAfter.IconCompatParcelizer(context, strSerializer, linkedHashSet), forEachItemAfter.IconCompatParcelizer(getContext(), "com.braze.storage.user_cache.push_token_store" + ((String) this.c.MediaSessionCompatResultReceiverWrapper()), linkedHashSet)));
    }
}
