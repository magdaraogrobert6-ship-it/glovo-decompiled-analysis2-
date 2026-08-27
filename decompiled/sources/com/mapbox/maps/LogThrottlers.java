package com.mapbox.maps;

import com.mapbox.common.LogThrottler;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class LogThrottlers {
    public static final Companion Companion = new Companion(null);
    public static final long LOG_THROTTLE_INTERVAL_MS = 300;
    private final long defaultInterval;
    private final ConcurrentHashMap<String, LogThrottler> throttlers;

    public final void clear() {
        this.throttlers.clear();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public LogThrottlers(long j) {
        this.defaultInterval = j;
        this.throttlers = new ConcurrentHashMap<>();
    }

    public final LogThrottler get(String str, long j) {
        str.getClass();
        LogThrottler logThrottler = this.throttlers.get(str);
        if (logThrottler != null) {
            return logThrottler;
        }
        LogThrottler logThrottler2 = new LogThrottler(Long.valueOf(j));
        LogThrottler logThrottlerPutIfAbsent = this.throttlers.putIfAbsent(str, logThrottler2);
        return logThrottlerPutIfAbsent == null ? logThrottler2 : logThrottlerPutIfAbsent;
    }

    public LogThrottlers() {
        this(0L, 1, null);
    }

    public /* synthetic */ LogThrottlers(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 300L : j);
    }

    public final LogThrottler get(String str) {
        str.getClass();
        return get(str, this.defaultInterval);
    }
}
