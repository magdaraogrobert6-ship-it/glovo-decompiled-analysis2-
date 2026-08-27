package com.braze.storage;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1;
import androidx.sqlite.SQLite;
import bo.app.bb$$ExternalSyntheticLambda0;
import bo.app.o7;
import bo.app.p7;
import com.braze.support.StringUtils;
import java.util.List;
import o.getQueryParameterslambda2;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.performCustomExitMxy_nc0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class f extends DataStoreProvider {
    public static final o7 b = new o7();
    public final onViewDetachedFromWindowlambda1 a;

    public static final String a(Context context, String str, String str2) {
        return StringUtils.getCacheFileSuffix(context, str, str2);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        Object[] objArr = {new SharedPreferencesMigration(getContext(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.appboy.storage.appboy_event_storage", (String) this.a.MediaSessionCompatResultReceiverWrapper()), (SharedPreferencesMigrationKt$getShouldRunMigration$1) null, new p7(), 12)};
        int iSerializer = getQueryParameterslambda2.serializer();
        return createOrGetDataStore((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.events", (String) this.a.MediaSessionCompatResultReceiverWrapper());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str, String str2) {
        super(context);
        context.getClass();
        this.a = new isAdapterPositionOnScreen(new bb$$ExternalSyntheticLambda0(context, str, str2, 7));
    }
}
