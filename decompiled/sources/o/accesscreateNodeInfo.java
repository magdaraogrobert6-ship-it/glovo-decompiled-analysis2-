package o;

import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class accesscreateNodeInfo extends ContinuationImpl {
    public Iterator IconCompatParcelizer;
    public /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ FirebaseSessionsDependencies MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public Object RatingCompat;
    public accessgetCurrentlyAccessibilityFocusedANIp RemoteActionCompatParcelizer;
    public MutexImpl read;
    public Map serializer;
    public Map write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accesscreateNodeInfo(FirebaseSessionsDependencies firebaseSessionsDependencies, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = firebaseSessionsDependencies;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaBrowserCompatMediaItem = obj;
        this.MediaMetadataCompat |= Integer.MIN_VALUE;
        return this.MediaDescriptionCompat.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
    }
}
