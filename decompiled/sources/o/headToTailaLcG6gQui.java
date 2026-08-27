package o;

import com.google.firebase.firestore.FirebaseFirestoreException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class headToTailaLcG6gQui implements resetStateui {
    public final /* synthetic */ headToTailui IconCompatParcelizer;
    public final /* synthetic */ checkActivityStateI RemoteActionCompatParcelizer;

    public /* synthetic */ headToTailaLcG6gQui(headToTailui headtotailui, checkActivityStateI checkactivitystatei) {
        this.IconCompatParcelizer = headtotailui;
        this.RemoteActionCompatParcelizer = checkactivitystatei;
    }

    @Override // o.resetStateui
    public final void serializer(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        headToTailExclusiveui headtotailexclusiveui;
        headToTailui headtotailui = this.IconCompatParcelizer;
        visitNodes visitnodes = headtotailui.IconCompatParcelizer;
        offsetFromEdgeMKHz9U offsetfromedgemkhz9u = (offsetFromEdgeMKHz9U) obj;
        checkActivityStateI checkactivitystatei = this.RemoteActionCompatParcelizer;
        if (firebaseFirestoreException != null) {
            checkactivitystatei.serializer(null, firebaseFirestoreException);
            return;
        }
        getRectManager.RemoteActionCompatParcelizer(offsetfromedgemkhz9u != null, "Got event without value or error set", new Object[0]);
        getRectManager.RemoteActionCompatParcelizer(offsetfromedgemkhz9u.write.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() <= 1, "Too many documents returned on a document query", new Object[0]);
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) offsetfromedgemkhz9u.write.RemoteActionCompatParcelizer.IconCompatParcelizer(visitnodes);
        if (nodeCoordinatorCompanionPointerInputSource1 != null) {
            headtotailexclusiveui = new headToTailExclusiveui(headtotailui.RemoteActionCompatParcelizer, nodeCoordinatorCompanionPointerInputSource1.read, nodeCoordinatorCompanionPointerInputSource1, offsetfromedgemkhz9u.MediaDescriptionCompat, offsetfromedgemkhz9u.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer.serializer(nodeCoordinatorCompanionPointerInputSource1.read));
        } else {
            headtotailexclusiveui = new headToTailExclusiveui(headtotailui.RemoteActionCompatParcelizer, visitnodes, null, offsetfromedgemkhz9u.MediaDescriptionCompat, false);
        }
        checkactivitystatei.serializer(headtotailexclusiveui, null);
    }
}
