package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "StateTimeoutCalculator")
public class addNotificationActionslambda2 {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI IconCompatParcelizer;
    private final ConfigurationManager RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;

    public final long write(Class cls, Long l, Long l2) {
        long jCurrentTimeMillis;
        long jLongValue;
        ConfigurationManager configurationManager = this.RemoteActionCompatParcelizer;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        parseLonglambda0 parselonglambda0 = this.read;
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = this.IconCompatParcelizer;
        if (cls == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - l.longValue();
            parselonglambda0.IconCompatParcelizer("Sdk has been forced moving for %d mins.", Long.valueOf(jCurrentTimeMillis2 / 60000));
            return timeUnit.toMillis(configurationManager.ComponentActivity()) - jCurrentTimeMillis2;
        }
        long millis = timeUnit.toMillis(configurationManager.ComponentActivity());
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        long jLongValue2 = l.longValue();
        if (l2 == null || l2.longValue() < l.longValue()) {
            jCurrentTimeMillis = System.currentTimeMillis();
            jLongValue = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            jLongValue = l2.longValue();
        }
        long j = jCurrentTimeMillis - jLongValue;
        parselonglambda0.IconCompatParcelizer("It's been %d mins since the last since last Geofence or accurate location fix and %s mins since trip start", Long.valueOf(j / 60000), Long.valueOf((jCurrentTimeMillis3 - jLongValue2) / 60000));
        return millis - j;
    }

    public addNotificationActionslambda2(parseLonglambda0 parselonglambda0, ConfigurationManager configurationManager, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.read = parselonglambda0;
        this.RemoteActionCompatParcelizer = configurationManager;
        this.IconCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }
}
