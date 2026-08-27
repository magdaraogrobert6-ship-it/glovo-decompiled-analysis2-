package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.ondevicecommon.CrashSeverityInternal;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(cacheName = "CrashDetector", componentName = "CarCrashDetector")
public class r8lambda1KwW2EAIsZGJz42E6XchkGecXg extends GooglePlayLocationUtilsExternalSyntheticLambda18<r8lambdaAqqaEOi18rmMjZ20ulDhFemQVs, BrazeGeofenceManager> implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final ConfigurationManager read;
    private final parseLonglambda0 serializer;

    @Override // o.GooglePlayLocationUtilsExternalSyntheticLambda18
    public final byte IconCompatParcelizer() {
        return (byte) 1;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    @Override // o.GooglePlayLocationUtilsExternalSyntheticLambda18
    public final boolean IconCompatParcelizer(CrashSeverityInternal crashSeverityInternal) {
        CrashSeverityInternal crashSeverityInternal2;
        String strWrite = this.read.write();
        CrashSeverityInternal.Companion.getClass();
        int iHashCode = strWrite.hashCode();
        if (iHashCode != -1078030475) {
            if (iHashCode != 107348) {
                if (iHashCode == 3202466 && strWrite.equals(com.adjust.sdk.Constants.HIGH)) {
                    crashSeverityInternal2 = CrashSeverityInternal.HIGH;
                } else {
                    crashSeverityInternal2 = null;
                }
            } else if (strWrite.equals(com.adjust.sdk.Constants.LOW)) {
                crashSeverityInternal2 = CrashSeverityInternal.LOW;
            } else {
                crashSeverityInternal2 = null;
            }
        } else if (strWrite.equals(com.adjust.sdk.Constants.MEDIUM)) {
            crashSeverityInternal2 = CrashSeverityInternal.MEDIUM;
        } else {
            crashSeverityInternal2 = null;
        }
        if (crashSeverityInternal2 == null) {
            this.serializer.RemoteActionCompatParcelizer("failed to convert min required crash severity from sdk configuration, crash severity string: ".concat(strWrite), new Object[0]);
        }
        if (crashSeverityInternal == null || crashSeverityInternal2 == null) {
            return false;
        }
        return crashSeverityInternal.isHigherOrEqualTo(crashSeverityInternal2);
    }

    public r8lambda1KwW2EAIsZGJz42E6XchkGecXg(parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, r8lambdaOXfsZ5bXwSG876KWYcsN742T8 r8lambdaoxfsz5bxwsg876kwycsn742t8, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, component4android_sdk_base_release component4android_sdk_base_releaseVar, r8lambda1owZ_4TkE0EYLOUCozvoOJ2FLWs r8lambda1owz_4tke0eyloucozvooj2flws, getNotificationId getnotificationid, com.sentiance.sdk.util.c cVar, r8lambda7zvd1Q0zVs4colYANjFPBKq0PCw r8lambda7zvd1q0zvs4colyanjfpbkq0pcw, ConfigurationManager configurationManager, r8lambdaFFntGI86VJ4J7lg1XElfn0Y9xbg r8lambdaffntgi86vj4j7lg1xelfn0y9xbg) {
        super(parselonglambda0, readandroid_sdk_base_releaseVar, getanalyticsenabledenterannotations, r8lambdaoxfsz5bxwsg876kwycsn742t8, getcooldownenterseconds, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, component4android_sdk_base_releaseVar, getnotificationid, cVar, r8lambda7zvd1q0zvs4colyanjfpbkq0pcw, r8lambda1owz_4tke0eyloucozvooj2flws, r8lambdaffntgi86vj4j7lg1xelfn0y9xbg);
        this.serializer = parselonglambda0;
        this.read = configurationManager;
    }
}
