package com.roadrunner.customerchat.selfservice.domain.usecase;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl;
import com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.LinkAnnotationUrl;
import o.TextUnitType;
import o.getIntrinsics;
import o.getParagraphInfoListui_text;
import o.onItemDismiss;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class GetChatAssetDownloadConfig {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final SelfServiceCustomerChatRepositoryImpl read;
    public final TextUnitType serializer;

    public GetChatAssetDownloadConfig(TextUnitType textUnitType, SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl) {
        textUnitType.getClass();
        selfServiceCustomerChatRepositoryImpl.getClass();
        this.serializer = textUnitType;
        this.read = selfServiceCustomerChatRepositoryImpl;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r1
  0x001f: PHI (r1v5 o.TextUnitType) = (r1v4 o.TextUnitType), (r1v19 o.TextUnitType) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object invoke(ContinuationImpl continuationImpl) {
        TextUnitType textUnitType;
        getIntrinsics getintrinsics;
        int i;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        String strMediaBrowserCompatMediaItem;
        String strRemoteActionCompatParcelizer;
        Object objM4889fetchHelpCenterRegionIoAF18A;
        String str;
        Object obj2;
        Throwable thSerializer;
        LinkAnnotationUrl linkAnnotationUrl;
        String str2;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 107;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            textUnitType = this.serializer;
            if (continuationImpl instanceof getIntrinsics) {
                getintrinsics = (getIntrinsics) continuationImpl;
                i = getintrinsics.write;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i6 = RemoteActionCompatParcelizer + 83;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    getintrinsics.write = i - Integer.MIN_VALUE;
                }
            }
            obj = getintrinsics.serializer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = getintrinsics.write;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                strMediaBrowserCompatMediaItem = ((ChatDeliveryRepositoryImpl) textUnitType).MediaBrowserCompatMediaItem();
                strRemoteActionCompatParcelizer = ((ChatDeliveryRepositoryImpl) textUnitType).RemoteActionCompatParcelizer();
                getintrinsics.IconCompatParcelizer = strMediaBrowserCompatMediaItem;
                getintrinsics.RemoteActionCompatParcelizer = strRemoteActionCompatParcelizer;
                getintrinsics.write = 1;
                objM4889fetchHelpCenterRegionIoAF18A = this.read.m4889fetchHelpCenterRegionIoAF18A(getintrinsics);
                if (objM4889fetchHelpCenterRegionIoAF18A == coroutineSingletons) {
                    int i8 = RemoteActionCompatParcelizer + 91;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return coroutineSingletons;
                }
                str = strMediaBrowserCompatMediaItem;
                obj2 = objM4889fetchHelpCenterRegionIoAF18A;
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i10 = RemoteActionCompatParcelizer + 125;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                strRemoteActionCompatParcelizer = getintrinsics.RemoteActionCompatParcelizer;
                str = getintrinsics.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
                i3 = RemoteActionCompatParcelizer + 11;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i12 = 3 / 3;
                }
            }
            thSerializer = onItemDismiss.serializer(obj2);
            if (thSerializer != null) {
                if (thSerializer instanceof CancellationException) {
                    throw thSerializer;
                }
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "Failed to fetch HelpCenter region while downloading chat assets", new Object[0]);
                obj2 = null;
            }
            linkAnnotationUrl = (LinkAnnotationUrl) obj2;
            if (linkAnnotationUrl == null) {
                return null;
            }
            str2 = linkAnnotationUrl.read();
            if (str2 != null) {
                return new getParagraphInfoListui_text(str, strRemoteActionCompatParcelizer, linkAnnotationUrl.IconCompatParcelizer(), str2);
            }
            Timber.RemoteActionCompatParcelizer.write(new Exception("Brand does not exist while downloading chat assets."));
            return null;
        }
        textUnitType = this.serializer;
        int i13 = 18 / 0;
        if (continuationImpl instanceof getIntrinsics) {
            getintrinsics = (getIntrinsics) continuationImpl;
            i = getintrinsics.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                int i14 = RemoteActionCompatParcelizer + 83;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getintrinsics.write = i - Integer.MIN_VALUE;
            }
        }
        obj = getintrinsics.serializer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = getintrinsics.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                strMediaBrowserCompatMediaItem = ((ChatDeliveryRepositoryImpl) textUnitType).MediaBrowserCompatMediaItem();
                try {
                    strRemoteActionCompatParcelizer = ((ChatDeliveryRepositoryImpl) textUnitType).RemoteActionCompatParcelizer();
                    getintrinsics.IconCompatParcelizer = strMediaBrowserCompatMediaItem;
                    getintrinsics.RemoteActionCompatParcelizer = strRemoteActionCompatParcelizer;
                    getintrinsics.write = 1;
                    objM4889fetchHelpCenterRegionIoAF18A = this.read.m4889fetchHelpCenterRegionIoAF18A(getintrinsics);
                    if (objM4889fetchHelpCenterRegionIoAF18A == coroutineSingletons) {
                        int i16 = RemoteActionCompatParcelizer + 91;
                        IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                        return coroutineSingletons;
                    }
                    str = strMediaBrowserCompatMediaItem;
                    obj2 = objM4889fetchHelpCenterRegionIoAF18A;
                } catch (IllegalArgumentException e) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Environment value is missing while downloading chat assets.", new Object[0]);
                    return null;
                }
            } catch (IllegalArgumentException e2) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Entity id value is missing while downloading chat assets.", new Object[0]);
                return null;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i18 = RemoteActionCompatParcelizer + 125;
            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            strRemoteActionCompatParcelizer = getintrinsics.RemoteActionCompatParcelizer;
            str = getintrinsics.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
            i3 = RemoteActionCompatParcelizer + 11;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i110 = 3 / 3;
            }
        }
        thSerializer = onItemDismiss.serializer(obj2);
        if (thSerializer != null) {
            if (thSerializer instanceof CancellationException) {
                throw thSerializer;
            }
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "Failed to fetch HelpCenter region while downloading chat assets", new Object[0]);
            obj2 = null;
        }
        linkAnnotationUrl = (LinkAnnotationUrl) obj2;
        if (linkAnnotationUrl == null) {
            return null;
        }
        str2 = linkAnnotationUrl.read();
        if (str2 != null) {
            return new getParagraphInfoListui_text(str, strRemoteActionCompatParcelizer, linkAnnotationUrl.IconCompatParcelizer(), str2);
        }
        Timber.RemoteActionCompatParcelizer.write(new Exception("Brand does not exist while downloading chat assets."));
        return null;
        getintrinsics = new getIntrinsics(this, continuationImpl);
        obj = getintrinsics.serializer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = getintrinsics.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            strMediaBrowserCompatMediaItem = ((ChatDeliveryRepositoryImpl) textUnitType).MediaBrowserCompatMediaItem();
            strRemoteActionCompatParcelizer = ((ChatDeliveryRepositoryImpl) textUnitType).RemoteActionCompatParcelizer();
            getintrinsics.IconCompatParcelizer = strMediaBrowserCompatMediaItem;
            getintrinsics.RemoteActionCompatParcelizer = strRemoteActionCompatParcelizer;
            getintrinsics.write = 1;
            objM4889fetchHelpCenterRegionIoAF18A = this.read.m4889fetchHelpCenterRegionIoAF18A(getintrinsics);
            if (objM4889fetchHelpCenterRegionIoAF18A == coroutineSingletons) {
                int i111 = RemoteActionCompatParcelizer + 91;
                IconCompatParcelizer = i111 % Fields.SpotShadowColor;
                int i112 = i111 % 2;
                return coroutineSingletons;
            }
            str = strMediaBrowserCompatMediaItem;
            obj2 = objM4889fetchHelpCenterRegionIoAF18A;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i113 = RemoteActionCompatParcelizer + 125;
            IconCompatParcelizer = i113 % Fields.SpotShadowColor;
            int i114 = i113 % 2;
            strRemoteActionCompatParcelizer = getintrinsics.RemoteActionCompatParcelizer;
            str = getintrinsics.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
            i3 = RemoteActionCompatParcelizer + 11;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i115 = 3 / 3;
            }
        }
        thSerializer = onItemDismiss.serializer(obj2);
        if (thSerializer != null) {
            if (thSerializer instanceof CancellationException) {
                throw thSerializer;
            }
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "Failed to fetch HelpCenter region while downloading chat assets", new Object[0]);
            obj2 = null;
        }
        linkAnnotationUrl = (LinkAnnotationUrl) obj2;
        if (linkAnnotationUrl == null) {
            return null;
        }
        str2 = linkAnnotationUrl.read();
        if (str2 != null) {
            return new getParagraphInfoListui_text(str, strRemoteActionCompatParcelizer, linkAnnotationUrl.IconCompatParcelizer(), str2);
        }
        Timber.RemoteActionCompatParcelizer.write(new Exception("Brand does not exist while downloading chat assets."));
        return null;
    }
}
