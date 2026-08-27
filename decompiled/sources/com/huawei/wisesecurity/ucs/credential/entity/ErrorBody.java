package com.huawei.wisesecurity.ucs.credential.entity;

import com.huawei.wisesecurity.kfs.exception.KfsValidationException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import o.EmptySemanticsElement;
import o.accessgetSwitchcp;
import o.getColumnSpan;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ErrorBody {

    @EmptySemanticsElement
    private String errorCode;

    @EmptySemanticsElement
    private String errorMessage;

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public static ErrorBody fromString(String str) throws UcsException {
        try {
            ErrorBody errorBody = new ErrorBody();
            JSONObject jSONObject = new JSONObject(str);
            errorBody.errorCode = jSONObject.optString("errorCode");
            errorBody.errorMessage = jSONObject.optString("errorMessage");
            getColumnSpan.RemoteActionCompatParcelizer(errorBody);
            return errorBody;
        } catch (KfsValidationException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("ErrorBody param invalid : ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new UcsException(1001L, sbIconCompatParcelizer.toString());
        } catch (JSONException e2) {
            StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("ErrorBody param is not a valid json string : ");
            sbIconCompatParcelizer2.append(e2.getMessage());
            throw new UcsException(1001L, sbIconCompatParcelizer2.toString());
        }
    }
}
