package o;

/* JADX INFO: loaded from: classes.dex */
public final class PagerStatescrollToPage2 {
    public final long RemoteActionCompatParcelizer;
    public final SwitchDefaults write;

    public final int hashCode() {
        return this.write.hashCode() + (androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.RemoteActionCompatParcelizer) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(this.RemoteActionCompatParcelizer, ", drawPadding=", sb);
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }

    public PagerStatescrollToPage2() {
        long jColor = androidx.compose.ui.graphics.ColorKt.Color(4284900966L);
        SwitchDefaults switchDefaultsM71PaddingValuesYgX7TsA$default = androidx.compose.foundation.layout.PaddingKt.m71PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3);
        this.RemoteActionCompatParcelizer = jColor;
        this.write = switchDefaultsM71PaddingValuesYgX7TsA$default;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PagerStatescrollToPage2.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        PagerStatescrollToPage2 pagerStatescrollToPage2 = (PagerStatescrollToPage2) obj;
        if (!androidx.compose.ui.graphics.Color.m723equalsimpl0(this.RemoteActionCompatParcelizer, pagerStatescrollToPage2.RemoteActionCompatParcelizer)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, pagerStatescrollToPage2.write}, getCieXyz.write())).booleanValue();
    }
}
