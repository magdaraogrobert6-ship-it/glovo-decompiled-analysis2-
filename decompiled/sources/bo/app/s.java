package bo.app;

import com.braze.storage.BannersDataStoreProvider$Companion;
import kotlin.jvm.internal.AdaptedFunctionReference;
import o.getNoActiveChildannotations;
import o.getSystemDefinedLCbbffg;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s extends AdaptedFunctionReference implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((BannersDataStoreProvider$Companion) this.MediaSessionCompatQueueItem).migrateBannerImpressionMapToJson((getSystemDefinedLCbbffg) obj, (getNoActiveChildannotations) obj2);
    }

    public s(Object obj) {
        super(3, 4, BannersDataStoreProvider$Companion.class, obj, "migrateBannerImpressionMapToJson", "migrateBannerImpressionMapToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }
}
