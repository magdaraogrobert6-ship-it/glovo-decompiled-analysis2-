package com.roadrunner.customerchat.selfservice.data.remote;

import androidx.compose.ui.graphics.Fields;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.selfservice.data.cache.ChatIdCacheHelper;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger$logScreen$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AnnotatedStringExhaustiveAnnotation;
import o.LinkAnnotationUrl;
import o.PreviewBlackScreenQuirk;
import o.accessisSetgyyYBs;
import o.addUrlAnnotation;
import o.collectRangeTransitions;
import o.endDocument;
import o.endElement;
import o.getCieXyz;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaOVpCj1XGg7qPbIdHqXDx49YcM1E;
import o.removeNodeAtDepth;
import o.removeScheduledCallback;
import o.requireIndexInRange;

/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterRemoteDataSourceImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final ChatIdCacheHelper IconCompatParcelizer;
    public final addUrlAnnotation MediaMetadataCompat;
    public final endElement MediaSessionCompatQueueItem;
    public final endDocument RatingCompat;
    public final AnnotatedStringExhaustiveAnnotation RemoteActionCompatParcelizer;
    public final isOpenInternalroom_runtime read;
    public final accessisSetgyyYBs serializer;
    public final requireIndexInRange write;

    public HelpCenterRemoteDataSourceImpl(isOpenInternalroom_runtime isopeninternalroom_runtime, endDocument enddocument, endElement endelement, AnnotatedStringExhaustiveAnnotation annotatedStringExhaustiveAnnotation, addUrlAnnotation addurlannotation, ChatIdCacheHelper chatIdCacheHelper, requireIndexInRange requireindexinrange, accessisSetgyyYBs accessissetgyyybs) {
        isopeninternalroom_runtime.getClass();
        enddocument.getClass();
        endelement.getClass();
        annotatedStringExhaustiveAnnotation.getClass();
        addurlannotation.getClass();
        chatIdCacheHelper.getClass();
        requireindexinrange.getClass();
        accessissetgyyybs.getClass();
        this.read = isopeninternalroom_runtime;
        this.RatingCompat = enddocument;
        this.MediaSessionCompatQueueItem = endelement;
        this.RemoteActionCompatParcelizer = annotatedStringExhaustiveAnnotation;
        this.MediaMetadataCompat = addurlannotation;
        this.IconCompatParcelizer = chatIdCacheHelper;
        this.write = requireindexinrange;
        this.serializer = accessissetgyyybs;
    }

    public final collectRangeTransitions serializer() {
        int i = 2 % 2;
        if (!this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer()) {
            collectRangeTransitions collectrangetransitions = collectRangeTransitions.PRODUCTION;
            int i2 = MediaBrowserCompatMediaItem + 71;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return collectrangetransitions;
        }
        int i4 = MediaBrowserCompatMediaItem + 35;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return collectRangeTransitions.STAGING;
        }
        collectRangeTransitions collectrangetransitions2 = collectRangeTransitions.STAGING;
        throw null;
    }

    public final Object write(ContinuationImpl continuationImpl) {
        ArrayList arrayList;
        Object next;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 15;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.write();
        removeScheduledCallback removescheduledcallbackSerializer = this.serializer.serializer();
        if (PreviewBlackScreenQuirk.IconCompatParcelizer(removescheduledcallbackSerializer) && (arrayList = this.MediaMetadataCompat.serializer) != null) {
            int i4 = MediaBrowserCompatMediaItem + 83;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Iterator it = arrayList.iterator();
            int i6 = MediaDescriptionCompat + 103;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((LinkAnnotationUrl) next).RemoteActionCompatParcelizer(), strWrite}, getCieXyz.write())).booleanValue());
            LinkAnnotationUrl linkAnnotationUrl = (LinkAnnotationUrl) next;
            if (linkAnnotationUrl != null) {
                return linkAnnotationUrl;
            }
        }
        collectRangeTransitions collectrangetransitionsSerializer = serializer();
        ((inCompatibilityMode) this.read).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new NavHostKt$NavHost$29$1(collectrangetransitionsSerializer, this, removescheduledcallbackSerializer, strWrite, null, 18), continuationImpl);
        int i8 = MediaBrowserCompatMediaItem + 39;
        MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return objWithContext;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010f, code lost:
    
        if (r1 == r3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendMessage(java.lang.String r21, java.lang.String r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl.sendMessage(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031 A[PHI: r3 r5
  0x0031: PHI (r3v21 o.r8lambdaOVpCj1XGg7qPbIdHqXDx49YcM1E) = (r3v20 o.r8lambdaOVpCj1XGg7qPbIdHqXDx49YcM1E), (r3v23 o.r8lambdaOVpCj1XGg7qPbIdHqXDx49YcM1E) binds: [B:10:0x002f, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r5v12 int) = (r5v11 int), (r5v14 int) binds: [B:10:0x002f, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:45:0x012a A[RETURN] */
    public final Object getChatId(String str, ContinuationImpl continuationImpl) {
        r8lambdaOVpCj1XGg7qPbIdHqXDx49YcM1E r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e;
        collectRangeTransitions collectrangetransitionsSerializer;
        String strWrite;
        removeScheduledCallback removescheduledcallbackSerializer;
        collectRangeTransitions collectrangetransitions;
        String language;
        Object objWrite;
        removeScheduledCallback removescheduledcallback;
        String str2;
        collectRangeTransitions collectrangetransitions2;
        String str3;
        String str4;
        Object objWithContext;
        int i;
        String str5 = str;
        int i2 = 2 % 2;
        if (!(continuationImpl instanceof r8lambdaOVpCj1XGg7qPbIdHqXDx49YcM1E)) {
            r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e = new r8lambdaOVpCj1XGg7qPbIdHqXDx49YcM1E(this, continuationImpl);
        } else {
            int i3 = MediaBrowserCompatMediaItem + 81;
            MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e = (r8lambdaOVpCj1XGg7qPbIdHqXDx49YcM1E) continuationImpl;
                i = r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e.MediaSessionCompatQueueItem;
                int i4 = 97 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e.MediaSessionCompatQueueItem = i - Integer.MIN_VALUE;
                } else {
                    r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e = new r8lambdaOVpCj1XGg7qPbIdHqXDx49YcM1E(this, continuationImpl);
                }
            } else {
                r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e = (r8lambdaOVpCj1XGg7qPbIdHqXDx49YcM1E) continuationImpl;
                i = r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e.MediaSessionCompatQueueItem;
                if ((i & Integer.MIN_VALUE) != 0) {
                    r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e.MediaSessionCompatQueueItem = i - Integer.MIN_VALUE;
                } else {
                    r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e = new r8lambdaOVpCj1XGg7qPbIdHqXDx49YcM1E(this, continuationImpl);
                }
            }
        }
        r8lambdaOVpCj1XGg7qPbIdHqXDx49YcM1E r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2 = r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e;
        int i5 = MediaBrowserCompatMediaItem + 7;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        Object obj = r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.MediaMetadataCompat;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.MediaSessionCompatQueueItem;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            collectrangetransitionsSerializer = serializer();
            strWrite = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.write();
            removescheduledcallbackSerializer = this.serializer.serializer();
            if (PreviewBlackScreenQuirk.IconCompatParcelizer(removescheduledcallbackSerializer)) {
                r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.read = str5;
                r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.IconCompatParcelizer = collectrangetransitionsSerializer;
                r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.RemoteActionCompatParcelizer = strWrite;
                r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.write = removescheduledcallbackSerializer;
                r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.MediaSessionCompatQueueItem = 1;
                Object obj3 = this.IconCompatParcelizer.get(str5, r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2);
                if (obj3 != obj2) {
                    collectrangetransitions = collectrangetransitionsSerializer;
                    obj = obj3;
                }
            } else {
                language = Locale.forLanguageTag(this.write.read()).getLanguage();
                language.getClass();
                r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.read = str5;
                r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.IconCompatParcelizer = collectrangetransitionsSerializer;
                r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.RemoteActionCompatParcelizer = strWrite;
                r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.write = removescheduledcallbackSerializer;
                r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.serializer = language;
                r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.MediaSessionCompatQueueItem = 2;
                objWrite = write(r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2);
                if (objWrite == obj2) {
                    int i8 = MediaDescriptionCompat + 59;
                    MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                } else {
                    removescheduledcallback = removescheduledcallbackSerializer;
                    str2 = language;
                    collectrangetransitions2 = collectrangetransitionsSerializer;
                    obj = objWrite;
                    str3 = strWrite;
                    str4 = str5;
                    ((inCompatibilityMode) this.read).getClass();
                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
                    DeliveryAcceptanceLogger$logScreen$1 deliveryAcceptanceLogger$logScreen$1 = new DeliveryAcceptanceLogger$logScreen$1(collectrangetransitions2, (LinkAnnotationUrl) obj, str4, str2, this, str3, removescheduledcallback, null);
                    r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.read = null;
                    r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.IconCompatParcelizer = null;
                    r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.RemoteActionCompatParcelizer = null;
                    r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.write = null;
                    r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.serializer = null;
                    r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.MediaSessionCompatQueueItem = 3;
                    objWithContext = BuildersKt.withContext(defaultIoScheduler, deliveryAcceptanceLogger$logScreen$1, r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2);
                    if (objWithContext == obj2) {
                        return objWithContext;
                    }
                }
            }
            return obj2;
        }
        if (i7 != 1) {
            int i10 = MediaDescriptionCompat + 63;
            MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0 ? i7 != 2 : i7 != 2) {
                if (i7 == 3) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str6 = r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.serializer;
            removeScheduledCallback removescheduledcallback2 = r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.write;
            String str7 = r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.RemoteActionCompatParcelizer;
            collectrangetransitions2 = r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.IconCompatParcelizer;
            String str8 = r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            removescheduledcallback = removescheduledcallback2;
            str3 = str7;
            str4 = str8;
            str2 = str6;
        } else {
            removeScheduledCallback removescheduledcallback3 = r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.write;
            strWrite = r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.RemoteActionCompatParcelizer;
            collectrangetransitions = r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.IconCompatParcelizer;
            String str9 = r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            removescheduledcallbackSerializer = removescheduledcallback3;
            str5 = str9;
        }
        ((inCompatibilityMode) this.read).getClass();
        DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        DefaultIoScheduler defaultIoScheduler2 = DefaultIoScheduler.RemoteActionCompatParcelizer;
        DeliveryAcceptanceLogger$logScreen$1 deliveryAcceptanceLogger$logScreen$2 = new DeliveryAcceptanceLogger$logScreen$1(collectrangetransitions2, (LinkAnnotationUrl) obj, str4, str2, this, str3, removescheduledcallback, null);
        r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.read = null;
        r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.IconCompatParcelizer = null;
        r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.RemoteActionCompatParcelizer = null;
        r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.write = null;
        r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.serializer = null;
        r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.MediaSessionCompatQueueItem = 3;
        objWithContext = BuildersKt.withContext(defaultIoScheduler2, deliveryAcceptanceLogger$logScreen$2, r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2);
        if (objWithContext == obj2) {
            return obj2;
        }
        return objWithContext;
        String str10 = (String) obj;
        if (str10 != null) {
            return str10;
        }
        collectrangetransitionsSerializer = collectrangetransitions;
        language = Locale.forLanguageTag(this.write.read()).getLanguage();
        language.getClass();
        r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.read = str5;
        r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.IconCompatParcelizer = collectrangetransitionsSerializer;
        r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.RemoteActionCompatParcelizer = strWrite;
        r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.write = removescheduledcallbackSerializer;
        r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.serializer = language;
        r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.MediaSessionCompatQueueItem = 2;
        objWrite = write(r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2);
        if (objWrite == obj2) {
            int i11 = MediaDescriptionCompat + 59;
            MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        } else {
            removescheduledcallback = removescheduledcallbackSerializer;
            str2 = language;
            collectrangetransitions2 = collectrangetransitionsSerializer;
            obj = objWrite;
            str3 = strWrite;
            str4 = str5;
            ((inCompatibilityMode) this.read).getClass();
            DefaultScheduler defaultScheduler3 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler3 = DefaultIoScheduler.RemoteActionCompatParcelizer;
            DeliveryAcceptanceLogger$logScreen$1 deliveryAcceptanceLogger$logScreen$3 = new DeliveryAcceptanceLogger$logScreen$1(collectrangetransitions2, (LinkAnnotationUrl) obj, str4, str2, this, str3, removescheduledcallback, null);
            r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.read = null;
            r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.IconCompatParcelizer = null;
            r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.RemoteActionCompatParcelizer = null;
            r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.write = null;
            r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.serializer = null;
            r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2.MediaSessionCompatQueueItem = 3;
            objWithContext = BuildersKt.withContext(defaultIoScheduler3, deliveryAcceptanceLogger$logScreen$3, r8lambdaovpcj1xgg7qpbidhqxdx49ycm1e2);
            if (objWithContext == obj2) {
                return objWithContext;
            }
        }
        return obj2;
    }
}
