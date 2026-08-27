package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.measurement.internal.zzpg;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getOnGloballyPositioned extends registerOnGlobalLayoutListener {
    public boolean ComponentActivity;

    public abstract void read();

    public getOnGloballyPositioned(zzpg zzpgVar) {
        super(zzpgVar);
        this.MediaSessionCompatToken.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28++;
    }

    public final void r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
        if (this.ComponentActivity) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't initialize twice");
            return;
        }
        read();
        this.MediaSessionCompatToken.accessensureViewModelStore++;
        this.ComponentActivity = true;
    }

    public final void ComponentActivity() {
        if (this.ComponentActivity) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Not initialized");
    }
}
