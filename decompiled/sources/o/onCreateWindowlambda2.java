package o;

import android.util.TypedValue;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class onCreateWindowlambda2 {
    public static final void RemoteActionCompatParcelizer(java.util.logging.Logger logger, onCreateWindowlambda1 oncreatewindowlambda1, onCreateWindowlambda3 oncreatewindowlambda3, String str) {
        logger.fine(oncreatewindowlambda3.name + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + oncreatewindowlambda1.name);
    }

    public static final String write(long j) {
        String strM;
        if (j <= -999500000) {
            strM = c8$$ExternalSyntheticOutline0.m((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            strM = c8$$ExternalSyntheticOutline0.m((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            strM = c8$$ExternalSyntheticOutline0.m((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            strM = c8$$ExternalSyntheticOutline0.m((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            strM = c8$$ExternalSyntheticOutline0.m((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strM = c8$$ExternalSyntheticOutline0.m((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strM}, 1));
    }

    public static asAndroidPathEffect write(TypedValue typedValue, asAndroidPathEffect asandroidpatheffect, asAndroidPathEffect asandroidpatheffect2, String str, String str2) throws XmlPullParserException {
        if (asandroidpatheffect == null || asandroidpatheffect == asandroidpatheffect2) {
            return asandroidpatheffect == null ? asandroidpatheffect2 : asandroidpatheffect;
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Type is ", str, " but found ", str2, ": ");
        sbM.append(typedValue.data);
        throw new XmlPullParserException(sbM.toString());
    }
}
