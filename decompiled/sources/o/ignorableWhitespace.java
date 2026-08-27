package o;

import android.net.Uri;
import com.huawei.hms.framework.common.ContainerUtils;
import com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ignorableWhitespace {
    private static int IconCompatParcelizer = 0;
    private static int MediaMetadataCompat = 1;
    public final AnnotatedStringExhaustiveAnnotation RemoteActionCompatParcelizer;
    public final requireIndexInRange read;
    public final TextUnitType serializer;
    public final r8lambdaVSwqKAPZUGoM32l5XH3Xl8tsgCE write;

    public ignorableWhitespace(TextUnitType textUnitType, AnnotatedStringExhaustiveAnnotation annotatedStringExhaustiveAnnotation, requireIndexInRange requireindexinrange, r8lambdaVSwqKAPZUGoM32l5XH3Xl8tsgCE r8lambdavswqkapzugom32l5xh3xl8tsgce) {
        textUnitType.getClass();
        annotatedStringExhaustiveAnnotation.getClass();
        requireindexinrange.getClass();
        r8lambdavswqkapzugom32l5xh3xl8tsgce.getClass();
        this.serializer = textUnitType;
        this.RemoteActionCompatParcelizer = annotatedStringExhaustiveAnnotation;
        this.read = requireindexinrange;
        this.write = r8lambdavswqkapzugom32l5xh3xl8tsgce;
    }

    public final String read(String str, TextUnitTypeCompanion textUnitTypeCompanion, String str2) {
        String str3;
        int i = 2 % 2;
        ChatDeliveryRepositoryImpl chatDeliveryRepositoryImpl = (ChatDeliveryRepositoryImpl) this.serializer;
        String strSerializer = chatDeliveryRepositoryImpl.serializer();
        if (strSerializer == null) {
            throw new com.roadrunner.customerchat.selfservice.domain.UserNotRegisteredException();
        }
        int i2 = MediaMetadataCompat + 5;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        String strWrite = null;
        if (i2 % 2 != 0) {
            chatDeliveryRepositoryImpl.MediaBrowserCompatMediaItem();
            this.read.read();
            chatDeliveryRepositoryImpl.write();
            strWrite.hashCode();
            throw null;
        }
        String strMediaBrowserCompatMediaItem = chatDeliveryRepositoryImpl.MediaBrowserCompatMediaItem();
        String str4 = this.read.read();
        getEmUIouoOA getemuiouooaWrite = chatDeliveryRepositoryImpl.write();
        if (getemuiouooaWrite == null || (str3 = getemuiouooaWrite.IconCompatParcelizer) == null) {
            str3 = "customer-rider-chat-user@mail.com";
        }
        String strSerializer2 = textUnitTypeCompanion.serializer();
        String strRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer == null || !(!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strRemoteActionCompatParcelizer))) {
            strRemoteActionCompatParcelizer = null;
        }
        Uri uri = Uri.parse(str);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.path("/chat/".concat(str2));
        String encodedFragment = uri.getEncodedFragment();
        if (encodedFragment != null) {
            strWrite = hideCurrentlyDisplayingInAppMessage.write(encodedFragment, "?");
            int i3 = MediaMetadataCompat + 79;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (strWrite != null) {
            int i5 = IconCompatParcelizer + 87;
            MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (strWrite.length() != 0) {
                Uri uri2 = Uri.parse("http://dummy/?".concat(strWrite));
                for (String str5 : uri2.getQueryParameterNames()) {
                    String queryParameter = uri2.getQueryParameter(str5);
                    if (queryParameter != null) {
                        linkedHashMap.put(str5, queryParameter);
                    }
                }
            }
        }
        Iterator it = androidx.sqlite.SQLite.read("bridge", "service_type", "order_id", "email", "locale", "p2p_chat_token", "platform_token", "global_entity_id", "verification_token").iterator();
        while (it.hasNext()) {
            int i7 = MediaMetadataCompat + 69;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            linkedHashMap.remove((String) it.next());
        }
        this.RemoteActionCompatParcelizer.getClass();
        linkedHashMap.put("service_type", "rider");
        linkedHashMap.put("order_id", strSerializer2);
        linkedHashMap.put("email", str3);
        linkedHashMap.put("locale", str4);
        linkedHashMap.put("p2p_chat_token", strSerializer);
        linkedHashMap.put("platform_token", strSerializer);
        linkedHashMap.put("bridge", "true");
        linkedHashMap.put("global_entity_id", strMediaBrowserCompatMediaItem);
        linkedHashMap.put("verification_token", strSerializer);
        if (strRemoteActionCompatParcelizer != null) {
            linkedHashMap.put("language", strRemoteActionCompatParcelizer);
        }
        Set setEntrySet = linkedHashMap.entrySet();
        setEntrySet.getClass();
        String string = builderBuildUpon.encodedFragment(onContentCardDismissed.IconCompatParcelizer(setEntrySet, ContainerUtils.FIELD_DELIMITER, null, null, new accessgetTextCentercp(9), 30)).build().toString();
        string.getClass();
        return string;
    }
}
