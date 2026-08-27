package o;

import io.grpc.internal.DelayedStream$3;
import io.sentry.MovePreviousSession;
import io.sentry.SentryClient;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release extends parseJsonObjectIntoBundlelambda0 {
    public final String serializer;
    public final /* synthetic */ hasTooManyZipEntrieslambda0 write;
    public final AtomicReference read = new AtomicReference(hasTooManyZipEntrieslambda0.IconCompatParcelizer);
    public final getMaxUnpackedZipSizeBytesandroid_sdk_base_release IconCompatParcelizer = new getMaxUnpackedZipSizeBytesandroid_sdk_base_release(this);

    @Override // o.parseJsonObjectIntoBundlelambda0
    public final String write() {
        return this.serializer;
    }

    public final JsonUtilsa RemoteActionCompatParcelizer(SentryClient sentryClient, mergeJsonObjectslambda10 mergejsonobjectslambda10) {
        hasPermission haspermission = (hasPermission) this.read.get();
        getMaxUnpackedZipSizeBytesandroid_sdk_base_release getmaxunpackedzipsizebytesandroid_sdk_base_release = this.IconCompatParcelizer;
        if (haspermission == null) {
            return getmaxunpackedzipsizebytesandroid_sdk_base_release.read(sentryClient, mergejsonobjectslambda10);
        }
        if (!(haspermission instanceof r8lambdaaazLeu0WqITEICKjR9VLnZVO444)) {
            return new unpackZipEntry(haspermission, getmaxunpackedzipsizebytesandroid_sdk_base_release, this.write.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, sentryClient, mergejsonobjectslambda10);
        }
        r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8 r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8 = ((r8lambdaaazLeu0WqITEICKjR9VLnZVO444) haspermission).serializer;
        iExternalSyntheticLambda0 iexternalsyntheticlambda0 = (iExternalSyntheticLambda0) r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8.MediaMetadataCompat.get((String) sentryClient.MediaBrowserCompatMediaItem);
        if (iexternalsyntheticlambda0 == null) {
            iexternalsyntheticlambda0 = (iExternalSyntheticLambda0) r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8.read.get((String) sentryClient.MediaDescriptionCompat);
        }
        if (iexternalsyntheticlambda0 == null) {
            iexternalsyntheticlambda0 = r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8.serializer;
        }
        if (iexternalsyntheticlambda0 != null) {
            mergejsonobjectslambda10 = mergejsonobjectslambda10.IconCompatParcelizer(iExternalSyntheticLambda0.IconCompatParcelizer, iexternalsyntheticlambda0);
        }
        return getmaxunpackedzipsizebytesandroid_sdk_base_release.read(sentryClient, mergejsonobjectslambda10);
    }

    @Override // o.parseJsonObjectIntoBundlelambda0
    public final JsonUtilsa read(SentryClient sentryClient, mergeJsonObjectslambda10 mergejsonobjectslambda10) {
        hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = this.write;
        getMethodQuietlylambda1 getmethodquietlylambda1 = hastoomanyzipentrieslambda0.addOnNewIntentListener;
        AtomicReference atomicReference = this.read;
        Object obj = atomicReference.get();
        getMaxUnpackedZipSizeBytesandroid_sdk_base_releaseannotations getmaxunpackedzipsizebytesandroid_sdk_base_releaseannotations = hasTooManyZipEntrieslambda0.IconCompatParcelizer;
        if (obj != getmaxunpackedzipsizebytesandroid_sdk_base_releaseannotations) {
            return RemoteActionCompatParcelizer(sentryClient, mergejsonobjectslambda10);
        }
        getmethodquietlylambda1.execute(new MovePreviousSession(17, this));
        if (atomicReference.get() != getmaxunpackedzipsizebytesandroid_sdk_base_releaseannotations) {
            return RemoteActionCompatParcelizer(sentryClient, mergejsonobjectslambda10);
        }
        if (hastoomanyzipentrieslambda0.addContentView.get()) {
            return new getMaxUnpackedZipEntryCountandroid_sdk_base_release();
        }
        WebContentUtilsExternalSyntheticLambda9 webContentUtilsExternalSyntheticLambda9 = new WebContentUtilsExternalSyntheticLambda9(this, setResourcePackageName.read(), sentryClient, mergejsonobjectslambda10);
        getmethodquietlylambda1.execute(new DelayedStream$3(this, 9, webContentUtilsExternalSyntheticLambda9));
        return webContentUtilsExternalSyntheticLambda9;
    }

    public final void serializer(hasPermission haspermission) {
        LinkedHashSet linkedHashSet;
        AtomicReference atomicReference = this.read;
        hasPermission haspermission2 = (hasPermission) atomicReference.get();
        atomicReference.set(haspermission);
        if (haspermission2 != hasTooManyZipEntrieslambda0.IconCompatParcelizer || (linkedHashSet = this.write.menuHostHelperlambda0) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((WebContentUtilsExternalSyntheticLambda9) it.next()).serializer();
        }
    }

    public getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release(hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0, String str) {
        this.write = hastoomanyzipentrieslambda0;
        TextStreamsKt.serializer(str, "authority");
        this.serializer = str;
    }
}
