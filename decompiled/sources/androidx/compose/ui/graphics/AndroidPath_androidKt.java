package androidx.compose.ui.graphics;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPath_androidKt {
    public static final Path asComposePath(android.graphics.Path path) {
        return new AndroidPath(path);
    }

    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Path.Direction toPlatformPathDirection(Path.Direction direction) {
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            return android.graphics.Path.Direction.CCW;
        }
        if (i == 2) {
            return android.graphics.Path.Direction.CW;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Path.Direction.values().length];
            try {
                iArr[Path.Direction.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Path.Direction.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Path Path() {
        return new AndroidPath(null, 1, 0 == true ? 1 : 0);
    }

    public static final android.graphics.Path asAndroidPath(Path path) {
        if (path instanceof AndroidPath) {
            return ((AndroidPath) path).getInternalPath();
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
        return null;
    }
}
