package com.mapbox.maps.plugin.attribution;

import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AttributionKt {
    public static final boolean isMapboxFeedback(Attribution attribution) {
        attribution.getClass();
        String str = attribution.url;
        return hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "mapbox.com", false) && (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "feedback", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "contribute", false));
    }
}
