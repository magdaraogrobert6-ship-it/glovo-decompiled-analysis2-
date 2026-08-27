package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zza;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import o.accesssetAddChangeCallbackMethodcp;
import o.executeDelayedlambda0;
import o.findNextNonChildView;
import o.getIntentArrayWithConfiguredBackStacklambda4;
import o.getViewTreeOwners;
import o.get_autofillManagerui;
import o.sendMotionEvent8iAsVTc;

/* JADX INFO: loaded from: classes2.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new zza(15);
    public final String IconCompatParcelizer;
    public boolean read;
    public final Timer write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean RemoteActionCompatParcelizer() {
        executeDelayedlambda0 executedelayedlambda0;
        long jLongValue;
        long j = this.write.read() / 60000000;
        accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer = accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer();
        accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.getClass();
        synchronized (executeDelayedlambda0.class) {
            if (executeDelayedlambda0.serializer == null) {
                executeDelayedlambda0.serializer = new executeDelayedlambda0();
            }
            executedelayedlambda0 = executeDelayedlambda0.serializer;
        }
        sendMotionEvent8iAsVTc sendmotionevent8iasvtcMediaSessionCompatQueueItem = accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(executedelayedlambda0);
        if (!sendmotionevent8iasvtcMediaSessionCompatQueueItem.serializer() || ((Long) sendmotionevent8iasvtcMediaSessionCompatQueueItem.RemoteActionCompatParcelizer()).longValue() <= 0) {
            sendMotionEvent8iAsVTc sendmotionevent8iasvtc = accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.serializer.getLong("fpr_session_max_duration_min");
            if (!sendmotionevent8iasvtc.serializer() || ((Long) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).longValue() <= 0) {
                sendMotionEvent8iAsVTc sendmotionevent8iasvtcWrite = accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.write(executedelayedlambda0);
                jLongValue = (!sendmotionevent8iasvtcWrite.serializer() || ((Long) sendmotionevent8iasvtcWrite.RemoteActionCompatParcelizer()).longValue() <= 0) ? 240L : ((Long) sendmotionevent8iasvtcWrite.RemoteActionCompatParcelizer()).longValue();
            } else {
                accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.read.write(((Long) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                jLongValue = ((Long) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).longValue();
            }
        } else {
            jLongValue = ((Long) sendmotionevent8iasvtcMediaSessionCompatQueueItem.RemoteActionCompatParcelizer()).longValue();
        }
        return j > jLongValue;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeByte(this.read ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.write, 0);
    }

    public PerfSession(Parcel parcel) {
        this.read = false;
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readByte() != 0;
        this.write = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    public static PerfSession read(String str) {
        boolean z;
        findNextNonChildView findnextnonchildview;
        sendMotionEvent8iAsVTc sendmotionevent8iasvtc;
        sendMotionEvent8iAsVTc sendmotionevent8iasvtc2;
        double dDoubleValue;
        PerfSession perfSession = new PerfSession(str.replace("-", ""), new getIntentArrayWithConfiguredBackStacklambda4(29));
        accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer = accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer();
        if (accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.read()) {
            double dRandom = Math.random();
            synchronized (findNextNonChildView.class) {
                if (findNextNonChildView.write == null) {
                    findNextNonChildView.write = new findNextNonChildView();
                }
                findnextnonchildview = findNextNonChildView.write;
            }
            sendMotionEvent8iAsVTc sendmotionevent8iasvtcMediaMetadataCompat = accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.MediaMetadataCompat(findnextnonchildview);
            if (sendmotionevent8iasvtcMediaMetadataCompat.serializer()) {
                dDoubleValue = ((Double) sendmotionevent8iasvtcMediaMetadataCompat.RemoteActionCompatParcelizer()).doubleValue() / 100.0d;
                if (!accesssetAddChangeCallbackMethodcp.read(dDoubleValue)) {
                    sendmotionevent8iasvtc = accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.serializer.getDouble("fpr_vc_session_sampling_rate");
                    if (!sendmotionevent8iasvtc.serializer() && accesssetAddChangeCallbackMethodcp.read(((Double) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).doubleValue())) {
                        accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.read.read("com.google.firebase.perf.SessionSamplingRate", ((Double) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).doubleValue());
                        dDoubleValue = ((Double) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).doubleValue();
                    } else {
                        sendmotionevent8iasvtc2 = accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.read(findnextnonchildview);
                        if (!sendmotionevent8iasvtc2.serializer() && accesssetAddChangeCallbackMethodcp.read(((Double) sendmotionevent8iasvtc2.RemoteActionCompatParcelizer()).doubleValue())) {
                            dDoubleValue = ((Double) sendmotionevent8iasvtc2.RemoteActionCompatParcelizer()).doubleValue();
                        } else if (accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.serializer.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    }
                }
            } else {
                sendmotionevent8iasvtc = accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.serializer.getDouble("fpr_vc_session_sampling_rate");
                if (!sendmotionevent8iasvtc.serializer()) {
                    sendmotionevent8iasvtc2 = accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.read(findnextnonchildview);
                    if (!sendmotionevent8iasvtc2.serializer()) {
                        if (accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.serializer.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else if (accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.serializer.isLastFetchFailed()) {
                        dDoubleValue = 1.0E-5d;
                    } else {
                        dDoubleValue = 0.01d;
                    }
                } else {
                    sendmotionevent8iasvtc2 = accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.read(findnextnonchildview);
                    if (!sendmotionevent8iasvtc2.serializer()) {
                        if (accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.serializer.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else if (accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.serializer.isLastFetchFailed()) {
                        dDoubleValue = 1.0E-5d;
                    } else {
                        dDoubleValue = 0.01d;
                    }
                }
            }
            if (dRandom < dDoubleValue) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        perfSession.read = z;
        return perfSession;
    }

    public final com.google.firebase.perf.v1.PerfSession serializer() {
        getViewTreeOwners getviewtreeownersNewBuilder = com.google.firebase.perf.v1.PerfSession.newBuilder();
        getviewtreeownersNewBuilder.RemoteActionCompatParcelizer();
        ((com.google.firebase.perf.v1.PerfSession) getviewtreeownersNewBuilder.RemoteActionCompatParcelizer).setSessionId(this.IconCompatParcelizer);
        if (this.read) {
            get_autofillManagerui get_autofillmanagerui = get_autofillManagerui.GAUGES_AND_SYSTEM_EVENTS;
            getviewtreeownersNewBuilder.RemoteActionCompatParcelizer();
            ((com.google.firebase.perf.v1.PerfSession) getviewtreeownersNewBuilder.RemoteActionCompatParcelizer).addSessionVerbosity(get_autofillmanagerui);
        }
        return (com.google.firebase.perf.v1.PerfSession) getviewtreeownersNewBuilder.serializer();
    }

    public static com.google.firebase.perf.v1.PerfSession[] serializer(List list) {
        if (list.isEmpty()) {
            return null;
        }
        com.google.firebase.perf.v1.PerfSession[] perfSessionArr = new com.google.firebase.perf.v1.PerfSession[list.size()];
        com.google.firebase.perf.v1.PerfSession perfSessionSerializer = ((PerfSession) list.get(0)).serializer();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            com.google.firebase.perf.v1.PerfSession perfSessionSerializer2 = ((PerfSession) list.get(i)).serializer();
            if (z || !((PerfSession) list.get(i)).read) {
                perfSessionArr[i] = perfSessionSerializer2;
            } else {
                perfSessionArr[0] = perfSessionSerializer2;
                perfSessionArr[i] = perfSessionSerializer;
                z = true;
            }
        }
        if (!z) {
            perfSessionArr[0] = perfSessionSerializer;
        }
        return perfSessionArr;
    }

    public PerfSession(String str, getIntentArrayWithConfiguredBackStacklambda4 getintentarraywithconfiguredbackstacklambda4) {
        this.read = false;
        this.IconCompatParcelizer = str;
        this.write = new Timer();
    }
}
