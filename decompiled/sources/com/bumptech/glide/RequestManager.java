package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.dynamite.zzj;
import io.sentry.MovePreviousSession;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import o.DrawScopeKt;
import o.Fill;
import o.FocusListener;
import o.accessgetApparentToRealOffsetnOccac;
import o.accessgetPerceptualcp;
import o.clipPathKD09W0M;
import o.drawImage9jGpkUEdefault;
import o.drawRectAsUm42wdefault;
import o.drawRoundRectZuiqVtQdefault;
import o.drawymL40Pkdefault;
import o.getDefaultFilterQualityfv9h1I;
import o.getSaturationuksYyKA;
import o.offsetSizePENXr5M;
import o.rotateRadRg1IO4cdefault;
import o.rotateRg1IO4c;
import o.scaleFgt4K4Qdefault;

/* JADX INFO: loaded from: classes.dex */
public final class RequestManager implements ComponentCallbacks2, getDefaultFilterQualityfv9h1I {
    public static final scaleFgt4K4Qdefault IconCompatParcelizer;
    public final scaleFgt4K4Qdefault MediaBrowserCompatMediaItem;
    public final accessgetApparentToRealOffsetnOccac MediaDescriptionCompat;
    public final drawymL40Pkdefault MediaMetadataCompat;
    public final Glide MediaSessionCompatQueueItem;
    public final clipPathKD09W0M MediaSessionCompatToken;
    public final offsetSizePENXr5M RatingCompat;
    public final drawRectAsUm42wdefault RemoteActionCompatParcelizer;
    public final Context read;
    public final MovePreviousSession serializer;
    public final CopyOnWriteArrayList write;

    public final void IconCompatParcelizer() {
        synchronized (this) {
            accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac = this.MediaDescriptionCompat;
            accessgetapparenttorealoffsetnoccac.read = true;
            for (rotateRg1IO4c rotaterg1io4c : Fill.read((Set) accessgetapparenttorealoffsetnoccac.serializer)) {
                if (rotaterg1io4c.MediaMetadataCompat()) {
                    rotaterg1io4c.RatingCompat();
                    ((HashSet) accessgetapparenttorealoffsetnoccac.write).add(rotaterg1io4c);
                }
            }
        }
    }

    public final void MediaDescriptionCompat() {
        synchronized (this) {
            accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac = this.MediaDescriptionCompat;
            accessgetapparenttorealoffsetnoccac.read = false;
            for (rotateRg1IO4c rotaterg1io4c : Fill.read((Set) accessgetapparenttorealoffsetnoccac.serializer)) {
                if (!rotaterg1io4c.MediaBrowserCompatMediaItem() && !rotaterg1io4c.MediaMetadataCompat()) {
                    rotaterg1io4c.RemoteActionCompatParcelizer();
                }
            }
            ((HashSet) accessgetapparenttorealoffsetnoccac.write).clear();
        }
    }

