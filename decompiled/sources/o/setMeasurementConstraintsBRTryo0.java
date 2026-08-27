package o;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class setMeasurementConstraintsBRTryo0 implements Executor {
    public static volatile setMeasurementConstraintsBRTryo0 RemoteActionCompatParcelizer;
    public static final /* synthetic */ setMeasurementConstraintsBRTryo0 read = new setMeasurementConstraintsBRTryo0(3);
    public static Context write;
    public final /* synthetic */ int serializer;

    public /* synthetic */ setMeasurementConstraintsBRTryo0(int i) {
        this.serializer = i;
    }

    public static setMeasurementConstraintsBRTryo0 IconCompatParcelizer(Context context) {
        setMeasurementConstraintsBRTryo0 setmeasurementconstraintsbrtryo0;
        setMeasurementConstraintsBRTryo0 setmeasurementconstraintsbrtryo1 = RemoteActionCompatParcelizer;
        if (setmeasurementconstraintsbrtryo1 != null) {
            return setmeasurementconstraintsbrtryo1;
        }
        synchronized (setMeasurementConstraintsBRTryo0.class) {
            setmeasurementconstraintsbrtryo0 = RemoteActionCompatParcelizer;
            if (setmeasurementconstraintsbrtryo0 == null) {
                Context applicationContext = context.getApplicationContext();
                accessgetSystemNavigationDowncp.IconCompatParcelizer(applicationContext);
                write = applicationContext;
                setmeasurementconstraintsbrtryo0 = new setMeasurementConstraintsBRTryo0(1);
                RemoteActionCompatParcelizer = setmeasurementconstraintsbrtryo0;
            }
        }
        return setmeasurementconstraintsbrtryo0;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.serializer;
        if (i == 0) {
            runnable.run();
            return;
        }
        if (i == 1) {
            accessgetStemPrimarycp.serializer.post(runnable);
        } else if (i != 2) {
            runnable.run();
        } else {
            new Thread(runnable).start();
        }
    }
}
