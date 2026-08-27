package o;

import com.huawei.hmf.tasks.a.d$a;
import io.grpc.Status;
import io.sentry.JsonObjectSerializer;
import io.sentry.SentryClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class isValidEmailAddress implements accesssetCustomHandlercp {
    public final Executor IconCompatParcelizer;
    public isValidLogCustomEventInput MediaBrowserCompatMediaItem;
    public isValidLogCustomEventInput MediaMetadataCompat;
    public isValidLogCustomEventInput MediaSessionCompatQueueItem;
    public Status MediaSessionCompatToken;
    public final getMethodQuietlylambda1 PlaybackStateCompatCustomAction;
    public long RemoteActionCompatParcelizer;
    public requestPushPermissionPromptlambda3 read;
    public JsonObjectSerializer serializer;
    public final incrementPermissionRequestCountlambda0 MediaDescriptionCompat = incrementPermissionRequestCountlambda0.IconCompatParcelizer(isValidEmailAddress.class, null);
    public final Object write = new Object();
    public Collection RatingCompat = new LinkedHashSet();

    @Override // o.r8lambdao3lqYNEkeMXUHIX5LRLuX2akVp8
    public final incrementPermissionRequestCountlambda0 read() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.r8lambdaHMza2HwvD2qpEDNMeHrXqzjzano
    public final r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 IconCompatParcelizer(SentryClient sentryClient, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergeJsonObjectslambda10 mergejsonobjectslambda10, JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr) {
        r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 isvalidpushstoryclickinput;
        try {
            r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU r8lambdagkh6tfshup2g_hd0a6i5ejd8pu = new r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU(sentryClient, r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergejsonobjectslambda10);
            requestPushPermissionPromptlambda3 requestpushpermissionpromptlambda3 = null;
            long j = -1;
            while (true) {
                synchronized (this.write) {
                    Status status = this.MediaSessionCompatToken;
                    if (status == null) {
                        requestPushPermissionPromptlambda3 requestpushpermissionpromptlambda4 = this.read;
                        if (requestpushpermissionpromptlambda4 != null) {
                            if (requestpushpermissionpromptlambda3 != null && j == this.RemoteActionCompatParcelizer) {
                                isvalidpushstoryclickinput = serializer(r8lambdagkh6tfshup2g_hd0a6i5ejd8pu, jsonUtilsExternalSyntheticLambda1Arr);
                                break;
                            }
                            j = this.RemoteActionCompatParcelizer;
                            r8lambdaHMza2HwvD2qpEDNMeHrXqzjzano r8lambdahmza2hwvd2qpednmehrxqzjzanoRemoteActionCompatParcelizer = r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.RemoteActionCompatParcelizer(requestpushpermissionpromptlambda4.write(r8lambdagkh6tfshup2g_hd0a6i5ejd8pu), Boolean.TRUE.equals(mergejsonobjectslambda10.RatingCompat));
                            if (r8lambdahmza2hwvd2qpednmehrxqzjzanoRemoteActionCompatParcelizer != null) {
                                isvalidpushstoryclickinput = r8lambdahmza2hwvd2qpednmehrxqzjzanoRemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdagkh6tfshup2g_hd0a6i5ejd8pu.read, r8lambdagkh6tfshup2g_hd0a6i5ejd8pu.IconCompatParcelizer, r8lambdagkh6tfshup2g_hd0a6i5ejd8pu.write, jsonUtilsExternalSyntheticLambda1Arr);
                                break;
                            }
                            requestpushpermissionpromptlambda3 = requestpushpermissionpromptlambda4;
                        } else {
                            isvalidpushstoryclickinput = serializer(r8lambdagkh6tfshup2g_hd0a6i5ejd8pu, jsonUtilsExternalSyntheticLambda1Arr);
                            break;
                        }
                    } else {
                        isvalidpushstoryclickinput = new isValidPushStoryClickInput(status, jsonUtilsExternalSyntheticLambda1Arr);
                        break;
                    }
                }
            }
            this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer();
            return isvalidpushstoryclickinput;
        } catch (Throwable th) {
            this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer();
            throw th;
        }
    }

    public final boolean IconCompatParcelizer() {
        boolean zIsEmpty;
        synchronized (this.write) {
            zIsEmpty = this.RatingCompat.isEmpty();
        }
        return !zIsEmpty;
    }

    @Override // o.accesssetCustomHandlercp
    public final void RemoteActionCompatParcelizer(Status status) {
        isValidLogCustomEventInput isvalidlogcustomeventinput;
        synchronized (this.write) {
            if (this.MediaSessionCompatToken != null) {
                return;
            }
            this.MediaSessionCompatToken = status;
            this.PlaybackStateCompatCustomAction.read(new d$a(this, 9, status));
            if (!IconCompatParcelizer() && (isvalidlogcustomeventinput = this.MediaBrowserCompatMediaItem) != null) {
                this.PlaybackStateCompatCustomAction.read(isvalidlogcustomeventinput);
                this.MediaBrowserCompatMediaItem = null;
            }
            this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer();
        }
    }

    @Override // o.accesssetCustomHandlercp
    public final Runnable read(accessgetDefaultHandlercp accessgetdefaulthandlercp) {
        JsonObjectSerializer jsonObjectSerializer = (JsonObjectSerializer) accessgetdefaulthandlercp;
        this.serializer = jsonObjectSerializer;
        this.MediaSessionCompatQueueItem = new isValidLogCustomEventInput(jsonObjectSerializer, 0);
        this.MediaMetadataCompat = new isValidLogCustomEventInput(jsonObjectSerializer, 1);
        this.MediaBrowserCompatMediaItem = new isValidLogCustomEventInput(jsonObjectSerializer, 2);
        return null;
    }

    public final isValidLogCustomEventInputlambda0 serializer(r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU r8lambdagkh6tfshup2g_hd0a6i5ejd8pu, JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr) {
        int size;
        isValidLogCustomEventInputlambda0 isvalidlogcustomeventinputlambda0 = new isValidLogCustomEventInputlambda0(this, r8lambdagkh6tfshup2g_hd0a6i5ejd8pu, jsonUtilsExternalSyntheticLambda1Arr);
        this.RatingCompat.add(isvalidlogcustomeventinputlambda0);
        synchronized (this.write) {
            size = this.RatingCompat.size();
        }
        if (size == 1) {
            this.PlaybackStateCompatCustomAction.read(this.MediaSessionCompatQueueItem);
        }
        for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 : jsonUtilsExternalSyntheticLambda1Arr) {
            jsonUtilsExternalSyntheticLambda1.IconCompatParcelizer();
        }
        return isvalidlogcustomeventinputlambda0;
    }

    public final void write(requestPushPermissionPromptlambda3 requestpushpermissionpromptlambda3) {
        isValidLogCustomEventInput isvalidlogcustomeventinput;
        synchronized (this.write) {
            this.read = requestpushpermissionpromptlambda3;
            this.RemoteActionCompatParcelizer++;
            if (requestpushpermissionpromptlambda3 != null && IconCompatParcelizer()) {
                ArrayList<isValidLogCustomEventInputlambda0> arrayList = new ArrayList(this.RatingCompat);
                ArrayList arrayList2 = new ArrayList();
                for (isValidLogCustomEventInputlambda0 isvalidlogcustomeventinputlambda0 : arrayList) {
                    wouldPushPermissionPromptDisplaylambda0 wouldpushpermissionpromptdisplaylambda0Write = requestpushpermissionpromptlambda3.write(isvalidlogcustomeventinputlambda0.IconCompatParcelizer);
                    mergeJsonObjectslambda10 mergejsonobjectslambda10 = isvalidlogcustomeventinputlambda0.IconCompatParcelizer.write;
                    r8lambdaHMza2HwvD2qpEDNMeHrXqzjzano r8lambdahmza2hwvd2qpednmehrxqzjzanoRemoteActionCompatParcelizer = r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.RemoteActionCompatParcelizer(wouldpushpermissionpromptdisplaylambda0Write, Boolean.TRUE.equals(mergejsonobjectslambda10.RatingCompat));
                    if (r8lambdahmza2hwvd2qpednmehrxqzjzanoRemoteActionCompatParcelizer != null) {
                        Executor executor = this.IconCompatParcelizer;
                        Executor executor2 = mergejsonobjectslambda10.write;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        setResourcePackageName setresourcepackagename = isvalidlogcustomeventinputlambda0.serializer;
                        setResourcePackageName setresourcepackagenameIconCompatParcelizer = setresourcepackagename.IconCompatParcelizer();
                        try {
                            r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU r8lambdagkh6tfshup2g_hd0a6i5ejd8pu = isvalidlogcustomeventinputlambda0.IconCompatParcelizer;
                            r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 r8lambda7hj8zhiew8owwyp0e05lxeu0sn0IconCompatParcelizer = r8lambdahmza2hwvd2qpednmehrxqzjzanoRemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdagkh6tfshup2g_hd0a6i5ejd8pu.read, r8lambdagkh6tfshup2g_hd0a6i5ejd8pu.IconCompatParcelizer, r8lambdagkh6tfshup2g_hd0a6i5ejd8pu.write, isvalidlogcustomeventinputlambda0.write);
                            setresourcepackagename.IconCompatParcelizer(setresourcepackagenameIconCompatParcelizer);
                            isValidLogPurchaseInputlambda2 isvalidlogpurchaseinputlambda2IconCompatParcelizer = isvalidlogcustomeventinputlambda0.IconCompatParcelizer(r8lambda7hj8zhiew8owwyp0e05lxeu0sn0IconCompatParcelizer);
                            if (isvalidlogpurchaseinputlambda2IconCompatParcelizer != null) {
                                executor.execute(isvalidlogpurchaseinputlambda2IconCompatParcelizer);
                            }
                            arrayList2.add(isvalidlogcustomeventinputlambda0);
                        } catch (Throwable th) {
                            setresourcepackagename.IconCompatParcelizer(setresourcepackagenameIconCompatParcelizer);
                            throw th;
                        }
                    }
                }
                synchronized (this.write) {
                    if (IconCompatParcelizer()) {
                        this.RatingCompat.removeAll(arrayList2);
                        if (this.RatingCompat.isEmpty()) {
                            this.RatingCompat = new LinkedHashSet();
                        }
                        if (!IconCompatParcelizer()) {
                            this.PlaybackStateCompatCustomAction.read(this.MediaMetadataCompat);
                            if (this.MediaSessionCompatToken != null && (isvalidlogcustomeventinput = this.MediaBrowserCompatMediaItem) != null) {
                                this.PlaybackStateCompatCustomAction.read(isvalidlogcustomeventinput);
                                this.MediaBrowserCompatMediaItem = null;
                            }
                        }
                        this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer();
                    }
                }
            }
        }
    }

    @Override // o.accesssetCustomHandlercp
    public final void serializer(Status status) {
        Collection<isValidLogCustomEventInputlambda0> collection;
        isValidLogCustomEventInput isvalidlogcustomeventinput;
        RemoteActionCompatParcelizer(status);
        synchronized (this.write) {
            collection = this.RatingCompat;
            isvalidlogcustomeventinput = this.MediaBrowserCompatMediaItem;
            this.MediaBrowserCompatMediaItem = null;
            if (!collection.isEmpty()) {
                this.RatingCompat = Collections.EMPTY_LIST;
            }
        }
        if (isvalidlogcustomeventinput != null) {
            for (isValidLogCustomEventInputlambda0 isvalidlogcustomeventinputlambda0 : collection) {
                isValidLogPurchaseInputlambda2 isvalidlogpurchaseinputlambda2IconCompatParcelizer = isvalidlogcustomeventinputlambda0.IconCompatParcelizer(new isValidPushStoryClickInput(status, r8lambdacIxdbs1VMz7DJpiM5hikhHgartg.REFUSED, isvalidlogcustomeventinputlambda0.write));
                if (isvalidlogpurchaseinputlambda2IconCompatParcelizer != null) {
                    isvalidlogpurchaseinputlambda2IconCompatParcelizer.run();
                }
            }
            this.PlaybackStateCompatCustomAction.execute(isvalidlogcustomeventinput);
        }
    }

    public isValidEmailAddress(Executor executor, getMethodQuietlylambda1 getmethodquietlylambda1) {
        this.IconCompatParcelizer = executor;
        this.PlaybackStateCompatCustomAction = getmethodquietlylambda1;
    }
}
