package o;

import android.net.Uri;
import android.os.Bundle;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes.dex */
public final class getFillTypeRgk1Os {
    public final isAdapterPositionOnScreen ComponentActivity;
    public final onViewDetachedFromWindowlambda1 MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final isAdapterPositionOnScreen MediaMetadataCompat;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public final isAdapterPositionOnScreen MediaSessionCompatToken;
    public final String ParcelableVolumeInfo;
    public final boolean PlaybackStateCompat;
    public final onViewDetachedFromWindowlambda1 PlaybackStateCompatCustomAction;
    public final onViewDetachedFromWindowlambda1 RatingCompat;
    public final ArrayList ResultReceiver;
    public final String r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final isAdapterPositionOnScreen r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final onViewDetachedFromWindowlambda1 r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final String r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public static final getInAppMessageEventMap serializer = new getInAppMessageEventMap("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final getInAppMessageEventMap IconCompatParcelizer = new getInAppMessageEventMap("\\{(.+?)\\}");
    public static final getInAppMessageEventMap read = new getInAppMessageEventMap("http[s]?://");
    public static final getInAppMessageEventMap MediaSessionCompatQueueItem = new getInAppMessageEventMap(".*");
    public static final getInAppMessageEventMap write = new getInAppMessageEventMap("([^/]*?|)");
    public static final getInAppMessageEventMap RemoteActionCompatParcelizer = new getInAppMessageEventMap("^[^?#]+\\?([^#]*).*");

    public final int hashCode() {
        String str = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.ParcelableVolumeInfo;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public static void RemoteActionCompatParcelizer(Bundle bundle, String str, String str2, addArcRad addarcrad) {
        if (addarcrad == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            asAndroidPathEffect asandroidpatheffect = addarcrad.write;
            str.getClass();
            asandroidpatheffect.read(str, bundle, asandroidpatheffect.IconCompatParcelizer(str2));
        }
    }

    public static void RemoteActionCompatParcelizer(String str, ArrayList arrayList, StringBuilder sb) {
        int i = 0;
        for (getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getInAppMessageEventMap.read(IconCompatParcelizer, str); getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer != null; getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
            getInAppMessageStack getinappmessagestackRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.write.RemoteActionCompatParcelizer(1);
            getinappmessagestackRemoteActionCompatParcelizer.getClass();
            arrayList.add(getinappmessagestackRemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
            if (getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write > i) {
                String strQuote = Pattern.quote(str.substring(i, getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write));
                strQuote.getClass();
                sb.append(strQuote);
            }
            String strPattern = write.nativePattern.pattern();
            strPattern.getClass();
            sb.append(strPattern);
            i = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().read + 1;
        }
        if (i < str.length()) {
            String strQuote2 = Pattern.quote(str.substring(i));
            strQuote2.getClass();
            sb.append(strQuote2);
        }
    }

    public final ArrayList read() {
        Collection collectionValues = ((Map) this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatResultReceiverWrapper()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((quadraticTo) it.next()).serializer, (Collection) arrayList);
        }
        return onContentCardDismissed.IconCompatParcelizer((List) this.RatingCompat.MediaSessionCompatResultReceiverWrapper(), onContentCardDismissed.IconCompatParcelizer(arrayList, this.ResultReceiver));
    }

    public final int serializer(Uri uri) {
        String str;
        if (uri == null || (str = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(str);
        uri2.getClass();
        return onContentCardDismissed.read(pathSegments, uri2.getPathSegments()).size();
    }

    public getFillTypeRgk1Os(String str, String str2, String str3) {
        List list;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = str;
        this.MediaDescriptionCompat = str2;
        this.ParcelableVolumeInfo = str3;
        ArrayList arrayList = new ArrayList();
        this.ResultReceiver = arrayList;
        final int i = 0;
        this.ComponentActivity = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.lineTo
            public final /* synthetic */ getFillTypeRgk1Os RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                List list2;
                int i2 = i;
                getFillTypeRgk1Os getfilltypergk1os = this.RemoteActionCompatParcelizer;
                switch (i2) {
                    case 0:
                        String str4 = getfilltypergk1os.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        if (str4 != null) {
                            return new getInAppMessageEventMap(str4, registerInAppMessageManager.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        return Boolean.valueOf(str5 != null && getFillTypeRgk1Os.RemoteActionCompatParcelizer.read(str5));
                    case 2:
                        String str6 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) getfilltypergk1os.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    DrawableTransformation.serializer((Object) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) onContentCardDismissed.MediaMetadataCompat((List) queryParameters);
                                if (str8 == null) {
                                    getfilltypergk1os.MediaSessionCompatResultReceiverWrapper = true;
                                    str8 = str7;
                                }
                                quadraticTo quadraticto = new quadraticTo();
                                int i3 = 0;
                                for (getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getInAppMessageEventMap.read(getFillTypeRgk1Os.IconCompatParcelizer, str8); getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer != null; getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
                                    getInAppMessageStack getinappmessagestackRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.write.RemoteActionCompatParcelizer(1);
                                    getinappmessagestackRemoteActionCompatParcelizer.getClass();
                                    quadraticto.serializer.add(getinappmessagestackRemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                                    if (getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write > i3) {
                                        String strQuote = Pattern.quote(str8.substring(i3, getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().read + 1;
                                }
                                if (i3 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i3));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                quadraticto.write = getFillTypeRgk1Os.serializer(sb.toString());
                                linkedHashMap.put(str7, quadraticto);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        getFillTypeRgk1Os.RemoteActionCompatParcelizer(fragment, arrayList2, sb2);
                        return new onViewAttachedToWindowlambda0(arrayList2, sb2.toString());
                    case 4:
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) getfilltypergk1os.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                        return (onviewattachedtowindowlambda0 == null || (list2 = (List) onviewattachedtowindowlambda0.serializer) == null) ? new ArrayList() : list2;
                    case 5:
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) getfilltypergk1os.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                        if (onviewattachedtowindowlambda1 != null) {
                            return (String) onviewattachedtowindowlambda1.write;
                        }
                        return null;
                    case 6:
                        String str10 = (String) getfilltypergk1os.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper();
                        if (str10 != null) {
                            return new getInAppMessageEventMap(str10, registerInAppMessageManager.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = getfilltypergk1os.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        if (str11 != null) {
                            return new getInAppMessageEventMap(str11);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.MediaSessionCompatToken = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.lineTo
            public final /* synthetic */ getFillTypeRgk1Os RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                List list2;
                int i3 = i2;
                getFillTypeRgk1Os getfilltypergk1os = this.RemoteActionCompatParcelizer;
                switch (i3) {
                    case 0:
                        String str4 = getfilltypergk1os.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        if (str4 != null) {
                            return new getInAppMessageEventMap(str4, registerInAppMessageManager.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        return Boolean.valueOf(str5 != null && getFillTypeRgk1Os.RemoteActionCompatParcelizer.read(str5));
                    case 2:
                        String str6 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) getfilltypergk1os.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    DrawableTransformation.serializer((Object) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) onContentCardDismissed.MediaMetadataCompat((List) queryParameters);
                                if (str8 == null) {
                                    getfilltypergk1os.MediaSessionCompatResultReceiverWrapper = true;
                                    str8 = str7;
                                }
                                quadraticTo quadraticto = new quadraticTo();
                                int i4 = 0;
                                for (getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getInAppMessageEventMap.read(getFillTypeRgk1Os.IconCompatParcelizer, str8); getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer != null; getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
                                    getInAppMessageStack getinappmessagestackRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.write.RemoteActionCompatParcelizer(1);
                                    getinappmessagestackRemoteActionCompatParcelizer.getClass();
                                    quadraticto.serializer.add(getinappmessagestackRemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                                    if (getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write > i4) {
                                        String strQuote = Pattern.quote(str8.substring(i4, getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i4 = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().read + 1;
                                }
                                if (i4 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i4));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                quadraticto.write = getFillTypeRgk1Os.serializer(sb.toString());
                                linkedHashMap.put(str7, quadraticto);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        getFillTypeRgk1Os.RemoteActionCompatParcelizer(fragment, arrayList2, sb2);
                        return new onViewAttachedToWindowlambda0(arrayList2, sb2.toString());
                    case 4:
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) getfilltypergk1os.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                        return (onviewattachedtowindowlambda0 == null || (list2 = (List) onviewattachedtowindowlambda0.serializer) == null) ? new ArrayList() : list2;
                    case 5:
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) getfilltypergk1os.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                        if (onviewattachedtowindowlambda1 != null) {
                            return (String) onviewattachedtowindowlambda1.write;
                        }
                        return null;
                    case 6:
                        String str10 = (String) getfilltypergk1os.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper();
                        if (str10 != null) {
                            return new getInAppMessageEventMap(str10, registerInAppMessageManager.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = getfilltypergk1os.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        if (str11 != null) {
                            return new getInAppMessageEventMap(str11);
                        }
                        return null;
                }
            }
        });
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.NONE;
        final int i3 = 2;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.lineTo
            public final /* synthetic */ getFillTypeRgk1Os RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                List list2;
                int i4 = i3;
                getFillTypeRgk1Os getfilltypergk1os = this.RemoteActionCompatParcelizer;
                switch (i4) {
                    case 0:
                        String str4 = getfilltypergk1os.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        if (str4 != null) {
                            return new getInAppMessageEventMap(str4, registerInAppMessageManager.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        return Boolean.valueOf(str5 != null && getFillTypeRgk1Os.RemoteActionCompatParcelizer.read(str5));
                    case 2:
                        String str6 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) getfilltypergk1os.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    DrawableTransformation.serializer((Object) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) onContentCardDismissed.MediaMetadataCompat((List) queryParameters);
                                if (str8 == null) {
                                    getfilltypergk1os.MediaSessionCompatResultReceiverWrapper = true;
                                    str8 = str7;
                                }
                                quadraticTo quadraticto = new quadraticTo();
                                int i5 = 0;
                                for (getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getInAppMessageEventMap.read(getFillTypeRgk1Os.IconCompatParcelizer, str8); getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer != null; getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
                                    getInAppMessageStack getinappmessagestackRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.write.RemoteActionCompatParcelizer(1);
                                    getinappmessagestackRemoteActionCompatParcelizer.getClass();
                                    quadraticto.serializer.add(getinappmessagestackRemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                                    if (getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write > i5) {
                                        String strQuote = Pattern.quote(str8.substring(i5, getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i5 = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().read + 1;
                                }
                                if (i5 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i5));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                quadraticto.write = getFillTypeRgk1Os.serializer(sb.toString());
                                linkedHashMap.put(str7, quadraticto);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        getFillTypeRgk1Os.RemoteActionCompatParcelizer(fragment, arrayList2, sb2);
                        return new onViewAttachedToWindowlambda0(arrayList2, sb2.toString());
                    case 4:
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) getfilltypergk1os.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                        return (onviewattachedtowindowlambda0 == null || (list2 = (List) onviewattachedtowindowlambda0.serializer) == null) ? new ArrayList() : list2;
                    case 5:
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) getfilltypergk1os.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                        if (onviewattachedtowindowlambda1 != null) {
                            return (String) onviewattachedtowindowlambda1.write;
                        }
                        return null;
                    case 6:
                        String str10 = (String) getfilltypergk1os.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper();
                        if (str10 != null) {
                            return new getInAppMessageEventMap(str10, registerInAppMessageManager.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = getfilltypergk1os.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        if (str11 != null) {
                            return new getInAppMessageEventMap(str11);
                        }
                        return null;
                }
            }
        });
        final int i4 = 3;
        this.MediaBrowserCompatMediaItem = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.lineTo
            public final /* synthetic */ getFillTypeRgk1Os RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                List list2;
                int i5 = i4;
                getFillTypeRgk1Os getfilltypergk1os = this.RemoteActionCompatParcelizer;
                switch (i5) {
                    case 0:
                        String str4 = getfilltypergk1os.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        if (str4 != null) {
                            return new getInAppMessageEventMap(str4, registerInAppMessageManager.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        return Boolean.valueOf(str5 != null && getFillTypeRgk1Os.RemoteActionCompatParcelizer.read(str5));
                    case 2:
                        String str6 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) getfilltypergk1os.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    DrawableTransformation.serializer((Object) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) onContentCardDismissed.MediaMetadataCompat((List) queryParameters);
                                if (str8 == null) {
                                    getfilltypergk1os.MediaSessionCompatResultReceiverWrapper = true;
                                    str8 = str7;
                                }
                                quadraticTo quadraticto = new quadraticTo();
                                int i6 = 0;
                                for (getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getInAppMessageEventMap.read(getFillTypeRgk1Os.IconCompatParcelizer, str8); getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer != null; getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
                                    getInAppMessageStack getinappmessagestackRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.write.RemoteActionCompatParcelizer(1);
                                    getinappmessagestackRemoteActionCompatParcelizer.getClass();
                                    quadraticto.serializer.add(getinappmessagestackRemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                                    if (getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write > i6) {
                                        String strQuote = Pattern.quote(str8.substring(i6, getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i6 = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().read + 1;
                                }
                                if (i6 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i6));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                quadraticto.write = getFillTypeRgk1Os.serializer(sb.toString());
                                linkedHashMap.put(str7, quadraticto);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        getFillTypeRgk1Os.RemoteActionCompatParcelizer(fragment, arrayList2, sb2);
                        return new onViewAttachedToWindowlambda0(arrayList2, sb2.toString());
                    case 4:
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) getfilltypergk1os.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                        return (onviewattachedtowindowlambda0 == null || (list2 = (List) onviewattachedtowindowlambda0.serializer) == null) ? new ArrayList() : list2;
                    case 5:
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) getfilltypergk1os.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                        if (onviewattachedtowindowlambda1 != null) {
                            return (String) onviewattachedtowindowlambda1.write;
                        }
                        return null;
                    case 6:
                        String str10 = (String) getfilltypergk1os.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper();
                        if (str10 != null) {
                            return new getInAppMessageEventMap(str10, registerInAppMessageManager.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = getfilltypergk1os.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        if (str11 != null) {
                            return new getInAppMessageEventMap(str11);
                        }
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.RatingCompat = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.lineTo
            public final /* synthetic */ getFillTypeRgk1Os RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                List list2;
                int i6 = i5;
                getFillTypeRgk1Os getfilltypergk1os = this.RemoteActionCompatParcelizer;
                switch (i6) {
                    case 0:
                        String str4 = getfilltypergk1os.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        if (str4 != null) {
                            return new getInAppMessageEventMap(str4, registerInAppMessageManager.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        return Boolean.valueOf(str5 != null && getFillTypeRgk1Os.RemoteActionCompatParcelizer.read(str5));
                    case 2:
                        String str6 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) getfilltypergk1os.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    DrawableTransformation.serializer((Object) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) onContentCardDismissed.MediaMetadataCompat((List) queryParameters);
                                if (str8 == null) {
                                    getfilltypergk1os.MediaSessionCompatResultReceiverWrapper = true;
                                    str8 = str7;
                                }
                                quadraticTo quadraticto = new quadraticTo();
                                int i7 = 0;
                                for (getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getInAppMessageEventMap.read(getFillTypeRgk1Os.IconCompatParcelizer, str8); getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer != null; getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
                                    getInAppMessageStack getinappmessagestackRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.write.RemoteActionCompatParcelizer(1);
                                    getinappmessagestackRemoteActionCompatParcelizer.getClass();
                                    quadraticto.serializer.add(getinappmessagestackRemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                                    if (getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write > i7) {
                                        String strQuote = Pattern.quote(str8.substring(i7, getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i7 = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().read + 1;
                                }
                                if (i7 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i7));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                quadraticto.write = getFillTypeRgk1Os.serializer(sb.toString());
                                linkedHashMap.put(str7, quadraticto);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        getFillTypeRgk1Os.RemoteActionCompatParcelizer(fragment, arrayList2, sb2);
                        return new onViewAttachedToWindowlambda0(arrayList2, sb2.toString());
                    case 4:
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) getfilltypergk1os.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                        return (onviewattachedtowindowlambda0 == null || (list2 = (List) onviewattachedtowindowlambda0.serializer) == null) ? new ArrayList() : list2;
                    case 5:
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) getfilltypergk1os.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                        if (onviewattachedtowindowlambda1 != null) {
                            return (String) onviewattachedtowindowlambda1.write;
                        }
                        return null;
                    case 6:
                        String str10 = (String) getfilltypergk1os.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper();
                        if (str10 != null) {
                            return new getInAppMessageEventMap(str10, registerInAppMessageManager.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = getfilltypergk1os.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        if (str11 != null) {
                            return new getInAppMessageEventMap(str11);
                        }
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.PlaybackStateCompatCustomAction = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.lineTo
            public final /* synthetic */ getFillTypeRgk1Os RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                List list2;
                int i7 = i6;
                getFillTypeRgk1Os getfilltypergk1os = this.RemoteActionCompatParcelizer;
                switch (i7) {
                    case 0:
                        String str4 = getfilltypergk1os.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        if (str4 != null) {
                            return new getInAppMessageEventMap(str4, registerInAppMessageManager.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        return Boolean.valueOf(str5 != null && getFillTypeRgk1Os.RemoteActionCompatParcelizer.read(str5));
                    case 2:
                        String str6 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) getfilltypergk1os.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    DrawableTransformation.serializer((Object) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) onContentCardDismissed.MediaMetadataCompat((List) queryParameters);
                                if (str8 == null) {
                                    getfilltypergk1os.MediaSessionCompatResultReceiverWrapper = true;
                                    str8 = str7;
                                }
                                quadraticTo quadraticto = new quadraticTo();
                                int i8 = 0;
                                for (getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getInAppMessageEventMap.read(getFillTypeRgk1Os.IconCompatParcelizer, str8); getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer != null; getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
                                    getInAppMessageStack getinappmessagestackRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.write.RemoteActionCompatParcelizer(1);
                                    getinappmessagestackRemoteActionCompatParcelizer.getClass();
                                    quadraticto.serializer.add(getinappmessagestackRemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                                    if (getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write > i8) {
                                        String strQuote = Pattern.quote(str8.substring(i8, getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i8 = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().read + 1;
                                }
                                if (i8 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i8));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                quadraticto.write = getFillTypeRgk1Os.serializer(sb.toString());
                                linkedHashMap.put(str7, quadraticto);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        getFillTypeRgk1Os.RemoteActionCompatParcelizer(fragment, arrayList2, sb2);
                        return new onViewAttachedToWindowlambda0(arrayList2, sb2.toString());
                    case 4:
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) getfilltypergk1os.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                        return (onviewattachedtowindowlambda0 == null || (list2 = (List) onviewattachedtowindowlambda0.serializer) == null) ? new ArrayList() : list2;
                    case 5:
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) getfilltypergk1os.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                        if (onviewattachedtowindowlambda1 != null) {
                            return (String) onviewattachedtowindowlambda1.write;
                        }
                        return null;
                    case 6:
                        String str10 = (String) getfilltypergk1os.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper();
                        if (str10 != null) {
                            return new getInAppMessageEventMap(str10, registerInAppMessageManager.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = getfilltypergk1os.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        if (str11 != null) {
                            return new getInAppMessageEventMap(str11);
                        }
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.MediaMetadataCompat = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.lineTo
            public final /* synthetic */ getFillTypeRgk1Os RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                List list2;
                int i8 = i7;
                getFillTypeRgk1Os getfilltypergk1os = this.RemoteActionCompatParcelizer;
                switch (i8) {
                    case 0:
                        String str4 = getfilltypergk1os.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        if (str4 != null) {
                            return new getInAppMessageEventMap(str4, registerInAppMessageManager.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        return Boolean.valueOf(str5 != null && getFillTypeRgk1Os.RemoteActionCompatParcelizer.read(str5));
                    case 2:
                        String str6 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) getfilltypergk1os.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    DrawableTransformation.serializer((Object) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) onContentCardDismissed.MediaMetadataCompat((List) queryParameters);
                                if (str8 == null) {
                                    getfilltypergk1os.MediaSessionCompatResultReceiverWrapper = true;
                                    str8 = str7;
                                }
                                quadraticTo quadraticto = new quadraticTo();
                                int i9 = 0;
                                for (getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getInAppMessageEventMap.read(getFillTypeRgk1Os.IconCompatParcelizer, str8); getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer != null; getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
                                    getInAppMessageStack getinappmessagestackRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.write.RemoteActionCompatParcelizer(1);
                                    getinappmessagestackRemoteActionCompatParcelizer.getClass();
                                    quadraticto.serializer.add(getinappmessagestackRemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                                    if (getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write > i9) {
                                        String strQuote = Pattern.quote(str8.substring(i9, getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i9 = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().read + 1;
                                }
                                if (i9 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i9));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                quadraticto.write = getFillTypeRgk1Os.serializer(sb.toString());
                                linkedHashMap.put(str7, quadraticto);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        getFillTypeRgk1Os.RemoteActionCompatParcelizer(fragment, arrayList2, sb2);
                        return new onViewAttachedToWindowlambda0(arrayList2, sb2.toString());
                    case 4:
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) getfilltypergk1os.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                        return (onviewattachedtowindowlambda0 == null || (list2 = (List) onviewattachedtowindowlambda0.serializer) == null) ? new ArrayList() : list2;
                    case 5:
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) getfilltypergk1os.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                        if (onviewattachedtowindowlambda1 != null) {
                            return (String) onviewattachedtowindowlambda1.write;
                        }
                        return null;
                    case 6:
                        String str10 = (String) getfilltypergk1os.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper();
                        if (str10 != null) {
                            return new getInAppMessageEventMap(str10, registerInAppMessageManager.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = getfilltypergk1os.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        if (str11 != null) {
                            return new getInAppMessageEventMap(str11);
                        }
                        return null;
                }
            }
        });
        final int i8 = 7;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.lineTo
            public final /* synthetic */ getFillTypeRgk1Os RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                List list2;
                int i9 = i8;
                getFillTypeRgk1Os getfilltypergk1os = this.RemoteActionCompatParcelizer;
                switch (i9) {
                    case 0:
                        String str4 = getfilltypergk1os.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        if (str4 != null) {
                            return new getInAppMessageEventMap(str4, registerInAppMessageManager.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        return Boolean.valueOf(str5 != null && getFillTypeRgk1Os.RemoteActionCompatParcelizer.read(str5));
                    case 2:
                        String str6 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) getfilltypergk1os.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    DrawableTransformation.serializer((Object) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) onContentCardDismissed.MediaMetadataCompat((List) queryParameters);
                                if (str8 == null) {
                                    getfilltypergk1os.MediaSessionCompatResultReceiverWrapper = true;
                                    str8 = str7;
                                }
                                quadraticTo quadraticto = new quadraticTo();
                                int i10 = 0;
                                for (getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getInAppMessageEventMap.read(getFillTypeRgk1Os.IconCompatParcelizer, str8); getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer != null; getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
                                    getInAppMessageStack getinappmessagestackRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.write.RemoteActionCompatParcelizer(1);
                                    getinappmessagestackRemoteActionCompatParcelizer.getClass();
                                    quadraticto.serializer.add(getinappmessagestackRemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                                    if (getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write > i10) {
                                        String strQuote = Pattern.quote(str8.substring(i10, getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().write));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i10 = getiscurrentlydisplayinginappmessageRemoteActionCompatParcelizer.serializer().read + 1;
                                }
                                if (i10 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i10));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                quadraticto.write = getFillTypeRgk1Os.serializer(sb.toString());
                                linkedHashMap.put(str7, quadraticto);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        getFillTypeRgk1Os.RemoteActionCompatParcelizer(fragment, arrayList2, sb2);
                        return new onViewAttachedToWindowlambda0(arrayList2, sb2.toString());
                    case 4:
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) getfilltypergk1os.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                        return (onviewattachedtowindowlambda0 == null || (list2 = (List) onviewattachedtowindowlambda0.serializer) == null) ? new ArrayList() : list2;
                    case 5:
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) getfilltypergk1os.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                        if (onviewattachedtowindowlambda1 != null) {
                            return (String) onviewattachedtowindowlambda1.write;
                        }
                        return null;
                    case 6:
                        String str10 = (String) getfilltypergk1os.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper();
                        if (str10 != null) {
                            return new getInAppMessageEventMap(str10, registerInAppMessageManager.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = getfilltypergk1os.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        if (str11 != null) {
                            return new getInAppMessageEventMap(str11);
                        }
                        return null;
                }
            }
        });
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!serializer.write(str)) {
                String strPattern = read.nativePattern.pattern();
                strPattern.getClass();
                sb.append(strPattern);
            }
            Pattern patternCompile = Pattern.compile("(\\?|#|$)");
            patternCompile.getClass();
            Matcher matcher = patternCompile.matcher(str);
            matcher.getClass();
            getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessageWrite = RegexKt.write(matcher, 0, str);
            if (getiscurrentlydisplayinginappmessageWrite != null) {
                RemoteActionCompatParcelizer(str.substring(0, getiscurrentlydisplayinginappmessageWrite.serializer().write), arrayList, sb);
                this.PlaybackStateCompat = (MediaSessionCompatQueueItem.write(sb) || write.write(sb)) ? false : true;
                sb.append("($|(\\?(.)*)|(#(.)*))");
            }
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = serializer(sb.toString());
        }
        if (str3 == null) {
            return;
        }
        Pattern patternCompile2 = Pattern.compile("^[\\s\\S]+/[\\s\\S]+$");
        patternCompile2.getClass();
        if (!patternCompile2.matcher(str3).matches()) {
            DrawableTransformation.serializer((Object) ff$$ExternalSyntheticOutline0.m("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
            throw null;
        }
        List listWrite = new getInAppMessageEventMap("/").write(0, (CharSequence) str3);
        if (listWrite.isEmpty()) {
            list = instance_delegatelambda0.write;
        } else {
            ListIterator listIterator = listWrite.listIterator(listWrite.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    list = onContentCardDismissed.read(listWrite, listIterator.nextIndex() + 1);
                }
            }
            list = instance_delegatelambda0.write;
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = setCarryoverInAppMessage.write(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("^(", (String) list.get(0), "|[*]+)/(", (String) list.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]");
    }

    public static String serializer(String str) {
        if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "\\Q", false) && hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "\\E", false)) {
            return setCarryoverInAppMessage.write(str, ".*", "\\E.*\\Q");
        }
        return hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "\\.\\*", false) ? setCarryoverInAppMessage.write(str, "\\.\\*", ".*") : str;
    }

    public final Bundle RemoteActionCompatParcelizer(Uri uri, LinkedHashMap linkedHashMap) {
        getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessageIconCompatParcelizer;
        getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessageIconCompatParcelizer2;
        String strDecode;
        uri.getClass();
        linkedHashMap.getClass();
        getInAppMessageEventMap getinappmessageeventmap = (getInAppMessageEventMap) this.ComponentActivity.MediaSessionCompatResultReceiverWrapper();
        if (getinappmessageeventmap != null && (getiscurrentlydisplayinginappmessageIconCompatParcelizer = getinappmessageeventmap.IconCompatParcelizer(uri.toString())) != null) {
            Bundle bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
            if (read(getiscurrentlydisplayinginappmessageIconCompatParcelizer, bundle, linkedHashMap) && (!((Boolean) this.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).booleanValue() || read(uri, bundle, linkedHashMap))) {
                String fragment = uri.getFragment();
                getInAppMessageEventMap getinappmessageeventmap2 = (getInAppMessageEventMap) this.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper();
                if (getinappmessageeventmap2 != null && (getiscurrentlydisplayinginappmessageIconCompatParcelizer2 = getinappmessageeventmap2.IconCompatParcelizer(String.valueOf(fragment))) != null) {
                    List list = (List) this.RatingCompat.MediaSessionCompatResultReceiverWrapper();
                    ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            androidx.sqlite.SQLite.serializer();
                            throw null;
                        }
                        String str = (String) obj;
                        getInAppMessageStack getinappmessagestackRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessageIconCompatParcelizer2.write.RemoteActionCompatParcelizer(i2);
                        if (getinappmessagestackRemoteActionCompatParcelizer != null) {
                            strDecode = Uri.decode(getinappmessagestackRemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                            strDecode.getClass();
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        try {
                            RemoteActionCompatParcelizer(bundle, str, strDecode, (addArcRad) linkedHashMap.get(str));
                            arrayList.add(createFromParcel.INSTANCE);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (close.RemoteActionCompatParcelizer(linkedHashMap, new isConvex(bundle, 0)).isEmpty()) {
                    return bundle;
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof getFillTypeRgk1Os)) {
            return false;
        }
        getFillTypeRgk1Os getfilltypergk1os = (getFillTypeRgk1Os) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, getfilltypergk1os.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, getfilltypergk1os.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ParcelableVolumeInfo, getfilltypergk1os.ParcelableVolumeInfo}, getCieXyz.write())).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0114  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [int] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Map] */
    public final boolean read(Uri uri, Bundle bundle, Map map) {
        getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage;
        Object objValueOf;
        boolean z;
        String query;
        for (Map.Entry entry : ((Map) this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatResultReceiverWrapper()).entrySet()) {
            String str = (String) entry.getKey();
            quadraticTo quadraticto = (quadraticTo) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.MediaSessionCompatResultReceiverWrapper && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{query}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            boolean z2 = false;
            Bundle bundle2 = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
            for (String str2 : quadraticto.serializer) {
                addArcRad addarcrad = (addArcRad) map.get(str2);
                asAndroidPathEffect asandroidpatheffect = addarcrad != null ? addarcrad.write : null;
                if ((asandroidpatheffect instanceof isConvexannotations) && !addarcrad.serializer) {
                    isConvexannotations isconvexannotations = (isConvexannotations) asandroidpatheffect;
                    int i = isconvexannotations.IconCompatParcelizer;
                    Object obj = instance_delegatelambda0.write;
                    if (i == 1) {
                        obj = new boolean[0];
                    } else if (i == 3) {
                        obj = new float[0];
                    } else if (i == 8) {
                        obj = new String[0];
                    } else if (i == 5) {
                        obj = new int[0];
                    } else if (i == 6) {
                        obj = new long[0];
                    }
                    isconvexannotations.read(str2, bundle2, obj);
                }
            }
            for (String str3 : queryParameters) {
                String str4 = quadraticto.write;
                if (str4 != null) {
                    Pattern patternCompile = Pattern.compile(str4);
                    patternCompile.getClass();
                    str3.getClass();
                    Matcher matcher = patternCompile.matcher(str3);
                    matcher.getClass();
                    if (matcher.matches()) {
                        getiscurrentlydisplayinginappmessage = new getIsCurrentlyDisplayingInAppMessage(matcher, str3);
                    } else {
                        getiscurrentlydisplayinginappmessage = null;
                    }
                } else {
                    getiscurrentlydisplayinginappmessage = null;
                }
                if (getiscurrentlydisplayinginappmessage == null) {
                    return z2;
                }
                ArrayList arrayList = quadraticto.serializer;
                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                ?? r11 = z2;
                for (Object obj2 : arrayList) {
                    int i2 = r11 + 1;
                    if (r11 >= 0) {
                        String str5 = (String) obj2;
                        getInAppMessageStack getinappmessagestackRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessage.write.RemoteActionCompatParcelizer(i2);
                        String str6 = getinappmessagestackRemoteActionCompatParcelizer != null ? getinappmessagestackRemoteActionCompatParcelizer.RemoteActionCompatParcelizer : null;
                        if (str6 == null) {
                            str6 = "";
                        }
                        addArcRad addarcrad2 = (addArcRad) map.get(str5);
                        try {
                            if (!getCyan0d7_KjU.IconCompatParcelizer(bundle2, str5)) {
                                RemoteActionCompatParcelizer(bundle2, str5, str6, addarcrad2);
                                objValueOf = createfromparcel;
                            } else {
                                if (bundle2.containsKey(str5)) {
                                    if (addarcrad2 != null) {
                                        asAndroidPathEffect asandroidpatheffect2 = addarcrad2.write;
                                        Object objSerializer = asandroidpatheffect2.serializer(bundle2, str5);
                                        if (bundle2.containsKey(str5)) {
                                            asandroidpatheffect2.read(str5, bundle2, asandroidpatheffect2.read(objSerializer, str6));
                                        } else {
                                            throw new IllegalArgumentException("There is no previous value in this savedState.");
                                        }
                                        objValueOf = createfromparcel;
                                    }
                                    z = false;
                                } else {
                                    z = true;
                                }
                                objValueOf = Boolean.valueOf(z);
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                        arrayList2.add(objValueOf);
                        r11 = i2;
                        z2 = false;
                    } else {
                        androidx.sqlite.SQLite.serializer();
                        throw null;
                    }
                }
            }
            bundle.putAll(bundle2);
        }
        return true;
    }

    public final boolean read(getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage, Bundle bundle, Map map) {
        ArrayList arrayList = this.ResultReceiver;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            String strDecode = null;
            if (i >= 0) {
                String str = (String) obj;
                getInAppMessageStack getinappmessagestackRemoteActionCompatParcelizer = getiscurrentlydisplayinginappmessage.write.RemoteActionCompatParcelizer(i2);
                if (getinappmessagestackRemoteActionCompatParcelizer != null) {
                    strDecode = Uri.decode(getinappmessagestackRemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                    strDecode.getClass();
                }
                if (strDecode == null) {
                    strDecode = "";
                }
                try {
                    RemoteActionCompatParcelizer(bundle, str, strDecode, (addArcRad) map.get(str));
                    arrayList2.add(createFromParcel.INSTANCE);
                    i = i2;
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                androidx.sqlite.SQLite.serializer();
                throw null;
            }
        }
        return true;
    }
}
