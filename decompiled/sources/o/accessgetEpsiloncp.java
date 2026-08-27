package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetEpsiloncp extends accessgetNaNcp {
    public accessgetEpsiloncp() {
    }

    public final void IconCompatParcelizer(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            TypedArray typedArrayRemoteActionCompatParcelizer = coil3.ExtrasKt.RemoteActionCompatParcelizer(resources, theme, attributeSet, getHighfv9h1I.IconCompatParcelizer);
            String string = typedArrayRemoteActionCompatParcelizer.getString(0);
            if (string != null) {
                this.PlaybackStateCompatCustomAction = string;
            }
            String string2 = typedArrayRemoteActionCompatParcelizer.getString(1);
            if (string2 != null) {
                this.PlaybackStateCompat = FocusOrderModifierKt.serializer(string2);
            }
            this.MediaSessionCompatResultReceiverWrapper = coil3.ExtrasKt.RemoteActionCompatParcelizer(xmlPullParser, "fillType") ? typedArrayRemoteActionCompatParcelizer.getInt(2, 0) : 0;
            typedArrayRemoteActionCompatParcelizer.recycle();
        }
    }

    public accessgetEpsiloncp(accessgetNaNcp accessgetnancp) {
        super(accessgetnancp);
    }
}
