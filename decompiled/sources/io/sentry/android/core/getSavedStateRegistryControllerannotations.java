package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public enum getSavedStateRegistryControllerannotations {
    SENTRY_HANDLER_STRATEGY_DEFAULT(0),
    SENTRY_HANDLER_STRATEGY_CHAIN_AT_START(1);

    private final int value;

    public int getValue() {
        return this.value;
    }

    getSavedStateRegistryControllerannotations(int i) {
        this.value = i;
    }
}
