package o;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class generateOetflambda3 implements r8lambdaf_R03aPgk3yrRX0m4aPR6MxY0w, r8lambdaD96iEcIUdknPeYphmySUeDTc3iU {
    public final com.bumptech.glide.load.engine.DecodeJob IconCompatParcelizer;
    public volatile r8lambdaoRYpq8_4IBzyFERyRC7kwkIeAHc MediaMetadataCompat;
    public volatile r8lambda85RvnFzj2hAbPpsZuIihOu5usME MediaSessionCompatQueueItem;
    public volatile int RemoteActionCompatParcelizer;
    public volatile drawLine1RTmtNc read;
    public final com.bumptech.glide.load.engine.DecodeHelper serializer;
    public volatile Object write;

    @Override // o.r8lambdaD96iEcIUdknPeYphmySUeDTc3iU
    public final void IconCompatParcelizer(eotfFunclambda0 eotffunclambda0, Object obj, getPrimaries getprimaries, r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I r8lambdayjgjsam_wcskwad6z3tn2h9p74i, eotfFunclambda0 eotffunclambda1) {
        this.IconCompatParcelizer.IconCompatParcelizer(eotffunclambda0, obj, getprimaries, this.read.IconCompatParcelizer.RemoteActionCompatParcelizer(), eotffunclambda0);
    }

    public final boolean RemoteActionCompatParcelizer(Object obj) throws Throwable {
        int i = Stroke.write;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            getOetfOrigui_graphics getoetforigui_graphicsSerializer = this.serializer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().serializer(obj);
            Object obj2 = getoetforigui_graphicsSerializer.read();
            r8lambdayrUYrLf4y8jALbFcm2n28OpawQ r8lambdayruyrlf4y8jalbfcm2n28opawq = this.serializer.read(obj2);
            androidx.navigation.NavArgsLazy navArgsLazy = new androidx.navigation.NavArgsLazy(r8lambdayruyrlf4y8jalbfcm2n28opawq, obj2, this.serializer.ParcelableVolumeInfo, 26);
            eotfFunclambda0 eotffunclambda0 = this.read.RemoteActionCompatParcelizer;
            com.bumptech.glide.load.engine.DecodeHelper decodeHelper = this.serializer;
            r8lambdaoRYpq8_4IBzyFERyRC7kwkIeAHc r8lambdaorypq8_4ibzyferyrc7kwkieahc = new r8lambdaoRYpq8_4IBzyFERyRC7kwkIeAHc(eotffunclambda0, decodeHelper.PlaybackStateCompatCustomAction);
            getY getySerializer = decodeHelper.IconCompatParcelizer.serializer();
            getySerializer.write(r8lambdaorypq8_4ibzyferyrc7kwkieahc, navArgsLazy);
            if (Log.isLoggable("SourceGenerator", 2)) {
                r8lambdaorypq8_4ibzyferyrc7kwkieahc.toString();
                obj.toString();
                r8lambdayruyrlf4y8jalbfcm2n28opawq.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (getySerializer.RemoteActionCompatParcelizer(r8lambdaorypq8_4ibzyferyrc7kwkieahc) != null) {
                this.MediaMetadataCompat = r8lambdaorypq8_4ibzyferyrc7kwkieahc;
                this.MediaSessionCompatQueueItem = new r8lambda85RvnFzj2hAbPpsZuIihOu5usME(Collections.singletonList(this.read.RemoteActionCompatParcelizer), this.serializer, this);
                this.read.IconCompatParcelizer.write();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.MediaMetadataCompat);
                obj.toString();
            }
            try {
                this.IconCompatParcelizer.IconCompatParcelizer(this.read.RemoteActionCompatParcelizer, getoetforigui_graphicsSerializer.read(), this.read.IconCompatParcelizer, this.read.IconCompatParcelizer.RemoteActionCompatParcelizer(), this.read.RemoteActionCompatParcelizer);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.read.IconCompatParcelizer.write();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // o.r8lambdaD96iEcIUdknPeYphmySUeDTc3iU
    public final void read(eotfFunclambda0 eotffunclambda0, Exception exc, getPrimaries getprimaries, r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I r8lambdayjgjsam_wcskwad6z3tn2h9p74i) {
        this.IconCompatParcelizer.read(eotffunclambda0, exc, getprimaries, this.read.IconCompatParcelizer.RemoteActionCompatParcelizer());
    }

    public generateOetflambda3(com.bumptech.glide.load.engine.DecodeHelper decodeHelper, com.bumptech.glide.load.engine.DecodeJob decodeJob) {
        this.serializer = decodeHelper;
        this.IconCompatParcelizer = decodeJob;
    }

    @Override // o.r8lambdaf_R03aPgk3yrRX0m4aPR6MxY0w
    public final void IconCompatParcelizer() {
        drawLine1RTmtNc drawline1rtmtnc = this.read;
        if (drawline1rtmtnc != null) {
            drawline1rtmtnc.IconCompatParcelizer.read();
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    @Override // o.r8lambdaf_R03aPgk3yrRX0m4aPR6MxY0w
    public final boolean read() {
        boolean z;
        if (this.write == null) {
            if (this.MediaSessionCompatQueueItem != null) {
            }
            this.MediaSessionCompatQueueItem = null;
            this.read = null;
            z = false;
            while (!z) {
                ArrayList arrayListRemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer();
                int i = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i + 1;
                this.read = (drawLine1RTmtNc) arrayListRemoteActionCompatParcelizer.get(i);
                if (this.read == null) {
                }
            }
            return z;
        }
        Object obj = this.write;
        this.write = null;
        try {
            if (RemoteActionCompatParcelizer(obj)) {
                if (this.MediaSessionCompatQueueItem != null || !this.MediaSessionCompatQueueItem.read()) {
                    this.MediaSessionCompatQueueItem = null;
                    this.read = null;
                    z = false;
                    while (!z && this.RemoteActionCompatParcelizer < this.serializer.RemoteActionCompatParcelizer().size()) {
                        ArrayList arrayListRemoteActionCompatParcelizer2 = this.serializer.RemoteActionCompatParcelizer();
                        int i2 = this.RemoteActionCompatParcelizer;
                        this.RemoteActionCompatParcelizer = i2 + 1;
                        this.read = (drawLine1RTmtNc) arrayListRemoteActionCompatParcelizer2.get(i2);
                        if (this.read == null && (this.serializer.write.read(this.read.IconCompatParcelizer.RemoteActionCompatParcelizer()) || this.serializer.RemoteActionCompatParcelizer(this.read.IconCompatParcelizer.serializer()) != null)) {
                            this.read.IconCompatParcelizer.read(this.serializer.MediaSessionCompatResultReceiverWrapper, new computePrimariesui_graphics(this, this.read));
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } catch (IOException unused) {
            Log.isLoggable("SourceGenerator", 3);
        }
        return true;
    }
}
