package com.braze.events;

/* JADX INFO: loaded from: classes.dex */
public interface IValueCallback<T> {
    default void onError() {
    }

    void onSuccess(T t);
}
