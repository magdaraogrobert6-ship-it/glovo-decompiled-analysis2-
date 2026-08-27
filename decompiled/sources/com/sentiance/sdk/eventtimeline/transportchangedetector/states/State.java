package com.sentiance.sdk.eventtimeline.transportchangedetector.states;

import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;
import o.BrazeCompanionExternalSyntheticLambda4;
import o.C0168getOpenUriInWebview;
import o.C0201setOpenUriInWebview;
import o.InAppMessageSlideupCompanion;
import o.InAppMessageWithImageBase;
import o.InAppMessageZippedAssetHtmlBase;
import o.MessageButton;
import o.getBorderColor;
import o.getStringId;
import o.getTextColor;
import o.handleIncomingIntent;
import o.r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM;
import o.r8lambdachw8wsvFjnjdbZYr22eB1BbFDVc;
import o.r8lambdadYnynBMeuPzR_fWDSs7ZLAIbd4;
import o.r8lambdamhhbpPHHbprDJJ7bhqGbzfVfvZc;
import o.r8lambdaoWdBWTrivTRn12U1u9dGnSA9aTw;
import o.r8lambdawCZSSu5f8N8lzpl8qvIICFaqiw;
import o.setChevronColor;
import o.setSlideFrom;

/* JADX INFO: loaded from: classes4.dex */
public abstract class State {
    private final long IconCompatParcelizer;
    private final r8lambdaoWdBWTrivTRn12U1u9dGnSA9aTw read;
    private final long serializer;

    public enum UnprocessedEventAction {
        ACTION_IGNORE,
        ACTION_REPROCESS
    }

    public abstract r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM IconCompatParcelizer();

    public UnprocessedEventAction MediaSessionCompatQueueItem() {
        return UnprocessedEventAction.ACTION_REPROCESS;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public State RemoteActionCompatParcelizer(ClassifiedTransportMode classifiedTransportMode, long j, long j2, boolean z) {
        return null;
    }

    public final long read() {
        return this.serializer;
    }

    public final r8lambdaoWdBWTrivTRn12U1u9dGnSA9aTw serializer() {
        return this.read;
    }

    public abstract String write();

    public State(r8lambdaoWdBWTrivTRn12U1u9dGnSA9aTw r8lambdaowdbwtrivtrn12u1u9dgnsa9atw, long j, long j2) {
        this.read = r8lambdaowdbwtrivtrn12u1u9dgnsa9atw;
        this.serializer = j;
        this.IconCompatParcelizer = j2;
    }

    public final MessageButton IconCompatParcelizer(ClassifiedTransportMode classifiedTransportMode, long j, long j2, boolean z) {
        if (classifiedTransportMode == ClassifiedTransportMode.BIKING) {
            return new InAppMessageZippedAssetHtmlBase(this.read, j, j2, z);
        }
        if (classifiedTransportMode == ClassifiedTransportMode.TRAM) {
            return new getBorderColor(this.read, j, j2, z);
        }
        if (classifiedTransportMode == ClassifiedTransportMode.CAR) {
            return new setSlideFrom(this.read, j, j2, z);
        }
        if (classifiedTransportMode == ClassifiedTransportMode.TRAIN) {
            return new C0168getOpenUriInWebview(this.read, j, j2, z);
        }
        if (classifiedTransportMode == ClassifiedTransportMode.WALKING) {
            return new r8lambdamhhbpPHHbprDJJ7bhqGbzfVfvZc(this.read, j, j2, z);
        }
        if (classifiedTransportMode == ClassifiedTransportMode.IDLE) {
            return new setChevronColor(this.read, j, j2, z);
        }
        if (classifiedTransportMode == ClassifiedTransportMode.RUNNING) {
            return new getStringId(this.read, j, j2, z);
        }
        if (classifiedTransportMode == ClassifiedTransportMode.BUS) {
            return new InAppMessageSlideupCompanion(this.read, j, j2, z);
        }
        if (classifiedTransportMode == ClassifiedTransportMode.ON_FOOT) {
            return new r8lambdawCZSSu5f8N8lzpl8qvIICFaqiw(this.read, j, j2, z);
        }
        if (classifiedTransportMode == ClassifiedTransportMode.VEHICLE) {
            return new C0201setOpenUriInWebview(this.read, j, j2, z);
        }
        if (classifiedTransportMode == ClassifiedTransportMode.RAIL) {
            return new r8lambdachw8wsvFjnjdbZYr22eB1BbFDVc(this.read, j, j2, z);
        }
        if (classifiedTransportMode == ClassifiedTransportMode.MOTORCYCLE) {
            return new InAppMessageWithImageBase(this.read, j, j2, z);
        }
        return null;
    }

    public State RemoteActionCompatParcelizer(BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4, handleIncomingIntent handleincomingintent, long j, long j2, Long l) {
        return new getTextColor(this.read, handleincomingintent, brazeCompanionExternalSyntheticLambda4, j, j2, l, Long.valueOf(j));
    }

    public State read(long j, long j2, Long l) {
        return new r8lambdadYnynBMeuPzR_fWDSs7ZLAIbd4(this.read, j, j2, l);
    }

    public final long write(long j, boolean z) {
        return z ? this.IconCompatParcelizer : j;
    }
}
