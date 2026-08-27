package o;

import com.google.firebase.firestore.remote.FirestoreCallCredentials;
import io.grpc.Status;
import io.grpc.internal.MetadataApplierImpl;
import io.sentry.JsonObjectSerializer;
import io.sentry.SentryClient;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getCacheMapKey extends isValidLogPurchaseInputlambda6 {
    public volatile Status MediaBrowserCompatMediaItem;
    public final /* synthetic */ getMD5_HASH_OF_THE_STRING_NULLannotations RatingCompat;
    public Status RemoteActionCompatParcelizer;
    public final ensureBrazeFieldLength serializer;
    public Status write;
    public final AtomicInteger read = new AtomicInteger(-2147483647);
    public final JsonObjectSerializer IconCompatParcelizer = new JsonObjectSerializer(5, this);

    public static void read(getCacheMapKey getcachemapkey) {
        synchronized (getcachemapkey) {
            if (getcachemapkey.read.get() != 0) {
                return;
            }
            Status status = getcachemapkey.write;
            Status status2 = getcachemapkey.RemoteActionCompatParcelizer;
            getcachemapkey.write = null;
            getcachemapkey.RemoteActionCompatParcelizer = null;
            if (status != null) {
                super.RemoteActionCompatParcelizer(status);
            }
            if (status2 != null) {
                super.serializer(status2);
            }
        }
    }

    @Override // o.isValidLogPurchaseInputlambda6
    public final ensureBrazeFieldLength IconCompatParcelizer() {
        return this.serializer;
    }

    public getCacheMapKey(getMD5_HASH_OF_THE_STRING_NULLannotations getmd5_hash_of_the_string_nullannotations, ensureBrazeFieldLength ensurebrazefieldlength, String str) {
        this.RatingCompat = getmd5_hash_of_the_string_nullannotations;
        TextStreamsKt.serializer(ensurebrazefieldlength, "delegate");
        this.serializer = ensurebrazefieldlength;
    }

    @Override // o.isValidLogPurchaseInputlambda6, o.accesssetCustomHandlercp
    public final void RemoteActionCompatParcelizer(Status status) {
        TextStreamsKt.serializer(status, "status");
        synchronized (this) {
            if (this.read.get() < 0) {
                this.MediaBrowserCompatMediaItem = status;
                this.read.addAndGet(Integer.MAX_VALUE);
                if (this.read.get() != 0) {
                    this.write = status;
                } else {
                    super.RemoteActionCompatParcelizer(status);
                }
            }
        }
    }

    @Override // o.isValidLogPurchaseInputlambda6, o.accesssetCustomHandlercp
    public final void serializer(Status status) {
        TextStreamsKt.serializer(status, "status");
        synchronized (this) {
            if (this.read.get() < 0) {
                this.MediaBrowserCompatMediaItem = status;
                this.read.addAndGet(Integer.MAX_VALUE);
            } else if (this.RemoteActionCompatParcelizer != null) {
                return;
            }
            if (this.read.get() != 0) {
                this.RemoteActionCompatParcelizer = status;
            } else {
                super.serializer(status);
            }
        }
    }

    @Override // o.r8lambdaHMza2HwvD2qpEDNMeHrXqzjzano
    public final r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 IconCompatParcelizer(SentryClient sentryClient, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergeJsonObjectslambda10 mergejsonobjectslambda10, JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr) {
        FirestoreCallCredentials firestoreCallCredentials = mergejsonobjectslambda10.IconCompatParcelizer;
        if (firestoreCallCredentials == null) {
            firestoreCallCredentials = null;
        }
        if (firestoreCallCredentials == null) {
            return this.read.get() >= 0 ? new isValidPushStoryClickInput(this.MediaBrowserCompatMediaItem, jsonUtilsExternalSyntheticLambda1Arr) : this.serializer.IconCompatParcelizer(sentryClient, r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergejsonobjectslambda10, jsonUtilsExternalSyntheticLambda1Arr);
        }
        MetadataApplierImpl metadataApplierImpl = new MetadataApplierImpl(this.serializer, sentryClient, r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergejsonobjectslambda10, this.IconCompatParcelizer, jsonUtilsExternalSyntheticLambda1Arr);
        if (this.read.incrementAndGet() > 0) {
            getCacheMapKey getcachemapkey = (getCacheMapKey) this.IconCompatParcelizer.jsonReflectionObjectSerializer;
            if (getcachemapkey.read.decrementAndGet() == 0) {
                read(getcachemapkey);
            }
            return new isValidPushStoryClickInput(this.MediaBrowserCompatMediaItem, jsonUtilsExternalSyntheticLambda1Arr);
        }
        try {
            firestoreCallCredentials.IconCompatParcelizer(new getSUFFIX_CACHE_USER_ID_KEYannotations(), this.RatingCompat.serializer, metadataApplierImpl);
        } catch (Throwable th) {
            metadataApplierImpl.serializer(Status.PlaybackStateCompatCustomAction.IconCompatParcelizer("Credentials should use fail() instead of throwing exceptions").RemoteActionCompatParcelizer(th));
        }
        return metadataApplierImpl.read();
    }
}
