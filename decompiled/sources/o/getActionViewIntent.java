package o;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class getActionViewIntent extends io.sentry.protocol.IconCompatParcelizer {
    public final io.sentry.protocol.IconCompatParcelizer IconCompatParcelizer;
    public final io.sentry.protocol.IconCompatParcelizer RemoteActionCompatParcelizer;
    public final r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik read;
    public final io.sentry.protocol.IconCompatParcelizer write;

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final void IconCompatParcelizer(io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer) {
        throw null;
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final void IconCompatParcelizer(io.sentry.protocol.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        throw null;
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final boolean write(Object obj) {
        throw null;
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final io.sentry.protocol.read IconCompatParcelizer() {
        io.sentry.protocol.read readVarIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        if (readVarIconCompatParcelizer != null) {
            return readVarIconCompatParcelizer;
        }
        io.sentry.protocol.read readVarIconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer();
        return readVarIconCompatParcelizer2 != null ? readVarIconCompatParcelizer2 : this.write.IconCompatParcelizer();
    }

    public final io.sentry.protocol.IconCompatParcelizer MediaDescriptionCompat() {
        io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer = new io.sentry.protocol.IconCompatParcelizer();
        iconCompatParcelizer.IconCompatParcelizer(this.write);
        iconCompatParcelizer.IconCompatParcelizer(this.IconCompatParcelizer);
        iconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        return iconCompatParcelizer;
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final io.sentry.protocol.ComponentActivity MediaMetadataCompat() {
        io.sentry.protocol.ComponentActivity componentActivityMediaMetadataCompat = this.RemoteActionCompatParcelizer.MediaMetadataCompat();
        if (componentActivityMediaMetadataCompat != null) {
            return componentActivityMediaMetadataCompat;
        }
        io.sentry.protocol.ComponentActivity componentActivityMediaMetadataCompat2 = this.IconCompatParcelizer.MediaMetadataCompat();
        return componentActivityMediaMetadataCompat2 != null ? componentActivityMediaMetadataCompat2 : this.write.MediaMetadataCompat();
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 MediaSessionCompatQueueItem() {
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem = this.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem();
        if (r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem != null) {
            return r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem;
        }
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem2 = this.IconCompatParcelizer.MediaSessionCompatQueueItem();
        return r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem2 != null ? r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem2 : this.write.MediaSessionCompatQueueItem();
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final io.sentry.protocol.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs RatingCompat() {
        io.sentry.protocol.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs r8lambdag6d1iybxwil5aesazxszmvuycqsRatingCompat = this.RemoteActionCompatParcelizer.RatingCompat();
        if (r8lambdag6d1iybxwil5aesazxszmvuycqsRatingCompat != null) {
            return r8lambdag6d1iybxwil5aesazxszmvuycqsRatingCompat;
        }
        io.sentry.protocol.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs r8lambdag6d1iybxwil5aesazxszmvuycqsRatingCompat2 = this.IconCompatParcelizer.RatingCompat();
        return r8lambdag6d1iybxwil5aesazxszmvuycqsRatingCompat2 != null ? r8lambdag6d1iybxwil5aesazxszmvuycqsRatingCompat2 : this.write.RatingCompat();
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final io.sentry.protocol.MediaBrowserCompatMediaItem RemoteActionCompatParcelizer() {
        io.sentry.protocol.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItemRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        if (mediaBrowserCompatMediaItemRemoteActionCompatParcelizer != null) {
            return mediaBrowserCompatMediaItemRemoteActionCompatParcelizer;
        }
        io.sentry.protocol.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItemRemoteActionCompatParcelizer2 = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        return mediaBrowserCompatMediaItemRemoteActionCompatParcelizer2 != null ? mediaBrowserCompatMediaItemRemoteActionCompatParcelizer2 : this.write.RemoteActionCompatParcelizer();
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final Object read(Object obj) {
        Object obj2 = this.RemoteActionCompatParcelizer.read(obj);
        if (obj2 != null) {
            return obj2;
        }
        Object obj3 = this.IconCompatParcelizer.read(obj);
        return obj3 != null ? obj3 : this.write.read(obj);
    }

    public final io.sentry.protocol.IconCompatParcelizer serializer() {
        int i = openUriWithWebViewActivityFromPushlambda0.RemoteActionCompatParcelizer[this.read.ordinal()];
        io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer = this.RemoteActionCompatParcelizer;
        if (i == 1) {
            return iconCompatParcelizer;
        }
        if (i != 2) {
            return i != 3 ? iconCompatParcelizer : this.write;
        }
        return this.IconCompatParcelizer;
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final io.sentry.protocol.MediaMetadataCompat write() {
        io.sentry.protocol.MediaMetadataCompat mediaMetadataCompatWrite = this.RemoteActionCompatParcelizer.write();
        if (mediaMetadataCompatWrite != null) {
            return mediaMetadataCompatWrite;
        }
        io.sentry.protocol.MediaMetadataCompat mediaMetadataCompatWrite2 = this.IconCompatParcelizer.write();
        return mediaMetadataCompatWrite2 != null ? mediaMetadataCompatWrite2 : this.write.write();
    }

    public getActionViewIntent(io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer, io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer2, io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer3, r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik r8lambdacr4tgcnfsm4f1f1q1igncb5rik) {
        this.write = iconCompatParcelizer;
        this.IconCompatParcelizer = iconCompatParcelizer2;
        this.RemoteActionCompatParcelizer = iconCompatParcelizer3;
        this.read = r8lambdacr4tgcnfsm4f1f1q1igncb5rik;
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final Object IconCompatParcelizer(Object obj, String str) {
        return serializer().IconCompatParcelizer(obj, str);
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final Enumeration MediaBrowserCompatMediaItem() {
        return MediaDescriptionCompat().serializer.keys();
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer(io.sentry.protocol.MediaMetadataCompat mediaMetadataCompat) {
        serializer().RemoteActionCompatParcelizer(mediaMetadataCompat);
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer(io.sentry.protocol.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs r8lambdag6d1iybxwil5aesazxszmvuycqs) {
        serializer().RemoteActionCompatParcelizer(r8lambdag6d1iybxwil5aesazxszmvuycqs);
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer(io.sentry.protocol.write writeVar) {
        serializer().RemoteActionCompatParcelizer(writeVar);
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final Set read() {
        return MediaDescriptionCompat().serializer.entrySet();
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final void read(io.sentry.protocol.ResultReceiver resultReceiver) {
        serializer().read(resultReceiver);
    }

    @Override // io.sentry.protocol.IconCompatParcelizer, o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        MediaDescriptionCompat().serialize(isargstring, brazeActionParserExternalSyntheticLambda0);
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final void serializer(io.sentry.protocol.PlaybackStateCompatCustomAction playbackStateCompatCustomAction) {
        serializer().serializer(playbackStateCompatCustomAction);
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final void serializer(io.sentry.protocol._init_lambda1 _init_lambda1Var) {
        serializer().serializer(_init_lambda1Var);
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final void serializer(r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0) {
        serializer().serializer(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0);
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final void write(io.sentry.protocol.ComponentActivity componentActivity) {
        serializer().write(componentActivity);
    }

    @Override // io.sentry.protocol.IconCompatParcelizer
    public final void write(io.sentry.protocol.read readVar) {
        serializer().write(readVar);
    }
}
