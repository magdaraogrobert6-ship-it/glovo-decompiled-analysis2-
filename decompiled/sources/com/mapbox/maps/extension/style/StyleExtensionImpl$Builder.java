package com.mapbox.maps.extension.style;

import com.mapbox.maps.TransitionOptions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class StyleExtensionImpl$Builder {
    public final String style;
    public TransitionOptions transition;
    public final ArrayList layers = new ArrayList();
    public final ArrayList sources = new ArrayList();
    public final ArrayList images = new ArrayList();
    public final ArrayList models = new ArrayList();

    public StyleExtensionImpl$Builder(String str) {
        this.style = str;
    }
}
