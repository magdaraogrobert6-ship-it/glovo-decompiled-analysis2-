package com.roadrunner.customerchat.legacy.chatlist.analytics;

import androidx.compose.ui.graphics.Fields;
import androidx.transition.TransitionValuesMaps;
import coil3.ExtrasKt;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.internal.route.parsing.models.nn.ContinuousAlternativesParsingSuccessfulResult;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.roadrunner.customerchat.selfservice.data.cache.WebChatNativeCacheDataStore;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.LayerSnapshotV21;
import o.LayerSnapshot_androidKt;
import o.Paragraph_EkL_Ydefault;
import o.ShortNewsContentCardView;
import o.SurfaceUtils;
import o.accessanalyzeComponents58bKbWc;
import o.accessgetChildrenp;
import o.backwardFocusSearch;
import o.copyElsmlbkdefault;
import o.copyNH1kkwUdefault;
import o.copyxPh5V4gdefault;
import o.createFromParcel;
import o.decode;
import o.getContentViewGroupParentLayout;
import o.getDefaultDrawBlock;
import o.getHasNonTranslationComponents;
import o.getScreenOffsetnOccac;
import o.isInvalidated;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.safeSetClipToOutline;
import o.setInvalidated;
import o.setOutlineO0kMr_c;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatLogger$log$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int read;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChatLogger$log$2(Object obj, Object obj2, long j, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
        this.serializer = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatLogger$log$2(long j, String str, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = 4;
        this.write = str;
        this.serializer = j;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            ((ChatLogger$log$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            int i3 = MediaSessionCompatQueueItem + 29;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return createfromparcel;
        }
        if (i2 == 1) {
            return ((ChatLogger$log$2) create((accessgetChildrenp) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        if (i2 == 2) {
            Object objInvokeSuspend = ((ChatLogger$log$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            int i5 = read + 109;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }
        if (i2 == 3) {
            ((ChatLogger$log$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((ChatLogger$log$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        int i7 = MediaSessionCompatQueueItem + 33;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.write;
        if (i2 == 0) {
            return new ChatLogger$log$2((getHasNonTranslationComponents) this.IconCompatParcelizer, (isInvalidated) obj2, this.serializer, shortNewsContentCardView, 0);
        }
        if (i2 == 1) {
            return new ChatLogger$log$2((String) this.IconCompatParcelizer, (LayerSnapshotV21) obj2, this.serializer, shortNewsContentCardView, 1);
        }
        if (i2 == 2) {
            ChatLogger$log$2 chatLogger$log$2 = new ChatLogger$log$2((TransitionValuesMaps) this.IconCompatParcelizer, (ArrayList) obj2, this.serializer, shortNewsContentCardView, 2);
            int i3 = read + 49;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return chatLogger$log$2;
        }
        if (i2 == 3) {
            return new ChatLogger$log$2((getHasNonTranslationComponents) this.IconCompatParcelizer, (Paragraph_EkL_Ydefault) obj2, this.serializer, shortNewsContentCardView, 3);
        }
        ChatLogger$log$2 chatLogger$log$3 = new ChatLogger$log$2(this.serializer, (String) obj2, shortNewsContentCardView);
        chatLogger$log$3.IconCompatParcelizer = obj;
        int i5 = read + 67;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return chatLogger$log$3;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0162 A[PHI: r2
  0x0162: PHI (r2v16 java.lang.String) = (r2v15 java.lang.String), (r2v17 java.lang.String) binds: [B:62:0x015f, B:59:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0165  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        LayerSnapshot_androidKt layerSnapshot_androidKt;
        String str6;
        String str7;
        SurfaceUtils surfaceUtils;
        Object isitemdismissable;
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        long j = this.serializer;
        Object obj2 = this.write;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getHasNonTranslationComponents gethasnontranslationcomponents = (getHasNonTranslationComponents) this.IconCompatParcelizer;
            decode decodeVar = gethasnontranslationcomponents.RemoteActionCompatParcelizer;
            isInvalidated isinvalidated = (isInvalidated) obj2;
            String strRemoteActionCompatParcelizer = isinvalidated.RemoteActionCompatParcelizer();
            safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
            safesetcliptooutline.putAll(gethasnontranslationcomponents.IconCompatParcelizer.write());
            if (isinvalidated instanceof setOutlineO0kMr_c) {
                getScreenOffsetnOccac getscreenoffsetnoccac = gethasnontranslationcomponents.MediaSessionCompatQueueItem;
                String str8 = ((setOutlineO0kMr_c) isinvalidated).write;
                getscreenoffsetnoccac.getClass();
                str8.getClass();
                List listRemoteActionCompatParcelizer = ((accessanalyzeComponents58bKbWc) getscreenoffsetnoccac.write).RemoteActionCompatParcelizer();
                String str9 = (String) onContentCardDismissed.read(getscreenoffsetnoccac.read.RemoteActionCompatParcelizer(listRemoteActionCompatParcelizer).indexOf(str8), listRemoteActionCompatParcelizer);
                safesetcliptooutline.put("quick_reply", str9 != null ? str9 : "");
            } else if (!(!(isinvalidated instanceof getDefaultDrawBlock))) {
                safesetcliptooutline.put("translation_status", String.valueOf(((getDefaultDrawBlock) isinvalidated).read));
            } else if (isinvalidated instanceof setInvalidated) {
                gethasnontranslationcomponents.write(safesetcliptooutline);
                safesetcliptooutline.put("is_chat_preloaded", String.valueOf(((setInvalidated) isinvalidated).serializer));
            }
            safesetcliptooutline.put("delivery_id", String.valueOf(j));
            decodeVar.logEvent(strRemoteActionCompatParcelizer, safesetcliptooutline.IconCompatParcelizer());
            return createfromparcel;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                try {
                    isitemdismissable = TransitionValuesMaps.access$parse((TransitionValuesMaps) this.IconCompatParcelizer, (ArrayList) obj2, j);
                } catch (Throwable th) {
                    isitemdismissable = new isItemDismissable(th);
                }
                Throwable thSerializer = onItemDismiss.serializer(isitemdismissable);
                if (thSerializer != null && LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                    LoggerProviderKt.logE("Alternative route parsing failed: " + thSerializer.getMessage(), null);
                }
                if (!(isitemdismissable instanceof isItemDismissable)) {
                    isitemdismissable = new ContinuousAlternativesParsingSuccessfulResult((List) isitemdismissable);
                }
                return new onItemDismiss(isitemdismissable);
            }
            if (i2 != 3) {
                backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch.write(WebChatNativeCacheDataStore.IconCompatParcelizer, (String) obj2);
                backwardfocussearch.write(WebChatNativeCacheDataStore.RemoteActionCompatParcelizer, new Long(j));
                return createfromparcel;
            }
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getHasNonTranslationComponents gethasnontranslationcomponents2 = (getHasNonTranslationComponents) this.IconCompatParcelizer;
            decode decodeVar2 = gethasnontranslationcomponents2.RemoteActionCompatParcelizer;
            Paragraph_EkL_Ydefault paragraph_EkL_Ydefault = (Paragraph_EkL_Ydefault) obj2;
            String str10 = paragraph_EkL_Ydefault.read();
            safeSetClipToOutline safesetcliptooutline2 = new safeSetClipToOutline();
            safesetcliptooutline2.putAll(gethasnontranslationcomponents2.IconCompatParcelizer.write());
            if (paragraph_EkL_Ydefault instanceof copyNH1kkwUdefault) {
                getScreenOffsetnOccac getscreenoffsetnoccac2 = gethasnontranslationcomponents2.MediaSessionCompatQueueItem;
                String str11 = ((copyNH1kkwUdefault) paragraph_EkL_Ydefault).RemoteActionCompatParcelizer;
                getscreenoffsetnoccac2.getClass();
                str11.getClass();
                List listRemoteActionCompatParcelizer2 = ((accessanalyzeComponents58bKbWc) getscreenoffsetnoccac2.write).RemoteActionCompatParcelizer();
                String str12 = (String) onContentCardDismissed.read(getscreenoffsetnoccac2.read.RemoteActionCompatParcelizer(listRemoteActionCompatParcelizer2).indexOf(str11), listRemoteActionCompatParcelizer2);
                safesetcliptooutline2.put("quick_reply", str12 != null ? str12 : "");
            } else if (paragraph_EkL_Ydefault instanceof copyxPh5V4gdefault) {
                safesetcliptooutline2.put("translation_status", String.valueOf(((copyxPh5V4gdefault) paragraph_EkL_Ydefault).write));
            } else if (paragraph_EkL_Ydefault instanceof copyElsmlbkdefault) {
                gethasnontranslationcomponents2.write(safesetcliptooutline2);
                safesetcliptooutline2.put("is_chat_preloaded", String.valueOf(((copyElsmlbkdefault) paragraph_EkL_Ydefault).IconCompatParcelizer));
            }
            safesetcliptooutline2.put("delivery_id", String.valueOf(j));
            decodeVar2.logEvent(str10, safesetcliptooutline2.IconCompatParcelizer());
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        String str13 = (String) this.IconCompatParcelizer;
        LayerSnapshotV21 layerSnapshotV21 = (LayerSnapshotV21) obj2;
        if (layerSnapshotV21 == null || (surfaceUtils = layerSnapshotV21.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) == null) {
            str = "";
        } else {
            int i3 = MediaSessionCompatQueueItem + 115;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            String str14 = surfaceUtils.dhAuthToken;
            if (str14 == null) {
                str = "";
            } else {
                str = str14;
            }
        }
        if (layerSnapshotV21 == null) {
            str2 = "";
        } else {
            String strRemoteActionCompatParcelizer2 = layerSnapshotV21.RemoteActionCompatParcelizer();
            if (strRemoteActionCompatParcelizer2 == null) {
                int i5 = MediaSessionCompatQueueItem + 35;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                str2 = "";
            } else {
                str2 = strRemoteActionCompatParcelizer2;
            }
        }
        if (layerSnapshotV21 != null) {
            int i7 = MediaSessionCompatQueueItem + 15;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                str7 = layerSnapshotV21.RatingCompat;
                int i8 = 99 / 0;
                if (str7 == null) {
                    str3 = "";
                } else {
                    str3 = str7;
                }
            } else {
                str7 = layerSnapshotV21.RatingCompat;
                if (str7 == null) {
                    str3 = "";
                } else {
                    str3 = str7;
                }
            }
        } else {
            str3 = "";
        }
        String str15 = (layerSnapshotV21 == null || (str6 = layerSnapshotV21.ParcelableVolumeInfo) == null) ? "" : str6;
        if (layerSnapshotV21 == null || (layerSnapshot_androidKt = layerSnapshotV21.write) == null) {
            str4 = "";
        } else {
            String str16 = layerSnapshot_androidKt.country;
            if (str16 == null) {
                int i9 = read + 13;
                MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    int i10 = 2 / 2;
                }
                str4 = "";
            } else {
                str4 = str16;
            }
        }
        return new accessgetChildrenp(str13, str, str2, str3, str15, str4, this.serializer, (layerSnapshotV21 == null || (str5 = layerSnapshotV21.MediaMetadataCompat) == null) ? "" : str5);
    }
}
