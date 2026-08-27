package com.roadrunner.login.logging;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.TrackingEvent;
import java.util.ArrayList;
import java.util.Map;
import o.Transacter;
import o.decode;
import o.onMove;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class OtpLogger {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final decode IconCompatParcelizer;

    public OtpLogger(decode decodeVar, int i) {
        decodeVar.getClass();
        switch (i) {
            case 2:
                this.IconCompatParcelizer = decodeVar;
                break;
            case 3:
                this.IconCompatParcelizer = decodeVar;
                break;
            case 4:
                this.IconCompatParcelizer = decodeVar;
                break;
            case 5:
                this.IconCompatParcelizer = decodeVar;
                break;
            case 6:
                this.IconCompatParcelizer = decodeVar;
                break;
            case 7:
                this.IconCompatParcelizer = decodeVar;
                break;
            case 8:
                this.IconCompatParcelizer = decodeVar;
                break;
            case 9:
                this.IconCompatParcelizer = decodeVar;
                break;
            case 10:
                this.IconCompatParcelizer = decodeVar;
                break;
            case 11:
                this.IconCompatParcelizer = decodeVar;
                break;
            case 12:
                this.IconCompatParcelizer = decodeVar;
                break;
            case 13:
            case 14:
            default:
                this.IconCompatParcelizer = decodeVar;
                break;
            case 15:
                this.IconCompatParcelizer = decodeVar;
                break;
            case 16:
                this.IconCompatParcelizer = decodeVar;
                break;
            case 17:
                this.IconCompatParcelizer = decodeVar;
                break;
        }
    }

    public void IconCompatParcelizer(boolean z) {
        int i = 2 % 2;
        int i2 = read + 9;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        this.IconCompatParcelizer.logEvent(z ? "notif_test_app_permission_success" : "notif_test_app_permission_failure", null);
        int i3 = read + 85;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public void RemoteActionCompatParcelizer(boolean z) {
        String str;
        int i = 2 % 2;
        if (z) {
            int i2 = RemoteActionCompatParcelizer + 5;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 36 / 0;
            }
            str = "notif_test_token_registration_success";
        } else {
            int i4 = read + 85;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            str = "notif_test_token_registration_failure";
        }
        this.IconCompatParcelizer.logEvent(str, null);
    }

    public void read(boolean z) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        read = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        this.IconCompatParcelizer.logEvent(z ? "notif_diagnostic_success" : "notif_diagnostic_failure", null);
        int i3 = RemoteActionCompatParcelizer + 33;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public void IconCompatParcelizer(String str, boolean z) {
        String str2;
        int i = 2 % 2;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("toggle_type", str);
        if (!z) {
            int i2 = read + 101;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            str2 = "cancelled";
        } else {
            int i4 = RemoteActionCompatParcelizer + 79;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 95 / 0;
            }
            str2 = "confirmed";
        }
        this.IconCompatParcelizer.logEvent("rider_promotion_toggle_confirmation", onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, new onViewAttachedToWindowlambda0("decision", str2)));
    }

    public void RemoteActionCompatParcelizer(Transacter transacter, boolean z) {
        int i = 2 % 2;
        transacter.getClass();
        this.IconCompatParcelizer.logEvent("forgot_password_submit_succeed", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0(transacter.getParamKey(), transacter.getType()), new onViewAttachedToWindowlambda0("isResetPasswordFlexibilityEnabled", String.valueOf(z))));
        int i2 = read + 43;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public void read(Transacter transacter, boolean z) {
        int i = 2 % 2;
        transacter.getClass();
        this.IconCompatParcelizer.logEvent("forgot_password_submit", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0(transacter.getParamKey(), transacter.getType()), new onViewAttachedToWindowlambda0("isResetPasswordFlexibilityEnabled", String.valueOf(z))));
        int i2 = RemoteActionCompatParcelizer + 87;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void read(Transacter transacter, Transacter transacter2) {
        int i = 2 % 2;
        transacter.getClass();
        transacter2.getClass();
        this.IconCompatParcelizer.logEvent("reset_password_change_flow", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("origin", transacter.getType()), new onViewAttachedToWindowlambda0("destination", transacter2.getType())));
        int i2 = RemoteActionCompatParcelizer + 107;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void read(String str, Transacter transacter, boolean z) {
        int i = 2 % 2;
        str.getClass();
        transacter.getClass();
        this.IconCompatParcelizer.logEvent("forgot_password_submit_failure", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("failureReason", str), new onViewAttachedToWindowlambda0(transacter.getParamKey(), transacter.getType()), new onViewAttachedToWindowlambda0("isResetPasswordFlexibilityEnabled", String.valueOf(z))));
        int i2 = RemoteActionCompatParcelizer + 109;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public void RemoteActionCompatParcelizer(TrackingEvent trackingEvent) {
        int i;
        int i2 = 2 % 2;
        int i3 = read + 119;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        Map mapSerializer = null;
        if (i3 % 2 == 0) {
            Map map = trackingEvent.parameters;
            mapSerializer.hashCode();
            throw null;
        }
        Map map2 = trackingEvent.parameters;
        if (map2 != null) {
            ArrayList arrayList = new ArrayList(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                arrayList.add(new onViewAttachedToWindowlambda0((String) entry.getKey(), entry.getValue().toString()));
            }
            mapSerializer = onMove.serializer(arrayList);
            i = read + 17;
            RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        } else {
            i = RemoteActionCompatParcelizer + 45;
            read = i % Fields.SpotShadowColor;
        }
        int i4 = i % 2;
        this.IconCompatParcelizer.logEvent(trackingEvent.name, mapSerializer);
    }

    public /* synthetic */ OtpLogger(decode decodeVar, char c, boolean z) {
        this.IconCompatParcelizer = decodeVar;
    }
}
