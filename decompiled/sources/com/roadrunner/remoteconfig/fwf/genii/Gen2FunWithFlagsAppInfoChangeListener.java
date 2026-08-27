package com.roadrunner.remoteconfig.fwf.genii;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.fwf_client.FwFClient;
import com.deliveryhero.fwf_client.FwFClientExtensionKt;
import com.deliveryhero.fwf_evaluator.model.User;
import com.roadrunner.logger.api.data.AppInfoChangedListener;
import java.util.Map;
import o.ExecutableQueryexecuteAsOneOrNull1;
import o.executeAsOneOrNull;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.removeNodeAtDepth;
import o.safeSetClipToOutline;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class Gen2FunWithFlagsAppInfoChangeListener implements AppInfoChangedListener {
    private static int read = 0;
    private static int serializer = 1;
    public final FwFClient IconCompatParcelizer;

    public Gen2FunWithFlagsAppInfoChangeListener(FwFClient fwFClient) {
        this.IconCompatParcelizer = fwFClient;
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateUserProperty(String str, String str2) {
        int i = 2 % 2;
        int i2 = serializer + 25;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.getClass();
            str2.getClass();
        } else {
            str.getClass();
            str2.getClass();
            int i3 = 25 / 0;
        }
    }

    public static void read(safeSetClipToOutline safesetcliptooutline, Map map, String str, String str2) {
        int i = 2 % 2;
        int i2 = read + 77;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            str2.length();
            obj.hashCode();
            throw null;
        }
        if (str2.length() > 0) {
            Object[] objArr = {map.get(str), str2};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                safesetcliptooutline.put(str, str2);
            }
        }
        int i3 = serializer + 45;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateProperties(Map map) {
        int i = 2 % 2;
        int i2 = serializer + 15;
        read = i2 % Fields.SpotShadowColor;
        try {
            if (i2 % 2 != 0) {
                map.getClass();
                FwFClientExtensionKt.getUser(this.IconCompatParcelizer).setAttributes(map);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            map.getClass();
            FwFClientExtensionKt.getUser(this.IconCompatParcelizer).setAttributes(map);
            int i3 = serializer + 61;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "FwF Gen II: updateProperties failed.", new Object[0]);
        }
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void onInfoUpdated(executeAsOneOrNull executeasoneornull) {
        int i = 2 % 2;
        executeasoneornull.getClass();
        try {
            updateUserProperties(executeasoneornull.MediaMetadataCompat);
            User user = FwFClientExtensionKt.getUser(this.IconCompatParcelizer);
            Map<String, Object> attributes = user.getAttributes();
            safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
            read(safesetcliptooutline, attributes, "brand", executeasoneornull.IconCompatParcelizer);
            read(safesetcliptooutline, attributes, "city", executeasoneornull.RemoteActionCompatParcelizer);
            read(safesetcliptooutline, attributes, "contract_type", executeasoneornull.serializer);
            String str = executeasoneornull.read;
            if (str != null) {
                int i2 = serializer + 71;
                read = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    read(safesetcliptooutline, attributes, "shift_id", str);
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                read(safesetcliptooutline, attributes, "shift_id", str);
            }
            safeSetClipToOutline safesetcliptooutlineIconCompatParcelizer = safesetcliptooutline.IconCompatParcelizer();
            if (safesetcliptooutlineIconCompatParcelizer.isEmpty()) {
                return;
            }
            user.setAttributes(safesetcliptooutlineIconCompatParcelizer);
            int i3 = serializer + 125;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "FwF Gen II: onInfoUpdated failed.", new Object[0]);
        }
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateUserProperties(ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1) {
        int i = 2 % 2;
        int i2 = read + 55;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        executableQueryexecuteAsOneOrNull1.getClass();
        String str = executableQueryexecuteAsOneOrNull1.read;
        String str2 = executableQueryexecuteAsOneOrNull1.RemoteActionCompatParcelizer;
        try {
            User user = FwFClientExtensionKt.getUser(this.IconCompatParcelizer);
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{user.getAuthUserId(), executableQueryexecuteAsOneOrNull1.read()}, getCieXyz.write())).booleanValue()) {
                    user.setAuthUserId(executableQueryexecuteAsOneOrNull1.read());
                }
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{user.getUnAuthUserId(), str2}, getCieXyz.write())).booleanValue()) {
                int i4 = serializer + 41;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    user.setUnAuthUserId(str2);
                    Object obj = null;
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                user.setUnAuthUserId(str2);
            }
            Map<String, Object> attributes = user.getAttributes();
            safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
            read(safesetcliptooutline, attributes, "employee_id", str);
            read(safesetcliptooutline, attributes, PushNotificationParserObj.COUNTRY_KEY, executableQueryexecuteAsOneOrNull1.serializer);
            read(safesetcliptooutline, attributes, "device_id", str2);
            safeSetClipToOutline safesetcliptooutlineIconCompatParcelizer = safesetcliptooutline.IconCompatParcelizer();
            if (!safesetcliptooutlineIconCompatParcelizer.isEmpty()) {
                user.setAttributes(safesetcliptooutlineIconCompatParcelizer);
            }
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "FwF Gen II: updateUserProperties failed.", new Object[0]);
        }
    }
}
