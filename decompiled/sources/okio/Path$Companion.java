package okio;

import androidx.compose.ui.graphics.Fields;
import com.data.error.ApiException;
import com.data.error.TooManyRequestsException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.net.zza;
import com.huawei.hms.android.SystemUtils;
import io.sentry.metrics.MetricsBatchProcessor;
import java.io.File;
import java.io.InterruptedIOException;
import java.lang.ref.ReferenceQueue;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import o.AndroidUiFrameClockwithFrameNanos22;
import o.ApiExceptionBadRequest;
import o.BackspaceCommand;
import o.CharHelpers_androidKt;
import o.FragmentManagerFragmentLifecycleCallbacks;
import o.RecyclableBufferedInputStream;
import o.RegistryMissingComponentException;
import o.RequestBuilder;
import o.SetRetainInstanceUsageViolation;
import o.SetUserVisibleHintViolation;
import o.SimpleItemTouchHelperCallback;
import o.accessgetInstancedelegatecp;
import o.addSubLayer;
import o.copyNOaFTUodefault;
import o.displayInAppMessagelambda1;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.findFollowingBreak;
import o.findFragmentByTag;
import o.getCieXyz;
import o.getDefaultIndentationXSAIIZE;
import o.getFragment;
import o.getHandwritingSlop;
import o.getInAppMessageStackannotations;
import o.getMinimumFlingVelocity;
import o.getPlacementScope;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.rg;
import o.safeSetClipToOutline;
import o.setShadow;
import o.substringWithoutParagraphStyles;
import o.substringWithoutParagraphStyleslambda0;
import o.supportStartPostponedEnterTransition;
import o.toLowerCase;
import o.validateRequestPermissionsRequestCode;
import o.withAnnotation;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes4.dex */
public final class Path$Companion implements getPlacementScope, setShadow {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    @Override // o.setShadow
    public Map write() {
        int i = 2 % 2;
        int i2 = read + 79;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return SimpleItemTouchHelperCallback.serializer;
        }
        int i3 = 44 / 0;
        return SimpleItemTouchHelperCallback.serializer;
    }

    public static RecyclableBufferedInputStream RemoteActionCompatParcelizer(File file) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String str = RecyclableBufferedInputStream.DIRECTORY_SEPARATOR;
            String string = file.toString();
            string.getClass();
            return IconCompatParcelizer(string);
        }
        String str2 = RecyclableBufferedInputStream.DIRECTORY_SEPARATOR;
        String string2 = file.toString();
        string2.getClass();
        IconCompatParcelizer(string2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RecyclableBufferedInputStream IconCompatParcelizer(String str) {
        int i = 2 % 2;
        str.getClass();
        RequestBuilder requestBuilder = ApiExceptionBadRequest.write;
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        registryMissingComponentException.IconCompatParcelizer(str);
        RecyclableBufferedInputStream recyclableBufferedInputStreamSerializer = ApiExceptionBadRequest.serializer(registryMissingComponentException, false);
        int i2 = RemoteActionCompatParcelizer + 19;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return recyclableBufferedInputStreamSerializer;
    }

    @Override // o.getPlacementScope
    public Object create(MetricsBatchProcessor metricsBatchProcessor) {
        int i = 2 % 2;
        AndroidUiFrameClockwithFrameNanos22 androidUiFrameClockwithFrameNanos22 = new AndroidUiFrameClockwithFrameNanos22();
        getMinimumFlingVelocity getminimumflingvelocity = new getMinimumFlingVelocity(0);
        ReferenceQueue referenceQueue = androidUiFrameClockwithFrameNanos22.IconCompatParcelizer;
        Set set = androidUiFrameClockwithFrameNanos22.RemoteActionCompatParcelizer;
        set.add(new getHandwritingSlop(androidUiFrameClockwithFrameNanos22, referenceQueue, set, getminimumflingvelocity));
        Thread thread = new Thread(new zza(referenceQueue, 26, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        int i2 = RemoteActionCompatParcelizer + 37;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return androidUiFrameClockwithFrameNanos22;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static safeSetClipToOutline RemoteActionCompatParcelizer(Throwable th) {
        int i = 2 % 2;
        rg rgVarSerializer = serializer(th);
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.put("errorMsg", rgVarSerializer.IconCompatParcelizer());
        String strRemoteActionCompatParcelizer = rgVarSerializer.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer == null) {
            int i2 = read + 117;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            strRemoteActionCompatParcelizer = "none";
        }
        safesetcliptooutline.put("errorCode", strRemoteActionCompatParcelizer);
        String strIconCompatParcelizer = displayInAppMessagelambda1.serializer(th.getClass()).IconCompatParcelizer();
        if (strIconCompatParcelizer == null) {
            int i4 = RemoteActionCompatParcelizer + 29;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            strIconCompatParcelizer = SystemUtils.UNKNOWN;
        }
        safesetcliptooutline.put("errorType", strIconCompatParcelizer);
        return safesetcliptooutline.IconCompatParcelizer();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static Integer write(int i, List list) {
        ArrayList arrayList;
        Iterator it;
        int i2;
        int size;
        int i3;
        int i4;
        Object next;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 115;
        read = i6 % Fields.SpotShadowColor;
        Object obj = null;
        if (i6 % 2 == 0) {
            int i7 = 33 / 0;
            if (i >= 0) {
                if (i < 101) {
                    arrayList = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        i4 = read + 33;
                        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            ((Number) it.next()).intValue();
                            obj.hashCode();
                            throw null;
                        }
                        next = it.next();
                        if (((Number) next).intValue() < 0) {
                            arrayList.add(next);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        List listPlaybackStateCompatCustomAction = onContentCardDismissed.PlaybackStateCompatCustomAction(arrayList);
                        double size2 = (((double) i) / 100.0d) * ((double) (listPlaybackStateCompatCustomAction.size() - 1));
                        int i8 = (int) size2;
                        i2 = i8 + 1;
                        size = listPlaybackStateCompatCustomAction.size() - 1;
                        if (i2 > size) {
                            i3 = read + 19;
                            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                            if (i3 % 2 == 0) {
                                throw null;
                            }
                            i2 = size;
                        }
                        return Integer.valueOf(MathKt.write(((size2 - ((double) i8)) * ((double) (((Number) listPlaybackStateCompatCustomAction.get(i2)).intValue() - ((Number) listPlaybackStateCompatCustomAction.get(i8)).intValue()))) + ((Number) listPlaybackStateCompatCustomAction.get(i8)).doubleValue()));
                    }
                }
            }
        } else if (i >= 0) {
            if (i < 101) {
                arrayList = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    i4 = read + 33;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        ((Number) it.next()).intValue();
                        obj.hashCode();
                        throw null;
                    }
                    next = it.next();
                    if (((Number) next).intValue() < 0) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    List listPlaybackStateCompatCustomAction2 = onContentCardDismissed.PlaybackStateCompatCustomAction(arrayList);
                    double size3 = (((double) i) / 100.0d) * ((double) (listPlaybackStateCompatCustomAction2.size() - 1));
                    int i9 = (int) size3;
                    i2 = i9 + 1;
                    size = listPlaybackStateCompatCustomAction2.size() - 1;
                    if (i2 > size) {
                        i3 = read + 19;
                        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 == 0) {
                            throw null;
                        }
                        i2 = size;
                    }
                    return Integer.valueOf(MathKt.write(((size3 - ((double) i9)) * ((double) (((Number) listPlaybackStateCompatCustomAction2.get(i2)).intValue() - ((Number) listPlaybackStateCompatCustomAction2.get(i9)).intValue()))) + ((Number) listPlaybackStateCompatCustomAction2.get(i9)).doubleValue()));
                }
            }
        }
        return null;
    }

    public static findFollowingBreak serializer(toLowerCase tolowercase) {
        int i = 2 % 2;
        tolowercase.getClass();
        List listRemoteActionCompatParcelizer = tolowercase.RemoteActionCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        Iterator it = listRemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            List<substringWithoutParagraphStyles> listSerializer = ((substringWithoutParagraphStyleslambda0) it.next()).serializer();
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(listSerializer, 10));
            for (substringWithoutParagraphStyles substringwithoutparagraphstyles : listSerializer) {
                arrayList2.add(new getDefaultIndentationXSAIIZE(substringwithoutparagraphstyles.serializer(), substringwithoutparagraphstyles.read(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(tolowercase.serializer(), substringwithoutparagraphstyles.RemoteActionCompatParcelizer()), substringwithoutparagraphstyles.IconCompatParcelizer(), substringwithoutparagraphstyles.write()));
            }
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) arrayList2, (Collection) arrayList);
        }
        String strIconCompatParcelizer = tolowercase.IconCompatParcelizer();
        String strSerializer = tolowercase.serializer();
        List<withAnnotation> list = tolowercase.read();
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (withAnnotation withannotation : list) {
            arrayList3.add(new CharHelpers_androidKt(withannotation.read(), withannotation.write(), withannotation.RemoteActionCompatParcelizer()));
            int i2 = read + 81;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        List<withAnnotation> listWrite = tolowercase.write();
        ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(listWrite, 10));
        int i4 = read + 11;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 3 / 3;
        }
        for (withAnnotation withannotation2 : listWrite) {
            arrayList4.add(new CharHelpers_androidKt(withannotation2.read(), withannotation2.write(), withannotation2.RemoteActionCompatParcelizer()));
        }
        return new findFollowingBreak(strIconCompatParcelizer, strSerializer, arrayList3, arrayList4, arrayList);
    }

    public static Throwable IconCompatParcelizer(Throwable th) {
        int i = 2 % 2;
        ApiException apiException = !((th instanceof ApiException) ^ true) ? (ApiException) th : null;
        if (apiException != null) {
            int i2 = RemoteActionCompatParcelizer + 119;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (apiException.RemoteActionCompatParcelizer() == 400) {
                copyNOaFTUodefault copynoaftuodefault = new copyNOaFTUodefault(((ApiException) th).getMessage());
                int i4 = read + 7;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return copynoaftuodefault;
            }
        }
        return th;
    }

    public static supportStartPostponedEnterTransition IconCompatParcelizer(ArrayList arrayList, SetRetainInstanceUsageViolation setRetainInstanceUsageViolation) {
        getFragment getfragment;
        getFragment getfragment2;
        int i = 2 % 2;
        ArrayList<FragmentManagerFragmentLifecycleCallbacks> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((FragmentManagerFragmentLifecycleCallbacks) obj).serializer == SetUserVisibleHintViolation.FILL) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((FragmentManagerFragmentLifecycleCallbacks) obj3).serializer == SetUserVisibleHintViolation.CENTER) {
                        arrayList4.add(obj3);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (((FragmentManagerFragmentLifecycleCallbacks) obj4).serializer == SetUserVisibleHintViolation.END) {
                        int i2 = RemoteActionCompatParcelizer + 27;
                        read = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 == 0) {
                            arrayList5.add(obj4);
                            throw null;
                        }
                        arrayList5.add(obj4);
                    }
                }
                int iMax = Math.max(arrayList3.size(), Math.max(arrayList4.size(), arrayList5.size()));
                ArrayList arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
                for (FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks : arrayList2) {
                    arrayList6.add(new findFragmentByTag(null, fragmentManagerFragmentLifecycleCallbacks.write, null, fragmentManagerFragmentLifecycleCallbacks.read, 5));
                }
                ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(iMax)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
                ArrayList arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(ensuresubscribedtoinappmessageeventslambda7, 10));
                getInAppMessageStackannotations getinappmessagestackannotationsSerializer = ensuresubscribedtoinappmessageeventslambda7.iterator();
                while (getinappmessagestackannotationsSerializer.RemoteActionCompatParcelizer) {
                    int iRemoteActionCompatParcelizer = getinappmessagestackannotationsSerializer.RemoteActionCompatParcelizer();
                    FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks2 = (FragmentManagerFragmentLifecycleCallbacks) onContentCardDismissed.read(iRemoteActionCompatParcelizer, arrayList3);
                    if (fragmentManagerFragmentLifecycleCallbacks2 != null) {
                        int i3 = RemoteActionCompatParcelizer + 95;
                        read = i3 % Fields.SpotShadowColor;
                        int i4 = i3 % 2;
                        getfragment = fragmentManagerFragmentLifecycleCallbacks2.write;
                    } else {
                        getfragment = null;
                    }
                    FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks3 = (FragmentManagerFragmentLifecycleCallbacks) onContentCardDismissed.read(iRemoteActionCompatParcelizer, arrayList4);
                    if (fragmentManagerFragmentLifecycleCallbacks3 != null) {
                        int i5 = read + 39;
                        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        getfragment2 = fragmentManagerFragmentLifecycleCallbacks3.write;
                    } else {
                        getfragment2 = null;
                    }
                    FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks4 = (FragmentManagerFragmentLifecycleCallbacks) onContentCardDismissed.read(iRemoteActionCompatParcelizer, arrayList5);
                    arrayList7.add(new findFragmentByTag(getfragment, getfragment2, fragmentManagerFragmentLifecycleCallbacks4 != null ? fragmentManagerFragmentLifecycleCallbacks4.write : null, false, 8));
                }
                Iterable iterableIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList7, arrayList6);
                int i7 = validateRequestPermissionsRequestCode.IconCompatParcelizer[setRetainInstanceUsageViolation.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    iterableIconCompatParcelizer = onContentCardDismissed.MediaMetadataCompat(iterableIconCompatParcelizer);
                }
                return new supportStartPostponedEnterTransition(removeNodeAtDepth.RemoteActionCompatParcelizer(iterableIconCompatParcelizer));
            }
            int i8 = RemoteActionCompatParcelizer + 33;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                SetUserVisibleHintViolation setUserVisibleHintViolation = ((FragmentManagerFragmentLifecycleCallbacks) it.next()).serializer;
                SetUserVisibleHintViolation setUserVisibleHintViolation2 = SetUserVisibleHintViolation.START;
                obj2.hashCode();
                throw null;
            }
            Object next = it.next();
            if (((FragmentManagerFragmentLifecycleCallbacks) next).serializer == SetUserVisibleHintViolation.START) {
                arrayList3.add(next);
            }
        }
    }

    public static rg serializer(Throwable th) {
        HttpException httpException;
        String strValueOf;
        String str;
        String strValueOf2;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        int i = 2 % 2;
        Integer numValueOf = null;
        if (th instanceof ApiException) {
            ApiException apiException = (ApiException) th;
            String str2 = apiException.read().originalMessage;
            String strConcat = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                int i2 = RemoteActionCompatParcelizer + 63;
                read = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                String str3 = apiException.read().originalMessage;
                if (str3 != null) {
                    strConcat = str3;
                }
            } else if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) apiException.getMessage())) {
                String str4 = apiException.read().localizeKey;
                if (str4 == null) {
                    int i4 = read + 1;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    str4 = "";
                }
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4)) {
                    strConcat = "Exception is " + apiException.read() + " with status code: " + apiException.RemoteActionCompatParcelizer();
                } else {
                    String str5 = apiException.read().localizeKey;
                    strConcat = "No error messages. Error localized key: ".concat(str5 != null ? str5 : "");
                }
            } else {
                int i6 = RemoteActionCompatParcelizer + 31;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    "No original message. Translated: ".concat(apiException.getMessage());
                    throw null;
                }
                strConcat = "No original message. Translated: ".concat(apiException.getMessage());
            }
            return new rg("Api exception message: ".concat(strConcat), String.valueOf(apiException.RemoteActionCompatParcelizer()));
        }
        if (pauseWebviewIfNecessarylambda10.IconCompatParcelizer(th)) {
            while (th != null) {
                if (th instanceof SocketTimeoutException) {
                    onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("Request timed out", "524");
                } else if (th instanceof InterruptedIOException) {
                    onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("Connection interrupted", "524");
                } else if (th instanceof SSLHandshakeException) {
                    onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("SSL handshake failed", "525");
                } else if (th instanceof UnknownHostException) {
                    onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("DNS resolution failed", "523");
                } else {
                    onviewattachedtowindowlambda0 = th instanceof ConnectException ? new onViewAttachedToWindowlambda0("Connection refused", "521") : null;
                }
                if (onviewattachedtowindowlambda0 != null) {
                    return new rg((String) onviewattachedtowindowlambda0.serializer, (String) onviewattachedtowindowlambda0.write);
                }
                th = !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{th.getCause(), th}, getCieXyz.write())).booleanValue() ? th.getCause() : null;
            }
            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("No internet connection", "520");
            return new rg((String) onviewattachedtowindowlambda0.serializer, (String) onviewattachedtowindowlambda0.write);
        }
        if (th instanceof TooManyRequestsException) {
            return new rg("Too many requests", "429");
        }
        boolean z = th instanceof addSubLayer;
        String str6 = "none";
        String str7 = SystemUtils.UNKNOWN;
        if (z) {
            int i7 = read + 109;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            String message = th.getMessage();
            if (message != null) {
                str7 = message;
            }
            int i9 = ((addSubLayer) th).httpErrorCode;
            if (i9 > 0) {
                int i10 = read + 7;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                numValueOf = Integer.valueOf(i9);
            }
            if (numValueOf != null && (strValueOf2 = String.valueOf(numValueOf.intValue())) != null) {
                str6 = strValueOf2;
            }
            return new rg(str7, str6);
        }
        Throwable cause = th;
        while (true) {
            if (cause == null) {
                httpException = null;
                break;
            }
            int i12 = read + 53;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            if (cause instanceof HttpException) {
                httpException = (HttpException) cause;
                break;
            }
            cause = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cause.getCause(), cause}, getCieXyz.write())).booleanValue() ? null : cause.getCause();
        }
        if (httpException == null || (str = httpException.RemoteActionCompatParcelizer) == null) {
            String message2 = th.getMessage();
            if (message2 == null) {
                int i14 = RemoteActionCompatParcelizer + 27;
                read = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0) {
                    numValueOf.hashCode();
                    throw null;
                }
            } else {
                str7 = message2;
            }
        } else {
            str7 = str;
        }
        if (httpException != null && (strValueOf = String.valueOf(httpException.read)) != null) {
            str6 = strValueOf;
        }
        rg rgVar = new rg("Unknown exception type with message: ".concat(str7), str6);
        int i15 = read + 55;
        RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
        if (i15 % 2 != 0) {
            int i16 = 8 / 0;
        }
        return rgVar;
    }
}
