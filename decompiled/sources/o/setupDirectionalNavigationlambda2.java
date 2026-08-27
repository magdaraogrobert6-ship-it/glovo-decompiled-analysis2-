package o;

import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setupDirectionalNavigationlambda2 {
    public final ArrayList serializer;
    public int write;

    public List read() {
        List listUnmodifiableList;
        synchronized (this) {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(this.serializer));
        }
        return listUnmodifiableList;
    }

    public boolean write(List list) {
        synchronized (this) {
            this.serializer.clear();
            if (list.size() <= this.write) {
                return this.serializer.addAll(list);
            }
            SentryLogcatAdapter.write("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.write, null);
            return this.serializer.addAll(list.subList(0, this.write));
        }
    }

    public setupDirectionalNavigationlambda2() {
        this.serializer = new ArrayList();
        this.write = androidx.compose.ui.graphics.Fields.SpotShadowColor;
    }

    public setupDirectionalNavigationlambda2(ArrayList arrayList) {
        this.serializer = arrayList;
    }
}
