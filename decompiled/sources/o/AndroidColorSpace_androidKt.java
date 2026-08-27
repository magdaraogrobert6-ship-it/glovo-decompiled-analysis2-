package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public enum AndroidColorSpace_androidKt {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    public static final asComposeColorFilter Companion = new asComposeColorFilter();

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public static final AndroidColorSpace_androidKt downFrom(toColorLong8_81llA tocolorlong8_81lla) {
        Companion.getClass();
        return asComposeColorFilter.write(tocolorlong8_81lla);
    }

    public static final AndroidColorSpace_androidKt downTo(toColorLong8_81llA tocolorlong8_81lla) {
        Companion.getClass();
        tocolorlong8_81lla.getClass();
        int i = asAndroidColorFilter.serializer[tocolorlong8_81lla.ordinal()];
        if (i == 1) {
            return ON_STOP;
        }
        if (i == 2) {
            return ON_PAUSE;
        }
        if (i != 4) {
            return null;
        }
        return ON_DESTROY;
    }

    public static final AndroidColorSpace_androidKt upFrom(toColorLong8_81llA tocolorlong8_81lla) {
        Companion.getClass();
        return asComposeColorFilter.read(tocolorlong8_81lla);
    }

    public static final AndroidColorSpace_androidKt upTo(toColorLong8_81llA tocolorlong8_81lla) {
        Companion.getClass();
        return asComposeColorFilter.serializer(tocolorlong8_81lla);
    }

    public final toColorLong8_81llA getTargetState() {
        switch (supportsLightingColorFilterQuery.write[ordinal()]) {
            case 1:
            case 2:
                return toColorLong8_81llA.CREATED;
            case 3:
            case 4:
                return toColorLong8_81llA.STARTED;
            case 5:
                return toColorLong8_81llA.RESUMED;
            case 6:
                return toColorLong8_81llA.DESTROYED;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
        }
    }
}
