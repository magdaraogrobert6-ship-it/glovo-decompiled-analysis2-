package com.incognia;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.incognia.internal.Fo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
public final class CardInfo {
    private final String bin;
    private final String expiryMonth;
    private final String expiryYear;
    private final String lastFourDigits;

    public static final class Builder {
        private String bin;
        private String expiryMonth;
        private String expiryYear;
        private String lastFourDigits;

        public final Builder bin(String str) {
            this.bin = str;
            return this;
        }

        public final Builder expiryMonth(String str) {
            this.expiryMonth = str;
            return this;
        }

        public final Builder expiryYear(String str) {
            this.expiryYear = str;
            return this;
        }

        public final Builder lastFourDigits(String str) {
            this.lastFourDigits = str;
            return this;
        }

        public final CardInfo build() {
            String str = this.bin;
            if (str == null) {
                str = null;
            }
            String str2 = this.lastFourDigits;
            return new CardInfo(str, str2 != null ? str2 : null, this.expiryYear, this.expiryMonth);
        }
    }

    public final String component1() {
        return this.bin;
    }

    public final String component2() {
        return this.lastFourDigits;
    }

    public final String component3() {
        return this.expiryYear;
    }

    public final String component4() {
        return this.expiryMonth;
    }

    public final String getBin() {
        return this.bin;
    }

    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final String getExpiryYear() {
        return this.expiryYear;
    }

    public final String getLastFourDigits() {
        return this.lastFourDigits;
    }

    public final CardInfo copy(String str, String str2, String str3, String str4) {
        return new CardInfo(str, str2, str3, str4);
    }

    public int hashCode() {
        int iBGx = Fo.BGx(this.lastFourDigits, this.bin.hashCode() * 31, 31);
        String str = this.expiryYear;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.expiryMonth;
        return ((iBGx + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public static /* synthetic */ CardInfo copy$default(CardInfo cardInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardInfo.bin;
        }
        if ((i & 2) != 0) {
            str2 = cardInfo.lastFourDigits;
        }
        if ((i & 4) != 0) {
            str3 = cardInfo.expiryYear;
        }
        if ((i & 8) != 0) {
            str4 = cardInfo.expiryMonth;
        }
        return cardInfo.copy(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardInfo)) {
            return false;
        }
        CardInfo cardInfo = (CardInfo) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bin, cardInfo.bin}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.lastFourDigits, cardInfo.lastFourDigits}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.expiryYear, cardInfo.expiryYear}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.expiryMonth, cardInfo.expiryMonth}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CardInfo(bin=");
        sb.append(this.bin);
        sb.append(", lastFourDigits=");
        sb.append(this.lastFourDigits);
        sb.append(", expiryYear=");
        sb.append(this.expiryYear);
        sb.append(", expiryMonth=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.expiryMonth, ')');
    }

    public /* synthetic */ CardInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public CardInfo(String str, String str2, String str3, String str4) {
        this.bin = str;
        this.lastFourDigits = str2;
        this.expiryYear = str3;
        this.expiryMonth = str4;
    }
}
