package o;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class accessresolvePointerPrecision implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public static final accessresolvePointerPrecision RemoteActionCompatParcelizer = new accessresolvePointerPrecision(1);
    public static final accessresolvePointerPrecision serializer = new accessresolvePointerPrecision(2);
    public static final accessresolvePointerPrecision IconCompatParcelizer = new accessresolvePointerPrecision(3);
    public static final accessresolvePointerPrecision write = new accessresolvePointerPrecision(4);
    public static final accessresolvePointerPrecision RatingCompat = new accessresolvePointerPrecision(5);
    public static final accessresolvePointerPrecision MediaSessionCompatQueueItem = new accessresolvePointerPrecision(6);
    public static final accessresolvePointerPrecision MediaDescriptionCompat = new accessresolvePointerPrecision(7);
    public static final accessresolvePointerPrecision read = new accessresolvePointerPrecision(0);

    public /* synthetic */ accessresolvePointerPrecision(int i) {
        this.MediaBrowserCompatMediaItem = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.MediaBrowserCompatMediaItem;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                getPostalCode getpostalcode = (getPostalCode) ((getBirthDateFull) obj);
                getpostalcode.serializer(-511854661);
                androidx.compose.material3.BottomSheetDefaults bottomSheetDefaults = androidx.compose.material3.BottomSheetDefaults.write;
                WeakHashMap weakHashMap = TooltipKt.serializer;
                SheetStateanimateTo2 sheetStateanimateTo2 = new SheetStateanimateTo2(setRoundRectOutlineTNW_H78default.read(getpostalcode).MediaSessionCompatResultReceiverWrapper, 48);
                getpostalcode.IconCompatParcelizer(false);
                return sheetStateanimateTo2;
            case 1:
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                int iIntValue = ((Number) obj2).intValue();
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
                if (!getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 2:
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode3.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.material3.BottomSheetDefaults.write.read(null, 0.0f, 0.0f, null, 0L, getpostalcode3, 196608);
                } else {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 3:
                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull3;
                if (!getpostalcode4.write(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 4:
                getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull4;
                if (!getpostalcode5.write(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 5:
                getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull5;
                if (!getpostalcode6.write(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 6:
                getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                getPostalCode getpostalcode7 = (getPostalCode) getbirthdatefull6;
                if (!getpostalcode7.write(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            default:
                getBirthDateFull getbirthdatefull7 = (getBirthDateFull) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                getPostalCode getpostalcode8 = (getPostalCode) getbirthdatefull7;
                if (!getpostalcode8.write(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    getpostalcode8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
        }
    }
}
