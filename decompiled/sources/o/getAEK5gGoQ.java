package o;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class getAEK5gGoQ implements IInterface {
    public final IBinder write;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.write;
    }

    public getAEK5gGoQ(IBinder iBinder) {
        this.write = iBinder;
    }
}
