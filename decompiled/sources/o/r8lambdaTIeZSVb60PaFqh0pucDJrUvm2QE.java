package o;

import android.app.PendingIntent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.sentiance.sdk.InjectUsing;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ActivityTransitionAPI")
public class r8lambdaTIeZSVb60PaFqh0pucDJrUvm2QE {
    private final onLocationRequestCompletelambda1 IconCompatParcelizer;
    private final parseLonglambda0 read;
    private final r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc write;

    public r8lambdaTIeZSVb60PaFqh0pucDJrUvm2QE(onLocationRequestCompletelambda1 onlocationrequestcompletelambda1, parseLonglambda0 parselonglambda0, r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc r8lambdaepgoz_b4yaunnacjvuptzhsystc) {
        this.IconCompatParcelizer = onlocationrequestcompletelambda1;
        this.read = parselonglambda0;
        this.write = r8lambdaepgoz_b4yaunnacjvuptzhsystc;
    }

    public static void RemoteActionCompatParcelizer(r8lambdaTIeZSVb60PaFqh0pucDJrUvm2QE r8lambdatiezsvb60pafqh0pucdjruvm2qe, Exception exc) {
        r8lambdatiezsvb60pafqh0pucdjruvm2qe.read.IconCompatParcelizer(false, exc, "Failed to remove Activity Transition Updates", new Object[0]);
    }

    public static void write(r8lambdaTIeZSVb60PaFqh0pucDJrUvm2QE r8lambdatiezsvb60pafqh0pucdjruvm2qe, Exception exc) {
        r8lambdatiezsvb60pafqh0pucdjruvm2qe.read.IconCompatParcelizer(false, exc, "Failed to request Activity Transition Updates", new Object[0]);
    }

    public final void serializer(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        if (IconCompatParcelizer()) {
            this.write.serializer(activityTransitionRequest, pendingIntent).addOnFailureListener(new r8lambdaXjDubkIBzFc9zx4at4JX4kzn1Q(this, 0));
        }
    }

    public final boolean IconCompatParcelizer() {
        return this.write.write() && this.IconCompatParcelizer.serializer();
    }

    public final void serializer(PendingIntent pendingIntent) {
        if (IconCompatParcelizer()) {
            this.write.read(pendingIntent).addOnFailureListener(new r8lambdaXjDubkIBzFc9zx4at4JX4kzn1Q(this, 1));
        }
    }
}
