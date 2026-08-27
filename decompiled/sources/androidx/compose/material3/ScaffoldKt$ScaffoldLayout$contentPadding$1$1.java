package androidx.compose.material3;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import o.PopulateViewStructure_androidKtpopulate7;
import o.onShowTranslationui;

/* JADX INFO: loaded from: classes.dex */
public final class ScaffoldKt$ScaffoldLayout$contentPadding$1$1 implements o.SwitchKt {
    public final PopulateViewStructure_androidKtpopulate7 write;

    @Override // o.SwitchKt
    public final float IconCompatParcelizer() {
        return ((o.SwitchKt) ((onShowTranslationui) this.write).getValue()).IconCompatParcelizer();
    }

    @Override // o.SwitchKt
    public final float RemoteActionCompatParcelizer() {
        return ((o.SwitchKt) ((onShowTranslationui) this.write).getValue()).RemoteActionCompatParcelizer();
    }

    @Override // o.SwitchKt
    public final float read(LayoutDirection layoutDirection) {
        return ((o.SwitchKt) ((onShowTranslationui) this.write).getValue()).read(layoutDirection);
    }

    @Override // o.SwitchKt
    public final float write(LayoutDirection layoutDirection) {
        return ((o.SwitchKt) ((onShowTranslationui) this.write).getValue()).write(layoutDirection);
    }

    public ScaffoldKt$ScaffoldLayout$contentPadding$1$1() {
        float fM3673constructorimpl = Dp.m3673constructorimpl(0.0f);
        this.write = CompositionKt.RemoteActionCompatParcelizer(new o.SwitchDefaults(fM3673constructorimpl, fM3673constructorimpl, fM3673constructorimpl, fM3673constructorimpl));
    }
}
