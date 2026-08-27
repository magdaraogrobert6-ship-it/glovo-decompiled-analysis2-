package o;

import android.view.View;
import android.view.ViewParent;
import com.huawei.hms.framework.common.ContainerUtils;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ContentCardsFragmentonRefresh1 {
    public static String serializer(Map map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb.append(setNetworkUnavailableJob.serializer((String) entry.getKey()));
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(setNetworkUnavailableJob.serializer((String) entry.getValue()));
        }
        return sb.toString();
    }

    public static void RemoteActionCompatParcelizer(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof FocusPropertiesElement) {
            ((FocusPropertiesElement) viewParent).onStopNestedScroll(view, i);
            return;
        }
        if (i == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                SentryLogcatAdapter.read("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    public static void RemoteActionCompatParcelizer(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof FocusPropertiesElement) {
            ((FocusPropertiesElement) viewParent).onNestedScrollAccepted(view, view2, i, i2);
            return;
        }
        if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                SentryLogcatAdapter.read("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    public static void read(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof getScope) {
            ((getScope) viewParent).onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof FocusPropertiesElement) {
            ((FocusPropertiesElement) viewParent).onNestedScroll(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                SentryLogcatAdapter.read("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    public static boolean serializer(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof FocusPropertiesElement) {
            return ((FocusPropertiesElement) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e) {
            SentryLogcatAdapter.read("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }

    public static void write(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof FocusPropertiesElement) {
            ((FocusPropertiesElement) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                SentryLogcatAdapter.read("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    public static boolean read(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            SentryLogcatAdapter.read("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public static boolean write(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            SentryLogcatAdapter.read("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }
}
