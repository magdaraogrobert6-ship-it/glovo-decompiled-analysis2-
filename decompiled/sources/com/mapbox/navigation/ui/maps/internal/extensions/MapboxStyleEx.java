package com.mapbox.navigation.ui.maps.internal.extensions;

import com.mapbox.maps.Style;
import o.getCieXyz;
import o.getInAppMessageEventMap;
import o.getIsCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MapboxStyleEx {
    public static final getInAppMessageEventMap STYLE_URI_REGEX = new getInAppMessageEventMap("mapbox://styles/(.+)/(.+)");

    public static final String getStyleId(Style style) {
        String styleURI = style.getStyleURI();
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{styleURI, "mapbox://styles/mapbox/navigation-day-v1"}, iWrite3)).booleanValue()) {
            return "navigation-day-v1";
        }
        int iWrite4 = getCieXyz.write();
        int iWrite5 = getCieXyz.write();
        int iWrite6 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{styleURI, "mapbox://styles/mapbox/navigation-night-v1"}, iWrite6)).booleanValue()) {
            return "navigation-night-v1";
        }
        getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage = getInAppMessageEventMap.read(STYLE_URI_REGEX, style.getStyleURI());
        if (getiscurrentlydisplayinginappmessage != null) {
            return (String) onContentCardDismissed.MediaBrowserCompatMediaItem(getiscurrentlydisplayinginappmessage.IconCompatParcelizer());
        }
        return null;
    }
}
