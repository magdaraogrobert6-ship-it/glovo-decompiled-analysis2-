package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getCustomActionsdelegate {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final boundingRectInRoot IconCompatParcelizer;

    public getCustomActionsdelegate(boundingRectInRoot boundingrectinroot) {
        boundingrectinroot.getClass();
        this.IconCompatParcelizer = boundingrectinroot;
    }

    public final getTextSelectionRange serializer(getTraversalIndexdelegate gettraversalindexdelegate) {
        int i = 2 % 2;
        gettraversalindexdelegate.getClass();
        metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacksWrite = this.IconCompatParcelizer.write();
        String str = gettraversalindexdelegate.userId;
        long j = gettraversalindexdelegate.expiresIn;
        String str2 = gettraversalindexdelegate.email;
        String str3 = (String) onContentCardDismissed.MediaMetadataCompat(gettraversalindexdelegate.roles);
        String str4 = gettraversalindexdelegate.accessToken;
        String str5 = gettraversalindexdelegate.contractType;
        List list = gettraversalindexdelegate.countries;
        String str6 = metamarkupdatedandhascallbacksWrite.countryCode;
        String str7 = metamarkupdatedandhascallbacksWrite.url;
        String str8 = metamarkupdatedandhascallbacksWrite.currency;
        String str9 = gettraversalindexdelegate.cityName;
        List list2 = gettraversalindexdelegate.idVerificationLocations;
        String str10 = metamarkupdatedandhascallbacksWrite.brand;
        String str11 = gettraversalindexdelegate.name;
        getTextSelectionRange gettextselectionrange = new getTextSelectionRange(str, Long.valueOf(j), str, str2, str3, str4, str5, list, str6, str7, str8, str9, gettraversalindexdelegate.cityId, list2, str10, str11, gettraversalindexdelegate.email, gettraversalindexdelegate.isNewPasswordRequired);
        int i2 = RemoteActionCompatParcelizer + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
        return gettextselectionrange;
    }
}
