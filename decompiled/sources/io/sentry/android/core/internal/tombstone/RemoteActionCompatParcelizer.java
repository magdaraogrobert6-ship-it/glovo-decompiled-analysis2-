package io.sentry.android.core.internal.tombstone;

/* JADX INFO: loaded from: classes4.dex */
public enum RemoteActionCompatParcelizer {
    TOMBSTONE("Tombstone"),
    SIGNAL_HANDLER("signalhandler"),
    TOMBSTONE_MERGED("TombstoneMerged");

    private final String value;

    public String getValue() {
        return this.value;
    }

    RemoteActionCompatParcelizer(String str) {
        this.value = str;
    }
}
