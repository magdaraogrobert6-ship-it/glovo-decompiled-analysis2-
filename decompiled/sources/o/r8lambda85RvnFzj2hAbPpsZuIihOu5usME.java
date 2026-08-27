package o;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r8lambda85RvnFzj2hAbPpsZuIihOu5usME implements r8lambdaf_R03aPgk3yrRX0m4aPR6MxY0w, getInverseTransformui_graphics {
    public final List IconCompatParcelizer;
    public List MediaBrowserCompatMediaItem;
    public eotfFunclambda0 MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int RatingCompat = -1;
    public volatile drawLine1RTmtNc RemoteActionCompatParcelizer;
    public final r8lambdaD96iEcIUdknPeYphmySUeDTc3iU read;
    public final com.bumptech.glide.load.engine.DecodeHelper serializer;
    public File write;

    @Override // o.getInverseTransformui_graphics
    public final void serializer(Object obj) {
        this.read.IconCompatParcelizer(this.MediaDescriptionCompat, obj, this.RemoteActionCompatParcelizer.IconCompatParcelizer, r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.DATA_DISK_CACHE, this.MediaDescriptionCompat);
    }

    @Override // o.getInverseTransformui_graphics
    public final void write(Exception exc) {
        this.read.read(this.MediaDescriptionCompat, exc, this.RemoteActionCompatParcelizer.IconCompatParcelizer, r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.DATA_DISK_CACHE);
    }

    public r8lambda85RvnFzj2hAbPpsZuIihOu5usME(List list, com.bumptech.glide.load.engine.DecodeHelper decodeHelper, r8lambdaD96iEcIUdknPeYphmySUeDTc3iU r8lambdad96ieciudknpeyphmysuedtc3iu) {
        this.IconCompatParcelizer = list;
        this.serializer = decodeHelper;
        this.read = r8lambdad96ieciudknpeyphmysuedtc3iu;
    }

    @Override // o.r8lambdaf_R03aPgk3yrRX0m4aPR6MxY0w
    public final void IconCompatParcelizer() {
        drawLine1RTmtNc drawline1rtmtnc = this.RemoteActionCompatParcelizer;
        if (drawline1rtmtnc != null) {
            drawline1rtmtnc.IconCompatParcelizer.read();
        }
    }

    @Override // o.r8lambdaf_R03aPgk3yrRX0m4aPR6MxY0w
    public final boolean read() {
        while (true) {
            List list = this.MediaBrowserCompatMediaItem;
            boolean z = false;
            if (list != null && this.MediaMetadataCompat < list.size()) {
                this.RemoteActionCompatParcelizer = null;
                while (!z && this.MediaMetadataCompat < this.MediaBrowserCompatMediaItem.size()) {
                    List list2 = this.MediaBrowserCompatMediaItem;
                    int i = this.MediaMetadataCompat;
                    this.MediaMetadataCompat = i + 1;
                    drawImage9jGpkUE drawimage9jgpkue = (drawImage9jGpkUE) list2.get(i);
                    File file = this.write;
                    com.bumptech.glide.load.engine.DecodeHelper decodeHelper = this.serializer;
                    this.RemoteActionCompatParcelizer = drawimage9jgpkue.RemoteActionCompatParcelizer(file, decodeHelper.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, decodeHelper.serializer, decodeHelper.ParcelableVolumeInfo);
                    if (this.RemoteActionCompatParcelizer != null && this.serializer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer.serializer()) != null) {
                        this.RemoteActionCompatParcelizer.IconCompatParcelizer.read(this.serializer.MediaSessionCompatResultReceiverWrapper, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.RatingCompat + 1;
            this.RatingCompat = i2;
            if (i2 >= this.IconCompatParcelizer.size()) {
                return false;
            }
            eotfFunclambda0 eotffunclambda0 = (eotfFunclambda0) this.IconCompatParcelizer.get(this.RatingCompat);
            com.bumptech.glide.load.engine.DecodeHelper decodeHelper2 = this.serializer;
            File fileRemoteActionCompatParcelizer = decodeHelper2.IconCompatParcelizer.serializer().RemoteActionCompatParcelizer(new r8lambdaoRYpq8_4IBzyFERyRC7kwkIeAHc(eotffunclambda0, decodeHelper2.PlaybackStateCompatCustomAction));
            this.write = fileRemoteActionCompatParcelizer;
            if (fileRemoteActionCompatParcelizer != null) {
                this.MediaDescriptionCompat = eotffunclambda0;
                this.MediaBrowserCompatMediaItem = this.serializer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().write(fileRemoteActionCompatParcelizer);
                this.MediaMetadataCompat = 0;
            }
        }
    }
}
