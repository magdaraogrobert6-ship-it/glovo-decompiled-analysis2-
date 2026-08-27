package o;

import android.location.Location;
import com.sentiance.sdk.eventtimeline.transportchangedetector.states.State;
import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;

/* JADX INFO: loaded from: classes4.dex */
public class getTextColor extends enableDarkThemelambda00 {
    private final Long IconCompatParcelizer;
    private final Long read;
    private final handleIncomingIntent serializer;
    private final BrazeCompanionExternalSyntheticLambda4 write;

    @Override // com.sentiance.sdk.eventtimeline.transportchangedetector.states.State
    public final State RemoteActionCompatParcelizer(ClassifiedTransportMode classifiedTransportMode, long j, long j2, boolean z) {
        return IconCompatParcelizer(classifiedTransportMode, j, j2, z);
    }

    public getTextColor(r8lambdaoWdBWTrivTRn12U1u9dGnSA9aTw r8lambdaowdbwtrivtrn12u1u9dgnsa9atw, handleIncomingIntent handleincomingintent, BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4, long j, long j2, Long l, Long l2) {
        super(r8lambdaowdbwtrivtrn12u1u9dgnsa9atw, j, j2);
        this.serializer = handleincomingintent;
        this.write = brazeCompanionExternalSyntheticLambda4;
        this.read = l;
        this.IconCompatParcelizer = l2;
    }

    @Override // com.sentiance.sdk.eventtimeline.transportchangedetector.states.State
    public final State RemoteActionCompatParcelizer(BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4, handleIncomingIntent handleincomingintent, long j, long j2, Long l) {
        serializer().RemoteActionCompatParcelizer().getClass();
        Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
        serializer().RemoteActionCompatParcelizer().getClass();
        if (locationWrite.distanceTo(getVerticalAccuracy.write(this.write)) <= 0.0f) {
            return null;
        }
        return new setTextColor(serializer(), j - 1, RemoteActionCompatParcelizer());
    }

    @Override // com.sentiance.sdk.eventtimeline.transportchangedetector.states.State
    public final String write() {
        return "StationaryState";
    }

    @Override // com.sentiance.sdk.eventtimeline.transportchangedetector.states.State
    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM IconCompatParcelizer() {
        r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ r8lambda59swxcybpdsiw8mt9h_rosbr8qqRemoteActionCompatParcelizer = serializer().RemoteActionCompatParcelizer();
        long j = read();
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        r8lambda59swxcybpdsiw8mt9h_rosbr8qqRemoteActionCompatParcelizer.getClass();
        return r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ.read(j, this.write, this.serializer, jRemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer);
    }
}
