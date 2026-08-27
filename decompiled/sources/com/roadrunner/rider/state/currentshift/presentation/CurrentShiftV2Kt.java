package com.roadrunner.rider.state.currentshift.presentation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.room.RoomDatabase$createConnectionManager$2;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import o.AndroidContentCaptureManager;
import o.PaddingValuesYgX7TsAdefault;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getQueryContext;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.setAttributionHandler;
import o.setConnectionOptions;
import o.setGdprUrl;
import o.setHttpsURLConnectionProvider;
import o.u6;
import o.xb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CurrentShiftV2Kt {
    private static int read = 1;
    private static int serializer;

    public static final void CurrentShiftV2(setHttpsURLConnectionProvider sethttpsurlconnectionprovider, xb xbVar, u6 u6Var, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        sethttpsurlconnectionprovider.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-153856089);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(sethttpsurlconnectionprovider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(xbVar)) {
                int i5 = serializer + 49;
                read = i5 % Fields.SpotShadowColor;
                i3 = i5 % 2 == 0 ? 72 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(u6Var) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 2048 : Fields.RotationZ;
            int i6 = serializer + 35;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        int i8 = i2 | 24576;
        if (getpostalcode.write(i8 & 1, (i8 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion;
            getQueryContext getquerycontext = sethttpsurlconnectionprovider.RemoteActionCompatParcelizer;
            boolean z = (i8 & 7168) == 2048;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new PaddingValuesYgX7TsAdefault(2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                getpostalcode.write(objComponentActivity);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 8);
            setGdprUrl setgdprurl = (setGdprUrl) ExtrasKt.write(sethttpsurlconnectionprovider.MediaBrowserCompatMediaItem, getpostalcode, 0).getValue();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setgdprurl, setAttributionHandler.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                getpostalcode.serializer(-1826792789);
                getpostalcode.IconCompatParcelizer(false);
            } else if (setgdprurl instanceof setConnectionOptions) {
                getpostalcode.serializer(-795939888);
                setConnectionOptions setconnectionoptions = (setConnectionOptions) setgdprurl;
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(sethttpsurlconnectionprovider);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer || objComponentActivity2 == androidContentCaptureManager) {
                    RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = new RoomDatabase$createConnectionManager$2(2, sethttpsurlconnectionprovider, setHttpsURLConnectionProvider.class, "onCalendarClicked", "onCalendarClicked(ILjava/lang/String;)V", 0, 24);
                    getpostalcode.write(roomDatabase$createConnectionManager$2);
                    objComponentActivity2 = roomDatabase$createConnectionManager$2;
                }
                CurrentShiftV2ColumnKt.CurrentShiftV2Column(setconnectionoptions, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity2), xbVar, u6Var, companion, getpostalcode, ((i8 << 3) & 8064) | (57344 & i8));
                getpostalcode.IconCompatParcelizer(false);
            } else {
                throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1826796155, false);
            }
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(sethttpsurlconnectionprovider, xbVar, u6Var, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier2, i, 14);
        }
    }
}
