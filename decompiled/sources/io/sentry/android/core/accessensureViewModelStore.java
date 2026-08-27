package io.sentry.android.core;

import o.getActionTypeandroid_sdk_ui_release;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class accessensureViewModelStore {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[getActionTypeandroid_sdk_ui_release.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[getActionTypeandroid_sdk_ui_release.DISCONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[getActionTypeandroid_sdk_ui_release.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
