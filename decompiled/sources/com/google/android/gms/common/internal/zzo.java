package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.common.ConnectionResult;
import com.roadrunner.rider.support.implementation.data.RiderSupportBatchRequestLogger;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.QueryListener;
import o.accessgetThreecp;
import o.accessgetTvAudioDescriptionMixingVolumeUpcp;
import o.accessgetTvNumberEntrycp;
import o.composeToViewOffset;
import o.setFontSizeR2X_6o;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class zzo implements ServiceConnection {
    public final accessgetThreecp MediaBrowserCompatMediaItem;
    public ComponentName MediaMetadataCompat;
    public boolean RemoteActionCompatParcelizer;
    public IBinder read;
    public final /* synthetic */ zzq write;
    private static final byte[] $$b = {85, -79, -103, -49};
    private static final int $$c = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int PlaybackStateCompatCustomAction = 0;
    private static int ParcelableVolumeInfo = 1;
    private static char RatingCompat = 32049;
    private static char MediaDescriptionCompat = 60003;
    private static char MediaSessionCompatQueueItem = 1342;
    private static char MediaSessionCompatToken = 53615;
    public final HashMap IconCompatParcelizer = new HashMap();
    public int serializer = 2;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$d(short r5, short r6, int r7) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r0 = com.google.android.gms.common.internal.zzo.$$b
            int r6 = r6 * 2
            int r6 = 109 - r6
            int r5 = r5 * 4
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r5
            r3 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r3 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzo.$$d(short, short, int):java.lang.String");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzq zzqVar = this.write;
        synchronized (zzqVar.read) {
            zzqVar.MediaSessionCompatQueueItem.removeMessages(1, this.MediaBrowserCompatMediaItem);
            this.read = iBinder;
            this.MediaMetadataCompat = componentName;
            Iterator it = this.IconCompatParcelizer.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.serializer = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzq zzqVar = this.write;
        synchronized (zzqVar.read) {
            zzqVar.MediaSessionCompatQueueItem.removeMessages(1, this.MediaBrowserCompatMediaItem);
            this.read = null;
            this.MediaMetadataCompat = componentName;
            Iterator it = this.IconCompatParcelizer.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.serializer = 2;
        }
    }

    public zzo(zzq zzqVar, accessgetThreecp accessgetthreecp) {
        this.write = zzqVar;
        this.MediaBrowserCompatMediaItem = accessgetthreecp;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 85;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onServiceDisconnected(componentName);
        int i4 = PlaybackStateCompatCustomAction + 103;
        ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $$a(long j, long j2) throws Throwable {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 49;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getLongPressTimeout() >> 16) + 9, new char[]{16616, 64763, 50948, 4661, 2279, 3335, 12068, 35920, 42542, 6858}, objArr);
        RiderSupportBatchRequestLogger.class.getField((String) objArr[0]).get(null);
        Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj != null) {
                Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                int i4 = PlaybackStateCompatCustomAction + 71;
                ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Object[] objArr2 = {Long.valueOf(j3)};
                Object[] objArr3 = new Object[1];
                a(4 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{62302, 47320, 47040, 26996}, objArr3);
                Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj2, objArr2);
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr4 = new Object[0];
                Object[] objArr5 = new Object[1];
                a(36 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{43328, 14344, 40045, 20103, 57308, 55092, 25770, 9760, 48669, 12688, 26157, 4938, 49008, 16027, 6130, 43382, 61704, 21884, 23237, 60690, 57308, 55092, 1237, 39807, 19617, 57826, 51358, 7109, 54339, 23512, 58404, 47314, 42538, 18332, 17209, 46678, 59420, 25714}, objArr5);
                Object[] objArr6 = {(String) objArr5[0], objArr4};
                Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                method2.setAccessible(true);
                method2.invoke(obj3, objArr6);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        composeToViewOffset composetoviewoffset = new composeToViewOffset();
        char[] cArr2 = new char[cArr.length];
        composetoviewoffset.RemoteActionCompatParcelizer = 0;
        char[] cArr3 = new char[2];
        while (composetoviewoffset.RemoteActionCompatParcelizer < cArr.length) {
            cArr3[0] = cArr[composetoviewoffset.RemoteActionCompatParcelizer];
            cArr3[1] = cArr[composetoviewoffset.RemoteActionCompatParcelizer + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                int i5 = $10 + 83;
                $11 = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i3) ^ ((c2 << 4) + ((char) (((long) MediaSessionCompatQueueItem) ^ 7962313315467514595L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(MediaSessionCompatToken)};
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-925634939);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (Color.green(0) + 65450), 1244 - (KeyEvent.getMaxKeyCode() >> 16), 33 - (Process.myTid() >> 22), 402902884, false, $$d(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) RatingCompat) ^ 7962313315467514595L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(MediaDescriptionCompat)};
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-925634939);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (65449 - TextUtils.indexOf((CharSequence) "", '0')), 1243 - Process.getGidForName(""), ExpandableListView.getPackedPositionChild(0L) + 34, 402902884, false, $$d(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[composetoviewoffset.RemoteActionCompatParcelizer] = cArr3[0];
            cArr2[composetoviewoffset.RemoteActionCompatParcelizer + 1] = cArr3[1];
            Object[] objArr4 = {composetoviewoffset, composetoviewoffset};
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(547433723);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b5 = (byte) 0;
                byte b6 = (byte) (b5 + 1);
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) Color.alpha(0), TextUtils.getOffsetBefore("", 0) + 2546, Color.blue(0) + 30, -261026534, false, $$d(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            int i7 = $10 + 57;
            $11 = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        String str = new String(cArr2, 0, i);
        int i9 = $11 + 73;
        $10 = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i10 = 54 / 0;
            objArr[0] = str;
        }
    }

    public final ConnectionResult IconCompatParcelizer(String str, Executor executor) {
        int i = 2 % 2;
        try {
            Intent intentWrite = zzah.write(this.write.MediaBrowserCompatMediaItem, this.MediaBrowserCompatMediaItem);
            this.serializer = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(accessgetTvNumberEntrycp.write(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                zzq zzqVar = this.write;
                accessgetTvAudioDescriptionMixingVolumeUpcp accessgettvaudiodescriptionmixingvolumeupcp = zzqVar.MediaMetadataCompat;
                Context context = zzqVar.MediaBrowserCompatMediaItem;
                accessgetThreecp accessgetthreecp = this.MediaBrowserCompatMediaItem;
                boolean zIconCompatParcelizer = accessgettvaudiodescriptionmixingvolumeupcp.IconCompatParcelizer(context, str, intentWrite, this, 4225, executor);
                this.RemoteActionCompatParcelizer = zIconCompatParcelizer;
                if (!(!zIconCompatParcelizer)) {
                    zzqVar.MediaSessionCompatQueueItem.sendMessageDelayed(zzqVar.MediaSessionCompatQueueItem.obtainMessage(1, accessgetthreecp), zzqVar.RatingCompat);
                    ConnectionResult connectionResult = ConnectionResult.write;
                    StrictMode.setVmPolicy(vmPolicy);
                    int i2 = PlaybackStateCompatCustomAction + 11;
                    ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return connectionResult;
                }
                this.serializer = 2;
                try {
                    zzqVar.MediaMetadataCompat.IconCompatParcelizer(zzqVar.MediaBrowserCompatMediaItem, this);
                } catch (IllegalArgumentException unused) {
                }
                ConnectionResult connectionResult2 = new ConnectionResult(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                int i4 = ParcelableVolumeInfo + 113;
                PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return connectionResult2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (zzaf e) {
            return e.read;
        }
    }
}
