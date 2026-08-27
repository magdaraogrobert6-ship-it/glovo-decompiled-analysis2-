package kotlin.math;

import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import androidx.room.RoomDatabase$closeBarrier$1;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptMessageUiModelImpl;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptUiModelImpl;
import com.roadrunner.delivery.accept.backToBackOrder.presentation.BackToBackAutoAcceptUiModelImpl;
import com.roadrunner.delivery.accept.orderitems.presentation.compose.OrderItemsBottomSheetKt;
import com.roadrunner.delivery.accept.presentation.compose.AutoAcceptOptionKt$AutoAcceptOption$1$1;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.home.HomeFragment$initPopupLayer$1;
import io.grpc.Status;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.util.MediaBrowserCompatMediaItem;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.math.MathKt;
import o.AdjustFactoryURLGetConnection;
import o.AndroidContentCaptureManager;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.DefaultContentCardsActionListener;
import o.DragAndDropTargetModifierNode;
import o.EditingBufferCompanion;
import o.SegmentFinder;
import o.SemanticsModifierDefaultImpls;
import o.TextGranularity;
import o._get_messageWebView_lambda1;
import o._get_messageWebView_lambda3;
import o.accessgetLineHeightPaddings;
import o.accessgetNumPadEntercp;
import o.accessgetParentLayoutDirection;
import o.accessgetSystemNavigationDowncp;
import o.copyRetOiIg;
import o.createFromFile;
import o.extractAuthorizationHeader;
import o.findNestedRecyclerView;
import o.getActionViewIntentlambda0;
import o.getBirthDateFull;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getDidOverflowWidth;
import o.getDoesBackButtonDismissInAppMessageView;
import o.getEndOffsetForRectWithinRun;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getResId;
import o.r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM;
import o.r8lambdarYwWjKRktijBy60CMMjcRC1Oqk;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.resolveSpanStyleDefaultslambda0;
import o.scale0AR0LA0default;
import o.setTimerStart;
import o.setWebViewContentlambda0;
import o.unbox;
import o.updateRangeAfterDeletepWDy79M;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MathKt {
    private static int read = 0;
    private static int serializer = 1;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | i;
        int i10 = ~(i2 | i3);
        int i11 = i9 | i10;
        int i12 = ~i;
        int i13 = (~(i12 | i3)) | (~(i12 | i2)) | i10;
        int i14 = (~(i7 | i3)) | (~(i8 | i2));
        int i15 = i2 + i3 + i4 + (1040777104 * i6) + ((-1861505373) * i5);
        int i16 = i15 * i15;
        int i17 = (i2 * (-1036928585)) + 527892480 + ((-1036928585) * i3) + ((-562525036) * i11) + (562525036 * i13) + ((-281262518) * i14) + ((-1318191104) * i4) + (1608515584 * i6) + ((-1123418112) * i5) + ((-2114519040) * i16);
        int i18 = (i2 * 1703033811) + 1712528133 + (i3 * 1703033811) + (i11 * 1508) + (i13 * (-1508)) + (i14 * 754) + (i4 * 1703034565) + (i6 * (-2114876976)) + (i5 * 1880022383) + (i16 * (-720175104));
        return i17 + ((i18 * i18) * (-739180544)) != 1 ? RemoteActionCompatParcelizer(objArr) : read(objArr);
    }

    public void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public abstract void read(r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa);

    public abstract void serializer(Status status, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa);

    public abstract void serializer(Object obj);

    public static final void write(int i, int i2, Object[] objArr) {
        int i3 = 2 % 2;
        objArr.getClass();
        while (i < i2) {
            int i4 = serializer + 1;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            objArr[i] = null;
            i++;
        }
        int i6 = read + 15;
        serializer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        Object obj = objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        accessgetSystemNavigationDowncp.serializer(obj, "Listener must not be null");
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str, "Listener type must not be empty");
        accessgetNumPadEntercp accessgetnumpadentercp = new accessgetNumPadEntercp(obj, str);
        int i2 = read + 85;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return accessgetnumpadentercp;
    }

    public static long read(double d) {
        int i = 2 % 2;
        int i2 = serializer + 57;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot round NaN value.");
        int i4 = serializer + 55;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return 0L;
    }

    public static final ViewParent RemoteActionCompatParcelizer(View view) {
        int i = 2 % 2;
        view.getClass();
        ViewParent parent = view.getParent();
        Object obj = null;
        if (parent != null) {
            int i2 = read + 23;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return parent;
            }
            obj.hashCode();
            throw null;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (!(!(tag instanceof ViewParent))) {
            return (ViewParent) tag;
        }
        int i3 = read + 99;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return null;
    }

    public static final _get_messageWebView_lambda1 IconCompatParcelizer(_get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        int i = 2 % 2;
        _get_messagewebview_lambda1.getClass();
        r8lambdarYwWjKRktijBy60CMMjcRC1Oqk r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer = _get_messagewebview_lambda1.IconCompatParcelizer();
        _get_messageWebView_lambda3 _get_messagewebview_lambda3 = _get_messagewebview_lambda1.body;
        r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer.IconCompatParcelizer = new setWebViewContentlambda0(_get_messagewebview_lambda3.write(), _get_messagewebview_lambda3.IconCompatParcelizer());
        _get_messageWebView_lambda1 _get_messagewebview_lambda1IconCompatParcelizer = r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer.IconCompatParcelizer();
        int i2 = serializer + 23;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return _get_messagewebview_lambda1IconCompatParcelizer;
    }

    public static scale0AR0LA0default serializer(Object obj, Looper looper, String str) {
        int i = 2 % 2;
        accessgetSystemNavigationDowncp.serializer(obj, "Listener must not be null");
        accessgetSystemNavigationDowncp.serializer(looper, "Looper must not be null");
        scale0AR0LA0default scale0ar0la0default = new scale0AR0LA0default();
        scale0ar0la0default.IconCompatParcelizer = new accessgetParentLayoutDirection(looper);
        accessgetSystemNavigationDowncp.serializer(obj, "Listener must not be null");
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        scale0ar0la0default.RemoteActionCompatParcelizer = new accessgetNumPadEntercp(obj, str);
        int i2 = serializer + 45;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return scale0ar0la0default;
        }
        throw null;
    }

    public static int write(double d) {
        int i = 2 % 2;
        int i2 = serializer + 61;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (Double.isNaN(d)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot round NaN value.");
            return 0;
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d >= -2.147483648E9d) {
            return (int) Math.round(d);
        }
        int i4 = serializer + 21;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return Integer.MIN_VALUE;
    }

    public static scale0AR0LA0default serializer(Object obj, Executor executor, String str) {
        int i = 2 % 2;
        accessgetSystemNavigationDowncp.serializer(obj, "Listener must not be null");
        accessgetSystemNavigationDowncp.serializer(executor, "Executor must not be null");
        scale0AR0LA0default scale0ar0la0default = new scale0AR0LA0default();
        accessgetSystemNavigationDowncp.serializer(executor, "Executor must not be null");
        scale0ar0la0default.IconCompatParcelizer = executor;
        accessgetSystemNavigationDowncp.serializer(obj, "Listener must not be null");
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        scale0ar0la0default.RemoteActionCompatParcelizer = new accessgetNumPadEntercp(obj, str);
        int i2 = read + 41;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return scale0ar0la0default;
        }
        throw null;
    }

    public static int write(float f) {
        int i = 2 % 2;
        int i2 = serializer + 25;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Float.isNaN(f);
            throw null;
        }
        if (Float.isNaN(f)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot round NaN value.");
            return 0;
        }
        int iRound = Math.round(f);
        int i3 = serializer + 99;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iRound;
    }

    public static final String IconCompatParcelizer(Object[] objArr, int i, int i2, DefaultContentCardsActionListener defaultContentCardsActionListener) {
        int i3 = 2 % 2;
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = serializer + 91;
            int i6 = i5 % Fields.SpotShadowColor;
            read = i6;
            int i7 = i5 % 2;
            if (i4 > 0) {
                int i8 = i6 + 69;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                sb.append(", ");
            }
            Object obj = objArr[i + i4];
            if (obj == defaultContentCardsActionListener) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
                int i10 = read + 49;
                serializer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    int i11 = 3 / 3;
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) throws InvocationTargetException {
        Class cls = (Class) objArr[0];
        int i = 2 % 2;
        int i2 = serializer + 1;
        read = i2 % Fields.SpotShadowColor;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        objNewInstance.getClass();
                        ViewModel viewModel = (ViewModel) objNewInstance;
                        int i3 = read + 107;
                        serializer = i3 % Fields.SpotShadowColor;
                        int i4 = i3 % 2;
                        return viewModel;
                    } catch (IllegalAccessException e) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(c8$$ExternalSyntheticOutline0.m(cls, "Cannot create an instance of "), e);
                        return null;
                    } catch (InstantiationException e2) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(c8$$ExternalSyntheticOutline0.m(cls, "Cannot create an instance of "), e2);
                        return null;
                    }
                }
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(c8$$ExternalSyntheticOutline0.m(cls, "Cannot create an instance of "));
                return null;
            }
            Modifier.isPublic(cls.getDeclaredConstructor(null).getModifiers());
            obj.hashCode();
            throw null;
        } catch (NoSuchMethodException e3) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(c8$$ExternalSyntheticOutline0.m(cls, "Cannot create an instance of "), e3);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX WARN: Code duplicated, block: B:16:0x002c A[Catch: all -> 0x0017, DispatchException -> 0x0019, TRY_LEAVE, TryCatch #2 {DispatchException -> 0x0019, all -> 0x0017, blocks: (B:4:0x000f, B:16:0x002c, B:15:0x0027, B:12:0x001c), top: B:50:0x000d }] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (((kotlinx.coroutines.TimeoutCancellationException) r12).RemoteActionCompatParcelizer == r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        if (((kotlinx.coroutines.TimeoutCancellationException) r12).RemoteActionCompatParcelizer == r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if ((r13 instanceof o.getClosingAnimation) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        throw ((o.getClosingAnimation) r13).IconCompatParcelizer;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object startUndspatched(kotlinx.coroutines.internal.ScopeCoroutine r11, boolean r12, kotlinx.coroutines.internal.ScopeCoroutine r13, o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r14) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.math.MathKt.startUndspatched(kotlinx.coroutines.internal.ScopeCoroutine, boolean, kotlinx.coroutines.internal.ScopeCoroutine, o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0):java.lang.Object");
    }

    public static final void IconCompatParcelizer(final List list, final copyRetOiIg copyretoiig, final TextGranularity textGranularity, final TextGranularity textGranularity2, final getActionViewIntentlambda0 getactionviewintentlambda0, final MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, final ProtobufEncoder protobufEncoder, final Path$Companion path$Companion, final AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1, final CreateHomeScope createHomeScope, final HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$1, final HomeFragment.AnonymousClass1 anonymousClass1, final RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1, final getContentViewGroupParentLayout getcontentviewgroupparentlayout, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        int i4;
        r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds;
        Iterator it;
        r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM r8lambdahlfuu54mfvlmnthbk7uy9j3wgim;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
        Integer num;
        boolean z;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = serializer + 29;
        read = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        list.getClass();
        getcontentviewgroupparentlayout.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2011414894);
        if ((i & 6) == 0) {
            int i11 = read + 55;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i3 = (getpostalcode.IconCompatParcelizer(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(copyretoiig) ? 32 : 16;
        }
        int i13 = i & 384;
        int i14 = Fields.RotationX;
        if (i13 == 0) {
            if (getpostalcode.IconCompatParcelizer(textGranularity)) {
                int i15 = serializer + 111;
                read = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        int i17 = i & 3072;
        int i18 = Fields.RotationZ;
        if (i17 == 0) {
            if (getpostalcode.IconCompatParcelizer(textGranularity2)) {
                int i19 = read + 41;
                serializer = i19 % Fields.SpotShadowColor;
                i6 = i19 % 2 == 0 ? 19247 : Fields.CameraDistance;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i & 24576) == 0) {
            int i20 = read + 121;
            serializer = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            i3 |= getpostalcode.IconCompatParcelizer(getactionviewintentlambda0) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(mediaBrowserCompatMediaItem) ? Fields.RenderEffect : 65536;
        }
        Object obj = null;
        if ((i & 1572864) == 0) {
            int i22 = read + 33;
            serializer = i22 % Fields.SpotShadowColor;
            if (i22 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(protobufEncoder);
                obj.hashCode();
                throw null;
            }
            i3 |= getpostalcode.IconCompatParcelizer(protobufEncoder) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(path$Companion)) {
                int i23 = read + 13;
                serializer = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i3 |= i5;
        }
        if ((100663296 & i) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(androidUiDispatcherCompanioncurrentThread1) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            int i25 = read + 27;
            serializer = i25 % Fields.SpotShadowColor;
            int i26 = i25 % 2;
            i3 |= getpostalcode.IconCompatParcelizer(createHomeScope) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (getpostalcode.IconCompatParcelizer(homeFragment$initPopupLayer$1) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(anonymousClass1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (!getpostalcode.IconCompatParcelizer(roomDatabase$closeBarrier$1)) {
                i14 = 128;
            }
            i4 |= i14;
        }
        if ((i2 & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(getcontentviewgroupparentlayout)) {
                i18 = Fields.CameraDistance;
            }
            i4 |= i18;
        }
        Integer num2 = 48;
        if (getpostalcode.write(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 1171) == 1170) ? false : true)) {
            int i27 = serializer + 7;
            read = i27 % Fields.SpotShadowColor;
            if (i27 % 2 != 0) {
                getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                throw null;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager2) {
                objComponentActivity = getResId.read;
                getpostalcode.write(objComponentActivity);
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager2) {
                objComponentActivity2 = AdjustFactoryURLGetConnection.write;
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager2) {
                objComponentActivity3 = resolveSpanStyleDefaultslambda0.IconCompatParcelizer;
                getpostalcode.write(objComponentActivity3);
            }
            r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM r8lambdahlfuu54mfvlmnthbk7uy9j3wgim2 = (r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager2) {
                objComponentActivity4 = unbox.write;
                getpostalcode.write(objComponentActivity4);
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity4;
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager2) {
                objComponentActivity5 = updateRangeAfterDeletepWDy79M.read;
                getpostalcode.write(objComponentActivity5);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity5;
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if (objComponentActivity6 == androidContentCaptureManager2) {
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = new DragAndDropTargetModifierNode(new r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM() { // from class: o.WordBoundary_androidKt
                    private static int RemoteActionCompatParcelizer = 1;
                    private static int write;

                    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
                    @Override // o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM
                    public final Object read(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i28;
                        int i29;
                        int i30;
                        int i31;
                        int i32 = 2 % 2;
                        SegmentFinder segmentFinder = (SegmentFinder) obj2;
                        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj3;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj6;
                        int iIntValue = ((Integer) obj7).intValue();
                        segmentFinder.getClass();
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4.getClass();
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
                        boolean z3 = true;
                        if ((iIntValue & 6) == 0) {
                            if (!((getPostalCode) getbirthdatefull2).read(segmentFinder)) {
                                i31 = 2;
                            } else {
                                int i33 = RemoteActionCompatParcelizer + 19;
                                write = i33 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                i31 = i33 % 2 != 0 ? 3 : 4;
                            }
                            i28 = i31 | iIntValue;
                        } else {
                            i28 = iIntValue;
                        }
                        if ((iIntValue & 48) == 0) {
                            i28 |= ((getPostalCode) getbirthdatefull2).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4) ? 32 : 16;
                        }
                        if ((iIntValue & 384) == 0) {
                            if (((getPostalCode) getbirthdatefull2).IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                                int i34 = write + 11;
                                RemoteActionCompatParcelizer = i34 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i35 = i34 % 2;
                                i30 = androidx.compose.ui.graphics.Fields.RotationX;
                            } else {
                                i30 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            }
                            i28 |= i30;
                        }
                        if ((iIntValue & 3072) == 0) {
                            if (((getPostalCode) getbirthdatefull2).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                                int i36 = write + 35;
                                RemoteActionCompatParcelizer = i36 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i37 = i36 % 2;
                                i29 = androidx.compose.ui.graphics.Fields.CameraDistance;
                            } else {
                                i29 = androidx.compose.ui.graphics.Fields.RotationZ;
                            }
                            i28 |= i29;
                        }
                        if ((i28 & 9363) != 9362) {
                            int i38 = RemoteActionCompatParcelizer + 67;
                            write = i38 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i39 = i38 % 2;
                        } else {
                            z3 = false;
                        }
                        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode2.write(i28 & 1, z3)) {
                            ProtobufEncoder protobufEncoder2 = protobufEncoder;
                            accessgetStripNonMetricAffectingCharSpansp accessgetstripnonmetricaffectingcharspansp = ((fastMapTo) protobufEncoder2.write).read(getcontentviewgroupparentlayout, false);
                            accessstripNonMetricAffectingCharacterStyleSpans accessstripnonmetricaffectingcharacterstylespans = (accessstripNonMetricAffectingCharacterStyleSpans) protobufEncoder2.serializer;
                            createGraphemeClusterSegmentFinder creategraphemeclustersegmentfinder = (createGraphemeClusterSegmentFinder) protobufEncoder2.RemoteActionCompatParcelizer;
                            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(creategraphemeclustersegmentfinder);
                            Object objComponentActivity7 = getpostalcode2.ComponentActivity();
                            if (zIconCompatParcelizer) {
                                objComponentActivity7 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(creategraphemeclustersegmentfinder);
                                getpostalcode2.write(objComponentActivity7);
                            } else {
                                int i40 = write + 77;
                                RemoteActionCompatParcelizer = i40 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i41 = i40 % 2;
                                if (objComponentActivity7 == getCreditCardExpirationMonth.write) {
                                    objComponentActivity7 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(creategraphemeclustersegmentfinder);
                                    getpostalcode2.write(objComponentActivity7);
                                }
                            }
                            int i42 = i28 << 6;
                            OrderItemsBottomSheetKt.IconCompatParcelizer(segmentFinder, accessgetstripnonmetricaffectingcharspansp, accessstripnonmetricaffectingcharacterstylespans, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity7), null, getpostalcode2, (i28 & 14) | (i42 & 7168) | (57344 & i42) | (i42 & 458752));
                        } else {
                            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, true, -185168088);
                getpostalcode.write(dragAndDropTargetModifierNode);
                objComponentActivity6 = dragAndDropTargetModifierNode;
            }
            r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM r8lambdahlfuu54mfvlmnthbk7uy9j3wgim3 = (r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM) objComponentActivity6;
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            if (objComponentActivity7 == androidContentCaptureManager2) {
                objComponentActivity7 = getDidOverflowWidth.read;
                getpostalcode.write(objComponentActivity7);
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds6 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity7;
            Object objComponentActivity8 = getpostalcode.ComponentActivity();
            if (objComponentActivity8 == androidContentCaptureManager2) {
                objComponentActivity8 = accessgetLineHeightPaddings.read;
                getpostalcode.write(objComponentActivity8);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity8;
            Object objComponentActivity9 = getpostalcode.ComponentActivity();
            if (objComponentActivity9 == androidContentCaptureManager2) {
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode2 = new DragAndDropTargetModifierNode(new getDoesBackButtonDismissInAppMessageView(1, createHomeScope), true, -1871067739);
                getpostalcode.write(dragAndDropTargetModifierNode2);
                objComponentActivity9 = dragAndDropTargetModifierNode2;
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity9;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                findNestedRecyclerView findnestedrecyclerview = (findNestedRecyclerView) it2.next();
                if (findnestedrecyclerview instanceof createFromFile) {
                    getpostalcode.serializer(-1671759706);
                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3.invoke(findnestedrecyclerview, homeFragment$initPopupLayer$1, getpostalcode, Integer.valueOf(((i4 << 3) & 112) | 384));
                    getpostalcode.IconCompatParcelizer(false);
                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3;
                    it = it2;
                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3;
                    num = num2;
                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4;
                    r8lambdahlfuu54mfvlmnthbk7uy9j3wgim = r8lambdahlfuu54mfvlmnthbk7uy9j3wgim2;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6;
                } else {
                    if (findnestedrecyclerview instanceof DeliveryAutoAcceptUiModelImpl) {
                        getpostalcode.serializer(-1671756704);
                        int i28 = i4 << 3;
                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3;
                        Integer numValueOf = Integer.valueOf((i28 & 112) | 24576 | (i28 & 896) | (i28 & 7168));
                        it = it2;
                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5;
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3;
                        r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM r8lambdahlfuu54mfvlmnthbk7uy9j3wgim4 = r8lambdahlfuu54mfvlmnthbk7uy9j3wgim2;
                        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4;
                        r8lambdahlfuu54mfvlmnthbk7uy9j3wgim = r8lambdahlfuu54mfvlmnthbk7uy9j3wgim2;
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7;
                        r8lambdahlfuu54mfvlmnthbk7uy9j3wgim4.read(findnestedrecyclerview, homeFragment$initPopupLayer$1, anonymousClass1, roomDatabase$closeBarrier$1, getpostalcode, numValueOf);
                        z2 = false;
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3;
                        it = it2;
                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5;
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3;
                        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4;
                        r8lambdahlfuu54mfvlmnthbk7uy9j3wgim = r8lambdahlfuu54mfvlmnthbk7uy9j3wgim2;
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8;
                        if (findnestedrecyclerview instanceof DeliveryAutoAcceptMessageUiModelImpl) {
                            getpostalcode.serializer(-1671749773);
                            r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2.invoke(findnestedrecyclerview, homeFragment$initPopupLayer$1, getpostalcode, Integer.valueOf(((i4 << 3) & 112) | 384));
                            z2 = false;
                            getpostalcode.IconCompatParcelizer(false);
                        } else if (findnestedrecyclerview instanceof setTimerStart) {
                            int i29 = read + 101;
                            serializer = i29 % Fields.SpotShadowColor;
                            int i30 = i29 % 2;
                            getpostalcode.serializer(-1671746319);
                            r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4.invoke(findnestedrecyclerview, homeFragment$initPopupLayer$1, getpostalcode, Integer.valueOf(((i4 << 3) & 112) | 384));
                            getpostalcode.IconCompatParcelizer(false);
                            num = num2;
                        } else if (findnestedrecyclerview instanceof EditingBufferCompanion) {
                            getpostalcode.serializer(-1671743139);
                            Integer num3 = num2;
                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(findnestedrecyclerview, getpostalcode, num3);
                            getpostalcode.IconCompatParcelizer(false);
                            num = num3;
                        } else {
                            Integer num4 = num2;
                            if (!(findnestedrecyclerview instanceof SegmentFinder)) {
                                if (findnestedrecyclerview instanceof BackToBackAutoAcceptUiModelImpl) {
                                    getpostalcode.serializer(-1671733202);
                                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds6.invoke(findnestedrecyclerview, homeFragment$initPopupLayer$1, getpostalcode, Integer.valueOf(((i4 << 3) & 112) | 384));
                                    z = false;
                                    getpostalcode.IconCompatParcelizer(false);
                                } else {
                                    z = false;
                                    if (findnestedrecyclerview instanceof getEndOffsetForRectWithinRun) {
                                        getpostalcode.serializer(-1671730214);
                                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke(findnestedrecyclerview, getpostalcode, num4);
                                        getpostalcode.IconCompatParcelizer(false);
                                    } else if (findnestedrecyclerview instanceof SemanticsModifierDefaultImpls) {
                                        getpostalcode.serializer(-1671727912);
                                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5.invoke(findnestedrecyclerview, getpostalcode, num4);
                                        getpostalcode.IconCompatParcelizer(false);
                                    } else {
                                        getpostalcode.serializer(-283918007);
                                        getpostalcode.IconCompatParcelizer(false);
                                    }
                                }
                                num = num4;
                            } else {
                                getpostalcode.serializer(-1671740309);
                                int i31 = i4 << 3;
                                Integer numValueOf2 = Integer.valueOf((i31 & 896) | (i31 & 112) | 24576 | (i31 & 7168));
                                num = num4;
                                r8lambdahlfuu54mfvlmnthbk7uy9j3wgim3.read(findnestedrecyclerview, homeFragment$initPopupLayer$1, anonymousClass1, roomDatabase$closeBarrier$1, getpostalcode, numValueOf2);
                                getpostalcode.IconCompatParcelizer(false);
                            }
                        }
                    }
                    num = num2;
                }
                num2 = num;
                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds;
                it2 = it;
                r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM r8lambdahlfuu54mfvlmnthbk7uy9j3wgim5 = r8lambdahlfuu54mfvlmnthbk7uy9j3wgim;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                r8lambdahlfuu54mfvlmnthbk7uy9j3wgim2 = r8lambdahlfuu54mfvlmnthbk7uy9j3wgim5;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getScrollingChildHelper
                private static int ComponentActivity = 0;
                private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i32 = 2 % 2;
                    int i33 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 1;
                    ComponentActivity = i33 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i34 = i33 % 2;
                    ((Integer) obj3).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    MathKt.IconCompatParcelizer(list, copyretoiig, textGranularity, textGranularity2, getactionviewintentlambda0, mediaBrowserCompatMediaItem, protobufEncoder, path$Companion, androidUiDispatcherCompanioncurrentThread1, createHomeScope, homeFragment$initPopupLayer$1, anonymousClass1, roomDatabase$closeBarrier$1, getcontentviewgroupparentlayout, (getBirthDateFull) obj2, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i35 = ComponentActivity + 51;
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i35 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i36 = i35 % 2;
                    return createfromparcel;
                }
            };
        }
    }

    public static ViewModel RemoteActionCompatParcelizer(Class cls) {
        return (ViewModel) RemoteActionCompatParcelizer(new Object[]{cls}, extractAuthorizationHeader.write(), -430013990, 430013990, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), extractAuthorizationHeader.write());
    }

    public static accessgetNumPadEntercp serializer(Object obj, String str) {
        return (accessgetNumPadEntercp) RemoteActionCompatParcelizer(new Object[]{obj, str}, extractAuthorizationHeader.write(), 930939712, -930939711, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), extractAuthorizationHeader.write());
    }
}
