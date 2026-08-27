package com.mapbox.navigation.base.internal.performance;

/* JADX INFO: loaded from: classes2.dex */
public final class AsyncSection {
    public final int id;
    public final String name;
    public final long startMark;

    public AsyncSection(String str, int i, long j) {
        this.name = str;
        this.id = i;
        this.startMark = j;
    }
}
