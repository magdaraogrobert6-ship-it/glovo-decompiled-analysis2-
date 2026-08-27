package o;

import android.os.Bundle;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingFragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class drawInto {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    public static final String RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = write + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", str, "')");
        int i4 = IconCompatParcelizer + 87;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static OneClickStartWorkingFragment RemoteActionCompatParcelizer(StartWorkingNavAction startWorkingNavAction) {
        int i = 2 % 2;
        startWorkingNavAction.getClass();
        OneClickStartWorkingFragment oneClickStartWorkingFragment = new OneClickStartWorkingFragment();
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("one_click_start_working_nav_action", startWorkingNavAction), new onViewAttachedToWindowlambda0("one_click_start_working_request_key", "START_WORKING_REQUEST_KEY")};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        oneClickStartWorkingFragment.setArguments((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320));
        int i2 = IconCompatParcelizer + 11;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
        return oneClickStartWorkingFragment;
    }
}
