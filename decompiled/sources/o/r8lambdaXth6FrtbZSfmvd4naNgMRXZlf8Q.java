package o;

import io.grpc.Status;
import java.io.EOFException;
import java.nio.charset.Charset;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaXth6FrtbZSfmvd4naNgMRXZlf8Q {
    public static final constructObjectQuietlylambda0 IconCompatParcelizer = requestPushPermissionPrompt.RemoteActionCompatParcelizer(":status", new WebContentUtils(13));
    public boolean ComponentActivity;
    public boolean MediaBrowserCompatMediaItem;
    public r8lambda6LGSESzBuanebUADYycWZpXP5Kw MediaDescriptionCompat;
    public Charset MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public volatile boolean MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public final Object PlaybackStateCompat = new Object();
    public final createUriActionFromUrlStringlambda1 PlaybackStateCompatCustomAction;
    public r8lambdapbG_fqEcit8CH1waoNmDxLhROlU RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public final r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 ResultReceiver;
    public r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public Status r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final logPurchaseWithJSONlambda0 r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs read;
    public createUriActionFromUrlStringlambda1 serializer;
    public boolean write;

    public abstract void write(int i);

    public abstract void write(boolean z);

    public static Status RemoteActionCompatParcelizer(r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        char cCharAt;
        Integer num = (Integer) r8lambdaqn1du6uas6agx4srbugfttxtpwa.read(IconCompatParcelizer);
        if (num == null) {
            return Status.write.IconCompatParcelizer("Missing HTTP status code");
        }
        String str = (String) r8lambdaqn1du6uas6agx4srbugfttxtpwa.read(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.RemoteActionCompatParcelizer);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(java.util.Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.RemoteActionCompatParcelizer(num.intValue()).read("invalid content-type: " + str);
    }

    public static Charset write(r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        String str = (String) r8lambdaqn1du6uas6agx4srbugfttxtpwa.read(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.RemoteActionCompatParcelizer);
        if (str != null) {
            String[] strArrSplit = str.split("charset=", 2);
            try {
                return Charset.forName(strArrSplit[strArrSplit.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return visitSelfAndChildrenYYKmhodefault.write;
    }

    public final void IconCompatParcelizer(r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) throws EOFException {
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks = r8lambdakcTilwmporjFCAWe8ASdQv1Ks.IconCompatParcelizer;
        TextStreamsKt.RemoteActionCompatParcelizer("Received headers on closed stream", !this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 : this.ResultReceiver.write) {
            jsonUtilsExternalSyntheticLambda1.MediaMetadataCompat();
        }
        String str = (String) r8lambdaqn1du6uas6agx4srbugfttxtpwa.read(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.MediaMetadataCompat);
        if (str != null) {
            PermissionUtils permissionUtils = (PermissionUtils) this.read.serializer.get(str);
            r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks2 = permissionUtils != null ? permissionUtils.write : null;
            if (r8lambdakctilwmporjfcawe8asdqv1ks2 == null) {
                ((r8lambdakEPpEUfTPwAZBc7DrHg_Qad0Y4) this).write(Status.write.IconCompatParcelizer("Can't find decompressor for ".concat(str)).RemoteActionCompatParcelizer());
                return;
            } else if (r8lambdakctilwmporjfcawe8asdqv1ks2 != r8lambdakctilwmporjfcawe8asdqv1ks) {
                createUriActionFromUrlStringlambda1 createuriactionfromurlstringlambda1 = this.serializer;
                createuriactionfromurlstringlambda1.getClass();
                TextStreamsKt.RemoteActionCompatParcelizer("Already set full stream decompressor", true);
                createuriactionfromurlstringlambda1.write = r8lambdakctilwmporjfcawe8asdqv1ks2;
            }
        }
        this.MediaDescriptionCompat.write(r8lambdaqn1du6uas6agx4srbugfttxtpwa);
    }

    public final boolean read() {
        boolean z;
        synchronized (this.PlaybackStateCompat) {
            z = this.write && this.ParcelableVolumeInfo < 32768 && !this.RemoteActionCompatParcelizer;
        }
        return z;
    }

    public final void write(Status status, r8lambdacIxdbs1VMz7DJpiM5hikhHgartg r8lambdacixdbs1vmz7djpim5hikhhgartg, boolean z, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        TextStreamsKt.serializer(status, "status");
        if (!this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus || z) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = true;
            this.ComponentActivity = status.IconCompatParcelizer();
            synchronized (this.PlaybackStateCompat) {
                this.RemoteActionCompatParcelizer = true;
            }
            if (this.MediaSessionCompatQueueItem) {
                this.RatingCompat = null;
                RemoteActionCompatParcelizer(status, r8lambdacixdbs1vmz7djpim5hikhhgartg, r8lambdaqn1du6uas6agx4srbugfttxtpwa);
                return;
            }
            this.RatingCompat = new r8lambdapbG_fqEcit8CH1waoNmDxLhROlU(this, status, r8lambdacixdbs1vmz7djpim5hikhhgartg, r8lambdaqn1du6uas6agx4srbugfttxtpwa, 2);
            createUriActionFromUrlStringlambda1 createuriactionfromurlstringlambda1 = this.serializer;
            if (z) {
                createuriactionfromurlstringlambda1.close();
            } else {
                if (createuriactionfromurlstringlambda1.write()) {
                    return;
                }
                if (createuriactionfromurlstringlambda1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaMetadataCompat == 0) {
                    createuriactionfromurlstringlambda1.close();
                } else {
                    createuriactionfromurlstringlambda1.IconCompatParcelizer = true;
                }
            }
        }
    }

    public r8lambdaXth6FrtbZSfmvd4naNgMRXZlf8Q(int i, r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 r8lambdamwysina6epuugeuvjtl8aepfjn0, logPurchaseWithJSONlambda0 logpurchasewithjsonlambda0) {
        TextStreamsKt.serializer(logpurchasewithjsonlambda0, "transportTracer");
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = logpurchasewithjsonlambda0;
        createUriActionFromUrlStringlambda1 createuriactionfromurlstringlambda1 = new createUriActionFromUrlStringlambda1(this, i, r8lambdamwysina6epuugeuvjtl8aepfjn0, logpurchasewithjsonlambda0);
        this.PlaybackStateCompatCustomAction = createuriactionfromurlstringlambda1;
        this.serializer = createuriactionfromurlstringlambda1;
        this.read = r8lambda5t3L_1jnTLBJtf0fR47kG54a0bs.write;
        this.MediaSessionCompatQueueItem = false;
        this.ResultReceiver = r8lambdamwysina6epuugeuvjtl8aepfjn0;
    }

    public final void RemoteActionCompatParcelizer(Status status, r8lambdacIxdbs1VMz7DJpiM5hikhHgartg r8lambdacixdbs1vmz7djpim5hikhhgartg, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        if (this.MediaSessionCompatResultReceiverWrapper) {
            return;
        }
        this.MediaSessionCompatResultReceiverWrapper = true;
        r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 r8lambdamwysina6epuugeuvjtl8aepfjn0 = this.ResultReceiver;
        if (r8lambdamwysina6epuugeuvjtl8aepfjn0.RemoteActionCompatParcelizer.compareAndSet(false, true)) {
            for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 : r8lambdamwysina6epuugeuvjtl8aepfjn0.write) {
                jsonUtilsExternalSyntheticLambda1.serializer(status);
            }
        }
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 != null) {
            status.IconCompatParcelizer();
        }
        this.MediaDescriptionCompat.serializer(status, r8lambdacixdbs1vmz7djpim5hikhhgartg, r8lambdaqn1du6uas6agx4srbugfttxtpwa);
    }

    public final void RemoteActionCompatParcelizer(Status status, boolean z, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        write(status, r8lambdacIxdbs1VMz7DJpiM5hikhHgartg.PROCESSED, z, r8lambdaqn1du6uas6agx4srbugfttxtpwa);
    }
}
