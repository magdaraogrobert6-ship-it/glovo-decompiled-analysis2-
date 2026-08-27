package o;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.ExpandableListView;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.rider.support.implementation.data.RiderSupportBreakRequestLogger;
import com.sentiance.core.model.events.N$b;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class isImportantForAccessibilityui implements getMergePolicyui {
    public final SignInDataStore IconCompatParcelizer;
    public final N$b MediaMetadataCompat;
    public final setTraversalGroup RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final textEntryKey serializer;
    public final String write;
    private static final byte[] $$b = {2, 109, -66, 106};
    private static final int $$c = 74;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int RatingCompat = 0;
    private static int ParcelableVolumeInfo = 1;
    private static long MediaSessionCompatQueueItem = -7009568347796326538L;
    private static int MediaBrowserCompatMediaItem = 1548437165;
    private static char MediaDescriptionCompat = 14198;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$d(int r5, short r6, short r7) {
        /*
            int r5 = r5 * 3
            int r5 = 4 - r5
            int r7 = 111 - r7
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = o.isImportantForAccessibilityui.$$b
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            r4 = r1[r5]
            int r3 = r3 + 1
        L24:
            int r4 = -r4
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isImportantForAccessibilityui.$$d(int, short, short):java.lang.String");
    }

    public isImportantForAccessibilityui(String str, getQueryContext getquerycontext, SignInDataStore signInDataStore, N$b n$b, setTraversalGroup settraversalgroup, textEntryKey textentrykey) {
        getquerycontext.getClass();
        signInDataStore.getClass();
        n$b.getClass();
        settraversalgroup.getClass();
        textentrykey.getClass();
        this.write = str;
        this.read = getquerycontext;
        this.IconCompatParcelizer = signInDataStore;
        this.MediaMetadataCompat = n$b;
        this.RemoteActionCompatParcelizer = settraversalgroup;
        this.serializer = textentrykey;
    }

    public static void $$a(long j, long j2) throws Throwable {
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a(1364786111 - Drawable.resolveOpacity(0, 0), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), new char[]{49130, 22779, 14929, 32400}, new char[]{0, 0, 0, 0}, new char[]{44611, 64290, 59565, 4803, 8379, 9561, 32051, 21275, 46171}, objArr);
        RiderSupportBreakRequestLogger.class.getField((String) objArr[0]).get(null);
        Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj != null) {
                int i2 = RatingCompat + 3;
                ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                int i4 = ParcelableVolumeInfo + 75;
                RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Object[] objArr2 = {Long.valueOf(j3)};
                Object[] objArr3 = new Object[1];
                a(android.view.KeyEvent.normalizeMetaState(0) + 1862036323, (char) (37974 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), new char[]{25532, 64619, 22126, 19348}, new char[]{0, 0, 0, 0}, new char[]{2780, 42855, 46272}, objArr3);
                Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj2, objArr2);
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr4 = new Object[0];
                Object[] objArr5 = new Object[1];
                a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 142440958, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{611, 33414, 43767, 24178}, new char[]{0, 0, 0, 0}, new char[]{65108, 33686, 1010, 40559, 62108, 56354, 59459, 11161, 11144, 29960, 5283, 12123, 46635, 20763, 55177, 61405, 48828, 17868, 1205, 15194, 23293, 14323, 61116, 43026, 60262, 42175, 31873, 37084, 24168, 20040, 9522, 46172, 58598, 45217, 43622, 47958, 64709}, objArr5);
                Object[] objArr6 = {(String) objArr5[0], objArr4};
                Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                method2.setAccessible(true);
                method2.invoke(obj3, objArr6);
            }
            int i6 = ParcelableVolumeInfo + 35;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void a(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        accesstoOffsetmoWRBKg accesstooffsetmowrbkg = new accesstoOffsetmoWRBKg();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        accesstooffsetmowrbkg.IconCompatParcelizer = 0;
        int i3 = $11 + 79;
        $10 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        while (accesstooffsetmowrbkg.IconCompatParcelizer < length3) {
            try {
                Object[] objArr2 = {accesstooffsetmowrbkg};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2056078218);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) TextUtils.getOffsetAfter("", 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 231, 21 - View.MeasureSpec.makeMeasureSpec(0, 0), 1436720535, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {accesstooffsetmowrbkg};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(729107336);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) View.MeasureSpec.makeMeasureSpec(0, 0), 2546 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 31, -73045399, false, $$d(b, b2, (byte) (b2 | 7)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {accesstooffsetmowrbkg, Integer.valueOf(cArr4[accesstooffsetmowrbkg.IconCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(245609149);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), 887 - android.view.KeyEvent.getDeadChar(0, 0), 60 - ExpandableListView.getPackedPositionGroup(0L), -562850980, false, $$d(b3, b4, b4), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1101373148);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (65450 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1244 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 'Q' - AndroidCharacter.getMirror('0'), 1854554309, false, $$d(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = accesstooffsetmowrbkg.write;
                cArr6[accesstooffsetmowrbkg.IconCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[accesstooffsetmowrbkg.IconCompatParcelizer])) ^ (MediaSessionCompatQueueItem ^ (-7009568347796326538L))) ^ ((long) ((int) (((long) MediaBrowserCompatMediaItem) ^ (-7009568347796326538L))))) ^ ((long) ((char) (((long) MediaDescriptionCompat) ^ (-7009568347796326538L)))));
                accesstooffsetmowrbkg.IconCompatParcelizer++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i5 = $11 + 55;
        $10 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }
}
