package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class actualChainPathEffect extends toComposePathEffect {
    public final Class IconCompatParcelizer;

    public actualChainPathEffect(Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.IconCompatParcelizer = cls;
        } else {
            getTrackDrawable.IconCompatParcelizer(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // o.toComposePathEffect, o.asAndroidPathEffect
    public final String serializer() {
        return this.IconCompatParcelizer.getName();
    }

    @Override // o.toComposePathEffect
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final Enum IconCompatParcelizer(String str) {
        Object obj;
        str.getClass();
        Class cls = this.IconCompatParcelizer;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (setCarryoverInAppMessage.serializer(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r4 = (Enum) obj;
        if (r4 != null) {
            return r4;
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Enum value ", str, " not found for type ");
        sbM.append(cls.getName());
        sbM.append('.');
        throw new IllegalArgumentException(sbM.toString());
    }
}
