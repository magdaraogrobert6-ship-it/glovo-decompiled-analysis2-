package o;

import android.app.Activity;
import android.content.Intent;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData;

/* JADX INFO: loaded from: classes3.dex */
public final class findParagraphByLineIndex {
    private static int serializer = 1;
    private static int write;

    public static boolean read() {
        int i = 2 % 2;
        int i2 = serializer + 63;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) SelfServiceCustomerChatActivity.write(-298932657, new Object[0], displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 298932660, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read())).booleanValue();
        int i4 = write + 27;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public static Intent IconCompatParcelizer(Activity activity, ChatViewData chatViewData) {
        int i = 2 % 2;
        Intent intent = new Intent(activity, (Class<?>) SelfServiceCustomerChatActivity.class);
        intent.putExtra("EXTRA_CHAT_VIEW_DATA", chatViewData);
        int i2 = serializer + 117;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return intent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
