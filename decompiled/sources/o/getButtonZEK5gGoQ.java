package o;

import android.content.Context;
import android.os.RemoteException;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.gtm.zzbv;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.location.nlp.network.OnlineLocationService;
import io.grpc.LoadBalancer$Helper;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class getButtonZEK5gGoQ {
    public final OnVisibilityChangedNode IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final getHomeEK5gGoQ MediaDescriptionCompat;
    public final getHomeEK5gGoQ MediaMetadataCompat;
    public final getF1EK5gGoQ MediaSessionCompatQueueItem;
    public getButton3EK5gGoQ PlaybackStateCompat;
    public final HashSet RatingCompat;
    public final setLastReportedResult RemoteActionCompatParcelizer;
    public final androidx.emoji2.text.EmojiProcessor read;
    public final Context serializer;
    public final zzbv write;

    public final getFunctionEK5gGoQ IconCompatParcelizer(getFiveEK5gGoQ getfiveek5ggoq) {
        int i = getfiveek5ggoq.write;
        List list = getfiveek5ggoq.read;
        Object obj = getfiveek5ggoq.IconCompatParcelizer;
        switch (i) {
            case 1:
                try {
                    return new getGEK5gGoQ(Double.valueOf(Double.parseDouble((String) obj)));
                } catch (NumberFormatException unused) {
                    return new getInfoEK5gGoQ((String) obj);
                }
            case 2:
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(list2.size());
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(IconCompatParcelizer((getFiveEK5gGoQ) it.next()));
                }
                return new getHenkanEK5gGoQ(arrayList);
            case 3:
                Map map = (Map) obj;
                HashMap map2 = new HashMap(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    getFunctionEK5gGoQ getfunctionek5ggoqIconCompatParcelizer = IconCompatParcelizer((getFiveEK5gGoQ) entry.getKey());
                    map2.put(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqIconCompatParcelizer), IconCompatParcelizer((getFiveEK5gGoQ) entry.getValue()));
                }
                return new getHomeEK5gGoQ(map2);
            case 4:
                getFunctionEK5gGoQ getfunctionek5ggoq = read((String) obj);
                if (!(getfunctionek5ggoq instanceof getInfoEK5gGoQ) || list.isEmpty()) {
                    return getfunctionek5ggoq;
                }
                String strReplaceAll = ((getInfoEK5gGoQ) getfunctionek5ggoq).RemoteActionCompatParcelizer;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((Integer) it2.next()).intValue() == 12) {
                        try {
                            strReplaceAll = URLEncoder.encode(strReplaceAll, com.adjust.sdk.Constants.ENCODING).replaceAll("\\+", "%20");
                        } catch (UnsupportedEncodingException e) {
                            getButtonThumbLeftEK5gGoQ.IconCompatParcelizer("Escape URI: unsupported encoding", e);
                        }
                    }
                }
                return new getInfoEK5gGoQ(strReplaceAll);
            case 5:
                return new getInfoEK5gGoQ((String) obj);
            case 6:
                return new getGEK5gGoQ(Double.valueOf(((Integer) obj).doubleValue()));
            case 7:
                StringBuilder sb = new StringBuilder();
                Iterator it3 = ((List) obj).iterator();
                while (it3.hasNext()) {
                    sb.append(LoadBalancer$Helper.IconCompatParcelizer(IconCompatParcelizer((getFiveEK5gGoQ) it3.next())));
                }
                return new getInfoEK5gGoQ(sb.toString());
            default:
                return new getGuideEK5gGoQ((Boolean) obj);
        }
    }

    public final getFunctionEK5gGoQ IconCompatParcelizer(getFourEK5gGoQ getfourek5ggoq) {
        this.RatingCompat.clear();
        try {
            getFunctionEK5gGoQ getfunctionek5ggoqWrite = write(write(getfourek5ggoq.serializer));
            if (getfunctionek5ggoqWrite instanceof getGuideEK5gGoQ) {
                return getfunctionek5ggoqWrite;
            }
            getButton5EK5gGoQ.RemoteActionCompatParcelizer(this.serializer, "Predicate must return a boolean value");
            return new getGuideEK5gGoQ(Boolean.FALSE);
        } catch (IllegalStateException unused) {
            getButtonThumbLeftEK5gGoQ.write("Error evaluating predicate.");
            return getHelpEK5gGoQ.serializer;
        }
    }

    public final void serializer(getButton15EK5gGoQ getbutton15ek5ggoq, getDirectionDownRightEK5gGoQ getdirectiondownrightek5ggoq) {
        HashMap map = getCtrlRightEK5gGoQ.RemoteActionCompatParcelizer;
        String string = getbutton15ek5ggoq.toString();
        HashMap map2 = getCtrlRightEK5gGoQ.RemoteActionCompatParcelizer;
        this.MediaDescriptionCompat.write(new getGraveEK5gGoQ(getdirectiondownrightek5ggoq), map2.containsKey(string) ? ((getDEK5gGoQ) map2.get(string)).write : null);
    }

    public final void serializer(getButton3EK5gGoQ getbutton3ek5ggoq) {
        Context context;
        getHelpEK5gGoQ gethelpek5ggoq;
        getFunctionEK5gGoQ getguideek5ggoq;
        getInfoEK5gGoQ getinfoek5ggoq = new getInfoEK5gGoQ(getbutton3ek5ggoq.serializer);
        zzbv zzbvVar = this.write;
        zzbvVar.serializer((getFunctionEK5gGoQ) getinfoek5ggoq, "gtm.globals.eventName");
        getF1EK5gGoQ getf1ek5ggoq = this.MediaSessionCompatQueueItem;
        getf1ek5ggoq.getClass();
        getf1ek5ggoq.read = getbutton3ek5ggoq;
        this.PlaybackStateCompat = getbutton3ek5ggoq;
        HashSet<getFourEK5gGoQ> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        Iterator it = ((List) this.read.serializer).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            context = this.serializer;
            if (!zHasNext) {
                break;
            }
            getForwardEK5gGoQ getforwardek5ggoq = (getForwardEK5gGoQ) it.next();
            if (getforwardek5ggoq.read().isEmpty() && getforwardek5ggoq.write().isEmpty()) {
                "Trigger is not being evaluated since it has no associated tags: ".concat(String.valueOf(getforwardek5ggoq));
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
            } else {
                "Evaluating trigger ".concat(String.valueOf(getforwardek5ggoq));
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                Iterator it2 = getforwardek5ggoq.serializer().iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    gethelpek5ggoq = getHelpEK5gGoQ.serializer;
                    if (zHasNext2) {
                        getFourEK5gGoQ getfourek5ggoq = (getFourEK5gGoQ) it2.next();
                        getFunctionEK5gGoQ getfunctionek5ggoqIconCompatParcelizer = (getFunctionEK5gGoQ) map.get(getfourek5ggoq);
                        if (getfunctionek5ggoqIconCompatParcelizer == null) {
                            getfunctionek5ggoqIconCompatParcelizer = IconCompatParcelizer(getfourek5ggoq);
                            map.put(getfourek5ggoq, getfunctionek5ggoqIconCompatParcelizer);
                        }
                        if (getfunctionek5ggoqIconCompatParcelizer != gethelpek5ggoq) {
                            if (((getGuideEK5gGoQ) getfunctionek5ggoqIconCompatParcelizer).RemoteActionCompatParcelizer.booleanValue()) {
                                getguideek5ggoq = new getGuideEK5gGoQ(Boolean.FALSE);
                                break;
                            }
                        } else {
                            getguideek5ggoq = gethelpek5ggoq;
                            break;
                        }
                    } else {
                        Iterator it3 = getforwardek5ggoq.IconCompatParcelizer().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                getguideek5ggoq = new getGuideEK5gGoQ(Boolean.TRUE);
                                break;
                            }
                            getFourEK5gGoQ getfourek5ggoq2 = (getFourEK5gGoQ) it3.next();
                            getFunctionEK5gGoQ getfunctionek5ggoqIconCompatParcelizer2 = (getFunctionEK5gGoQ) map.get(getfourek5ggoq2);
                            if (getfunctionek5ggoqIconCompatParcelizer2 == null) {
                                getfunctionek5ggoqIconCompatParcelizer2 = IconCompatParcelizer(getfourek5ggoq2);
                                map.put(getfourek5ggoq2, getfunctionek5ggoqIconCompatParcelizer2);
                            }
                            if (getfunctionek5ggoqIconCompatParcelizer2 != gethelpek5ggoq) {
                                if (!((getGuideEK5gGoQ) getfunctionek5ggoqIconCompatParcelizer2).RemoteActionCompatParcelizer.booleanValue()) {
                                    getguideek5ggoq = new getGuideEK5gGoQ(Boolean.FALSE);
                                    break;
                                }
                            } else {
                                getguideek5ggoq = gethelpek5ggoq;
                                break;
                            }
                        }
                    }
                }
                if (getguideek5ggoq == gethelpek5ggoq) {
                    getButton5EK5gGoQ.read(context, "Error encounted while evaluating trigger ".concat(String.valueOf(getforwardek5ggoq)));
                    if (!getforwardek5ggoq.write().isEmpty()) {
                        "Blocking tags: ".concat(String.valueOf(getforwardek5ggoq.write()));
                        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                        hashSet2.addAll(getforwardek5ggoq.write());
                    }
                } else if (((getGuideEK5gGoQ) getguideek5ggoq).RemoteActionCompatParcelizer.booleanValue()) {
                    "Trigger is firing: ".concat(String.valueOf(getforwardek5ggoq));
                    ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                    if (!getforwardek5ggoq.read().isEmpty()) {
                        "Adding tags to firing candidates: ".concat(String.valueOf(getforwardek5ggoq.read()));
                        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                        hashSet.addAll(getforwardek5ggoq.read());
                    }
                    if (!getforwardek5ggoq.write().isEmpty()) {
                        "Blocking disabled tags: ".concat(String.valueOf(getforwardek5ggoq.write()));
                        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                        hashSet2.addAll(getforwardek5ggoq.write());
                    }
                }
            }
        }
        hashSet.removeAll(hashSet2);
        boolean z = false;
        for (getFourEK5gGoQ getfourek5ggoq3 : hashSet) {
            this.RatingCompat.clear();
            "Executing firing tag ".concat(String.valueOf(getfourek5ggoq3));
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
            try {
                write(write(getfourek5ggoq3.serializer));
                getFiveEK5gGoQ getfiveek5ggoq = (getFiveEK5gGoQ) getfourek5ggoq3.serializer.get(getButtonL1EK5gGoQ.DISPATCH_ON_FIRE.toString());
                if (getfiveek5ggoq != null && getfiveek5ggoq.write == 8 && ((Boolean) getfiveek5ggoq.IconCompatParcelizer).booleanValue()) {
                    z = true;
                    String.valueOf(getfourek5ggoq3);
                    ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                }
            } catch (IllegalStateException e) {
                getButton5EK5gGoQ.IconCompatParcelizer("Error firing tag " + String.valueOf(getfourek5ggoq3) + ": ", e, context);
            }
        }
        zzbvVar.RatingCompat();
        if (getbutton3ek5ggoq.MediaMetadataCompat) {
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
            try {
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getbutton3ek5ggoq.RemoteActionCompatParcelizer.getTime(), getbutton3ek5ggoq.write, getbutton3ek5ggoq.IconCompatParcelizer, getbutton3ek5ggoq.serializer);
            } catch (RemoteException e2) {
                getButton5EK5gGoQ.IconCompatParcelizer("Error calling measurement proxy: ", e2, context);
            }
        } else {
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
        }
        if (z) {
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
            getButton7EK5gGoQ.write(context);
            if (getCameraEK5gGoQ.write == null) {
                getCameraEK5gGoQ.write = new getCameraEK5gGoQ();
            }
            getCameraEK5gGoQ.write.write();
        }
    }

    public final HashMap write(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), IconCompatParcelizer((getFiveEK5gGoQ) entry.getValue()));
        }
        return map2;
    }

    public final getFunctionEK5gGoQ write(HashMap map) {
        HashMap map2;
        getIEK5gGoQ getiek5ggoq;
        getFunctionEK5gGoQ getfunctionek5ggoq = (getFunctionEK5gGoQ) map.get(getButtonL1EK5gGoQ.FUNCTION.toString());
        boolean z = getfunctionek5ggoq instanceof getInfoEK5gGoQ;
        getHelpEK5gGoQ gethelpek5ggoq = getHelpEK5gGoQ.read;
        Context context = this.serializer;
        if (!z) {
            getButton5EK5gGoQ.RemoteActionCompatParcelizer(context, "No function id in properties");
            return gethelpek5ggoq;
        }
        String str = ((getInfoEK5gGoQ) getfunctionek5ggoq).RemoteActionCompatParcelizer;
        zzbv zzbvVar = this.write;
        if (zzbvVar.serializer(str)) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((String) entry.getKey()).startsWith("vtp_")) {
                    map3.put(((String) entry.getKey()).substring(4), (getFunctionEK5gGoQ) entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new getHomeEK5gGoQ(map3));
            getiek5ggoq = new getIEK5gGoQ(str, arrayList);
        } else {
            HashMap map4 = getCtrlRightEK5gGoQ.RemoteActionCompatParcelizer;
            String str2 = map4.containsKey(str) ? ((getDEK5gGoQ) map4.get(str)).write : null;
            if (str2 == null || (map2 = this.MediaDescriptionCompat.write) == null || !map2.containsKey(str2)) {
                getButton5EK5gGoQ.RemoteActionCompatParcelizer(context, "functionId '" + str + "' is not supported");
                return gethelpek5ggoq;
            }
            try {
                getiek5ggoq = getCtrlRightEK5gGoQ.read(str, map);
            } catch (RuntimeException e) {
                getButtonThumbLeftEK5gGoQ.write("Incorrect keys for function " + str + ". " + e.getMessage());
                getiek5ggoq = null;
            }
        }
        if (getiek5ggoq == null) {
            getButton5EK5gGoQ.RemoteActionCompatParcelizer(context, "Internal error: failed to convert function to a valid statement");
            return gethelpek5ggoq;
        }
        "Executing: ".concat(String.valueOf(getiek5ggoq.RemoteActionCompatParcelizer));
        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
        getFunctionEK5gGoQ getfunctionek5ggoqIconCompatParcelizer = androidx.room.Room.IconCompatParcelizer(zzbvVar, getiek5ggoq);
        if (!(getfunctionek5ggoqIconCompatParcelizer instanceof getHelpEK5gGoQ)) {
            return getfunctionek5ggoqIconCompatParcelizer;
        }
        getHelpEK5gGoQ gethelpek5ggoq2 = (getHelpEK5gGoQ) getfunctionek5ggoqIconCompatParcelizer;
        return gethelpek5ggoq2.MediaBrowserCompatMediaItem ? gethelpek5ggoq2.MediaSessionCompatQueueItem : getfunctionek5ggoqIconCompatParcelizer;
    }

    public final getFunctionEK5gGoQ read(String str) {
        this.MediaBrowserCompatMediaItem++;
        read();
        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
        HashSet hashSet = this.RatingCompat;
        if (hashSet.contains(str)) {
            this.MediaBrowserCompatMediaItem--;
            ScreenStartObserver$$ExternalSyntheticLambda0.write(af$$ExternalSyntheticOutline0.m("Macro cycle detected.  Current macro reference: ", str, ". Previous macro references: ", hashSet.toString()));
            return null;
        }
        hashSet.add(str);
        getFourEK5gGoQ getfourek5ggoq = (getFourEK5gGoQ) ((Map) this.read.read).get(str);
        if (getfourek5ggoq == null) {
            this.MediaBrowserCompatMediaItem--;
            hashSet.remove(str);
            ScreenStartObserver$$ExternalSyntheticLambda0.write(af$$ExternalSyntheticOutline0.m(read(), "Attempting to resolve unknown macro ", str));
            return null;
        }
        getFunctionEK5gGoQ getfunctionek5ggoqWrite = write(write(getfourek5ggoq.serializer));
        read();
        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
        this.MediaBrowserCompatMediaItem--;
        hashSet.remove(str);
        return getfunctionek5ggoqWrite;
    }

    public final String read() {
        if (this.MediaBrowserCompatMediaItem <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.MediaBrowserCompatMediaItem));
        for (int i = 2; i < this.MediaBrowserCompatMediaItem; i++) {
            sb.append(' ');
        }
        sb.append(": ");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getButtonZEK5gGoQ(Context context, String str, androidx.emoji2.text.EmojiProcessor emojiProcessor, applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0, setLastReportedResult setlastreportedresult, OnVisibilityChangedNode onVisibilityChangedNode) {
        int i = 0;
        zzbv zzbvVar = new zzbv(0, (Object) null);
        this.write = zzbvVar;
        getHomeEK5gGoQ gethomeek5ggoq = new getHomeEK5gGoQ(new HashMap(50));
        this.MediaDescriptionCompat = gethomeek5ggoq;
        getHomeEK5gGoQ gethomeek5ggoq2 = new getHomeEK5gGoQ(new HashMap(10));
        this.MediaMetadataCompat = gethomeek5ggoq2;
        this.RatingCompat = new HashSet();
        getCEK5gGoQ getcek5ggoq = new getCEK5gGoQ(this);
        accessgetSystemNavigationDowncp.serializer(applydisplaycutoutmarginstocontentarealambda0, "Internal Error: Runtime resource cannot be null");
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str, "Internal Error: ContainerId cannot be empty");
        accessgetSystemNavigationDowncp.IconCompatParcelizer(setlastreportedresult);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(onVisibilityChangedNode);
        this.serializer = context;
        this.read = emojiProcessor;
        this.RemoteActionCompatParcelizer = setlastreportedresult;
        this.IconCompatParcelizer = onVisibilityChangedNode;
        int i2 = 1;
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(i2)), "1");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionLeftEK5gGoQ(19)), "12");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionLeftEK5gGoQ(20)), "18");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionLeftEK5gGoQ(21)), "19");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionLeftEK5gGoQ(22)), "20");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionLeftEK5gGoQ(23)), "21");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionLeftEK5gGoQ(24)), "23");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionLeftEK5gGoQ(25)), "24");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionLeftEK5gGoQ(26)), "27");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionLeftEK5gGoQ(27)), "28");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionLeftEK5gGoQ(28)), "29");
        int i3 = 2;
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(i3)), "30");
        int i4 = 29;
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionLeftEK5gGoQ(i4)), "32");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionLeftEK5gGoQ(i4)), "33");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(i)), "34");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(i)), "35");
        int i5 = 3;
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(i5)), "39");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(i2)), "40");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(12)), "0");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(13)), "10");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(14)), "25");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(15)), "26");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(16)), "37");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(i3)), "2");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(i5)), "3");
        int i6 = 4;
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(i6)), OnlineLocationService.SRC_DEFAULT);
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(i6)), "5");
        int i7 = 5;
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(i7)), "6");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(i7)), "7");
        int i8 = 6;
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(i8)), "8");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(i6)), "9");
        int i9 = 7;
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(i9)), "13");
        int i10 = 8;
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(i10)), "47");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionUpLeftEK5gGoQ()), "15");
        getDirectionDownLeftEK5gGoQ getdirectiondownleftek5ggoq = new getDirectionDownLeftEK5gGoQ(i8);
        getDirectionDownLeftEK5gGoQ.serializer = this;
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(getdirectiondownleftek5ggoq), "48");
        getDirectionUpRightEK5gGoQ getdirectionuprightek5ggoq = new getDirectionUpRightEK5gGoQ(1);
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(getdirectionuprightek5ggoq), "16");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(getdirectionuprightek5ggoq), "17");
        int i11 = 9;
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(i11)), "22");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(i9)), "45");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(i10)), "46");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(10)), "36");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionUpRightEK5gGoQ(2)), "43");
        int i12 = 11;
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDvrEK5gGoQ(i12)), "38");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(i11)), "44");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(10)), "41");
        zzbvVar.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(i12)), "42");
        serializer(getButton15EK5gGoQ.CONTAINS, new getDirectionUpEK5gGoQ(13));
        serializer(getButton15EK5gGoQ.ENDS_WITH, new getDirectionUpEK5gGoQ(14));
        serializer(getButton15EK5gGoQ.EQUALS, new getDirectionUpEK5gGoQ(15));
        serializer(getButton15EK5gGoQ.GREATER_EQUALS, new getF12EK5gGoQ(0));
        serializer(getButton15EK5gGoQ.GREATER_THAN, new getF12EK5gGoQ(i2));
        serializer(getButton15EK5gGoQ.LESS_EQUALS, new getF12EK5gGoQ(2));
        serializer(getButton15EK5gGoQ.LESS_THAN, new getF12EK5gGoQ(3));
        serializer(getButton15EK5gGoQ.REGEX, new getDirectionUpEK5gGoQ(16));
        serializer(getButton15EK5gGoQ.STARTS_WITH, new getDirectionUpEK5gGoQ(17));
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEndCallEK5gGoQ(context, 0)), "advertiserId");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEndCallEK5gGoQ(context, 1)), "advertiserTrackingEnabled");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEightEK5gGoQ(getcek5ggoq, i2)), "adwordsClickReferrer");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEnterEK5gGoQ(context, 0, 0 == true ? 1 : 0)), "applicationId");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEnterEK5gGoQ(context, i2, 0 == true ? 1 : 0)), "applicationName");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEnterEK5gGoQ(context, 2)), "applicationVersion");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEnterEK5gGoQ(context, 3)), "applicationVersionName");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEEK5gGoQ(1, zzbvVar)), "arbitraryPixieMacro");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEnterEK5gGoQ(context, 4)), "carrier");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getDvrEK5gGoQ(10)), "constant");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEndCallEK5gGoQ(new getInfoEK5gGoQ(str))), "containerId");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEndCallEK5gGoQ(new getInfoEK5gGoQ((String) emojiProcessor.IconCompatParcelizer))), "containerVersion");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEisuEK5gGoQ(0, new getCEK5gGoQ(this))), "customMacro");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getFEK5gGoQ(0)), "deviceBrand");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEnterEK5gGoQ(context, 5, 0 == true ? 1 : 0)), "deviceId");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getFEK5gGoQ(1)), "deviceModel");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEscapeEK5gGoQ()), "deviceName");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getDirectionUpEK5gGoQ(9)), "encode");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEqualsEK5gGoQ()), "encrypt");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(12)), "event");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEightEK5gGoQ(getcek5ggoq, 2)), "eventParameters");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(13)), "version");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getDirectionUpEK5gGoQ(10)), "hashcode");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEnterEK5gGoQ(context, 6)), "installReferrer");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getDirectionUpEK5gGoQ(11)), "join");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(14)), "language");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(15)), "locale");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEnterEK5gGoQ(context, 7)), "adWordsUniqueId");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(16)), "osVersion");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(17)), "platform");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEnvelopeEK5gGoQ()), "random");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getDirectionUpEK5gGoQ(12)), "regexGroup");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEscapeEK5gGoQ(context)), CommonCode.MapKey.HAS_RESOLUTION);
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(18)), "runtimeVersion");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(19)), "sdkVersion");
        getF1EK5gGoQ getf1ek5ggoq = new getF1EK5gGoQ();
        getf1ek5ggoq.read = accessgetTvInputComposite1cp.read;
        this.MediaSessionCompatQueueItem = getf1ek5ggoq;
        gethomeek5ggoq.write(new getGraveEK5gGoQ(getf1ek5ggoq), "currentTime");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEightEK5gGoQ(getcek5ggoq, 3)), "userProperty");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEisuEK5gGoQ(i2, getButton7EK5gGoQ.write(context))), "arbitraryPixel");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEisuEK5gGoQ(0, new coil3.memory.MemoryCacheService(this))), "customTag");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getF10EK5gGoQ()), "universalAnalytics");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getF2EK5gGoQ(getButton7EK5gGoQ.write(context))), "queueRequest");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getF11EK5gGoQ(setlastreportedresult, getcek5ggoq)), "sendMeasurement");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEEK5gGoQ(0, zzbvVar)), "arbitraryPixieTag");
        gethomeek5ggoq.write(new getGraveEK5gGoQ(new getEightEK5gGoQ(getcek5ggoq, 0)), "suppressPassthrough");
        gethomeek5ggoq2.write(new getGraveEK5gGoQ(new getDirectionUpEK5gGoQ(3)), "decodeURI");
        gethomeek5ggoq2.write(new getGraveEK5gGoQ(new getDirectionUpEK5gGoQ(4)), "decodeURIComponent");
        gethomeek5ggoq2.write(new getGraveEK5gGoQ(new getDirectionUpEK5gGoQ(5)), "encodeURI");
        gethomeek5ggoq2.write(new getGraveEK5gGoQ(new getDirectionUpEK5gGoQ(6)), "encodeURIComponent");
        gethomeek5ggoq2.write(new getGraveEK5gGoQ(new getDirectionUpEK5gGoQ(8)), "log");
        gethomeek5ggoq2.write(new getGraveEK5gGoQ(new getDirectionUpEK5gGoQ(7)), "isArray");
        for (getCtrlLeftEK5gGoQ getctrlleftek5ggoq : applydisplaycutoutmarginstocontentarealambda0.write) {
            zzbv zzbvVar2 = this.write;
            getctrlleftek5ggoq.write = zzbvVar2;
            zzbvVar2.serializer((getFunctionEK5gGoQ) new getGraveEK5gGoQ(getctrlleftek5ggoq), getctrlleftek5ggoq.IconCompatParcelizer);
        }
        getHomeEK5gGoQ gethomeek5ggoq3 = new getHomeEK5gGoQ(new HashMap(1));
        gethomeek5ggoq3.write(this.MediaDescriptionCompat, "mobile");
        gethomeek5ggoq3.write(this.MediaMetadataCompat, "common");
        this.write.serializer((getFunctionEK5gGoQ) gethomeek5ggoq3, "gtmUtils");
        getHomeEK5gGoQ gethomeek5ggoq4 = new getHomeEK5gGoQ(new HashMap(this.MediaDescriptionCompat.write));
        gethomeek5ggoq4.read = true;
        getHomeEK5gGoQ gethomeek5ggoq5 = new getHomeEK5gGoQ(new HashMap(this.MediaMetadataCompat.write));
        gethomeek5ggoq5.read = true;
        if (this.write.serializer("main") && (this.write.read("main") instanceof getGraveEK5gGoQ)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(gethomeek5ggoq3);
            androidx.room.Room.IconCompatParcelizer(this.write, new getIEK5gGoQ("main", arrayList));
        }
        this.MediaDescriptionCompat.write(gethomeek5ggoq4, "base");
        this.MediaMetadataCompat.write(gethomeek5ggoq5, "base");
        gethomeek5ggoq3.read = true;
        this.MediaDescriptionCompat.read = true;
        this.MediaMetadataCompat.read = true;
    }
}
