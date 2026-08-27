package com.sentiance.sdk;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.sentiance.sdk.util.x;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class Token {
    private final Date mExpiryDate;
    private final String mTokenId;

    public Date getExpiryDate() {
        return this.mExpiryDate;
    }

    public String getTokenId() {
        return this.mTokenId;
    }

    public boolean isExpired() {
        return !this.mExpiryDate.after(x.RemoteActionCompatParcelizer());
    }

    public String toString() {
        String strSubstring;
        int length = this.mTokenId.length();
        String str = this.mTokenId;
        if (length > 32) {
            strSubstring = str.substring(0, 16);
        } else {
            strSubstring = str.length() > 12 ? this.mTokenId.substring(0, 4) : "";
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Token{mTokenId='", strSubstring, "', mExpiryDate=");
        sbM.append(this.mExpiryDate);
        sbM.append('}');
        return sbM.toString();
    }

    public Token(String str, Date date) {
        this.mTokenId = str;
        this.mExpiryDate = date;
    }
}
