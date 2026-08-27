package o;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.SharedSessionRepositoryImpl;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r8lambda3H4Tap9xiqWyze7ofwvkGYD5exE {
    public static SharedSessionRepositoryImpl write;

    public static final void IconCompatParcelizer() {
        try {
            if (write == null) {
                SharedSessionRepositoryImpl sharedSessionRepositoryImpl = (SharedSessionRepositoryImpl) ((setPreviousGeneration) ((AndroidComposeViewRootModifierNodeonKeyEventfocusWasMovedOrCancelled2) FirebaseApp.write().write(AndroidComposeViewRootModifierNodeonKeyEventfocusWasMovedOrCancelled2.class))).MediaSessionCompatResultReceiverWrapper.write();
                sharedSessionRepositoryImpl.getClass();
                write = sharedSessionRepositoryImpl;
            }
            SharedSessionRepositoryImpl sharedSessionRepositoryImpl2 = write;
            if (sharedSessionRepositoryImpl2 == null) {
                removeNodeAtDepth.serializer("sharedSessionRepository");
                throw null;
            }
            if (sharedSessionRepositoryImpl2.RemoteActionCompatParcelizer) {
                if (sharedSessionRepositoryImpl2 != null) {
                    sharedSessionRepositoryImpl2.read();
                } else {
                    removeNodeAtDepth.serializer("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }
}
