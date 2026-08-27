package bo.app;

import android.content.Context;
import androidx.sqlite.SQLite;
import com.braze.enums.DataStoreKey;
import com.braze.storage.DataStoreProvider;
import com.braze.support.StringUtils;
import kotlin.ranges.RangesKt;
import o.forEachItemAfter;
import o.isAdapterPositionOnScreen;
import o.onContentCardClicked;
import o.onViewDetachedFromWindowlambda1;
import o.performCustomExitMxy_nc0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class g5 extends DataStoreProvider {
    public static final /* synthetic */ int d = 0;
    public final String a;
    public final String b;
    public final onViewDetachedFromWindowlambda1 c;

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.device_cache", (String) this.c.MediaSessionCompatResultReceiverWrapper());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(Context context, String str, String str2) {
        super(context);
        context.getClass();
        this.a = str;
        this.b = str2;
        this.c = new isAdapterPositionOnScreen(new a5$$ExternalSyntheticLambda0(15, this));
    }

    public static final String a(g5 g5Var) {
        return StringUtils.getCacheFileSuffix(g5Var.getContext(), g5Var.a, g5Var.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        return createOrGetDataStore(SQLite.read(forEachItemAfter.IconCompatParcelizer(getContext(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.appboy.storage.device_cache.v3", (String) this.c.MediaSessionCompatResultReceiverWrapper()), RangesKt.write((Object) DataStoreKey.CACHED_DEVICE.getKey())), forEachItemAfter.IconCompatParcelizer(getContext(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.storage.device_cache.metadata", (String) this.c.MediaSessionCompatResultReceiverWrapper()), onContentCardClicked.MediaSessionCompatQueueItem(new String[]{DataStoreKey.DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT.getKey(), DataStoreKey.DEVICE_CACHE_LAST_OS_VERSION.getKey()}))));
    }
}
