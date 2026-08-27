package o;

import android.telephony.TelephonyManager;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.devicestate.Permission;
import com.sentiance.sdk.phone.f$b;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "MobileCallDetector")
public class BrazePushReceiver extends createPayload {
    private final onLocationRequestCompletelambda1 IconCompatParcelizer;
    private final TelephonyManager read;
    private final f$b serializer;
    private final batchUpdatesandroid_sdk_base_release write;

    @Override // o.createPayload
    public final void MediaMetadataCompat() {
        this.read.unregisterTelephonyCallback(this.serializer);
    }

    @Override // o.createPayload
    public final void RatingCompat() {
        this.read.registerTelephonyCallback(this.write.IconCompatParcelizer(), this.serializer);
    }

    @Override // o.BrazeNotificationUtilsExternalSyntheticLambda4
    public final boolean read() {
        return this.IconCompatParcelizer.write(Permission.READ_PHONE_STATE);
    }

    public BrazePushReceiver(TelephonyManager telephonyManager, parseLonglambda0 parselonglambda0, onLocationRequestCompletelambda1 onlocationrequestcompletelambda1, getVerticalAccuracy getverticalaccuracy, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, batchUpdatesandroid_sdk_base_release batchupdatesandroid_sdk_base_release) {
        super(parselonglambda0, getverticalaccuracy, getcooldownenterseconds, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, telephonyManager);
        this.read = telephonyManager;
        this.IconCompatParcelizer = onlocationrequestcompletelambda1;
        this.write = batchupdatesandroid_sdk_base_release;
        this.serializer = new f$b(this);
    }
}
