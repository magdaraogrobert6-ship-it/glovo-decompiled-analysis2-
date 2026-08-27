package o;

/* JADX INFO: loaded from: classes3.dex */
final class getExitEventsannotations implements Runnable {
    final /* synthetic */ boolean IconCompatParcelizer;
    final /* synthetic */ getLatitudeannotations RemoteActionCompatParcelizer;
    final /* synthetic */ r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 read;
    final /* synthetic */ getAnalyticsEnabledEnterannotations serializer;
    final /* synthetic */ getLongitudeannotations write;

    @Override // java.lang.Runnable
    public final void run() {
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.serializer;
        if (getanalyticsenabledenterannotations.MediaSessionCompatResultReceiverWrapper) {
            try {
                this.RemoteActionCompatParcelizer.a(this.write);
            } catch (ClassCastException e) {
                getanalyticsenabledenterannotations.MediaSessionCompatQueueItem.IconCompatParcelizer(false, e, "Invalid consumer", new Object[0]);
            }
        }
        if (this.IconCompatParcelizer) {
            this.read.IconCompatParcelizer();
        }
    }

    public getExitEventsannotations(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getLatitudeannotations getlatitudeannotations, getLongitudeannotations getlongitudeannotations, boolean z, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4) {
        this.serializer = getanalyticsenabledenterannotations;
        this.RemoteActionCompatParcelizer = getlatitudeannotations;
        this.write = getlongitudeannotations;
        this.IconCompatParcelizer = z;
        this.read = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
    }
}
