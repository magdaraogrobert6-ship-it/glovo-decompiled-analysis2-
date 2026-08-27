package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class match {
    public static final colorResource serializer = colorResource.RemoteActionCompatParcelizer("k");

    public static ArrayList serializer(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, StrokeJoinCompanion strokeJoinCompanion, float f, connectorKeyYBCOT_4 connectorkeyybcot_4, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.PlaybackStateCompatCustomAction() == DoubleFunction.STRING) {
            strokeJoinCompanion.IconCompatParcelizer("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.RemoteActionCompatParcelizer();
        while (jsonReader.MediaBrowserCompatMediaItem()) {
            if (jsonReader.read(serializer) != 0) {
                jsonReader.MediaSessionCompatResultReceiverWrapper();
            } else if (jsonReader.PlaybackStateCompatCustomAction() == DoubleFunction.BEGIN_ARRAY) {
                jsonReader.read();
                if (jsonReader.PlaybackStateCompatCustomAction() == DoubleFunction.NUMBER) {
                    arrayList.add(getSrgbPrimariesui_graphics.IconCompatParcelizer(jsonReader, strokeJoinCompanion, f, connectorkeyybcot_4, false, z));
                } else {
                    while (jsonReader.MediaBrowserCompatMediaItem()) {
                        arrayList.add(getSrgbPrimariesui_graphics.IconCompatParcelizer(jsonReader, strokeJoinCompanion, f, connectorkeyybcot_4, true, z));
                    }
                }
                jsonReader.IconCompatParcelizer();
            } else {
                arrayList.add(getSrgbPrimariesui_graphics.IconCompatParcelizer(jsonReader, strokeJoinCompanion, f, connectorkeyybcot_4, false, z));
            }
        }
        jsonReader.write();
        read(arrayList);
        return arrayList;
    }

    public static void read(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            Lab lab = (Lab) arrayList.get(i2);
            i2++;
            Lab lab2 = (Lab) arrayList.get(i2);
            lab.read = Float.valueOf(lab2.PlaybackStateCompatCustomAction);
            if (lab.RatingCompat == null && (obj = lab2.MediaSessionCompatToken) != null) {
                lab.RatingCompat = obj;
                if (lab instanceof WrapperVerificationHelperMethods) {
                    ((WrapperVerificationHelperMethods) lab).write();
                }
            }
        }
        Lab lab3 = (Lab) arrayList.get(i);
        if ((lab3.MediaSessionCompatToken == null || lab3.RatingCompat == null) && arrayList.size() > 1) {
            arrayList.remove(lab3);
        }
    }
}
