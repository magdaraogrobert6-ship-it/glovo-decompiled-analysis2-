package com.incognia.internal;

import android.content.Context;
import android.nfc.AvailableNfcAntenna;
import android.nfc.NfcAdapter;
import android.nfc.NfcAntennaInfo;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;

/* JADX INFO: loaded from: classes2.dex */
public final class I5P {
    public final NfcAdapter BGx;

    public I5P(Context context) {
        this.BGx = NfcAdapter.getDefaultAdapter(context);
    }

    public final Boolean mbG() {
        try {
            NfcAdapter nfcAdapter = this.BGx;
            return Boolean.valueOf(nfcAdapter != null ? nfcAdapter.isEnabled() : false);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final lc BGx() {
        if (XUh.BGx(XUh.BGx, 34, 0, 2)) {
            NfcAdapter nfcAdapter = this.BGx;
            NfcAntennaInfo nfcAntennaInfo = nfcAdapter != null ? nfcAdapter.getNfcAntennaInfo() : null;
            if (nfcAntennaInfo != null) {
                List<AvailableNfcAntenna> availableNfcAntennas = nfcAntennaInfo.getAvailableNfcAntennas();
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(availableNfcAntennas, 10));
                Iterator<T> it = availableNfcAntennas.iterator();
                while (it.hasNext()) {
                    AvailableNfcAntenna availableNfcAntennaM4695m = MapboxMap$$ExternalSyntheticLambda0.m4695m(it.next());
                    arrayList.add(new XDm(availableNfcAntennaM4695m.getLocationX(), availableNfcAntennaM4695m.getLocationY()));
                }
                return new lc(arrayList, nfcAntennaInfo.getDeviceHeight(), nfcAntennaInfo.getDeviceWidth(), nfcAntennaInfo.isDeviceFoldable());
            }
        }
        return null;
    }
}
