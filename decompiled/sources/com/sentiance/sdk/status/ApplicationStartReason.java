package com.sentiance.sdk.status;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum ApplicationStartReason {
    START_REASON_ALARM(0),
    START_REASON_BACKUP(1),
    START_REASON_BOOT_COMPLETE(2),
    START_REASON_BROADCAST(3),
    START_REASON_CONTENT_PROVIDER(4),
    START_REASON_JOB(5),
    START_REASON_LAUNCHER(6),
    START_REASON_LAUNCHER_RECENTS(7),
    START_REASON_OTHER(8),
    START_REASON_PUSH(9),
    START_REASON_SERVICE(10),
    START_REASON_START_ACTIVITY(11);

    public static final read Companion = new read(null);
    private final int code;

    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final int getCode() {
        return this.code;
    }

    ApplicationStartReason(int i) {
        this.code = i;
    }
}
