package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.CreateHomeScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onNodePlacedui {
    public static final CreateHomeScope MediaMetadataCompat;

    static {
        detachAndRemoveNode detachandremovenode = new detachAndRemoveNode();
        setMeasurePending setmeasurepending = setMeasurePending.RemoteActionCompatParcelizer;
        detachandremovenode.serializer(onNodePlacedui.class, setmeasurepending);
        detachandremovenode.serializer(getChildDelegatesDirtyui.class, setmeasurepending);
        MediaMetadataCompat = new CreateHomeScope(detachandremovenode);
    }

    public static getChildDelegatesDirtyui serializer(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return write(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public final requestLookaheadRemeasure RemoteActionCompatParcelizer() {
        registerOnLayoutCompletedListener registeronlayoutcompletedlistener = new registerOnLayoutCompletedListener();
        getChildDelegatesDirtyui getchilddelegatesdirtyui = (getChildDelegatesDirtyui) this;
        String str = getchilddelegatesdirtyui.RemoteActionCompatParcelizer;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null variantId");
            return null;
        }
        String str2 = getchilddelegatesdirtyui.read;
        if (str2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null rolloutId");
            return null;
        }
        registeronlayoutcompletedlistener.serializer = new setUncaughtExceptionHandlerui(str2, str);
        registeronlayoutcompletedlistener.IconCompatParcelizer(getchilddelegatesdirtyui.serializer);
        registeronlayoutcompletedlistener.RemoteActionCompatParcelizer = getchilddelegatesdirtyui.IconCompatParcelizer;
        registeronlayoutcompletedlistener.read(getchilddelegatesdirtyui.write);
        return registeronlayoutcompletedlistener.IconCompatParcelizer();
    }

    public static getChildDelegatesDirtyui write(String str, String str2, String str3, String str4, long j) {
        if (str3.length() > 256) {
            str3 = str3.substring(0, androidx.compose.ui.graphics.Fields.RotationX);
        }
        return new getChildDelegatesDirtyui(str, str2, str3, str4, j);
    }
}
