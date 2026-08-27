package com.bumptech.glide.load.engine;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.bumptech.glide.Registry;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.RenderIntentCompanion;
import o.accesscomputeXYZMatrix;
import o.accessgetDefaultCapcp;
import o.accessgetPerceptualcp;
import o.accessisWideGamut;
import o.clipRectrOu3jXo;
import o.clipRectrOu3jXodefault;
import o.colorResource;
import o.component4NHjbRc;
import o.drawGRGpd60;
import o.drawImage9jGpkUE;
import o.drawLine1RTmtNc;
import o.drawOvalAsUm42wdefault;
import o.drawOvalnJ9OG0default;
import o.drawPointsGsft0Wsdefault;
import o.eotfFunclambda0;
import o.generateEotflambda3;
import o.getEotf;
import o.getEotfFuncui_graphics;
import o.r8lambdayrUYrLf4y8jALbFcm2n28OpawQ;
import o.scale0AR0LA0default;

/* JADX INFO: loaded from: classes.dex */
public final class DecodeHelper {
    public Class ComponentActivity;
    public scale0AR0LA0default IconCompatParcelizer;
    public boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public RenderIntentCompanion MediaSessionCompatResultReceiverWrapper;
    public Object MediaSessionCompatToken;
    public getEotfFuncui_graphics ParcelableVolumeInfo;
    public Class PlaybackStateCompat;
    public eotfFunclambda0 PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public accessgetPerceptualcp RemoteActionCompatParcelizer;
    public Map ResultReceiver;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int serializer;
    public accessisWideGamut write;
    public final ArrayList MediaBrowserCompatMediaItem = new ArrayList();
    public final ArrayList read = new ArrayList();

    public final ArrayList RemoteActionCompatParcelizer() {
        boolean z = this.MediaSessionCompatQueueItem;
        ArrayList arrayList = this.MediaBrowserCompatMediaItem;
        if (!z) {
            this.MediaSessionCompatQueueItem = true;
            arrayList.clear();
            List listWrite = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().write(this.MediaSessionCompatToken);
            int size = listWrite.size();
            for (int i = 0; i < size; i++) {
                drawLine1RTmtNc drawline1rtmtncRemoteActionCompatParcelizer = ((drawImage9jGpkUE) listWrite.get(i)).RemoteActionCompatParcelizer(this.MediaSessionCompatToken, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, this.serializer, this.ParcelableVolumeInfo);
                if (drawline1rtmtncRemoteActionCompatParcelizer != null) {
                    arrayList.add(drawline1rtmtncRemoteActionCompatParcelizer);
                }
            }
        }
        return arrayList;
    }

    public final r8lambdayrUYrLf4y8jALbFcm2n28OpawQ read(Object obj) {
        r8lambdayrUYrLf4y8jALbFcm2n28OpawQ r8lambdayruyrlf4y8jalbfcm2n28opawq;
        u$a u_a = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().IconCompatParcelizer;
        Class<?> cls = obj.getClass();
        synchronized (u_a) {
            for (drawGRGpd60 drawgrgpd60 : u_a.IconCompatParcelizer) {
                if (drawgrgpd60.serializer.isAssignableFrom(cls)) {
                    r8lambdayruyrlf4y8jalbfcm2n28opawq = drawgrgpd60.RemoteActionCompatParcelizer;
                }
            }
            r8lambdayruyrlf4y8jalbfcm2n28opawq = null;
        }
        if (r8lambdayruyrlf4y8jalbfcm2n28opawq != null) {
            return r8lambdayruyrlf4y8jalbfcm2n28opawq;
        }
        throw new Registry.NoSourceEncoderAvailableException(c8$$ExternalSyntheticOutline0.m(obj.getClass(), "Failed to find source encoder for data class: "));
    }

