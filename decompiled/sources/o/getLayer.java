package o;

import android.database.Cursor;
import android.hardware.camera2.TotalCaptureResult;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.firebase.firestore.local.LocalDocumentsView;
import com.sentiance.core.model.events.I$b;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getLayer implements StopCodecAfterSurfaceRemovalCrashMediaServerQuirk, isCaptured, onRequestMeasure, io.sentry.instrumentation.file.RemoteActionCompatParcelizer {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ getLayer(int i, Object obj) {
        this.IconCompatParcelizer = obj;
        this.write = i;
    }

    @Override // io.sentry.instrumentation.file.RemoteActionCompatParcelizer
    public Object RemoteActionCompatParcelizer() throws IOException {
        io.sentry.instrumentation.file.serializer serializerVar = (io.sentry.instrumentation.file.serializer) this.IconCompatParcelizer;
        serializerVar.RemoteActionCompatParcelizer.write(this.write);
        return 1;
    }

    @Override // o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk
    public DrawModifierNodeKt RemoteActionCompatParcelizer(Object obj) {
        getFixedWidthMajor getfixedwidthmajor = (getFixedWidthMajor) this.IconCompatParcelizer;
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        getfixedwidthmajor.serializer.getClass();
        if (abandonFocus.read(this.write, totalCaptureResult)) {
            getfixedwidthmajor.RatingCompat = 5000000000L;
        }
        return getfixedwidthmajor.write.IconCompatParcelizer(totalCaptureResult);
    }

    @Override // o.isCaptured
    public boolean read(View view) {
        ((SideSheetBehavior) this.IconCompatParcelizer).RemoteActionCompatParcelizer(this.write);
        return true;
    }

    @Override // o.onRequestMeasure
    public Object write() {
        NodeCoordinatorupdateLayerParameters1 nodeCoordinatorupdateLayerParameters1RemoteActionCompatParcelizer;
        I$b i$b = (I$b) this.IconCompatParcelizer;
        androidx.recyclerview.widget.ChildHelper childHelper = (androidx.recyclerview.widget.ChildHelper) i$b.serializer;
        com.huawei.wisesecurity.ucs_credential.x xVar = ((headH91voCI) childHelper.serializer).read("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?");
        String str = (String) childHelper.read;
        int i = this.write;
        xVar.IconCompatParcelizer(1000000, str, Integer.valueOf(i));
        Cursor cursorIconCompatParcelizer = xVar.IconCompatParcelizer();
        try {
            if (cursorIconCompatParcelizer.moveToFirst()) {
                nodeCoordinatorupdateLayerParameters1RemoteActionCompatParcelizer = childHelper.RemoteActionCompatParcelizer(i, cursorIconCompatParcelizer.getBlob(0));
                cursorIconCompatParcelizer.close();
            } else {
                cursorIconCompatParcelizer.close();
                nodeCoordinatorupdateLayerParameters1RemoteActionCompatParcelizer = null;
            }
            getRectManager.RemoteActionCompatParcelizer(nodeCoordinatorupdateLayerParameters1RemoteActionCompatParcelizer != null, "Attempt to reject nonexistent batch!", new Object[0]);
            ((androidx.recyclerview.widget.ChildHelper) i$b.serializer).write(nodeCoordinatorupdateLayerParameters1RemoteActionCompatParcelizer);
            ((androidx.recyclerview.widget.ChildHelper) i$b.serializer).read();
            ((com.huawei.wisesecurity.ucs_credential.x) i$b.write).RemoteActionCompatParcelizer(i);
            LocalDocumentsView localDocumentsView = (LocalDocumentsView) i$b.MediaDescriptionCompat;
            localDocumentsView.write(((LocalDocumentsView) localDocumentsView.read).write(nodeCoordinatorupdateLayerParameters1RemoteActionCompatParcelizer.IconCompatParcelizer()));
            return ((LocalDocumentsView) i$b.MediaDescriptionCompat).serializer(nodeCoordinatorupdateLayerParameters1RemoteActionCompatParcelizer.IconCompatParcelizer());
        } catch (Throwable th) {
            if (cursorIconCompatParcelizer != null) {
                try {
                    cursorIconCompatParcelizer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
