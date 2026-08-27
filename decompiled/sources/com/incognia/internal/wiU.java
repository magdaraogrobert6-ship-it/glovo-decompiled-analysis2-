package com.incognia.internal;

import java.nio.charset.Charset;
import o.ensureSubscribedToInAppMessageEvents;
import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wiU {
    public static String BGx(String str) {
        Charset charset = ensureSubscribedToInAppMessageEvents.write;
        byte[] bytes = str.getBytes(charset);
        Lql lql = new Lql();
        lql.BGx(bytes);
        return hideCurrentlyDisplayingInAppMessage.read((CharSequence) new String(yEy.mbG(2, lql.BGx()), charset)).toString();
    }
}
