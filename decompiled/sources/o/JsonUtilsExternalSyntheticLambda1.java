package o;

import io.grpc.Status;
import java.util.List;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JsonUtilsExternalSyntheticLambda1 {
    public static final mergeJsonObjectslambda00 read = new mergeJsonObjectslambda00("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED", 0);

    public void IconCompatParcelizer() {
    }

    public void IconCompatParcelizer(int i) {
    }

    public void IconCompatParcelizer(long j) {
    }

    public abstract void IconCompatParcelizer(List list);

    public void IconCompatParcelizer(r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
    }

    public abstract Object MediaBrowserCompatMediaItem();

    public abstract void MediaDescriptionCompat();

    public void MediaMetadataCompat() {
    }

    public void MediaSessionCompatQueueItem() {
    }

    public abstract void RatingCompat();

    public abstract r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc RemoteActionCompatParcelizer();

    public void RemoteActionCompatParcelizer(int i) {
    }

    public void RemoteActionCompatParcelizer(long j) {
    }

    public void read(int i, long j) {
    }

    public void read(long j) {
    }

    public abstract getPrettyPrintedStringlambda0 serializer();

    public void serializer(long j, long j2, int i) {
    }

    public void serializer(Status status) {
    }

    public abstract void serializer(wouldPushPermissionPromptDisplaylambda4 wouldpushpermissionpromptdisplaylambda4);

    public abstract List write();

    public void write(long j) {
    }

    public void write(getPrettyPrintedStringlambda0 getprettyprintedstringlambda0, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE read() {
        boolean z;
        List listWrite = write();
        if (listWrite != null) {
            z = listWrite.size() == 1;
        }
        TextStreamsKt.IconCompatParcelizer("%s does not have exactly one group", listWrite, z);
        return (r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) listWrite.get(0);
    }
}
