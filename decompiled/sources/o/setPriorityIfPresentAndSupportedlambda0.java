package o;

import java.util.ArrayList;
import java.util.List;
import o.r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k;

/* JADX INFO: loaded from: classes3.dex */
abstract class setPriorityIfPresentAndSupportedlambda0<T extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> implements setSoundIfPresentAndSupportedlambda0<T> {
    final /* synthetic */ setDeleteIntentlambda0 read;

    public abstract List<logBaiduNotificationClicklambda1> IconCompatParcelizer(getLongitudeannotations<T> getlongitudeannotations);

    @Override // o.setSoundIfPresentAndSupportedlambda0
    public final List<logBaiduNotificationClicklambda1> RemoteActionCompatParcelizer(getLongitudeannotations<T> getlongitudeannotations) {
        ArrayList arrayList = new ArrayList();
        setDeleteIntentlambda0 setdeleteintentlambda0 = this.read;
        Class cls = ((setLargeIconIfPresentAndSupportedlambda4) setdeleteintentlambda0.RatingCompat.read()).write;
        if (cls == setShouldPersistWebView.class || cls == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
            arrayList.addAll(setdeleteintentlambda0.RemoteActionCompatParcelizer(getlongitudeannotations.write(), false));
        } else {
            setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("No need to chunk the trip. Current state is not moving.", new Object[0]);
        }
        arrayList.addAll(IconCompatParcelizer(getlongitudeannotations));
        return arrayList;
    }

    public setPriorityIfPresentAndSupportedlambda0(setDeleteIntentlambda0 setdeleteintentlambda0) {
        this.read = setdeleteintentlambda0;
    }
}
