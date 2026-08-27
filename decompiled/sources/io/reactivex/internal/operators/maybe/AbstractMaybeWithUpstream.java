package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;

/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractMaybeWithUpstream<T, R> extends Maybe<R> {
    public final Maybe write;

    public AbstractMaybeWithUpstream(Maybe maybe) {
        this.write = maybe;
    }
}
