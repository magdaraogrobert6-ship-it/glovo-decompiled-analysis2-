package androidx.room;

import android.content.Intent;
import bo.app.a5$$ExternalSyntheticLambda0;
import bo.app.b8$$ExternalSyntheticLambda4;
import com.roadrunner.home.HomeFragment;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.createFromParcel;

/* JADX INFO: loaded from: classes.dex */
public final class InvalidationTracker {
    public Intent IconCompatParcelizer;
    public final b8$$ExternalSyntheticLambda4 MediaBrowserCompatMediaItem;
    public final ReentrantLock MediaDescriptionCompat;
    public final Object MediaMetadataCompat;
    public final b8$$ExternalSyntheticLambda4 MediaSessionCompatQueueItem;
    public final String[] RatingCompat;
    public MultiInstanceInvalidationClient RemoteActionCompatParcelizer;
    public final RoomDatabase read;
    public final LinkedHashMap serializer;
    public final TriggerBasedInvalidationTracker write;

    public final Object sync$room_runtime(SuspendLambda suspendLambda) throws Throwable {
        Object objSyncTriggers$room_runtime = this.write.syncTriggers$room_runtime(suspendLambda);
        return objSyncTriggers$room_runtime == CoroutineSingletons.COROUTINE_SUSPENDED ? objSyncTriggers$room_runtime : createFromParcel.INSTANCE;
    }

    public InvalidationTracker(RoomDatabase roomDatabase, HashMap map, HashMap map2, String... strArr) {
        this.read = roomDatabase;
        this.RatingCompat = strArr;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = new TriggerBasedInvalidationTracker(roomDatabase, map, map2, strArr, roomDatabase.getUseTempTrackingTable$room_runtime(), new HomeFragment.AnonymousClass1(1, this, InvalidationTracker.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 2));
        this.write = triggerBasedInvalidationTracker;
        this.serializer = new LinkedHashMap();
        this.MediaDescriptionCompat = new ReentrantLock();
        this.MediaSessionCompatQueueItem = new b8$$ExternalSyntheticLambda4(this, 21);
        this.MediaBrowserCompatMediaItem = new b8$$ExternalSyntheticLambda4(this, 22);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.MediaMetadataCompat = new Object();
        triggerBasedInvalidationTracker.IconCompatParcelizer = new a5$$ExternalSyntheticLambda0(9, this);
    }
}
