package kotlinx.coroutines;

import android.app.Application;
import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2;
import androidx.room.InvalidationTracker;
import androidx.room.MultiInstanceInvalidationClient;
import androidx.room.RoomDatabase;
import androidx.room.TriggerBasedInvalidationTracker;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.UriKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.InvalidProtocolBufferException;
import com.huawei.hms.location.LocationRequest;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.roadrunner.auth.data.SignInDataStore$get$$inlined$map$1;
import io.grpc.LoadBalancer$Helper;
import io.reactivex.subjects.BehaviorSubject;
import io.sentry.util.UrlUtils;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.RegexKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AbstractC0170getTimestamp;
import o.AndroidContentCaptureManagercurrentSemanticsNodes1;
import o.BannerViewcreateBannerWebViewClientListener1;
import o.BoxMeasurePolicy;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.DefaultInAppMessageModalViewFactory;
import o.DrawableTransformation;
import o.FlowLayoutBuildingBlocksWrapInfo;
import o.FocusTransactionsKt;
import o.InAppMessageHtmlBaseViewCompanion;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewCompanion;
import o.ShortNewsContentCardViewViewHolder;
import o.SimpleItemTouchHelperCallback;
import o.SwipeDismissTouchListener1;
import o.TextAnnouncementContentCardView;
import o.acceptHits;
import o.accessanimateDecay;
import o.accessgetAlwayscp;
import o.accessgetGpucp;
import o.accessgetStrokecp;
import o.accessstartTrackingTable;
import o.applyDisplayCutoutMarginsToContentArealambda0;
import o.aspectRatiodefault;
import o.createFromParcel;
import o.createInAppMessageViewlambda0;
import o.createInAppMessageViewlambda10;
import o.decodeToImageBitmap;
import o.displayInAppMessagelambda1;
import o.fling;
import o.forward4l5_RBY;
import o.getCieXyz;
import o.getClipannotations;
import o.getCreditCardExpirationDay;
import o.getDefaultShadowColor;
import o.getDifferencertfAjoo;
import o.getEmptyInterval;
import o.getModulateAlphake2Ky5w;
import o.getNeverLCbbffg;
import o.getSpacingD9Ej5fM;
import o.getType;
import o.getUnregisteredInAppMessageannotations;
import o.getViewAccessibilityFlagMap;
import o.graphicsLayerpANQ8Wgdefault;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isAnimatingClose;
import o.isCurrentlyDisplayingInAppMessage;
import o.isVerticalSwipeInAllowedDirection;
import o.lambdaperformDismiss0;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onIsEnabledRead;
import o.onTouch;
import o.onViewAttachedToWindowlambda0;
import o.pauseWebviewIfNecessarylambda10;
import o.performFling;
import o.placeSpaceEvenlyfoundation_layout;
import o.prepareForActivityTransitionCarryover;
import o.prepareInAppMessageWithHtmllambda0;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.prepareInAppMessageWithZippedAssetHtmllambda0;
import o.prepareInAppMessageWithZippedAssetHtmllambda1;
import o.prepareInAppMessageWithZippedAssetHtmllambda2;
import o.r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc;
import o.r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.removeFirst;
import o.removeNodeAtDepth;
import o.requiredWidthInVpY3zN4default;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import o.setUnregisteredInAppMessage;
import o.setWasCloseMessageCalled;
import o.throwIllegalArgumentExceptionForNullCheck;
import o.unregisterInAppMessageManager;
import o.updateOutline;
import o.width;
import org.koin.core.scope.Scope;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DelayKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        List list;
        int i7;
        int i8;
        boolean zWrite;
        int i9 = ~i3;
        int i10 = ~i6;
        int i11 = i10 | i;
        int i12 = (~(i9 | i10)) | (~(i9 | i)) | (~i11);
        int i13 = ~i;
        int i14 = (~(i6 | i13 | i3)) | (~(i9 | i13 | i10)) | (~(i11 | i3));
        int i15 = ~(i10 | i13 | i3);
        int i16 = i + i3 + i2 + ((-973178360) * i5) + (1542423572 * i4);
        int i17 = i16 * i16;
        int i18 = (i * (-490823948)) + 944362368 + (i3 * (-490821954)) + (i12 * (-997)) + (i14 * 997) + (i15 * 997) + ((-490822951) * i2) + (2145288392 * i5) + (779328756 * i4) + (i17 * (-1138819072));
        int i19 = (((-1657973228) * i) - 1073741824) + ((-187520530) * i3) + ((-735226349) * i12) + (i14 * 735226349) + (735226349 * i15) + ((-922746880) * i2) + (1207959552 * i5) + ((-1275068416) * i4) + (196542464 * i17) + (i18 * i18 * 1440284672);
        if (i19 != 1) {
            if (i19 == 2) {
                return serializer(objArr);
            }
            if (i19 == 3) {
                return IconCompatParcelizer(objArr);
            }
            if (i19 != 4) {
                return write(objArr);
            }
            int i20 = 2 % 2;
            FlowLayoutBuildingBlocksWrapInfo flowLayoutBuildingBlocksWrapInfo = new FlowLayoutBuildingBlocksWrapInfo(0);
            int i21 = RemoteActionCompatParcelizer + 73;
            IconCompatParcelizer = i21 % Fields.SpotShadowColor;
            int i22 = i21 % 2;
            return flowLayoutBuildingBlocksWrapInfo;
        }
        getType gettype = (getType) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        getType gettype2 = (getType) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[5]).booleanValue();
        int i23 = 2 % 2;
        int iMediaMetadataCompat = gettype.MediaMetadataCompat(iIntValue);
        int i24 = iIntValue + iMediaMetadataCompat;
        int i25 = gettype.read(iIntValue);
        int i26 = gettype.read(i24);
        int i27 = i26 - i25;
        boolean z = iIntValue >= 0 && (gettype.PlaybackStateCompatCustomAction[(gettype.MediaBrowserCompatMediaItem(iIntValue) * 5) + 1] & 201326592) != 0;
        gettype2.PlaybackStateCompat(iMediaMetadataCompat);
        gettype2.read(i27, gettype2.IconCompatParcelizer);
        if (gettype.MediaSessionCompatToken < i24) {
            gettype.PlaybackStateCompatCustomAction(i24);
            int i28 = RemoteActionCompatParcelizer + 1;
            IconCompatParcelizer = i28 % Fields.SpotShadowColor;
            int i29 = i28 % 2;
        }
        if (gettype.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 < i26) {
            gettype.RemoteActionCompatParcelizer(i26, i24);
        }
        int[] iArr = gettype2.PlaybackStateCompatCustomAction;
        int i30 = gettype2.IconCompatParcelizer;
        int i31 = i30 * 5;
        boolean z2 = z;
        onContentCardClicked.IconCompatParcelizer(gettype.PlaybackStateCompatCustomAction, i31, iArr, iIntValue * 5, i24 * 5);
        Object[] objArr2 = gettype2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i32 = gettype2.MediaDescriptionCompat;
        System.arraycopy(gettype.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, i25, objArr2, i32, i27);
        int i33 = gettype2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        iArr[i31 + 2] = i33;
        int i34 = i30 - iIntValue;
        int i35 = i30 + iMediaMetadataCompat;
        int i36 = gettype2.read(iArr, i30);
        int i37 = gettype2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int i38 = gettype2.ResultReceiver;
        int length = objArr2.length;
        int i39 = RemoteActionCompatParcelizer + 77;
        IconCompatParcelizer = i39 % Fields.SpotShadowColor;
        int i40 = i39 % 2;
        int i41 = i30;
        int i42 = i37;
        while (i41 < i35) {
            int i43 = i35;
            int i44 = IconCompatParcelizer + 5;
            int i45 = iMediaMetadataCompat;
            int i46 = i44 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i46;
            int i47 = i44 % 2;
            if (i41 != i30) {
                int i48 = i46 + 83;
                IconCompatParcelizer = i48 % Fields.SpotShadowColor;
                int i49 = i48 % 2;
                int i50 = (i41 * 5) + 2;
                iArr[i50] = iArr[i50] + i34;
            }
            iArr[(i41 * 5) + 4] = getType.write(gettype2.read(iArr, i41) + (i32 - i36), i42 < i41 ? 0 : gettype2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, i38, length);
            if (i41 == i42) {
                int i51 = IconCompatParcelizer + 69;
                RemoteActionCompatParcelizer = i51 % Fields.SpotShadowColor;
                if (i51 % 2 == 0) {
                    i42++;
                }
            }
            i41++;
            i35 = i43;
            iMediaMetadataCompat = i45;
        }
        int i52 = i35;
        int i53 = iMediaMetadataCompat;
        gettype2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i42;
        int iSerializer = AbstractC0170getTimestamp.serializer(gettype.write, iIntValue, gettype.IconCompatParcelizer());
        int iSerializer2 = AbstractC0170getTimestamp.serializer(gettype.write, i24, gettype.IconCompatParcelizer());
        if (iSerializer < iSerializer2) {
            ArrayList arrayList = gettype.write;
            ArrayList arrayList2 = new ArrayList(iSerializer2 - iSerializer);
            for (int i54 = iSerializer; i54 < iSerializer2; i54++) {
                int i55 = IconCompatParcelizer + 25;
                RemoteActionCompatParcelizer = i55 % Fields.SpotShadowColor;
                int i56 = i55 % 2;
                AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1 = (AndroidContentCaptureManagercurrentSemanticsNodes1) arrayList.get(i54);
                androidContentCaptureManagercurrentSemanticsNodes1.IconCompatParcelizer += i34;
                arrayList2.add(androidContentCaptureManagercurrentSemanticsNodes1);
            }
            gettype2.write.addAll(AbstractC0170getTimestamp.serializer(gettype2.write, gettype2.IconCompatParcelizer, gettype2.IconCompatParcelizer()), arrayList2);
            arrayList.subList(iSerializer, iSerializer2).clear();
            list = arrayList2;
        } else {
            list = instance_delegatelambda0.write;
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            HashMap map = gettype.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            HashMap map2 = gettype2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (map != null && map2 != null) {
                int size = list2.size();
                for (int i57 = 0; i57 < size; i57++) {
                }
            }
        }
        int i58 = gettype2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        gettype2.MediaSessionCompatToken(i33);
        int iSerializer3 = gettype.serializer(gettype.PlaybackStateCompatCustomAction, iIntValue);
        if (zBooleanValue3) {
            if (zBooleanValue) {
                boolean z3 = iSerializer3 >= 0;
                if (z3) {
                    gettype.MediaBrowserCompatMediaItem();
                    gettype.write(iSerializer3 - gettype.IconCompatParcelizer);
                    gettype.MediaBrowserCompatMediaItem();
                }
                gettype.write(iIntValue - gettype.IconCompatParcelizer);
                zWrite = gettype.MediaDescriptionCompat();
                if (z3) {
                    gettype.MediaSessionCompatQueueItem();
                    gettype.write();
                    gettype.MediaSessionCompatQueueItem();
                    gettype.write();
                }
                i7 = i27;
            } else {
                zWrite = gettype.write(iIntValue, i53);
                i7 = i27;
                gettype.write(i25, i7, iIntValue - 1);
            }
            if (zWrite) {
                getCreditCardExpirationDay.read("Unexpectedly removed anchors");
            }
        } else {
            i7 = i27;
            int i59 = IconCompatParcelizer + 57;
            RemoteActionCompatParcelizer = i59 % Fields.SpotShadowColor;
            int i60 = i59 % 2;
        }
        int i61 = gettype2.PlaybackStateCompat;
        int i62 = iArr[i31 + 1];
        if ((1073741824 & i62) != 0) {
            int i63 = RemoteActionCompatParcelizer + 43;
            IconCompatParcelizer = i63 % Fields.SpotShadowColor;
            int i64 = i63 % 2;
            i8 = 1;
        } else {
            i8 = i62 & 67108863;
        }
        gettype2.PlaybackStateCompat = i61 + i8;
        if (zBooleanValue2) {
            gettype2.IconCompatParcelizer = i52;
            gettype2.MediaDescriptionCompat = i32 + i7;
        }
        if (z2) {
            gettype2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(i33);
        }
        return list;
    }

    public abstract int IconCompatParcelizer(String str, byte[] bArr, int i, int i2);

    public abstract String RemoteActionCompatParcelizer(ByteBuffer byteBuffer, int i, int i2);

    public abstract String RemoteActionCompatParcelizer(byte[] bArr, int i, int i2);

    public abstract int read(byte[] bArr, int i, int i2, int i3);

    public static acceptHits MediaSessionCompatResultReceiverWrapper(String str) throws GeneralSecurityException {
        Map mapUnmodifiableMap;
        AtomicReference atomicReference = removeFirst.write;
        synchronized (removeFirst.class) {
            mapUnmodifiableMap = Collections.unmodifiableMap(removeFirst.serializer);
        }
        acceptHits accepthits = (acceptHits) mapUnmodifiableMap.get(str);
        if (accepthits != null) {
            return accepthits;
        }
        throw new GeneralSecurityException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("cannot find key template: ", str));
    }

    public static void MediaSessionCompatToken(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().read(str);
        int i4 = RemoteActionCompatParcelizer + 113;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
    }

    public boolean read(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 77;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (read(bArr, 0, i, i2) == 0) {
            return true;
        }
        int i6 = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public static placeSpaceEvenlyfoundation_layout RemoteActionCompatParcelizer(accessanimateDecay accessanimatedecay, BoxMeasurePolicy boxMeasurePolicy, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 47;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if ((i & 2) != 0) {
            boxMeasurePolicy = BoxMeasurePolicy.Restart;
        }
        placeSpaceEvenlyfoundation_layout placespaceevenlyfoundation_layout = new placeSpaceEvenlyfoundation_layout(accessanimatedecay, boxMeasurePolicy, 0L);
        int i5 = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return placespaceevenlyfoundation_layout;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objArr[0];
        int i = 2 % 2;
        getSpacingD9Ej5fM getspacingd9ej5fm = new getSpacingD9Ej5fM();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getspacingd9ej5fm);
        aspectRatiodefault aspectratiodefault = new aspectRatiodefault(getspacingd9ej5fm);
        int i2 = IconCompatParcelizer + 105;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return aspectratiodefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final LocationComponentPluginImpl getLocationComponent(MapPluginProviderDelegate mapPluginProviderDelegate) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        mapPluginProviderDelegate.getClass();
        MapPlugin plugin = mapPluginProviderDelegate.getPlugin("MAPBOX_LOCATION_COMPONENT_PLUGIN_ID");
        plugin.getClass();
        LocationComponentPluginImpl locationComponentPluginImpl = (LocationComponentPluginImpl) plugin;
        int i4 = IconCompatParcelizer + 29;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return locationComponentPluginImpl;
    }

    /* JADX INFO: renamed from: delay-VtjQ1oo, reason: not valid java name */
    public static final Object m5145delayVtjQ1oo(long j, SuspendLambda suspendLambda) {
        int i = 2 % 2;
        Object objDelay = delay(serializer(j), suspendLambda);
        if (objDelay != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return createFromParcel.INSTANCE;
        }
        int i2 = RemoteActionCompatParcelizer + 101;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 47;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return objDelay;
    }

    public static final isAnimatingClose serializer(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        isAnimatingClose isanimatingclose;
        int i = 2 % 2;
        ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = textAnnouncementContentCardView.get(ShortNewsContentCardViewCompanion.serializer);
        if (shortNewsContentCardViewViewHolder instanceof isAnimatingClose) {
            isanimatingclose = (isAnimatingClose) shortNewsContentCardViewViewHolder;
            int i2 = RemoteActionCompatParcelizer + 13;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            isanimatingclose = null;
        }
        if (isanimatingclose != null) {
            return isanimatingclose;
        }
        int i4 = RemoteActionCompatParcelizer + 23;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return DefaultExecutorKt.write;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        int i = 0;
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        fling flingVar = (fling) objArr[2];
        int iIntValue3 = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        if ((iIntValue3 & 1) != 0) {
            iIntValue = LocationRequest.PRIORITY_INDOOR;
        }
        if ((iIntValue3 & 2) != 0) {
            int i3 = RemoteActionCompatParcelizer;
            int i4 = i3 + 17;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i3 + 115;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue3 & 4) != 0) {
            flingVar = performFling.RemoteActionCompatParcelizer;
        }
        return new requiredWidthInVpY3zN4default(iIntValue, i, flingVar);
    }

    public static width IconCompatParcelizer(float f, float f2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            int i3 = IconCompatParcelizer + 119;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 5 % 3;
            }
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            int i5 = IconCompatParcelizer + 107;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            obj = null;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        return new width(f, f2, obj);
    }

    public static final void write(applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0, String str, String str2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            applydisplaycutoutmarginstocontentarealambda0.getClass();
            str.getClass();
            str2.getClass();
            ArrayList arrayList = applydisplaycutoutmarginstocontentarealambda0.write;
            arrayList.add(str);
            arrayList.add(hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2).toString());
            throw null;
        }
        applydisplaycutoutmarginstocontentarealambda0.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList2 = applydisplaycutoutmarginstocontentarealambda0.write;
        arrayList2.add(str);
        arrayList2.add(hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2).toString());
        int i3 = RemoteActionCompatParcelizer + 109;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static final Application write(Scope scope) throws accessstartTrackingTable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                scope.getClass();
                obj.hashCode();
                throw null;
            }
            scope.getClass();
            Application application = (Application) scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(Application.class), null);
            int i3 = IconCompatParcelizer + 123;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return application;
        } catch (Exception unused) {
            throw new accessstartTrackingTable("Can't resolve Application instance. Please use androidContext() function in your KoinApplication configuration.", 11);
        }
    }

    public static final List RemoteActionCompatParcelizer(List list) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            list.size();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int size = list.size();
        if (size == 0) {
            instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
            int i3 = IconCompatParcelizer + 51;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return instance_delegatelambda0Var;
        }
        if (size != 1) {
            return Collections.unmodifiableList(new ArrayList(list));
        }
        List listSingletonList = Collections.singletonList(onContentCardDismissed.read(list));
        int i5 = RemoteActionCompatParcelizer + 93;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return listSingletonList;
    }

    public static FocusTransactionsKt write(String str, accessgetAlwayscp accessgetalwayscp, forward4l5_RBY forward4l5_rby, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 57;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        Object obj = null;
        if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            accessgetalwayscp = null;
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = forward4l5_rby;
        if ((i & 4) != 0) {
            int i5 = i3 + 119;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                getNeverLCbbffg getneverlcbbffg = getNeverLCbbffg.IconCompatParcelizer;
                int i6 = IconCompatParcelizer + 9;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm = getneverlcbbffg;
            } else {
                getNeverLCbbffg getneverlcbbffg2 = getNeverLCbbffg.IconCompatParcelizer;
                obj.hashCode();
                throw null;
            }
        }
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return new FocusTransactionsKt(str, accessgetalwayscp, r8lambdaunavo3sxub_pc9xroryotnrlvsm, YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer.plus(UrlUtils.serializer())));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public static final long serializer(long j) {
        boolean z;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
            if (j > 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            unregisterInAppMessageManager unregisterinappmessagemanager2 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
            if (j > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            int i3 = IconCompatParcelizer + 89;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            long jWrite = BrazeInAppMessageManagerExternalSyntheticLambda2.write(BrazeInAppMessageManagerExternalSyntheticLambda2.read(j, UriKt.IconCompatParcelizer(999999L, setUnregisteredInAppMessage.NANOSECONDS)));
            int i5 = IconCompatParcelizer + 107;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return jWrite;
        }
        if (!z) {
            return 0L;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        int i7 = IconCompatParcelizer + 87;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return 0L;
        }
        throw null;
    }

    public static final Map write(Map map) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            map.size();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int size = map.size();
        if (size == 0) {
            SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
            int i3 = RemoteActionCompatParcelizer + 35;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return simpleItemTouchHelperCallback;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) onContentCardDismissed.IconCompatParcelizer((Iterable) map.entrySet());
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        int i5 = RemoteActionCompatParcelizer + 81;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return mapSingletonMap;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        boolean z;
        StringBuilder sb = (StringBuilder) objArr[0];
        Object obj = objArr[1];
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objArr[2];
        int i = 2 % 2;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            sb.append((CharSequence) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj));
            return null;
        }
        if (obj == null) {
            int i2 = RemoteActionCompatParcelizer + 123;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = obj instanceof CharSequence;
            int i4 = RemoteActionCompatParcelizer + 67;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        if (!(!z)) {
            sb.append((CharSequence) obj);
            return null;
        }
        if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
            return null;
        }
        sb.append((CharSequence) obj.toString());
        return null;
    }

    public static final Object delay(long j, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0 ? j > 0 : j > 0) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
            cancellableContinuationImpl.read();
            if (j < Long.MAX_VALUE) {
                int i3 = RemoteActionCompatParcelizer + 31;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                serializer(cancellableContinuationImpl.MediaBrowserCompatMediaItem).serializer(j, cancellableContinuationImpl);
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return result;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r4 < 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r3 = o.throwIllegalArgumentExceptionForNullCheck.write("%s (%s) must not be greater than size (%s)", r5, java.lang.Integer.valueOf(r3), java.lang.Integer.valueOf(r4));
        r4 = kotlinx.coroutines.DelayKt.RemoteActionCompatParcelizer + 63;
        kotlinx.coroutines.DelayKt.IconCompatParcelizer = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if ((r4 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r4 = 77 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(bo.app.c8$$ExternalSyntheticOutline0.m(r4, "negative size: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3 < 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3 < 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        return o.throwIllegalArgumentExceptionForNullCheck.write("%s (%s) must not be negative", r5, java.lang.Integer.valueOf(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String write(int r3, int r4, java.lang.String r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlinx.coroutines.DelayKt.RemoteActionCompatParcelizer
            int r1 = r1 + 65
            int r2 = r1 % 128
            kotlinx.coroutines.DelayKt.IconCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L15
            r1 = 79
            int r1 = r1 / 0
            if (r3 >= 0) goto L26
            goto L17
        L15:
            if (r3 >= 0) goto L26
        L17:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r3}
            java.lang.String r4 = "%s (%s) must not be negative"
            java.lang.String r3 = o.throwIllegalArgumentExceptionForNullCheck.write(r4, r3)
            return r3
        L26:
            if (r4 < 0) goto L4a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r3, r4}
            java.lang.String r4 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r3 = o.throwIllegalArgumentExceptionForNullCheck.write(r4, r3)
            int r4 = kotlinx.coroutines.DelayKt.RemoteActionCompatParcelizer
            int r4 = r4 + 63
            int r5 = r4 % 128
            kotlinx.coroutines.DelayKt.IconCompatParcelizer = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L49
            r4 = 77
            int r4 = r4 / 0
        L49:
            return r3
        L4a:
            java.lang.String r3 = "negative size: "
            java.lang.String r3 = bo.app.c8$$ExternalSyntheticOutline0.m(r4, r3)
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r3)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.DelayKt.write(int, int, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code duplicated, block: B:9:0x0019 A[DONT_INVERT] */
    public static void write(int i, int i2, int i3) {
        int i4;
        String strWrite;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer;
        int i7 = i6 + 57;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 36 / 0;
            if (i >= 0) {
                if (i2 >= i) {
                    if (i2 > i3) {
                        return;
                    }
                    i4 = i6 + 113;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        int i9 = 5 % 2;
                    }
                }
            }
        } else if (i >= 0) {
            if (i2 >= i) {
                if (i2 > i3) {
                    return;
                }
                i4 = i6 + 113;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i10 = 5 % 2;
                }
            }
        }
        if (i < 0 || i > i3) {
            strWrite = write(i, i3, "start index");
        } else if (i2 >= 0) {
            int i11 = i6 + 5;
            int i12 = i11 % Fields.SpotShadowColor;
            IconCompatParcelizer = i12;
            int i13 = i11 % 2;
            if (i2 > i3) {
                int i14 = i12 + 75;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                strWrite = write(i2, i3, "end index");
                int i16 = RemoteActionCompatParcelizer + 41;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
            } else {
                strWrite = throwIllegalArgumentExceptionForNullCheck.write("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
        } else {
            strWrite = write(i2, i3, "end index");
            int i18 = RemoteActionCompatParcelizer + 41;
            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
        }
        throw new IndexOutOfBoundsException(strWrite);
    }

    public static void read(int i, int i2) {
        String strWrite;
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 11;
        int i5 = i4 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i5;
        int i6 = i4 % 2;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strWrite = throwIllegalArgumentExceptionForNullCheck.write("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 >= 0) {
                strWrite = throwIllegalArgumentExceptionForNullCheck.write("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                int i7 = i5 + 31;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i2, "negative size: "));
                    int i8 = 78 / 0;
                    return;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i2, "negative size: "));
                    return;
                }
            }
            throw new IndexOutOfBoundsException(strWrite);
        }
    }

    public static List r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(String str) {
        List list;
        int i = 2 % 2;
        str.getClass();
        try {
            r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = getModulateAlphake2Ky5w.serializer;
            r8lambda3kmch7yklpui_5smgazrgczhglc.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(new setWasCloseMessageCalled(onIsEnabledRead.Companion.serializer(), 0));
            list = (List) r8lambda3kmch7yklpui_5smgazrgczhglc.serializer(str, setgraphicmodalmaxwidthdp);
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.write(new Throwable(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                         |Error in deserializing the JSON data in type converter\n                         |json value = " + str + "\n                        "), e));
            list = null;
        }
        if (list == null) {
            int i2 = IconCompatParcelizer + 47;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            list = instance_delegatelambda0.write;
            int i4 = RemoteActionCompatParcelizer + 109;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 4 % 2;
            }
        }
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final CoroutineSingletons awaitCancellation(ContinuationImpl continuationImpl) {
        getViewAccessibilityFlagMap getviewaccessibilityflagmap;
        int i = 2 % 2;
        Object obj = null;
        if (!(!(continuationImpl instanceof getViewAccessibilityFlagMap))) {
            int i2 = RemoteActionCompatParcelizer + 53;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((getViewAccessibilityFlagMap) continuationImpl).IconCompatParcelizer;
                throw null;
            }
            getviewaccessibilityflagmap = (getViewAccessibilityFlagMap) continuationImpl;
            int i4 = getviewaccessibilityflagmap.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                getviewaccessibilityflagmap.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                getviewaccessibilityflagmap = new getViewAccessibilityFlagMap(continuationImpl);
            }
        } else {
            getviewaccessibilityflagmap = new getViewAccessibilityFlagMap(continuationImpl);
        }
        Object obj2 = getviewaccessibilityflagmap.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getviewaccessibilityflagmap.IconCompatParcelizer;
        if (i5 != 0) {
            int i6 = IconCompatParcelizer + 85;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            getviewaccessibilityflagmap.IconCompatParcelizer = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(getviewaccessibilityflagmap));
            cancellableContinuationImpl.read();
            if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                int i8 = RemoteActionCompatParcelizer + 19;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return coroutineSingletons;
                }
                obj.hashCode();
                throw null;
            }
        }
        DrawableTransformation.read();
        return null;
    }

    public static final FlowUtil$createFlow$$inlined$map$1 RemoteActionCompatParcelizer(RoomDatabase roomDatabase, boolean z, String[] strArr, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        SignInDataStore$get$$inlined$map$1 signInDataStore$get$$inlined$map$1IconCompatParcelizer;
        int i = 2 % 2;
        roomDatabase.getClass();
        InvalidationTracker invalidationTracker = roomDatabase.getInvalidationTracker();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        invalidationTracker.getClass();
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = invalidationTracker.write;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0Serializer = triggerBasedInvalidationTracker.serializer(strArr2);
        String[] strArr3 = (String[]) onviewattachedtowindowlambda0Serializer.serializer;
        int[] iArr = (int[]) onviewattachedtowindowlambda0Serializer.write;
        strArr3.getClass();
        iArr.getClass();
        Flow flowIconCompatParcelizer = FlowKt.read(new PausingDispatcherKt$whenStateAtLeast$2(triggerBasedInvalidationTracker, iArr, strArr3, (ShortNewsContentCardView) null, 4));
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = invalidationTracker.RemoteActionCompatParcelizer;
        if (multiInstanceInvalidationClient != null) {
            signInDataStore$get$$inlined$map$1IconCompatParcelizer = multiInstanceInvalidationClient.IconCompatParcelizer(strArr3);
            int i2 = IconCompatParcelizer + 85;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 / 2;
            }
        } else {
            signInDataStore$get$$inlined$map$1IconCompatParcelizer = null;
        }
        if (signInDataStore$get$$inlined$map$1IconCompatParcelizer != null) {
            int i4 = IconCompatParcelizer + 33;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            flowIconCompatParcelizer = FlowKt.IconCompatParcelizer(flowIconCompatParcelizer, signInDataStore$get$$inlined$map$1IconCompatParcelizer);
            int i6 = RemoteActionCompatParcelizer + 87;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return new FlowUtil$createFlow$$inlined$map$1(FlowKt.IconCompatParcelizer(flowIconCompatParcelizer, -1), roomDatabase, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public static final WorkManagerImpl RemoteActionCompatParcelizer(Context context, graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault) {
        int i = 2 % 2;
        context.getClass();
        accessgetStrokecp accessgetstrokecp = new accessgetStrokecp(graphicslayerpanq8wgdefault.MediaBrowserCompatMediaItem);
        accessgetGpucp accessgetgpucp = WorkDatabase.RemoteActionCompatParcelizer;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        getDifferencertfAjoo getdifferencertfajoo = accessgetstrokecp.RemoteActionCompatParcelizer;
        getdifferencertfajoo.getClass();
        getClipannotations getclipannotations = graphicslayerpanq8wgdefault.IconCompatParcelizer;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        accessgetgpucp.getClass();
        WorkDatabase workDatabaseWrite = accessgetGpucp.write(applicationContext, getdifferencertfajoo, getclipannotations, z);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        getEmptyInterval getemptyinterval = new getEmptyInterval(applicationContext2, accessgetstrokecp);
        getDefaultShadowColor getdefaultshadowcolor = new getDefaultShadowColor(context.getApplicationContext(), graphicslayerpanq8wgdefault, accessgetstrokecp, workDatabaseWrite);
        WorkManagerImpl workManagerImpl = new WorkManagerImpl(context.getApplicationContext(), graphicslayerpanq8wgdefault, accessgetstrokecp, workDatabaseWrite, (List) decodeToImageBitmap.RemoteActionCompatParcelizer.read(context, graphicslayerpanq8wgdefault, accessgetstrokecp, workDatabaseWrite, getemptyinterval, getdefaultshadowcolor), getdefaultshadowcolor, getemptyinterval);
        int i2 = IconCompatParcelizer + 51;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return workManagerImpl;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r2 >= r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r4 = r6.charAt(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if ('!' > r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r4 >= 127) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r1 = new java.lang.StringBuilder("Unexpected char 0x");
        kotlin.TuplesKt.RemoteActionCompatParcelizer(16);
        r3 = java.lang.Integer.toString(r4, 16);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r3.length() >= 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        r3 = "0".concat(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        r1.append(r3);
        r1.append(" at ");
        r1.append(r2);
        r1.append(" in header name: ");
        r1.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        throw new java.lang.IllegalArgumentException(r1.toString().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("name is empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r6.length() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r6.length() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r1 = kotlinx.coroutines.DelayKt.IconCompatParcelizer + 33;
        kotlinx.coroutines.DelayKt.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
        r1 = r6.length();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(java.lang.String r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlinx.coroutines.DelayKt.RemoteActionCompatParcelizer
            int r1 = r1 + 103
            int r2 = r1 % 128
            kotlinx.coroutines.DelayKt.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1b
            r6.getClass()
            int r1 = r6.length()
            r3 = 1
            int r3 = r3 / r2
            if (r1 <= 0) goto L82
            goto L24
        L1b:
            r6.getClass()
            int r1 = r6.length()
            if (r1 <= 0) goto L82
        L24:
            int r1 = kotlinx.coroutines.DelayKt.IconCompatParcelizer
            r3 = 33
            int r1 = r1 + r3
            int r4 = r1 % 128
            kotlinx.coroutines.DelayKt.RemoteActionCompatParcelizer = r4
            int r1 = r1 % r0
            int r1 = r6.length()
        L32:
            if (r2 >= r1) goto L81
            char r4 = r6.charAt(r2)
            if (r3 > r4) goto L41
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 >= r5) goto L41
            int r2 = r2 + 1
            goto L32
        L41:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected char 0x"
            r1.<init>(r3)
            r3 = 16
            kotlin.TuplesKt.RemoteActionCompatParcelizer(r3)
            java.lang.String r3 = java.lang.Integer.toString(r4, r3)
            r3.getClass()
            int r4 = r3.length()
            if (r4 >= r0) goto L60
            java.lang.String r0 = "0"
            java.lang.String r3 = r0.concat(r3)
        L60:
            r1.append(r3)
            java.lang.String r0 = " at "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " in header name: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
        L81:
            return
        L82:
            java.lang.String r6 = "name is empty"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.DelayKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(java.lang.String):void");
    }

    public static final void serializer(String str, String str2) {
        String strConcat;
        int i = 2 % 2;
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = IconCompatParcelizer + 113;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t') {
                if (' ' <= cCharAt) {
                    int i5 = IconCompatParcelizer + 41;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        if (cCharAt < '3') {
                        }
                    } else if (cCharAt < 127) {
                    }
                }
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                TuplesKt.RemoteActionCompatParcelizer(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i2);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                if (InAppMessageHtmlBaseViewCompanion.read(str2)) {
                    strConcat = "";
                } else {
                    strConcat = ": ".concat(str);
                    int i6 = RemoteActionCompatParcelizer + 123;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
                sb.append(strConcat);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static String serializer(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        int i3 = 2 % 2;
        if ((((byteBuffer.limit() - i) - i2) | i | i2) < 0) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
            int i4 = IconCompatParcelizer + 69;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i5 = RemoteActionCompatParcelizer + 75;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i + i2;
        char[] cArr = new char[i2];
        int i8 = 0;
        while (i < i7) {
            int i9 = IconCompatParcelizer + 43;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            byte b = byteBuffer.get(i);
            if (!updateOutline.read(b)) {
                break;
            }
            i++;
            updateOutline.serializer(b, cArr, i8);
            i8++;
        }
        int i11 = i8;
        while (i < i7) {
            int i12 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (updateOutline.read(b2)) {
                updateOutline.serializer(b2, cArr, i11);
                i11++;
                i = i12;
                while (i < i7) {
                    byte b3 = byteBuffer.get(i);
                    if (!updateOutline.read(b3)) {
                        int i13 = RemoteActionCompatParcelizer + 95;
                        IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        break;
                    }
                    i++;
                    updateOutline.serializer(b3, cArr, i11);
                    i11++;
                }
            } else if (updateOutline.IconCompatParcelizer(b2)) {
                if (i12 >= i7) {
                    throw InvalidProtocolBufferException.IconCompatParcelizer();
                }
                i += 2;
                updateOutline.IconCompatParcelizer(b2, byteBuffer.get(i12), cArr, i11);
                i11++;
            } else if (updateOutline.RemoteActionCompatParcelizer(b2)) {
                if (i12 >= i7 - 1) {
                    throw InvalidProtocolBufferException.IconCompatParcelizer();
                }
                updateOutline.serializer(b2, byteBuffer.get(i12), byteBuffer.get(i + 2), cArr, i11);
                i11++;
                i += 3;
            } else {
                if (i12 >= i7 - 2) {
                    throw InvalidProtocolBufferException.IconCompatParcelizer();
                }
                int i15 = IconCompatParcelizer + 41;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                updateOutline.RemoteActionCompatParcelizer(b2, byteBuffer.get(i12), byteBuffer.get(i + 2), byteBuffer.get(i + 3), cArr, i11);
                i11 += 2;
                i += 4;
            }
        }
        return new String(cArr, 0, i11);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x030e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x030e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x022d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0259  */
    /* JADX WARN: Code duplicated, block: B:65:0x027b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0286  */
    /* JADX WARN: Code duplicated, block: B:70:0x0291  */
    /* JADX WARN: Code duplicated, block: B:72:0x0295  */
    /* JADX WARN: Code duplicated, block: B:77:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:79:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:82:0x02e0  */
    public static r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc serializer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int iIconCompatParcelizer;
        int i;
        int i2;
        String strIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
        isverticalswipeinalloweddirection.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        onTouch ontouch = new onTouch();
        SwipeDismissTouchListener1 swipeDismissTouchListener1 = isverticalswipeinalloweddirection.IconCompatParcelizer;
        ontouch.MediaSessionCompatQueueItem = swipeDismissTouchListener1.MediaSessionCompatQueueItem;
        ontouch.RatingCompat = swipeDismissTouchListener1.RatingCompat;
        ontouch.MediaDescriptionCompat = swipeDismissTouchListener1.MediaDescriptionCompat;
        ontouch.MediaMetadataCompat = swipeDismissTouchListener1.MediaMetadataCompat;
        ontouch.MediaBrowserCompatMediaItem = swipeDismissTouchListener1.MediaBrowserCompatMediaItem;
        String str = swipeDismissTouchListener1.MediaSessionCompatResultReceiverWrapper;
        ontouch.PlaybackStateCompatCustomAction = str;
        ontouch.serializer = swipeDismissTouchListener1.RemoteActionCompatParcelizer;
        ontouch.RemoteActionCompatParcelizer = swipeDismissTouchListener1.write;
        ontouch.write = swipeDismissTouchListener1.read;
        ontouch.MediaSessionCompatToken = swipeDismissTouchListener1.ParcelableVolumeInfo;
        ontouch.IconCompatParcelizer = swipeDismissTouchListener1.serializer;
        ontouch.read = swipeDismissTouchListener1.IconCompatParcelizer;
        ontouch.PlaybackStateCompat = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(ontouch);
        if (ontouch.MediaBrowserCompatMediaItem) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "    "}, getCieXyz.write())).booleanValue()) {
                for (int i5 = 0; i5 < str.length(); i5++) {
                    char cCharAt = str.charAt(i5);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r') {
                        if (cCharAt != '\n') {
                            DrawableTransformation.serializer((Object) "Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str));
                            return null;
                        }
                        int i6 = IconCompatParcelizer + 101;
                        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                    }
                }
            }
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "    "}, getCieXyz.write())).booleanValue()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Indent should not be specified when default printing mode is used");
                return null;
            }
        }
        SwipeDismissTouchListener1 swipeDismissTouchListener2 = new SwipeDismissTouchListener1(ontouch.MediaSessionCompatQueueItem, ontouch.MediaDescriptionCompat, ontouch.MediaMetadataCompat, ontouch.MediaBrowserCompatMediaItem, ontouch.RatingCompat, ontouch.PlaybackStateCompatCustomAction, ontouch.serializer, ontouch.RemoteActionCompatParcelizer, ontouch.MediaSessionCompatToken, ontouch.IconCompatParcelizer, ontouch.read, ontouch.write);
        prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = ontouch.PlaybackStateCompat;
        prepareinappmessagewithzippedassethtml.getClass();
        r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = new r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc(swipeDismissTouchListener2, prepareinappmessagewithzippedassethtml);
        if (!prepareinappmessagewithzippedassethtml.equals(prepareInAppMessageWithZippedAssetHtmllambda2.serializer)) {
            boolean z = swipeDismissTouchListener2.read != lambdaperformDismiss0.NONE;
            for (Map.Entry entry : prepareinappmessagewithzippedassethtml.read.entrySet()) {
                int i8 = RemoteActionCompatParcelizer + 29;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations = (getUnregisteredInAppMessageannotations) entry.getKey();
                prepareInAppMessageWithZippedAssetHtmllambda0 prepareinappmessagewithzippedassethtmllambda0 = (prepareInAppMessageWithZippedAssetHtmllambda0) entry.getValue();
                if (prepareinappmessagewithzippedassethtmllambda0 instanceof prepareInAppMessageWithHtmllambda0) {
                    getunregisteredinappmessageannotations.getClass();
                } else {
                    if (!(prepareinappmessagewithzippedassethtmllambda0 instanceof prepareInAppMessageWithZippedAssetHtmllambda1)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    getunregisteredinappmessageannotations.getClass();
                }
            }
            for (Map.Entry entry2 : prepareinappmessagewithzippedassethtml.MediaDescriptionCompat.entrySet()) {
                getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations2 = (getUnregisteredInAppMessageannotations) entry2.getKey();
                int i10 = IconCompatParcelizer + 27;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                    int i12 = RemoteActionCompatParcelizer + 105;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations3 = (getUnregisteredInAppMessageannotations) entry3.getKey();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) entry3.getValue();
                    getunregisteredinappmessageannotations2.getClass();
                    getunregisteredinappmessageannotations3.getClass();
                    setgraphicmodalmaxwidthdp.getClass();
                    r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = setgraphicmodalmaxwidthdp.getDescriptor();
                    RegexKt regexKtRemoteActionCompatParcelizer = descriptor.RemoteActionCompatParcelizer();
                    if (!(regexKtRemoteActionCompatParcelizer instanceof createInAppMessageViewlambda0)) {
                        int i14 = RemoteActionCompatParcelizer + 121;
                        IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                        if (i14 % 2 == 0) {
                            int i15 = 93 / 0;
                            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, createInAppMessageViewlambda10.write}, getCieXyz.write())).booleanValue())) {
                            }
                            if (z) {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.serializer}, getCieXyz.write())).booleanValue()) {
                                        i3 = IconCompatParcelizer + 41;
                                        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                                        if (i3 % 2 != 0) {
                                            int i16 = 85 / 0;
                                            if (!(regexKtRemoteActionCompatParcelizer instanceof DefaultInAppMessageModalViewFactory)) {
                                                if (regexKtRemoteActionCompatParcelizer instanceof r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw) {
                                                }
                                            }
                                        } else if (!(regexKtRemoteActionCompatParcelizer instanceof DefaultInAppMessageModalViewFactory)) {
                                            if (regexKtRemoteActionCompatParcelizer instanceof r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw) {
                                            }
                                        }
                                    }
                                }
                                DrawableTransformation.RemoteActionCompatParcelizer("Serializer for ", ((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) getunregisteredinappmessageannotations3).IconCompatParcelizer(), " of kind ", regexKtRemoteActionCompatParcelizer, " cannot be serialized polymorphically with class discriminator.");
                                return null;
                            }
                            if (z) {
                                iIconCompatParcelizer = descriptor.IconCompatParcelizer();
                                for (i = 0; i < iIconCompatParcelizer; i++) {
                                    i2 = RemoteActionCompatParcelizer + 115;
                                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                                    if (i2 % 2 == 0) {
                                        strIconCompatParcelizer = descriptor.IconCompatParcelizer(i);
                                        int i17 = 90 / 0;
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strIconCompatParcelizer, swipeDismissTouchListener2.write}, getCieXyz.write())).booleanValue()) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Polymorphic serializer for ", getunregisteredinappmessageannotations3, " has property '", strIconCompatParcelizer, "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                                            return null;
                                        }
                                    } else {
                                        strIconCompatParcelizer = descriptor.IconCompatParcelizer(i);
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strIconCompatParcelizer, swipeDismissTouchListener2.write}, getCieXyz.write())).booleanValue()) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Polymorphic serializer for ", getunregisteredinappmessageannotations3, " has property '", strIconCompatParcelizer, "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                                            return null;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, createInAppMessageViewlambda10.write}, getCieXyz.write())).booleanValue()) {
                            }
                            if (z) {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.serializer}, getCieXyz.write())).booleanValue()) {
                                        i3 = IconCompatParcelizer + 41;
                                        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                                        if (i3 % 2 != 0) {
                                            int i18 = 85 / 0;
                                            if (!(regexKtRemoteActionCompatParcelizer instanceof DefaultInAppMessageModalViewFactory)) {
                                                if (regexKtRemoteActionCompatParcelizer instanceof r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw) {
                                                }
                                            }
                                        } else if (!(regexKtRemoteActionCompatParcelizer instanceof DefaultInAppMessageModalViewFactory)) {
                                            if (regexKtRemoteActionCompatParcelizer instanceof r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw) {
                                            }
                                        }
                                    }
                                }
                                DrawableTransformation.RemoteActionCompatParcelizer("Serializer for ", ((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) getunregisteredinappmessageannotations3).IconCompatParcelizer(), " of kind ", regexKtRemoteActionCompatParcelizer, " cannot be serialized polymorphically with class discriminator.");
                                return null;
                            }
                            if (z) {
                                iIconCompatParcelizer = descriptor.IconCompatParcelizer();
                                while (i < iIconCompatParcelizer) {
                                    i2 = RemoteActionCompatParcelizer + 115;
                                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                                    if (i2 % 2 == 0) {
                                        strIconCompatParcelizer = descriptor.IconCompatParcelizer(i);
                                        int i19 = 90 / 0;
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strIconCompatParcelizer, swipeDismissTouchListener2.write}, getCieXyz.write())).booleanValue()) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Polymorphic serializer for ", getunregisteredinappmessageannotations3, " has property '", strIconCompatParcelizer, "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                                            return null;
                                        }
                                    } else {
                                        strIconCompatParcelizer = descriptor.IconCompatParcelizer(i);
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strIconCompatParcelizer, swipeDismissTouchListener2.write}, getCieXyz.write())).booleanValue()) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Polymorphic serializer for ", getunregisteredinappmessageannotations3, " has property '", strIconCompatParcelizer, "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                                            return null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    DrawableTransformation.RemoteActionCompatParcelizer("Serializer for ", ((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) getunregisteredinappmessageannotations3).IconCompatParcelizer(), " can't be registered as a subclass for polymorphic serialization because its kind ", regexKtRemoteActionCompatParcelizer, " is not concrete. To work with multiple hierarchies, register it as a base class.");
                    return null;
                }
            }
            for (Map.Entry entry4 : prepareinappmessagewithzippedassethtml.write.entrySet()) {
                getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations4 = (getUnregisteredInAppMessageannotations) entry4.getKey();
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) entry4.getValue();
                getunregisteredinappmessageannotations4.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
                pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{1, r8lambdaunavo3sxub_pc9xroryotnrlvsm2}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -722072991, 722072991, BehaviorSubject.BehaviorDisposable.write());
            }
            for (Map.Entry entry5 : prepareinappmessagewithzippedassethtml.serializer.entrySet()) {
                getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations5 = (getUnregisteredInAppMessageannotations) entry5.getKey();
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) entry5.getValue();
                getunregisteredinappmessageannotations5.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm3.getClass();
                pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{1, r8lambdaunavo3sxub_pc9xroryotnrlvsm3}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -722072991, 722072991, BehaviorSubject.BehaviorDisposable.write());
            }
        }
        return r8lambda3kmch7yklpui_5smgazrgczhglc;
    }

    public static requiredWidthInVpY3zN4default serializer(int i, int i2, fling flingVar, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), flingVar, Integer.valueOf(i3)};
        int iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        return (requiredWidthInVpY3zN4default) write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite, objArr);
    }

    public static FlowLayoutBuildingBlocksWrapInfo serializer() {
        int iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        int iWrite2 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        int iWrite3 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        return (FlowLayoutBuildingBlocksWrapInfo) write(-61142219, iWrite2, 61142223, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite3, iWrite, new Object[0]);
    }

    public static List write(getType gettype, int i, getType gettype2, boolean z, boolean z2, boolean z3) {
        Object[] objArr = {gettype, Integer.valueOf(i), gettype2, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)};
        int iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        return (List) write(-1035231986, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), 1035231987, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite, objArr);
    }

    public static final aspectRatiodefault read(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        int iWrite2 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        int iWrite3 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        return (aspectRatiodefault) write(-1328669373, iWrite2, 1328669375, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite3, iWrite, new Object[]{r8lambdaunavo3sxub_pc9xroryotnrlvsm});
    }

    public static void write(StringBuilder sb, Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        int iWrite2 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        int iWrite3 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        write(-1980350160, iWrite2, 1980350160, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite3, iWrite, new Object[]{sb, obj, r8lambdaunavo3sxub_pc9xroryotnrlvsm});
    }
}
