package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.sentiance.okhttp3.u$a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class getNtsc1953 {
    public static final colorResource RemoteActionCompatParcelizer = colorResource.RemoteActionCompatParcelizer(com.braze.Constants.BRAZE_PUSH_CONTENT_KEY, com.braze.Constants.BRAZE_PUSH_PRIORITY_KEY, com.braze.Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");
    public static final colorResource serializer = colorResource.RemoteActionCompatParcelizer("k");

    public static void write(toXyz toxyz, StrokeJoinCompanion strokeJoinCompanion) {
        Float fValueOf = Float.valueOf(0.0f);
        List list = (List) toxyz.RatingCompat;
        if (list.isEmpty()) {
            list.add(new Lab(strokeJoinCompanion, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(strokeJoinCompanion.read)));
        } else if (((Lab) list.get(0)).MediaSessionCompatToken == null) {
            list.set(0, new Lab(strokeJoinCompanion, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(strokeJoinCompanion.read)));
        }
    }

    public static boolean write(toXyz toxyz) {
        if (toxyz != null) {
            return toxyz.IconCompatParcelizer() && ((Float) ((Lab) ((List) toxyz.RatingCompat).get(0)).MediaSessionCompatToken).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    public static ColorSpaceKt read(com.airbnb.lottie.parser.moshi.JsonUtf8Reader jsonUtf8Reader, StrokeJoinCompanion strokeJoinCompanion) {
        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics;
        boolean z = jsonUtf8Reader.PlaybackStateCompatCustomAction() == DoubleFunction.BEGIN_OBJECT;
        if (z) {
            jsonUtf8Reader.RemoteActionCompatParcelizer();
        }
        u$a u_aWrite = null;
        absRcpResponse absrcpresponseSerializer = null;
        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics2 = null;
        toXyz toxyzIconCompatParcelizer = null;
        toXyz toxyzIconCompatParcelizer2 = null;
        toXyz toxyzIconCompatParcelizer3 = null;
        toXyz toxyzIconCompatParcelizer4 = null;
        toXyz toxyzIconCompatParcelizer5 = null;
        toXyz toxyzIconCompatParcelizer6 = null;
        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsSerializer = null;
        toXyz toxyzIconCompatParcelizer7 = null;
        toXyz toxyzIconCompatParcelizer8 = null;
        while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
            switch (jsonUtf8Reader.read(RemoteActionCompatParcelizer)) {
                case 0:
                    jsonUtf8Reader.RemoteActionCompatParcelizer();
                    while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                        if (jsonUtf8Reader.read(serializer) != 0) {
                            jsonUtf8Reader.MediaSessionCompatToken();
                            jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                        } else {
                            u_aWrite = getDciP3.write(jsonUtf8Reader, strokeJoinCompanion);
                        }
                    }
                    jsonUtf8Reader.write();
                    break;
                case 1:
                    absrcpresponseSerializer = getDciP3.serializer(jsonUtf8Reader, strokeJoinCompanion);
                    break;
                case 2:
                    xyzatocolorjlnilsgui_graphics2 = new xyzaToColorJlNiLsgui_graphics(match.serializer(jsonUtf8Reader, strokeJoinCompanion, 1.0f, transferSt2048Oetfui_graphics.MediaDescriptionCompat, false), 5);
                    break;
                case 3:
                    toxyzIconCompatParcelizer6 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                    write(toxyzIconCompatParcelizer6, strokeJoinCompanion);
                    break;
                case 4:
                    toxyzIconCompatParcelizer = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                    write(toxyzIconCompatParcelizer, strokeJoinCompanion);
                    break;
                case 5:
                    xyzatocolorjlnilsgui_graphicsSerializer = getDisplayP3.serializer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion);
                    break;
                case 6:
                    toxyzIconCompatParcelizer7 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                    break;
                case 7:
                    toxyzIconCompatParcelizer8 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                    break;
                case 8:
                    toxyzIconCompatParcelizer2 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                    break;
                case 9:
                    toxyzIconCompatParcelizer3 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                    break;
                case 10:
                    toxyzIconCompatParcelizer5 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                    write(toxyzIconCompatParcelizer5, strokeJoinCompanion);
                    break;
                case 11:
                    toxyzIconCompatParcelizer4 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                    write(toxyzIconCompatParcelizer4, strokeJoinCompanion);
                    break;
                default:
                    jsonUtf8Reader.MediaSessionCompatToken();
                    jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                    break;
            }
        }
        if (z) {
            jsonUtf8Reader.write();
        }
        if (u_aWrite == null || (u_aWrite.IconCompatParcelizer() && ((PointF) ((Lab) u_aWrite.IconCompatParcelizer.get(0)).MediaSessionCompatToken).equals(0.0f, 0.0f))) {
            u_aWrite = null;
        }
        absRcpResponse absrcpresponse = (absrcpresponseSerializer == null || (!(absrcpresponseSerializer instanceof ColorSpaceCompanion) && absrcpresponseSerializer.IconCompatParcelizer() && ((PointF) ((Lab) absrcpresponseSerializer.serializer().get(0)).MediaSessionCompatToken).equals(0.0f, 0.0f))) ? null : absrcpresponseSerializer;
        toXyz toxyz = write(toxyzIconCompatParcelizer) ? null : toxyzIconCompatParcelizer;
        if (xyzatocolorjlnilsgui_graphics2 == null) {
            xyzatocolorjlnilsgui_graphics = null;
        } else {
            if (xyzatocolorjlnilsgui_graphics2.IconCompatParcelizer()) {
                LabCompanion labCompanion = (LabCompanion) ((Lab) ((List) xyzatocolorjlnilsgui_graphics2.RatingCompat).get(0)).MediaSessionCompatToken;
                if (labCompanion.read == 1.0f && labCompanion.serializer == 1.0f) {
                    xyzatocolorjlnilsgui_graphics = null;
                }
            }
            xyzatocolorjlnilsgui_graphics = xyzatocolorjlnilsgui_graphics2;
        }
        return new ColorSpaceKt(u_aWrite, absrcpresponse, xyzatocolorjlnilsgui_graphics, toxyz, xyzatocolorjlnilsgui_graphicsSerializer, toxyzIconCompatParcelizer7, toxyzIconCompatParcelizer8, (toxyzIconCompatParcelizer2 == null || (toxyzIconCompatParcelizer2.IconCompatParcelizer() && ((Float) ((Lab) ((List) toxyzIconCompatParcelizer2.RatingCompat).get(0)).MediaSessionCompatToken).floatValue() == 0.0f)) ? null : toxyzIconCompatParcelizer2, (toxyzIconCompatParcelizer3 == null || (toxyzIconCompatParcelizer3.IconCompatParcelizer() && ((Float) ((Lab) ((List) toxyzIconCompatParcelizer3.RatingCompat).get(0)).MediaSessionCompatToken).floatValue() == 0.0f)) ? null : toxyzIconCompatParcelizer3, write(toxyzIconCompatParcelizer5) ? null : toxyzIconCompatParcelizer5, write(toxyzIconCompatParcelizer4) ? null : toxyzIconCompatParcelizer4, write(toxyzIconCompatParcelizer6) ? null : toxyzIconCompatParcelizer6);
    }
}
