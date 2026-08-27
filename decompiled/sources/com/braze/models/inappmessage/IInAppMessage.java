package com.braze.models.inappmessage;

import android.net.Uri;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.IPutIntoJson;
import java.util.List;
import java.util.Map;
import o.SimpleItemTouchHelperCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessage extends IPutIntoJson<JSONObject> {
    static /* synthetic */ void getAnimateIn$annotations() {
    }

    static /* synthetic */ void getAnimateOut$annotations() {
    }

    static /* synthetic */ void getOpenUriInWebView$annotations() {
    }

    String getAltImageText();

    boolean getAnimateIn();

    boolean getAnimateOut();

    int getBackgroundColor();

    ClickAction getClickAction();

    CropType getCropType();

    DismissType getDismissType();

    int getDurationInMilliseconds();

    long getExpirationTimestamp();

    Map<String, String> getExtras();

    String getIcon();

    int getIconBackgroundColor();

    int getIconColor();

    default Map<String, String> getLocalPrefetchedAssetPaths() {
        return SimpleItemTouchHelperCallback.serializer;
    }

    String getMessage();

    String getMessageExtras();

    TextAlign getMessageTextAlign();

    int getMessageTextColor();

    MessageType getMessageType();

    boolean getOpenUriInWebView();

    Orientation getOrientation();

    List<String> getRemoteAssetPathsForPrefetch();

    Uri getUri();

    boolean isControl();

    boolean isTestSend();

    boolean logClick();

    boolean logClick(String str);

    boolean logImpression();

    void onAfterClosed();

    void setAltImageText(String str);

    void setAnimateIn(boolean z);

    void setAnimateOut(boolean z);

    void setBackgroundColor(int i);

    void setClickBehavior(ClickAction clickAction);

    void setClickBehavior(ClickAction clickAction, Uri uri);

    void setCropType(CropType cropType);

    void setDismissType(DismissType dismissType);

    void setDurationInMilliseconds(int i);

    void setExpirationTimestamp(long j);

    void setExtras(Map<String, String> map);

    void setIcon(String str);

    void setIconBackgroundColor(int i);

    void setIconColor(int i);

    void setLocalPrefetchedAssetPaths(Map<String, String> map);

    void setMessage(String str);

    void setMessageExtras(String str);

    void setMessageTextAlign(TextAlign textAlign);

    void setMessageTextColor(int i);

    void setOpenUriInWebView(boolean z);

    void setOrientation(Orientation orientation);

    void setTestSend(boolean z);

    static /* synthetic */ void setClickBehavior$default(IInAppMessage iInAppMessage, ClickAction clickAction, Uri uri, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                uri = null;
            }
            iInAppMessage.setClickBehavior(clickAction, uri);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: setClickBehavior");
    }
}
