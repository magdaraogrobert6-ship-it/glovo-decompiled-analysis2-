package com.qualtrics.digital;

/* JADX INFO: loaded from: classes3.dex */
class CreativeTypes {
    static final String MOBILE_EMBEDDED_FEEDBACK = "MobileEmbeddedFeedback";
    static final String NOTIFICATION = "MobileNotification";
    static final String POPOVER = "MobilePopOver";

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    public static CreativeType getCreativeTypeFromName(String str) {
        byte b;
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != -1037615855) {
            if (iHashCode != -555333939) {
                if (iHashCode == 427650979 && str.equals(POPOVER)) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals(NOTIFICATION)) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals(MOBILE_EMBEDDED_FEEDBACK)) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return CreativeType.MobileEmbeddedFeedback;
        }
        if (b == 1) {
            return CreativeType.MobileNotification;
        }
        if (b == 2) {
            return CreativeType.MobilePopOver;
        }
        QualtricsLog.logError("Creative JSON contains invalid type");
        return null;
    }
}
