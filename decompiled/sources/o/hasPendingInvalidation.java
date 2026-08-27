package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class hasPendingInvalidation implements Iterable {
    public final Context RemoteActionCompatParcelizer;
    public final ArrayList write = new ArrayList();

    public static hasPendingInvalidation serializer(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        return new hasPendingInvalidation(appCompatActivity);
    }

    public final void RemoteActionCompatParcelizer() {
        ArrayList arrayList = this.write;
        if (arrayList.isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.RemoteActionCompatParcelizer.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.write.iterator();
    }

    public final void serializer(ComponentName componentName) {
        Context context = this.RemoteActionCompatParcelizer;
        ArrayList arrayList = this.write;
        int size = arrayList.size();
        try {
            for (Intent intentSerializer = LazyKt__LazyJVMKt.serializer(context, componentName); intentSerializer != null; intentSerializer = LazyKt__LazyJVMKt.serializer(context, intentSerializer.getComponent())) {
                arrayList.add(size, intentSerializer);
            }
        } catch (PackageManager.NameNotFoundException e) {
            SentryLogcatAdapter.serializer("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public hasPendingInvalidation(Context context) {
        this.RemoteActionCompatParcelizer = context;
    }

    public final void IconCompatParcelizer(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        Intent supportParentActivityIntent = appCompatActivity.getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = LazyKt__LazyJVMKt.IconCompatParcelizer(appCompatActivity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.RemoteActionCompatParcelizer.getPackageManager());
            }
            serializer(component);
            this.write.add(supportParentActivityIntent);
        }
    }
}
