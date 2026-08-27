package o;

import com.sentiance.core.model.thrift.O$b;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.feedback.api.VehicleCrashDetectionFeedback;
import com.sentiance.sdk.feedback.api.VehicleCrashDetectionFeedbackResult;
import com.sentiance.sdk.publicapi.location.Coordinates;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "VehicleCrashFeedbackConsumer")
public final class getNotificationVisibility {
    private final parseLonglambda0 IconCompatParcelizer;
    private final getAnalyticsEnabledEnterannotations serializer;
    private final getNotificationReceivedTimestampMillis write;

    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    public final VehicleCrashDetectionFeedbackResult serializer(VehicleCrashDetectionFeedback vehicleCrashDetectionFeedback) {
        VehicleCrashDetectionFeedbackResult vehicleCrashDetectionFeedbackResult;
        vehicleCrashDetectionFeedback.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        parseLonglambda0 parselonglambda0 = this.IconCompatParcelizer;
        parselonglambda0.IconCompatParcelizer("Validating feedback submitted for event at " + vehicleCrashDetectionFeedback.getEventDate(), new Object[0]);
        Date eventDate = vehicleCrashDetectionFeedback.getEventDate();
        eventDate.getClass();
        boolean z = eventDate.getTime() > System.currentTimeMillis();
        long time = eventDate.getTime();
        getNotificationReceivedTimestampMillis getnotificationreceivedtimestampmillis = this.write;
        boolean z2 = time >= System.currentTimeMillis() - TimeUnit.DAYS.toMillis((long) getnotificationreceivedtimestampmillis.read().intValue());
        if (z || !z2) {
            parselonglambda0.IconCompatParcelizer("Feedback submitted with an invalid event date: " + vehicleCrashDetectionFeedback.getEventDate(), new Object[0]);
            vehicleCrashDetectionFeedbackResult = VehicleCrashDetectionFeedbackResult.INVALID_EVENT_DATE;
        } else if (getnotificationreceivedtimestampmillis.read(vehicleCrashDetectionFeedback.getEventDate().getTime())) {
            parselonglambda0.IconCompatParcelizer("Feedback already provided for event date: " + vehicleCrashDetectionFeedback.getEventDate(), new Object[0]);
            vehicleCrashDetectionFeedbackResult = VehicleCrashDetectionFeedbackResult.FEEDBACK_ALREADY_PROVIDED;
        } else {
            Coordinates crashLocation = vehicleCrashDetectionFeedback.getCrashLocation();
            if (crashLocation != null) {
                double dAbs = Math.abs(crashLocation.getLatitude());
                boolean z3 = dAbs >= 0.0d && dAbs <= 90.0d && dAbs != 90.0d;
                double dAbs2 = Math.abs(crashLocation.getLongitude());
                boolean z4 = dAbs2 >= 0.0d && dAbs2 <= 180.0d;
                if (z3 && z4) {
                    crashLocation = null;
                }
                if (crashLocation != null) {
                    parselonglambda0.IconCompatParcelizer("Feedback submitted with an invalid crash location: " + crashLocation, new Object[0]);
                    vehicleCrashDetectionFeedbackResult = VehicleCrashDetectionFeedbackResult.INVALID_LOCATION;
                } else {
                    vehicleCrashDetectionFeedbackResult = null;
                }
            } else {
                vehicleCrashDetectionFeedbackResult = null;
            }
        }
        if (vehicleCrashDetectionFeedbackResult != null) {
            return vehicleCrashDetectionFeedbackResult;
        }
        getnotificationreceivedtimestampmillis.serializer(vehicleCrashDetectionFeedback.getEventDate().getTime());
        long time2 = vehicleCrashDetectionFeedback.getEventDate().getTime();
        boolean zWasRealCrash = vehicleCrashDetectionFeedback.wasRealCrash();
        boolean zWasCrashDetectedBySentiance = vehicleCrashDetectionFeedback.wasCrashDetectedBySentiance();
        Coordinates crashLocation2 = vehicleCrashDetectionFeedback.getCrashLocation();
        Double dValueOf = crashLocation2 != null ? Double.valueOf(crashLocation2.getLatitude()) : null;
        Coordinates crashLocation3 = vehicleCrashDetectionFeedback.getCrashLocation();
        Double dValueOf2 = crashLocation3 != null ? Double.valueOf(crashLocation3.getLongitude()) : null;
        O$b o$b = new O$b();
        o$b.write = Long.valueOf(time2);
        o$b.RemoteActionCompatParcelizer = Boolean.valueOf(zWasRealCrash);
        o$b.IconCompatParcelizer = Boolean.valueOf(zWasCrashDetectedBySentiance);
        if (dValueOf != null && dValueOf2 != null) {
            o$b.serializer = Integer.valueOf((int) (dValueOf.doubleValue() * 100000.0d));
            o$b.read = Integer.valueOf((int) (dValueOf2.doubleValue() * 100000.0d));
        }
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jCurrentTimeMillis);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.onBackPressedDispatcher_delegatelambda010 = o$b.read();
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        this.serializer.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
        return VehicleCrashDetectionFeedbackResult.ACCEPTED;
    }

    public getNotificationVisibility(parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getVerticalAccuracy getverticalaccuracy, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getNotificationReceivedTimestampMillis getnotificationreceivedtimestampmillis) {
        parselonglambda0.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        getverticalaccuracy.getClass();
        getanalyticsenabledenterannotations.getClass();
        getnotificationreceivedtimestampmillis.getClass();
        this.IconCompatParcelizer = parselonglambda0;
        this.serializer = getanalyticsenabledenterannotations;
        this.write = getnotificationreceivedtimestampmillis;
    }
}
