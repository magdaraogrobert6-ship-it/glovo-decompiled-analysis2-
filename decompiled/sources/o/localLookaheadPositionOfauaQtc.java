package o;

import android.content.SharedPreferences;
import io.sentry.JsonObjectSerializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class localLookaheadPositionOfauaQtc implements getRectf {
    public final Object IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;
    public final Object read;
    public final Object serializer;
    public final Serializable write;

    /* JADX WARN: Multi-variable type inference failed */
    public r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII IconCompatParcelizer() {
        setLargerCloseButtonClickArea getsettohalfparentheightannotations;
        r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM r8lambdaqvutikvybkq92fayr7v9hbpsnm = (r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM) this.read;
        InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 = null;
        Object[] objArr = 0;
        if (r8lambdaqvutikvybkq92fayr7v9hbpsnm.IconCompatParcelizer(null)) {
            try {
                getsettohalfparentheightannotations = r8lambdaqvutikvybkq92fayr7v9hbpsnm.RatingCompat();
            } catch (Throwable th) {
                getsettohalfparentheightannotations = new getSetToHalfParentHeightannotations(th);
            }
            if (getsettohalfparentheightannotations.MediaDescriptionCompat()) {
                return new r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII(getsettohalfparentheightannotations, inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3, objArr == true ? 1 : 0, 6);
            }
            if (getsettohalfparentheightannotations instanceof getSetToHalfParentHeightannotations) {
                return ((getSetToHalfParentHeightannotations) getsettohalfparentheightannotations).write;
            }
            ((CopyOnWriteArrayList) this.write).add(getsettohalfparentheightannotations);
            ((InAppMessageHtmlFullView) this.serializer).read().read(new getInAppRadii(setWebViewContent.read + " connect " + r8lambdaqvutikvybkq92fayr7v9hbpsnm.IconCompatParcelizer().url.MediaSessionCompatQueueItem(), getsettohalfparentheightannotations, this), 0L);
        }
        return null;
    }

    @Override // o.getRectf
    public r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM RemoteActionCompatParcelizer() {
        return (r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM) this.read;
    }

    public void read() {
        LookaheadScopeKt lookaheadScopeKt = (LookaheadScopeKt) this.IconCompatParcelizer;
        lookaheadScopeKt.MediaSessionCompatToken();
        ((LookaheadScopeKtLookaheadScope221) lookaheadScopeKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = lookaheadScopeKt.serializer().edit();
        editorEdit.remove((String) this.serializer);
        editorEdit.remove((String) this.write);
        editorEdit.putLong((String) this.read, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public void serializer() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.write;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            setLargerCloseButtonClickArea setlargerclosebuttonclickarea = (setLargerCloseButtonClickArea) it.next();
            setlargerclosebuttonclickarea.read();
            setLargerCloseButtonClickArea setlargerclosebuttonclickareaMediaBrowserCompatMediaItem = setlargerclosebuttonclickarea.MediaBrowserCompatMediaItem();
            if (setlargerclosebuttonclickareaMediaBrowserCompatMediaItem != null) {
                ((r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM) this.read).read().addLast(setlargerclosebuttonclickareaMediaBrowserCompatMediaItem);
            }
        }
        copyOnWriteArrayList.clear();
    }

    @Override // o.getRectf
    public InAppMessageImmersiveBaseView write() throws IOException {
        r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer;
        long j;
        r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII r8lambdaebq2lc4_6t3arp5xx7b_s4jagii;
        r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM r8lambdaqvutikvybkq92fayr7v9hbpsnm = (r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM) this.read;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.write;
        IOException iOException = null;
        while (true) {
            try {
                if (copyOnWriteArrayList.isEmpty() && !r8lambdaqvutikvybkq92fayr7v9hbpsnm.IconCompatParcelizer(null)) {
                    serializer();
                    iOException.getClass();
                    throw iOException;
                }
                if (r8lambdaqvutikvybkq92fayr7v9hbpsnm.serializer()) {
                    throw new IOException("Canceled");
                }
                JsonObjectSerializer jsonObjectSerializer = ((InAppMessageHtmlFullView) this.serializer).backend;
                long jNanoTime = System.nanoTime();
                long j2 = this.RemoteActionCompatParcelizer - jNanoTime;
                if (copyOnWriteArrayList.isEmpty() || j2 <= 0) {
                    r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer = IconCompatParcelizer();
                    j = 250000000;
                    this.RemoteActionCompatParcelizer = jNanoTime + 250000000;
                } else {
                    j = j2;
                    r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer = null;
                }
                if (r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    if (copyOnWriteArrayList.isEmpty() || (r8lambdaebq2lc4_6t3arp5xx7b_s4jagii = (r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII) ((LinkedBlockingDeque) this.IconCompatParcelizer).poll(j, timeUnit)) == null) {
                        r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer = null;
                    } else {
                        copyOnWriteArrayList.remove(r8lambdaebq2lc4_6t3arp5xx7b_s4jagii.serializer);
                        r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer = r8lambdaebq2lc4_6t3arp5xx7b_s4jagii;
                    }
                    if (r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer == null) {
                    }
                }
                setLargerCloseButtonClickArea setlargerclosebuttonclickarea = r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer.serializer;
                if (r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer.IconCompatParcelizer == null && r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer.write == null) {
                    serializer();
                    if (!setlargerclosebuttonclickarea.MediaDescriptionCompat()) {
                        r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer = setlargerclosebuttonclickarea.RemoteActionCompatParcelizer();
                    }
                    if (r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer.IconCompatParcelizer == null && r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer.write == null) {
                        InAppMessageImmersiveBaseView inAppMessageImmersiveBaseViewMediaSessionCompatQueueItem = r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer.serializer.MediaSessionCompatQueueItem();
                        serializer();
                        return inAppMessageImmersiveBaseViewMediaSessionCompatQueueItem;
                    }
                }
                Throwable th = r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer.write;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        markOnScreenCardsAsReadlambda1.read(iOException, th);
                    }
                }
                setLargerCloseButtonClickArea setlargerclosebuttonclickarea2 = r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer.IconCompatParcelizer;
                if (setlargerclosebuttonclickarea2 != null) {
                    r8lambdaqvutikvybkq92fayr7v9hbpsnm.read().addFirst(setlargerclosebuttonclickarea2);
                }
            } catch (Throwable th2) {
                serializer();
                throw th2;
            }
        }
    }

    public /* synthetic */ localLookaheadPositionOfauaQtc(LookaheadScopeKt lookaheadScopeKt, long j) {
        this.IconCompatParcelizer = lookaheadScopeKt;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer("health_monitor");
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(j > 0);
        this.read = "health_monitor:start";
        this.serializer = "health_monitor:count";
        this.write = "health_monitor:value";
        this.RemoteActionCompatParcelizer = j;
    }

    public localLookaheadPositionOfauaQtc(r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM r8lambdaqvutikvybkq92fayr7v9hbpsnm, InAppMessageHtmlFullView inAppMessageHtmlFullView) {
        inAppMessageHtmlFullView.getClass();
        this.read = r8lambdaqvutikvybkq92fayr7v9hbpsnm;
        this.serializer = inAppMessageHtmlFullView;
        this.RemoteActionCompatParcelizer = Long.MIN_VALUE;
        this.write = new CopyOnWriteArrayList();
        this.IconCompatParcelizer = new LinkedBlockingDeque();
    }
}
