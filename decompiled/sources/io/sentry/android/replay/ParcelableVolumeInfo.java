package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class ParcelableVolumeInfo {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.values().length];
        try {
            iArr[r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RESUMED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.PAUSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.STOPPED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.CLOSED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        serializer = iArr;
    }
}
