package kotlin.io;

import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2;
import androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.w$$ExternalSyntheticLambda0;
import coil3.ExtrasKt;
import coil3.util.ContextsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.InterruptibleKt$runInterruptible$2;
import o.AndroidContentCaptureManager;
import o.BlurFilter;
import o.DrawableTransformation;
import o.LayoutTileBinding;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getRgb565_sVssgQ;
import o.markOnScreenCardsAsReadlambda1;
import o.notifySemanticsChangeui;
import o.notifyViewEntered;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.performCustomRequestFocusMxy_nc0;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaN7z0Ea2bnxePLVipqp_gDhWww;
import o.r8lambdaSdLB8He51_fnZHUESctgYSoqgpg;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.requestDisplayInAppMessagelambda4;
import o.resumeWebviewIfNecessarylambda0;
import o.setRotationX;
import o.sourceInformationContextOfdefault;
import org.koin.dsl.ModuleDSLKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TextStreamsKt {
    private static int IconCompatParcelizer = 1;
    public static BlurFilter RemoteActionCompatParcelizer;
    public static notifySemanticsChangeui read;
    private static int serializer;

    public static /* synthetic */ Object read(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i6);
        int i9 = ~i6;
        int i10 = i8 | (~(i9 | i3));
        int i11 = (~(i6 | i3)) | (~((~i3) | i7 | i9));
        int i12 = i7 | i3 | i9;
        int i13 = i3 + i5 + i2 + (1362283521 * i) + ((-853422242) * i4);
        int i14 = i13 * i13;
        int i15 = ((1713903284 * i3) - 1228931072) + ((-782767794) * i5) + (i10 * 1248335539) + (1248335539 * i11) + ((-1248335539) * i12) + (i2 * 465567744) + (465567744 * i) + (1887436800 * i4) + ((-1154482176) * i14);
        int i16 = ((i3 * 722868660) - 41817558) + (i5 * 722869710) + (i10 * (-525)) + (i11 * (-525)) + (i12 * 525) + (i2 * 722869185) + (i * 1172694977) + (i4 * (-747618338)) + (i14 * 791674880);
        int i17 = i15 + (i16 * i16 * 751828992);
        if (i17 != 1) {
            return i17 != 2 ? serializer(objArr) : RemoteActionCompatParcelizer(objArr);
        }
        return write(objArr);
    }

    public abstract boolean RemoteActionCompatParcelizer();

    public abstract int serializer();

    public static void serializer(Object obj, String str) {
        int i = 2 % 2;
        int i2 = serializer + 5;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (obj != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(str);
        int i3 = serializer + 73;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public static final resumeWebviewIfNecessarylambda0 write(BufferedReader bufferedReader) {
        int i = 2 % 2;
        requestDisplayInAppMessagelambda4 requestdisplayinappmessagelambda4 = new requestDisplayInAppMessagelambda4(new r8lambdaN7z0Ea2bnxePLVipqp_gDhWww(0, bufferedReader));
        int i2 = IconCompatParcelizer + 45;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 20 / 0;
        }
        return requestdisplayinappmessagelambda4;
    }

    public static void IconCompatParcelizer(String str, Object obj, boolean z) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 77;
        serializer = i3 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (z) {
            int i4 = i2 + 103;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
        int iWrite = MaybeObserveOn.write();
        int iWrite2 = MaybeObserveOn.write();
        int iWrite3 = MaybeObserveOn.write();
        ScreenStartObserver$$ExternalSyntheticLambda0.write((String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, iWrite2, -1556036116, iWrite, new Object[]{str, new Object[]{obj}}, iWrite3));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public static void serializer(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = serializer;
        int i5 = i4 + 5;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
            if (i >= 0) {
                if (i <= i2) {
                    int i7 = i4 + 5;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return;
                }
            }
        } else if (i >= 0) {
            if (i <= i2) {
                int i9 = i4 + 5;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return;
            }
        }
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), "index"};
        int iWrite = w$$ExternalSyntheticLambda0.write();
        DrawableTransformation.read((String) read(objArr, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), 1230781564, w$$ExternalSyntheticLambda0.write(), -1230781563, iWrite));
    }

    public static void RemoteActionCompatParcelizer(String str, boolean z) {
        int i = 2 % 2;
        int i2 = serializer + 7;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (z) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(str);
        int i4 = serializer + 67;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final notifyViewEntered read(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        notifyViewEntered notifyviewentered = (notifyViewEntered) textAnnouncementContentCardView.get(AndroidContentCaptureManager.IconCompatParcelizer);
        if (notifyviewentered == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
            return null;
        }
        int i4 = serializer;
        int i5 = i4 + 21;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
        int i7 = i4 + 9;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return notifyviewentered;
    }

    public static void serializer(String str, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = serializer + 15;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (z) {
            return;
        }
        Object[] objArr = {str, new Object[]{Integer.valueOf(i)}};
        int iWrite = MaybeObserveOn.write();
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer((String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, MaybeObserveOn.write(), -1556036116, iWrite, objArr, MaybeObserveOn.write()));
        int i5 = serializer + 111;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public static void read(String str, boolean z) {
        int i = 2 % 2;
        int i2 = serializer + 33;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (z) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str);
        int i4 = serializer + 61;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        o.DrawableTransformation.write();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + 85;
        kotlin.io.TextStreamsKt.IconCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void write(boolean r3) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.io.TextStreamsKt.IconCompatParcelizer
            int r1 = r1 + 35
            int r2 = r1 % 128
            kotlin.io.TextStreamsKt.serializer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L15
            r1 = 91
            int r1 = r1 / 0
            if (r3 == 0) goto L1f
            goto L17
        L15:
            if (r3 == 0) goto L1f
        L17:
            int r2 = r2 + 85
            int r3 = r2 % 128
            kotlin.io.TextStreamsKt.IconCompatParcelizer = r3
            int r2 = r2 % r0
            return
        L1f:
            o.DrawableTransformation.write()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.TextStreamsKt.write(boolean):void");
    }

    public static void read(String str, long j, boolean z) {
        int i = 2 % 2;
        if (z) {
            int i2 = serializer + 123;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        Object[] objArr = {str, new Object[]{Long.valueOf(j)}};
        int iWrite = MaybeObserveOn.write();
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer((String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, MaybeObserveOn.write(), -1556036116, iWrite, objArr, MaybeObserveOn.write()));
        int i3 = IconCompatParcelizer + 65;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r13 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r13 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r10 = io.reactivex.internal.operators.maybe.MaybeObserveOn.write();
        r8 = io.reactivex.internal.operators.maybe.MaybeObserveOn.write();
        r12 = io.reactivex.internal.operators.maybe.MaybeObserveOn.write();
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer((java.lang.String) org.koin.dsl.ModuleDSLKt.serializer(io.reactivex.internal.operators.maybe.MaybeObserveOn.write(), 1556036116, r8, -1556036116, r10, new java.lang.Object[]{r1, new java.lang.Object[]{r2}}, r12));
        r13 = kotlin.io.TextStreamsKt.IconCompatParcelizer + 63;
        kotlin.io.TextStreamsKt.serializer = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r13 = r13 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object RemoteActionCompatParcelizer(java.lang.Object[] r13) {
        /*
            r0 = 0
            r1 = r13[r0]
            java.lang.String r1 = (java.lang.String) r1
            r2 = 1
            r2 = r13[r2]
            r3 = r2
            java.lang.Object r3 = (java.lang.Object) r3
            r3 = 2
            r13 = r13[r3]
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            int r4 = r3 % r3
            int r4 = kotlin.io.TextStreamsKt.IconCompatParcelizer
            int r4 = r4 + 3
            int r5 = r4 % 128
            kotlin.io.TextStreamsKt.serializer = r5
            int r4 = r4 % r3
            r5 = 0
            if (r4 == 0) goto L28
            r4 = 43
            int r4 = r4 / r0
            if (r13 == 0) goto L2b
            goto L2a
        L28:
            if (r13 == 0) goto L2b
        L2a:
            return r5
        L2b:
            java.lang.Object[] r13 = new java.lang.Object[]{r2}
            java.lang.Object[] r11 = new java.lang.Object[]{r1, r13}
            int r10 = io.reactivex.internal.operators.maybe.MaybeObserveOn.write()
            int r8 = io.reactivex.internal.operators.maybe.MaybeObserveOn.write()
            int r12 = io.reactivex.internal.operators.maybe.MaybeObserveOn.write()
            int r6 = io.reactivex.internal.operators.maybe.MaybeObserveOn.write()
            r7 = 1556036116(0x5cbf3a14, float:4.3060463E17)
            r9 = -1556036116(0xffffffffa340c5ec, float:-1.04502524E-17)
            java.lang.Object r13 = org.koin.dsl.ModuleDSLKt.serializer(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r13 = (java.lang.String) r13
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r13)
            int r13 = kotlin.io.TextStreamsKt.IconCompatParcelizer
            int r13 = r13 + 63
            int r0 = r13 % 128
            kotlin.io.TextStreamsKt.serializer = r0
            int r13 = r13 % r3
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.TextStreamsKt.RemoteActionCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    public static final String IconCompatParcelizer(Reader reader) throws IOException {
        int i = 2 % 2;
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i2 = reader.read(cArr);
        while (i2 >= 0) {
            int i3 = serializer + 71;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            stringWriter.write(cArr, i3 % 2 == 0 ? 1 : 0, i2);
            i2 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static final void RemoteActionCompatParcelizer(BufferedReader bufferedReader, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) throws IOException {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        serializer = i2 % Fields.SpotShadowColor;
        try {
            if (i2 % 2 != 0) {
                ((requestDisplayInAppMessagelambda4) write(bufferedReader)).iterator();
                throw null;
            }
            Iterator it = ((requestDisplayInAppMessagelambda4) write(bufferedReader)).iterator();
            while (!(!it.hasNext())) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(it.next());
                int i3 = IconCompatParcelizer + 117;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{bufferedReader, th}, sourceInformationContextOfdefault.read());
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:28:0x0045 A[EDGE_INSN: B:28:0x0045->B:17:0x0045 BREAK  A[LOOP:0: B:3:0x0010->B:31:0x0010], SYNTHETIC] */
    public static final int serializer(LayoutTileBinding layoutTileBinding, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int[] iArr = layoutTileBinding.read;
        int i5 = i + 1;
        int length = layoutTileBinding.IconCompatParcelizer.length;
        iArr.getClass();
        int i6 = length - 1;
        int i7 = 0;
        while (true) {
            if (i7 > i6) {
                i2 = (-i7) - 1;
                int i8 = serializer + 49;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    break;
                }
                int i9 = 4 / 3;
                break;
            }
            int i10 = serializer + 97;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                i2 = (i7 + i6) >>> 1;
                i3 = iArr[i2];
                if (i3 >= i5) {
                    if (i3 > i5) {
                        break;
                        break;
                    }
                    i6 = i2 - 1;
                } else {
                    i7 = i2 + 1;
                }
            } else {
                i2 = i7 - i6;
                i3 = iArr[i2];
                if (i3 >= i5) {
                    if (i3 > i5) {
                        break;
                    }
                    i6 = i2 - 1;
                } else {
                    i7 = i2 + 1;
                }
            }
        }
        if (i2 < 0) {
            return ~i2;
        }
        int i11 = serializer + 99;
        IconCompatParcelizer = i11 % Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        String str = (String) objArr[2];
        int i = 2 % 2;
        if (iIntValue < 0) {
            Object[] objArr2 = {"%s (%s) must not be negative", new Object[]{str, Integer.valueOf(iIntValue)}};
            String str2 = (String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, MaybeObserveOn.write(), -1556036116, MaybeObserveOn.write(), objArr2, MaybeObserveOn.write());
            int i2 = IconCompatParcelizer + 25;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return str2;
        }
        if (iIntValue2 >= 0) {
            Object[] objArr3 = {str, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)};
            int iWrite = MaybeObserveOn.write();
            String str3 = (String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, MaybeObserveOn.write(), -1556036116, iWrite, new Object[]{"%s (%s) must not be greater than size (%s)", objArr3}, MaybeObserveOn.write());
            int i4 = IconCompatParcelizer + 107;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 48 / 0;
            }
            return str3;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(iIntValue2, "negative size: "));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0070  */
    private static /* synthetic */ Object serializer(Object[] objArr) {
        String str;
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int iIntValue3 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if (iIntValue >= 0) {
            int i2 = IconCompatParcelizer + 113;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (iIntValue2 >= iIntValue && iIntValue2 <= iIntValue3) {
                return null;
            }
        }
        if (iIntValue < 0 || iIntValue > iIntValue3) {
            Object[] objArr2 = {Integer.valueOf(iIntValue), Integer.valueOf(iIntValue3), "start index"};
            int iWrite = w$$ExternalSyntheticLambda0.write();
            str = (String) read(objArr2, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), 1230781564, w$$ExternalSyntheticLambda0.write(), -1230781563, iWrite);
            int i4 = serializer + 31;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else if (iIntValue2 >= 0) {
            int i6 = serializer + 47;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (iIntValue2 <= iIntValue3) {
                Object[] objArr3 = {"end index (%s) must not be less than start index (%s)", new Object[]{Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue)}};
                int iWrite2 = MaybeObserveOn.write();
                str = (String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, MaybeObserveOn.write(), -1556036116, iWrite2, objArr3, MaybeObserveOn.write());
            } else {
                Object[] objArr4 = {Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), "end index"};
                int iWrite3 = w$$ExternalSyntheticLambda0.write();
                str = (String) read(objArr4, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), 1230781564, w$$ExternalSyntheticLambda0.write(), -1230781563, iWrite3);
            }
        } else {
            Object[] objArr5 = {Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), "end index"};
            int iWrite4 = w$$ExternalSyntheticLambda0.write();
            str = (String) read(objArr5, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), 1230781564, w$$ExternalSyntheticLambda0.write(), -1230781563, iWrite4);
        }
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017 A[DONT_INVERT] */
    public static void RemoteActionCompatParcelizer(int i, int i2) {
        String str;
        int i3 = 2 % 2;
        int i4 = serializer;
        int i5 = i4 + 101;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
            if (i >= 0) {
                if (i < i2) {
                    return;
                }
            }
        } else if (i >= 0) {
            if (i < i2) {
                return;
            }
        }
        if (i >= 0) {
            int i7 = i4 + 93;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                throw null;
            }
            if (i2 < 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i2, "negative size: "));
                return;
            }
            Object[] objArr = {"%s (%s) must be less than size (%s)", new Object[]{"index", Integer.valueOf(i), Integer.valueOf(i2)}};
            int iWrite = MaybeObserveOn.write();
            str = (String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, MaybeObserveOn.write(), -1556036116, iWrite, objArr, MaybeObserveOn.write());
        } else {
            Object[] objArr2 = {"%s (%s) must not be negative", new Object[]{"index", Integer.valueOf(i)}};
            int iWrite2 = MaybeObserveOn.write();
            str = (String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, MaybeObserveOn.write(), -1556036116, iWrite2, objArr2, MaybeObserveOn.write());
            int i8 = serializer + 105;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        throw new IndexOutOfBoundsException(str);
    }

    public static final void serializer(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = serializer + 111;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        str2.getClass();
        str3.getClass();
        String strConcat = str.concat("StartToInteractive");
        BlurFilter blurFilter = RemoteActionCompatParcelizer;
        Object obj = null;
        if (blurFilter == null) {
            removeNodeAtDepth.serializer("performanceTracker");
            throw null;
        }
        blurFilter.serializer(strConcat);
        String str4 = String.format("0:%s;1:%s", Arrays.copyOf(new Object[]{str3, str2}, 2));
        BlurFilter blurFilter2 = RemoteActionCompatParcelizer;
        if (blurFilter2 == null) {
            removeNodeAtDepth.serializer("performanceTracker");
            throw null;
        }
        int i4 = serializer + 19;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            blurFilter2.RemoteActionCompatParcelizer(strConcat, "screen", str4);
            obj.hashCode();
            throw null;
        }
        blurFilter2.RemoteActionCompatParcelizer(strConcat, "screen", str4);
        if (read != null) {
            String strConcat2 = "ScreenPerformanceTracker start trace_name=".concat(strConcat);
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            forest.RemoteActionCompatParcelizer("AppPerformance");
            forest.IconCompatParcelizer(strConcat2, new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    public static final Object access$scheduleTask$task(Disposable disposable, TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable, ShortNewsContentCardView shortNewsContentCardView) {
        r8lambdaSdLB8He51_fnZHUESctgYSoqgpg r8lambdasdlb8he51_fnzhuesctgysoqgpg;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 101;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Object obj = null;
        if (shortNewsContentCardView instanceof r8lambdaSdLB8He51_fnZHUESctgYSoqgpg) {
            int i5 = i2 + 63;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = ((r8lambdaSdLB8He51_fnZHUESctgYSoqgpg) shortNewsContentCardView).RemoteActionCompatParcelizer;
                obj.hashCode();
                throw null;
            }
            r8lambdasdlb8he51_fnzhuesctgysoqgpg = (r8lambdaSdLB8He51_fnZHUESctgYSoqgpg) shortNewsContentCardView;
            int i7 = r8lambdasdlb8he51_fnzhuesctgysoqgpg.RemoteActionCompatParcelizer;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                int i8 = serializer + 103;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                r8lambdasdlb8he51_fnzhuesctgysoqgpg.RemoteActionCompatParcelizer = i8 % 2 == 0 ? i7 - Integer.MIN_VALUE : i7 - Integer.MIN_VALUE;
            } else {
                r8lambdasdlb8he51_fnzhuesctgysoqgpg = new r8lambdaSdLB8He51_fnZHUESctgYSoqgpg(shortNewsContentCardView);
            }
        } else {
            r8lambdasdlb8he51_fnzhuesctgysoqgpg = new r8lambdaSdLB8He51_fnZHUESctgYSoqgpg(shortNewsContentCardView);
        }
        Object obj2 = r8lambdasdlb8he51_fnzhuesctgysoqgpg.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = r8lambdasdlb8he51_fnzhuesctgysoqgpg.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i10 = 1;
        try {
            if (i9 != 0) {
                if (i9 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                TextAnnouncementContentCardView textAnnouncementContentCardView2 = r8lambdasdlb8he51_fnzhuesctgysoqgpg.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            if (!disposable.isDisposed()) {
                RoomDatabase$$ExternalSyntheticLambda1 roomDatabase$$ExternalSyntheticLambda1 = new RoomDatabase$$ExternalSyntheticLambda1(runnable, i10);
                r8lambdasdlb8he51_fnzhuesctgysoqgpg.read = textAnnouncementContentCardView;
                r8lambdasdlb8he51_fnzhuesctgysoqgpg.RemoteActionCompatParcelizer = 1;
                if (BuildersKt.withContext(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new InterruptibleKt$runInterruptible$2(roomDatabase$$ExternalSyntheticLambda1, null), r8lambdasdlb8he51_fnzhuesctgysoqgpg) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            int i11 = serializer + 121;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                return createfromparcel;
            }
            throw null;
        } catch (Throwable th) {
            ContextsKt.read(textAnnouncementContentCardView, th);
            return createfromparcel;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[LOOP:0: B:32:0x008d->B:53:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ab -> B:32:0x008d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c0 -> B:32:0x008d). Please report as a decompilation issue!!! */
    public static final Object access$runMigrations(List list, SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1, ContinuationImpl continuationImpl) throws Throwable {
        performCustomRequestFocusMxy_nc0 performcustomrequestfocusmxy_nc0;
        List list2;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        Iterator it;
        Throwable th;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        int i = 2 % 2;
        if (continuationImpl instanceof performCustomRequestFocusMxy_nc0) {
            int i2 = serializer + 111;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((performCustomRequestFocusMxy_nc0) continuationImpl).IconCompatParcelizer;
                throw null;
            }
            performcustomrequestfocusmxy_nc0 = (performCustomRequestFocusMxy_nc0) continuationImpl;
            int i4 = performcustomrequestfocusmxy_nc0.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                performcustomrequestfocusmxy_nc0.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                performcustomrequestfocusmxy_nc0 = new performCustomRequestFocusMxy_nc0(continuationImpl);
            }
        } else {
            performcustomrequestfocusmxy_nc0 = new performCustomRequestFocusMxy_nc0(continuationImpl);
        }
        Object obj = performcustomrequestfocusmxy_nc0.write;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = performcustomrequestfocusmxy_nc0.IconCompatParcelizer;
        if (i5 != 0) {
            if (i5 != 1) {
                int i6 = serializer + 107;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0 ? i5 != 2 : i5 != 5) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = performcustomrequestfocusmxy_nc0.RemoteActionCompatParcelizer;
                createinappmessageeventsubscriber = (createInAppMessageEventSubscriber) performcustomrequestfocusmxy_nc0.read;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    int i7 = serializer + 47;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                } catch (Throwable th2) {
                    Object obj3 = createinappmessageeventsubscriber.IconCompatParcelizer;
                    if (obj3 == null) {
                        int i9 = IconCompatParcelizer + 57;
                        serializer = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        createinappmessageeventsubscriber.IconCompatParcelizer = th2;
                        int i11 = serializer + 95;
                        IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                    } else {
                        markOnScreenCardsAsReadlambda1.read((Throwable) obj3, th2);
                    }
                }
            } else {
                list2 = (List) performcustomrequestfocusmxy_nc0.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            while (it.hasNext()) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it.next();
                performcustomrequestfocusmxy_nc0.read = createinappmessageeventsubscriber;
                performcustomrequestfocusmxy_nc0.RemoteActionCompatParcelizer = it;
                performcustomrequestfocusmxy_nc0.IconCompatParcelizer = 2;
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(performcustomrequestfocusmxy_nc0) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) createinappmessageeventsubscriber.IconCompatParcelizer;
            if (th == null) {
                return createFromParcel.INSTANCE;
            }
            throw th;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ArrayList arrayList = new ArrayList();
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(list, arrayList, null);
        performcustomrequestfocusmxy_nc0.read = arrayList;
        performcustomrequestfocusmxy_nc0.IconCompatParcelizer = 1;
        if (singleProcessDataStore$readAndInit$api$1.updateData(dataMigrationInitializer$Companion$runMigrations$2, performcustomrequestfocusmxy_nc0) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        it = list2.iterator();
        while (it.hasNext()) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it.next();
            performcustomrequestfocusmxy_nc0.read = createinappmessageeventsubscriber;
            performcustomrequestfocusmxy_nc0.RemoteActionCompatParcelizer = it;
            performcustomrequestfocusmxy_nc0.IconCompatParcelizer = 2;
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(performcustomrequestfocusmxy_nc0) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) createinappmessageeventsubscriber.IconCompatParcelizer;
        if (th == null) {
            return createFromParcel.INSTANCE;
        }
        throw th;
    }

    public static final void read(Context context) {
        int i = 2 % 2;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (!(!databasePath.exists())) {
            int i2 = IconCompatParcelizer + 43;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setRotationX setrotationx = setRotationX.read();
            String str = getRgb565_sVssgQ.RemoteActionCompatParcelizer;
            setrotationx.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr = getRgb565_sVssgQ.read;
            int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(strArr.length);
            if (iRemoteActionCompatParcelizer < 16) {
                iRemoteActionCompatParcelizer = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
            for (String str2 : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str2), new File(noBackupFilesDir.getPath() + str2));
            }
            for (Map.Entry entry : onMove.serializer(linkedHashMap, new onViewAttachedToWindowlambda0(databasePath2, noBackupFilesDir)).entrySet()) {
                int i4 = serializer + 105;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    int i6 = serializer + 51;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        file2.exists();
                        throw null;
                    }
                    if (file2.exists()) {
                        setRotationX.read().IconCompatParcelizer(getRgb565_sVssgQ.RemoteActionCompatParcelizer, "Over-writing contents of " + file2);
                        int i7 = serializer + 43;
                        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                    }
                    if (!(!file.renameTo(file2))) {
                        file.toString();
                        file2.toString();
                    } else {
                        file.toString();
                        file2.toString();
                    }
                    setRotationX setrotationx2 = setRotationX.read();
                    String str3 = getRgb565_sVssgQ.RemoteActionCompatParcelizer;
                    setrotationx2.getClass();
                }
            }
        }
    }

    public static void write(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        int iWrite = w$$ExternalSyntheticLambda0.write();
        read(objArr, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), 298335113, w$$ExternalSyntheticLambda0.write(), -298335113, iWrite);
    }

    public static void serializer(String str, Object obj, boolean z) {
        Object[] objArr = {str, obj, Boolean.valueOf(z)};
        int iWrite = w$$ExternalSyntheticLambda0.write();
        read(objArr, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -783877068, w$$ExternalSyntheticLambda0.write(), 783877070, iWrite);
    }

    public static String read(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        int iWrite = w$$ExternalSyntheticLambda0.write();
        return (String) read(objArr, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), 1230781564, w$$ExternalSyntheticLambda0.write(), -1230781563, iWrite);
    }
}
