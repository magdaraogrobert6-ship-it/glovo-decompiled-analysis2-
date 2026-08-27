package com.braze.storage;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1;
import androidx.sqlite.SQLite;
import bo.app.k8;
import bo.app.l8;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;
import kotlin.ranges.RangesKt;
import o.forEachItemAfter;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.performCustomExitMxy_nc0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class h extends DataStoreProvider {
    public static final FeatureFlagsDataStoreProvider$Companion d = new FeatureFlagsDataStoreProvider$Companion(null);
    public final String a;
    public final String b;
    public final onViewDetachedFromWindowlambda1 c;

    public static final String a(Context context, h hVar) {
        return StringUtils.getCacheFileSuffix(context, hVar.a, hVar.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.featureflags.", (String) this.c.MediaSessionCompatResultReceiverWrapper());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = new isAdapterPositionOnScreen(new a$$ExternalSyntheticLambda0(context, 12, this));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        SharedPreferencesMigration sharedPreferencesMigrationIconCompatParcelizer = forEachItemAfter.IconCompatParcelizer(getContext(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.managers.featureflags.eligibility", (String) this.c.MediaSessionCompatResultReceiverWrapper()), RangesKt.write((Object) DataStoreKey.LAST_REFRESH_IN_SECONDS.getKey()));
        Context context = getContext();
        String strSerializer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.managers.featureflags.storage", (String) this.c.MediaSessionCompatResultReceiverWrapper());
        FeatureFlagsDataStoreProvider$Companion featureFlagsDataStoreProvider$Companion = d;
        return createOrGetDataStore(SQLite.read(sharedPreferencesMigrationIconCompatParcelizer, new SharedPreferencesMigration(context, strSerializer, (SharedPreferencesMigrationKt$getShouldRunMigration$1) null, new k8(featureFlagsDataStoreProvider$Companion), 12), new SharedPreferencesMigration(getContext(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.managers.featureflags.impressions", (String) this.c.MediaSessionCompatResultReceiverWrapper()), (SharedPreferencesMigrationKt$getShouldRunMigration$1) null, new l8(featureFlagsDataStoreProvider$Companion), 12)));
    }
}
