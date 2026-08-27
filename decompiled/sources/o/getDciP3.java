package o;

import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class getDciP3 {
    public static final colorResource IconCompatParcelizer = colorResource.RemoteActionCompatParcelizer("k", "x", "y");

    public static u$a write(com.airbnb.lottie.parser.moshi.JsonUtf8Reader jsonUtf8Reader, StrokeJoinCompanion strokeJoinCompanion) {
        ArrayList arrayList = new ArrayList();
        if (jsonUtf8Reader.PlaybackStateCompatCustomAction() == DoubleFunction.BEGIN_ARRAY) {
            jsonUtf8Reader.read();
            while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                arrayList.add(new WrapperVerificationHelperMethods(strokeJoinCompanion, getSrgbPrimariesui_graphics.IconCompatParcelizer(jsonUtf8Reader, strokeJoinCompanion, newD50Xyzui_graphics.IconCompatParcelizer(), transferSt2048Oetfui_graphics.serializer, jsonUtf8Reader.PlaybackStateCompatCustomAction() == DoubleFunction.BEGIN_OBJECT, false)));
            }
            jsonUtf8Reader.IconCompatParcelizer();
            match.read(arrayList);
        } else {
            arrayList.add(new Lab(transferHlgEotfui_graphics.read(jsonUtf8Reader, newD50Xyzui_graphics.IconCompatParcelizer())));
        }
        u$a u_a = new u$a();
        u_a.IconCompatParcelizer = arrayList;
        return u_a;
    }

    public static absRcpResponse serializer(com.airbnb.lottie.parser.moshi.JsonUtf8Reader jsonUtf8Reader, StrokeJoinCompanion strokeJoinCompanion) {
        jsonUtf8Reader.RemoteActionCompatParcelizer();
        u$a u_aWrite = null;
        toXyz toxyzIconCompatParcelizer = null;
        boolean z = false;
        toXyz toxyzIconCompatParcelizer2 = null;
        while (jsonUtf8Reader.PlaybackStateCompatCustomAction() != DoubleFunction.END_OBJECT) {
            int i = jsonUtf8Reader.read(IconCompatParcelizer);
            if (i == 0) {
                u_aWrite = write(jsonUtf8Reader, strokeJoinCompanion);
            } else if (i != 1) {
                if (i != 2) {
                    jsonUtf8Reader.MediaSessionCompatToken();
                    jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                } else if (jsonUtf8Reader.PlaybackStateCompatCustomAction() == DoubleFunction.STRING) {
                    jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                    z = true;
                } else {
                    toxyzIconCompatParcelizer = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, true);
                }
            } else if (jsonUtf8Reader.PlaybackStateCompatCustomAction() == DoubleFunction.STRING) {
                jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                z = true;
            } else {
                toxyzIconCompatParcelizer2 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, true);
            }
        }
        jsonUtf8Reader.write();
        if (z) {
            strokeJoinCompanion.IconCompatParcelizer("Lottie doesn't support expressions.");
        }
        return u_aWrite != null ? u_aWrite : new ColorSpaceCompanion(toxyzIconCompatParcelizer2, toxyzIconCompatParcelizer);
    }
}
