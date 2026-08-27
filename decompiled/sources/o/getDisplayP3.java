package o;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class getDisplayP3 {
    public static xyzaToColorJlNiLsgui_graphics serializer(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, StrokeJoinCompanion strokeJoinCompanion) {
        return new xyzaToColorJlNiLsgui_graphics(match.serializer(jsonReader, strokeJoinCompanion, 1.0f, transferSt2048Oetfui_graphics.RemoteActionCompatParcelizer, false), 3);
    }

    public static xyzaToColorJlNiLsgui_graphics serializer(com.airbnb.lottie.parser.moshi.JsonUtf8Reader jsonUtf8Reader, StrokeJoinCompanion strokeJoinCompanion) {
        return new xyzaToColorJlNiLsgui_graphics(match.serializer(jsonUtf8Reader, strokeJoinCompanion, newD50Xyzui_graphics.IconCompatParcelizer(), transferSt2048Oetfui_graphics.read, true), 4);
    }

    public static xyzaToColorJlNiLsgui_graphics write(com.airbnb.lottie.parser.moshi.JsonUtf8Reader jsonUtf8Reader, StrokeJoinCompanion strokeJoinCompanion) {
        return new xyzaToColorJlNiLsgui_graphics(match.serializer(jsonUtf8Reader, strokeJoinCompanion, 1.0f, transferSt2048Oetfui_graphics.write, false), 1);
    }

    public static toXyz IconCompatParcelizer(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, StrokeJoinCompanion strokeJoinCompanion, boolean z) {
        return new toXyz(1, match.serializer(jsonReader, strokeJoinCompanion, z ? newD50Xyzui_graphics.IconCompatParcelizer() : 1.0f, transferSt2048Oetfui_graphics.IconCompatParcelizer, false));
    }

    public static xyzaToColorJlNiLsgui_graphics IconCompatParcelizer(com.airbnb.lottie.parser.moshi.JsonUtf8Reader jsonUtf8Reader, StrokeJoinCompanion strokeJoinCompanion, int i) {
        getUseEvaluationsCachefwf_client_release getuseevaluationscachefwf_client_release = new getUseEvaluationsCachefwf_client_release(2);
        getuseevaluationscachefwf_client_release.write = i;
        ArrayList arrayListSerializer = match.serializer(jsonUtf8Reader, strokeJoinCompanion, 1.0f, getuseevaluationscachefwf_client_release, false);
        for (int i2 = 0; i2 < arrayListSerializer.size(); i2++) {
            Lab lab = (Lab) arrayListSerializer.get(i2);
            absResponse absresponse = (absResponse) lab.MediaSessionCompatToken;
            absResponse absresponse2 = (absResponse) lab.RatingCompat;
            if (absresponse != null && absresponse2 != null) {
                float[] fArr = absresponse.RemoteActionCompatParcelizer;
                int length = fArr.length;
                float[] fArr2 = absresponse2.RemoteActionCompatParcelizer;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f = Float.NaN;
                    int i3 = 0;
                    for (int i4 = 0; i4 < length2; i4++) {
                        float f2 = fArr3[i4];
                        if (f2 != f) {
                            fArr3[i3] = f2;
                            i3++;
                            f = fArr3[i4];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                    lab = new Lab(absresponse.RemoteActionCompatParcelizer(fArrCopyOfRange), absresponse2.RemoteActionCompatParcelizer(fArrCopyOfRange));
                }
            }
            arrayListSerializer.set(i2, lab);
        }
        return new xyzaToColorJlNiLsgui_graphics(arrayListSerializer, 2);
    }
}
