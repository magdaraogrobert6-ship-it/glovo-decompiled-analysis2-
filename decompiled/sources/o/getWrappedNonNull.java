package o;

import com.google.android.gms.internal.gtm.zzbv;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class getWrappedNonNull {
    public static final getWrappedNonNull serializer = new getWrappedNonNull();
    public final AtomicReference IconCompatParcelizer = new AtomicReference(new LayoutModifierNodeKt(new zzbv()));

    public final void serializer(setLookaheadConstraints_Sx5XlMui setlookaheadconstraints_sx5xlmui) {
        synchronized (this) {
            zzbv zzbvVar = new zzbv((LayoutModifierNodeKt) this.IconCompatParcelizer.get());
            HashMap map = (HashMap) zzbvVar.RemoteActionCompatParcelizer;
            LayoutModifierNodeCoordinatormeasure1111 layoutModifierNodeCoordinatormeasure1111 = new LayoutModifierNodeCoordinatormeasure1111(setlookaheadconstraints_sx5xlmui.serializer, r8lambdaKSOEf5fDpgM5EyeQgpPOXO8FS0.class);
            if (map.containsKey(layoutModifierNodeCoordinatormeasure1111)) {
                setLookaheadConstraints_Sx5XlMui setlookaheadconstraints_sx5xlmui2 = (setLookaheadConstraints_Sx5XlMui) map.get(layoutModifierNodeCoordinatormeasure1111);
                if (!setlookaheadconstraints_sx5xlmui2.equals(setlookaheadconstraints_sx5xlmui) || setlookaheadconstraints_sx5xlmui != setlookaheadconstraints_sx5xlmui2) {
                    getAlignmentLinesMap.write(layoutModifierNodeCoordinatormeasure1111, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
                }
            } else {
                map.put(layoutModifierNodeCoordinatormeasure1111, setlookaheadconstraints_sx5xlmui);
            }
            this.IconCompatParcelizer.set(new LayoutModifierNodeKt(zzbvVar));
        }
    }
}
