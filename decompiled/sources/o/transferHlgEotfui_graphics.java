package o;

import android.graphics.PointF;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class transferHlgEotfui_graphics {
    public static final colorResource RemoteActionCompatParcelizer = colorResource.RemoteActionCompatParcelizer("x", "y");

    public static PointF read(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, float f) {
        int i = getUnspecifiedui_graphics.serializer[jsonReader.PlaybackStateCompatCustomAction().ordinal()];
        if (i == 1) {
            float fMediaMetadataCompat = (float) jsonReader.MediaMetadataCompat();
            float fMediaMetadataCompat2 = (float) jsonReader.MediaMetadataCompat();
            while (jsonReader.MediaBrowserCompatMediaItem()) {
                jsonReader.MediaSessionCompatResultReceiverWrapper();
            }
            return new PointF(fMediaMetadataCompat * f, fMediaMetadataCompat2 * f);
        }
        if (i == 2) {
            jsonReader.read();
            float fMediaMetadataCompat3 = (float) jsonReader.MediaMetadataCompat();
            float fMediaMetadataCompat4 = (float) jsonReader.MediaMetadataCompat();
            while (jsonReader.PlaybackStateCompatCustomAction() != DoubleFunction.END_ARRAY) {
                jsonReader.MediaSessionCompatResultReceiverWrapper();
            }
            jsonReader.IconCompatParcelizer();
            return new PointF(fMediaMetadataCompat3 * f, fMediaMetadataCompat4 * f);
        }
        if (i != 3) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(jsonReader.PlaybackStateCompatCustomAction(), "Unknown point starts with ");
            return null;
        }
        jsonReader.RemoteActionCompatParcelizer();
        float fRemoteActionCompatParcelizer = 0.0f;
        float fRemoteActionCompatParcelizer2 = 0.0f;
        while (jsonReader.MediaBrowserCompatMediaItem()) {
            int i2 = jsonReader.read(RemoteActionCompatParcelizer);
            if (i2 == 0) {
                fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(jsonReader);
            } else if (i2 != 1) {
                jsonReader.MediaSessionCompatToken();
                jsonReader.MediaSessionCompatResultReceiverWrapper();
            } else {
                fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(jsonReader);
            }
        }
        jsonReader.write();
        return new PointF(fRemoteActionCompatParcelizer * f, fRemoteActionCompatParcelizer2 * f);
    }

    public static ArrayList write(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        jsonReader.read();
        while (jsonReader.PlaybackStateCompatCustomAction() == DoubleFunction.BEGIN_ARRAY) {
            jsonReader.read();
            arrayList.add(read(jsonReader, f));
            jsonReader.IconCompatParcelizer();
        }
        jsonReader.IconCompatParcelizer();
        return arrayList;
    }

    public static int IconCompatParcelizer(com.airbnb.lottie.parser.moshi.JsonReader jsonReader) {
        jsonReader.read();
        int iMediaMetadataCompat = (int) (jsonReader.MediaMetadataCompat() * 255.0d);
        int iMediaMetadataCompat2 = (int) (jsonReader.MediaMetadataCompat() * 255.0d);
        int iMediaMetadataCompat3 = (int) (jsonReader.MediaMetadataCompat() * 255.0d);
        while (jsonReader.MediaBrowserCompatMediaItem()) {
            jsonReader.MediaSessionCompatResultReceiverWrapper();
        }
        jsonReader.IconCompatParcelizer();
        return android.graphics.Color.argb(255, iMediaMetadataCompat, iMediaMetadataCompat2, iMediaMetadataCompat3);
    }

    public static float RemoteActionCompatParcelizer(com.airbnb.lottie.parser.moshi.JsonReader jsonReader) {
        DoubleFunction doubleFunctionPlaybackStateCompatCustomAction = jsonReader.PlaybackStateCompatCustomAction();
        int i = getUnspecifiedui_graphics.serializer[doubleFunctionPlaybackStateCompatCustomAction.ordinal()];
        if (i == 1) {
            return (float) jsonReader.MediaMetadataCompat();
        }
        if (i != 2) {
            Gson$$ExternalSyntheticBUOutline0.m(doubleFunctionPlaybackStateCompatCustomAction, "Unknown value for token of type ");
            return 0.0f;
        }
        jsonReader.read();
        float fMediaMetadataCompat = (float) jsonReader.MediaMetadataCompat();
        while (jsonReader.MediaBrowserCompatMediaItem()) {
            jsonReader.MediaSessionCompatResultReceiverWrapper();
        }
        jsonReader.IconCompatParcelizer();
        return fMediaMetadataCompat;
    }
}
