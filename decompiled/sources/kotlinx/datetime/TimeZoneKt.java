package kotlinx.datetime;

import android.content.Context;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import o.AndroidPathIterator;
import o.AndroidPathMeasure;
import o.accesstoPathSegmentType;
import o.getGraphicModalMaxHeightDp;
import o.relativeMoveTo;
import o.setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release;
import o.setPath;
import o.setShouldNextUnregisterBeSkipped;
import o.toAndroidTileMode0vamqd0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TimeZoneKt {
    public static final relativeMoveTo read(Context context) {
        context.getClass();
        relativeMoveTo relativemoveto = new relativeMoveTo(context);
        toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = relativemoveto.read;
        AndroidPathIterator androidPathIterator = toandroidtilemode0vamqd0.IconCompatParcelizer;
        androidPathIterator.write(new accesstoPathSegmentType(androidPathIterator));
        AndroidPathIterator androidPathIterator2 = toandroidtilemode0vamqd0.IconCompatParcelizer;
        androidPathIterator2.write(new AndroidPathMeasure());
        androidPathIterator2.write(new setPath());
        return relativemoveto;
    }

    public static final setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release RemoteActionCompatParcelizer(setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskipped, getGraphicModalMaxHeightDp getgraphicmodalmaxheightdp) {
        setshouldnextunregisterbeskipped.getClass();
        getgraphicmodalmaxheightdp.getClass();
        try {
            return new setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release(LocalDateTime.ofInstant(setshouldnextunregisterbeskipped.value, getgraphicmodalmaxheightdp.zoneId));
        } catch (DateTimeException e) {
            throw new DateTimeArithmeticException(e);
        }
    }

    public static final setShouldNextUnregisterBeSkipped serializer(setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release, getGraphicModalMaxHeightDp getgraphicmodalmaxheightdp) {
        setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release.getClass();
        getgraphicmodalmaxheightdp.getClass();
        return new setShouldNextUnregisterBeSkipped(setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release.value.atZone(getgraphicmodalmaxheightdp.zoneId).toInstant());
    }
}
