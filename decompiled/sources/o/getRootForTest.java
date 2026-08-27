package o;

import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firestore.v1.FirestoreGrpc;
import com.google.firestore.v1.ListenRequest;
import com.google.firestore.v1.ListenResponse;
import io.sentry.SentryClient;

/* JADX INFO: loaded from: classes2.dex */
public final class getRootForTest extends reuseLayer {
    public static final ClipboardExtensions_androidKt PlaybackStateCompatCustomAction = getClipMetadata.serializer;
    public final RemoteSerializer PlaybackStateCompat;

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20491. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // o.reuseLayer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void serializer(com.google.firestore.v1.ListenResponse r33) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRootForTest.serializer(com.google.firestore.v1.ListenResponse):void");
    }

    @Override // o.reuseLayer
    public final void read(Object obj) throws Exception {
        serializer((ListenResponse) obj);
    }

    public getRootForTest(calculateLocalPositionMKHz9U calculatelocalpositionmkhz9u, getTextInputService gettextinputservice, RemoteSerializer remoteSerializer, decrementSensitiveComponentCount decrementsensitivecomponentcount) {
        SentryClient sentryClient = FirestoreGrpc.IconCompatParcelizer;
        if (sentryClient == null) {
            synchronized (FirestoreGrpc.class) {
                sentryClient = FirestoreGrpc.IconCompatParcelizer;
                if (sentryClient == null) {
                    constructObjectQuietlydefault constructobjectquietlydefault = constructObjectQuietlydefault.BIDI_STREAMING;
                    String str = SentryClient.read("google.firestore.v1.Firestore", "Listen");
                    ListenRequest defaultInstance = ListenRequest.getDefaultInstance();
                    getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress = setPushNotificationSubscriptionTypelambda1.RemoteActionCompatParcelizer;
                    sentryClient = new SentryClient(constructobjectquietlydefault, str, new monthFromInt(defaultInstance), new monthFromInt(ListenResponse.getDefaultInstance()), true);
                    FirestoreGrpc.IconCompatParcelizer = sentryClient;
                }
            }
        }
        super(calculatelocalpositionmkhz9u, sentryClient, gettextinputservice, incrementSensitiveComponentCount.LISTEN_STREAM_CONNECTION_BACKOFF, incrementSensitiveComponentCount.LISTEN_STREAM_IDLE, incrementSensitiveComponentCount.HEALTH_CHECK_TIMEOUT, decrementsensitivecomponentcount);
        this.PlaybackStateCompat = remoteSerializer;
    }
}
