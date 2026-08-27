package o;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class getLeftD9Ej5fMannotations {
    public static int serializer;
    public static int write;
    public final transferSessionPackageI RemoteActionCompatParcelizer;

    public getLeftD9Ej5fMannotations(transferSessionPackageI transfersessionpackagei) {
        transfersessionpackagei.getClass();
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
    }

    public static int RemoteActionCompatParcelizer() {
        int i = write;
        int i2 = i % 5340965;
        write = i + 1;
        if (i2 != 0) {
            return serializer;
        }
        int iNextInt = new Random().nextInt();
        serializer = iNextInt;
        return iNextInt;
    }
}
