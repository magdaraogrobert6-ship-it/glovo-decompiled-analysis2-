package com.braze.storage;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1;
import androidx.sqlite.SQLite;
import bo.app.y3;
import bo.app.z3;
import com.braze.support.StringUtils;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.performCustomExitMxy_nc0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class b extends DataStoreProvider {
    public static final ContentCardsDataStoreProvider$Companion d = new ContentCardsDataStoreProvider$Companion(null);
    public final String a;
    public final String b;
    public final onViewDetachedFromWindowlambda1 c;

    public static final String a(Context context, b bVar) {
        return StringUtils.getCacheFileSuffix(context, bVar.a, bVar.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        Context context = getContext();
        String strSerializer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.appboy.storage.content_cards_storage_provider.cards", (String) this.c.MediaSessionCompatResultReceiverWrapper());
        ContentCardsDataStoreProvider$Companion contentCardsDataStoreProvider$Companion = d;
        return createOrGetDataStore(SQLite.read(new SharedPreferencesMigration(context, strSerializer, (SharedPreferencesMigrationKt$getShouldRunMigration$1) null, new y3(contentCardsDataStoreProvider$Companion), 12), new SharedPreferencesMigration(getContext(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.storage.content_cards_storage_provider.metadata", (String) this.c.MediaSessionCompatResultReceiverWrapper()), (SharedPreferencesMigrationKt$getShouldRunMigration$1) null, new z3(contentCardsDataStoreProvider$Companion), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.contentcards.", (String) this.c.MediaSessionCompatResultReceiverWrapper());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = new isAdapterPositionOnScreen(new a$$ExternalSyntheticLambda0(context, 9, this));
    }
}
