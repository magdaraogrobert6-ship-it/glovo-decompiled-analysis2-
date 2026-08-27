package o;

import com.huawei.hmf.tasks.a.d$a;
import com.huawei.hms.framework.common.ContainerUtils;
import fwfd.com.fwfsdk.constant.FWFConstants;
import io.socket.client.Manager$1$2;
import io.socket.emitter.Emitter;
import io.socket.engineio.client.Socket$1;
import io.socket.engineio.client.Socket$2;
import io.socket.engineio.client.Socket$9;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getCustomContentCardsViewBindingHandler extends Emitter {
    public static final java.util.logging.Logger RemoteActionCompatParcelizer = java.util.logging.Logger.getLogger(getCustomContentCardsViewBindingHandler.class.getName());
    public static final AtomicInteger read = new AtomicInteger();
    public static r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 write;
    public final getMessageImageView IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public ScheduledExecutorService MediaMetadataCompat;
    public final Socket$1 MediaSessionCompatQueueItem;
    public ScheduledFuture MediaSessionCompatResultReceiverWrapper;
    public final int MediaSessionCompatToken;
    public final int ParcelableVolumeInfo;
    public long PlaybackStateCompat;
    public long PlaybackStateCompatCustomAction;
    public String RatingCompat;
    public getSdkDataWipeEventSubscriber ResultReceiver;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final HashMap r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final String r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public getNetworkUnavailableJob r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final HashMap r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final ArrayList r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final boolean r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public ArrayList r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public boolean r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final boolean r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final LinkedList r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final Map serializer;

    public final void IconCompatParcelizer(getContentCardsSwipeLayout getcontentcardsswipelayout) {
        write("handshake", getcontentcardsswipelayout);
        String str = (String) getcontentcardsswipelayout.write;
        this.RatingCompat = str;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaMetadataCompat.put("sid", str);
        List<String> listAsList = Arrays.asList((String[]) getcontentcardsswipelayout.serializer);
        ArrayList arrayList = new ArrayList();
        for (String str2 : listAsList) {
            if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.contains(str2)) {
                arrayList.add(str2);
            }
        }
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = arrayList;
        this.PlaybackStateCompat = getcontentcardsswipelayout.read;
        this.PlaybackStateCompatCustomAction = getcontentcardsswipelayout.RemoteActionCompatParcelizer;
        java.util.logging.Logger logger = RemoteActionCompatParcelizer;
        logger.fine("socket open");
        getSdkDataWipeEventSubscriber getsdkdatawipeeventsubscriber = getSdkDataWipeEventSubscriber.OPEN;
        this.ResultReceiver = getsdkdatawipeeventsubscriber;
        "websocket".equals(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.RemoteActionCompatParcelizer);
        int i = 0;
        write("open", new Object[0]);
        write();
        if (this.ResultReceiver == getsdkdatawipeeventsubscriber && this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ && (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg instanceof networkUnavailable)) {
            logger.fine("starting upgrade probes");
            for (String str3 : this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) {
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine("probing transport '" + str3 + "'");
                }
                getNetworkUnavailableJob[] getnetworkunavailablejobArr = {RemoteActionCompatParcelizer(str3)};
                boolean[] zArr = {false};
                Runnable[] runnableArr = {new getDefaultContentCardUpdateHandler(getnetworkunavailablejobArr, getdefaultcontentcardsviewbindinghandler, socket$9, getdefaultemptycontentcardsadapter, this, getdefaultemptycontentcardsadapter, manager$1$2)};
                getDefaultContentCardsViewBindingHandler getdefaultcontentcardsviewbindinghandler = new getDefaultContentCardsViewBindingHandler(zArr, str3, getnetworkunavailablejobArr, this, runnableArr);
                getCustomContentCardUpdateHandler getcustomcontentcardupdatehandler = new getCustomContentCardUpdateHandler(i, zArr, getnetworkunavailablejobArr, runnableArr);
                Socket$9 socket$9 = new Socket$9(getnetworkunavailablejobArr, getcustomcontentcardupdatehandler, str3, this);
                getDefaultEmptyContentCardsAdapter getdefaultemptycontentcardsadapter = new getDefaultEmptyContentCardsAdapter(socket$9, i);
                getDefaultEmptyContentCardsAdapter getdefaultemptycontentcardsadapter2 = new getDefaultEmptyContentCardsAdapter(socket$9, 1);
                Manager$1$2 manager$1$2 = new Manager$1$2(getnetworkunavailablejobArr, getcustomcontentcardupdatehandler);
                getnetworkunavailablejobArr[0].serializer("open", getdefaultcontentcardsviewbindinghandler);
                getnetworkunavailablejobArr[0].serializer(FWFConstants.EXPLANATION_TYPE_ERROR, socket$9);
                getnetworkunavailablejobArr[0].serializer("close", getdefaultemptycontentcardsadapter);
                serializer("close", getdefaultemptycontentcardsadapter2);
                serializer("upgrading", manager$1$2);
                getNetworkUnavailableJob getnetworkunavailablejob = getnetworkunavailablejobArr[0];
                getnetworkunavailablejob.getClass();
                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new getEmptyCardsAdapter(getnetworkunavailablejob, i));
            }
        }
        if (getSdkDataWipeEventSubscriber.CLOSED == this.ResultReceiver) {
            return;
        }
        serializer();
        getContentCardsViewBindingHandler getcontentcardsviewbindinghandler = this.MediaSessionCompatQueueItem;
        RemoteActionCompatParcelizer("heartbeat", getcontentcardsviewbindinghandler);
        read("heartbeat", getcontentcardsviewbindinghandler);
    }

    public final getNetworkUnavailableJob RemoteActionCompatParcelizer(String str) {
        getNetworkUnavailableJob setcontentcardsswipelayout;
        Level level = Level.FINE;
        java.util.logging.Logger logger = RemoteActionCompatParcelizer;
        if (logger.isLoggable(level)) {
            logger.fine("creating transport '" + str + "'");
        }
        HashMap map = new HashMap(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        map.put("EIO", String.valueOf(4));
        map.put("transport", str);
        String str2 = this.RatingCompat;
        if (str2 != null) {
            map.put("sid", str2);
        }
        initializeRecyclerView initializerecyclerview = (initializeRecyclerView) this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.get(str);
        initializeRecyclerView initializerecyclerview2 = new initializeRecyclerView();
        initializerecyclerview2.MediaSessionCompatResultReceiverWrapper = map;
        initializerecyclerview2.MediaBrowserCompatMediaItem = initializerecyclerview != null ? initializerecyclerview.MediaBrowserCompatMediaItem : this.MediaBrowserCompatMediaItem;
        initializerecyclerview2.RatingCompat = initializerecyclerview != null ? initializerecyclerview.RatingCompat : this.ParcelableVolumeInfo;
        initializerecyclerview2.PlaybackStateCompat = initializerecyclerview != null ? initializerecyclerview.PlaybackStateCompat : this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        initializerecyclerview2.MediaMetadataCompat = initializerecyclerview != null ? initializerecyclerview.MediaMetadataCompat : this.MediaDescriptionCompat;
        initializerecyclerview2.MediaSessionCompatToken = initializerecyclerview != null ? initializerecyclerview.MediaSessionCompatToken : this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        initializerecyclerview2.ParcelableVolumeInfo = initializerecyclerview != null ? initializerecyclerview.ParcelableVolumeInfo : this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        initializerecyclerview2.MediaDescriptionCompat = initializerecyclerview != null ? initializerecyclerview.MediaDescriptionCompat : this.MediaSessionCompatToken;
        initializerecyclerview2.read = initializerecyclerview != null ? initializerecyclerview.read : this.IconCompatParcelizer;
        initializerecyclerview2.PlaybackStateCompatCustomAction = initializerecyclerview != null ? initializerecyclerview.PlaybackStateCompatCustomAction : this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        initializerecyclerview2.MediaSessionCompatQueueItem = this.serializer;
        if ("websocket".equals(str)) {
            setcontentcardsswipelayout = new setContentCardsUpdatedSubscriber(initializerecyclerview2);
            setcontentcardsswipelayout.RemoteActionCompatParcelizer = "websocket";
        } else {
            if (!"polling".equals(str)) {
                throw new RuntimeException();
            }
            setcontentcardsswipelayout = new setContentCardsSwipeLayout(initializerecyclerview2);
            setcontentcardsswipelayout.RemoteActionCompatParcelizer = "polling";
        }
        write("transport", setcontentcardsswipelayout);
        return setcontentcardsswipelayout;
    }

    public final void RemoteActionCompatParcelizer(String str, Exception exc) {
        getSdkDataWipeEventSubscriber getsdkdatawipeeventsubscriber = getSdkDataWipeEventSubscriber.OPENING;
        getSdkDataWipeEventSubscriber getsdkdatawipeeventsubscriber2 = this.ResultReceiver;
        if (getsdkdatawipeeventsubscriber == getsdkdatawipeeventsubscriber2 || getSdkDataWipeEventSubscriber.OPEN == getsdkdatawipeeventsubscriber2 || getSdkDataWipeEventSubscriber.CLOSING == getsdkdatawipeeventsubscriber2) {
            Level level = Level.FINE;
            java.util.logging.Logger logger = RemoteActionCompatParcelizer;
            if (logger.isLoggable(level)) {
                logger.fine("socket close with reason: ".concat(str));
            }
            ScheduledFuture scheduledFuture = this.MediaSessionCompatResultReceiverWrapper;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledExecutorService scheduledExecutorService = this.MediaMetadataCompat;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            ((ConcurrentHashMap) this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.ComponentActivity).remove("close");
            getNetworkUnavailableJob getnetworkunavailablejob = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            getnetworkunavailablejob.getClass();
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new getEmptyCardsAdapter(getnetworkunavailablejob, 1));
            ((ConcurrentHashMap) this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.ComponentActivity).clear();
            this.ResultReceiver = getSdkDataWipeEventSubscriber.CLOSED;
            this.RatingCompat = null;
            write("close", str, exc);
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.clear();
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
        }
    }

    public final void RemoteActionCompatParcelizer(ContentCardsFragmentcontentCardsUpdate5 contentCardsFragmentcontentCardsUpdate5) {
        getSdkDataWipeEventSubscriber getsdkdatawipeeventsubscriber = getSdkDataWipeEventSubscriber.CLOSING;
        getSdkDataWipeEventSubscriber getsdkdatawipeeventsubscriber2 = this.ResultReceiver;
        if (getsdkdatawipeeventsubscriber == getsdkdatawipeeventsubscriber2 || getSdkDataWipeEventSubscriber.CLOSED == getsdkdatawipeeventsubscriber2) {
            return;
        }
        write("packetCreate", contentCardsFragmentcontentCardsUpdate5);
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.offer(contentCardsFragmentcontentCardsUpdate5);
        write();
    }

    public final void serializer(Exception exc) {
        Level level = Level.FINE;
        java.util.logging.Logger logger = RemoteActionCompatParcelizer;
        if (logger.isLoggable(level)) {
            logger.fine(String.format("socket error %s", exc));
        }
        write(FWFConstants.EXPLANATION_TYPE_ERROR, exc);
        RemoteActionCompatParcelizer("transport error", exc);
    }

    public final void write() {
        if (this.ResultReceiver == getSdkDataWipeEventSubscriber.CLOSED || !this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatToken || this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
            return;
        }
        LinkedList linkedList = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (linkedList.size() != 0) {
            Level level = Level.FINE;
            java.util.logging.Logger logger = RemoteActionCompatParcelizer;
            if (logger.isLoggable(level)) {
                logger.fine(String.format("flushing %d packets in socket", Integer.valueOf(linkedList.size())));
            }
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = linkedList.size();
            getNetworkUnavailableJob getnetworkunavailablejob = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            ContentCardsFragmentcontentCardsUpdate5[] contentCardsFragmentcontentCardsUpdate5Arr = (ContentCardsFragmentcontentCardsUpdate5[]) linkedList.toArray(new ContentCardsFragmentcontentCardsUpdate5[linkedList.size()]);
            getnetworkunavailablejob.getClass();
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a(getnetworkunavailablejob, 23, contentCardsFragmentcontentCardsUpdate5Arr));
            write("flush", new Object[0]);
        }
    }

    public static void read(getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler, getNetworkUnavailableJob getnetworkunavailablejob) {
        getcustomcontentcardsviewbindinghandler.getClass();
        Level level = Level.FINE;
        java.util.logging.Logger logger = RemoteActionCompatParcelizer;
        if (logger.isLoggable(level)) {
            logger.fine("setting transport " + getnetworkunavailablejob.RemoteActionCompatParcelizer);
        }
        if (getcustomcontentcardsviewbindinghandler.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg != null) {
            if (logger.isLoggable(level)) {
                logger.fine("clearing existing transport " + getcustomcontentcardsviewbindinghandler.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.RemoteActionCompatParcelizer);
            }
            ((ConcurrentHashMap) getcustomcontentcardsviewbindinghandler.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.ComponentActivity).clear();
        }
        getcustomcontentcardsviewbindinghandler.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = getnetworkunavailablejob;
        getnetworkunavailablejob.read("drain", new Socket$1(getcustomcontentcardsviewbindinghandler, 4));
        getnetworkunavailablejob.read("packet", new Socket$1(getcustomcontentcardsviewbindinghandler, 3));
        getnetworkunavailablejob.read(FWFConstants.EXPLANATION_TYPE_ERROR, new Socket$1(getcustomcontentcardsviewbindinghandler, 2));
        getnetworkunavailablejob.read("close", new Socket$1(getcustomcontentcardsviewbindinghandler, 1));
    }

    public final void serializer() {
        ScheduledFuture scheduledFuture = this.MediaSessionCompatResultReceiverWrapper;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        long j = this.PlaybackStateCompat;
        long j2 = this.PlaybackStateCompatCustomAction;
        ScheduledExecutorService scheduledExecutorService = this.MediaMetadataCompat;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            this.MediaMetadataCompat = Executors.newSingleThreadScheduledExecutor(new r8lambdaXjeS_gq8hmJyKRkNmQwAUeFh2g(3));
        }
        this.MediaSessionCompatResultReceiverWrapper = this.MediaMetadataCompat.schedule(new Socket$2(this, 2), j + j2, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCustomContentCardsViewBindingHandler(URI uri, handleContentCardsUpdatedEvent handlecontentcardsupdatedevent) {
        HashMap map;
        String strDecode;
        super(0);
        int i = 0;
        if (uri != null) {
            handlecontentcardsupdatedevent = handlecontentcardsupdatedevent == null ? new handleContentCardsUpdatedEvent() : handlecontentcardsupdatedevent;
            handlecontentcardsupdatedevent.IconCompatParcelizer = uri.getHost();
            handlecontentcardsupdatedevent.PlaybackStateCompat = com.adjust.sdk.Constants.SCHEME.equals(uri.getScheme()) || "wss".equals(uri.getScheme());
            handlecontentcardsupdatedevent.RatingCompat = uri.getPort();
            String rawQuery = uri.getRawQuery();
            if (rawQuery != null) {
                handlecontentcardsupdatedevent.RemoteActionCompatParcelizer = rawQuery;
            }
        }
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new LinkedList();
        this.MediaSessionCompatQueueItem = new Socket$1(this, i);
        String strSubstring = handlecontentcardsupdatedevent.IconCompatParcelizer;
        if (strSubstring != null) {
            if (strSubstring.split(":").length > 2) {
                int iIndexOf = strSubstring.indexOf(91);
                strSubstring = iIndexOf != -1 ? strSubstring.substring(iIndexOf + 1) : strSubstring;
                int iLastIndexOf = strSubstring.lastIndexOf(93);
                if (iLastIndexOf != -1) {
                    strSubstring = strSubstring.substring(0, iLastIndexOf);
                }
            }
            handlecontentcardsupdatedevent.MediaBrowserCompatMediaItem = strSubstring;
        }
        boolean z = handlecontentcardsupdatedevent.PlaybackStateCompat;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = z;
        if (handlecontentcardsupdatedevent.RatingCompat == -1) {
            handlecontentcardsupdatedevent.RatingCompat = z ? 443 : 80;
        }
        String str = handlecontentcardsupdatedevent.MediaBrowserCompatMediaItem;
        this.MediaBrowserCompatMediaItem = str == null ? "localhost" : str;
        this.ParcelableVolumeInfo = handlecontentcardsupdatedevent.RatingCompat;
        String str2 = handlecontentcardsupdatedevent.RemoteActionCompatParcelizer;
        if (str2 != null) {
            map = new HashMap();
            for (String str3 : str2.split(ContainerUtils.FIELD_DELIMITER)) {
                String[] strArrSplit = str3.split(ContainerUtils.KEY_VALUE_DELIMITER);
                try {
                    String strDecode2 = URLDecoder.decode(strArrSplit[0], com.adjust.sdk.Constants.ENCODING);
                    if (strArrSplit.length > 1) {
                        try {
                            strDecode = URLDecoder.decode(strArrSplit[1], com.adjust.sdk.Constants.ENCODING);
                        } catch (UnsupportedEncodingException e) {
                            DrawableTransformation.read((Throwable) e);
                            throw null;
                        }
                    } else {
                        strDecode = "";
                    }
                    map.put(strDecode2, strDecode);
                } catch (UnsupportedEncodingException e2) {
                    DrawableTransformation.read((Throwable) e2);
                    throw null;
                }
            }
        } else {
            map = new HashMap();
        }
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = map;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = true;
        StringBuilder sb = new StringBuilder();
        String str4 = handlecontentcardsupdatedevent.MediaMetadataCompat;
        sb.append((str4 == null ? "/engine.io" : str4).replaceAll("/$", ""));
        sb.append("/");
        this.MediaDescriptionCompat = sb.toString();
        String str5 = handlecontentcardsupdatedevent.ParcelableVolumeInfo;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = str5 == null ? com.braze.Constants.BRAZE_PUSH_TITLE_KEY : str5;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = handlecontentcardsupdatedevent.MediaSessionCompatToken;
        String[] strArr = handlecontentcardsupdatedevent.write;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new ArrayList(Arrays.asList(strArr == null ? new String[]{"polling", "websocket"} : strArr));
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new HashMap();
        int i2 = handlecontentcardsupdatedevent.MediaDescriptionCompat;
        this.MediaSessionCompatToken = i2 == 0 ? 843 : i2;
        getMessageImageView getmessageimageview = handlecontentcardsupdatedevent.read;
        getmessageimageview = getmessageimageview == null ? null : getmessageimageview;
        this.IconCompatParcelizer = getmessageimageview;
        r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = handlecontentcardsupdatedevent.PlaybackStateCompatCustomAction;
        r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg1 = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 != null ? r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 : null;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg1;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        if (getmessageimageview == null) {
            if (write == null) {
                r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = new r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ();
                r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.RemoteActionCompatParcelizer(1L, timeUnit);
                write = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
            }
            this.IconCompatParcelizer = write;
        }
        if (r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg1 == null) {
            if (write == null) {
                r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq2 = new r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ();
                r8lambdauggauuj_lbnzvef8yyxtwmhrlkq2.RemoteActionCompatParcelizer(1L, timeUnit);
                write = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq2);
            }
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = write;
        }
        this.serializer = handlecontentcardsupdatedevent.MediaSessionCompatQueueItem;
    }
}
