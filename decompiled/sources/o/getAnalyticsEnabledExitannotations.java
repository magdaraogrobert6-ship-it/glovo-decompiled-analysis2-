package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class getAnalyticsEnabledExitannotations implements Runnable {
    final /* synthetic */ Object IconCompatParcelizer;
    final /* synthetic */ ControlMessage RemoteActionCompatParcelizer;
    final /* synthetic */ getAnalyticsEnabledEnterannotations write;

    @Override // java.lang.Runnable
    public final void run() {
        ControlMessage controlMessage = this.RemoteActionCompatParcelizer;
        Object obj = this.IconCompatParcelizer;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.write;
        getAnalyticsEnabledEnterannotations.read(getanalyticsenabledenterannotations, controlMessage, obj);
        getanalyticsenabledenterannotations.MediaSessionCompatToken.IconCompatParcelizer();
    }

    public getAnalyticsEnabledExitannotations(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, ControlMessage controlMessage, Object obj) {
        this.write = getanalyticsenabledenterannotations;
        this.RemoteActionCompatParcelizer = controlMessage;
        this.IconCompatParcelizer = obj;
    }
}
