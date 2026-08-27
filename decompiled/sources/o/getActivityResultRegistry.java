package o;

import com.roadrunner.push.presentation.NotificationDialogKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getActivityResultRegistry implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ boolean write;

    public /* synthetic */ getActivityResultRegistry(boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.write = z;
        this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.serializer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = this.serializer;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.IconCompatParcelizer;
        boolean z = this.write;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i != 0) {
            NotificationDialogKt.RemoteActionCompatParcelizer(z, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1));
            return createfromparcel;
        }
        getDefaultViewModelCreationExtras.IconCompatParcelizer(z, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1));
        return createfromparcel;
    }
}
