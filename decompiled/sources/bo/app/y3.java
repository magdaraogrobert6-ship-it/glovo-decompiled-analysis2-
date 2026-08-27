package bo.app;

import com.braze.storage.ContentCardsDataStoreProvider$Companion;
import kotlin.jvm.internal.AdaptedFunctionReference;
import o.getNoActiveChildannotations;
import o.getSystemDefinedLCbbffg;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y3 extends AdaptedFunctionReference implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((ContentCardsDataStoreProvider$Companion) this.MediaSessionCompatQueueItem).migrateContentCardsStorageToJson((getSystemDefinedLCbbffg) obj, (getNoActiveChildannotations) obj2);
    }

    public y3(Object obj) {
        super(3, 4, ContentCardsDataStoreProvider$Companion.class, obj, "migrateContentCardsStorageToJson", "migrateContentCardsStorageToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }
}
