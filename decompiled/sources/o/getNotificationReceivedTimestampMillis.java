package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(cacheName = "ConsumedVehicleCrashFeedbackTimestamps", componentName = "ConsumedVehicleCrashFeedbackTimestamps")
public class getNotificationReceivedTimestampMillis extends getNotificationChannelId {
    private final ConfigurationManager write;

    @Override // o.getNotificationChannelId
    public final Integer read() {
        return Integer.valueOf(this.write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
    }

    public getNotificationReceivedTimestampMillis(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ConfigurationManager configurationManager) {
        super(cVar, parselonglambda0, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni);
        this.write = configurationManager;
    }
}
