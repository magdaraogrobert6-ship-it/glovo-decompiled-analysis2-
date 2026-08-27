package o;

import android.content.Context;
import androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1;
import com.roadrunner.rider.state.domain.GetRiderStateImpl$invoke$1;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class forEachItemAfter {
    public static final LinkedHashSet IconCompatParcelizer = new LinkedHashSet();

    public static final androidx.datastore.migrations.SharedPreferencesMigration IconCompatParcelizer(Context context, String str, Set set) {
        context.getClass();
        set.getClass();
        int i = 1;
        int i2 = 3;
        int i3 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        return set == IconCompatParcelizer ? new androidx.datastore.migrations.SharedPreferencesMigration(context, str, new SharedPreferencesMigrationKt$getShouldRunMigration$1(set, shortNewsContentCardView, i3), new GetRiderStateImpl$invoke$1(i2, i, shortNewsContentCardView), 4) : new androidx.datastore.migrations.SharedPreferencesMigration(context, str, set, new SharedPreferencesMigrationKt$getShouldRunMigration$1(set, shortNewsContentCardView, i3), new GetRiderStateImpl$invoke$1(i2, i, shortNewsContentCardView));
    }
}
