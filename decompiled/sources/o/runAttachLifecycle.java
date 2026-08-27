package o;

import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirestoreMultiDbComponent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class runAttachLifecycle {
    public static final FirebaseFirestore write() {
        FirebaseFirestore firebaseFirestoreIconCompatParcelizer;
        FirestoreMultiDbComponent firestoreMultiDbComponent = (FirestoreMultiDbComponent) FirebaseApp.write().write(FirestoreMultiDbComponent.class);
        onPreAttach.serializer(firestoreMultiDbComponent, "Firestore component is not present.");
        synchronized (firestoreMultiDbComponent) {
            firebaseFirestoreIconCompatParcelizer = (FirebaseFirestore) firestoreMultiDbComponent.serializer.get("(default)");
            if (firebaseFirestoreIconCompatParcelizer == null) {
                firebaseFirestoreIconCompatParcelizer = FirebaseFirestore.IconCompatParcelizer(firestoreMultiDbComponent.write, firestoreMultiDbComponent.RemoteActionCompatParcelizer, firestoreMultiDbComponent.read, firestoreMultiDbComponent.IconCompatParcelizer, firestoreMultiDbComponent.MediaSessionCompatQueueItem);
                firestoreMultiDbComponent.serializer.put("(default)", firebaseFirestoreIconCompatParcelizer);
            }
        }
        return firebaseFirestoreIconCompatParcelizer;
    }
}
