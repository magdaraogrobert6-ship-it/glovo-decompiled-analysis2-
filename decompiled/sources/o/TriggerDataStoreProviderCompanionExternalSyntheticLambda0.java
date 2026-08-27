package o;

import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "DskoVenuesProvider")
public class TriggerDataStoreProviderCompanionExternalSyntheticLambda0 {
    private final r8lambdaXPYBZDOuJKDQIhpUsif_DKhgJb4 IconCompatParcelizer;
    private final DustDataStoreProviderCompanion RemoteActionCompatParcelizer;
    private final readandroid_sdk_base_release read;
    private final parseLonglambda0 serializer;

    public final ArrayList serializer(Location location, int i) {
        ArrayList arrayList = new ArrayList();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.IconCompatParcelizer.write().RemoteActionCompatParcelizer(location, i, new migrateTriggersReeligibilityToJson(this, countDownLatch, arrayList));
        try {
            countDownLatch.await();
            return arrayList;
        } catch (InterruptedException e) {
            this.serializer.IconCompatParcelizer(false, e, "Failed to wait for getClosestVenues", new Object[0]);
            return arrayList;
        }
    }

    public TriggerDataStoreProviderCompanionExternalSyntheticLambda0(r8lambdaXPYBZDOuJKDQIhpUsif_DKhgJb4 r8lambdaxpybzdoujkdqihpusif_dkhgjb4, parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, DustDataStoreProviderCompanion dustDataStoreProviderCompanion) {
        this.IconCompatParcelizer = r8lambdaxpybzdoujkdqihpusif_dkhgjb4;
        this.serializer = parselonglambda0;
        this.read = readandroid_sdk_base_releaseVar;
        this.RemoteActionCompatParcelizer = dustDataStoreProviderCompanion;
    }
}
