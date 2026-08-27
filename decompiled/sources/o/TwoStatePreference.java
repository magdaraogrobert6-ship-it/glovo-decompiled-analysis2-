package o;

import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class TwoStatePreference {
    public final ContextScope serializer;
    public final PreferenceScreen write;

    public TwoStatePreference(ContextScope contextScope, PreferenceScreen preferenceScreen) {
        this.serializer = contextScope;
        this.write = preferenceScreen;
    }
}
