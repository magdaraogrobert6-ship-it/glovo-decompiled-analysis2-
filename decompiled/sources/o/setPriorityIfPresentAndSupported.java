package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class setPriorityIfPresentAndSupported extends setNotificationDurationAlarmlambda0<r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A> {
    final /* synthetic */ setDeleteIntentlambda0 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setPriorityIfPresentAndSupported(setDeleteIntentlambda0 setdeleteintentlambda0) {
        super(setdeleteintentlambda0);
        this.serializer = setdeleteintentlambda0;
    }

    @Override // o.setNotificationDurationAlarmlambda0
    public final List<logBaiduNotificationClicklambda1> IconCompatParcelizer(getLongitudeannotations<r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A> getlongitudeannotations) {
        r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A r8lambdadtwa3yx1e9cvszaagaemidzvt8a = getlongitudeannotations.read();
        long jMediaMetadataCompat = getlongitudeannotations.MediaMetadataCompat();
        long jWrite = getlongitudeannotations.write();
        handleIncomingIntent handleincomingintent = r8lambdadtwa3yx1e9cvszaagaemidzvt8a.RemoteActionCompatParcelizer;
        return setDeleteIntentlambda0.serializer(this.serializer, r8lambdadtwa3yx1e9cvszaagaemidzvt8a.write, handleincomingintent, jMediaMetadataCompat, jWrite);
    }
}
