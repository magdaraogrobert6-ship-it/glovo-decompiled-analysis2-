package o;

import com.sentiance.sdk.InjectUsing;
import java.io.File;
import java.util.List;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(cacheName = "TransportOccupantRoleState", componentName = "TransportOccupantRoleState")
public final class unregisterGeofences extends tearDownGeofences implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final com.sentiance.sdk.util.c read;

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return instance_delegatelambda0.write;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.read.read();
    }

    public unregisterGeofences(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0) {
        cVar.getClass();
        parselonglambda0.getClass();
        this.read = cVar;
        this.RemoteActionCompatParcelizer = parselonglambda0;
    }

    @Override // o.tearDownGeofences
    public final void IconCompatParcelizer(Float f) {
        float fFloatValue = f.floatValue();
        double d = fFloatValue;
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        if (0.0d > d || d > 1.0d) {
            parselonglambda0.IconCompatParcelizer("Incorrect probability value, aborting.", new Object[0]);
            return;
        }
        com.sentiance.sdk.util.c cVar = this.read;
        float f2 = cVar.read(0.4f, "LEARNING_RATE");
        float fWrite = write();
        float f3 = (fFloatValue - fWrite) * f2;
        if (f3 == 0.0f) {
            parselonglambda0.IconCompatParcelizer("Threshold was not updated, delta is 0.", new Object[0]);
            return;
        }
        float fWrite2 = RangesKt.write(f3 + fWrite, 0.0f, 1.0f);
        cVar.IconCompatParcelizer(fWrite2, "USER_THRESHOLD");
        parselonglambda0.IconCompatParcelizer("Threshold was updated from " + populateFocusOrder.read(Float.valueOf(fWrite)) + " to " + populateFocusOrder.read(Float.valueOf(fWrite2)), new Object[0]);
        float f4 = 0.7f * f2;
        cVar.IconCompatParcelizer(f4, "LEARNING_RATE");
        parselonglambda0.IconCompatParcelizer("Learning rate was decayed from " + populateFocusOrder.read(Float.valueOf(f2)) + " to " + populateFocusOrder.read(Float.valueOf(f4)), new Object[0]);
    }

    @Override // o.tearDownGeofences
    public final float write() {
        return this.read.read(0.185f, "USER_THRESHOLD");
    }
}
