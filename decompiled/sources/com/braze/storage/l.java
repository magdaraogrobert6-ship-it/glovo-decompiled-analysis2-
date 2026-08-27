package com.braze.storage;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1;
import androidx.sqlite.SQLite;
import bo.app.wc;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;
import kotlin.ranges.RangesKt;
import o.forEachItemAfter;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.performCustomExitMxy_nc0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class l extends DataStoreProvider {
    public static final PushMaxDataStoreProvider$Companion d = new PushMaxDataStoreProvider$Companion(null);
    public final String a;
    public final String b;
    public final onViewDetachedFromWindowlambda1 c;

    public static final String a(Context context, l lVar) {
        return StringUtils.getCacheFileSuffix(context, lVar.a, lVar.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.pushmax", (String) this.c.MediaSessionCompatResultReceiverWrapper());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = new isAdapterPositionOnScreen(new a$$ExternalSyntheticLambda0(context, 15, this));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        return createOrGetDataStore(SQLite.read(forEachItemAfter.IconCompatParcelizer(getContext(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.storage.braze_push_max_metadata", (String) this.c.MediaSessionCompatResultReceiverWrapper()), RangesKt.write((Object) DataStoreKey.PUSH_MAX_LAST_UPDATE.getKey())), new SharedPreferencesMigration(getContext(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.storage.braze_push_max_storage", (String) this.c.MediaSessionCompatResultReceiverWrapper()), (SharedPreferencesMigrationKt$getShouldRunMigration$1) null, new wc(d), 12)));
    }
}
