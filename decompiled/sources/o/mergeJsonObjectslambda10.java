package o;

import com.google.firebase.firestore.remote.FirestoreCallCredentials;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import io.grpc.CallOptions$Builder;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class mergeJsonObjectslambda10 {
    public static final mergeJsonObjectslambda10 RemoteActionCompatParcelizer;
    public final FirestoreCallCredentials IconCompatParcelizer;
    public final Integer MediaBrowserCompatMediaItem;
    public final List MediaDescriptionCompat;
    public final Integer MediaMetadataCompat;
    public final Boolean RatingCompat;
    public final Object[][] read;
    public final r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY serializer;
    public final Executor write;

    static {
        CallOptions$Builder callOptions$Builder = new CallOptions$Builder();
        callOptions$Builder.write = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        callOptions$Builder.MediaMetadataCompat = Collections.EMPTY_LIST;
        RemoteActionCompatParcelizer = new mergeJsonObjectslambda10(callOptions$Builder);
    }

    public static CallOptions$Builder RemoteActionCompatParcelizer(mergeJsonObjectslambda10 mergejsonobjectslambda10) {
        CallOptions$Builder callOptions$Builder = new CallOptions$Builder();
        callOptions$Builder.serializer = mergejsonobjectslambda10.serializer;
        callOptions$Builder.RemoteActionCompatParcelizer = mergejsonobjectslambda10.write;
        callOptions$Builder.read = mergejsonobjectslambda10.IconCompatParcelizer;
        callOptions$Builder.write = mergejsonobjectslambda10.read;
        callOptions$Builder.MediaMetadataCompat = mergejsonobjectslambda10.MediaDescriptionCompat;
        callOptions$Builder.RatingCompat = mergejsonobjectslambda10.RatingCompat;
        callOptions$Builder.IconCompatParcelizer = mergejsonobjectslambda10.MediaMetadataCompat;
        callOptions$Builder.MediaSessionCompatQueueItem = mergejsonobjectslambda10.MediaBrowserCompatMediaItem;
        return callOptions$Builder;
    }

    public final mergeJsonObjectslambda10 IconCompatParcelizer(mergeJsonObjectslambda00 mergejsonobjectslambda00, Object obj) {
        Object[][] objArr;
        TextStreamsKt.serializer(mergejsonobjectslambda00, "key");
        TextStreamsKt.serializer(obj, "value");
        CallOptions$Builder callOptions$BuilderRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this);
        int i = 0;
        while (true) {
            objArr = this.read;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (mergejsonobjectslambda00 == objArr[i][0]) {
                break;
            }
            i++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i == -1 ? 1 : 0), 2);
        callOptions$BuilderRemoteActionCompatParcelizer.write = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        Object[][] objArr3 = (Object[][]) callOptions$BuilderRemoteActionCompatParcelizer.write;
        if (i == -1) {
            objArr3[objArr.length] = new Object[]{mergejsonobjectslambda00, obj};
        } else {
            objArr3[i] = new Object[]{mergejsonobjectslambda00, obj};
        }
        return new mergeJsonObjectslambda10(callOptions$BuilderRemoteActionCompatParcelizer);
    }

    public final Object serializer(mergeJsonObjectslambda00 mergejsonobjectslambda00) {
        TextStreamsKt.serializer(mergejsonobjectslambda00, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.read;
            if (i >= objArr.length) {
                return null;
            }
            Object[] objArr2 = objArr[i];
            if (mergejsonobjectslambda00 == objArr2[0]) {
                return objArr2[1];
            }
            i++;
        }
    }

    public mergeJsonObjectslambda10(CallOptions$Builder callOptions$Builder) {
        this.serializer = (r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY) callOptions$Builder.serializer;
        this.write = (Executor) callOptions$Builder.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = (FirestoreCallCredentials) callOptions$Builder.read;
        this.read = (Object[][]) callOptions$Builder.write;
        this.MediaDescriptionCompat = (List) callOptions$Builder.MediaMetadataCompat;
        this.RatingCompat = (Boolean) callOptions$Builder.RatingCompat;
        this.MediaMetadataCompat = (Integer) callOptions$Builder.IconCompatParcelizer;
        this.MediaBrowserCompatMediaItem = (Integer) callOptions$Builder.MediaSessionCompatQueueItem;
    }

    public final String toString() {
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.serializer, "deadline");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((Object) null, "authority");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.IconCompatParcelizer, "callCredentials");
        Executor executor = this.write;
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(executor != null ? executor.getClass() : null, "executor");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((Object) null, "compressorName");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((Object) Arrays.deepToString(this.read), "customOptions");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer("waitForReady", Boolean.TRUE.equals(this.RatingCompat));
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.MediaMetadataCompat, "maxInboundMessageSize");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, "maxOutboundMessageSize");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.MediaDescriptionCompat, "streamTracerFactories");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }
}
