package com.roadrunner.customerchat.selfservice.domain;

import androidx.compose.ui.graphics.Fields;

/* JADX INFO: loaded from: classes3.dex */
public final class InvalidGlobalEntityIdException extends Exception {
    private static int IconCompatParcelizer = 0;
    public static final InvalidGlobalEntityIdException RemoteActionCompatParcelizer = new InvalidGlobalEntityIdException("Helpcenter region could not be fetched for the provided Global Entity ID.\nPlease call setConfiguration again with DHEnvironment and Global Entity ID.");
    private static int serializer = 1;

    static {
        int i = IconCompatParcelizer + 69;
        serializer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public InvalidGlobalEntityIdException(String str) {
        super(str);
    }
}
