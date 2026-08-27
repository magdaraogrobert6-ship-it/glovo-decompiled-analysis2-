package coil3;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.location.LocationRequest;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.appperformance.tracker.sentry.SentryActivityScreenPerformanceCallbacks;
import com.roadrunner.appperformance.tracker.sentry.SentryFragmentScreenPerformanceCallbacks;
import io.sentry.SentryOptions;
import io.sentry.SentryUUID;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.protocol._init_lambda2;
import io.sentry.protocol.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
import io.sentry.protocol.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
import io.sentry.util.UrlUtils;
import io.sentry.util.write;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.BannerViewExternalSyntheticLambda2;
import o.DefaultInAppMessageAnimationFactory;
import o.DefaultInAppMessageViewLifecycleListenerstartClearHtmlInAppMessageAssetsThread1;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.DrawableTransformation;
import o.FocusTransactionsKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShaderKt;
import o.ShortNewsContentCardView;
import o._get_messageWebView_lambda1;
import o.accessisRenderNodeCompatiblecp;
import o.clearChildFocus;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.emitcomroadrunnerdeliveryonthewaycrowdsourcingfloatingpresentationCrowdSourcingFloatingImageCameraOnlyUiModelImplobserveUiStateinlinedmap22;
import o.getAlignmentLinesMap;
import o.getBirthDateFull;
import o.getBlurRadiusannotations;
import o.getButton2EK5gGoQ;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getCreditCardSecurityCode;
import o.getDown;
import o.getHandleruiannotations;
import o.getMessageIconView;
import o.getNewPassword;
import o.getNumChildren;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getPrevious;
import o.handleUrlOverridelambda1;
import o.isInvalidIndex;
import o.isItemDismissable;
import o.obtainTint8_81llA;
import o.onAnimationEndlambda1;
import o.onBackInvokedlambda0;
import o.performRequestFocus;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.removeNodeAtDepth;
import o.resetLayoutParamsIfAppropriate;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setCarryoverInAppMessage;
import o.setGraphicModalMaxWidthDp;
import o.setInternalPaintui_graphics;
import o.supportsColorMatrixQuery;
import o.toColorLong8_81llA;
import org.xmlpull.v1.XmlPullParser;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public abstract class ExtrasKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = i4 | i6;
        int i8 = ~i;
        int i9 = ~i6;
        int i10 = ~(i8 | i9);
        int i11 = (~(i6 | i8)) | (~(i9 | i4));
        int i12 = i4 + i + i2 + (1389894630 * i5) + ((-1243605516) * i3);
        int i13 = i12 * i12;
        int i14 = ((-345998475) * i4) + 1335230464 + (862422157 * i) + ((-1543273332) * i7) + (i10 * 1543273332) + (1543273332 * i11) + ((-1889271808) * i2) + (1607991296 * i5) + ((-548405248) * i3) + ((-1553596416) * i13);
        int i15 = ((i4 * (-88671125)) - 261777699) + (i * (-88671149)) + (i7 * (-12)) + (i10 * 12) + (i11 * 12) + (i2 * (-88671137)) + (i5 * (-349388198)) + (i3 * (-147040884)) + (i13 * 182059008);
        switch (i14 + (i15 * i15 * (-132513792))) {
            case 1:
                return write(objArr);
            case 2:
                return serializer(objArr);
            case 3:
                return IconCompatParcelizer(objArr);
            case 4:
                return read(objArr);
            case 5:
                return MediaBrowserCompatMediaItem(objArr);
            case 6:
                return MediaMetadataCompat(objArr);
            default:
                return RemoteActionCompatParcelizer(objArr);
        }
    }

    public static final int read(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = write;
        int i5 = i4 + 95;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i << (((i2 % 10) * 3) + 1);
        int i8 = i4 + 15;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return i7;
    }

    public static final isItemDismissable IconCompatParcelizer(Throwable th) {
        int i = 2 % 2;
        th.getClass();
        isItemDismissable isitemdismissable = new isItemDismissable(th);
        int i2 = RemoteActionCompatParcelizer + 7;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return isitemdismissable;
    }

    public static final void RemoteActionCompatParcelizer(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 95;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (obj instanceof isItemDismissable) {
            throw ((isItemDismissable) obj).RemoteActionCompatParcelizer;
        }
        int i5 = i2 + 59;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public static boolean RemoteActionCompatParcelizer(XmlPullParser xmlPullParser, String str) {
        int i = 2 % 2;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            int i2 = write + 9;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        int i3 = RemoteActionCompatParcelizer + 13;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }

    public static TypedArray RemoteActionCompatParcelizer(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayObtainAttributes;
        int i = 2 % 2;
        if (theme != null) {
            return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        int i2 = write + 95;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
            int i3 = 72 / 0;
        } else {
            typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        }
        int i4 = write + 3;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return typedArrayObtainAttributes;
    }

    public static final void RemoteActionCompatParcelizer(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 33;
        int i5 = i4 % Fields.SpotShadowColor;
        write = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (i < 0 || i > i2) {
            DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i, "index: ", i2, ", size: "));
            int i6 = RemoteActionCompatParcelizer + 103;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return;
        }
        int i8 = i5 + 69;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final void serializer(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = write + 35;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (i < 0 || i >= i2) {
            DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i, "index: ", i2, ", size: "));
            int i5 = RemoteActionCompatParcelizer + 77;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return new o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (o.onRenderProcessGonelambda1.write == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (o.onRenderProcessGonelambda1.write == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = new o.onRenderProcessGonelambda1();
        r2 = coil3.ExtrasKt.write + 101;
        coil3.ExtrasKt.RemoteActionCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o.replacePrefetchedUrlsWithLocalAssetslambda0 IconCompatParcelizer() {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = coil3.ExtrasKt.write
            int r1 = r1 + 91
            int r2 = r1 % 128
            coil3.ExtrasKt.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            java.lang.RuntimeException r1 = o.onRenderProcessGonelambda1.write
            r2 = 42
            int r2 = r2 / 0
            if (r1 != 0) goto L2a
            goto L1b
        L17:
            java.lang.RuntimeException r1 = o.onRenderProcessGonelambda1.write
            if (r1 != 0) goto L2a
        L1b:
            o.onRenderProcessGonelambda1 r1 = new o.onRenderProcessGonelambda1
            r1.<init>()
            int r2 = coil3.ExtrasKt.write
            int r2 = r2 + 101
            int r3 = r2 % 128
            coil3.ExtrasKt.RemoteActionCompatParcelizer = r3
            int r2 = r2 % r0
            return r1
        L2a:
            o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release r0 = new o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release
            r1 = 12
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.ExtrasKt.IconCompatParcelizer():o.replacePrefetchedUrlsWithLocalAssetslambda0");
    }

    public static int RemoteActionCompatParcelizer(Context context, int i, int i2) {
        int i3 = 2 % 2;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            int i4 = RemoteActionCompatParcelizer + 51;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return i;
        }
        int i6 = write + 103;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i2;
    }

    public static boolean read(BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2, SentryOptions sentryOptions) {
        int i = 2 % 2;
        int i2 = write + 69;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long jWrite = write.write(sentryOptions.getSerializer(), sentryOptions.getLogger(), bannerViewExternalSyntheticLambda2);
        boolean z = false;
        if (jWrite <= 1048576) {
            int i4 = write;
            int i5 = i4 + 17;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            z = i5 % 2 == 0;
            int i6 = i4 + 67;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return z;
    }

    public static FocusTransactionsKt write(String str, performRequestFocus performrequestfocus) {
        int i = 2 % 2;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        FocusTransactionsKt focusTransactionsKt = new FocusTransactionsKt(str, performrequestfocus, clearChildFocus.write, YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer.plus(UrlUtils.serializer())));
        int i2 = write + 43;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return focusTransactionsKt;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        ShaderKt shaderKt = (ShaderKt) objArr[0];
        Extras$Key extras$Key = (Extras$Key) objArr[1];
        int i = 2 % 2;
        Object obj = shaderKt.RatingCompat.read.get(extras$Key);
        if (obj != null) {
            return obj;
        }
        int i2 = write + 71;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj2 = shaderKt.IconCompatParcelizer.RemoteActionCompatParcelizer.read.get(extras$Key);
        if (obj2 != null) {
            return obj2;
        }
        int i4 = RemoteActionCompatParcelizer + 63;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return extras$Key.IconCompatParcelizer;
    }

    public static View RemoteActionCompatParcelizer(int i, View view) {
        int i2 = 2 % 2;
        int i3 = write + 31;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = view instanceof ViewGroup;
            obj.hashCode();
            throw null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i4 = 0;
            while (i4 < childCount) {
                int i5 = RemoteActionCompatParcelizer + 85;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    viewGroup.getChildAt(i4).findViewById(i);
                    throw null;
                }
                View viewFindViewById = viewGroup.getChildAt(i4).findViewById(i);
                if (viewFindViewById != null) {
                    return viewFindViewById;
                }
                i4++;
                int i6 = RemoteActionCompatParcelizer + 23;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        }
        return null;
    }

    public static final Object read(getBlurRadiusannotations getblurradiusannotations, Extras$Key extras$Key) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = getblurradiusannotations.read.read.get(extras$Key);
        if (obj != null) {
            return obj;
        }
        int i4 = write + 69;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return extras$Key.IconCompatParcelizer;
        }
        Object obj2 = extras$Key.IconCompatParcelizer;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:8:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    private static /* synthetic */ Object MediaBrowserCompatMediaItem(Object[] objArr) {
        int i;
        int i2;
        int i3;
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int iIntValue3 = ((Number) objArr[2]).intValue();
        int i4 = 2 % 2;
        int i5 = write;
        int i6 = i5 + 93;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        Object obj = null;
        if (i6 % 2 != 0) {
            int i7 = 70 / 0;
            if (iIntValue >= 0) {
                if (iIntValue2 <= iIntValue3) {
                    i = i5 + 99;
                    RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iIntValue <= iIntValue2) {
                        i3 = i5 + 49;
                        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 != 0) {
                            int i8 = 42 / 0;
                        }
                        return null;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(iIntValue, "fromIndex: ", iIntValue2, " > toIndex: "));
                    i2 = write + 59;
                    RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        int i9 = 45 / 0;
                    }
                    return null;
                }
            }
        } else if (iIntValue >= 0) {
            if (iIntValue2 <= iIntValue3) {
                i = i5 + 99;
                RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (iIntValue <= iIntValue2) {
                    i3 = i5 + 49;
                    RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        int i10 = 42 / 0;
                    }
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(iIntValue, "fromIndex: ", iIntValue2, " > toIndex: "));
                i2 = write + 59;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i11 = 45 / 0;
                }
                return null;
            }
        }
        DrawableTransformation.RemoteActionCompatParcelizer(iIntValue3, m1$$ExternalSyntheticOutline0.m(iIntValue, iIntValue2, "fromIndex: ", ", toIndex: ", ", size: "));
        return null;
    }

    private static /* synthetic */ Object MediaMetadataCompat(Object[] objArr) {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objArr[0];
        int i = 2 % 2;
        getcontentviewgroupparentlayout.getClass();
        ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout.getCoroutineContext().plus(new onBackInvokedlambda0((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) getcontentviewgroupparentlayout.getCoroutineContext().get(onAnimationEndlambda1.RemoteActionCompatParcelizer))));
        int i2 = RemoteActionCompatParcelizer + 69;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return contextScopeRemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void IconCompatParcelizer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        int i2 = 2 % 2;
        int i3 = write + 7;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (i >= 0 && byteBuffer2.remaining() >= i && byteBuffer3.remaining() >= i) {
            int i5 = write + 111;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                byteBuffer.remaining();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (byteBuffer.remaining() >= i) {
                int i6 = RemoteActionCompatParcelizer + 109;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                int i8 = 0;
                while (i8 < i) {
                    int i9 = write + 31;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
                        i8 += 56;
                    } else {
                        byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
                        i8++;
                    }
                }
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static byte[] RemoteActionCompatParcelizer(byte[]... bArr) throws GeneralSecurityException {
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 119;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            length = bArr.length;
            i = 1;
        } else {
            length = bArr.length;
            i = 0;
        }
        int length2 = i;
        while (i < length) {
            int i4 = RemoteActionCompatParcelizer + 71;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            byte[] bArr2 = bArr[i];
            if (length2 > Integer.MAX_VALUE - bArr2.length) {
                getAlignmentLinesMap.write("exceeded size limit");
                return null;
            }
            length2 += bArr2.length;
            i++;
        }
        byte[] bArr3 = new byte[length2];
        int length3 = bArr.length;
        int i6 = 0;
        int length4 = 0;
        while (i6 < length3) {
            int i7 = RemoteActionCompatParcelizer + 25;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            byte[] bArr4 = bArr[i6];
            System.arraycopy(bArr4, 0, bArr3, length4, bArr4.length);
            length4 += bArr4.length;
            i6++;
            int i9 = write + 49;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        return bArr3;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        byte[] bArr2 = (byte[]) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        if (iIntValue3 < 0 || bArr.length - iIntValue3 < iIntValue || bArr2.length - iIntValue3 < iIntValue2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return null;
        }
        int i2 = write + 79;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        byte[] bArr3 = new byte[iIntValue3];
        for (int i4 = 0; i4 < iIntValue3; i4++) {
            int i5 = RemoteActionCompatParcelizer + 91;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            bArr3[i4] = (byte) (bArr[i4 + iIntValue] ^ bArr2[i4 + iIntValue2]);
        }
        int i7 = write + 83;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 7 / 0;
        }
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        return (byte[]) read(-1067551855, o.handleUrlOverridelambda1.RemoteActionCompatParcelizer(), o.handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 1067551856, o.handleUrlOverridelambda1.RemoteActionCompatParcelizer(), r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The lengths of x and y should match.");
        r10 = coil3.ExtrasKt.write + 91;
        coil3.ExtrasKt.RemoteActionCompatParcelizer = r10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r2.length == r10.length) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r2.length == r10.length) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r9 = new java.lang.Object[]{r2, 0, r10, 0, java.lang.Integer.valueOf(r2.length)};
        r8 = o.handleUrlOverridelambda1.RemoteActionCompatParcelizer();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object RemoteActionCompatParcelizer(java.lang.Object[] r10) {
        /*
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = r10[r0]
            byte[] r2 = (byte[]) r2
            r3 = 1
            r10 = r10[r3]
            byte[] r10 = (byte[]) r10
            r3 = 2
            int r4 = r3 % r3
            int r4 = coil3.ExtrasKt.write
            int r4 = r4 + 115
            int r5 = r4 % 128
            coil3.ExtrasKt.RemoteActionCompatParcelizer = r5
            int r4 = r4 % r3
            if (r4 == 0) goto L23
            int r4 = r2.length
            int r5 = r10.length
            r6 = 4
            int r6 = r6 / r0
            if (r4 != r5) goto L4d
            goto L27
        L23:
            int r0 = r2.length
            int r4 = r10.length
            if (r0 != r4) goto L4d
        L27:
            int r0 = r2.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r9 = new java.lang.Object[]{r2, r1, r10, r1, r0}
            int r8 = o.handleUrlOverridelambda1.RemoteActionCompatParcelizer()
            int r4 = o.handleUrlOverridelambda1.RemoteActionCompatParcelizer()
            int r7 = o.handleUrlOverridelambda1.RemoteActionCompatParcelizer()
            int r5 = o.handleUrlOverridelambda1.RemoteActionCompatParcelizer()
            r6 = 1067551856(0x3fa18c70, float:1.2620983)
            r3 = -1067551855(0xffffffffc05e7391, float:-3.4758036)
            java.lang.Object r10 = read(r3, r4, r5, r6, r7, r8, r9)
            byte[] r10 = (byte[]) r10
            return r10
        L4d:
            java.lang.String r10 = "The lengths of x and y should match."
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r10)
            int r10 = coil3.ExtrasKt.write
            int r10 = r10 + 91
            int r0 = r10 % 128
            coil3.ExtrasKt.RemoteActionCompatParcelizer = r0
            int r10 = r10 % r3
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.ExtrasKt.RemoteActionCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    public static void read(int i, int i2, int i3) {
        String strWrite;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer;
        int i6 = i5 + 65;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        if (i >= 0 && i2 >= i) {
            if (i2 <= i3) {
                return;
            }
            int i8 = i5 + 67;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        if (i < 0 || i > i3) {
            strWrite = read(i, i3, "start index");
            int i10 = write + 119;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        } else if (i2 >= 0) {
            int i12 = i5 + 77;
            write = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (i2 <= i3) {
                strWrite = getButton2EK5gGoQ.write("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                strWrite = read(i2, i3, "end index");
            }
        } else {
            strWrite = read(i2, i3, "end index");
        }
        throw new IndexOutOfBoundsException(strWrite);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 java.util.List) = (r1v4 java.util.List), (r1v7 java.util.List) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    public static void RemoteActionCompatParcelizer(r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 r8lambdaypqlaaoriyrj3iy_tqzuutrvh0, BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2, SentryOptions sentryOptions, String str) {
        List list;
        int i = 2 % 2;
        int i2 = write + 59;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            list = r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.read;
            int i3 = 46 / 0;
            if (list != null) {
                if (list.size() > 500) {
                    ArrayList arrayList = new ArrayList(Constant.ERROR_UNKNOWN);
                    arrayList.addAll(list.subList(0, 250));
                    arrayList.addAll(list.subList(list.size() - 250, list.size()));
                    r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.read = arrayList;
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, str, bannerViewExternalSyntheticLambda2.MediaMetadataCompat);
                }
            }
        } else {
            list = r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.read;
            if (list != null) {
                if (list.size() > 500) {
                    ArrayList arrayList2 = new ArrayList(Constant.ERROR_UNKNOWN);
                    arrayList2.addAll(list.subList(0, 250));
                    arrayList2.addAll(list.subList(list.size() - 250, list.size()));
                    r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.read = arrayList2;
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, str, bannerViewExternalSyntheticLambda2.MediaMetadataCompat);
                }
            }
        }
        int i4 = write + 67;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
    }

    public static String read(int i, int i2, String str) {
        int i3 = 2 % 2;
        Object obj = null;
        if (i >= 0) {
            if (i2 >= 0) {
                return getButton2EK5gGoQ.write("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
            return null;
        }
        int i4 = write + 37;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        String strWrite = getButton2EK5gGoQ.write("%s (%s) must not be negative", str, Integer.valueOf(i));
        int i6 = write + 47;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return strWrite;
        }
        obj.hashCode();
        throw null;
    }

    public static getPrevious IconCompatParcelizer(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        getPrevious getpreviousIconCompatParcelizer;
        int i3 = 2 % 2;
        if (RemoteActionCompatParcelizer(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28) {
                int i5 = RemoteActionCompatParcelizer + 75;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0 ? i4 <= 31 : i4 <= 71) {
                    return new getPrevious(null, null, typedValue.data);
                }
            }
            try {
                getpreviousIconCompatParcelizer = getPrevious.IconCompatParcelizer(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                SentryLogcatAdapter.read("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                getpreviousIconCompatParcelizer = null;
            }
            if (getpreviousIconCompatParcelizer != null) {
                int i6 = write + 7;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return getpreviousIconCompatParcelizer;
            }
        }
        return new getPrevious(null, null, i2);
    }

    public static void serializer(BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2, SentryOptions sentryOptions) {
        int i = 2 % 2;
        int i2 = write + 107;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ArrayList arrayListRemoteActionCompatParcelizer = bannerViewExternalSyntheticLambda2.RemoteActionCompatParcelizer();
        if (arrayListRemoteActionCompatParcelizer != null) {
            Iterator it = arrayListRemoteActionCompatParcelizer.iterator();
            int i4 = RemoteActionCompatParcelizer + 105;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            while (it.hasNext()) {
                int i6 = RemoteActionCompatParcelizer + 85;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 r8lambdaypqlaaoriyrj3iy_tqzuutrvh0 = ((r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) it.next()).serializer;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 r8lambdaypqlaaoriyrj3iy_tqzuutrvh1 = ((r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) it.next()).serializer;
                if (r8lambdaypqlaaoriyrj3iy_tqzuutrvh1 != null) {
                    RemoteActionCompatParcelizer(r8lambdaypqlaaoriyrj3iy_tqzuutrvh1, bannerViewExternalSyntheticLambda2, sentryOptions, "Truncated exception stack frames of event %s");
                }
            }
        }
        ArrayList arrayListSerializer = bannerViewExternalSyntheticLambda2.serializer();
        if (arrayListSerializer != null) {
            Iterator it2 = arrayListSerializer.iterator();
            while (it2.hasNext()) {
                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 r8lambdaypqlaaoriyrj3iy_tqzuutrvh2 = ((_init_lambda2) it2.next()).MediaBrowserCompatMediaItem;
                if (r8lambdaypqlaaoriyrj3iy_tqzuutrvh2 != null) {
                    RemoteActionCompatParcelizer(r8lambdaypqlaaoriyrj3iy_tqzuutrvh2, bannerViewExternalSyntheticLambda2, sentryOptions, "Truncated thread stack frames for event %s");
                }
            }
        }
    }

    public static void IconCompatParcelizer(int i, int i2) {
        String strWrite;
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 75;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strWrite = getButton2EK5gGoQ.write("%s (%s) must not be negative", "index", Integer.valueOf(i));
                int i5 = write + 43;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                if (i2 < 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                strWrite = getButton2EK5gGoQ.write("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strWrite);
        }
    }

    public static ColorStateList RemoteActionCompatParcelizer(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        int i2 = 2 % 2;
        if (!RemoteActionCompatParcelizer(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i3 = typedValue.type;
        if (i3 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        }
        int i4 = write;
        int i5 = i4 + 15;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        if (i3 >= 28) {
            int i7 = i4 + 93;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0 ? i3 <= 31 : i3 <= 113) {
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(typedValue.data);
                int i8 = RemoteActionCompatParcelizer + 27;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return colorStateListValueOf;
            }
        }
        return getDown.serializer(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019 A[Catch: InvocationTargetException -> 0x0059, NoSuchMethodException -> 0x007a, TRY_LEAVE, TryCatch #2 {NoSuchMethodException -> 0x007a, InvocationTargetException -> 0x0059, blocks: (B:4:0x000f, B:9:0x0016, B:17:0x0038, B:19:0x0056, B:10:0x0019, B:14:0x0029, B:15:0x0030, B:7:0x0013), top: B:33:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0029 A[SYNTHETIC] */
    public static final setGraphicModalMaxWidthDp serializer(Object obj, setGraphicModalMaxWidthDp... setgraphicmodalmaxwidthdpArr) throws IllegalAccessException, InvocationTargetException {
        int length;
        Class[] clsArr;
        Class[] clsArr2;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 29;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = 0;
        try {
            if (i3 % 2 != 0) {
                if (setgraphicmodalmaxwidthdpArr.length == 0) {
                    clsArr2 = new Class[0];
                } else {
                    length = setgraphicmodalmaxwidthdpArr.length;
                    clsArr = new Class[length];
                    while (i4 < length) {
                        i = RemoteActionCompatParcelizer + 95;
                        write = i % Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            clsArr[i4] = setGraphicModalMaxWidthDp.class;
                            i4 += 6;
                        } else {
                            clsArr[i4] = setGraphicModalMaxWidthDp.class;
                            i4++;
                        }
                    }
                    clsArr2 = clsArr;
                }
            } else if (setgraphicmodalmaxwidthdpArr.length == 0) {
                clsArr2 = new Class[0];
            } else {
                length = setgraphicmodalmaxwidthdpArr.length;
                clsArr = new Class[length];
                while (i4 < length) {
                    i = RemoteActionCompatParcelizer + 95;
                    write = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        clsArr[i4] = setGraphicModalMaxWidthDp.class;
                        i4 += 6;
                    } else {
                        clsArr[i4] = setGraphicModalMaxWidthDp.class;
                        i4++;
                    }
                }
                clsArr2 = clsArr;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length)).invoke(obj, Arrays.copyOf(setgraphicmodalmaxwidthdpArr, setgraphicmodalmaxwidthdpArr.length));
            if (objInvoke instanceof setGraphicModalMaxWidthDp) {
                return (setGraphicModalMaxWidthDp) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                int i5 = RemoteActionCompatParcelizer + 3;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final DragAndDropTargetModifierNode write(int i, isInvalidIndex isinvalidindex, getBirthDateFull getbirthdatefull) {
        int i2 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if (objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = new DragAndDropTargetModifierNode(isinvalidindex, true, i);
            getpostalcode.write(objComponentActivity);
            int i3 = write + 65;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = (DragAndDropTargetModifierNode) objComponentActivity;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{dragAndDropTargetModifierNode.write, isinvalidindex}, getCieXyz.write())).booleanValue()) {
            int i5 = 0;
            boolean z = dragAndDropTargetModifierNode.write == null;
            dragAndDropTargetModifierNode.write = isinvalidindex;
            if (!z && dragAndDropTargetModifierNode.read) {
                getHandleruiannotations gethandleruiannotations = dragAndDropTargetModifierNode.RemoteActionCompatParcelizer;
                Object obj = null;
                if (gethandleruiannotations != null) {
                    int i6 = RemoteActionCompatParcelizer + 25;
                    write = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        getCreditCardSecurityCode getcreditcardsecuritycode = gethandleruiannotations.IconCompatParcelizer;
                        obj.hashCode();
                        throw null;
                    }
                    getCreditCardSecurityCode getcreditcardsecuritycode2 = gethandleruiannotations.IconCompatParcelizer;
                    if (getcreditcardsecuritycode2 != null) {
                        int i7 = RemoteActionCompatParcelizer + 97;
                        write = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 == 0) {
                            getcreditcardsecuritycode2.IconCompatParcelizer(gethandleruiannotations, (Object) null);
                            throw null;
                        }
                        getcreditcardsecuritycode2.IconCompatParcelizer(gethandleruiannotations, (Object) null);
                    }
                    dragAndDropTargetModifierNode.RemoteActionCompatParcelizer = null;
                }
                ArrayList arrayList = dragAndDropTargetModifierNode.serializer;
                if (arrayList != null) {
                    int i8 = write + 115;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    int size = arrayList.size();
                    while (i5 < size) {
                        getHandleruiannotations gethandleruiannotations2 = (getHandleruiannotations) arrayList.get(i5);
                        getCreditCardSecurityCode getcreditcardsecuritycode3 = gethandleruiannotations2.IconCompatParcelizer;
                        if (getcreditcardsecuritycode3 != null) {
                            getcreditcardsecuritycode3.IconCompatParcelizer(gethandleruiannotations2, (Object) null);
                        }
                        i5++;
                        int i10 = RemoteActionCompatParcelizer + 63;
                        write = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                    }
                    arrayList.clear();
                    int i12 = write + 81;
                    RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                }
            }
        }
        return dragAndDropTargetModifierNode;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        getBirthDateFull getbirthdatefull = (getBirthDateFull) objArr[0];
        Modifier modifier = (Modifier) objArr[1];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getbirthdatefull, modifier);
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
        if (getpostalcode.read == null) {
            SentryUUID.write();
            throw null;
        }
        int i4 = write + 21;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
        if (getpostalcode.ComponentActivity) {
            int i6 = RemoteActionCompatParcelizer + 35;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                getpostalcode.serializer(constructor);
                int i7 = 72 / 0;
            } else {
                getpostalcode.serializer(constructor);
            }
        } else {
            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        }
        AndroidContentCaptureManagerCompanion.write(getbirthdatefull, emitcomroadrunnerdeliveryonthewaycrowdsourcingfloatingpresentationCrowdSourcingFloatingImageCameraOnlyUiModelImplobserveUiStateinlinedmap22.IconCompatParcelizer, companion.getSetMeasurePolicy());
        AndroidContentCaptureManagerCompanion.write(getbirthdatefull, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
        AndroidContentCaptureManagerCompanion.write(getbirthdatefull, companion.getApplyOnDeactivatedNodeAssertion());
        AndroidContentCaptureManagerCompanion.write(getbirthdatefull, modifierMaterializeModifier, companion.getSetModifier());
        AndroidContentCaptureManagerCompanion.write(getbirthdatefull, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
        getpostalcode.IconCompatParcelizer(true);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r1
  0x0021: PHI (r1v5 int) = (r1v4 int), (r1v13 int) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean RemoteActionCompatParcelizer(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 17;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
            i = _get_messagewebview_lambda1.code;
            if (i != 3864) {
                if (i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
                    i2 = write;
                    int i5 = i2 + 57;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    if (i != 307) {
                        int i7 = i2 + 21;
                        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        if (i != 308 && i != 404 && i != 405) {
                            switch (i) {
                                case LocationRequest.PRIORITY_INDOOR /* 300 */:
                                case LocationRequest.PRIORITY_MAG_POSITION /* 301 */:
                                    break;
                                case 302:
                                    if (_get_messageWebView_lambda1.RemoteActionCompatParcelizer(_get_messagewebview_lambda1, "Expires") == null && _get_messagewebview_lambda1.read().maxAgeSeconds == -1) {
                                        int i9 = write + 27;
                                        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                                        int i10 = i9 % 2;
                                        if (!_get_messagewebview_lambda1.read().isPublic && !_get_messagewebview_lambda1.read().isPrivate) {
                                            return false;
                                        }
                                    }
                                    break;
                                default:
                                    return false;
                            }
                        }
                    } else if (_get_messageWebView_lambda1.RemoteActionCompatParcelizer(_get_messagewebview_lambda1, "Expires") == null) {
                        int i11 = write + 27;
                        RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        if (!_get_messagewebview_lambda1.read().isPublic) {
                            return false;
                        }
                    }
                }
            }
        } else {
            r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
            i = _get_messagewebview_lambda1.code;
            if (i != 200) {
                if (i != 410) {
                    i2 = write;
                    int i13 = i2 + 57;
                    RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    if (i != 307) {
                        int i15 = i2 + 21;
                        RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        if (i != 308) {
                            switch (i) {
                                case LocationRequest.PRIORITY_INDOOR /* 300 */:
                                case LocationRequest.PRIORITY_MAG_POSITION /* 301 */:
                                    break;
                                case 302:
                                    if (_get_messageWebView_lambda1.RemoteActionCompatParcelizer(_get_messagewebview_lambda1, "Expires") == null) {
                                        int i17 = write + 27;
                                        RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                                        int i18 = i17 % 2;
                                        if (!_get_messagewebview_lambda1.read().isPublic) {
                                            return false;
                                        }
                                    }
                                    break;
                                default:
                                    return false;
                            }
                        }
                    } else if (_get_messageWebView_lambda1.RemoteActionCompatParcelizer(_get_messagewebview_lambda1, "Expires") == null) {
                        int i19 = write + 27;
                        RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                        int i110 = i19 % 2;
                        if (!_get_messagewebview_lambda1.read().isPublic) {
                            return false;
                        }
                    }
                }
            }
        }
        if (_get_messagewebview_lambda1.read().noStore) {
            return false;
        }
        getMessageIconView getmessageiconviewWrite = r8lambday113fdftsr5e4pzj6xssxltpl60.lazyCacheControl;
        if (getmessageiconviewWrite == null) {
            int i20 = getMessageIconView.$r8$clinit;
            getmessageiconviewWrite = TuplesKt.write(r8lambday113fdftsr5e4pzj6xssxltpl60.headers);
            r8lambday113fdftsr5e4pzj6xssxltpl60.lazyCacheControl = getmessageiconviewWrite;
        }
        return !getmessageiconviewWrite.noStore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void write(obtainTint8_81llA obtaintint8_81lla, Boolean bool) {
        String simpleName;
        int i = 2 % 2;
        int i2 = write + 23;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            obtaintint8_81lla.getClass();
            getNumChildren getnumchildren = getNumChildren.IconCompatParcelizer;
            Looper.getMainLooper().isCurrentThread();
            throw null;
        }
        obtaintint8_81lla.getClass();
        getNumChildren getnumchildren2 = getNumChildren.IconCompatParcelizer;
        if (!Looper.getMainLooper().isCurrentThread()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("TTI metric stop must be called from UI thread!");
            return;
        }
        if (obtaintint8_81lla instanceof Activity) {
            int i3 = RemoteActionCompatParcelizer + 75;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                String simpleName2 = ((Activity) obtaintint8_81lla).getClass().getSimpleName();
                getNumChildren.read(simpleName2, bool, getNumChildren.write(simpleName2));
                return;
            } else {
                String simpleName3 = ((Activity) obtaintint8_81lla).getClass().getSimpleName();
                getNumChildren.read(simpleName3, bool, getNumChildren.write(simpleName3));
                throw null;
            }
        }
        if (!(obtaintint8_81lla instanceof Fragment)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Only Activities and Fragments should implement PerformanceMeasurableScreen");
            return;
        }
        Fragment fragment = (Fragment) obtaintint8_81lla;
        if (getNumChildren.read(fragment)) {
            FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
            fragmentActivityRequireActivity.getClass();
            simpleName = fragmentActivityRequireActivity.getClass().getSimpleName();
        } else {
            simpleName = fragment.getClass().getSimpleName();
        }
        Long lWrite = getNumChildren.write(simpleName);
        getNumChildren.read.remove(fragment.getClass().getSimpleName());
        getNumChildren.read(fragment.getClass().getSimpleName(), bool, lWrite);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0063  */
    /* JADX WARN: Code duplicated, block: B:14:0x0065  */
    /* JADX WARN: Code duplicated, block: B:19:0x0084  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bb  */
    public static final PopulateViewStructure_androidKtpopulate7 write(StateFlow stateFlow, getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 91;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) getpostalcode.write((getNewPassword) setInternalPaintui_graphics.write);
        toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.STARTED;
        Object obj = stateFlow.read();
        supportsColorMatrixQuery lifecycle = accessisrendernodecompatiblecp.getLifecycle();
        int i5 = i << 3;
        int i6 = (i & 14) | (i5 & 7168) | (57344 & i5);
        r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc r8lambda2qmxd75iptxkfld4rjabqemoamc = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
        Object[] objArr = {stateFlow, lifecycle, tocolorlong8_81lla, r8lambda2qmxd75iptxkfld4rjabqemoamc};
        boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(lifecycle);
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i7 = 1;
        if (((i6 & 7168) ^ 3072) > 2048) {
            int i8 = write + 13;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                getpostalcode.read(tocolorlong8_81lla.ordinal());
                throw null;
            }
            if (!(!getpostalcode.read(tocolorlong8_81lla.ordinal()))) {
                z = true;
            } else if ((i6 & 3072) == 2048) {
                z = true;
            } else {
                z = false;
            }
        } else if ((i6 & 3072) == 2048) {
            z = true;
        } else {
            z = false;
        }
        boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(r8lambda2qmxd75iptxkfld4rjabqemoamc);
        boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(stateFlow);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (!(z | zIconCompatParcelizer | zIconCompatParcelizer2) && !zIconCompatParcelizer3) {
            int i9 = write + 125;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new RealImageLoader$execute$result$1(lifecycle, tocolorlong8_81lla, r8lambda2qmxd75iptxkfld4rjabqemoamc, stateFlow, null);
                getpostalcode.write(objComponentActivity);
            }
        } else {
            objComponentActivity = new RealImageLoader$execute$result$1(lifecycle, tocolorlong8_81lla, r8lambda2qmxd75iptxkfld4rjabqemoamc, stateFlow, null);
            getpostalcode.write(objComponentActivity);
        }
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity;
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if (objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = CompositionKt.RemoteActionCompatParcelizer(obj);
            getpostalcode.write(objComponentActivity2);
        }
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        Object objComponentActivity3 = getpostalcode.ComponentActivity();
        if (!zIconCompatParcelizer4) {
            int i11 = write + 121;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, populateViewStructure_androidKtpopulate7, shortNewsContentCardView, i7);
                getpostalcode.write(objComponentActivity3);
            }
        } else {
            objComponentActivity3 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, populateViewStructure_androidKtpopulate7, shortNewsContentCardView, i7);
            getpostalcode.write(objComponentActivity3);
        }
        getPhoneNumberNational.write(objArrCopyOf, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity3, getpostalcode);
        return populateViewStructure_androidKtpopulate7;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    private static /* synthetic */ Object read(Object[] objArr) {
        createFromParcel createfromparcel;
        Object obj = (obtainTint8_81llA) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        obj.getClass();
        SentryActivityScreenPerformanceCallbacks sentryActivityScreenPerformanceCallbacks = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (sentryActivityScreenPerformanceCallbacks == null) {
            int i2 = RemoteActionCompatParcelizer + 51;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("SentryPerformanceTracker not initialized. Did you forget to initialize app-performance module?", new Object[1]);
                return null;
            }
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("SentryPerformanceTracker not initialized. Did you forget to initialize app-performance module?", new Object[0]);
            return null;
        }
        if (obj instanceof Activity) {
            int i3 = write + 21;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            Activity activity = (Activity) obj;
            if (activity instanceof obtainTint8_81llA) {
                Map map = sentryActivityScreenPerformanceCallbacks.RemoteActionCompatParcelizer;
                map.getClass();
                map.put(activity, Long.valueOf(System.currentTimeMillis()));
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) sentryActivityScreenPerformanceCallbacks.read.remove(activity);
                if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
                    int i5 = write + 119;
                    int i6 = i5 % Fields.SpotShadowColor;
                    RemoteActionCompatParcelizer = i6;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    if (bool != null) {
                        int i7 = i6 + 97;
                        write = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        r8lambdareqvhj3p9oule_afn8an0r0tlg0.RemoteActionCompatParcelizer("screen_available", String.valueOf(bool.booleanValue()));
                    }
                    r8lambdareqvhj3p9oule_afn8an0r0tlg0.read();
                    return null;
                }
            }
        } else {
            if (!(obj instanceof Fragment)) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("reportSentryFullyDrawn called on unsupported PerformanceMeasurableScreen type: ".concat(obj.getClass().getSimpleName()), new Object[0]);
                return null;
            }
            int i9 = write + 107;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                boolean z = ((Fragment) obj) instanceof obtainTint8_81llA;
                obj2.hashCode();
                throw null;
            }
            Fragment fragment = (Fragment) obj;
            boolean z2 = fragment instanceof obtainTint8_81llA;
            if (z2) {
                FragmentActivity activity2 = fragment.getActivity();
                if (activity2 != null) {
                    SentryFragmentScreenPerformanceCallbacks sentryFragmentScreenPerformanceCallbacks = (SentryFragmentScreenPerformanceCallbacks) sentryActivityScreenPerformanceCallbacks.IconCompatParcelizer.get(activity2);
                    if (sentryFragmentScreenPerformanceCallbacks != null) {
                        if (z2) {
                            Map map2 = sentryFragmentScreenPerformanceCallbacks.RemoteActionCompatParcelizer;
                            map2.getClass();
                            map2.put(fragment, Long.valueOf(System.currentTimeMillis()));
                            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg1 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) sentryFragmentScreenPerformanceCallbacks.IconCompatParcelizer.remove(fragment);
                            if (r8lambdareqvhj3p9oule_afn8an0r0tlg1 != null) {
                                int i10 = write + 47;
                                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                                if (i10 % 2 != 0) {
                                    int i11 = 2 / 0;
                                    if (bool != null) {
                                        r8lambdareqvhj3p9oule_afn8an0r0tlg1.RemoteActionCompatParcelizer("screen_available", String.valueOf(bool.booleanValue()));
                                    }
                                } else if (bool != null) {
                                    r8lambdareqvhj3p9oule_afn8an0r0tlg1.RemoteActionCompatParcelizer("screen_available", String.valueOf(bool.booleanValue()));
                                }
                                r8lambdareqvhj3p9oule_afn8an0r0tlg1.read();
                            }
                        } else {
                            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                            forest.RemoteActionCompatParcelizer("SentryFragmentTracker");
                            forest.RemoteActionCompatParcelizer("reportFullyDrawn called on non-PerformanceMeasurableScreen Fragment: ".concat(fragment.getClass().getSimpleName()), new Object[0]);
                        }
                        createfromparcel = createFromParcel.INSTANCE;
                    } else {
                        createfromparcel = null;
                    }
                    if (createfromparcel == null) {
                        int i12 = write + 27;
                        RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                    }
                }
                Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                forest2.RemoteActionCompatParcelizer("SentryScreenTracker");
                forest2.RemoteActionCompatParcelizer("Fragment not attached to Activity", new Object[0]);
                return null;
            }
        }
        int i14 = write + 53;
        RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
        if (i14 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x026f  */
    /* JADX WARN: Code duplicated, block: B:160:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:99:0x0269 A[Catch: NoSuchFieldException -> 0x029f, PHI: r11
  0x0269: PHI (r11v4 java.lang.Class<?>) = (r11v3 java.lang.Class<?>), (r11v5 java.lang.Class<?>) binds: [B:98:0x0267, B:95:0x0259] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {NoSuchFieldException -> 0x029f, blocks: (B:88:0x0232, B:93:0x024c, B:103:0x0270, B:99:0x0269, B:107:0x0278, B:109:0x027e, B:111:0x0284, B:115:0x0293, B:117:0x0297, B:122:0x029c, B:97:0x025c), top: B:144:0x0232 }] */
    public static final setGraphicModalMaxWidthDp RemoteActionCompatParcelizer(Class cls, setGraphicModalMaxWidthDp... setgraphicmodalmaxwidthdpArr) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp;
        Class<?> cls2;
        Object obj2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer;
        Field field;
        Class<?> cls3;
        int i = 2 % 2;
        int i2 = write + 119;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        cls.getClass();
        if (!(!cls.isEnum())) {
            int i4 = RemoteActionCompatParcelizer + 53;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (cls.getAnnotation(Serializable.class) == null && cls.getAnnotation(DefaultInAppMessageAnimationFactory.class) == null) {
                Object[] enumConstants = cls.getEnumConstants();
                String canonicalName = cls.getCanonicalName();
                canonicalName.getClass();
                enumConstants.getClass();
                return new EnumSerializer(canonicalName, (Enum[]) enumConstants);
            }
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr2 = (setGraphicModalMaxWidthDp[]) Arrays.copyOf(setgraphicmodalmaxwidthdpArr, setgraphicmodalmaxwidthdpArr.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer2 = obj == null ? null : serializer(obj, (setGraphicModalMaxWidthDp[]) Arrays.copyOf(setgraphicmodalmaxwidthdpArr2, setgraphicmodalmaxwidthdpArr2.length));
        if (setgraphicmodalmaxwidthdpSerializer2 != null) {
            int i6 = RemoteActionCompatParcelizer + 101;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return setgraphicmodalmaxwidthdpSerializer2;
        }
        String canonicalName2 = cls.getCanonicalName();
        if (canonicalName2 == null || setCarryoverInAppMessage.RemoteActionCompatParcelizer(canonicalName2, "java.", false) || setCarryoverInAppMessage.RemoteActionCompatParcelizer(canonicalName2, "kotlin.", false)) {
            setgraphicmodalmaxwidthdp = null;
        } else {
            Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            int length = declaredFields.length;
            Field field2 = null;
            int i8 = 0;
            boolean z = false;
            while (true) {
                if (i8 >= length) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Field field3 = declaredFields[i8];
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{field3.getName(), "INSTANCE"}, getCieXyz.write())).booleanValue()) {
                    int i9 = RemoteActionCompatParcelizer + 49;
                    write = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{field3.getType(), cls}, getCieXyz.write())).booleanValue();
                        throw null;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{field3.getType(), cls}, getCieXyz.write())).booleanValue()) {
                        int i10 = write + 33;
                        RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        if (!java.lang.reflect.Modifier.isStatic(field3.getModifiers())) {
                            continue;
                        } else if (!z) {
                            z = true;
                            field2 = field3;
                        }
                    } else {
                        continue;
                    }
                }
                i8++;
                field2 = null;
                break;
            }
            if (field2 == null) {
                setgraphicmodalmaxwidthdp = null;
            } else {
                Object obj3 = field2.get(null);
                Method[] methods = cls.getMethods();
                methods.getClass();
                int length2 = methods.length;
                Method method = null;
                int i12 = 0;
                boolean z2 = false;
                while (true) {
                    if (i12 >= length2) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i12];
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{method2.getName(), "serializer"}, getCieXyz.write())).booleanValue()) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{method2.getReturnType(), setGraphicModalMaxWidthDp.class}, getCieXyz.write())).booleanValue()) {
                                int i13 = RemoteActionCompatParcelizer + 25;
                                write = i13 % Fields.SpotShadowColor;
                                int i14 = i13 % 2;
                                if (!z2) {
                                    z2 = true;
                                    method = method2;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    i12++;
                    method = null;
                    break;
                }
                if (method == null) {
                    setgraphicmodalmaxwidthdp = null;
                } else {
                    Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof setGraphicModalMaxWidthDp) {
                        int i15 = RemoteActionCompatParcelizer + 69;
                        write = i15 % Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) objInvoke;
                    } else {
                        setgraphicmodalmaxwidthdp = null;
                    }
                }
            }
        }
        if (setgraphicmodalmaxwidthdp != null) {
            return setgraphicmodalmaxwidthdp;
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr3 = (setGraphicModalMaxWidthDp[]) Arrays.copyOf(setgraphicmodalmaxwidthdpArr, setgraphicmodalmaxwidthdpArr.length);
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        declaredClasses.getClass();
        int length3 = declaredClasses.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length3) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i17];
            if (cls2.getAnnotation(DefaultInAppMessageViewLifecycleListenerstartClearHtmlInAppMessageAssetsThread1.class) != null) {
                break;
            }
            i17++;
        }
        if (cls2 == null) {
            obj2 = null;
        } else {
            try {
                Field declaredField2 = cls.getDeclaredField(cls2.getSimpleName());
                declaredField2.setAccessible(true);
                obj2 = declaredField2.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (setgraphicmodalmaxwidthdpSerializer = serializer(obj2, (setGraphicModalMaxWidthDp[]) Arrays.copyOf(setgraphicmodalmaxwidthdpArr3, setgraphicmodalmaxwidthdpArr3.length))) == null) {
            try {
                Class<?>[] declaredClasses2 = cls.getDeclaredClasses();
                declaredClasses2.getClass();
                int length4 = declaredClasses2.length;
                Class<?> cls4 = null;
                int i18 = 0;
                boolean z3 = false;
                while (true) {
                    if (i18 >= length4) {
                        if (!z3) {
                            break;
                        }
                        break;
                    }
                    int i19 = write + 29;
                    RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                    if (i19 % 2 != 0) {
                        cls3 = declaredClasses2[i18];
                        int i20 = 27 / 0;
                        if (cls3.getSimpleName().equals("$serializer")) {
                            cls4 = cls3;
                            if (!(!z3)) {
                                z3 = true;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        cls3 = declaredClasses2[i18];
                        if (!(!cls3.getSimpleName().equals("$serializer"))) {
                            cls4 = cls3;
                            if (!(!z3)) {
                                z3 = true;
                            }
                        } else {
                            continue;
                        }
                    }
                    i18++;
                    cls4 = null;
                    break;
                }
                Object obj4 = (cls4 == null || (field = cls4.getField("INSTANCE")) == null) ? null : field.get(null);
                if (obj4 instanceof setGraphicModalMaxWidthDp) {
                    int i21 = RemoteActionCompatParcelizer + 81;
                    write = i21 % Fields.SpotShadowColor;
                    if (i21 % 2 == 0) {
                        setgraphicmodalmaxwidthdpSerializer = (setGraphicModalMaxWidthDp) obj4;
                        int i22 = 56 / 0;
                    } else {
                        setgraphicmodalmaxwidthdpSerializer = (setGraphicModalMaxWidthDp) obj4;
                    }
                } else {
                    setgraphicmodalmaxwidthdpSerializer = null;
                }
            } catch (NoSuchFieldException unused3) {
            }
        }
        if (setgraphicmodalmaxwidthdpSerializer != null) {
            return setgraphicmodalmaxwidthdpSerializer;
        }
        if (cls.getAnnotation(DefaultInAppMessageAnimationFactory.class) == null) {
            Serializable serializable = (Serializable) cls.getAnnotation(Serializable.class);
            if (serializable == null) {
                return null;
            }
            int i23 = write + 103;
            RemoteActionCompatParcelizer = i23 % Fields.SpotShadowColor;
            int i24 = i23 % 2;
            if (!displayInAppMessagelambda1.serializer(serializable.write()).equals(displayInAppMessagelambda1.serializer(resetLayoutParamsIfAppropriate.class))) {
                return null;
            }
        }
        return new resetLayoutParamsIfAppropriate(displayInAppMessagelambda1.serializer(cls));
    }

    public static final byte[] read(byte[] bArr, byte[] bArr2) {
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        return (byte[]) read(-116495733, iRemoteActionCompatParcelizer2, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 116495733, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer, new Object[]{bArr, bArr2});
    }

    public static final byte[] IconCompatParcelizer(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        Object[] objArr = {bArr, Integer.valueOf(i), bArr2, Integer.valueOf(i2), Integer.valueOf(i3)};
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        return (byte[]) read(-1067551855, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 1067551856, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, objArr);
    }

    public static final void RemoteActionCompatParcelizer(obtainTint8_81llA obtaintint8_81lla, Boolean bool) {
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        read(662558831, iRemoteActionCompatParcelizer2, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -662558827, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer, new Object[]{obtaintint8_81lla, bool});
    }

    public static final ContextScope read(getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        return (ContextScope) read(702708900, iRemoteActionCompatParcelizer2, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -702708894, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer, new Object[]{getcontentviewgroupparentlayout});
    }

    public static final Object serializer(ShaderKt shaderKt, Extras$Key extras$Key) {
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        return read(-832930121, iRemoteActionCompatParcelizer2, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer, new Object[]{shaderKt, extras$Key});
    }

    public static final void IconCompatParcelizer(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        read(-1094014857, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 1094014862, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, objArr);
    }

    public static final void read(getBirthDateFull getbirthdatefull, Modifier modifier) {
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        read(913837329, iRemoteActionCompatParcelizer2, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer, new Object[]{getbirthdatefull, modifier});
    }
}
