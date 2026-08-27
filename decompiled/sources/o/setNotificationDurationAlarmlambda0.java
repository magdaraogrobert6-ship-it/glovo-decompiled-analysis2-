package o;

import java.util.List;
import o.r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k;

/* JADX INFO: loaded from: classes3.dex */
abstract class setNotificationDurationAlarmlambda0<T extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> implements setSoundIfPresentAndSupportedlambda0<T> {
    final /* synthetic */ setDeleteIntentlambda0 write;

    public abstract List<logBaiduNotificationClicklambda1> IconCompatParcelizer(getLongitudeannotations<T> getlongitudeannotations);

    @Override // o.setSoundIfPresentAndSupportedlambda0
    public final List<logBaiduNotificationClicklambda1> RemoteActionCompatParcelizer(getLongitudeannotations<T> getlongitudeannotations) {
        setDeleteIntentlambda0 setdeleteintentlambda0 = this.write;
        setLargeIconIfPresentAndSupportedlambda4 setlargeiconifpresentandsupportedlambda4 = (setLargeIconIfPresentAndSupportedlambda4) setdeleteintentlambda0.RatingCompat.read();
        setdeleteintentlambda0.RatingCompat.read(new setLargeIconIfPresentAndSupportedlambda4(getlongitudeannotations.read().getClass(), setlargeiconifpresentandsupportedlambda4.serializer));
        return IconCompatParcelizer(getlongitudeannotations);
    }

    public setNotificationDurationAlarmlambda0(setDeleteIntentlambda0 setdeleteintentlambda0) {
        this.write = setdeleteintentlambda0;
    }
}