    @Override // o.getDefaultFilterQualityfv9h1I
    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            this.MediaMetadataCompat.RemoteActionCompatParcelizer();
            read();
            accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac = this.MediaDescriptionCompat;
            Iterator it = Fill.read((Set) accessgetapparenttorealoffsetnoccac.serializer).iterator();
            while (it.hasNext()) {
                accessgetapparenttorealoffsetnoccac.write((rotateRg1IO4c) it.next());
            }
            ((HashSet) accessgetapparenttorealoffsetnoccac.write).clear();
            this.RatingCompat.read(this);
            this.RatingCompat.read(this.RemoteActionCompatParcelizer);
            Fill.IconCompatParcelizer().removeCallbacks(this.serializer);
            Glide glide = this.MediaSessionCompatQueueItem;
            synchronized (glide.MediaDescriptionCompat) {
                if (!glide.MediaDescriptionCompat.contains(this)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                glide.MediaDescriptionCompat.remove(this);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final void read() {
        synchronized (this) {
            Iterator it = Fill.read(this.MediaMetadataCompat.IconCompatParcelizer).iterator();
            while (it.hasNext()) {
                read((rotateRadRg1IO4cdefault) it.next());
            }
            this.MediaMetadataCompat.IconCompatParcelizer.clear();
        }
    }

    @Override // o.getDefaultFilterQualityfv9h1I
    public final void serializer() {
        synchronized (this) {
            this.MediaMetadataCompat.serializer();
            IconCompatParcelizer();
        }
    }

    public final String toString() {
        String str;
        synchronized (this) {
            str = super.toString() + "{tracker=" + this.MediaDescriptionCompat + ", treeNode=" + this.MediaSessionCompatToken + "}";
        }
        return str;
    }

    @Override // o.getDefaultFilterQualityfv9h1I
    public final void write() {
        synchronized (this) {
            MediaDescriptionCompat();
            this.MediaMetadataCompat.write();
        }
    }

    public final boolean write(rotateRadRg1IO4cdefault rotateradrg1io4cdefault) {
        synchronized (this) {
            rotateRg1IO4c rotaterg1io4c = rotateradrg1io4cdefault.read();
            if (rotaterg1io4c == null) {
                return true;
            }
            if (!this.MediaDescriptionCompat.write(rotaterg1io4c)) {
                return false;
            }
            this.MediaMetadataCompat.IconCompatParcelizer.remove(rotateradrg1io4cdefault);
            rotateradrg1io4cdefault.IconCompatParcelizer();
            return true;
        }
    }

    static {
        scaleFgt4K4Qdefault scalefgt4k4qdefault = (scaleFgt4K4Qdefault) new scaleFgt4K4Qdefault().serializer(Bitmap.class);
        scalefgt4k4qdefault.ComponentActivity = true;
        IconCompatParcelizer = scalefgt4k4qdefault;
        ((scaleFgt4K4Qdefault) new scaleFgt4K4Qdefault().serializer(drawImage9jGpkUEdefault.class)).ComponentActivity = true;
    }

    public RequestManager(Glide glide, offsetSizePENXr5M offsetsizepenxr5m, clipPathKD09W0M clippathkd09w0m, Context context) {
        drawRectAsUm42wdefault drawScopeKt;
        scaleFgt4K4Qdefault scalefgt4k4qdefault;
        accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac = new accessgetApparentToRealOffsetnOccac(3);
        zzj zzjVar = glide.RemoteActionCompatParcelizer;
        this.MediaMetadataCompat = new drawymL40Pkdefault();
        MovePreviousSession movePreviousSession = new MovePreviousSession(4, this);
        this.serializer = movePreviousSession;
        this.MediaSessionCompatQueueItem = glide;
        this.RatingCompat = offsetsizepenxr5m;
        this.MediaSessionCompatToken = clippathkd09w0m;
        this.MediaDescriptionCompat = accessgetapparenttorealoffsetnoccac;
        this.read = context;
        Context applicationContext = context.getApplicationContext();
        getSaturationuksYyKA getsaturationuksyyka = new getSaturationuksYyKA(this, accessgetapparenttorealoffsetnoccac);
        zzjVar.getClass();
        boolean z = FocusListener.write(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        if (z) {
            drawScopeKt = new drawRoundRectZuiqVtQdefault(applicationContext, getsaturationuksyyka);
        } else {
            drawScopeKt = new DrawScopeKt();
        }
        this.RemoteActionCompatParcelizer = drawScopeKt;
        synchronized (glide.MediaDescriptionCompat) {
            if (!glide.MediaDescriptionCompat.contains(this)) {
                glide.MediaDescriptionCompat.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            Fill.IconCompatParcelizer().post(movePreviousSession);
        } else {
            offsetsizepenxr5m.IconCompatParcelizer(this);
        }
        offsetsizepenxr5m.IconCompatParcelizer(drawScopeKt);
        this.write = new CopyOnWriteArrayList(glide.RatingCompat.RemoteActionCompatParcelizer);
        accessgetPerceptualcp accessgetperceptualcp = glide.RatingCompat;
        synchronized (accessgetperceptualcp) {
            if (accessgetperceptualcp.serializer == null) {
                accessgetperceptualcp.IconCompatParcelizer.getClass();
                scaleFgt4K4Qdefault scalefgt4k4qdefault2 = new scaleFgt4K4Qdefault();
                scalefgt4k4qdefault2.ComponentActivity = true;
                accessgetperceptualcp.serializer = scalefgt4k4qdefault2;
            }
            scalefgt4k4qdefault = accessgetperceptualcp.serializer;
        }
        synchronized (this) {
            scaleFgt4K4Qdefault scalefgt4k4qdefault3 = (scaleFgt4K4Qdefault) scalefgt4k4qdefault.clone();
            if (scalefgt4k4qdefault3.ComponentActivity && !scalefgt4k4qdefault3.PlaybackStateCompat) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            scalefgt4k4qdefault3.PlaybackStateCompat = true;
            scalefgt4k4qdefault3.ComponentActivity = true;
            this.MediaBrowserCompatMediaItem = scalefgt4k4qdefault3;
        }
    }

    public final void read(rotateRadRg1IO4cdefault rotateradrg1io4cdefault) {
        if (rotateradrg1io4cdefault == null) {
            return;
        }
        boolean zWrite = write(rotateradrg1io4cdefault);
        rotateRg1IO4c rotaterg1io4c = rotateradrg1io4cdefault.read();
        if (zWrite) {
            return;
        }
        Glide glide = this.MediaSessionCompatQueueItem;
        synchronized (glide.MediaDescriptionCompat) {
            Iterator it = glide.MediaDescriptionCompat.iterator();
            while (it.hasNext()) {
                if (((RequestManager) it.next()).write(rotateradrg1io4cdefault)) {
                    return;
                }
            }
            if (rotaterg1io4c != null) {
                rotateradrg1io4cdefault.IconCompatParcelizer();
                rotaterg1io4c.write();
            }
        }
    }
}
