package io.sentry.android.replay;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ComponentActivity {
    public static final int read(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static final int serializer(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final int write(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static r8lambda7IJBVrN0sHyidCAZufWEJFc7yY write() {
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy = new r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new e$$ExternalSyntheticLambda0(23, r8lambda7ijbvrn0shyidcazufwejfc7yy));
        return r8lambda7ijbvrn0shyidcazufwejfc7yy;
    }

    public static final Object read(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }
}
