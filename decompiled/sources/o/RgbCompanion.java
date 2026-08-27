package o;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class RgbCompanion implements getPrimaries {
    public Object IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final AssetManager write;
    private static final byte[] $$a = {90, 53, 127, -76};
    private static final int $$b = 156;
    private static int RatingCompat = 0;
    private static int MediaDescriptionCompat = 1;
    private static char[] read = {63632, 52557, 52591, 52554, 52589, 63636, 52600, 63634, 63637, 52572, 52607, 52585, 63635, 52606, 63639, 52580};
    private static char MediaSessionCompatQueueItem = 63634;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(int r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 103
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r0 = o.RgbCompanion.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r8
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RgbCompanion.$$c(int, byte, byte):java.lang.String");
    }

    @Override // o.getPrimaries
    public final r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I RemoteActionCompatParcelizer() {
        return r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.LOCAL;
    }

    @Override // o.getPrimaries
    public final void read() {
    }

    public RgbCompanion(AssetManager assetManager, String str, int i) {
        this.serializer = i;
        this.write = assetManager;
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // o.getPrimaries
    public final void write() {
        Object obj = this.IconCompatParcelizer;
        if (obj == null) {
            return;
        }
        try {
            if (this.serializer != 0) {
                ((AssetFileDescriptor) obj).close();
            } else {
                ((InputStream) obj).close();
            }
        } catch (IOException unused) {
        }
    }

    @Override // o.getPrimaries
    public final Class serializer() {
        return this.serializer != 0 ? AssetFileDescriptor.class : InputStream.class;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028 A[Catch: IOException -> 0x001e, PHI: r0 r4
  0x0028: PHI (r0v12 android.content.res.AssetManager) = (r0v7 android.content.res.AssetManager), (r0v13 android.content.res.AssetManager) binds: [B:11:0x0026, B:6:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r4v20 java.lang.String) = (r4v3 java.lang.String), (r4v21 java.lang.String) binds: [B:11:0x0026, B:6:0x001b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {IOException -> 0x001e, blocks: (B:4:0x0012, B:19:0x0075, B:22:0x007c, B:24:0x0082, B:25:0x0083, B:12:0x0028, B:10:0x0020, B:14:0x002d, B:16:0x003a, B:17:0x0064), top: B:30:0x0010, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x003a A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:14:0x002d, B:16:0x003a, B:17:0x0064), top: B:28:0x002d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x002d A[EXC_TOP_SPLITTER, PHI: r0 r4
  0x002d: PHI (r0v8 android.content.res.AssetManager) = (r0v7 android.content.res.AssetManager), (r0v13 android.content.res.AssetManager) binds: [B:11:0x0026, B:6:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v21 java.lang.String) binds: [B:11:0x0026, B:6:0x001b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // o.getPrimaries
    public final void read(RenderIntentCompanion renderIntentCompanion, getInverseTransformui_graphics getinversetransformui_graphics) throws Throwable {
        AssetManager assetManager;
        String str;
        Object objRemoteActionCompatParcelizer;
        Object objOpenFd;
        int i = 2 % 2;
        int i2 = RatingCompat + 29;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        try {
            if (i2 % 2 == 0) {
                assetManager = this.write;
                str = this.RemoteActionCompatParcelizer;
                int i3 = 34 / 0;
                if (this.serializer != 0) {
                    objOpenFd = assetManager.openFd(str);
                } else {
                    try {
                        Object[] objArr = {assetManager, str};
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1791441156);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (26244 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), 37 - ExpandableListView.getPackedPositionType(0L), android.graphics.Color.argb(0, 0, 0, 0) + 13, 1172891421, false, "write", new Class[]{AssetManager.class, String.class});
                        }
                        Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
                        int i4 = RatingCompat + 29;
                        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        objOpenFd = objInvoke;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            } else {
                assetManager = this.write;
                str = this.RemoteActionCompatParcelizer;
                if (this.serializer != 0) {
                    objOpenFd = assetManager.openFd(str);
                } else {
                    Object[] objArr2 = {assetManager, str};
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1791441156);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (26244 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), 37 - ExpandableListView.getPackedPositionType(0L), android.graphics.Color.argb(0, 0, 0, 0) + 13, 1172891421, false, "write", new Class[]{AssetManager.class, String.class});
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2);
                    int i6 = RatingCompat + 29;
                    MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    objOpenFd = objInvoke2;
                }
            }
            this.IconCompatParcelizer = objOpenFd;
            getinversetransformui_graphics.serializer(objOpenFd);
        } catch (IOException e) {
            Object[] objArr3 = new Object[1];
            a(new char[]{2, '\t', 11, '\b', 5, '\n', 5, 7, 3, 7, '\n', 7, 3, 14, '\t', 15}, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16, (byte) (104 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr3);
            Log.isLoggable((String) objArr3[0], 3);
            getinversetransformui_graphics.write(e);
        }
    }

    private static void a(char[] cArr, int i, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        extractIntegerPixels extractintegerpixels = new extractIntegerPixels();
        char[] cArr2 = read;
        char c = '0';
        int i3 = -556721944;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i3);
                    if (objRemoteActionCompatParcelizer == null) {
                        char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                        int packedPositionGroup = 2015 - ExpandableListView.getPackedPositionGroup(j);
                        int iIndexOf = TextUtils.indexOf("", c, 0) + 25;
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c2, packedPositionGroup, iIndexOf, 234961161, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i4++;
                    c = '0';
                    i3 = -556721944;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(MediaSessionCompatQueueItem)};
        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-556721944);
        if (objRemoteActionCompatParcelizer2 == null) {
            byte b4 = (byte) 0;
            byte b5 = b4;
            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2014, 24 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 234961161, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            extractintegerpixels.IconCompatParcelizer = 0;
            while (extractintegerpixels.IconCompatParcelizer < i2) {
                extractintegerpixels.read = cArr[extractintegerpixels.IconCompatParcelizer];
                extractintegerpixels.write = cArr[extractintegerpixels.IconCompatParcelizer + 1];
                if (extractintegerpixels.read == extractintegerpixels.write) {
                    cArr4[extractintegerpixels.IconCompatParcelizer] = (char) (extractintegerpixels.read - b);
                    cArr4[extractintegerpixels.IconCompatParcelizer + 1] = (char) (extractintegerpixels.write - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels};
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(445195572);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) android.view.KeyEvent.getDeadChar(0, 0), 141 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 18 - View.MeasureSpec.makeMeasureSpec(0, 0), -900135723, false, "f", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == extractintegerpixels.RatingCompat) {
                        Object[] objArr5 = {extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels};
                        Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1333055039);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            byte b6 = (byte) 1;
                            byte b7 = (byte) (b6 - 1);
                            objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (MotionEvent.axisFromString("") + 1), TextUtils.indexOf((CharSequence) "", '0') + 2371, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 17, 1616580640, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i5 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.RatingCompat;
                        cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[iIntValue];
                        cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i5];
                    } else {
                        obj = null;
                        if (extractintegerpixels.serializer == extractintegerpixels.RemoteActionCompatParcelizer) {
                            extractintegerpixels.MediaBrowserCompatMediaItem = ((extractintegerpixels.MediaBrowserCompatMediaItem + cCharValue) - 1) % cCharValue;
                            extractintegerpixels.RatingCompat = ((extractintegerpixels.RatingCompat + cCharValue) - 1) % cCharValue;
                            int i6 = (extractintegerpixels.serializer * cCharValue) + extractintegerpixels.MediaBrowserCompatMediaItem;
                            int i7 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.RatingCompat;
                            cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[i6];
                            cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i7];
                        } else {
                            int i8 = (extractintegerpixels.serializer * cCharValue) + extractintegerpixels.RatingCompat;
                            int i9 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.MediaBrowserCompatMediaItem;
                            cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[i8];
                            cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i9];
                        }
                    }
                }
                extractintegerpixels.IconCompatParcelizer += 2;
                obj2 = obj;
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            cArr4[i10] = (char) (cArr4[i10] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
