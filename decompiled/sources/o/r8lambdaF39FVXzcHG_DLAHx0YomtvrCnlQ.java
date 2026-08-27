package o;

import com.roadrunner.settings.SettingsFragment;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaF39FVXzcHG_DLAHx0YomtvrCnlQ extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ SettingsFragment write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8lambdaF39FVXzcHG_DLAHx0YomtvrCnlQ(SettingsFragment settingsFragment, int i) {
        super(0);
        this.IconCompatParcelizer = i;
        this.write = settingsFragment;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 85;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        SettingsFragment settingsFragment = this.write;
        int i4 = i2 + 3;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return settingsFragment;
        }
        obj.hashCode();
        throw null;
    }
}
