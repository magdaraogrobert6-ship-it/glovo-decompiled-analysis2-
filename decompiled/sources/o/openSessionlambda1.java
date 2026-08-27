package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;

/* JADX INFO: loaded from: classes3.dex */
public final class openSessionlambda1 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final unpackMetaLastChildOffset serializer;
    public final transferSessionPackageI write;

    public openSessionlambda1(unpackMetaLastChildOffset unpackmetalastchildoffset, transferSessionPackageI transfersessionpackagei) {
        this.serializer = unpackmetalastchildoffset;
        this.write = transfersessionpackagei;
    }

    public final String serializer(double d, String str, boolean z) {
        String symbol;
        int i = 2 % 2;
        int i2 = read + 37;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        String strM = "";
        if (!((FirebaseRemoteConfigImpl) this.write).RemoteActionCompatParcelizer(updateAdidI.IS_SYSTEM_CURRENCY_FORMATTING_ENABLED)) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(java.util.Locale.getDefault());
            decimalFormatSymbols.setDecimalSeparator('.');
            DecimalFormat decimalFormat = new DecimalFormat("0.00", decimalFormatSymbols);
            if (d != 0.0d || z) {
                strM = af$$ExternalSyntheticOutline0.m(decimalFormat.format(d), " ", str);
            } else {
                int i4 = read + 105;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            return hideCurrentlyDisplayingInAppMessage.read((CharSequence) strM).toString();
        }
        int i6 = IconCompatParcelizer + 45;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(java.util.Locale.getDefault());
        String strWrite = currencyInstance.format(d);
        Currency currency = currencyInstance.getCurrency();
        if (currency != null && (symbol = currency.getSymbol()) != null) {
            int i8 = read + 13;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                strWrite.getClass();
                strWrite = setCarryoverInAppMessage.write(strWrite, symbol, str);
                int i9 = 99 / 0;
            } else {
                strWrite.getClass();
                strWrite = setCarryoverInAppMessage.write(strWrite, symbol, str);
            }
        }
        if (d == 0.0d && !z) {
            return "";
        }
        strWrite.getClass();
        return hideCurrentlyDisplayingInAppMessage.read((CharSequence) strWrite).toString();
    }
}
