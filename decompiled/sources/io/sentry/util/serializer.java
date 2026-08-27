package io.sentry.util;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
public abstract class serializer {
    public static boolean write(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static ClassLoader read(ClassLoader classLoader) {
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader : ClassLoader.getSystemClassLoader();
    }
}
