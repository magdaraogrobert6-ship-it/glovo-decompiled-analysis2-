package o;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidViewConfigurationApi34 {
    public static final getHasMeasureResult read;
    public final Context serializer;

    public final String serializer() {
        synchronized (this) {
            String string = this.serializer.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
            if (string != null) {
                return string;
            }
            String string2 = UUID.randomUUID().toString();
            this.serializer.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
            return string2;
        }
    }

    static {
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(AndroidViewConfigurationApi34.class);
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(AndroidUriHandler.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(Context.class));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = new AndroidUiDispatcherCompanioncurrentThread1(1);
        read = capturerulersifneededuiWrite.IconCompatParcelizer();
    }

    public AndroidViewConfigurationApi34(Context context) {
        this.serializer = context;
    }
}
