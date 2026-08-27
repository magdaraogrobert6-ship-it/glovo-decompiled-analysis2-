package o;

import android.app.Application;
import java.util.concurrent.CancellationException;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes4.dex */
public final class addFeatureKeys implements androidx.lifecycle.DefaultLifecycleObserver {
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ addFeatureKeys(int i, Object obj) {
        this.serializer = i;
        this.read = obj;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = this.serializer;
        accessisrendernodecompatiblecp.getClass();
        if (i == 0) {
            super.onDestroy(accessisrendernodecompatiblecp);
            Scope scope = (Scope) this.read;
            FwFClientbootstrapIfNeeded1 fwFClientbootstrapIfNeeded1 = new FwFClientbootstrapIfNeeded1(0, scope);
            synchronized (scope) {
                fwFClientbootstrapIfNeeded1.invoke();
            }
            return;
        }
        if (i != 1) {
            DragAndDropNodeKtDragAndDropTargetModifierNode1.write((androidx.fragment.app.FragmentActivity) this.read);
            accessisrendernodecompatiblecp.getLifecycle().read(this);
            return;
        }
        getAnimationObject getanimationobject = (getAnimationObject) this.read;
        parseui_tooling parseui_toolingVar = (parseui_tooling) getanimationobject.serializer.write();
        Application application = getanimationobject.IconCompatParcelizer;
        parseui_toolingVar.getClass();
        if (parseui_toolingVar.write != null) {
            application.getApplicationContext().unregisterReceiver(parseui_toolingVar.write);
            parseui_toolingVar.write = null;
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = parseui_toolingVar.IconCompatParcelizer;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        parseui_toolingVar.IconCompatParcelizer = null;
    }
}