    public final ArrayList write() {
        boolean z = this.RatingCompat;
        ArrayList arrayList = this.read;
        if (!z) {
            this.RatingCompat = true;
            arrayList.clear();
            ArrayList arrayListRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            int size = arrayListRemoteActionCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                drawLine1RTmtNc drawline1rtmtnc = (drawLine1RTmtNc) arrayListRemoteActionCompatParcelizer.get(i);
                eotfFunclambda0 eotffunclambda0 = drawline1rtmtnc.RemoteActionCompatParcelizer;
                List list = drawline1rtmtnc.write;
                if (!arrayList.contains(eotffunclambda0)) {
                    arrayList.add(drawline1rtmtnc.RemoteActionCompatParcelizer);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add((eotfFunclambda0) list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final getEotf write(Class cls) {
        getEotf geteotf = (getEotf) this.ResultReceiver.get(cls);
        if (geteotf == null) {
            for (Map.Entry entry : this.ResultReceiver.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    geteotf = (getEotf) entry.getValue();
                    break;
                }
            }
        }
        if (geteotf != null) {
            return geteotf;
        }
        if (!this.ResultReceiver.isEmpty() || !this.MediaMetadataCompat) {
            return component4NHjbRc.write;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        return null;
    }

    public final generateEotflambda3 RemoteActionCompatParcelizer(Class cls) {
        generateEotflambda3 generateeotflambda3;
        ArrayList arrayList;
        drawOvalnJ9OG0default drawovalnj9og0default;
        Registry registryRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        Class cls2 = this.PlaybackStateCompat;
        Class cls3 = this.ComponentActivity;
        clipRectrOu3jXodefault cliprectrou3jxodefault = registryRemoteActionCompatParcelizer.read;
        accessgetDefaultCapcp accessgetdefaultcapcp = (accessgetDefaultCapcp) cliprectrou3jxodefault.serializer.getAndSet(null);
        if (accessgetdefaultcapcp == null) {
            accessgetdefaultcapcp = new accessgetDefaultCapcp();
        }
        accessgetdefaultcapcp.read = cls;
        accessgetdefaultcapcp.write = cls2;
        accessgetdefaultcapcp.RemoteActionCompatParcelizer = cls3;
        synchronized (cliprectrou3jxodefault.write) {
            generateeotflambda3 = (generateEotflambda3) cliprectrou3jxodefault.write.get(accessgetdefaultcapcp);
        }
        cliprectrou3jxodefault.serializer.set(accessgetdefaultcapcp);
        registryRemoteActionCompatParcelizer.read.getClass();
        if (clipRectrOu3jXodefault.IconCompatParcelizer.equals(generateeotflambda3)) {
            return null;
        }
        if (generateeotflambda3 != null) {
            return generateeotflambda3;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls4 : registryRemoteActionCompatParcelizer.write.RemoteActionCompatParcelizer(cls, cls2)) {
            for (Class cls5 : registryRemoteActionCompatParcelizer.MediaSessionCompatQueueItem.read(cls4, cls3)) {
                colorResource colorresource = registryRemoteActionCompatParcelizer.write;
                synchronized (colorresource) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) colorresource.IconCompatParcelizer).iterator();
                    while (it.hasNext()) {
                        List<clipRectrOu3jXo> list = (List) ((HashMap) colorresource.write).get((String) it.next());
                        if (list != null) {
                            for (clipRectrOu3jXo cliprectrou3jxo : list) {
                                if (cliprectrou3jxo.serializer.isAssignableFrom(cls) && cls4.isAssignableFrom(cliprectrou3jxo.IconCompatParcelizer)) {
                                    arrayList.add(cliprectrou3jxo.write);
                                }
                            }
                        }
                    }
                }
                u$a u_a = registryRemoteActionCompatParcelizer.MediaSessionCompatQueueItem;
                synchronized (u_a) {
                    if (cls5.isAssignableFrom(cls4)) {
                        drawovalnj9og0default = drawPointsGsft0Wsdefault.IconCompatParcelizer;
                    } else {
                        Iterator it2 = u_a.IconCompatParcelizer.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                drawOvalAsUm42wdefault drawovalasum42wdefault = (drawOvalAsUm42wdefault) it2.next();
                                if (drawovalasum42wdefault.IconCompatParcelizer.isAssignableFrom(cls4) && cls5.isAssignableFrom(drawovalasum42wdefault.RemoteActionCompatParcelizer)) {
                                    drawovalnj9og0default = drawovalasum42wdefault.read;
                                    break;
                                }
                            } else {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                            }
                        }
                    }
                }
                arrayList2.add(new accesscomputeXYZMatrix(cls, cls4, cls5, arrayList, drawovalnj9og0default, registryRemoteActionCompatParcelizer.RatingCompat));
            }
        }
        generateEotflambda3 generateeotflambda4 = arrayList2.isEmpty() ? null : new generateEotflambda3(cls, cls2, cls3, arrayList2, registryRemoteActionCompatParcelizer.RatingCompat);
        clipRectrOu3jXodefault cliprectrou3jxodefault2 = registryRemoteActionCompatParcelizer.read;
        synchronized (cliprectrou3jxodefault2.write) {
            cliprectrou3jxodefault2.write.put(new accessgetDefaultCapcp(cls, cls2, cls3), generateeotflambda4 != null ? generateeotflambda4 : clipRectrOu3jXodefault.IconCompatParcelizer);
        }
        return generateeotflambda4;
    }
}
