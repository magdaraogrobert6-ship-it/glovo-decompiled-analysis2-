package com.mapbox.common;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxInitializerException extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxInitializerException(InitializerData initializerData, Context context, Throwable th) {
        super(BaseMapboxInitializerKt.gatherSystemInfo(initializerData, context, th), th);
        initializerData.getClass();
        context.getClass();
        th.getClass();
    }
}
