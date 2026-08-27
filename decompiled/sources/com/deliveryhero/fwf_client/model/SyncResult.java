package com.deliveryhero.fwf_client.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class SyncResult {
    public static final Companion Companion = new Companion(null);
    private final boolean disableUpdates;
    private final String error;
    private final boolean success;

    public final boolean getDisableUpdates$fwf_client_release() {
        return this.disableUpdates;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SyncResult successResult() {
            return new SyncResult(true, null, false, 4, null);
        }

        public final SyncResult unAuthorizedResult() {
            return new SyncResult(false, "Request authorization failed", true, null);
        }

        public final SyncResult errorResult(String str) {
            str.getClass();
            return new SyncResult(false, str, false, 4, null);
        }
    }

    private SyncResult(boolean z, String str, boolean z2) {
        this.success = z;
        this.error = str;
        this.disableUpdates = z2;
    }

    public /* synthetic */ SyncResult(boolean z, String str, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, z2);
    }

    public /* synthetic */ SyncResult(boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? false : z2);
    }
}
