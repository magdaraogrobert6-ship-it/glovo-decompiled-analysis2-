package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleInternal;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "TransportOccupantRoleClassifier")
public final class setBrazeGeofenceReEligibilityManager extends r8lambdaXEYf2Y6iq6qoNF46VmdkEq76k {
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final setMaxNumToRegister serializer;
    private final setUpGeofences write;

    public setBrazeGeofenceReEligibilityManager(setMaxNumToRegister setmaxnumtoregister, setUpGeofences setupgeofences, parseLonglambda0 parselonglambda0) {
        setmaxnumtoregister.getClass();
        setupgeofences.getClass();
        parselonglambda0.getClass();
        this.serializer = setmaxnumtoregister;
        this.write = setupgeofences;
        this.RemoteActionCompatParcelizer = parselonglambda0;
    }

    @Override // o.r8lambdaXEYf2Y6iq6qoNF46VmdkEq76k
    public final r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M RemoteActionCompatParcelizer(TransportChangeType transportChangeType, long j, long j2, ArrayList arrayList) {
        int i;
        transportChangeType.getClass();
        int i2 = BrazeGeofenceManagerExternalSyntheticLambda22.serializer[transportChangeType.ordinal()];
        if (i2 == 1) {
            r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M.write.getClass();
            return new r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M(OccupantRoleInternal.DRIVER, null, null);
        }
        if (i2 != 2) {
            r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M.write.getClass();
            return r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M.serializer;
        }
        Object[] objArr = {Long.valueOf(j), Long.valueOf(j2)};
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        parselonglambda0.IconCompatParcelizer("Detecting occupant role from: %d to: %d", objArr);
        ArrayList arrayList2 = this.serializer.read(j, j2, arrayList);
        int i3 = 0;
        if (arrayList2.isEmpty()) {
            parselonglambda0.IconCompatParcelizer("No phone usage evaluations with speed found, returning unavailable", new Object[0]);
            r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M.write.getClass();
            return r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M.serializer;
        }
        float fWrite = this.write.write().write();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((setMaxNumToRegister.serializer) obj).read()) {
                arrayList3.add(obj);
            }
        }
        double dFloatValue = 0.0d;
        if (arrayList3.isEmpty()) {
            parselonglambda0.IconCompatParcelizer("No phone usage events found, returning driver", new Object[0]);
            r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M.write.getClass();
            return new r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M(OccupantRoleInternal.DRIVER, Double.valueOf(0.0d), Double.valueOf(fWrite));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
        } else {
            Iterator it = arrayList2.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((setMaxNumToRegister.serializer) it.next()).read() && (i = i + 1) < 0) {
                    androidx.sqlite.SQLite.RemoteActionCompatParcelizer();
                    throw null;
                }
            }
        }
        float size = i / arrayList2.size();
        ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Float.valueOf(((setMaxNumToRegister.serializer) it2.next()).write()));
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            dFloatValue += (double) ((Number) it3.next()).floatValue();
            i3++;
            if (i3 < 0) {
                androidx.sqlite.SQLite.RemoteActionCompatParcelizer();
                throw null;
            }
        }
        double d = i3 == 0 ? Double.NaN : dFloatValue / ((double) i3);
        double d2 = 1.0d - (1.0d / ((((double) size) * d) + 1.0d));
        parselonglambda0.IconCompatParcelizer("Phone usage rate: %f, average speed at phone usage: %f, threshold: %f", Float.valueOf(size), Double.valueOf(d), Float.valueOf(fWrite));
        double d3 = fWrite;
        if (d2 > d3) {
            r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M.write.getClass();
            return new r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M(OccupantRoleInternal.PASSENGER, Double.valueOf(d2), Double.valueOf(d3));
        }
        r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M.write.getClass();
        return new r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M(OccupantRoleInternal.DRIVER, Double.valueOf(d2), Double.valueOf(d3));
    }
}
