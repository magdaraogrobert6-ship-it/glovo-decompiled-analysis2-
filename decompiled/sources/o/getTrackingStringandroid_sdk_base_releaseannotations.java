package o;

import com.sentiance.sdk.util.Optional;

/* JADX INFO: loaded from: classes3.dex */
public class getTrackingStringandroid_sdk_base_releaseannotations {
    private final component4android_sdk_base_release IconCompatParcelizer;
    private final getCooldownEnterSeconds RemoteActionCompatParcelizer;
    private final getVerticalAccuracy write;

    public getTrackingStringandroid_sdk_base_releaseannotations(getCooldownEnterSeconds getcooldownenterseconds, getVerticalAccuracy getverticalaccuracy, component4android_sdk_base_release component4android_sdk_base_releaseVar) {
        this.RemoteActionCompatParcelizer = getcooldownenterseconds;
        this.write = getverticalaccuracy;
        this.IconCompatParcelizer = component4android_sdk_base_releaseVar;
    }

    public static String RemoteActionCompatParcelizer(Object obj) {
        if (obj instanceof BrazeUser) {
            BrazeUser brazeUser = (BrazeUser) obj;
            return "SensorDataEvent{type=" + brazeUser.write + ", base_timestamp=" + brazeUser.RemoteActionCompatParcelizer + ", num_i32_measurements=" + brazeUser.IconCompatParcelizer.size() + "}";
        }
        if (!(obj instanceof logLocationRecordedEvent)) {
            return obj.toString();
        }
        logLocationRecordedEvent loglocationrecordedevent = (logLocationRecordedEvent) obj;
        return "ResampledSensorDataEvent{type=" + loglocationrecordedevent.serializer + ", base_timestamp=" + loglocationrecordedevent.IconCompatParcelizer + ", num_i32_measurements=" + loglocationrecordedevent.read.size() + "}";
    }

    public final r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I IconCompatParcelizer(long j) {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I r8lambdaxnkp5mxo9act549dmvgqnyhj0i;
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, Long.valueOf(j + 1), false);
        if (!optionalRemoteActionCompatParcelizer.IconCompatParcelizer() || getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), this.write) != r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalRemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer(this.IconCompatParcelizer)) == null || (r8lambdaxnkp5mxo9act549dmvgqnyhj0i = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.getSavedStateRegistryControllerannotations) == null) {
            return null;
        }
        return r8lambdaxnkp5mxo9act549dmvgqnyhj0i;
    }
}
