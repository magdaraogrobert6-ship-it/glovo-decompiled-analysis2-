package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import bo.app.a7$$ExternalSyntheticLambda3;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class opN5in7k0 {
    public static final /* synthetic */ int write = 0;
    public CharSequence MediaBrowserCompatMediaItem;
    public relativeQuadraticTo MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final accessprocessDragStart RemoteActionCompatParcelizer;
    public final r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg serializer;

    static {
        new LinkedHashMap();
    }

    public final Map RemoteActionCompatParcelizer() {
        return onMove.serializer((LinkedHashMap) this.serializer.IconCompatParcelizer);
    }

    public int hashCode() {
        r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg = this.serializer;
        int i = r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.RemoteActionCompatParcelizer;
        String str = (String) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.read;
        int iHashCode = (i * 31) + (str != null ? str.hashCode() : 0);
        for (getFillTypeRgk1Os getfilltypergk1os : r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.MediaSessionCompatQueueItem) {
            String str2 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = getfilltypergk1os.MediaDescriptionCompat;
            int iHashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = getfilltypergk1os.ParcelableVolumeInfo;
            iHashCode = (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
        }
        accessprocessDragStart accessprocessdragstart = this.RemoteActionCompatParcelizer;
        accessprocessdragstart.getClass();
        for (int i2 = 0; i2 < accessprocessdragstart.write(); i2++) {
            addOval addoval = (addOval) accessprocessdragstart.read(i2);
            int i3 = addoval.serializer;
            transform58bKbWc transform58bkbwc = addoval.write;
            iHashCode = (((iHashCode * 31) + i3) * 31) + (transform58bkbwc != null ? transform58bkbwc.hashCode() : 0);
            Bundle bundle = addoval.RemoteActionCompatParcelizer;
            if (bundle != null) {
                iHashCode = evaluateFeaturefwf_client_release.RemoteActionCompatParcelizer(bundle) + (iHashCode * 31);
            }
        }
        for (String str5 : RemoteActionCompatParcelizer().keySet()) {
            int iM = af$$ExternalSyntheticOutline0.m(iHashCode * 31, 31, str5);
            Object obj = RemoteActionCompatParcelizer().get(str5);
            iHashCode = iM + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Bundle serializer(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.serializer.IconCompatParcelizer;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            addArcRad addarcrad = (addArcRad) entry.getValue();
            addarcrad.getClass();
            str.getClass();
            if (addarcrad.serializer && (obj = addarcrad.read) != null) {
                addarcrad.write.read(str, bundle2, obj);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                addArcRad addarcrad2 = (addArcRad) entry2.getValue();
                addarcrad2.getClass();
                asAndroidPathEffect asandroidpatheffect = addarcrad2.write;
                str2.getClass();
                if (addarcrad2.IconCompatParcelizer || !bundle2.containsKey(str2) || !getCyan0d7_KjU.RemoteActionCompatParcelizer(bundle2, str2)) {
                    try {
                        asandroidpatheffect.serializer(bundle2, str2);
                    } catch (IllegalStateException unused) {
                    }
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.read(c8$$ExternalSyntheticOutline0.m("Wrong argument type for '", str2, "' in argument savedState. "), asandroidpatheffect.serializer(), " expected.");
                return null;
            }
        }
        return bundle2;
    }

    public final addOval serializer() {
        accessprocessDragStart accessprocessdragstart = this.RemoteActionCompatParcelizer;
        addOval addoval = accessprocessdragstart.write() == 0 ? null : (addOval) isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, com.logistics.rider.glovo.R.id.show_order_details);
        if (addoval != null) {
            return addoval;
        }
        relativeQuadraticTo relativequadraticto = this.MediaDescriptionCompat;
        if (relativequadraticto != null) {
            return relativequadraticto.serializer();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg = this.serializer;
        String str = (String) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.serializer;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.RemoteActionCompatParcelizer));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = (String) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.read;
        if (str2 != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
            sb.append(" route=");
            sb.append((String) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.read);
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            sb.append(" label=");
            sb.append(this.MediaBrowserCompatMediaItem);
        }
        return sb.toString();
    }

    public opN5in7k0(toAndroidPathDashPathEffectStyleoQv6xUo toandroidpathdashpatheffectstyleoqv6xuo) {
        toandroidpathdashpatheffectstyleoqv6xuo.getClass();
        LinkedHashMap linkedHashMap = AndroidPathIterator.write;
        this.MediaMetadataCompat = getTolerance.write(toandroidpathdashpatheffectstyleoqv6xuo.getClass());
        this.serializer = new r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg(this);
        this.RemoteActionCompatParcelizer = new accessprocessDragStart(0);
    }

    public final void RemoteActionCompatParcelizer(int i, addOval addoval) {
        addoval.getClass();
        if (!(this instanceof setNativeStrokeWidth)) {
            if (i != 0) {
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i, addoval);
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot have an action with actionId 0");
                return;
            }
        }
        throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public void RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
        String strValueOf;
        context.getClass();
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, getPath.Navigator);
        typedArrayObtainAttributes.getClass();
        serializer(typedArrayObtainAttributes.getString(2));
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg = this.serializer;
            r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.RemoteActionCompatParcelizer = resourceId;
            r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.serializer = null;
            int i = r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.RemoteActionCompatParcelizer;
            if (i <= 16777215) {
                strValueOf = String.valueOf(i);
            } else {
                try {
                    strValueOf = context.getResources().getResourceName(i);
                    strValueOf.getClass();
                } catch (Resources.NotFoundException unused) {
                    strValueOf = String.valueOf(i);
                }
            }
            r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.serializer = strValueOf;
        }
        this.MediaBrowserCompatMediaItem = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    public final void write(getFillTypeRgk1Os getfilltypergk1os) {
        getfilltypergk1os.getClass();
        r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg = this.serializer;
        r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.getClass();
        ArrayList arrayListRemoteActionCompatParcelizer = close.RemoteActionCompatParcelizer((LinkedHashMap) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.IconCompatParcelizer, new toComposeTileMode(getfilltypergk1os, 0));
        if (arrayListRemoteActionCompatParcelizer.isEmpty()) {
            r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.MediaSessionCompatQueueItem.add(getfilltypergk1os);
        } else {
            seekAnimationsanimation_core.serializer("Deep link ", getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, " can't be used to open destination ", (opN5in7k0) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.write, ".\nFollowing required arguments are missing: ", arrayListRemoteActionCompatParcelizer);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x005c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x018d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0190  */
    /* JADX WARN: Code duplicated, block: B:70:0x0192  */
    /* JADX WARN: Code duplicated, block: B:72:0x0195  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x020d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0213  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0214 A[SYNTHETIC] */
    public relativeCubicTo RemoteActionCompatParcelizer(androidx.navigation.NavArgsLazy navArgsLazy) {
        Bundle bundleRemoteActionCompatParcelizer;
        int iSerializer;
        boolean z;
        int i;
        relativeCubicTo relativecubicto;
        Bundle bundle;
        getInAppMessageEventMap getinappmessageeventmap;
        getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessageIconCompatParcelizer;
        List list;
        getInAppMessageEventMap getinappmessageeventmap2;
        r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg = this.serializer;
        LinkedHashMap linkedHashMap = (LinkedHashMap) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.IconCompatParcelizer;
        String str = (String) navArgsLazy.RatingCompat;
        Object obj = (String) navArgsLazy.read;
        Uri uri = (Uri) navArgsLazy.MediaSessionCompatQueueItem;
        ArrayList<getFillTypeRgk1Os> arrayList = r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.MediaSessionCompatQueueItem;
        Bundle bundle2 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        relativeCubicTo relativecubicto2 = null;
        for (getFillTypeRgk1Os getfilltypergk1os : arrayList) {
            getfilltypergk1os.getClass();
            isAdapterPositionOnScreen isadapterpositiononscreen = getfilltypergk1os.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            isAdapterPositionOnScreen isadapterpositiononscreen2 = getfilltypergk1os.ComponentActivity;
            String str2 = getfilltypergk1os.ParcelableVolumeInfo;
            String str3 = getfilltypergk1os.MediaDescriptionCompat;
            if (((getInAppMessageEventMap) isadapterpositiononscreen2.MediaSessionCompatResultReceiverWrapper()) != null) {
                if (uri != null) {
                    getInAppMessageEventMap getinappmessageeventmap3 = (getInAppMessageEventMap) isadapterpositiononscreen2.MediaSessionCompatResultReceiverWrapper();
                    getinappmessageeventmap3.getClass();
                    if (getinappmessageeventmap3.read(uri.toString())) {
                        if (str3 != null || (obj != null && str3.equals(obj))) {
                            if (str2 != null) {
                                if (uri != null) {
                                    bundleRemoteActionCompatParcelizer = getfilltypergk1os.RemoteActionCompatParcelizer(uri, linkedHashMap);
                                } else {
                                    bundleRemoteActionCompatParcelizer = bundle2;
                                }
                                iSerializer = getfilltypergk1os.serializer(uri);
                                if (obj == null) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (str != null) {
                                    i = -1;
                                } else {
                                    i = -1;
                                }
                                if (bundleRemoteActionCompatParcelizer != null) {
                                    relativecubicto = new relativeCubicTo((opN5in7k0) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.write, bundleRemoteActionCompatParcelizer, getfilltypergk1os.PlaybackStateCompat, iSerializer, z, i);
                                    if (relativecubicto2 != null) {
                                        relativecubicto2 = relativecubicto;
                                    } else {
                                        relativecubicto2 = relativecubicto;
                                    }
                                } else if (!z) {
                                    linkedHashMap.getClass();
                                    bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                                    if (uri != null) {
                                        getfilltypergk1os.read(getiscurrentlydisplayinginappmessageIconCompatParcelizer, bundle, linkedHashMap);
                                        if (((Boolean) getfilltypergk1os.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                                            getfilltypergk1os.read(uri, bundle, linkedHashMap);
                                        }
                                    }
                                    if (close.RemoteActionCompatParcelizer(linkedHashMap, new isConvex(bundle, 1)).isEmpty()) {
                                        relativecubicto = new relativeCubicTo((opN5in7k0) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.write, bundleRemoteActionCompatParcelizer, getfilltypergk1os.PlaybackStateCompat, iSerializer, z, i);
                                        if (relativecubicto2 != null) {
                                            relativecubicto2 = relativecubicto;
                                        } else {
                                            relativecubicto2 = relativecubicto;
                                        }
                                    }
                                } else {
                                    linkedHashMap.getClass();
                                    bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                                    if (uri != null) {
                                        getfilltypergk1os.read(getiscurrentlydisplayinginappmessageIconCompatParcelizer, bundle, linkedHashMap);
                                        if (((Boolean) getfilltypergk1os.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                                            getfilltypergk1os.read(uri, bundle, linkedHashMap);
                                        }
                                    }
                                    if (close.RemoteActionCompatParcelizer(linkedHashMap, new isConvex(bundle, 1)).isEmpty()) {
                                        relativecubicto = new relativeCubicTo((opN5in7k0) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.write, bundleRemoteActionCompatParcelizer, getfilltypergk1os.PlaybackStateCompat, iSerializer, z, i);
                                        if (relativecubicto2 != null) {
                                            relativecubicto2 = relativecubicto;
                                        } else {
                                            relativecubicto2 = relativecubicto;
                                        }
                                    }
                                }
                            } else if (str == null) {
                                getinappmessageeventmap2 = (getInAppMessageEventMap) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                                getinappmessageeventmap2.getClass();
                                if (getinappmessageeventmap2.read(str)) {
                                    if (uri != null) {
                                        bundleRemoteActionCompatParcelizer = getfilltypergk1os.RemoteActionCompatParcelizer(uri, linkedHashMap);
                                    } else {
                                        bundleRemoteActionCompatParcelizer = bundle2;
                                    }
                                    iSerializer = getfilltypergk1os.serializer(uri);
                                    if (obj == null && obj.equals(str3)) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (str != null || str2 == null) {
                                        i = -1;
                                    } else {
                                        getInAppMessageEventMap getinappmessageeventmap4 = (getInAppMessageEventMap) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                                        getinappmessageeventmap4.getClass();
                                        if (getinappmessageeventmap4.read(str)) {
                                            List listWrite = new getInAppMessageEventMap("/").write(0, (CharSequence) str2);
                                            boolean zIsEmpty = listWrite.isEmpty();
                                            List list2 = instance_delegatelambda0.write;
                                            if (zIsEmpty) {
                                                list = list2;
                                                break;
                                            }
                                            ListIterator listIterator = listWrite.listIterator(listWrite.size());
                                            while (true) {
                                                if (!listIterator.hasPrevious()) {
                                                    list = list2;
                                                    break;
                                                }
                                                if (((String) listIterator.previous()).length() != 0) {
                                                    list = onContentCardDismissed.read(listWrite, listIterator.nextIndex() + 1);
                                                    break;
                                                }
                                            }
                                            String str4 = (String) list.get(0);
                                            String str5 = (String) list.get(1);
                                            List listWrite2 = new getInAppMessageEventMap("/").write(0, (CharSequence) str);
                                            if (!listWrite2.isEmpty()) {
                                                ListIterator listIterator2 = listWrite2.listIterator(listWrite2.size());
                                                while (listIterator2.hasPrevious()) {
                                                    if (((String) listIterator2.previous()).length() != 0) {
                                                        list2 = onContentCardDismissed.read(listWrite2, listIterator2.nextIndex() + 1);
                                                        break;
                                                    }
                                                }
                                            }
                                            List list3 = list2;
                                            String str6 = (String) list3.get(0);
                                            String str7 = (String) list3.get(1);
                                            i = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str4, str6}, getCieXyz.write())).booleanValue() ? 2 : 0;
                                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, str7}, getCieXyz.write())).booleanValue()) {
                                                i++;
                                            }
                                        } else {
                                            i = -1;
                                        }
                                    }
                                    if (bundleRemoteActionCompatParcelizer != null) {
                                        relativecubicto = new relativeCubicTo((opN5in7k0) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.write, bundleRemoteActionCompatParcelizer, getfilltypergk1os.PlaybackStateCompat, iSerializer, z, i);
                                        if (relativecubicto2 != null || relativecubicto.compareTo(relativecubicto2) > 0) {
                                            relativecubicto2 = relativecubicto;
                                        }
                                    } else if (!z || i > -1) {
                                        linkedHashMap.getClass();
                                        bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                                        if (uri != null && (getinappmessageeventmap = (getInAppMessageEventMap) isadapterpositiononscreen2.MediaSessionCompatResultReceiverWrapper()) != null && (getiscurrentlydisplayinginappmessageIconCompatParcelizer = getinappmessageeventmap.IconCompatParcelizer(uri.toString())) != null) {
                                            getfilltypergk1os.read(getiscurrentlydisplayinginappmessageIconCompatParcelizer, bundle, linkedHashMap);
                                            if (((Boolean) getfilltypergk1os.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                                                getfilltypergk1os.read(uri, bundle, linkedHashMap);
                                            }
                                        }
                                        if (close.RemoteActionCompatParcelizer(linkedHashMap, new isConvex(bundle, 1)).isEmpty()) {
                                            relativecubicto = new relativeCubicTo((opN5in7k0) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.write, bundleRemoteActionCompatParcelizer, getfilltypergk1os.PlaybackStateCompat, iSerializer, z, i);
                                            if (relativecubicto2 != null) {
                                                relativecubicto2 = relativecubicto;
                                            } else {
                                                relativecubicto2 = relativecubicto;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (str3 != null) {
                if (str2 != null) {
                    if (uri != null) {
                        bundleRemoteActionCompatParcelizer = getfilltypergk1os.RemoteActionCompatParcelizer(uri, linkedHashMap);
                    } else {
                        bundleRemoteActionCompatParcelizer = bundle2;
                    }
                    iSerializer = getfilltypergk1os.serializer(uri);
                    if (obj == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (str != null) {
                        i = -1;
                    } else {
                        i = -1;
                    }
                    if (bundleRemoteActionCompatParcelizer != null) {
                        relativecubicto = new relativeCubicTo((opN5in7k0) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.write, bundleRemoteActionCompatParcelizer, getfilltypergk1os.PlaybackStateCompat, iSerializer, z, i);
                        if (relativecubicto2 != null) {
                            relativecubicto2 = relativecubicto;
                        } else {
                            relativecubicto2 = relativecubicto;
                        }
                    } else if (!z) {
                        linkedHashMap.getClass();
                        bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                        if (uri != null) {
                            getfilltypergk1os.read(getiscurrentlydisplayinginappmessageIconCompatParcelizer, bundle, linkedHashMap);
                            if (((Boolean) getfilltypergk1os.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                                getfilltypergk1os.read(uri, bundle, linkedHashMap);
                            }
                        }
                        if (close.RemoteActionCompatParcelizer(linkedHashMap, new isConvex(bundle, 1)).isEmpty()) {
                            relativecubicto = new relativeCubicTo((opN5in7k0) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.write, bundleRemoteActionCompatParcelizer, getfilltypergk1os.PlaybackStateCompat, iSerializer, z, i);
                            if (relativecubicto2 != null) {
                                relativecubicto2 = relativecubicto;
                            } else {
                                relativecubicto2 = relativecubicto;
                            }
                        }
                    } else {
                        linkedHashMap.getClass();
                        bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                        if (uri != null) {
                            getfilltypergk1os.read(getiscurrentlydisplayinginappmessageIconCompatParcelizer, bundle, linkedHashMap);
                            if (((Boolean) getfilltypergk1os.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                                getfilltypergk1os.read(uri, bundle, linkedHashMap);
                            }
                        }
                        if (close.RemoteActionCompatParcelizer(linkedHashMap, new isConvex(bundle, 1)).isEmpty()) {
                            relativecubicto = new relativeCubicTo((opN5in7k0) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.write, bundleRemoteActionCompatParcelizer, getfilltypergk1os.PlaybackStateCompat, iSerializer, z, i);
                            if (relativecubicto2 != null) {
                                relativecubicto2 = relativecubicto;
                            } else {
                                relativecubicto2 = relativecubicto;
                            }
                        }
                    }
                } else if (str == null) {
                    getinappmessageeventmap2 = (getInAppMessageEventMap) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                    getinappmessageeventmap2.getClass();
                    if (getinappmessageeventmap2.read(str)) {
                        if (uri != null) {
                            bundleRemoteActionCompatParcelizer = getfilltypergk1os.RemoteActionCompatParcelizer(uri, linkedHashMap);
                        } else {
                            bundleRemoteActionCompatParcelizer = bundle2;
                        }
                        iSerializer = getfilltypergk1os.serializer(uri);
                        if (obj == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (str != null) {
                            i = -1;
                        } else {
                            i = -1;
                        }
                        if (bundleRemoteActionCompatParcelizer != null) {
                            relativecubicto = new relativeCubicTo((opN5in7k0) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.write, bundleRemoteActionCompatParcelizer, getfilltypergk1os.PlaybackStateCompat, iSerializer, z, i);
                            if (relativecubicto2 != null) {
                                relativecubicto2 = relativecubicto;
                            } else {
                                relativecubicto2 = relativecubicto;
                            }
                        } else if (!z) {
                            linkedHashMap.getClass();
                            bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                            if (uri != null) {
                                getfilltypergk1os.read(getiscurrentlydisplayinginappmessageIconCompatParcelizer, bundle, linkedHashMap);
                                if (((Boolean) getfilltypergk1os.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                                    getfilltypergk1os.read(uri, bundle, linkedHashMap);
                                }
                            }
                            if (close.RemoteActionCompatParcelizer(linkedHashMap, new isConvex(bundle, 1)).isEmpty()) {
                                relativecubicto = new relativeCubicTo((opN5in7k0) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.write, bundleRemoteActionCompatParcelizer, getfilltypergk1os.PlaybackStateCompat, iSerializer, z, i);
                                if (relativecubicto2 != null) {
                                    relativecubicto2 = relativecubicto;
                                } else {
                                    relativecubicto2 = relativecubicto;
                                }
                            }
                        } else {
                            linkedHashMap.getClass();
                            bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                            if (uri != null) {
                                getfilltypergk1os.read(getiscurrentlydisplayinginappmessageIconCompatParcelizer, bundle, linkedHashMap);
                                if (((Boolean) getfilltypergk1os.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                                    getfilltypergk1os.read(uri, bundle, linkedHashMap);
                                }
                            }
                            if (close.RemoteActionCompatParcelizer(linkedHashMap, new isConvex(bundle, 1)).isEmpty()) {
                                relativecubicto = new relativeCubicTo((opN5in7k0) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.write, bundleRemoteActionCompatParcelizer, getfilltypergk1os.PlaybackStateCompat, iSerializer, z, i);
                                if (relativecubicto2 != null) {
                                    relativecubicto2 = relativecubicto;
                                } else {
                                    relativecubicto2 = relativecubicto;
                                }
                            }
                        }
                    }
                }
            }
            bundle2 = null;
        }
        return relativecubicto2;
    }

    public final void serializer(String str) {
        r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg = this.serializer;
        if (str == null) {
            r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.RemoteActionCompatParcelizer = 0;
            r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.serializer = null;
        } else {
            r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.getClass();
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot have an empty route");
                return;
            }
            String strConcat = "android-app://androidx.navigation/".concat(str);
            int i = 1;
            ArrayList arrayListRemoteActionCompatParcelizer = close.RemoteActionCompatParcelizer((LinkedHashMap) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.IconCompatParcelizer, new toComposeTileMode(new getFillTypeRgk1Os(strConcat, null, null), i));
            if (!arrayListRemoteActionCompatParcelizer.isEmpty()) {
                StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Cannot set route \"", str, "\" for destination ");
                sbM.append((opN5in7k0) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.write);
                sbM.append(". Following required arguments are missing: ");
                sbM.append(arrayListRemoteActionCompatParcelizer);
                throw new IllegalArgumentException(sbM.toString().toString());
            }
            r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.MediaBrowserCompatMediaItem = new isAdapterPositionOnScreen(new a7$$ExternalSyntheticLambda3(strConcat, i));
            r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.RemoteActionCompatParcelizer = strConcat.hashCode();
            r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.serializer = null;
        }
        r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.read = str;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof opN5in7k0)) {
                r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg = this.serializer;
                ArrayList arrayList = r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.MediaSessionCompatQueueItem;
                opN5in7k0 opn5in7k0 = (opN5in7k0) obj;
                accessprocessDragStart accessprocessdragstart = opn5in7k0.RemoteActionCompatParcelizer;
                r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg2 = opn5in7k0.serializer;
                boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{arrayList, r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg2.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue();
                accessprocessDragStart accessprocessdragstart2 = this.RemoteActionCompatParcelizer;
                if (accessprocessdragstart2.write() != accessprocessdragstart.write()) {
                    z = false;
                    break;
                }
                Iterator it = ((requestDisplayInAppMessagelambda4) resetAfterInAppMessageCloselambda2.serializer(new accessprocessDragStop(accessprocessdragstart2))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{isInterested.RemoteActionCompatParcelizer(accessprocessdragstart2, iIntValue), isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, iIntValue)}, getCieXyz.write())).booleanValue()) {
                        z = false;
                        break;
                    }
                }
                if (RemoteActionCompatParcelizer().size() != opn5in7k0.RemoteActionCompatParcelizer().size()) {
                    z2 = false;
                    break;
                }
                Iterator it2 = ((Iterable) onContentCardDismissed.read((Iterable) RemoteActionCompatParcelizer().entrySet()).read).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (opn5in7k0.RemoteActionCompatParcelizer().containsKey(entry.getKey())) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{opn5in7k0.RemoteActionCompatParcelizer().get(entry.getKey()), entry.getValue()}, getCieXyz.write())).booleanValue()) {
                        }
                    }
                    z2 = false;
                    break;
                }
                if (r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.RemoteActionCompatParcelizer == r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg2.RemoteActionCompatParcelizer) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.read, (String) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg2.read}, getCieXyz.write())).booleanValue() || !zBooleanValue || !z || !z2) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
