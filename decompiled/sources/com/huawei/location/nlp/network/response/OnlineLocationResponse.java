package com.huawei.location.nlp.network.response;

import android.text.TextUtils;
import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.location.lite.common.http.response.BaseResponse;
import com.huawei.location.nlp.network.request.ResponseExtraInfo;

/* JADX INFO: loaded from: classes2.dex */
public class OnlineLocationResponse extends BaseResponse {
    private static final String SUCCESS = "0";
    private ResponseExtraInfo extraInfo;
    private int indoor;
    private String locateType;
    private Location position;
    private String sessionId;
    private int status;

    public ResponseExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public int getIndoor() {
        return this.indoor;
    }

    public String getLocateType() {
        return this.locateType;
    }

    public Location getPosition() {
        return this.position;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public int getStatus() {
        return this.status;
    }

    public void setExtraInfo(ResponseExtraInfo responseExtraInfo) {
        this.extraInfo = responseExtraInfo;
    }

    public void setIndoor(int i) {
        this.indoor = i;
    }

    public void setLocateType(String str) {
        this.locateType = str;
    }

    public void setPosition(Location location) {
        this.position = location;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    @Override // com.huawei.location.lite.common.http.response.BaseResponse
    public String getApiCode() {
        return this.code.isEmpty() ? SUCCESS : this.code;
    }

    @Override // com.huawei.location.lite.common.http.response.BaseResponse
    public boolean isSuccess() {
        return TextUtils.equals(this.code, SUCCESS) || TextUtils.isEmpty(this.code);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OnlineLocationResponse{code='");
        sb.append(this.code);
        sb.append("', msg='");
        sb.append(this.msg);
        sb.append("',locateType='");
        sb.append(this.locateType);
        sb.append("', indoor=");
        sb.append(this.indoor);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", extraInfo=");
        sb.append(this.extraInfo);
        sb.append(", status=");
        return af$$ExternalSyntheticOutline0.m(sb, this.status, '}');
    }
}
