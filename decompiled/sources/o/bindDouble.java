package o;

import com.roadrunner.login.presentation.LoginActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class bindDouble implements bindBoolean {
    private static int read = 1;
    private static int serializer;
    public final SqlPreparedStatement write;

    public bindDouble(SqlPreparedStatement sqlPreparedStatement) {
        this.write = sqlPreparedStatement;
    }

    public final getSdkEnablementProviderandroid_sdk_base_release read(LoginActivity loginActivity) {
        String str;
        int i = 2 % 2;
        decode decodeVar = (decode) this.write.IconCompatParcelizer.write();
        decodeVar.getClass();
        loginActivity.getClass();
        getSdkEnablementProviderandroid_sdk_base_release getsdkenablementproviderandroid_sdk_base_release = new getSdkEnablementProviderandroid_sdk_base_release(1);
        int i2 = loginActivity.getResources().getConfiguration().uiMode & 48;
        Object obj = null;
        if (i2 == 16) {
            str = "color_mode_light";
        } else if (i2 != 32) {
            int i3 = read + 65;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str = "color_mode_unknown";
        } else {
            str = "color_mode_dark";
        }
        decodeVar.logEvent(str, null);
        int i4 = serializer + 69;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getsdkenablementproviderandroid_sdk_base_release;
    }
}
