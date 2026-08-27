package o;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;
import bo.app.af$$ExternalSyntheticOutline0;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzpg;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.roadrunner.rider.support.implementation.data.RiderSupportFeature;
import com.roadrunner.rider.support.implementation.data.RiderSupportFeature$Companion$logIn$1;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class setContent extends getOnGloballyPositioned {
    public String IconCompatParcelizer;
    public ImageKt RemoteActionCompatParcelizer;
    public HashSet read;
    public Long serializer;
    public Long write;
    private static final byte[] $$b = {76, 55, 116, -40};
    private static final int $$c = 104;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int MediaBrowserCompatMediaItem = 1417631145;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$d(int r7, byte r8, int r9) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 4
            int r7 = r7 * 3
            int r7 = r7 + 112
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = o.setContent.$$b
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r9 = r9 + 1
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContent.$$d(int, byte, int):java.lang.String");
    }

    public static void $$a(Context context, long j, long j2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 113;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j3 = j ^ (j2 << 32);
        RiderSupportFeature.Companion companion = RiderSupportFeature.Companion;
        Object obj = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
        Object[] objArr = new Object[1];
        a(android.graphics.Color.rgb(0, 0, 0) + 16777221, 14 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), Process.getGidForName("") + 290, false, new char[]{25, '\f', 6, '\b', 65475, 65525, 18, 18, 23, '\b', 7, 65475, 7, '\b'}, objArr);
        try {
            Object[] objArr2 = {Long.valueOf(j3), (String) objArr[0]};
            Object[] objArr3 = new Object[1];
            a(1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, 305 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), true, new char[]{0}, objArr3);
            Method method = af$$ExternalSyntheticOutline0.class.getMethod((String) objArr3[0], Long.TYPE, String.class);
            method.setAccessible(true);
            Object[] objArr4 = {method.invoke(null, objArr2), 10};
            Constructor declaredConstructor = accessstartTrackingTable.class.getDeclaredConstructor(String.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(objArr4);
            int i4 = MediaSessionCompatQueueItem + 51;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaMetadataCompat = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 57;
            MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            Method method2 = Timber.Forest.class.getMethod("write", Throwable.class);
            method2.setAccessible(true);
            method2.invoke(obj, objNewInstance);
            getContentViewGroupParentLayout getcontentviewgroupparentlayoutAccess$getCoroutineScope$cp = RiderSupportFeature.access$getCoroutineScope$cp();
            Constructor declaredConstructor2 = RiderSupportFeature$Companion$logIn$1.class.getDeclaredConstructor(Context.class, ShortNewsContentCardView.class);
            declaredConstructor2.setAccessible(true);
            Object[] objArr5 = {getcontentviewgroupparentlayoutAccess$getCoroutineScope$cp, null, null, declaredConstructor2.newInstance(context, null), 3};
            Method method3 = BuildersKt.class.getMethod("RemoteActionCompatParcelizer", getContentViewGroupParentLayout.class, TextAnnouncementContentCardView.class, CoroutineStart.class, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0.class, Integer.TYPE);
            method3.setAccessible(true);
            method3.invoke(null, objArr5);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final setThrottleMillis serializer(Integer num) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 5;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer.containsKey(num);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.RemoteActionCompatParcelizer.containsKey(num)) {
            int i3 = MediaMetadataCompat + 35;
            MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return (setThrottleMillis) this.RemoteActionCompatParcelizer.get(num);
        }
        setThrottleMillis setthrottlemillis = new setThrottleMillis(this, this.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer.put(num, setthrottlemillis);
        int i5 = MediaMetadataCompat + 23;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return setthrottlemillis;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0161  */
    /* JADX WARN: Code duplicated, block: B:33:0x0162  */
    private static void a(int i, int i2, int i3, boolean z, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        long j;
        Throwable cause;
        int i5 = 2 % 2;
        accesstoViewTypeGyEprt8 accesstoviewtypegyeprt8 = new accesstoViewTypeGyEprt8();
        char[] cArr2 = new char[i2];
        accesstoviewtypegyeprt8.write = 0;
        int i6 = $11 + 57;
        $10 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        while (true) {
            i4 = 907743172;
            j = 0;
            if (accesstoviewtypegyeprt8.write >= i2) {
                break;
            }
            accesstoviewtypegyeprt8.read = cArr[accesstoviewtypegyeprt8.write];
            cArr2[accesstoviewtypegyeprt8.write] = (char) (i3 + accesstoviewtypegyeprt8.read);
            int i8 = accesstoviewtypegyeprt8.write;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(MediaBrowserCompatMediaItem)};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1543552341);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 176, (Process.myPid() >> 22) + 21, 1932485450, false, com.braze.Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {accesstoviewtypegyeprt8, accesstoviewtypegyeprt8};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(907743172);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 20062), 2838 - TextUtils.getCapsMode("", 0, 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 17, -422891995, false, $$d(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i > 0) {
            int i9 = $10 + 39;
            $11 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            accesstoviewtypegyeprt8.serializer = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - accesstoviewtypegyeprt8.serializer, accesstoviewtypegyeprt8.serializer);
            System.arraycopy(cArr3, accesstoviewtypegyeprt8.serializer, cArr2, 0, i2 - accesstoviewtypegyeprt8.serializer);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            accesstoviewtypegyeprt8.write = 0;
            while (accesstoviewtypegyeprt8.write < i2) {
                cArr4[accesstoviewtypegyeprt8.write] = cArr2[(i2 - accesstoviewtypegyeprt8.write) - 1];
                Object[] objArr4 = {accesstoviewtypegyeprt8, accesstoviewtypegyeprt8};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i4);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (20064 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1))), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2838, View.MeasureSpec.getMode(0) + 17, -422891995, false, $$d(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                i4 = 907743172;
                j = 0;
            }
            int i11 = $10 + 121;
            $11 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x028e  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:115:0x02e2 A[Catch: SQLiteException -> 0x0311, all -> 0x0456, LOOP:12: B:115:0x02e2->B:534:?, LOOP_START, TryCatch #29 {all -> 0x0456, blocks: (B:113:0x02dc, B:115:0x02e2, B:117:0x02f3, B:118:0x02fb, B:121:0x030e, B:129:0x0319), top: B:482:0x02d2 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x02f3 A[Catch: SQLiteException -> 0x0311, all -> 0x0456, TryCatch #29 {all -> 0x0456, blocks: (B:113:0x02dc, B:115:0x02e2, B:117:0x02f3, B:118:0x02fb, B:121:0x030e, B:129:0x0319), top: B:482:0x02d2 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x030e A[Catch: SQLiteException -> 0x0311, all -> 0x0456, TRY_LEAVE, TryCatch #29 {all -> 0x0456, blocks: (B:113:0x02dc, B:115:0x02e2, B:117:0x02f3, B:118:0x02fb, B:121:0x030e, B:129:0x0319), top: B:482:0x02d2 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0345  */
    /* JADX WARN: Code duplicated, block: B:138:0x0353  */
    /* JADX WARN: Code duplicated, block: B:140:0x036a  */
    /* JADX WARN: Code duplicated, block: B:165:0x045a  */
    /* JADX WARN: Code duplicated, block: B:167:0x045e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0469  */
    /* JADX WARN: Code duplicated, block: B:173:0x048a  */
    /* JADX WARN: Code duplicated, block: B:179:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:183:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:186:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:188:0x04d7 A[PHI: r0
  0x04d7: PHI (r0v32 int) = (r0v31 int), (r0v41 int) binds: [B:187:0x04d5, B:184:0x04ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:190:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:193:0x04fc A[PHI: r0
  0x04fc: PHI (r0v40 int) = (r0v31 int), (r0v41 int) binds: [B:187:0x04d5, B:184:0x04ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:197:0x0512  */
    /* JADX WARN: Code duplicated, block: B:203:0x0527  */
    /* JADX WARN: Code duplicated, block: B:210:0x0561  */
    /* JADX WARN: Code duplicated, block: B:213:0x056a  */
    /* JADX WARN: Code duplicated, block: B:215:0x0576  */
    /* JADX WARN: Code duplicated, block: B:217:0x0598  */
    /* JADX WARN: Code duplicated, block: B:218:0x059c  */
    /* JADX WARN: Code duplicated, block: B:223:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:225:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:226:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:252:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:255:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:261:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:265:0x0727  */
    /* JADX WARN: Code duplicated, block: B:272:0x074f  */
    /* JADX WARN: Code duplicated, block: B:274:0x075a  */
    /* JADX WARN: Code duplicated, block: B:281:0x077f A[LOOP:9: B:266:0x0729->B:281:0x077f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:284:0x0786  */
    /* JADX WARN: Code duplicated, block: B:298:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:305:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:309:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:315:0x080d  */
    /* JADX WARN: Code duplicated, block: B:317:0x0840  */
    /* JADX WARN: Code duplicated, block: B:318:0x0843  */
    /* JADX WARN: Code duplicated, block: B:321:0x085d  */
    /* JADX WARN: Code duplicated, block: B:323:0x0869 A[LOOP:11: B:313:0x0807->B:323:0x0869, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:329:0x0898  */
    /* JADX WARN: Code duplicated, block: B:333:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:336:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:339:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:341:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:345:0x0912 A[Catch: SQLiteException -> 0x096c, all -> 0x097a, LOOP:4: B:345:0x0912->B:360:0x0968, LOOP_START, PHI: r3
  0x0912: PHI (r3v81 java.util.Iterator) = (r3v74 java.util.Iterator), (r3v83 java.util.Iterator) binds: [B:344:0x0910, B:360:0x0968] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #11 {all -> 0x097a, blocks: (B:343:0x090c, B:345:0x0912, B:346:0x0917, B:348:0x0928, B:350:0x0938, B:352:0x0943, B:357:0x095d, B:354:0x094a, B:356:0x0958, B:364:0x0972), top: B:462:0x090c }] */
    /* JADX WARN: Code duplicated, block: B:350:0x0938 A[Catch: SQLiteException -> 0x096c, all -> 0x097a, TryCatch #11 {all -> 0x097a, blocks: (B:343:0x090c, B:345:0x0912, B:346:0x0917, B:348:0x0928, B:350:0x0938, B:352:0x0943, B:357:0x095d, B:354:0x094a, B:356:0x0958, B:364:0x0972), top: B:462:0x090c }] */
    /* JADX WARN: Code duplicated, block: B:351:0x0941  */
    /* JADX WARN: Code duplicated, block: B:360:0x0968 A[LOOP:4: B:345:0x0912->B:360:0x0968, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:363:0x0970  */
    /* JADX WARN: Code duplicated, block: B:381:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:383:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:387:0x09b7  */
    /* JADX WARN: Code duplicated, block: B:390:0x09d6  */
    /* JADX WARN: Code duplicated, block: B:393:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:395:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:397:0x0a0a  */
    /* JADX WARN: Code duplicated, block: B:398:0x0a13  */
    /* JADX WARN: Code duplicated, block: B:400:0x0a3d  */
    /* JADX WARN: Code duplicated, block: B:403:0x0a45  */
    /* JADX WARN: Code duplicated, block: B:416:0x0abd  */
    /* JADX WARN: Code duplicated, block: B:417:0x0ac6  */
    /* JADX WARN: Code duplicated, block: B:421:0x0ad9 A[PHI: r20
  0x0ad9: PHI (r20v22 java.util.Map) = (r20v23 java.util.Map), (r0v128 java.util.Map) binds: [B:420:0x0ad7, B:418:0x0ac7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:427:0x0b07  */
    /* JADX WARN: Code duplicated, block: B:432:0x0b65 A[Catch: SQLiteException -> 0x0b77, TRY_LEAVE, TryCatch #19 {SQLiteException -> 0x0b77, blocks: (B:430:0x0b5b, B:432:0x0b65), top: B:470:0x0b5b }] */
    /* JADX WARN: Code duplicated, block: B:441:0x0b91  */
    /* JADX WARN: Code duplicated, block: B:500:0x0248 A[EDGE_INSN: B:500:0x0248->B:86:0x0248 BREAK  A[LOOP:2: B:73:0x01fe->B:87:0x024c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x0963 A[EDGE_INSN: B:504:0x0963->B:359:0x0963 BREAK  A[LOOP:4: B:345:0x0912->B:360:0x0968], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x09c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x0ade A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0ad1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x0aa5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x0b8c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x06c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x06dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x0878 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x06b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x06b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x077a A[EDGE_INSN: B:524:0x077a->B:280:0x077a BREAK  A[LOOP:9: B:266:0x0729->B:281:0x077f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x07fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x07f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x0887 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x088f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0447 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x0641 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x0646 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x0646 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:0x04ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x049a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:0x0533 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:0x0521 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f9 A[Catch: SQLiteException -> 0x025d, all -> 0x0b97, TryCatch #8 {SQLiteException -> 0x025d, blocks: (B:70:0x01f1, B:72:0x01f9, B:73:0x01fe, B:74:0x0208, B:75:0x0218, B:77:0x0227), top: B:457:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x024c A[LOOP:2: B:73:0x01fe->B:87:0x024c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x0261  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r10v5, types: [o.ImageKt, o.processDragGesture] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v39, types: [o.ImageKt, o.processDragGesture] */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v104 */
    /* JADX WARN: Type inference failed for: r2v106, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v62, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r6v21, types: [com.google.android.gms.measurement.internal.zzgs] */
    /* JADX WARN: Type inference failed for: r7v32, types: [android.content.ContentValues] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final ArrayList write(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        boolean z2;
        Object obj;
        Object obj2;
        Object obj3;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221;
        String str2;
        ?? ResultReceiver;
        Cursor cursor;
        Cursor cursorQuery;
        Map map;
        ?? r22;
        Map map2;
        Map map3;
        Iterator it;
        Map map4;
        ?? r11;
        Map map5;
        Integer num;
        getWEK5gGoQ getwek5ggoq;
        BitSet bitSet;
        BitSet bitSet2;
        ImageKt imageKt;
        int i;
        List<getSpacebarEK5gGoQ> list3;
        int i2;
        Iterator it2;
        Iterator it3;
        getVoiceAssistEK5gGoQ getvoiceassistek5ggoq;
        Iterator it4;
        getTvSatelliteCsEK5gGoQ gettvsatellitecsek5ggoq;
        int i3;
        int i4;
        int i5;
        int i6;
        Long lValueOf;
        String str3;
        ImageKt imageKt2;
        SQLiteDatabase sQLiteDatabaseResultReceiver;
        ?? r2;
        Cursor cursorRawQuery;
        Map map6;
        ImageKt imageKt3;
        Iterator it5;
        Integer num2;
        getWEK5gGoQ getwek5ggoq2;
        List list4;
        Iterator it6;
        Map map7;
        Integer numValueOf;
        List arrayList;
        ?? r12;
        String str4;
        String str5;
        Cursor cursor2;
        zzpg zzpgVar;
        String str6;
        String str7;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222;
        androidx.camera.core.FocusMeteringAction focusMeteringAction;
        ?? imageKt4;
        Iterator it7;
        getTvTerrestrialDigitalEK5gGoQ gettvterrestrialdigitalek5ggoq;
        getTvTerrestrialDigitalEK5gGoQ gettvterrestrialdigitalek5ggoqSerializer;
        getPlaceablesCount getplaceablescountWrite;
        long j;
        String strIconCompatParcelizer;
        Map map8;
        getPlaceablesCount getplaceablescount;
        androidx.camera.core.FocusMeteringAction focusMeteringAction2;
        String str8;
        int iIntValue;
        Iterator it8;
        boolean zWrite;
        getPlaceablesCount getplaceablescount2;
        Map map9;
        Integer num3;
        setForceRecompose setforcerecompose;
        int iWrite;
        setThrottleMillis setthrottlemillis;
        boolean z3;
        int i7;
        String str9;
        ImageKt imageKt5;
        Cursor cursor3;
        Cursor cursorQuery2;
        Integer numValueOf2;
        List list5;
        List arrayList2;
        ArrayList arrayList3;
        LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223;
        String str10;
        ?? contentValues;
        ?? imageKt6;
        Iterator it9;
        String strIconCompatParcelizer2;
        Map map10;
        Iterator it10;
        boolean z4;
        getSystemNavigationUpEK5gGoQ getsystemnavigationupek5ggoq;
        Integer numValueOf3;
        setForceRecompose setforcerecompose2;
        boolean z5;
        Integer numValueOf4;
        String str11;
        ImageKt imageKt7;
        Cursor cursor4;
        Cursor cursorQuery3;
        Integer numValueOf5;
        List list6;
        List arrayList4;
        ImageKt imageKt8;
        int i8;
        Cursor cursorQuery4;
        List arrayList5;
        String str12 = "current_results";
        int i9 = 2 % 2;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope224 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(list);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(list2);
        this.IconCompatParcelizer = str;
        this.read = new HashSet();
        this.RemoteActionCompatParcelizer = new ImageKt();
        this.write = l;
        this.serializer = l2;
        Iterator it11 = list.iterator();
        while (true) {
            if (!it11.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((getTvTerrestrialDigitalEK5gGoQ) it11.next()).IconCompatParcelizer())) {
                z2 = true;
                break;
            }
        }
        accessgetRelocatecp.write();
        boolean zWrite2 = lookaheadScopeKtLookaheadScope224.PlaybackStateCompat.write(this.IconCompatParcelizer, premeasure0kLqBqw.accessensureViewModelStore);
        accessgetRelocatecp.write();
        boolean zWrite3 = lookaheadScopeKtLookaheadScope224.PlaybackStateCompat.write(this.IconCompatParcelizer, premeasure0kLqBqw._init_lambda2);
        zzpg zzpgVar2 = this.MediaSessionCompatToken;
        String str13 = "events";
        if (z2) {
            LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper2 = zzpgVar2.MediaSessionCompatResultReceiverWrapper();
            String str14 = this.IconCompatParcelizer;
            layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper2.ComponentActivity();
            layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper2.MediaSessionCompatToken();
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str14);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper2.ResultReceiver().update("events", contentValues2, "app_id = ?", new String[]{str14});
            } catch (SQLiteException e) {
                ((LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).RatingCompat().serializer().serializer("Error resetting session-scoped event counts. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str14), e);
            }
        }
        Object obj4 = Collections.EMPTY_MAP;
        String str15 = RemoteMessageConst.DATA;
        String str16 = "Database error querying filters. appId";
        String str17 = "Failed to merge filter. appId";
        Object obj5 = "audience_id";
        try {
            try {
                try {
                    try {
                        if (zWrite3 && zWrite2) {
                            LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper3 = zzpgVar2.MediaSessionCompatResultReceiverWrapper();
                            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope225 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                            String str18 = this.IconCompatParcelizer;
                            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str18);
                            ImageKt imageKt9 = new ImageKt();
                            SQLiteDatabase sQLiteDatabaseResultReceiver2 = layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper3.ResultReceiver();
                            obj = obj4;
                            ?? r3 = 2;
                            try {
                                try {
                                    cursorQuery4 = sQLiteDatabaseResultReceiver2.query("event_filters", new String[]{"audience_id", RemoteMessageConst.DATA}, "app_id=?", new String[]{str18}, null, null, null);
                                    try {
                                        if (cursorQuery4.moveToFirst()) {
                                            str15 = RemoteMessageConst.DATA;
                                            while (true) {
                                                try {
                                                    try {
                                                        getSpacebarEK5gGoQ getspacebarek5ggoq = (getSpacebarEK5gGoQ) ((getSoftSleepEK5gGoQ) zzgz.write(getSpacebarEK5gGoQ.serializer(), cursorQuery4.getBlob(1))).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                                                        if (getspacebarek5ggoq.RatingCompat()) {
                                                            Integer numValueOf6 = Integer.valueOf(cursorQuery4.getInt(0));
                                                            List list7 = (List) imageKt9.get(numValueOf6);
                                                            if (list7 == null) {
                                                                arrayList5 = new ArrayList();
                                                                imageKt9.put(numValueOf6, arrayList5);
                                                            } else {
                                                                arrayList5 = list7;
                                                            }
                                                            arrayList5.add(getspacebarek5ggoq);
                                                        } else {
                                                            str13 = str13;
                                                        }
                                                    } catch (IOException e2) {
                                                        str13 = str13;
                                                        lookaheadScopeKtLookaheadScope225.RatingCompat().serializer().serializer("Failed to merge filter. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str18), e2);
                                                    }
                                                    try {
                                                        if (!cursorQuery4.moveToNext()) {
                                                            break;
                                                        }
                                                        str13 = str13;
                                                    } catch (SQLiteException e3) {
                                                        e = e3;
                                                        lookaheadScopeKtLookaheadScope225.RatingCompat().serializer().serializer("Database error querying filters. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str18), e);
                                                        obj2 = Collections.EMPTY_MAP;
                                                        if (cursorQuery4 != null) {
                                                            cursorQuery4.close();
                                                        }
                                                        obj3 = obj2;
                                                    }
                                                } catch (SQLiteException e4) {
                                                    e = e4;
                                                    str13 = str13;
                                                    lookaheadScopeKtLookaheadScope225.RatingCompat().serializer().serializer("Database error querying filters. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str18), e);
                                                    obj2 = Collections.EMPTY_MAP;
                                                    if (cursorQuery4 != null) {
                                                        cursorQuery4.close();
                                                    }
                                                    obj3 = obj2;
                                                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper4 = zzpgVar2.MediaSessionCompatResultReceiverWrapper();
                                                    lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                                    str2 = this.IconCompatParcelizer;
                                                    layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper4.ComponentActivity();
                                                    layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper4.MediaSessionCompatToken();
                                                    accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
                                                    ResultReceiver = layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper4.ResultReceiver();
                                                    str16 = "audience_filter_values";
                                                    cursorQuery = ResultReceiver.query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str2}, null, null, null);
                                                    if (!(!cursorQuery.moveToFirst())) {
                                                        imageKt8 = new ImageKt();
                                                        while (true) {
                                                            i8 = cursorQuery.getInt(0);
                                                            try {
                                                                imageKt8.put(Integer.valueOf(i8), (getWEK5gGoQ) ((getVolumeDownEK5gGoQ) zzgz.write(getWEK5gGoQ.serializer(), cursorQuery.getBlob(1))).r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                                                                obj = obj5;
                                                            } catch (IOException e5) {
                                                                obj = obj5;
                                                                try {
                                                                    lookaheadScopeKtLookaheadScope221.RatingCompat().serializer().IconCompatParcelizer("Failed to merge filter results. appId, audienceId, error", getLookaheadDelegate.RemoteActionCompatParcelizer(str2), Integer.valueOf(i8), e5);
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    ResultReceiver = str17;
                                                                    str16 = str16;
                                                                    lookaheadScopeKtLookaheadScope221.RatingCompat().serializer().serializer("Database error querying filter results. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str2), e);
                                                                    map = Collections.EMPTY_MAP;
                                                                    map2 = map;
                                                                    r22 = ResultReceiver;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                        map2 = map;
                                                                        r22 = ResultReceiver;
                                                                    }
                                                                }
                                                            }
                                                            if (!cursorQuery.moveToNext()) {
                                                                break;
                                                            }
                                                            obj5 = obj;
                                                            str17 = str17;
                                                            str16 = str16;
                                                        }
                                                        cursorQuery.close();
                                                        map2 = imageKt8;
                                                        r22 = str17;
                                                    } else {
                                                        obj = "audience_id";
                                                        r22 = "Failed to merge filter. appId";
                                                        str16 = "Database error querying filters. appId";
                                                        Map map11 = Collections.EMPTY_MAP;
                                                        cursorQuery.close();
                                                        map2 = map11;
                                                    }
                                                    if (!map2.isEmpty()) {
                                                        HashSet hashSet = new HashSet(map2.keySet());
                                                        if (z2) {
                                                            String str19 = this.IconCompatParcelizer;
                                                            LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper5 = zzpgVar2.MediaSessionCompatResultReceiverWrapper();
                                                            str3 = this.IconCompatParcelizer;
                                                            layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper5.ComponentActivity();
                                                            layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper5.MediaSessionCompatToken();
                                                            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str3);
                                                            imageKt2 = new ImageKt();
                                                            sQLiteDatabaseResultReceiver = layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper5.ResultReceiver();
                                                            try {
                                                                try {
                                                                    cursorRawQuery = sQLiteDatabaseResultReceiver.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                                                    try {
                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                            do {
                                                                                numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                arrayList = (List) imageKt2.get(numValueOf);
                                                                                if (arrayList == null) {
                                                                                    arrayList = new ArrayList();
                                                                                    imageKt2.put(numValueOf, arrayList);
                                                                                }
                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                            } while (cursorRawQuery.moveToNext());
                                                                            map7 = imageKt2;
                                                                        } else {
                                                                            map7 = Collections.EMPTY_MAP;
                                                                        }
                                                                    } catch (SQLiteException e7) {
                                                                        e = e7;
                                                                        ((LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper5.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).RatingCompat().serializer().serializer("Database error querying scoped filters. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str3), e);
                                                                        Map map12 = Collections.EMPTY_MAP;
                                                                        map7 = map12;
                                                                        map6 = map12;
                                                                        if (cursorRawQuery != null) {
                                                                        }
                                                                        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str19);
                                                                        imageKt3 = new ImageKt();
                                                                        if (!map2.isEmpty()) {
                                                                            it5 = map2.keySet().iterator();
                                                                            while (it5.hasNext()) {
                                                                                num2 = (Integer) it5.next();
                                                                                num2.getClass();
                                                                                getwek5ggoq2 = (getWEK5gGoQ) map2.get(num2);
                                                                                list4 = (List) map6.get(num2);
                                                                                if (list4 != null) {
                                                                                }
                                                                                it6 = it5;
                                                                                imageKt3.put(num2, getwek5ggoq2);
                                                                                map6 = map6;
                                                                                it5 = it6;
                                                                            }
                                                                        }
                                                                        map3 = imageKt3;
                                                                        it = hashSet.iterator();
                                                                        map5 = map3;
                                                                        r11 = obj3;
                                                                        map4 = map2;
                                                                        r22 = r22;
                                                                        while (it.hasNext()) {
                                                                            num = (Integer) it.next();
                                                                            num.getClass();
                                                                            getwek5ggoq = (getWEK5gGoQ) map5.get(num);
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            imageKt = new ImageKt();
                                                                            if (getwek5ggoq != null) {
                                                                                it4 = getwek5ggoq.MediaSessionCompatQueueItem().iterator();
                                                                                while (it4.hasNext()) {
                                                                                    gettvsatellitecsek5ggoq = (getTvSatelliteCsEK5gGoQ) it4.next();
                                                                                    if (gettvsatellitecsek5ggoq.serializer()) {
                                                                                        Map map13 = map5;
                                                                                        i3 = MediaSessionCompatQueueItem + 23;
                                                                                        Iterator it12 = it4;
                                                                                        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                                        if (i3 % 2 != 0) {
                                                                                            i4 = gettvsatellitecsek5ggoq.read();
                                                                                            int i10 = 4 / 0;
                                                                                            if (gettvsatellitecsek5ggoq.RemoteActionCompatParcelizer()) {
                                                                                                i5 = MediaMetadataCompat + 63;
                                                                                                i6 = i4;
                                                                                                MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                                                if (i5 % 2 != 0) {
                                                                                                    Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer());
                                                                                                    throw null;
                                                                                                }
                                                                                                lValueOf = Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer());
                                                                                                i4 = i6;
                                                                                            } else {
                                                                                                lValueOf = null;
                                                                                            }
                                                                                        } else {
                                                                                            i4 = gettvsatellitecsek5ggoq.read();
                                                                                            if (gettvsatellitecsek5ggoq.RemoteActionCompatParcelizer()) {
                                                                                                i5 = MediaMetadataCompat + 63;
                                                                                                i6 = i4;
                                                                                                MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                                                if (i5 % 2 != 0) {
                                                                                                    Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer());
                                                                                                    throw null;
                                                                                                }
                                                                                                lValueOf = Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer());
                                                                                                i4 = i6;
                                                                                            } else {
                                                                                                lValueOf = null;
                                                                                            }
                                                                                        }
                                                                                        imageKt.put(Integer.valueOf(i4), lValueOf);
                                                                                        it4 = it12;
                                                                                        map5 = map13;
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map14 = map5;
                                                                            ImageKt imageKt10 = new ImageKt();
                                                                            if (getwek5ggoq != null) {
                                                                                it3 = getwek5ggoq.MediaMetadataCompat().iterator();
                                                                                while (it3.hasNext()) {
                                                                                    getvoiceassistek5ggoq = (getVoiceAssistEK5gGoQ) it3.next();
                                                                                    if (!getvoiceassistek5ggoq.read()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            zzpg zzpgVar3 = zzpgVar2;
                                                                            if (getwek5ggoq != null) {
                                                                                i2 = 0;
                                                                                while (i2 < getwek5ggoq.read() * 64) {
                                                                                    if (zzgz.write((onPreFlingQWom1MosuspendImpl) getwek5ggoq.IconCompatParcelizer(), i2)) {
                                                                                        it2 = it;
                                                                                        lookaheadScopeKtLookaheadScope224.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer("Filter already evaluated. audience ID, filter ID", num, Integer.valueOf(i2));
                                                                                        bitSet2.set(i2);
                                                                                        if (zzgz.write((onPreFlingQWom1MosuspendImpl) getwek5ggoq.write(), i2)) {
                                                                                            bitSet.set(i2);
                                                                                        }
                                                                                        i2++;
                                                                                        it = it2;
                                                                                    } else {
                                                                                        it2 = it;
                                                                                    }
                                                                                    imageKt.remove(Integer.valueOf(i2));
                                                                                    i2++;
                                                                                    it = it2;
                                                                                }
                                                                            }
                                                                            Iterator it13 = it;
                                                                            getWEK5gGoQ getwek5ggoq3 = (getWEK5gGoQ) map4.get(num);
                                                                            if (zWrite3) {
                                                                                i = MediaSessionCompatQueueItem + 111;
                                                                                MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                                if (i % 2 == 0) {
                                                                                    Object obj6 = null;
                                                                                    obj6.hashCode();
                                                                                    throw null;
                                                                                }
                                                                                if (!zWrite2) {
                                                                                }
                                                                            }
                                                                            this.RemoteActionCompatParcelizer.put(num, new setThrottleMillis(this, this.IconCompatParcelizer, getwek5ggoq3, bitSet, bitSet2, imageKt, imageKt10));
                                                                            it = it13;
                                                                            zzpgVar2 = zzpgVar3;
                                                                            str12 = str12;
                                                                            map5 = map14;
                                                                            str16 = str16;
                                                                            zWrite2 = zWrite2;
                                                                            obj = obj;
                                                                            r22 = r22;
                                                                            r11 = r11;
                                                                            map4 = map4;
                                                                            str13 = str13;
                                                                            lookaheadScopeKtLookaheadScope224 = lookaheadScopeKtLookaheadScope224;
                                                                        }
                                                                        r12 = obj;
                                                                        str4 = str15;
                                                                        ?? r14 = r22;
                                                                        str5 = str16;
                                                                        cursor2 = null;
                                                                        zzpgVar = zzpgVar2;
                                                                        str6 = str12;
                                                                        str7 = str13;
                                                                        lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope224;
                                                                        if (!list.isEmpty()) {
                                                                            focusMeteringAction = new androidx.camera.core.FocusMeteringAction(this);
                                                                            imageKt4 = new ImageKt();
                                                                            it7 = list.iterator();
                                                                            while (it7.hasNext()) {
                                                                                gettvterrestrialdigitalek5ggoq = (getTvTerrestrialDigitalEK5gGoQ) it7.next();
                                                                                gettvterrestrialdigitalek5ggoqSerializer = focusMeteringAction.serializer(gettvterrestrialdigitalek5ggoq, this.IconCompatParcelizer);
                                                                                if (gettvterrestrialdigitalek5ggoqSerializer != null) {
                                                                                    getplaceablescountWrite = zzpgVar.MediaSessionCompatResultReceiverWrapper().write(this.IconCompatParcelizer, gettvterrestrialdigitalek5ggoq, gettvterrestrialdigitalek5ggoqSerializer.IconCompatParcelizer());
                                                                                    zzpgVar.MediaSessionCompatResultReceiverWrapper().write(str7, getplaceablescountWrite);
                                                                                    if (z) {
                                                                                        continue;
                                                                                    } else {
                                                                                        j = getplaceablescountWrite.serializer;
                                                                                        strIconCompatParcelizer = gettvterrestrialdigitalek5ggoqSerializer.IconCompatParcelizer();
                                                                                        map8 = (Map) imageKt4.get(strIconCompatParcelizer);
                                                                                        if (map8 == null) {
                                                                                            LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper6 = zzpgVar.MediaSessionCompatResultReceiverWrapper();
                                                                                            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope226 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper6.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                                                                            str9 = this.IconCompatParcelizer;
                                                                                            layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper6.ComponentActivity();
                                                                                            layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper6.MediaSessionCompatToken();
                                                                                            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str9);
                                                                                            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(strIconCompatParcelizer);
                                                                                            imageKt5 = new ImageKt();
                                                                                            try {
                                                                                                cursorQuery2 = layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper6.ResultReceiver().query("event_filters", new String[]{r12, str4}, "app_id=? AND event_name=?", new String[]{str9, strIconCompatParcelizer}, null, null, null);
                                                                                                try {
                                                                                                    try {
                                                                                                        if (cursorQuery2.moveToFirst()) {
                                                                                                            getplaceablescount = getplaceablescountWrite;
                                                                                                            while (true) {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        getSpacebarEK5gGoQ getspacebarek5ggoq2 = (getSpacebarEK5gGoQ) ((getSoftSleepEK5gGoQ) zzgz.write(getSpacebarEK5gGoQ.serializer(), cursorQuery2.getBlob(1))).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                                                                                                                        numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                        list5 = (List) imageKt5.get(numValueOf2);
                                                                                                                        if (list5 == null) {
                                                                                                                            focusMeteringAction2 = focusMeteringAction;
                                                                                                                            try {
                                                                                                                                arrayList2 = new ArrayList();
                                                                                                                                imageKt5.put(numValueOf2, arrayList2);
                                                                                                                            } catch (SQLiteException e8) {
                                                                                                                                e = e8;
                                                                                                                                str8 = str5;
                                                                                                                                lookaheadScopeKtLookaheadScope226.RatingCompat().serializer().serializer(str8, getLookaheadDelegate.RemoteActionCompatParcelizer(str9), e);
                                                                                                                                map8 = Collections.EMPTY_MAP;
                                                                                                                                if (cursorQuery2 != null) {
                                                                                                                                    cursorQuery2.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            focusMeteringAction2 = focusMeteringAction;
                                                                                                                            arrayList2 = list5;
                                                                                                                        }
                                                                                                                        arrayList2.add(getspacebarek5ggoq2);
                                                                                                                    } catch (IOException e9) {
                                                                                                                        focusMeteringAction2 = focusMeteringAction;
                                                                                                                        lookaheadScopeKtLookaheadScope226.RatingCompat().serializer().serializer(r14, getLookaheadDelegate.RemoteActionCompatParcelizer(str9), e9);
                                                                                                                    }
                                                                                                                    if (!cursorQuery2.moveToNext()) {
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    focusMeteringAction = focusMeteringAction2;
                                                                                                                } catch (SQLiteException e10) {
                                                                                                                    e = e10;
                                                                                                                    focusMeteringAction2 = focusMeteringAction;
                                                                                                                    str8 = str5;
                                                                                                                    lookaheadScopeKtLookaheadScope226.RatingCompat().serializer().serializer(str8, getLookaheadDelegate.RemoteActionCompatParcelizer(str9), e);
                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                    if (cursorQuery2 != null) {
                                                                                                                        cursorQuery2.close();
                                                                                                                    }
                                                                                                                    imageKt4.put(strIconCompatParcelizer, map8);
                                                                                                                    for (Integer num4 : map8.keySet()) {
                                                                                                                        iIntValue = num4.intValue();
                                                                                                                        if (this.read.contains(num4)) {
                                                                                                                            lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer(num4, "Skipping failed audience ID");
                                                                                                                        } else {
                                                                                                                            it8 = ((List) map8.get(num4)).iterator();
                                                                                                                            zWrite = true;
                                                                                                                            while (true) {
                                                                                                                                if (!it8.hasNext()) {
                                                                                                                                    getplaceablescount2 = getplaceablescount;
                                                                                                                                    map9 = map8;
                                                                                                                                    num3 = num4;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                getSpacebarEK5gGoQ getspacebarek5ggoq3 = (getSpacebarEK5gGoQ) it8.next();
                                                                                                                                getplaceablescount2 = getplaceablescount;
                                                                                                                                map9 = map8;
                                                                                                                                num3 = num4;
                                                                                                                                setforcerecompose = new setForceRecompose(this, this.IconCompatParcelizer, iIntValue, getspacebarek5ggoq3, 0);
                                                                                                                                Long l3 = this.write;
                                                                                                                                Long l4 = this.serializer;
                                                                                                                                iWrite = getspacebarek5ggoq3.write();
                                                                                                                                setthrottlemillis = (setThrottleMillis) this.RemoteActionCompatParcelizer.get(num3);
                                                                                                                                if (setthrottlemillis == null) {
                                                                                                                                    z3 = false;
                                                                                                                                } else {
                                                                                                                                    z3 = setthrottlemillis.read.get(iWrite);
                                                                                                                                }
                                                                                                                                zWrite = setforcerecompose.write(l3, l4, gettvterrestrialdigitalek5ggoqSerializer, j, getplaceablescount2, z3);
                                                                                                                                if (!zWrite) {
                                                                                                                                    this.read.add(num3);
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                i7 = MediaMetadataCompat + 39;
                                                                                                                                MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                                                                                if (i7 % 2 == 0) {
                                                                                                                                    serializer(num3).RemoteActionCompatParcelizer(setforcerecompose);
                                                                                                                                    cursor2.hashCode();
                                                                                                                                    throw cursor2;
                                                                                                                                }
                                                                                                                                serializer(num3).RemoteActionCompatParcelizer(setforcerecompose);
                                                                                                                                num4 = num3;
                                                                                                                                map8 = map9;
                                                                                                                                getplaceablescount = getplaceablescount2;
                                                                                                                            }
                                                                                                                            if (!zWrite) {
                                                                                                                                this.read.add(num3);
                                                                                                                            }
                                                                                                                            map8 = map9;
                                                                                                                            cursor2 = cursor2;
                                                                                                                            getplaceablescount = getplaceablescount2;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    str5 = str8;
                                                                                                                    focusMeteringAction = focusMeteringAction2;
                                                                                                                }
                                                                                                            }
                                                                                                            cursorQuery2.close();
                                                                                                            map8 = imageKt5;
                                                                                                        } else {
                                                                                                            getplaceablescount = getplaceablescountWrite;
                                                                                                            focusMeteringAction2 = focusMeteringAction;
                                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                                            cursorQuery2.close();
                                                                                                        }
                                                                                                        str8 = str5;
                                                                                                    } catch (SQLiteException e11) {
                                                                                                        e = e11;
                                                                                                        getplaceablescount = getplaceablescountWrite;
                                                                                                    }
                                                                                                } catch (Throwable th) {
                                                                                                    th = th;
                                                                                                    cursor3 = cursorQuery2;
                                                                                                    if (cursor3 != null) {
                                                                                                        cursor3.close();
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (SQLiteException e12) {
                                                                                                e = e12;
                                                                                                getplaceablescount = getplaceablescountWrite;
                                                                                                focusMeteringAction2 = focusMeteringAction;
                                                                                                cursorQuery2 = cursor2;
                                                                                            } catch (Throwable th2) {
                                                                                                th = th2;
                                                                                                cursor3 = cursor2;
                                                                                            }
                                                                                            imageKt4.put(strIconCompatParcelizer, map8);
                                                                                        } else {
                                                                                            getplaceablescount = getplaceablescountWrite;
                                                                                            focusMeteringAction2 = focusMeteringAction;
                                                                                            str8 = str5;
                                                                                        }
                                                                                        while (r20.hasNext()) {
                                                                                            iIntValue = num4.intValue();
                                                                                            if (this.read.contains(num4)) {
                                                                                                lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer(num4, "Skipping failed audience ID");
                                                                                            } else {
                                                                                                it8 = ((List) map8.get(num4)).iterator();
                                                                                                zWrite = true;
                                                                                                while (true) {
                                                                                                    if (!it8.hasNext()) {
                                                                                                        getplaceablescount2 = getplaceablescount;
                                                                                                        map9 = map8;
                                                                                                        num3 = num4;
                                                                                                        break;
                                                                                                    }
                                                                                                    getSpacebarEK5gGoQ getspacebarek5ggoq4 = (getSpacebarEK5gGoQ) it8.next();
                                                                                                    getplaceablescount2 = getplaceablescount;
                                                                                                    map9 = map8;
                                                                                                    num3 = num4;
                                                                                                    setforcerecompose = new setForceRecompose(this, this.IconCompatParcelizer, iIntValue, getspacebarek5ggoq4, 0);
                                                                                                    Long l5 = this.write;
                                                                                                    Long l6 = this.serializer;
                                                                                                    iWrite = getspacebarek5ggoq4.write();
                                                                                                    setthrottlemillis = (setThrottleMillis) this.RemoteActionCompatParcelizer.get(num3);
                                                                                                    if (setthrottlemillis == null) {
                                                                                                        z3 = false;
                                                                                                    } else {
                                                                                                        z3 = setthrottlemillis.read.get(iWrite);
                                                                                                    }
                                                                                                    zWrite = setforcerecompose.write(l5, l6, gettvterrestrialdigitalek5ggoqSerializer, j, getplaceablescount2, z3);
                                                                                                    if (!zWrite) {
                                                                                                        this.read.add(num3);
                                                                                                        break;
                                                                                                    }
                                                                                                    i7 = MediaMetadataCompat + 39;
                                                                                                    MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                                                    if (i7 % 2 == 0) {
                                                                                                        serializer(num3).RemoteActionCompatParcelizer(setforcerecompose);
                                                                                                        cursor2.hashCode();
                                                                                                        throw cursor2;
                                                                                                    }
                                                                                                    serializer(num3).RemoteActionCompatParcelizer(setforcerecompose);
                                                                                                    num4 = num3;
                                                                                                    map8 = map9;
                                                                                                    getplaceablescount = getplaceablescount2;
                                                                                                }
                                                                                                if (!zWrite) {
                                                                                                    this.read.add(num3);
                                                                                                }
                                                                                                map8 = map9;
                                                                                                cursor2 = cursor2;
                                                                                                getplaceablescount = getplaceablescount2;
                                                                                            }
                                                                                        }
                                                                                        str5 = str8;
                                                                                        focusMeteringAction = focusMeteringAction2;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        String str20 = str5;
                                                                        if (!z) {
                                                                            return new ArrayList();
                                                                        }
                                                                        if (!list2.isEmpty()) {
                                                                            imageKt6 = new ImageKt();
                                                                            it9 = list2.iterator();
                                                                            while (it9.hasNext()) {
                                                                                getYEK5gGoQ getyek5ggoq = (getYEK5gGoQ) it9.next();
                                                                                strIconCompatParcelizer2 = getyek5ggoq.IconCompatParcelizer();
                                                                                map10 = (Map) imageKt6.get(strIconCompatParcelizer2);
                                                                                if (map10 == null) {
                                                                                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper7 = zzpgVar.MediaSessionCompatResultReceiverWrapper();
                                                                                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope227 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper7.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                                                                    str11 = this.IconCompatParcelizer;
                                                                                    layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper7.ComponentActivity();
                                                                                    layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper7.MediaSessionCompatToken();
                                                                                    accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str11);
                                                                                    accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(strIconCompatParcelizer2);
                                                                                    imageKt7 = new ImageKt();
                                                                                    try {
                                                                                        cursorQuery3 = layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper7.ResultReceiver().query("property_filters", new String[]{r12, str4}, "app_id=? AND property_name=?", new String[]{str11, strIconCompatParcelizer2}, null, null, null);
                                                                                        try {
                                                                                            try {
                                                                                                if (cursorQuery3.moveToFirst()) {
                                                                                                    while (true) {
                                                                                                        try {
                                                                                                            getSystemNavigationUpEK5gGoQ getsystemnavigationupek5ggoq2 = (getSystemNavigationUpEK5gGoQ) ((getSystemNavigationLeftEK5gGoQ) zzgz.write(getSystemNavigationUpEK5gGoQ.write(), cursorQuery3.getBlob(1))).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                                                                                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                            list6 = (List) imageKt7.get(numValueOf5);
                                                                                                            if (list6 == null) {
                                                                                                                arrayList4 = new ArrayList();
                                                                                                                imageKt7.put(numValueOf5, arrayList4);
                                                                                                            } else {
                                                                                                                arrayList4 = list6;
                                                                                                            }
                                                                                                            arrayList4.add(getsystemnavigationupek5ggoq2);
                                                                                                        } catch (IOException e13) {
                                                                                                            lookaheadScopeKtLookaheadScope227.RatingCompat().serializer().serializer("Failed to merge filter", getLookaheadDelegate.RemoteActionCompatParcelizer(str11), e13);
                                                                                                        }
                                                                                                        try {
                                                                                                            if (!cursorQuery3.moveToNext()) {
                                                                                                                break;
                                                                                                            }
                                                                                                            it9 = it9;
                                                                                                        } catch (SQLiteException e14) {
                                                                                                            e = e14;
                                                                                                            cursor4 = cursorQuery3;
                                                                                                            try {
                                                                                                                lookaheadScopeKtLookaheadScope227.RatingCompat().serializer().serializer(str20, getLookaheadDelegate.RemoteActionCompatParcelizer(str11), e);
                                                                                                                map10 = Collections.EMPTY_MAP;
                                                                                                                if (cursor4 != null) {
                                                                                                                    cursor4.close();
                                                                                                                }
                                                                                                            } catch (Throwable th3) {
                                                                                                                th = th3;
                                                                                                                if (cursor4 != null) {
                                                                                                                    cursor4.close();
                                                                                                                }
                                                                                                                throw th;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    cursorQuery3.close();
                                                                                                    map10 = imageKt7;
                                                                                                } else {
                                                                                                    it9 = it9;
                                                                                                    map10 = Collections.EMPTY_MAP;
                                                                                                    cursorQuery3.close();
                                                                                                }
                                                                                            } catch (Throwable th4) {
                                                                                                th = th4;
                                                                                                cursor4 = cursorQuery3;
                                                                                                if (cursor4 != null) {
                                                                                                    cursor4.close();
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (SQLiteException e15) {
                                                                                            e = e15;
                                                                                            it9 = it9;
                                                                                        }
                                                                                    } catch (SQLiteException e16) {
                                                                                        e = e16;
                                                                                        it9 = it9;
                                                                                        cursor4 = null;
                                                                                    } catch (Throwable th5) {
                                                                                        th = th5;
                                                                                        cursor4 = null;
                                                                                    }
                                                                                    imageKt6.put(strIconCompatParcelizer2, map10);
                                                                                } else {
                                                                                    it9 = it9;
                                                                                }
                                                                                for (Integer num5 : map10.keySet()) {
                                                                                    int iIntValue2 = num5.intValue();
                                                                                    if (this.read.contains(num5)) {
                                                                                        lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer(num5, "Skipping failed audience ID");
                                                                                        break;
                                                                                    }
                                                                                    it10 = ((List) map10.get(num5)).iterator();
                                                                                    z4 = true;
                                                                                    while (true) {
                                                                                        if (it10.hasNext()) {
                                                                                            getsystemnavigationupek5ggoq = (getSystemNavigationUpEK5gGoQ) it10.next();
                                                                                            if (Log.isLoggable(lookaheadScopeKtLookaheadScope222.RatingCompat().ResultReceiver(), 2)) {
                                                                                                zzgs zzgsVarMediaSessionCompatResultReceiverWrapper = lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper();
                                                                                                if (getsystemnavigationupek5ggoq.serializer()) {
                                                                                                    numValueOf4 = Integer.valueOf(getsystemnavigationupek5ggoq.RemoteActionCompatParcelizer());
                                                                                                } else {
                                                                                                    numValueOf4 = null;
                                                                                                }
                                                                                                zzgsVarMediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Evaluating filter. audience, filter, property", num5, numValueOf4, lookaheadScopeKtLookaheadScope222.serializer().RemoteActionCompatParcelizer(getsystemnavigationupek5ggoq.IconCompatParcelizer()));
                                                                                                lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer(zzpgVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus().IconCompatParcelizer(getsystemnavigationupek5ggoq), "Filter definition");
                                                                                            }
                                                                                            if (getsystemnavigationupek5ggoq.serializer()) {
                                                                                            }
                                                                                            zzgs zzgsVarMediaSessionCompatQueueItem = lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatQueueItem();
                                                                                            getLookaheadOffsetF1C5BW0 getlookaheadoffsetf1c5bw0RemoteActionCompatParcelizer = getLookaheadDelegate.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
                                                                                            if (getsystemnavigationupek5ggoq.serializer()) {
                                                                                                numValueOf3 = Integer.valueOf(getsystemnavigationupek5ggoq.RemoteActionCompatParcelizer());
                                                                                            } else {
                                                                                                numValueOf3 = null;
                                                                                            }
                                                                                            zzgsVarMediaSessionCompatQueueItem.serializer("Invalid property filter ID. appId, id", getlookaheadoffsetf1c5bw0RemoteActionCompatParcelizer, String.valueOf(numValueOf3));
                                                                                            this.read.add(num5);
                                                                                            map10 = map10;
                                                                                        } else {
                                                                                            map10 = map10;
                                                                                        }
                                                                                        if (!z4) {
                                                                                            this.read.add(num5);
                                                                                        }
                                                                                        map10 = map10;
                                                                                        serializer(num5).RemoteActionCompatParcelizer(setforcerecompose2);
                                                                                        map10 = map10;
                                                                                    }
                                                                                }
                                                                                it9 = it9;
                                                                            }
                                                                        }
                                                                        arrayList3 = new ArrayList();
                                                                        Image<Integer> image = (Image) this.RemoteActionCompatParcelizer.keySet();
                                                                        image.removeAll(this.read);
                                                                        for (Integer num6 : image) {
                                                                            int iIntValue3 = num6.intValue();
                                                                            setThrottleMillis setthrottlemillis2 = (setThrottleMillis) this.RemoteActionCompatParcelizer.get(num6);
                                                                            accessgetSystemNavigationDowncp.IconCompatParcelizer(setthrottlemillis2);
                                                                            getTvNumberEntryEK5gGoQ gettvnumberentryek5ggoqRemoteActionCompatParcelizer = setthrottlemillis2.RemoteActionCompatParcelizer(iIntValue3);
                                                                            arrayList3.add(gettvnumberentryek5ggoqRemoteActionCompatParcelizer);
                                                                            layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper = zzpgVar.MediaSessionCompatResultReceiverWrapper();
                                                                            lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                                                            str10 = this.IconCompatParcelizer;
                                                                            getWEK5gGoQ getwek5ggoqWrite = gettvnumberentryek5ggoqRemoteActionCompatParcelizer.write();
                                                                            layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper.ComponentActivity();
                                                                            layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper.MediaSessionCompatToken();
                                                                            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str10);
                                                                            accessgetSystemNavigationDowncp.IconCompatParcelizer(getwek5ggoqWrite);
                                                                            byte[] bArrRemoveOnUserLeaveHintListener = getwek5ggoqWrite.removeOnUserLeaveHintListener();
                                                                            contentValues = new ContentValues();
                                                                            contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str10);
                                                                            contentValues.put(r12, num6);
                                                                            String str21 = str6;
                                                                            contentValues.put(str21, bArrRemoveOnUserLeaveHintListener);
                                                                            try {
                                                                                try {
                                                                                    if (layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper.ResultReceiver().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                        lookaheadScopeKtLookaheadScope223.RatingCompat().serializer().serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str10), "Failed to insert filter results (got -1). appId");
                                                                                    }
                                                                                } catch (SQLiteException e17) {
                                                                                    e = e17;
                                                                                    lookaheadScopeKtLookaheadScope223.RatingCompat().serializer().serializer("Error storing filter results. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str10), e);
                                                                                }
                                                                            } catch (SQLiteException e18) {
                                                                                e = e18;
                                                                            }
                                                                            str6 = str21;
                                                                        }
                                                                        return arrayList3;
                                                                    }
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    r2 = sQLiteDatabaseResultReceiver;
                                                                    if (r2 != 0) {
                                                                        r2.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (SQLiteException e19) {
                                                                e = e19;
                                                                cursorRawQuery = null;
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                                r2 = 0;
                                                                if (r2 != 0) {
                                                                    r2.close();
                                                                }
                                                                throw th;
                                                            }
                                                            cursorRawQuery.close();
                                                            map6 = map7;
                                                            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str19);
                                                            imageKt3 = new ImageKt();
                                                            if (!map2.isEmpty()) {
                                                                it5 = map2.keySet().iterator();
                                                                while (it5.hasNext()) {
                                                                    num2 = (Integer) it5.next();
                                                                    num2.getClass();
                                                                    getwek5ggoq2 = (getWEK5gGoQ) map2.get(num2);
                                                                    list4 = (List) map6.get(num2);
                                                                    if (list4 != null) {
                                                                    }
                                                                    it6 = it5;
                                                                    imageKt3.put(num2, getwek5ggoq2);
                                                                    map6 = map6;
                                                                    it5 = it6;
                                                                }
                                                            }
                                                            map3 = imageKt3;
                                                        } else {
                                                            map3 = map2;
                                                        }
                                                        it = hashSet.iterator();
                                                        map5 = map3;
                                                        r11 = obj3;
                                                        map4 = map2;
                                                        r22 = r22;
                                                        while (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            num.getClass();
                                                            getwek5ggoq = (getWEK5gGoQ) map5.get(num);
                                                            bitSet = new BitSet();
                                                            bitSet2 = new BitSet();
                                                            imageKt = new ImageKt();
                                                            if (getwek5ggoq != null) {
                                                                it4 = getwek5ggoq.MediaSessionCompatQueueItem().iterator();
                                                                while (it4.hasNext()) {
                                                                    gettvsatellitecsek5ggoq = (getTvSatelliteCsEK5gGoQ) it4.next();
                                                                    if (gettvsatellitecsek5ggoq.serializer()) {
                                                                        Map map15 = map5;
                                                                        i3 = MediaSessionCompatQueueItem + 23;
                                                                        Iterator it14 = it4;
                                                                        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                        if (i3 % 2 != 0) {
                                                                            i4 = gettvsatellitecsek5ggoq.read();
                                                                            int i11 = 4 / 0;
                                                                            if (gettvsatellitecsek5ggoq.RemoteActionCompatParcelizer()) {
                                                                                i5 = MediaMetadataCompat + 63;
                                                                                i6 = i4;
                                                                                MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                                if (i5 % 2 != 0) {
                                                                                    Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer());
                                                                                    throw null;
                                                                                }
                                                                                lValueOf = Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer());
                                                                                i4 = i6;
                                                                            } else {
                                                                                lValueOf = null;
                                                                            }
                                                                        } else {
                                                                            i4 = gettvsatellitecsek5ggoq.read();
                                                                            if (gettvsatellitecsek5ggoq.RemoteActionCompatParcelizer()) {
                                                                                i5 = MediaMetadataCompat + 63;
                                                                                i6 = i4;
                                                                                MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                                if (i5 % 2 != 0) {
                                                                                    Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer());
                                                                                    throw null;
                                                                                }
                                                                                lValueOf = Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer());
                                                                                i4 = i6;
                                                                            } else {
                                                                                lValueOf = null;
                                                                            }
                                                                        }
                                                                        imageKt.put(Integer.valueOf(i4), lValueOf);
                                                                        it4 = it14;
                                                                        map5 = map15;
                                                                    }
                                                                }
                                                            }
                                                            Map map16 = map5;
                                                            ImageKt imageKt11 = new ImageKt();
                                                            if (getwek5ggoq != null) {
                                                                it3 = getwek5ggoq.MediaMetadataCompat().iterator();
                                                                while (it3.hasNext()) {
                                                                    getvoiceassistek5ggoq = (getVoiceAssistEK5gGoQ) it3.next();
                                                                    if (!getvoiceassistek5ggoq.read()) {
                                                                    }
                                                                }
                                                            }
                                                            zzpg zzpgVar4 = zzpgVar2;
                                                            if (getwek5ggoq != null) {
                                                                i2 = 0;
                                                                while (i2 < getwek5ggoq.read() * 64) {
                                                                    if (zzgz.write((onPreFlingQWom1MosuspendImpl) getwek5ggoq.IconCompatParcelizer(), i2)) {
                                                                        it2 = it;
                                                                        lookaheadScopeKtLookaheadScope224.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer("Filter already evaluated. audience ID, filter ID", num, Integer.valueOf(i2));
                                                                        bitSet2.set(i2);
                                                                        if (zzgz.write((onPreFlingQWom1MosuspendImpl) getwek5ggoq.write(), i2)) {
                                                                            bitSet.set(i2);
                                                                        }
                                                                        i2++;
                                                                        it = it2;
                                                                    } else {
                                                                        it2 = it;
                                                                    }
                                                                    imageKt.remove(Integer.valueOf(i2));
                                                                    i2++;
                                                                    it = it2;
                                                                }
                                                            }
                                                            Iterator it15 = it;
                                                            getWEK5gGoQ getwek5ggoq4 = (getWEK5gGoQ) map4.get(num);
                                                            if (zWrite3) {
                                                                i = MediaSessionCompatQueueItem + 111;
                                                                MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                if (i % 2 == 0) {
                                                                    Object obj7 = null;
                                                                    obj7.hashCode();
                                                                    throw null;
                                                                }
                                                                if (!zWrite2) {
                                                                }
                                                            }
                                                            this.RemoteActionCompatParcelizer.put(num, new setThrottleMillis(this, this.IconCompatParcelizer, getwek5ggoq4, bitSet, bitSet2, imageKt, imageKt11));
                                                            it = it15;
                                                            zzpgVar2 = zzpgVar4;
                                                            str12 = str12;
                                                            map5 = map16;
                                                            str16 = str16;
                                                            zWrite2 = zWrite2;
                                                            obj = obj;
                                                            r22 = r22;
                                                            r11 = r11;
                                                            map4 = map4;
                                                            str13 = str13;
                                                            lookaheadScopeKtLookaheadScope224 = lookaheadScopeKtLookaheadScope224;
                                                        }
                                                    }
                                                    r12 = obj;
                                                    str4 = str15;
                                                    ?? r15 = r22;
                                                    str5 = str16;
                                                    cursor2 = null;
                                                    zzpgVar = zzpgVar2;
                                                    str6 = str12;
                                                    str7 = str13;
                                                    lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope224;
                                                    if (!list.isEmpty()) {
                                                        focusMeteringAction = new androidx.camera.core.FocusMeteringAction(this);
                                                        imageKt4 = new ImageKt();
                                                        it7 = list.iterator();
                                                        while (it7.hasNext()) {
                                                            gettvterrestrialdigitalek5ggoq = (getTvTerrestrialDigitalEK5gGoQ) it7.next();
                                                            gettvterrestrialdigitalek5ggoqSerializer = focusMeteringAction.serializer(gettvterrestrialdigitalek5ggoq, this.IconCompatParcelizer);
                                                            if (gettvterrestrialdigitalek5ggoqSerializer != null) {
                                                                getplaceablescountWrite = zzpgVar.MediaSessionCompatResultReceiverWrapper().write(this.IconCompatParcelizer, gettvterrestrialdigitalek5ggoq, gettvterrestrialdigitalek5ggoqSerializer.IconCompatParcelizer());
                                                                zzpgVar.MediaSessionCompatResultReceiverWrapper().write(str7, getplaceablescountWrite);
                                                                if (z) {
                                                                    j = getplaceablescountWrite.serializer;
                                                                    strIconCompatParcelizer = gettvterrestrialdigitalek5ggoqSerializer.IconCompatParcelizer();
                                                                    map8 = (Map) imageKt4.get(strIconCompatParcelizer);
                                                                    if (map8 == null) {
                                                                        LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper8 = zzpgVar.MediaSessionCompatResultReceiverWrapper();
                                                                        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope228 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper8.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                                                        str9 = this.IconCompatParcelizer;
                                                                        layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper8.ComponentActivity();
                                                                        layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper8.MediaSessionCompatToken();
                                                                        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str9);
                                                                        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(strIconCompatParcelizer);
                                                                        imageKt5 = new ImageKt();
                                                                        cursorQuery2 = layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper8.ResultReceiver().query("event_filters", new String[]{r12, str4}, "app_id=? AND event_name=?", new String[]{str9, strIconCompatParcelizer}, null, null, null);
                                                                        if (cursorQuery2.moveToFirst()) {
                                                                            getplaceablescount = getplaceablescountWrite;
                                                                            while (true) {
                                                                                getSpacebarEK5gGoQ getspacebarek5ggoq5 = (getSpacebarEK5gGoQ) ((getSoftSleepEK5gGoQ) zzgz.write(getSpacebarEK5gGoQ.serializer(), cursorQuery2.getBlob(1))).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                                                                                numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                list5 = (List) imageKt5.get(numValueOf2);
                                                                                if (list5 == null) {
                                                                                    focusMeteringAction2 = focusMeteringAction;
                                                                                    arrayList2 = new ArrayList();
                                                                                    imageKt5.put(numValueOf2, arrayList2);
                                                                                } else {
                                                                                    focusMeteringAction2 = focusMeteringAction;
                                                                                    arrayList2 = list5;
                                                                                }
                                                                                arrayList2.add(getspacebarek5ggoq5);
                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                focusMeteringAction = focusMeteringAction2;
                                                                            }
                                                                            cursorQuery2.close();
                                                                            map8 = imageKt5;
                                                                        } else {
                                                                            getplaceablescount = getplaceablescountWrite;
                                                                            focusMeteringAction2 = focusMeteringAction;
                                                                            map8 = Collections.EMPTY_MAP;
                                                                            cursorQuery2.close();
                                                                        }
                                                                        str8 = str5;
                                                                        imageKt4.put(strIconCompatParcelizer, map8);
                                                                    } else {
                                                                        getplaceablescount = getplaceablescountWrite;
                                                                        focusMeteringAction2 = focusMeteringAction;
                                                                        str8 = str5;
                                                                    }
                                                                    while (r20.hasNext()) {
                                                                        iIntValue = num4.intValue();
                                                                        if (this.read.contains(num4)) {
                                                                            lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer(num4, "Skipping failed audience ID");
                                                                        } else {
                                                                            it8 = ((List) map8.get(num4)).iterator();
                                                                            zWrite = true;
                                                                            while (true) {
                                                                                if (!it8.hasNext()) {
                                                                                    getplaceablescount2 = getplaceablescount;
                                                                                    map9 = map8;
                                                                                    num3 = num4;
                                                                                    break;
                                                                                }
                                                                                getSpacebarEK5gGoQ getspacebarek5ggoq6 = (getSpacebarEK5gGoQ) it8.next();
                                                                                getplaceablescount2 = getplaceablescount;
                                                                                map9 = map8;
                                                                                num3 = num4;
                                                                                setforcerecompose = new setForceRecompose(this, this.IconCompatParcelizer, iIntValue, getspacebarek5ggoq6, 0);
                                                                                Long l7 = this.write;
                                                                                Long l8 = this.serializer;
                                                                                iWrite = getspacebarek5ggoq6.write();
                                                                                setthrottlemillis = (setThrottleMillis) this.RemoteActionCompatParcelizer.get(num3);
                                                                                if (setthrottlemillis == null) {
                                                                                    z3 = false;
                                                                                } else {
                                                                                    z3 = setthrottlemillis.read.get(iWrite);
                                                                                }
                                                                                zWrite = setforcerecompose.write(l7, l8, gettvterrestrialdigitalek5ggoqSerializer, j, getplaceablescount2, z3);
                                                                                if (!zWrite) {
                                                                                    this.read.add(num3);
                                                                                    break;
                                                                                }
                                                                                i7 = MediaMetadataCompat + 39;
                                                                                MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                                if (i7 % 2 == 0) {
                                                                                    serializer(num3).RemoteActionCompatParcelizer(setforcerecompose);
                                                                                    cursor2.hashCode();
                                                                                    throw cursor2;
                                                                                }
                                                                                serializer(num3).RemoteActionCompatParcelizer(setforcerecompose);
                                                                                num4 = num3;
                                                                                map8 = map9;
                                                                                getplaceablescount = getplaceablescount2;
                                                                            }
                                                                            if (!zWrite) {
                                                                                this.read.add(num3);
                                                                            }
                                                                            map8 = map9;
                                                                            cursor2 = cursor2;
                                                                            getplaceablescount = getplaceablescount2;
                                                                        }
                                                                    }
                                                                    str5 = str8;
                                                                    focusMeteringAction = focusMeteringAction2;
                                                                } else {
                                                                    continue;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    String str22 = str5;
                                                    if (!z) {
                                                        return new ArrayList();
                                                    }
                                                    if (!list2.isEmpty()) {
                                                        imageKt6 = new ImageKt();
                                                        it9 = list2.iterator();
                                                        while (it9.hasNext()) {
                                                            getYEK5gGoQ getyek5ggoq2 = (getYEK5gGoQ) it9.next();
                                                            strIconCompatParcelizer2 = getyek5ggoq2.IconCompatParcelizer();
                                                            map10 = (Map) imageKt6.get(strIconCompatParcelizer2);
                                                            if (map10 == null) {
                                                                LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper9 = zzpgVar.MediaSessionCompatResultReceiverWrapper();
                                                                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope229 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper9.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                                                str11 = this.IconCompatParcelizer;
                                                                layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper9.ComponentActivity();
                                                                layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper9.MediaSessionCompatToken();
                                                                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str11);
                                                                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(strIconCompatParcelizer2);
                                                                imageKt7 = new ImageKt();
                                                                cursorQuery3 = layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper9.ResultReceiver().query("property_filters", new String[]{r12, str4}, "app_id=? AND property_name=?", new String[]{str11, strIconCompatParcelizer2}, null, null, null);
                                                                if (cursorQuery3.moveToFirst()) {
                                                                    while (true) {
                                                                        getSystemNavigationUpEK5gGoQ getsystemnavigationupek5ggoq3 = (getSystemNavigationUpEK5gGoQ) ((getSystemNavigationLeftEK5gGoQ) zzgz.write(getSystemNavigationUpEK5gGoQ.write(), cursorQuery3.getBlob(1))).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                                                                        numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                        list6 = (List) imageKt7.get(numValueOf5);
                                                                        if (list6 == null) {
                                                                            arrayList4 = new ArrayList();
                                                                            imageKt7.put(numValueOf5, arrayList4);
                                                                        } else {
                                                                            arrayList4 = list6;
                                                                        }
                                                                        arrayList4.add(getsystemnavigationupek5ggoq3);
                                                                        if (!cursorQuery3.moveToNext()) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it9 = it9;
                                                                    }
                                                                    cursorQuery3.close();
                                                                    map10 = imageKt7;
                                                                } else {
                                                                    it9 = it9;
                                                                    map10 = Collections.EMPTY_MAP;
                                                                    cursorQuery3.close();
                                                                }
                                                                imageKt6.put(strIconCompatParcelizer2, map10);
                                                            } else {
                                                                it9 = it9;
                                                            }
                                                            while (r2.hasNext()) {
                                                                int iIntValue4 = num5.intValue();
                                                                if (this.read.contains(num5)) {
                                                                    lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer(num5, "Skipping failed audience ID");
                                                                    break;
                                                                    break;
                                                                }
                                                                it10 = ((List) map10.get(num5)).iterator();
                                                                z4 = true;
                                                                while (true) {
                                                                    if (it10.hasNext()) {
                                                                        getsystemnavigationupek5ggoq = (getSystemNavigationUpEK5gGoQ) it10.next();
                                                                        if (Log.isLoggable(lookaheadScopeKtLookaheadScope222.RatingCompat().ResultReceiver(), 2)) {
                                                                            zzgs zzgsVarMediaSessionCompatResultReceiverWrapper2 = lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper();
                                                                            if (getsystemnavigationupek5ggoq.serializer()) {
                                                                                numValueOf4 = Integer.valueOf(getsystemnavigationupek5ggoq.RemoteActionCompatParcelizer());
                                                                            } else {
                                                                                numValueOf4 = null;
                                                                            }
                                                                            zzgsVarMediaSessionCompatResultReceiverWrapper2.IconCompatParcelizer("Evaluating filter. audience, filter, property", num5, numValueOf4, lookaheadScopeKtLookaheadScope222.serializer().RemoteActionCompatParcelizer(getsystemnavigationupek5ggoq.IconCompatParcelizer()));
                                                                            lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer(zzpgVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus().IconCompatParcelizer(getsystemnavigationupek5ggoq), "Filter definition");
                                                                        }
                                                                        if (getsystemnavigationupek5ggoq.serializer()) {
                                                                        }
                                                                        zzgs zzgsVarMediaSessionCompatQueueItem2 = lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatQueueItem();
                                                                        getLookaheadOffsetF1C5BW0 getlookaheadoffsetf1c5bw0RemoteActionCompatParcelizer2 = getLookaheadDelegate.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
                                                                        if (getsystemnavigationupek5ggoq.serializer()) {
                                                                            numValueOf3 = Integer.valueOf(getsystemnavigationupek5ggoq.RemoteActionCompatParcelizer());
                                                                        } else {
                                                                            numValueOf3 = null;
                                                                        }
                                                                        zzgsVarMediaSessionCompatQueueItem2.serializer("Invalid property filter ID. appId, id", getlookaheadoffsetf1c5bw0RemoteActionCompatParcelizer2, String.valueOf(numValueOf3));
                                                                        this.read.add(num5);
                                                                        map10 = map10;
                                                                    } else {
                                                                        map10 = map10;
                                                                    }
                                                                    if (!z4) {
                                                                        this.read.add(num5);
                                                                    }
                                                                    map10 = map10;
                                                                    serializer(num5).RemoteActionCompatParcelizer(setforcerecompose2);
                                                                    map10 = map10;
                                                                }
                                                            }
                                                            it9 = it9;
                                                        }
                                                    }
                                                    arrayList3 = new ArrayList();
                                                    Image<Integer> image2 = (Image) this.RemoteActionCompatParcelizer.keySet();
                                                    image2.removeAll(this.read);
                                                    while (r2.hasNext()) {
                                                        int iIntValue5 = num6.intValue();
                                                        setThrottleMillis setthrottlemillis3 = (setThrottleMillis) this.RemoteActionCompatParcelizer.get(num6);
                                                        accessgetSystemNavigationDowncp.IconCompatParcelizer(setthrottlemillis3);
                                                        getTvNumberEntryEK5gGoQ gettvnumberentryek5ggoqRemoteActionCompatParcelizer2 = setthrottlemillis3.RemoteActionCompatParcelizer(iIntValue5);
                                                        arrayList3.add(gettvnumberentryek5ggoqRemoteActionCompatParcelizer2);
                                                        layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper = zzpgVar.MediaSessionCompatResultReceiverWrapper();
                                                        lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                                        str10 = this.IconCompatParcelizer;
                                                        getWEK5gGoQ getwek5ggoqWrite2 = gettvnumberentryek5ggoqRemoteActionCompatParcelizer2.write();
                                                        layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper.ComponentActivity();
                                                        layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper.MediaSessionCompatToken();
                                                        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str10);
                                                        accessgetSystemNavigationDowncp.IconCompatParcelizer(getwek5ggoqWrite2);
                                                        byte[] bArrRemoveOnUserLeaveHintListener2 = getwek5ggoqWrite2.removeOnUserLeaveHintListener();
                                                        contentValues = new ContentValues();
                                                        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str10);
                                                        contentValues.put(r12, num6);
                                                        String str23 = str6;
                                                        contentValues.put(str23, bArrRemoveOnUserLeaveHintListener2);
                                                        if (layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper.ResultReceiver().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                            lookaheadScopeKtLookaheadScope223.RatingCompat().serializer().serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str10), "Failed to insert filter results (got -1). appId");
                                                        }
                                                        str6 = str23;
                                                    }
                                                    return arrayList3;
                                                }
                                            }
                                            int i12 = MediaSessionCompatQueueItem + 105;
                                            MediaMetadataCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            if (i12 % 2 != 0) {
                                                cursorQuery4.close();
                                                Object obj8 = null;
                                                obj8.hashCode();
                                                throw null;
                                            }
                                            cursorQuery4.close();
                                            obj3 = imageKt9;
                                        } else {
                                            cursorQuery4.close();
                                        }
                                    } catch (SQLiteException e20) {
                                        e = e20;
                                        str15 = RemoteMessageConst.DATA;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    if (r3 != 0) {
                                        int i13 = MediaMetadataCompat + 105;
                                        MediaSessionCompatQueueItem = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i14 = i13 % 2;
                                        r3.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e21) {
                                e = e21;
                                str15 = RemoteMessageConst.DATA;
                                str13 = "events";
                                cursorQuery4 = null;
                            } catch (Throwable th9) {
                                th = th9;
                                r3 = 0;
                                if (r3 != 0) {
                                    int i15 = MediaMetadataCompat + 105;
                                    MediaSessionCompatQueueItem = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i16 = i15 % 2;
                                    r3.close();
                                }
                                throw th;
                            }
                            LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper10 = zzpgVar2.MediaSessionCompatResultReceiverWrapper();
                            lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper10.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                            str2 = this.IconCompatParcelizer;
                            layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper10.ComponentActivity();
                            layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper10.MediaSessionCompatToken();
                            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
                            ResultReceiver = layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper10.ResultReceiver();
                            str16 = "audience_filter_values";
                            cursorQuery = ResultReceiver.query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str2}, null, null, null);
                            if (!(!cursorQuery.moveToFirst())) {
                                imageKt8 = new ImageKt();
                                while (true) {
                                    i8 = cursorQuery.getInt(0);
                                    imageKt8.put(Integer.valueOf(i8), (getWEK5gGoQ) ((getVolumeDownEK5gGoQ) zzgz.write(getWEK5gGoQ.serializer(), cursorQuery.getBlob(1))).r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                                    obj = obj5;
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    obj5 = obj;
                                    str17 = str17;
                                    str16 = str16;
                                }
                                cursorQuery.close();
                                map2 = imageKt8;
                                r22 = str17;
                            } else {
                                obj = "audience_id";
                                r22 = "Failed to merge filter. appId";
                                str16 = "Database error querying filters. appId";
                                Map map17 = Collections.EMPTY_MAP;
                                cursorQuery.close();
                                map2 = map17;
                            }
                            if (!map2.isEmpty()) {
                                HashSet hashSet2 = new HashSet(map2.keySet());
                                if (z2) {
                                    String str110 = this.IconCompatParcelizer;
                                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper11 = zzpgVar2.MediaSessionCompatResultReceiverWrapper();
                                    str3 = this.IconCompatParcelizer;
                                    layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper11.ComponentActivity();
                                    layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper11.MediaSessionCompatToken();
                                    accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str3);
                                    imageKt2 = new ImageKt();
                                    sQLiteDatabaseResultReceiver = layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper11.ResultReceiver();
                                    cursorRawQuery = sQLiteDatabaseResultReceiver.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                            arrayList = (List) imageKt2.get(numValueOf);
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                imageKt2.put(numValueOf, arrayList);
                                            }
                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                        } while (cursorRawQuery.moveToNext());
                                        map7 = imageKt2;
                                    } else {
                                        map7 = Collections.EMPTY_MAP;
                                    }
                                    cursorRawQuery.close();
                                    map6 = map7;
                                    accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str110);
                                    imageKt3 = new ImageKt();
                                    if (!map2.isEmpty()) {
                                        it5 = map2.keySet().iterator();
                                        while (it5.hasNext()) {
                                            num2 = (Integer) it5.next();
                                            num2.getClass();
                                            getwek5ggoq2 = (getWEK5gGoQ) map2.get(num2);
                                            list4 = (List) map6.get(num2);
                                            if (list4 != null || list4.isEmpty()) {
                                                it6 = it5;
                                                imageKt3.put(num2, getwek5ggoq2);
                                                map6 = map6;
                                                it5 = it6;
                                            } else {
                                                List list8 = zzpgVar2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus().read((onPreFlingQWom1MosuspendImpl) getwek5ggoq2.write(), list4);
                                                if (!list8.isEmpty()) {
                                                    getVolumeDownEK5gGoQ getvolumedownek5ggoq = (getVolumeDownEK5gGoQ) getwek5ggoq2.getOnBackPressedDispatcherannotations();
                                                    getvolumedownek5ggoq.IconCompatParcelizer();
                                                    getvolumedownek5ggoq.ParcelableVolumeInfo();
                                                    ((getWEK5gGoQ) getvolumedownek5ggoq.IconCompatParcelizer).serializer(list8);
                                                    List list9 = zzpgVar2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus().read((onPreFlingQWom1MosuspendImpl) getwek5ggoq2.IconCompatParcelizer(), list4);
                                                    getvolumedownek5ggoq.RemoteActionCompatParcelizer();
                                                    getvolumedownek5ggoq.ParcelableVolumeInfo();
                                                    ((getWEK5gGoQ) getvolumedownek5ggoq.IconCompatParcelizer).IconCompatParcelizer(list9);
                                                    ArrayList arrayList6 = new ArrayList();
                                                    Iterator it16 = getwek5ggoq2.MediaSessionCompatQueueItem().iterator();
                                                    while (it16.hasNext()) {
                                                        Iterator it17 = it5;
                                                        getTvSatelliteCsEK5gGoQ gettvsatellitecsek5ggoq2 = (getTvSatelliteCsEK5gGoQ) it16.next();
                                                        Iterator it18 = it16;
                                                        if (!list4.contains(Integer.valueOf(gettvsatellitecsek5ggoq2.read()))) {
                                                            arrayList6.add(gettvsatellitecsek5ggoq2);
                                                        }
                                                        it5 = it17;
                                                        it16 = it18;
                                                    }
                                                    it6 = it5;
                                                    getvolumedownek5ggoq.write();
                                                    getvolumedownek5ggoq.ParcelableVolumeInfo();
                                                    ((getWEK5gGoQ) getvolumedownek5ggoq.IconCompatParcelizer).RemoteActionCompatParcelizer(arrayList6);
                                                    ArrayList arrayList7 = new ArrayList();
                                                    for (getVoiceAssistEK5gGoQ getvoiceassistek5ggoq2 : getwek5ggoq2.MediaMetadataCompat()) {
                                                        if (!list4.contains(Integer.valueOf(getvoiceassistek5ggoq2.RemoteActionCompatParcelizer()))) {
                                                            arrayList7.add(getvoiceassistek5ggoq2);
                                                        }
                                                    }
                                                    getvolumedownek5ggoq.read();
                                                    getvolumedownek5ggoq.ParcelableVolumeInfo();
                                                    ((getWEK5gGoQ) getvolumedownek5ggoq.IconCompatParcelizer).RemoteActionCompatParcelizer((Iterable) arrayList7);
                                                    imageKt3.put(num2, (getWEK5gGoQ) getvolumedownek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                                                    map6 = map6;
                                                    it5 = it6;
                                                }
                                            }
                                        }
                                    }
                                    map3 = imageKt3;
                                } else {
                                    map3 = map2;
                                }
                                it = hashSet2.iterator();
                                map5 = map3;
                                r11 = obj3;
                                map4 = map2;
                                r22 = r22;
                                while (it.hasNext()) {
                                    num = (Integer) it.next();
                                    num.getClass();
                                    getwek5ggoq = (getWEK5gGoQ) map5.get(num);
                                    bitSet = new BitSet();
                                    bitSet2 = new BitSet();
                                    imageKt = new ImageKt();
                                    if (getwek5ggoq != null && getwek5ggoq.MediaDescriptionCompat() != 0) {
                                        it4 = getwek5ggoq.MediaSessionCompatQueueItem().iterator();
                                        while (it4.hasNext()) {
                                            gettvsatellitecsek5ggoq = (getTvSatelliteCsEK5gGoQ) it4.next();
                                            if (gettvsatellitecsek5ggoq.serializer()) {
                                                Map map18 = map5;
                                                i3 = MediaSessionCompatQueueItem + 23;
                                                Iterator it19 = it4;
                                                MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                if (i3 % 2 != 0) {
                                                    i4 = gettvsatellitecsek5ggoq.read();
                                                    int i17 = 4 / 0;
                                                    if (gettvsatellitecsek5ggoq.RemoteActionCompatParcelizer()) {
                                                        i5 = MediaMetadataCompat + 63;
                                                        i6 = i4;
                                                        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                        if (i5 % 2 != 0) {
                                                            Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer());
                                                            throw null;
                                                        }
                                                        lValueOf = Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer());
                                                        i4 = i6;
                                                    } else {
                                                        lValueOf = null;
                                                    }
                                                } else {
                                                    i4 = gettvsatellitecsek5ggoq.read();
                                                    if (gettvsatellitecsek5ggoq.RemoteActionCompatParcelizer()) {
                                                        i5 = MediaMetadataCompat + 63;
                                                        i6 = i4;
                                                        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                        if (i5 % 2 != 0) {
                                                            Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer());
                                                            throw null;
                                                        }
                                                        lValueOf = Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer());
                                                        i4 = i6;
                                                    } else {
                                                        lValueOf = null;
                                                    }
                                                }
                                                imageKt.put(Integer.valueOf(i4), lValueOf);
                                                it4 = it19;
                                                map5 = map18;
                                            }
                                        }
                                    }
                                    Map map19 = map5;
                                    ImageKt imageKt12 = new ImageKt();
                                    if (getwek5ggoq != null && getwek5ggoq.MediaBrowserCompatMediaItem() != 0) {
                                        it3 = getwek5ggoq.MediaMetadataCompat().iterator();
                                        while (it3.hasNext()) {
                                            getvoiceassistek5ggoq = (getVoiceAssistEK5gGoQ) it3.next();
                                            if (!getvoiceassistek5ggoq.read() && getvoiceassistek5ggoq.write() > 0) {
                                                imageKt12.put(Integer.valueOf(getvoiceassistek5ggoq.RemoteActionCompatParcelizer()), Long.valueOf(getvoiceassistek5ggoq.IconCompatParcelizer(getvoiceassistek5ggoq.write() - 1)));
                                                zzpgVar2 = zzpgVar2;
                                                it3 = it3;
                                            }
                                        }
                                    }
                                    zzpg zzpgVar5 = zzpgVar2;
                                    if (getwek5ggoq != null) {
                                        i2 = 0;
                                        while (i2 < getwek5ggoq.read() * 64) {
                                            if (zzgz.write((onPreFlingQWom1MosuspendImpl) getwek5ggoq.IconCompatParcelizer(), i2)) {
                                                it2 = it;
                                                lookaheadScopeKtLookaheadScope224.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer("Filter already evaluated. audience ID, filter ID", num, Integer.valueOf(i2));
                                                bitSet2.set(i2);
                                                if (zzgz.write((onPreFlingQWom1MosuspendImpl) getwek5ggoq.write(), i2)) {
                                                    bitSet.set(i2);
                                                }
                                                i2++;
                                                it = it2;
                                            } else {
                                                it2 = it;
                                            }
                                            imageKt.remove(Integer.valueOf(i2));
                                            i2++;
                                            it = it2;
                                        }
                                    }
                                    Iterator it110 = it;
                                    getWEK5gGoQ getwek5ggoq5 = (getWEK5gGoQ) map4.get(num);
                                    if (zWrite3) {
                                        i = MediaSessionCompatQueueItem + 111;
                                        MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        if (i % 2 == 0) {
                                            Object obj9 = null;
                                            obj9.hashCode();
                                            throw null;
                                        }
                                        if (!zWrite2 && (list3 = (List) r11.get(num)) != null && this.serializer != null) {
                                            int i18 = MediaMetadataCompat + 85;
                                            MediaSessionCompatQueueItem = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i19 = i18 % 2;
                                            if (this.write != null) {
                                                for (getSpacebarEK5gGoQ getspacebarek5ggoq7 : list3) {
                                                    int i20 = MediaSessionCompatQueueItem + 77;
                                                    MediaMetadataCompat = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                    int i21 = i20 % 2;
                                                    int iWrite2 = getspacebarek5ggoq7.write();
                                                    long jLongValue = this.serializer.longValue() / 1000;
                                                    if (!(!getspacebarek5ggoq7.MediaSessionCompatQueueItem())) {
                                                        int i22 = MediaMetadataCompat + 121;
                                                        MediaSessionCompatQueueItem = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                        int i23 = i22 % 2;
                                                        jLongValue = this.write.longValue() / 1000;
                                                    }
                                                    Integer numValueOf7 = Integer.valueOf(iWrite2);
                                                    if (imageKt.containsKey(numValueOf7)) {
                                                        imageKt.put(numValueOf7, Long.valueOf(jLongValue));
                                                    }
                                                    if (imageKt12.containsKey(numValueOf7)) {
                                                        imageKt12.put(numValueOf7, Long.valueOf(jLongValue));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    this.RemoteActionCompatParcelizer.put(num, new setThrottleMillis(this, this.IconCompatParcelizer, getwek5ggoq5, bitSet, bitSet2, imageKt, imageKt12));
                                    it = it110;
                                    zzpgVar2 = zzpgVar5;
                                    str12 = str12;
                                    map5 = map19;
                                    str16 = str16;
                                    zWrite2 = zWrite2;
                                    obj = obj;
                                    r22 = r22;
                                    r11 = r11;
                                    map4 = map4;
                                    str13 = str13;
                                    lookaheadScopeKtLookaheadScope224 = lookaheadScopeKtLookaheadScope224;
                                }
                            }
                            r12 = obj;
                            str4 = str15;
                            ?? r16 = r22;
                            str5 = str16;
                            cursor2 = null;
                            zzpgVar = zzpgVar2;
                            str6 = str12;
                            str7 = str13;
                            lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope224;
                            if (!list.isEmpty()) {
                                focusMeteringAction = new androidx.camera.core.FocusMeteringAction(this);
                                imageKt4 = new ImageKt();
                                it7 = list.iterator();
                                while (it7.hasNext()) {
                                    gettvterrestrialdigitalek5ggoq = (getTvTerrestrialDigitalEK5gGoQ) it7.next();
                                    gettvterrestrialdigitalek5ggoqSerializer = focusMeteringAction.serializer(gettvterrestrialdigitalek5ggoq, this.IconCompatParcelizer);
                                    if (gettvterrestrialdigitalek5ggoqSerializer != null) {
                                        getplaceablescountWrite = zzpgVar.MediaSessionCompatResultReceiverWrapper().write(this.IconCompatParcelizer, gettvterrestrialdigitalek5ggoq, gettvterrestrialdigitalek5ggoqSerializer.IconCompatParcelizer());
                                        zzpgVar.MediaSessionCompatResultReceiverWrapper().write(str7, getplaceablescountWrite);
                                        if (z) {
                                            j = getplaceablescountWrite.serializer;
                                            strIconCompatParcelizer = gettvterrestrialdigitalek5ggoqSerializer.IconCompatParcelizer();
                                            map8 = (Map) imageKt4.get(strIconCompatParcelizer);
                                            if (map8 == null) {
                                                LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper12 = zzpgVar.MediaSessionCompatResultReceiverWrapper();
                                                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope2210 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper12.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                                str9 = this.IconCompatParcelizer;
                                                layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper12.ComponentActivity();
                                                layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper12.MediaSessionCompatToken();
                                                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str9);
                                                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(strIconCompatParcelizer);
                                                imageKt5 = new ImageKt();
                                                cursorQuery2 = layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper12.ResultReceiver().query("event_filters", new String[]{r12, str4}, "app_id=? AND event_name=?", new String[]{str9, strIconCompatParcelizer}, null, null, null);
                                                if (cursorQuery2.moveToFirst()) {
                                                    getplaceablescount = getplaceablescountWrite;
                                                    while (true) {
                                                        getSpacebarEK5gGoQ getspacebarek5ggoq8 = (getSpacebarEK5gGoQ) ((getSoftSleepEK5gGoQ) zzgz.write(getSpacebarEK5gGoQ.serializer(), cursorQuery2.getBlob(1))).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                                                        numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                        list5 = (List) imageKt5.get(numValueOf2);
                                                        if (list5 == null) {
                                                            focusMeteringAction2 = focusMeteringAction;
                                                            arrayList2 = new ArrayList();
                                                            imageKt5.put(numValueOf2, arrayList2);
                                                        } else {
                                                            focusMeteringAction2 = focusMeteringAction;
                                                            arrayList2 = list5;
                                                        }
                                                        arrayList2.add(getspacebarek5ggoq8);
                                                        if (!cursorQuery2.moveToNext()) {
                                                            break;
                                                            break;
                                                        }
                                                        focusMeteringAction = focusMeteringAction2;
                                                    }
                                                    cursorQuery2.close();
                                                    map8 = imageKt5;
                                                } else {
                                                    getplaceablescount = getplaceablescountWrite;
                                                    focusMeteringAction2 = focusMeteringAction;
                                                    map8 = Collections.EMPTY_MAP;
                                                    cursorQuery2.close();
                                                }
                                                str8 = str5;
                                                imageKt4.put(strIconCompatParcelizer, map8);
                                            } else {
                                                getplaceablescount = getplaceablescountWrite;
                                                focusMeteringAction2 = focusMeteringAction;
                                                str8 = str5;
                                            }
                                            while (r20.hasNext()) {
                                                iIntValue = num4.intValue();
                                                if (this.read.contains(num4)) {
                                                    lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer(num4, "Skipping failed audience ID");
                                                } else {
                                                    it8 = ((List) map8.get(num4)).iterator();
                                                    zWrite = true;
                                                    while (true) {
                                                        if (!it8.hasNext()) {
                                                            getplaceablescount2 = getplaceablescount;
                                                            map9 = map8;
                                                            num3 = num4;
                                                            break;
                                                        }
                                                        getSpacebarEK5gGoQ getspacebarek5ggoq9 = (getSpacebarEK5gGoQ) it8.next();
                                                        getplaceablescount2 = getplaceablescount;
                                                        map9 = map8;
                                                        num3 = num4;
                                                        setforcerecompose = new setForceRecompose(this, this.IconCompatParcelizer, iIntValue, getspacebarek5ggoq9, 0);
                                                        Long l9 = this.write;
                                                        Long l10 = this.serializer;
                                                        iWrite = getspacebarek5ggoq9.write();
                                                        setthrottlemillis = (setThrottleMillis) this.RemoteActionCompatParcelizer.get(num3);
                                                        if (setthrottlemillis == null) {
                                                            z3 = false;
                                                        } else {
                                                            z3 = setthrottlemillis.read.get(iWrite);
                                                        }
                                                        zWrite = setforcerecompose.write(l9, l10, gettvterrestrialdigitalek5ggoqSerializer, j, getplaceablescount2, z3);
                                                        if (!zWrite) {
                                                            this.read.add(num3);
                                                            break;
                                                        }
                                                        i7 = MediaMetadataCompat + 39;
                                                        MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                        if (i7 % 2 == 0) {
                                                            serializer(num3).RemoteActionCompatParcelizer(setforcerecompose);
                                                            cursor2.hashCode();
                                                            throw cursor2;
                                                        }
                                                        serializer(num3).RemoteActionCompatParcelizer(setforcerecompose);
                                                        num4 = num3;
                                                        map8 = map9;
                                                        getplaceablescount = getplaceablescount2;
                                                    }
                                                    if (!zWrite) {
                                                        this.read.add(num3);
                                                    }
                                                    map8 = map9;
                                                    cursor2 = cursor2;
                                                    getplaceablescount = getplaceablescount2;
                                                }
                                            }
                                            str5 = str8;
                                            focusMeteringAction = focusMeteringAction2;
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                            String str24 = str5;
                            if (!z) {
                                return new ArrayList();
                            }
                            if (!list2.isEmpty()) {
                                imageKt6 = new ImageKt();
                                it9 = list2.iterator();
                                while (it9.hasNext()) {
                                    getYEK5gGoQ getyek5ggoq3 = (getYEK5gGoQ) it9.next();
                                    strIconCompatParcelizer2 = getyek5ggoq3.IconCompatParcelizer();
                                    map10 = (Map) imageKt6.get(strIconCompatParcelizer2);
                                    if (map10 == null) {
                                        LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper13 = zzpgVar.MediaSessionCompatResultReceiverWrapper();
                                        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope2211 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper13.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                        str11 = this.IconCompatParcelizer;
                                        layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper13.ComponentActivity();
                                        layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper13.MediaSessionCompatToken();
                                        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str11);
                                        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(strIconCompatParcelizer2);
                                        imageKt7 = new ImageKt();
                                        cursorQuery3 = layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper13.ResultReceiver().query("property_filters", new String[]{r12, str4}, "app_id=? AND property_name=?", new String[]{str11, strIconCompatParcelizer2}, null, null, null);
                                        if (cursorQuery3.moveToFirst()) {
                                            while (true) {
                                                getSystemNavigationUpEK5gGoQ getsystemnavigationupek5ggoq4 = (getSystemNavigationUpEK5gGoQ) ((getSystemNavigationLeftEK5gGoQ) zzgz.write(getSystemNavigationUpEK5gGoQ.write(), cursorQuery3.getBlob(1))).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                                                numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                list6 = (List) imageKt7.get(numValueOf5);
                                                if (list6 == null) {
                                                    arrayList4 = new ArrayList();
                                                    imageKt7.put(numValueOf5, arrayList4);
                                                } else {
                                                    arrayList4 = list6;
                                                }
                                                arrayList4.add(getsystemnavigationupek5ggoq4);
                                                if (!cursorQuery3.moveToNext()) {
                                                    break;
                                                    break;
                                                }
                                                it9 = it9;
                                            }
                                            cursorQuery3.close();
                                            map10 = imageKt7;
                                        } else {
                                            it9 = it9;
                                            map10 = Collections.EMPTY_MAP;
                                            cursorQuery3.close();
                                        }
                                        imageKt6.put(strIconCompatParcelizer2, map10);
                                    } else {
                                        it9 = it9;
                                    }
                                    while (r2.hasNext()) {
                                        int iIntValue6 = num5.intValue();
                                        if (this.read.contains(num5)) {
                                            lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer(num5, "Skipping failed audience ID");
                                            break;
                                            break;
                                        }
                                        it10 = ((List) map10.get(num5)).iterator();
                                        z4 = true;
                                        while (true) {
                                            if (it10.hasNext()) {
                                                getsystemnavigationupek5ggoq = (getSystemNavigationUpEK5gGoQ) it10.next();
                                                if (Log.isLoggable(lookaheadScopeKtLookaheadScope222.RatingCompat().ResultReceiver(), 2)) {
                                                    zzgs zzgsVarMediaSessionCompatResultReceiverWrapper3 = lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper();
                                                    if (getsystemnavigationupek5ggoq.serializer()) {
                                                        numValueOf4 = Integer.valueOf(getsystemnavigationupek5ggoq.RemoteActionCompatParcelizer());
                                                    } else {
                                                        numValueOf4 = null;
                                                    }
                                                    zzgsVarMediaSessionCompatResultReceiverWrapper3.IconCompatParcelizer("Evaluating filter. audience, filter, property", num5, numValueOf4, lookaheadScopeKtLookaheadScope222.serializer().RemoteActionCompatParcelizer(getsystemnavigationupek5ggoq.IconCompatParcelizer()));
                                                    lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer(zzpgVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus().IconCompatParcelizer(getsystemnavigationupek5ggoq), "Filter definition");
                                                }
                                                if (getsystemnavigationupek5ggoq.serializer() || getsystemnavigationupek5ggoq.RemoteActionCompatParcelizer() > 256) {
                                                    zzgs zzgsVarMediaSessionCompatQueueItem3 = lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatQueueItem();
                                                    getLookaheadOffsetF1C5BW0 getlookaheadoffsetf1c5bw0RemoteActionCompatParcelizer3 = getLookaheadDelegate.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
                                                    if (getsystemnavigationupek5ggoq.serializer()) {
                                                        numValueOf3 = Integer.valueOf(getsystemnavigationupek5ggoq.RemoteActionCompatParcelizer());
                                                    } else {
                                                        numValueOf3 = null;
                                                    }
                                                    zzgsVarMediaSessionCompatQueueItem3.serializer("Invalid property filter ID. appId, id", getlookaheadoffsetf1c5bw0RemoteActionCompatParcelizer3, String.valueOf(numValueOf3));
                                                    this.read.add(num5);
                                                    map10 = map10;
                                                } else {
                                                    setforcerecompose2 = new setForceRecompose(this, this.IconCompatParcelizer, iIntValue6, getsystemnavigationupek5ggoq, 1);
                                                    Long l11 = this.write;
                                                    Long l12 = this.serializer;
                                                    int iRemoteActionCompatParcelizer = getsystemnavigationupek5ggoq.RemoteActionCompatParcelizer();
                                                    setThrottleMillis setthrottlemillis4 = (setThrottleMillis) this.RemoteActionCompatParcelizer.get(num5);
                                                    if (setthrottlemillis4 == null) {
                                                        int i24 = MediaMetadataCompat + 1;
                                                        MediaSessionCompatQueueItem = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                        int i25 = i24 % 2;
                                                        z5 = false;
                                                    } else {
                                                        z5 = setthrottlemillis4.read.get(iRemoteActionCompatParcelizer);
                                                    }
                                                    z4 = setforcerecompose2.read(l11, l12, getyek5ggoq3, z5);
                                                    if (z4) {
                                                        serializer(num5).RemoteActionCompatParcelizer(setforcerecompose2);
                                                        map10 = map10;
                                                    } else {
                                                        this.read.add(num5);
                                                    }
                                                }
                                            } else {
                                                map10 = map10;
                                            }
                                            if (!z4) {
                                                this.read.add(num5);
                                            }
                                            map10 = map10;
                                        }
                                    }
                                    it9 = it9;
                                }
                            }
                            arrayList3 = new ArrayList();
                            Image<Integer> image3 = (Image) this.RemoteActionCompatParcelizer.keySet();
                            image3.removeAll(this.read);
                            while (r2.hasNext()) {
                                int iIntValue7 = num6.intValue();
                                setThrottleMillis setthrottlemillis5 = (setThrottleMillis) this.RemoteActionCompatParcelizer.get(num6);
                                accessgetSystemNavigationDowncp.IconCompatParcelizer(setthrottlemillis5);
                                getTvNumberEntryEK5gGoQ gettvnumberentryek5ggoqRemoteActionCompatParcelizer3 = setthrottlemillis5.RemoteActionCompatParcelizer(iIntValue7);
                                arrayList3.add(gettvnumberentryek5ggoqRemoteActionCompatParcelizer3);
                                layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper = zzpgVar.MediaSessionCompatResultReceiverWrapper();
                                lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                str10 = this.IconCompatParcelizer;
                                getWEK5gGoQ getwek5ggoqWrite3 = gettvnumberentryek5ggoqRemoteActionCompatParcelizer3.write();
                                layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper.ComponentActivity();
                                layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper.MediaSessionCompatToken();
                                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str10);
                                accessgetSystemNavigationDowncp.IconCompatParcelizer(getwek5ggoqWrite3);
                                byte[] bArrRemoveOnUserLeaveHintListener3 = getwek5ggoqWrite3.removeOnUserLeaveHintListener();
                                contentValues = new ContentValues();
                                contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str10);
                                contentValues.put(r12, num6);
                                String str25 = str6;
                                contentValues.put(str25, bArrRemoveOnUserLeaveHintListener3);
                                if (layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper.ResultReceiver().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                    lookaheadScopeKtLookaheadScope223.RatingCompat().serializer().serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str10), "Failed to insert filter results (got -1). appId");
                                }
                                str6 = str25;
                            }
                            return arrayList3;
                        }
                        obj = obj4;
                        if (!(!cursorQuery.moveToFirst())) {
                            imageKt8 = new ImageKt();
                            while (true) {
                                i8 = cursorQuery.getInt(0);
                                imageKt8.put(Integer.valueOf(i8), (getWEK5gGoQ) ((getVolumeDownEK5gGoQ) zzgz.write(getWEK5gGoQ.serializer(), cursorQuery.getBlob(1))).r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                                obj = obj5;
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                }
                                obj5 = obj;
                                str17 = str17;
                                str16 = str16;
                            }
                            cursorQuery.close();
                            map2 = imageKt8;
                            r22 = str17;
                        } else {
                            obj = "audience_id";
                            r22 = "Failed to merge filter. appId";
                            str16 = "Database error querying filters. appId";
                            Map map110 = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            map2 = map110;
                        }
                    } catch (SQLiteException e22) {
                        e = e22;
                        lookaheadScopeKtLookaheadScope221.RatingCompat().serializer().serializer("Database error querying filter results. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str2), e);
                        map = Collections.EMPTY_MAP;
                        map2 = map;
                        r22 = ResultReceiver;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            map2 = map;
                            r22 = ResultReceiver;
                        }
                    }
                } catch (SQLiteException e23) {
                    e = e23;
                    obj = obj5;
                }
            } catch (Throwable th10) {
                th = th10;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            str16 = "audience_filter_values";
            cursorQuery = ResultReceiver.query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str2}, null, null, null);
        } catch (SQLiteException e24) {
            e = e24;
            obj = "audience_id";
            ResultReceiver = "Failed to merge filter. appId";
            str16 = "Database error querying filters. appId";
            cursorQuery = null;
        } catch (Throwable th11) {
            th = th11;
            cursor = null;
        }
        obj2 = obj;
        obj3 = obj2;
        LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper14 = zzpgVar2.MediaSessionCompatResultReceiverWrapper();
        lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper14.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        str2 = this.IconCompatParcelizer;
        layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper14.ComponentActivity();
        layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper14.MediaSessionCompatToken();
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
        ResultReceiver = layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper14.ResultReceiver();
        if (!map2.isEmpty()) {
            HashSet hashSet3 = new HashSet(map2.keySet());
            if (z2) {
                String str111 = this.IconCompatParcelizer;
                LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper15 = zzpgVar2.MediaSessionCompatResultReceiverWrapper();
                str3 = this.IconCompatParcelizer;
                layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper15.ComponentActivity();
                layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper15.MediaSessionCompatToken();
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str3);
                imageKt2 = new ImageKt();
                sQLiteDatabaseResultReceiver = layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper15.ResultReceiver();
                cursorRawQuery = sQLiteDatabaseResultReceiver.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) imageKt2.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            imageKt2.put(numValueOf, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                    map7 = imageKt2;
                } else {
                    map7 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                map6 = map7;
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str111);
                imageKt3 = new ImageKt();
                if (!map2.isEmpty()) {
                    it5 = map2.keySet().iterator();
                    while (it5.hasNext()) {
                        num2 = (Integer) it5.next();
                        num2.getClass();
                        getwek5ggoq2 = (getWEK5gGoQ) map2.get(num2);
                        list4 = (List) map6.get(num2);
                        if (list4 != null) {
                        }
                        it6 = it5;
                        imageKt3.put(num2, getwek5ggoq2);
                        map6 = map6;
                        it5 = it6;
                    }
                }
                map3 = imageKt3;
            } else {
                map3 = map2;
            }
            it = hashSet3.iterator();
            map5 = map3;
            r11 = obj3;
            map4 = map2;
            r22 = r22;
            while (it.hasNext()) {
                num = (Integer) it.next();
                num.getClass();
                getwek5ggoq = (getWEK5gGoQ) map5.get(num);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                imageKt = new ImageKt();
                if (getwek5ggoq != null) {
                    it4 = getwek5ggoq.MediaSessionCompatQueueItem().iterator();
                    while (it4.hasNext()) {
                        gettvsatellitecsek5ggoq = (getTvSatelliteCsEK5gGoQ) it4.next();
                        if (gettvsatellitecsek5ggoq.serializer()) {
                            Map map111 = map5;
                            i3 = MediaSessionCompatQueueItem + 23;
                            Iterator it111 = it4;
                            MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i3 % 2 != 0) {
                                i4 = gettvsatellitecsek5ggoq.read();
                                int i110 = 4 / 0;
                                if (gettvsatellitecsek5ggoq.RemoteActionCompatParcelizer()) {
                                    i5 = MediaMetadataCompat + 63;
                                    i6 = i4;
                                    MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i5 % 2 != 0) {
                                        Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer());
                                        throw null;
                                    }
                                    lValueOf = Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer());
                                    i4 = i6;
                                } else {
                                    lValueOf = null;
                                }
                            } else {
                                i4 = gettvsatellitecsek5ggoq.read();
                                if (gettvsatellitecsek5ggoq.RemoteActionCompatParcelizer()) {
                                    i5 = MediaMetadataCompat + 63;
                                    i6 = i4;
                                    MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i5 % 2 != 0) {
                                        Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer());
                                        throw null;
                                    }
                                    lValueOf = Long.valueOf(gettvsatellitecsek5ggoq.IconCompatParcelizer());
                                    i4 = i6;
                                } else {
                                    lValueOf = null;
                                }
                            }
                            imageKt.put(Integer.valueOf(i4), lValueOf);
                            it4 = it111;
                            map5 = map111;
                        }
                    }
                }
                Map map112 = map5;
                ImageKt imageKt13 = new ImageKt();
                if (getwek5ggoq != null) {
                    it3 = getwek5ggoq.MediaMetadataCompat().iterator();
                    while (it3.hasNext()) {
                        getvoiceassistek5ggoq = (getVoiceAssistEK5gGoQ) it3.next();
                        if (!getvoiceassistek5ggoq.read()) {
                        }
                    }
                }
                zzpg zzpgVar6 = zzpgVar2;
                if (getwek5ggoq != null) {
                    i2 = 0;
                    while (i2 < getwek5ggoq.read() * 64) {
                        if (zzgz.write((onPreFlingQWom1MosuspendImpl) getwek5ggoq.IconCompatParcelizer(), i2)) {
                            it2 = it;
                            lookaheadScopeKtLookaheadScope224.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer("Filter already evaluated. audience ID, filter ID", num, Integer.valueOf(i2));
                            bitSet2.set(i2);
                            if (zzgz.write((onPreFlingQWom1MosuspendImpl) getwek5ggoq.write(), i2)) {
                                bitSet.set(i2);
                            }
                            i2++;
                            it = it2;
                        } else {
                            it2 = it;
                        }
                        imageKt.remove(Integer.valueOf(i2));
                        i2++;
                        it = it2;
                    }
                }
                Iterator it112 = it;
                getWEK5gGoQ getwek5ggoq6 = (getWEK5gGoQ) map4.get(num);
                if (zWrite3) {
                    i = MediaSessionCompatQueueItem + 111;
                    MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        Object obj10 = null;
                        obj10.hashCode();
                        throw null;
                    }
                    if (!zWrite2) {
                    }
                }
                this.RemoteActionCompatParcelizer.put(num, new setThrottleMillis(this, this.IconCompatParcelizer, getwek5ggoq6, bitSet, bitSet2, imageKt, imageKt13));
                it = it112;
                zzpgVar2 = zzpgVar6;
                str12 = str12;
                map5 = map112;
                str16 = str16;
                zWrite2 = zWrite2;
                obj = obj;
                r22 = r22;
                r11 = r11;
                map4 = map4;
                str13 = str13;
                lookaheadScopeKtLookaheadScope224 = lookaheadScopeKtLookaheadScope224;
            }
        }
        r12 = obj;
        str4 = str15;
        ?? r17 = r22;
        str5 = str16;
        cursor2 = null;
        zzpgVar = zzpgVar2;
        str6 = str12;
        str7 = str13;
        lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope224;
        if (!list.isEmpty()) {
            focusMeteringAction = new androidx.camera.core.FocusMeteringAction(this);
            imageKt4 = new ImageKt();
            it7 = list.iterator();
            while (it7.hasNext()) {
                gettvterrestrialdigitalek5ggoq = (getTvTerrestrialDigitalEK5gGoQ) it7.next();
                gettvterrestrialdigitalek5ggoqSerializer = focusMeteringAction.serializer(gettvterrestrialdigitalek5ggoq, this.IconCompatParcelizer);
                if (gettvterrestrialdigitalek5ggoqSerializer != null) {
                    getplaceablescountWrite = zzpgVar.MediaSessionCompatResultReceiverWrapper().write(this.IconCompatParcelizer, gettvterrestrialdigitalek5ggoq, gettvterrestrialdigitalek5ggoqSerializer.IconCompatParcelizer());
                    zzpgVar.MediaSessionCompatResultReceiverWrapper().write(str7, getplaceablescountWrite);
                    if (z) {
                        j = getplaceablescountWrite.serializer;
                        strIconCompatParcelizer = gettvterrestrialdigitalek5ggoqSerializer.IconCompatParcelizer();
                        map8 = (Map) imageKt4.get(strIconCompatParcelizer);
                        if (map8 == null) {
                            LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper16 = zzpgVar.MediaSessionCompatResultReceiverWrapper();
                            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope2212 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper16.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                            str9 = this.IconCompatParcelizer;
                            layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper16.ComponentActivity();
                            layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper16.MediaSessionCompatToken();
                            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str9);
                            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(strIconCompatParcelizer);
                            imageKt5 = new ImageKt();
                            cursorQuery2 = layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper16.ResultReceiver().query("event_filters", new String[]{r12, str4}, "app_id=? AND event_name=?", new String[]{str9, strIconCompatParcelizer}, null, null, null);
                            if (cursorQuery2.moveToFirst()) {
                                getplaceablescount = getplaceablescountWrite;
                                while (true) {
                                    getSpacebarEK5gGoQ getspacebarek5ggoq10 = (getSpacebarEK5gGoQ) ((getSoftSleepEK5gGoQ) zzgz.write(getSpacebarEK5gGoQ.serializer(), cursorQuery2.getBlob(1))).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                                    numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                    list5 = (List) imageKt5.get(numValueOf2);
                                    if (list5 == null) {
                                        focusMeteringAction2 = focusMeteringAction;
                                        arrayList2 = new ArrayList();
                                        imageKt5.put(numValueOf2, arrayList2);
                                    } else {
                                        focusMeteringAction2 = focusMeteringAction;
                                        arrayList2 = list5;
                                    }
                                    arrayList2.add(getspacebarek5ggoq10);
                                    if (!cursorQuery2.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    focusMeteringAction = focusMeteringAction2;
                                }
                                cursorQuery2.close();
                                map8 = imageKt5;
                            } else {
                                getplaceablescount = getplaceablescountWrite;
                                focusMeteringAction2 = focusMeteringAction;
                                map8 = Collections.EMPTY_MAP;
                                cursorQuery2.close();
                            }
                            str8 = str5;
                            imageKt4.put(strIconCompatParcelizer, map8);
                        } else {
                            getplaceablescount = getplaceablescountWrite;
                            focusMeteringAction2 = focusMeteringAction;
                            str8 = str5;
                        }
                        while (r20.hasNext()) {
                            iIntValue = num4.intValue();
                            if (this.read.contains(num4)) {
                                lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer(num4, "Skipping failed audience ID");
                            } else {
                                it8 = ((List) map8.get(num4)).iterator();
                                zWrite = true;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        getplaceablescount2 = getplaceablescount;
                                        map9 = map8;
                                        num3 = num4;
                                        break;
                                    }
                                    getSpacebarEK5gGoQ getspacebarek5ggoq11 = (getSpacebarEK5gGoQ) it8.next();
                                    getplaceablescount2 = getplaceablescount;
                                    map9 = map8;
                                    num3 = num4;
                                    setforcerecompose = new setForceRecompose(this, this.IconCompatParcelizer, iIntValue, getspacebarek5ggoq11, 0);
                                    Long l13 = this.write;
                                    Long l14 = this.serializer;
                                    iWrite = getspacebarek5ggoq11.write();
                                    setthrottlemillis = (setThrottleMillis) this.RemoteActionCompatParcelizer.get(num3);
                                    if (setthrottlemillis == null) {
                                        z3 = false;
                                    } else {
                                        z3 = setthrottlemillis.read.get(iWrite);
                                    }
                                    zWrite = setforcerecompose.write(l13, l14, gettvterrestrialdigitalek5ggoqSerializer, j, getplaceablescount2, z3);
                                    if (!zWrite) {
                                        this.read.add(num3);
                                        break;
                                    }
                                    i7 = MediaMetadataCompat + 39;
                                    MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i7 % 2 == 0) {
                                        serializer(num3).RemoteActionCompatParcelizer(setforcerecompose);
                                        cursor2.hashCode();
                                        throw cursor2;
                                    }
                                    serializer(num3).RemoteActionCompatParcelizer(setforcerecompose);
                                    num4 = num3;
                                    map8 = map9;
                                    getplaceablescount = getplaceablescount2;
                                }
                                if (!zWrite) {
                                    this.read.add(num3);
                                }
                                map8 = map9;
                                cursor2 = cursor2;
                                getplaceablescount = getplaceablescount2;
                            }
                        }
                        str5 = str8;
                        focusMeteringAction = focusMeteringAction2;
                    } else {
                        continue;
                    }
                }
            }
        }
        String str26 = str5;
        if (!z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            imageKt6 = new ImageKt();
            it9 = list2.iterator();
            while (it9.hasNext()) {
                getYEK5gGoQ getyek5ggoq4 = (getYEK5gGoQ) it9.next();
                strIconCompatParcelizer2 = getyek5ggoq4.IconCompatParcelizer();
                map10 = (Map) imageKt6.get(strIconCompatParcelizer2);
                if (map10 == null) {
                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper17 = zzpgVar.MediaSessionCompatResultReceiverWrapper();
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope2213 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper17.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    str11 = this.IconCompatParcelizer;
                    layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper17.ComponentActivity();
                    layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper17.MediaSessionCompatToken();
                    accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str11);
                    accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(strIconCompatParcelizer2);
                    imageKt7 = new ImageKt();
                    cursorQuery3 = layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper17.ResultReceiver().query("property_filters", new String[]{r12, str4}, "app_id=? AND property_name=?", new String[]{str11, strIconCompatParcelizer2}, null, null, null);
                    if (cursorQuery3.moveToFirst()) {
                        while (true) {
                            getSystemNavigationUpEK5gGoQ getsystemnavigationupek5ggoq5 = (getSystemNavigationUpEK5gGoQ) ((getSystemNavigationLeftEK5gGoQ) zzgz.write(getSystemNavigationUpEK5gGoQ.write(), cursorQuery3.getBlob(1))).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                            list6 = (List) imageKt7.get(numValueOf5);
                            if (list6 == null) {
                                arrayList4 = new ArrayList();
                                imageKt7.put(numValueOf5, arrayList4);
                            } else {
                                arrayList4 = list6;
                            }
                            arrayList4.add(getsystemnavigationupek5ggoq5);
                            if (!cursorQuery3.moveToNext()) {
                                break;
                                break;
                            }
                            it9 = it9;
                        }
                        cursorQuery3.close();
                        map10 = imageKt7;
                    } else {
                        it9 = it9;
                        map10 = Collections.EMPTY_MAP;
                        cursorQuery3.close();
                    }
                    imageKt6.put(strIconCompatParcelizer2, map10);
                } else {
                    it9 = it9;
                }
                while (r2.hasNext()) {
                    int iIntValue8 = num5.intValue();
                    if (this.read.contains(num5)) {
                        lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer(num5, "Skipping failed audience ID");
                        break;
                        break;
                    }
                    it10 = ((List) map10.get(num5)).iterator();
                    z4 = true;
                    while (true) {
                        if (it10.hasNext()) {
                            getsystemnavigationupek5ggoq = (getSystemNavigationUpEK5gGoQ) it10.next();
                            if (Log.isLoggable(lookaheadScopeKtLookaheadScope222.RatingCompat().ResultReceiver(), 2)) {
                                zzgs zzgsVarMediaSessionCompatResultReceiverWrapper4 = lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper();
                                if (getsystemnavigationupek5ggoq.serializer()) {
                                    numValueOf4 = Integer.valueOf(getsystemnavigationupek5ggoq.RemoteActionCompatParcelizer());
                                } else {
                                    numValueOf4 = null;
                                }
                                zzgsVarMediaSessionCompatResultReceiverWrapper4.IconCompatParcelizer("Evaluating filter. audience, filter, property", num5, numValueOf4, lookaheadScopeKtLookaheadScope222.serializer().RemoteActionCompatParcelizer(getsystemnavigationupek5ggoq.IconCompatParcelizer()));
                                lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatResultReceiverWrapper().serializer(zzpgVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus().IconCompatParcelizer(getsystemnavigationupek5ggoq), "Filter definition");
                            }
                            if (getsystemnavigationupek5ggoq.serializer()) {
                            }
                            zzgs zzgsVarMediaSessionCompatQueueItem4 = lookaheadScopeKtLookaheadScope222.RatingCompat().MediaSessionCompatQueueItem();
                            getLookaheadOffsetF1C5BW0 getlookaheadoffsetf1c5bw0RemoteActionCompatParcelizer4 = getLookaheadDelegate.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
                            if (getsystemnavigationupek5ggoq.serializer()) {
                                numValueOf3 = Integer.valueOf(getsystemnavigationupek5ggoq.RemoteActionCompatParcelizer());
                            } else {
                                numValueOf3 = null;
                            }
                            zzgsVarMediaSessionCompatQueueItem4.serializer("Invalid property filter ID. appId, id", getlookaheadoffsetf1c5bw0RemoteActionCompatParcelizer4, String.valueOf(numValueOf3));
                            this.read.add(num5);
                            map10 = map10;
                        } else {
                            map10 = map10;
                        }
                        if (!z4) {
                            this.read.add(num5);
                        }
                        map10 = map10;
                        serializer(num5).RemoteActionCompatParcelizer(setforcerecompose2);
                        map10 = map10;
                    }
                }
                it9 = it9;
            }
        }
        arrayList3 = new ArrayList();
        Image<Integer> image4 = (Image) this.RemoteActionCompatParcelizer.keySet();
        image4.removeAll(this.read);
        while (r2.hasNext()) {
            int iIntValue9 = num6.intValue();
            setThrottleMillis setthrottlemillis6 = (setThrottleMillis) this.RemoteActionCompatParcelizer.get(num6);
            accessgetSystemNavigationDowncp.IconCompatParcelizer(setthrottlemillis6);
            getTvNumberEntryEK5gGoQ gettvnumberentryek5ggoqRemoteActionCompatParcelizer4 = setthrottlemillis6.RemoteActionCompatParcelizer(iIntValue9);
            arrayList3.add(gettvnumberentryek5ggoqRemoteActionCompatParcelizer4);
            layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper = zzpgVar.MediaSessionCompatResultReceiverWrapper();
            lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            str10 = this.IconCompatParcelizer;
            getWEK5gGoQ getwek5ggoqWrite4 = gettvnumberentryek5ggoqRemoteActionCompatParcelizer4.write();
            layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper.ComponentActivity();
            layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper.MediaSessionCompatToken();
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str10);
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getwek5ggoqWrite4);
            byte[] bArrRemoveOnUserLeaveHintListener4 = getwek5ggoqWrite4.removeOnUserLeaveHintListener();
            contentValues = new ContentValues();
            contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str10);
            contentValues.put(r12, num6);
            String str27 = str6;
            contentValues.put(str27, bArrRemoveOnUserLeaveHintListener4);
            if (layoutNodeSubcompositionsStatecreateMeasurePolicy1MediaSessionCompatResultReceiverWrapper.ResultReceiver().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                lookaheadScopeKtLookaheadScope223.RatingCompat().serializer().serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str10), "Failed to insert filter results (got -1). appId");
            }
            str6 = str27;
        }
        return arrayList3;
    }

    public setContent(zzpg zzpgVar) {
        super(zzpgVar);
    }

    @Override // o.getOnGloballyPositioned
    public final void read() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 93;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
