package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import com.google.firebase.firestore.FirebaseFirestore;

/* JADX INFO: loaded from: classes2.dex */
public final class headToTailui {
    public final visitNodes IconCompatParcelizer;
    public final FirebaseFirestore RemoteActionCompatParcelizer;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + (this.IconCompatParcelizer.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    public final PreviewView$1$$ExternalSyntheticLambda2 serializer(checkActivityStateI checkactivitystatei) {
        PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2;
        syncCoordinators synccoordinators = syncCoordinators.EXCLUDE;
        accessgetParentLayoutDirection accessgetparentlayoutdirection = onLayoutNodeDeactivated.write;
        onPreAttach.serializer(accessgetparentlayoutdirection, "Provided executor must not be null.");
        onPreAttach.serializer(synccoordinators, "Provided MetadataChanges value must not be null.");
        updateFromui updatefromui = updateFromui.DEFAULT;
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = new setSupportCompoundDrawablesTintList(0);
        setsupportcompounddrawablestintlist.write = updatefromui;
        setsupportcompounddrawablestintlist.IconCompatParcelizer = isUpdatingui.NONE;
        syncCoordinators synccoordinators2 = syncCoordinators.INCLUDE;
        int i = 1;
        setsupportcompounddrawablestintlist.serializer = synccoordinators == synccoordinators2;
        setsupportcompounddrawablestintlist.RemoteActionCompatParcelizer = synccoordinators == synccoordinators2;
        setsupportcompounddrawablestintlist.write = updatefromui;
        setNode setnode = new setNode(accessgetparentlayoutdirection, new headToTailaLcG6gQui(this, checkactivitystatei));
        accessgetPointerInputSourcecp accessgetpointerinputsourcecpIconCompatParcelizer = accessgetPointerInputSourcecp.IconCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer);
        com.huawei.wisesecurity.ucs_credential.x xVar = this.RemoteActionCompatParcelizer.serializer;
        synchronized (xVar) {
            xVar.write();
            accessupdateUnsafe accessupdateunsafe = (accessupdateUnsafe) xVar.RemoteActionCompatParcelizer;
            ancestorToLocal ancestortolocal = new ancestorToLocal(accessgetpointerinputsourcecpIconCompatParcelizer);
            synchronized (accessupdateunsafe.serializer.RemoteActionCompatParcelizer) {
            }
            accesssetDrawBlockCanvasp accesssetdrawblockcanvasp = new accesssetDrawBlockCanvasp(ancestortolocal, setsupportcompounddrawablestintlist, setnode);
            accessupdateunsafe.serializer.RemoteActionCompatParcelizer(new NodeChainKtfillVector1(accessupdateunsafe, accesssetdrawblockcanvasp, i));
            previewView$1$$ExternalSyntheticLambda2 = new PreviewView$1$$ExternalSyntheticLambda2(setnode, accessupdateunsafe, accesssetdrawblockcanvasp, 11);
        }
        return previewView$1$$ExternalSyntheticLambda2;
    }

    public headToTailui(visitNodes visitnodes, FirebaseFirestore firebaseFirestore) {
        this.IconCompatParcelizer = visitnodes;
        firebaseFirestore.getClass();
        this.RemoteActionCompatParcelizer = firebaseFirestore;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof headToTailui)) {
            return false;
        }
        headToTailui headtotailui = (headToTailui) obj;
        return this.IconCompatParcelizer.equals(headtotailui.IconCompatParcelizer) && this.RemoteActionCompatParcelizer.equals(headtotailui.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return "DocumentReference{key=" + this.IconCompatParcelizer + ", firestore=" + this.RemoteActionCompatParcelizer + '}';
    }
}
