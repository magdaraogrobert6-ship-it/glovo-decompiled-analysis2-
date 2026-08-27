package com.sentiance.core.model.thrift;

/* JADX INFO: loaded from: classes3.dex */
public enum MotionActivity {
    IOS_STATIONARY(1),
    IOS_WALKING(2),
    IOS_RUNNING(3),
    IOS_AUTOMOTIVE(4),
    IOS_CYCLING(5),
    IOS_UNKNOWN(6),
    ANDROID_IN_VEHICLE(7),
    ANDROID_ON_BICYCLE(8),
    ANDROID_ON_FOOT(9),
    ANDROID_RUNNING(10),
    ANDROID_STILL(11),
    ANDROID_TILTING(12),
    ANDROID_UNKNOWN(13),
    ANDROID_WALKING(14);

    public final int value;

    MotionActivity(int i) {
        this.value = i;
    }

    public static MotionActivity findByValue(int i) {
        switch (i) {
            case 1:
                return IOS_STATIONARY;
            case 2:
                return IOS_WALKING;
            case 3:
                return IOS_RUNNING;
            case 4:
                return IOS_AUTOMOTIVE;
            case 5:
                return IOS_CYCLING;
            case 6:
                return IOS_UNKNOWN;
            case 7:
                return ANDROID_IN_VEHICLE;
            case 8:
                return ANDROID_ON_BICYCLE;
            case 9:
                return ANDROID_ON_FOOT;
            case 10:
                return ANDROID_RUNNING;
            case 11:
                return ANDROID_STILL;
            case 12:
                return ANDROID_TILTING;
            case 13:
                return ANDROID_UNKNOWN;
            case 14:
                return ANDROID_WALKING;
            default:
                return null;
        }
    }
}
