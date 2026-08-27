package io.sentry.protocol;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatResultReceiverWrapper implements RequestPushPermissionStep {
    public r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg IconCompatParcelizer;
    public String MediaDescriptionCompat;
    public AbstractMap MediaMetadataCompat;
    public String RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.read, this.serializer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, this.MediaDescriptionCompat, this.MediaMetadataCompat});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("message");
        okHttpCall$1.IconCompatParcelizer(this.read);
        if (this.serializer != null) {
            okHttpCall$1.write("contact_email");
            okHttpCall$1.IconCompatParcelizer(this.serializer);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("name");
            okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write("associated_event_id");
            this.IconCompatParcelizer.serialize(okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        }
        if (this.write != null) {
            okHttpCall$1.write("replay_id");
            this.write.serialize(okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        }
        if (this.MediaDescriptionCompat != null) {
            okHttpCall$1.write("url");
            okHttpCall$1.IconCompatParcelizer(this.MediaDescriptionCompat);
        }
        AbstractMap abstractMap = this.MediaMetadataCompat;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                Object obj = this.MediaMetadataCompat.get(str);
                okHttpCall$1.write(str);
                okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, obj);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompatResultReceiverWrapper)) {
            return false;
        }
        MediaSessionCompatResultReceiverWrapper mediaSessionCompatResultReceiverWrapper = (MediaSessionCompatResultReceiverWrapper) obj;
        return setNativeShader.write(this.read, mediaSessionCompatResultReceiverWrapper.read) && setNativeShader.write(this.serializer, mediaSessionCompatResultReceiverWrapper.serializer) && setNativeShader.write(this.RemoteActionCompatParcelizer, mediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer) && setNativeShader.write(this.IconCompatParcelizer, mediaSessionCompatResultReceiverWrapper.IconCompatParcelizer) && setNativeShader.write(this.write, mediaSessionCompatResultReceiverWrapper.write) && setNativeShader.write(this.MediaDescriptionCompat, mediaSessionCompatResultReceiverWrapper.MediaDescriptionCompat) && setNativeShader.write(this.MediaMetadataCompat, mediaSessionCompatResultReceiverWrapper.MediaMetadataCompat);
    }

    public final String toString() {
        return "Feedback{message='" + this.read + "', contactEmail='" + this.serializer + "', name='" + this.RemoteActionCompatParcelizer + "', associatedEventId=" + this.IconCompatParcelizer + ", replayId=" + this.write + ", url='" + this.MediaDescriptionCompat + "', unknown=" + this.MediaMetadataCompat + '}';
    }
}
