package o;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.roadrunner.push.presentation.MessageDialogFragment;
import com.roadrunner.push.presentation.viewentity.MessageDialogData;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class setFocusable {
    private static byte IconCompatParcelizer = -112;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    public static MessageDialogFragment read(MessageDialogData messageDialogData) {
        int i = 2 % 2;
        messageDialogData.getClass();
        MessageDialogFragment messageDialogFragment = new MessageDialogFragment();
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0(RemoteMessageConst.DATA, messageDialogData)};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        messageDialogFragment.setArguments((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320));
        int i2 = read + 95;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return messageDialogFragment;
        }
        throw null;
    }

    public static final String read(getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration());
        String string = ((Context) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getString(i);
        if (!string.startsWith("%('")) {
            return string;
        }
        int i3 = RemoteActionCompatParcelizer + 29;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        a(string.substring(3), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = RemoteActionCompatParcelizer + 71;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return strIntern;
    }

    private static void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ IconCompatParcelizer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
