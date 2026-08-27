package o;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class calculateRecommendedTimeoutMillis {
    public static final AtomicInteger serializer = new AtomicInteger((int) SystemClock.elapsedRealtime());
}
