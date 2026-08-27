package o;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class AndroidAccessibilityManager implements OnSuccessListener {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ FirebaseMessaging write;

    public /* synthetic */ AndroidAccessibilityManager(FirebaseMessaging firebaseMessaging, int i) {
        this.serializer = i;
        this.write = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) throws IOException {
        int i = this.serializer;
        FirebaseMessaging firebaseMessaging = this.write;
        if (i != 0) {
            firebaseMessaging.lambda$new$3((r8lambdaGBNkvgSHmmv9lTp9Y9dUExj6Ic) obj);
        } else {
            firebaseMessaging.lambda$handleProxiedNotificationData$5((CloudMessage) obj);
        }
    }
}
