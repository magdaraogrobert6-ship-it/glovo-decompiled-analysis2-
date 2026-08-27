package o;

/* JADX INFO: loaded from: classes.dex */
public final class asComposeColorFilter {
    public static AndroidColorSpace_androidKt read(toColorLong8_81llA tocolorlong8_81lla) {
        tocolorlong8_81lla.getClass();
        int i = asAndroidColorFilter.serializer[tocolorlong8_81lla.ordinal()];
        if (i == 1) {
            return AndroidColorSpace_androidKt.ON_START;
        }
        if (i == 2) {
            return AndroidColorSpace_androidKt.ON_RESUME;
        }
        if (i != 5) {
            return null;
        }
        return AndroidColorSpace_androidKt.ON_CREATE;
    }

    public static AndroidColorSpace_androidKt serializer(toColorLong8_81llA tocolorlong8_81lla) {
        tocolorlong8_81lla.getClass();
        int i = asAndroidColorFilter.serializer[tocolorlong8_81lla.ordinal()];
        if (i == 1) {
            return AndroidColorSpace_androidKt.ON_CREATE;
        }
        if (i == 2) {
            return AndroidColorSpace_androidKt.ON_START;
        }
        if (i != 3) {
            return null;
        }
        return AndroidColorSpace_androidKt.ON_RESUME;
    }

    public static AndroidColorSpace_androidKt write(toColorLong8_81llA tocolorlong8_81lla) {
        tocolorlong8_81lla.getClass();
        int i = asAndroidColorFilter.serializer[tocolorlong8_81lla.ordinal()];
        if (i == 1) {
            return AndroidColorSpace_androidKt.ON_DESTROY;
        }
        if (i == 2) {
            return AndroidColorSpace_androidKt.ON_STOP;
        }
        if (i != 3) {
            return null;
        }
        return AndroidColorSpace_androidKt.ON_PAUSE;
    }
}
