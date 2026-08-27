package o;

import com.huawei.hms.android.SystemUtils;
import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getScrollState {
    private static int read = 1;
    private static int serializer;
    public final EnumColumnAdapter IconCompatParcelizer;
    public final setGraphicModalMaxWidthDp RemoteActionCompatParcelizer;
    public final isVerticalSwipeInAllowedDirection write;

    public getScrollState(EnumColumnAdapter enumColumnAdapter) {
        enumColumnAdapter.getClass();
        this.IconCompatParcelizer = enumColumnAdapter;
        this.write = resetTransientState.read;
        this.RemoteActionCompatParcelizer = dispatchLayoutStep1.Companion.serializer();
    }

    public final String read(dispatchLayoutStep1 dispatchlayoutstep1) {
        int i = 2 % 2;
        int i2 = serializer + 81;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        try {
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = this.write;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = this.RemoteActionCompatParcelizer;
            SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(isverticalswipeinalloweddirection.IconCompatParcelizer(setgraphicmodalmaxwidthdp, dispatchlayoutstep1)).get("type");
            if (swipeDismissTouchListenerVerticalDismissDirection == null) {
                return SystemUtils.UNKNOWN;
            }
            int i4 = serializer + 1;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            String strIconCompatParcelizer = TouchAwareSwipeDismissTouchListener.read(swipeDismissTouchListenerVerticalDismissDirection).IconCompatParcelizer();
            if (strIconCompatParcelizer == null) {
                return SystemUtils.UNKNOWN;
            }
            int i6 = read + 81;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return strIconCompatParcelizer;
            }
            throw null;
        } catch (Exception unused) {
            return SystemUtils.UNKNOWN;
        }
    }

    public final void RemoteActionCompatParcelizer(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, boolean z) {
        String str;
        int i = 2 % 2;
        int i2 = read + 117;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (r8lambdaucgighn8fiyv_vccodeafjfpedk != null) {
            r8lambdaucgighn8fiyv_vccodeafjfpedk.write();
            throw null;
        }
        executeAsList executeaslist = executeAsList.RXP;
        if (z) {
            int i4 = serializer + 107;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            str = "rider_home_state_critical_component_parsing_error";
        } else {
            str = "rider_home_state_non_critical_component_parsing_error";
            int i6 = read + 11;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        String strConcat = "Rider home state parsing error for component: ".concat(SystemUtils.UNKNOWN);
        Map mapSingletonMap = Collections.singletonMap("type", SystemUtils.UNKNOWN);
        mapSingletonMap.getClass();
        ((SentryCriticalIssueLogger) this.IconCompatParcelizer).write(str, executeaslist, strConcat, mapSingletonMap);
    }
}
