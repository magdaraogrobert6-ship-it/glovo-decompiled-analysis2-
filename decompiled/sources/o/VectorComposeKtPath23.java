package o;

import android.net.Uri;
import com.deliveryhero.selfServiceChat.domain.exceptions.GlobalEntityNotSetException;
import com.deliveryhero.selfServiceChat.domain.exceptions.InvalidVerificationToken;
import com.deliveryhero.selfServiceChat.domain.exceptions.LocaleNotSetException;
import com.deliveryhero.selfServiceChat.domain.exceptions.OrderIDNotSetException;
import com.deliveryhero.selfServiceChat.domain.exceptions.UserTypeNotSetException;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorComposeKtPath23 {
    public final setOutlineAmbientShadowColor serializer;

    public VectorComposeKtPath23(setOutlineAmbientShadowColor setoutlineambientshadowcolor) {
        this.serializer = setoutlineambientshadowcolor;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    public final String read(String str) throws UserTypeNotSetException, GlobalEntityNotSetException, OrderIDNotSetException, InvalidVerificationToken, LocaleNotSetException {
        SurfaceUtils surfaceUtils;
        String str2;
        String str3;
        String strName;
        String str4;
        str.getClass();
        LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) this.serializer).write();
        if (layerSnapshotV21Write == null || (surfaceUtils = layerSnapshotV21Write.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) == null || (str2 = surfaceUtils.dhAuthToken) == null) {
            throw new com.deliveryhero.customerchat.commons.UserNotRegisteredException();
        }
        LayerSnapshot_androidKt layerSnapshot_androidKt = layerSnapshotV21Write.write;
        if (layerSnapshot_androidKt == null || (str3 = layerSnapshot_androidKt.globalEntityID) == null) {
            throw new GlobalEntityNotSetException("GlobalEntityID is not set in chat configuration");
        }
        String str5 = layerSnapshotV21Write.RatingCompat;
        if (str5 == null) {
            throw LocaleNotSetException.read;
        }
        String str6 = layerSnapshotV21Write.IconCompatParcelizer;
        if (str6 == null) {
            str6 = "customer-rider-chat-user@mail.com";
        }
        String str7 = layerSnapshotV21Write.ParcelableVolumeInfo;
        if (str7 == null) {
            throw OrderIDNotSetException.read;
        }
        String str8 = layerSnapshotV21Write.read;
        if (str8 == null) {
            throw new com.deliveryhero.customerchat.commons.BlankChannelIDException();
        }
        resolveLockHardwareCanvasMethod resolvelockhardwarecanvasmethod = layerSnapshot_androidKt.userType;
        if (resolvelockhardwarecanvasmethod == null || (strName = resolvelockhardwarecanvasmethod.name()) == null) {
            throw UserTypeNotSetException.serializer;
        }
        String lowerCase = strName.toLowerCase(java.util.Locale.ROOT);
        lowerCase.getClass();
        String strRemoteActionCompatParcelizer = layerSnapshotV21Write.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer == null) {
            throw InvalidVerificationToken.read;
        }
        getAmbientShadowColor getambientshadowcolor = layerSnapshotV21Write.MediaSessionCompatToken;
        getambientshadowcolor.getClass();
        if (getambientshadowcolor instanceof RenderNodeVerificationHelper28) {
            str4 = ((RenderNodeVerificationHelper28) getambientshadowcolor).preferredLanguage;
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4)) {
                str4 = null;
            }
        } else {
            str4 = null;
        }
        Uri uri = Uri.parse(str);
        uri.getClass();
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.path("/chat/".concat(str8));
        String encodedFragment = uri.getEncodedFragment();
        String strWrite = encodedFragment != null ? hideCurrentlyDisplayingInAppMessage.write(encodedFragment, "?") : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (strWrite != null && strWrite.length() != 0) {
            Uri uri2 = Uri.parse("http://dummy/?".concat(strWrite));
            uri2.getClass();
            for (String str9 : uri2.getQueryParameterNames()) {
                String queryParameter = uri2.getQueryParameter(str9);
                if (queryParameter != null) {
                    str9.getClass();
                    linkedHashMap.put(str9, queryParameter);
                }
            }
        }
        Iterator it = androidx.sqlite.SQLite.read("bridge", "service_type", "order_id", "email", "locale", "p2p_chat_token", "platform_token", "global_entity_id", "verification_token").iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((String) it.next());
        }
        linkedHashMap.put("service_type", lowerCase);
        linkedHashMap.put("order_id", str7);
        linkedHashMap.put("email", str6);
        linkedHashMap.put("locale", str5);
        linkedHashMap.put("p2p_chat_token", str2);
        linkedHashMap.put("platform_token", str2);
        linkedHashMap.put("bridge", "true");
        linkedHashMap.put("global_entity_id", str3);
        linkedHashMap.put("verification_token", strRemoteActionCompatParcelizer);
        if (str4 != null) {
            linkedHashMap.put("language", str4);
        }
        Set setEntrySet = linkedHashMap.entrySet();
        setEntrySet.getClass();
        String string = builderBuildUpon.encodedFragment(onContentCardDismissed.IconCompatParcelizer(setEntrySet, ContainerUtils.FIELD_DELIMITER, null, null, VectorComposeKtPath25.RemoteActionCompatParcelizer, 30)).build().toString();
        string.getClass();
        return string;
    }
}
