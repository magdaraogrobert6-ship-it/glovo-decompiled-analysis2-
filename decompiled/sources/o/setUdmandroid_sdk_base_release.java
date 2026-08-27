package o;

import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class setUdmandroid_sdk_base_release {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final EnumColumnAdapter read;

    public setUdmandroid_sdk_base_release(EnumColumnAdapter enumColumnAdapter, int i) {
        if (i == 1) {
            this.read = enumColumnAdapter;
        } else if (i != 2) {
            enumColumnAdapter.getClass();
            this.read = enumColumnAdapter;
        } else {
            enumColumnAdapter.getClass();
            this.read = enumColumnAdapter;
        }
    }

    public void write() {
        int i = 2 % 2;
        int i2 = serializer + 49;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        EnumColumnAdapter.serializer(this.read, "web_view_not_available", executeAsList.RXP, "WebView is not available");
        int i4 = serializer + 73;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void serializer(String str) {
        int i = 2 % 2;
        str.getClass();
        ((SentryCriticalIssueLogger) this.read).write("pin_validation_key_derivation_failed", executeAsList.PUDO, "Key derivation error occurred during PIN validation", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("root_error_class", "PinValidationCriticalIssueLogger"), new onViewAttachedToWindowlambda0("reason", str)));
        int i2 = IconCompatParcelizer + 69;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
    }
}
