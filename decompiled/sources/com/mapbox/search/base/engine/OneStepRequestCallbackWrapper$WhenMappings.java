package com.mapbox.search.base.engine;

import com.mapbox.search.internal.bindgen.Error;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class OneStepRequestCallbackWrapper$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Error.Type.values().length];
        try {
            iArr[Error.Type.CONNECTION_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Error.Type.HTTP_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Error.Type.INTERNAL_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Error.Type.REQUEST_CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
