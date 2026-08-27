package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
public final class calculateLocalPositionMKHz9U {
    public static final ReflectionUtils IconCompatParcelizer;
    public static volatile String read;
    public static final ReflectionUtils serializer;
    public static final ReflectionUtils write;
    public final String MediaBrowserCompatMediaItem;
    public final androidx.lifecycle.BlockRunner MediaDescriptionCompat;
    public final getTextInputService MediaMetadataCompat;
    public final setAfter MediaSessionCompatQueueItem;
    public final createLayerdefault RatingCompat;
    public final getShouldAttachOnInsert RemoteActionCompatParcelizer;

    static {
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks = r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA.IconCompatParcelizer;
        BitSet bitSet = r8lambdazzuqe02XBR43ox0o_9r6taqg.serializer;
        write = new ReflectionUtils("x-goog-api-client", r8lambdakctilwmporjfcawe8asdqv1ks);
        serializer = new ReflectionUtils("google-cloud-resource-prefix", r8lambdakctilwmporjfcawe8asdqv1ks);
        IconCompatParcelizer = new ReflectionUtils("x-goog-request-params", r8lambdakctilwmporjfcawe8asdqv1ks);
        read = "gl-java/";
    }

    public calculateLocalPositionMKHz9U(getTextInputService gettextinputservice, setAfter setafter, getShouldAttachOnInsert getshouldattachoninsert, visitNodesaLcG6gQ visitnodesalcg6gq, createLayerdefault createlayerdefault, androidx.lifecycle.BlockRunner blockRunner) {
        this.MediaMetadataCompat = gettextinputservice;
        this.RatingCompat = createlayerdefault;
        this.MediaSessionCompatQueueItem = setafter;
        this.RemoteActionCompatParcelizer = getshouldattachoninsert;
        this.MediaDescriptionCompat = blockRunner;
        this.MediaBrowserCompatMediaItem = af$$ExternalSyntheticOutline0.m("projects/", visitnodesalcg6gq.write, "/databases/", visitnodesalcg6gq.serializer);
    }
}
