package o;

import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetF12cp implements accessgetButton15cp {
    public final accessgetEightcp IconCompatParcelizer;
    public final accessgetF2cp serializer;
    public final Set write;

    public final accessgetF3cp read(String str, accessgetButton10cp accessgetbutton10cp, accessgetBrightnessDowncp accessgetbrightnessdowncp) {
        Set set = this.write;
        if (set.contains(accessgetbutton10cp)) {
            return new accessgetF3cp(this.IconCompatParcelizer, str, accessgetbutton10cp, accessgetbrightnessdowncp, this.serializer);
        }
        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{accessgetbutton10cp, set});
        return null;
    }

    public accessgetF12cp(Set set, accessgetEightcp accessgeteightcp, accessgetF2cp accessgetf2cp) {
        this.write = set;
        this.IconCompatParcelizer = accessgeteightcp;
        this.serializer = accessgetf2cp;
    }
}
