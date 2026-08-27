package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class animateElevation implements TooltipDefaults {
    public final String IconCompatParcelizer;
    public final int serializer;
    public final PopulateViewStructure_androidKtpopulate7 write = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(setRight.IconCompatParcelizer);
    public final PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(Boolean.TRUE);

    public final int hashCode() {
        return this.serializer;
    }

    public final setRight RemoteActionCompatParcelizer() {
        return (setRight) this.write.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer);
        sb.append('(');
        sb.append(RemoteActionCompatParcelizer().RemoteActionCompatParcelizer);
        sb.append(", ");
        sb.append(RemoteActionCompatParcelizer().write);
        sb.append(", ");
        sb.append(RemoteActionCompatParcelizer().read);
        sb.append(", ");
        return af$$ExternalSyntheticOutline0.m(sb, RemoteActionCompatParcelizer().serializer, ')');
    }

    public animateElevation(int i, String str) {
        this.serializer = i;
        this.IconCompatParcelizer = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof animateElevation) {
            return this.serializer == ((animateElevation) obj).serializer;
        }
        return false;
    }

    @Override // o.TooltipDefaults
    public final int RemoteActionCompatParcelizer(androidx.compose.ui.unit.Density density) {
        return RemoteActionCompatParcelizer().write;
    }

    @Override // o.TooltipDefaults
    public final int RemoteActionCompatParcelizer(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return RemoteActionCompatParcelizer().read;
    }

    @Override // o.TooltipDefaults
    public final int read(androidx.compose.ui.unit.Density density) {
        return RemoteActionCompatParcelizer().serializer;
    }

    @Override // o.TooltipDefaults
    public final int read(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return RemoteActionCompatParcelizer().RemoteActionCompatParcelizer;
    }

    public final void read(boolean z) {
        ((onShowTranslationui) this.RemoteActionCompatParcelizer).setValue(Boolean.valueOf(z));
    }

    public final void read(FocusRequesterModifierKt focusRequesterModifierKt, int i) {
        int i2 = this.serializer;
        if (i == 0 || (i & i2) != 0) {
            ((onShowTranslationui) this.write).setValue(focusRequesterModifierKt.IconCompatParcelizer.getInsets(i2));
            read(focusRequesterModifierKt.IconCompatParcelizer.isVisible(i2));
        }
    }
}
