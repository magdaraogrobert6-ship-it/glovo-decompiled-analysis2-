package com.huawei.wisesecurity.ucs_credential;

import android.content.Context;
import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.location.logic.zp;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.common.utils.SpUtil;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.entity.ErrorBody;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkResponse;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.nio.charset.StandardCharsets;
import o.accessgetCarouselcp;
import o.accessgetDropdownListcp;
import o.accessgetSwitchcp;
import o.getSteps;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends accessgetCarouselcp {
    public boolean MediaDescriptionCompat;
    public x MediaMetadataCompat;

    @Override // o.accessgetCarouselcp
    public final String b() {
        Context context = this.RemoteActionCompatParcelizer;
        int i = SpUtil.getInstance(context).getInt("Local-C1-Version", -1);
        getSteps.IconCompatParcelizer("KidHandler", af$$ExternalSyntheticOutline0.m(i, "c1 version is ", (int) UcsLib.ucsGetSoVersion(), ", so version is "), new Object[0]);
        return new String(UcsLib.genReqJws(context, this.write, this.serializer, 0, i), StandardCharsets.UTF_8);
    }

    @Override // o.accessgetCarouselcp
    public final Credential RemoteActionCompatParcelizer(String str) throws UcsException {
        try {
            int i = Integer.parseInt(new JSONObject(str).getString("expire"));
            if (i == 0) {
                return this.MediaSessionCompatQueueItem.genCredentialFromString(str);
            }
            if (i != 1) {
                if (i != 2) {
                    MapboxMap$$ExternalSyntheticLambda0.m(1017L, "unenable expire.");
                    return null;
                }
                MapboxMap$$ExternalSyntheticLambda0.m(1016L, "so version is unenable.");
                return null;
            }
            if (!this.MediaDescriptionCompat) {
                MapboxMap$$ExternalSyntheticLambda0.m(1021L, "c1 vision is unenable.");
                return null;
            }
            getSteps.IconCompatParcelizer("KidHandler", "c1 version expired, start to force update c1!", new Object[0]);
            this.MediaMetadataCompat.write(true, new g0(0));
            this.MediaDescriptionCompat = false;
            return write(this.IconCompatParcelizer, this.write, this.serializer, this.MediaBrowserCompatMediaItem);
        } catch (NumberFormatException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("parse TSMS resp expire error : ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new UcsException(2001L, sbIconCompatParcelizer.toString());
        } catch (JSONException e2) {
            StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("parse TSMS resp get json error : ");
            sbIconCompatParcelizer2.append(e2.getMessage());
            throw new UcsException(1002L, sbIconCompatParcelizer2.toString());
        }
    }

    @Override // o.accessgetCarouselcp
    public final String RemoteActionCompatParcelizer(NetworkResponse networkResponse) throws UcsException {
        boolean zIsSuccessful = networkResponse.isSuccessful();
        String body = networkResponse.getBody();
        if (zIsSuccessful) {
            return body;
        }
        ErrorBody errorBodyFromString = ErrorBody.fromString(body);
        StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("tsms service error, ");
        sbIconCompatParcelizer.append(errorBodyFromString.getErrorMessage());
        String string = sbIconCompatParcelizer.toString();
        throw accessgetDropdownListcp.IconCompatParcelizer("KidHandler", string, new Object[0], 1024L, string);
    }

    @Override // o.accessgetCarouselcp
    public final void a() {
        x xVar = this.MediaMetadataCompat;
        g0 g0Var = new g0(0);
        long j = SpUtil.getInstance((Context) xVar.RemoteActionCompatParcelizer).getLong("Last-Query-Time_ucscomponent_ucscomponent.jws", 0L);
        getSteps.read("LocalCDNFile", af$$ExternalSyntheticOutline0.m(j, "lastQueryTime is "), new Object[0]);
        if (System.currentTimeMillis() - j > 432000000) {
            xVar.write(false, g0Var);
            return;
        }
        try {
            w.a((Context) xVar.RemoteActionCompatParcelizer);
        } catch (UcsException e) {
            long j2 = e.IconCompatParcelizer.delayRemaining;
            getSteps.write.write(getSteps.IconCompatParcelizer("KeyComponentManger"), getSteps.RemoteActionCompatParcelizer("KeyComponentManger", "Init using local file failed, code = {0}, msg = {1}", Long.valueOf(j2), e.getMessage()));
            getSteps.read("KeyComponentManger", "Try update data = componnet from server", new Object[0]);
            xVar.write(true, g0Var);
        }
    }

    @Override // o.accessgetCarouselcp
    public final Credential serializer(String str, String str2, String str3, String str4, zp zpVar) {
        getSteps.read("KidHandler", "applyCredential use KidHandler.", new Object[0]);
        return write(str, str2, str3, str4);
    }

    public e0(CredentialClient credentialClient, Context context, NetworkCapability networkCapability) {
        super(credentialClient, context, networkCapability);
    }
}
