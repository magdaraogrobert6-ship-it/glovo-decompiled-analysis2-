package io.sentry.android.core;

import o.getActionTypeandroid_sdk_ui_release;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[getActionTypeandroid_sdk_ui_release.values().length];
        serializer = iArr;
        try {
            iArr[getActionTypeandroid_sdk_ui_release.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[getActionTypeandroid_sdk_ui_release.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            serializer[getActionTypeandroid_sdk_ui_release.NO_PERMISSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
