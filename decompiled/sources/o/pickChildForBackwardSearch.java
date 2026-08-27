package o;

import androidx.datastore.preferences.core.PreferencesKt$edit$2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes.dex */
public final class pickChildForBackwardSearch implements performCustomExitMxy_nc0 {
    public final performCustomExitMxy_nc0 read;

    @Override // o.performCustomExitMxy_nc0
    public final Flow serializer() {
        return this.read.serializer();
    }

    public pickChildForBackwardSearch(performCustomExitMxy_nc0 performcustomexitmxy_nc0) {
        performcustomexitmxy_nc0.getClass();
        this.read = performcustomexitmxy_nc0;
    }

    @Override // o.performCustomExitMxy_nc0
    public final Object updateData(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) {
        return this.read.updateData(new PreferencesKt$edit$2(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (ShortNewsContentCardView) null, 2), shortNewsContentCardView);
    }
}
