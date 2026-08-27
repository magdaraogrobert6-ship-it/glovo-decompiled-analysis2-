package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class setNotificationDurationAlarm extends setNotificationDurationAlarmlambda0<wipeDatalambda0> {
    final /* synthetic */ setDeleteIntentlambda0 RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setNotificationDurationAlarm(setDeleteIntentlambda0 setdeleteintentlambda0) {
        super(setdeleteintentlambda0);
        this.RemoteActionCompatParcelizer = setdeleteintentlambda0;
    }

    @Override // o.setNotificationDurationAlarmlambda0
    public final List<logBaiduNotificationClicklambda1> IconCompatParcelizer(getLongitudeannotations<wipeDatalambda0> getlongitudeannotations) {
        wipeDatalambda0 wipedatalambda0 = getlongitudeannotations.read();
        long jMediaMetadataCompat = getlongitudeannotations.MediaMetadataCompat();
        long jWrite = getlongitudeannotations.write();
        handleIncomingIntent handleincomingintent = wipedatalambda0.write;
        return setDeleteIntentlambda0.serializer(this.RemoteActionCompatParcelizer, wipedatalambda0.RemoteActionCompatParcelizer, handleincomingintent, jMediaMetadataCompat, jWrite);
    }
}
