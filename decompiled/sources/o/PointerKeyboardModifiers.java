package o;

import android.content.Context;
import com.huawei.location.logic.zp;

/* JADX INFO: loaded from: classes2.dex */
public final class PointerKeyboardModifiers implements emptyCancelMotionEventScope {
    public final toCancelMotionEventScoped4ec7I RemoteActionCompatParcelizer;
    public final provideRulerValue serializer;
    public final provideRulerValue write;

    @Override // o.emptyCancelMotionEventScope
    public final void serializer(zp zpVar) {
        int i = this.RemoteActionCompatParcelizer.write;
        if (i != 0) {
            ((accessgetF3cp) this.write.write()).read(zpVar.write != 0 ? accessgetBackspacecp.RemoteActionCompatParcelizer(zpVar.read(i)) : new accessgetBackspacecp(zpVar.read(i), accessgetBrowsercp.VERY_LOW, null), new getAlignmentLinesMap(2));
            return;
        }
        provideRulerValue providerulervalue = this.serializer;
        if (providerulervalue != null) {
            ((accessgetF3cp) providerulervalue.write()).read(zpVar.write != 0 ? accessgetBackspacecp.RemoteActionCompatParcelizer(zpVar.read(i)) : new accessgetBackspacecp(zpVar.read(i), accessgetBrowsercp.VERY_LOW, null), new getAlignmentLinesMap(2));
        }
    }

    public PointerKeyboardModifiers(Context context, toCancelMotionEventScoped4ec7I tocancelmotioneventscoped4ec7i) {
        this.RemoteActionCompatParcelizer = tocancelmotioneventscoped4ec7i;
        accessgetButton11cp accessgetbutton11cp = accessgetButton11cp.write;
        accessgetF2cp.RemoteActionCompatParcelizer(context);
        accessgetF12cp accessgetf12cpRemoteActionCompatParcelizer = accessgetF2cp.read().RemoteActionCompatParcelizer(accessgetbutton11cp);
        if (accessgetButton11cp.serializer.contains(new accessgetButton10cp("json"))) {
            this.serializer = new provideRulerValue(new reuseComposition(accessgetf12cpRemoteActionCompatParcelizer, 1));
        }
        this.write = new provideRulerValue(new reuseComposition(accessgetf12cpRemoteActionCompatParcelizer, 2));
    }
}
