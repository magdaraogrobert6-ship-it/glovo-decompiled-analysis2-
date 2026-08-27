package com.braze.storage;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1;
import androidx.sqlite.SQLite;
import bo.app.lc;
import com.braze.support.StringUtils;
import java.util.List;
import o.getQueryParameterslambda2;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.performCustomExitMxy_nc0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class j extends DataStoreProvider {
    public static final PushDeliveryDataStoreProvider$Companion c = new PushDeliveryDataStoreProvider$Companion(null);
    public final String a;
    public final onViewDetachedFromWindowlambda1 b;

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        Object[] objArr = {new SharedPreferencesMigration(getContext(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.storage.braze_push_delivery_storage", (String) this.b.MediaSessionCompatResultReceiverWrapper()), (SharedPreferencesMigrationKt$getShouldRunMigration$1) null, new lc(c), 12)};
        int iSerializer = getQueryParameterslambda2.serializer();
        return createOrGetDataStore((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.a = str;
        this.b = new isAdapterPositionOnScreen(new a$$ExternalSyntheticLambda0(context, 13, this));
    }

    public static final String a(Context context, j jVar) {
        return StringUtils.getCacheFileSuffix(context, null, jVar.a);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.push_delivery.", this.a);
    }
}
