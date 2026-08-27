package bo.app;

import com.braze.storage.SessionStorageDataStoreProvider$Companion;
import kotlin.jvm.internal.AdaptedFunctionReference;
import o.getNoActiveChildannotations;
import o.getSystemDefinedLCbbffg;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nf extends AdaptedFunctionReference implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((SessionStorageDataStoreProvider$Companion) this.MediaSessionCompatQueueItem).migrateSealedSessionsMapToJson((getSystemDefinedLCbbffg) obj, (getNoActiveChildannotations) obj2);
    }

    public nf(Object obj) {
        super(3, 4, SessionStorageDataStoreProvider$Companion.class, obj, "migrateSealedSessionsMapToJson", "migrateSealedSessionsMapToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }
}
