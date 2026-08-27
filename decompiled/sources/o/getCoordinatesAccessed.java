package o;

import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import com.roadrunner.home.CreateHomeScope;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getCoordinatesAccessed implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ CreateHomeScope RemoteActionCompatParcelizer;
    public final /* synthetic */ Runnable read;
    public final /* synthetic */ setCoordinatesAccessed write;

    public /* synthetic */ getCoordinatesAccessed(setCoordinatesAccessed setcoordinatesaccessed, Runnable runnable, CreateHomeScope createHomeScope, int i) {
        this.IconCompatParcelizer = i;
        this.write = setcoordinatesaccessed;
        this.read = runnable;
        this.RemoteActionCompatParcelizer = createHomeScope;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        final CreateHomeScope createHomeScope = this.RemoteActionCompatParcelizer;
        final Runnable runnable = this.read;
        setCoordinatesAccessed setcoordinatesaccessed = this.write;
        if (i == 0) {
            final int i2 = 0;
            setcoordinatesaccessed.write.execute(new Runnable() { // from class: o.getPositionOnScreennOccac
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    int i3 = i2;
                    CreateHomeScope createHomeScope2 = createHomeScope;
                    Runnable runnable2 = runnable;
                    if (i3 != 0) {
                        try {
                            runnable2.run();
                            return;
                        } catch (Exception e) {
                            ((accessset_measureResult) createHomeScope2.read).IconCompatParcelizer((Throwable) e);
                            return;
                        }
                    }
                    try {
                        runnable2.run();
                    } catch (Exception e2) {
                        ((accessset_measureResult) createHomeScope2.read).IconCompatParcelizer((Throwable) e2);
                        throw e2;
                    }
                }
            });
            return;
        }
        final int i3 = 1;
        if (i != 1) {
            setcoordinatesaccessed.write.execute(new Runnable() { // from class: o.getPositionOnScreennOccac
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    int i4 = i3;
                    CreateHomeScope createHomeScope2 = createHomeScope;
                    Runnable runnable2 = runnable;
                    if (i4 != 0) {
                        try {
                            runnable2.run();
                            return;
                        } catch (Exception e) {
                            ((accessset_measureResult) createHomeScope2.read).IconCompatParcelizer((Throwable) e);
                            return;
                        }
                    }
                    try {
                        runnable2.run();
                    } catch (Exception e2) {
                        ((accessset_measureResult) createHomeScope2.read).IconCompatParcelizer((Throwable) e2);
                        throw e2;
                    }
                }
            });
        } else {
            setcoordinatesaccessed.write.execute(new ND$$ExternalSyntheticLambda0(runnable, 11, createHomeScope));
        }
    }
}
