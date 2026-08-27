package o;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class generateEotflambda2 implements r8lambdaf_R03aPgk3yrRX0m4aPR6MxY0w, getInverseTransformui_graphics {
    public generateOetflambda2 IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public List MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public eotfFunclambda0 MediaSessionCompatQueueItem;
    public int RatingCompat = -1;
    public final com.bumptech.glide.load.engine.DecodeHelper RemoteActionCompatParcelizer;
    public final com.bumptech.glide.load.engine.DecodeJob read;
    public File serializer;
    public volatile drawLine1RTmtNc write;

    @Override // o.getInverseTransformui_graphics
    public final void serializer(Object obj) {
        this.read.IconCompatParcelizer(this.MediaSessionCompatQueueItem, obj, this.write.IconCompatParcelizer, r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.RESOURCE_DISK_CACHE, this.IconCompatParcelizer);
    }

    @Override // o.getInverseTransformui_graphics
    public final void write(Exception exc) {
        this.read.read(this.IconCompatParcelizer, exc, this.write.IconCompatParcelizer, r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.RESOURCE_DISK_CACHE);
    }

    public generateEotflambda2(com.bumptech.glide.load.engine.DecodeHelper decodeHelper, com.bumptech.glide.load.engine.DecodeJob decodeJob) {
        this.RemoteActionCompatParcelizer = decodeHelper;
        this.read = decodeJob;
    }

    @Override // o.r8lambdaf_R03aPgk3yrRX0m4aPR6MxY0w
    public final void IconCompatParcelizer() {
        drawLine1RTmtNc drawline1rtmtnc = this.write;
        if (drawline1rtmtnc != null) {
            drawline1rtmtnc.IconCompatParcelizer.read();
        }
    }

    @Override // o.r8lambdaf_R03aPgk3yrRX0m4aPR6MxY0w
    public final boolean read() {
        List list;
        ArrayList arrayListWrite;
        ArrayList arrayListWrite2 = this.RemoteActionCompatParcelizer.write();
        boolean z = false;
        if (!arrayListWrite2.isEmpty()) {
            com.bumptech.glide.load.engine.DecodeHelper decodeHelper = this.RemoteActionCompatParcelizer;
            com.bumptech.glide.Registry registryRemoteActionCompatParcelizer = decodeHelper.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            Class<?> cls = decodeHelper.MediaSessionCompatToken.getClass();
            Class cls2 = decodeHelper.PlaybackStateCompat;
            Class cls3 = decodeHelper.ComponentActivity;
            accessgetGreencp accessgetgreencp = registryRemoteActionCompatParcelizer.MediaDescriptionCompat;
            accessgetDefaultCapcp accessgetdefaultcapcp = (accessgetDefaultCapcp) ((AtomicReference) accessgetgreencp.IconCompatParcelizer).getAndSet(null);
            if (accessgetdefaultcapcp == null) {
                accessgetdefaultcapcp = new accessgetDefaultCapcp(cls, cls2, cls3);
            } else {
                accessgetdefaultcapcp.read = cls;
                accessgetdefaultcapcp.write = cls2;
                accessgetdefaultcapcp.RemoteActionCompatParcelizer = cls3;
            }
            synchronized (((ImageKt) accessgetgreencp.write)) {
                list = (List) ((ImageKt) accessgetgreencp.write).get(accessgetdefaultcapcp);
            }
            ((AtomicReference) accessgetgreencp.IconCompatParcelizer).set(accessgetdefaultcapcp);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                drawImageAZ2fEMs drawimageaz2fems = registryRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem;
                synchronized (drawimageaz2fems) {
                    arrayListWrite = drawimageaz2fems.read.write(cls);
                }
                Iterator it = arrayListWrite.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : registryRemoteActionCompatParcelizer.write.RemoteActionCompatParcelizer((Class) it.next(), cls2)) {
                        if (!registryRemoteActionCompatParcelizer.MediaSessionCompatQueueItem.read(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                accessgetGreencp accessgetgreencp2 = registryRemoteActionCompatParcelizer.MediaDescriptionCompat;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((ImageKt) accessgetgreencp2.write)) {
                    ((ImageKt) accessgetgreencp2.write).put(new accessgetDefaultCapcp(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.MediaDescriptionCompat;
                    if (list3 != null && this.MediaBrowserCompatMediaItem < list3.size()) {
                        this.write = null;
                        while (!z && this.MediaBrowserCompatMediaItem < this.MediaDescriptionCompat.size()) {
                            List list4 = this.MediaDescriptionCompat;
                            int i = this.MediaBrowserCompatMediaItem;
                            this.MediaBrowserCompatMediaItem = i + 1;
                            drawImage9jGpkUE drawimage9jgpkue = (drawImage9jGpkUE) list4.get(i);
                            File file = this.serializer;
                            com.bumptech.glide.load.engine.DecodeHelper decodeHelper2 = this.RemoteActionCompatParcelizer;
                            this.write = drawimage9jgpkue.RemoteActionCompatParcelizer(file, decodeHelper2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, decodeHelper2.serializer, decodeHelper2.ParcelableVolumeInfo);
                            if (this.write != null && this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.write.IconCompatParcelizer.serializer()) != null) {
                                this.write.IconCompatParcelizer.read(this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.RatingCompat + 1;
                    this.RatingCompat = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.MediaMetadataCompat + 1;
                        this.MediaMetadataCompat = i3;
                        if (i3 >= arrayListWrite2.size()) {
                            break;
                        }
                        this.RatingCompat = 0;
                    }
                    eotfFunclambda0 eotffunclambda0 = (eotfFunclambda0) arrayListWrite2.get(this.MediaMetadataCompat);
                    Class cls5 = (Class) list2.get(this.RatingCompat);
                    getEotf geteotfWrite = this.RemoteActionCompatParcelizer.write(cls5);
                    com.bumptech.glide.load.engine.DecodeHelper decodeHelper3 = this.RemoteActionCompatParcelizer;
                    this.IconCompatParcelizer = new generateOetflambda2(decodeHelper3.RemoteActionCompatParcelizer.write, eotffunclambda0, decodeHelper3.PlaybackStateCompatCustomAction, decodeHelper3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, decodeHelper3.serializer, geteotfWrite, cls5, decodeHelper3.ParcelableVolumeInfo);
                    File fileRemoteActionCompatParcelizer = decodeHelper3.IconCompatParcelizer.serializer().RemoteActionCompatParcelizer(this.IconCompatParcelizer);
                    this.serializer = fileRemoteActionCompatParcelizer;
                    if (fileRemoteActionCompatParcelizer != null) {
                        this.MediaSessionCompatQueueItem = eotffunclambda0;
                        this.MediaDescriptionCompat = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().write(fileRemoteActionCompatParcelizer);
                        this.MediaBrowserCompatMediaItem = 0;
                    }
                }
            } else if (!File.class.equals(this.RemoteActionCompatParcelizer.ComponentActivity)) {
                StringBuilder sb = new StringBuilder("Failed to find any load path from ");
                sb.append(this.RemoteActionCompatParcelizer.MediaSessionCompatToken.getClass());
                seekAnimationsanimation_core.IconCompatParcelizer(sb, " to ", this.RemoteActionCompatParcelizer.ComponentActivity);
                return false;
            }
        }
        return false;
    }
}
