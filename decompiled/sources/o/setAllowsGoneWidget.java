package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setAllowsGoneWidget {
    private static int serializer = 0;
    private static int write = 1;

    @SerializedName(com.braze.models.inappmessage.InAppMessageBase.CLICK_ACTION)
    private final String clickAction;

    @SerializedName("message")
    private final String message;

    @SerializedName(RemoteMessageConst.Notification.PRIORITY)
    private final String priority;

    @SerializedName("metadata")
    private final Map<String, String> pushMetaData;

    @SerializedName(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY)
    private final String title;

    public setAllowsGoneWidget(String str, String str2) {
        Map<String, String> mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("category", "test_push"), new onViewAttachedToWindowlambda0("android_channel_id", "com.foodora.courier.low"));
        str.getClass();
        str2.getClass();
        this.title = str;
        this.message = str2;
        this.priority = "HIGH";
        this.clickAction = "test_push";
        this.pushMetaData = mapRemoteActionCompatParcelizer;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 69;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.title;
        String str2 = this.message;
        String str3 = this.priority;
        String str4 = this.clickAction;
        Map<String, String> map = this.pushMetaData;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("TestPushBody(title=", str, ", message=", str2, ", priority=");
        c8$$ExternalSyntheticOutline0.m(sbM, str3, ", clickAction=", str4, ", pushMetaData=");
        String strRemoteActionCompatParcelizer = SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(sbM, map, ")");
        int i4 = serializer + 1;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return strRemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 51;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.pushMetaData.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.priority), 31, this.clickAction);
        int i4 = write + 107;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof setAllowsGoneWidget) {
            setAllowsGoneWidget setallowsgonewidget = (setAllowsGoneWidget) obj;
            Object[] objArr = {this.title, setallowsgonewidget.title};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.message, setallowsgonewidget.message};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr3 = {this.priority, setallowsgonewidget.priority};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr4 = {this.clickAction, setallowsgonewidget.clickAction};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                    Object[] objArr5 = {this.pushMetaData, setallowsgonewidget.pushMetaData};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                } else {
                    int i2 = write + 51;
                    serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
            } else {
                int i4 = write + 39;
                int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                serializer = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 3;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
        return false;
    }
}
