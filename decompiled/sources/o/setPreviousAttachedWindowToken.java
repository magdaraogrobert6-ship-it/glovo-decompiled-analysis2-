package o;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inappmessaging.dagger.internal.InstanceFactory;
import com.google.firebase.inappmessaging.internal.MetricsLoggerClient;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class setPreviousAttachedWindowToken implements forceAccessibilityForTesting {
    public final resolveComposeViewContext IconCompatParcelizer;
    public final InstanceFactory MediaSessionCompatQueueItem;
    public final updateAutoCreatedComposeViewContext RemoteActionCompatParcelizer;
    public final resolveComposeViewContext read;
    public final resolveComposeViewContext serializer;
    public final updateAutoCreatedComposeViewContext write;

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        FirebaseApp firebaseApp = (FirebaseApp) this.RemoteActionCompatParcelizer.serializer.write;
        accessgetButton15cp accessgetbutton15cp = (accessgetButton15cp) this.MediaSessionCompatQueueItem.serializer;
        return new MetricsLoggerClient(new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(29, ((accessgetF12cp) accessgetbutton15cp).read("FIREBASE_INAPPMESSAGING", new accessgetButton10cp("proto"), new Gson$$ExternalSyntheticBUOutline0(17))), (logTree) this.IconCompatParcelizer.write(), firebaseApp, (accesssetInstancecp) this.write.write(), new disposeComposition(), (TraversableNodeCompanion) this.serializer.write(), (Executor) this.read.write());
    }

    public setPreviousAttachedWindowToken(updateAutoCreatedComposeViewContext updateautocreatedcomposeviewcontext, InstanceFactory instanceFactory, resolveComposeViewContext resolvecomposeviewcontext, updateAutoCreatedComposeViewContext updateautocreatedcomposeviewcontext2, resolveParentCompositionContext resolveparentcompositioncontext, resolveComposeViewContext resolvecomposeviewcontext2, resolveComposeViewContext resolvecomposeviewcontext3) {
        this.RemoteActionCompatParcelizer = updateautocreatedcomposeviewcontext;
        this.MediaSessionCompatQueueItem = instanceFactory;
        this.IconCompatParcelizer = resolvecomposeviewcontext;
        this.write = updateautocreatedcomposeviewcontext2;
        this.serializer = resolvecomposeviewcontext2;
        this.read = resolvecomposeviewcontext3;
    }
}
