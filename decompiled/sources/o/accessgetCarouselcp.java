package o;

import android.content.Context;
import com.huawei.location.logic.zp;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkRequest;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkResponse;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetCarouselcp {
    public String IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public final CredentialClient MediaSessionCompatQueueItem;
    public final Context RemoteActionCompatParcelizer;
    public final NetworkCapability read;
    public String serializer;
    public String write;

    public abstract Credential RemoteActionCompatParcelizer(String str);

    public abstract String RemoteActionCompatParcelizer(NetworkResponse networkResponse);

    public abstract void a();

    public abstract String b();

    public abstract Credential serializer(String str, String str2, String str3, String str4, zp zpVar);

    public static boolean read(String str) {
        return "tsms.1018".equalsIgnoreCase(str) || "tsms.1019".equalsIgnoreCase(str);
    }

    public final Credential write(String str, String str2, String str3, String str4) throws UcsException {
        try {
            a();
            this.IconCompatParcelizer = str;
            this.write = str2;
            this.serializer = str3;
            this.MediaBrowserCompatMediaItem = str4;
            String strB = b();
            HashMap map = getButtono7Vup1c.read(str2, str3, str4);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("request", strB);
                NetworkResponse networkResponsePost = this.read.post(new NetworkRequest(str, map, jSONObject.toString()));
                int code = networkResponsePost.getCode();
                if ((code < 200 || code >= 300) && code != 400 && code != 403 && code != 500) {
                    throw new UcsException(1013L, "tsms req error, return " + networkResponsePost.getCode());
                }
                return RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(networkResponsePost));
            } catch (JSONException e) {
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("getReqBody error : ");
                sbIconCompatParcelizer.append(e.getMessage());
                throw new UcsException(1002L, sbIconCompatParcelizer.toString());
            }
        } catch (IOException e2) {
            StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("get credential from TSMS fail : ");
            sbIconCompatParcelizer2.append(e2.getMessage());
            String string = sbIconCompatParcelizer2.toString();
            throw accessgetDropdownListcp.IconCompatParcelizer("ApplyCredentialHandler", string, new Object[0], 1006L, string);
        }
    }

    public accessgetCarouselcp(CredentialClient credentialClient, Context context, NetworkCapability networkCapability) {
        this.MediaSessionCompatQueueItem = credentialClient;
        this.RemoteActionCompatParcelizer = context;
        this.read = networkCapability;
    }
}
