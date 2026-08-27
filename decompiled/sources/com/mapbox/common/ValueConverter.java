package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes5.dex */
public final class ValueConverter {
    protected long peer;

    public static class ValueConverterPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ValueConverter.cleanNativePeer(this.peer);
        }

        public ValueConverterPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native Expected<String, Value> fromJson(String str);

    private static native void nativeSelfRegister();

    public static native String toJson(Value value);

    public static native String toJson(Value value, int i);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public ValueConverter(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new ValueConverterPeerCleaner(j));
    }
}
