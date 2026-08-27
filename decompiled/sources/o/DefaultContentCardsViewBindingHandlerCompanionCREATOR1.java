package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultContentCardsViewBindingHandlerCompanionCREATOR1 {
    public static int IconCompatParcelizer(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            return i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        return i3;
    }

    public static void IconCompatParcelizer(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            DrawableTransformation.RemoteActionCompatParcelizer(i3, m1$$ExternalSyntheticOutline0.m(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(i, "fromIndex: ", i2, " > toIndex: "));
        }
    }

    public static void write(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            DrawableTransformation.RemoteActionCompatParcelizer(i3, m1$$ExternalSyntheticOutline0.m(i, i2, "startIndex: ", ", endIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(i, "startIndex: ", i2, " > endIndex: "));
        }
    }

    public static void RemoteActionCompatParcelizer(int i, int i2) {
        if (i < 0 || i > i2) {
            DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i, "index: ", i2, ", size: "));
        }
    }

    public static void serializer(int i, int i2) {
        if (i < 0 || i >= i2) {
            DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i, "index: ", i2, ", size: "));
        }
    }
}
