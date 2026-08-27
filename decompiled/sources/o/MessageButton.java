package o;

import com.sentiance.sdk.eventtimeline.transportchangedetector.states.State;
import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;

/* JADX INFO: loaded from: classes5.dex */
public abstract class MessageButton extends enableDarkThemelambda00 {
    private final boolean read;

    public abstract ClassifiedTransportMode RatingCompat();

    @Override // com.sentiance.sdk.eventtimeline.transportchangedetector.states.State
    public final State RemoteActionCompatParcelizer(BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4, handleIncomingIntent handleincomingintent, long j, long j2, Long l) {
        return new getTextColor(serializer(), handleincomingintent, brazeCompanionExternalSyntheticLambda4, Math.max(j, read() + 1), j2, l, Long.valueOf(j));
    }

    public MessageButton(r8lambdaoWdBWTrivTRn12U1u9dGnSA9aTw r8lambdaowdbwtrivtrn12u1u9dgnsa9atw, long j, long j2, boolean z) {
        super(r8lambdaowdbwtrivtrn12u1u9dgnsa9atw, j, j2);
        this.read = z;
    }

    @Override // com.sentiance.sdk.eventtimeline.transportchangedetector.states.State
    public final State.UnprocessedEventAction MediaSessionCompatQueueItem() {
        return this.read ? State.UnprocessedEventAction.ACTION_IGNORE : State.UnprocessedEventAction.ACTION_REPROCESS;
    }

    @Override // com.sentiance.sdk.eventtimeline.transportchangedetector.states.State
    public final State RemoteActionCompatParcelizer(ClassifiedTransportMode classifiedTransportMode, long j, long j2, boolean z) {
        if (classifiedTransportMode == RatingCompat()) {
            return null;
        }
        return IconCompatParcelizer(classifiedTransportMode, j, write(j2, z), z);
    }

    @Override // com.sentiance.sdk.eventtimeline.transportchangedetector.states.State
    public final State read(long j, long j2, Long l) {
        return new r8lambdadYnynBMeuPzR_fWDSs7ZLAIbd4(serializer(), Math.max(j, read() + 1), j2, l);
    }
}
