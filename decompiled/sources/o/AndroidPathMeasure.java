package o;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@calculateSize(RemoteActionCompatParcelizer = "composable")
public final class AndroidPathMeasure extends toAndroidPathDashPathEffectStyleoQv6xUo {
    public final PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final void RemoteActionCompatParcelizer(List list, transform58bKbWc transform58bkbwc) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            serializer().MediaBrowserCompatMediaItem((cubicTo) it.next());
        }
        ((onShowTranslationui) this.IconCompatParcelizer).setValue(Boolean.FALSE);
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final opN5in7k0 write() {
        return new getPositiontuRUvjQ(this, AndroidPathIteratorWhenMappings.RemoteActionCompatParcelizer);
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final void write(cubicTo cubicto, boolean z) {
        serializer().write(cubicto, z);
        ((onShowTranslationui) this.IconCompatParcelizer).setValue(Boolean.TRUE);
    }
}
