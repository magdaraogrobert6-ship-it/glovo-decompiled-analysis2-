package o;

import android.graphics.PointF;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class transferSt2048Oetfui_graphics implements connectorKeyYBCOT_4 {
    public final /* synthetic */ int MediaSessionCompatQueueItem;
    public static final transferSt2048Oetfui_graphics write = new transferSt2048Oetfui_graphics(1);
    public static final transferSt2048Oetfui_graphics IconCompatParcelizer = new transferSt2048Oetfui_graphics(2);
    public static final transferSt2048Oetfui_graphics RemoteActionCompatParcelizer = new transferSt2048Oetfui_graphics(3);
    public static final transferSt2048Oetfui_graphics serializer = new transferSt2048Oetfui_graphics(0);
    public static final transferSt2048Oetfui_graphics read = new transferSt2048Oetfui_graphics(4);
    public static final transferSt2048Oetfui_graphics MediaDescriptionCompat = new transferSt2048Oetfui_graphics(5);

    public /* synthetic */ transferSt2048Oetfui_graphics(int i) {
        this.MediaSessionCompatQueueItem = i;
    }

    @Override // o.connectorKeyYBCOT_4
    public final Object serializer(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, float f) {
        boolean z;
        int i = this.MediaSessionCompatQueueItem;
        if (i == 0) {
            return transferHlgEotfui_graphics.read(jsonReader, f);
        }
        if (i == 1) {
            z = jsonReader.PlaybackStateCompatCustomAction() == DoubleFunction.BEGIN_ARRAY;
            if (z) {
                jsonReader.read();
            }
            double dMediaMetadataCompat = jsonReader.MediaMetadataCompat();
            double dMediaMetadataCompat2 = jsonReader.MediaMetadataCompat();
            double dMediaMetadataCompat3 = jsonReader.MediaMetadataCompat();
            double dMediaMetadataCompat4 = jsonReader.PlaybackStateCompatCustomAction() == DoubleFunction.NUMBER ? jsonReader.MediaMetadataCompat() : 1.0d;
            if (z) {
                jsonReader.IconCompatParcelizer();
            }
            if (dMediaMetadataCompat <= 1.0d && dMediaMetadataCompat2 <= 1.0d && dMediaMetadataCompat3 <= 1.0d) {
                dMediaMetadataCompat *= 255.0d;
                dMediaMetadataCompat2 *= 255.0d;
                dMediaMetadataCompat3 *= 255.0d;
                if (dMediaMetadataCompat4 <= 1.0d) {
                    dMediaMetadataCompat4 *= 255.0d;
                }
            }
            return Integer.valueOf(android.graphics.Color.argb((int) dMediaMetadataCompat4, (int) dMediaMetadataCompat, (int) dMediaMetadataCompat2, (int) dMediaMetadataCompat3));
        }
        if (i == 2) {
            return Float.valueOf(transferHlgEotfui_graphics.RemoteActionCompatParcelizer(jsonReader) * f);
        }
        if (i == 3) {
            return Integer.valueOf(Math.round(transferHlgEotfui_graphics.RemoteActionCompatParcelizer(jsonReader) * f));
        }
        if (i != 4) {
            z = jsonReader.PlaybackStateCompatCustomAction() == DoubleFunction.BEGIN_ARRAY;
            if (z) {
                jsonReader.read();
            }
            float fMediaMetadataCompat = (float) jsonReader.MediaMetadataCompat();
            float fMediaMetadataCompat2 = (float) jsonReader.MediaMetadataCompat();
            while (jsonReader.MediaBrowserCompatMediaItem()) {
                jsonReader.MediaSessionCompatResultReceiverWrapper();
            }
            if (z) {
                jsonReader.IconCompatParcelizer();
            }
            return new LabCompanion((fMediaMetadataCompat / 100.0f) * f, (fMediaMetadataCompat2 / 100.0f) * f);
        }
        DoubleFunction doubleFunctionPlaybackStateCompatCustomAction = jsonReader.PlaybackStateCompatCustomAction();
        if (doubleFunctionPlaybackStateCompatCustomAction == DoubleFunction.BEGIN_ARRAY) {
            return transferHlgEotfui_graphics.read(jsonReader, f);
        }
        if (doubleFunctionPlaybackStateCompatCustomAction == DoubleFunction.BEGIN_OBJECT) {
            return transferHlgEotfui_graphics.read(jsonReader, f);
        }
        if (doubleFunctionPlaybackStateCompatCustomAction != DoubleFunction.NUMBER) {
            Gson$$ExternalSyntheticBUOutline0.m(doubleFunctionPlaybackStateCompatCustomAction, "Cannot convert json to point. Next token is ");
            return null;
        }
        PointF pointF = new PointF(((float) jsonReader.MediaMetadataCompat()) * f, ((float) jsonReader.MediaMetadataCompat()) * f);
        while (jsonReader.MediaBrowserCompatMediaItem()) {
            jsonReader.MediaSessionCompatResultReceiverWrapper();
        }
        return pointF;
    }
}
