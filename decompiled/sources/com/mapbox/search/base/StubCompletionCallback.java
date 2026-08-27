package com.mapbox.search.base;

import com.mapbox.search.common.CompletionCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class StubCompletionCallback implements CompletionCallback {
    @Override // com.mapbox.search.common.CompletionCallback
    public final void onComplete(Object obj) {
    }

    @Override // com.mapbox.search.common.CompletionCallback
    public final void onError(Exception exc) {
        exc.getClass();
    }
}
