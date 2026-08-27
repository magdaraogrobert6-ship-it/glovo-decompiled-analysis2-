package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class CacheDrawModifierNodeImplgetOrBuildCachedDrawBlock11 {
    public int IconCompatParcelizer;
    public final String write;

    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer >= this.write.length();
    }

    public final boolean read(char c) {
        int i = this.IconCompatParcelizer;
        String str = this.write;
        return i < str.length() && str.charAt(this.IconCompatParcelizer) == c;
    }

    public final void serializer(String str) throws androidx.compose.runtime.tooling.ParseException {
        int i = this.IconCompatParcelizer;
        String str2 = this.write;
        int iMin = Math.min(i, str2.length());
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Error while parsing source information: ", str, " at ");
        sbM.append(str2.substring(0, iMin));
        sbM.append('|');
        sbM.append(str2.substring(iMin));
        throw new androidx.compose.runtime.tooling.ParseException(sbM.toString());
    }

    public final String write(String str) {
        String str2;
        int i = this.IconCompatParcelizer;
        while (true) {
            int i2 = this.IconCompatParcelizer;
            str2 = this.write;
            if (i2 >= str2.length() || hideCurrentlyDisplayingInAppMessage.read(str, str2.charAt(this.IconCompatParcelizer))) {
                break;
            }
            this.IconCompatParcelizer++;
        }
        int i3 = this.IconCompatParcelizer;
        return i3 > i ? str2.substring(i, i3) : "";
    }

    public final void write() throws androidx.compose.runtime.tooling.ParseException {
        if (read(')')) {
            return;
        }
        serializer("expected )");
        throw null;
    }

    public CacheDrawModifierNodeImplgetOrBuildCachedDrawBlock11(String str) {
        this.write = str;
    }

    public final int IconCompatParcelizer(String str) throws androidx.compose.runtime.tooling.ParseException {
        Integer numMediaSessionCompatQueueItem = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, write(str));
        if (numMediaSessionCompatQueueItem != null) {
            return numMediaSessionCompatQueueItem.intValue();
        }
        serializer("expected int");
        throw null;
    }
}
